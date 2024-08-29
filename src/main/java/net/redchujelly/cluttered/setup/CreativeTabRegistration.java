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

    public static final RegistryObject<CreativeModeTab> CLUTTERED_TAB = CREATIVE_MODE_TABS.register("cluttered_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(BlockRegistration.WILLOW_BOOKSHELF_BLACK_CAT.get()))
                    .title(Component.translatable("creativetab.cluttered_tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        //WILLOW WOODSET
                        output.accept(ItemRegistration.HAND_DRILL.get());

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

                        //POPLAR WOODSET
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

                        //BLUE MUSHROOM WOODSET
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
                        
                        //MISC FULL BLOCKS
                        output.accept(BlockRegistration.BLACK_CAT_WINDOW.get());
                        output.accept(BlockRegistration.BLACK_CAT_WINDOW_PANE.get());

                        //PLANTER BOXES
                        output.accept(BlockRegistration.YELLOW_PLANTER.get());

                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
