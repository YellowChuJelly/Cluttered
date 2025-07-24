package net.redchujelly.cluttered.block.multiblock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class DarkwoodShelvesBlock extends TableBlock{

    private static final VoxelShape SHAPE_N_1 = Shapes.or(Block.box(1,2,1,16,5,14), Block.box(1,13,1,16,16,14), Block.box(2,0,5, 16,13,11));
    private static final VoxelShape SHAPE_S_1 = Shapes.or(Block.box(0,2,2,15,5,15), Block.box(0,13,2,15,16,15), Block.box(0,0,5, 14,13,11));
    private static final VoxelShape SHAPE_E_1 = Shapes.or(Block.box(2,2,1,15,5,16), Block.box(2,13,1,15,16,16), Block.box(5,0,2, 11,13,16));
    private static final VoxelShape SHAPE_W_1 = Shapes.or(Block.box(1,2,0,14,5,15), Block.box(1,13,0,14,16,15), Block.box(5,0,0, 11,13,14));

    private static final VoxelShape SHAPE_N_2 = Shapes.or(Block.box(0,2,1,15,5,14), Block.box(0,13,1,15,16,14), Block.box(0,0,5, 14,13,11));
    private static final VoxelShape SHAPE_S_2 = Shapes.or(Block.box(1,2,2,16,5,15), Block.box(1,13,2,16,16,15), Block.box(2,0,5, 16,13,11));
    private static final VoxelShape SHAPE_E_2 = Shapes.or(Block.box(2,2,0,15,5,15), Block.box(2,13,0,15,16,15), Block.box(5,0,0, 11,13,14));
    private static final VoxelShape SHAPE_W_2 = Shapes.or(Block.box(1,2,1,14,5,16), Block.box(1,13,1,14,16,16), Block.box(5,0,2, 11,13,16));

    public DarkwoodShelvesBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        int part = pState.getValue(MULTIBLOCK_PART);
        Direction facing = pState.getValue(FACING);
        return switch (facing) {
            case SOUTH -> part == 1 ? SHAPE_S_1 : SHAPE_S_2;
            case EAST -> part == 1 ? SHAPE_E_1 : SHAPE_E_2;
            case WEST -> part == 1 ? SHAPE_W_1 : SHAPE_W_2;
            default -> part == 1 ? SHAPE_N_1 : SHAPE_N_2;
        };
    }
}
