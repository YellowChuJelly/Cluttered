package net.redchujelly.cluttered.datagen.loot;

import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.RegistryObject;
import net.redchujelly.cluttered.block.multiblock.MultiblockPlacer;
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
        dropSelf(BlockRegistration.WILLOW_SAPLING.get());
        dropSelf(BlockRegistration.WILLOW_SAPLING.get());
        add(BlockRegistration.POTTED_WILLOW_SAPLING.get(), createPotFlowerItemTable(BlockRegistration.WILLOW_SAPLING.get()));

        add(BlockRegistration.WILLOW_LEAVES.get(), block -> createLeavesDrops(BlockRegistration.WILLOW_LEAVES.get(), BlockRegistration.WILLOW_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
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
        dropSelf(BlockRegistration.POPLAR_SAPLING.get());
        add(BlockRegistration.POTTED_POPLAR_SAPLING.get(), createPotFlowerItemTable(BlockRegistration.POPLAR_SAPLING.get()));


        add(BlockRegistration.POPLAR_SLAB.get(), block -> createSlabItemTable(BlockRegistration.POPLAR_SLAB.get()));
        add(BlockRegistration.POPLAR_DOOR.get(), block -> createDoorTable(BlockRegistration.POPLAR_DOOR.get()));
        add(BlockRegistration.POPLAR_WINDOW.get(), block -> createSilkTouchOnlyTable(BlockRegistration.POPLAR_WINDOW.get()));
        add(BlockRegistration.POPLAR_WINDOW_PANE.get(), block -> createSilkTouchOnlyTable(BlockRegistration.POPLAR_WINDOW_PANE.get()));
        add(BlockRegistration.POPLAR_LEAVES.get(), block -> createLeavesDrops(BlockRegistration.POPLAR_LEAVES.get(), BlockRegistration.POPLAR_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

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
        dropSelf(BlockRegistration.BLUE_MUSHROOM_SAPLING.get());
        add(BlockRegistration.POTTED_BLUE_MUSHROOM_SAPLING.get(), createPotFlowerItemTable(BlockRegistration.BLUE_MUSHROOM_SAPLING.get()));


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
        dropSelf(BlockRegistration.CHALCEDONY_BALUSTRADE.get());
        dropSelf(BlockRegistration.CHALCEDONY_PICKET_FENCE.get());

        dropSelf(BlockRegistration.CHALCEDONY_BRACKET_VICTORIAN.get());
        dropSelf(BlockRegistration.CHALCEDONY_BRACKET_SCROLL.get());
        dropSelf(BlockRegistration.CHALCEDONY_BRACKET_BOW_SCROLL.get());
        dropSelf(BlockRegistration.CHALCEDONY_BRACKET_BOW.get());
        dropSelf(BlockRegistration.CHALCEDONY_BRACKET_STAR.get());
        dropSelf(BlockRegistration.CHALCEDONY_BRACKET_STAR_SCROLL.get());

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
        dropSelf(BlockRegistration.DEEP_CHALCEDONY_BALUSTRADE.get());
        dropSelf(BlockRegistration.DEEP_CHALCEDONY_PICKET_FENCE.get());

        dropSelf(BlockRegistration.DEEP_CHALCEDONY_BRACKET_VICTORIAN.get());
        dropSelf(BlockRegistration.DEEP_CHALCEDONY_BRACKET_SCROLL.get());
        dropSelf(BlockRegistration.DEEP_CHALCEDONY_BRACKET_BOW_SCROLL.get());
        dropSelf(BlockRegistration.DEEP_CHALCEDONY_BRACKET_BOW.get());
        dropSelf(BlockRegistration.DEEP_CHALCEDONY_BRACKET_STAR.get());
        dropSelf(BlockRegistration.DEEP_CHALCEDONY_BRACKET_STAR_SCROLL.get());


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
        dropSelf(BlockRegistration.MARBLE_BALUSTRADE.get());
        dropSelf(BlockRegistration.MARBLE_PICKET_FENCE.get());

        dropSelf(BlockRegistration.MARBLE_BRACKET_VICTORIAN.get());
        dropSelf(BlockRegistration.MARBLE_BRACKET_SCROLL.get());
        dropSelf(BlockRegistration.MARBLE_BRACKET_BOW_SCROLL.get());
        dropSelf(BlockRegistration.MARBLE_BRACKET_BOW.get());
        dropSelf(BlockRegistration.MARBLE_BRACKET_STAR.get());
        dropSelf(BlockRegistration.MARBLE_BRACKET_STAR_SCROLL.get());

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
        dropSelf(BlockRegistration.RIALTO_GOLD_WALLPAPER_TOP.get());
        dropSelf(BlockRegistration.RIALTO_GOLD_WALLPAPER_BOTTOM.get());
        dropSelf(BlockRegistration.STRIPED_FLORAL_WALLPAPER.get());

        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_APPLE.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_APPLE_BOTTOM_BROWN.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_APPLE_TOP_BROWN.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_APPLE_BOTTOM_WHITE.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_APPLE_TOP_WHITE.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_APPLE_BOTTOM_COLOR.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_APPLE_TOP_COLOR.get());

        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_BOTTOM_BROWN.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_TOP_BROWN.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_BOTTOM_WHITE.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_TOP_WHITE.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_BOTTOM_COLOR.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_TOP_COLOR.get());

        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_BOTTOM_BROWN.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_TOP_BROWN.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_BOTTOM_WHITE.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_TOP_WHITE.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_BOTTOM_COLOR.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_TOP_COLOR.get());

        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BONES.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BONES_BOTTOM_BROWN.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BONES_TOP_BROWN.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BONES_BOTTOM_WHITE.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BONES_TOP_WHITE.get());

        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_BOTTOM_BROWN.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_TOP_BROWN.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_BOTTOM_WHITE.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_TOP_WHITE.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_BOTTOM_COLOR.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_TOP_COLOR.get());

        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_BOTTOM_BROWN.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_TOP_BROWN.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_BOTTOM_WHITE.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_TOP_WHITE.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_BOTTOM_COLOR.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_TOP_COLOR.get());

        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_BOTTOM_BROWN.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_TOP_BROWN.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_BOTTOM_WHITE.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_TOP_WHITE.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_BOTTOM_COLOR.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_TOP_COLOR.get());

        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_LEMON.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_LEMON_BOTTOM_BROWN.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_LEMON_TOP_BROWN.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_LEMON_BOTTOM_WHITE.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_LEMON_TOP_WHITE.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_LEMON_BOTTOM_COLOR.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_LEMON_TOP_COLOR.get());

        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_ORANGE.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_BOTTOM_BROWN.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_TOP_BROWN.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_BOTTOM_WHITE.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_TOP_WHITE.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_BOTTOM_COLOR.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_TOP_COLOR.get());

        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_PEAR.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_PEAR_BOTTOM_BROWN.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_PEAR_TOP_BROWN.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_PEAR_BOTTOM_WHITE.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_PEAR_TOP_WHITE.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_PEAR_BOTTOM_COLOR.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_PEAR_TOP_COLOR.get());

        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_PLUM.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_PLUM_BOTTOM_BROWN.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_PLUM_TOP_BROWN.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_PLUM_BOTTOM_WHITE.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_PLUM_TOP_WHITE.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_PLUM_BOTTOM_COLOR.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_PLUM_TOP_COLOR.get());

        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_BOTTOM_BROWN.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_TOP_BROWN.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_BOTTOM_WHITE.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_TOP_WHITE.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_BOTTOM_COLOR.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_TOP_COLOR.get());

        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_BOTTOM_BROWN.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_TOP_BROWN.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_BOTTOM_WHITE.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_TOP_WHITE.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_BOTTOM_COLOR.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_TOP_COLOR.get());

        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_BOTTOM_BROWN.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_TOP_BROWN.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_BOTTOM_WHITE.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_TOP_WHITE.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_BOTTOM_COLOR.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_TOP_COLOR.get());

        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR_BOTTOM_BROWN.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR_TOP_BROWN.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR_BOTTOM_WHITE.get());
        dropSelf(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR_TOP_WHITE.get());

        dropSelf(BlockRegistration.FISH_WALLPAPER.get());
        dropSelf(BlockRegistration.BLUE_ROSE_STRIPED_WALLPAPER_BOTTOM.get());
        dropSelf(BlockRegistration.BLUE_ROSE_STRIPED_WALLPAPER_TOP.get());
        dropSelf(BlockRegistration.CONFECTIONARY_WALLPAPER_BOTTOM.get());
        dropSelf(BlockRegistration.CONFECTIONARY_WALLPAPER_TOP.get());
        dropSelf(BlockRegistration.MINT_WALLPAPER_BOTTOM.get());
        dropSelf(BlockRegistration.MINT_WALLPAPER_TOP.get());
        dropSelf(BlockRegistration.STRIPED_FLORAL_WALLPAPER_BOTTOM.get());
        dropSelf(BlockRegistration.STRIPED_FLORAL_WALLPAPER_TOP.get());
        dropSelf(BlockRegistration.FLORAL_BERRY_WALLPAPER_BOTTOM.get());
        dropSelf(BlockRegistration.FLORAL_BERRY_WALLPAPER_TOP.get());
        dropSelf(BlockRegistration.GHOST_WALLPAPER_BOTTOM.get());
        dropSelf(BlockRegistration.GHOST_WALLPAPER_TOP.get());
        dropSelf(BlockRegistration.HALLOWEEN_WALLPAPER_BOTTOM.get());
        dropSelf(BlockRegistration.HALLOWEEN_WALLPAPER_TOP.get());
        dropSelf(BlockRegistration.MARIGOLD_WALLPAPER_BOTTOM.get());
        dropSelf(BlockRegistration.MARIGOLD_WALLPAPER_TOP.get());

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

        dropSelf(BlockRegistration.COLOSSEO_PILLAR_BASE.get());
        dropSelf(BlockRegistration.COLOSSEO_PILLAR.get());
        dropSelf(BlockRegistration.COLOSSEO_PILLAR_TOP.get());

        dropSelf(BlockRegistration.STRAWBERRY_JAR_BLOCK .get());
        dropSelf(BlockRegistration.CHERRY_JAR_BLOCK.get());
        dropSelf(BlockRegistration.APRICOT_JAR_BLOCK .get());
        dropSelf(BlockRegistration.ORANGE_JAR_BLOCK.get());
        dropSelf(BlockRegistration.HONEY_JAR_BLOCK.get());
        dropSelf(BlockRegistration.BLUEBERRY_JAR_BLOCK .get());
        dropSelf(BlockRegistration.BLUEBERRY_JAR_BLOCK .get());
        dropSelf(BlockRegistration.BLUEBERRY_JAR_BLOCK .get());

        add(BlockRegistration.ART_NOUVEAU_DOOR.get(), block -> createDoorTable(BlockRegistration.ART_NOUVEAU_DOOR.get()));
        add(BlockRegistration.ART_NOUVEAU_DOOR_DARK.get(), block -> createDoorTable(BlockRegistration.ART_NOUVEAU_DOOR_DARK.get()));

        //FOR U TO ORGANIZE
        dropSelf(BlockRegistration.BLACK_CAT_COUNTER_DRAWERS.get());
        dropSelf(BlockRegistration.BLACK_CAT_COUNTER_LEFT_DOOR.get());
        dropSelf(BlockRegistration.BLACK_CAT_COUNTER_RIGHT_DOOR.get());
        dropSelf(BlockRegistration.BOOK_OPEN.get());
        dropSelf(BlockRegistration.BRASS_KEY.get());
        dropSelf(BlockRegistration.ENVELOPE_STACK.get());
        dropSelf(BlockRegistration.FLOWER_DESK_LAMP.get());
        dropSelf(BlockRegistration.FLOWER_SHELF_BLUE.get());
        dropSelf(BlockRegistration.FLOWER_SHELF_GREEN.get());
        dropSelf(BlockRegistration.FLOWER_SHELF_PASTEL_YELLOW.get());
        dropSelf(BlockRegistration.FLOWER_SHELF_PINK.get());
        dropSelf(BlockRegistration.FLOWER_SHELF_PURPLE.get());
        dropSelf(BlockRegistration.FLOWER_SHELF_YELLOW.get());
        dropSelf(BlockRegistration.FLOWER_SHELF_CANDLE_BLUE.get());
        dropSelf(BlockRegistration.FLOWER_SHELF_CANDLE_GREEN.get());
        dropSelf(BlockRegistration.FLOWER_SHELF_CANDLE_PASTEL_YELLOW.get());
        dropSelf(BlockRegistration.FLOWER_SHELF_CANDLE_PINK.get());
        dropSelf(BlockRegistration.FLOWER_SHELF_CANDLE_PURPLE.get());
        dropSelf(BlockRegistration.FLOWER_SHELF_CANDLE_YELLOW.get());
        dropSelf(BlockRegistration.FLOWER_SHELF_PLANT.get());
        dropSelf(BlockRegistration.FLOWER_TEA_KETTLE.get());
        dropSelf(BlockRegistration.FWISH_ARMCHAIR.get());
        dropSelf(BlockRegistration.FWISH_OTTOMAN.get());
        dropSelf(BlockRegistration.HEAVENLY_ORNAMENTAL_ARRAY.get());
        dropSelf(BlockRegistration.PLANT_LADDER.get());
        dropSelf(BlockRegistration.POLAROID_CAMERA.get());
        dropSelf(BlockRegistration.POLAROIDS_B.get());
        dropSelf(BlockRegistration.POLAROIDS_C.get());
        dropSelf(BlockRegistration.PUZZLE_PIECE_TABLE_BLUE.get());
        dropSelf(BlockRegistration.PUZZLE_PIECE_TABLE_GREEN.get());
        dropSelf(BlockRegistration.PUZZLE_PIECE_TABLE_RED.get());
        dropSelf(BlockRegistration.PUZZLE_PIECE_TABLE_YELLOW.get());
        dropSelf(BlockRegistration.PUZZLE_PIECE_TABLE_PASTEL_BLUE.get());
        dropSelf(BlockRegistration.PUZZLE_PIECE_TABLE_PASTEL_PINK.get());
        dropSelf(BlockRegistration.PUZZLE_PIECE_TABLE_PASTEL_PURPLE.get());
        dropSelf(BlockRegistration.PUZZLE_PIECE_TABLE_PASTEL_YELLOW.get());
        dropSelf(BlockRegistration.SALT_PEPPER_SHAKERS.get());
        dropSelf(BlockRegistration.SAND_SEAL_PLUSH_BLUE.get());
        dropSelf(BlockRegistration.SAND_SEAL_PLUSH_GREEN.get());
        dropSelf(BlockRegistration.SAND_SEAL_PLUSH_RED.get());
        dropSelf(BlockRegistration.SKETCHBOOK_SINGLE.get());
        dropSelf(BlockRegistration.STACK_OF_BOOKS.get());
        dropSelf(BlockRegistration.STACK_OF_BOOKS_TALL.get());
        dropSelf(BlockRegistration.STEAMPUNK_GLOBE.get());
        dropSelf(BlockRegistration.SWEETHEART_BAKING_SET_BOWL.get());
        dropSelf(BlockRegistration.SWEETHEART_BAKING_SET_INGREDIENTS.get());
        dropSelf(BlockRegistration.SWEETHEART_COUNTER_DRAWERS.get());
        dropSelf(BlockRegistration.SWEETHEART_COUNTER_LEFT_DOOR.get());
        dropSelf(BlockRegistration.SWEETHEART_COUNTER_RIGHT_DOOR.get());
        dropSelf(BlockRegistration.WINE_BOTTLE_RACK.get());
        dropSelf(BlockRegistration.WINE_BOTTLES.get());
        dropSelf(BlockRegistration.YELLOW_NOTEPAD.get());
        multiBlockDropOnlyOneItem(BlockRegistration.BLACK_CAT_TABLE.get());
        multiBlockDropOnlyOneItem(BlockRegistration.SWEETHEART_TABLE.get());
        multiBlockDropOnlyOneItem(BlockRegistration.BLACK_CAT_SINK.get());
        multiBlockDropOnlyOneItem(BlockRegistration.SWEETHEART_SINK.get());
        multiBlockDropOnlyOneItem(BlockRegistration.CARD_INDEX.get());
        multiBlockDropOnlyOneItem(BlockRegistration.CHINA_CABINET.get());
        multiBlockDropOnlyOneItem(BlockRegistration.CUPID_BENCH.get());
        multiBlockDropOnlyOneItem(BlockRegistration.GENERAL_STORE_CABINET.get());
        multiBlockDropOnlyOneItem(BlockRegistration.RETRO_FRIDGE_BLACK.get());
        multiBlockDropOnlyOneItem(BlockRegistration.RETRO_FRIDGE_BLUE.get());
        multiBlockDropOnlyOneItem(BlockRegistration.RETRO_FRIDGE_PINK.get());
        multiBlockDropOnlyOneItem(BlockRegistration.RETRO_FRIDGE_PURPLE.get());
        multiBlockDropOnlyOneItem(BlockRegistration.RETRO_FRIDGE_RED.get());
        multiBlockDropOnlyOneItem(BlockRegistration.RETRO_FRIDGE_TURQUOISE.get());
        multiBlockDropOnlyOneItem(BlockRegistration.RETRO_FRIDGE_WHITE.get());
        multiBlockDropOnlyOneItem(BlockRegistration.RETRO_FRIDGE_YELLOW.get());
        dropSelf(BlockRegistration.ROSE_END_TABLE.get());
        dropSelf(BlockRegistration.ROSE_END_TABLE_BLACK.get());
        dropSelf(BlockRegistration.FABRIC_BOLTS.get());
        dropSelf(BlockRegistration.SCISSORS_AND_THREAD.get());
        dropSelf(BlockRegistration.SLICED_BREAD.get());
        dropSelf(BlockRegistration.VIAL_STAND.get());
        dropSelf(BlockRegistration.PINEAPPLE.get());
        dropSelf(BlockRegistration.MUSHROOM_FLAT.get());
        dropSelf(BlockRegistration.HONEYCOMB_LAMP.get());
        dropSelf(BlockRegistration.UNLIVING_CHAIR.get());

        //KITCHEN SETS
        dropSelf(BlockRegistration.KITCHEN_SET_BROWN_CABINET.get());
        dropSelf(BlockRegistration.KITCHEN_SET_BROWN_CABINET_GLASS.get());
        dropSelf(BlockRegistration.KITCHEN_SET_BROWN_CABINET_MINI.get());
        dropSelf(BlockRegistration.KITCHEN_SET_BROWN_CABINET_OUTER_CORNER.get());
        dropSelf(BlockRegistration.KITCHEN_SET_BROWN_CABINET_INNER_CORNER.get());
        dropSelf(BlockRegistration.KITCHEN_SET_BROWN_CABINET_OPEN.get());
        dropSelf(BlockRegistration.KITCHEN_SET_BROWN_COUNTER.get());
        dropSelf(BlockRegistration.KITCHEN_SET_BROWN_COUNTER_INNER_CORNER.get());
        dropSelf(BlockRegistration.KITCHEN_SET_BROWN_COUNTER_OUTER_CORNER_LEFT.get());
        dropSelf(BlockRegistration.KITCHEN_SET_BROWN_COUNTER_OUTER_CORNER_RIGHT.get());
        dropSelf(BlockRegistration.KITCHEN_SET_BROWN_COUNTER_SINK.get());

        dropSelf(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET.get());
        dropSelf(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_GLASS.get());
        dropSelf(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_MINI.get());
        dropSelf(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_OUTER_CORNER.get());
        dropSelf(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_INNER_CORNER.get());
        dropSelf(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_OPEN.get());
        dropSelf(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER.get());
        dropSelf(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_INNER_CORNER.get());
        dropSelf(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_OUTER_CORNER_LEFT.get());
        dropSelf(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_OUTER_CORNER_RIGHT.get());
        dropSelf(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_SINK.get());

        //SMALL FURNITURE
        //CHAIRS
        dropSelf(BlockRegistration.APPLE_CHAIR.get());
        dropSelf(BlockRegistration.BUTTON_STOOL.get());
        dropSelf(BlockRegistration.COTTAGE_CHAIR.get());
        dropSelf(BlockRegistration.COTTAGE_CHAIR_CUSHIONED.get());
        dropSelf(BlockRegistration.COTTAGE_OTTOMAN.get());
        dropSelf(BlockRegistration.MADONNA_OTTOMAN.get());

        //MISC
        dropSelf(BlockRegistration.BIRDHOUSE_UNPAINTED.get());
        dropSelf(BlockRegistration.BIRDHOUSE_RED.get());
        dropSelf(BlockRegistration.BIRDHOUSE_BLUE.get());
        dropSelf(BlockRegistration.BIRDHOUSE_PASTEL.get());

        dropSelf(BlockRegistration.KITCHEN_SCALE.get());
        dropSelf(BlockRegistration.ANTIQUE_MAP.get());
        dropSelf(BlockRegistration.ANTIQUE_MINI_TABLE.get());
        dropSelf(BlockRegistration.ANCIENT_CODEX.get());
        dropSelf(BlockRegistration.ANTIQUE_BOOK_STAND.get());
        dropSelf(BlockRegistration.ANTIQUE_LIBRARY_BOOKS.get());

        dropSelf(BlockRegistration.BRIEFCASE_BLANK.get());
        dropSelf(BlockRegistration.BRIEFCASE_ROVER.get());
        dropSelf(BlockRegistration.BUNNY_BOOK_ENDS.get());
        dropSelf(BlockRegistration.BOX_OF_PAINTS.get());

        dropSelf(BlockRegistration.CARDBOARD_BOX_OPEN.get());
        dropSelf(BlockRegistration.CARDBOARD_BOX_CLOSED.get());
        dropSelf(BlockRegistration.CARDBOARD_BOX_CLUTTERED.get());

        dropSelf(BlockRegistration.THREAD_SPOOL_YELLOW.get());
        dropSelf(BlockRegistration.THREAD_SPOOL_GREEN.get());
        dropSelf(BlockRegistration.THREAD_SPOOL_PURPLE.get());
        dropSelf(BlockRegistration.THREAD_SPOOL_PINK.get());

        dropSelf(BlockRegistration.CAT_MUGS_CLUTTERED.get());
        dropSelf(BlockRegistration.CAT_PLANT_POT_BLACK.get());
        dropSelf(BlockRegistration.CAT_PLANT_POT_ORANGE.get());
        dropSelf(BlockRegistration.COFFEE_GRINDER.get());
        dropSelf(BlockRegistration.CAULDRON_POSTER.get());

        dropSelf(BlockRegistration.FENCE_SHELF.get());
        dropSelf(BlockRegistration.HANGING_PLANT_POT_FLOWERS.get());
        dropSelf(BlockRegistration.HANGING_PLANT_POT_GRASS.get());
        dropSelf(BlockRegistration.PEDESTAL_HK.get());
        dropSelf(BlockRegistration.PICNIC_BASKET.get());
        dropSelf(BlockRegistration.PICNIC_BASKET_PREPARED.get());
        dropSelf(BlockRegistration.BASKET_OF_FLOWERS.get());
        dropSelf(BlockRegistration.BASKET_OF_PRODUCE.get());

        multiBlockDropOnlyOneItem(BlockRegistration.GUMBALL_MACHINE_RED.get());
        multiBlockDropOnlyOneItem(BlockRegistration.GUMBALL_MACHINE_BLUE.get());
        multiBlockDropOnlyOneItem(BlockRegistration.GUMBALL_MACHINE_PURPLE.get());

        multiBlockDropOnlyOneItem(BlockRegistration.MINI_CACTUS_SET.get());
        multiBlockDropOnlyOneItem(BlockRegistration.MUSHROOM_JARS.get());
        multiBlockDropOnlyOneItem(BlockRegistration.NEWSPAPER_PILE_SHORT.get());
        multiBlockDropOnlyOneItem(BlockRegistration.NEWSPAPER_PILE_TALL.get());
        multiBlockDropOnlyOneItem(BlockRegistration.PAPER_PILE.get());

        dropSelf(BlockRegistration.ROVER_STOOL.get());
        dropSelf(BlockRegistration.RUBIKS_CUBE.get());
        dropSelf(BlockRegistration.RUBIKS_CUBE_PASTEL.get());
        dropSelf(BlockRegistration.ROW_OF_SMALL_BOOKS.get());
        dropSelf(BlockRegistration.ROW_OF_SMALL_BOOKS_PASTEL.get());
        dropSelf(BlockRegistration.SCATTERED_PAPERS.get());
        dropSelf(BlockRegistration.SEWING_MACHINE_ANTIQUE.get());
        dropSelf(BlockRegistration.ROW_OF_SMALL_BOOKS_SHELVED.get());
        dropSelf(BlockRegistration.ROW_OF_SMALL_BOOKS_PASTEL_SHELVED.get());
        dropSelf(BlockRegistration.SMALL_BUSH.get());
        dropSelf(BlockRegistration.TEDDY_BEAR.get());
        dropSelf(BlockRegistration.SMALL_SHELF.get());
        dropSelf(BlockRegistration.SMALL_SHELF_PINK.get());
        dropSelf(BlockRegistration.TWO_FLOWER_POTS.get());
        dropSelf(BlockRegistration.TRADITIONAL_RADIO.get());
        dropSelf(BlockRegistration.SEWING_MANNEQUIN.get());
        dropSelf(BlockRegistration.STARS_PENDANT.get());
        dropSelf(BlockRegistration.MOON_DECORATION.get());
        dropSelf(BlockRegistration.MOON_PENDANT.get());
        dropSelf(BlockRegistration.POLAROIDS_A.get());

        dropSelf(BlockRegistration.OSSON_PENDANT_BLACK.get());
        dropSelf(BlockRegistration.OSSON_PENDANT_BROWN.get());
        dropSelf(BlockRegistration.OSSON_PENDANT_ORANGE.get());
        dropSelf(BlockRegistration.OSSON_PENDANT_RACING_GREEN.get());
        dropSelf(BlockRegistration.OSSON_PENDANT_SAGE_GREEN.get());
        dropSelf(BlockRegistration.OSSON_PENDANT_RED.get());
        dropSelf(BlockRegistration.OSSON_PENDANT_YELLOW.get());
        dropSelf(BlockRegistration.OSSON_PENDANT_WHITE.get());

        dropSelf(BlockRegistration.COTTAGE_BOOKCASE.get());
        dropSelf(BlockRegistration.COTTAGE_STANDING_LAMP.get());
        dropSelf(BlockRegistration.DRYING_HERBS.get());
        dropSelf(BlockRegistration.HANGING_CLOTH.get());

        this.add(BlockRegistration.HEART_CAKE.get(), noDrop());
        this.add(BlockRegistration.BERRY_CAKE.get(), noDrop());

        //GARLANDS
        dropSelf(BlockRegistration.BLACK_CAT_GARLAND.get());
        dropSelf(BlockRegistration.BLOSSOM_GARLAND.get());
        dropSelf(BlockRegistration.BUNNY_GARLAND.get());
        dropSelf(BlockRegistration.POLAROID_A_GARLAND.get());
        dropSelf(BlockRegistration.POLAROID_B_GARLAND.get());
        dropSelf(BlockRegistration.SUNFLOWER_GARLAND.get());


        //FLAGS
        dropSelf(BlockRegistration.MINI_FLAG_BI.get());
        dropSelf(BlockRegistration.MINI_FLAG_LESBIAN.get());
        dropSelf(BlockRegistration.MINI_FLAG_TRANS.get());
        dropSelf(BlockRegistration.MINI_FLAG_NONBINARY.get());
        dropSelf(BlockRegistration.MINI_FLAG_PAN.get());
        dropSelf(BlockRegistration.MINI_FLAG_RAINBOW.get());
        dropSelf(BlockRegistration.MINI_FLAG_ACE.get());

        dropSelf(BlockRegistration.ANIMATED_FLAG_ASEXUAL.get());
        dropSelf(BlockRegistration.ANIMATED_FLAG_BISEXUAL.get());
        dropSelf(BlockRegistration.ANIMATED_FLAG_PANSEXUAL.get());
        dropSelf(BlockRegistration.ANIMATED_FLAG_LESBIAN.get());
        dropSelf(BlockRegistration.ANIMATED_FLAG_TRANSGENDER.get());
        dropSelf(BlockRegistration.ANIMATED_FLAG_NONBINARY.get());
        dropSelf(BlockRegistration.ANIMATED_FLAG_RAINBOW.get());

        //LAMPS
        dropSelf(BlockRegistration.BEE_LAMP.get());
        dropSelf(BlockRegistration.BEE_LAMP_ANGRY.get());
        dropSelf(BlockRegistration.STAINED_GLASS_LAMP.get());
        dropSelf(BlockRegistration.CAGED_BULB.get());
        dropSelf(BlockRegistration.COLOSSEO_WALL_LANTERN.get());

        //TERRARIUMS
        dropSelf(BlockRegistration.GLOWSHROOM_TERRARIUM_YELLOW.get());
        dropSelf(BlockRegistration.GLOWSHROOM_TERRARIUM_GREEN.get());
        dropSelf(BlockRegistration.GLOWSHROOM_TERRARIUM_BLUE.get());
        dropSelf(BlockRegistration.GLOWSHROOM_TERRARIUM_PURPLE.get());
        dropSelf(BlockRegistration.GLOWSHROOM_TERRARIUM_PINK.get());
        dropSelf(BlockRegistration.MUSHROOM_TERRARIUM_RED.get());
        dropSelf(BlockRegistration.MUSHROOM_TERRARIUM_BROWN.get());

        //RECORD PLAYERS
        dropSelf(BlockRegistration.RECORD_PLAYER_YELLOW.get());
        dropSelf(BlockRegistration.RECORD_PLAYER_BLUE.get());
        dropSelf(BlockRegistration.RECORD_PLAYER_RED.get());
        dropSelf(BlockRegistration.RECORD_PLAYER_PURPLE.get());
        dropSelf(BlockRegistration.RECORD_PLAYER_PINK.get());
        dropSelf(BlockRegistration.RECORD_PLAYER_WHITE.get());
        dropSelf(BlockRegistration.RECORD_PLAYER_BROWN.get());

        //ENDTABLES
        dropSelf(BlockRegistration.COTTAGE_SIDE_TABLE.get());
        dropSelf(BlockRegistration.ENDTABLE_AMETHYST.get());
        dropSelf(BlockRegistration.ENDTABLE_BUBBLEGUM.get());
        dropSelf(BlockRegistration.ENDTABLE_CHARCOAL.get());
        dropSelf(BlockRegistration.ENDTABLE_MEADOW.get());
        dropSelf(BlockRegistration.ENDTABLE_PERIWINKLE.get());
        dropSelf(BlockRegistration.ENDTABLE_SUNSHINE.get());
        dropSelf(BlockRegistration.ENDTABLE_WOOD.get());
        dropSelf(BlockRegistration.ENDTABLE_DECOR.get());
        dropSelf(BlockRegistration.NIGHTSTAND_GREEN.get());

        //MULTIBLOCK FURNITURE
        multiBlockDropOnlyOneItem(BlockRegistration.DESK_GREEN.get());
        multiBlockDropOnlyOneItem(BlockRegistration.DESK_BROWN.get());
        multiBlockDropOnlyOneItem(BlockRegistration.DESK_GREEN_CLUTTERED.get());
        multiBlockDropOnlyOneItem(BlockRegistration.DESK_BROWN_CLUTTERED.get());
        multiBlockDropOnlyOneItem(BlockRegistration.BULLETIN_BOARD.get());
        multiBlockDropOnlyOneItem(BlockRegistration.BULLETIN_BOARD_CLUTTERED.get());
        multiBlockDropOnlyOneItem(BlockRegistration.ANTIQUE_LIBRARY_BOOKS.get());
        multiBlockDropOnlyOneItem(BlockRegistration.BAMBOO_BOOKSHELF.get());
        multiBlockDropOnlyOneItem(BlockRegistration.FWISH_BOOKCASE.get());
        multiBlockDropOnlyOneItem(BlockRegistration.RETRO_CAFE_SHELF.get());
        multiBlockDropOnlyOneItem(BlockRegistration.RETRO_CAFE_SHELF_WINDOW.get());
        multiBlockDropOnlyOneItem(BlockRegistration.CHINA_CABINET.get());
        multiBlockDropOnlyOneItem(BlockRegistration.CUPID_BENCH.get());

        multiBlockDropOnlyOneItem(BlockRegistration.TABLE_PLAIN.get());
        multiBlockDropOnlyOneItem(BlockRegistration.TABLE_TABLECLOTH.get());

        //BIKES
        multiBlockDropOnlyOneItem(BlockRegistration.BIKE_YELLOW.get());
        multiBlockDropOnlyOneItem(BlockRegistration.BIKE_YELLOW_FLOWERS.get());
        multiBlockDropOnlyOneItem(BlockRegistration.BIKE_BLUE.get());
        multiBlockDropOnlyOneItem(BlockRegistration.BIKE_BLUE_FLOWERS.get());
        multiBlockDropOnlyOneItem(BlockRegistration.BIKE_PINK.get());
        multiBlockDropOnlyOneItem(BlockRegistration.BIKE_PINK_FLOWERS.get());
        multiBlockDropOnlyOneItem(BlockRegistration.BIKE_PURPLE.get());
        multiBlockDropOnlyOneItem(BlockRegistration.BIKE_PURPLE_FLOWERS.get());

        //CHAIRS
        multiBlockDropOnlyOneItem(BlockRegistration.LOVELY_LOVE_SEAT.get());
        multiBlockDropOnlyOneItem(BlockRegistration.LOVELY_LOVE_SEAT_BLACK.get());

        //ARMCHAIRS
        multiBlockDropOnlyOneItem(BlockRegistration.ARMCHAIR_WHITE.get());
        multiBlockDropOnlyOneItem(BlockRegistration.ARMCHAIR_LIGHT_GRAY.get());
        multiBlockDropOnlyOneItem(BlockRegistration.ARMCHAIR_GRAY.get());
        multiBlockDropOnlyOneItem(BlockRegistration.ARMCHAIR_BLACK.get());
        multiBlockDropOnlyOneItem(BlockRegistration.ARMCHAIR_BROWN.get());
        multiBlockDropOnlyOneItem(BlockRegistration.ARMCHAIR_RED.get());
        multiBlockDropOnlyOneItem(BlockRegistration.ARMCHAIR_ORANGE.get());
        multiBlockDropOnlyOneItem(BlockRegistration.ARMCHAIR_YELLOW.get());
        multiBlockDropOnlyOneItem(BlockRegistration.ARMCHAIR_LIME.get());
        multiBlockDropOnlyOneItem(BlockRegistration.ARMCHAIR_GREEN.get());
        multiBlockDropOnlyOneItem(BlockRegistration.ARMCHAIR_CYAN.get());
        multiBlockDropOnlyOneItem(BlockRegistration.ARMCHAIR_LIGHT_BLUE.get());
        multiBlockDropOnlyOneItem(BlockRegistration.ARMCHAIR_BLUE.get());
        multiBlockDropOnlyOneItem(BlockRegistration.ARMCHAIR_PURPLE.get());
        multiBlockDropOnlyOneItem(BlockRegistration.ARMCHAIR_MAGENTA.get());
        multiBlockDropOnlyOneItem(BlockRegistration.ARMCHAIR_PINK.get());
        multiBlockDropOnlyOneItem(BlockRegistration.ARMCHAIR_FUCHSIA.get());
        multiBlockDropOnlyOneItem(BlockRegistration.ARMCHAIR_IVORY.get());
        multiBlockDropOnlyOneItem(BlockRegistration.ARMCHAIR_FLOWER.get());
        multiBlockDropOnlyOneItem(BlockRegistration.ARMCHAIR_STRAWBERRY.get());
        multiBlockDropOnlyOneItem(BlockRegistration.ARMCHAIR_HEART.get());
        multiBlockDropOnlyOneItem(BlockRegistration.ARMCHAIR_WATERMELON.get());
        multiBlockDropOnlyOneItem(BlockRegistration.ARMCHAIR_LEMON.get());
        multiBlockDropOnlyOneItem(BlockRegistration.ARMCHAIR_STARRY.get());
        multiBlockDropOnlyOneItem(BlockRegistration.ARMCHAIR_BLACK_CAT.get());
        multiBlockDropOnlyOneItem(BlockRegistration.COTTAGE_ARMCHAIR.get());

        //LAMPS
        dropSelf(BlockRegistration.ANTIQUE_STANDING_LAMP.get());

        //LootItemCondition.Builder lootItemConditionBuilder = LootItemBlockStatePropertyCondition
        //        .hasBlockStateProperties(BlockRegistration.DESK_GREEN.get())
        //        .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(MultiblockPlacer.MULTIBLOCK_PART, 1));

        //this.add(BlockRegistration.DESK_GREEN.get(), lootItemConditionBuilder, createCropDrops(M));
        //this.add(BlockRegistration.DESK_GREEN.get(),
        //        (block) -> LootTable.lootTable().withPool(this.applyExplosionCondition(block, LootPool.lootPool()
        //                .setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(block)
        //                        .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
        //                                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(GreenDeskBlock.MULTIBLOCK_PART, 1)))))));
    }

    private void multiBlockDropOnlyOneItem(Block blockForDrops){
        this.add(blockForDrops,
                (block) -> LootTable.lootTable().withPool(this.applyExplosionCondition(block, LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(block)
                                .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                        .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(MultiblockPlacer.MULTIBLOCK_PART, 1)))))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BlockRegistration.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
