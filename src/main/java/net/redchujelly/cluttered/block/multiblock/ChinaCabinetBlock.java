package net.redchujelly.cluttered.block.multiblock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ChinaCabinetBlock extends MultiblockPlacer {
    private static final VoxelShape SHAPE_1_N = Shapes.join(Block.box(1,0,0,15,2,15), Block.box(2,2,0,14,16,14), BooleanOp.OR);
    private static final VoxelShape SHAPE_1_S = Shapes.join(Block.box(1,0,1,15,2,15), Block.box(2,2,2,14,16,16), BooleanOp.OR);
    private static final VoxelShape SHAPE_1_E = Shapes.join(Block.box(1,0,1,16,2,15), Block.box(2,2,2,16,16,14), BooleanOp.OR);
    private static final VoxelShape SHAPE_1_W = Shapes.join(Block.box(0,0,1,15,2,15), Block.box(0,2,2,14,16,14), BooleanOp.OR);

    private static final VoxelShape SHAPE_2_N = Shapes.join(Block.box(1,14,0,15,16,15), Block.box(2,2,0,14,16,14), BooleanOp.OR);
    private static final VoxelShape SHAPE_2_S = Shapes.join(Block.box(1,14,1,15,16,15), Block.box(2,2,2,14,16,16), BooleanOp.OR);
    private static final VoxelShape SHAPE_2_E = Shapes.join(Block.box(1,14,1,16,16,15), Block.box(2,2,2,16,16,14), BooleanOp.OR);
    private static final VoxelShape SHAPE_2_W = Shapes.join(Block.box(0,14,1,15,16,15), Block.box(0,2,2,14,16,14), BooleanOp.OR);

    public static final IntegerProperty MULTIBLOCK_PART = IntegerProperty.create("part", 1, 2);
    private static final int[][][] MULTIBLOCK_SHAPE = {
            {
                    {1}
            },
            {
                    {2}
            }
    };

    public ChinaCabinetBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public IntegerProperty getMultiblockPart() {
        return MULTIBLOCK_PART;
    }

    @Override
    public int[][][] getMultiblockShape() {
        return MULTIBLOCK_SHAPE;
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        int part = pState.getValue(MULTIBLOCK_PART);
        Direction facing = pState.getValue(FACING);
        return switch (facing) {
            case SOUTH -> part == 1 ? SHAPE_1_S : SHAPE_2_S;
            case EAST -> part == 1 ? SHAPE_1_E : SHAPE_2_E;
            case WEST -> part == 1 ? SHAPE_1_W : SHAPE_2_W;
            default -> part == 1 ? SHAPE_1_N : SHAPE_2_N;
        };
    }

}
