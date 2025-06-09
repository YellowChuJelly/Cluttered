package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class WineBottleRackBlock extends SmallFurnitureBlock{
    private static final VoxelShape SHAPE_NORTH = Block.box(2,0,8,14,20,16);
    private static final VoxelShape SHAPE_SOUTH = Block.box(2,0,0,14,20,8);
    private static final VoxelShape SHAPE_EAST = Block.box(0,0,2,8,20,14);
    private static final VoxelShape SHAPE_WEST = Block.box(8,0,2,16,20,14);

    public WineBottleRackBlock(Properties pProperties) {
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
