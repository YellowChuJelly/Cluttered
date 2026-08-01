package net.redchujelly.cluttered.client;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.redchujelly.cluttered.blocks.entity.BlockEntityRegistration;
import net.redchujelly.cluttered.util.FabricBlockRenderTypeMapper;

public final class ClutteredFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        FabricBlockRenderTypeMapper.setup();

        BlockEntityRenderers.register(BlockEntityRegistration.CLUTTERED_SIGN_BE.get(), SignRenderer::new);
        BlockEntityRenderers.register(BlockEntityRegistration.CLUTTERED_HANGING_SIGN_BE.get(), HangingSignRenderer::new);
    }
}
