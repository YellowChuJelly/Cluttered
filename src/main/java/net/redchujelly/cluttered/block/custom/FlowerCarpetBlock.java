package net.redchujelly.cluttered.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.GlowLichenBlock;
import net.minecraft.world.level.block.state.BlockState;

public class FlowerCarpetBlock extends GlowLichenBlock {
    public FlowerCarpetBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) {
        return 0;
    }
}
