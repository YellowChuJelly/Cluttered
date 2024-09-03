package net.redchujelly.cluttered.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.redchujelly.cluttered.setup.BlockRegistration;

import java.util.Set;

//All of this code is from the Kaupenjoe 1.20.1 datagen tutorial.
public class ClutteredBlockLootTables extends BlockLootSubProvider {
    public ClutteredBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        //WILLOW WOODSET
        dropSelf(BlockRegistration.WILLOW_LOG.get());
        dropSelf(BlockRegistration.WILLOW_WOOD.get());
        dropSelf(BlockRegistration.STRIPPED_WILLOW_LOG.get());
        dropSelf(BlockRegistration.STRIPPED_WILLOW_WOOD.get());
        dropSelf(BlockRegistration.WILLOW_PLANKS.get());
        dropSelf(BlockRegistration.WILLOW_LOG.get());
        dropSelf(BlockRegistration.WILLOW_WOOD.get());
        dropSelf(BlockRegistration.STRIPPED_WILLOW_LOG.get());
        dropSelf(BlockRegistration.STRIPPED_WILLOW_WOOD.get());
        dropSelf(BlockRegistration.WILLOW_PLANKS.get());
        dropSelf(BlockRegistration.WILLOW_STAIRS.get());
        dropSelf(BlockRegistration.WILLOW_FENCE.get());
        dropSelf(BlockRegistration.WILLOW_FENCE_GATE.get());
        dropSelf(BlockRegistration.WILLOW_TRAPDOOR.get());
        dropSelf(BlockRegistration.WILLOW_PRESSURE_PLATE.get());
        dropSelf(BlockRegistration.WILLOW_BUTTON.get());
        dropSelf(BlockRegistration.WILLOW_BOOKSHELF_BLACK_CAT.get());
        dropSelf(BlockRegistration.WILLOW_BOOKSHELF_CALICO_CAT.get());
        dropSelf(BlockRegistration.WILLOW_BOOKSHELF_COBWEB.get());
        dropSelf(BlockRegistration.WILLOW_BOOKSHELF_BOTTLES.get());
        dropSelf(BlockRegistration.WILLOW_BOOKSHELF_VASE.get());

        add(BlockRegistration.WILLOW_SLAB.get(), block -> createSlabItemTable(BlockRegistration.WILLOW_SLAB.get()));
        add(BlockRegistration.WILLOW_LOG_DOOR.get(), block -> createDoorTable(BlockRegistration.WILLOW_LOG_DOOR.get()));
        add(BlockRegistration.WILLOW_GARDEN_DOOR.get(), block -> createDoorTable(BlockRegistration.WILLOW_GARDEN_DOOR.get()));
        add(BlockRegistration.WILLOW_DOOR.get(), block -> createDoorTable(BlockRegistration.WILLOW_DOOR.get()));
        add(BlockRegistration.WILLOW_WINDOW.get(), block -> createSilkTouchOnlyTable(BlockRegistration.WILLOW_WINDOW.get()));
        add(BlockRegistration.WILLOW_WINDOW_PANE.get(), block -> createSilkTouchOnlyTable(BlockRegistration.WILLOW_WINDOW_PANE.get()));

        //FLOWERING WILLOW WOODSET
        dropSelf(BlockRegistration.FLOWERING_WILLOW_LOG.get());
        dropSelf(BlockRegistration.FLOWERING_WILLOW_WOOD.get());
        dropSelf(BlockRegistration.STRIPPED_FLOWERING_WILLOW_LOG.get());
        dropSelf(BlockRegistration.STRIPPED_FLOWERING_WILLOW_WOOD.get());
        dropSelf(BlockRegistration.FLOWERING_WILLOW_PLANKS.get());
        dropSelf(BlockRegistration.FLOWERING_WILLOW_STAIRS.get());
        dropSelf(BlockRegistration.FLOWERING_WILLOW_FENCE.get());
        dropSelf(BlockRegistration.FLOWERING_WILLOW_FENCE_GATE.get());
        dropSelf(BlockRegistration.FLOWERING_WILLOW_TRAPDOOR.get());
        dropSelf(BlockRegistration.FLOWERING_WILLOW_PRESSURE_PLATE.get());
        dropSelf(BlockRegistration.FLOWERING_WILLOW_BUTTON.get());

        add(BlockRegistration.FLOWERING_WILLOW_SLAB.get(), block -> createSlabItemTable(BlockRegistration.FLOWERING_WILLOW_SLAB.get()));
        add(BlockRegistration.FLOWERING_WILLOW_DOOR.get(), block -> createDoorTable(BlockRegistration.FLOWERING_WILLOW_DOOR.get()));
        add(BlockRegistration.FLOWERING_WILLOW_WINDOW.get(), block -> createSilkTouchOnlyTable(BlockRegistration.FLOWERING_WILLOW_WINDOW.get()));
        add(BlockRegistration.FLOWERING_WILLOW_WINDOW_PANE.get(), block -> createSilkTouchOnlyTable(BlockRegistration.FLOWERING_WILLOW_WINDOW_PANE.get()));

