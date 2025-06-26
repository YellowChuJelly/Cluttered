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
    private static final VoxelShape SHAPE_NORTH = Shapes.or(Block.box(8,0,8,16,16,16),  Block.box(0,0,0,8,16,16));
    private static final VoxelShape SHAPE_SOUTH = Shapes.or(Block.box(0,0,0,8,16,8),  Block.box(8,0,0,16,16,16));
    private static final VoxelShape SHAPE_EAST = Shapes.or(Block.box(0,0,8,8,16,16),  Block.box(0,0,0,16,16,8));
    private static final VoxelShape SHAPE_WEST = Shapes.or(Block.box(8,0,0,16,16,8), Block.box(0,0,8,16,16,16));

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

    @Override
    public VoxelShape getCollisionShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        Direction facing = pState.getValue(FACING);
        VoxelShape baseShape = switch (facing) {
            case SOUTH -> SHAPE_SOUTH;
            case EAST -> SHAPE_EAST;
            case WEST -> SHAPE_WEST;
            default -> SHAPE_NORTH;
        };
        return Shapes.or(baseShape, Block.box(0,0,0,16,0.5,16));
    }
}
