package net.redchujelly.cluttered.datagen.loot;

import net.minecraft.data.loot.packs.VanillaChestLoot;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.redchujelly.cluttered.Cluttered;
import net.redchujelly.cluttered.setup.BlockRegistration;

import java.util.function.BiConsumer;

public class LootTableTest extends VanillaChestLoot {
    private static final ResourceLocation SAPLING_CHEST_LOOT =
            new ResourceLocation(Cluttered.MODID, "chests/sapling_chest_loot");

    @Override
    public void generate(BiConsumer<ResourceLocation, LootTable.Builder> pBuilder) {
        pBuilder.accept(SAPLING_CHEST_LOOT, LootTable.lootTable().withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                .add(LootItem.lootTableItem(BlockRegistration.WILLOW_SAPLING.get()).setWeight(1)).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 5.0F)))
                .add(LootItem.lootTableItem(BlockRegistration.POPLAR_SAPLING.get()).setWeight(1)).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 5.0F)))
                .add(LootItem.lootTableItem(BlockRegistration.BLUE_MUSHROOM_SAPLING.get()).setWeight(1)).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 5.0F)))
                .add(LootItem.lootTableItem(BlockRegistration.RED_MUSHROOM_SAPLING.get()).setWeight(1)).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 5.0F)))
        ));
                //.add(LootItem.lootTableItem(Items.ENCHANTED_GOLDEN_APPLE))
                //.add(LootItem.lootTableItem(Items.NAME_TAG).setWeight(30))
                //.add(LootItem.lootTableItem(Items.BOOK).setWeight(10).apply(EnchantRandomlyFunction.randomApplicableEnchantment()))
                //.add(LootItem.lootTableItem(Items.IRON_PICKAXE).setWeight(5))
                //.add(EmptyLootItem.emptyItem().setWeight(5))).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(2.0F, 4.0F))
                //.add(LootItem.lootTableItem(Items.IRON_INGOT).setWeight(10).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 5.0F))))
                //.add(LootItem.lootTableItem(Items.GOLD_INGOT).setWeight(5).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                //.add(LootItem.lootTableItem(Items.REDSTONE).setWeight(5).apply(SetItemCountFunction.setCount(UniformGenerator.between(4.0F, 9.0F))))
                //.add(LootItem.lootTableItem(Items.LAPIS_LAZULI).setWeight(5).apply(SetItemCountFunction.setCount(UniformGenerator.between(4.0F, 9.0F))))
                //.add(LootItem.lootTableItem(Items.DIAMOND).setWeight(3).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F))))
                //.add(LootItem.lootTableItem(Items.COAL).setWeight(10).apply(SetItemCountFunction.setCount(UniformGenerator.between(3.0F, 8.0F))))
                //.add(LootItem.lootTableItem(Items.BREAD).setWeight(15).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                //.add(LootItem.lootTableItem(Items.GLOW_BERRIES).setWeight(15).apply(SetItemCountFunction.setCount(UniformGenerator.between(3.0F, 6.0F))))
                //.add(LootItem.lootTableItem(Items.MELON_SEEDS).setWeight(10).apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 4.0F))))
                //.add(LootItem.lootTableItem(Items.PUMPKIN_SEEDS).setWeight(10).apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 4.0F))))
                //.add(LootItem.lootTableItem(Items.BEETROOT_SEEDS).setWeight(10).apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 4.0F))))).withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(3.0F))
                //.add(LootItem.lootTableItem(Blocks.RAIL).setWeight(20).apply(SetItemCountFunction.setCount(UniformGenerator.between(4.0F, 8.0F))))
                //.add(LootItem.lootTableItem(Blocks.POWERED_RAIL).setWeight(5).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 4.0F))))
                //.add(LootItem.lootTableItem(Blocks.DETECTOR_RAIL).setWeight(5).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 4.0F))))
                //.add(LootItem.lootTableItem(Blocks.ACTIVATOR_RAIL).setWeight(5).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 4.0F))))
                //.add(LootItem.lootTableItem(Blocks.TORCH).setWeight(15).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 16.0F))))));
    }
}
