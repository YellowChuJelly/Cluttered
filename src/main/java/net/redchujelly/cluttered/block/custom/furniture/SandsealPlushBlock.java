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

public class SandsealPlushBlock extends SmallFurnitureBlock{
    private static final VoxelShape SHAPE_NORTH = Shapes.join(Shapes.join(Block.box(2.5,0,0,13.5,7,9), Block.box(3.5,0,9,12.5,5,12), BooleanOp.OR), Block.box(5,0,11,11,2,16), BooleanOp.OR);
    private static final VoxelShape SHAPE_SOUTH = Shapes.join(Shapes.join(Block.box(2.5,0,7,13.5,7,16), Block.box(3.5,0,4,12.5,5,7), BooleanOp.OR), Block.box(5,0,0,11,2,5), BooleanOp.OR);
    private static final VoxelShape SHAPE_EAST = Shapes.join(Shapes.join(Block.box(7,0,2.5,16,7,13.5), Block.box(4,0,3.5,7,5,12.5), BooleanOp.OR), Block.box(0,0,5,5,2,11), BooleanOp.OR);
    private static final VoxelShape SHAPE_WEST = Shapes.join(Shapes.join(Block.box(0,0,2.5,9,7,13.5), Block.box(9,0,3.5,12,5,12.5), BooleanOp.OR), Block.box(11,0,5,16,2,11), BooleanOp.OR);

    public SandsealPlushBlock(Properties pProperties) {
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
