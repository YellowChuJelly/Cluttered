package net.redchujelly.cluttered.block.custom.furniture.storage;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class KitchenCounterLeftBlock extends KitchenCounterBlock{
    //I'm ashamed that the left and right counters are different blocks and classes at that

    private static final VoxelShape SHAPE_NORTH = Shapes.join(Block.box(0,0,1, 15,14,16), Block.box(0,14,0,16,16,16), BooleanOp.OR);
    private static final VoxelShape SHAPE_SOUTH = Shapes.join(Block.box(1,0,0, 16,14,15), Block.box(0,14,0,16,16,16), BooleanOp.OR);
    private static final VoxelShape SHAPE_EAST = Shapes.join(Block.box(0,0,0, 15,14,15), Block.box(0,14,0,16,16,16), BooleanOp.OR);
    private static final VoxelShape SHAPE_WEST = Shapes.join(Block.box(1,0,1, 16,14,16), Block.box(0,14,0,16,16,16), BooleanOp.OR);

    public KitchenCounterLeftBlock(Properties pProperties) {
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
