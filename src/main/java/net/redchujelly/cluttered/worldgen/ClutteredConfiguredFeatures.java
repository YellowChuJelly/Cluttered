package net.redchujelly.cluttered.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.HugeMushroomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.redchujelly.cluttered.Cluttered;
import net.redchujelly.cluttered.setup.BlockRegistration;
import net.redchujelly.cluttered.worldgen.tree.custom.PoplarFoliagePlacer;
import net.redchujelly.cluttered.worldgen.tree.custom.WillowFoliagePlacer;
import net.redchujelly.cluttered.worldgen.tree.custom.WillowTrunkPlacer;

public class ClutteredConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> WILLOW_KEY = registerKey("willow");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POPLAR_KEY = registerKey("poplar");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLUE_MUHSROOM_KEY = registerKey("blue_mushroom");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context){
        register(context, WILLOW_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(BlockRegistration.WILLOW_LOG.get()),
                new WillowTrunkPlacer(6, 4, 6),

                BlockStateProvider.simple(BlockRegistration.WILLOW_LEAVES.get()),
                new WillowFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), 1, 5),

                new TwoLayersFeatureSize(1, 2, 4)).build()
        );

        register(context, POPLAR_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(BlockRegistration.POPLAR_LOG.get()),
                new StraightTrunkPlacer(6, 1, 3),

                BlockStateProvider.simple(BlockRegistration.POPLAR_LEAVES.get()),
                new PoplarFoliagePlacer(ConstantInt.of(4), ConstantInt.of(5), 8),

                new TwoLayersFeatureSize(4, 3, 5)).build()
        );

        register(context, BLUE_MUHSROOM_KEY, Feature.HUGE_RED_MUSHROOM, new HugeMushroomFeatureConfiguration(
                BlockStateProvider.simple(BlockRegistration.BLUE_MUSHROOM_CAP.get()),
                BlockStateProvider.simple(BlockRegistration.BLUE_MUSHROOM_LOG.get()), 3)
        );
    }

    //FROM KAUPENJOE 1.20.1 FORGE TUTORIAL
    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Cluttered.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration){
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }


}
