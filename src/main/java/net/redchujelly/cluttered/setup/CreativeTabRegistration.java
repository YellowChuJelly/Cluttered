package net.redchujelly.cluttered.setup;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.redchujelly.cluttered.Cluttered;

public class CreativeTabRegistration {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Cluttered.MODID);

    //FURNITURE

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CLUTTERED_TAB = CREATIVE_MODE_TABS.register("cluttered_block_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(BlockRegistration.WILLOW_BOOKSHELF_BLACK_CAT))
                    .title(Component.translatable("creativetab.cluttered_tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ItemRegistration.HAND_DRILL);

                        //WILLOW WOODSET
                        output.accept(BlockRegistration.WILLOW_SAPLING);
                        output.accept(BlockRegistration.WILLOW_LEAVES);
                        output.accept(BlockRegistration.WILLOW_VINES);
                        output.accept(BlockRegistration.WILLOW_LOG);
                        output.accept(BlockRegistration.WILLOW_WOOD);
                        output.accept(BlockRegistration.STRIPPED_WILLOW_LOG);
                        output.accept(BlockRegistration.STRIPPED_WILLOW_WOOD);
                        output.accept(BlockRegistration.WILLOW_PLANKS);
                        output.accept(BlockRegistration.WILLOW_STAIRS);
                        output.accept(BlockRegistration.WILLOW_SLAB);
                        output.accept(BlockRegistration.WILLOW_FENCE);
                        output.accept(BlockRegistration.WILLOW_FENCE_GATE);
                        output.accept(BlockRegistration.WILLOW_DOOR);
                        output.accept(BlockRegistration.WILLOW_LOG_DOOR);
                        output.accept(BlockRegistration.WILLOW_GARDEN_DOOR);
                        output.accept(BlockRegistration.WILLOW_TRAPDOOR);
                        output.accept(BlockRegistration.WILLOW_PRESSURE_PLATE);
                        output.accept(BlockRegistration.WILLOW_BUTTON);
                        output.accept(ItemRegistration.WILLOW_SIGN);
                        output.accept(ItemRegistration.WILLOW_HANGING_SIGN);
                        output.accept(BlockRegistration.WILLOW_BOOKSHELF_BLACK_CAT);
                        output.accept(BlockRegistration.WILLOW_BOOKSHELF_CALICO_CAT);
                        output.accept(BlockRegistration.WILLOW_BOOKSHELF_COBWEB);
                        output.accept(BlockRegistration.WILLOW_BOOKSHELF_BOTTLES);
                        output.accept(BlockRegistration.WILLOW_BOOKSHELF_VASE);
                        output.accept(BlockRegistration.WILLOW_WINDOW);
                        output.accept(BlockRegistration.WILLOW_WINDOW_PANE);
                        output.accept(BlockRegistration.WILLOW_WAINSCOTING);
                        output.accept(BlockRegistration.PURPLE_PLANTER);


                        //FLOWERING WILLOW WOODSET
                        output.accept(BlockRegistration.FLOWERING_WILLOW_LEAVES);
                        output.accept(BlockRegistration.FLOWERING_CARPET_WILLOW);
                        output.accept(BlockRegistration.FLOWERING_WILLOW_LOG);
                        output.accept(BlockRegistration.FLOWERING_WILLOW_WOOD);
                        output.accept(BlockRegistration.STRIPPED_FLOWERING_WILLOW_LOG);
                        output.accept(BlockRegistration.STRIPPED_FLOWERING_WILLOW_WOOD);
                        output.accept(BlockRegistration.FLOWERING_WILLOW_PLANKS);
                        output.accept(BlockRegistration.FLOWERING_WILLOW_STAIRS);
                        output.accept(BlockRegistration.FLOWERING_WILLOW_SLAB);
                        output.accept(BlockRegistration.FLOWERING_WILLOW_FENCE);
                        output.accept(BlockRegistration.FLOWERING_WILLOW_FENCE_GATE);
                        output.accept(BlockRegistration.FLOWERING_WILLOW_DOOR);
                        output.accept(BlockRegistration.FLOWERING_WILLOW_TRAPDOOR);
                        output.accept(BlockRegistration.FLOWERING_WILLOW_PRESSURE_PLATE);
                        output.accept(BlockRegistration.FLOWERING_WILLOW_BUTTON);
                        output.accept(ItemRegistration.FLOWERING_WILLOW_SIGN);
                        output.accept(ItemRegistration.FLOWERING_WILLOW_HANGING_SIGN);
                        output.accept(BlockRegistration.FLOWERING_WILLOW_WINDOW);
                        output.accept(BlockRegistration.FLOWERING_WILLOW_WINDOW_PANE);
                        output.accept(BlockRegistration.FLOWERING_WILLOW_WAINSCOTING);

                        //POPLAR WOODSET
                        output.accept(BlockRegistration.POPLAR_SAPLING);
                        output.accept(BlockRegistration.POPLAR_LEAVES);
                        output.accept(BlockRegistration.POPLAR_LOG);
                        output.accept(BlockRegistration.POPLAR_WOOD);
                        output.accept(BlockRegistration.STRIPPED_POPLAR_LOG);
                        output.accept(BlockRegistration.STRIPPED_POPLAR_WOOD);
                        output.accept(BlockRegistration.POPLAR_PLANKS);
                        output.accept(BlockRegistration.POPLAR_STAIRS);
                        output.accept(BlockRegistration.POPLAR_SLAB);
                        output.accept(BlockRegistration.POPLAR_FENCE);
                        output.accept(BlockRegistration.POPLAR_FENCE_GATE);
                        output.accept(BlockRegistration.POPLAR_DOOR);
                        output.accept(BlockRegistration.POPLAR_TRAPDOOR);
                        output.accept(BlockRegistration.POPLAR_PRESSURE_PLATE);
                        output.accept(BlockRegistration.POPLAR_BUTTON);
                        output.accept(ItemRegistration.POPLAR_SIGN);
                        output.accept(ItemRegistration.POPLAR_HANGING_SIGN);
                        output.accept(BlockRegistration.POPLAR_BOOKSHELF);
                        output.accept(BlockRegistration.POPLAR_WINDOW);
                        output.accept(BlockRegistration.POPLAR_WINDOW_PANE);
                        output.accept(BlockRegistration.POPLAR_WAINSCOTING);
                        output.accept(BlockRegistration.YELLOW_PLANTER);

                        //FLOWERING POPLAR WOODSET
                        output.accept(BlockRegistration.FLOWERING_POPLAR_LEAVES);
                        output.accept(BlockRegistration.FLOWERING_CARPET_POPLAR);
                        output.accept(BlockRegistration.FLOWERING_POPLAR_LOG);
                        output.accept(BlockRegistration.FLOWERING_POPLAR_WOOD);
                        output.accept(BlockRegistration.STRIPPED_FLOWERING_POPLAR_LOG);
                        output.accept(BlockRegistration.STRIPPED_FLOWERING_POPLAR_WOOD);
                        output.accept(BlockRegistration.FLOWERING_POPLAR_PLANKS);
                        output.accept(BlockRegistration.FLOWERING_POPLAR_STAIRS);
                        output.accept(BlockRegistration.FLOWERING_POPLAR_SLAB);
                        output.accept(BlockRegistration.FLOWERING_POPLAR_FENCE);
                        output.accept(BlockRegistration.FLOWERING_POPLAR_FENCE_GATE);
                        output.accept(BlockRegistration.FLOWERING_POPLAR_DOOR);
                        output.accept(BlockRegistration.FLOWERING_POPLAR_TRAPDOOR);
                        output.accept(BlockRegistration.FLOWERING_POPLAR_PRESSURE_PLATE);
                        output.accept(BlockRegistration.FLOWERING_POPLAR_BUTTON);
                        output.accept(ItemRegistration.FLOWERING_POPLAR_SIGN);
                        output.accept(ItemRegistration.FLOWERING_POPLAR_HANGING_SIGN);
                        output.accept(BlockRegistration.FLOWERING_POPLAR_BUTTON);
                        output.accept(BlockRegistration.FLOWERING_POPLAR_BOOKSHELF);
                        output.accept(BlockRegistration.FLOWERING_POPLAR_WINDOW);
                        output.accept(BlockRegistration.FLOWERING_POPLAR_WINDOW_PANE);
                        output.accept(BlockRegistration.FLOWERING_POPLAR_WAINSCOTING);

                        //CRABAPPLE WOODSET
                        output.accept(BlockRegistration.CRABAPPLE_SAPLING);
                        output.accept(BlockRegistration.CRABAPPLE_LEAVES);
                        output.accept(BlockRegistration.CRABAPPLE_LOG);
                        output.accept(BlockRegistration.CRABAPPLE_WOOD);
                        output.accept(BlockRegistration.STRIPPED_CRABAPPLE_LOG);
                        output.accept(BlockRegistration.STRIPPED_CRABAPPLE_WOOD);
                        output.accept(BlockRegistration.CRABAPPLE_PLANKS);
                        output.accept(BlockRegistration.CRABAPPLE_STAIRS);
                        output.accept(BlockRegistration.CRABAPPLE_SLAB);
                        output.accept(BlockRegistration.CRABAPPLE_FENCE);
                        output.accept(BlockRegistration.CRABAPPLE_FENCE_GATE);
                        output.accept(BlockRegistration.CRABAPPLE_DOOR);
                        output.accept(BlockRegistration.CRABAPPLE_TRAPDOOR);
                        output.accept(BlockRegistration.CRABAPPLE_PRESSURE_PLATE);
                        output.accept(BlockRegistration.CRABAPPLE_BUTTON);
                        output.accept(ItemRegistration.CRABAPPLE_SIGN);
                        output.accept(ItemRegistration.CRABAPPLE_HANGING_SIGN);
                        output.accept(BlockRegistration.CRABAPPLE_BOOKSHELF);
                        output.accept(BlockRegistration.CRABAPPLE_WINDOW);
                        output.accept(BlockRegistration.CRABAPPLE_WINDOW_PANE);
                        output.accept(BlockRegistration.CRABAPPLE_WAINSCOTING);
                        output.accept(BlockRegistration.PINK_PLANTER);

                        //FLOWERING CRABAPPLE WOODSET
                        output.accept(BlockRegistration.FLOWERING_CRABAPPLE_LEAVES);
                        output.accept(BlockRegistration.FLOWERING_CARPET_CRABAPPLE);
                        output.accept(BlockRegistration.FLOWERING_CRABAPPLE_LOG);
                        output.accept(BlockRegistration.FLOWERING_CRABAPPLE_WOOD);
                        output.accept(BlockRegistration.STRIPPED_FLOWERING_CRABAPPLE_LOG);
                        output.accept(BlockRegistration.STRIPPED_FLOWERING_CRABAPPLE_WOOD);
                        output.accept(BlockRegistration.FLOWERING_CRABAPPLE_PLANKS);
                        output.accept(BlockRegistration.FLOWERING_CRABAPPLE_STAIRS);
                        output.accept(BlockRegistration.FLOWERING_CRABAPPLE_SLAB);
                        output.accept(BlockRegistration.FLOWERING_CRABAPPLE_FENCE);
                        output.accept(BlockRegistration.FLOWERING_CRABAPPLE_FENCE_GATE);
                        output.accept(BlockRegistration.FLOWERING_CRABAPPLE_DOOR);
                        output.accept(BlockRegistration.FLOWERING_CRABAPPLE_TRAPDOOR);
                        output.accept(BlockRegistration.FLOWERING_CRABAPPLE_PRESSURE_PLATE);
                        output.accept(BlockRegistration.FLOWERING_CRABAPPLE_BUTTON);
                        output.accept(ItemRegistration.FLOWERING_CRABAPPLE_SIGN);
                        output.accept(ItemRegistration.FLOWERING_CRABAPPLE_HANGING_SIGN);
                        output.accept(BlockRegistration.FLOWERING_CRABAPPLE_BOOKSHELF);
                        output.accept(BlockRegistration.FLOWERING_CRABAPPLE_WINDOW);
                        output.accept(BlockRegistration.FLOWERING_CRABAPPLE_WINDOW_PANE);
                        output.accept(BlockRegistration.FLOWERING_CRABAPPLE_WAINSCOTING);

                        //SYCAMORE WOODSET
                        output.accept(BlockRegistration.SYCAMORE_SAPLING);
                        output.accept(BlockRegistration.SYCAMORE_LEAVES);
                        output.accept(BlockRegistration.SYCAMORE_LOG);
                        output.accept(BlockRegistration.SYCAMORE_WOOD);
                        output.accept(BlockRegistration.STRIPPED_SYCAMORE_LOG);
                        output.accept(BlockRegistration.STRIPPED_SYCAMORE_WOOD);
                        output.accept(BlockRegistration.SYCAMORE_PLANKS);
                        output.accept(BlockRegistration.SYCAMORE_STAIRS);
                        output.accept(BlockRegistration.SYCAMORE_SLAB);
                        output.accept(BlockRegistration.SYCAMORE_FENCE);
                        output.accept(BlockRegistration.SYCAMORE_FENCE_GATE);
                        output.accept(BlockRegistration.SYCAMORE_DOOR);
                        output.accept(BlockRegistration.SYCAMORE_TRAPDOOR);
                        output.accept(BlockRegistration.SYCAMORE_PRESSURE_PLATE);
                        output.accept(BlockRegistration.SYCAMORE_BUTTON);
                        output.accept(ItemRegistration.SYCAMORE_SIGN);
                        output.accept(ItemRegistration.SYCAMORE_HANGING_SIGN);
                        output.accept(BlockRegistration.SYCAMORE_BOOKSHELF);
                        output.accept(BlockRegistration.SYCAMORE_WINDOW);
                        output.accept(BlockRegistration.SYCAMORE_WINDOW_PANE);
                        output.accept(BlockRegistration.SYCAMORE_WAINSCOTING);
                        output.accept(BlockRegistration.GREEN_PLANTER);

                        //FLUORESCENT MAPLE WOODSET
                        output.accept(BlockRegistration.MAPLE_SAPLING);
                        output.accept(BlockRegistration.MAPLE_LEAVES);
                        output.accept(BlockRegistration.MAPLE_LEAVES_FLOWERING);
                        output.accept(BlockRegistration.MAPLE_LOG);
                        output.accept(BlockRegistration.MAPLE_WOOD);
                        output.accept(BlockRegistration.STRIPPED_MAPLE_LOG);
                        output.accept(BlockRegistration.STRIPPED_MAPLE_WOOD);
                        output.accept(BlockRegistration.MAPLE_PLANKS);
                        output.accept(BlockRegistration.MAPLE_STAIRS);
                        output.accept(BlockRegistration.MAPLE_SLAB);
                        output.accept(BlockRegistration.MAPLE_FENCE);
                        output.accept(BlockRegistration.MAPLE_FENCE_GATE);
                        output.accept(BlockRegistration.MAPLE_DOOR);
                        output.accept(BlockRegistration.MAPLE_TRAPDOOR);
                        output.accept(BlockRegistration.MAPLE_PRESSURE_PLATE);
                        output.accept(BlockRegistration.MAPLE_BUTTON);
                        output.accept(ItemRegistration.MAPLE_SIGN);
                        output.accept(ItemRegistration.MAPLE_HANGING_SIGN);
                        output.accept(BlockRegistration.MAPLE_BOOKSHELF);
                        output.accept(BlockRegistration.MAPLE_WINDOW);
                        output.accept(BlockRegistration.MAPLE_WINDOW_PANE);
                        output.accept(BlockRegistration.MAPLE_WAINSCOTING);
                        output.accept(BlockRegistration.FLUORESCENT_PLANTER);

                        //BLUE MUSHROOM WOODSET
                        output.accept(BlockRegistration.BLUE_MUSHROOM_SAPLING);
                        output.accept(BlockRegistration.BLUE_MUSHROOM_CAP);
                        output.accept(BlockRegistration.BLUE_MUSHROOM_LOG);
                        output.accept(BlockRegistration.BLUE_MUSHROOM_WOOD);
                        output.accept(BlockRegistration.BLUE_MUSHROOM_PLANKS);
                        output.accept(BlockRegistration.BLUE_MUSHROOM_STAIRS);
                        output.accept(BlockRegistration.BLUE_MUSHROOM_SLAB);
                        output.accept(BlockRegistration.BLUE_MUSHROOM_FENCE);
                        output.accept(BlockRegistration.BLUE_MUSHROOM_FENCE_GATE);
                        output.accept(BlockRegistration.BLUE_MUSHROOM_DOOR);
                        output.accept(BlockRegistration.BLUE_MUSHROOM_TRAPDOOR);
                        output.accept(BlockRegistration.BLUE_MUSHROOM_PRESSURE_PLATE);
                        output.accept(BlockRegistration.BLUE_MUSHROOM_BUTTON);
                        output.accept(ItemRegistration.BLUE_MUSHROOM_SIGN);
                        output.accept(ItemRegistration.BLUE_MUSHROOM_HANGING_SIGN);
                        output.accept(BlockRegistration.BLUE_MUSHROOM_BOOKSHELF);
                        output.accept(BlockRegistration.BLUE_MUSHROOM_WINDOW);
                        output.accept(BlockRegistration.BLUE_MUSHROOM_WINDOW_PANE);
                        output.accept(BlockRegistration.BLUE_MUSHROOM_WAINSCOTING);
                        output.accept(BlockRegistration.BLUE_PLANTER);

                        //RED MUSHROOM WOODSET
                        output.accept(BlockRegistration.RED_MUSHROOM_SAPLING);
                        output.accept(BlockRegistration.RED_MUSHROOM_CAP);
                        output.accept(BlockRegistration.RED_MUSHROOM_LOG);
                        output.accept(BlockRegistration.RED_MUSHROOM_WOOD);
                        output.accept(BlockRegistration.RED_MUSHROOM_PLANKS);
                        output.accept(BlockRegistration.RED_MUSHROOM_STAIRS);
                        output.accept(BlockRegistration.RED_MUSHROOM_SLAB);
                        output.accept(BlockRegistration.RED_MUSHROOM_FENCE);
                        output.accept(BlockRegistration.RED_MUSHROOM_FENCE_GATE);
                        output.accept(BlockRegistration.RED_MUSHROOM_DOOR);
                        output.accept(BlockRegistration.RED_MUSHROOM_TRAPDOOR);
                        output.accept(BlockRegistration.RED_MUSHROOM_PRESSURE_PLATE);
                        output.accept(BlockRegistration.RED_MUSHROOM_BUTTON);
                        output.accept(ItemRegistration.RED_MUSHROOM_SIGN);
                        output.accept(ItemRegistration.RED_MUSHROOM_HANGING_SIGN);
                        output.accept(BlockRegistration.RED_MUSHROOM_BOOKSHELF);
                        output.accept(BlockRegistration.RED_MUSHROOM_WINDOW);
                        output.accept(BlockRegistration.RED_MUSHROOM_WINDOW_PANE);
                        output.accept(BlockRegistration.RED_MUSHROOM_WAINSCOTING);
                        output.accept(BlockRegistration.RED_PLANTER);

                        //CHALCEDONY SET
                        output.accept(BlockRegistration.CHALCEDONY);
                        output.accept(BlockRegistration.CHALCEDONY_STAIRS);
                        output.accept(BlockRegistration.CHALCEDONY_SLAB);
                        output.accept(BlockRegistration.POLISHED_CHALCEDONY);
                        output.accept(BlockRegistration.CHALCEDONY_BRICKS);
                        output.accept(BlockRegistration.CHALCEDONY_BRICK_STAIRS);
                        output.accept(BlockRegistration.CHALCEDONY_BRICK_SLAB);
                        output.accept(BlockRegistration.CHISELED_CHALCEDONY);
                        output.accept(BlockRegistration.CHALCEDONY_BORDER);
                        output.accept(BlockRegistration.CHALCEDONY_ACANTHUS);
                        output.accept(BlockRegistration.CHALCEDONY_HELIX);
                        output.accept(BlockRegistration.CHALCEDONY_MEANDER);
                        output.accept(BlockRegistration.CHALCEDONY_TEXTILES);
                        output.accept(BlockRegistration.CHALCEDONY_PILLAR_BASE);
                        output.accept(BlockRegistration.CHALCEDONY_PILLAR);
                        output.accept(BlockRegistration.CHALCEDONY_PILLAR_DORIC);
                        output.accept(BlockRegistration.CHALCEDONY_PILLAR_IONIC);
                        output.accept(BlockRegistration.CHALCEDONY_BALUSTRADE);
                        output.accept(BlockRegistration.CHALCEDONY_PICKET_FENCE);
                        output.accept(BlockRegistration.CHALCEDONY_PICKET_FENCE_GATE);

                        output.accept(BlockRegistration.CHALCEDONY_BRACKET_VICTORIAN);
                        output.accept(BlockRegistration.CHALCEDONY_BRACKET_SCROLL);
                        output.accept(BlockRegistration.CHALCEDONY_BRACKET_BOW);
                        output.accept(BlockRegistration.CHALCEDONY_BRACKET_BOW_SCROLL);
                        output.accept(BlockRegistration.CHALCEDONY_BRACKET_STAR);
                        output.accept(BlockRegistration.CHALCEDONY_BRACKET_STAR_SCROLL);
                        output.accept(BlockRegistration.CHALCEDONY_BRACKET_SCROLL_SHELF);

                        output.accept(BlockRegistration.CHALCEDONY_TILES);
                        output.accept(BlockRegistration.CHALCEDONY_SMALL_TILES);
                        output.accept(BlockRegistration.STARRY_CHISELED_CHALCEDONY);
                        output.accept(BlockRegistration.STARRY_CHALCEDONY_PILLAR_BASE);
                        output.accept(BlockRegistration.STARRY_CHALCEDONY_PILLAR);
                        output.accept(BlockRegistration.STARRY_CHALCEDONY_PILLAR_DORIC);
                        output.accept(BlockRegistration.STARRY_CHALCEDONY_PILLAR_IONIC);
                        output.accept(BlockRegistration.CHALCEDONY_WINDOW);
                        output.accept(BlockRegistration.CHALCEDONY_WINDOW_PANE);
                        //DEEP CHALCEDONY SET
                        output.accept(BlockRegistration.DEEP_CHALCEDONY);
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_STAIRS);
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_SLAB);
                        output.accept(BlockRegistration.DEEP_POLISHED_CHALCEDONY);
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_BRICKS);
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_BRICK_STAIRS);
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_BRICK_SLAB);
                        output.accept(BlockRegistration.DEEP_CHISELED_CHALCEDONY);
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_BORDER);
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_ACANTHUS);
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_HELIX);
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_MEANDER);
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_TEXTILES);
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_PILLAR_BASE);
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_PILLAR);
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_PILLAR_DORIC);
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_PILLAR_IONIC);
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_BALUSTRADE);
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_PICKET_FENCE);
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_PICKET_FENCE_GATE);

                        output.accept(BlockRegistration.DEEP_CHALCEDONY_BRACKET_VICTORIAN);
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_BRACKET_SCROLL);
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_BRACKET_BOW);
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_BRACKET_BOW_SCROLL);
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_BRACKET_STAR);
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_BRACKET_STAR_SCROLL);
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_BRACKET_SCROLL_SHELF);

                        output.accept(BlockRegistration.DEEP_CHALCEDONY_TILES);
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_SMALL_TILES);
                        output.accept(BlockRegistration.DEEP_STARRY_CHISELED_CHALCEDONY);
                        output.accept(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_BASE);
                        output.accept(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR);
                        output.accept(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_DORIC);
                        output.accept(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_IONIC);
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_WINDOW);
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_WINDOW_PANE);
                        //MARBLE SET
                        output.accept(BlockRegistration.MARBLE);
                        output.accept(BlockRegistration.MARBLE_STAIRS);
                        output.accept(BlockRegistration.MARBLE_SLAB);
                        output.accept(BlockRegistration.POLISHED_MARBLE);
                        output.accept(BlockRegistration.MARBLE_BRICKS);
                        output.accept(BlockRegistration.MARBLE_BRICK_STAIRS);
                        output.accept(BlockRegistration.MARBLE_BRICK_SLAB);
                        output.accept(BlockRegistration.CHISELED_MARBLE);
                        output.accept(BlockRegistration.MARBLE_BORDER);
                        output.accept(BlockRegistration.MARBLE_ACANTHUS);
                        output.accept(BlockRegistration.MARBLE_HELIX);
                        output.accept(BlockRegistration.MARBLE_MEANDER);
                        output.accept(BlockRegistration.MARBLE_TEXTILES);
                        output.accept(BlockRegistration.MARBLE_PILLAR_BASE);
                        output.accept(BlockRegistration.MARBLE_PILLAR);
                        output.accept(BlockRegistration.MARBLE_PILLAR_DORIC);
                        output.accept(BlockRegistration.MARBLE_PILLAR_IONIC);
                        output.accept(BlockRegistration.MARBLE_BALUSTRADE);
                        output.accept(BlockRegistration.MARBLE_PICKET_FENCE);
                        output.accept(BlockRegistration.MARBLE_PICKET_FENCE_GATE);

                        output.accept(BlockRegistration.MARBLE_BRACKET_VICTORIAN);
                        output.accept(BlockRegistration.MARBLE_BRACKET_SCROLL);
                        output.accept(BlockRegistration.MARBLE_BRACKET_BOW);
                        output.accept(BlockRegistration.MARBLE_BRACKET_BOW_SCROLL);
                        output.accept(BlockRegistration.MARBLE_BRACKET_STAR);
                        output.accept(BlockRegistration.MARBLE_BRACKET_STAR_SCROLL);
                        output.accept(BlockRegistration.MARBLE_BRACKET_SCROLL_SHELF);

                        output.accept(BlockRegistration.MARBLE_TILES);
                        output.accept(BlockRegistration.MARBLE_SMALL_TILES);
                        output.accept(BlockRegistration.STARRY_CHISELED_MARBLE);
                        output.accept(BlockRegistration.MARBLE_TILE);
                        output.accept(BlockRegistration.MARBLE_TILE_CHISELED);
                        output.accept(BlockRegistration.MARBLE_TILE_BORDER);
                        output.accept(BlockRegistration.MARBLE_TILE_BORDER_CIRCLE);
                        output.accept(BlockRegistration.MARBLE_TILE_BORDER_DETAIL);
                        output.accept(BlockRegistration.MARBLE_TILE_CORNER);
                        output.accept(BlockRegistration.MARBLE_TILE_CORNER_CIRCLE);

                        //MISC SECTION
                        output.accept(BlockRegistration.COLOSSEO_PILLAR_BASE);
                        output.accept(BlockRegistration.COLOSSEO_PILLAR);
                        output.accept(BlockRegistration.COLOSSEO_PILLAR_TOP);

                        //WALLPAPERS
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_APPLE);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_APPLE_BOTTOM_BROWN);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_APPLE_TOP_BROWN);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_APPLE_BOTTOM_WHITE);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_APPLE_TOP_WHITE);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_APPLE_BOTTOM_COLOR);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_APPLE_TOP_COLOR);

                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_BOTTOM_BROWN);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_TOP_BROWN);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_BOTTOM_WHITE);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_TOP_WHITE);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_BOTTOM_COLOR);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_TOP_COLOR);

                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_BOTTOM_BROWN);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_TOP_BROWN);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_BOTTOM_WHITE);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_TOP_WHITE);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_BOTTOM_COLOR);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_TOP_COLOR);

                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BONES);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BONES_BOTTOM_BROWN);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BONES_TOP_BROWN);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BONES_BOTTOM_WHITE);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BONES_TOP_WHITE);

                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_BOTTOM_BROWN);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_TOP_BROWN);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_BOTTOM_WHITE);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_TOP_WHITE);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_BOTTOM_COLOR);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_TOP_COLOR);

                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_BOTTOM_BROWN);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_TOP_BROWN);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_BOTTOM_WHITE);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_TOP_WHITE);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_BOTTOM_COLOR);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_TOP_COLOR);

                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_BOTTOM_BROWN);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_TOP_BROWN);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_BOTTOM_WHITE);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_TOP_WHITE);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_BOTTOM_COLOR);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_TOP_COLOR);

                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_LEMON);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_LEMON_BOTTOM_BROWN);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_LEMON_TOP_BROWN);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_LEMON_BOTTOM_WHITE);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_LEMON_TOP_WHITE);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_LEMON_BOTTOM_COLOR);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_LEMON_TOP_COLOR);

                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_ORANGE);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_BOTTOM_BROWN);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_TOP_BROWN);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_BOTTOM_WHITE);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_TOP_WHITE);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_BOTTOM_COLOR);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_TOP_COLOR);

                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PEAR);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PEAR_BOTTOM_BROWN);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PEAR_TOP_BROWN);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PEAR_BOTTOM_WHITE);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PEAR_TOP_WHITE);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PEAR_BOTTOM_COLOR);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PEAR_TOP_COLOR);

                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PLUM);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PLUM_BOTTOM_BROWN);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PLUM_TOP_BROWN);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PLUM_BOTTOM_WHITE);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PLUM_TOP_WHITE);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PLUM_BOTTOM_COLOR);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PLUM_TOP_COLOR);

                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_BOTTOM_BROWN);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_TOP_BROWN);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_BOTTOM_WHITE);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_TOP_WHITE);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_BOTTOM_COLOR);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_TOP_COLOR);

                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_BOTTOM_BROWN);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_TOP_BROWN);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_BOTTOM_WHITE);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_TOP_WHITE);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_BOTTOM_COLOR);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_TOP_COLOR);

                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_BOTTOM_BROWN);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_TOP_BROWN);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_BOTTOM_WHITE);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_TOP_WHITE);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_BOTTOM_COLOR);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_TOP_COLOR);

                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR_BOTTOM_BROWN);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR_TOP_BROWN);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR_BOTTOM_WHITE);
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR_TOP_WHITE);


                        output.accept(BlockRegistration.STARRY_WALLPAPER_BOTTOM);
                        output.accept(BlockRegistration.STARRY_WALLPAPER);
                        output.accept(BlockRegistration.STARRY_WALLPAPER_TOP);

                        output.accept(BlockRegistration.DARK_STARRY_WALLPAPER_BOTTOM);
                        output.accept(BlockRegistration.DARK_STARRY_WALLPAPER);
                        output.accept(BlockRegistration.DARK_STARRY_WALLPAPER_TOP);

                        output.accept(BlockRegistration.CHIC_WALLPAPER_LOWER_TRIM);
                        output.accept(BlockRegistration.CHIC_WALLPAPER);
                        output.accept(BlockRegistration.CHIC_WALLPAPER_UPPER_TRIM);

                        output.accept(BlockRegistration.PINK_STRIPE_WALLPAPER_LOWER_TRIM);
                        output.accept(BlockRegistration.PINK_STRIPE_WALLPAPER);
                        output.accept(BlockRegistration.PINK_STRIPE_WALLPAPER_UPPER_TRIM);

                        output.accept(BlockRegistration.RIALTO_GOLD_WALLPAPER_BOTTOM);
                        output.accept(BlockRegistration.RIALTO_GOLD_WALLPAPER);
                        output.accept(BlockRegistration.RIALTO_GOLD_WALLPAPER_TOP);

                        output.accept(BlockRegistration.GHOST_WALLPAPER_WAINSCOTING);
                        output.accept(BlockRegistration.GHOST_WALLPAPER);
                        output.accept(BlockRegistration.GHOST_WALLPAPER_TRIM);
                        output.accept(BlockRegistration.GHOST_WALLPAPER_TOP);
                        output.accept(BlockRegistration.GHOST_WALLPAPER_BOTTOM);

                        output.accept(BlockRegistration.HALLOWEEN_WAINSCOTING);
                        output.accept(BlockRegistration.HALLOWEEN_WALLPAPER);
                        output.accept(BlockRegistration.HALLOWEEN_WALLPAPER_TOP);
                        output.accept(BlockRegistration.HALLOWEEN_WALLPAPER_BOTTOM);

                        output.accept(BlockRegistration.CONFECTIONARY_WALLPAPER);
                        output.accept(BlockRegistration.CONFECTIONARY_WALLPAPER_TOP);
                        output.accept(BlockRegistration.CONFECTIONARY_WALLPAPER_BOTTOM);
                        output.accept(BlockRegistration.BLUE_WAINSCOTING);

                        output.accept(BlockRegistration.MINT_WALLPAPER);
                        output.accept(BlockRegistration.MINT_WALLPAPER_TOP);
                        output.accept(BlockRegistration.MINT_WALLPAPER_BOTTOM);
                        output.accept(BlockRegistration.BROWN_WAINSCOTING);

                        output.accept(BlockRegistration.TARTAN_YELLOW_WALLPAPER);
                        output.accept(BlockRegistration.CHECKERED_PINK_WALLPAPER);
                        output.accept(BlockRegistration.CHECKERED_PINK_STRAWBERRY_WALLPAPER);
                        output.accept(BlockRegistration.CHECKERED_GREEN_WALLPAPER);
                        output.accept(BlockRegistration.CHECKERED_GREEN_STRAWBERRY_WALLPAPER);

                        output.accept(BlockRegistration.RETRO_RAINBOW_WALLPAPER);

                        output.accept(BlockRegistration.FLORAL_BERRY_WALLPAPER);
                        output.accept(BlockRegistration.FLORAL_BERRY_WALLPAPER_TOP);
                        output.accept(BlockRegistration.FLORAL_BERRY_WALLPAPER_BOTTOM);

                        output.accept(BlockRegistration.STRIPED_FLORAL_WALLPAPER);
                        output.accept(BlockRegistration.STRIPED_FLORAL_WALLPAPER_TOP);
                        output.accept(BlockRegistration.STRIPED_FLORAL_WALLPAPER_BOTTOM);

                        output.accept(BlockRegistration.FLORAL_BORDER_WALLPAPER);

                        output.accept(BlockRegistration.MARIGOLD_WALLPAPER);
                        output.accept(BlockRegistration.MARIGOLD_WALLPAPER_TOP);
                        output.accept(BlockRegistration.MARIGOLD_WALLPAPER_BOTTOM);

                        output.accept(BlockRegistration.CHECKERED_FRUIT_WALLPAPER);
                        output.accept(BlockRegistration.APPLE_WALLPAPER);
                        output.accept(BlockRegistration.FISH_WALLPAPER);
                        output.accept(BlockRegistration.TROPICAL_FISH_WALLPAPER);

                        output.accept(BlockRegistration.BLUE_ROSE_STRIPED_WALLPAPER);
                        output.accept(BlockRegistration.BLUE_ROSE_STRIPED_WALLPAPER_TOP);
                        output.accept(BlockRegistration.BLUE_ROSE_STRIPED_WALLPAPER_BOTTOM);

                        output.accept(BlockRegistration.GINGERBREAD_BRICKS);
                        output.accept(BlockRegistration.GINGERBREAD_BRICK_STAIRS);
                        output.accept(BlockRegistration.GINGERBREAD_BRICK_SLAB);
                        output.accept(BlockRegistration.GINGERBREAD_BRICKS_TOP);
                        output.accept(BlockRegistration.GINGERBREAD_BRICKS_SIDE);
                        output.accept(BlockRegistration.GINGERBREAD_BRICKS_TOP_CORNER);

                        output.accept(BlockRegistration.VERDANT_TILE);
                        output.accept(BlockRegistration.VERDANT_TILE_EDGE);
                        output.accept(BlockRegistration.VERDANT_TILE_CORNER);

                        output.accept(BlockRegistration.ESPERANCA_TILE);
                        output.accept(BlockRegistration.LILIY_HILLS_TILE);
                        output.accept(BlockRegistration.HANNISH_TILE);
                        output.accept(BlockRegistration.AURA_TILES);
                        output.accept(BlockRegistration.BIFURCATING_TILES);
                        output.accept(BlockRegistration.BLACK_AMARYLLIS_TILES);
                        output.accept(BlockRegistration.ROSETTE_TILES);
                        output.accept(BlockRegistration.SEISMIC_TILES);

                        output.accept(BlockRegistration.PURPLE_TILES);
                        output.accept(BlockRegistration.SMALL_PURPLE_TILES);
                        output.accept(BlockRegistration.YELLOW_TILES);
                        output.accept(BlockRegistration.SMALL_YELLOW_TILES);
                        output.accept(BlockRegistration.PINK_TILES);
                        output.accept(BlockRegistration.SMALL_PINK_TILES);
                        output.accept(BlockRegistration.GREEN_TILES);
                        output.accept(BlockRegistration.SMALL_GREEN_TILES);
                        output.accept(BlockRegistration.IRIDESCENT_TILES);
                        output.accept(BlockRegistration.SMALL_IRIDESCENT_TILES);
                        output.accept(BlockRegistration.KITCHEN_TILES);
                        output.accept(BlockRegistration.X_TILE_TERRACOTTA);
                        output.accept(BlockRegistration.X_TILE_INVERSE_TERRACOTTA);
                        output.accept(BlockRegistration.X_TILE_BLUE);
                        output.accept(BlockRegistration.X_TILE_INVERSE_BLUE);
                        output.accept(BlockRegistration.X_TILE_GRAY);
                        output.accept(BlockRegistration.X_TILE_INVERSE_GRAY);

                        output.accept(BlockRegistration.GREENHOUSE_WINDOW);
                        output.accept(BlockRegistration.GREENHOUSE_WINDOW_ARCH_LEFT);
                        output.accept(BlockRegistration.GREENHOUSE_WINDOW_ARCH_RIGHT);
                        output.accept(BlockRegistration.GREENHOUSE_WINDOW_POINT);
                        output.accept(BlockRegistration.GREENHOUSE_WINDOW_RADIAL_LEFT);
                        output.accept(BlockRegistration.GREENHOUSE_WINDOW_RADIAL_RIGHT);
                        output.accept(BlockRegistration.GREENHOUSE_WINDOW_ROUNDED);
                        output.accept(BlockRegistration.GREENHOUSE_WINDOW_CIRCLE);

                        output.accept(BlockRegistration.ALABASTER_WINDOW_DIVIDED);
                        output.accept(BlockRegistration.ALABASTER_WINDOW_PANE);
                        output.accept(BlockRegistration.ALABASTER_SCREEN_DOOR);
                        output.accept(BlockRegistration.ALABASTER_FRENCH_DOOR);
                        output.accept(BlockRegistration.ALABASTER_WAINSCOTING);
                        
                        output.accept(BlockRegistration.WOOD_WINDOW_DIVIDED);
                        output.accept(BlockRegistration.WOOD_WINDOW_PANE);
                        output.accept(BlockRegistration.WOOD_SCREEN_DOOR);
                        output.accept(BlockRegistration.WOOD_FRENCH_DOOR);

                        output.accept(BlockRegistration.WOODEN_PICKET_FENCE);
                        output.accept(BlockRegistration.WOODEN_PICKET_FENCE_GATE);

                        output.accept(BlockRegistration.WOODEN_BRACKET_VICTORIAN);
                        output.accept(BlockRegistration.WOODEN_BRACKET_SCROLL);
                        output.accept(BlockRegistration.WOODEN_BRACKET_BOW);
                        output.accept(BlockRegistration.WOODEN_BRACKET_BOW_SCROLL);
                        output.accept(BlockRegistration.WOODEN_BRACKET_STAR);
                        output.accept(BlockRegistration.WOODEN_BRACKET_STAR_SCROLL);
                        output.accept(BlockRegistration.WOODEN_BRACKET_SCROLL_SHELF);

                        output.accept(BlockRegistration.STRAWBERRY_JAR_BLOCK );
                        output.accept(BlockRegistration.CHERRY_JAR_BLOCK);
                        output.accept(BlockRegistration.APRICOT_JAR_BLOCK );
                        output.accept(BlockRegistration.ORANGE_JAR_BLOCK);
                        output.accept(BlockRegistration.HONEY_JAR_BLOCK);
                        output.accept(BlockRegistration.BLUEBERRY_JAR_BLOCK );


                        output.accept(BlockRegistration.BLACK_CAT_WINDOW);
                        output.accept(BlockRegistration.BLACK_CAT_WINDOW_PANE);
                        output.accept(BlockRegistration.STONE_TEXTILES);
                        output.accept(BlockRegistration.PUMPKIN_BOOKSHELF);
                        output.accept(BlockRegistration.BEIGE_PLANTER);
                        output.accept(BlockRegistration.WICKER_BLOCK);
                        output.accept(BlockRegistration.CHISELED_GOLD_BLOCK);
                        output.accept(BlockRegistration.VARYING_BRICKS);
                        output.accept(BlockRegistration.VARYING_BRICKS_BORDER);
                        output.accept(BlockRegistration.EYE_BLOCK);
                        output.accept(BlockRegistration.DYNASTY_DOOR);
                        output.accept(BlockRegistration.ART_NOUVEAU_DOOR);
                        output.accept(BlockRegistration.ART_NOUVEAU_DOOR_DARK);

                    })
                    .build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CLUTTERED_FURNITURE_TAB = CREATIVE_MODE_TABS.register("cluttered_furniture_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(BlockRegistration.ENDTABLE_DECOR))
                    .title(Component.translatable("creativetab.cluttered_furniture_tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        //LAMPS
                        output.accept(BlockRegistration.HONEYCOMB_LAMP);
                        output.accept(BlockRegistration.BEE_LAMP);
                        output.accept(BlockRegistration.BEE_LAMP_ANGRY);

                        output.accept(BlockRegistration.HOPPIN_PARK_LANTERN);
                        output.accept(BlockRegistration.SEA_GEM_LANTERN);
                        output.accept(BlockRegistration.COLOSSEO_WALL_LANTERN);

                        output.accept(BlockRegistration.STAINED_GLASS_LAMP);
                        output.accept(BlockRegistration.ANTIQUE_STANDING_LAMP);

                        output.accept(BlockRegistration.CAGED_BULB);

                        output.accept(BlockRegistration.OSSON_PENDANT_WHITE);
                        output.accept(BlockRegistration.OSSON_PENDANT_BLACK);
                        output.accept(BlockRegistration.OSSON_PENDANT_BROWN);
                        output.accept(BlockRegistration.OSSON_PENDANT_RED);
                        output.accept(BlockRegistration.OSSON_PENDANT_ORANGE);
                        output.accept(BlockRegistration.OSSON_PENDANT_YELLOW);
                        output.accept(BlockRegistration.OSSON_PENDANT_SAGE_GREEN);
                        output.accept(BlockRegistration.OSSON_PENDANT_RACING_GREEN);

                        //FRUIT SET
                        output.accept(BlockRegistration.APPLE_CHAIR);
                        output.accept(BlockRegistration.LEMON_TABLE);

                        //FWISH SET
                        output.accept(BlockRegistration.FWISH_ARMCHAIR);
                        output.accept(BlockRegistration.FWISH_OTTOMAN);
                        output.accept(BlockRegistration.FWISH_BOOKCASE);

                        //MERMAID SET
                        output.accept(BlockRegistration.MERMAID_PEARL);
                        output.accept(BlockRegistration.MERMAID_DRESSER);

                        //ROVER SET
                        output.accept(BlockRegistration.ROVER_MUG);
                        output.accept(BlockRegistration.ROVER_STOOL);
                        output.accept(BlockRegistration.BRIEFCASE_BLANK);
                        output.accept(BlockRegistration.BRIEFCASE_ROVER);

                        //IMPERIAL SET
                        output.accept(BlockRegistration.IMPERIAL_CHAIR);
                        output.accept(BlockRegistration.IMPERIAL_TABLE);

                        //LUNAR OBSERVATORY SET
                        output.accept(BlockRegistration.LUNAR_OBSERVATORY_TABLE);
                        output.accept(BlockRegistration.LUNAR_OBSERVATORY_PEDESTAL);
                        output.accept(BlockRegistration.LUNAR_OBSERVATORY_BOOKS);
                        output.accept(BlockRegistration.LUNAR_OBSERVATORY_PAPER_BASKET);
                        output.accept(BlockRegistration.LUNAR_OBSERVATORY_GLOBE);
                        output.accept(BlockRegistration.LUNAR_OBSERVATORY_JARS);

                        //COTTAGE SET
                        output.accept(BlockRegistration.COTTAGE_CHAIR);
                        output.accept(BlockRegistration.COTTAGE_CHAIR_CUSHIONED);
                        output.accept(BlockRegistration.COTTAGE_ARMCHAIR);
                        output.accept(BlockRegistration.COTTAGE_OTTOMAN);
                        output.accept(BlockRegistration.COTTAGE_SIDE_TABLE);
                        output.accept(BlockRegistration.COTTAGE_STANDING_LAMP);
                        output.accept(BlockRegistration.COTTAGE_BOOKCASE);

                        //DARKWOOD SET
                        output.accept(BlockRegistration.DARKWOOD_CHAIR_GEOMETRIC);
                        output.accept(BlockRegistration.DARKWOOD_CHAIR_QUILTED);
                        output.accept(BlockRegistration.DARKWOOD_CHAIR_SOUTHERN_FLAIR);
                        output.accept(BlockRegistration.DARKWOOD_SOFA_GEOMETRIC);
                        output.accept(BlockRegistration.DARKWOOD_SOFA_QUILTED);
                        output.accept(BlockRegistration.DARKWOOD_SOFA_SOUTHERN_FLAIR);
                        output.accept(BlockRegistration.DARKWOOD_DECORATIVE_SHELVES_GEOMETRIC);
                        output.accept(BlockRegistration.DARKWOOD_DECORATIVE_SHELVES_QUILTED);
                        output.accept(BlockRegistration.DARKWOOD_DECORATIVE_SHELVES_SOUTHERN_FLAIR);
                        output.accept(BlockRegistration.DARKWOOD_ENDTABLE);
                        output.accept(BlockRegistration.DARKWOOD_TABLE);
                        output.accept(BlockRegistration.DARKWOOD_STOOL);
                        output.accept(BlockRegistration.DARKWOOD_CABINET);
                        output.accept(BlockRegistration.DARKWOOD_CLOCK);
                        output.accept(BlockRegistration.DARKWOOD_BED_GEOMETRIC);
                        output.accept(BlockRegistration.DARKWOOD_BED_QUILTED);
                        output.accept(BlockRegistration.DARKWOOD_BED_SOUTHERN_FLAIR);

                        //PASTEL SET (ACNH)
                        output.accept(BlockRegistration.WOODEN_BLOCK_BOOKSHELF_PASTEL);

                        //PASTEL SET (STARBOUND)
                        output.accept(BlockRegistration.PASTEL_CHAIR);
                        output.accept(BlockRegistration.PASTEL_STOOL);
                        output.accept(BlockRegistration.PASTEL_TABLE);
                        output.accept(BlockRegistration.PASTEL_LIGHT);
                        output.accept(BlockRegistration.PASTEL_CABINET);
                        output.accept(BlockRegistration.PASTEL_WARDROBE);
                        output.accept(BlockRegistration.PASTEL_BED);
                        output.accept(BlockRegistration.PASTEL_PLUSH);


                        //STEAMPUNK SET
                        output.accept(BlockRegistration.BRASS_KEY);
                        output.accept(BlockRegistration.STEAMPUNK_LAMP);
                        output.accept(BlockRegistration.STEAMPUNK_GLOBE);

                        //MUSHROOM SETS
                        output.accept(BlockRegistration.BLUE_MUSHROOM_TABLE);
                        output.accept(BlockRegistration.BLUE_MUSHROOM_WARDROBE);
                        output.accept(BlockRegistration.BLUE_MUSHROOM_BED);
                        output.accept(BlockRegistration.BLUE_MUSHROOM_TV);
                        output.accept(BlockRegistration.BLUE_MUSHROOM_LAMP);
                        output.accept(BlockRegistration.RED_MUSHROOM_TABLE);
                        output.accept(BlockRegistration.RED_MUSHROOM_WARDROBE);
                        output.accept(BlockRegistration.RED_MUSHROOM_BED);
                        output.accept(BlockRegistration.RED_MUSHROOM_TV);
                        output.accept(BlockRegistration.RED_MUSHROOM_LAMP);

                        //FLAGS
                        output.accept(BlockRegistration.MINI_FLAG_RAINBOW);
                        output.accept(BlockRegistration.MINI_FLAG_LESBIAN);
                        output.accept(BlockRegistration.MINI_FLAG_BI);
                        output.accept(BlockRegistration.MINI_FLAG_PAN);
                        output.accept(BlockRegistration.MINI_FLAG_ACE);
                        output.accept(BlockRegistration.MINI_FLAG_TRANS);
                        output.accept(BlockRegistration.MINI_FLAG_NONBINARY);

                        output.accept(BlockRegistration.ANIMATED_FLAG_RAINBOW);
                        output.accept(BlockRegistration.ANIMATED_FLAG_LESBIAN);
                        output.accept(BlockRegistration.ANIMATED_FLAG_BISEXUAL);
                        output.accept(BlockRegistration.ANIMATED_FLAG_PANSEXUAL);
                        output.accept(BlockRegistration.ANIMATED_FLAG_ASEXUAL);
                        output.accept(BlockRegistration.ANIMATED_FLAG_TRANSGENDER);
                        output.accept(BlockRegistration.ANIMATED_FLAG_NONBINARY);

                        //OUTDOORS
                        output.accept(BlockRegistration.PICNIC_BASKET);
                        output.accept(BlockRegistration.PICNIC_BASKET_PREPARED);
                        output.accept(BlockRegistration.BASKET_OF_PRODUCE);
                        output.accept(BlockRegistration.BASKET_OF_FLOWERS);

                        output.accept(BlockRegistration.BIRDHOUSE_UNPAINTED);
                        output.accept(BlockRegistration.BIRDHOUSE_RED);
                        output.accept(BlockRegistration.BIRDHOUSE_BLUE);
                        output.accept(BlockRegistration.BIRDHOUSE_PASTEL);

                        output.accept(BlockRegistration.CUPID_BENCH);

                        output.accept(BlockRegistration.BIKE_YELLOW);
                        output.accept(BlockRegistration.BIKE_YELLOW_FLOWERS);
                        output.accept(BlockRegistration.BIKE_BLUE);
                        output.accept(BlockRegistration.BIKE_BLUE_FLOWERS);
                        output.accept(BlockRegistration.BIKE_PURPLE);
                        output.accept(BlockRegistration.BIKE_PURPLE_FLOWERS);
                        output.accept(BlockRegistration.BIKE_PINK);
                        output.accept(BlockRegistration.BIKE_PINK_FLOWERS);

                        output.accept(BlockRegistration.POK_TA_POK_HOOP);
                        output.accept(BlockRegistration.POK_TA_POK_HOOP_SNAKES);
                        output.accept(BlockRegistration.WEDDING_ARCH);
                        output.accept(BlockRegistration.WATERING_CAN);
                        output.accept(BlockRegistration.WATERING_CAN_COPPER);
                        output.accept(BlockRegistration.SMALL_BUSH);

                        //PLANTS
                        output.accept(BlockRegistration.TWO_FLOWER_POTS);
                        output.accept(BlockRegistration.MINI_CACTUS_SET);
                        output.accept(BlockRegistration.GLASS_FLOWER_VASE);
                        output.accept(BlockRegistration.SEAWEED_PLANTER);
                        output.accept(BlockRegistration.CAT_PLANT_POT_BLACK);
                        output.accept(BlockRegistration.CAT_PLANT_POT_ORANGE);
                        output.accept(BlockRegistration.HANGING_PLANT_POT_FLOWERS);
                        output.accept(BlockRegistration.HANGING_PLANT_POT_GRASS);

                        output.accept(BlockRegistration.PLANT_LADDER);
                        output.accept(BlockRegistration.FENCE_SHELF);
                        output.accept(BlockRegistration.MINI_HANGING_TERRARIUMS);
                        output.accept(BlockRegistration.MUSHROOM_JARS);

                        output.accept(BlockRegistration.MUSHROOM_TERRARIUM_RED);
                        output.accept(BlockRegistration.MUSHROOM_TERRARIUM_BROWN);
                        output.accept(BlockRegistration.GLOWSHROOM_TERRARIUM_YELLOW);
                        output.accept(BlockRegistration.GLOWSHROOM_TERRARIUM_GREEN);
                        output.accept(BlockRegistration.GLOWSHROOM_TERRARIUM_BLUE);
                        output.accept(BlockRegistration.GLOWSHROOM_TERRARIUM_PURPLE);
                        output.accept(BlockRegistration.GLOWSHROOM_TERRARIUM_PINK);



                        //LIVING ROOM
                        //SHELVES (LIVING ROOM SUB)
                        output.accept(BlockRegistration.HANGING_SHELVES_PLANTS);
                        output.accept(BlockRegistration.HANGING_SHELVES_POTTERY);

                        output.accept(BlockRegistration.FLOWER_SHELF_PLANT);
                        output.accept(BlockRegistration.FLOWER_SHELF_BLUE);
                        output.accept(BlockRegistration.FLOWER_SHELF_GREEN);
                        output.accept(BlockRegistration.FLOWER_SHELF_PASTEL_YELLOW);
                        output.accept(BlockRegistration.FLOWER_SHELF_PINK);
                        output.accept(BlockRegistration.FLOWER_SHELF_PURPLE);
                        output.accept(BlockRegistration.FLOWER_SHELF_YELLOW);
                        output.accept(BlockRegistration.FLOWER_SHELF_CANDLE_BLUE);
                        output.accept(BlockRegistration.FLOWER_SHELF_CANDLE_GREEN);
                        output.accept(BlockRegistration.FLOWER_SHELF_CANDLE_PASTEL_YELLOW);
                        output.accept(BlockRegistration.FLOWER_SHELF_CANDLE_PINK);
                        output.accept(BlockRegistration.FLOWER_SHELF_CANDLE_PURPLE);
                        output.accept(BlockRegistration.FLOWER_SHELF_CANDLE_YELLOW);

                        output.accept(BlockRegistration.SMALL_SHELF);
                        output.accept(BlockRegistration.SMALL_SHELF_PINK);

                        output.accept(BlockRegistration.RECORD_PLAYER_RED);
                        output.accept(BlockRegistration.RECORD_PLAYER_YELLOW);
                        output.accept(BlockRegistration.RECORD_PLAYER_BLUE);
                        output.accept(BlockRegistration.RECORD_PLAYER_PURPLE);
                        output.accept(BlockRegistration.RECORD_PLAYER_PINK);
                        output.accept(BlockRegistration.RECORD_PLAYER_BROWN);
                        output.accept(BlockRegistration.RECORD_PLAYER_WHITE);
                        output.accept(BlockRegistration.TRADITIONAL_RADIO);

                        output.accept(BlockRegistration.UNLIVING_CHAIR);
                        //LOVESEATS
                        output.accept(BlockRegistration.LOVELY_LOVE_SEAT);
                        output.accept(BlockRegistration.LOVELY_LOVE_SEAT_BLACK);

                        //ARMCHAIRS
                        output.accept(BlockRegistration.ARMCHAIR_WHITE);
                        output.accept(BlockRegistration.ARMCHAIR_LIGHT_GRAY);
                        output.accept(BlockRegistration.ARMCHAIR_GRAY);
                        output.accept(BlockRegistration.ARMCHAIR_BLACK);
                        output.accept(BlockRegistration.ARMCHAIR_BROWN);
                        output.accept(BlockRegistration.ARMCHAIR_RED);
                        output.accept(BlockRegistration.ARMCHAIR_ORANGE);
                        output.accept(BlockRegistration.ARMCHAIR_YELLOW);
                        output.accept(BlockRegistration.ARMCHAIR_LIME);
                        output.accept(BlockRegistration.ARMCHAIR_GREEN);
                        output.accept(BlockRegistration.ARMCHAIR_CYAN);
                        output.accept(BlockRegistration.ARMCHAIR_LIGHT_BLUE);
                        output.accept(BlockRegistration.ARMCHAIR_BLUE);
                        output.accept(BlockRegistration.ARMCHAIR_PURPLE);
                        output.accept(BlockRegistration.ARMCHAIR_MAGENTA);
                        output.accept(BlockRegistration.ARMCHAIR_PINK);
                        output.accept(BlockRegistration.ARMCHAIR_FUCHSIA);
                        output.accept(BlockRegistration.ARMCHAIR_IVORY);
                        output.accept(BlockRegistration.ARMCHAIR_FLOWER);
                        output.accept(BlockRegistration.ARMCHAIR_STRAWBERRY);
                        output.accept(BlockRegistration.ARMCHAIR_HEART);
                        output.accept(BlockRegistration.ARMCHAIR_WATERMELON);
                        output.accept(BlockRegistration.ARMCHAIR_LEMON);
                        output.accept(BlockRegistration.ARMCHAIR_STARRY);
                        output.accept(BlockRegistration.ARMCHAIR_BLACK_CAT);

                        output.accept(BlockRegistration.MADONNA_OTTOMAN);

                        //TABLES (LIVING ROOM SUB)
                        output.accept(BlockRegistration.ANTIQUE_MINI_TABLE);
                        output.accept(BlockRegistration.PEDESTAL_HK);

                        output.accept(BlockRegistration.PUZZLE_PIECE_TABLE_BLUE);
                        output.accept(BlockRegistration.PUZZLE_PIECE_TABLE_GREEN);
                        output.accept(BlockRegistration.PUZZLE_PIECE_TABLE_RED);
                        output.accept(BlockRegistration.PUZZLE_PIECE_TABLE_YELLOW);
                        output.accept(BlockRegistration.PUZZLE_PIECE_TABLE_PASTEL_BLUE);
                        output.accept(BlockRegistration.PUZZLE_PIECE_TABLE_PASTEL_PINK);
                        output.accept(BlockRegistration.PUZZLE_PIECE_TABLE_PASTEL_PURPLE);
                        output.accept(BlockRegistration.PUZZLE_PIECE_TABLE_PASTEL_YELLOW);

                        //BEDROOM
                        output.accept(BlockRegistration.ROSE_END_TABLE);
                        output.accept(BlockRegistration.ROSE_END_TABLE_BLACK);

                        output.accept(BlockRegistration.ENDTABLE_AMETHYST);
                        output.accept(BlockRegistration.ENDTABLE_BUBBLEGUM);
                        output.accept(BlockRegistration.ENDTABLE_CHARCOAL);
                        output.accept(BlockRegistration.ENDTABLE_MEADOW);
                        output.accept(BlockRegistration.ENDTABLE_PERIWINKLE);
                        output.accept(BlockRegistration.ENDTABLE_SUNSHINE);
                        output.accept(BlockRegistration.ENDTABLE_WOOD);
                        output.accept(BlockRegistration.NIGHTSTAND_GREEN);

                        output.accept(BlockRegistration.ENDTABLE_DECOR);
                        output.accept(BlockRegistration.VIOLET_SCREEN);
                        output.accept(BlockRegistration.SAFE_NOVAKID);

                        //TOYS
                        output.accept(BlockRegistration.RUBIKS_CUBE);
                        output.accept(BlockRegistration.RUBIKS_CUBE_PASTEL);
                        output.accept(BlockRegistration.TEDDY_BEAR);
                        output.accept(BlockRegistration.SAND_SEAL_PLUSH_BLUE);
                        output.accept(BlockRegistration.SAND_SEAL_PLUSH_GREEN);
                        output.accept(BlockRegistration.SAND_SEAL_PLUSH_RED);

                        //STARS?
                        output.accept(BlockRegistration.HEAVENLY_ORNAMENTAL_ARRAY);
                        output.accept(BlockRegistration.STARS_PENDANT);
                        output.accept(BlockRegistration.MOON_PENDANT);
                        output.accept(BlockRegistration.MOON_DECORATION);

                        //GARLANDS
                        output.accept(BlockRegistration.BLACK_CAT_GARLAND);
                        output.accept(BlockRegistration.BLOSSOM_GARLAND);
                        output.accept(BlockRegistration.BUNNY_GARLAND);
                        output.accept(BlockRegistration.POLAROID_A_GARLAND);
                        output.accept(BlockRegistration.POLAROID_B_GARLAND);
                        output.accept(BlockRegistration.SUNFLOWER_GARLAND);
                        output.accept(BlockRegistration.STARRY_GARLAND);

                        //LIBRARY
                        output.accept(BlockRegistration.BAMBOO_BOOKSHELF);
                        output.accept(BlockRegistration.SMALL_BOOKCASE);

                        output.accept(BlockRegistration.ANCIENT_CODEX);
                        output.accept(BlockRegistration.ANTIQUE_BOOK_STAND);

                        output.accept(BlockRegistration.BUNNY_BOOK_ENDS);
                        output.accept(BlockRegistration.ROW_OF_SMALL_BOOKS);
                        output.accept(BlockRegistration.ROW_OF_SMALL_BOOKS_PASTEL);
                        output.accept(BlockRegistration.ROW_OF_SMALL_BOOKS_SHELVED);
                        output.accept(BlockRegistration.ROW_OF_SMALL_BOOKS_PASTEL_SHELVED);
                        output.accept(BlockRegistration.BOOK_OPEN);
                        output.accept(BlockRegistration.STACK_OF_BOOKS);
                        output.accept(BlockRegistration.STACK_OF_BOOKS_TALL);
                        output.accept(BlockRegistration.ANTIQUE_LIBRARY_BOOKS);
                        output.accept(BlockRegistration.RITO_BOOKS);

                        output.accept(BlockRegistration.ANTIQUE_MAP);
                        output.accept(BlockRegistration.NEWSPAPER_PILE_SHORT);
                        output.accept(BlockRegistration.NEWSPAPER_PILE_TALL);

                        //OFFICE
                        output.accept(BlockRegistration.SCATTERED_PAPERS);
                        output.accept(BlockRegistration.PAPER_PILE);

                        output.accept(BlockRegistration.OFFICE_SUPPLIES_A);
                        output.accept(BlockRegistration.OFFICE_SUPPLIES_B);
                        output.accept(BlockRegistration.ENVELOPE_STACK);
                        output.accept(BlockRegistration.YELLOW_NOTEPAD);
                        output.accept(BlockRegistration.SKETCHBOOK_SINGLE);

                        output.accept(BlockRegistration.CARDBOARD_BOX);
                        output.accept(BlockRegistration.FILING_BOX);
                        output.accept(BlockRegistration.BULLETIN_BOARD);
                        output.accept(BlockRegistration.BULLETIN_BOARD_CLUTTERED);
                        output.accept(BlockRegistration.CARD_INDEX);
                        output.accept(BlockRegistration.DESK_GREEN);
                        output.accept(BlockRegistration.DESK_BROWN);
                        output.accept(BlockRegistration.DESK_GREEN_CLUTTERED);
                        output.accept(BlockRegistration.DESK_BROWN_CLUTTERED);
                        output.accept(BlockRegistration.FLOWER_DESK_LAMP);

                        //POLAROIDS
                        output.accept(BlockRegistration.POLAROID_CAMERA);
                        output.accept(BlockRegistration.POLAROIDS_A);
                        output.accept(BlockRegistration.POLAROIDS_B);
                        output.accept(BlockRegistration.POLAROIDS_C);

                        //PAINTING
                        output.accept(BlockRegistration.BOX_OF_PAINTS);
                        output.accept(BlockRegistration.PAINT_WATER_JAR);

                        //SEWING
                        output.accept(BlockRegistration.SEWING_MANNEQUIN);
                        output.accept(BlockRegistration.SEWING_MACHINE_ANTIQUE);
                        output.accept(BlockRegistration.SEWING_TABLE);
                        output.accept(BlockRegistration.SEWING_CLUTTER);
                        output.accept(BlockRegistration.SCISSORS_AND_THREAD);
                        output.accept(BlockRegistration.FABRIC_BOLTS);
                        output.accept(BlockRegistration.THREAD_SPOOL_YELLOW);
                        output.accept(BlockRegistration.THREAD_SPOOL_GREEN);
                        output.accept(BlockRegistration.THREAD_SPOOL_PURPLE);
                        output.accept(BlockRegistration.THREAD_SPOOL_PINK);
                        output.accept(BlockRegistration.BUTTON_STOOL);

                        //POTIONS
                        output.accept(BlockRegistration.CAULDRON_POSTER);
                        output.accept(BlockRegistration.SMALL_CAULDRON);
                        output.accept(BlockRegistration.VIAL_STAND);
                        output.accept(BlockRegistration.POTION_SHELF);
                        output.accept(BlockRegistration.RETRO_CAFE_SHELF);
                        output.accept(BlockRegistration.RETRO_CAFE_SHELF_WINDOW);

                        //KITCHEN
                        output.accept(BlockRegistration.KITCHEN_SET_BROWN_COUNTER);
                        output.accept(BlockRegistration.KITCHEN_SET_BROWN_COUNTER_INNER_CORNER);
                        output.accept(BlockRegistration.KITCHEN_SET_BROWN_COUNTER_OUTER_CORNER_RIGHT);
                        output.accept(BlockRegistration.KITCHEN_SET_BROWN_COUNTER_OUTER_CORNER_LEFT);
                        output.accept(BlockRegistration.KITCHEN_SET_BROWN_COUNTER_SINK);
                        output.accept(BlockRegistration.KITCHEN_SET_BROWN_CABINET);
                        output.accept(BlockRegistration.KITCHEN_SET_BROWN_CABINET_MINI);
                        output.accept(BlockRegistration.KITCHEN_SET_BROWN_CABINET_GLASS);
                        output.accept(BlockRegistration.KITCHEN_SET_BROWN_CABINET_OPEN);
                        output.accept(BlockRegistration.KITCHEN_SET_BROWN_CABINET_INNER_CORNER);
                        output.accept(BlockRegistration.KITCHEN_SET_BROWN_CABINET_OUTER_CORNER);

                        output.accept(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER);
                        output.accept(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_INNER_CORNER);
                        output.accept(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_OUTER_CORNER_RIGHT);
                        output.accept(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_OUTER_CORNER_LEFT);
                        output.accept(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_SINK);
                        output.accept(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET);
                        output.accept(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_MINI);
                        output.accept(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_GLASS);
                        output.accept(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_OPEN);
                        output.accept(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_INNER_CORNER);
                        output.accept(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_OUTER_CORNER);

                        output.accept(BlockRegistration.KITCHEN_SET_PINK_COUNTER);
                        output.accept(BlockRegistration.KITCHEN_SET_PINK_COUNTER_INNER_CORNER);
                        output.accept(BlockRegistration.KITCHEN_SET_PINK_COUNTER_OUTER_CORNER_RIGHT);
                        output.accept(BlockRegistration.KITCHEN_SET_PINK_COUNTER_OUTER_CORNER_LEFT);
                        output.accept(BlockRegistration.KITCHEN_SET_PINK_COUNTER_SINK);
                        output.accept(BlockRegistration.KITCHEN_SET_PINK_CABINET);
                        output.accept(BlockRegistration.KITCHEN_SET_PINK_CABINET_MINI);
                        output.accept(BlockRegistration.KITCHEN_SET_PINK_CABINET_GLASS);
                        output.accept(BlockRegistration.KITCHEN_SET_PINK_CABINET_OPEN);
                        output.accept(BlockRegistration.KITCHEN_SET_PINK_CABINET_INNER_CORNER);
                        output.accept(BlockRegistration.KITCHEN_SET_PINK_CABINET_OUTER_CORNER);

                        output.accept(BlockRegistration.KITCHEN_SET_PURPLE_COUNTER);
                        output.accept(BlockRegistration.KITCHEN_SET_PURPLE_COUNTER_INNER_CORNER);
                        output.accept(BlockRegistration.KITCHEN_SET_PURPLE_COUNTER_OUTER_CORNER_RIGHT);
                        output.accept(BlockRegistration.KITCHEN_SET_PURPLE_COUNTER_OUTER_CORNER_LEFT);
                        output.accept(BlockRegistration.KITCHEN_SET_PURPLE_COUNTER_SINK);
                        output.accept(BlockRegistration.KITCHEN_SET_PURPLE_CABINET);
                        output.accept(BlockRegistration.KITCHEN_SET_PURPLE_CABINET_MINI);
                        output.accept(BlockRegistration.KITCHEN_SET_PURPLE_CABINET_GLASS);
                        output.accept(BlockRegistration.KITCHEN_SET_PURPLE_CABINET_OPEN);
                        output.accept(BlockRegistration.KITCHEN_SET_PURPLE_CABINET_INNER_CORNER);
                        output.accept(BlockRegistration.KITCHEN_SET_PURPLE_CABINET_OUTER_CORNER);

                        output.accept(BlockRegistration.KITCHEN_SET_WHITE_COUNTER);
                        output.accept(BlockRegistration.KITCHEN_SET_WHITE_COUNTER_INNER_CORNER);
                        output.accept(BlockRegistration.KITCHEN_SET_WHITE_COUNTER_OUTER_CORNER_RIGHT);
                        output.accept(BlockRegistration.KITCHEN_SET_WHITE_COUNTER_OUTER_CORNER_LEFT);
                        output.accept(BlockRegistration.KITCHEN_SET_WHITE_COUNTER_SINK);
                        output.accept(BlockRegistration.KITCHEN_SET_WHITE_CABINET);
                        output.accept(BlockRegistration.KITCHEN_SET_WHITE_CABINET_MINI);
                        output.accept(BlockRegistration.KITCHEN_SET_WHITE_CABINET_GLASS);
                        output.accept(BlockRegistration.KITCHEN_SET_WHITE_CABINET_OPEN);
                        output.accept(BlockRegistration.KITCHEN_SET_WHITE_CABINET_INNER_CORNER);
                        output.accept(BlockRegistration.KITCHEN_SET_WHITE_CABINET_OUTER_CORNER);

                        output.accept(BlockRegistration.KITCHEN_SET_YELLOW_COUNTER);
                        output.accept(BlockRegistration.KITCHEN_SET_YELLOW_COUNTER_INNER_CORNER);
                        output.accept(BlockRegistration.KITCHEN_SET_YELLOW_COUNTER_OUTER_CORNER_RIGHT);
                        output.accept(BlockRegistration.KITCHEN_SET_YELLOW_COUNTER_OUTER_CORNER_LEFT);
                        output.accept(BlockRegistration.KITCHEN_SET_YELLOW_COUNTER_SINK);
                        output.accept(BlockRegistration.KITCHEN_SET_YELLOW_CABINET);
                        output.accept(BlockRegistration.KITCHEN_SET_YELLOW_CABINET_MINI);
                        output.accept(BlockRegistration.KITCHEN_SET_YELLOW_CABINET_GLASS);
                        output.accept(BlockRegistration.KITCHEN_SET_YELLOW_CABINET_OPEN);
                        output.accept(BlockRegistration.KITCHEN_SET_YELLOW_CABINET_INNER_CORNER);
                        output.accept(BlockRegistration.KITCHEN_SET_YELLOW_CABINET_OUTER_CORNER);

                        output.accept(BlockRegistration.BLACK_CAT_COUNTER_DRAWERS);
                        output.accept(BlockRegistration.BLACK_CAT_COUNTER_LEFT_DOOR);
                        output.accept(BlockRegistration.BLACK_CAT_COUNTER_RIGHT_DOOR);
                        output.accept(BlockRegistration.BLACK_CAT_SINK);
                        output.accept(BlockRegistration.BLACK_CAT_TABLE);
                        output.accept(BlockRegistration.SWEETHEART_COUNTER_DRAWERS);
                        output.accept(BlockRegistration.SWEETHEART_COUNTER_LEFT_DOOR);
                        output.accept(BlockRegistration.SWEETHEART_COUNTER_RIGHT_DOOR);
                        output.accept(BlockRegistration.SWEETHEART_SINK);
                        output.accept(BlockRegistration.SWEETHEART_TABLE);

                        output.accept(BlockRegistration.TABLE_PLAIN);
                        output.accept(BlockRegistration.TABLE_TABLECLOTH);
                        output.accept(BlockRegistration.CONFECTIONERY_TABLE_BLUE);
                        output.accept(BlockRegistration.CONFECTIONERY_TABLE_PINK);

                        output.accept(BlockRegistration.DORADO_CABINET);
                        output.accept(BlockRegistration.DORADO_CABINET_CLUTTERED);
                        output.accept(BlockRegistration.HAVANA_CABINET);
                        output.accept(BlockRegistration.HAVANA_CABINET_CLUTTERED);
                        output.accept(BlockRegistration.MUREX_CABINET);
                        output.accept(BlockRegistration.MUREX_CABINET_CLUTTERED);
                        output.accept(BlockRegistration.CHINA_CABINET);
                        output.accept(BlockRegistration.GENERAL_STORE_CABINET);


                        output.accept(BlockRegistration.RETRO_FRIDGE_BLACK);
                        output.accept(BlockRegistration.RETRO_FRIDGE_BLUE);
                        output.accept(BlockRegistration.RETRO_FRIDGE_PINK);
                        output.accept(BlockRegistration.RETRO_FRIDGE_PURPLE);
                        output.accept(BlockRegistration.RETRO_FRIDGE_RED);
                        output.accept(BlockRegistration.RETRO_FRIDGE_TURQUOISE);
                        output.accept(BlockRegistration.RETRO_FRIDGE_WHITE);
                        output.accept(BlockRegistration.RETRO_FRIDGE_YELLOW);
                        output.accept(BlockRegistration.RETRO_TOASTER_BLACK);
                        output.accept(BlockRegistration.RETRO_TOASTER_BLUE);
                        output.accept(BlockRegistration.RETRO_TOASTER_PINK);
                        output.accept(BlockRegistration.RETRO_TOASTER_PURPLE);
                        output.accept(BlockRegistration.RETRO_TOASTER_RED);
                        output.accept(BlockRegistration.RETRO_TOASTER_TURQUOISE);
                        output.accept(BlockRegistration.RETRO_TOASTER_WHITE);
                        output.accept(BlockRegistration.RETRO_TOASTER_YELLOW);

                        output.accept(BlockRegistration.TARRY_TOWN_STOVE);
                        output.accept(BlockRegistration.FLOWER_TEA_KETTLE);
                        output.accept(BlockRegistration.COFFEE_GRINDER);
                        output.accept(BlockRegistration.KITCHEN_SCALE);
                        output.accept(BlockRegistration.HANGING_CLOTH);
                        output.accept(BlockRegistration.SWEETHEART_BAKING_SET_BOWL);
                        output.accept(BlockRegistration.SWEETHEART_BAKING_SET_INGREDIENTS);

                        output.accept(BlockRegistration.DRYING_HERBS);
                        output.accept(BlockRegistration.SALT_PEPPER_SHAKERS);
                        output.accept(BlockRegistration.ASSORTED_SPICE_JARS);
                        output.accept(BlockRegistration.JAM_JARS);
                        output.accept(BlockRegistration.ASSORTED_GLASS_JARS);
                        output.accept(BlockRegistration.SMALL_GLASS_JARS);
                        output.accept(BlockRegistration.WINE_BOTTLES);
                        output.accept(BlockRegistration.WINE_BOTTLE_RACK);
                        output.accept(BlockRegistration.SELTZER_CANS);
                        output.accept(BlockRegistration.CAT_MUGS_CLUTTERED);
                        output.accept(BlockRegistration.SLICED_BREAD);
                        output.accept(BlockRegistration.PINEAPPLE);

                        output.accept(BlockRegistration.HEART_CAKE);
                        output.accept(BlockRegistration.BERRY_CAKE);
                        output.accept(BlockRegistration.CHOCOLATE_CROISSANT);
                        output.accept(BlockRegistration.BLUEBERRY_MUFFIN);
                        output.accept(BlockRegistration.CINNAMON_BUN);
                        output.accept(BlockRegistration.CROISSANT);
                        output.accept(BlockRegistration.PANCAKE_STACK);
                        output.accept(BlockRegistration.HAM_SANDWICH);
                        output.accept(BlockRegistration.PASTRY_PLATE);
                        output.accept(BlockRegistration.PASTRY_DISPLAY_CASE);

                        output.accept(BlockRegistration.GUMBALL_MACHINE_RED);
                        output.accept(BlockRegistration.GUMBALL_MACHINE_BLUE);
                        output.accept(BlockRegistration.GUMBALL_MACHINE_PURPLE);

                    })
                    .build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
