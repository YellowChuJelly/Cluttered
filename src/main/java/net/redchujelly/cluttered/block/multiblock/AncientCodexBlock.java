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

public class AncientCodexBlock extends MultiblockPlacer{

    private static final VoxelShape SHAPE_1 = Shapes.or(Block.box(1,0,1,15,4,15), Block.box(4,4,4,12,6,12), Block.box(6.5,5,6.5,9.5,16,9.5));

    private static final VoxelShape SHAPE_N_2 = Shapes.or(Block.box(3,0,6,13,7,15), Block.box(3,5,3,13,12,11));
    private static final VoxelShape SHAPE_S_2 = Shapes.or(Block.box(3,0,1,13,7,10), Block.box(3,5,5,13,12,13));
    private static final VoxelShape SHAPE_E_2 = Shapes.or(Block.box(1,0,3,10,7,13), Block.box(5,5,3,13,12,13));
    private static final VoxelShape SHAPE_W_2 = Shapes.or(Block.box(6,0,3,15,7,13), Block.box(3,5,3,11,12,13));

    public static final IntegerProperty MULTIBLOCK_PART = IntegerProperty.create("part", 1, 2);
    private static final int[][][] MULTIBLOCK_SHAPE = {
            {
                    {1}
            },
            {
                    {2}
            }
    };

    public AncientCodexBlock(Properties pProperties) {
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
        if (pState.getValue(getMultiblockPart()) == 1){
            return SHAPE_1;
        } else {
            Direction facing = pState.getValue(FACING);
            switch (facing){
                case SOUTH -> {
                    return SHAPE_S_2;
                }
                case EAST -> {
                    return SHAPE_E_2;
                }
                case WEST -> {
                    return SHAPE_W_2;
                }
                default -> {
                    return SHAPE_N_2;
                }
            }
        }
    }
}
