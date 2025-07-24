package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class DarkwoodClockBlock extends SmallFurnitureBlock{

    private static final VoxelShape SHAPE_NORTH = Block.box(3.5,4.5,14,12.5,13.5,16);
    private static final VoxelShape SHAPE_SOUTH = Block.box(3.5,4.5,0,12.5,13.5,2);
    private static final VoxelShape SHAPE_EAST = Block.box(0,4.5,3.5,2,13.5,12.5);
    private static final VoxelShape SHAPE_WEST = Block.box(14,4.5,3.5,16,13.5,12.5);

    public DarkwoodClockBlock(Properties pProperties) {
        super(pProperties);
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
}
