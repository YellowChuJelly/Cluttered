package net.redchujelly.cluttered.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.redchujelly.cluttered.blocks.BlockRegistration;

import java.util.List;


public class ClutteredLootTableModifiers {

    private static final List<Item> SAPLING_LIST = List.of(
            BlockRegistration.WILLOW_SAPLING.get().asItem(),
            BlockRegistration.POPLAR_SAPLING.get().asItem(),
            BlockRegistration.CRABAPPLE_SAPLING.get().asItem(),
            BlockRegistration.SYCAMORE_SAPLING.get().asItem(),
            BlockRegistration.MAPLE_SAPLING.get().asItem(),
            BlockRegistration.BLUE_MUSHROOM_SAPLING.get().asItem(),
            BlockRegistration.RED_MUSHROOM_SAPLING.get().asItem()
    );

    private static final List<ResourceLocation> CHEST_LIST = List.of(
     new ResourceLocation("minecraft", "chests/simple_dungeon"),
     new ResourceLocation("chests/spawn_bonus_chest"),
     new ResourceLocation("chests/village/village_plains_house"),
     new ResourceLocation("chests/village/village_taiga_house"),
     new ResourceLocation("chests/village/village_savanna_house"),
     new ResourceLocation("chests/village/village_desert_house"),
     new ResourceLocation("chests/village/village_snowy_house"),
     new ResourceLocation("chests/abandoned_mineshaft"),
     new ResourceLocation("chests/shipwreck_supply")
    );


    public static void modifyLootTables(){
        addSaplings(CHEST_LIST);
    }

    private static void addSaplings(List<ResourceLocation> chests){
        LootTableEvents.MODIFY.register(((resourceManager, lootDataManager, resourceLocation, builder, lootTableSource) -> {
            LootPool.Builder poolBuilder = LootPool.lootPool();

            for (ResourceLocation chest : chests) {
                if (lootTableSource.isBuiltin() && chest.equals(resourceLocation)) {
                    for (Item sapling : SAPLING_LIST) {
                        poolBuilder
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(sapling)
                                        .setWeight(1)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(0f, 6f))))
                        ;
                    }
                }
            }
            builder.pool(poolBuilder.build());

        }));
    }
}
