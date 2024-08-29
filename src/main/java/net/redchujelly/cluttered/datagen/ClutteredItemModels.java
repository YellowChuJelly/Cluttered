package net.redchujelly.cluttered.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.redchujelly.cluttered.Cluttered;
import net.redchujelly.cluttered.setup.BlockRegistration;
import net.redchujelly.cluttered.setup.ItemRegistration;

public class ClutteredItemModels extends ItemModelProvider {
    public ClutteredItemModels(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Cluttered.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        fenceItem(BlockRegistration.WILLOW_FENCE, BlockRegistration.WILLOW_PLANKS);
        buttonItem(BlockRegistration.WILLOW_BUTTON, BlockRegistration.WILLOW_PLANKS);
        simplePaneBlockItem(BlockRegistration.WILLOW_WINDOW_PANE).renderType("cutout");
        simpleBlockItem(BlockRegistration.WILLOW_DOOR);
        simpleBlockItem(BlockRegistration.WILLOW_LOG_DOOR);
        simpleBlockItem(BlockRegistration.WILLOW_GARDEN_DOOR).renderType("cutout");

        fenceItem(BlockRegistration.FLOWERING_WILLOW_FENCE, BlockRegistration.FLOWERING_WILLOW_PLANKS);
        buttonItem(BlockRegistration.FLOWERING_WILLOW_BUTTON, BlockRegistration.FLOWERING_WILLOW_PLANKS);
        simplePaneBlockItem(BlockRegistration.FLOWERING_WILLOW_WINDOW_PANE).renderType("cutout");
        simpleBlockItem(BlockRegistration.FLOWERING_WILLOW_DOOR);

        fenceItem(BlockRegistration.POPLAR_FENCE, BlockRegistration.POPLAR_PLANKS);
        buttonItem(BlockRegistration.POPLAR_BUTTON, BlockRegistration.POPLAR_PLANKS);
        simpleBlockItem(BlockRegistration.POPLAR_DOOR).renderType("translucent");
        simplePaneBlockItem(BlockRegistration.POPLAR_WINDOW_PANE).renderType("translucent");

        fenceItem(BlockRegistration.FLOWERING_POPLAR_FENCE, BlockRegistration.FLOWERING_POPLAR_PLANKS);
        buttonItem(BlockRegistration.FLOWERING_POPLAR_BUTTON, BlockRegistration.FLOWERING_POPLAR_PLANKS);
        simpleBlockItem(BlockRegistration.FLOWERING_POPLAR_DOOR).renderType("translucent");
        simplePaneBlockItem(BlockRegistration.FLOWERING_POPLAR_WINDOW_PANE).renderType("translucent");

        fenceItem(BlockRegistration.CRABAPPLE_FENCE, BlockRegistration.CRABAPPLE_PLANKS);
        buttonItem(BlockRegistration.CRABAPPLE_BUTTON, BlockRegistration.CRABAPPLE_PLANKS);
        simpleBlockItem(BlockRegistration.CRABAPPLE_DOOR).renderType("cutout");
        simplePaneBlockItem(BlockRegistration.CRABAPPLE_WINDOW_PANE).renderType("cutout");

        fenceItem(BlockRegistration.FLOWERING_CRABAPPLE_FENCE, BlockRegistration.FLOWERING_CRABAPPLE_PLANKS);
        buttonItem(BlockRegistration.FLOWERING_CRABAPPLE_BUTTON, BlockRegistration.FLOWERING_CRABAPPLE_PLANKS);
        simpleBlockItem(BlockRegistration.FLOWERING_CRABAPPLE_DOOR).renderType("cutout");
        simplePaneBlockItem(BlockRegistration.FLOWERING_CRABAPPLE_WINDOW_PANE).renderType("cutout");

        fenceItem(BlockRegistration.SYCAMORE_FENCE, BlockRegistration.SYCAMORE_PLANKS);
        buttonItem(BlockRegistration.SYCAMORE_BUTTON, BlockRegistration.SYCAMORE_PLANKS);
        simpleBlockItem(BlockRegistration.SYCAMORE_DOOR);
        simplePaneBlockItem(BlockRegistration.SYCAMORE_WINDOW_PANE).renderType("cutout");

        fenceItem(BlockRegistration.MAPLE_FENCE, BlockRegistration.MAPLE_PLANKS);
        buttonItem(BlockRegistration.MAPLE_BUTTON, BlockRegistration.MAPLE_PLANKS);
        simpleBlockItem(BlockRegistration.MAPLE_DOOR).renderType("cutout");
        simplePaneBlockItem(BlockRegistration.MAPLE_WINDOW_PANE).renderType("cutout");

        fenceItem(BlockRegistration.BLUE_MUSHROOM_FENCE, BlockRegistration.BLUE_MUSHROOM_PLANKS);
        buttonItem(BlockRegistration.BLUE_MUSHROOM_BUTTON, BlockRegistration.BLUE_MUSHROOM_PLANKS);
        simpleBlockItem(BlockRegistration.BLUE_MUSHROOM_DOOR);
        simplePaneBlockItem(BlockRegistration.BLUE_MUSHROOM_WINDOW_PANE);     
        
        fenceItem(BlockRegistration.RED_MUSHROOM_FENCE, BlockRegistration.RED_MUSHROOM_PLANKS);
        buttonItem(BlockRegistration.RED_MUSHROOM_BUTTON, BlockRegistration.RED_MUSHROOM_PLANKS);
        simpleBlockItem(BlockRegistration.RED_MUSHROOM_DOOR);
        simplePaneBlockItem(BlockRegistration.RED_MUSHROOM_WINDOW_PANE);

        basicItem(ItemRegistration.HAND_DRILL.get());

        simplePaneBlockItem(BlockRegistration.BLACK_CAT_WINDOW_PANE);
    }

    //From the Kaupenjoe Forge 1.20.1 tutorial #13
    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> base) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", new ResourceLocation(Cluttered.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(base.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> base) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture", new ResourceLocation(Cluttered.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(base.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Cluttered.MODID, "item/" + item.getId().getPath()));
    }
    private ItemModelBuilder simplePaneBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Cluttered.MODID, "block/" + item.getId().getPath().replace("_pane", "")));
    }
}
