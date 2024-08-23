package net.redchujelly.cluttered.setup;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.redchujelly.cluttered.Cluttered;

public class ItemRegistration {
public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Cluttered.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}