package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class DarkwoodStoolBlock extends ChairBlock{
    private static final VoxelShape SHAPE = Block.box(3.5,0,3.5, 12.5, 9, 12.5);
    private static final float SEAT_OFFSET = 0.5625f;

    public DarkwoodStoolBlock(Properties pProperties) {
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
