package net.redchujelly.cluttered.block.multiblock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class CupidBenchBlock extends MultiblockChair{
    private static final VoxelShape SHAPE_N_1 = Shapes.or(Block.box(1,0,0,16,10,14), Block.box(1.5,10,0,3.5,16,13), Block.box(1.5,10,0,16,20,2));
    private static final VoxelShape SHAPE_S_1 = Shapes.or(Block.box(0,0,2,15,10,16), Block.box(12.5,10,3,14.5,16,16), Block.box(0,10,14,14.5,20,16));
    private static final VoxelShape SHAPE_E_1 = Shapes.or(Block.box(2,0,1,16,10,16), Block.box(3,10,1.5,16,16,3.5), Block.box(14,10,1.5,16,20,16));
    private static final VoxelShape SHAPE_W_1 = Shapes.or(Block.box(0,0,0,14,10,15), Block.box(0,10,12.5,13,16,14.5), Block.box(0,10,0,2,20,14.5));

    private static final VoxelShape SHAPE_N_2 = Shapes.or(Block.box(0,0,0,15,10,14), Block.box(12.5,10,0,14.5,16,13), Block.box(0,10,0,14.5,20,2));
    private static final VoxelShape SHAPE_S_2 = Shapes.or(Block.box(1,0,2,16,10,16), Block.box(1.5,10,3,3.5,16,16), Block.box(1.5,10,14,16,20,16));
    private static final VoxelShape SHAPE_E_2 = Shapes.or(Block.box(2,0,0,16,10,15), Block.box(3,10,12.5,16,16,14.5), Block.box(14,10,0,16,20,14.5));
    private static final VoxelShape SHAPE_W_2 = Shapes.or(Block.box(0,0,1,14,10,16), Block.box(0,10,1.5,13,16,3.5), Block.box(0,10,1.5,2,20,16));

    private static final float SEAT_OFFSET = 0.625f;

    public CupidBenchBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public float getSeatOffset() {
        return SEAT_OFFSET;
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
