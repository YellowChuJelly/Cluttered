package net.redchujelly.cluttered.block.multiblock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class LovelyLoveSeatBlock extends MultiblockChair{
    private static final VoxelShape SHAPE_NORTH = Shapes.join(Block.box(0,5,0,16,18,4), Block.box(0,5,0,16,12,16), BooleanOp.OR);
    private static final VoxelShape SHAPE_EAST = Shapes.join(Block.box(12,5,0,16,18,16), Block.box(0,5,0,16,12,16), BooleanOp.OR);
    private static final VoxelShape SHAPE_SOUTH = Shapes.join(Block.box(0,5,12,16,18,16), Block.box(0,5,0,16,12,16), BooleanOp.OR);
    private static final VoxelShape SHAPE_WEST = Shapes.join(Block.box(0,5,0,4,18,16), Block.box(0,5,0,16,12,16), BooleanOp.OR);

    private static final float SEAT_OFFSET = 0.75f;

    public LovelyLoveSeatBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        int part = pState.getValue(MULTIBLOCK_PART);
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
