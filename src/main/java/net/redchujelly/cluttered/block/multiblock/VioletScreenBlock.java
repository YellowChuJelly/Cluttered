package net.redchujelly.cluttered.block.multiblock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class VioletScreenBlock extends MultiblockPlacer {
    private static final VoxelShape SHAPE_14_N = Block.box(2,0,3,16,16,10);
    private static final VoxelShape SHAPE_14_S = Block.box(0,0,6,14,16,13);
    private static final VoxelShape SHAPE_14_E = Block.box(6,0,2,13,16,14);
    private static final VoxelShape SHAPE_14_W = Block.box(3,0,0,10,16,14);

    private static final VoxelShape SHAPE_2356_N = Block.box(0,0,3,16,16,10);
    private static final VoxelShape SHAPE_2356_S = Block.box(0,0,6,16,16,13);
    private static final VoxelShape SHAPE_2356_E = Block.box(6,0,0,14,16,16);
    private static final VoxelShape SHAPE_2356_W = Block.box(3,0,0,10,16,16);

    public static final IntegerProperty MULTIBLOCK_PART = IntegerProperty.create("part", 1, 6);
    private static final int[][][] MULTIBLOCK_SHAPE = {
            {
                    {1},
                    {2},
                    {3}
            },
            {
                    {4},
                    {5},
                    {6}
            }
    };
    public VioletScreenBlock(Properties pProperties) {
        super(pProperties);
    }

    public int[][][] getMultiblockShape() {
        return MULTIBLOCK_SHAPE;
    }

    @Override
    public IntegerProperty getMultiblockPart() {
        return MULTIBLOCK_PART;
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        int part = pState.getValue(MULTIBLOCK_PART);
        Direction facing = pState.getValue(FACING);
        return switch (facing) {
            case SOUTH -> part == 1 || part == 4 ? SHAPE_14_S : SHAPE_2356_S;
            case EAST -> part == 1 || part == 4 ? SHAPE_14_E : SHAPE_2356_E;
            case WEST -> part == 1 || part == 4 ? SHAPE_14_W : SHAPE_2356_W;
            default -> part == 1 || part == 4 ? SHAPE_14_N : SHAPE_2356_N;
        };
    }
}
