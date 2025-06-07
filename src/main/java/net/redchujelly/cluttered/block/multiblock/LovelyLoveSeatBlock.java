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
    private static final VoxelShape SHAPE_NORTH_1 = Shapes.join(Shapes.join(Block.box(0,5,0,16,18,4), Block.box(0,5,0,16,12,16), BooleanOp.OR), Block.box(0,0,0, 3,18,16), BooleanOp.OR);
    private static final VoxelShape SHAPE_NORTH_2 = Shapes.join(Shapes.join(Block.box(0,5,0,16,18,4), Block.box(0,5,0,16,12,16), BooleanOp.OR), Block.box(13,0,0, 16,18,16), BooleanOp.OR);
    private static final VoxelShape SHAPE_EAST_1 = Shapes.join(Shapes.join(Block.box(12,5,0,16,18,16), Block.box(0,5,0,16,12,16), BooleanOp.OR), Block.box(0,0,0, 16,18,3), BooleanOp.OR);
    private static final VoxelShape SHAPE_EAST_2 = Shapes.join(Shapes.join(Block.box(12,5,0,16,18,16), Block.box(0,5,0,16,12,16), BooleanOp.OR), Block.box(0,0,13, 16,18,16), BooleanOp.OR);
    private static final VoxelShape SHAPE_SOUTH_1 = Shapes.join(Shapes.join(Block.box(0,5,12,16,18,16), Block.box(0,5,0,16,12,16), BooleanOp.OR), Block.box(13,0,0, 16,18,16), BooleanOp.OR);
    private static final VoxelShape SHAPE_SOUTH_2 = Shapes.join(Shapes.join(Block.box(0,5,12,16,18,16), Block.box(0,5,0,16,12,16), BooleanOp.OR), Block.box(0,0,0, 3,18,16), BooleanOp.OR);
    private static final VoxelShape SHAPE_WEST_1 = Shapes.join(Shapes.join(Block.box(0,5,0,4,18,16), Block.box(0,5,0,16,12,16), BooleanOp.OR), Block.box(0,0,13, 16,18,16), BooleanOp.OR);
    private static final VoxelShape SHAPE_WEST_2 = Shapes.join(Shapes.join(Block.box(0,5,0,4,18,16), Block.box(0,5,0,16,12,16), BooleanOp.OR), Block.box(0,0,0, 16,18,3), BooleanOp.OR);

    private static final float SEAT_OFFSET = 0.75f;

    public LovelyLoveSeatBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        int part = pState.getValue(MULTIBLOCK_PART);
        Direction facing = pState.getValue(FACING);
        return switch (facing) {
            case SOUTH -> part == 1 ? SHAPE_SOUTH_1 : SHAPE_SOUTH_2;
            case EAST -> part == 1 ? SHAPE_EAST_1 : SHAPE_EAST_2;
            case WEST -> part == 1 ? SHAPE_WEST_1 : SHAPE_WEST_2;
            default -> part == 1 ? SHAPE_NORTH_1 : SHAPE_NORTH_2;
        };
    }

    @Override
    public float getSeatOffset() {
        return SEAT_OFFSET;
    }
}