        //POPLAR WOODSET
        dropSelf(BlockRegistration.POPLAR_LOG.get());
        dropSelf(BlockRegistration.POPLAR_WOOD.get());
        dropSelf(BlockRegistration.STRIPPED_POPLAR_LOG.get());
        dropSelf(BlockRegistration.STRIPPED_POPLAR_WOOD.get());
        dropSelf(BlockRegistration.POPLAR_PLANKS.get());
        dropSelf(BlockRegistration.POPLAR_STAIRS.get());
        dropSelf(BlockRegistration.POPLAR_FENCE.get());
        dropSelf(BlockRegistration.POPLAR_FENCE_GATE.get());
        dropSelf(BlockRegistration.POPLAR_TRAPDOOR.get());
        dropSelf(BlockRegistration.POPLAR_PRESSURE_PLATE.get());
        dropSelf(BlockRegistration.POPLAR_BUTTON.get());
        dropSelf(BlockRegistration.POPLAR_BOOKSHELF.get());

        add(BlockRegistration.POPLAR_SLAB.get(), block -> createSlabItemTable(BlockRegistration.POPLAR_SLAB.get()));
        add(BlockRegistration.POPLAR_DOOR.get(), block -> createDoorTable(BlockRegistration.POPLAR_DOOR.get()));
        add(BlockRegistration.POPLAR_WINDOW.get(), block -> createSilkTouchOnlyTable(BlockRegistration.POPLAR_WINDOW.get()));
        add(BlockRegistration.POPLAR_WINDOW_PANE.get(), block -> createSilkTouchOnlyTable(BlockRegistration.POPLAR_WINDOW_PANE.get()));

        //FLOWERING POPLAR WOODSET
        dropSelf(BlockRegistration.FLOWERING_POPLAR_LOG.get());
        dropSelf(BlockRegistration.FLOWERING_POPLAR_WOOD.get());
        dropSelf(BlockRegistration.STRIPPED_FLOWERING_POPLAR_LOG.get());
        dropSelf(BlockRegistration.STRIPPED_FLOWERING_POPLAR_WOOD.get());
        dropSelf(BlockRegistration.FLOWERING_POPLAR_PLANKS.get());
        dropSelf(BlockRegistration.FLOWERING_POPLAR_STAIRS.get());
        dropSelf(BlockRegistration.FLOWERING_POPLAR_FENCE.get());
        dropSelf(BlockRegistration.FLOWERING_POPLAR_FENCE_GATE.get());
        dropSelf(BlockRegistration.FLOWERING_POPLAR_TRAPDOOR.get());
        dropSelf(BlockRegistration.FLOWERING_POPLAR_PRESSURE_PLATE.get());
        dropSelf(BlockRegistration.FLOWERING_POPLAR_BUTTON.get());
        dropSelf(BlockRegistration.FLOWERING_POPLAR_BOOKSHELF.get());

        add(BlockRegistration.FLOWERING_POPLAR_SLAB.get(), block -> createSlabItemTable(BlockRegistration.FLOWERING_POPLAR_SLAB.get()));
        add(BlockRegistration.FLOWERING_POPLAR_DOOR.get(), block -> createDoorTable(BlockRegistration.FLOWERING_POPLAR_DOOR.get()));
        add(BlockRegistration.FLOWERING_POPLAR_WINDOW.get(), block -> createSilkTouchOnlyTable(BlockRegistration.FLOWERING_POPLAR_WINDOW.get()));
        add(BlockRegistration.FLOWERING_POPLAR_WINDOW_PANE.get(), block -> createSilkTouchOnlyTable(BlockRegistration.FLOWERING_POPLAR_WINDOW_PANE.get()));

        //CRABAPPLE WOODSET
        dropSelf(BlockRegistration.CRABAPPLE_LOG.get());
        dropSelf(BlockRegistration.CRABAPPLE_WOOD.get());
        dropSelf(BlockRegistration.STRIPPED_CRABAPPLE_LOG.get());
        dropSelf(BlockRegistration.STRIPPED_CRABAPPLE_WOOD.get());
        dropSelf(BlockRegistration.CRABAPPLE_PLANKS.get());
        dropSelf(BlockRegistration.CRABAPPLE_STAIRS.get());
        dropSelf(BlockRegistration.CRABAPPLE_FENCE.get());
        dropSelf(BlockRegistration.CRABAPPLE_FENCE_GATE.get());
        dropSelf(BlockRegistration.CRABAPPLE_TRAPDOOR.get());
        dropSelf(BlockRegistration.CRABAPPLE_PRESSURE_PLATE.get());
        dropSelf(BlockRegistration.CRABAPPLE_BUTTON.get());
        dropSelf(BlockRegistration.CRABAPPLE_BOOKSHELF.get());

