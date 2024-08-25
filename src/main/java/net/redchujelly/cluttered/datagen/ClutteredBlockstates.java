package net.redchujelly.cluttered.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.redchujelly.cluttered.Cluttered;
import net.redchujelly.cluttered.setup.BlockRegistration;

public class ClutteredBlockstates extends BlockStateProvider {
    public ClutteredBlockstates(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Cluttered.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //WILLOW WOODSET
        blockWithItem((BlockRegistration.WILLOW_PLANKS));
        columnBlockWithItem((BlockRegistration.WILLOW_BOOKSHELF_BLACK_CAT), (BlockRegistration.WILLOW_PLANKS));
        columnBlockWithItem((BlockRegistration.WILLOW_BOOKSHELF_CALICO_CAT), (BlockRegistration.WILLOW_PLANKS));
        columnBlockWithItem((BlockRegistration.WILLOW_BOOKSHELF_COBWEB), (BlockRegistration.WILLOW_PLANKS));
        columnBlockWithItem((BlockRegistration.WILLOW_BOOKSHELF_BOTTLES), (BlockRegistration.WILLOW_PLANKS));
        columnBlockWithItem((BlockRegistration.WILLOW_BOOKSHELF_VASE), (BlockRegistration.WILLOW_PLANKS));

        logBlockMaker(BlockRegistration.WILLOW_LOG, false);
        logBlockMaker(BlockRegistration.STRIPPED_WILLOW_LOG, false);
        logBlockMaker(BlockRegistration.WILLOW_WOOD, true);
        logBlockMaker(BlockRegistration.STRIPPED_WILLOW_WOOD, true);

        slabBlock((SlabBlock) BlockRegistration.WILLOW_SLAB.get(), blockTexture(BlockRegistration.WILLOW_PLANKS.get()), blockTexture(BlockRegistration.WILLOW_PLANKS.get()));
        blockItem(BlockRegistration.WILLOW_SLAB);
        stairsBlock((StairBlock) BlockRegistration.WILLOW_STAIRS.get(), blockTexture(BlockRegistration.WILLOW_PLANKS.get()));
        blockItem(BlockRegistration.WILLOW_STAIRS);

        fenceBlock((FenceBlock) BlockRegistration.WILLOW_FENCE.get(), blockTexture(BlockRegistration.WILLOW_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) BlockRegistration.WILLOW_FENCE_GATE.get(), blockTexture(BlockRegistration.WILLOW_PLANKS.get()));
        blockItem(BlockRegistration.WILLOW_FENCE_GATE);

        doorBlock((DoorBlock) BlockRegistration.WILLOW_LOG_DOOR.get(), modLoc("block/willow_log_door_bottom"), modLoc("block/willow_log_door_top"));
        doorBlockWithRenderType((DoorBlock) BlockRegistration.WILLOW_GARDEN_DOOR.get(), modLoc("block/willow_garden_door_bottom"), modLoc("block/willow_garden_door_top"), "cutout");
        doorBlock((DoorBlock) BlockRegistration.WILLOW_DOOR.get(), modLoc("block/willow_door_bottom"), modLoc("block/willow_door_top"));
        trapdoorBlock((TrapDoorBlock) BlockRegistration.WILLOW_TRAPDOOR.get(), modLoc("block/willow_trapdoor"), true);
        trapdoorBlockItem(BlockRegistration.WILLOW_TRAPDOOR);

        buttonBlock((ButtonBlock) BlockRegistration.WILLOW_BUTTON.get(), blockTexture(BlockRegistration.WILLOW_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) BlockRegistration.WILLOW_PRESSURE_PLATE.get(), blockTexture(BlockRegistration.WILLOW_PLANKS.get()));
        blockItem(BlockRegistration.WILLOW_PRESSURE_PLATE);

        simpleBlockWithItem(BlockRegistration.WILLOW_WINDOW.get(), models().cubeAll("willow_window", modLoc("block/willow_window")).renderType("cutout"));

        //FLOWERING WILLOW WOODSET
        blockWithItem((BlockRegistration.FLOWERING_WILLOW_PLANKS));

        logBlockMaker(BlockRegistration.FLOWERING_WILLOW_LOG, false);
        logBlockMaker(BlockRegistration.STRIPPED_FLOWERING_WILLOW_LOG, false);
        logBlockMaker(BlockRegistration.FLOWERING_WILLOW_WOOD, true);
        logBlockMaker(BlockRegistration.STRIPPED_FLOWERING_WILLOW_WOOD, true);

        slabBlock((SlabBlock) BlockRegistration.FLOWERING_WILLOW_SLAB.get(), blockTexture(BlockRegistration.FLOWERING_WILLOW_PLANKS.get()), blockTexture(BlockRegistration.FLOWERING_WILLOW_PLANKS.get()));
        blockItem(BlockRegistration.FLOWERING_WILLOW_SLAB);
        stairsBlock((StairBlock) BlockRegistration.FLOWERING_WILLOW_STAIRS.get(), blockTexture(BlockRegistration.FLOWERING_WILLOW_PLANKS.get()));
        blockItem(BlockRegistration.FLOWERING_WILLOW_STAIRS);

        fenceBlock((FenceBlock) BlockRegistration.FLOWERING_WILLOW_FENCE.get(), blockTexture(BlockRegistration.FLOWERING_WILLOW_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) BlockRegistration.FLOWERING_WILLOW_FENCE_GATE.get(), blockTexture(BlockRegistration.FLOWERING_WILLOW_PLANKS.get()));
        blockItem(BlockRegistration.FLOWERING_WILLOW_FENCE_GATE);

        doorBlock((DoorBlock) BlockRegistration.FLOWERING_WILLOW_DOOR.get(), modLoc("block/flowering_willow_door_bottom"), modLoc("block/flowering_willow_door_top"));
        trapdoorBlock((TrapDoorBlock) BlockRegistration.FLOWERING_WILLOW_TRAPDOOR.get(), modLoc("block/flowering_willow_trapdoor"), true);
        trapdoorBlockItem(BlockRegistration.FLOWERING_WILLOW_TRAPDOOR);

        buttonBlock((ButtonBlock) BlockRegistration.FLOWERING_WILLOW_BUTTON.get(), blockTexture(BlockRegistration.FLOWERING_WILLOW_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) BlockRegistration.FLOWERING_WILLOW_PRESSURE_PLATE.get(), blockTexture(BlockRegistration.FLOWERING_WILLOW_PLANKS.get()));
        blockItem(BlockRegistration.FLOWERING_WILLOW_PRESSURE_PLATE);

        simpleBlockWithItem(BlockRegistration.FLOWERING_WILLOW_WINDOW.get(), models().cubeAll("flowering_willow_window", modLoc("block/flowering_willow_window")).renderType("cutout"));

        //POPLAR WOODSET
        blockWithItem((BlockRegistration.POPLAR_PLANKS));

        logBlockMaker(BlockRegistration.POPLAR_LOG, false);
        logBlockMaker(BlockRegistration.STRIPPED_POPLAR_LOG, false);
        logBlockMaker(BlockRegistration.POPLAR_WOOD, true);
        logBlockMaker(BlockRegistration.STRIPPED_POPLAR_WOOD, true);

        slabBlock((SlabBlock) BlockRegistration.POPLAR_SLAB.get(), blockTexture(BlockRegistration.POPLAR_PLANKS.get()), blockTexture(BlockRegistration.POPLAR_PLANKS.get()));
        blockItem(BlockRegistration.POPLAR_SLAB);
        stairsBlock((StairBlock) BlockRegistration.POPLAR_STAIRS.get(), blockTexture(BlockRegistration.POPLAR_PLANKS.get()));
        blockItem(BlockRegistration.POPLAR_STAIRS);

        fenceBlock((FenceBlock) BlockRegistration.POPLAR_FENCE.get(), blockTexture(BlockRegistration.POPLAR_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) BlockRegistration.POPLAR_FENCE_GATE.get(), blockTexture(BlockRegistration.POPLAR_PLANKS.get()));
        blockItem(BlockRegistration.POPLAR_FENCE_GATE);

        doorBlockWithRenderType((DoorBlock) BlockRegistration.POPLAR_DOOR.get(), modLoc("block/poplar_door_bottom"), modLoc("block/poplar_door_top"), "translucent");
        trapdoorBlockWithRenderType((TrapDoorBlock) BlockRegistration.POPLAR_TRAPDOOR.get(), modLoc("block/poplar_trapdoor"), true, "translucent");
        trapdoorBlockItem(BlockRegistration.POPLAR_TRAPDOOR);

        buttonBlock((ButtonBlock) BlockRegistration.POPLAR_BUTTON.get(), blockTexture(BlockRegistration.POPLAR_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) BlockRegistration.POPLAR_PRESSURE_PLATE.get(), blockTexture(BlockRegistration.POPLAR_PLANKS.get()));
        blockItem(BlockRegistration.POPLAR_PRESSURE_PLATE);

        simpleBlockWithItem(BlockRegistration.POPLAR_WINDOW.get(), models().cubeAll("poplar_window", modLoc("block/poplar_window")).renderType("translucent"));
        columnBlockWithItem(BlockRegistration.POPLAR_BOOKSHELF, BlockRegistration.POPLAR_PLANKS);

    }


    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    //yeah yeah everybody point and laugh at my string manipulation.
    private void columnBlockWithItem(RegistryObject<Block> blockRegistryObject, RegistryObject<Block> topBlock) {
        ResourceLocation sideTexture = modLoc("block/" + blockRegistryObject.getId().toString().replace("cluttered:", ""));
        ResourceLocation endTexture = modLoc("block/" + topBlock.getId().toString().replace("cluttered:", ""));

        simpleBlockWithItem(blockRegistryObject.get(), models().cubeColumn(blockRegistryObject.getId().toString(), sideTexture, endTexture));
    }

    private void logBlockMaker(RegistryObject<Block> log, boolean isWood){
        if (!isWood) {
            String woodType = log.getId().toString().replace("cluttered:","").replace("_log","");
            axisBlock((RotatedPillarBlock) log.get(),
                    new ResourceLocation(Cluttered.MODID + ":block/" + woodType + "_log"),
                    new ResourceLocation(Cluttered.MODID + ":block/" + woodType + "_log_top" ));
            blockItem(log);
        }
        else {
            String woodType = log.getId().toString().replace("cluttered:","").replace("_wood","");
            axisBlock((RotatedPillarBlock) log.get(),
                    new ResourceLocation(Cluttered.MODID + ":block/" + woodType + "_log"),
                    new ResourceLocation(Cluttered.MODID + ":block/" + woodType + "_log"));
            blockItem(log);
        }
    }

    //From the Kaupenjoe 1.20.1 tutorial #34
    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(Cluttered.MODID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void trapdoorBlockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(Cluttered.MODID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + "_bottom"));
    }

}
