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
                        output.accept(BlockRegistration.POPLAR_WINDOW.get());
                        output.accept(BlockRegistration.POPLAR_BOOKSHELF.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
