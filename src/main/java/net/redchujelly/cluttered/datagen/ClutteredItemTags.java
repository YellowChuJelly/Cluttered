package net.redchujelly.cluttered.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
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
        tag(Tags.Items.STORAGE_BLOCKS_GOLD)
                .add(BlockRegistration.CHISELED_GOLD_BLOCK.get().asItem());
    }

    public void tagNewWoodset(String woodType){

        Item log = BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, woodType + "_log")).asItem();
        Item wood = BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, woodType + "_wood")).asItem();
        Item strippedLog = null;
        Item strippedWood = null;
        if (BuiltInRegistries.BLOCK.containsKey(ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, "stripped_" + woodType + "_log"))) {
            strippedLog = BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, "stripped_" + woodType + "_log")).asItem();
            strippedWood = BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, "stripped_" + woodType + "_wood")).asItem();
        }
        Item planks = BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, woodType + "_planks")).asItem();
        Item stairs = BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, woodType + "_stairs")).asItem();
        Item slab = BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, woodType + "_slab")).asItem();
        Item fence = BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, woodType + "_fence")).asItem();
        Item fenceGate = BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, woodType + "_fence_gate")).asItem();
        Item button = BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, woodType + "_button")).asItem();
        Item sign = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, woodType + "_sign"));
        Item hangingSign = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, woodType + "_hanging_sign"));
        Item pressurePlate = BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, woodType + "_pressure_plate")).asItem();
        Item door = null;
        if (BuiltInRegistries.BLOCK.containsKey(ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, woodType + "_door"))) {
            door = BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, woodType + "_door")).asItem();
        }
        Item trapdoor = null;
        if (BuiltInRegistries.BLOCK.containsKey(ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, woodType + "_trapdoor"))) {
            trapdoor = BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, woodType + "_trapdoor")).asItem();
        }
        Item window = null;
        if (BuiltInRegistries.BLOCK.containsKey(ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, woodType + "_window"))) {
            window = BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, woodType + "_window")).asItem();
        }
        Item bookshelf = null;
        if (BuiltInRegistries.BLOCK.containsKey(ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, woodType + "_bookshelf"))) {
            bookshelf = BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, woodType + "_bookshelf")).asItem();
        }
        Item leaves = null;
        if (BuiltInRegistries.BLOCK.containsKey(ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, woodType + "_leaves"))) {
            leaves = BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, woodType + "_leaves")).asItem();
        }

        tag(ItemTags.LOGS)
                .add(log)
                .add(wood);
        tag(ItemTags.LOGS_THAT_BURN)
                .add(log)
                .add(wood);
        tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, woodType + "_logs")))
                .add(log)
                .add(wood);
        if(strippedLog != null) {
            tag(ItemTags.LOGS)
                    .add(strippedLog)
                    .add(strippedWood);
            tag(ItemTags.LOGS_THAT_BURN)
                    .add(strippedLog)
                    .add(strippedWood);
            tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, woodType + "_logs")))
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
                    .add(trapdoor);
            tag(ItemTags.WOODEN_TRAPDOORS)
                    .add(trapdoor);
        }
        if (leaves != null) {
            tag(ItemTags.LEAVES)
                    .add(leaves);
        }
    }
}
