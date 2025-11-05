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

public class AntiqueBookStandBlock extends MultiblockPlacer{

    private static final VoxelShape SHAPE_1 = Shapes.or(Block.box(2,0,2,14,5,14), Block.box(6,4,6,10,16,10));

    private static final VoxelShape SHAPE_N_2 = Shapes.or(Block.box(1.5,-1,7,14.5,3,13), Block.box(1.5,2,3,14.5,7,9));
    private static final VoxelShape SHAPE_S_2 = Shapes.or(Block.box(1.5,-1,3,14.5,3,9), Block.box(1.5,2,7,14.5,7,13));
    private static final VoxelShape SHAPE_E_2 = Shapes.or(Block.box(3,-1,1.5,9,3,14.5), Block.box(7,2,1.5,13,7,14.5));
    private static final VoxelShape SHAPE_W_2 = Shapes.or(Block.box(7,-1,1.5,13,3,14.5), Block.box(3,2,1.5,9,7,14.5));



    public static final IntegerProperty MULTIBLOCK_PART = IntegerProperty.create("part", 1, 2);
    private static final int[][][] MULTIBLOCK_SHAPE = {
            {
                    {1}
            },
            {
                    {2}
            }
    };

    public AntiqueBookStandBlock(Properties pProperties) {
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
