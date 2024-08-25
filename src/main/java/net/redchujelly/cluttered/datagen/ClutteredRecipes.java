package net.redchujelly.cluttered.datagen;

import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.ForgeRegistries;
import net.redchujelly.cluttered.Cluttered;

import java.util.function.Consumer;

public class ClutteredRecipes extends RecipeProvider {
    public ClutteredRecipes(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        buildWoodsetRecipes("willow", consumer);
        buildWoodsetRecipes("flowering_willow", consumer);
        buildWoodsetRecipes("poplar", consumer);
    }

    private void buildWoodsetRecipes(String woodType, Consumer<FinishedRecipe> consumer) {

        Block log = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_log"));
        Block wood = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_wood"));
        Block strippedLog = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + "stripped_" + woodType + "_log"));
        Block strippedWood = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + "stripped_" + woodType + "_wood"));
        Block planks = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_planks"));
        Block stairs = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_stairs"));
        Block slab = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_slab"));
        Block fence = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_fence"));
        Block fenceGate = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_fence_gate"));
        Block button = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_button"));
        Block pressurePlate = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_pressure_plate"));
        Block door = null;
        if (ForgeRegistries.BLOCKS.containsKey(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_door"))) {
            door = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_door"));
        }
        Block trapdoor = null;
        if (ForgeRegistries.BLOCKS.containsKey(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_trapdoor"))) {
            trapdoor = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_trapdoor"));
        }
        Block window = null;
        if (ForgeRegistries.BLOCKS.containsKey(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_window"))) {
            window = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_window"));
        }
        Block bookshelf = null;
        if (ForgeRegistries.BLOCKS.containsKey(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_bookshelf"))) {
            bookshelf = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_bookshelf"));
        }



        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, planks, 4)
                .requires(ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation( woodType + "_log"))).getKey())
                .unlockedBy("has_" + woodType + "_log", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(log).build()))
                .save(consumer);

        //TODO These next 3 should be handled with a woodType + "_log" tag in the future
        //ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, planks, 4)
        //        .requires(wood)
        //        .unlockedBy("has_" + woodType + "_log", InventoryChangeTrigger.TriggerInstance.hasItems(
        //                ItemPredicate.Builder.item().of(log).build()))
        //        .save(consumer);
        //ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, planks, 4)
        //        .requires(strippedLog)
        //        .unlockedBy("has_" + woodType + "_log", InventoryChangeTrigger.TriggerInstance.hasItems(
        //                ItemPredicate.Builder.item().of(log).build()))
        //        .save(consumer);
        //ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, planks, 4)
        //        .requires(strippedWood)
        //        .unlockedBy("has_" + woodType + "_log", InventoryChangeTrigger.TriggerInstance.hasItems(
        //                ItemPredicate.Builder.item().of(log).build()))
        //        .save(consumer);


        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, wood, 3)
                .pattern("ll")
                .pattern("ll")
                .define('l', log)
                .unlockedBy("has_" + woodType + "_log", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(log).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, stairs, 4)
                .pattern("p  ")
                .pattern("pp ")
                .pattern("ppp")
                .define('p', planks)
                .unlockedBy("has_" + woodType + "_planks", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(planks).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, slab, 6)
                .pattern("ppp")
                .define('p', planks)
                .unlockedBy("has_" + woodType + "_planks", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(planks).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, fence, 3)
                .pattern("psp")
                .pattern("psp")
                .define('p', planks)
                .define('s', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_" + woodType + "_planks", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(planks).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, fenceGate)
                .pattern("sps")
                .pattern("sps")
                .define('p', planks)
                .define('s', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_" + woodType + "_planks", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(planks).build()))
                .showNotification(false)
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, button)
                .requires(planks)
                .unlockedBy("has_" + woodType + "_planks", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(planks).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, pressurePlate)
                .pattern("pp")
                .define('p', planks)
                .unlockedBy("has_" + woodType + "_planks", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(planks).build()))
                .showNotification(false)
                .save(consumer);

        if (door !=  null) {
            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, door)
                    .pattern("pp")
                    .pattern("pp")
                    .pattern("pp")
                    .define('p', planks)
                    .unlockedBy("has_" + woodType + "_planks", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(planks).build()))
                    .showNotification(false)
                    .save(consumer);
        }

        if (trapdoor != null) {
            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, trapdoor)
                    .pattern("ppp")
                    .pattern("ppp")
                    .define('p', planks)
                    .unlockedBy("has_" + woodType + "_planks", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(planks).build()))
                    .showNotification(false)
                    .save(consumer);
        }

        if (window != null) {
            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, window, 4)
                    .pattern("ppp")
                    .pattern("ggg")
                    .pattern("ppp")
                    .define('p', planks)
                    .define('g', Blocks.GLASS.asItem())
                    .unlockedBy("has_" + woodType + "_planks", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(planks).build()))
                    .showNotification(false)
                    .save(consumer);
        }

        if (bookshelf != null) {
            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, bookshelf)
                    .pattern("ppp")
                    .pattern("bbb")
                    .pattern("ppp")
                    .define('p', planks)
                    .define('b', Items.BOOK)
                    .unlockedBy("has_" + woodType + "_planks", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(planks).build()))
                    .showNotification(false)
                    .save(consumer);
        }
    }

}
