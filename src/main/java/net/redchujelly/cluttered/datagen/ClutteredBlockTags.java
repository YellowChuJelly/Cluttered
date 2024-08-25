package net.redchujelly.cluttered.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
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
        tagNewWoodset("willow");
        tagNewWoodset("flowering_willow");
        tagNewWoodset("poplar");

        tag(BlockTags.ENCHANTMENT_POWER_PROVIDER)
                .add(BlockRegistration.WILLOW_BOOKSHELF_BLACK_CAT.get())
                .add(BlockRegistration.WILLOW_BOOKSHELF_CALICO_CAT.get())
                .add(BlockRegistration.WILLOW_BOOKSHELF_COBWEB.get())
                .add(BlockRegistration.WILLOW_BOOKSHELF_BOTTLES.get())
                .add(BlockRegistration.WILLOW_BOOKSHELF_VASE.get());
        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(BlockRegistration.WILLOW_DOOR.get())
                .add(BlockRegistration.WILLOW_LOG_DOOR.get())
                .add(BlockRegistration.WILLOW_GARDEN_DOOR.get());
        tag(BlockTags.WOODEN_DOORS)
                .add(BlockRegistration.WILLOW_LOG_DOOR.get())
                .add(BlockRegistration.WILLOW_GARDEN_DOOR.get());
    }

    public void tagNewWoodset(String woodType){

        Block log = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_log"));
        Block wood = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_wood"));
        Block strippedLog = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + "stripped_" + woodType + "_log"));
        Block strippedWood = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + "stripped_" + woodType + "_wood"));
        Block planks = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_planks"));
        Block stairs = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_stairs"));
        Block slab = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_slab"));
        Block fence = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_fence"));
        Block fenceGate = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_fence_gate"));
        Block button = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_button"));
        Block pressurePlate = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_pressure_plate"));
        Block door = null;
        if (ForgeRegistries.BLOCKS.containsKey(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_door"))) {
            door = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_door"));
        }
        Block trapdoor = null;
        if (ForgeRegistries.BLOCKS.containsKey(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_trapdoor"))) {
            trapdoor = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_trapdoor"));
        }
        Block window = null;
        if (ForgeRegistries.BLOCKS.containsKey(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_window"))) {
            window = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_window"));
        }
        Block bookshelf = null;
        if (ForgeRegistries.BLOCKS.containsKey(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_bookshelf"))) {
            bookshelf = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_bookshelf"));
        }

        tag(BlockTags.LOGS)
                .add(log)
                .add(wood)
                .add(strippedLog)
                .add(strippedWood);
        tag(BlockTags.LOGS_THAT_BURN)
                .add(log)
                .add(wood)
                .add(strippedLog)
                .add(strippedWood);
        tag(BlockTags.PLANKS)
                .add(planks);
        tag(BlockTags.STAIRS)
                .add(stairs);
        tag(BlockTags.WOODEN_STAIRS)
                .add(stairs);
        tag(BlockTags.SLABS)
                .add(slab);
        tag(BlockTags.WOODEN_SLABS)
                .add(slab);
        tag(BlockTags.FENCES)
                .add(fence);
        tag(BlockTags.WOODEN_FENCES)
                .add(fence);
        tag(BlockTags.FENCE_GATES)
                .add(fenceGate);
        tag(BlockTags.FENCE_GATES)
                .add(fenceGate);
        tag(BlockTags.BUTTONS)
                .add(button);
        tag(BlockTags.WOODEN_BUTTONS)
                .add(button);
        tag(BlockTags.PRESSURE_PLATES)
                .add(pressurePlate);
        tag(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(pressurePlate);
        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(log)
                .add(wood)
                .add(strippedLog)
                .add(strippedWood)
                .add(planks)
                .add(stairs)
                .add(slab)
                .add(button)
                .add(pressurePlate)
                .add(fence)
                .add(fenceGate);

        if (door != null){
            tag(BlockTags.DOORS)
                    .add(door);
            tag(BlockTags.WOODEN_DOORS)
                    .add(door);
            tag(BlockTags.MINEABLE_WITH_AXE)
                    .add(door);
        }
        if (trapdoor != null){
            tag(BlockTags.TRAPDOORS)
                    .add(trapdoor);
            tag(BlockTags.WOODEN_TRAPDOORS)
                    .add(trapdoor);
            tag(BlockTags.MINEABLE_WITH_AXE)
                    .add(trapdoor);
        }
        if (bookshelf != null){
            tag(BlockTags.ENCHANTMENT_POWER_PROVIDER)
                    .add(bookshelf);
            tag(BlockTags.MINEABLE_WITH_AXE)
                    .add(bookshelf);
        }

    }
}
