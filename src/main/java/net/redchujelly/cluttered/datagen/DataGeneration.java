package net.redchujelly.cluttered.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

public class DataGeneration {

    public static void generate(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeClient(), new ClutteredBlockstates(packOutput, event.getExistingFileHelper()));
        generator.addProvider(event.includeClient(), new ClutteredItemModels(packOutput, event.getExistingFileHelper()));

        ClutteredBlockTags blockTags = new ClutteredBlockTags(packOutput, lookupProvider, event.getExistingFileHelper());
        generator.addProvider(event.includeServer(), blockTags);
        generator.addProvider(event.includeServer(), new ClutteredItemTags(packOutput, lookupProvider, blockTags, event.getExistingFileHelper()));
        generator.addProvider(event.includeServer(), new ClutteredRecipes(packOutput));
        generator.addProvider(event.includeServer(), ClutteredLootTableProvider.create(packOutput));
    }
}