        add(BlockRegistration.CRABAPPLE_SLAB.get(), block -> createSlabItemTable(BlockRegistration.CRABAPPLE_SLAB.get()));
        add(BlockRegistration.CRABAPPLE_DOOR.get(), block -> createDoorTable(BlockRegistration.CRABAPPLE_DOOR.get()));
        add(BlockRegistration.CRABAPPLE_WINDOW.get(), block -> createSilkTouchOnlyTable(BlockRegistration.CRABAPPLE_WINDOW.get()));
        add(BlockRegistration.CRABAPPLE_WINDOW_PANE.get(), block -> createSilkTouchOnlyTable(BlockRegistration.CRABAPPLE_WINDOW_PANE.get()));

        //FLOWERING CRABAPPLE WOODSET
        dropSelf(BlockRegistration.FLOWERING_CRABAPPLE_LOG.get());
        dropSelf(BlockRegistration.FLOWERING_CRABAPPLE_WOOD.get());
        dropSelf(BlockRegistration.STRIPPED_FLOWERING_CRABAPPLE_LOG.get());
        dropSelf(BlockRegistration.STRIPPED_FLOWERING_CRABAPPLE_WOOD.get());
        dropSelf(BlockRegistration.FLOWERING_CRABAPPLE_PLANKS.get());
        dropSelf(BlockRegistration.FLOWERING_CRABAPPLE_STAIRS.get());
        dropSelf(BlockRegistration.FLOWERING_CRABAPPLE_FENCE.get());
        dropSelf(BlockRegistration.FLOWERING_CRABAPPLE_FENCE_GATE.get());
        dropSelf(BlockRegistration.FLOWERING_CRABAPPLE_TRAPDOOR.get());
        dropSelf(BlockRegistration.FLOWERING_CRABAPPLE_PRESSURE_PLATE.get());
        dropSelf(BlockRegistration.FLOWERING_CRABAPPLE_BUTTON.get());
        dropSelf(BlockRegistration.FLOWERING_CRABAPPLE_BOOKSHELF.get());

        add(BlockRegistration.FLOWERING_CRABAPPLE_SLAB.get(), block -> createSlabItemTable(BlockRegistration.FLOWERING_CRABAPPLE_SLAB.get()));
        add(BlockRegistration.FLOWERING_CRABAPPLE_DOOR.get(), block -> createDoorTable(BlockRegistration.FLOWERING_CRABAPPLE_DOOR.get()));
        add(BlockRegistration.FLOWERING_CRABAPPLE_WINDOW.get(), block -> createSilkTouchOnlyTable(BlockRegistration.FLOWERING_CRABAPPLE_WINDOW.get()));
        add(BlockRegistration.FLOWERING_CRABAPPLE_WINDOW_PANE.get(), block -> createSilkTouchOnlyTable(BlockRegistration.FLOWERING_CRABAPPLE_WINDOW_PANE.get()));

        //SYCAMORE WOODSET
        dropSelf(BlockRegistration.SYCAMORE_LOG.get());
        dropSelf(BlockRegistration.SYCAMORE_WOOD.get());
        dropSelf(BlockRegistration.STRIPPED_SYCAMORE_LOG.get());
        dropSelf(BlockRegistration.STRIPPED_SYCAMORE_WOOD.get());
        dropSelf(BlockRegistration.SYCAMORE_PLANKS.get());
        dropSelf(BlockRegistration.SYCAMORE_STAIRS.get());
        dropSelf(BlockRegistration.SYCAMORE_FENCE.get());
        dropSelf(BlockRegistration.SYCAMORE_FENCE_GATE.get());
        dropSelf(BlockRegistration.SYCAMORE_TRAPDOOR.get());
        dropSelf(BlockRegistration.SYCAMORE_PRESSURE_PLATE.get());
        dropSelf(BlockRegistration.SYCAMORE_BUTTON.get());
        dropSelf(BlockRegistration.SYCAMORE_BOOKSHELF.get());

        add(BlockRegistration.SYCAMORE_SLAB.get(), block -> createSlabItemTable(BlockRegistration.SYCAMORE_SLAB.get()));
        add(BlockRegistration.SYCAMORE_DOOR.get(), block -> createDoorTable(BlockRegistration.SYCAMORE_DOOR.get()));
        add(BlockRegistration.SYCAMORE_WINDOW.get(), block -> createSilkTouchOnlyTable(BlockRegistration.SYCAMORE_WINDOW.get()));
        add(BlockRegistration.SYCAMORE_WINDOW_PANE.get(), block -> createSilkTouchOnlyTable(BlockRegistration.SYCAMORE_WINDOW_PANE.get()));

