package net.redchujelly.cluttered.blocks.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class AppleChairBlock extends ChairBlock{
    private static final VoxelShape SHAPE_BASE = Shapes.join(Block.box(3, 0, 3, 13, 7, 13), Block.box(2, 7, 2, 14, 11, 14), BooleanOp.OR);
    private static final VoxelShape SHAPE_NORTH = Shapes.or(SHAPE_BASE, Block.box(2,11,10,14,19,14));
    private static final VoxelShape SHAPE_SOUTH = Shapes.or(SHAPE_BASE, Block.box(2,11,2,14,19,6));
    private static final VoxelShape SHAPE_EAST = Shapes.or(SHAPE_BASE, Block.box(2,11,2,6,19,14));
    private static final VoxelShape SHAPE_WEST = Shapes.or(SHAPE_BASE, Block.box(10,11,2,14,19,14));

    private static final float SEAT_OFFSET = 0.6875f;

    public AppleChairBlock(Properties pProperties) {
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
    public float getSeatOffset(){
        return SEAT_OFFSET;
    }
}
