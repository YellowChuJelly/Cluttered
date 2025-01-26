package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class CottageOttomanBlock extends ChairBlock{
    private static final VoxelShape SHAPE_NS = Block.box(2,0, 3, 14, 6, 13);
    private static final VoxelShape SHAPE_EW = Block.box(3,0, 2, 13, 6, 14);
    private static final float SEAT_OFFSET = 0.375f;

    public CottageOttomanBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        Direction facing = pState.getValue(FACING);
        return facing == Direction.NORTH || facing == Direction.SOUTH ? SHAPE_NS : SHAPE_EW;
    }

    @Override
    public float getSeatOffset(){
        return SEAT_OFFSET;
    }
}
