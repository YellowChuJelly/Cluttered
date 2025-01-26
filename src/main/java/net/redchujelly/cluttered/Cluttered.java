package net.redchujelly.cluttered;

import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.redchujelly.cluttered.client.ChairEntityRenderer;
import net.redchujelly.cluttered.datagen.DataGeneration;
import net.redchujelly.cluttered.setup.*;
import org.slf4j.Logger;

@Mod(Cluttered.MODID)
public class Cluttered {

    public static final String MODID = "cluttered";

    private static final Logger LOGGER = LogUtils.getLogger();

    public Cluttered() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        CreativeTabRegistration.register(modEventBus);
        ItemRegistration.register(modEventBus);
        BlockRegistration.register(modEventBus);
        EntityTypeRegistration.register(modEventBus);
        PaintingRegistration.register(modEventBus);
        TrunkPlacerTypesRegistration.register(modEventBus);
        FoliagePlacerTypeRegistration.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(DataGeneration::generate);


        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.WILLOW_LEAVES.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.WILLOW_SAPLING.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.POPLAR_LEAVES.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.POPLAR_SAPLING.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.BLUE_MUSHROOM_SAPLING.get().asItem(), 0.65F);

        event.enqueueWork(() ->
        {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockRegistration.WILLOW_SAPLING.getId(), BlockRegistration.POTTED_WILLOW_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockRegistration.POPLAR_SAPLING.getId(), BlockRegistration.POTTED_POPLAR_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockRegistration.BLUE_MUSHROOM_SAPLING.getId(), BlockRegistration.POTTED_BLUE_MUSHROOM_SAPLING);
        });
    }


    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }


    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }


    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }

        @SubscribeEvent
        public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event){
            event.registerEntityRenderer(EntityTypeRegistration.CHAIR_ENTITY.get(), ChairEntityRenderer::new);
        }
    }
}
