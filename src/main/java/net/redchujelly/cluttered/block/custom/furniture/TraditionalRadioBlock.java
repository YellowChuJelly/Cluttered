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

public class TraditionalRadioBlock extends CustomJukeboxBlock{
    private static final VoxelShape SHAPE_NORTH = Shapes.join(Block.box(2,0,6,14,1,14), Block.box(3,0,7,13,13,13), BooleanOp.OR);
    private static final VoxelShape SHAPE_SOUTH = Shapes.join(Block.box(2,0,2,14,1,8), Block.box(3,0,3,13,13,9), BooleanOp.OR);
    private static final VoxelShape SHAPE_EAST = Shapes.join(Block.box(2,0,2,10,1,14), Block.box(3,0,3,9,13,13), BooleanOp.OR);
    private static final VoxelShape SHAPE_WEST = Shapes.join(Block.box(6,0,2,14,1,14), Block.box(7,0,3,13,13,13), BooleanOp.OR);

    public TraditionalRadioBlock(Properties pProperties) {
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
