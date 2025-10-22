package net.redchujelly.cluttered.block.multiblock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class SmallBookcaseBlock extends MultiblockPlacer{

    private static final VoxelShape SHAPE_N_1 = Shapes.or(Block.box(0,0,0,16,2,10), Block.box(1,0,0,15,16,9));
    private static final VoxelShape SHAPE_S_1 = Shapes.or(Block.box(0,0,6,16,2,16), Block.box(1,0,7,15,16,16));
    private static final VoxelShape SHAPE_E_1 = Shapes.or(Block.box(6,0,0,16,2,16), Block.box(7,0,1,16,16,15));
    private static final VoxelShape SHAPE_W_1 = Shapes.or(Block.box(0,0,0,10,2,16), Block.box(0,0,1,9,16,15));

    private static final VoxelShape SHAPE_N_2 = Shapes.or(Block.box(0,15,0,16,16,10), Block.box(1,0,0,15,16,9));
    private static final VoxelShape SHAPE_S_2 = Shapes.or(Block.box(0,15,6,16,16,16), Block.box(1,0,7,15,16,16));
    private static final VoxelShape SHAPE_E_2 = Shapes.or(Block.box(6,15,0,16,16,16), Block.box(7,0,1,16,16,15));
    private static final VoxelShape SHAPE_W_2 = Shapes.or(Block.box(0,15,0,10,16,16), Block.box(0,0,1,9,16,15));

    public static final IntegerProperty MULTIBLOCK_PART = IntegerProperty.create("part", 1, 2);
    private static final int[][][] MULTIBLOCK_SHAPE = {
            {
                    {1}
            },
            {
                    {2}
            }
    };
    public SmallBookcaseBlock(Properties pProperties) {
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
    public int[][][] getMultiblockShape() {
        return MULTIBLOCK_SHAPE;
    }

    @Override
    public IntegerProperty getMultiblockPart() {
        return MULTIBLOCK_PART;
    }
}
