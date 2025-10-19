package net.redchujelly.cluttered.block.multiblock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class LunarObservatoryTableBlock extends TableBlock{

    private static final VoxelShape SHAPE_TOP = Block.box(0,14,0,16,16,16);
    private static final VoxelShape SHAPE_NORTH = Shapes.or(Block.box(1,0,1,3,14,3), Block.box(1,0,13,3,14,15), SHAPE_TOP);
    private static final VoxelShape SHAPE_SOUTH = Shapes.or(Block.box(13,0,1,15,14,3), Block.box(13,0,13,15,14,15), SHAPE_TOP);
    private static final VoxelShape SHAPE_EAST = Shapes.or(Block.box(13,0,1,15,14,3), Block.box(1,0,1,3,14,3), SHAPE_TOP);
    private static final VoxelShape SHAPE_WEST = Shapes.or(Block.box(13,0,13,15,14,15), Block.box(1,0,13,3,14,15), SHAPE_TOP);

    public LunarObservatoryTableBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        int part = pState.getValue(MULTIBLOCK_PART);
        Direction facing = pState.getValue(FACING);
        return switch (facing) {
            case SOUTH ->  part == 1 ? SHAPE_SOUTH : SHAPE_NORTH;
            case EAST ->  part == 1 ? SHAPE_EAST : SHAPE_WEST;
            case WEST ->  part == 1 ? SHAPE_WEST : SHAPE_EAST;
            default ->  part == 1 ? SHAPE_NORTH : SHAPE_SOUTH;
        };
    }
}
