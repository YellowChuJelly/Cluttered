package net.redchujelly.cluttered.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.redchujelly.cluttered.datagen.loot.ClutteredBlockLootTables;
import net.redchujelly.cluttered.datagen.loot.LootTableTest;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ClutteredLootTableProvider {
    public static LootTableProvider create(PackOutput output, CompletableFuture<HolderLookup.Provider> provider) {
        return new LootTableProvider(output, Set.of(), List.of(
                new LootTableProvider.SubProviderEntry(ClutteredBlockLootTables::new, LootContextParamSets.BLOCK),
                new LootTableProvider.SubProviderEntry(LootTableTest::new, LootContextParamSets.CHEST)),
				provider
        );
    }
}
