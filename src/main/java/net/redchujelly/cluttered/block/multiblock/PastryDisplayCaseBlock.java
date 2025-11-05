package net.redchujelly.cluttered.block.multiblock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PastryDisplayCaseBlock extends MultiblockPlacer{

    private static final VoxelShape SHAPE_N_1 = Block.box(2.5,0,1.5,16,15,14.5);
    private static final VoxelShape SHAPE_S_1 = Block.box(0,0,1.5,13.5,15,14.5);
    private static final VoxelShape SHAPE_E_1 = Block.box(1.5,0,2.5,14.5,15,16);
    private static final VoxelShape SHAPE_W_1 = Block.box(1.5,0,0,14.5,15,13.5);

    public static final IntegerProperty MULTIBLOCK_PART = IntegerProperty.create("part", 1, 2);
    private static final int[][][] MULTIBLOCK_SHAPE = {
            {
                    {1},
                    {2}
            },
    };

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        int part = pState.getValue(getMultiblockPart());
        Direction facing = pState.getValue(FACING);
        return switch (facing) {
            case SOUTH -> part == 1 ? SHAPE_S_1 : SHAPE_N_1;
            case EAST -> part == 1 ? SHAPE_E_1 : SHAPE_W_1;
            case WEST -> part == 1 ? SHAPE_W_1 : SHAPE_E_1;
            default -> part == 1 ? SHAPE_N_1 : SHAPE_S_1;
        };
    }

    @Override
    public int[][][] getMultiblockShape() {
        return MULTIBLOCK_SHAPE;
    }

    @Override
    public IntegerProperty getMultiblockPart() {
        return MULTIBLOCK_PART;
    }

    public PastryDisplayCaseBlock(Properties pProperties) {
        super(pProperties);
    }
}
