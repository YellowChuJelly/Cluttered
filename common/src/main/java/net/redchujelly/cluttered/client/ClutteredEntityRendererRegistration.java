package net.redchujelly.cluttered.client;

import dev.architectury.registry.client.level.entity.EntityRendererRegistry;
import net.redchujelly.cluttered.entity.EntityTypeRegistration;

public class ClutteredEntityRendererRegistration {

    public static void init() {
        EntityRendererRegistry.register(EntityTypeRegistration.CHAIR_ENTITY, ChairEntityRenderer::new);
    }
}
