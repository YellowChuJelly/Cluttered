package net.redchujelly.cluttered.world.tree.foliageplacer.forge;

import com.mojang.serialization.Codec;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.redchujelly.cluttered.world.tree.foliageplacer.FoliagePlacerTypeRegistration;

import java.util.function.Supplier;

public class FoliagePlacerTypeRegistrationImpl extends FoliagePlacerTypeRegistration {

    public static <P extends FoliagePlacer> Supplier<FoliagePlacerType<P>> registerType(String id, Codec<P> codec){
        return FOLIAGE_PLACERS.register(id, () -> new FoliagePlacerType<>(codec));
    }
}
