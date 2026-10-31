package net.redchujelly.cluttered.client;

import dev.architectury.event.events.client.ClientLifecycleEvent;

public class ClutteredClient {

    public static void init(){
        ClientLifecycleEvent.CLIENT_STARTED.register(listener -> {
            ClutteredEntityRendererRegistration.init();
            ClutteredSheetsSignMaterials.addWoodTypes();
        });
    }
}
