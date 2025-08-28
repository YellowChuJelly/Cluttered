package net.redchujelly.cluttered.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.redchujelly.cluttered.Cluttered;
import net.redchujelly.cluttered.setup.BlockRegistration;
import net.redchujelly.cluttered.setup.TagRegistration;

import java.util.concurrent.CompletableFuture;

public class ClutteredItemTags extends ItemTagsProvider {
    public ClutteredItemTags(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, BlockTagsProvider blockTags, ExistingFileHelper existingFileHelper) {
        super(packOutput, lookupProvider, blockTags.contentsGetter(), Cluttered.MODID, existingFileHelper);
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

        tag(ItemTags.DOORS)
                .add(BlockRegistration.WILLOW_LOG_DOOR.get().asItem())
                .add(BlockRegistration.WILLOW_GARDEN_DOOR.get().asItem())
                .add(BlockRegistration.DYNASTY_DOOR.get().asItem())
                .add(BlockRegistration.ART_NOUVEAU_DOOR_DARK.get().asItem())
                .add(BlockRegistration.ART_NOUVEAU_DOOR.get().asItem());
        tag(ItemTags.WOODEN_DOORS)
                .add(BlockRegistration.WILLOW_LOG_DOOR.get().asItem())
                .add(BlockRegistration.WILLOW_GARDEN_DOOR.get().asItem())
                .add(BlockRegistration.DYNASTY_DOOR.get().asItem())
                .add(BlockRegistration.ART_NOUVEAU_DOOR_DARK.get().asItem())
                .add(BlockRegistration.ART_NOUVEAU_DOOR.get().asItem());
        tag(ItemTags.STONE_CRAFTING_MATERIALS)
                .add(BlockRegistration.CHALCEDONY.get().asItem())
                .add(BlockRegistration.DEEP_CHALCEDONY.get().asItem())
                .add(BlockRegistration.MARBLE.get().asItem());
        tag(ItemTags.STONE_TOOL_MATERIALS)
                .add(BlockRegistration.CHALCEDONY.get().asItem())
                .add(BlockRegistration.DEEP_CHALCEDONY.get().asItem())
                .add(BlockRegistration.MARBLE.get().asItem());
        tag(ItemTags.SAPLINGS)
                .add(BlockRegistration.WILLOW_SAPLING.get().asItem())
                .add(BlockRegistration.POPLAR_SAPLING.get().asItem());
        tag(ItemTags.LEAVES)
                .add(BlockRegistration.WILLOW_LEAVES.get().asItem())
                .add(BlockRegistration.POPLAR_LEAVES.get().asItem());
        tag(TagRegistration.Items.POLAROID_PICTURE)
                .add(BlockRegistration.POLAROIDS_A.get().asItem())
                .add(BlockRegistration.POLAROIDS_B.get().asItem())
                .add(BlockRegistration.POLAROIDS_C.get().asItem());
        tag(ItemTags.LEAVES)
                .add(BlockRegistration.MAPLE_LEAVES_FLOWERING.get().asItem());
        
        tag(TagRegistration.Items.WILLOW_LOG)
                .add(BlockRegistration.WILLOW_LOG.get().asItem())
                .add(BlockRegistration.WILLOW_WOOD.get().asItem())
                .add(BlockRegistration.STRIPPED_WILLOW_LOG.get().asItem())
                .add(BlockRegistration.STRIPPED_WILLOW_WOOD.get().asItem());
        tag(TagRegistration.Items.FLOWERING_WILLOW_LOG)
                .add(BlockRegistration.FLOWERING_WILLOW_LOG.get().asItem())
                .add(BlockRegistration.FLOWERING_WILLOW_WOOD.get().asItem())
                .add(BlockRegistration.STRIPPED_FLOWERING_WILLOW_LOG.get().asItem())
                .add(BlockRegistration.STRIPPED_FLOWERING_WILLOW_WOOD.get().asItem());
        tag(TagRegistration.Items.POPLAR_LOG)
                .add(BlockRegistration.POPLAR_LOG.get().asItem())
                .add(BlockRegistration.POPLAR_WOOD.get().asItem())
                .add(BlockRegistration.STRIPPED_POPLAR_LOG.get().asItem())
                .add(BlockRegistration.STRIPPED_POPLAR_WOOD.get().asItem());
        tag(TagRegistration.Items.FLOWERING_POPLAR_LOG)
                .add(BlockRegistration.FLOWERING_POPLAR_LOG.get().asItem())
                .add(BlockRegistration.FLOWERING_POPLAR_WOOD.get().asItem())
                .add(BlockRegistration.STRIPPED_FLOWERING_POPLAR_LOG.get().asItem())
                .add(BlockRegistration.STRIPPED_FLOWERING_POPLAR_WOOD.get().asItem());
        tag(TagRegistration.Items.CRABAPPLE_LOG)
                .add(BlockRegistration.CRABAPPLE_LOG.get().asItem())
                .add(BlockRegistration.CRABAPPLE_WOOD.get().asItem())
                .add(BlockRegistration.STRIPPED_CRABAPPLE_LOG.get().asItem())
                .add(BlockRegistration.STRIPPED_CRABAPPLE_WOOD.get().asItem());
        tag(TagRegistration.Items.FLOWERING_CRABAPPLE_LOG)
                .add(BlockRegistration.FLOWERING_CRABAPPLE_LOG.get().asItem())
                .add(BlockRegistration.FLOWERING_CRABAPPLE_WOOD.get().asItem())
                .add(BlockRegistration.STRIPPED_FLOWERING_CRABAPPLE_LOG.get().asItem())
                .add(BlockRegistration.STRIPPED_FLOWERING_CRABAPPLE_WOOD.get().asItem());
        tag(TagRegistration.Items.SYCAMORE_LOG)
                .add(BlockRegistration.SYCAMORE_LOG.get().asItem())
                .add(BlockRegistration.SYCAMORE_WOOD.get().asItem())
                .add(BlockRegistration.STRIPPED_SYCAMORE_LOG.get().asItem())
                .add(BlockRegistration.STRIPPED_SYCAMORE_WOOD.get().asItem());
        tag(TagRegistration.Items.MAPLE_LOG)
                .add(BlockRegistration.MAPLE_LOG.get().asItem())
                .add(BlockRegistration.MAPLE_WOOD.get().asItem())
                .add(BlockRegistration.STRIPPED_MAPLE_LOG.get().asItem())
                .add(BlockRegistration.STRIPPED_MAPLE_WOOD.get().asItem());
        tag(TagRegistration.Items.BLUE_MUSHROOM_LOG)
                .add(BlockRegistration.BLUE_MUSHROOM_LOG.get().asItem())
                .add(BlockRegistration.BLUE_MUSHROOM_WOOD.get().asItem());
        tag(TagRegistration.Items.RED_MUSHROOM_LOG)
                .add(BlockRegistration.RED_MUSHROOM_LOG.get().asItem())
                .add(BlockRegistration.RED_MUSHROOM_WOOD.get().asItem());
    }

