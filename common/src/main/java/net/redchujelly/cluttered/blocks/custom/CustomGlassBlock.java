package net.redchujelly.cluttered.blocks.custom;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.AbstractGlassBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.redchujelly.cluttered.blocks.BlockRegistration;

public class CustomGlassBlock extends AbstractGlassBlock {

    public CustomGlassBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean skipRendering(BlockState pState, BlockState pAdjacentBlockState, Direction pSide) {
        boolean isGlass = pAdjacentBlockState.getBlock() instanceof AbstractGlassBlock;
        return isGlass || super.skipRendering(pState, pAdjacentBlockState, pSide);
    }
}
