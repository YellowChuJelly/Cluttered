package net.redchujelly.cluttered.setup;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.redchujelly.cluttered.Cluttered;

public class CreativeTabRegistration {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Cluttered.MODID);

    //FURNITURE

    public static final RegistryObject<CreativeModeTab> CLUTTERED_TAB = CREATIVE_MODE_TABS.register("cluttered_block_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(BlockRegistration.WILLOW_BOOKSHELF_BLACK_CAT.get()))
                    .title(Component.translatable("creativetab.cluttered_tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ItemRegistration.HAND_DRILL.get());

                        //WILLOW WOODSET
                        output.accept(BlockRegistration.WILLOW_SAPLING.get());
                        output.accept(BlockRegistration.WILLOW_LEAVES.get());
                        output.accept(BlockRegistration.WILLOW_LOG.get());
                        output.accept(BlockRegistration.WILLOW_WOOD.get());
                        output.accept(BlockRegistration.STRIPPED_WILLOW_LOG.get());
                        output.accept(BlockRegistration.STRIPPED_WILLOW_WOOD.get());
                        output.accept(BlockRegistration.WILLOW_PLANKS.get());
                        output.accept(BlockRegistration.WILLOW_STAIRS.get());
                        output.accept(BlockRegistration.WILLOW_SLAB.get());
                        output.accept(BlockRegistration.WILLOW_FENCE.get());
                        output.accept(BlockRegistration.WILLOW_FENCE_GATE.get());
                        output.accept(BlockRegistration.WILLOW_DOOR.get());
                        output.accept(BlockRegistration.WILLOW_LOG_DOOR.get());
                        output.accept(BlockRegistration.WILLOW_GARDEN_DOOR.get());
                        output.accept(BlockRegistration.WILLOW_TRAPDOOR.get());
                        output.accept(BlockRegistration.WILLOW_PRESSURE_PLATE.get());
                        output.accept(BlockRegistration.WILLOW_BUTTON.get());
                        output.accept(BlockRegistration.WILLOW_BOOKSHELF_BLACK_CAT.get());
                        output.accept(BlockRegistration.WILLOW_BOOKSHELF_CALICO_CAT.get());
                        output.accept(BlockRegistration.WILLOW_BOOKSHELF_COBWEB.get());
                        output.accept(BlockRegistration.WILLOW_BOOKSHELF_BOTTLES.get());
                        output.accept(BlockRegistration.WILLOW_BOOKSHELF_VASE.get());
                        output.accept(BlockRegistration.WILLOW_WINDOW.get());
                        output.accept(BlockRegistration.WILLOW_WINDOW_PANE.get());
                        output.accept(BlockRegistration.WILLOW_WAINSCOTING.get());
                        output.accept(BlockRegistration.PURPLE_PLANTER.get());


                        //FLOWERING WILLOW WOODSET
                        output.accept(BlockRegistration.FLOWERING_WILLOW_LOG.get());
                        output.accept(BlockRegistration.FLOWERING_WILLOW_WOOD.get());
                        output.accept(BlockRegistration.STRIPPED_FLOWERING_WILLOW_LOG.get());
                        output.accept(BlockRegistration.STRIPPED_FLOWERING_WILLOW_WOOD.get());
                        output.accept(BlockRegistration.FLOWERING_WILLOW_PLANKS.get());
                        output.accept(BlockRegistration.FLOWERING_WILLOW_STAIRS.get());
                        output.accept(BlockRegistration.FLOWERING_WILLOW_SLAB.get());
                        output.accept(BlockRegistration.FLOWERING_WILLOW_FENCE.get());
                        output.accept(BlockRegistration.FLOWERING_WILLOW_FENCE_GATE.get());
                        output.accept(BlockRegistration.FLOWERING_WILLOW_DOOR.get());
                        output.accept(BlockRegistration.FLOWERING_WILLOW_TRAPDOOR.get());
                        output.accept(BlockRegistration.FLOWERING_WILLOW_PRESSURE_PLATE.get());
                        output.accept(BlockRegistration.FLOWERING_WILLOW_BUTTON.get());
                        output.accept(BlockRegistration.FLOWERING_WILLOW_WINDOW.get());
                        output.accept(BlockRegistration.FLOWERING_WILLOW_WINDOW_PANE.get());
                        output.accept(BlockRegistration.FLOWERING_WILLOW_WAINSCOTING.get());

                        //POPLAR WOODSET
                        output.accept(BlockRegistration.POPLAR_SAPLING.get());
                        output.accept(BlockRegistration.POPLAR_LEAVES.get());
                        output.accept(BlockRegistration.POPLAR_LOG.get());
                        output.accept(BlockRegistration.POPLAR_WOOD.get());
                        output.accept(BlockRegistration.STRIPPED_POPLAR_LOG.get());
                        output.accept(BlockRegistration.STRIPPED_POPLAR_WOOD.get());
                        output.accept(BlockRegistration.POPLAR_PLANKS.get());
                        output.accept(BlockRegistration.POPLAR_STAIRS.get());
                        output.accept(BlockRegistration.POPLAR_SLAB.get());
                        output.accept(BlockRegistration.POPLAR_FENCE.get());
                        output.accept(BlockRegistration.POPLAR_FENCE_GATE.get());
                        output.accept(BlockRegistration.POPLAR_DOOR.get());
                        output.accept(BlockRegistration.POPLAR_TRAPDOOR.get());
                        output.accept(BlockRegistration.POPLAR_PRESSURE_PLATE.get());
                        output.accept(BlockRegistration.POPLAR_BUTTON.get());
                        output.accept(BlockRegistration.POPLAR_BOOKSHELF.get());
                        output.accept(BlockRegistration.POPLAR_WINDOW.get());
                        output.accept(BlockRegistration.POPLAR_WINDOW_PANE.get());
                        output.accept(BlockRegistration.POPLAR_WAINSCOTING.get());
                        output.accept(BlockRegistration.YELLOW_PLANTER.get());

                        //FLOWERING POPLAR WOODSET
                        output.accept(BlockRegistration.FLOWERING_POPLAR_LOG.get());
                        output.accept(BlockRegistration.FLOWERING_POPLAR_WOOD.get());
                        output.accept(BlockRegistration.STRIPPED_FLOWERING_POPLAR_LOG.get());
                        output.accept(BlockRegistration.STRIPPED_FLOWERING_POPLAR_WOOD.get());
                        output.accept(BlockRegistration.FLOWERING_POPLAR_PLANKS.get());
                        output.accept(BlockRegistration.FLOWERING_POPLAR_STAIRS.get());
                        output.accept(BlockRegistration.FLOWERING_POPLAR_SLAB.get());
                        output.accept(BlockRegistration.FLOWERING_POPLAR_FENCE.get());
                        output.accept(BlockRegistration.FLOWERING_POPLAR_FENCE_GATE.get());
                        output.accept(BlockRegistration.FLOWERING_POPLAR_DOOR.get());
                        output.accept(BlockRegistration.FLOWERING_POPLAR_TRAPDOOR.get());
                        output.accept(BlockRegistration.FLOWERING_POPLAR_PRESSURE_PLATE.get());
                        output.accept(BlockRegistration.FLOWERING_POPLAR_BUTTON.get());
                        output.accept(BlockRegistration.FLOWERING_POPLAR_BOOKSHELF.get());
                        output.accept(BlockRegistration.FLOWERING_POPLAR_WINDOW.get());
                        output.accept(BlockRegistration.FLOWERING_POPLAR_WINDOW_PANE.get());
                        output.accept(BlockRegistration.FLOWERING_POPLAR_WAINSCOTING.get());

                        //CRABAPPLE WOODSET
                        output.accept(BlockRegistration.CRABAPPLE_LOG.get());
                        output.accept(BlockRegistration.CRABAPPLE_WOOD.get());
                        output.accept(BlockRegistration.STRIPPED_CRABAPPLE_LOG.get());
                        output.accept(BlockRegistration.STRIPPED_CRABAPPLE_WOOD.get());
                        output.accept(BlockRegistration.CRABAPPLE_PLANKS.get());
                        output.accept(BlockRegistration.CRABAPPLE_STAIRS.get());
                        output.accept(BlockRegistration.CRABAPPLE_SLAB.get());
                        output.accept(BlockRegistration.CRABAPPLE_FENCE.get());
                        output.accept(BlockRegistration.CRABAPPLE_FENCE_GATE.get());
                        output.accept(BlockRegistration.CRABAPPLE_DOOR.get());
                        output.accept(BlockRegistration.CRABAPPLE_TRAPDOOR.get());
                        output.accept(BlockRegistration.CRABAPPLE_PRESSURE_PLATE.get());
                        output.accept(BlockRegistration.CRABAPPLE_BUTTON.get());
                        output.accept(BlockRegistration.CRABAPPLE_BOOKSHELF.get());
                        output.accept(BlockRegistration.CRABAPPLE_WINDOW.get());
                        output.accept(BlockRegistration.CRABAPPLE_WINDOW_PANE.get());
                        output.accept(BlockRegistration.CRABAPPLE_WAINSCOTING.get());
                        output.accept(BlockRegistration.PINK_PLANTER.get());

                        //FLOWERING CRABAPPLE WOODSET
                        output.accept(BlockRegistration.FLOWERING_CRABAPPLE_LOG.get());
                        output.accept(BlockRegistration.FLOWERING_CRABAPPLE_WOOD.get());
                        output.accept(BlockRegistration.STRIPPED_FLOWERING_CRABAPPLE_LOG.get());
                        output.accept(BlockRegistration.STRIPPED_FLOWERING_CRABAPPLE_WOOD.get());
                        output.accept(BlockRegistration.FLOWERING_CRABAPPLE_PLANKS.get());
                        output.accept(BlockRegistration.FLOWERING_CRABAPPLE_STAIRS.get());
                        output.accept(BlockRegistration.FLOWERING_CRABAPPLE_SLAB.get());
                        output.accept(BlockRegistration.FLOWERING_CRABAPPLE_FENCE.get());
                        output.accept(BlockRegistration.FLOWERING_CRABAPPLE_FENCE_GATE.get());
                        output.accept(BlockRegistration.FLOWERING_CRABAPPLE_DOOR.get());
                        output.accept(BlockRegistration.FLOWERING_CRABAPPLE_TRAPDOOR.get());
                        output.accept(BlockRegistration.FLOWERING_CRABAPPLE_PRESSURE_PLATE.get());
                        output.accept(BlockRegistration.FLOWERING_CRABAPPLE_BUTTON.get());
                        output.accept(BlockRegistration.FLOWERING_CRABAPPLE_BOOKSHELF.get());
                        output.accept(BlockRegistration.FLOWERING_CRABAPPLE_WINDOW.get());
                        output.accept(BlockRegistration.FLOWERING_CRABAPPLE_WINDOW_PANE.get());
                        output.accept(BlockRegistration.FLOWERING_CRABAPPLE_WAINSCOTING.get());

                        //SYCAMORE WOODSET
                        output.accept(BlockRegistration.SYCAMORE_LOG.get());
                        output.accept(BlockRegistration.SYCAMORE_WOOD.get());
                        output.accept(BlockRegistration.STRIPPED_SYCAMORE_LOG.get());
                        output.accept(BlockRegistration.STRIPPED_SYCAMORE_WOOD.get());
                        output.accept(BlockRegistration.SYCAMORE_PLANKS.get());
                        output.accept(BlockRegistration.SYCAMORE_STAIRS.get());
                        output.accept(BlockRegistration.SYCAMORE_SLAB.get());
                        output.accept(BlockRegistration.SYCAMORE_FENCE.get());
                        output.accept(BlockRegistration.SYCAMORE_FENCE_GATE.get());
                        output.accept(BlockRegistration.SYCAMORE_DOOR.get());
                        output.accept(BlockRegistration.SYCAMORE_TRAPDOOR.get());
                        output.accept(BlockRegistration.SYCAMORE_PRESSURE_PLATE.get());
                        output.accept(BlockRegistration.SYCAMORE_BUTTON.get());
                        output.accept(BlockRegistration.SYCAMORE_BOOKSHELF.get());
                        output.accept(BlockRegistration.SYCAMORE_WINDOW.get());
                        output.accept(BlockRegistration.SYCAMORE_WINDOW_PANE.get());
                        output.accept(BlockRegistration.SYCAMORE_WAINSCOTING.get());
                        output.accept(BlockRegistration.GREEN_PLANTER.get());

                        //FLUORESCENT MAPLE WOODSET
                        output.accept(BlockRegistration.MAPLE_LOG.get());
                        output.accept(BlockRegistration.MAPLE_WOOD.get());
                        output.accept(BlockRegistration.STRIPPED_MAPLE_LOG.get());
                        output.accept(BlockRegistration.STRIPPED_MAPLE_WOOD.get());
                        output.accept(BlockRegistration.MAPLE_PLANKS.get());
                        output.accept(BlockRegistration.MAPLE_STAIRS.get());
                        output.accept(BlockRegistration.MAPLE_SLAB.get());
                        output.accept(BlockRegistration.MAPLE_FENCE.get());
                        output.accept(BlockRegistration.MAPLE_FENCE_GATE.get());
                        output.accept(BlockRegistration.MAPLE_DOOR.get());
                        output.accept(BlockRegistration.MAPLE_TRAPDOOR.get());
                        output.accept(BlockRegistration.MAPLE_PRESSURE_PLATE.get());
                        output.accept(BlockRegistration.MAPLE_BUTTON.get());
                        output.accept(BlockRegistration.MAPLE_BOOKSHELF.get());
                        output.accept(BlockRegistration.MAPLE_WINDOW.get());
                        output.accept(BlockRegistration.MAPLE_WINDOW_PANE.get());
                        output.accept(BlockRegistration.MAPLE_WAINSCOTING.get());
                        output.accept(BlockRegistration.FLUORESCENT_PLANTER.get());

                        //BLUE MUSHROOM WOODSET
                        output.accept(BlockRegistration.BLUE_MUSHROOM_SAPLING.get());
                        output.accept(BlockRegistration.BLUE_MUSHROOM_CAP.get());
                        output.accept(BlockRegistration.BLUE_MUSHROOM_LOG.get());
                        output.accept(BlockRegistration.BLUE_MUSHROOM_WOOD.get());
                        output.accept(BlockRegistration.BLUE_MUSHROOM_PLANKS.get());
                        output.accept(BlockRegistration.BLUE_MUSHROOM_STAIRS.get());
                        output.accept(BlockRegistration.BLUE_MUSHROOM_SLAB.get());
                        output.accept(BlockRegistration.BLUE_MUSHROOM_FENCE.get());
                        output.accept(BlockRegistration.BLUE_MUSHROOM_FENCE_GATE.get());
                        output.accept(BlockRegistration.BLUE_MUSHROOM_DOOR.get());
                        output.accept(BlockRegistration.BLUE_MUSHROOM_TRAPDOOR.get());
                        output.accept(BlockRegistration.BLUE_MUSHROOM_PRESSURE_PLATE.get());
                        output.accept(BlockRegistration.BLUE_MUSHROOM_BUTTON.get());
                        output.accept(BlockRegistration.BLUE_MUSHROOM_BOOKSHELF.get());
                        output.accept(BlockRegistration.BLUE_MUSHROOM_WINDOW.get());
                        output.accept(BlockRegistration.BLUE_MUSHROOM_WINDOW_PANE.get());
                        output.accept(BlockRegistration.BLUE_MUSHROOM_WAINSCOTING.get());
                        output.accept(BlockRegistration.BLUE_PLANTER.get());

                        //RED MUSHROOM WOODSET
                        output.accept(BlockRegistration.RED_MUSHROOM_CAP.get());
                        output.accept(BlockRegistration.RED_MUSHROOM_LOG.get());
                        output.accept(BlockRegistration.RED_MUSHROOM_WOOD.get());
                        output.accept(BlockRegistration.RED_MUSHROOM_PLANKS.get());
                        output.accept(BlockRegistration.RED_MUSHROOM_STAIRS.get());
                        output.accept(BlockRegistration.RED_MUSHROOM_SLAB.get());
                        output.accept(BlockRegistration.RED_MUSHROOM_FENCE.get());
                        output.accept(BlockRegistration.RED_MUSHROOM_FENCE_GATE.get());
                        output.accept(BlockRegistration.RED_MUSHROOM_DOOR.get());
                        output.accept(BlockRegistration.RED_MUSHROOM_TRAPDOOR.get());
                        output.accept(BlockRegistration.RED_MUSHROOM_PRESSURE_PLATE.get());
                        output.accept(BlockRegistration.RED_MUSHROOM_BUTTON.get());
                        output.accept(BlockRegistration.RED_MUSHROOM_BOOKSHELF.get());
                        output.accept(BlockRegistration.RED_MUSHROOM_WINDOW.get());
                        output.accept(BlockRegistration.RED_MUSHROOM_WINDOW_PANE.get());
                        output.accept(BlockRegistration.RED_MUSHROOM_WAINSCOTING.get());
                        output.accept(BlockRegistration.RED_PLANTER.get());

                        //CHALCEDONY SET
                        output.accept(BlockRegistration.CHALCEDONY.get());
                        output.accept(BlockRegistration.CHALCEDONY_STAIRS.get());
                        output.accept(BlockRegistration.CHALCEDONY_SLAB.get());
                        output.accept(BlockRegistration.POLISHED_CHALCEDONY.get());
                        output.accept(BlockRegistration.CHALCEDONY_BRICKS.get());
                        output.accept(BlockRegistration.CHALCEDONY_BRICK_STAIRS.get());
                        output.accept(BlockRegistration.CHALCEDONY_BRICK_SLAB.get());
                        output.accept(BlockRegistration.CHISELED_CHALCEDONY.get());
                        output.accept(BlockRegistration.CHALCEDONY_BORDER.get());
                        output.accept(BlockRegistration.CHALCEDONY_ACANTHUS.get());
                        output.accept(BlockRegistration.CHALCEDONY_HELIX.get());
                        output.accept(BlockRegistration.CHALCEDONY_PILLAR_BASE.get());
                        output.accept(BlockRegistration.CHALCEDONY_PILLAR.get());
                        output.accept(BlockRegistration.CHALCEDONY_PILLAR_DORIC.get());
                        output.accept(BlockRegistration.CHALCEDONY_PILLAR_IONIC.get());
                        output.accept(BlockRegistration.CHALCEDONY_TILES.get());
                        output.accept(BlockRegistration.CHALCEDONY_SMALL_TILES.get());
                        output.accept(BlockRegistration.STARRY_CHISELED_CHALCEDONY.get());
                        output.accept(BlockRegistration.STARRY_CHALCEDONY_PILLAR_BASE.get());
                        output.accept(BlockRegistration.STARRY_CHALCEDONY_PILLAR.get());
                        output.accept(BlockRegistration.STARRY_CHALCEDONY_PILLAR_DORIC.get());
                        output.accept(BlockRegistration.STARRY_CHALCEDONY_PILLAR_IONIC.get());
                        output.accept(BlockRegistration.CHALCEDONY_WINDOW.get());
                        output.accept(BlockRegistration.CHALCEDONY_WINDOW_PANE.get());
                        //DEEP CHALCEDONY SET
                        output.accept(BlockRegistration.DEEP_CHALCEDONY.get());
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_STAIRS.get());
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_SLAB.get());
                        output.accept(BlockRegistration.DEEP_POLISHED_CHALCEDONY.get());
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_BRICKS.get());
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_BRICK_STAIRS.get());
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_BRICK_SLAB.get());
                        output.accept(BlockRegistration.DEEP_CHISELED_CHALCEDONY.get());
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_BORDER.get());
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_ACANTHUS.get());
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_HELIX.get());
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_PILLAR_BASE.get());
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_PILLAR.get());
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_PILLAR_DORIC.get());
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_PILLAR_IONIC.get());
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_TILES.get());
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_SMALL_TILES.get());
                        output.accept(BlockRegistration.DEEP_STARRY_CHISELED_CHALCEDONY.get());
                        output.accept(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_BASE.get());
                        output.accept(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR.get());
                        output.accept(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_DORIC.get());
                        output.accept(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_IONIC.get());
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_WINDOW.get());
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_WINDOW_PANE.get());
                        //MARBLE SET
                        output.accept(BlockRegistration.MARBLE.get());
                        output.accept(BlockRegistration.MARBLE_STAIRS.get());
                        output.accept(BlockRegistration.MARBLE_SLAB.get());
                        output.accept(BlockRegistration.POLISHED_MARBLE.get());
                        output.accept(BlockRegistration.MARBLE_BRICKS.get());
                        output.accept(BlockRegistration.MARBLE_BRICK_STAIRS.get());
                        output.accept(BlockRegistration.MARBLE_BRICK_SLAB.get());
                        output.accept(BlockRegistration.CHISELED_MARBLE.get());
                        output.accept(BlockRegistration.MARBLE_BORDER.get());
                        output.accept(BlockRegistration.MARBLE_ACANTHUS.get());
                        output.accept(BlockRegistration.MARBLE_HELIX.get());
                        output.accept(BlockRegistration.MARBLE_PILLAR_BASE.get());
                        output.accept(BlockRegistration.MARBLE_PILLAR.get());
                        output.accept(BlockRegistration.MARBLE_PILLAR_DORIC.get());
                        output.accept(BlockRegistration.MARBLE_PILLAR_IONIC.get());
                        output.accept(BlockRegistration.MARBLE_TILES.get());
                        output.accept(BlockRegistration.MARBLE_SMALL_TILES.get());
                        output.accept(BlockRegistration.STARRY_CHISELED_MARBLE.get());
                        output.accept(BlockRegistration.MARBLE_TILE.get());
                        output.accept(BlockRegistration.MARBLE_TILE_CHISELED.get());
                        output.accept(BlockRegistration.MARBLE_TILE_BORDER.get());
                        output.accept(BlockRegistration.MARBLE_TILE_BORDER_CIRCLE.get());
                        output.accept(BlockRegistration.MARBLE_TILE_BORDER_DETAIL.get());
                        output.accept(BlockRegistration.MARBLE_TILE_CORNER.get());
                        output.accept(BlockRegistration.MARBLE_TILE_CORNER_CIRCLE.get());

                        //MISC SECTION
                        output.accept(BlockRegistration.COLOSSEO_PILLAR_BASE.get());
                        output.accept(BlockRegistration.COLOSSEO_PILLAR.get());
                        output.accept(BlockRegistration.COLOSSEO_PILLAR_TOP.get());

                        //WALLPAPERS
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_APPLE.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BONES.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_LEMON.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_ORANGE.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PEAR.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PLUM.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR.get());

                        output.accept(BlockRegistration.STARRY_WALLPAPER_BOTTOM.get());
                        output.accept(BlockRegistration.STARRY_WALLPAPER.get());
                        output.accept(BlockRegistration.STARRY_WALLPAPER_TOP.get());

                        output.accept(BlockRegistration.DARK_STARRY_WALLPAPER_BOTTOM.get());
                        output.accept(BlockRegistration.DARK_STARRY_WALLPAPER.get());
                        output.accept(BlockRegistration.DARK_STARRY_WALLPAPER_TOP.get());

                        output.accept(BlockRegistration.CHIC_WALLPAPER_LOWER_TRIM.get());
                        output.accept(BlockRegistration.CHIC_WALLPAPER.get());
                        output.accept(BlockRegistration.CHIC_WALLPAPER_UPPER_TRIM.get());

                        output.accept(BlockRegistration.PINK_STRIPE_WALLPAPER_LOWER_TRIM.get());
                        output.accept(BlockRegistration.PINK_STRIPE_WALLPAPER.get());
                        output.accept(BlockRegistration.PINK_STRIPE_WALLPAPER_UPPER_TRIM.get());

                        output.accept(BlockRegistration.RIALTO_GOLD_WALLPAPER_BOTTOM.get());
                        output.accept(BlockRegistration.RIALTO_GOLD_WALLPAPER.get());
                        output.accept(BlockRegistration.RIALTO_GOLD_WALLPAPER_TOP.get());

                        output.accept(BlockRegistration.GHOST_WALLPAPER_WAINSCOTING.get());
                        output.accept(BlockRegistration.GHOST_WALLPAPER.get());
                        output.accept(BlockRegistration.GHOST_WALLPAPER_TRIM.get());

                        output.accept(BlockRegistration.HALLOWEEN_WAINSCOTING.get());
                        output.accept(BlockRegistration.HALLOWEEN_WALLPAPER.get());

                        output.accept(BlockRegistration.MINT_WALLPAPER.get());
                        output.accept(BlockRegistration.BROWN_WAINSCOTING.get());

                        output.accept(BlockRegistration.CONFECTIONARY_WALLPAPER.get());
                        output.accept(BlockRegistration.BLUE_WAINSCOTING.get());

                        output.accept(BlockRegistration.CHECKERED_PINK_WALLPAPER.get());
                        output.accept(BlockRegistration.CHECKERED_PINK_STRAWBERRY_WALLPAPER.get());
                        output.accept(BlockRegistration.CHECKERED_GREEN_WALLPAPER.get());
                        output.accept(BlockRegistration.CHECKERED_GREEN_STRAWBERRY_WALLPAPER.get());

                        output.accept(BlockRegistration.RETRO_RAINBOW_WALLPAPER.get());
                        output.accept(BlockRegistration.BLUE_ROSE_STRIPED_WALLPAPER.get());
                        output.accept(BlockRegistration.FLORAL_BERRY_WALLPAPER.get());
                        output.accept(BlockRegistration.STRIPED_FLORAL_WALLPAPER.get());
                        output.accept(BlockRegistration.FLORAL_BORDER_WALLPAPER.get());
                        output.accept(BlockRegistration.MARIGOLD_WALLPAPER.get());
                        output.accept(BlockRegistration.CHECKERED_FRUIT_WALLPAPER.get());
                        output.accept(BlockRegistration.APPLE_WALLPAPER.get());
                        output.accept(BlockRegistration.FISH_WALLPAPER.get());

                        output.accept(BlockRegistration.GINGERBREAD_BRICKS.get());
                        output.accept(BlockRegistration.GINGERBREAD_BRICK_STAIRS.get());
                        output.accept(BlockRegistration.GINGERBREAD_BRICK_SLAB.get());
                        output.accept(BlockRegistration.GINGERBREAD_BRICKS_TOP.get());
                        output.accept(BlockRegistration.GINGERBREAD_BRICKS_SIDE.get());
                        output.accept(BlockRegistration.GINGERBREAD_BRICKS_TOP_CORNER.get());

                        output.accept(BlockRegistration.VERDANT_TILE.get());
                        output.accept(BlockRegistration.VERDANT_TILE_EDGE.get());
                        output.accept(BlockRegistration.VERDANT_TILE_CORNER.get());

                        output.accept(BlockRegistration.ESPERANCA_TILE.get());
                        output.accept(BlockRegistration.LILIY_HILLS_TILE.get());
                        output.accept(BlockRegistration.HANNISH_TILE.get());
                        output.accept(BlockRegistration.AURA_TILES.get());
                        output.accept(BlockRegistration.BIFURCATING_TILES.get());
                        output.accept(BlockRegistration.BLACK_AMARYLLIS_TILES.get());
                        output.accept(BlockRegistration.ROSETTE_TILES.get());
                        output.accept(BlockRegistration.SEISMIC_TILES.get());

                        output.accept(BlockRegistration.PURPLE_TILES.get());
                        output.accept(BlockRegistration.SMALL_PURPLE_TILES.get());
                        output.accept(BlockRegistration.YELLOW_TILES.get());
                        output.accept(BlockRegistration.SMALL_YELLOW_TILES.get());
                        output.accept(BlockRegistration.PINK_TILES.get());
                        output.accept(BlockRegistration.SMALL_PINK_TILES.get());
                        output.accept(BlockRegistration.GREEN_TILES.get());
                        output.accept(BlockRegistration.SMALL_GREEN_TILES.get());
                        output.accept(BlockRegistration.IRIDESCENT_TILES.get());
                        output.accept(BlockRegistration.SMALL_IRIDESCENT_TILES.get());
                        output.accept(BlockRegistration.KITCHEN_TILES.get());
                        
                        output.accept(BlockRegistration.ALABASTER_WINDOW_DIVIDED.get());
                        output.accept(BlockRegistration.ALABASTER_WINDOW_PANE.get());
                        output.accept(BlockRegistration.ALABASTER_PANEL_ATLANTIC.get());
                        output.accept(BlockRegistration.ALABASTER_PANEL_AUGUSTINE.get());
                        output.accept(BlockRegistration.ALABASTER_PANEL_ALEXANDRIA.get());
                        output.accept(BlockRegistration.ALABASTER_PANEL_CANTERBURY.get());
                        output.accept(BlockRegistration.ALABASTER_SCREEN_DOOR.get());
                        output.accept(BlockRegistration.ALABASTER_FRENCH_DOOR.get());
                        output.accept(BlockRegistration.ALABASTER_WAINSCOTING.get());
                        
                        output.accept(BlockRegistration.WOOD_WINDOW_DIVIDED.get());
                        output.accept(BlockRegistration.WOOD_WINDOW_PANE.get());
                        output.accept(BlockRegistration.WOOD_PANEL_ATLANTIC.get());
                        output.accept(BlockRegistration.WOOD_PANEL_AUGUSTINE.get());
                        output.accept(BlockRegistration.WOOD_PANEL_ALEXANDRIA.get());
                        output.accept(BlockRegistration.WOOD_PANEL_CANTERBURY.get());
                        output.accept(BlockRegistration.WOOD_SCREEN_DOOR.get());
                        output.accept(BlockRegistration.WOOD_FRENCH_DOOR.get());

                        output.accept(BlockRegistration.STRAWBERRY_JAR_BLOCK .get());
                        output.accept(BlockRegistration.CHERRY_JAR_BLOCK.get());
                        output.accept(BlockRegistration.APRICOT_JAR_BLOCK .get());
                        output.accept(BlockRegistration.ORANGE_JAR_BLOCK.get());
                        output.accept(BlockRegistration.HONEY_JAR_BLOCK.get());
                        output.accept(BlockRegistration.BLUEBERRY_JAR_BLOCK .get());


                        output.accept(BlockRegistration.BLACK_CAT_WINDOW.get());
                        output.accept(BlockRegistration.BLACK_CAT_WINDOW_PANE.get());
                        output.accept(BlockRegistration.BEIGE_PLANTER.get());
                        output.accept(BlockRegistration.WICKER_BLOCK.get());
                        output.accept(BlockRegistration.CHISELED_GOLD_BLOCK.get());
                        output.accept(BlockRegistration.EYE_BLOCK.get());
                        output.accept(BlockRegistration.DYNASTY_DOOR.get());
                        output.accept(BlockRegistration.ART_NOUVEAU_DOOR.get());
                        output.accept(BlockRegistration.ART_NOUVEAU_DOOR_DARK.get());

                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> CLUTTERED_FURNITURE_TAB = CREATIVE_MODE_TABS.register("cluttered_furniture_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(BlockRegistration.RECORD_PLAYER_YELLOW.get()))
                    .title(Component.translatable("creativetab.cluttered_furniture_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(BlockRegistration.APPLE_CHAIR.get());

                        output.accept(BlockRegistration.BIRDHOUSE_RED.get());
                        output.accept(BlockRegistration.BIRDHOUSE_BLUE.get());
                        output.accept(BlockRegistration.BIRDHOUSE_UNPAINTED.get());

                        output.accept(BlockRegistration.BRIEFCASE_BLANK.get());
                        output.accept(BlockRegistration.BRIEFCASE_ROVER.get());
                        output.accept(BlockRegistration.BUNNY_BOOK_ENDS.get());
                        output.accept(BlockRegistration.BOX_OF_PAINTS.get());
                        output.accept(BlockRegistration.BUTTON_STOOL.get());

                        output.accept(BlockRegistration.CARDBOARD_BOX_OPEN.get());
                        output.accept(BlockRegistration.CARDBOARD_BOX_CLOSED.get());
                        output.accept(BlockRegistration.CARDBOARD_BOX_CLUTTERED.get());

                        output.accept(BlockRegistration.CAT_MUGS_CLUTTERED.get());
                        output.accept(BlockRegistration.CAT_PLANT_POT_BLACK.get());
                        output.accept(BlockRegistration.CAT_PLANT_POT_ORANGE.get());
                        output.accept(BlockRegistration.COFFEE_GRINDER.get());
                        output.accept(BlockRegistration.CAULDRON_POSTER.get());

                        output.accept(BlockRegistration.THREAD_SPOOL_YELLOW.get());
                        output.accept(BlockRegistration.THREAD_SPOOL_GREEN.get());
                        output.accept(BlockRegistration.THREAD_SPOOL_PURPLE.get());
                        output.accept(BlockRegistration.THREAD_SPOOL_PINK.get());

                        output.accept(BlockRegistration.KITCHEN_SCALE.get());
                        output.accept(BlockRegistration.ANTIQUE_MAP.get());
                        output.accept(BlockRegistration.ANTIQUE_MINI_TABLE.get());
                        output.accept(BlockRegistration.ANCIENT_CODEX.get());

                        output.accept(BlockRegistration.ANTIQUE_BOOK_STAND.get());
                        output.accept(BlockRegistration.ANTIQUE_LIBRARY_BOOKS.get());

                        output.accept(BlockRegistration.BEE_LAMP.get());
                        output.accept(BlockRegistration.BEE_LAMP_ANGRY.get());

                        output.accept(BlockRegistration.RECORD_PLAYER_RED.get());
                        output.accept(BlockRegistration.RECORD_PLAYER_YELLOW.get());
                        output.accept(BlockRegistration.RECORD_PLAYER_BLUE.get());
                        output.accept(BlockRegistration.RECORD_PLAYER_PURPLE.get());
                        output.accept(BlockRegistration.RECORD_PLAYER_PINK.get());
                        output.accept(BlockRegistration.RECORD_PLAYER_BROWN.get());
                        output.accept(BlockRegistration.RECORD_PLAYER_WHITE.get());

                        output.accept(BlockRegistration.BIKE_YELLOW.get());
                        output.accept(BlockRegistration.BIKE_YELLOW_FLOWERS.get());
                        output.accept(BlockRegistration.BIKE_BLUE.get());
                        output.accept(BlockRegistration.BIKE_BLUE_FLOWERS.get());
                        output.accept(BlockRegistration.BIKE_PURPLE.get());
                        output.accept(BlockRegistration.BIKE_PURPLE_FLOWERS.get());
                        output.accept(BlockRegistration.BIKE_PINK.get());
                        output.accept(BlockRegistration.BIKE_PINK_FLOWERS.get());

                        output.accept(BlockRegistration.COTTAGE_SIDE_TABLE.get());
                        output.accept(BlockRegistration.COTTAGE_CHAIR.get());
                        output.accept(BlockRegistration.COTTAGE_CHAIR_CUSHIONED.get());
                        output.accept(BlockRegistration.COTTAGE_OTTOMAN.get());

                        output.accept(BlockRegistration.GUMBALL_MACHINE_RED.get());
                        output.accept(BlockRegistration.GUMBALL_MACHINE_BLUE.get());
                        output.accept(BlockRegistration.GUMBALL_MACHINE_PURPLE.get());

                        output.accept(BlockRegistration.MINI_CACTUS_SET.get());
                        output.accept(BlockRegistration.MUSHROOM_JARS.get());
                        output.accept(BlockRegistration.NEWSPAPER_PILE_SHORT.get());
                        output.accept(BlockRegistration.NEWSPAPER_PILE_TALL.get());
                        output.accept(BlockRegistration.PAPER_PILE.get());

                        output.accept(BlockRegistration.MUSHROOM_TERRARIUM_RED.get());
                        output.accept(BlockRegistration.MUSHROOM_TERRARIUM_BROWN.get());
                        output.accept(BlockRegistration.GLOWSHROOM_TERRARIUM_YELLOW.get());
                        output.accept(BlockRegistration.GLOWSHROOM_TERRARIUM_GREEN.get());
                        output.accept(BlockRegistration.GLOWSHROOM_TERRARIUM_BLUE.get());
                        output.accept(BlockRegistration.GLOWSHROOM_TERRARIUM_PURPLE.get());
                        output.accept(BlockRegistration.GLOWSHROOM_TERRARIUM_PINK.get());

                        output.accept(BlockRegistration.FENCE_SHELF.get());
                        output.accept(BlockRegistration.HANGING_PLANT_POT_FLOWERS.get());
                        output.accept(BlockRegistration.HANGING_PLANT_POT_GRASS.get());
                        output.accept(BlockRegistration.PEDESTAL_HK.get());
                        output.accept(BlockRegistration.PICNIC_BASKET.get());
                        output.accept(BlockRegistration.PICNIC_BASKET_PREPARED.get());
                        output.accept(BlockRegistration.BASKET_OF_PRODUCE.get());
                        output.accept(BlockRegistration.BASKET_OF_FLOWERS.get());
                        output.accept(BlockRegistration.POLAROIDS_A.get());
                        output.accept(BlockRegistration.OSSON_PENDANT_BLACK.get());
                        output.accept(BlockRegistration.OSSON_PENDANT_BROWN.get());
                        output.accept(BlockRegistration.OSSON_PENDANT_ORANGE.get());
                        output.accept(BlockRegistration.OSSON_PENDANT_RACING_GREEN.get());
                        output.accept(BlockRegistration.OSSON_PENDANT_SAGE_GREEN.get());
                        output.accept(BlockRegistration.OSSON_PENDANT_RED.get());
                        output.accept(BlockRegistration.OSSON_PENDANT_YELLOW.get());
                        output.accept(BlockRegistration.OSSON_PENDANT_WHITE.get());

                        output.accept(BlockRegistration.COTTAGE_BOOKCASE.get());
                        output.accept(BlockRegistration.COTTAGE_STANDING_LAMP.get());
                        output.accept(BlockRegistration.DRYING_HERBS.get());
                        output.accept(BlockRegistration.HANGING_CLOTH.get());

                        output.accept(BlockRegistration.HEART_CAKE.get());
                        output.accept(BlockRegistration.BERRY_CAKE.get());

                        output.accept(BlockRegistration.MINI_FLAG_BI.get());
                        output.accept(BlockRegistration.MINI_FLAG_LESBIAN.get());
                        output.accept(BlockRegistration.MINI_FLAG_TRANS.get());
                        output.accept(BlockRegistration.MINI_FLAG_NONBINARY.get());
                        output.accept(BlockRegistration.MINI_FLAG_PAN.get());
                        output.accept(BlockRegistration.MINI_FLAG_RAINBOW.get());
                        output.accept(BlockRegistration.BAMBOO_BOOKSHELF.get());
                        output.accept(BlockRegistration.FWISH_BOOKCASE.get());

                        output.accept(BlockRegistration.ENDTABLE_AMETHYST.get());
                        output.accept(BlockRegistration.ENDTABLE_BUBBLEGUM.get());
                        output.accept(BlockRegistration.ENDTABLE_CHARCOAL.get());
                        output.accept(BlockRegistration.ENDTABLE_MEADOW.get());
                        output.accept(BlockRegistration.ENDTABLE_PERIWINKLE.get());
                        output.accept(BlockRegistration.ENDTABLE_SUNSHINE.get());
                        output.accept(BlockRegistration.ENDTABLE_WOOD.get());
                        output.accept(BlockRegistration.ENDTABLE_DECOR.get());

                        output.accept(BlockRegistration.NIGHTSTAND_GREEN.get());
                        output.accept(BlockRegistration.DESK_GREEN.get());
                        output.accept(BlockRegistration.DESK_BROWN.get());
                        output.accept(BlockRegistration.DESK_GREEN_CLUTTERED.get());
                        output.accept(BlockRegistration.DESK_BROWN_CLUTTERED.get());

                        output.accept(BlockRegistration.ROVER_STOOL.get());
                        output.accept(BlockRegistration.MADONNA_OTTOMAN.get());
                        output.accept(BlockRegistration.RUBIKS_CUBE.get());
                        output.accept(BlockRegistration.RUBIKS_CUBE_PASTEL.get());
                        output.accept(BlockRegistration.ROW_OF_SMALL_BOOKS.get());
                        output.accept(BlockRegistration.ROW_OF_SMALL_BOOKS_PASTEL.get());
                        output.accept(BlockRegistration.SCATTERED_PAPERS.get());
                        output.accept(BlockRegistration.ROW_OF_SMALL_BOOKS_SHELVED.get());
                        output.accept(BlockRegistration.ROW_OF_SMALL_BOOKS_PASTEL_SHELVED.get());
                        output.accept(BlockRegistration.STAINED_GLASS_LAMP.get());
                        output.accept(BlockRegistration.SMALL_BUSH.get());
                        output.accept(BlockRegistration.TEDDY_BEAR.get());
                        output.accept(BlockRegistration.SMALL_SHELF.get());
                        output.accept(BlockRegistration.SMALL_SHELF_PINK.get());
                        output.accept(BlockRegistration.TWO_FLOWER_POTS.get());
                        output.accept(BlockRegistration.TRADITIONAL_RADIO.get());
                        output.accept(BlockRegistration.SEWING_MANNEQUIN.get());
                        output.accept(BlockRegistration.SEWING_MACHINE_ANTIQUE.get());

                        output.accept(BlockRegistration.STARS_PENDANT.get());
                        output.accept(BlockRegistration.MOON_PENDANT.get());
                        output.accept(BlockRegistration.MOON_DECORATION.get());
                        output.accept(BlockRegistration.CAGED_BULB.get());
                        output.accept(BlockRegistration.COLOSSEO_WALL_LANTERN.get());
                        output.accept(BlockRegistration.ANTIQUE_STANDING_LAMP.get());
                        output.accept(BlockRegistration.BULLETIN_BOARD.get());
                        output.accept(BlockRegistration.BULLETIN_BOARD_CLUTTERED.get());
                        output.accept(BlockRegistration.LOVELY_LOVE_SEAT.get());
                        output.accept(BlockRegistration.LOVELY_LOVE_SEAT_BLACK.get());

                        output.accept(BlockRegistration.BLACK_CAT_GARLAND.get());
                        output.accept(BlockRegistration.BLOSSOM_GARLAND.get());
                        output.accept(BlockRegistration.BUNNY_GARLAND.get());
                        output.accept(BlockRegistration.POLAROID_A_GARLAND.get());
                        output.accept(BlockRegistration.POLAROID_B_GARLAND.get());
                        output.accept(BlockRegistration.SUNFLOWER_GARLAND.get());

                        output.accept(BlockRegistration.ARMCHAIR_WHITE.get());
                        output.accept(BlockRegistration.ARMCHAIR_LIGHT_GRAY.get());
                        output.accept(BlockRegistration.ARMCHAIR_GRAY.get());
                        output.accept(BlockRegistration.ARMCHAIR_BLACK.get());
                        output.accept(BlockRegistration.ARMCHAIR_BROWN.get());
                        output.accept(BlockRegistration.ARMCHAIR_RED.get());
                        output.accept(BlockRegistration.ARMCHAIR_ORANGE.get());
                        output.accept(BlockRegistration.ARMCHAIR_YELLOW.get());
                        output.accept(BlockRegistration.ARMCHAIR_LIME.get());
                        output.accept(BlockRegistration.ARMCHAIR_GREEN.get());
                        output.accept(BlockRegistration.ARMCHAIR_CYAN.get());
                        output.accept(BlockRegistration.ARMCHAIR_LIGHT_BLUE.get());
                        output.accept(BlockRegistration.ARMCHAIR_BLUE.get());
                        output.accept(BlockRegistration.ARMCHAIR_PURPLE.get());
                        output.accept(BlockRegistration.ARMCHAIR_MAGENTA.get());
                        output.accept(BlockRegistration.ARMCHAIR_PINK.get());
                        output.accept(BlockRegistration.ARMCHAIR_FUSCHIA.get());
                        output.accept(BlockRegistration.ARMCHAIR_IVORY.get());
                        output.accept(BlockRegistration.ARMCHAIR_FLOWER.get());
                        output.accept(BlockRegistration.ARMCHAIR_STRAWBERRY.get());
                        output.accept(BlockRegistration.ARMCHAIR_HEART.get());
                        output.accept(BlockRegistration.ARMCHAIR_WATERMELON.get());
                        output.accept(BlockRegistration.ARMCHAIR_LEMON.get());
                        output.accept(BlockRegistration.ARMCHAIR_STARRY.get());
                        output.accept(BlockRegistration.ARMCHAIR_BLACK_CAT.get());
                        output.accept(BlockRegistration.COTTAGE_ARMCHAIR.get());

                        output.accept(BlockRegistration.TABLE_PLAIN.get());
                        output.accept(BlockRegistration.TABLE_TABLECLOTH.get());

                    })
                    .build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
