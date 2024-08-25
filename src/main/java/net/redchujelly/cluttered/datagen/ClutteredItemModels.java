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

public class ClutteredItemModels extends ItemModelProvider {
    public ClutteredItemModels(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Cluttered.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        fenceItem(BlockRegistration.WILLOW_FENCE, BlockRegistration.WILLOW_PLANKS);
        buttonItem(BlockRegistration.WILLOW_BUTTON, BlockRegistration.WILLOW_PLANKS);

        fenceItem(BlockRegistration.FLOWERING_WILLOW_FENCE, BlockRegistration.FLOWERING_WILLOW_PLANKS);
        buttonItem(BlockRegistration.FLOWERING_WILLOW_BUTTON, BlockRegistration.FLOWERING_WILLOW_PLANKS);

        fenceItem(BlockRegistration.POPLAR_FENCE, BlockRegistration.POPLAR_PLANKS);
        buttonItem(BlockRegistration.POPLAR_BUTTON, BlockRegistration.POPLAR_PLANKS);
        simpleBlockItem(BlockRegistration.POPLAR_DOOR).renderType("translucent");
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
}
