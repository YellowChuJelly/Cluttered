package net.redchujelly.cluttered.datagen;

import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.redchujelly.cluttered.Cluttered;
import net.redchujelly.cluttered.setup.BlockRegistration;
import net.redchujelly.cluttered.setup.ItemRegistration;
import net.redchujelly.cluttered.setup.TagRegistration;

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
        chalcedonyResults.add(BlockRegistration.CHALCEDONY_MEANDER);
        chalcedonyResults.add(BlockRegistration.CHALCEDONY_TEXTILES);
        chalcedonyResults.add(BlockRegistration.CHALCEDONY_BRICKS);
        chalcedonyResults.add(BlockRegistration.CHALCEDONY_BRICK_STAIRS);
        chalcedonyResults.add(BlockRegistration.CHALCEDONY_PILLAR_BASE);
        chalcedonyResults.add(BlockRegistration.CHALCEDONY_PILLAR);
        chalcedonyResults.add(BlockRegistration.CHALCEDONY_PILLAR_DORIC);
        chalcedonyResults.add(BlockRegistration.CHALCEDONY_PILLAR_IONIC);
        chalcedonyResults.add(BlockRegistration.CHALCEDONY_TILES);
        chalcedonyResults.add(BlockRegistration.CHALCEDONY_SMALL_TILES);
        chalcedonyResults.add(BlockRegistration.CHALCEDONY_WINDOW);

        chalcedonyResults.add(BlockRegistration.CHALCEDONY_BALUSTRADE);
        chalcedonyResults.add(BlockRegistration.CHALCEDONY_PICKET_FENCE);
        chalcedonyResults.add(BlockRegistration.CHALCEDONY_PICKET_FENCE_GATE);

        buildStoneCutterRecipesForBase(consumer, BlockRegistration.CHALCEDONY.get(), chalcedonyResults);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.CHALCEDONY_BRACKET_VICTORIAN.get().asItem(),BlockRegistration.CHALCEDONY.get().asItem(), 4);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.CHALCEDONY_BRACKET_BOW.get().asItem(),BlockRegistration.CHALCEDONY.get().asItem(), 4);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.CHALCEDONY_BRACKET_BOW_SCROLL.get().asItem(),BlockRegistration.CHALCEDONY.get().asItem(), 4);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.CHALCEDONY_BRACKET_SCROLL.get().asItem(),BlockRegistration.CHALCEDONY.get().asItem(), 4);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.CHALCEDONY_BRACKET_SCROLL_SHELF.get().asItem(),BlockRegistration.CHALCEDONY.get().asItem(), 4);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.CHALCEDONY_BRACKET_STAR.get().asItem(),BlockRegistration.CHALCEDONY.get().asItem(), 4);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.CHALCEDONY_BRACKET_STAR_SCROLL.get().asItem(),BlockRegistration.CHALCEDONY.get().asItem(), 4);

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
        deepChalcedonyresults.add(BlockRegistration.DEEP_CHALCEDONY_MEANDER);
        deepChalcedonyresults.add(BlockRegistration.DEEP_CHALCEDONY_TEXTILES);
        deepChalcedonyresults.add(BlockRegistration.DEEP_CHALCEDONY_BRICKS);
        deepChalcedonyresults.add(BlockRegistration.DEEP_CHALCEDONY_BRICK_STAIRS);
        deepChalcedonyresults.add(BlockRegistration.DEEP_CHALCEDONY_PILLAR_BASE);
        deepChalcedonyresults.add(BlockRegistration.DEEP_CHALCEDONY_PILLAR);
        deepChalcedonyresults.add(BlockRegistration.DEEP_CHALCEDONY_PILLAR_DORIC);
        deepChalcedonyresults.add(BlockRegistration.DEEP_CHALCEDONY_PILLAR_IONIC);
        deepChalcedonyresults.add(BlockRegistration.DEEP_CHALCEDONY_TILES);
        deepChalcedonyresults.add(BlockRegistration.DEEP_CHALCEDONY_SMALL_TILES);
        deepChalcedonyresults.add(BlockRegistration.DEEP_CHALCEDONY_WINDOW);

        deepChalcedonyresults.add(BlockRegistration.DEEP_CHALCEDONY_BALUSTRADE);
        deepChalcedonyresults.add(BlockRegistration.DEEP_CHALCEDONY_PICKET_FENCE);
        deepChalcedonyresults.add(BlockRegistration.DEEP_CHALCEDONY_PICKET_FENCE_GATE);

        buildStoneCutterRecipesForBase(consumer, BlockRegistration.DEEP_CHALCEDONY.get(), deepChalcedonyresults);

        deepChalcedonyresults.remove(BlockRegistration.DEEP_POLISHED_CHALCEDONY);

        buildStoneCutterRecipesForBase(consumer, BlockRegistration.DEEP_POLISHED_CHALCEDONY.get(), deepChalcedonyresults);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DEEP_CHALCEDONY_BRICK_STAIRS.get().asItem(),BlockRegistration.DEEP_CHALCEDONY_BRICKS.get().asItem());
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DEEP_CHALCEDONY_SMALL_TILES.get().asItem(),BlockRegistration.DEEP_CHALCEDONY_TILES.get().asItem());

        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DEEP_CHALCEDONY_BRACKET_VICTORIAN.get().asItem(),BlockRegistration.DEEP_CHALCEDONY.get().asItem(), 4);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DEEP_CHALCEDONY_BRACKET_BOW.get().asItem(),BlockRegistration.DEEP_CHALCEDONY.get().asItem(), 4);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DEEP_CHALCEDONY_BRACKET_BOW_SCROLL.get().asItem(),BlockRegistration.DEEP_CHALCEDONY.get().asItem(), 4);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DEEP_CHALCEDONY_BRACKET_SCROLL.get().asItem(),BlockRegistration.DEEP_CHALCEDONY.get().asItem(), 4);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DEEP_CHALCEDONY_BRACKET_SCROLL_SHELF.get().asItem(),BlockRegistration.DEEP_CHALCEDONY.get().asItem(), 4);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DEEP_CHALCEDONY_BRACKET_STAR.get().asItem(),BlockRegistration.DEEP_CHALCEDONY.get().asItem(), 4);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.DEEP_CHALCEDONY_BRACKET_STAR_SCROLL.get().asItem(),BlockRegistration.DEEP_CHALCEDONY.get().asItem(), 4);

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
        marbleresults.add(BlockRegistration.MARBLE_MEANDER);
        marbleresults.add(BlockRegistration.MARBLE_TEXTILES);
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

        marbleresults.add(BlockRegistration.MARBLE_BALUSTRADE);
        marbleresults.add(BlockRegistration.MARBLE_PICKET_FENCE);
        marbleresults.add(BlockRegistration.MARBLE_PICKET_FENCE_GATE);
        buildStoneCutterRecipesForBase(consumer, BlockRegistration.MARBLE.get(), marbleresults);

        marbleresults.remove(BlockRegistration.POLISHED_MARBLE);

        buildStoneCutterRecipesForBase(consumer, BlockRegistration.POLISHED_MARBLE.get(), marbleresults);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.MARBLE_BRICK_STAIRS.get().asItem(),BlockRegistration.MARBLE_BRICKS.get().asItem());
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.MARBLE_SMALL_TILES.get().asItem(),BlockRegistration.MARBLE_TILES.get().asItem());

        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.MARBLE_BRACKET_VICTORIAN.get().asItem(),BlockRegistration.MARBLE.get().asItem(), 4);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.MARBLE_BRACKET_BOW.get().asItem(),BlockRegistration.MARBLE.get().asItem(), 4);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.MARBLE_BRACKET_BOW_SCROLL.get().asItem(),BlockRegistration.MARBLE.get().asItem(), 4);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.MARBLE_BRACKET_SCROLL.get().asItem(),BlockRegistration.MARBLE.get().asItem(), 4);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.MARBLE_BRACKET_SCROLL_SHELF.get().asItem(),BlockRegistration.MARBLE.get().asItem(), 4);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.MARBLE_BRACKET_STAR.get().asItem(),BlockRegistration.MARBLE.get().asItem(), 4);
        stonecutterResultFromBase(consumer, RecipeCategory.BUILDING_BLOCKS, BlockRegistration.MARBLE_BRACKET_STAR_SCROLL.get().asItem(),BlockRegistration.MARBLE.get().asItem(), 4);

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
        buildStoneCutterRecipesForBase(consumer, Blocks.STONE, List.of(BlockRegistration.STONE_TEXTILES));

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

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.TARTAN_YELLOW_WALLPAPER.get(), 8)
                .pattern("dpd")
                .pattern("dpd")
                .pattern("www")
                .define('d', Items.YELLOW_DYE)
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

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.TROPICAL_FISH_WALLPAPER.get(), 8)
                .pattern("pfp")
                .pattern("pfp")
                .pattern("www")
                .define('f', Items.TROPICAL_FISH)
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

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.WICKER_BLOCK.get(), 8)
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
        calciteResults.add(BlockRegistration.GREENHOUSE_WINDOW);
        calciteResults.add(BlockRegistration.GREENHOUSE_WINDOW_ARCH_LEFT);
        calciteResults.add(BlockRegistration.GREENHOUSE_WINDOW_ARCH_RIGHT);
        calciteResults.add(BlockRegistration.GREENHOUSE_WINDOW_RADIAL_LEFT);
        calciteResults.add(BlockRegistration.GREENHOUSE_WINDOW_RADIAL_RIGHT);
        calciteResults.add(BlockRegistration.GREENHOUSE_WINDOW_CIRCLE);
        calciteResults.add(BlockRegistration.GREENHOUSE_WINDOW_ROUNDED);
        calciteResults.add(BlockRegistration.GREENHOUSE_WINDOW_POINT);
        calciteResults.add(BlockRegistration.GREENHOUSE_WINDOW_STAIRS);
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

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.GREENHOUSE_WINDOW_STAIRS.get(), 4)
                .pattern("w  ")
                .pattern("ww ")
                .pattern("www")
                .define('w', BlockRegistration.GREENHOUSE_WINDOW.get())
                .unlockedBy("has_greenhouse_window", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.GREENHOUSE_WINDOW.get()).build()))
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

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.WOODEN_BRACKET_VICTORIAN.get(), 4)
                .pattern("sss")
                .pattern(" ts")
                .pattern("  s")
                .define('s', Items.STICK)
                .define('t', ItemTags.WOODEN_STAIRS)
                .unlockedBy("has_wooden_stairs", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(ItemTags.WOODEN_STAIRS).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.WOODEN_PICKET_FENCE.get(), 3)
                .pattern("ttt")
                .define('t', ItemTags.WOODEN_FENCES)
                .unlockedBy("has_wooden_fence", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(ItemTags.WOODEN_FENCES).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.WOODEN_PICKET_FENCE_GATE.get())
                .pattern("tgt")
                .define('t', ItemTags.WOODEN_FENCES)
                .define('g', ItemTags.FENCE_GATES)
                .unlockedBy("has_fence_gate", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(ItemTags.FENCE_GATES).build()))
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

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.X_TILE_TERRACOTTA.get(), 8)
                .pattern("tqt")
                .pattern("qtq")
                .pattern("tqt")
                .define('t', Blocks.TERRACOTTA)
                .define('q', Blocks.QUARTZ_BLOCK)
                .unlockedBy("has_terracotta", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.TERRACOTTA).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.X_TILE_GRAY.get(), 8)
                .pattern("ttt")
                .pattern("tdt")
                .pattern("ttt")
                .define('d', Items.GRAY_DYE)
                .define('t', BlockRegistration.X_TILE_TERRACOTTA.get())
                .unlockedBy("has_terracotta_x_tiles", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.X_TILE_TERRACOTTA.get()).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.X_TILE_BLUE.get(), 8)
                .pattern("ttt")
                .pattern("tdt")
                .pattern("ttt")
                .define('d', Items.BLUE_DYE)
                .define('t', BlockRegistration.X_TILE_TERRACOTTA.get())
                .unlockedBy("has_terracotta_x_tiles", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.X_TILE_TERRACOTTA.get()).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.X_TILE_INVERSE_TERRACOTTA.get(), 8)
                .pattern("tqt")
                .pattern("qtq")
                .pattern("tqt")
                .define('q', Blocks.TERRACOTTA)
                .define('t', Blocks.QUARTZ_BLOCK)
                .unlockedBy("has_terracotta", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.TERRACOTTA).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.X_TILE_INVERSE_GRAY.get(), 8)
                .pattern("ttt")
                .pattern("tdt")
                .pattern("ttt")
                .define('d', Items.GRAY_DYE)
                .define('t', BlockRegistration.X_TILE_INVERSE_TERRACOTTA.get())
                .unlockedBy("has_terracotta_inverse_x_tiles", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.X_TILE_INVERSE_TERRACOTTA.get()).build()))
                .showNotification(false)
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistration.X_TILE_INVERSE_BLUE.get(), 8)
                .pattern("ttt")
                .pattern("tdt")
                .pattern("ttt")
                .define('d', Items.BLUE_DYE)
                .define('t', BlockRegistration.X_TILE_INVERSE_TERRACOTTA.get())
                .unlockedBy("has_terracotta_inverse_x_tiles", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.X_TILE_INVERSE_TERRACOTTA.get()).build()))
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

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.BRICKS), RecipeCategory.BUILDING_BLOCKS, BlockRegistration.VARYING_BRICKS.get(),0.1f, 200)
                .unlockedBy("has_bricks", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.BRICKS).build()
                )).save(consumer);

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

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.CAULDRON_POSTER.get(), 4)
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

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.NEWSPAPER_PILE_SHORT.get(), 2)
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

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.PAPER_PILE.get(), 2)
                        .pattern("pp")
                        .pattern("pp")
                        .pattern("pp")
                        .define('p', Items.PAPER)
                        .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.PAPER).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.MUSHROOM_TERRARIUM_RED.get())
                        .pattern("ggg")
                        .pattern("gmg")
                        .pattern("gpg")
                        .define('p', Items.PODZOL)
                        .define('g', Items.GLASS_PANE)
                        .define('m', Items.RED_MUSHROOM)
                        .unlockedBy("has_red_mushroom", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.RED_MUSHROOM).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.MUSHROOM_TERRARIUM_BROWN.get())
                        .pattern("ggg")
                        .pattern("gmg")
                        .pattern("gpg")
                        .define('p', Items.PODZOL)
                        .define('g', Items.GLASS_PANE)
                        .define('m', Items.BROWN_MUSHROOM)
                        .unlockedBy("has_brown_mushroom", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.BROWN_MUSHROOM).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.GLOWSHROOM_TERRARIUM_YELLOW.get())
                        .pattern("gdg")
                        .pattern("gmg")
                        .pattern("lpl")
                        .define('p', Items.PODZOL)
                        .define('g', Items.GLASS_PANE)
                        .define('m', Items.RED_MUSHROOM)
                        .define('d', Items.YELLOW_DYE)
                        .define('l', Items.GLOWSTONE_DUST)
                        .unlockedBy("has_glowstone_dust", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.GLOWSTONE_DUST).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.GLOWSHROOM_TERRARIUM_GREEN.get())
                        .pattern("gdg")
                        .pattern("gmg")
                        .pattern("lpl")
                        .define('p', Items.PODZOL)
                        .define('g', Items.GLASS_PANE)
                        .define('m', Items.RED_MUSHROOM)
                        .define('d', Items.LIME_DYE)
                        .define('l', Items.GLOWSTONE_DUST)
                        .unlockedBy("has_glowstone_dust", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.GLOWSTONE_DUST).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.GLOWSHROOM_TERRARIUM_BLUE.get())
                        .pattern("gdg")
                        .pattern("gmg")
                        .pattern("lpl")
                        .define('p', Items.PODZOL)
                        .define('g', Items.GLASS_PANE)
                        .define('m', Items.RED_MUSHROOM)
                        .define('d', Items.LIGHT_BLUE_DYE)
                        .define('l', Items.GLOWSTONE_DUST)
                        .unlockedBy("has_glowstone_dust", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.GLOWSTONE_DUST).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.GLOWSHROOM_TERRARIUM_PINK.get())
                        .pattern("gdg")
                        .pattern("gmg")
                        .pattern("lpl")
                        .define('p', Items.PODZOL)
                        .define('g', Items.GLASS_PANE)
                        .define('m', Items.RED_MUSHROOM)
                        .define('d', Items.PINK_DYE)
                        .define('l', Items.GLOWSTONE_DUST)
                        .unlockedBy("has_glowstone_dust", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.GLOWSTONE_DUST).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.GLOWSHROOM_TERRARIUM_PURPLE.get())
                        .pattern("gdg")
                        .pattern("gmg")
                        .pattern("lpl")
                        .define('p', Items.PODZOL)
                        .define('g', Items.GLASS_PANE)
                        .define('m', Items.RED_MUSHROOM)
                        .define('d', Items.PURPLE_DYE)
                        .define('l', Items.GLOWSTONE_DUST)
                        .unlockedBy("has_glowstone_dust", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.GLOWSTONE_DUST).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.FENCE_SHELF.get())
                        .pattern("fff")
                        .pattern("fqf")
                        .pattern("ppp")
                        .define('p', ItemTags.PLANKS)
                        .define('f', ItemTags.WOODEN_FENCES)
                        .define('q', Items.FLOWER_POT)
                        .unlockedBy("has_flower_pot", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.FLOWER_POT).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.HANGING_PLANT_POT_FLOWERS.get())
                        .pattern("s")
                        .pattern("f")
                        .pattern("p")
                        .define('p', ItemTags.PLANKS)
                        .define('f', ItemTags.FLOWERS)
                        .define('s', Items.STRING)
                        .unlockedBy("has_flower_pot", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.FLOWER_POT).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.HANGING_PLANT_POT_GRASS.get())
                        .pattern("s")
                        .pattern("f")
                        .pattern("p")
                        .define('p', ItemTags.PLANKS)
                        .define('f', Items.GRASS)
                        .define('s', Items.TRIPWIRE_HOOK)
                        .unlockedBy("has_flower_pot", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.FLOWER_POT).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.PEDESTAL_HK.get())
                        .pattern("sss")
                        .pattern(" w ")
                        .pattern("ppp")
                        .define('p', ItemTags.PLANKS)
                        .define('w', Items.WHITE_WOOL)
                        .define('s', ItemTags.WOODEN_SLABS)
                        .unlockedBy("has_white_wool", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.WHITE_WOOL).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.PICNIC_BASKET.get())
                        .pattern("b b")
                        .pattern("iwi")
                        .pattern("iii")
                        .define('b', Items.BLUE_CARPET)
                        .define('w', Items.WHITE_CARPET)
                        .define('i', BlockRegistration.WICKER_BLOCK.get())
                        .unlockedBy("has_wicker_block", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(BlockRegistration.WICKER_BLOCK.get()).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.PICNIC_BASKET_PREPARED.get())
                        .requires(Items.APPLE)
                        .requires(Items.BREAD)
                        .requires(BlockRegistration.PICNIC_BASKET.get())
                        .unlockedBy("has_picnic_basket", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(BlockRegistration.PICNIC_BASKET.get()).build()))
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.BASKET_OF_PRODUCE.get())
                        .pattern("cpg")
                        .pattern("w w")
                        .pattern("www")
                        .define('g', Items.WHEAT)
                        .define('c', Items.CARROT)
                        .define('p', Items.POTATO)
                        .define('w', BlockRegistration.WICKER_BLOCK.get())
                        .unlockedBy("has_wicker_block", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(BlockRegistration.WICKER_BLOCK.get()).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.BASKET_OF_FLOWERS.get())
                        .pattern("ftf")
                        .pattern("w w")
                        .pattern("www")
                        .define('f', ItemTags.SMALL_FLOWERS)
                        .define('t', ItemTags.TALL_FLOWERS)
                        .define('w', BlockRegistration.WICKER_BLOCK.get())
                        .unlockedBy("has_wicker_block", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(BlockRegistration.WICKER_BLOCK.get()).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.OSSON_PENDANT_BLACK.get(), 4)
                        .pattern("did")
                        .pattern("ili")
                        .define('d', Items.BLACK_DYE)
                        .define('i', Items.IRON_INGOT)
                        .define('l', Items.LANTERN)
                        .unlockedBy("has_lantern", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.LANTERN).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.OSSON_PENDANT_BROWN.get(), 4)
                        .pattern("did")
                        .pattern("ili")
                        .define('d', Items.BROWN_DYE)
                        .define('i', Items.IRON_INGOT)
                        .define('l', Items.LANTERN)
                        .unlockedBy("has_lantern", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.LANTERN).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.OSSON_PENDANT_ORANGE.get(), 4)
                        .pattern("did")
                        .pattern("ili")
                        .define('d', Items.ORANGE_DYE)
                        .define('i', Items.IRON_INGOT)
                        .define('l', Items.LANTERN)
                        .unlockedBy("has_lantern", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.LANTERN).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.OSSON_PENDANT_RACING_GREEN.get(), 4)
                        .pattern("did")
                        .pattern("ili")
                        .define('d', Items.GREEN_DYE)
                        .define('i', Items.IRON_INGOT)
                        .define('l', Items.LANTERN)
                        .unlockedBy("has_lantern", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.LANTERN).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.OSSON_PENDANT_SAGE_GREEN.get(), 4)
                        .pattern("did")
                        .pattern("ili")
                        .define('d', Items.LIME_DYE)
                        .define('i', Items.IRON_INGOT)
                        .define('l', Items.LANTERN)
                        .unlockedBy("has_lantern", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.LANTERN).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.OSSON_PENDANT_RED.get(), 4)
                        .pattern("did")
                        .pattern("ili")
                        .define('d', Items.RED_DYE)
                        .define('i', Items.IRON_INGOT)
                        .define('l', Items.LANTERN)
                        .unlockedBy("has_lantern", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.LANTERN).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.OSSON_PENDANT_YELLOW.get(), 4)
                        .pattern("did")
                        .pattern("ili")
                        .define('d', Items.YELLOW_DYE)
                        .define('i', Items.IRON_INGOT)
                        .define('l', Items.LANTERN)
                        .unlockedBy("has_lantern", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.LANTERN).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.OSSON_PENDANT_WHITE.get(), 4)
                        .pattern("did")
                        .pattern("ili")
                        .define('d', Items.WHITE_DYE)
                        .define('i', Items.IRON_INGOT)
                        .define('l', Items.LANTERN)
                        .unlockedBy("has_lantern", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.LANTERN).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.COTTAGE_BOOKCASE.get())
                        .pattern("bsb")
                        .pattern("bbb")
                        .pattern("bcb")
                        .define('b', Items.BIRCH_PLANKS)
                        .define('s', Items.BOOKSHELF)
                        .define('c', Items.CHEST)
                        .unlockedBy("has_bookshelf", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.BOOKSHELF).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.COTTAGE_STANDING_LAMP.get())
                        .pattern("wbw")
                        .pattern(" d ")
                        .pattern(" d ")
                        .define('b', Items.REDSTONE_LAMP)
                        .define('w', Items.WHITE_CARPET)
                        .define('d', Items.DARK_OAK_PLANKS)
                        .unlockedBy("has_redstone_lamp", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.REDSTONE_LAMP).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.DRYING_HERBS.get())
                        .pattern("sss")
                        .pattern("gfg")
                        .define('g', Items.GRASS)
                        .define('s', Items.STICK)
                        .define('f', Items.FERN)
                        .unlockedBy("has_fern", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.FERN).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.HANGING_CLOTH.get())
                        .pattern("sss")
                        .pattern("ppp")
                        .pattern("rrr")
                        .define('s', Items.STICK)
                        .define('p', Items.PINK_CARPET)
                        .define('r', Items.RED_CARPET)
                        .unlockedBy("has_pink_carpet", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.PINK_CARPET).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.HEART_CAKE.get())
                        .pattern("bcb")
                        .pattern("ses")
                        .pattern("wcw")
                        .define('s', Items.SUGAR)
                        .define('b', Items.MILK_BUCKET)
                        .define('e', Items.EGG)
                        .define('w', Items.WHEAT)
                        .define('c', Items.BEETROOT)
                        .unlockedBy("has_beetroot", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.BEETROOT).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.BERRY_CAKE.get())
                        .pattern("bcb")
                        .pattern("ses")
                        .pattern("wcw")
                        .define('s', Items.SUGAR)
                        .define('b', Items.MILK_BUCKET)
                        .define('e', Items.EGG)
                        .define('w', Items.WHEAT)
                        .define('c', Items.SWEET_BERRIES)
                        .unlockedBy("has_sweet_berries", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.SWEET_BERRIES).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.MINI_FLAG_RAINBOW.get(), 4)
                        .pattern("ryp")
                        .pattern("ogb")
                        .pattern("s  ")
                        .define('s', Items.STICK)
                        .define('g', Items.GREEN_CARPET)
                        .define('r', Items.RED_CARPET)
                        .define('p', Items.PURPLE_CARPET)
                        .define('o', Items.ORANGE_CARPET)
                        .define('y', Items.YELLOW_CARPET)
                        .define('b', Items.BLUE_CARPET)
                        .unlockedBy("has_red_carpet", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.RED_CARPET).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.MINI_FLAG_LESBIAN.get(), 4)
                        .pattern("owp")
                        .pattern("owp")
                        .pattern("s  ")
                        .define('s', Items.STICK)
                        .define('o', Items.ORANGE_CARPET)
                        .define('w', Items.WHITE_CARPET)
                        .define('p', Items.PINK_CARPET)
                        .unlockedBy("has_orange_carpet", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.ORANGE_CARPET).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.MINI_FLAG_BI.get(), 4)
                        .pattern("mpb")
                        .pattern("mpb")
                        .pattern("s  ")
                        .define('s', Items.STICK)
                        .define('m', Items.MAGENTA_CARPET)
                        .define('b', Items.BLUE_CARPET)
                        .define('p', Items.PURPLE_CARPET)
                        .unlockedBy("has_blue_carpet", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.BLUE_CARPET).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.MINI_FLAG_PAN.get(), 4)
                        .pattern("myc")
                        .pattern("myc")
                        .pattern("s  ")
                        .define('s', Items.STICK)
                        .define('m', Items.MAGENTA_CARPET)
                        .define('y', Items.YELLOW_CARPET)
                        .define('c', Items.CYAN_CARPET)
                        .unlockedBy("has_magenta_carpet", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.MAGENTA_CARPET).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.MINI_FLAG_ACE.get(), 4)
                        .pattern("bwp")
                        .pattern("bwp")
                        .pattern("s  ")
                        .define('s', Items.STICK)
                        .define('b', Items.BLACK_CARPET)
                        .define('w', Items.WHITE_CARPET)
                        .define('p', Items.PURPLE_CARPET)
                        .unlockedBy("has_black_carpet", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.BLACK_CARPET).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.MINI_FLAG_TRANS.get(), 4)
                        .pattern("bpb")
                        .pattern("bpb")
                        .pattern("s  ")
                        .define('s', Items.STICK)
                        .define('b', Items.LIGHT_BLUE_CARPET)
                        .define('p', Items.PINK_CARPET)
                        .unlockedBy("has_pink_carpet", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.PINK_CARPET).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.MINI_FLAG_NONBINARY.get(), 4)
                        .pattern("ypb")
                        .pattern("ypb")
                        .pattern("s  ")
                        .define('s', Items.STICK)
                        .define('y', Items.YELLOW_CARPET)
                        .define('p', Items.PURPLE_CARPET)
                        .define('b', Items.BLACK_CARPET)
                        .unlockedBy("has_black_carpet", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.BLACK_CARPET).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ANIMATED_FLAG_RAINBOW.get())
                        .pattern("nin")
                        .pattern("ryp")
                        .pattern("ogb")
                        .define('n', Items.IRON_NUGGET)
                        .define('i', Items.IRON_INGOT)
                        .define('r', Items.RED_WOOL)
                        .define('y', Items.YELLOW_WOOL)
                        .define('o', Items.ORANGE_WOOL)
                        .define('g', Items.GREEN_WOOL)
                        .define('p', Items.PURPLE_WOOL)
                        .define('b', Items.BLUE_WOOL)
                        .unlockedBy("has_red_wool", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.RED_WOOL).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ANIMATED_FLAG_LESBIAN.get())
                        .pattern("nin")
                        .pattern("owp")
                        .pattern("owp")
                        .define('n', Items.IRON_NUGGET)
                        .define('i', Items.IRON_INGOT)
                        .define('w', Items.WHITE_WOOL)
                        .define('o', Items.ORANGE_WOOL)
                        .define('p', Items.PINK_WOOL)
                        .unlockedBy("has_orange_wool", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.ORANGE_WOOL).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ANIMATED_FLAG_BISEXUAL.get())
                        .pattern("nin")
                        .pattern("mpb")
                        .pattern("mpb")
                        .define('n', Items.IRON_NUGGET)
                        .define('i', Items.IRON_INGOT)
                        .define('m', Items.MAGENTA_WOOL)
                        .define('p', Items.PURPLE_WOOL)
                        .define('b', Items.BLUE_WOOL)
                        .unlockedBy("has_blue_wool", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.BLUE_WOOL).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ANIMATED_FLAG_PANSEXUAL.get())
                        .pattern("nin")
                        .pattern("myc")
                        .pattern("myc")
                        .define('n', Items.IRON_NUGGET)
                        .define('i', Items.IRON_INGOT)
                        .define('m', Items.MAGENTA_WOOL)
                        .define('y', Items.YELLOW_WOOL)
                        .define('c', Items.CYAN_WOOL)
                        .unlockedBy("has_magenta_wool", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.MAGENTA_WOOL).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ANIMATED_FLAG_ASEXUAL.get())
                        .pattern("nin")
                        .pattern("bwp")
                        .pattern("bwp")
                        .define('n', Items.IRON_NUGGET)
                        .define('i', Items.IRON_INGOT)
                        .define('b', Items.BLACK_WOOL)
                        .define('w', Items.WHITE_WOOL)
                        .define('p', Items.PURPLE_WOOL)
                        .unlockedBy("has_black_wool", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.BLACK_WOOL).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ANIMATED_FLAG_TRANSGENDER.get())
                        .pattern("nin")
                        .pattern("bpb")
                        .pattern("bpb")
                        .define('n', Items.IRON_NUGGET)
                        .define('i', Items.IRON_INGOT)
                        .define('b', Items.LIGHT_BLUE_WOOL)
                        .define('p', Items.PINK_WOOL)
                        .unlockedBy("has_pink_wool", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.PINK_WOOL).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ANIMATED_FLAG_NONBINARY.get())
                        .pattern("nin")
                        .pattern("ypb")
                        .pattern("ypb")
                        .define('n', Items.IRON_NUGGET)
                        .define('i', Items.IRON_INGOT)
                        .define('y', Items.YELLOW_WOOL)
                        .define('b', Items.BLACK_WOOL)
                        .define('p', Items.PURPLE_WOOL)
                        .unlockedBy("has_yellow_wool", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.YELLOW_WOOL).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.BAMBOO_BOOKSHELF.get())
                        .pattern("bsb")
                        .pattern("bsb")
                        .pattern("bsb")
                        .define('b', Items.BAMBOO_BLOCK)
                        .define('s', Items.BOOKSHELF)
                        .unlockedBy("has_bookshelf", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.BOOKSHELF).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.FWISH_BOOKCASE.get())
                        .pattern("fff")
                        .pattern("sss")
                        .pattern("sss")
                        .define('f', ItemTags.FISHES)
                        .define('s', Items.BOOKSHELF)
                        .unlockedBy("has_bookshelf", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.BOOKSHELF).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.RETRO_CAFE_SHELF.get())
                        .pattern("ppp")
                        .pattern("lbc")
                        .pattern("sss")
                        .define('p', Items.MANGROVE_SLAB)
                        .define('l', Items.BONE)
                        .define('c', Items.CAULDRON)
                        .define('b', Items.GLASS_BOTTLE)
                        .define('s', Items.BOOKSHELF)
                        .unlockedBy("has_bookshelf", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.BOOKSHELF).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.RETRO_CAFE_SHELF_WINDOW.get())
                        .pattern("pgp")
                        .pattern("ggg")
                        .define('p', Items.MANGROVE_SLAB)
                        .define('g', Items.PURPLE_STAINED_GLASS_PANE)
                        .unlockedBy("has_mangrove_slab", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.MANGROVE_SLAB).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.POTION_SHELF.get())
                        .pattern("gwg")
                        .pattern("wpw")
                        .pattern("lwl")
                        .define('p', Items.POTION)
                        .define('w', BlockRegistration.WILLOW_PLANKS.get())
                        .define('g', Items.GOLD_NUGGET)
                        .define('l', Items.GLASS_PANE)
                        .unlockedBy("has_willow_planks", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(BlockRegistration.WILLOW_PLANKS.get()).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.CHINA_CABINET.get())
                        .pattern("pwp")
                        .pattern("pgp")
                        .pattern("pwp")
                        .define('p', ItemTags.PLANKS)
                        .define('w', Items.WHITE_GLAZED_TERRACOTTA)
                        .define('g', Items.GLASS_PANE)
                        .unlockedBy("has_white_glazed_terracotta", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.WHITE_GLAZED_TERRACOTTA).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.CUPID_BENCH.get())
                        .pattern("fff")
                        .pattern("ppp")
                        .pattern("f f")
                        .define('p', BlockRegistration.MARBLE_SLAB.get())
                        .define('f', BlockRegistration.MARBLE_PICKET_FENCE.get())
                        .unlockedBy("has_marble_slab", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(BlockRegistration.MARBLE_SLAB.get()).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ENDTABLE_WOOD.get())
                        .pattern("ppp")
                        .pattern("sbs")
                        .pattern("s s")
                        .define('p', ItemTags.WOODEN_SLABS)
                        .define('b', ItemTags.WOODEN_BUTTONS)
                        .define('s', Items.STICK)
                        .unlockedBy("has_wooden_fence", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(ItemTags.WOODEN_FENCES).build()))
                        .showNotification(true)
                        .save(consumer);

                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.ENDTABLE_AMETHYST.get())
                        .requires(Items.PURPLE_DYE)
                        .requires(BlockRegistration.ENDTABLE_WOOD.get())
                        .unlockedBy("has_wood_endtable", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(BlockRegistration.ENDTABLE_WOOD.get()).build()))
                        .save(consumer);

                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.ENDTABLE_BUBBLEGUM.get())
                        .requires(Items.PINK_DYE)
                        .requires(BlockRegistration.ENDTABLE_WOOD.get())
                        .unlockedBy("has_wood_endtable", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(BlockRegistration.ENDTABLE_WOOD.get()).build()))
                        .save(consumer);

                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.ENDTABLE_CHARCOAL.get())
                        .requires(Items.BLACK_DYE)
                        .requires(BlockRegistration.ENDTABLE_WOOD.get())
                        .unlockedBy("has_wood_endtable", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(BlockRegistration.ENDTABLE_WOOD.get()).build()))
                        .save(consumer);

                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.ENDTABLE_MEADOW.get())
                        .requires(Items.LIME_DYE)
                        .requires(BlockRegistration.ENDTABLE_WOOD.get())
                        .unlockedBy("has_wood_endtable", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(BlockRegistration.ENDTABLE_WOOD.get()).build()))
                        .save(consumer);

                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.ENDTABLE_PERIWINKLE.get())
                        .requires(Items.CYAN_DYE)
                        .requires(BlockRegistration.ENDTABLE_WOOD.get())
                        .unlockedBy("has_wood_endtable", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(BlockRegistration.ENDTABLE_WOOD.get()).build()))
                        .save(consumer);

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.ENDTABLE_SUNSHINE.get())
                        .requires(Items.YELLOW_DYE)
                        .requires(BlockRegistration.ENDTABLE_WOOD.get())
                        .unlockedBy("has_wood_endtable", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(BlockRegistration.ENDTABLE_WOOD.get()).build()))
                        .save(consumer);

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.ENDTABLE_DECOR.get())
                        .requires(Items.FLOWER_POT)
                        .requires(Items.BOOK)
                        .requires(Items.PAINTING)
                        .unlockedBy("has_painting", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.PAINTING).build()))
                        .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.NIGHTSTAND_GREEN.get())
                    .pattern("cfc")
                    .pattern("ppp")
                    .pattern("s s")
                    .define('p', BlockRegistration.SYCAMORE_PLANKS.get())
                    .define('c', Items.PINK_CARPET)
                    .define('s', Items.STICK)
                    .define('f', Items.SUNFLOWER)
                    .unlockedBy("has_sycamore_planks", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(BlockRegistration.SYCAMORE_PLANKS.get()).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.DESK_GREEN.get())
                    .pattern("sss")
                    .pattern("ppp")
                    .pattern("f f")
                    .define('p', BlockRegistration.SYCAMORE_PLANKS.get())
                    .define('f', BlockRegistration.SYCAMORE_FENCE.get())
                    .define('s', BlockRegistration.SYCAMORE_SLAB.get())
                    .unlockedBy("has_sycamore_planks", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(BlockRegistration.SYCAMORE_PLANKS.get()).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.DESK_GREEN_CLUTTERED.get())
                    .requires(Items.FLOWER_POT)
                    .requires(ItemTags.CANDLES)
                    .requires(Items.BOOK)
                    .requires(BlockRegistration.DESK_GREEN.get())
                    .unlockedBy("has_desk_green", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(BlockRegistration.DESK_GREEN.get()).build()))
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.DESK_BROWN.get())
                    .pattern("sss")
                    .pattern("ppp")
                    .pattern("f f")
                    .define('p', Items.DARK_OAK_PLANKS)
                    .define('f', Items.DARK_OAK_FENCE)
                    .define('s', Items.DARK_OAK_SLAB)
                    .unlockedBy("has_dark_oak_planks", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.DARK_OAK_PLANKS).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.DESK_BROWN_CLUTTERED.get())
                    .requires(Items.FLOWER_POT)
                    .requires(ItemTags.CANDLES)
                    .requires(Items.BOOK)
                    .requires(BlockRegistration.DESK_BROWN.get())
                    .unlockedBy("has_desk_brown", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(BlockRegistration.DESK_BROWN.get()).build()))
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ROVER_STOOL.get())
                    .pattern("rbr")
                    .pattern("s s")
                    .define('r', Items.RED_WOOL)
                    .define('b', Items.BLUE_WOOL)
                    .define('s', Items.STICK)
                    .unlockedBy("has_red_wool", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.RED_WOOL).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.MADONNA_OTTOMAN.get())
                    .pattern("glg")
                    .pattern("bbb")
                    .define('g', Items.GOLD_NUGGET)
                    .define('b', Items.BLACK_WOOL)
                    .define('l', Items.LAPIS_LAZULI)
                    .unlockedBy("has_lapis_lazuli", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.LAPIS_LAZULI).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.RUBIKS_CUBE.get())
                    .pattern(" y ")
                    .pattern("bir")
                    .pattern(" g ")
                    .define('g', Items.GREEN_DYE)
                    .define('b', Items.BLUE_DYE)
                    .define('r', Items.RED_DYE)
                    .define('y', Items.YELLOW_DYE)
                    .define('i', Items.IRON_NUGGET)
                    .unlockedBy("has_iron_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.IRON_NUGGET).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.RUBIKS_CUBE_PASTEL.get())
                    .pattern(" y ")
                    .pattern("cip")
                    .pattern(" w ")
                    .define('c', Items.CYAN_DYE)
                    .define('w', Items.WHITE_DYE)
                    .define('p', Items.PINK_DYE)
                    .define('y', Items.YELLOW_DYE)
                    .define('i', Items.IRON_NUGGET)
                    .unlockedBy("has_iron_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.IRON_NUGGET).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ROW_OF_SMALL_BOOKS.get())
                    .pattern(" d ")
                    .pattern("bbb")
                    .pattern(" d ")
                    .define('b', Items.BOOK)
                    .define('d', Items.BLUE_DYE)
                    .unlockedBy("has_book", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.BOOK).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ROW_OF_SMALL_BOOKS_PASTEL.get())
                    .pattern(" d ")
                    .pattern("bbb")
                    .pattern(" d ")
                    .define('b', Items.BOOK)
                    .define('d', Items.PINK_DYE)
                    .unlockedBy("has_book", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.BOOK).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.SCATTERED_PAPERS.get(), 2)
                    .pattern("ppp")
                    .pattern("ppp")
                    .define('p', Items.PAPER)
                    .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.PAPER).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.ROW_OF_SMALL_BOOKS_SHELVED.get())
                    .requires(BlockRegistration.SMALL_SHELF.get())
                    .requires(BlockRegistration.ROW_OF_SMALL_BOOKS.get())
                    .unlockedBy("has_row_of_small_books", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(BlockRegistration.ROW_OF_SMALL_BOOKS.get()).build()))
                    .save(consumer);

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.ROW_OF_SMALL_BOOKS_PASTEL_SHELVED.get())
                    .requires(BlockRegistration.SMALL_SHELF_PINK.get())
                    .requires(BlockRegistration.ROW_OF_SMALL_BOOKS_PASTEL_SHELVED.get())
                    .unlockedBy("has_row_of_small_books_pastel", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(BlockRegistration.ROW_OF_SMALL_BOOKS_PASTEL.get()).build()))
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.STAINED_GLASS_LAMP.get())
                    .pattern("nyn")
                    .pattern("yly")
                    .pattern(" i ")
                    .define('y', Items.YELLOW_STAINED_GLASS_PANE)
                    .define('l', Items.REDSTONE_LAMP)
                    .define('i', Items.IRON_INGOT)
                    .define('n', Items.IRON_NUGGET)
                    .unlockedBy("has_redstone_lamp", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.REDSTONE_LAMP).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.SMALL_BUSH.get())
                    .pattern("l")
                    .pattern("s")
                    .define('l', ItemTags.LEAVES)
                    .define('s', Items.STICK)
                    .unlockedBy("has_leaves", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ItemTags.LEAVES).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.TEDDY_BEAR.get())
                    .pattern(" b ")
                    .pattern("bbb")
                    .pattern("b b")
                    .define('b', Items.BROWN_WOOL)
                    .unlockedBy("has_brown_wool", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.BROWN_WOOL).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.SMALL_SHELF.get(), 2)
                    .pattern("sss")
                    .define('s', Items.SPRUCE_SLAB)
                    .unlockedBy("has_spruce_slab", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.SPRUCE_SLAB).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.SMALL_SHELF_PINK.get(), 2)
                    .pattern("sss")
                    .define('s', BlockRegistration.CRABAPPLE_SLAB.get())
                    .unlockedBy("has_crabapple_slab", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(BlockRegistration.CRABAPPLE_SLAB.get()).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.TWO_FLOWER_POTS.get())
                    .pattern("ff")
                    .pattern("pp")
                    .define('f', ItemTags.FLOWERS)
                    .define('p', Items.FLOWER_POT)
                    .unlockedBy("has_flower_pot", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.FLOWER_POT).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.TRADITIONAL_RADIO.get())
                    .pattern(" p ")
                    .pattern("njn")
                    .pattern("ppp")
                    .define('j', Items.JUKEBOX)
                    .define('n', Items.NOTE_BLOCK)
                    .define('p', ItemTags.PLANKS)
                    .unlockedBy("has_jukebox", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.JUKEBOX).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.SEWING_MANNEQUIN.get())
                    .pattern(" w ")
                    .pattern("tat")
                    .pattern("s s")
                    .define('s', Items.STICK)
                    .define('t', Items.STRING)
                    .define('a', Items.ARMOR_STAND)
                    .define('w', Items.WHITE_WOOL)
                    .unlockedBy("has_armor_stand", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.ARMOR_STAND).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.SEWING_MACHINE_ANTIQUE.get())
                    .pattern("iii")
                    .pattern("i t")
                    .pattern("iip")
                    .define('i', Items.IRON_INGOT)
                    .define('t', Items.STRING)
                    .define('p', Items.HEAVY_WEIGHTED_PRESSURE_PLATE)
                    .unlockedBy("has_string", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.STRING).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.WATERING_CAN.get())
                    .pattern("  i")
                    .pattern("ibi")
                    .pattern("iii")
                    .define('i', Items.IRON_INGOT)
                    .define('b', Items.BOWL)
                    .unlockedBy("has_bowl", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.BOWL).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.WATERING_CAN_COPPER.get())
                    .pattern("  i")
                    .pattern("ibi")
                    .pattern("iii")
                    .define('i', Items.COPPER_INGOT)
                    .define('b', Items.BOWL)
                    .unlockedBy("has_bowl", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.BOWL).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.STARS_PENDANT.get(), 4)
                    .pattern("s")
                    .pattern("g")
                    .pattern("s")
                    .define('s', Items.STRING)
                    .define('g', Items.GLOWSTONE_DUST)
                    .unlockedBy("has_glowstone_dust", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.GLOWSTONE_DUST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.MOON_PENDANT.get())
                    .pattern(" sg")
                    .pattern("gg ")
                    .pattern(" gg")
                    .define('s', Items.STRING)
                    .define('g', Items.GLOWSTONE_DUST)
                    .unlockedBy("has_glowstone_dust", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.GLOWSTONE_DUST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.MOON_DECORATION.get())
                    .pattern(" gg")
                    .pattern("g  ")
                    .pattern(" gg")
                    .define('g', Items.GLOWSTONE_DUST)
                    .unlockedBy("has_glowstone_dust", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.GLOWSTONE_DUST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.CAGED_BULB.get())
                    .pattern(" i ")
                    .pattern("ili")
                    .pattern(" i ")
                    .define('i', Items.IRON_BARS)
                    .define('l', Items.LANTERN)
                    .unlockedBy("has_lantern", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.LANTERN).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.COLOSSEO_WALL_LANTERN.get())
                    .pattern("  l")
                    .pattern("iii")
                    .pattern("ii ")
                    .define('i', Items.IRON_BARS)
                    .define('l', Items.LANTERN)
                    .unlockedBy("has_lantern", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.LANTERN).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ANTIQUE_STANDING_LAMP.get())
                    .pattern("rgy")
                    .pattern(" l ")
                    .pattern(" f ")
                    .define('f', ItemTags.WOODEN_FENCES)
                    .define('r', Items.RED_STAINED_GLASS_PANE)
                    .define('g', Items.GREEN_STAINED_GLASS_PANE)
                    .define('y', Items.YELLOW_STAINED_GLASS_PANE)
                    .define('l', Items.REDSTONE_LAMP)
                    .unlockedBy("has_redstone_lamp", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.REDSTONE_LAMP).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.BULLETIN_BOARD.get())
                    .pattern("lil")
                    .define('l', ItemTags.LOGS)
                    .define('i', Items.ITEM_FRAME)
                    .unlockedBy("has_item_frame", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.ITEM_FRAME).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.BULLETIN_BOARD_CLUTTERED.get())
                    .requires(Items.PAPER, 3)
                    .requires(BlockRegistration.BULLETIN_BOARD.get())
                    .unlockedBy("has_bulletin_board", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(BlockRegistration.BULLETIN_BOARD.get()).build()))
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.LOVELY_LOVE_SEAT.get())
                    .pattern("www")
                    .pattern("cwc")
                    .define('w', Items.PINK_WOOL)
                    .define('c', Items.PINK_CONCRETE)
                    .unlockedBy("has_pink_wool", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.PINK_WOOL).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.LOVELY_LOVE_SEAT_BLACK.get())
                    .pattern("www")
                    .pattern("cwc")
                    .define('w', Items.PINK_WOOL)
                    .define('c', Items.BLACK_CONCRETE)
                    .unlockedBy("has_pink_wool", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.PINK_WOOL).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.BLACK_CAT_GARLAND.get(), 4)
                    .pattern("sss")
                    .pattern("bpb")
                    .pattern(" b ")
                    .define('s', Items.STRING)
                    .define('p', Items.PAPER)
                    .define('b', Items.BLACK_DYE)
                    .unlockedBy("has_string", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.STRING).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.BLOSSOM_GARLAND.get(), 4)
                    .pattern("sss")
                    .pattern("f f")
                    .pattern(" f ")
                    .define('s', Items.STRING)
                    .define('f', ItemTags.SMALL_FLOWERS)
                    .unlockedBy("has_string", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.STRING).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.BUNNY_GARLAND.get(), 4)
                    .pattern("sss")
                    .pattern("wpw")
                    .pattern(" w ")
                    .define('s', Items.STRING)
                    .define('w', Items.WHITE_DYE)
                    .define('p', Items.PAPER)
                    .unlockedBy("has_string", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.STRING).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.POLAROID_A_GARLAND.get(), 4)
                    .pattern("sss")
                    .pattern("p p")
                    .pattern(" p ")
                    .define('s', Items.STRING)
                    .define('p', TagRegistration.Items.POLAROID_PICTURE)
                    .unlockedBy("has_string", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.STRING).build()))
                    .showNotification(true)
                    .save(consumer, "polaroid_garland_recipe_1");

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.POLAROID_A_GARLAND.get())
                    .requires(BlockRegistration.POLAROID_B_GARLAND.get())
                    .unlockedBy("has_string", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.STRING).build()))
                    .save(consumer, "polaroid_garland_recipe_2");

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.POLAROID_B_GARLAND.get())
                    .requires(BlockRegistration.POLAROID_A_GARLAND.get())
                    .unlockedBy("has_polaroid_garland_a", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(BlockRegistration.POLAROID_A_GARLAND.get()).build()))
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.SUNFLOWER_GARLAND.get(), 4)
                    .pattern("sss")
                    .pattern("w w")
                    .pattern(" w ")
                    .define('s', Items.STRING)
                    .define('w', Items.SUNFLOWER)
                    .unlockedBy("has_string", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.STRING).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.STARRY_GARLAND.get(), 4)
                    .pattern("sss")
                    .pattern("w w")
                    .pattern(" w ")
                    .define('s', Items.STRING)
                    .define('w', BlockRegistration.STARS_PENDANT.get())
                    .unlockedBy("has_string", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.STRING).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ARMCHAIR_WHITE.get())
                    .pattern("www")
                    .pattern("gwg")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('g', Items.GOLD_NUGGET)
                    .define('w', Items.WHITE_WOOL)
                    .unlockedBy("has_gold_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.GOLD_NUGGET).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ARMCHAIR_LIGHT_GRAY.get())
                    .pattern("www")
                    .pattern("gwg")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('g', Items.GOLD_NUGGET)
                    .define('w', Items.LIGHT_GRAY_WOOL)
                    .unlockedBy("has_gold_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.GOLD_NUGGET).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ARMCHAIR_GRAY.get())
                    .pattern("www")
                    .pattern("gwg")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('g', Items.GOLD_NUGGET)
                    .define('w', Items.GRAY_WOOL)
                    .unlockedBy("has_gold_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.GOLD_NUGGET).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ARMCHAIR_BLACK.get())
                    .pattern("www")
                    .pattern("gwg")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('g', Items.GOLD_NUGGET)
                    .define('w', Items.BLACK_WOOL)
                    .unlockedBy("has_gold_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.GOLD_NUGGET).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ARMCHAIR_BROWN.get())
                    .pattern("www")
                    .pattern("gwg")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('g', Items.GOLD_NUGGET)
                    .define('w', Items.BROWN_WOOL)
                    .unlockedBy("has_gold_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.GOLD_NUGGET).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ARMCHAIR_RED.get())
                    .pattern("www")
                    .pattern("gwg")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('g', Items.GOLD_NUGGET)
                    .define('w', Items.RED_WOOL)
                    .unlockedBy("has_gold_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.GOLD_NUGGET).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ARMCHAIR_ORANGE.get())
                    .pattern("www")
                    .pattern("gwg")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('g', Items.GOLD_NUGGET)
                    .define('w', Items.ORANGE_WOOL)
                    .unlockedBy("has_gold_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.GOLD_NUGGET).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ARMCHAIR_YELLOW.get())
                    .pattern("www")
                    .pattern("gwg")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('g', Items.GOLD_NUGGET)
                    .define('w', Items.YELLOW_WOOL)
                    .unlockedBy("has_gold_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.GOLD_NUGGET).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ARMCHAIR_LIME.get())
                    .pattern("www")
                    .pattern("gwg")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('g', Items.GOLD_NUGGET)
                    .define('w', Items.LIME_WOOL)
                    .unlockedBy("has_gold_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.GOLD_NUGGET).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ARMCHAIR_GREEN.get())
                    .pattern("www")
                    .pattern("gwg")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('g', Items.GOLD_NUGGET)
                    .define('w', Items.GREEN_WOOL)
                    .unlockedBy("has_gold_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.GOLD_NUGGET).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ARMCHAIR_CYAN.get())
                    .pattern("www")
                    .pattern("gwg")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('g', Items.GOLD_NUGGET)
                    .define('w', Items.CYAN_WOOL)
                    .unlockedBy("has_gold_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.GOLD_NUGGET).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ARMCHAIR_LIGHT_BLUE.get())
                    .pattern("www")
                    .pattern("gwg")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('g', Items.GOLD_NUGGET)
                    .define('w', Items.LIGHT_BLUE_WOOL)
                    .unlockedBy("has_gold_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.GOLD_NUGGET).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ARMCHAIR_BLUE.get())
                    .pattern("www")
                    .pattern("gwg")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('g', Items.GOLD_NUGGET)
                    .define('w', Items.BLUE_WOOL)
                    .unlockedBy("has_gold_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.GOLD_NUGGET).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ARMCHAIR_PURPLE.get())
                    .pattern("www")
                    .pattern("gwg")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('g', Items.GOLD_NUGGET)
                    .define('w', Items.PURPLE_WOOL)
                    .unlockedBy("has_gold_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.GOLD_NUGGET).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ARMCHAIR_MAGENTA.get())
                    .pattern("www")
                    .pattern("gwg")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('g', Items.GOLD_NUGGET)
                    .define('w', Items.MAGENTA_WOOL)
                    .unlockedBy("has_gold_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.GOLD_NUGGET).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ARMCHAIR_PINK.get())
                    .pattern("www")
                    .pattern("gwg")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('g', Items.GOLD_NUGGET)
                    .define('w', Items.PINK_WOOL)
                    .unlockedBy("has_gold_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.GOLD_NUGGET).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ARMCHAIR_FUCHSIA.get())
                    .pattern("www")
                    .pattern("gwg")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('g', Items.POPPY)
                    .define('w', Items.MAGENTA_WOOL)
                    .unlockedBy("has_poppy", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.POPPY).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ARMCHAIR_IVORY.get())
                    .pattern("www")
                    .pattern("gwg")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('g', Items.LILY_OF_THE_VALLEY)
                    .define('w', Items.WHITE_WOOL)
                    .unlockedBy("has_lily_of_the_valley", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.LILY_OF_THE_VALLEY).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ARMCHAIR_FLOWER.get())
                    .pattern("www")
                    .pattern("gwg")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('g', Items.OXEYE_DAISY)
                    .define('w', Items.PINK_WOOL)
                    .unlockedBy("has_oxeye_daisy", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.OXEYE_DAISY).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ARMCHAIR_STRAWBERRY.get())
                    .pattern("www")
                    .pattern("gwg")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('g', Items.RED_TULIP)
                    .define('w', Items.PINK_WOOL)
                    .unlockedBy("has_red_tulip", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.RED_TULIP).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ARMCHAIR_HEART.get())
                    .pattern("www")
                    .pattern("gwg")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('g', Items.ROSE_BUSH)
                    .define('w', Items.WHITE_WOOL)
                    .unlockedBy("has_rose_bush", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.ROSE_BUSH).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ARMCHAIR_WATERMELON.get())
                    .pattern("www")
                    .pattern("gwg")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('g', Items.PINK_TULIP)
                    .define('w', Items.LIME_WOOL)
                    .unlockedBy("has_pink_tulip", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.PINK_TULIP).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ARMCHAIR_LEMON.get())
                    .pattern("www")
                    .pattern("gwg")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('g', Items.DANDELION)
                    .define('w', Items.LIGHT_BLUE_WOOL)
                    .unlockedBy("has_pink_tulip", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.PINK_TULIP).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ARMCHAIR_STARRY.get())
                    .pattern("www")
                    .pattern("gwg")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('g', Items.SUNFLOWER)
                    .define('w', Items.BLUE_WOOL)
                    .unlockedBy("has_sunflower", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.SUNFLOWER).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ARMCHAIR_BLACK_CAT.get())
                    .pattern("www")
                    .pattern("gwg")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('g', Items.WITHER_ROSE)
                    .define('w', Items.BLACK_WOOL)
                    .unlockedBy("has_wither_rose", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.WITHER_ROSE).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.COTTAGE_ARMCHAIR.get())
                    .pattern("p p")
                    .pattern("pwp")
                    .pattern("pwp")
                    .define('p', Items.PINK_WOOL)
                    .define('w', Items.WHITE_WOOL)
                    .unlockedBy("has_pink_wool", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.PINK_WOOL).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.DARKWOOD_CHAIR_GEOMETRIC.get())
                    .pattern("fcf")
                    .pattern("fof")
                    .pattern("fff")
                    .define('f', Items.SPRUCE_FENCE)
                    .define('o', Items.ORANGE_WOOL)
                    .define('c', Items.CYAN_CARPET)
                    .unlockedBy("has_spruce_fence", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.SPRUCE_FENCE).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.DARKWOOD_CHAIR_QUILTED.get())
                    .pattern("fbf")
                    .pattern("flf")
                    .pattern("fff")
                    .define('f', Items.SPRUCE_FENCE)
                    .define('l', Items.LIGHT_BLUE_WOOL)
                    .define('b', Items.BLUE_CARPET)
                    .unlockedBy("has_spruce_fence", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.SPRUCE_FENCE).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.DARKWOOD_CHAIR_SOUTHERN_FLAIR.get())
                    .pattern("fgf")
                    .pattern("frf")
                    .pattern("fff")
                    .define('f', Items.SPRUCE_FENCE)
                    .define('g', Items.GREEN_CARPET)
                    .define('r', Items.RED_WOOL)
                    .unlockedBy("has_spruce_fence", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.SPRUCE_FENCE).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.DARKWOOD_SOFA_GEOMETRIC.get())
                    .pattern("cc")
                    .define('c', BlockRegistration.DARKWOOD_CHAIR_GEOMETRIC.get())
                    .unlockedBy("has_spruce_fence", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.SPRUCE_FENCE).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.DARKWOOD_SOFA_QUILTED.get())
                    .pattern("cc")
                    .define('c', BlockRegistration.DARKWOOD_CHAIR_QUILTED.get())
                    .unlockedBy("has_spruce_fence", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.SPRUCE_FENCE).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.DARKWOOD_SOFA_SOUTHERN_FLAIR.get())
                    .pattern("cc")
                    .define('c', BlockRegistration.DARKWOOD_CHAIR_SOUTHERN_FLAIR.get())
                    .unlockedBy("has_spruce_fence", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.SPRUCE_FENCE).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.DARKWOOD_DECORATIVE_SHELVES_GEOMETRIC.get())
                    .pattern(" ct")
                    .pattern("sss")
                    .pattern("bbb")
                    .define('b', Items.BOOKSHELF)
                    .define('s', Items.SPRUCE_SLAB)
                    .define('c', Items.ORANGE_CARPET)
                    .define('t', Items.CYAN_CARPET)
                    .unlockedBy("has_spruce_slab", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.SPRUCE_SLAB).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.DARKWOOD_DECORATIVE_SHELVES_QUILTED.get())
                    .pattern(" ct")
                    .pattern("sss")
                    .pattern("bbb")
                    .define('b', Items.BOOKSHELF)
                    .define('s', Items.SPRUCE_SLAB)
                    .define('c', Items.BLUE_CARPET)
                    .define('t', Items.LIGHT_BLUE_CARPET)
                    .unlockedBy("has_spruce_slab", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.SPRUCE_SLAB).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.DARKWOOD_DECORATIVE_SHELVES_SOUTHERN_FLAIR.get())
                    .pattern(" ct")
                    .pattern("sss")
                    .pattern("bbb")
                    .define('b', Items.BOOKSHELF)
                    .define('s', Items.SPRUCE_SLAB)
                    .define('c', Items.GREEN_CARPET)
                    .define('t', Items.RED_CARPET)
                    .unlockedBy("has_spruce_slab", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.SPRUCE_SLAB).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.DARKWOOD_ENDTABLE.get())
                    .pattern(" s ")
                    .pattern("sbs")
                    .pattern(" s ")
                    .define('b', Items.BOOKSHELF)
                    .define('s', Items.SPRUCE_LOG)
                    .unlockedBy("has_bookshelf", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.BOOKSHELF).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.DARKWOOD_TABLE.get())
                    .pattern("sss")
                    .pattern("d d")
                    .define('d', BlockRegistration.DARKWOOD_STOOL.get())
                    .define('s', Items.SPRUCE_SLAB)
                    .unlockedBy("has_spruce_slab", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.SPRUCE_SLAB).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.DARKWOOD_STOOL.get(), 2)
                    .requires(Items.SPRUCE_LOG)
                    .requires(Items.WOODEN_AXE)
                    .unlockedBy("has_spruce_log", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.SPRUCE_LOG).build()))
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.DARKWOOD_CABINET.get())
                    .pattern("ss")
                    .pattern("jr")
                    .pattern("bb")
                    .define('s', Items.SPRUCE_SLAB)
                    .define('j', Items.GLASS_BOTTLE)
                    .define('r', Items.BOOK)
                    .define('b', Items.BARREL)
                    .unlockedBy("has_barrel", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.BARREL).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.DARKWOOD_CLOCK.get())
                    .requires(Items.CLOCK)
                    .requires(Items.SPRUCE_LOG)
                    .unlockedBy("has_spruce_log", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.SPRUCE_LOG).build()))
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.DARKWOOD_BED_GEOMETRIC.get())
                    .pattern("ss")
                    .pattern("go")
                    .pattern("ss")
                    .define('s', Items.SPRUCE_LOG)
                    .define('g', Items.CYAN_BED)
                    .define('o', Items.ORANGE_BED)
                    .unlockedBy("has_spruce_log", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.SPRUCE_LOG).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.DARKWOOD_BED_QUILTED.get())
                    .pattern("ss")
                    .pattern("bl")
                    .pattern("ss")
                    .define('s', Items.SPRUCE_LOG)
                    .define('b', Items.BLUE_BED)
                    .define('l', Items.LIGHT_BLUE_BED)
                    .unlockedBy("has_spruce_log", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.SPRUCE_LOG).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.DARKWOOD_BED_SOUTHERN_FLAIR.get())
                    .pattern("ss")
                    .pattern("gr")
                    .pattern("ss")
                    .define('s', Items.SPRUCE_LOG)
                    .define('r', Items.RED_BED)
                    .define('g', Items.GREEN_BED)
                    .unlockedBy("has_spruce_log", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.SPRUCE_LOG).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.TABLE_PLAIN.get())
                    .pattern("sss")
                    .pattern("f f")
                    .define('s', Items.DARK_OAK_SLAB)
                    .define('f', Items.DARK_OAK_FENCE)
                    .unlockedBy("has_dark_oak_slab", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.DARK_OAK_SLAB).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.TABLE_TABLECLOTH.get())
                    .pattern("cbc")
                    .pattern("sss")
                    .pattern("f f")
                    .define('s', Items.DARK_OAK_SLAB)
                    .define('c', Items.WHITE_CARPET)
                    .define('b', Items.BLUE_CARPET)
                    .define('f', Items.DARK_OAK_FENCE)
                    .unlockedBy("has_dark_oak_slab", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.DARK_OAK_SLAB).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.HAVANA_CABINET.get())
                    .pattern("pcp")
                    .pattern("sss")
                    .pattern("pcp")
                    .define('p', BlockRegistration.SYCAMORE_PLANKS.get())
                    .define('s', Items.OAK_SLAB)
                    .define('c', Items.CHEST)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.HAVANA_CABINET_CLUTTERED.get())
                    .requires(BlockRegistration.HAVANA_CABINET.get())
                    .requires(Items.GLASS_BOTTLE)
                    .requires(Items.PAPER)
                    .requires(Items.BOWL)
                    .unlockedBy("has_havana_cabinet", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(BlockRegistration.HAVANA_CABINET.get()).build()))
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.DORADO_CABINET.get())
                    .pattern("pcp")
                    .pattern("sss")
                    .pattern("pcp")
                    .define('p', Items.SPRUCE_PLANKS)
                    .define('s', Items.OAK_SLAB)
                    .define('c', Items.CHEST)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.DORADO_CABINET_CLUTTERED.get())
                    .requires(BlockRegistration.DORADO_CABINET.get())
                    .requires(Items.GLASS_BOTTLE)
                    .requires(Items.PAPER)
                    .requires(Items.BOWL)
                    .unlockedBy("has_dorado_cabinet", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(BlockRegistration.DORADO_CABINET.get()).build()))
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.MUREX_CABINET.get())
                    .pattern("pcp")
                    .pattern("sss")
                    .pattern("pcp")
                    .define('p', BlockRegistration.WILLOW_PLANKS.get())
                    .define('s', Items.DARK_OAK_SLAB)
                    .define('c', Items.CHEST)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.MUREX_CABINET_CLUTTERED.get())
                    .requires(BlockRegistration.MUREX_CABINET.get())
                    .requires(Items.GLASS_BOTTLE)
                    .requires(Items.PAPER)
                    .requires(Items.BOWL)
                    .unlockedBy("has_murex_cabinet", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(BlockRegistration.MUREX_CABINET.get()).build()))
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_BROWN_COUNTER.get())
                    .pattern("sss")
                    .pattern("pdp")
                    .pattern("pcp")
                    .define('p', ItemTags.PLANKS)
                    .define('s', ItemTags.STONE_CRAFTING_MATERIALS)
                    .define('c', Items.CHEST)
                    .define('d', Items.BROWN_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_BROWN_COUNTER_INNER_CORNER.get())
                    .pattern("sss")
                    .pattern("pdp")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('s', ItemTags.STONE_CRAFTING_MATERIALS)
                    .define('d', Items.BROWN_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_BROWN_COUNTER_OUTER_CORNER_RIGHT.get())
                    .pattern("ssp")
                    .pattern("pdp")
                    .pattern("pcp")
                    .define('p', ItemTags.PLANKS)
                    .define('s', ItemTags.STONE_CRAFTING_MATERIALS)
                    .define('c', Items.CHEST)
                    .define('d', Items.BROWN_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer,"brown_outer_counter_right_recipe_1");

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_BROWN_COUNTER_OUTER_CORNER_RIGHT.get())
                    .requires(BlockRegistration.KITCHEN_SET_BROWN_COUNTER_OUTER_CORNER_LEFT.get())
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .save(consumer, "brown_outer_counter_right_recipe_2");

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_BROWN_COUNTER_OUTER_CORNER_LEFT.get())
                        .pattern("pss")
                        .pattern("pdp")
                        .pattern("pcp")
                        .define('p', ItemTags.PLANKS)
                        .define('s', ItemTags.STONE_CRAFTING_MATERIALS)
                        .define('c', Items.CHEST)
                        .define('d', Items.BROWN_DYE)
                        .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.CHEST).build()))
                        .showNotification(true)
                        .save(consumer, "brown_outer_counter_left_recipe_1");

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_BROWN_COUNTER_OUTER_CORNER_LEFT.get())
                    .requires(BlockRegistration.KITCHEN_SET_BROWN_COUNTER_OUTER_CORNER_LEFT.get())
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .save(consumer, "brown_outer_counter_left_recipe_2");

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_BROWN_COUNTER_SINK.get())
                    .pattern("sbs")
                    .pattern("pdp")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('s', ItemTags.STONE_CRAFTING_MATERIALS)
                    .define('b', Items.BUCKET)
                    .define('d', Items.BROWN_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_BROWN_CABINET.get())
                    .pattern("pdp")
                    .pattern("pcp")
                    .pattern("pdp")
                    .define('p', ItemTags.PLANKS)
                    .define('c', Items.CHEST)
                    .define('d', Items.BROWN_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_BROWN_CABINET_MINI.get())
                    .pattern("pdp")
                    .pattern("pcp")
                    .define('p', ItemTags.PLANKS)
                    .define('c', Items.CHEST)
                    .define('d', Items.BROWN_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_BROWN_CABINET_GLASS.get())
                    .pattern("pdp")
                    .pattern("gcg")
                    .pattern("pdp")
                    .define('p', ItemTags.PLANKS)
                    .define('c', Items.CHEST)
                    .define('d', Items.BROWN_DYE)
                    .define('g', Items.GLASS_PANE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_BROWN_CABINET_OPEN.get())
                    .pattern("pdp")
                    .pattern(" c ")
                    .pattern("pdp")
                    .define('p', ItemTags.PLANKS)
                    .define('c', Items.CHEST)
                    .define('d', Items.BROWN_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_BROWN_CABINET_INNER_CORNER.get())
                    .pattern("pgp")
                    .pattern("dcd")
                    .pattern("pgp")
                    .define('p', ItemTags.PLANKS)
                    .define('c', Items.CHEST)
                    .define('d', Items.BROWN_DYE)
                    .define('g', Items.GLASS_PANE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_BROWN_CABINET_OUTER_CORNER.get())
                    .pattern("pg")
                    .pattern("dc")
                    .pattern("pg")
                    .define('p', ItemTags.PLANKS)
                    .define('c', Items.CHEST)
                    .define('d', Items.BROWN_DYE)
                    .define('g', Items.GLASS_PANE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER.get())
                    .pattern("sss")
                    .pattern("pdp")
                    .pattern("pcp")
                    .define('p', ItemTags.PLANKS)
                    .define('s', ItemTags.STONE_CRAFTING_MATERIALS)
                    .define('c', Items.CHEST)
                    .define('d', Items.LIME_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_INNER_CORNER.get())
                    .pattern("sss")
                    .pattern("pdp")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('s', ItemTags.STONE_CRAFTING_MATERIALS)
                    .define('d', Items.LIME_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_OUTER_CORNER_RIGHT.get())
                    .pattern("ssp")
                    .pattern("pdp")
                    .pattern("pcp")
                    .define('p', ItemTags.PLANKS)
                    .define('s', ItemTags.STONE_CRAFTING_MATERIALS)
                    .define('c', Items.CHEST)
                    .define('d', Items.LIME_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer,"light_green_outer_counter_right_recipe_1");

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_OUTER_CORNER_RIGHT.get())
                    .requires(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_OUTER_CORNER_LEFT.get())
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .save(consumer, "light_green_outer_counter_right_recipe_2");

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_OUTER_CORNER_LEFT.get())
                        .pattern("pss")
                        .pattern("pdp")
                        .pattern("pcp")
                        .define('p', ItemTags.PLANKS)
                        .define('s', ItemTags.STONE_CRAFTING_MATERIALS)
                        .define('c', Items.CHEST)
                        .define('d', Items.LIME_DYE)
                        .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.CHEST).build()))
                        .showNotification(true)
                        .save(consumer, "light_green_outer_counter_left_recipe_1");

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_OUTER_CORNER_LEFT.get())
                    .requires(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_OUTER_CORNER_LEFT.get())
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .save(consumer, "light_green_outer_counter_left_recipe_2");

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_SINK.get())
                    .pattern("sbs")
                    .pattern("pdp")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('s', ItemTags.STONE_CRAFTING_MATERIALS)
                    .define('b', Items.BUCKET)
                    .define('d', Items.LIME_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET.get())
                    .pattern("pdp")
                    .pattern("pcp")
                    .pattern("pdp")
                    .define('p', ItemTags.PLANKS)
                    .define('c', Items.CHEST)
                    .define('d', Items.LIME_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_MINI.get())
                    .pattern("pdp")
                    .pattern("pcp")
                    .define('p', ItemTags.PLANKS)
                    .define('c', Items.CHEST)
                    .define('d', Items.LIME_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_GLASS.get())
                    .pattern("pdp")
                    .pattern("gcg")
                    .pattern("pdp")
                    .define('p', ItemTags.PLANKS)
                    .define('c', Items.CHEST)
                    .define('d', Items.LIME_DYE)
                    .define('g', Items.GLASS_PANE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_OPEN.get())
                    .pattern("pdp")
                    .pattern(" c ")
                    .pattern("pdp")
                    .define('p', ItemTags.PLANKS)
                    .define('c', Items.CHEST)
                    .define('d', Items.LIME_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_INNER_CORNER.get())
                    .pattern("pgp")
                    .pattern("dcd")
                    .pattern("pgp")
                    .define('p', ItemTags.PLANKS)
                    .define('c', Items.CHEST)
                    .define('d', Items.LIME_DYE)
                    .define('g', Items.GLASS_PANE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_OUTER_CORNER.get())
                    .pattern("pg")
                    .pattern("dc")
                    .pattern("pg")
                    .define('p', ItemTags.PLANKS)
                    .define('c', Items.CHEST)
                    .define('d', Items.LIME_DYE)
                    .define('g', Items.GLASS_PANE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_PINK_COUNTER.get())
                    .pattern("sss")
                    .pattern("pdp")
                    .pattern("pcp")
                    .define('p', ItemTags.PLANKS)
                    .define('s', ItemTags.STONE_CRAFTING_MATERIALS)
                    .define('c', Items.CHEST)
                    .define('d', Items.PINK_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_PINK_COUNTER_INNER_CORNER.get())
                    .pattern("sss")
                    .pattern("pdp")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('s', ItemTags.STONE_CRAFTING_MATERIALS)
                    .define('d', Items.PINK_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_PINK_COUNTER_OUTER_CORNER_RIGHT.get())
                    .pattern("ssp")
                    .pattern("pdp")
                    .pattern("pcp")
                    .define('p', ItemTags.PLANKS)
                    .define('s', ItemTags.STONE_CRAFTING_MATERIALS)
                    .define('c', Items.CHEST)
                    .define('d', Items.PINK_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer,"pink_outer_counter_right_recipe_1");

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_PINK_COUNTER_OUTER_CORNER_RIGHT.get())
                    .requires(BlockRegistration.KITCHEN_SET_PINK_COUNTER_OUTER_CORNER_LEFT.get())
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .save(consumer, "pink_outer_counter_right_recipe_2");

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_PINK_COUNTER_OUTER_CORNER_LEFT.get())
                        .pattern("pss")
                        .pattern("pdp")
                        .pattern("pcp")
                        .define('p', ItemTags.PLANKS)
                        .define('s', ItemTags.STONE_CRAFTING_MATERIALS)
                        .define('c', Items.CHEST)
                        .define('d', Items.PINK_DYE)
                        .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.CHEST).build()))
                        .showNotification(true)
                        .save(consumer, "pink_outer_counter_left_recipe_1");

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_PINK_COUNTER_OUTER_CORNER_LEFT.get())
                    .requires(BlockRegistration.KITCHEN_SET_PINK_COUNTER_OUTER_CORNER_LEFT.get())
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .save(consumer, "pink_outer_counter_left_recipe_2");

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_PINK_COUNTER_SINK.get())
                    .pattern("sbs")
                    .pattern("pdp")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('s', ItemTags.STONE_CRAFTING_MATERIALS)
                    .define('b', Items.BUCKET)
                    .define('d', Items.PINK_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_PINK_CABINET.get())
                    .pattern("pdp")
                    .pattern("pcp")
                    .pattern("pdp")
                    .define('p', ItemTags.PLANKS)
                    .define('c', Items.CHEST)
                    .define('d', Items.PINK_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_PINK_CABINET_MINI.get())
                    .pattern("pdp")
                    .pattern("pcp")
                    .define('p', ItemTags.PLANKS)
                    .define('c', Items.CHEST)
                    .define('d', Items.PINK_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_PINK_CABINET_GLASS.get())
                    .pattern("pdp")
                    .pattern("gcg")
                    .pattern("pdp")
                    .define('p', ItemTags.PLANKS)
                    .define('c', Items.CHEST)
                    .define('d', Items.PINK_DYE)
                    .define('g', Items.GLASS_PANE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_PINK_CABINET_OPEN.get())
                    .pattern("pdp")
                    .pattern(" c ")
                    .pattern("pdp")
                    .define('p', ItemTags.PLANKS)
                    .define('c', Items.CHEST)
                    .define('d', Items.PINK_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_PINK_CABINET_INNER_CORNER.get())
                    .pattern("pgp")
                    .pattern("dcd")
                    .pattern("pgp")
                    .define('p', ItemTags.PLANKS)
                    .define('c', Items.CHEST)
                    .define('d', Items.PINK_DYE)
                    .define('g', Items.GLASS_PANE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_PINK_CABINET_OUTER_CORNER.get())
                    .pattern("pg")
                    .pattern("dc")
                    .pattern("pg")
                    .define('p', ItemTags.PLANKS)
                    .define('c', Items.CHEST)
                    .define('d', Items.PINK_DYE)
                    .define('g', Items.GLASS_PANE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_PURPLE_COUNTER.get())
                    .pattern("sss")
                    .pattern("pdp")
                    .pattern("pcp")
                    .define('p', ItemTags.PLANKS)
                    .define('s', ItemTags.STONE_CRAFTING_MATERIALS)
                    .define('c', Items.CHEST)
                    .define('d', Items.PURPLE_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_PURPLE_COUNTER_INNER_CORNER.get())
                    .pattern("sss")
                    .pattern("pdp")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('s', ItemTags.STONE_CRAFTING_MATERIALS)
                    .define('d', Items.PURPLE_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_PURPLE_COUNTER_OUTER_CORNER_RIGHT.get())
                    .pattern("ssp")
                    .pattern("pdp")
                    .pattern("pcp")
                    .define('p', ItemTags.PLANKS)
                    .define('s', ItemTags.STONE_CRAFTING_MATERIALS)
                    .define('c', Items.CHEST)
                    .define('d', Items.PURPLE_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer,"purple_outer_counter_right_recipe_1");

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_PURPLE_COUNTER_OUTER_CORNER_RIGHT.get())
                    .requires(BlockRegistration.KITCHEN_SET_PURPLE_COUNTER_OUTER_CORNER_LEFT.get())
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .save(consumer, "purple_outer_counter_right_recipe_2");

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_PURPLE_COUNTER_OUTER_CORNER_LEFT.get())
                        .pattern("pss")
                        .pattern("pdp")
                        .pattern("pcp")
                        .define('p', ItemTags.PLANKS)
                        .define('s', ItemTags.STONE_CRAFTING_MATERIALS)
                        .define('c', Items.CHEST)
                        .define('d', Items.PURPLE_DYE)
                        .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.CHEST).build()))
                        .showNotification(true)
                        .save(consumer, "purple_outer_counter_left_recipe_1");

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_PURPLE_COUNTER_OUTER_CORNER_LEFT.get())
                    .requires(BlockRegistration.KITCHEN_SET_PURPLE_COUNTER_OUTER_CORNER_LEFT.get())
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .save(consumer, "purple_outer_counter_left_recipe_2");

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_PURPLE_COUNTER_SINK.get())
                    .pattern("sbs")
                    .pattern("pdp")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('s', ItemTags.STONE_CRAFTING_MATERIALS)
                    .define('b', Items.BUCKET)
                    .define('d', Items.PURPLE_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_PURPLE_CABINET.get())
                    .pattern("pdp")
                    .pattern("pcp")
                    .pattern("pdp")
                    .define('p', ItemTags.PLANKS)
                    .define('c', Items.CHEST)
                    .define('d', Items.PURPLE_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_PURPLE_CABINET_MINI.get())
                    .pattern("pdp")
                    .pattern("pcp")
                    .define('p', ItemTags.PLANKS)
                    .define('c', Items.CHEST)
                    .define('d', Items.PURPLE_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_PURPLE_CABINET_GLASS.get())
                    .pattern("pdp")
                    .pattern("gcg")
                    .pattern("pdp")
                    .define('p', ItemTags.PLANKS)
                    .define('c', Items.CHEST)
                    .define('d', Items.PURPLE_DYE)
                    .define('g', Items.GLASS_PANE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_PURPLE_CABINET_OPEN.get())
                    .pattern("pdp")
                    .pattern(" c ")
                    .pattern("pdp")
                    .define('p', ItemTags.PLANKS)
                    .define('c', Items.CHEST)
                    .define('d', Items.PURPLE_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_PURPLE_CABINET_INNER_CORNER.get())
                    .pattern("pgp")
                    .pattern("dcd")
                    .pattern("pgp")
                    .define('p', ItemTags.PLANKS)
                    .define('c', Items.CHEST)
                    .define('d', Items.PURPLE_DYE)
                    .define('g', Items.GLASS_PANE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_PURPLE_CABINET_OUTER_CORNER.get())
                    .pattern("pg")
                    .pattern("dc")
                    .pattern("pg")
                    .define('p', ItemTags.PLANKS)
                    .define('c', Items.CHEST)
                    .define('d', Items.PURPLE_DYE)
                    .define('g', Items.GLASS_PANE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_WHITE_COUNTER.get())
                    .pattern("sss")
                    .pattern("pdp")
                    .pattern("pcp")
                    .define('p', ItemTags.PLANKS)
                    .define('s', ItemTags.STONE_CRAFTING_MATERIALS)
                    .define('c', Items.CHEST)
                    .define('d', Items.WHITE_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_WHITE_COUNTER_INNER_CORNER.get())
                    .pattern("sss")
                    .pattern("pdp")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('s', ItemTags.STONE_CRAFTING_MATERIALS)
                    .define('d', Items.WHITE_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_WHITE_COUNTER_OUTER_CORNER_RIGHT.get())
                    .pattern("ssp")
                    .pattern("pdp")
                    .pattern("pcp")
                    .define('p', ItemTags.PLANKS)
                    .define('s', ItemTags.STONE_CRAFTING_MATERIALS)
                    .define('c', Items.CHEST)
                    .define('d', Items.WHITE_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer,"white_outer_counter_right_recipe_1");

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_WHITE_COUNTER_OUTER_CORNER_RIGHT.get())
                    .requires(BlockRegistration.KITCHEN_SET_WHITE_COUNTER_OUTER_CORNER_LEFT.get())
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .save(consumer, "white_outer_counter_right_recipe_2");

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_WHITE_COUNTER_OUTER_CORNER_LEFT.get())
                        .pattern("pss")
                        .pattern("pdp")
                        .pattern("pcp")
                        .define('p', ItemTags.PLANKS)
                        .define('s', ItemTags.STONE_CRAFTING_MATERIALS)
                        .define('c', Items.CHEST)
                        .define('d', Items.WHITE_DYE)
                        .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.CHEST).build()))
                        .showNotification(true)
                        .save(consumer, "white_outer_counter_left_recipe_1");

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_WHITE_COUNTER_OUTER_CORNER_LEFT.get())
                    .requires(BlockRegistration.KITCHEN_SET_WHITE_COUNTER_OUTER_CORNER_LEFT.get())
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .save(consumer, "white_outer_counter_left_recipe_2");

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_WHITE_COUNTER_SINK.get())
                    .pattern("sbs")
                    .pattern("pdp")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('s', ItemTags.STONE_CRAFTING_MATERIALS)
                    .define('b', Items.BUCKET)
                    .define('d', Items.WHITE_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_WHITE_CABINET.get())
                    .pattern("pdp")
                    .pattern("pcp")
                    .pattern("pdp")
                    .define('p', ItemTags.PLANKS)
                    .define('c', Items.CHEST)
                    .define('d', Items.WHITE_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_WHITE_CABINET_MINI.get())
                    .pattern("pdp")
                    .pattern("pcp")
                    .define('p', ItemTags.PLANKS)
                    .define('c', Items.CHEST)
                    .define('d', Items.WHITE_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_WHITE_CABINET_GLASS.get())
                    .pattern("pdp")
                    .pattern("gcg")
                    .pattern("pdp")
                    .define('p', ItemTags.PLANKS)
                    .define('c', Items.CHEST)
                    .define('d', Items.WHITE_DYE)
                    .define('g', Items.GLASS_PANE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_WHITE_CABINET_OPEN.get())
                    .pattern("pdp")
                    .pattern(" c ")
                    .pattern("pdp")
                    .define('p', ItemTags.PLANKS)
                    .define('c', Items.CHEST)
                    .define('d', Items.WHITE_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_WHITE_CABINET_INNER_CORNER.get())
                    .pattern("pgp")
                    .pattern("dcd")
                    .pattern("pgp")
                    .define('p', ItemTags.PLANKS)
                    .define('c', Items.CHEST)
                    .define('d', Items.WHITE_DYE)
                    .define('g', Items.GLASS_PANE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_WHITE_CABINET_OUTER_CORNER.get())
                    .pattern("pg")
                    .pattern("dc")
                    .pattern("pg")
                    .define('p', ItemTags.PLANKS)
                    .define('c', Items.CHEST)
                    .define('d', Items.WHITE_DYE)
                    .define('g', Items.GLASS_PANE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_YELLOW_COUNTER.get())
                    .pattern("sss")
                    .pattern("pdp")
                    .pattern("pcp")
                    .define('p', ItemTags.PLANKS)
                    .define('s', ItemTags.STONE_CRAFTING_MATERIALS)
                    .define('c', Items.CHEST)
                    .define('d', Items.YELLOW_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_YELLOW_COUNTER_INNER_CORNER.get())
                    .pattern("sss")
                    .pattern("pdp")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('s', ItemTags.STONE_CRAFTING_MATERIALS)
                    .define('d', Items.YELLOW_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_YELLOW_COUNTER_OUTER_CORNER_RIGHT.get())
                    .pattern("ssp")
                    .pattern("pdp")
                    .pattern("pcp")
                    .define('p', ItemTags.PLANKS)
                    .define('s', ItemTags.STONE_CRAFTING_MATERIALS)
                    .define('c', Items.CHEST)
                    .define('d', Items.YELLOW_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer,"yellow_outer_counter_right_recipe_1");

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_YELLOW_COUNTER_OUTER_CORNER_RIGHT.get())
                    .requires(BlockRegistration.KITCHEN_SET_YELLOW_COUNTER_OUTER_CORNER_LEFT.get())
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .save(consumer, "yellow_outer_counter_right_recipe_2");

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_YELLOW_COUNTER_OUTER_CORNER_LEFT.get())
                        .pattern("pss")
                        .pattern("pdp")
                        .pattern("pcp")
                        .define('p', ItemTags.PLANKS)
                        .define('s', ItemTags.STONE_CRAFTING_MATERIALS)
                        .define('c', Items.CHEST)
                        .define('d', Items.YELLOW_DYE)
                        .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                                ItemPredicate.Builder.item().of(Items.CHEST).build()))
                        .showNotification(true)
                        .save(consumer, "yellow_outer_counter_left_recipe_1");

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_YELLOW_COUNTER_OUTER_CORNER_LEFT.get())
                    .requires(BlockRegistration.KITCHEN_SET_YELLOW_COUNTER_OUTER_CORNER_LEFT.get())
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .save(consumer, "yellow_outer_counter_left_recipe_2");

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_YELLOW_COUNTER_SINK.get())
                    .pattern("sbs")
                    .pattern("pdp")
                    .pattern("ppp")
                    .define('p', ItemTags.PLANKS)
                    .define('s', ItemTags.STONE_CRAFTING_MATERIALS)
                    .define('b', Items.BUCKET)
                    .define('d', Items.YELLOW_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_YELLOW_CABINET.get())
                    .pattern("pdp")
                    .pattern("pcp")
                    .pattern("pdp")
                    .define('p', ItemTags.PLANKS)
                    .define('c', Items.CHEST)
                    .define('d', Items.YELLOW_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_YELLOW_CABINET_MINI.get())
                    .pattern("pdp")
                    .pattern("pcp")
                    .define('p', ItemTags.PLANKS)
                    .define('c', Items.CHEST)
                    .define('d', Items.YELLOW_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_YELLOW_CABINET_GLASS.get())
                    .pattern("pdp")
                    .pattern("gcg")
                    .pattern("pdp")
                    .define('p', ItemTags.PLANKS)
                    .define('c', Items.CHEST)
                    .define('d', Items.YELLOW_DYE)
                    .define('g', Items.GLASS_PANE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_YELLOW_CABINET_OPEN.get())
                    .pattern("pdp")
                    .pattern(" c ")
                    .pattern("pdp")
                    .define('p', ItemTags.PLANKS)
                    .define('c', Items.CHEST)
                    .define('d', Items.YELLOW_DYE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_YELLOW_CABINET_INNER_CORNER.get())
                    .pattern("pgp")
                    .pattern("dcd")
                    .pattern("pgp")
                    .define('p', ItemTags.PLANKS)
                    .define('c', Items.CHEST)
                    .define('d', Items.YELLOW_DYE)
                    .define('g', Items.GLASS_PANE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.KITCHEN_SET_YELLOW_CABINET_OUTER_CORNER.get())
                    .pattern("pg")
                    .pattern("dc")
                    .pattern("pg")
                    .define('p', ItemTags.PLANKS)
                    .define('c', Items.CHEST)
                    .define('d', Items.YELLOW_DYE)
                    .define('g', Items.GLASS_PANE)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.BLACK_CAT_COUNTER_DRAWERS.get())
                    .pattern("ttt")
                    .pattern("pcp")
                    .pattern("ppp")
                    .define('p', BlockRegistration.WILLOW_PLANKS.get())
                    .define('c', Items.CHEST)
                    .define('t', BlockRegistration.SMALL_PURPLE_TILES.get())
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.BLACK_CAT_COUNTER_LEFT_DOOR.get())
                    .pattern("ttt")
                    .pattern("ppc")
                    .pattern("ppp")
                    .define('p', BlockRegistration.WILLOW_PLANKS.get())
                    .define('c', Items.CHEST)
                    .define('t', BlockRegistration.SMALL_PURPLE_TILES.get())
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer, "black_cat_counter_left_recipe_1");

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.BLACK_CAT_COUNTER_LEFT_DOOR.get())
                    .requires(BlockRegistration.BLACK_CAT_COUNTER_RIGHT_DOOR.get())
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .save(consumer, "black_cat_counter_left_recipe_2");

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.BLACK_CAT_COUNTER_RIGHT_DOOR.get())
                    .pattern("ttt")
                    .pattern("cpp")
                    .pattern("ppp")
                    .define('p', BlockRegistration.WILLOW_PLANKS.get())
                    .define('c', Items.CHEST)
                    .define('t', BlockRegistration.SMALL_PURPLE_TILES.get())
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer, "black_cat_counter_right_recipe_1");

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.BLACK_CAT_COUNTER_RIGHT_DOOR.get())
                    .requires(BlockRegistration.BLACK_CAT_COUNTER_LEFT_DOOR.get())
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .save(consumer, "black_cat_counter_right_recipe_2");

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.BLACK_CAT_SINK.get())
                    .pattern("tbt")
                    .pattern("ppp")
                    .pattern("ppp")
                    .define('p', BlockRegistration.WILLOW_PLANKS.get())
                    .define('b', Items.BUCKET)
                    .define('t', BlockRegistration.SMALL_PURPLE_TILES.get())
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.BLACK_CAT_TABLE.get())
                    .pattern("ttt")
                    .pattern("p p")
                    .pattern("p p")
                    .define('p', BlockRegistration.WILLOW_PLANKS.get())
                    .define('t', BlockRegistration.SMALL_PURPLE_TILES.get())
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);


            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.SWEETHEART_COUNTER_DRAWERS.get())
                    .pattern("ttt")
                    .pattern("pcp")
                    .pattern("ppp")
                    .define('p', Items.JUNGLE_PLANKS)
                    .define('c', Items.CHEST)
                    .define('t', BlockRegistration.MARBLE_SMALL_TILES.get())
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.SWEETHEART_COUNTER_LEFT_DOOR.get())
                    .pattern("ttt")
                    .pattern("ppc")
                    .pattern("ppp")
                    .define('p', Items.JUNGLE_PLANKS)
                    .define('c', Items.CHEST)
                    .define('t', BlockRegistration.MARBLE_SMALL_TILES.get())
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer,"sweetheart_counter_left_recipe_1");

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.SWEETHEART_COUNTER_LEFT_DOOR.get())
                    .requires(BlockRegistration.SWEETHEART_COUNTER_RIGHT_DOOR.get())
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .save(consumer, "sweetheart_counter_left_recipe_2");

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.SWEETHEART_COUNTER_RIGHT_DOOR.get())
                    .pattern("ttt")
                    .pattern("cpp")
                    .pattern("ppp")
                    .define('p', Items.JUNGLE_PLANKS)
                    .define('c', Items.CHEST)
                    .define('t', BlockRegistration.MARBLE_SMALL_TILES.get())
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer, "sweetheart_counter_right_recipe_1");

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.SWEETHEART_COUNTER_RIGHT_DOOR.get())
                    .requires(BlockRegistration.SWEETHEART_COUNTER_LEFT_DOOR.get())
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .save(consumer, "sweetheart_counter_right_recipe_2");

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.SWEETHEART_SINK.get())
                    .pattern("tbt")
                    .pattern("ppp")
                    .pattern("ppp")
                    .define('p', Items.JUNGLE_PLANKS)
                    .define('b', Items.BUCKET)
                    .define('t', BlockRegistration.MARBLE_SMALL_TILES.get())
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.SWEETHEART_TABLE.get())
                    .pattern("ttt")
                    .pattern("p p")
                    .pattern("p p")
                    .define('p', Items.JUNGLE_PLANKS)
                    .define('t', BlockRegistration.MARBLE_SMALL_TILES.get())
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.SWEETHEART_BAKING_SET_BOWL.get())
                    .requires(Items.BOWL)
                    .requires(Items.STICK)
                    .requires(Items.IRON_INGOT)
                    .unlockedBy("has_bowl", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.BOWL).build()))
                    .save(consumer);

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.SWEETHEART_BAKING_SET_INGREDIENTS.get())
                    .requires(Items.BOWL)
                    .requires(Items.WHEAT)
                    .requires(Items.COCOA_BEANS)
                    .requires(Items.EGG)
                    .unlockedBy("has_bowl", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.BOWL).build()))
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.CONFECTIONERY_TABLE_BLUE.get())
                    .pattern("ddd")
                    .pattern("sss")
                    .pattern("f f")
                    .define('s', ItemTags.WOODEN_SLABS)
                    .define('f', ItemTags.WOODEN_FENCES)
                    .define('d', Items.BLUE_DYE)
                    .unlockedBy("has_wooden_fence", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ItemTags.WOODEN_FENCES).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.CONFECTIONERY_TABLE_PINK.get())
                    .pattern("ddd")
                    .pattern("sss")
                    .pattern("f f")
                    .define('s', ItemTags.WOODEN_SLABS)
                    .define('f', ItemTags.WOODEN_FENCES)
                    .define('d', Items.PINK_DYE)
                    .unlockedBy("has_wooden_fence", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ItemTags.WOODEN_FENCES).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.JAM_JARS.get(), 3)
                    .requires(Items.GLASS_BOTTLE, 2)
                    .requires(Items.SWEET_BERRIES)
                    .requires(Items.HONEY_BOTTLE)
                    .unlockedBy("has_honey_bottle", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.HONEY_BOTTLE).build()))
                    .save(consumer);

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.BOOK_OPEN.get())
                    .requires(Items.BOOK)
                    .requires(Items.LEATHER, 2)
                    .unlockedBy("has_book", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.BOOK).build()))
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.BRASS_KEY.get())
                    .pattern("cc")
                    .pattern("c ")
                    .pattern("cn")
                    .define('c', Items.COPPER_INGOT)
                    .define('n', Items.IRON_NUGGET)
                    .unlockedBy("has_copper_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.COPPER_INGOT).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.CARD_INDEX.get())
                    .pattern("ppp")
                    .pattern("cnc")
                    .pattern("ppp")
                    .define('c', Items.CHEST)
                    .define('n', Items.PAPER)
                    .define('p', ItemTags.PLANKS)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ENVELOPE_STACK.get())
                    .pattern(" w ")
                    .pattern("ppp")
                    .define('w', Items.HONEYCOMB)
                    .define('p', Items.PAPER)
                    .unlockedBy("has_honeycomb", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.HONEYCOMB).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.FLOWER_DESK_LAMP.get())
                    .pattern("vsl")
                    .pattern("v  ")
                    .pattern("mm ")
                    .define('v', Items.VINE)
                    .define('l', Items.REDSTONE_LAMP)
                    .define('m', Items.MOSS_CARPET)
                    .define('s', Items.SPORE_BLOSSOM)
                    .unlockedBy("has_redstone_lamp", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.REDSTONE_LAMP).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.FLOWER_SHELF_BLUE.get(), 3)
                    .pattern("dpd")
                    .pattern("p p")
                    .pattern("dsd")
                    .define('d', Items.LIGHT_BLUE_DYE)
                    .define('p', ItemTags.PLANKS)
                    .define('s', ItemTags.WOODEN_SLABS)
                    .unlockedBy("has_wooden_slab", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ItemTags.WOODEN_SLABS).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.FLOWER_SHELF_GREEN.get(), 3)
                    .pattern("dpd")
                    .pattern("p p")
                    .pattern("dsd")
                    .define('d', Items.LIME_DYE)
                    .define('p', ItemTags.PLANKS)
                    .define('s', ItemTags.WOODEN_SLABS)
                    .unlockedBy("has_wooden_slab", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ItemTags.WOODEN_SLABS).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.FLOWER_SHELF_PASTEL_YELLOW.get(), 3)
                    .pattern("wpd")
                    .pattern("p p")
                    .pattern("dsw")
                    .define('d', Items.YELLOW_DYE)
                    .define('w', Items.WHITE_DYE)
                    .define('p', ItemTags.PLANKS)
                    .define('s', ItemTags.WOODEN_SLABS)
                    .unlockedBy("has_wooden_slab", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ItemTags.WOODEN_SLABS).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.FLOWER_SHELF_PINK.get(), 3)
                    .pattern("dpd")
                    .pattern("p p")
                    .pattern("dsd")
                    .define('d', Items.PINK_DYE)
                    .define('p', ItemTags.PLANKS)
                    .define('s', ItemTags.WOODEN_SLABS)
                    .unlockedBy("has_wooden_slab", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ItemTags.WOODEN_SLABS).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.FLOWER_SHELF_PURPLE.get(), 3)
                    .pattern("dpd")
                    .pattern("p p")
                    .pattern("dsd")
                    .define('d', Items.MAGENTA_DYE)
                    .define('p', ItemTags.PLANKS)
                    .define('s', ItemTags.WOODEN_SLABS)
                    .unlockedBy("has_wooden_slab", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ItemTags.WOODEN_SLABS).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.FLOWER_SHELF_YELLOW.get(), 3)
                    .pattern("dpd")
                    .pattern("p p")
                    .pattern("dsd")
                    .define('d', Items.YELLOW_DYE)
                    .define('p', ItemTags.PLANKS)
                    .define('s', ItemTags.WOODEN_SLABS)
                    .unlockedBy("has_wooden_slab", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ItemTags.WOODEN_SLABS).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.FLOWER_SHELF_CANDLE_BLUE.get(), 3)
                    .pattern("d")
                    .pattern("w")
                    .define('d', Items.LIGHT_BLUE_DYE)
                    .define('w', Items.HONEYCOMB)
                    .unlockedBy("has_honeycomb", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.HONEYCOMB).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.FLOWER_SHELF_CANDLE_GREEN.get(), 3)
                    .pattern("d")
                    .pattern("w")
                    .define('d', Items.LIME_DYE)
                    .define('w', Items.HONEYCOMB)
                    .unlockedBy("has_honeycomb", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.HONEYCOMB).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.FLOWER_SHELF_CANDLE_PASTEL_YELLOW.get(), 3)
                    .pattern("d")
                    .pattern("h")
                    .pattern("w")
                    .define('d', Items.LIME_DYE)
                    .define('h', Items.WHITE_DYE)
                    .define('w', Items.HONEYCOMB)
                    .unlockedBy("has_honeycomb", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.HONEYCOMB).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.FLOWER_SHELF_CANDLE_PINK.get(), 3)
                    .pattern("d")
                    .pattern("w")
                    .define('d', Items.PINK_DYE)
                    .define('w', Items.HONEYCOMB)
                    .unlockedBy("has_honeycomb", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.HONEYCOMB).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.FLOWER_SHELF_CANDLE_PURPLE.get(), 3)
                    .pattern("d")
                    .pattern("w")
                    .define('d', Items.PURPLE_DYE)
                    .define('w', Items.HONEYCOMB)
                    .unlockedBy("has_honeycomb", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.HONEYCOMB).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.FLOWER_SHELF_CANDLE_YELLOW.get(), 3)
                    .pattern("d")
                    .pattern("w")
                    .define('d', Items.YELLOW_DYE)
                    .define('w', Items.HONEYCOMB)
                    .unlockedBy("has_honeycomb", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.HONEYCOMB).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.FLOWER_SHELF_PLANT.get(), 3)
                    .pattern("vv")
                    .pattern("pv")
                    .define('v', Items.VINE)
                    .define('p', Items.FLOWER_POT)
                    .unlockedBy("has_flower_pot", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.FLOWER_POT).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.FLOWER_TEA_KETTLE.get())
                    .pattern(" t ")
                    .pattern("gfg")
                    .pattern("ggg")
                    .define('f', ItemTags.FLOWERS)
                    .define('t', Items.TRIPWIRE_HOOK)
                    .define('g', Items.WHITE_GLAZED_TERRACOTTA)
                    .unlockedBy("has_white_glazed_terracotta", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.WHITE_GLAZED_TERRACOTTA).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.FWISH_ARMCHAIR.get())
                    .pattern("fsf")
                    .pattern("fsf")
                    .define('f', ItemTags.FISHES)
                    .define('s', ItemTags.WOODEN_SLABS)
                    .unlockedBy("has_fish", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(ItemTags.FISHES).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.FWISH_OTTOMAN.get())
                    .pattern("bbb")
                    .pattern("fff")
                    .define('f', ItemTags.FISHES)
                    .define('b', Items.BLUE_WOOL)
                    .unlockedBy("has_fish", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(ItemTags.FISHES).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.GENERAL_STORE_CABINET.get())
                    .pattern("pcp")
                    .pattern("psp")
                    .pattern("pcp")
                    .define('p', BlockRegistration.SYCAMORE_PLANKS.get())
                    .define('s', ItemTags.SAPLINGS)
                    .define('c', Items.CHEST)
                    .unlockedBy("has_sapling", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(ItemTags.SAPLINGS).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.HEAVENLY_ORNAMENTAL_ARRAY.get())
                    .pattern("sss")
                    .pattern("fmf")
                    .define('f', BlockRegistration.STARS_PENDANT.get())
                    .define('m', BlockRegistration.MOON_PENDANT.get())
                    .define('s', Items.STICK)
                    .unlockedBy("has_moon_pendant", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.MOON_PENDANT.get()).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.PLANT_LADDER.get())
                    .pattern("lp ")
                    .pattern("lsp")
                    .pattern("lss")
                    .define('l', Items.LADDER)
                    .define('p', Items.FLOWER_POT)
                    .define('s', ItemTags.WOODEN_SLABS)
                    .unlockedBy("has_ladder", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.LADDER).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.POLAROID_CAMERA.get())
                    .pattern("il ")
                    .pattern("its")
                    .pattern("ii ")
                    .define('l', Items.REDSTONE_LAMP)
                    .define('i', Items.IRON_INGOT)
                    .define('t', Items.TINTED_GLASS)
                    .define('s', Items.SPYGLASS)
                    .unlockedBy("has_spyglass", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.SPYGLASS).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.PUZZLE_PIECE_TABLE_GREEN.get())
                    .pattern("gsg")
                    .pattern(" f ")
                    .pattern(" f ")
                    .define('f', ItemTags.WOODEN_FENCES)
                    .define('s', ItemTags.WOODEN_SLABS)
                    .define('g', Items.GREEN_DYE)
                    .unlockedBy("has_wooden_slab", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(ItemTags.WOODEN_SLABS).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.PUZZLE_PIECE_TABLE_RED.get())
                    .pattern("dsd")
                    .pattern(" f ")
                    .pattern(" f ")
                    .define('f', ItemTags.WOODEN_FENCES)
                    .define('s', ItemTags.WOODEN_SLABS)
                    .define('d', Items.RED_DYE)
                    .unlockedBy("has_wooden_slab", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(ItemTags.WOODEN_SLABS).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.PUZZLE_PIECE_TABLE_YELLOW.get())
                    .pattern("dsd")
                    .pattern(" f ")
                    .pattern(" f ")
                    .define('f', ItemTags.WOODEN_FENCES)
                    .define('s', ItemTags.WOODEN_SLABS)
                    .define('d', Items.YELLOW_DYE)
                    .unlockedBy("has_wooden_slab", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(ItemTags.WOODEN_SLABS).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.PUZZLE_PIECE_TABLE_BLUE.get())
                    .pattern("dsd")
                    .pattern(" f ")
                    .pattern(" f ")
                    .define('f', ItemTags.WOODEN_FENCES)
                    .define('s', ItemTags.WOODEN_SLABS)
                    .define('d', Items.BLUE_DYE)
                    .unlockedBy("has_wooden_slab", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(ItemTags.WOODEN_SLABS).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.PUZZLE_PIECE_TABLE_PASTEL_BLUE.get())
                    .pattern("dsd")
                    .pattern(" f ")
                    .pattern(" f ")
                    .define('f', ItemTags.WOODEN_FENCES)
                    .define('s', ItemTags.WOODEN_SLABS)
                    .define('d', Items.LIGHT_BLUE_DYE)
                    .unlockedBy("has_wooden_slab", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(ItemTags.WOODEN_SLABS).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.PUZZLE_PIECE_TABLE_PASTEL_PINK.get())
                    .pattern("dsd")
                    .pattern(" f ")
                    .pattern(" f ")
                    .define('f', ItemTags.WOODEN_FENCES)
                    .define('s', ItemTags.WOODEN_SLABS)
                    .define('d', Items.PINK_DYE)
                    .unlockedBy("has_wooden_slab", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(ItemTags.WOODEN_SLABS).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.PUZZLE_PIECE_TABLE_PASTEL_PURPLE.get())
                    .pattern("dsd")
                    .pattern(" f ")
                    .pattern(" f ")
                    .define('f', ItemTags.WOODEN_FENCES)
                    .define('s', ItemTags.WOODEN_SLABS)
                    .define('d', Items.PURPLE_DYE)
                    .unlockedBy("has_wooden_slab", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(ItemTags.WOODEN_SLABS).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.PUZZLE_PIECE_TABLE_PASTEL_YELLOW.get())
                    .pattern("dsw")
                    .pattern(" f ")
                    .pattern(" f ")
                    .define('f', ItemTags.WOODEN_FENCES)
                    .define('s', ItemTags.WOODEN_SLABS)
                    .define('d', Items.YELLOW_DYE)
                    .define('w', Items.WHITE_DYE)
                    .unlockedBy("has_wooden_slab", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(ItemTags.WOODEN_SLABS).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.RETRO_FRIDGE_BLACK.get())
                    .pattern("idi")
                    .pattern("ifi")
                    .pattern("ibi")
                    .define('f', Items.PACKED_ICE)
                    .define('b', Items.IRON_BLOCK)
                    .define('d', Items.BLACK_DYE)
                    .define('i', Items.IRON_INGOT)
                    .unlockedBy("has_iron_block", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.IRON_BLOCK).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.RETRO_FRIDGE_BLUE.get())
                    .pattern("idi")
                    .pattern("ifi")
                    .pattern("ibi")
                    .define('f', Items.PACKED_ICE)
                    .define('b', Items.IRON_BLOCK)
                    .define('d', Items.BLUE_DYE)
                    .define('i', Items.IRON_INGOT)
                    .unlockedBy("has_iron_block", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.IRON_BLOCK).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.RETRO_FRIDGE_PINK.get())
                    .pattern("idi")
                    .pattern("ifi")
                    .pattern("ibi")
                    .define('f', Items.PACKED_ICE)
                    .define('b', Items.IRON_BLOCK)
                    .define('d', Items.PINK_DYE)
                    .define('i', Items.IRON_INGOT)
                    .unlockedBy("has_iron_block", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.IRON_BLOCK).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.RETRO_FRIDGE_PURPLE.get())
                    .pattern("idi")
                    .pattern("ifi")
                    .pattern("ibi")
                    .define('f', Items.PACKED_ICE)
                    .define('b', Items.IRON_BLOCK)
                    .define('d', Items.PURPLE_DYE)
                    .define('i', Items.IRON_INGOT)
                    .unlockedBy("has_iron_block", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.IRON_BLOCK).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.RETRO_FRIDGE_RED.get())
                    .pattern("idi")
                    .pattern("ifi")
                    .pattern("ibi")
                    .define('f', Items.PACKED_ICE)
                    .define('b', Items.IRON_BLOCK)
                    .define('d', Items.RED_DYE)
                    .define('i', Items.IRON_INGOT)
                    .unlockedBy("has_iron_block", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.IRON_BLOCK).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.RETRO_FRIDGE_TURQUOISE.get())
                    .pattern("idi")
                    .pattern("ifi")
                    .pattern("ibi")
                    .define('f', Items.PACKED_ICE)
                    .define('b', Items.IRON_BLOCK)
                    .define('d', Items.CYAN_DYE)
                    .define('i', Items.IRON_INGOT)
                    .unlockedBy("has_iron_block", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.IRON_BLOCK).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.RETRO_FRIDGE_WHITE.get())
                    .pattern("idi")
                    .pattern("ifi")
                    .pattern("ibi")
                    .define('f', Items.PACKED_ICE)
                    .define('b', Items.IRON_BLOCK)
                    .define('d', Items.WHITE_DYE)
                    .define('i', Items.IRON_INGOT)
                    .unlockedBy("has_iron_block", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.IRON_BLOCK).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.RETRO_FRIDGE_YELLOW.get())
                    .pattern("idi")
                    .pattern("ifi")
                    .pattern("ibi")
                    .define('f', Items.PACKED_ICE)
                    .define('b', Items.IRON_BLOCK)
                    .define('d', Items.YELLOW_DYE)
                    .define('i', Items.IRON_INGOT)
                    .unlockedBy("has_iron_block", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.IRON_BLOCK).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.RETRO_TOASTER_BLACK.get())
                    .pattern("idl")
                    .pattern("imi")
                    .define('l', Items.LEVER)
                    .define('d', Items.BLACK_DYE)
                    .define('i', Items.IRON_INGOT)
                    .define('m', Items.MAGMA_BLOCK)
                    .unlockedBy("has_magma_block", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.MAGMA_BLOCK).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.RETRO_TOASTER_BLUE.get())
                    .pattern("idl")
                    .pattern("imi")
                    .define('l', Items.LEVER)
                    .define('d', Items.BLUE_DYE)
                    .define('i', Items.IRON_INGOT)
                    .define('m', Items.MAGMA_BLOCK)
                    .unlockedBy("has_magma_block", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.MAGMA_BLOCK).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.RETRO_TOASTER_PINK.get())
                    .pattern("idl")
                    .pattern("imi")
                    .define('l', Items.LEVER)
                    .define('d', Items.PINK_DYE)
                    .define('i', Items.IRON_INGOT)
                    .define('m', Items.MAGMA_BLOCK)
                    .unlockedBy("has_magma_block", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.MAGMA_BLOCK).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.RETRO_TOASTER_PURPLE.get())
                    .pattern("idl")
                    .pattern("imi")
                    .define('l', Items.LEVER)
                    .define('d', Items.PURPLE_DYE)
                    .define('i', Items.IRON_INGOT)
                    .define('m', Items.MAGMA_BLOCK)
                    .unlockedBy("has_magma_block", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.MAGMA_BLOCK).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.RETRO_TOASTER_RED.get())
                    .pattern("idl")
                    .pattern("imi")
                    .define('l', Items.LEVER)
                    .define('d', Items.RED_DYE)
                    .define('i', Items.IRON_INGOT)
                    .define('m', Items.MAGMA_BLOCK)
                    .unlockedBy("has_magma_block", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.MAGMA_BLOCK).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.RETRO_TOASTER_TURQUOISE.get())
                    .pattern("idl")
                    .pattern("imi")
                    .define('l', Items.LEVER)
                    .define('d', Items.CYAN_DYE)
                    .define('i', Items.IRON_INGOT)
                    .define('m', Items.MAGMA_BLOCK)
                    .unlockedBy("has_magma_block", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.MAGMA_BLOCK).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.RETRO_TOASTER_WHITE.get())
                    .pattern("idl")
                    .pattern("imi")
                    .define('l', Items.LEVER)
                    .define('d', Items.WHITE_DYE)
                    .define('i', Items.IRON_INGOT)
                    .define('m', Items.MAGMA_BLOCK)
                    .unlockedBy("has_magma_block", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.MAGMA_BLOCK).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.RETRO_TOASTER_YELLOW.get())
                    .pattern("idl")
                    .pattern("imi")
                    .define('l', Items.LEVER)
                    .define('d', Items.YELLOW_DYE)
                    .define('i', Items.IRON_INGOT)
                    .define('m', Items.MAGMA_BLOCK)
                    .unlockedBy("has_magma_block", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.MAGMA_BLOCK).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.SALT_PEPPER_SHAKERS.get())
                    .pattern("d p")
                    .pattern("s w")
                    .pattern("b b")
                    .define('b', Items.GLASS_BOTTLE)
                    .define('s', Items.SUGAR)
                    .define('d', Items.DRIED_KELP)
                    .define('w', Items.PUMPKIN_SEEDS)
                    .define('p', Items.BLAZE_POWDER)
                    .unlockedBy("has_glass_bottle", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.GLASS_BOTTLE).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.SAND_SEAL_PLUSH_BLUE.get())
                    .pattern("bwb")
                    .pattern("wsw")
                    .define('b', ItemTags.BUTTONS)
                    .define('s', ItemTags.SAND)
                    .define('w', Items.BLUE_WOOL)
                    .unlockedBy("has_sand", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(ItemTags.SAND).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.SAND_SEAL_PLUSH_GREEN.get())
                    .pattern("bwb")
                    .pattern("wsw")
                    .define('b', ItemTags.BUTTONS)
                    .define('s', ItemTags.SAND)
                    .define('w', Items.GREEN_WOOL)
                    .unlockedBy("has_sand", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(ItemTags.SAND).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.SAND_SEAL_PLUSH_RED.get())
                    .pattern("bwb")
                    .pattern("wsw")
                    .define('b', ItemTags.BUTTONS)
                    .define('s', ItemTags.SAND)
                    .define('w', Items.RED_WOOL)
                    .unlockedBy("has_sand", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(ItemTags.SAND).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.SKETCHBOOK_SINGLE.get())
                    .pattern("gcs")
                    .pattern("ppp")
                    .define('c', ItemTags.COALS)
                    .define('s', Items.STICK)
                    .define('p', Items.PAPER)
                    .define('g', Items.GREEN_DYE)
                    .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.PAPER).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.STACK_OF_BOOKS.get())
                    .pattern("b ")
                    .pattern("bb")
                    .define('b', Items.BOOK)
                    .unlockedBy("has_book", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Items.BOOK).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.STACK_OF_BOOKS_TALL.get())
                    .pattern("b")
                    .pattern("b")
                    .define('b', BlockRegistration.STACK_OF_BOOKS.get())
                    .unlockedBy("has_stack_of_books", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.STACK_OF_BOOKS.get()).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.STEAMPUNK_GLOBE.get())
                    .pattern(" c ")
                    .pattern("cmc")
                    .pattern("s s")
                    .define('m', BlockRegistration.ANTIQUE_MAP.get())
                    .define('c', Items.COPPER_INGOT)
                    .define('s', Items.STICK)
                    .unlockedBy("has_antique_map", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.ANTIQUE_MAP.get()).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.WINE_BOTTLE_RACK.get())
                    .pattern("s")
                    .pattern("w")
                    .pattern("s")
                    .define('w', BlockRegistration.WINE_BOTTLES.get())
                    .define('s', ItemTags.WOODEN_SLABS)
                    .unlockedBy("has_wine_bottles", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(BlockRegistration.WINE_BOTTLES.get()).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.WINE_BOTTLES.get())
                    .requires(Items.GLASS_BOTTLE, 3)
                    .requires(Items.SUGAR, 2)
                    .requires(Items.APPLE)
                    .requires(Items.SWEET_BERRIES)
                    .unlockedBy("has_sugar", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.SUGAR).build()))
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.YELLOW_NOTEPAD.get())
                    .pattern("gcs")
                    .pattern("ppp")
                    .define('c', ItemTags.COALS)
                    .define('s', Items.STICK)
                    .define('p', Items.PAPER)
                    .define('g', Items.YELLOW_DYE)
                    .unlockedBy("has_paper", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.PAPER).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.FABRIC_BOLTS.get(), 2)
                    .pattern(" g ")
                    .pattern("bgp")
                    .pattern("b p")
                    .define('p', Items.PURPLE_WOOL)
                    .define('b', Items.BLUE_WOOL)
                    .define('g', Items.GREEN_WOOL)
                    .unlockedBy("has_green_wool", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.GREEN_WOOL).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegistration.SCISSORS_AND_THREAD.get())
                    .requires(Items.IRON_INGOT)
                    .requires(Items.STRING, 2)
                    .unlockedBy("has_string", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.STRING).build()))
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.SLICED_BREAD.get())
                    .pattern("b")
                    .pattern("p")
                    .define('p', Items.HEAVY_WEIGHTED_PRESSURE_PLATE)
                    .define('b', Items.BREAD)
                    .unlockedBy("has_bread", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.BREAD).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ROSE_END_TABLE.get())
                    .pattern("prp")
                    .pattern("sds")
                    .pattern("s s")
                    .define('s', Items.STICK)
                    .define('d', Items.WHITE_DYE)
                    .define('r', Items.ROSE_BUSH)
                    .define('p', ItemTags.WOODEN_SLABS)
                    .unlockedBy("has_rose_bush", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.ROSE_BUSH).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.ROSE_END_TABLE_BLACK.get())
                    .pattern("prp")
                    .pattern("sds")
                    .pattern("s s")
                    .define('s', Items.STICK)
                    .define('d', Items.BLACK_DYE)
                    .define('r', Items.ROSE_BUSH)
                    .define('p', ItemTags.WOODEN_SLABS)
                    .unlockedBy("has_rose_bush", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.ROSE_BUSH).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.VIAL_STAND.get())
                    .pattern("ppp")
                    .pattern("jsj")
                    .pattern("ppp")
                    .define('s', Items.STICK)
                    .define('j', Items.POTION)
                    .define('p', ItemTags.WOODEN_SLABS)
                    .unlockedBy("has_potion", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.POTION).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.PINEAPPLE.get())
                    .pattern("g")
                    .pattern("c")
                    .pattern("d")
                    .define('g', Items.GRASS)
                    .define('c', Items.CACTUS)
                    .define('d', Items.YELLOW_DYE)
                    .unlockedBy("has_cactus", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CACTUS).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.HONEYCOMB_LAMP.get())
                    .pattern("h")
                    .pattern("l")
                    .pattern("m")
                    .define('h', Items.HONEYCOMB_BLOCK)
                    .define('l', Items.REDSTONE_LAMP)
                    .define('m', Items.MOSS_CARPET)
                    .unlockedBy("has_redstone_lamp", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.REDSTONE_LAMP).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.UNLIVING_CHAIR.get())
                    .pattern(" w ")
                    .pattern("wpw")
                    .pattern("wcw")
                    .define('w', Items.WHITE_CARPET)
                    .define('p', Items.PHANTOM_MEMBRANE)
                    .define('c', BlockRegistration.COTTAGE_CHAIR.get())
                    .unlockedBy("has_phantom_membrane", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.PHANTOM_MEMBRANE).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.SAFE_NOVAKID.get())
                    .pattern("iii")
                    .pattern("ici")
                    .pattern("ibi")
                    .define('i', Items.IRON_INGOT)
                    .define('b', Items.IRON_BLOCK)
                    .define('c', Items.CHEST)
                    .unlockedBy("has_iron_block", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.IRON_BLOCK).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.HOPPIN_PARK_LANTERN.get(), 2)
                    .pattern("f")
                    .pattern("l")
                    .pattern("p")
                    .define('l', Items.LANTERN)
                    .define('p', Items.PINK_DYE)
                    .define('f', ItemTags.FLOWERS)
                    .unlockedBy("has_lantern", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.LANTERN).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.SEA_GEM_LANTERN.get(), 4)
                    .pattern("ggg")
                    .pattern("gpg")
                    .pattern("ggg")
                    .define('g', Items.GOLD_NUGGET)
                    .define('p', Items.PRISMARINE_CRYSTALS)
                    .unlockedBy("has_prismarine_crystals", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.PRISMARINE_CRYSTALS).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.VIOLET_SCREEN.get())
                    .pattern("fff")
                    .pattern("ppp")
                    .pattern("fff")
                    .define('f', ItemTags.WOODEN_FENCES)
                    .define('p', Items.PEONY)
                    .unlockedBy("has_peony", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.PEONY).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.HANGING_SHELVES_POTTERY.get(), 4)
                    .pattern("sps")
                    .pattern("scs")
                    .pattern("sps")
                    .define('s', Items.STRING)
                    .define('p', ItemTags.WOODEN_SLABS)
                    .define('c', Items.CLAY)
                    .unlockedBy("has_string", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.STRING).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.HANGING_SHELVES_PLANTS.get(), 4)
                    .pattern("sps")
                    .pattern("scs")
                    .pattern("sps")
                    .define('s', Items.STRING)
                    .define('p', ItemTags.WOODEN_SLABS)
                    .define('c', Items.FLOWER_POT)
                    .unlockedBy("has_string", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.STRING).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.POK_TA_POK_HOOP.get())
                    .pattern("sbs")
                    .pattern("b b")
                    .pattern("sbs")
                    .define('s', Items.STONE)
                    .define('b', Items.STONE_BRICKS)
                    .unlockedBy("has_stone_bricks", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.STONE_BRICKS).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.POK_TA_POK_HOOP_SNAKES.get())
                    .pattern("sbs")
                    .pattern("b b")
                    .pattern("sbs")
                    .define('s', Items.ANDESITE)
                    .define('b', Items.CHISELED_STONE_BRICKS)
                    .unlockedBy("has_chiseled_stone_bricks", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHISELED_STONE_BRICKS).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.RED_MUSHROOM_LAMP.get())
                    .pattern("r")
                    .pattern("l")
                    .pattern("s")
                    .define('s', TagRegistration.Items.RED_MUSHROOM_LOG)
                    .define('r', BlockRegistration.RED_MUSHROOM_CAP.get())
                    .define('l', Items.REDSTONE_LAMP)
                    .unlockedBy("has_redstone_lamp", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.REDSTONE_LAMP).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.BLUE_MUSHROOM_LAMP.get())
                    .pattern("r")
                    .pattern("l")
                    .pattern("s")
                    .define('s', TagRegistration.Items.BLUE_MUSHROOM_LOG)
                    .define('r', BlockRegistration.BLUE_MUSHROOM_CAP.get())
                    .define('l', Items.REDSTONE_LAMP)
                    .unlockedBy("has_redstone_lamp", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.REDSTONE_LAMP).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.RED_MUSHROOM_BED.get())
                    .pattern("rbr")
                    .define('b', ItemTags.BEDS)
                    .define('r', BlockRegistration.RED_MUSHROOM_CAP.get())
                    .unlockedBy("has_bed", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ItemTags.BEDS).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.BLUE_MUSHROOM_BED.get())
                    .pattern("rbr")
                    .define('b', ItemTags.BEDS)
                    .define('r', BlockRegistration.BLUE_MUSHROOM_CAP.get())
                    .unlockedBy("has_bed", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ItemTags.BEDS).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.RED_MUSHROOM_WARDROBE.get())
                    .pattern("rcr")
                    .pattern("rcr")
                    .pattern(" p ")
                    .define('c', Items.CHEST)
                    .define('r', BlockRegistration.RED_MUSHROOM_CAP.get())
                    .define('p', TagRegistration.Items.RED_MUSHROOM_LOG)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.BLUE_MUSHROOM_WARDROBE.get())
                    .pattern("rcr")
                    .pattern("rcr")
                    .pattern(" p ")
                    .define('c', Items.CHEST)
                    .define('r', BlockRegistration.BLUE_MUSHROOM_CAP.get())
                    .define('p', TagRegistration.Items.BLUE_MUSHROOM_LOG)
                    .unlockedBy("has_chest", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.CHEST).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.RED_MUSHROOM_TABLE.get())
                    .pattern("rrr")
                    .pattern(" p ")
                    .define('r', BlockRegistration.RED_MUSHROOM_CAP.get())
                    .define('p', TagRegistration.Items.RED_MUSHROOM_LOG)
                    .unlockedBy("has_red_mushroom_cap", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(BlockRegistration.RED_MUSHROOM_CAP.get()).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.BLUE_MUSHROOM_TABLE.get())
                    .pattern("rrr")
                    .pattern(" p ")
                    .define('r', BlockRegistration.BLUE_MUSHROOM_CAP.get())
                    .define('p', TagRegistration.Items.BLUE_MUSHROOM_LOG)
                    .unlockedBy("has_blue_mushroom_cap", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(BlockRegistration.BLUE_MUSHROOM_CAP.get()).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.RED_MUSHROOM_TV.get())
                    .pattern(" l ")
                    .pattern("rpr")
                    .pattern("rsr")
                    .define('r', BlockRegistration.RED_MUSHROOM_CAP.get())
                    .define('p', Items.TINTED_GLASS)
                    .define('s', Items.REDSTONE)
                    .define('l', Items.LIGHTNING_ROD)
                    .unlockedBy("has_lightning_rod", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.LIGHTNING_ROD).build()))
                    .showNotification(true)
                    .save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockRegistration.BLUE_MUSHROOM_TV.get())
                    .pattern(" l ")
                    .pattern("rpr")
                    .pattern("rsr")
                    .define('r', BlockRegistration.BLUE_MUSHROOM_CAP.get())
                    .define('p', Items.TINTED_GLASS)
                    .define('s', Items.REDSTONE)
                    .define('l', Items.LIGHTNING_ROD)
                    .unlockedBy("has_lightning_rod", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(Items.LIGHTNING_ROD).build()))
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