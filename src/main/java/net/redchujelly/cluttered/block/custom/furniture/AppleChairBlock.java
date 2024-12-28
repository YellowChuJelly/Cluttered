package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class AppleChairBlock extends ChairBlock{
    private static final VoxelShape SHAPE = Shapes.join(Block.box(3, 0, 3, 13, 7, 13), Block.box(2, 7, 2, 14, 11, 14), BooleanOp.OR);
    private static final float SEAT_OFFSET = 0.6875f;

    public AppleChairBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }

    @Override
    public float getSeatOffset(){
        return SEAT_OFFSET;
    }
}
