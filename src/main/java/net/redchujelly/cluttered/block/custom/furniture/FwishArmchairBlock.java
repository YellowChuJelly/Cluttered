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

public class FwishArmchairBlock extends ChairBlock{
    //SURELY there is a better way to do this.
    //THERE IS!!! im a fool. Leaving this since i already did it.
    private static final VoxelShape SHAPE_NORTH = Shapes.join(Shapes.join(Shapes.join(Block.box(2,6,3,14,8,12), Block.box(0,12,13,16,18,15), BooleanOp.OR), Block.box(14,0,5,16,18,13), BooleanOp.OR), Block.box(0,0,5,2,18,13), BooleanOp.OR);
    private static final VoxelShape SHAPE_SOUTH = Shapes.join(Shapes.join(Shapes.join(Block.box(2,6,4,14,8,13), Block.box(0,12,1,16,18,3), BooleanOp.OR), Block.box(14,0,3,16,18,8), BooleanOp.OR), Block.box(0,0,3,2,18,8), BooleanOp.OR);
    private static final VoxelShape SHAPE_EAST = Shapes.join(Shapes.join(Shapes.join(Block.box(4,6,2,13,8,14), Block.box(1,12,0,3,18,16), BooleanOp.OR), Block.box(3,0,0,11,18,2), BooleanOp.OR), Block.box(3,0,14,11,18,16), BooleanOp.OR);
    private static final VoxelShape SHAPE_WEST = Shapes.join(Shapes.join(Shapes.join(Block.box(3,6,2,12,8,14), Block.box(13,12,0,15,18,16), BooleanOp.OR), Block.box(5,0,0,13,18,2), BooleanOp.OR), Block.box(5,0,14,13,18,16), BooleanOp.OR);

    private static final float SEAT_OFFSET = 0.5f;

    public FwishArmchairBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public float getSeatOffset() {
        return SEAT_OFFSET;
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
