package net.redchujelly.cluttered.setup;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.redchujelly.cluttered.Cluttered;
import net.redchujelly.cluttered.worldgen.tree.custom.BlueMushroomFoliagePlacer;
import net.redchujelly.cluttered.worldgen.tree.custom.PoplarFoliagePlacer;
import net.redchujelly.cluttered.worldgen.tree.custom.RedMushroomFoliagePlacer;
import net.redchujelly.cluttered.worldgen.tree.custom.WillowFoliagePlacer;

public class FoliagePlacerTypeRegistration {
    public static final DeferredRegister<FoliagePlacerType<?>> FOLIAGE_PLACERS = DeferredRegister.create(Registries.FOLIAGE_PLACER_TYPE, Cluttered.MODID);

    public static final RegistryObject<FoliagePlacerType<WillowFoliagePlacer>> WILLOW_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("willow_foliage_placer", () -> new FoliagePlacerType<>(WillowFoliagePlacer.CODEC));
    public static final RegistryObject<FoliagePlacerType<PoplarFoliagePlacer>> POPLAR_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("poplar_foliage_placer", () -> new FoliagePlacerType<>(PoplarFoliagePlacer.CODEC));
    public static final RegistryObject<FoliagePlacerType<BlueMushroomFoliagePlacer>> BLUE_MUSHROOM_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("blue_mushroom_foliage_placer", () -> new FoliagePlacerType<>(BlueMushroomFoliagePlacer.CODEC));
    public static final RegistryObject<FoliagePlacerType<RedMushroomFoliagePlacer>> RED_MUSHROOM_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("red_mushroom_foliage_placer", () -> new FoliagePlacerType<>(RedMushroomFoliagePlacer.CODEC));

    public static void register(IEventBus eventBus){
        FOLIAGE_PLACERS.register(eventBus);
    }
}
