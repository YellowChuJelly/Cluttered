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

public class BirdhouseBlock extends SmallFurnitureBlock{
    private static final VoxelShape SHAPE_NORTH = Shapes.join(Shapes.join(Block.box(8,0,0, 16, 0.5, 8), Block.box(8,0,8,16,16,16), BooleanOp.OR), Block.box(0,0,0,8,16,16), BooleanOp.OR);
    private static final VoxelShape SHAPE_SOUTH = Shapes.join(Shapes.join(Block.box(0,0,8, 8, 0.5, 16), Block.box(0,0,0,8,16,8), BooleanOp.OR), Block.box(8,0,0,16,16,16), BooleanOp.OR);
    private static final VoxelShape SHAPE_EAST = Shapes.join(Shapes.join(Block.box(8,0,8, 16, 0.5, 16), Block.box(0,0,8,8,16,16), BooleanOp.OR), Block.box(0,0,0,16,16,8), BooleanOp.OR);
    private static final VoxelShape SHAPE_WEST = Shapes.join(Shapes.join(Block.box(0,0,0, 8, 0.5, 8), Block.box(8,0,0,16,16,8), BooleanOp.OR), Block.box(0,0,8,16,16,16), BooleanOp.OR);

    public BirdhouseBlock(Properties pProperties) {
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
