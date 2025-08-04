package net.redchujelly.cluttered.setup;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.redchujelly.cluttered.Cluttered;
import net.redchujelly.cluttered.worldgen.tree.custom.*;

public class FoliagePlacerTypeRegistration {
    public static final DeferredRegister<FoliagePlacerType<?>> FOLIAGE_PLACERS = DeferredRegister.create(Registries.FOLIAGE_PLACER_TYPE, Cluttered.MODID);

    public static final RegistryObject<FoliagePlacerType<WillowFoliagePlacer>> WILLOW_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("willow_foliage_placer", () -> new FoliagePlacerType<>(WillowFoliagePlacer.CODEC));
    public static final RegistryObject<FoliagePlacerType<PoplarFoliagePlacer>> POPLAR_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("poplar_foliage_placer", () -> new FoliagePlacerType<>(PoplarFoliagePlacer.CODEC));
    public static final RegistryObject<FoliagePlacerType<CrabappleFoliagePlacer>> CRABAPPLE_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("crabapple_foliage_placer", () -> new FoliagePlacerType<>(CrabappleFoliagePlacer.CODEC));
    public static final RegistryObject<FoliagePlacerType<SycamoreFoliagePlacer>> SYCAMORE_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("sycamore_foliage_placer", () -> new FoliagePlacerType<>(SycamoreFoliagePlacer.CODEC));
    public static final RegistryObject<FoliagePlacerType<MapleFoliagePlacer>> MAPLE_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("maple_foliage_placer", () -> new FoliagePlacerType<>(MapleFoliagePlacer.CODEC));
    public static final RegistryObject<FoliagePlacerType<BlueMushroomFoliagePlacer>> BLUE_MUSHROOM_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("blue_mushroom_foliage_placer", () -> new FoliagePlacerType<>(BlueMushroomFoliagePlacer.CODEC));
    public static final RegistryObject<FoliagePlacerType<RedMushroomFoliagePlacer>> RED_MUSHROOM_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("red_mushroom_foliage_placer", () -> new FoliagePlacerType<>(RedMushroomFoliagePlacer.CODEC));

    public static void register(IEventBus eventBus){
        FOLIAGE_PLACERS.register(eventBus);
    }
}