        //FLUORESCENT MAPLE WOODSET
        dropSelf(BlockRegistration.MAPLE_LOG.get());
        dropSelf(BlockRegistration.MAPLE_WOOD.get());
        dropSelf(BlockRegistration.STRIPPED_MAPLE_LOG.get());
        dropSelf(BlockRegistration.STRIPPED_MAPLE_WOOD.get());
        dropSelf(BlockRegistration.MAPLE_PLANKS.get());
        dropSelf(BlockRegistration.MAPLE_STAIRS.get());
        dropSelf(BlockRegistration.MAPLE_FENCE.get());
        dropSelf(BlockRegistration.MAPLE_FENCE_GATE.get());
        dropSelf(BlockRegistration.MAPLE_TRAPDOOR.get());
        dropSelf(BlockRegistration.MAPLE_PRESSURE_PLATE.get());
        dropSelf(BlockRegistration.MAPLE_BUTTON.get());
        dropSelf(BlockRegistration.MAPLE_BOOKSHELF.get());

        add(BlockRegistration.MAPLE_SLAB.get(), block -> createSlabItemTable(BlockRegistration.MAPLE_SLAB.get()));
        add(BlockRegistration.MAPLE_DOOR.get(), block -> createDoorTable(BlockRegistration.MAPLE_DOOR.get()));
        add(BlockRegistration.MAPLE_WINDOW.get(), block -> createSilkTouchOnlyTable(BlockRegistration.MAPLE_WINDOW.get()));
        add(BlockRegistration.MAPLE_WINDOW_PANE.get(), block -> createSilkTouchOnlyTable(BlockRegistration.MAPLE_WINDOW_PANE.get()));

        //BLUE MUSHROOM WOODSET
        dropSelf(BlockRegistration.BLUE_MUSHROOM_LOG.get());
        dropSelf(BlockRegistration.BLUE_MUSHROOM_WOOD.get());
        dropSelf(BlockRegistration.BLUE_MUSHROOM_PLANKS.get());
        dropSelf(BlockRegistration.BLUE_MUSHROOM_CAP.get());
        dropSelf(BlockRegistration.BLUE_MUSHROOM_STAIRS.get());
        dropSelf(BlockRegistration.BLUE_MUSHROOM_FENCE.get());
        dropSelf(BlockRegistration.BLUE_MUSHROOM_FENCE_GATE.get());
        dropSelf(BlockRegistration.BLUE_MUSHROOM_TRAPDOOR.get());
        dropSelf(BlockRegistration.BLUE_MUSHROOM_PRESSURE_PLATE.get());
        dropSelf(BlockRegistration.BLUE_MUSHROOM_BUTTON.get());
        dropSelf(BlockRegistration.BLUE_MUSHROOM_BOOKSHELF.get());

        add(BlockRegistration.BLUE_MUSHROOM_SLAB.get(), block -> createSlabItemTable(BlockRegistration.BLUE_MUSHROOM_SLAB.get()));
        add(BlockRegistration.BLUE_MUSHROOM_DOOR.get(), block -> createDoorTable(BlockRegistration.BLUE_MUSHROOM_DOOR.get()));
        add(BlockRegistration.BLUE_MUSHROOM_WINDOW.get(), block -> createSilkTouchOnlyTable(BlockRegistration.BLUE_MUSHROOM_WINDOW.get()));
        add(BlockRegistration.BLUE_MUSHROOM_WINDOW_PANE.get(), block -> createSilkTouchOnlyTable(BlockRegistration.BLUE_MUSHROOM_WINDOW_PANE.get()));
       
        //RED MUSHROOM WOODSET
        dropSelf(BlockRegistration.RED_MUSHROOM_LOG.get());
        dropSelf(BlockRegistration.RED_MUSHROOM_WOOD.get());
        dropSelf(BlockRegistration.RED_MUSHROOM_PLANKS.get());
        dropSelf(BlockRegistration.RED_MUSHROOM_CAP.get());
        dropSelf(BlockRegistration.RED_MUSHROOM_STAIRS.get());
        dropSelf(BlockRegistration.RED_MUSHROOM_FENCE.get());
        dropSelf(BlockRegistration.RED_MUSHROOM_FENCE_GATE.get());
        dropSelf(BlockRegistration.RED_MUSHROOM_TRAPDOOR.get());
        dropSelf(BlockRegistration.RED_MUSHROOM_PRESSURE_PLATE.get());
        dropSelf(BlockRegistration.RED_MUSHROOM_BUTTON.get());
        dropSelf(BlockRegistration.RED_MUSHROOM_BOOKSHELF.get());

