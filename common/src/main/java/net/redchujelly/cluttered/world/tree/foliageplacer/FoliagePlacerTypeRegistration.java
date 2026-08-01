package net.redchujelly.cluttered.world.tree.foliageplacer;

import com.mojang.serialization.Codec;
import dev.architectury.injectables.annotations.ExpectPlatform;
import dev.architectury.platform.Platform;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.redchujelly.cluttered.Cluttered;

import java.util.function.Supplier;

public class FoliagePlacerTypeRegistration {
    public static final DeferredRegister<FoliagePlacerType<?>> FOLIAGE_PLACERS = DeferredRegister.create(Cluttered.MOD_ID, Registries.FOLIAGE_PLACER_TYPE);

    public static final Supplier<FoliagePlacerType<WillowFoliagePlacer>> WILLOW_FOLIAGE_PLACER = registerType("willow_foliage_placer", WillowFoliagePlacer.CODEC);
    public static final Supplier<FoliagePlacerType<PoplarFoliagePlacer>> POPLAR_FOLIAGE_PLACER = registerType("poplar_foliage_placer", PoplarFoliagePlacer.CODEC);
    public static final Supplier<FoliagePlacerType<CrabappleFoliagePlacer>> CRABAPPLE_FOLIAGE_PLACER = registerType("crabapple_foliage_placer", CrabappleFoliagePlacer.CODEC);
    public static final Supplier<FoliagePlacerType<SycamoreFoliagePlacer>> SYCAMORE_FOLIAGE_PLACER = registerType("sycamore_foliage_placer", SycamoreFoliagePlacer.CODEC);
    public static final Supplier<FoliagePlacerType<MapleFoliagePlacer>> MAPLE_FOLIAGE_PLACER = registerType("maple_foliage_placer", MapleFoliagePlacer.CODEC);
    public static final Supplier<FoliagePlacerType<BlueMushroomFoliagePlacer>> BLUE_MUSHROOM_FOLIAGE_PLACER = registerType("blue_mushroom_foliage_placer", BlueMushroomFoliagePlacer.CODEC);
    public static final Supplier<FoliagePlacerType<RedMushroomFoliagePlacer>> RED_MUSHROOM_FOLIAGE_PLACER = registerType("red_mushroom_foliage_placer", RedMushroomFoliagePlacer.CODEC);

    @ExpectPlatform
    public static <P extends FoliagePlacer> Supplier<FoliagePlacerType<P>> registerType(String id, Codec<P> codec){
        throw new IllegalStateException();
    }

    public static void init(){
        FOLIAGE_PLACERS.register();
    }
}
