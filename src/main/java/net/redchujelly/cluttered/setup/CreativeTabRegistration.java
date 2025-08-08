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
                        output.accept(BlockRegistration.WILLOW_VINES.get());
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
                        //output.accept(ItemRegistration.WILLOW_BOAT.get());
                        //output.accept(ItemRegistration.WILLOW_CHEST_BOAT.get());
                        output.accept(BlockRegistration.WILLOW_WINDOW.get());
                        output.accept(BlockRegistration.WILLOW_WINDOW_PANE.get());
                        output.accept(BlockRegistration.WILLOW_WAINSCOTING.get());
                        output.accept(BlockRegistration.PURPLE_PLANTER.get());


                        //FLOWERING WILLOW WOODSET
                        output.accept(BlockRegistration.FLOWERING_WILLOW_LEAVES.get());
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
                        //output.accept(ItemRegistration.FLOWERING_WILLOW_BOAT.get());
                        //output.accept(ItemRegistration.FLOWERING_WILLOW_CHEST_BOAT.get());
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
                        //output.accept(ItemRegistration.POPLAR_BOAT.get());
                        //output.accept(ItemRegistration.POPLAR_CHEST_BOAT.get());
                        output.accept(BlockRegistration.POPLAR_BOOKSHELF.get());
                        output.accept(BlockRegistration.POPLAR_WINDOW.get());
                        output.accept(BlockRegistration.POPLAR_WINDOW_PANE.get());
                        output.accept(BlockRegistration.POPLAR_WAINSCOTING.get());
                        output.accept(BlockRegistration.YELLOW_PLANTER.get());

                        //FLOWERING POPLAR WOODSET
                        output.accept(BlockRegistration.FLOWERING_POPLAR_LEAVES.get());
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
                        //output.accept(ItemRegistration.FLOWERING_POPLAR_BOAT.get());
                        //output.accept(ItemRegistration.FLOWERING_POPLAR_CHEST_BOAT.get());
                        output.accept(BlockRegistration.FLOWERING_POPLAR_BOOKSHELF.get());
                        output.accept(BlockRegistration.FLOWERING_POPLAR_WINDOW.get());
                        output.accept(BlockRegistration.FLOWERING_POPLAR_WINDOW_PANE.get());
                        output.accept(BlockRegistration.FLOWERING_POPLAR_WAINSCOTING.get());

                        //CRABAPPLE WOODSET
                        output.accept(BlockRegistration.CRABAPPLE_SAPLING.get());
                        output.accept(BlockRegistration.CRABAPPLE_LEAVES.get());
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
                        //output.accept(ItemRegistration.CRABAPPLE_BOAT.get());
                        //output.accept(ItemRegistration.CRABAPPLE_CHEST_BOAT.get());
                        output.accept(BlockRegistration.CRABAPPLE_BOOKSHELF.get());
                        output.accept(BlockRegistration.CRABAPPLE_WINDOW.get());
                        output.accept(BlockRegistration.CRABAPPLE_WINDOW_PANE.get());
                        output.accept(BlockRegistration.CRABAPPLE_WAINSCOTING.get());
                        output.accept(BlockRegistration.PINK_PLANTER.get());

                        //FLOWERING CRABAPPLE WOODSET
                        output.accept(BlockRegistration.FLOWERING_CRABAPPLE_LEAVES.get());
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
                        //output.accept(ItemRegistration.FLOWERING_CRABAPPLE_BOAT.get());
                        //output.accept(ItemRegistration.FLOWERING_CRABAPPLE_CHEST_BOAT.get());
                        output.accept(BlockRegistration.FLOWERING_CRABAPPLE_BOOKSHELF.get());
                        output.accept(BlockRegistration.FLOWERING_CRABAPPLE_WINDOW.get());
                        output.accept(BlockRegistration.FLOWERING_CRABAPPLE_WINDOW_PANE.get());
                        output.accept(BlockRegistration.FLOWERING_CRABAPPLE_WAINSCOTING.get());

                        //SYCAMORE WOODSET
                        output.accept(BlockRegistration.SYCAMORE_SAPLING.get());
                        output.accept(BlockRegistration.SYCAMORE_LEAVES.get());
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
                        //output.accept(ItemRegistration.SYCAMORE_BOAT.get());
                        //output.accept(ItemRegistration.SYCAMORE_CHEST_BOAT.get());
                        output.accept(BlockRegistration.SYCAMORE_BOOKSHELF.get());
                        output.accept(BlockRegistration.SYCAMORE_WINDOW.get());
                        output.accept(BlockRegistration.SYCAMORE_WINDOW_PANE.get());
                        output.accept(BlockRegistration.SYCAMORE_WAINSCOTING.get());
                        output.accept(BlockRegistration.GREEN_PLANTER.get());

                        //FLUORESCENT MAPLE WOODSET
                        output.accept(BlockRegistration.MAPLE_SAPLING.get());
                        output.accept(BlockRegistration.MAPLE_LEAVES.get());
                        output.accept(BlockRegistration.MAPLE_LEAVES_FLOWERING.get());
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
                        //output.accept(ItemRegistration.MAPLE_BOAT.get());
                        //output.accept(ItemRegistration.MAPLE_CHEST_BOAT.get());
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
                        //output.accept(ItemRegistration.BLUE_MUSHROOM_BOAT.get());
                        //output.accept(ItemRegistration.BLUE_MUSHROOM_CHEST_BOAT.get());
                        output.accept(BlockRegistration.BLUE_MUSHROOM_BOOKSHELF.get());
                        output.accept(BlockRegistration.BLUE_MUSHROOM_WINDOW.get());
                        output.accept(BlockRegistration.BLUE_MUSHROOM_WINDOW_PANE.get());
                        output.accept(BlockRegistration.BLUE_MUSHROOM_WAINSCOTING.get());
                        output.accept(BlockRegistration.BLUE_PLANTER.get());

                        //RED MUSHROOM WOODSET
                        output.accept(BlockRegistration.RED_MUSHROOM_SAPLING.get());
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
                        //output.accept(ItemRegistration.RED_MUSHROOM_BOAT.get());
                        //output.accept(ItemRegistration.RED_MUSHROOM_CHEST_BOAT.get());
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
                        output.accept(BlockRegistration.CHALCEDONY_BALUSTRADE.get());
                        output.accept(BlockRegistration.CHALCEDONY_PICKET_FENCE.get());
                        output.accept(BlockRegistration.CHALCEDONY_PICKET_FENCE_GATE.get());

                        output.accept(BlockRegistration.CHALCEDONY_BRACKET_VICTORIAN.get());
                        output.accept(BlockRegistration.CHALCEDONY_BRACKET_SCROLL.get());
                        output.accept(BlockRegistration.CHALCEDONY_BRACKET_BOW.get());
                        output.accept(BlockRegistration.CHALCEDONY_BRACKET_BOW_SCROLL.get());
                        output.accept(BlockRegistration.CHALCEDONY_BRACKET_STAR.get());
                        output.accept(BlockRegistration.CHALCEDONY_BRACKET_STAR_SCROLL.get());
                        output.accept(BlockRegistration.CHALCEDONY_BRACKET_SCROLL_SHELF.get());

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
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_BALUSTRADE.get());
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_PICKET_FENCE.get());
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_PICKET_FENCE_GATE.get());

                        output.accept(BlockRegistration.DEEP_CHALCEDONY_BRACKET_VICTORIAN.get());
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_BRACKET_SCROLL.get());
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_BRACKET_BOW.get());
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_BRACKET_BOW_SCROLL.get());
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_BRACKET_STAR.get());
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_BRACKET_STAR_SCROLL.get());
                        output.accept(BlockRegistration.DEEP_CHALCEDONY_BRACKET_SCROLL_SHELF.get());

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
                        output.accept(BlockRegistration.MARBLE_BALUSTRADE.get());
                        output.accept(BlockRegistration.MARBLE_PICKET_FENCE.get());
                        output.accept(BlockRegistration.MARBLE_PICKET_FENCE_GATE.get());

                        output.accept(BlockRegistration.VICTORIAN_STREETLIGHT_CROWN_MARBLE.get());
                        output.accept(BlockRegistration.VICTORIAN_STREETLIGHT_2.get());

                        output.accept(BlockRegistration.MARBLE_BRACKET_VICTORIAN.get());
                        output.accept(BlockRegistration.MARBLE_BRACKET_SCROLL.get());
                        output.accept(BlockRegistration.MARBLE_BRACKET_BOW.get());
                        output.accept(BlockRegistration.MARBLE_BRACKET_BOW_SCROLL.get());
                        output.accept(BlockRegistration.MARBLE_BRACKET_STAR.get());
                        output.accept(BlockRegistration.MARBLE_BRACKET_STAR_SCROLL.get());
                        output.accept(BlockRegistration.MARBLE_BRACKET_SCROLL_SHELF.get());

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
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_APPLE_BOTTOM_BROWN.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_APPLE_TOP_BROWN.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_APPLE_BOTTOM_WHITE.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_APPLE_TOP_WHITE.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_APPLE_BOTTOM_COLOR.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_APPLE_TOP_COLOR.get());

                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_BOTTOM_BROWN.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_TOP_BROWN.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_BOTTOM_WHITE.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_TOP_WHITE.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_BOTTOM_COLOR.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_TOP_COLOR.get());

                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_BOTTOM_BROWN.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_TOP_BROWN.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_BOTTOM_WHITE.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_TOP_WHITE.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_BOTTOM_COLOR.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_TOP_COLOR.get());

                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BONES.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BONES_BOTTOM_BROWN.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BONES_TOP_BROWN.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BONES_BOTTOM_WHITE.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BONES_TOP_WHITE.get());

                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_BOTTOM_BROWN.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_TOP_BROWN.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_BOTTOM_WHITE.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_TOP_WHITE.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_BOTTOM_COLOR.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_TOP_COLOR.get());

                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_BOTTOM_BROWN.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_TOP_BROWN.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_BOTTOM_WHITE.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_TOP_WHITE.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_BOTTOM_COLOR.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_TOP_COLOR.get());

                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_BOTTOM_BROWN.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_TOP_BROWN.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_BOTTOM_WHITE.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_TOP_WHITE.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_BOTTOM_COLOR.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_TOP_COLOR.get());

                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_LEMON.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_LEMON_BOTTOM_BROWN.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_LEMON_TOP_BROWN.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_LEMON_BOTTOM_WHITE.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_LEMON_TOP_WHITE.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_LEMON_BOTTOM_COLOR.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_LEMON_TOP_COLOR.get());

                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_ORANGE.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_BOTTOM_BROWN.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_TOP_BROWN.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_BOTTOM_WHITE.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_TOP_WHITE.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_BOTTOM_COLOR.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_TOP_COLOR.get());

                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PEAR.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PEAR_BOTTOM_BROWN.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PEAR_TOP_BROWN.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PEAR_BOTTOM_WHITE.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PEAR_TOP_WHITE.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PEAR_BOTTOM_COLOR.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PEAR_TOP_COLOR.get());

                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PLUM.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PLUM_BOTTOM_BROWN.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PLUM_TOP_BROWN.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PLUM_BOTTOM_WHITE.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PLUM_TOP_WHITE.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PLUM_BOTTOM_COLOR.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PLUM_TOP_COLOR.get());

                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_BOTTOM_BROWN.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_TOP_BROWN.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_BOTTOM_WHITE.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_TOP_WHITE.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_BOTTOM_COLOR.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_TOP_COLOR.get());

                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_BOTTOM_BROWN.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_TOP_BROWN.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_BOTTOM_WHITE.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_TOP_WHITE.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_BOTTOM_COLOR.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_TOP_COLOR.get());

                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_BOTTOM_BROWN.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_TOP_BROWN.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_BOTTOM_WHITE.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_TOP_WHITE.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_BOTTOM_COLOR.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_TOP_COLOR.get());

                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR_BOTTOM_BROWN.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR_TOP_BROWN.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR_BOTTOM_WHITE.get());
                        output.accept(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR_TOP_WHITE.get());


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
                        output.accept(BlockRegistration.GHOST_WALLPAPER_TOP.get());
                        output.accept(BlockRegistration.GHOST_WALLPAPER_BOTTOM.get());

                        output.accept(BlockRegistration.HALLOWEEN_WAINSCOTING.get());
                        output.accept(BlockRegistration.HALLOWEEN_WALLPAPER.get());
                        output.accept(BlockRegistration.HALLOWEEN_WALLPAPER_TOP.get());
                        output.accept(BlockRegistration.HALLOWEEN_WALLPAPER_BOTTOM.get());

                        output.accept(BlockRegistration.CONFECTIONARY_WALLPAPER.get());
                        output.accept(BlockRegistration.CONFECTIONARY_WALLPAPER_TOP.get());
                        output.accept(BlockRegistration.CONFECTIONARY_WALLPAPER_BOTTOM.get());
                        output.accept(BlockRegistration.BLUE_WAINSCOTING.get());

                        output.accept(BlockRegistration.MINT_WALLPAPER.get());
                        output.accept(BlockRegistration.MINT_WALLPAPER_TOP.get());
                        output.accept(BlockRegistration.MINT_WALLPAPER_BOTTOM.get());
                        output.accept(BlockRegistration.BROWN_WAINSCOTING.get());

                        output.accept(BlockRegistration.CHECKERED_PINK_WALLPAPER.get());
                        output.accept(BlockRegistration.CHECKERED_PINK_STRAWBERRY_WALLPAPER.get());
                        output.accept(BlockRegistration.CHECKERED_GREEN_WALLPAPER.get());
                        output.accept(BlockRegistration.CHECKERED_GREEN_STRAWBERRY_WALLPAPER.get());

                        output.accept(BlockRegistration.RETRO_RAINBOW_WALLPAPER.get());

                        output.accept(BlockRegistration.FLORAL_BERRY_WALLPAPER.get());
                        output.accept(BlockRegistration.FLORAL_BERRY_WALLPAPER_TOP.get());
                        output.accept(BlockRegistration.FLORAL_BERRY_WALLPAPER_BOTTOM.get());

                        output.accept(BlockRegistration.STRIPED_FLORAL_WALLPAPER.get());
                        output.accept(BlockRegistration.STRIPED_FLORAL_WALLPAPER_TOP.get());
                        output.accept(BlockRegistration.STRIPED_FLORAL_WALLPAPER_BOTTOM.get());

                        output.accept(BlockRegistration.FLORAL_BORDER_WALLPAPER.get());

                        output.accept(BlockRegistration.MARIGOLD_WALLPAPER.get());
                        output.accept(BlockRegistration.MARIGOLD_WALLPAPER_TOP.get());
                        output.accept(BlockRegistration.MARIGOLD_WALLPAPER_BOTTOM.get());

                        output.accept(BlockRegistration.CHECKERED_FRUIT_WALLPAPER.get());
                        output.accept(BlockRegistration.APPLE_WALLPAPER.get());
                        output.accept(BlockRegistration.FISH_WALLPAPER.get());

                        output.accept(BlockRegistration.BLUE_ROSE_STRIPED_WALLPAPER.get());
                        output.accept(BlockRegistration.BLUE_ROSE_STRIPED_WALLPAPER_TOP.get());
                        output.accept(BlockRegistration.BLUE_ROSE_STRIPED_WALLPAPER_BOTTOM.get());

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

                        output.accept(BlockRegistration.WOODEN_PICKET_FENCE.get());
                        output.accept(BlockRegistration.WOODEN_PICKET_FENCE_GATE.get());

                        output.accept(BlockRegistration.WOODEN_BRACKET_VICTORIAN.get());
                        output.accept(BlockRegistration.WOODEN_BRACKET_SCROLL.get());
                        output.accept(BlockRegistration.WOODEN_BRACKET_BOW.get());
                        output.accept(BlockRegistration.WOODEN_BRACKET_BOW_SCROLL.get());
                        output.accept(BlockRegistration.WOODEN_BRACKET_STAR.get());
                        output.accept(BlockRegistration.WOODEN_BRACKET_STAR_SCROLL.get());
                        output.accept(BlockRegistration.WOODEN_BRACKET_SCROLL_SHELF.get());

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
                        output.accept(BlockRegistration.VARYING_BRICKS.get());
                        output.accept(BlockRegistration.VARYING_BRICKS_BORDER.get());
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
                        output.accept(BlockRegistration.BIRDHOUSE_PASTEL.get());

                        output.accept(BlockRegistration.BRIEFCASE_BLANK.get());
                        output.accept(BlockRegistration.BRIEFCASE_ROVER.get());
                        output.accept(BlockRegistration.BUNNY_BOOK_ENDS.get());
                        output.accept(BlockRegistration.BOX_OF_PAINTS.get());
                        output.accept(BlockRegistration.BUTTON_STOOL.get());

                        output.accept(BlockRegistration.CARDBOARD_BOX.get());

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

                        output.accept(BlockRegistration.MINI_FLAG_RAINBOW.get());
                        output.accept(BlockRegistration.MINI_FLAG_LESBIAN.get());
                        output.accept(BlockRegistration.MINI_FLAG_BI.get());
                        output.accept(BlockRegistration.MINI_FLAG_PAN.get());
                        output.accept(BlockRegistration.MINI_FLAG_ACE.get());
                        output.accept(BlockRegistration.MINI_FLAG_TRANS.get());
                        output.accept(BlockRegistration.MINI_FLAG_NONBINARY.get());

                        output.accept(BlockRegistration.ANIMATED_FLAG_RAINBOW.get());
                        output.accept(BlockRegistration.ANIMATED_FLAG_LESBIAN.get());
                        output.accept(BlockRegistration.ANIMATED_FLAG_BISEXUAL.get());
                        output.accept(BlockRegistration.ANIMATED_FLAG_PANSEXUAL.get());
                        output.accept(BlockRegistration.ANIMATED_FLAG_ASEXUAL.get());
                        output.accept(BlockRegistration.ANIMATED_FLAG_TRANSGENDER.get());
                        output.accept(BlockRegistration.ANIMATED_FLAG_NONBINARY.get());

                        output.accept(BlockRegistration.BAMBOO_BOOKSHELF.get());
                        output.accept(BlockRegistration.FWISH_BOOKCASE.get());
                        output.accept(BlockRegistration.RETRO_CAFE_SHELF.get());
                        output.accept(BlockRegistration.RETRO_CAFE_SHELF_WINDOW.get());
                        output.accept(BlockRegistration.POTION_SHELF.get());
                        output.accept(BlockRegistration.CHINA_CABINET.get());
                        output.accept(BlockRegistration.CUPID_BENCH.get());

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
                        output.accept(BlockRegistration.WATERING_CAN.get());
                        output.accept(BlockRegistration.WATERING_CAN_COPPER.get());

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
                        output.accept(BlockRegistration.ARMCHAIR_FUCHSIA.get());
                        output.accept(BlockRegistration.ARMCHAIR_IVORY.get());
                        output.accept(BlockRegistration.ARMCHAIR_FLOWER.get());
                        output.accept(BlockRegistration.ARMCHAIR_STRAWBERRY.get());
                        output.accept(BlockRegistration.ARMCHAIR_HEART.get());
                        output.accept(BlockRegistration.ARMCHAIR_WATERMELON.get());
                        output.accept(BlockRegistration.ARMCHAIR_LEMON.get());
                        output.accept(BlockRegistration.ARMCHAIR_STARRY.get());
                        output.accept(BlockRegistration.ARMCHAIR_BLACK_CAT.get());
                        output.accept(BlockRegistration.COTTAGE_ARMCHAIR.get());

                        output.accept(BlockRegistration.DARKWOOD_CHAIR_GEOMETRIC.get());
                        output.accept(BlockRegistration.DARKWOOD_CHAIR_QUILTED.get());
                        output.accept(BlockRegistration.DARKWOOD_CHAIR_SOUTHERN_FLAIR.get());
                        output.accept(BlockRegistration.DARKWOOD_SOFA_GEOMETRIC.get());
                        output.accept(BlockRegistration.DARKWOOD_SOFA_QUILTED.get());
                        output.accept(BlockRegistration.DARKWOOD_SOFA_SOUTHERN_FLAIR.get());
                        output.accept(BlockRegistration.DARKWOOD_DECORATIVE_SHELVES_GEOMETRIC.get());
                        output.accept(BlockRegistration.DARKWOOD_DECORATIVE_SHELVES_QUILTED.get());
                        output.accept(BlockRegistration.DARKWOOD_DECORATIVE_SHELVES_SOUTHERN_FLAIR.get());
                        output.accept(BlockRegistration.DARKWOOD_ENDTABLE.get());
                        output.accept(BlockRegistration.DARKWOOD_TABLE.get());
                        output.accept(BlockRegistration.DARKWOOD_STOOL.get());
                        output.accept(BlockRegistration.DARKWOOD_CABINET.get());
                        output.accept(BlockRegistration.DARKWOOD_CLOCK.get());
                        output.accept(BlockRegistration.DARKWOOD_BED_GEOMETRIC.get());
                        output.accept(BlockRegistration.DARKWOOD_BED_QUILTED.get());
                        output.accept(BlockRegistration.DARKWOOD_BED_SOUTHERN_FLAIR.get());

                        output.accept(BlockRegistration.TABLE_PLAIN.get());
                        output.accept(BlockRegistration.TABLE_TABLECLOTH.get());

                        output.accept(BlockRegistration.DORADO_CABINET.get());
                        output.accept(BlockRegistration.DORADO_CABINET_CLUTTERED.get());
                        output.accept(BlockRegistration.HAVANA_CABINET.get());
                        output.accept(BlockRegistration.HAVANA_CABINET_CLUTTERED.get());
                        output.accept(BlockRegistration.MUREX_CABINET.get());
                        output.accept(BlockRegistration.MUREX_CABINET_CLUTTERED.get());

                        output.accept(BlockRegistration.KITCHEN_SET_BROWN_COUNTER.get());
                        output.accept(BlockRegistration.KITCHEN_SET_BROWN_COUNTER_INNER_CORNER.get());
                        output.accept(BlockRegistration.KITCHEN_SET_BROWN_COUNTER_OUTER_CORNER_RIGHT.get());
                        output.accept(BlockRegistration.KITCHEN_SET_BROWN_COUNTER_OUTER_CORNER_LEFT.get());
                        output.accept(BlockRegistration.KITCHEN_SET_BROWN_COUNTER_SINK.get());
                        output.accept(BlockRegistration.KITCHEN_SET_BROWN_CABINET.get());
                        output.accept(BlockRegistration.KITCHEN_SET_BROWN_CABINET_MINI.get());
                        output.accept(BlockRegistration.KITCHEN_SET_BROWN_CABINET_GLASS.get());
                        output.accept(BlockRegistration.KITCHEN_SET_BROWN_CABINET_OPEN.get());
                        output.accept(BlockRegistration.KITCHEN_SET_BROWN_CABINET_INNER_CORNER.get());
                        output.accept(BlockRegistration.KITCHEN_SET_BROWN_CABINET_OUTER_CORNER.get());

                        output.accept(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER.get());
                        output.accept(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_INNER_CORNER.get());
                        output.accept(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_OUTER_CORNER_RIGHT.get());
                        output.accept(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_OUTER_CORNER_LEFT.get());
                        output.accept(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_SINK.get());
                        output.accept(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET.get());
                        output.accept(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_MINI.get());
                        output.accept(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_GLASS.get());
                        output.accept(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_OPEN.get());
                        output.accept(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_INNER_CORNER.get());
                        output.accept(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_OUTER_CORNER.get());

                        output.accept(BlockRegistration.KITCHEN_SET_PINK_COUNTER.get());
                        output.accept(BlockRegistration.KITCHEN_SET_PINK_COUNTER_INNER_CORNER.get());
                        output.accept(BlockRegistration.KITCHEN_SET_PINK_COUNTER_OUTER_CORNER_RIGHT.get());
                        output.accept(BlockRegistration.KITCHEN_SET_PINK_COUNTER_OUTER_CORNER_LEFT.get());
                        output.accept(BlockRegistration.KITCHEN_SET_PINK_COUNTER_SINK.get());
                        output.accept(BlockRegistration.KITCHEN_SET_PINK_CABINET.get());
                        output.accept(BlockRegistration.KITCHEN_SET_PINK_CABINET_MINI.get());
                        output.accept(BlockRegistration.KITCHEN_SET_PINK_CABINET_GLASS.get());
                        output.accept(BlockRegistration.KITCHEN_SET_PINK_CABINET_OPEN.get());
                        output.accept(BlockRegistration.KITCHEN_SET_PINK_CABINET_INNER_CORNER.get());
                        output.accept(BlockRegistration.KITCHEN_SET_PINK_CABINET_OUTER_CORNER.get());

                        output.accept(BlockRegistration.KITCHEN_SET_PURPLE_COUNTER.get());
                        output.accept(BlockRegistration.KITCHEN_SET_PURPLE_COUNTER_INNER_CORNER.get());
                        output.accept(BlockRegistration.KITCHEN_SET_PURPLE_COUNTER_OUTER_CORNER_RIGHT.get());
                        output.accept(BlockRegistration.KITCHEN_SET_PURPLE_COUNTER_OUTER_CORNER_LEFT.get());
                        output.accept(BlockRegistration.KITCHEN_SET_PURPLE_COUNTER_SINK.get());
                        output.accept(BlockRegistration.KITCHEN_SET_PURPLE_CABINET.get());
                        output.accept(BlockRegistration.KITCHEN_SET_PURPLE_CABINET_MINI.get());
                        output.accept(BlockRegistration.KITCHEN_SET_PURPLE_CABINET_GLASS.get());
                        output.accept(BlockRegistration.KITCHEN_SET_PURPLE_CABINET_OPEN.get());
                        output.accept(BlockRegistration.KITCHEN_SET_PURPLE_CABINET_INNER_CORNER.get());
                        output.accept(BlockRegistration.KITCHEN_SET_PURPLE_CABINET_OUTER_CORNER.get());

                        output.accept(BlockRegistration.KITCHEN_SET_WHITE_COUNTER.get());
                        output.accept(BlockRegistration.KITCHEN_SET_WHITE_COUNTER_INNER_CORNER.get());
                        output.accept(BlockRegistration.KITCHEN_SET_WHITE_COUNTER_OUTER_CORNER_RIGHT.get());
                        output.accept(BlockRegistration.KITCHEN_SET_WHITE_COUNTER_OUTER_CORNER_LEFT.get());
                        output.accept(BlockRegistration.KITCHEN_SET_WHITE_COUNTER_SINK.get());
                        output.accept(BlockRegistration.KITCHEN_SET_WHITE_CABINET.get());
                        output.accept(BlockRegistration.KITCHEN_SET_WHITE_CABINET_MINI.get());
                        output.accept(BlockRegistration.KITCHEN_SET_WHITE_CABINET_GLASS.get());
                        output.accept(BlockRegistration.KITCHEN_SET_WHITE_CABINET_OPEN.get());
                        output.accept(BlockRegistration.KITCHEN_SET_WHITE_CABINET_INNER_CORNER.get());
                        output.accept(BlockRegistration.KITCHEN_SET_WHITE_CABINET_OUTER_CORNER.get());

                        output.accept(BlockRegistration.KITCHEN_SET_YELLOW_COUNTER.get());
                        output.accept(BlockRegistration.KITCHEN_SET_YELLOW_COUNTER_INNER_CORNER.get());
                        output.accept(BlockRegistration.KITCHEN_SET_YELLOW_COUNTER_OUTER_CORNER_RIGHT.get());
                        output.accept(BlockRegistration.KITCHEN_SET_YELLOW_COUNTER_OUTER_CORNER_LEFT.get());
                        output.accept(BlockRegistration.KITCHEN_SET_YELLOW_COUNTER_SINK.get());
                        output.accept(BlockRegistration.KITCHEN_SET_YELLOW_CABINET.get());
                        output.accept(BlockRegistration.KITCHEN_SET_YELLOW_CABINET_MINI.get());
                        output.accept(BlockRegistration.KITCHEN_SET_YELLOW_CABINET_GLASS.get());
                        output.accept(BlockRegistration.KITCHEN_SET_YELLOW_CABINET_OPEN.get());
                        output.accept(BlockRegistration.KITCHEN_SET_YELLOW_CABINET_INNER_CORNER.get());
                        output.accept(BlockRegistration.KITCHEN_SET_YELLOW_CABINET_OUTER_CORNER.get());

                        output.accept(BlockRegistration.BLACK_CAT_COUNTER_DRAWERS.get());
                        output.accept(BlockRegistration.BLACK_CAT_COUNTER_LEFT_DOOR.get());
                        output.accept(BlockRegistration.BLACK_CAT_COUNTER_RIGHT_DOOR.get());
                        output.accept(BlockRegistration.BLACK_CAT_SINK.get());
                        output.accept(BlockRegistration.BLACK_CAT_TABLE.get());
                        output.accept(BlockRegistration.SWEETHEART_COUNTER_DRAWERS.get());
                        output.accept(BlockRegistration.SWEETHEART_COUNTER_LEFT_DOOR.get());
                        output.accept(BlockRegistration.SWEETHEART_COUNTER_RIGHT_DOOR.get());
                        output.accept(BlockRegistration.SWEETHEART_SINK.get());
                        output.accept(BlockRegistration.SWEETHEART_TABLE.get());
                        output.accept(BlockRegistration.SWEETHEART_BAKING_SET_BOWL.get());
                        output.accept(BlockRegistration.SWEETHEART_BAKING_SET_INGREDIENTS.get());
                        output.accept(BlockRegistration.CONFECTIONERY_TABLE_BLUE.get());
                        output.accept(BlockRegistration.CONFECTIONERY_TABLE_PINK.get());

                        output.accept(BlockRegistration.JAM_JARS.get());

                        output.accept(BlockRegistration.BOOK_OPEN.get());
                        output.accept(BlockRegistration.BRASS_KEY.get());
                        output.accept(BlockRegistration.CARD_INDEX.get());
                        output.accept(BlockRegistration.CHINA_CABINET.get());
                        output.accept(BlockRegistration.CUPID_BENCH.get());
                        output.accept(BlockRegistration.ENVELOPE_STACK.get());
                        output.accept(BlockRegistration.FLOWER_DESK_LAMP.get());
                        output.accept(BlockRegistration.FLOWER_SHELF_BLUE.get());
                        output.accept(BlockRegistration.FLOWER_SHELF_GREEN.get());
                        output.accept(BlockRegistration.FLOWER_SHELF_PASTEL_YELLOW.get());
                        output.accept(BlockRegistration.FLOWER_SHELF_PINK.get());
                        output.accept(BlockRegistration.FLOWER_SHELF_PURPLE.get());
                        output.accept(BlockRegistration.FLOWER_SHELF_YELLOW.get());
                        output.accept(BlockRegistration.FLOWER_SHELF_CANDLE_BLUE.get());
                        output.accept(BlockRegistration.FLOWER_SHELF_CANDLE_GREEN.get());
                        output.accept(BlockRegistration.FLOWER_SHELF_CANDLE_PASTEL_YELLOW.get());
                        output.accept(BlockRegistration.FLOWER_SHELF_CANDLE_PINK.get());
                        output.accept(BlockRegistration.FLOWER_SHELF_CANDLE_PURPLE.get());
                        output.accept(BlockRegistration.FLOWER_SHELF_CANDLE_YELLOW.get());
                        output.accept(BlockRegistration.FLOWER_SHELF_PLANT.get());
                        output.accept(BlockRegistration.FLOWER_TEA_KETTLE.get());
                        output.accept(BlockRegistration.FWISH_ARMCHAIR.get());
                        output.accept(BlockRegistration.FWISH_OTTOMAN.get());
                        output.accept(BlockRegistration.GENERAL_STORE_CABINET.get());
                        output.accept(BlockRegistration.HEAVENLY_ORNAMENTAL_ARRAY.get());
                        output.accept(BlockRegistration.PLANT_LADDER.get());
                        output.accept(BlockRegistration.POLAROID_CAMERA.get());
                        output.accept(BlockRegistration.POLAROIDS_B.get());
                        output.accept(BlockRegistration.POLAROIDS_C.get());
                        output.accept(BlockRegistration.PUZZLE_PIECE_TABLE_BLUE.get());
                        output.accept(BlockRegistration.PUZZLE_PIECE_TABLE_GREEN.get());
                        output.accept(BlockRegistration.PUZZLE_PIECE_TABLE_RED.get());
                        output.accept(BlockRegistration.PUZZLE_PIECE_TABLE_YELLOW.get());
                        output.accept(BlockRegistration.PUZZLE_PIECE_TABLE_PASTEL_BLUE.get());
                        output.accept(BlockRegistration.PUZZLE_PIECE_TABLE_PASTEL_PINK.get());
                        output.accept(BlockRegistration.PUZZLE_PIECE_TABLE_PASTEL_PURPLE.get());
                        output.accept(BlockRegistration.PUZZLE_PIECE_TABLE_PASTEL_YELLOW.get());
                        output.accept(BlockRegistration.RETRO_FRIDGE_BLACK.get());
                        output.accept(BlockRegistration.RETRO_FRIDGE_BLUE.get());
                        output.accept(BlockRegistration.RETRO_FRIDGE_PINK.get());
                        output.accept(BlockRegistration.RETRO_FRIDGE_PURPLE.get());
                        output.accept(BlockRegistration.RETRO_FRIDGE_RED.get());
                        output.accept(BlockRegistration.RETRO_FRIDGE_TURQUOISE.get());
                        output.accept(BlockRegistration.RETRO_FRIDGE_WHITE.get());
                        output.accept(BlockRegistration.RETRO_FRIDGE_YELLOW.get());
                        output.accept(BlockRegistration.RETRO_TOASTER_BLACK.get());
                        output.accept(BlockRegistration.RETRO_TOASTER_BLUE.get());
                        output.accept(BlockRegistration.RETRO_TOASTER_PINK.get());
                        output.accept(BlockRegistration.RETRO_TOASTER_PURPLE.get());
                        output.accept(BlockRegistration.RETRO_TOASTER_RED.get());
                        output.accept(BlockRegistration.RETRO_TOASTER_TURQUOISE.get());
                        output.accept(BlockRegistration.RETRO_TOASTER_WHITE.get());
                        output.accept(BlockRegistration.RETRO_TOASTER_YELLOW.get());
                        output.accept(BlockRegistration.SALT_PEPPER_SHAKERS.get());
                        output.accept(BlockRegistration.SAND_SEAL_PLUSH_BLUE.get());
                        output.accept(BlockRegistration.SAND_SEAL_PLUSH_GREEN.get());
                        output.accept(BlockRegistration.SAND_SEAL_PLUSH_RED.get());
                        output.accept(BlockRegistration.SKETCHBOOK_SINGLE.get());
                        output.accept(BlockRegistration.STACK_OF_BOOKS.get());
                        output.accept(BlockRegistration.STACK_OF_BOOKS_TALL.get());
                        output.accept(BlockRegistration.STEAMPUNK_GLOBE.get());
                        output.accept(BlockRegistration.WINE_BOTTLE_RACK.get());
                        output.accept(BlockRegistration.WINE_BOTTLES.get());
                        output.accept(BlockRegistration.YELLOW_NOTEPAD.get());
                        output.accept(BlockRegistration.FABRIC_BOLTS.get());
                        output.accept(BlockRegistration.SCISSORS_AND_THREAD.get());
                        output.accept(BlockRegistration.SLICED_BREAD.get());
                        output.accept(BlockRegistration.ROSE_END_TABLE.get());
                        output.accept(BlockRegistration.ROSE_END_TABLE_BLACK.get());
                        output.accept(BlockRegistration.VIAL_STAND.get());
                        output.accept(BlockRegistration.PINEAPPLE.get());
                        output.accept(BlockRegistration.HONEYCOMB_LAMP.get());
                        output.accept(BlockRegistration.UNLIVING_CHAIR.get());
                        output.accept(BlockRegistration.SAFE_NOVAKID.get());
                        output.accept(BlockRegistration.HOPPIN_PARK_LANTERN.get());
                        output.accept(BlockRegistration.SEA_GEM_LANTERN.get());
                        output.accept(BlockRegistration.SEA_GEM_LANTERN_CEILING.get());
                        output.accept(BlockRegistration.VIOLET_SCREEN.get());
                        output.accept(BlockRegistration.HANGING_SHELVES_POTTERY.get());
                        output.accept(BlockRegistration.HANGING_SHELVES_PLANTS.get());
                        output.accept(BlockRegistration.POK_TA_POK_HOOP.get());
                        output.accept(BlockRegistration.POK_TA_POK_HOOP_SNAKES.get());

                    })
                    .build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
