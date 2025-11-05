package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class MushroomTVBlock extends SmallFurnitureBlock{

    public static final IntegerProperty CHANNEL = IntegerProperty.create("channel", 0, 4);

    private static final VoxelShape SHAPE_NORTH = Shapes.or(Block.box(2,0,6,14,7,12), Block.box(0,7,4,16,16,12));
    private static final VoxelShape SHAPE_SOUTH = Shapes.or(Block.box(2,0,4,14,7,10), Block.box(0,7,4,16,16,12));
    private static final VoxelShape SHAPE_EAST = Shapes.or(Block.box(4,0,2,10,7,14), Block.box(4,7,0,12,16,16));
    private static final VoxelShape SHAPE_WEST = Shapes.or(Block.box(6,0,2,12,7,14), Block.box(4,7,0,12,16,16));

    public MushroomTVBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.defaultBlockState().setValue(CHANNEL, 0));
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

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        boolean isWaterlogged = pContext.getLevel().getFluidState(pContext.getClickedPos()).getType() == Fluids.WATER;
        return this.defaultBlockState().setValue(WATERLOGGED, isWaterlogged).setValue(FACING, pContext.getHorizontalDirection());
    }

    @Override
    public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) {
        return state.getValue(CHANNEL) == 0 ? 0 : 6;
    }

    @Override
    public boolean hasAnalogOutputSignal(BlockState pState) {
        return true;
    }

    @Override
    public int getAnalogOutputSignal(BlockState pState, Level pLevel, BlockPos pPos) {
        return pState.getValue(CHANNEL) * 3;
    }

    private void updateNeighbors(BlockState pState, Level pLevel, BlockPos pPos){
        pLevel.updateNeighborsAt(pPos, this);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, BlockHitResult pHit) {
        if (!pLevel.isClientSide) {
            int channel = pState.getValue(CHANNEL);
            if (channel < 4){
                channel++;
            }
            else channel = 0;
            pLevel.setBlock(pPos, pState.setValue(CHANNEL, channel), 10);
            pLevel.playSound(null, pPos, SoundEvents.STONE_BUTTON_CLICK_ON, SoundSource.BLOCKS);
            this.updateNeighbors(pState, pLevel, pPos);

        }
        return InteractionResult.SUCCESS;
    }

    @Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        if (!pIsMoving && !pState.is(pNewState.getBlock())) {
            this.updateNeighbors(pState, pLevel, pPos);
            super.onRemove(pState, pLevel, pPos, pNewState, pIsMoving);
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        super.createBlockStateDefinition(pBuilder);
        pBuilder.add(CHANNEL);
    }
}
