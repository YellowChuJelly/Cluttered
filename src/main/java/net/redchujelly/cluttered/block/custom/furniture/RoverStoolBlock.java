package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class RoverStoolBlock extends ChairBlock{
    private static final VoxelShape SHAPE = Shapes.join(Block.box(3.5, 0, 3.5, 12.5, 6, 12.5), Block.box(2.5, 6, 2.5, 13.5, 9, 13.5), BooleanOp.OR);
    private static final float SEAT_OFFSET = 0.5625f;

    public RoverStoolBlock(Properties pProperties) {
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
