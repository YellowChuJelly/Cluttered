package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.redchujelly.cluttered.block.custom.DirectionalPillarBlock;



public class CagedBulbBlock extends DirectionalPillarBlock implements SimpleWaterloggedBlock {
    private static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    private static final VoxelShape SHAPE_UP = Block.box(3.5, 0, 3.5, 12.5, 13, 12.5);
    private static final VoxelShape SHAPE_DOWN = Block.box(3.5, 3, 3.5, 12.5, 16, 12.5);
    private static final VoxelShape SHAPE_NORTH = Block.box(3.5, 3.5, 3, 12.5, 12.5, 16);
    private static final VoxelShape SHAPE_SOUTH = Block.box(3.5, 3.5, 0, 12.5, 12.5, 13);
    private static final VoxelShape SHAPE_EAST = Block.box(0, 3.5, 3.5, 13, 12.5, 12.5);
    private static final VoxelShape SHAPE_WEST = Block.box(3, 3.5, 3.5, 16, 12.5, 12.5);
    public CagedBulbBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.defaultBlockState().setValue(WATERLOGGED, false));
    }

    @Override
    public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) {
        return 15;
    }

    //@Override
    //public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
    //    Direction facing = pState.getValue(FACING);
    //    BlockPos attachedBlock = pPos.relative(facing.getOpposite());
    //    return canSupportRigidBlock(pLevel, attachedBlock) || canSupportCenter(pLevel, attachedBlock, facing);
    //}

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        Direction facing = pState.getValue(FACING);
        return switch (facing) {
            case UP -> SHAPE_UP;
            case DOWN -> SHAPE_DOWN;
            case NORTH -> SHAPE_NORTH;
            case SOUTH -> SHAPE_SOUTH;
            case EAST -> SHAPE_EAST;
            case WEST -> SHAPE_WEST;
        };
    }

    @Override
    public FluidState getFluidState(BlockState pState) {
        return pState.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(pState);
    }

    @Override
    public BlockState updateShape(BlockState pState, Direction pDirection, BlockState pNeighborState, LevelAccessor pLevel, BlockPos pPos, BlockPos pNeighborPos) {
        if(pState.getValue(WATERLOGGED)){
            pLevel.scheduleTick(pPos, Fluids.WATER, Fluids.WATER.getTickDelay(pLevel));
        }
        return super.updateShape(pState, pDirection, pNeighborState, pLevel, pPos, pNeighborPos);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        boolean isWaterlogged = pContext.getLevel().getFluidState(pContext.getClickedPos()).getType() == Fluids.WATER;
        return this.defaultBlockState().setValue(WATERLOGGED, isWaterlogged).setValue(FACING, pContext.getClickedFace());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(WATERLOGGED).add(FACING);
    }
}
