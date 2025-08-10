package net.redchujelly.cluttered.block.custom;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.AbstractGlassBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.redchujelly.cluttered.setup.BlockRegistration;

public class CustomGlassBlock extends AbstractGlassBlock {

    public CustomGlassBlock(Properties pProperties) {
        super(pProperties);
    }

    //I know that this probably sucks but I couldnt figure out how to check if a block extends from AbstractGlassBlock
    @Override
    public boolean skipRendering(BlockState pState, BlockState pAdjacentBlockState, Direction pSide) {
        boolean isCustomGlass = pAdjacentBlockState.getBlock().getClass().equals(BlockRegistration.GREENHOUSE_WINDOW.get().getClass());
        boolean isCustomHorizontalGlass = pAdjacentBlockState.getBlock().getClass().equals(BlockRegistration.GREENHOUSE_WINDOW_RADIAL_LEFT.get().getClass());
        boolean isGlass = pAdjacentBlockState.getBlock().getClass().equals(Blocks.GLASS.getClass());
        return isCustomGlass || isCustomHorizontalGlass || isGlass || super.skipRendering(pState, pAdjacentBlockState, pSide);
    }
}
