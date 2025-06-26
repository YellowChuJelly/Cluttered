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

public class SewingMannequinBlock extends MultiblockPlacer{
    private static final VoxelShape SHAPE_NS_1 = Shapes.or(Block.box(3,0,2,13,7,14), Block.box(3.5,0,5.5,12.5,16,10.5));
    private static final VoxelShape SHAPE_EW_1 = Shapes.or(Block.box(2,0,3,14,7,13), Block.box(5.5,0,3.5,10.5,16,12.5));

    private static final VoxelShape SHAPE_NS_2 = Shapes.or(Block.box(3.5,0,5.5,12.5,9,10.5), Block.box(6.5,9,6.5,9.5,12,9.5));
    private static final VoxelShape SHAPE_EW_2 = Shapes.or(Block.box(5.5,0,3.5,10.5,9,12.5), Block.box(6.5,9,6.5,9.5,12,9.5));


    public static final IntegerProperty MULTIBLOCK_PART = IntegerProperty.create("part", 1, 2);
    private static final int[][][] MULTIBLOCK_SHAPE = {
            {
                    {1}
            },
            {
                    {2}
            }
    };

    public SewingMannequinBlock(Properties pProperties) {
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
        Direction facing = pState.getValue(FACING);
        if (pState.getValue(MULTIBLOCK_PART) == 1){
            return facing.equals(Direction.NORTH) || facing.equals(Direction.SOUTH) ? SHAPE_NS_1 : SHAPE_EW_1;
        }
        else return facing.equals(Direction.NORTH) || facing.equals(Direction.SOUTH) ? SHAPE_NS_2 : SHAPE_EW_2;
    }
}
