package net.redchujelly.cluttered.block.multiblock.storage;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.redchujelly.cluttered.block.entity.CustomStorageBlockEntity;
import net.redchujelly.cluttered.setup.TileEntityRegistration;
import org.jetbrains.annotations.Nullable;

public class CottageBookcaseBlock extends MultiblockStorage {
    private static final VoxelShape SHAPE_N_1 = Block.box(0,2,0,16,16,14);
    private static final VoxelShape SHAPE_S_1 = Block.box(0,2,2,16,16,16);
    private static final VoxelShape SHAPE_E_1 = Block.box(2,2,0,16,16,16);
    private static final VoxelShape SHAPE_W_1 = Block.box(0,2,0,14,16,16);

    private static final VoxelShape SHAPE_N_2 = Shapes.or(Block.box(0,0,0,16,8,14), Block.box(0,8,0,16,16,10));
    private static final VoxelShape SHAPE_S_2 = Shapes.or(Block.box(0,0,2,16,8,16), Block.box(0,8,6,16,16,16));
    private static final VoxelShape SHAPE_E_2 = Shapes.or(Block.box(2,0,0,16,8,16), Block.box(6,8,0,16,16,16));
    private static final VoxelShape SHAPE_W_2 = Shapes.or(Block.box(0,0,0,14,8,16), Block.box(0,8,0,10,16,16));


    public static final IntegerProperty MULTIBLOCK_PART = IntegerProperty.create("part", 1, 2);
    private static final int[][][] MULTIBLOCK_SHAPE = {
            {
                    {1}
            },
            {
                    {2}
            }
    };

    @Override
    protected InteractionResult useWithoutItem(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, BlockHitResult pHit) {
        if (pState.getValue(MULTIBLOCK_PART) != 1){
            return InteractionResult.FAIL;
        } else if (pLevel.isClientSide) {
            return InteractionResult.SUCCESS;
        } else {
            BlockPos pos1 = findBlockState1(pPos, pLevel);
            BlockEntity blockEntity = pLevel.getBlockEntity(pos1);
            if (blockEntity instanceof CustomStorageBlockEntity){
                pPlayer.openMenu((CustomStorageBlockEntity) blockEntity);
            }
            return InteractionResult.CONSUME;
        }
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        int part = pState.getValue(MULTIBLOCK_PART);
        Direction facing = pState.getValue(FACING);
        return switch (facing) {
            case SOUTH -> part == 1 ? SHAPE_S_1 : SHAPE_S_2;
            case EAST -> part == 1 ? SHAPE_E_1 : SHAPE_E_2;
            case WEST -> part == 1 ? SHAPE_W_1 : SHAPE_W_2;
            default -> part == 1 ? SHAPE_N_1 : SHAPE_N_2;
        };
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        if (blockState.getValue(MULTIBLOCK_PART) != 1){
            return null;
        }
        return TileEntityRegistration.THREE_ROWS_BE.get().create(blockPos, blockState);
    }


    public CottageBookcaseBlock(Properties pProperties) {
        super(pProperties);
    }
    @Override
    public IntegerProperty getMultiblockPart() {
        return MULTIBLOCK_PART;
    }

    @Override
    public int[][][] getMultiblockShape() {
        return MULTIBLOCK_SHAPE;
    }


}
