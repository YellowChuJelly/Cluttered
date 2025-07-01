package net.redchujelly.cluttered.block.multiblock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class DryingHerbsBlock extends MultiblockPlacer{
    private static final VoxelShape SHAPE_N_1 = Block.box(4,0,0,16,16,6);
    private static final VoxelShape SHAPE_S_1 = Block.box(0,0,10,12,16,16);
    private static final VoxelShape SHAPE_E_1 = Block.box(10,0,4,16,16,16);
    private static final VoxelShape SHAPE_W_1 = Block.box(0,0,0,6,16,12);

    private static final VoxelShape SHAPE_N_2 = Block.box(0,0,0,12,16,6);
    private static final VoxelShape SHAPE_S_2 = Block.box(4,0,10,16,16,16);
    private static final VoxelShape SHAPE_E_2 = Block.box(10,0,0,16,16,12);
    private static final VoxelShape SHAPE_W_2 = Block.box(0,0,4,6,16,16);

    public static final IntegerProperty MULTIBLOCK_PART = IntegerProperty.create("part", 1, 2);
    private static final int[][][] MULTIBLOCK_SHAPE = {
            {
                    {1},
                    {2}
            },
    };

    public DryingHerbsBlock(Properties pProperties) {
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
    public IntegerProperty getMultiblockPart() {
        return MULTIBLOCK_PART;
    }

    @Override
    public int[][][] getMultiblockShape() {
        return MULTIBLOCK_SHAPE;
    }
}
