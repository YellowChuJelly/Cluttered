package net.redchujelly.cluttered.block.multiblock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.redchujelly.cluttered.block.entity.CustomStorageBlockEntity;
import net.redchujelly.cluttered.setup.TileEntityRegistration;
import org.jetbrains.annotations.Nullable;

public class FridgeBlock extends MultiblockStorage{
    private static final VoxelShape SHAPE_NORTH = Block.box(0,0,0,16,16,14);
    private static final VoxelShape SHAPE_SOUTH = Block.box(0,0,2,16,16,16);
    private static final VoxelShape SHAPE_EAST = Block.box(2,0,0,16,16,16);
    private static final VoxelShape SHAPE_WEST = Block.box(0,0,0,14,16,16);

    public static final BooleanProperty OPEN = BlockStateProperties.OPEN;

    public static final IntegerProperty MULTIBLOCK_PART = IntegerProperty.create("part", 1, 2);
    private static final int[][][] MULTIBLOCK_SHAPE = {
            {
                    {1}
            },
            {
                    {2}
            }
    };

    public FridgeBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.defaultBlockState().setValue(OPEN, false));
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        Direction facing = pState.getValue(FACING);
        return switch (facing) {
            case SOUTH -> SHAPE_SOUTH;
            case EAST -> SHAPE_EAST;
            case WEST -> SHAPE_WEST;
            default -> SHAPE_NORTH;
        };
    }

    public static void setOpenAndClosed(Level level, BlockPos pos, BlockState state, boolean open){
        int part = state.getValue(MULTIBLOCK_PART);
        BlockPos otherHalfPos = part == 1 ? pos.above() : pos.below();
        BlockState otherHalfBlock = level.getBlockState(otherHalfPos);

        if (state.hasProperty(OPEN)) {
            level.setBlock(pos, state.setValue(OPEN, open),2);
            if (level.getBlockState(otherHalfPos).getBlock().equals(state.getBlock()) && otherHalfBlock.getValue(MULTIBLOCK_PART) != part){
                level.setBlock(otherHalfPos, state.setValue(OPEN, open).setValue(MULTIBLOCK_PART, part == 1 ? 2 : 1),2);
            }
        }

    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if (pLevel.isClientSide){
            return InteractionResult.SUCCESS;
        } else if (!pPlayer.isCrouching()){
            BlockPos pos1 = findBlockState1(pPos, pLevel);
            BlockEntity blockEntity = pLevel.getBlockEntity(pos1);
            if (blockEntity instanceof CustomStorageBlockEntity){
                pPlayer.openMenu((CustomStorageBlockEntity) blockEntity);
                return InteractionResult.CONSUME;

            }
        } else {
            setOpenAndClosed(pLevel, pPos, pState, !pState.getValue(OPEN));
            pLevel.playSound(null, pPos, pState.getValue(OPEN) ? SoundEvents.IRON_DOOR_CLOSE : SoundEvents.IRON_DOOR_OPEN, SoundSource.BLOCKS);
        }
        return InteractionResult.CONSUME;
    }


    //public void tick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
    //    BlockEntity $$4 = pLevel.getBlockEntity(pPos);
    //    if ($$4 instanceof FridgeBlockEntity) {
    //        ((FridgeBlockEntity)$$4).recheckOpen();
    //    }
    //}

    @Override
    public int[][][] getMultiblockShape() {
        return MULTIBLOCK_SHAPE;
    }

    @Override
    public IntegerProperty getMultiblockPart() {
        return super.getMultiblockPart();
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        if (blockState.getValue(MULTIBLOCK_PART) != 1){
            return null;
        }
        return TileEntityRegistration.RETRO_FRIDGE_BE.get().create(blockPos, blockState);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        super.createBlockStateDefinition(pBuilder);
        pBuilder.add(OPEN);
    }
}
