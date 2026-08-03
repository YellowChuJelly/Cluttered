package net.redchujelly.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.redchujelly.cluttered.Cluttered;
import net.redchujelly.cluttered.util.ClutteredFlammableBlocks;

@Mod(Cluttered.MOD_ID)
public final class ClutteredForge {
    public ClutteredForge() {
        IEventBus modEventBus =FMLJavaModLoadingContext.get().getModEventBus();

        EventBuses.registerModEventBus(Cluttered.MOD_ID, modEventBus);
        Cluttered.init();

        modEventBus.addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event){
        event.enqueueWork(() -> {
            Cluttered.afterInit();
            ClutteredFlammableBlocks.addFlammables();
        });
    }
}