        add(BlockRegistration.RED_MUSHROOM_SLAB.get(), block -> createSlabItemTable(BlockRegistration.RED_MUSHROOM_SLAB.get()));
        add(BlockRegistration.RED_MUSHROOM_DOOR.get(), block -> createDoorTable(BlockRegistration.RED_MUSHROOM_DOOR.get()));
        add(BlockRegistration.RED_MUSHROOM_WINDOW.get(), block -> createSilkTouchOnlyTable(BlockRegistration.RED_MUSHROOM_WINDOW.get()));
        add(BlockRegistration.RED_MUSHROOM_WINDOW_PANE.get(), block -> createSilkTouchOnlyTable(BlockRegistration.RED_MUSHROOM_WINDOW_PANE.get()));

        //MISC BLOCKS
        //CHALCEDONY SET
        dropSelf(BlockRegistration.CHALCEDONY.get());
        dropSelf(BlockRegistration.CHALCEDONY_STAIRS.get());
        dropSelf(BlockRegistration.CHALCEDONY_SLAB.get());
        dropSelf(BlockRegistration.POLISHED_CHALCEDONY.get());
        dropSelf(BlockRegistration.CHALCEDONY_BRICKS.get());
        dropSelf(BlockRegistration.CHALCEDONY_BRICK_STAIRS.get());
        dropSelf(BlockRegistration.CHALCEDONY_BRICK_SLAB.get());
        dropSelf(BlockRegistration.CHALCEDONY_TILES.get());
        dropSelf(BlockRegistration.CHALCEDONY_SMALL_TILES.get());
        dropSelf(BlockRegistration.CHISELED_CHALCEDONY.get());
        dropSelf(BlockRegistration.CHALCEDONY_BORDER.get());
        dropSelf(BlockRegistration.CHALCEDONY_ACANTHUS.get());
        dropSelf(BlockRegistration.CHALCEDONY_HELIX.get());
        dropSelf(BlockRegistration.STARRY_CHISELED_CHALCEDONY.get());
        dropSelf(BlockRegistration.CHALCEDONY_PILLAR.get());
        dropSelf(BlockRegistration.CHALCEDONY_PILLAR_BASE.get());
        dropSelf(BlockRegistration.CHALCEDONY_PILLAR_DORIC.get());
        dropSelf(BlockRegistration.CHALCEDONY_PILLAR_IONIC.get());
        dropSelf(BlockRegistration.STARRY_CHALCEDONY_PILLAR.get());
        dropSelf(BlockRegistration.STARRY_CHALCEDONY_PILLAR_BASE.get());
        dropSelf(BlockRegistration.STARRY_CHALCEDONY_PILLAR_DORIC.get());
        dropSelf(BlockRegistration.STARRY_CHALCEDONY_PILLAR_IONIC.get());

        add(BlockRegistration.CHALCEDONY_WINDOW.get(), block -> createSilkTouchOnlyTable(BlockRegistration.CHALCEDONY_WINDOW.get()));
        add(BlockRegistration.CHALCEDONY_WINDOW_PANE.get(), block -> createSilkTouchOnlyTable(BlockRegistration.CHALCEDONY_WINDOW_PANE.get()));

        //DEEP CHALCEDONY SET
        dropSelf(BlockRegistration.DEEP_CHALCEDONY.get());
        dropSelf(BlockRegistration.DEEP_CHALCEDONY_STAIRS.get());
        dropSelf(BlockRegistration.DEEP_CHALCEDONY_SLAB.get());
        dropSelf(BlockRegistration.DEEP_POLISHED_CHALCEDONY.get());
        dropSelf(BlockRegistration.DEEP_CHALCEDONY_BRICKS.get());
        dropSelf(BlockRegistration.DEEP_CHALCEDONY_BRICK_STAIRS.get());
        dropSelf(BlockRegistration.DEEP_CHALCEDONY_BRICK_SLAB.get());
        dropSelf(BlockRegistration.DEEP_CHALCEDONY_TILES.get());
        dropSelf(BlockRegistration.DEEP_CHALCEDONY_SMALL_TILES.get());
        dropSelf(BlockRegistration.DEEP_CHISELED_CHALCEDONY.get());
        dropSelf(BlockRegistration.DEEP_CHALCEDONY_BORDER.get());
        dropSelf(BlockRegistration.DEEP_CHALCEDONY_ACANTHUS.get());
        dropSelf(BlockRegistration.DEEP_CHALCEDONY_HELIX.get());
        dropSelf(BlockRegistration.DEEP_STARRY_CHISELED_CHALCEDONY.get());
        dropSelf(BlockRegistration.DEEP_CHALCEDONY_PILLAR.get());
        dropSelf(BlockRegistration.DEEP_CHALCEDONY_PILLAR_BASE.get());
        dropSelf(BlockRegistration.DEEP_CHALCEDONY_PILLAR_DORIC.get());
        dropSelf(BlockRegistration.DEEP_CHALCEDONY_PILLAR_IONIC.get());
        dropSelf(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR.get());
        dropSelf(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_BASE.get());
        dropSelf(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_DORIC.get());
        dropSelf(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_IONIC.get());

