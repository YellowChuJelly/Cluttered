package net.redchujelly.cluttered.setup;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.redchujelly.cluttered.Cluttered;
import net.redchujelly.cluttered.worldgen.tree.custom.RedMushroomTrunkPlacer;
import net.redchujelly.cluttered.worldgen.tree.custom.WillowTrunkPlacer;

public class TrunkPlacerTypeRegistration {
    public static final DeferredRegister<TrunkPlacerType<?>> TRUNK_PLACERS =
            DeferredRegister.create(Registries.TRUNK_PLACER_TYPE, Cluttered.MODID);

    public static final RegistryObject<TrunkPlacerType<WillowTrunkPlacer>> WILLOW_TRUNK_PLACER =
            TRUNK_PLACERS.register("willow_trunk_placer", () -> new TrunkPlacerType<>(WillowTrunkPlacer.CODEC));
    public static final RegistryObject<TrunkPlacerType<RedMushroomTrunkPlacer>> RED_MUSHROOM_TRUNK_PLACER =
            TRUNK_PLACERS.register("red_mushroom_trunk_placer", () -> new TrunkPlacerType<>(RedMushroomTrunkPlacer.CODEC));

    public static void register(IEventBus eventBus){
        TRUNK_PLACERS.register(eventBus);
    }
}
