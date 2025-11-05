package net.redchujelly.cluttered;

import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.redchujelly.cluttered.client.ChairEntityRenderer;
import net.redchujelly.cluttered.config.ClutteredCommonConfigs;
import net.redchujelly.cluttered.datagen.DataGeneration;
import net.redchujelly.cluttered.setup.*;
import net.redchujelly.cluttered.util.ClutteredWoodTypes;
import org.slf4j.Logger;

@Mod(Cluttered.MODID)
public class Cluttered {

    public static final String MODID = "cluttered";

    private static final Logger LOGGER = LogUtils.getLogger();

    public Cluttered(IEventBus modEventBus, ModContainer modContainer) {
		ClutteredLootModifiers.register(modEventBus);
		EntityTypeRegistration.register(modEventBus);
		SoundRegistration.register(modEventBus);

		BlockRegistration.register(modEventBus);

		ItemRegistration.register(modEventBus);
		TileEntityRegistration.register(modEventBus);

        CreativeTabRegistration.register(modEventBus);

        TrunkPlacerTypeRegistration.register(modEventBus);
        FoliagePlacerTypeRegistration.register(modEventBus);
        TreeDecoratorTypeRegistration.register(modEventBus);

        modContainer.registerConfig(ModConfig.Type.COMMON, ClutteredCommonConfigs.SPEC, "cluttered-common.toml");

        modEventBus.addListener(DataGeneration::generate);

        modEventBus.addListener(this::commonSetup);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.WILLOW_LEAVES.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.FLOWERING_CARPET_WILLOW.get().asItem(), 0.075F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.WILLOW_SAPLING.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.WILLOW_VINES.get().asItem(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.POPLAR_LEAVES.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.FLOWERING_CARPET_POPLAR.get().asItem(), 0.075F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.FLOWERING_POPLAR_LEAVES.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.POPLAR_SAPLING.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.CRABAPPLE_LEAVES.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.FLOWERING_CARPET_CRABAPPLE.get().asItem(), 0.075F);
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

    //Replaces blocks and items from the outdated version of the mod
//    @SubscribeEvent(priority = EventPriority.LOW)
//    public void missingMappingsHandler(MissingMappingsEvent event){
//        if (!ClutteredCommonConfigs.REPLACE_OLD_CLUTTERED_FURNITURE.get()){
//            return;
//        }
//        List<MissingMappingsEvent.Mapping<Block>> missingBlocks = event.getAllMappings(ForgeRegistries.Keys.BLOCKS);
//        List<MissingMappingsEvent.Mapping<Item>> missingItems = event.getAllMappings(ForgeRegistries.Keys.ITEMS);
//        for (MissingMappingsEvent.Mapping<Block> missing : missingBlocks){
//            String missingId = missing.getKey().toString();
//            if (missingId.startsWith("luphieclutteredmod:")){
//                String name = missingId.replace("luphieclutteredmod:", "");
//                Block replacement = ClutteredFurnitureUpdater.getUpdatedName(name);
//                if (replacement == null){
//                    missing.ignore();
//                }
//                else {
//                    missing.remap(replacement);
//                    String newId = replacement.getDescriptionId().replace("block.cluttered.", "cluttered:");
//                    LOGGER.debug("remapped {} to {}", missingId, newId);
//                }
//            }
//        }
//        for (MissingMappingsEvent.Mapping<Item> missing : missingItems){
//            String missingId = missing.getKey().toString();
//            if (missingId.startsWith("luphieclutteredmod:")){
//                String name = missingId.replace("luphieclutteredmod:", "");
//                Block replacement = ClutteredFurnitureUpdater.getUpdatedName(name);
//                if (replacement == null){
//                    missing.ignore();
//                }
//                else {
//                    String newId = replacement.getDescriptionId().replace("block.cluttered.", "cluttered:");
//                    LOGGER.debug("remapped {} to {}", missingId, newId);
//                }
//            }
//        }
//    }

    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

		@SubscribeEvent
		public static void onClientSetup(FMLClientSetupEvent event) {
			event.enqueueWork(() -> {
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
			});
		}

        @SubscribeEvent
        public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event){
            event.registerEntityRenderer(EntityTypeRegistration.CHAIR_ENTITY.get(), ChairEntityRenderer::new);

			event.registerBlockEntityRenderer(TileEntityRegistration.CLUTTERED_SIGN_BE.get(), SignRenderer::new);
			event.registerBlockEntityRenderer(TileEntityRegistration.CLUTTERED_HANGING_SIGN_BE.get(), HangingSignRenderer::new);
		}
    }
}
