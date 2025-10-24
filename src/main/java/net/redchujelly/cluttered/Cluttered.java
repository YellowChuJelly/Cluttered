package net.redchujelly.cluttered;

import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.MissingMappingsEvent;
import net.redchujelly.cluttered.client.ChairEntityRenderer;
import net.redchujelly.cluttered.config.ClutteredCommonConfigs;
import net.redchujelly.cluttered.datagen.DataGeneration;
import net.redchujelly.cluttered.setup.*;
import net.redchujelly.cluttered.util.ClutteredFurnitureUpdater;
import net.redchujelly.cluttered.util.ClutteredWoodTypes;
import org.slf4j.Logger;

import java.util.List;

@Mod(Cluttered.MODID)
public class Cluttered {

    public static final String MODID = "cluttered";

    private static final Logger LOGGER = LogUtils.getLogger();

    public Cluttered() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        SoundRegistration.register(modEventBus);
        CreativeTabRegistration.register(modEventBus);
        ItemRegistration.register(modEventBus);
        TileEntityRegistration.register(modEventBus);

        BlockRegistration.register(modEventBus);
        EntityTypeRegistration.register(modEventBus);
        PaintingRegistration.register(modEventBus);
        TrunkPlacerTypeRegistration.register(modEventBus);
        FoliagePlacerTypeRegistration.register(modEventBus);
        TreeDecoratorTypeRegistration.register(modEventBus);

        ClutteredLootModifiers.register(modEventBus);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ClutteredCommonConfigs.SPEC, "cluttered-common.toml");

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(DataGeneration::generate);


        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.WILLOW_LEAVES.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.WILLOW_SAPLING.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.POPLAR_LEAVES.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.FLOWERING_POPLAR_LEAVES.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.POPLAR_SAPLING.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.CRABAPPLE_LEAVES.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.CRABAPPLE_SAPLING.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.SYCAMORE_LEAVES.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.SYCAMORE_SAPLING.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.MAPLE_LEAVES_FLOWERING.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.MAPLE_LEAVES.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.MAPLE_SAPLING.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.BLUE_MUSHROOM_SAPLING.get().asItem(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.RED_MUSHROOM_SAPLING.get().asItem(), 0.65F);

        event.enqueueWork(() ->
        {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockRegistration.WILLOW_SAPLING.getId(), BlockRegistration.POTTED_WILLOW_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockRegistration.POPLAR_SAPLING.getId(), BlockRegistration.POTTED_POPLAR_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockRegistration.CRABAPPLE_SAPLING.getId(), BlockRegistration.POTTED_CRABAPPLE_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockRegistration.SYCAMORE_SAPLING.getId(), BlockRegistration.POTTED_SYCAMORE_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockRegistration.MAPLE_SAPLING.getId(), BlockRegistration.POTTED_MAPLE_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockRegistration.BLUE_MUSHROOM_SAPLING.getId(), BlockRegistration.POTTED_BLUE_MUSHROOM_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockRegistration.RED_MUSHROOM_SAPLING.getId(), BlockRegistration.POTTED_RED_MUSHROOM_SAPLING);
        });
    }


    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    //Replaces blocks and items from the outdated version of the mod
    @SubscribeEvent(priority = EventPriority.LOW)
    public void missingMappingsHandler(MissingMappingsEvent event){
        if (!ClutteredCommonConfigs.REPLACE_OLD_CLUTTERED_FURNITURE.get()){
            return;
        }
        List<MissingMappingsEvent.Mapping<Block>> missingBlocks = event.getAllMappings(ForgeRegistries.Keys.BLOCKS);
        List<MissingMappingsEvent.Mapping<Item>> missingItems = event.getAllMappings(ForgeRegistries.Keys.ITEMS);
        for (MissingMappingsEvent.Mapping<Block> missing : missingBlocks){
            String missingId = missing.getKey().toString();
            if (missingId.startsWith("luphieclutteredmod:")){
                String name = missingId.replace("luphieclutteredmod:", "");
                Block replacement = ClutteredFurnitureUpdater.getUpdatedName(name);
                if (replacement == null){
                    missing.ignore();
                }
                else {
                    missing.remap(replacement);
                    String newId = replacement.getDescriptionId().replace("block.cluttered.", "cluttered:");
                    LOGGER.debug("remapped {} to {}", missingId, newId);
                }
            }
        }
        for (MissingMappingsEvent.Mapping<Item> missing : missingItems){
            String missingId = missing.getKey().toString();
            if (missingId.startsWith("luphieclutteredmod:")){
                String name = missingId.replace("luphieclutteredmod:", "");
                Block replacement = ClutteredFurnitureUpdater.getUpdatedName(name);
                if (replacement == null){
                    missing.ignore();
                }
                else {
                    String newId = replacement.getDescriptionId().replace("block.cluttered.", "cluttered:");
                    LOGGER.debug("remapped {} to {}", missingId, newId);
                }
            }
        }
    }


    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            Sheets.addWoodType(ClutteredWoodTypes.WILLOW);
            Sheets.addWoodType(ClutteredWoodTypes.FLOWERING_WILLOW);
            Sheets.addWoodType(ClutteredWoodTypes.POPLAR);
            Sheets.addWoodType(ClutteredWoodTypes.FLOWERING_POPLAR);
            Sheets.addWoodType(ClutteredWoodTypes.CRABAPPLE);
            Sheets.addWoodType(ClutteredWoodTypes.FLOWERING_CRABAPPLE);
            Sheets.addWoodType(ClutteredWoodTypes.SYCAMORE);
            Sheets.addWoodType(ClutteredWoodTypes.MAPLE);
            Sheets.addWoodType(ClutteredWoodTypes.RED_MUSHROOM);
            Sheets.addWoodType(ClutteredWoodTypes.BLUE_MUSHROOM);
        }

        @SubscribeEvent
        public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event){
            event.registerEntityRenderer(EntityTypeRegistration.CHAIR_ENTITY.get(), ChairEntityRenderer::new);
        }
    }
}
