package net.redchujelly.cluttered.setup;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.redchujelly.cluttered.Cluttered;
import net.redchujelly.cluttered.worldgen.tree.custom.*;

public class TrunkPlacerTypeRegistration {
    public static final DeferredRegister<TrunkPlacerType<?>> TRUNK_PLACERS =
            DeferredRegister.create(Registries.TRUNK_PLACER_TYPE, Cluttered.MODID);

    public static final DeferredHolder<TrunkPlacerType<?>, TrunkPlacerType<WillowTrunkPlacer>> WILLOW_TRUNK_PLACER =
            TRUNK_PLACERS.register("willow_trunk_placer", () -> new TrunkPlacerType<>(WillowTrunkPlacer.CODEC));
    public static final DeferredHolder<TrunkPlacerType<?>, TrunkPlacerType<RedMushroomTrunkPlacer>> RED_MUSHROOM_TRUNK_PLACER =
            TRUNK_PLACERS.register("red_mushroom_trunk_placer", () -> new TrunkPlacerType<>(RedMushroomTrunkPlacer.CODEC));
    public static final DeferredHolder<TrunkPlacerType<?>, TrunkPlacerType<CrabappleTrunkPlacer>> CRABAPPLE_TRUNK_PLACER =
            TRUNK_PLACERS.register("crabapple_trunk_placer", () -> new TrunkPlacerType<>(CrabappleTrunkPlacer.CODEC));
    public static final DeferredHolder<TrunkPlacerType<?>, TrunkPlacerType<SycamoreTrunkPlacer>> SYCAMORE_TRUNK_PLACER =
            TRUNK_PLACERS.register("sycamore_trunk_placer", () -> new TrunkPlacerType<>(SycamoreTrunkPlacer.CODEC));
    public static final DeferredHolder<TrunkPlacerType<?>, TrunkPlacerType<MapleTrunkPlacer>> MAPLE_TRUNK_PLACER =
            TRUNK_PLACERS.register("maple_trunk_placer", () -> new TrunkPlacerType<>(MapleTrunkPlacer.CODEC));

    public static void register(IEventBus eventBus){
        TRUNK_PLACERS.register(eventBus);
    }
}
