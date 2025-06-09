package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class VialStandBlock extends SmallFurnitureBlock{
    private static final VoxelShape SHAPE_NORTH = Block.box(0,0,7.5,16,11,12.5);
    private static final VoxelShape SHAPE_SOUTH = Block.box(0,0,3.5,16,11,8.5);
    private static final VoxelShape SHAPE_EAST = Block.box(3.5,0,0,8.5,11,16);
    private static final VoxelShape SHAPE_WEST = Block.box(7.5,0,0,12.5,11,16);

    public VialStandBlock(Properties pProperties) {
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
