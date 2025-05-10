package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class MiniFlagBlock extends FlatDirectionalBlock{

    private static final VoxelShape SHAPE_UP = Block.box(3.5, 0, 3.5, 12.5, 13, 12.5);
    private static final VoxelShape SHAPE_DOWN = Block.box(3.5, 3, 3.5, 12.5, 16, 12.5);
    private static final VoxelShape SHAPE_NORTH = Block.box(3.5, 3.5, 3, 12.5, 12.5, 16);
    private static final VoxelShape SHAPE_SOUTH = Block.box(3.5, 3.5, 0, 12.5, 12.5, 13);
    private static final VoxelShape SHAPE_EAST = Block.box(0, 3.5, 3.5, 13, 12.5, 12.5);
    private static final VoxelShape SHAPE_WEST = Block.box(3, 3.5, 3.5, 16, 12.5, 12.5);

    public MiniFlagBlock(Properties pProperties) {
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

}
