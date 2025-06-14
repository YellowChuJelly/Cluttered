package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class FlowerDeskLampBlock extends SmallLampBlock{
    private static final VoxelShape SHAPE_NORTH = Block.box(4,0,6,12,14,14);
    private static final VoxelShape SHAPE_SOUTH = Block.box(4,0,2,12,14,10);
    private static final VoxelShape SHAPE_EAST = Block.box(2,0,4,10,14,12);
    private static final VoxelShape SHAPE_WEST = Block.box(6,0,4,14,14,12);

    public FlowerDeskLampBlock(Properties pProperties) {
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
