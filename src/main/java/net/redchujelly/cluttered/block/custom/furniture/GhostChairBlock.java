package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class GhostChairBlock extends ChairBlock{
    private static final VoxelShape SHAPE_BASE = Block.box(0,0,0,16,9,16);
    private static final VoxelShape SHAPE_NORTH = Shapes.join(Block.box(0,9,13,16,19,16), SHAPE_BASE, BooleanOp.OR);
    private static final VoxelShape SHAPE_SOUTH = Shapes.join(Block.box(0,9,0,16,19,3), SHAPE_BASE, BooleanOp.OR);
    private static final VoxelShape SHAPE_EAST = Shapes.join(Block.box(0,9,0,3,19,16), SHAPE_BASE, BooleanOp.OR);
    private static final VoxelShape SHAPE_WEST = Shapes.join(Block.box(13,9,0,16,19,16), SHAPE_BASE, BooleanOp.OR);

    private static final float SEAT_OFFSET = 0.5625f;

    public GhostChairBlock(Properties pProperties) {
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

    @Override
    public float getSeatOffset() {
        return SEAT_OFFSET;
    }
}
