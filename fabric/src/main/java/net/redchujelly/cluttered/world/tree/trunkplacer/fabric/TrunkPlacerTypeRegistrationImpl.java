package net.redchujelly.cluttered.world.tree.trunkplacer.fabric;

import com.mojang.serialization.Codec;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.redchujelly.cluttered.mixin.TrunkPlacerTypeInvoker;

import net.redchujelly.cluttered.world.tree.trunkplacer.TrunkPlacerTypeRegistration;

import java.util.function.Supplier;

public class TrunkPlacerTypeRegistrationImpl extends TrunkPlacerTypeRegistration {

    public static <P extends TrunkPlacer> Supplier<TrunkPlacerType<P>> registerType(String id, Codec<P> codec){
        return TRUNK_PLACERS.register(id, () -> TrunkPlacerTypeInvoker.cluttered_newTrunkPlacer(codec));
    }
}
