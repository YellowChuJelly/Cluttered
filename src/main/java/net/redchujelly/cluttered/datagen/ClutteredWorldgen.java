package net.redchujelly.cluttered.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.redchujelly.cluttered.Cluttered;
import net.redchujelly.cluttered.worldgen.ClutteredConfiguredFeatures;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ClutteredWorldgen extends DatapackBuiltinEntriesProvider {

    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, ClutteredConfiguredFeatures::bootstrap);

    public ClutteredWorldgen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(Cluttered.MODID));
    }
}
