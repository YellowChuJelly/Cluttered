package net.redchujelly.cluttered.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.redchujelly.cluttered.Cluttered;
import net.redchujelly.cluttered.setup.BlockRegistration;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ClutteredBlockTags extends BlockTagsProvider {
    public ClutteredBlockTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Cluttered.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.ENCHANTMENT_POWER_PROVIDER)
                .add(BlockRegistration.WILLOW_BOOKSHELF_BLACK_CAT.get());
        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(BlockRegistration.WILLOW_BOOKSHELF_BLACK_CAT.get());
    }
}
