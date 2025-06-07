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

public class ConfectioneryTableBlock extends TableBlock{
    private static final VoxelShape TOP = Block.box(0,14,0,16,16,16);
    private static final VoxelShape SHAPE_NORTH = Shapes.join(Block.box(1,0,1,4,14,4), Block.box(1,0,12,4,14,15), BooleanOp.OR);
    private static final VoxelShape SHAPE_SOUTH = Shapes.join(Block.box(12,0,1,15,14,4), Block.box(12,0,12,15,14,15), BooleanOp.OR);
    private static final VoxelShape SHAPE_EAST = Shapes.join(Block.box(12,0,1,15,14,4), Block.box(1,0,1,4,14,4), BooleanOp.OR);
    private static final VoxelShape SHAPE_WEST = Shapes.join(Block.box(1,0,12,4,14,15), Block.box(12,0,12,15,14,15), BooleanOp.OR);


    public ConfectioneryTableBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        int part = pState.getValue(MULTIBLOCK_PART);
        Direction facing = pState.getValue(FACING);
        VoxelShape legs;
        switch (facing) {
            case SOUTH -> legs = part == 1 ? SHAPE_SOUTH : SHAPE_NORTH;
            case EAST -> legs = part == 1 ? SHAPE_EAST : SHAPE_WEST;
            case WEST -> legs = part == 1 ? SHAPE_WEST : SHAPE_EAST;
            default -> legs = part == 1 ? SHAPE_NORTH : SHAPE_SOUTH;
        }
        return Shapes.join(legs, TOP, BooleanOp.OR);
    }
}
