package net.redchujelly.cluttered.worldgen.tree;

import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.redchujelly.cluttered.worldgen.ClutteredConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

public class MapleTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource randomSource, boolean b) {
        return ClutteredConfiguredFeatures.MAPLE_KEY;
    }
}
