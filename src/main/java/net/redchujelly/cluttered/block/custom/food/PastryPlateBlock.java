package net.redchujelly.cluttered.block.custom.food;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.redchujelly.cluttered.block.custom.furniture.SmallFurnitureBlock;

public class PastryPlateBlock extends SmallFurnitureBlock {
    private static final VoxelShape PLATE_SHAPE = Block.box(2,0,2,14,1,14);

    public PastryPlateBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return PLATE_SHAPE;
    }
}
