package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class FwishOttomanBlock extends ChairBlock{
    private static final VoxelShape SHAPE = Block.box(2,2,2,14,10,14);
    private static final float SEAT_OFFSET = 0.625f;

    public FwishOttomanBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }

    @Override
    public float getSeatOffset() {
        return SEAT_OFFSET;
    }
}
