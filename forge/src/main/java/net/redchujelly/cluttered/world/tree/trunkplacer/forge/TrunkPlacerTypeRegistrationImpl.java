package net.redchujelly.cluttered.world.tree.trunkplacer.forge;

import com.mojang.serialization.Codec;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.redchujelly.cluttered.world.tree.trunkplacer.TrunkPlacerTypeRegistration;

import java.util.function.Supplier;

public class TrunkPlacerTypeRegistrationImpl extends TrunkPlacerTypeRegistration {

    public static <P extends TrunkPlacer> Supplier<TrunkPlacerType<P>> registerType(String id, Codec<P> codec){
        return TRUNK_PLACERS.register(id, () -> new TrunkPlacerType<>(codec));
    }
}
