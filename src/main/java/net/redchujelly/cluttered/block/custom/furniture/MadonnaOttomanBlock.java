package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class MadonnaOttomanBlock extends ChairBlock{
    private static final VoxelShape SHAPE = Block.box(1,0, 1, 15, 8, 15);
    private static final float SEAT_OFFSET = 0.55f;

    public MadonnaOttomanBlock(Properties pProperties) {
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
