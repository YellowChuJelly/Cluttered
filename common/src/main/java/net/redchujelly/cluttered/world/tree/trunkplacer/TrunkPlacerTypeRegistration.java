package net.redchujelly.cluttered.world.tree.trunkplacer;

import com.mojang.serialization.Codec;
import dev.architectury.injectables.annotations.ExpectPlatform;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.redchujelly.cluttered.Cluttered;

import java.util.function.Supplier;

public class TrunkPlacerTypeRegistration {
    public static final DeferredRegister<TrunkPlacerType<?>> TRUNK_PLACERS =
            DeferredRegister.create(Cluttered.MOD_ID, Registries.TRUNK_PLACER_TYPE);

    public static final Supplier<TrunkPlacerType<WillowTrunkPlacer>> WILLOW_TRUNK_PLACER = registerType("willow_trunk_placer", WillowTrunkPlacer.CODEC);
    public static final Supplier<TrunkPlacerType<RedMushroomTrunkPlacer>> RED_MUSHROOM_TRUNK_PLACER = registerType("red_mushroom_trunk_placer", RedMushroomTrunkPlacer.CODEC);
    public static final Supplier<TrunkPlacerType<CrabappleTrunkPlacer>> CRABAPPLE_TRUNK_PLACER = registerType("crabapple_trunk_placer", CrabappleTrunkPlacer.CODEC);
    public static final Supplier<TrunkPlacerType<SycamoreTrunkPlacer>> SYCAMORE_TRUNK_PLACER = registerType("sycamore_trunk_placer", SycamoreTrunkPlacer.CODEC);
    public static final Supplier<TrunkPlacerType<MapleTrunkPlacer>> MAPLE_TRUNK_PLACER = registerType("maple_trunk_placer", MapleTrunkPlacer.CODEC);

    @ExpectPlatform
    public static <P extends TrunkPlacer> Supplier<TrunkPlacerType<P>> registerType(String id, Codec<P> codec){
        throw new IllegalStateException();
    }

    public static void init(){
        TRUNK_PLACERS.register();
    }
}
