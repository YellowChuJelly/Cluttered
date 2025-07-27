package net.redchujelly.cluttered.datagen;

import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;
import net.redchujelly.cluttered.Cluttered;
import net.redchujelly.cluttered.setup.BlockRegistration;
import net.redchujelly.cluttered.setup.ItemRegistration;

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

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.WILLOW_BOOKSHELF_VASE.get())
                .pattern("pfp")
                .pattern("bbb")
                .pattern("ppp")
                .define('b', Items.BOOK)
                .define('f', Items.FLOWER_POT)
                .define('p', BlockRegistration.WILLOW_PLANKS.get())
                .unlockedBy("has_willow_planks", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.WILLOW_PLANKS.get()).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.WILLOW_BOOKSHELF_COBWEB.get())
                .pattern("pfp")
                .pattern("bbb")
                .pattern("ppp")
                .define('b', Items.BOOK)
                .define('f', Items.STRING)
                .define('p', BlockRegistration.WILLOW_PLANKS.get())
                .unlockedBy("has_willow_planks", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.WILLOW_PLANKS.get()).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.WILLOW_BOOKSHELF_BOTTLES.get())
                .pattern("pfp")
                .pattern("bbb")
                .pattern("ppp")
                .define('b', Items.BOOK)
                .define('f', Items.GLASS_BOTTLE)
                .define('p', BlockRegistration.WILLOW_PLANKS.get())
                .unlockedBy("has_willow_planks", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.WILLOW_PLANKS.get()).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.WILLOW_BOOKSHELF_BLACK_CAT.get())
                .pattern("pfp")
                .pattern("bbb")
                .pattern("ppp")
                .define('b', Items.BOOK)
                .define('f', Items.BLACK_DYE)
                .define('p', BlockRegistration.WILLOW_PLANKS.get())
                .unlockedBy("has_willow_planks", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.WILLOW_PLANKS.get()).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.WILLOW_BOOKSHELF_CALICO_CAT.get())
                .pattern("pfp")
                .pattern("bbb")
                .pattern("ppp")
                .define('b', Items.BOOK)
                .define('f', Items.WHITE_DYE)
                .define('p', BlockRegistration.WILLOW_PLANKS.get())
                .unlockedBy("has_willow_planks", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.WILLOW_PLANKS.get()).build()))
                .showNotification(false)
                .save(consumer);

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

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.CHALCEDONY_WINDOW_PANE.get(), 16)
                .pattern("bbb")
                .pattern("bbb")
                .define('b', BlockRegistration.CHALCEDONY_WINDOW.get())
                .unlockedBy("has_chalcedony_window", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.CHALCEDONY_WINDOW.get()).build()))
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
        chalcedonyResults.add(BlockRegistration.CHALCEDONY_WINDOW);
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

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DEEP_CHALCEDONY_WINDOW_PANE.get(), 16)
                .pattern("bbb")
                .pattern("bbb")
                .define('b', BlockRegistration.DEEP_CHALCEDONY_WINDOW.get())
                .unlockedBy("has_deep_chalcedony_window", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.DEEP_CHALCEDONY_WINDOW.get()).build()))
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
        deepChalcedonyresults.add(BlockRegistration.DEEP_CHALCEDONY_WINDOW);
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
        marbleresults.add(BlockRegistration.MARBLE_TILE);
        marbleresults.add(BlockRegistration.MARBLE_TILE_CHISELED);
        marbleresults.add(BlockRegistration.MARBLE_TILE_BORDER);
        marbleresults.add(BlockRegistration.MARBLE_TILE_BORDER_CIRCLE);
        marbleresults.add(BlockRegistration.MARBLE_TILE_BORDER_DETAIL);
        marbleresults.add(BlockRegistration.MARBLE_TILE_CORNER);
        marbleresults.add(BlockRegistration.MARBLE_TILE_CORNER_CIRCLE);
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

        //WALLPAPER RECIPES
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.STARRY_WALLPAPER.get(), 8)
                .pattern("pgp")
                .pattern("gpg")
                .pattern("www")
                .define('g', Items.GLOWSTONE_DUST)
                .define('p', Items.PAPER)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PAPER).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DARK_STARRY_WALLPAPER.get(), 8)
                .pattern("pgp")
                .pattern("gig")
                .pattern("www")
                .define('g', Items.GLOWSTONE_DUST)
                .define('p', Items.PAPER)
                .define('w', ItemTags.PLANKS)
                .define('i', Items.BLACK_DYE)
                .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PAPER).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.RETRO_RAINBOW_WALLPAPER.get(), 8)
                .pattern("ppp")
                .pattern("rby")
                .pattern("www")
                .define('r', Items.RED_DYE)
                .define('p', Items.PAPER)
                .define('w', ItemTags.PLANKS)
                .define('b', Items.BLUE_DYE)
                .define('y', Items.YELLOW_DYE)
                .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PAPER).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.APPLE_WALLPAPER.get(), 8)
                .pattern("ppp")
                .pattern("apa")
                .pattern("www")
                .define('a', Items.APPLE)
                .define('p', Items.PAPER)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PAPER).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.BLUE_ROSE_STRIPED_WALLPAPER.get(), 8)
                .pattern("pbp")
                .pattern("prp")
                .pattern("www")
                .define('r', Blocks.ROSE_BUSH)
                .define('b', Items.BLUE_DYE)
                .define('p', Items.PAPER)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PAPER).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.CHECKERED_FRUIT_WALLPAPER.get(), 8)
                .pattern("apm")
                .pattern("pbp")
                .pattern("www")
                .define('a', Items.APPLE)
                .define('b', Items.SWEET_BERRIES)
                .define('m', Items.MELON_SLICE)
                .define('p', Items.PAPER)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PAPER).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.CHECKERED_PINK_WALLPAPER.get(), 8)
                .pattern("dpd")
                .pattern("dpd")
                .pattern("www")
                .define('d', Items.PINK_DYE)
                .define('p', Items.PAPER)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PAPER).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.CHECKERED_GREEN_WALLPAPER.get(), 8)
                .pattern("dpd")
                .pattern("dpd")
                .pattern("www")
                .define('d', Items.GREEN_DYE)
                .define('p', Items.PAPER)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PAPER).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.CHIC_WALLPAPER.get(), 8)
                .pattern("ppp")
                .pattern("vdv")
                .pattern("www")
                .define('v', Blocks.VINE)
                .define('d', Blocks.DANDELION)
                .define('p', Items.PAPER)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PAPER).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.FLORAL_BERRY_WALLPAPER.get(), 8)
                .pattern("ppp")
                .pattern("fpb")
                .pattern("www")
                .define('f', ItemTags.SMALL_FLOWERS)
                .define('b', Items.SWEET_BERRIES)
                .define('p', Items.PAPER)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PAPER).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.FLORAL_BORDER_WALLPAPER.get(), 8)
                .pattern("ppp")
                .pattern("ftf")
                .pattern("www")
                .define('f', ItemTags.SMALL_FLOWERS)
                .define('t', ItemTags.TALL_FLOWERS)
                .define('p', Items.PAPER)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PAPER).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.CONFECTIONARY_WALLPAPER.get(), 8)
                .pattern("ppp")
                .pattern("dbk")
                .pattern("www")
                .define('d', Items.PINK_DYE)
                .define('b', Items.LIGHT_BLUE_DYE)
                .define('k', Items.WHITE_DYE)
                .define('p', Items.PAPER)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PAPER).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.BLUE_WAINSCOTING.get(), 4)
                .pattern("sbs")
                .pattern("www")
                .define('b', Items.LIGHT_BLUE_DYE)
                .define('w', ItemTags.PLANKS)
                .define('s', ItemTags.WOODEN_SLABS)
                .unlockedBy("has_confectionary_wallpaper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.CONFECTIONARY_WALLPAPER.get()).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.GHOST_WALLPAPER.get(), 8)
                .pattern("ppp")
                .pattern("bbb")
                .pattern("www")
                .define('b', Items.BONE)
                .define('p', Items.PAPER)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PAPER).build()))
                .showNotification(false)
                .save(consumer);


        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.GHOST_WALLPAPER_WAINSCOTING.get(), 4)
                .pattern("sbs")
                .pattern("www")
                .define('b', Items.BONE)
                .define('w', ItemTags.PLANKS)
                .define('s', ItemTags.WOODEN_SLABS)
                .unlockedBy("has_ghost_wallpaper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.GHOST_WALLPAPER.get()).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.HALLOWEEN_WALLPAPER.get(), 8)
                .pattern("ppp")
                .pattern("pjp")
                .pattern("www")
                .define('j', Blocks.CARVED_PUMPKIN)
                .define('p', Items.PAPER)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PAPER).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.HALLOWEEN_WAINSCOTING.get(), 4)
                .pattern("sjs")
                .pattern("www")
                .define('j', Blocks.CARVED_PUMPKIN)
                .define('w', ItemTags.PLANKS)
                .define('s', ItemTags.WOODEN_SLABS)
                .unlockedBy("has_halloween_wallpaper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.HALLOWEEN_WALLPAPER.get()).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.MARIGOLD_WALLPAPER.get(), 8)
                .pattern("pdp")
                .pattern("pdp")
                .pattern("www")
                .define('d', Blocks.DANDELION)
                .define('p', Items.PAPER)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PAPER).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.MINT_WALLPAPER.get(), 8)
                .pattern("ppp")
                .pattern("lbk")
                .pattern("www")
                .define('l', Items.LIME_DYE)
                .define('b', Items.BROWN_DYE)
                .define('k', Items.WHITE_DYE)
                .define('p', Items.PAPER)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PAPER).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.BROWN_WAINSCOTING.get(), 4)
                .pattern("sds")
                .pattern("www")
                .define('d', Items.BROWN_DYE)
                .define('w', ItemTags.PLANKS)
                .define('s', ItemTags.WOODEN_SLABS)
                .unlockedBy("has_mint_wallpaper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.MINT_WALLPAPER.get()).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.PINK_STRIPE_WALLPAPER.get(), 8)
                .pattern("dpm")
                .pattern("dpm")
                .pattern("www")
                .define('d', Items.PINK_DYE)
                .define('m', Items.MAGENTA_DYE)
                .define('p', Items.PAPER)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PAPER).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.RIALTO_GOLD_WALLPAPER.get(), 8)
                .pattern("pgp")
                .pattern("gpg")
                .pattern("www")
                .define('g', Items.GOLD_NUGGET)
                .define('p', Items.PAPER)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PAPER).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.STRIPED_FLORAL_WALLPAPER.get(), 8)
                .pattern("ftf")
                .pattern("ppp")
                .pattern("www")
                .define('f', ItemTags.SMALL_FLOWERS)
                .define('t', ItemTags.TALL_FLOWERS)
                .define('p', Items.PAPER)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PAPER).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.FISH_WALLPAPER.get(), 8)
                .pattern("pfp")
                .pattern("pfp")
                .pattern("www")
                .define('f', Items.COD)
                .define('p', Items.PAPER)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PAPER).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DIAMOND_WALLPAPER_APPLE.get(), 8)
                .pattern("psp")
                .pattern("sas")
                .pattern("www")
                .define('a', Items.APPLE)
                .define('s', Items.STICK)
                .define('p', Items.PAPER)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PAPER).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY.get(), 8)
                .pattern("psp")
                .pattern("sbs")
                .pattern("www")
                .define('b', Items.BLACK_DYE)
                .define('s', Items.STICK)
                .define('p', Items.PAPER)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PAPER).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY.get(), 8)
                .pattern("psp")
                .pattern("sbs")
                .pattern("www")
                .define('b', Items.BLUE_DYE)
                .define('s', Items.STICK)
                .define('p', Items.PAPER)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PAPER).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DIAMOND_WALLPAPER_BONES.get(), 8)
                .pattern("psp")
                .pattern("sbs")
                .pattern("www")
                .define('b', Items.BONE)
                .define('s', Items.STICK)
                .define('p', Items.PAPER)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PAPER).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DIAMOND_WALLPAPER_BOUQUET.get(), 8)
                .pattern("psp")
                .pattern("sfs")
                .pattern("www")
                .define('f', ItemTags.FLOWERS)
                .define('s', Items.STICK)
                .define('p', Items.PAPER)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PAPER).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM.get(), 8)
                .pattern("psp")
                .pattern("sms")
                .pattern("www")
                .define('m', Items.BROWN_MUSHROOM)
                .define('s', Items.STICK)
                .define('p', Items.PAPER)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PAPER).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES.get(), 8)
                .pattern("psp")
                .pattern("sgs")
                .pattern("www")
                .define('g', Items.LIME_DYE)
                .define('s', Items.STICK)
                .define('p', Items.PAPER)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PAPER).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DIAMOND_WALLPAPER_LEMON.get(), 8)
                .pattern("psp")
                .pattern("sys")
                .pattern("www")
                .define('y', Items.YELLOW_DYE)
                .define('s', Items.STICK)
                .define('p', Items.PAPER)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PAPER).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DIAMOND_WALLPAPER_ORANGE.get(), 8)
                .pattern("psp")
                .pattern("sos")
                .pattern("www")
                .define('o', Items.ORANGE_DYE)
                .define('s', Items.STICK)
                .define('p', Items.PAPER)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PAPER).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DIAMOND_WALLPAPER_PEAR.get(), 8)
                .pattern("psp")
                .pattern("sgs")
                .pattern("www")
                .define('g', Items.GREEN_DYE)
                .define('s', Items.STICK)
                .define('p', Items.PAPER)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PAPER).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DIAMOND_WALLPAPER_PLUM.get(), 8)
                .pattern("psp")
                .pattern("sms")
                .pattern("www")
                .define('m', Items.MAGENTA_DYE)
                .define('s', Items.STICK)
                .define('p', Items.PAPER)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PAPER).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES.get(), 8)
                .pattern("psp")
                .pattern("sms")
                .pattern("www")
                .define('m', Items.PURPLE_DYE)
                .define('s', Items.STICK)
                .define('p', Items.PAPER)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PAPER).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM.get(), 8)
                .pattern("psp")
                .pattern("sms")
                .pattern("www")
                .define('m', Items.RED_MUSHROOM)
                .define('s', Items.STICK)
                .define('p', Items.PAPER)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PAPER).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY.get(), 8)
                .pattern("psp")
                .pattern("srs")
                .pattern("www")
                .define('r', Items.RED_DYE)
                .define('s', Items.STICK)
                .define('p', Items.PAPER)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PAPER).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DIAMOND_WALLPAPER_ANCHOR.get(), 8)
                .pattern("psp")
                .pattern("sfs")
                .pattern("www")
                .define('f', ItemTags.FISHES)
                .define('s', Items.STICK)
                .define('p', Items.PAPER)
                .define('w', ItemTags.PLANKS)
                .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PAPER).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.GINGERBREAD_BRICKS.get(), 6)
                .pattern("bsb")
                .pattern("sbs")
                .pattern("bsb")
                .define('b', Items.BRICK)
                .define('s', Items.SUGAR)
                .unlockedBy("has_sugar", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.SUGAR).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.GINGERBREAD_BRICK_STAIRS.get(), 4)
                .pattern("s  ")
                .pattern("ss ")
                .pattern("sss")
                .define('s', BlockRegistration.GINGERBREAD_BRICKS.get())
                .unlockedBy("has_gingerbread_bricks", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.GINGERBREAD_BRICKS.get()).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.GINGERBREAD_BRICK_SLAB.get(), 6)
                .pattern("sss")
                .define('s', BlockRegistration.GINGERBREAD_BRICKS.get())
                .unlockedBy("has_gingerbread_bricks", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.GINGERBREAD_BRICKS.get()).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.WICKER_BLOCK.get(), 6)
                .pattern("sys")
                .pattern("sys")
                .pattern("sys")
                .define('y', Items.STRING)
                .define('s', Items.STICK)
                .unlockedBy("has_string", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.STRING).build()))
                .showNotification(false)
                .save(consumer);

        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, Blocks.GOLD_BLOCK, BlockRegistration.CHISELED_GOLD_BLOCK.get());
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.CHISELED_GOLD_BLOCK.get(), Blocks.GOLD_BLOCK);

        ArrayList<RegistryObject<Block>> calciteResults = new ArrayList<>();
        calciteResults.add(BlockRegistration.ALABASTER_WAINSCOTING);
        calciteResults.add(BlockRegistration.ALABASTER_WINDOW_DIVIDED);
        calciteResults.add(BlockRegistration.ALABASTER_PANEL_AUGUSTINE);
        calciteResults.add(BlockRegistration.ALABASTER_PANEL_ALEXANDRIA);
        calciteResults.add(BlockRegistration.ALABASTER_PANEL_ATLANTIC);
        calciteResults.add(BlockRegistration.ALABASTER_PANEL_CANTERBURY);
        calciteResults.add(BlockRegistration.ALABASTER_FRENCH_DOOR);
        calciteResults.add(BlockRegistration.ALABASTER_SCREEN_DOOR);

        buildStoneCutterRecipesForBase(consumer, Blocks.CALCITE, calciteResults);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.ALABASTER_WINDOW_PANE.get(), 16)
                .pattern("www")
                .pattern("www")
                .define('w', BlockRegistration.ALABASTER_WINDOW_DIVIDED.get())
                .unlockedBy("has_alabaster_window_divided", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.ALABASTER_WINDOW_DIVIDED.get()).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.ALABASTER_SCREEN_DOOR.get(), 3)
                .pattern("ps")
                .pattern("ps")
                .pattern("pp")
                .define('p', Items.CALCITE)
                .define('s', Items.STRING)
                .unlockedBy("has_planks", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.CALCITE).build()))
                .showNotification(false)
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.ALABASTER_FRENCH_DOOR.get(), 3)
                .pattern("pg")
                .pattern("pg")
                .pattern("pg")
                .define('p', Items.CALCITE)
                .define('g', Items.GLASS)
                .unlockedBy("has_calcite", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.CALCITE).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.WOOD_WINDOW_PANE.get(), 16)
                .pattern("www")
                .pattern("www")
                .define('w', BlockRegistration.WOOD_WINDOW_DIVIDED.get())
                .unlockedBy("has_wood_window_divided", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.WOOD_WINDOW_DIVIDED.get()).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.WOOD_WINDOW_DIVIDED.get(), 2)
                .pattern("sss")
                .pattern("gsg")
                .pattern("sss")
                .define('g', Blocks.GLASS)
                .define('s', Items.STICK)
                .unlockedBy("has_glass", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Blocks.GLASS).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.WOOD_SCREEN_DOOR.get(), 3)
                .pattern("ps")
                .pattern("ps")
                .pattern("pp")
                .define('p', ItemTags.PLANKS)
                .define('s', Items.STRING)
                .unlockedBy("has_planks", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(ItemTags.PLANKS).build()))
                .showNotification(false)
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.WOOD_FRENCH_DOOR.get(), 3)
                .pattern("pg")
                .pattern("pg")
                .pattern("pg")
                .define('p', ItemTags.PLANKS)
                .define('g', Items.GLASS)
                .unlockedBy("has_planks", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(ItemTags.PLANKS).build()))
                .showNotification(false)
                .save(consumer);

        //TILE RECIPES
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.VERDANT_TILE.get(), 4)
                .pattern("qqq")
                .pattern("qgq")
                .pattern("qqq")
                .define('q', Items.QUARTZ)
                .define('g', Items.GREEN_DYE)
                .unlockedBy("has_quartz", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.QUARTZ).build()))
                .showNotification(false)
                .save(consumer);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.VERDANT_TILE_EDGE.get(), BlockRegistration.VERDANT_TILE.get());
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.VERDANT_TILE_CORNER.get(), BlockRegistration.VERDANT_TILE.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.ESPERANCA_TILE.get(), 4)
                .pattern("tt")
                .pattern("tb")
                .define('t', Items.WHITE_TERRACOTTA)
                .define('b', Items.LIGHT_BLUE_DYE)
                .unlockedBy("has_white_terracotta", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.WHITE_TERRACOTTA).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.LILIY_HILLS_TILE.get(), 4)
                .pattern("tt")
                .pattern("tb")
                .define('t', Items.WHITE_TERRACOTTA)
                .define('b', Items.BROWN_DYE)
                .unlockedBy("has_white_terracotta", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.WHITE_TERRACOTTA).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.HANNISH_TILE.get(), 4)
                .pattern("tt")
                .pattern("tb")
                .define('t', Items.PURPLE_TERRACOTTA)
                .define('b', Items.YELLOW_DYE)
                .unlockedBy("has_purple_terracotta", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PURPLE_TERRACOTTA).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.AURA_TILES.get(), 8)
                .pattern("ttt")
                .pattern("tbt")
                .pattern("ttt")
                .define('t', Items.TERRACOTTA)
                .define('b', Items.BLAZE_POWDER)
                .unlockedBy("has_terracotta", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.TERRACOTTA).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.BIFURCATING_TILES.get(), 8)
                .pattern("ttt")
                .pattern("tbt")
                .pattern("ttt")
                .define('t', Items.TERRACOTTA)
                .define('b', Items.WHEAT_SEEDS)
                .unlockedBy("has_terracotta", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.TERRACOTTA).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.BLACK_AMARYLLIS_TILES.get(), 8)
                .pattern("ttt")
                .pattern("tbt")
                .pattern("ttt")
                .define('t', Items.TERRACOTTA)
                .define('b', ItemTags.COALS)
                .unlockedBy("has_terracotta", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.TERRACOTTA).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.ROSETTE_TILES.get(), 8)
                .pattern("ttt")
                .pattern("tbt")
                .pattern("ttt")
                .define('t', Items.TERRACOTTA)
                .define('b', Items.ROSE_BUSH)
                .unlockedBy("has_terracotta", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.TERRACOTTA).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.SEISMIC_TILES.get(), 8)
                .pattern("ttt")
                .pattern("tbt")
                .pattern("ttt")
                .define('t', Items.TERRACOTTA)
                .define('b', Items.GUNPOWDER)
                .unlockedBy("has_terracotta", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.TERRACOTTA).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.PURPLE_TILES.get(), 4)
                .pattern("tt")
                .pattern("tt")
                .define('t', Items.PURPLE_CONCRETE)
                .unlockedBy("has_purple_concrete", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PURPLE_CONCRETE).build()))
                .showNotification(false)
                .save(consumer);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.PURPLE_TILES.get(), Blocks.PURPLE_CONCRETE);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.SMALL_PURPLE_TILES.get(), Blocks.PURPLE_CONCRETE);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.SMALL_PURPLE_TILES.get(), BlockRegistration.PURPLE_TILES.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.PINK_TILES.get(), 4)
                .pattern("tt")
                .pattern("tt")
                .define('t', Items.PINK_CONCRETE)
                .unlockedBy("has_pink_concrete", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PINK_CONCRETE).build()))
                .showNotification(false)
                .save(consumer);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.PINK_TILES.get(), Blocks.PINK_CONCRETE);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.SMALL_PINK_TILES.get(), Blocks.PINK_CONCRETE);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.SMALL_PINK_TILES.get(), BlockRegistration.PINK_TILES.get());
        
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.YELLOW_TILES.get(), 4)
                .pattern("tt")
                .pattern("tt")
                .define('t', Items.YELLOW_CONCRETE)
                .unlockedBy("has_yellow_concrete", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.YELLOW_CONCRETE).build()))
                .showNotification(false)
                .save(consumer);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.YELLOW_TILES.get(), Blocks.YELLOW_CONCRETE);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.SMALL_YELLOW_TILES.get(), Blocks.YELLOW_CONCRETE);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.SMALL_YELLOW_TILES.get(), BlockRegistration.YELLOW_TILES.get());
        
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.GREEN_TILES.get(), 4)
                .pattern("tt")
                .pattern("tt")
                .define('t', Items.GREEN_CONCRETE)
                .unlockedBy("has_green_concrete", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.GREEN_CONCRETE).build()))
                .showNotification(false)
                .save(consumer);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.GREEN_TILES.get(), Blocks.GREEN_CONCRETE);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.SMALL_GREEN_TILES.get(), Blocks.GREEN_CONCRETE);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.SMALL_GREEN_TILES.get(), BlockRegistration.GREEN_TILES.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.IRIDESCENT_TILES.get(), 8)
                .pattern("ttt")
                .pattern("tpt")
                .pattern("ttt")
                .define('t', Items.TERRACOTTA)
                .define('p', Items.PRISMARINE_SHARD)
                .unlockedBy("has_prismarine_shard", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PRISMARINE_SHARD).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.SMALL_IRIDESCENT_TILES.get(), 4)
                .pattern("tt")
                .pattern("tt")
                .define('t', BlockRegistration.IRIDESCENT_TILES.get())
                .unlockedBy("has_iridescent_tiles", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.IRIDESCENT_TILES.get()).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.KITCHEN_TILES.get(), 8)
                .pattern("ttt")
                .pattern("sfa")
                .pattern("ttt")
                .define('t', Blocks.TERRACOTTA)
                .define('s', ItemTags.SAPLINGS)
                .define('a', Items.APPLE)
                .define('f', ItemTags.SMALL_FLOWERS)
                .unlockedBy("has_terracotta", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.TERRACOTTA).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.COLOSSEO_PILLAR.get(), 8)
                .pattern("rr")
                .pattern("yy")
                .pattern("gg")
                .define('r', Blocks.RED_TERRACOTTA)
                .define('y', Blocks.YELLOW_TERRACOTTA)
                .define('g', Blocks.GREEN_TERRACOTTA)
                .unlockedBy("has_terracotta", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.TERRACOTTA).build()))
                .showNotification(false)
                .save(consumer);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.COLOSSEO_PILLAR_BASE.get(), BlockRegistration.COLOSSEO_PILLAR.get());
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.COLOSSEO_PILLAR_TOP.get(), BlockRegistration.COLOSSEO_PILLAR.get());

        //MISC RECIPES
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.EYE_BLOCK.get(), 2)
                .pattern("mmm")
                .pattern("sbs")
                .pattern("mmm")
                .define('m', Items.BEEF)
                .define('s', Items.SPIDER_EYE)
                .define('b', Items.BRAIN_CORAL_BLOCK)
                .unlockedBy("has_spider_eye", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.SPIDER_EYE).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DYNASTY_DOOR.get(), 3)
                .pattern("wc")
                .pattern("wc")
                .pattern("ww")
                .define('w', Items.WARPED_PLANKS)
                .define('c', Items.COPPER_INGOT)
                .unlockedBy("has_warped_planks", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.WARPED_PLANKS).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.HONEY_JAR_BLOCK.get())
                .pattern("gdg")
                .pattern("ghg")
                .pattern("gsg")
                .define('g', Items.GLASS)
                .define('d', Items.YELLOW_DYE)
                .define('h', Items.HONEY_BOTTLE)
                .define('s', Items.SUGAR)
                .unlockedBy("has_honey_bottle", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.HONEY_BOTTLE).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.BLUEBERRY_JAR_BLOCK.get())
                .pattern("gdg")
                .pattern("ghg")
                .pattern("gsg")
                .define('g', Items.GLASS)
                .define('d', Items.BLUE_DYE)
                .define('h', Items.SWEET_BERRIES)
                .define('s', Items.SUGAR)
                .unlockedBy("has_sweet_berries", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.SWEET_BERRIES).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.CHERRY_JAR_BLOCK.get())
                .pattern("gdg")
                .pattern("ghg")
                .pattern("gsg")
                .define('g', Items.GLASS)
                .define('d', Items.RED_DYE)
                .define('h', Items.SWEET_BERRIES)
                .define('s', Items.SUGAR)
                .unlockedBy("has_sweet_berries", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.SWEET_BERRIES).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.STRAWBERRY_JAR_BLOCK.get())
                .pattern("gdg")
                .pattern("ghg")
                .pattern("gsg")
                .define('g', Items.GLASS)
                .define('d', Items.PINK_DYE)
                .define('h', Items.SWEET_BERRIES)
                .define('s', Items.SUGAR)
                .unlockedBy("has_sweet_berries", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.SWEET_BERRIES).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.APRICOT_JAR_BLOCK.get())
                .pattern("gdg")
                .pattern("ghg")
                .pattern("gsg")
                .define('g', Items.GLASS)
                .define('d', Items.BROWN_DYE)
                .define('h', Items.SWEET_BERRIES)
                .define('s', Items.SUGAR)
                .unlockedBy("has_sweet_berries", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.SWEET_BERRIES).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ORANGE_JAR_BLOCK.get())
                .pattern("gdg")
                .pattern("ghg")
                .pattern("gsg")
                .define('g', Items.GLASS)
                .define('d', Items.ORANGE_DYE)
                .define('h', Items.SWEET_BERRIES)
                .define('s', Items.SUGAR)
                .unlockedBy("has_sweet_berries", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.SWEET_BERRIES).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistration.HAND_DRILL.get())
                .pattern("s ")
                .pattern("il")
                .pattern("pi")
                .define('i', Items.IRON_INGOT)
                .define('s', Items.STONECUTTER)
                .define('l', Items.LEVER)
                .define('p', ItemTags.PLANKS)
                .unlockedBy("has_stonecutter", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.STONECUTTER).build()))
                .showNotification(true)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.ART_NOUVEAU_DOOR.get(), 3)
                .pattern("ps")
                .pattern("sp")
                .pattern("pp")
                .define('s', Items.STICK)
                .define('p', Items.OAK_PLANKS)
                .unlockedBy("has_oak_planks", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.OAK_PLANKS).build()))
                .showNotification(true)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.ART_NOUVEAU_DOOR_DARK.get(), 3)
                .pattern("ps")
                .pattern("sp")
                .pattern("pp")
                .define('s', Items.STICK)
                .define('p', Items.SPRUCE_PLANKS)
                .unlockedBy("has_spruce_planks", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.SPRUCE_PLANKS).build()))
                .showNotification(true)
                .save(consumer);

        //FURNITURE!!!!!
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.APPLE_CHAIR.get())
                .pattern("a  ")
                .pattern("ppp")
                .pattern("s s")
                .define('a', Items.APPLE)
                .define('s', Items.STICK)
                .define('p', ItemTags.PLANKS)
                .unlockedBy("has_apple", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.APPLE).build()))
                .showNotification(true)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.BIRDHOUSE_UNPAINTED.get())
                .pattern(" p ")
                .pattern("pfp")
                .pattern("psp")
                .define('f', Items.FEATHER)
                .define('s', Items.STICK)
                .define('p', ItemTags.PLANKS)
                .unlockedBy("has_feather", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.FEATHER).build()))
                .showNotification(true)
                .save(consumer);

                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.BIRDHOUSE_RED.get())
                        .requires(Items.RED_DYE)
                        .requires(BlockRegistration.BIRDHOUSE_UNPAINTED.get())
                        .unlockedBy("has_birdhouse", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(BlockRegistration.BIRDHOUSE_UNPAINTED.get()).build()))
                        .save(consumer);

                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.BIRDHOUSE_PASTEL.get())
                        .requires(Items.PINK_DYE)
                        .requires(BlockRegistration.BIRDHOUSE_UNPAINTED.get())
                        .unlockedBy("has_birdhouse", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(BlockRegistration.BIRDHOUSE_UNPAINTED.get()).build()))
                        .save(consumer);

                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.BIRDHOUSE_BLUE.get())
                        .requires(Items.BLUE_DYE)
                        .requires(BlockRegistration.BIRDHOUSE_UNPAINTED.get())
                        .unlockedBy("has_birdhouse", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(BlockRegistration.BIRDHOUSE_UNPAINTED.get()).build()))
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.BRIEFCASE_BLANK.get())
                        .pattern(" t ")
                        .pattern("lcl")
                        .pattern(" l ")
                        .define('c', Items.CHEST)
                        .define('l', Items.LEATHER)
                        .define('t', Items.TRIPWIRE_HOOK)
                        .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.CHEST).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.BRIEFCASE_ROVER.get())
                        .requires(Items.BLUE_DYE)
                        .requires(Items.PAPER)
                        .requires(BlockRegistration.BRIEFCASE_BLANK.get())
                        .unlockedBy("has_briefcase", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(BlockRegistration.BRIEFCASE_BLANK.get()).build()))
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.BUNNY_BOOK_ENDS.get())
                        .pattern(" r ")
                        .pattern("bbb")
                        .pattern(" r ")
                        .define('r', Items.RABBIT_HIDE)
                        .define('b', Items.BOOK)
                        .unlockedBy("has_rabbit_hide", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.RABBIT_HIDE).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.BOX_OF_PAINTS.get())
                        .pattern("rby")
                        .pattern("pcp")
                        .define('r', Items.RED_DYE)
                        .define('b', Items.BLUE_DYE)
                        .define('y', Items.YELLOW_DYE)
                        .define('c', Items.BOWL)
                        .define('p', ItemTags.PLANKS)
                        .unlockedBy("has_bowl", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.BOWL).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.BUTTON_STOOL.get())
                        .pattern(" b ")
                        .pattern("ppp")
                        .pattern("s s")
                        .define('p', ItemTags.PLANKS)
                        .define('b', ItemTags.WOODEN_BUTTONS)
                        .define('s', Items.STICK)
                        .unlockedBy("has_wood_button", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(ItemTags.WOODEN_BUTTONS).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.CARDBOARD_BOX.get())
                        .pattern("p p")
                        .pattern("ppp")
                        .define('p', Items.PAPER)
                        .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.PAPER).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.CAT_MUGS_CLUTTERED.get())
                        .pattern("ppp")
                        .define('p', Items.FLOWER_POT)
                        .unlockedBy("has_flower_pot", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.FLOWER_POT).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.CAT_PLANT_POT_ORANGE.get())
                        .pattern(" f ")
                        .pattern("opo")
                        .pattern(" o ")
                        .define('f', ItemTags.FLOWERS)
                        .define('p', Items.FLOWER_POT)
                        .define('o', Items.ORANGE_DYE)
                        .unlockedBy("has_flower_pot", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.FLOWER_POT).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.CAT_PLANT_POT_BLACK.get())
                        .pattern(" f ")
                        .pattern("bpb")
                        .pattern(" b ")
                        .define('f', ItemTags.FLOWERS)
                        .define('p', Items.FLOWER_POT)
                        .define('b', Items.BLACK_DYE)
                        .unlockedBy("has_flower_pot", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.FLOWER_POT).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.COFFEE_GRINDER.get())
                        .pattern(" il")
                        .pattern("ibi")
                        .pattern("ppp")
                        .define('p', ItemTags.PLANKS)
                        .define('i', Items.IRON_INGOT)
                        .define('l', Items.LEVER)
                        .define('b', Items.COCOA_BEANS)
                        .unlockedBy("has_cocoa_beans", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.COCOA_BEANS).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.CAULDRON_POSTER.get(), 8)
                        .pattern("ppp")
                        .pattern("pcp")
                        .pattern("ppp")
                        .define('p', Items.PAPER)
                        .define('c', Items.CAULDRON)
                        .unlockedBy("has_cauldron", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.CAULDRON).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.THREAD_SPOOL_YELLOW.get())
                        .pattern("sps")
                        .pattern("sys")
                        .pattern("sps")
                        .define('p', ItemTags.PLANKS)
                        .define('s', Items.STRING)
                        .define('y', Items.YELLOW_DYE)
                        .unlockedBy("has_string", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.STRING).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.THREAD_SPOOL_GREEN.get())
                        .pattern("sps")
                        .pattern("sgs")
                        .pattern("sps")
                        .define('p', ItemTags.PLANKS)
                        .define('s', Items.STRING)
                        .define('g', Items.GREEN_DYE)
                        .unlockedBy("has_string", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.STRING).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.THREAD_SPOOL_PURPLE.get())
                        .pattern("sps")
                        .pattern("sgs")
                        .pattern("sps")
                        .define('p', ItemTags.PLANKS)
                        .define('s', Items.STRING)
                        .define('g', Items.PURPLE_DYE)
                        .unlockedBy("has_string", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.STRING).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.THREAD_SPOOL_PINK.get())
                        .pattern("sps")
                        .pattern("sgs")
                        .pattern("sps")
                        .define('p', ItemTags.PLANKS)
                        .define('s', Items.STRING)
                        .define('g', Items.PINK_DYE)
                        .unlockedBy("has_string", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.STRING).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SCALE.get())
                        .pattern(" p ")
                        .pattern(" c ")
                        .pattern("iii")
                        .define('p', ItemTags.WOODEN_PRESSURE_PLATES)
                        .define('i', Items.IRON_INGOT)
                        .define('c', Items.COMPASS)
                        .unlockedBy("has_compass", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.COMPASS).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ANTIQUE_MAP.get())
                        .pattern(" k ")
                        .pattern("kmk")
                        .pattern(" k ")
                        .define('m', Items.MAP)
                        .define('k', Items.DRIED_KELP)
                        .unlockedBy("has_map", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.MAP).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ANTIQUE_MINI_TABLE.get())
                        .pattern("ppp")
                        .pattern(" s ")
                        .pattern("s s")
                        .define('p', ItemTags.PLANKS)
                        .define('s', Items.STICK)
                        .unlockedBy("has_stick", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.STICK).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ANCIENT_CODEX.get())
                        .pattern(" l ")
                        .pattern(" s ")
                        .pattern("ppp")
                        .define('p', ItemTags.WOODEN_SLABS)
                        .define('s', Items.STICK)
                        .define('l', Items.LECTERN)
                        .unlockedBy("has_lectern", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.LECTERN).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ANTIQUE_BOOK_STAND.get())
                        .pattern(" l ")
                        .pattern(" s ")
                        .pattern("s s")
                        .define('s', Items.STICK)
                        .define('l', Items.LECTERN)
                        .unlockedBy("has_lectern", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.LECTERN).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ANTIQUE_LIBRARY_BOOKS.get())
                        .pattern("bb")
                        .define('b', BlockRegistration.ROW_OF_SMALL_BOOKS.get())
                        .unlockedBy("has_row_of_small_books", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(BlockRegistration.ROW_OF_SMALL_BOOKS.get()).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.BEE_LAMP.get())
                        .pattern("blb")
                        .define('b', Items.HONEYCOMB)
                        .define('l', Items.REDSTONE_LAMP)
                        .unlockedBy("has_honeycomb", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.HONEYCOMB).build()))
                        .showNotification(true)
                        .save(consumer);


                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.BEE_LAMP_ANGRY.get())
                        .requires(Items.REDSTONE)
                        .requires(BlockRegistration.BEE_LAMP.get())
                        .requires(BlockRegistration.BRIEFCASE_BLANK.get())
                        .unlockedBy("has_bee_lamp", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(BlockRegistration.BEE_LAMP.get()).build()))
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.RECORD_PLAYER_RED.get())
                        .pattern("pjp")
                        .pattern("prp")
                        .define('p', ItemTags.PLANKS)
                        .define('j', Items.JUKEBOX)
                        .define('r', Items.RED_DYE)
                        .unlockedBy("has_jukebox", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.JUKEBOX).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.RECORD_PLAYER_YELLOW.get())
                        .pattern("pjp")
                        .pattern("pyp")
                        .define('p', ItemTags.PLANKS)
                        .define('j', Items.JUKEBOX)
                        .define('y', Items.YELLOW_DYE)
                        .unlockedBy("has_jukebox", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.JUKEBOX).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.RECORD_PLAYER_BLUE.get())
                        .pattern("pjp")
                        .pattern("pbp")
                        .define('p', ItemTags.PLANKS)
                        .define('j', Items.JUKEBOX)
                        .define('b', Items.BLUE_DYE)
                        .unlockedBy("has_jukebox", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.JUKEBOX).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.RECORD_PLAYER_PINK.get())
                        .pattern("pjp")
                        .pattern("pbp")
                        .define('p', ItemTags.PLANKS)
                        .define('j', Items.JUKEBOX)
                        .define('b', Items.PINK_DYE)
                        .unlockedBy("has_jukebox", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.JUKEBOX).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.RECORD_PLAYER_PURPLE.get())
                        .pattern("pjp")
                        .pattern("pbp")
                        .define('p', ItemTags.PLANKS)
                        .define('j', Items.JUKEBOX)
                        .define('b', Items.PURPLE_DYE)
                        .unlockedBy("has_jukebox", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.JUKEBOX).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.RECORD_PLAYER_BROWN.get())
                        .pattern("pjp")
                        .pattern("pbp")
                        .define('p', ItemTags.PLANKS)
                        .define('j', Items.JUKEBOX)
                        .define('b', Items.BROWN_DYE)
                        .unlockedBy("has_jukebox", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.JUKEBOX).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.RECORD_PLAYER_WHITE.get())
                        .pattern("pjp")
                        .pattern("pwp")
                        .define('p', ItemTags.PLANKS)
                        .define('j', Items.JUKEBOX)
                        .define('w', Items.WHITE_DYE)
                        .unlockedBy("has_jukebox", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.JUKEBOX).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.BIKE_YELLOW.get())
                        .pattern("i  ")
                        .pattern("idi")
                        .pattern("g g")
                        .define('i', Items.IRON_BARS)
                        .define('d', Items.YELLOW_DYE)
                        .define('g', Items.GRINDSTONE)
                        .unlockedBy("has_grindstone", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.GRINDSTONE).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.BIKE_YELLOW_FLOWERS.get())
                        .requires(ItemTags.FLOWERS)
                        .requires(BlockRegistration.BIKE_YELLOW.get())
                        .unlockedBy("has_bike_yellow", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(BlockRegistration.BIKE_YELLOW.get()).build()))
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.BIKE_BLUE.get())
                        .pattern("i  ")
                        .pattern("idi")
                        .pattern("g g")
                        .define('i', Items.IRON_BARS)
                        .define('d', Items.BLUE_DYE)
                        .define('g', Items.GRINDSTONE)
                        .unlockedBy("has_grindstone", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.GRINDSTONE).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.BIKE_BLUE_FLOWERS.get())
                        .requires(ItemTags.FLOWERS)
                        .requires(BlockRegistration.BIKE_BLUE.get())
                        .unlockedBy("has_bike_yellow", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(BlockRegistration.BIKE_BLUE.get()).build()))
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.BIKE_PURPLE.get())
                        .pattern("i  ")
                        .pattern("idi")
                        .pattern("g g")
                        .define('i', Items.IRON_BARS)
                        .define('d', Items.PURPLE_DYE)
                        .define('g', Items.GRINDSTONE)
                        .unlockedBy("has_grindstone", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.GRINDSTONE).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.BIKE_PURPLE_FLOWERS.get())
                        .requires(ItemTags.FLOWERS)
                        .requires(BlockRegistration.BIKE_PURPLE.get())
                        .unlockedBy("has_bike_yellow", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(BlockRegistration.BIKE_PURPLE.get()).build()))
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.BIKE_PINK.get())
                        .pattern("i  ")
                        .pattern("idi")
                        .pattern("g g")
                        .define('i', Items.IRON_BARS)
                        .define('d', Items.PINK_DYE)
                        .define('g', Items.GRINDSTONE)
                        .unlockedBy("has_grindstone", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.GRINDSTONE).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.BIKE_PINK_FLOWERS.get())
                        .requires(ItemTags.FLOWERS)
                        .requires(BlockRegistration.BIKE_PINK.get())
                        .unlockedBy("has_bike_yellow", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(BlockRegistration.BIKE_PINK.get()).build()))
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.COTTAGE_SIDE_TABLE.get())
                        .pattern("ddd")
                        .pattern("sbs")
                        .pattern("s s")
                        .define('s', Items.STRIPPED_BIRCH_LOG)
                        .define('d', Items.DARK_OAK_PLANKS)
                        .define('b', Items.DARK_OAK_BUTTON)
                        .unlockedBy("has_dark_oak_planks", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.DARK_OAK_PLANKS).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.COTTAGE_CHAIR.get())
                        .pattern("b  ")
                        .pattern("sbb")
                        .pattern("b b")
                        .define('s', Items.STICK)
                        .define('b', Items.BIRCH_PLANKS)
                        .unlockedBy("has_birch_planks", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.BIRCH_PLANKS).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.COTTAGE_CHAIR_CUSHIONED.get())
                        .pattern("p")
                        .pattern("c")
                        .define('c', BlockRegistration.COTTAGE_CHAIR.get())
                        .define('p', Items.PINK_CARPET)
                        .unlockedBy("has_cottage_chair", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(BlockRegistration.COTTAGE_CHAIR.get()).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.COTTAGE_OTTOMAN.get())
                        .pattern("pwp")
                        .pattern("pwp")
                        .define('w', Items.WHITE_WOOL)
                        .define('p', Items.PINK_WOOL)
                        .unlockedBy("has_pink_wool", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.PINK_WOOL).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.GUMBALL_MACHINE_RED.get())
                        .pattern("did")
                        .pattern("gsg")
                        .pattern(" i ")
                        .define('i', Items.IRON_INGOT)
                        .define('d', Items.RED_DYE)
                        .define('g', Items.GLASS_PANE)
                        .define('s', Items.SUGAR)
                        .unlockedBy("has_sugar", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.SUGAR).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.GUMBALL_MACHINE_BLUE.get())
                        .pattern("did")
                        .pattern("gsg")
                        .pattern(" i ")
                        .define('i', Items.IRON_INGOT)
                        .define('d', Items.BLUE_DYE)
                        .define('g', Items.GLASS_PANE)
                        .define('s', Items.SUGAR)
                        .unlockedBy("has_sugar", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.SUGAR).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.GUMBALL_MACHINE_PURPLE.get())
                        .pattern("did")
                        .pattern("gsg")
                        .pattern(" i ")
                        .define('i', Items.IRON_INGOT)
                        .define('d', Items.PURPLE_DYE)
                        .define('g', Items.GLASS_PANE)
                        .define('s', Items.SUGAR)
                        .unlockedBy("has_sugar", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.SUGAR).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.MINI_CACTUS_SET.get())
                        .pattern("cc")
                        .pattern("pp")
                        .define('c', Items.CACTUS)
                        .define('p', Items.FLOWER_POT)
                        .unlockedBy("has_cactus", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.CACTUS).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.MUSHROOM_JARS.get())
                        .pattern("mb")
                        .pattern("gg")
                        .define('m', Items.RED_MUSHROOM)
                        .define('b', Items.BROWN_MUSHROOM)
                        .define('g', Items.GLASS_BOTTLE)
                        .unlockedBy("has_glass_bottle", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.GLASS_BOTTLE).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.NEWSPAPER_PILE_SHORT.get())
                        .pattern("p")
                        .pattern("i")
                        .pattern("p")
                        .define('p', Items.PAPER)
                        .define('i', Items.INK_SAC)
                        .unlockedBy("has_ink_sac", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.INK_SAC).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.NEWSPAPER_PILE_TALL.get())
                        .pattern("p")
                        .pattern("p")
                        .define('p', BlockRegistration.NEWSPAPER_PILE_SHORT.get())
                        .unlockedBy("has_short_newspaper_pile", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(BlockRegistration.NEWSPAPER_PILE_SHORT.get()).build()))
                        .showNotification(true)
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
        Block wainscoting = null;
        if (ForgeRegistries.BLOCKS.containsKey(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_wainscoting"))) {
            wainscoting = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_wainscoting"));
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
        if (wainscoting != null) {
            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, wainscoting, 4)
                    .pattern("bbb")
                    .pattern("ppp")
                    .define('p', planks)
                    .define('b', slab)
                    .unlockedBy("has_" + woodType + "_planks", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(planks).build()))
                    .showNotification(false)
                    .save(consumer);
        }
    }
}