package net.redchujelly.cluttered.loot;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.redchujelly.cluttered.Cluttered;
import net.redchujelly.cluttered.blocks.BlockRegistration;
import org.intellij.lang.annotations.Identifier;

import java.util.List;

public class ClutteredGlobalLootModifiers extends GlobalLootModifierProvider {
    public ClutteredGlobalLootModifiers(PackOutput output) {
        super(output, Cluttered.MOD_ID);
    }


    private List<Item> SAPLING_LIST = List.of(
            BlockRegistration.WILLOW_SAPLING.get().asItem(),
            BlockRegistration.POPLAR_SAPLING.get().asItem(),
            BlockRegistration.CRABAPPLE_SAPLING.get().asItem(),
            BlockRegistration.SYCAMORE_SAPLING.get().asItem(),
            BlockRegistration.MAPLE_SAPLING.get().asItem(),
            BlockRegistration.BLUE_MUSHROOM_SAPLING.get().asItem(),
            BlockRegistration.RED_MUSHROOM_SAPLING.get().asItem()
    );

    @Override
    protected void start() {
        add("sapling_loot_to_dungeon_chest", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/simple_dungeon")).build()},
                SAPLING_LIST, 0.18f, 4));
        
        add("sapling_loot_to_bonus_chest", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/spawn_bonus_chest")).build()},
                SAPLING_LIST, 0.15f, 2));

        add("sapling_loot_to_village_plains_chest", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/village/village_plains_house")).build()},
                SAPLING_LIST, 0.12f, 3));

        add("sapling_loot_to_village_taiga_chest", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/village/village_taiga_house")).build()},
                SAPLING_LIST, 0.12f, 3));

        add("sapling_loot_to_village_savanna_chest", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/village/village_savanna_house")).build()},
                SAPLING_LIST, 0.12f, 3));

        add("sapling_loot_to_village_desert_chest", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/village/village_desert_house")).build()},
                SAPLING_LIST, 0.10f, 3));

        add("sapling_loot_to_village_snowy_chest", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/village/village_snowy_house")).build()},
                SAPLING_LIST, 0.10f, 3));

        add("sapling_loot_to_abandoned_mineshaft", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/abandoned_mineshaft")).build()},
                SAPLING_LIST, 0.09f, 3));

        add("sapling_loot_to_shipwreck_supply", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/shipwreck_supply")).build()},
                SAPLING_LIST, 0.09f, 3));
    }
}

