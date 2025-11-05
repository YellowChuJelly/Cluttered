package net.redchujelly.cluttered.block.multiblock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ImperialTableBlock extends TableBlock{

    private static final VoxelShape SHAPE_TOP = Block.box(0,14,0,16,16,16);
    private static final VoxelShape SHAPE_NORTH = Shapes.or(Block.box(0,0,0,2,14,2), Block.box(0,0,14,2,14,16), SHAPE_TOP);
    private static final VoxelShape SHAPE_SOUTH = Shapes.or(Block.box(14,0,0,16,14,2), Block.box(14,0,14,16,14,16), SHAPE_TOP);
    private static final VoxelShape SHAPE_EAST = Shapes.or(Block.box(14,0,0,16,14,2), Block.box(0,0,0,2,14,2), SHAPE_TOP);
    private static final VoxelShape SHAPE_WEST = Shapes.or(Block.box(14,0,14,16,14,16), Block.box(0,0,14,2,14,16), SHAPE_TOP);

    public ImperialTableBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        int part = pState.getValue(getMultiblockPart());
        Direction facing = pState.getValue(FACING);
        return switch (facing) {
            case SOUTH ->  part == 1 ? SHAPE_SOUTH : SHAPE_NORTH;
            case EAST ->  part == 1 ? SHAPE_EAST : SHAPE_WEST;
            case WEST ->  part == 1 ? SHAPE_WEST : SHAPE_EAST;
            default ->  part == 1 ? SHAPE_NORTH : SHAPE_SOUTH;
        };
    }
}
