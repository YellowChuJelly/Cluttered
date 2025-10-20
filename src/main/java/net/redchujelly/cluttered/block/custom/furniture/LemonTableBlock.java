package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class LemonTableBlock extends SmallFurnitureBlock{
    private static final VoxelShape SHAPE = Shapes.or(Block.box(2,5,2,14,16,14), Block.box(7,1,7,9,5,9), Block.box(3,0,3,13,1,13));
    private static final VoxelShape INTERACTION_SHAPE = Shapes.or(SHAPE, Block.box(0,15,0,16,16,16));

    public LemonTableBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }

    @Override
    public VoxelShape getInteractionShape(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        return INTERACTION_SHAPE;
    }
}
