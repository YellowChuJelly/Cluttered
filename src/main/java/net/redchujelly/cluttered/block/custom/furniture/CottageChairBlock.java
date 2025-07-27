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

public class CottageChairBlock extends ChairBlock{
    private static final VoxelShape SHAPE_NORTH = Shapes.or(Block.box(2,0, 3, 14, 10, 14), Block.box(2,10,12, 14,18,14), Block.box(1,18,12,15,22, 14));
    private static final VoxelShape SHAPE_SOUTH = Shapes.or(Block.box(2,0, 2, 14, 10, 13), Block.box(2,10,2,14,18,4), Block.box(1,18,2,15,22,4));
    private static final VoxelShape SHAPE_EAST = Shapes.or(Block.box(2,0, 2, 13, 10, 14), Block.box(2,10,2,4,18,14), Block.box(2,18,1,4,22,15));
    private static final VoxelShape SHAPE_WEST = Shapes.or(Block.box(3,0, 2, 14, 10, 14), Block.box(12,10,2,14,18,14), Block.box(12,18,1,14,22,15));
    private static final float SEAT_OFFSET = 0.625f;

    public CottageChairBlock(Properties pProperties) {
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
