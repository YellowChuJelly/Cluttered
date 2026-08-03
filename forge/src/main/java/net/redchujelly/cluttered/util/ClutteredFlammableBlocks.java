package net.redchujelly.cluttered.util;

import net.minecraft.util.Tuple;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FireBlock;
import net.redchujelly.cluttered.blocks.BlockRegistration;
import net.redchujelly.cluttered.mixin.ForgeFireBlockInvoker;

import java.util.HashMap;
import java.util.Map;

public class ClutteredFlammableBlocks {

    private static final Map<Block, Tuple<Integer, Integer>> FLAMMABLES = new HashMap<>(){
        {
            //WILLOW WOODSET
            put(BlockRegistration.WILLOW_LEAVES.get(), new Tuple<>(30, 60));
            put(BlockRegistration.WILLOW_VINES.get(), new Tuple<>(15, 60));
            put(BlockRegistration.WILLOW_LOG.get(), new Tuple<>(5, 5));
            put(BlockRegistration.WILLOW_WOOD.get(), new Tuple<>(5, 5));
            put(BlockRegistration.STRIPPED_WILLOW_LOG.get(), new Tuple<>(5, 5));
            put(BlockRegistration.STRIPPED_WILLOW_WOOD.get(), new Tuple<>(5, 5));
            put(BlockRegistration.WILLOW_PLANKS.get(), new Tuple<>(5, 20));
            put(BlockRegistration.WILLOW_STAIRS.get(), new Tuple<>(5, 20));
            put(BlockRegistration.WILLOW_SLAB.get(), new Tuple<>(5, 20));
            put(BlockRegistration.WILLOW_FENCE.get(), new Tuple<>(5, 20));
            put(BlockRegistration.WILLOW_FENCE_GATE.get(), new Tuple<>(5, 20));
            put(BlockRegistration.WILLOW_BOOKSHELF_BLACK_CAT.get(), new Tuple<>(5, 20));
            put(BlockRegistration.WILLOW_BOOKSHELF_CALICO_CAT.get(), new Tuple<>(5, 20));
            put(BlockRegistration.WILLOW_BOOKSHELF_COBWEB.get(), new Tuple<>(5, 20));
            put(BlockRegistration.WILLOW_BOOKSHELF_BOTTLES.get(), new Tuple<>(5, 20));
            put(BlockRegistration.WILLOW_BOOKSHELF_VASE.get(), new Tuple<>(5, 20));
            put(BlockRegistration.WILLOW_WAINSCOTING.get(), new Tuple<>(5, 20));
            put(BlockRegistration.PURPLE_PLANTER.get(), new Tuple<>(5, 20));


            //FLOWERING WILLOW WOODSET
            put(BlockRegistration.FLOWERING_WILLOW_LEAVES.get(), new Tuple<>(30, 60));
            put(BlockRegistration.FLOWERING_CARPET_WILLOW.get(), new Tuple<>(60, 100));
            put(BlockRegistration.FLOWERING_WILLOW_LOG.get(), new Tuple<>(5, 5));
            put(BlockRegistration.FLOWERING_WILLOW_WOOD.get(), new Tuple<>(5, 5));
            put(BlockRegistration.STRIPPED_FLOWERING_WILLOW_LOG.get(), new Tuple<>(5, 5));
            put(BlockRegistration.STRIPPED_FLOWERING_WILLOW_WOOD.get(), new Tuple<>(5, 5));
            put(BlockRegistration.FLOWERING_WILLOW_PLANKS.get(), new Tuple<>(5, 20));
            put(BlockRegistration.FLOWERING_WILLOW_STAIRS.get(), new Tuple<>(5, 20));
            put(BlockRegistration.FLOWERING_WILLOW_SLAB.get(), new Tuple<>(5, 20));
            put(BlockRegistration.FLOWERING_WILLOW_FENCE.get(), new Tuple<>(5, 20));
            put(BlockRegistration.FLOWERING_WILLOW_FENCE_GATE.get(), new Tuple<>(5, 20));
            put(BlockRegistration.FLOWERING_WILLOW_WAINSCOTING.get(), new Tuple<>(5, 20));

            //POPLAR WOODSET
            put(BlockRegistration.POPLAR_LEAVES.get(), new Tuple<>(30, 60));
            put(BlockRegistration.POPLAR_LOG.get(), new Tuple<>(5, 5));
            put(BlockRegistration.POPLAR_WOOD.get(), new Tuple<>(5, 5));
            put(BlockRegistration.STRIPPED_POPLAR_LOG.get(), new Tuple<>(5, 5));
            put(BlockRegistration.STRIPPED_POPLAR_WOOD.get(), new Tuple<>(5, 5));
            put(BlockRegistration.POPLAR_PLANKS.get(), new Tuple<>(5, 20));
            put(BlockRegistration.POPLAR_STAIRS.get(), new Tuple<>(5, 20));
            put(BlockRegistration.POPLAR_SLAB.get(), new Tuple<>(5, 20));
            put(BlockRegistration.POPLAR_FENCE.get(), new Tuple<>(5, 20));
            put(BlockRegistration.POPLAR_FENCE_GATE.get(), new Tuple<>(5, 20));
            put(BlockRegistration.POPLAR_BOOKSHELF.get(), new Tuple<>(5, 20));
            put(BlockRegistration.POPLAR_WAINSCOTING.get(), new Tuple<>(5, 20));
            put(BlockRegistration.YELLOW_PLANTER.get(), new Tuple<>(5, 20));

            //FLOWERING POPLAR WOODSET
            put(BlockRegistration.FLOWERING_POPLAR_LEAVES.get(), new Tuple<>(30, 60));
            put(BlockRegistration.FLOWERING_CARPET_POPLAR.get(), new Tuple<>(60, 100));
            put(BlockRegistration.FLOWERING_POPLAR_LOG.get(), new Tuple<>(5, 5));
            put(BlockRegistration.FLOWERING_POPLAR_WOOD.get(), new Tuple<>(5, 5));
            put(BlockRegistration.STRIPPED_FLOWERING_POPLAR_LOG.get(), new Tuple<>(5, 5));
            put(BlockRegistration.STRIPPED_FLOWERING_POPLAR_WOOD.get(), new Tuple<>(5, 5));
            put(BlockRegistration.FLOWERING_POPLAR_PLANKS.get(), new Tuple<>(5, 20));
            put(BlockRegistration.FLOWERING_POPLAR_STAIRS.get(), new Tuple<>(5, 20));
            put(BlockRegistration.FLOWERING_POPLAR_SLAB.get(), new Tuple<>(5, 20));
            put(BlockRegistration.FLOWERING_POPLAR_FENCE.get(), new Tuple<>(5, 20));
            put(BlockRegistration.FLOWERING_POPLAR_FENCE_GATE.get(), new Tuple<>(5, 20));
            put(BlockRegistration.FLOWERING_POPLAR_BOOKSHELF.get(), new Tuple<>(5, 20));
            put(BlockRegistration.FLOWERING_POPLAR_WAINSCOTING.get(), new Tuple<>(5, 20));

            //CRABAPPLE WOODSET
            put(BlockRegistration.CRABAPPLE_LEAVES.get(), new Tuple<>(30, 60));
            put(BlockRegistration.CRABAPPLE_LOG.get(), new Tuple<>(5, 5));
            put(BlockRegistration.CRABAPPLE_WOOD.get(), new Tuple<>(5, 5));
            put(BlockRegistration.STRIPPED_CRABAPPLE_LOG.get(), new Tuple<>(5, 5));
            put(BlockRegistration.STRIPPED_CRABAPPLE_WOOD.get(), new Tuple<>(5, 5));
            put(BlockRegistration.CRABAPPLE_PLANKS.get(), new Tuple<>(5, 20));
            put(BlockRegistration.CRABAPPLE_STAIRS.get(), new Tuple<>(5, 20));
            put(BlockRegistration.CRABAPPLE_SLAB.get(), new Tuple<>(5, 20));
            put(BlockRegistration.CRABAPPLE_FENCE.get(), new Tuple<>(5, 20));
            put(BlockRegistration.CRABAPPLE_FENCE_GATE.get(), new Tuple<>(5, 20));
            put(BlockRegistration.CRABAPPLE_BOOKSHELF.get(), new Tuple<>(5, 20));
            put(BlockRegistration.CRABAPPLE_WAINSCOTING.get(), new Tuple<>(5, 20));
            put(BlockRegistration.PINK_PLANTER.get(), new Tuple<>(5, 20));

            //FLOWERING CRABAPPLE WOODSET
            put(BlockRegistration.FLOWERING_CRABAPPLE_LEAVES.get(), new Tuple<>(30, 60));
            put(BlockRegistration.FLOWERING_CARPET_CRABAPPLE.get(), new Tuple<>(60, 100));
            put(BlockRegistration.FLOWERING_CRABAPPLE_LOG.get(), new Tuple<>(5, 5));
            put(BlockRegistration.FLOWERING_CRABAPPLE_WOOD.get(), new Tuple<>(5, 5));
            put(BlockRegistration.STRIPPED_FLOWERING_CRABAPPLE_LOG.get(), new Tuple<>(5, 5));
            put(BlockRegistration.STRIPPED_FLOWERING_CRABAPPLE_WOOD.get(), new Tuple<>(5, 5));
            put(BlockRegistration.FLOWERING_CRABAPPLE_PLANKS.get(), new Tuple<>(5, 20));
            put(BlockRegistration.FLOWERING_CRABAPPLE_STAIRS.get(), new Tuple<>(5, 20));
            put(BlockRegistration.FLOWERING_CRABAPPLE_SLAB.get(), new Tuple<>(5, 20));
            put(BlockRegistration.FLOWERING_CRABAPPLE_FENCE.get(), new Tuple<>(5, 20));
            put(BlockRegistration.FLOWERING_CRABAPPLE_FENCE_GATE.get(), new Tuple<>(5, 20));
            put(BlockRegistration.FLOWERING_CRABAPPLE_BOOKSHELF.get(), new Tuple<>(5, 20));
            put(BlockRegistration.FLOWERING_CRABAPPLE_WAINSCOTING.get(), new Tuple<>(5, 20));

            //SYCAMORE WOODSET
            put(BlockRegistration.SYCAMORE_LEAVES.get(), new Tuple<>(30, 60));
            put(BlockRegistration.SYCAMORE_LOG.get(), new Tuple<>(5, 5));
            put(BlockRegistration.SYCAMORE_WOOD.get(), new Tuple<>(5, 5));
            put(BlockRegistration.STRIPPED_SYCAMORE_LOG.get(), new Tuple<>(5, 5));
            put(BlockRegistration.STRIPPED_SYCAMORE_WOOD.get(), new Tuple<>(5, 5));
            put(BlockRegistration.SYCAMORE_PLANKS.get(), new Tuple<>(5, 20));
            put(BlockRegistration.SYCAMORE_STAIRS.get(), new Tuple<>(5, 20));
            put(BlockRegistration.SYCAMORE_SLAB.get(), new Tuple<>(5, 20));
            put(BlockRegistration.SYCAMORE_FENCE.get(), new Tuple<>(5, 20));
            put(BlockRegistration.SYCAMORE_FENCE_GATE.get(), new Tuple<>(5, 20));
            put(BlockRegistration.SYCAMORE_BOOKSHELF.get(), new Tuple<>(5, 20));
            put(BlockRegistration.SYCAMORE_WAINSCOTING.get(), new Tuple<>(5, 20));
            put(BlockRegistration.GREEN_PLANTER.get(), new Tuple<>(5, 20));

            //FLUORESCENT MAPLE WOODSET
            put(BlockRegistration.MAPLE_LEAVES.get(), new Tuple<>(30, 60));
            put(BlockRegistration.MAPLE_LEAVES_FLOWERING.get(), new Tuple<>(30, 60));
            put(BlockRegistration.MAPLE_LOG.get(), new Tuple<>(5, 5));
            put(BlockRegistration.MAPLE_WOOD.get(), new Tuple<>(5, 5));
            put(BlockRegistration.STRIPPED_MAPLE_LOG.get(), new Tuple<>(5, 5));
            put(BlockRegistration.STRIPPED_MAPLE_WOOD.get(), new Tuple<>(5, 5));
            put(BlockRegistration.MAPLE_PLANKS.get(), new Tuple<>(5, 20));
            put(BlockRegistration.MAPLE_STAIRS.get(), new Tuple<>(5, 20));
            put(BlockRegistration.MAPLE_SLAB.get(), new Tuple<>(5, 20));
            put(BlockRegistration.MAPLE_FENCE.get(), new Tuple<>(5, 20));
            put(BlockRegistration.MAPLE_FENCE_GATE.get(), new Tuple<>(5, 20));
            put(BlockRegistration.MAPLE_BOOKSHELF.get(), new Tuple<>(5, 20));
            put(BlockRegistration.MAPLE_WAINSCOTING.get(), new Tuple<>(5, 20));
            put(BlockRegistration.FLUORESCENT_PLANTER.get(), new Tuple<>(5, 20));

            //BLUE MUSHROOM WOODSET
            put(BlockRegistration.BLUE_MUSHROOM_CAP.get(), new Tuple<>(10, 30));
            put(BlockRegistration.BLUE_MUSHROOM_LOG.get(), new Tuple<>(5, 5));
            put(BlockRegistration.BLUE_MUSHROOM_WOOD.get(), new Tuple<>(5, 5));
            put(BlockRegistration.BLUE_MUSHROOM_PLANKS.get(), new Tuple<>(5, 20));
            put(BlockRegistration.BLUE_MUSHROOM_STAIRS.get(), new Tuple<>(5, 20));
            put(BlockRegistration.BLUE_MUSHROOM_SLAB.get(), new Tuple<>(5, 20));
            put(BlockRegistration.BLUE_MUSHROOM_FENCE.get(), new Tuple<>(5, 20));
            put(BlockRegistration.BLUE_MUSHROOM_FENCE_GATE.get(), new Tuple<>(5, 20));
            put(BlockRegistration.BLUE_MUSHROOM_BOOKSHELF.get(), new Tuple<>(5, 20));
            put(BlockRegistration.BLUE_MUSHROOM_WAINSCOTING.get(), new Tuple<>(5, 20));
            put(BlockRegistration.BLUE_PLANTER.get(), new Tuple<>(5, 20));

            //RED MUSHROOM WOODSET
            put(BlockRegistration.RED_MUSHROOM_CAP.get(), new Tuple<>(10, 30));
            put(BlockRegistration.RED_MUSHROOM_LOG.get(), new Tuple<>(5, 5));
            put(BlockRegistration.RED_MUSHROOM_WOOD.get(), new Tuple<>(5, 5));
            put(BlockRegistration.RED_MUSHROOM_PLANKS.get(), new Tuple<>(5, 20));
            put(BlockRegistration.RED_MUSHROOM_STAIRS.get(), new Tuple<>(5, 20));
            put(BlockRegistration.RED_MUSHROOM_SLAB.get(), new Tuple<>(5, 20));
            put(BlockRegistration.RED_MUSHROOM_FENCE.get(), new Tuple<>(5, 20));
            put(BlockRegistration.RED_MUSHROOM_FENCE_GATE.get(), new Tuple<>(5, 20));
            put(BlockRegistration.RED_MUSHROOM_BOOKSHELF.get(), new Tuple<>(5, 20));
            put(BlockRegistration.RED_MUSHROOM_WAINSCOTING.get(), new Tuple<>(5, 20));
            put(BlockRegistration.RED_PLANTER.get(), new Tuple<>(5, 20));

            //WALLPAPERS
            put(BlockRegistration.DIAMOND_WALLPAPER_APPLE.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_APPLE_BOTTOM_BROWN.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_APPLE_TOP_BROWN.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_APPLE_BOTTOM_WHITE.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_APPLE_TOP_WHITE.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_APPLE_BOTTOM_COLOR.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_APPLE_TOP_COLOR.get(), new Tuple<>(15, 30));

            put(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_BOTTOM_BROWN.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_TOP_BROWN.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_BOTTOM_WHITE.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_TOP_WHITE.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_BOTTOM_COLOR.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_TOP_COLOR.get(), new Tuple<>(15, 30));

            put(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_BOTTOM_BROWN.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_TOP_BROWN.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_BOTTOM_WHITE.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_TOP_WHITE.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_BOTTOM_COLOR.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_TOP_COLOR.get(), new Tuple<>(15, 30));

            put(BlockRegistration.DIAMOND_WALLPAPER_BONES.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_BONES_BOTTOM_BROWN.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_BONES_TOP_BROWN.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_BONES_BOTTOM_WHITE.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_BONES_TOP_WHITE.get(), new Tuple<>(15, 30));

            put(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_BOTTOM_BROWN.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_TOP_BROWN.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_BOTTOM_WHITE.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_TOP_WHITE.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_BOTTOM_COLOR.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_TOP_COLOR.get(), new Tuple<>(15, 30));

            put(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_BOTTOM_BROWN.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_TOP_BROWN.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_BOTTOM_WHITE.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_TOP_WHITE.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_BOTTOM_COLOR.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_TOP_COLOR.get(), new Tuple<>(15, 30));

            put(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_BOTTOM_BROWN.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_TOP_BROWN.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_BOTTOM_WHITE.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_TOP_WHITE.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_BOTTOM_COLOR.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_TOP_COLOR.get(), new Tuple<>(15, 30));

            put(BlockRegistration.DIAMOND_WALLPAPER_LEMON.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_LEMON_BOTTOM_BROWN.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_LEMON_TOP_BROWN.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_LEMON_BOTTOM_WHITE.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_LEMON_TOP_WHITE.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_LEMON_BOTTOM_COLOR.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_LEMON_TOP_COLOR.get(), new Tuple<>(15, 30));

            put(BlockRegistration.DIAMOND_WALLPAPER_ORANGE.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_BOTTOM_BROWN.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_TOP_BROWN.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_BOTTOM_WHITE.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_TOP_WHITE.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_BOTTOM_COLOR.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_TOP_COLOR.get(), new Tuple<>(15, 30));

            put(BlockRegistration.DIAMOND_WALLPAPER_PEAR.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_PEAR_BOTTOM_BROWN.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_PEAR_TOP_BROWN.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_PEAR_BOTTOM_WHITE.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_PEAR_TOP_WHITE.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_PEAR_BOTTOM_COLOR.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_PEAR_TOP_COLOR.get(), new Tuple<>(15, 30));

            put(BlockRegistration.DIAMOND_WALLPAPER_PLUM.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_PLUM_BOTTOM_BROWN.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_PLUM_TOP_BROWN.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_PLUM_BOTTOM_WHITE.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_PLUM_TOP_WHITE.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_PLUM_BOTTOM_COLOR.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_PLUM_TOP_COLOR.get(), new Tuple<>(15, 30));

            put(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_BOTTOM_BROWN.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_TOP_BROWN.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_BOTTOM_WHITE.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_TOP_WHITE.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_BOTTOM_COLOR.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_TOP_COLOR.get(), new Tuple<>(15, 30));

            put(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_BOTTOM_BROWN.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_TOP_BROWN.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_BOTTOM_WHITE.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_TOP_WHITE.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_BOTTOM_COLOR.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_TOP_COLOR.get(), new Tuple<>(15, 30));

            put(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_BOTTOM_BROWN.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_TOP_BROWN.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_BOTTOM_WHITE.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_TOP_WHITE.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_BOTTOM_COLOR.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_TOP_COLOR.get(), new Tuple<>(15, 30));

            put(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR_BOTTOM_BROWN.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR_TOP_BROWN.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR_BOTTOM_WHITE.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR_TOP_WHITE.get(), new Tuple<>(15, 30));


            put(BlockRegistration.STARRY_WALLPAPER_BOTTOM.get(), new Tuple<>(15, 30));
            put(BlockRegistration.STARRY_WALLPAPER.get(), new Tuple<>(15, 30));
            put(BlockRegistration.STARRY_WALLPAPER_TOP.get(), new Tuple<>(15, 30));

            put(BlockRegistration.DARK_STARRY_WALLPAPER_BOTTOM.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DARK_STARRY_WALLPAPER.get(), new Tuple<>(15, 30));
            put(BlockRegistration.DARK_STARRY_WALLPAPER_TOP.get(), new Tuple<>(15, 30));

            put(BlockRegistration.CHIC_WALLPAPER_LOWER_TRIM.get(), new Tuple<>(15, 30));
            put(BlockRegistration.CHIC_WALLPAPER.get(), new Tuple<>(15, 30));
            put(BlockRegistration.CHIC_WALLPAPER_UPPER_TRIM.get(), new Tuple<>(15, 30));

            put(BlockRegistration.PINK_STRIPE_WALLPAPER_LOWER_TRIM.get(), new Tuple<>(15, 30));
            put(BlockRegistration.PINK_STRIPE_WALLPAPER.get(), new Tuple<>(15, 30));
            put(BlockRegistration.PINK_STRIPE_WALLPAPER_UPPER_TRIM.get(), new Tuple<>(15, 30));

            put(BlockRegistration.RIALTO_GOLD_WALLPAPER_BOTTOM.get(), new Tuple<>(15, 30));
            put(BlockRegistration.RIALTO_GOLD_WALLPAPER.get(), new Tuple<>(15, 30));
            put(BlockRegistration.RIALTO_GOLD_WALLPAPER_TOP.get(), new Tuple<>(15, 30));

            put(BlockRegistration.GHOST_WALLPAPER_WAINSCOTING.get(), new Tuple<>(15, 30));
            put(BlockRegistration.GHOST_WALLPAPER.get(), new Tuple<>(15, 30));
            put(BlockRegistration.GHOST_WALLPAPER_TRIM.get(), new Tuple<>(15, 30));
            put(BlockRegistration.GHOST_WALLPAPER_TOP.get(), new Tuple<>(15, 30));
            put(BlockRegistration.GHOST_WALLPAPER_BOTTOM.get(), new Tuple<>(15, 30));

            put(BlockRegistration.HALLOWEEN_WAINSCOTING.get(), new Tuple<>(15, 30));
            put(BlockRegistration.HALLOWEEN_WALLPAPER.get(), new Tuple<>(15, 30));
            put(BlockRegistration.HALLOWEEN_WALLPAPER_TOP.get(), new Tuple<>(15, 30));
            put(BlockRegistration.HALLOWEEN_WALLPAPER_BOTTOM.get(), new Tuple<>(15, 30));

            put(BlockRegistration.CONFECTIONARY_WALLPAPER.get(), new Tuple<>(15, 30));
            put(BlockRegistration.CONFECTIONARY_WALLPAPER_TOP.get(), new Tuple<>(15, 30));
            put(BlockRegistration.CONFECTIONARY_WALLPAPER_BOTTOM.get(), new Tuple<>(15, 30));
            put(BlockRegistration.BLUE_WAINSCOTING.get(), new Tuple<>(15, 30));

            put(BlockRegistration.MINT_WALLPAPER.get(), new Tuple<>(15, 30));
            put(BlockRegistration.MINT_WALLPAPER_TOP.get(), new Tuple<>(15, 30));
            put(BlockRegistration.MINT_WALLPAPER_BOTTOM.get(), new Tuple<>(15, 30));
            put(BlockRegistration.BROWN_WAINSCOTING.get(), new Tuple<>(15, 30));

            put(BlockRegistration.TARTAN_YELLOW_WALLPAPER.get(), new Tuple<>(15, 30));
            put(BlockRegistration.CHECKERED_PINK_WALLPAPER.get(), new Tuple<>(15, 30));
            put(BlockRegistration.CHECKERED_PINK_STRAWBERRY_WALLPAPER.get(), new Tuple<>(15, 30));
            put(BlockRegistration.CHECKERED_GREEN_WALLPAPER.get(), new Tuple<>(15, 30));
            put(BlockRegistration.CHECKERED_GREEN_STRAWBERRY_WALLPAPER.get(), new Tuple<>(15, 30));

            put(BlockRegistration.RETRO_RAINBOW_WALLPAPER.get(), new Tuple<>(15, 30));

            put(BlockRegistration.FLORAL_BERRY_WALLPAPER.get(), new Tuple<>(15, 30));
            put(BlockRegistration.FLORAL_BERRY_WALLPAPER_TOP.get(), new Tuple<>(15, 30));
            put(BlockRegistration.FLORAL_BERRY_WALLPAPER_BOTTOM.get(), new Tuple<>(15, 30));

            put(BlockRegistration.STRIPED_FLORAL_WALLPAPER.get(), new Tuple<>(15, 30));
            put(BlockRegistration.STRIPED_FLORAL_WALLPAPER_TOP.get(), new Tuple<>(15, 30));
            put(BlockRegistration.STRIPED_FLORAL_WALLPAPER_BOTTOM.get(), new Tuple<>(15, 30));

            put(BlockRegistration.FLORAL_BORDER_WALLPAPER.get(), new Tuple<>(15, 30));

            put(BlockRegistration.MARIGOLD_WALLPAPER.get(), new Tuple<>(15, 30));
            put(BlockRegistration.MARIGOLD_WALLPAPER_TOP.get(), new Tuple<>(15, 30));
            put(BlockRegistration.MARIGOLD_WALLPAPER_BOTTOM.get(), new Tuple<>(15, 30));

            put(BlockRegistration.CHECKERED_FRUIT_WALLPAPER.get(), new Tuple<>(15, 30));
            put(BlockRegistration.APPLE_WALLPAPER.get(), new Tuple<>(15, 30));
            put(BlockRegistration.FISH_WALLPAPER.get(), new Tuple<>(15, 30));
            put(BlockRegistration.TROPICAL_FISH_WALLPAPER.get(), new Tuple<>(15, 30));

            put(BlockRegistration.WOODEN_PICKET_FENCE.get(), new Tuple<>(5, 20));
            put(BlockRegistration.WOODEN_PICKET_FENCE_GATE.get(), new Tuple<>(5, 20));

            put(BlockRegistration.WOODEN_BRACKET_VICTORIAN.get(), new Tuple<>(5, 20));
            put(BlockRegistration.WOODEN_BRACKET_SCROLL.get(), new Tuple<>(5, 20));
            put(BlockRegistration.WOODEN_BRACKET_BOW.get(), new Tuple<>(5, 20));
            put(BlockRegistration.WOODEN_BRACKET_BOW_SCROLL.get(), new Tuple<>(5, 20));
            put(BlockRegistration.WOODEN_BRACKET_STAR.get(), new Tuple<>(5, 20));
            put(BlockRegistration.WOODEN_BRACKET_STAR_SCROLL.get(), new Tuple<>(5, 20));
            put(BlockRegistration.WOODEN_BRACKET_SCROLL_SHELF.get(), new Tuple<>(5, 20));

            put(BlockRegistration.WICKER_BLOCK.get(), new Tuple<>(5, 20));


        }
    };

    public static void addFlammables(){
        FireBlock fireBlock = (FireBlock) Blocks.FIRE;

        for (Map.Entry<Block, Tuple<Integer, Integer>> entry : FLAMMABLES.entrySet()){
            ((ForgeFireBlockInvoker) fireBlock).cluttered_invokeSetFlammable(entry.getKey(), entry.getValue().getA(), entry.getValue().getB());
        }
    }
}
