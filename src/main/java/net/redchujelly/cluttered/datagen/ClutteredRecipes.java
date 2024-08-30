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
import net.minecraftforge.registries.RegistryObject;
import net.redchujelly.cluttered.Cluttered;
import net.redchujelly.cluttered.setup.BlockRegistration;

import java.util.ArrayList;
import java.util.List;
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
        buildWoodsetRecipes("flowering_poplar", consumer);
        buildWoodsetRecipes("crabapple", consumer);
        buildWoodsetRecipes("flowering_crabapple", consumer);
        buildWoodsetRecipes("sycamore", consumer);
        buildWoodsetRecipes("fluorescent_maple", consumer);
        buildWoodsetRecipes("blue_mushroom", consumer);
        buildWoodsetRecipes("red_mushroom", consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.WILLOW_GARDEN_DOOR.get(), 3)
                .pattern("pb")
                .pattern("pb")
                .pattern("pb")
                .define('b', Blocks.IRON_BARS)
                .define('p', BlockRegistration.WILLOW_PLANKS.get())
                .unlockedBy("has_willow_planks", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.WILLOW_PLANKS.get()).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.WILLOW_LOG_DOOR.get(), 3)
                .pattern("pb")
                .pattern("pp")
                .pattern("pb")
                .define('b', ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation( "willow_log"))).getKey())
                .define('p', BlockRegistration.WILLOW_PLANKS.get())
                .unlockedBy("has_willow_planks", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.WILLOW_PLANKS.get()).build()))
                .showNotification(false)
                .save(consumer);


        //CHALCEDONY RECIPES

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.CHALCEDONY.get(), 8)
                .pattern("qaq")
                .pattern("aqa")
                .pattern("qaq")
                .define('q', Items.QUARTZ)
                .define('a', Items.AMETHYST_SHARD)
                .unlockedBy("has_amethyst", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.AMETHYST_SHARD).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.CHALCEDONY_STAIRS.get(), 4)
                .pattern("r  ")
                .pattern("rr ")
                .pattern("rrr")
                .define('r', BlockRegistration.CHALCEDONY.get())
                .unlockedBy("has_raw_chalcedony", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.CHALCEDONY.get()).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.CHALCEDONY_SLAB.get(), 6)
                .pattern("rrr")
                .define('r', BlockRegistration.CHALCEDONY.get())
                .unlockedBy("has_raw_chalcedony", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.CHALCEDONY.get()).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.POLISHED_CHALCEDONY.get(), 4)
                .pattern("rr")
                .pattern("rr")
                .define('r', BlockRegistration.CHALCEDONY.get())
                .unlockedBy("has_raw_chalcedony", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.CHALCEDONY.get()).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.CHALCEDONY_BRICKS.get(), 4)
                .pattern("pp")
                .pattern("pp")
                .define('p', BlockRegistration.POLISHED_CHALCEDONY.get())
                .unlockedBy("has_polished_chalcedony", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.POLISHED_CHALCEDONY.get()).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.CHALCEDONY_BRICK_STAIRS.get(), 4)
                .pattern("b  ")
                .pattern("bb ")
                .pattern("bbb")
                .define('b', BlockRegistration.CHALCEDONY_BRICKS.get())
                .unlockedBy("has_chalcedony_bricks", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.CHALCEDONY_BRICKS.get()).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.CHALCEDONY_BRICK_SLAB.get(), 6)
                .pattern("bbb")
                .define('b', BlockRegistration.CHALCEDONY_BRICKS.get())
                .unlockedBy("has_chalcedony_bricks", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.CHALCEDONY_BRICKS.get()).build()))
                .showNotification(false)
                .save(consumer);

        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.CHALCEDONY_SLAB.get().asItem(),BlockRegistration.CHALCEDONY.get().asItem(), 2);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.CHALCEDONY_BRICK_SLAB.get().asItem(),BlockRegistration.CHALCEDONY.get().asItem(), 2);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.CHALCEDONY_SLAB.get().asItem(),BlockRegistration.POLISHED_CHALCEDONY.get().asItem(), 2);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.CHALCEDONY_BRICK_SLAB.get().asItem(),BlockRegistration.POLISHED_CHALCEDONY.get().asItem(), 2);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.CHALCEDONY_BRICK_SLAB.get().asItem(),BlockRegistration.CHALCEDONY_BRICKS.get().asItem(), 2);

        ArrayList<RegistryObject<Block>> chalcedonyResults = new ArrayList<>();
        chalcedonyResults.add(BlockRegistration.CHALCEDONY_STAIRS);
        chalcedonyResults.add(BlockRegistration.POLISHED_CHALCEDONY);
        chalcedonyResults.add(BlockRegistration.CHISELED_CHALCEDONY);
        chalcedonyResults.add(BlockRegistration.CHALCEDONY_BORDER);
        chalcedonyResults.add(BlockRegistration.CHALCEDONY_ACANTHUS);
        chalcedonyResults.add(BlockRegistration.CHALCEDONY_HELIX);
        chalcedonyResults.add(BlockRegistration.CHALCEDONY_BRICKS);
        chalcedonyResults.add(BlockRegistration.CHALCEDONY_BRICK_STAIRS);
        chalcedonyResults.add(BlockRegistration.CHALCEDONY_PILLAR_BASE);
        chalcedonyResults.add(BlockRegistration.CHALCEDONY_PILLAR);
        chalcedonyResults.add(BlockRegistration.CHALCEDONY_PILLAR_DORIC);
        chalcedonyResults.add(BlockRegistration.CHALCEDONY_PILLAR_IONIC);
        chalcedonyResults.add(BlockRegistration.CHALCEDONY_TILES);
        chalcedonyResults.add(BlockRegistration.CHALCEDONY_SMALL_TILES);
        buildStoneCutterRecipesForBase(consumer, BlockRegistration.CHALCEDONY.get(), chalcedonyResults);

        chalcedonyResults.remove(BlockRegistration.POLISHED_CHALCEDONY);

        buildStoneCutterRecipesForBase(consumer, BlockRegistration.POLISHED_CHALCEDONY.get(), chalcedonyResults);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.CHALCEDONY_BRICK_STAIRS.get().asItem(),BlockRegistration.CHALCEDONY_BRICKS.get().asItem());
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.CHALCEDONY_SMALL_TILES.get().asItem(),BlockRegistration.CHALCEDONY_TILES.get().asItem());

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.STARRY_CHISELED_CHALCEDONY.get(), 8)
                .pattern("bbb")
                .pattern("bgb")
                .pattern("bbb")
                .define('b', BlockRegistration.POLISHED_CHALCEDONY.get())
                .define('g', Items.GLOWSTONE_DUST)
                .unlockedBy("has_chalcedony_bricks", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.POLISHED_CHALCEDONY.get()).build()))
                .showNotification(false)
                .save(consumer);

        ArrayList<RegistryObject<Block>> starryChalcedonyResults = new ArrayList<>();
        starryChalcedonyResults.add(BlockRegistration.STARRY_CHALCEDONY_PILLAR);
        starryChalcedonyResults.add(BlockRegistration.STARRY_CHALCEDONY_PILLAR_BASE);
        starryChalcedonyResults.add(BlockRegistration.STARRY_CHALCEDONY_PILLAR_DORIC);
        starryChalcedonyResults.add(BlockRegistration.STARRY_CHALCEDONY_PILLAR_IONIC);
        buildStoneCutterRecipesForBase(consumer, BlockRegistration.STARRY_CHISELED_CHALCEDONY.get(), starryChalcedonyResults);

        //DEEP DEEP_CHALCEDONY RECIPES
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DEEP_CHALCEDONY.get(), 8)
                .pattern("qaq")
                .pattern("ala")
                .pattern("qaq")
                .define('l', Items.LAPIS_LAZULI)
                .define('q', Items.QUARTZ)
                .define('a', Items.AMETHYST_SHARD)
                .unlockedBy("has_amethyst", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.AMETHYST_SHARD).build()))
                .showNotification(false)
                .save(consumer);


        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DEEP_CHALCEDONY_STAIRS.get(), 4)
                .pattern("r  ")
                .pattern("rr ")
                .pattern("rrr")
                .define('r', BlockRegistration.DEEP_CHALCEDONY.get())
                .unlockedBy("has_raw_deep_chalcedony", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.DEEP_CHALCEDONY.get()).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DEEP_CHALCEDONY_SLAB.get(), 6)
                .pattern("rrr")
                .define('r', BlockRegistration.DEEP_CHALCEDONY.get())
                .unlockedBy("has_raw_deep_chalcedony", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.DEEP_CHALCEDONY.get()).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DEEP_POLISHED_CHALCEDONY.get(), 4)
                .pattern("rr")
                .pattern("rr")
                .define('r', BlockRegistration.DEEP_CHALCEDONY.get())
                .unlockedBy("has_raw_deep_chalcedony", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.DEEP_CHALCEDONY.get()).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DEEP_CHALCEDONY_BRICKS.get(), 4)
                .pattern("pp")
                .pattern("pp")
                .define('p', BlockRegistration.DEEP_POLISHED_CHALCEDONY.get())
                .unlockedBy("has_deep_polished_chalcedony", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.DEEP_POLISHED_CHALCEDONY.get()).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DEEP_CHALCEDONY_BRICK_STAIRS.get(), 4)
                .pattern("b  ")
                .pattern("bb ")
                .pattern("bbb")
                .define('b', BlockRegistration.DEEP_CHALCEDONY_BRICKS.get())
                .unlockedBy("has_deep_chalcedony_bricks", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.DEEP_CHALCEDONY_BRICKS.get()).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DEEP_CHALCEDONY_BRICK_SLAB.get(), 6)
                .pattern("bbb")
                .define('b', BlockRegistration.DEEP_CHALCEDONY_BRICKS.get())
                .unlockedBy("has_deep_chalcedony_bricks", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.DEEP_CHALCEDONY_BRICKS.get()).build()))
                .showNotification(false)
                .save(consumer);

        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DEEP_CHALCEDONY_SLAB.get().asItem(),BlockRegistration.DEEP_CHALCEDONY.get().asItem(), 2);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DEEP_CHALCEDONY_BRICK_SLAB.get().asItem(),BlockRegistration.DEEP_CHALCEDONY.get().asItem(), 2);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DEEP_CHALCEDONY_SLAB.get().asItem(),BlockRegistration.DEEP_POLISHED_CHALCEDONY.get().asItem(), 2);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DEEP_CHALCEDONY_BRICK_SLAB.get().asItem(),BlockRegistration.DEEP_POLISHED_CHALCEDONY.get().asItem(), 2);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DEEP_CHALCEDONY_BRICK_SLAB.get().asItem(),BlockRegistration.DEEP_CHALCEDONY_BRICKS.get().asItem(), 2);

        ArrayList<RegistryObject<Block>> deepChalcedonyresults = new ArrayList<>();
        deepChalcedonyresults.add(BlockRegistration.DEEP_CHALCEDONY_STAIRS);
        deepChalcedonyresults.add(BlockRegistration.DEEP_POLISHED_CHALCEDONY);
        deepChalcedonyresults.add(BlockRegistration.DEEP_CHISELED_CHALCEDONY);
        deepChalcedonyresults.add(BlockRegistration.DEEP_CHALCEDONY_BORDER);
        deepChalcedonyresults.add(BlockRegistration.DEEP_CHALCEDONY_ACANTHUS);
        deepChalcedonyresults.add(BlockRegistration.DEEP_CHALCEDONY_HELIX);
        deepChalcedonyresults.add(BlockRegistration.DEEP_CHALCEDONY_BRICKS);
        deepChalcedonyresults.add(BlockRegistration.DEEP_CHALCEDONY_BRICK_STAIRS);
        deepChalcedonyresults.add(BlockRegistration.DEEP_CHALCEDONY_PILLAR_BASE);
        deepChalcedonyresults.add(BlockRegistration.DEEP_CHALCEDONY_PILLAR);
        deepChalcedonyresults.add(BlockRegistration.DEEP_CHALCEDONY_PILLAR_DORIC);
        deepChalcedonyresults.add(BlockRegistration.DEEP_CHALCEDONY_PILLAR_IONIC);
        deepChalcedonyresults.add(BlockRegistration.DEEP_CHALCEDONY_TILES);
        deepChalcedonyresults.add(BlockRegistration.DEEP_CHALCEDONY_SMALL_TILES);
        buildStoneCutterRecipesForBase(consumer, BlockRegistration.DEEP_CHALCEDONY.get(), deepChalcedonyresults);

        deepChalcedonyresults.remove(BlockRegistration.DEEP_POLISHED_CHALCEDONY);

        buildStoneCutterRecipesForBase(consumer, BlockRegistration.DEEP_POLISHED_CHALCEDONY.get(), deepChalcedonyresults);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DEEP_CHALCEDONY_BRICK_STAIRS.get().asItem(),BlockRegistration.DEEP_CHALCEDONY_BRICKS.get().asItem());
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DEEP_CHALCEDONY_SMALL_TILES.get().asItem(),BlockRegistration.DEEP_CHALCEDONY_TILES.get().asItem());

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DEEP_STARRY_CHISELED_CHALCEDONY.get(), 8)
                .pattern("bbb")
                .pattern("bgb")
                .pattern("bbb")
                .define('b', BlockRegistration.DEEP_POLISHED_CHALCEDONY.get())
                .define('g', Items.GLOWSTONE_DUST)
                .unlockedBy("has_chalcedony_bricks", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.DEEP_POLISHED_CHALCEDONY.get()).build()))
                .showNotification(false)
                .save(consumer);

        ArrayList<RegistryObject<Block>> starryDeepChalcedonyResults = new ArrayList<>();
        starryDeepChalcedonyResults.add(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR);
        starryDeepChalcedonyResults.add(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_BASE);
        starryDeepChalcedonyResults.add(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_DORIC);
        starryDeepChalcedonyResults.add(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_IONIC);
        buildStoneCutterRecipesForBase(consumer, BlockRegistration.DEEP_STARRY_CHISELED_CHALCEDONY.get(), starryDeepChalcedonyResults);


        //MARBLE RECIPES

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.MARBLE.get(), 8)
                .pattern("qaq")
                .pattern("aqa")
                .pattern("qaq")
                .define('q', Items.QUARTZ)
                .define('a', Blocks.CALCITE)
                .unlockedBy("has_calcite", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Blocks.CALCITE).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.MARBLE_STAIRS.get(), 4)
                .pattern("r  ")
                .pattern("rr ")
                .pattern("rrr")
                .define('r', BlockRegistration.MARBLE.get())
                .unlockedBy("has_raw_marble", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.MARBLE.get()).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.MARBLE_SLAB.get(), 6)
                .pattern("rrr")
                .define('r', BlockRegistration.MARBLE.get())
                .unlockedBy("has_raw_marble", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.MARBLE.get()).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.POLISHED_MARBLE.get(), 4)
                .pattern("rr")
                .pattern("rr")
                .define('r', BlockRegistration.MARBLE.get())
                .unlockedBy("has_raw_marble", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.MARBLE.get()).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.MARBLE_BRICKS.get(), 4)
                .pattern("pp")
                .pattern("pp")
                .define('p', BlockRegistration.POLISHED_MARBLE.get())
                .unlockedBy("has_polished_marble", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.POLISHED_MARBLE.get()).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.MARBLE_BRICK_STAIRS.get(), 4)
                .pattern("b  ")
                .pattern("bb ")
                .pattern("bbb")
                .define('b', BlockRegistration.MARBLE_BRICKS.get())
                .unlockedBy("has_marble_bricks", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.MARBLE_BRICKS.get()).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.MARBLE_BRICK_SLAB.get(), 6)
                .pattern("bbb")
                .define('b', BlockRegistration.MARBLE_BRICKS.get())
                .unlockedBy("has_marble_bricks", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.MARBLE_BRICKS.get()).build()))
                .showNotification(false)
                .save(consumer);

        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.MARBLE_SLAB.get().asItem(),BlockRegistration.MARBLE.get().asItem(), 2);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.MARBLE_BRICK_SLAB.get().asItem(),BlockRegistration.MARBLE.get().asItem(), 2);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.MARBLE_SLAB.get().asItem(),BlockRegistration.POLISHED_MARBLE.get().asItem(), 2);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.MARBLE_BRICK_SLAB.get().asItem(),BlockRegistration.POLISHED_MARBLE.get().asItem(), 2);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.MARBLE_BRICK_SLAB.get().asItem(),BlockRegistration.MARBLE_BRICKS.get().asItem(), 2);

        ArrayList<RegistryObject<Block>> marbleresults = new ArrayList<>();
        marbleresults.add(BlockRegistration.MARBLE_STAIRS);
        marbleresults.add(BlockRegistration.POLISHED_MARBLE);
        marbleresults.add(BlockRegistration.CHISELED_MARBLE);
        marbleresults.add(BlockRegistration.MARBLE_BORDER);
        marbleresults.add(BlockRegistration.MARBLE_ACANTHUS);
        marbleresults.add(BlockRegistration.MARBLE_HELIX);
        marbleresults.add(BlockRegistration.MARBLE_BRICKS);
        marbleresults.add(BlockRegistration.MARBLE_BRICK_STAIRS);
        marbleresults.add(BlockRegistration.MARBLE_PILLAR_BASE);
        marbleresults.add(BlockRegistration.MARBLE_PILLAR);
        marbleresults.add(BlockRegistration.MARBLE_PILLAR_DORIC);
        marbleresults.add(BlockRegistration.MARBLE_PILLAR_IONIC);
        marbleresults.add(BlockRegistration.MARBLE_TILES);
        marbleresults.add(BlockRegistration.MARBLE_SMALL_TILES);
        buildStoneCutterRecipesForBase(consumer, BlockRegistration.MARBLE.get(), marbleresults);

        marbleresults.remove(BlockRegistration.POLISHED_MARBLE);

        buildStoneCutterRecipesForBase(consumer, BlockRegistration.POLISHED_MARBLE.get(), marbleresults);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.MARBLE_BRICK_STAIRS.get().asItem(),BlockRegistration.MARBLE_BRICKS.get().asItem());
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.MARBLE_SMALL_TILES.get().asItem(),BlockRegistration.MARBLE_TILES.get().asItem());

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.STARRY_CHISELED_MARBLE.get(), 8)
                .pattern("bbb")
                .pattern("bgb")
                .pattern("bbb")
                .define('b', BlockRegistration.POLISHED_MARBLE.get())
                .define('g', Items.GLOWSTONE_DUST)
                .unlockedBy("has_marble_bricks", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.POLISHED_MARBLE.get()).build()))
                .showNotification(false)
                .save(consumer);


        //MISC FULL BLOCKS
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.BLACK_CAT_WINDOW_PANE.get(), 16)
                .pattern("bbb")
                .pattern("bbb")
                .define('b', BlockRegistration.BLACK_CAT_WINDOW.get())
                .unlockedBy("has_black_cat_window", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.BLACK_CAT_WINDOW.get()).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.BLACK_CAT_WINDOW.get(), 8)
                .pattern("b b")
                .pattern("gbg")
                .pattern("bbb")
                .define('b', Blocks.BLACK_CONCRETE)
                .define('g', Blocks.GLASS)
                .unlockedBy("has_black_concrete", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Blocks.BLACK_CONCRETE).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.YELLOW_PLANTER.get())
                .pattern("wdw")
                .pattern("wbw")
                .pattern("wbw")
                .define('b', Blocks.BONE_BLOCK)
                .define('d', Blocks.DIRT)
                .define('w', BlockRegistration.POPLAR_PLANKS.get())
                .unlockedBy("has_bone_block", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Blocks.BONE_BLOCK).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.PINK_PLANTER.get())
                .pattern("wdw")
                .pattern("wbw")
                .pattern("wbw")
                .define('b', Blocks.BONE_BLOCK)
                .define('d', Blocks.DIRT)
                .define('w', BlockRegistration.CRABAPPLE_PLANKS.get())
                .unlockedBy("has_bone_block", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Blocks.BONE_BLOCK).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.PURPLE_PLANTER.get())
                .pattern("wdw")
                .pattern("wbw")
                .pattern("wbw")
                .define('b', Blocks.BONE_BLOCK)
                .define('d', Blocks.DIRT)
                .define('w', BlockRegistration.WILLOW_PLANKS.get())
                .unlockedBy("has_bone_block", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Blocks.BONE_BLOCK).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.GREEN_PLANTER.get())
                .pattern("wdw")
                .pattern("wbw")
                .pattern("wbw")
                .define('b', Blocks.BONE_BLOCK)
                .define('d', Blocks.DIRT)
                .define('w', BlockRegistration.SYCAMORE_PLANKS.get())
                .unlockedBy("has_bone_block", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Blocks.BONE_BLOCK).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.FLUORESCENT_PLANTER.get())
                .pattern("wdw")
                .pattern("wbw")
                .pattern("wbw")
                .define('b', Blocks.BONE_BLOCK)
                .define('d', Blocks.DIRT)
                .define('w', BlockRegistration.MAPLE_PLANKS.get())
                .unlockedBy("has_bone_block", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Blocks.BONE_BLOCK).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.RED_PLANTER.get())
                .pattern("wdw")
                .pattern("wbw")
                .pattern("wbw")
                .define('b', Blocks.BONE_BLOCK)
                .define('d', Blocks.DIRT)
                .define('w', BlockRegistration.RED_MUSHROOM_PLANKS.get())
                .unlockedBy("has_bone_block", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Blocks.BONE_BLOCK).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.BLUE_PLANTER.get())
                .pattern("wdw")
                .pattern("wbw")
                .pattern("wbw")
                .define('b', Blocks.BONE_BLOCK)
                .define('d', Blocks.DIRT)
                .define('w', BlockRegistration.BLUE_MUSHROOM_PLANKS.get())
                .unlockedBy("has_bone_block", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Blocks.BONE_BLOCK).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.BEIGE_PLANTER.get())
                .pattern("wdw")
                .pattern("wbw")
                .pattern("wbw")
                .define('b', Blocks.BONE_BLOCK)
                .define('d', Blocks.DIRT)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_bone_block", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Blocks.BONE_BLOCK).build()))
                .showNotification(false)
                .save(consumer);


    }

    private void buildStoneCutterRecipesForBase(Consumer<FinishedRecipe> consumer, Block base, List<RegistryObject<Block>> results) {
        for (RegistryObject<Block> result : results) {
            stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, result.get().asItem(), base.asItem());
        }
    }

    private void buildWoodsetRecipes(String woodType, Consumer<FinishedRecipe> consumer) {

        Block log = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_log"));
        Block wood = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_wood"));
        //Dont need these for now
        //Block strippedLog = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + "stripped_" + woodType + "_log"));
        //Block strippedWood = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + "stripped_" + woodType + "_wood"));
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
        Block pane = null;
        if (ForgeRegistries.BLOCKS.containsKey(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_window"))) {
            window = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_window"));
            pane = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_window_pane"));
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
            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, door, 3)
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
            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, trapdoor, 2)
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
            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, pane, 16)
                    .pattern("ggg")
                    .pattern("ggg")
                    .define('g', window.asItem())
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
