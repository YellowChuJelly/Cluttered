package net.redchujelly.cluttered;

import net.fabricmc.api.ModInitializer;
import net.redchujelly.cluttered.util.ClutteredCustomTrades;
import net.redchujelly.cluttered.util.ClutteredLootTableModifiers;

public final class ClutteredFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Cluttered.init();

        ClutteredCustomTrades.addTrades();
        ClutteredLootTableModifiers.modifyLootTables();
        Cluttered.afterInit();

    }
}
