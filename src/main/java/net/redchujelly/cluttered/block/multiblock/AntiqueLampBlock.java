package net.redchujelly.cluttered.block.multiblock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class AntiqueLampBlock extends CottageLampBlock{

    private static final VoxelShape SHAPE_1 = Shapes.or(Block.box(4,0,4,12,2,12), Block.box(7,0,7,9,16,9));

    private static final VoxelShape SHAPE_TOP_POST = Block.box(7,0,7,9,7,9);
    private static final VoxelShape SHAPE_N_2 = Shapes.or(Block.box(0,7,6,16,14,10), Block.box(6,7,6,10,14,16), SHAPE_TOP_POST);
    private static final VoxelShape SHAPE_S_2 = Shapes.or(Block.box(0,7,6,16,14,10), Block.box(6,7,0,10,14,10), SHAPE_TOP_POST);
    private static final VoxelShape SHAPE_E_2 = Shapes.or(Block.box(6,7,0,10,14,16), Block.box(0,7,6,10,14,10), SHAPE_TOP_POST);
    private static final VoxelShape SHAPE_W_2 = Shapes.or(Block.box(6,7,0,10,14,16), Block.box(6,7,6,16,14,10), SHAPE_TOP_POST);


    public AntiqueLampBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        if (pState.getValue(getMultiblockPart()) == 1){
            return SHAPE_1;
        }
        else {
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
