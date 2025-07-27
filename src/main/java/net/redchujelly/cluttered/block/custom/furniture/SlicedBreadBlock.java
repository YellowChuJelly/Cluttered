package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class SlicedBreadBlock extends SmallFurnitureBlock{

    private static final VoxelShape SHAPE_NS = Block.box(1,0,4.5,15,5,11.5);
    private static final VoxelShape SHAPE_EW = Block.box(4.5,0,1,11.5,5,15);

    public SlicedBreadBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return pState.getValue(FACING).equals(Direction.NORTH) || pState.getValue(FACING).equals(Direction.SOUTH) ? SHAPE_NS : SHAPE_EW;
    }
}
