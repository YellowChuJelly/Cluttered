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
        tagNewWoodset("flowering_poplar");
        tagNewWoodset("crabapple");
        tagNewWoodset("flowering_crabapple");
        tagNewWoodset("sycamore");
        tagNewWoodset("fluorescent_maple");
        tagNewWoodset("blue_mushroom");
        tagNewWoodset("red_mushroom");

        tag(BlockTags.ENCHANTMENT_POWER_PROVIDER)
                .add(BlockRegistration.WILLOW_BOOKSHELF_BLACK_CAT.get())
                .add(BlockRegistration.WILLOW_BOOKSHELF_CALICO_CAT.get())
                .add(BlockRegistration.WILLOW_BOOKSHELF_COBWEB.get())
                .add(BlockRegistration.WILLOW_BOOKSHELF_BOTTLES.get())
                .add(BlockRegistration.WILLOW_BOOKSHELF_VASE.get());
        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(BlockRegistration.WILLOW_DOOR.get())
                .add(BlockRegistration.WILLOW_LOG_DOOR.get())
                .add(BlockRegistration.WILLOW_GARDEN_DOOR.get())

                .add(BlockRegistration.YELLOW_PLANTER.get());
        tag(BlockTags.WOODEN_DOORS)
                .add(BlockRegistration.WILLOW_LOG_DOOR.get())
                .add(BlockRegistration.WILLOW_GARDEN_DOOR.get());

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(BlockRegistration.CHALCEDONY.get())
                .add(BlockRegistration.CHALCEDONY_STAIRS.get())
                .add(BlockRegistration.CHALCEDONY_SLAB.get())
                .add(BlockRegistration.POLISHED_CHALCEDONY.get())
                .add(BlockRegistration.CHALCEDONY_BRICKS.get())
                .add(BlockRegistration.CHALCEDONY_BRICK_STAIRS.get())
                .add(BlockRegistration.CHALCEDONY_BRICK_SLAB.get())
                .add(BlockRegistration.CHALCEDONY_TILES.get())
                .add(BlockRegistration.CHALCEDONY_SMALL_TILES.get())
                .add(BlockRegistration.CHISELED_CHALCEDONY.get())
                .add(BlockRegistration.CHALCEDONY_BORDER.get())
                .add(BlockRegistration.CHALCEDONY_ACANTHUS.get())
                .add(BlockRegistration.CHALCEDONY_HELIX.get())
                .add(BlockRegistration.STARRY_CHISELED_CHALCEDONY.get())
                .add(BlockRegistration.CHALCEDONY_PILLAR.get())
                .add(BlockRegistration.CHALCEDONY_PILLAR_BASE.get())
                .add(BlockRegistration.CHALCEDONY_PILLAR_DORIC.get())
                .add(BlockRegistration.CHALCEDONY_PILLAR_IONIC.get())
                .add(BlockRegistration.STARRY_CHALCEDONY_PILLAR.get())
                .add(BlockRegistration.STARRY_CHALCEDONY_PILLAR_BASE.get())
                .add(BlockRegistration.STARRY_CHALCEDONY_PILLAR_DORIC.get())
                .add(BlockRegistration.STARRY_CHALCEDONY_PILLAR_IONIC.get())

                .add(BlockRegistration.DEEP_CHALCEDONY.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_STAIRS.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_SLAB.get())
                .add(BlockRegistration.DEEP_POLISHED_CHALCEDONY.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_BRICKS.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_BRICK_STAIRS.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_BRICK_SLAB.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_TILES.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_SMALL_TILES.get())
                .add(BlockRegistration.DEEP_CHISELED_CHALCEDONY.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_BORDER.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_ACANTHUS.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_HELIX.get())
                .add(BlockRegistration.DEEP_STARRY_CHISELED_CHALCEDONY.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_PILLAR.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_PILLAR_BASE.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_PILLAR_DORIC.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_PILLAR_IONIC.get())
                .add(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR.get())
                .add(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_BASE.get())
                .add(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_IONIC.get())
                .add(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_DORIC.get())

                .add(BlockRegistration.MARBLE.get())
                .add(BlockRegistration.MARBLE_STAIRS.get())
                .add(BlockRegistration.MARBLE_SLAB.get())
                .add(BlockRegistration.POLISHED_MARBLE.get())
                .add(BlockRegistration.MARBLE_BRICKS.get())
                .add(BlockRegistration.MARBLE_BRICK_STAIRS.get())
                .add(BlockRegistration.MARBLE_BRICK_SLAB.get())
                .add(BlockRegistration.MARBLE_TILES.get())
                .add(BlockRegistration.MARBLE_SMALL_TILES.get())
                .add(BlockRegistration.CHISELED_MARBLE.get())
                .add(BlockRegistration.MARBLE_BORDER.get())
                .add(BlockRegistration.MARBLE_ACANTHUS.get())
                .add(BlockRegistration.MARBLE_HELIX.get())
                .add(BlockRegistration.STARRY_CHISELED_MARBLE.get())
                .add(BlockRegistration.MARBLE_PILLAR.get())
                .add(BlockRegistration.MARBLE_PILLAR_BASE.get())
                .add(BlockRegistration.MARBLE_PILLAR_DORIC.get())
                .add(BlockRegistration.MARBLE_PILLAR_IONIC.get());
        tag(BlockTags.BIG_DRIPLEAF_PLACEABLE)
                .add(BlockRegistration.YELLOW_PLANTER.get());
        tag(BlockTags.SMALL_DRIPLEAF_PLACEABLE)
                .add(BlockRegistration.YELLOW_PLANTER.get());
        tag(BlockTags.DEAD_BUSH_MAY_PLACE_ON)
                .add(BlockRegistration.YELLOW_PLANTER.get());
    }

    public void tagNewWoodset(String woodType){

        Block log = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_log"));
        Block wood = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_wood"));
        Block strippedLog = null;
        Block strippedWood = null;
        if (ForgeRegistries.BLOCKS.containsKey(new ResourceLocation(Cluttered.MODID + ":" + "stripped_" + woodType + "_log"))) {
            strippedLog = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + "stripped_" + woodType + "_log"));
            strippedWood = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + "stripped_" + woodType + "_wood"));
        }
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
                .add(wood);
        tag(BlockTags.LOGS_THAT_BURN)
                .add(log)
                .add(wood);
        if(strippedLog != null){
            tag(BlockTags.LOGS)
                    .add(strippedLog)
                    .add(strippedWood);
            tag(BlockTags.LOGS_THAT_BURN)
                    .add(strippedLog)
                    .add(strippedWood);
            tag(BlockTags.MINEABLE_WITH_AXE)
                    .add(strippedLog)
                    .add(strippedWood);
        }
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
            //testing
            //tag(BlockTags.WOODEN_TRAPDOORS)
            //        .add(trapdoor);
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
