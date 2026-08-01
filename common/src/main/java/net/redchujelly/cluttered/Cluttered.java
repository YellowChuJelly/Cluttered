package net.redchujelly.cluttered;

import dev.architectury.event.events.client.ClientLifecycleEvent;
import net.redchujelly.cluttered.blocks.BlockRegistration;
import net.redchujelly.cluttered.blocks.entity.BlockEntityRegistration;
import net.redchujelly.cluttered.client.ClutteredEntityRendererRegistration;
import net.redchujelly.cluttered.client.ClutteredSheetsSignMaterials;
import net.redchujelly.cluttered.creativeTabs.CreativeTabRegistration;
import net.redchujelly.cluttered.entity.EntityTypeRegistration;
import net.redchujelly.cluttered.items.ItemRegistration;
import net.redchujelly.cluttered.paintings.PaintingRegistration;
import net.redchujelly.cluttered.sounds.SoundEventRegistration;
import net.redchujelly.cluttered.util.ClutteredCompostables;
import net.redchujelly.cluttered.util.ClutteredFlammableBlocks;
import net.redchujelly.cluttered.util.ClutteredFuelItems;
import net.redchujelly.cluttered.util.ClutteredWoodConversions;
import net.redchujelly.cluttered.world.ClutteredConfiguredFeatures;
import net.redchujelly.cluttered.world.tree.decorator.TreeDecoratorTypeRegistration;
import net.redchujelly.cluttered.world.tree.foliageplacer.FoliagePlacerTypeRegistration;
import net.redchujelly.cluttered.world.tree.trunkplacer.TrunkPlacerTypeRegistration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Cluttered {
    public static final String MOD_ID = "cluttered";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void init() {
        LOGGER.info("initializing Cluttered");

        BlockRegistration.init();
        ItemRegistration.init();
        CreativeTabRegistration.init();
        EntityTypeRegistration.init();
        BlockEntityRegistration.init();
        PaintingRegistration.init();
        TrunkPlacerTypeRegistration.init();
        FoliagePlacerTypeRegistration.init();
        TreeDecoratorTypeRegistration.init();
        ClutteredConfiguredFeatures.init();
        SoundEventRegistration.init();

        ClientLifecycleEvent.CLIENT_STARTED.register(listener -> {
            ClutteredEntityRendererRegistration.init();
            ClutteredSheetsSignMaterials.addWoodTypes();
        });
    }

    public static void afterInit(){
        ClutteredCompostables.addCompost();
        ClutteredFuelItems.addFuelItems();
        ClutteredFlammableBlocks.addFlammables();
        ClutteredWoodConversions.addConversions();
    }





}
