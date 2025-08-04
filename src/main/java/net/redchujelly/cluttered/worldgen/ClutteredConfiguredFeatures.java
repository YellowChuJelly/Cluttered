package net.redchujelly.cluttered.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.redchujelly.cluttered.Cluttered;
import net.redchujelly.cluttered.setup.BlockRegistration;
import net.redchujelly.cluttered.worldgen.tree.custom.*;

import java.util.List;

public class ClutteredConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> WILLOW_KEY = registerKey("willow");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POPLAR_KEY = registerKey("poplar");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLUE_MUSHROOM_KEY = registerKey("blue_mushroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_MUSHROOM_KEY = registerKey("red_mushroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRABAPPLE_KEY = registerKey("crabapple");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SYCAMORE_KEY = registerKey("sycamore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAPLE_KEY = registerKey("fluorescent_maple");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context){
        register(context, WILLOW_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                        .add(BlockRegistration.WILLOW_LOG.get().defaultBlockState(), 1)
                        .add(BlockRegistration.FLOWERING_WILLOW_LOG.get().defaultBlockState(), 1).build()),
                new WillowTrunkPlacer(6, 2, 6),

                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                        .add(BlockRegistration.WILLOW_LEAVES.get().defaultBlockState(), 3)
                        .add(BlockRegistration.FLOWERING_WILLOW_LEAVES.get().defaultBlockState(), 2).build()),
                new WillowFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), 1, 5),

                new TwoLayersFeatureSize(5, 2, 4)).decorators(List.of(new WillowTreeDecorator(0.6f)))
                .build()
        );

        register(context, POPLAR_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                        .add(BlockRegistration.POPLAR_LOG.get().defaultBlockState(), 1)
                        .add(BlockRegistration.FLOWERING_POPLAR_LOG.get().defaultBlockState(), 1).build()),
                new StraightTrunkPlacer(6, 1, 3),


                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                        .add(BlockRegistration.POPLAR_LEAVES.get().defaultBlockState(), 3)
                        .add(BlockRegistration.FLOWERING_POPLAR_LEAVES.get().defaultBlockState(), 2).build()),
                new PoplarFoliagePlacer(ConstantInt.of(4), ConstantInt.of(5), 8),

                new TwoLayersFeatureSize(3, 0, 2)).build()
        );

        register(context, BLUE_MUSHROOM_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(BlockRegistration.BLUE_MUSHROOM_LOG.get()),
                new StraightTrunkPlacer(5, 1, 3),

                WeightedStateProvider.simple(BlockRegistration.BLUE_MUSHROOM_CAP.get()),
                new BlueMushroomFoliagePlacer(ConstantInt.of(3), ConstantInt.of(4), 3),

                new TwoLayersFeatureSize(5, 0, 4)).build()
        );

        register(context, RED_MUSHROOM_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(BlockRegistration.RED_MUSHROOM_LOG.get()),
                new RedMushroomTrunkPlacer(6, 0, 2),

                BlockStateProvider.simple(BlockRegistration.RED_MUSHROOM_CAP.get()),
                new RedMushroomFoliagePlacer(ConstantInt.of(3), ConstantInt.of(4), 5),

                new TwoLayersFeatureSize(4, 1, 3)).build()
        );

        register(context, CRABAPPLE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                        .add(BlockRegistration.CRABAPPLE_LOG.get().defaultBlockState(), 1)
                        .add(BlockRegistration.FLOWERING_CRABAPPLE_LOG.get().defaultBlockState(), 1).build()),
                new CrabappleTrunkPlacer(4, 0, 2),


                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                        .add(BlockRegistration.CRABAPPLE_LEAVES.get().defaultBlockState(), 2)
                        .add(BlockRegistration.FLOWERING_CRABAPPLE_LEAVES.get().defaultBlockState(), 5).build()),
                new CrabappleFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),

                new TwoLayersFeatureSize(4, 0, 3)).build()
        );

        register(context, SYCAMORE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(BlockRegistration.SYCAMORE_LOG.get()),
                new SycamoreTrunkPlacer(6, 0, 4),

                BlockStateProvider.simple(BlockRegistration.SYCAMORE_LEAVES.get()),
                new SycamoreFoliagePlacer(ConstantInt.of(3), ConstantInt.of(4), 6),

                new TwoLayersFeatureSize(4, 0, 3)).build()
        );

        register(context, MAPLE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(BlockRegistration.MAPLE_LOG.get()),
                new MapleTrunkPlacer(6, 1, 3),


                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                        .add(BlockRegistration.MAPLE_LEAVES.get().defaultBlockState(), 25)
                        .add(BlockRegistration.MAPLE_LEAVES_FLOWERING.get().defaultBlockState(), 5).build()),
                new MapleFoliagePlacer(ConstantInt.of(4), ConstantInt.of(5)),

                new TwoLayersFeatureSize(4, 0, 3)).build()
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