        add(BlockRegistration.DEEP_CHALCEDONY_WINDOW.get(), block -> createSilkTouchOnlyTable(BlockRegistration.DEEP_CHALCEDONY_WINDOW.get()));
        add(BlockRegistration.DEEP_CHALCEDONY_WINDOW_PANE.get(), block -> createSilkTouchOnlyTable(BlockRegistration.DEEP_CHALCEDONY_WINDOW_PANE.get()));

        //MARBLE SET
        dropSelf(BlockRegistration.MARBLE.get());
        dropSelf(BlockRegistration.MARBLE_STAIRS.get());
        dropSelf(BlockRegistration.MARBLE_SLAB.get());
        dropSelf(BlockRegistration.POLISHED_MARBLE.get());
        dropSelf(BlockRegistration.MARBLE_BRICKS.get());
        dropSelf(BlockRegistration.MARBLE_BRICK_STAIRS.get());
        dropSelf(BlockRegistration.MARBLE_BRICK_SLAB.get());
        dropSelf(BlockRegistration.MARBLE_TILES.get());
        dropSelf(BlockRegistration.MARBLE_SMALL_TILES.get());
        dropSelf(BlockRegistration.CHISELED_MARBLE.get());
        dropSelf(BlockRegistration.MARBLE_BORDER.get());
        dropSelf(BlockRegistration.MARBLE_ACANTHUS.get());
        dropSelf(BlockRegistration.MARBLE_HELIX.get());
        dropSelf(BlockRegistration.STARRY_CHISELED_MARBLE.get());
        dropSelf(BlockRegistration.MARBLE_PILLAR.get());
        dropSelf(BlockRegistration.MARBLE_PILLAR_BASE.get());
        dropSelf(BlockRegistration.MARBLE_PILLAR_DORIC.get());
        dropSelf(BlockRegistration.MARBLE_PILLAR_IONIC.get());

        add(BlockRegistration.BLACK_CAT_WINDOW.get(), block -> createSilkTouchOnlyTable(BlockRegistration.BLACK_CAT_WINDOW.get()));
        add(BlockRegistration.BLACK_CAT_WINDOW_PANE.get(), block -> createSilkTouchOnlyTable(BlockRegistration.BLACK_CAT_WINDOW_PANE.get()));

        //MISC
        dropSelf(BlockRegistration.YELLOW_PLANTER.get());
        dropSelf(BlockRegistration.PINK_PLANTER.get());
        dropSelf(BlockRegistration.GREEN_PLANTER.get());
        dropSelf(BlockRegistration.PURPLE_PLANTER.get());
        dropSelf(BlockRegistration.BEIGE_PLANTER.get());
        dropSelf(BlockRegistration.FLUORESCENT_PLANTER.get());
        dropSelf(BlockRegistration.RED_PLANTER.get());
        dropSelf(BlockRegistration.BLUE_PLANTER.get());

