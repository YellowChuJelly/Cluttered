package net.redchujelly.cluttered.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.redchujelly.cluttered.datagen.loot.ClutteredBlockLootTables;
import net.redchujelly.cluttered.datagen.loot.LootTableTest;

import java.util.List;
import java.util.Set;

public class ClutteredLootTableProvider {
    public static LootTableProvider create(PackOutput output) {
        return new LootTableProvider(output, Set.of(), List.of(
                new LootTableProvider.SubProviderEntry(ClutteredBlockLootTables::new, LootContextParamSets.BLOCK),
                new LootTableProvider.SubProviderEntry(LootTableTest::new, LootContextParamSets.CHEST))
        );
    }
}
