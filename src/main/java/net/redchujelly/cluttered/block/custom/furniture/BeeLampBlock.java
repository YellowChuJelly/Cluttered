package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BeeLampBlock extends SmallLampBlock{
    private static final VoxelShape SHAPE_NS = Block.box(4.5,1,3,11.5, 8, 13);
    private static final VoxelShape SHAPE_EW = Block.box(3,1,4.5,13, 8, 11.5);

    public BeeLampBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return pState.getValue(FACING).equals(Direction.NORTH) || pState.getValue(FACING).equals(Direction.SOUTH) ? SHAPE_NS : SHAPE_EW;
    }
}