        dropSelf(BlockRegistration.STARRY_WALLPAPER.get());
        dropSelf(BlockRegistration.STARRY_WALLPAPER_TOP.get());
        dropSelf(BlockRegistration.STARRY_WALLPAPER_BOTTOM.get());
        dropSelf(BlockRegistration.DARK_STARRY_WALLPAPER.get());
        dropSelf(BlockRegistration.DARK_STARRY_WALLPAPER_TOP.get());
        dropSelf(BlockRegistration.DARK_STARRY_WALLPAPER_BOTTOM.get());
        dropSelf(BlockRegistration.RETRO_RAINBOW_WALLPAPER.get());
        dropSelf(BlockRegistration.APPLE_WALLPAPER.get());
        dropSelf(BlockRegistration.BLUE_ROSE_STRIPED_WALLPAPER.get());
        dropSelf(BlockRegistration.CHECKERED_FRUIT_WALLPAPER.get());
        dropSelf(BlockRegistration.CHECKERED_PINK_WALLPAPER.get());
        dropSelf(BlockRegistration.CHECKERED_PINK_STRAWBERRY_WALLPAPER.get());
        dropSelf(BlockRegistration.CHECKERED_GREEN_WALLPAPER.get());
        dropSelf(BlockRegistration.CHECKERED_GREEN_STRAWBERRY_WALLPAPER.get());
        dropSelf(BlockRegistration.CHIC_WALLPAPER.get());
        dropSelf(BlockRegistration.CHIC_WALLPAPER_UPPER_TRIM.get());
        dropSelf(BlockRegistration.CHIC_WALLPAPER_LOWER_TRIM.get());
        dropSelf(BlockRegistration.FLORAL_BERRY_WALLPAPER.get());
        dropSelf(BlockRegistration.FLORAL_BORDER_WALLPAPER.get());
        dropSelf(BlockRegistration.CONFECTIONARY_WALLPAPER.get());
        dropSelf(BlockRegistration.GHOST_WALLPAPER.get());
        dropSelf(BlockRegistration.GHOST_WALLPAPER_TRIM.get());
        dropSelf(BlockRegistration.GHOST_WALLPAPER_WAINSCOTING.get());
        dropSelf(BlockRegistration.HALLOWEEN_WAINSCOTING.get());
        dropSelf(BlockRegistration.HALLOWEEN_WALLPAPER.get());
        dropSelf(BlockRegistration.MARIGOLD_WALLPAPER.get());
        dropSelf(BlockRegistration.MINT_WALLPAPER.get());
        dropSelf(BlockRegistration.PINK_STRIPE_WALLPAPER.get());
        dropSelf(BlockRegistration.PINK_STRIPE_WALLPAPER_LOWER_TRIM.get());
        dropSelf(BlockRegistration.PINK_STRIPE_WALLPAPER_UPPER_TRIM.get());
        dropSelf(BlockRegistration.RIALTO_GOLD_WALLPAPER.get());
        dropSelf(BlockRegistration.STRIPED_FLORAL_WALLPAPER.get());

        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_APPLE.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BONES.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_LEMON.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_ORANGE.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_PEAR.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_PLUM.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR.get());

        dropSelf(BlockRegistration.BLUE_WAINSCOTING.get());
        dropSelf(BlockRegistration.BROWN_WAINSCOTING.get());
        dropSelf(BlockRegistration.WILLOW_WAINSCOTING.get());
        dropSelf(BlockRegistration.FLOWERING_WILLOW_WAINSCOTING.get());
        dropSelf(BlockRegistration.POPLAR_WAINSCOTING.get());
        dropSelf(BlockRegistration.FLOWERING_POPLAR_WAINSCOTING.get());
        dropSelf(BlockRegistration.CRABAPPLE_WAINSCOTING.get());
        dropSelf(BlockRegistration.FLOWERING_CRABAPPLE_WAINSCOTING.get());
        dropSelf(BlockRegistration.SYCAMORE_WAINSCOTING.get());
        dropSelf(BlockRegistration.MAPLE_WAINSCOTING.get());
        dropSelf(BlockRegistration.BLUE_MUSHROOM_WAINSCOTING.get());
        dropSelf(BlockRegistration.RED_MUSHROOM_WAINSCOTING.get());
        dropSelf(BlockRegistration.ALABASTER_WAINSCOTING.get());

        dropSelf(BlockRegistration.GINGERBREAD_BRICKS.get());
        dropSelf(BlockRegistration.GINGERBREAD_BRICKS_TOP.get());
        dropSelf(BlockRegistration.GINGERBREAD_BRICKS_SIDE.get());
        dropSelf(BlockRegistration.GINGERBREAD_BRICKS_TOP_CORNER.get());
        dropSelf(BlockRegistration.GINGERBREAD_BRICK_STAIRS.get());
        dropSelf(BlockRegistration.GINGERBREAD_BRICK_SLAB.get());

        dropSelf(BlockRegistration.ESPERANCA_TILE.get());
        dropSelf(BlockRegistration.LILIY_HILLS_TILE.get());
        dropSelf(BlockRegistration.HANNISH_TILE.get());
        dropSelf(BlockRegistration.AURA_TILES.get());
        dropSelf(BlockRegistration.BIFURCATING_TILES.get());
        dropSelf(BlockRegistration.BLACK_AMARYLLIS_TILES.get());
        dropSelf(BlockRegistration.ROSETTE_TILES.get());
        dropSelf(BlockRegistration.SEISMIC_TILES.get());

        dropSelf(BlockRegistration.MARBLE_TILE.get());
        dropSelf(BlockRegistration.MARBLE_TILE_CHISELED.get());
        dropSelf(BlockRegistration.MARBLE_TILE_BORDER.get());
        dropSelf(BlockRegistration.MARBLE_TILE_BORDER_CIRCLE.get());
        dropSelf(BlockRegistration.MARBLE_TILE_BORDER_DETAIL.get());
        dropSelf(BlockRegistration.MARBLE_TILE_CORNER.get());
        dropSelf(BlockRegistration.MARBLE_TILE_CORNER_CIRCLE.get());

        dropSelf(BlockRegistration.VERDANT_TILE.get());
        dropSelf(BlockRegistration.VERDANT_TILE_EDGE.get());
        dropSelf(BlockRegistration.VERDANT_TILE_CORNER.get());

        dropSelf(BlockRegistration.IRIDESCENT_TILES.get());
        dropSelf(BlockRegistration.SMALL_IRIDESCENT_TILES.get());
        dropSelf(BlockRegistration.GREEN_TILES.get());
        dropSelf(BlockRegistration.SMALL_GREEN_TILES.get());
        dropSelf(BlockRegistration.YELLOW_TILES.get());
        dropSelf(BlockRegistration.SMALL_YELLOW_TILES.get());
        dropSelf(BlockRegistration.PINK_TILES.get());
        dropSelf(BlockRegistration.SMALL_PINK_TILES.get());
        dropSelf(BlockRegistration.PURPLE_TILES.get());
        dropSelf(BlockRegistration.SMALL_PURPLE_TILES.get());
        dropSelf(BlockRegistration.KITCHEN_TILES.get());

        dropSelf(BlockRegistration.CHISELED_GOLD_BLOCK.get());
        dropSelf(BlockRegistration.WICKER_BLOCK.get());
        dropSelf(BlockRegistration.EYE_BLOCK.get());
        add(BlockRegistration.DYNASTY_DOOR.get(), block -> createDoorTable(BlockRegistration.DYNASTY_DOOR.get()));

        add(BlockRegistration.ALABASTER_WINDOW_DIVIDED.get(), block -> createSilkTouchOnlyTable(BlockRegistration.ALABASTER_WINDOW_DIVIDED.get()));
        add(BlockRegistration.ALABASTER_WINDOW_PANE.get(), block -> createSilkTouchOnlyTable(BlockRegistration.ALABASTER_WINDOW_PANE.get()));
        add(BlockRegistration.ALABASTER_PANEL_CANTERBURY.get(), block -> createSilkTouchOnlyTable(BlockRegistration.ALABASTER_PANEL_CANTERBURY.get()));
        add(BlockRegistration.ALABASTER_PANEL_AUGUSTINE.get(), block -> createSilkTouchOnlyTable(BlockRegistration.ALABASTER_PANEL_AUGUSTINE.get()));
        add(BlockRegistration.ALABASTER_PANEL_ATLANTIC.get(), block -> createSilkTouchOnlyTable(BlockRegistration.ALABASTER_PANEL_ATLANTIC.get()));
        add(BlockRegistration.ALABASTER_PANEL_ALEXANDRIA.get(), block -> createSilkTouchOnlyTable(BlockRegistration.ALABASTER_PANEL_ALEXANDRIA.get()));
        add(BlockRegistration.ALABASTER_FRENCH_DOOR.get(), block -> createDoorTable(BlockRegistration.ALABASTER_FRENCH_DOOR.get()));
        add(BlockRegistration.ALABASTER_SCREEN_DOOR.get(), block -> createDoorTable(BlockRegistration.ALABASTER_SCREEN_DOOR.get()));

        add(BlockRegistration.WOOD_WINDOW_DIVIDED.get(), block -> createSilkTouchOnlyTable(BlockRegistration.WOOD_WINDOW_DIVIDED.get()));
        add(BlockRegistration.WOOD_WINDOW_PANE.get(), block -> createSilkTouchOnlyTable(BlockRegistration.WOOD_WINDOW_PANE.get()));
        add(BlockRegistration.WOOD_PANEL_CANTERBURY.get(), block -> createSilkTouchOnlyTable(BlockRegistration.WOOD_PANEL_CANTERBURY.get()));
        add(BlockRegistration.WOOD_PANEL_AUGUSTINE.get(), block -> createSilkTouchOnlyTable(BlockRegistration.WOOD_PANEL_AUGUSTINE.get()));
        add(BlockRegistration.WOOD_PANEL_ATLANTIC.get(), block -> createSilkTouchOnlyTable(BlockRegistration.WOOD_PANEL_ATLANTIC.get()));
        add(BlockRegistration.WOOD_PANEL_ALEXANDRIA.get(), block -> createSilkTouchOnlyTable(BlockRegistration.WOOD_PANEL_ALEXANDRIA.get()));
        add(BlockRegistration.WOOD_FRENCH_DOOR.get(), block -> createDoorTable(BlockRegistration.WOOD_FRENCH_DOOR.get()));
        add(BlockRegistration.WOOD_SCREEN_DOOR.get(), block -> createDoorTable(BlockRegistration.WOOD_SCREEN_DOOR.get()));


    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BlockRegistration.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