    public void tagNewWoodset(String woodType){

        Item log = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_log")).asItem();
        Item wood = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_wood")).asItem();
        Item strippedLog = null;
        Item strippedWood = null;
        if (ForgeRegistries.BLOCKS.containsKey(new ResourceLocation(Cluttered.MODID + ":" + "stripped_" + woodType + "_log"))) {
            strippedLog = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + "stripped_" + woodType + "_log")).asItem();
            strippedWood = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + "stripped_" + woodType + "_wood")).asItem();
        }
        Item planks = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_planks")).asItem();
        Item stairs = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_stairs")).asItem();
        Item slab = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_slab")).asItem();
        Item fence = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_fence")).asItem();
        Item fenceGate = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_fence_gate")).asItem();
        Item button = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_button")).asItem();
        Item sign = ForgeRegistries.ITEMS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_sign"));
        Item hangingSign = ForgeRegistries.ITEMS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_hanging_sign"));
        Item pressurePlate = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_pressure_plate")).asItem();
        Item door = null;
        if (ForgeRegistries.BLOCKS.containsKey(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_door"))) {
            door = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_door")).asItem();
        }
        Item trapdoor = null;
        if (ForgeRegistries.BLOCKS.containsKey(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_trapdoor"))) {
            trapdoor = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_trapdoor")).asItem();
        }
        Item window = null;
        if (ForgeRegistries.BLOCKS.containsKey(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_window"))) {
            window = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_window")).asItem();
        }
        Item bookshelf = null;
        if (ForgeRegistries.BLOCKS.containsKey(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_bookshelf"))) {
            bookshelf = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_bookshelf")).asItem();
        }
        Item leaves = null;
        if (ForgeRegistries.BLOCKS.containsKey(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_leaves"))) {
            leaves = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_leaves")).asItem();
        }

        tag(ItemTags.LOGS)
                .add(log)
                .add(wood);
        tag(ItemTags.LOGS_THAT_BURN)
                .add(log)
                .add(wood);
        tag(ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation( woodType + "_log"))).getKey())
                .add(log)
                .add(wood);
        if(strippedLog != null) {
            tag(ItemTags.LOGS)
                    .add(strippedLog)
                    .add(strippedWood);
            tag(ItemTags.LOGS_THAT_BURN)
                    .add(strippedLog)
                    .add(strippedWood);
            tag(ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation( woodType + "_log"))).getKey())
                    .add(strippedLog)
                    .add(strippedWood);
        }
        tag(ItemTags.PLANKS)
                .add(planks);
        tag(ItemTags.STAIRS)
                .add(stairs);
        tag(ItemTags.WOODEN_STAIRS)
                .add(stairs);
        tag(ItemTags.SLABS)
                .add(slab);
        tag(ItemTags.SIGNS)
                .add(sign);
        tag(ItemTags.HANGING_SIGNS)
                .add(hangingSign);
        tag(ItemTags.WOODEN_SLABS)
                .add(slab);
        tag(ItemTags.FENCES)
                .add(fence);
        tag(ItemTags.WOODEN_FENCES)
                .add(fence);
        tag(ItemTags.FENCE_GATES)
                .add(fenceGate);
        tag(ItemTags.BUTTONS)
                .add(button);
        tag(ItemTags.WOODEN_BUTTONS)
                .add(button);
        tag(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(pressurePlate);

        if (door != null) {
            tag(ItemTags.DOORS)
                    .add(door);
            tag(ItemTags.WOODEN_DOORS)
                    .add(door);
        }
        if (trapdoor != null) {
            tag(ItemTags.TRAPDOORS)
                    .add(door);
            tag(ItemTags.WOODEN_TRAPDOORS)
                    .add(door);
        }
        if (leaves != null) {
            tag(ItemTags.LEAVES)
                    .add(leaves);
        }
    }
}
