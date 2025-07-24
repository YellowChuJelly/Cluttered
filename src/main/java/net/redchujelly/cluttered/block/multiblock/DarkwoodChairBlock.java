package net.redchujelly.cluttered.block.multiblock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class DarkwoodChairBlock extends ArmchairBlock{

    private static final VoxelShape SHAPE_N_1 = Shapes.or(Block.box(9,3,4,16,9,15), Block.box(5,0,0,9,15,16), Block.box(5,0,0,16,22,4));
    private static final VoxelShape SHAPE_S_1 = Shapes.or(Block.box(0,3,1,7,9,12), Block.box(7,0,0,11,15,16), Block.box(0,0,12,11,22,16));
    private static final VoxelShape SHAPE_E_1 = Shapes.or(Block.box(1,3,9,12,9,16), Block.box(0,0,5,16,15,9), Block.box(12,0,5,16,22,16));
    private static final VoxelShape SHAPE_W_1 = Shapes.or(Block.box(4,3,0,15,9,7), Block.box(0,0,7,16,15,11), Block.box(0,0,0,4,22,11));

    private static final VoxelShape SHAPE_N_2 = Shapes.or(Block.box(0,3,4,7,9,15), Block.box(7,0,0,9,15,16), Block.box(0,0,0,11,22,4));
    private static final VoxelShape SHAPE_S_2 = Shapes.or(Block.box(9,3,1,16,9,12), Block.box(5,0,0,9,15,16), Block.box(5,0,12,16,22,16));
    private static final VoxelShape SHAPE_E_2 = Shapes.or(Block.box(1,3,0,12,9,7), Block.box(0,0,7,16,15,11), Block.box(12,0,0,16,22,11));
    private static final VoxelShape SHAPE_W_2 = Shapes.or(Block.box(4,3,9,15,9,16), Block.box(0,0,5,16,15,9), Block.box(0,0,5,4,22,16));

    private static final float SEAT_OFFSET = 0.5625f;

    public DarkwoodChairBlock(Properties pProperties) {
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

    @Override
    public float getSeatOffset() {
        return SEAT_OFFSET;
    }
}
