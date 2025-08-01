package net.redchujelly.cluttered.datagen.loot;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.redchujelly.cluttered.Cluttered;
import net.redchujelly.cluttered.setup.BlockRegistration;

import java.util.List;

public class ClutteredGlobalLootModifiers extends GlobalLootModifierProvider {
    public ClutteredGlobalLootModifiers(PackOutput output) {
        super(output, Cluttered.MODID);
    }

    @Override
    protected void start() {
        add("sapling_loot_to_dungeon_chest", new AddItemModifier(new LootItemCondition[]{

                new LootTableIdCondition.Builder(new ResourceLocation("chests/simple_dungeon")).build()},
                List.of(BlockRegistration.WILLOW_SAPLING.get().asItem(),
                        BlockRegistration.POPLAR_SAPLING.get().asItem(),
                        BlockRegistration.BLUE_MUSHROOM_SAPLING.get().asItem(),
                        BlockRegistration.RED_MUSHROOM_SAPLING.get().asItem()
                ), 0.1f, 4));
        add("sapling_loot_to_bonus_chest", new AddItemModifier(new LootItemCondition[]{

                new LootTableIdCondition.Builder(new ResourceLocation("chests/spawn_bonus_chest")).build()},
                List.of(BlockRegistration.WILLOW_SAPLING.get().asItem(),
                        BlockRegistration.POPLAR_SAPLING.get().asItem(),
                        BlockRegistration.BLUE_MUSHROOM_SAPLING.get().asItem(),
                        BlockRegistration.RED_MUSHROOM_SAPLING.get().asItem()
                ), 0.15f, 2));
        add("sapling_loot_to_village_plains_chest", new AddItemModifier(new LootItemCondition[]{

                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_plains_house")).build()},
                List.of(BlockRegistration.WILLOW_SAPLING.get().asItem(),
                        BlockRegistration.POPLAR_SAPLING.get().asItem(),
                        BlockRegistration.BLUE_MUSHROOM_SAPLING.get().asItem(),
                        BlockRegistration.RED_MUSHROOM_SAPLING.get().asItem()
                ), 0.10f, 3));
    }
}

