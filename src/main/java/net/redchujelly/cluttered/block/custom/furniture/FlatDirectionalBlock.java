package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FaceAttachedHorizontalDirectionalBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;

public class FlatDirectionalBlock extends FaceAttachedHorizontalDirectionalBlock {

    private static final VoxelShape SHAPE_NORTH = Block.box(0,0,14,16,16,16);
    private static final VoxelShape SHAPE_SOUTH = Block.box(0,0,0,16,16,2);
    private static final VoxelShape SHAPE_EAST = Block.box(0,0,0,2,16,16);
    private static final VoxelShape SHAPE_WEST = Block.box(14,0,0,16,16,16);
    private static final VoxelShape SHAPE_UP = Block.box(0,0,0,16,2,16);
    private static final VoxelShape SHAPE_DOWN = Block.box(0,14,0,16,16,16);

    public FlatDirectionalBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        Direction facing = getConnectedDirection(pState);
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
    public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
        return canAttach(pLevel, pPos, getConnectedDirection(pState).getOpposite());
    }

    public static boolean canAttach(LevelReader pReader, BlockPos pPos, Direction pDirection) {
        BlockPos $$3 = pPos.relative(pDirection);
        return !pReader.getBlockState($$3).isAir();
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(BlockStateProperties.HORIZONTAL_FACING).add(BlockStateProperties.ATTACH_FACE);
    }
}
