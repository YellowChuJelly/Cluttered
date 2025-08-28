package net.redchujelly.event;

import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.redchujelly.cluttered.Cluttered;
import net.redchujelly.cluttered.setup.TileEntityRegistration;

@Mod.EventBusSubscriber(modid = Cluttered.MODID, bus = Mod.EventBusSubscriber.Bus.MOD,value = Dist.CLIENT)
public class ModEventBusClientEvents {

    @SubscribeEvent
    public static void registerBER(EntityRenderersEvent.RegisterRenderers event){
        event.registerBlockEntityRenderer(TileEntityRegistration.CLUTTERED_SIGN_BE.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(TileEntityRegistration.CLUTTERED_HANGING_SIGN_BE.get(), HangingSignRenderer::new);
    }
}
