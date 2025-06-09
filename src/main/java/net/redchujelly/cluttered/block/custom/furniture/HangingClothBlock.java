package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class HangingClothBlock extends SmallFurnitureBlock{
    private static final VoxelShape SHAPE_NORTH = Block.box(2,4,13,14,14,16);
    private static final VoxelShape SHAPE_SOUTH = Block.box(2,4,0,14,14,3);
    private static final VoxelShape SHAPE_EAST = Block.box(0,4,2,3,14,12);
    private static final VoxelShape SHAPE_WEST = Block.box(13,4,2,16,14,12);

    public HangingClothBlock(Properties pProperties) {
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
