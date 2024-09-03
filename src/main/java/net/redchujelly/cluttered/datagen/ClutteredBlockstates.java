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
        paneBlockWithRenderType((IronBarsBlock) BlockRegistration.WILLOW_WINDOW_PANE.get(), modLoc("block/willow_window"), modLoc("block/willow_glass_pane_top"), "cutout");

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
        paneBlockWithRenderType((IronBarsBlock) BlockRegistration.FLOWERING_WILLOW_WINDOW_PANE.get(), modLoc("block/flowering_willow_window"), modLoc("block/willow_glass_pane_top"), "cutout");

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
        paneBlockWithRenderType((IronBarsBlock) BlockRegistration.POPLAR_WINDOW_PANE.get(), modLoc("block/poplar_window"), modLoc("block/poplar_glass_pane_top"), "translucent");
        columnBlockWithItem(BlockRegistration.POPLAR_BOOKSHELF, BlockRegistration.POPLAR_PLANKS);

        //FLOWERING POPLAR WOODSET
        blockWithItem((BlockRegistration.FLOWERING_POPLAR_PLANKS));

        logBlockMaker(BlockRegistration.FLOWERING_POPLAR_LOG, false);
        logBlockMaker(BlockRegistration.STRIPPED_FLOWERING_POPLAR_LOG, false);
        logBlockMaker(BlockRegistration.FLOWERING_POPLAR_WOOD, true);
        logBlockMaker(BlockRegistration.STRIPPED_FLOWERING_POPLAR_WOOD, true);

        slabBlock((SlabBlock) BlockRegistration.FLOWERING_POPLAR_SLAB.get(), blockTexture(BlockRegistration.FLOWERING_POPLAR_PLANKS.get()), blockTexture(BlockRegistration.FLOWERING_POPLAR_PLANKS.get()));
        blockItem(BlockRegistration.FLOWERING_POPLAR_SLAB);
        stairsBlock((StairBlock) BlockRegistration.FLOWERING_POPLAR_STAIRS.get(), blockTexture(BlockRegistration.FLOWERING_POPLAR_PLANKS.get()));
        blockItem(BlockRegistration.FLOWERING_POPLAR_STAIRS);

        fenceBlock((FenceBlock) BlockRegistration.FLOWERING_POPLAR_FENCE.get(), blockTexture(BlockRegistration.FLOWERING_POPLAR_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) BlockRegistration.FLOWERING_POPLAR_FENCE_GATE.get(), blockTexture(BlockRegistration.FLOWERING_POPLAR_PLANKS.get()));
        blockItem(BlockRegistration.FLOWERING_POPLAR_FENCE_GATE);

        doorBlockWithRenderType((DoorBlock) BlockRegistration.FLOWERING_POPLAR_DOOR.get(), modLoc("block/flowering_poplar_door_bottom"), modLoc("block/flowering_poplar_door_top"), "translucent");
        trapdoorBlockWithRenderType((TrapDoorBlock) BlockRegistration.FLOWERING_POPLAR_TRAPDOOR.get(), modLoc("block/flowering_poplar_trapdoor"), true, "translucent");
        trapdoorBlockItem(BlockRegistration.FLOWERING_POPLAR_TRAPDOOR);

        buttonBlock((ButtonBlock) BlockRegistration.FLOWERING_POPLAR_BUTTON.get(), blockTexture(BlockRegistration.FLOWERING_POPLAR_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) BlockRegistration.FLOWERING_POPLAR_PRESSURE_PLATE.get(), blockTexture(BlockRegistration.FLOWERING_POPLAR_PLANKS.get()));
        blockItem(BlockRegistration.FLOWERING_POPLAR_PRESSURE_PLATE);

        simpleBlockWithItem(BlockRegistration.FLOWERING_POPLAR_WINDOW.get(), models().cubeAll("flowering_poplar_window", modLoc("block/flowering_poplar_window")).renderType("translucent"));
        paneBlockWithRenderType((IronBarsBlock) BlockRegistration.FLOWERING_POPLAR_WINDOW_PANE.get(), modLoc("block/flowering_poplar_window"), modLoc("block/poplar_glass_pane_top"), "translucent");
        columnBlockWithItem(BlockRegistration.FLOWERING_POPLAR_BOOKSHELF, BlockRegistration.FLOWERING_POPLAR_PLANKS);

        //CRABAPPLE WOODSET
        blockWithItem((BlockRegistration.CRABAPPLE_PLANKS));

        logBlockMaker(BlockRegistration.CRABAPPLE_LOG, false);
        logBlockMaker(BlockRegistration.STRIPPED_CRABAPPLE_LOG, false);
        logBlockMaker(BlockRegistration.CRABAPPLE_WOOD, true);
        logBlockMaker(BlockRegistration.STRIPPED_CRABAPPLE_WOOD, true);

        slabBlock((SlabBlock) BlockRegistration.CRABAPPLE_SLAB.get(), blockTexture(BlockRegistration.CRABAPPLE_PLANKS.get()), blockTexture(BlockRegistration.CRABAPPLE_PLANKS.get()));
        blockItem(BlockRegistration.CRABAPPLE_SLAB);
        stairsBlock((StairBlock) BlockRegistration.CRABAPPLE_STAIRS.get(), blockTexture(BlockRegistration.CRABAPPLE_PLANKS.get()));
        blockItem(BlockRegistration.CRABAPPLE_STAIRS);

        fenceBlock((FenceBlock) BlockRegistration.CRABAPPLE_FENCE.get(), blockTexture(BlockRegistration.CRABAPPLE_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) BlockRegistration.CRABAPPLE_FENCE_GATE.get(), blockTexture(BlockRegistration.CRABAPPLE_PLANKS.get()));
        blockItem(BlockRegistration.CRABAPPLE_FENCE_GATE);

        doorBlockWithRenderType((DoorBlock) BlockRegistration.CRABAPPLE_DOOR.get(), modLoc("block/crabapple_door_bottom"), modLoc("block/crabapple_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) BlockRegistration.CRABAPPLE_TRAPDOOR.get(), modLoc("block/crabapple_trapdoor"), true, "cutout");
        trapdoorBlockItem(BlockRegistration.CRABAPPLE_TRAPDOOR);

        buttonBlock((ButtonBlock) BlockRegistration.CRABAPPLE_BUTTON.get(), blockTexture(BlockRegistration.CRABAPPLE_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) BlockRegistration.CRABAPPLE_PRESSURE_PLATE.get(), blockTexture(BlockRegistration.CRABAPPLE_PLANKS.get()));
        blockItem(BlockRegistration.CRABAPPLE_PRESSURE_PLATE);

        simpleBlockWithItem(BlockRegistration.CRABAPPLE_WINDOW.get(), models().cubeAll("crabapple_window", modLoc("block/crabapple_window")).renderType("cutout"));
        paneBlockWithRenderType((IronBarsBlock) BlockRegistration.CRABAPPLE_WINDOW_PANE.get(), modLoc("block/crabapple_window"), modLoc("block/crabapple_glass_pane_top"), "cutout");
        columnBlockWithItem(BlockRegistration.CRABAPPLE_BOOKSHELF, BlockRegistration.CRABAPPLE_PLANKS);

        //FLOWERING CRABAPPLE WOODSET
        blockWithItem((BlockRegistration.FLOWERING_CRABAPPLE_PLANKS));

        logBlockMaker(BlockRegistration.FLOWERING_CRABAPPLE_LOG, false);
        logBlockMaker(BlockRegistration.STRIPPED_FLOWERING_CRABAPPLE_LOG, false);
        logBlockMaker(BlockRegistration.FLOWERING_CRABAPPLE_WOOD, true);
        logBlockMaker(BlockRegistration.STRIPPED_FLOWERING_CRABAPPLE_WOOD, true);

        slabBlock((SlabBlock) BlockRegistration.FLOWERING_CRABAPPLE_SLAB.get(), blockTexture(BlockRegistration.FLOWERING_CRABAPPLE_PLANKS.get()), blockTexture(BlockRegistration.FLOWERING_CRABAPPLE_PLANKS.get()));
        blockItem(BlockRegistration.FLOWERING_CRABAPPLE_SLAB);
        stairsBlock((StairBlock) BlockRegistration.FLOWERING_CRABAPPLE_STAIRS.get(), blockTexture(BlockRegistration.FLOWERING_CRABAPPLE_PLANKS.get()));
        blockItem(BlockRegistration.FLOWERING_CRABAPPLE_STAIRS);

        fenceBlock((FenceBlock) BlockRegistration.FLOWERING_CRABAPPLE_FENCE.get(), blockTexture(BlockRegistration.FLOWERING_CRABAPPLE_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) BlockRegistration.FLOWERING_CRABAPPLE_FENCE_GATE.get(), blockTexture(BlockRegistration.FLOWERING_CRABAPPLE_PLANKS.get()));
        blockItem(BlockRegistration.FLOWERING_CRABAPPLE_FENCE_GATE);

        doorBlockWithRenderType((DoorBlock) BlockRegistration.FLOWERING_CRABAPPLE_DOOR.get(), modLoc("block/flowering_crabapple_door_bottom"), modLoc("block/flowering_crabapple_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) BlockRegistration.FLOWERING_CRABAPPLE_TRAPDOOR.get(), modLoc("block/flowering_crabapple_trapdoor"), true, "cutout");
        trapdoorBlockItem(BlockRegistration.FLOWERING_CRABAPPLE_TRAPDOOR);

        buttonBlock((ButtonBlock) BlockRegistration.FLOWERING_CRABAPPLE_BUTTON.get(), blockTexture(BlockRegistration.FLOWERING_CRABAPPLE_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) BlockRegistration.FLOWERING_CRABAPPLE_PRESSURE_PLATE.get(), blockTexture(BlockRegistration.FLOWERING_CRABAPPLE_PLANKS.get()));
        blockItem(BlockRegistration.FLOWERING_CRABAPPLE_PRESSURE_PLATE);

        simpleBlockWithItem(BlockRegistration.FLOWERING_CRABAPPLE_WINDOW.get(), models().cubeAll("flowering_crabapple_window", modLoc("block/flowering_crabapple_window")).renderType("cutout"));
        paneBlockWithRenderType((IronBarsBlock) BlockRegistration.FLOWERING_CRABAPPLE_WINDOW_PANE.get(), modLoc("block/flowering_crabapple_window"), modLoc("block/crabapple_glass_pane_top"), "cutout");
        columnBlockWithItem(BlockRegistration.FLOWERING_CRABAPPLE_BOOKSHELF, BlockRegistration.FLOWERING_CRABAPPLE_PLANKS);

        //SYCAMORE WOODSET
        blockWithItem((BlockRegistration.SYCAMORE_PLANKS));

        logBlockMaker(BlockRegistration.SYCAMORE_LOG, false);
        logBlockMaker(BlockRegistration.STRIPPED_SYCAMORE_LOG, false);
        logBlockMaker(BlockRegistration.SYCAMORE_WOOD, true);
        logBlockMaker(BlockRegistration.STRIPPED_SYCAMORE_WOOD, true);

        slabBlock((SlabBlock) BlockRegistration.SYCAMORE_SLAB.get(), blockTexture(BlockRegistration.SYCAMORE_PLANKS.get()), blockTexture(BlockRegistration.SYCAMORE_PLANKS.get()));
        blockItem(BlockRegistration.SYCAMORE_SLAB);
        stairsBlock((StairBlock) BlockRegistration.SYCAMORE_STAIRS.get(), blockTexture(BlockRegistration.SYCAMORE_PLANKS.get()));
        blockItem(BlockRegistration.SYCAMORE_STAIRS);

        fenceBlock((FenceBlock) BlockRegistration.SYCAMORE_FENCE.get(), blockTexture(BlockRegistration.SYCAMORE_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) BlockRegistration.SYCAMORE_FENCE_GATE.get(), blockTexture(BlockRegistration.SYCAMORE_PLANKS.get()));
        blockItem(BlockRegistration.SYCAMORE_FENCE_GATE);

        doorBlock((DoorBlock) BlockRegistration.SYCAMORE_DOOR.get(), modLoc("block/sycamore_door_bottom"), modLoc("block/sycamore_door_top"));
        trapdoorBlock((TrapDoorBlock) BlockRegistration.SYCAMORE_TRAPDOOR.get(), modLoc("block/sycamore_trapdoor"), true);
        trapdoorBlockItem(BlockRegistration.SYCAMORE_TRAPDOOR);

        buttonBlock((ButtonBlock) BlockRegistration.SYCAMORE_BUTTON.get(), blockTexture(BlockRegistration.SYCAMORE_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) BlockRegistration.SYCAMORE_PRESSURE_PLATE.get(), blockTexture(BlockRegistration.SYCAMORE_PLANKS.get()));
        blockItem(BlockRegistration.SYCAMORE_PRESSURE_PLATE);

        simpleBlockWithItem(BlockRegistration.SYCAMORE_WINDOW.get(), models().cubeAll("sycamore_window", modLoc("block/sycamore_window")).renderType("cutout"));
        paneBlockWithRenderType((IronBarsBlock) BlockRegistration.SYCAMORE_WINDOW_PANE.get(), modLoc("block/sycamore_window"), modLoc("block/sycamore_glass_pane_top"), "cutout");
        columnBlockWithItem(BlockRegistration.SYCAMORE_BOOKSHELF, BlockRegistration.SYCAMORE_PLANKS);

        //FLUORESCENT MAPLE WOODSET
        blockWithItem((BlockRegistration.MAPLE_PLANKS));

        logBlockMaker(BlockRegistration.MAPLE_LOG, false);
        logBlockMaker(BlockRegistration.STRIPPED_MAPLE_LOG, false);
        logBlockMaker(BlockRegistration.MAPLE_WOOD, true);
        logBlockMaker(BlockRegistration.STRIPPED_MAPLE_WOOD, true);

        slabBlock((SlabBlock) BlockRegistration.MAPLE_SLAB.get(), blockTexture(BlockRegistration.MAPLE_PLANKS.get()), blockTexture(BlockRegistration.MAPLE_PLANKS.get()));
        blockItem(BlockRegistration.MAPLE_SLAB);
        stairsBlock((StairBlock) BlockRegistration.MAPLE_STAIRS.get(), blockTexture(BlockRegistration.MAPLE_PLANKS.get()));
        blockItem(BlockRegistration.MAPLE_STAIRS);

        fenceBlock((FenceBlock) BlockRegistration.MAPLE_FENCE.get(), blockTexture(BlockRegistration.MAPLE_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) BlockRegistration.MAPLE_FENCE_GATE.get(), blockTexture(BlockRegistration.MAPLE_PLANKS.get()));
        blockItem(BlockRegistration.MAPLE_FENCE_GATE);

        doorBlockWithRenderType((DoorBlock) BlockRegistration.MAPLE_DOOR.get(), modLoc("block/fluorescent_maple_door_bottom"), modLoc("block/fluorescent_maple_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) BlockRegistration.MAPLE_TRAPDOOR.get(), modLoc("block/fluorescent_maple_trapdoor"), true, "cutout");
        trapdoorBlockItem(BlockRegistration.MAPLE_TRAPDOOR);

        buttonBlock((ButtonBlock) BlockRegistration.MAPLE_BUTTON.get(), blockTexture(BlockRegistration.MAPLE_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) BlockRegistration.MAPLE_PRESSURE_PLATE.get(), blockTexture(BlockRegistration.MAPLE_PLANKS.get()));
        blockItem(BlockRegistration.MAPLE_PRESSURE_PLATE);

        simpleBlockWithItem(BlockRegistration.MAPLE_WINDOW.get(), models().cubeAll("fluorescent_maple_window", modLoc("block/fluorescent_maple_window")).renderType("cutout"));
        paneBlockWithRenderType((IronBarsBlock) BlockRegistration.MAPLE_WINDOW_PANE.get(), modLoc("block/fluorescent_maple_window"), modLoc("block/maple_glass_pane_top"), "cutout");
        columnBlockWithItem(BlockRegistration.MAPLE_BOOKSHELF, BlockRegistration.MAPLE_PLANKS);

        //BLUE MUSHROOM WOODSET
        blockWithItem((BlockRegistration.BLUE_MUSHROOM_PLANKS));
        blockWithItem((BlockRegistration.BLUE_MUSHROOM_CAP));

        logBlockMaker(BlockRegistration.BLUE_MUSHROOM_LOG, false);
        logBlockMaker(BlockRegistration.BLUE_MUSHROOM_WOOD, true);

        slabBlock((SlabBlock) BlockRegistration.BLUE_MUSHROOM_SLAB.get(), blockTexture(BlockRegistration.BLUE_MUSHROOM_PLANKS.get()), blockTexture(BlockRegistration.BLUE_MUSHROOM_PLANKS.get()));
        blockItem(BlockRegistration.BLUE_MUSHROOM_SLAB);
        stairsBlock((StairBlock) BlockRegistration.BLUE_MUSHROOM_STAIRS.get(), blockTexture(BlockRegistration.BLUE_MUSHROOM_PLANKS.get()));
        blockItem(BlockRegistration.BLUE_MUSHROOM_STAIRS);

        fenceBlock((FenceBlock) BlockRegistration.BLUE_MUSHROOM_FENCE.get(), blockTexture(BlockRegistration.BLUE_MUSHROOM_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) BlockRegistration.BLUE_MUSHROOM_FENCE_GATE.get(), blockTexture(BlockRegistration.BLUE_MUSHROOM_PLANKS.get()));
        blockItem(BlockRegistration.BLUE_MUSHROOM_FENCE_GATE);

        doorBlock((DoorBlock) BlockRegistration.BLUE_MUSHROOM_DOOR.get(), modLoc("block/blue_mushroom_door_bottom"), modLoc("block/blue_mushroom_door_top"));
        trapdoorBlock((TrapDoorBlock) BlockRegistration.BLUE_MUSHROOM_TRAPDOOR.get(), modLoc("block/blue_mushroom_trapdoor"), true);
        trapdoorBlockItem(BlockRegistration.BLUE_MUSHROOM_TRAPDOOR);

        buttonBlock((ButtonBlock) BlockRegistration.BLUE_MUSHROOM_BUTTON.get(), blockTexture(BlockRegistration.BLUE_MUSHROOM_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) BlockRegistration.BLUE_MUSHROOM_PRESSURE_PLATE.get(), blockTexture(BlockRegistration.BLUE_MUSHROOM_PLANKS.get()));
        blockItem(BlockRegistration.BLUE_MUSHROOM_PRESSURE_PLATE);

        simpleBlockWithItem(BlockRegistration.BLUE_MUSHROOM_WINDOW.get(), models().cubeAll("blue_mushroom_window", modLoc("block/blue_mushroom_window")).renderType("cutout"));
        paneBlockWithRenderType((IronBarsBlock) BlockRegistration.BLUE_MUSHROOM_WINDOW_PANE.get(), modLoc("block/blue_mushroom_window"), modLoc("block/blue_mushroom_glass_pane_top"), "cutout");
        columnBlockWithItem(BlockRegistration.BLUE_MUSHROOM_BOOKSHELF, BlockRegistration.BLUE_MUSHROOM_PLANKS);
        
        //RED MUSHROOM WOODSET
        blockWithItem((BlockRegistration.RED_MUSHROOM_PLANKS));
        blockWithItem((BlockRegistration.RED_MUSHROOM_CAP));

        logBlockMaker(BlockRegistration.RED_MUSHROOM_LOG, false);
        logBlockMaker(BlockRegistration.RED_MUSHROOM_WOOD, true);

        slabBlock((SlabBlock) BlockRegistration.RED_MUSHROOM_SLAB.get(), blockTexture(BlockRegistration.RED_MUSHROOM_PLANKS.get()), blockTexture(BlockRegistration.RED_MUSHROOM_PLANKS.get()));
        blockItem(BlockRegistration.RED_MUSHROOM_SLAB);
        stairsBlock((StairBlock) BlockRegistration.RED_MUSHROOM_STAIRS.get(), blockTexture(BlockRegistration.RED_MUSHROOM_PLANKS.get()));
        blockItem(BlockRegistration.RED_MUSHROOM_STAIRS);

        fenceBlock((FenceBlock) BlockRegistration.RED_MUSHROOM_FENCE.get(), blockTexture(BlockRegistration.RED_MUSHROOM_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) BlockRegistration.RED_MUSHROOM_FENCE_GATE.get(), blockTexture(BlockRegistration.RED_MUSHROOM_PLANKS.get()));
        blockItem(BlockRegistration.RED_MUSHROOM_FENCE_GATE);

        doorBlock((DoorBlock) BlockRegistration.RED_MUSHROOM_DOOR.get(), modLoc("block/red_mushroom_door_bottom"), modLoc("block/red_mushroom_door_top"));
        trapdoorBlock((TrapDoorBlock) BlockRegistration.RED_MUSHROOM_TRAPDOOR.get(), modLoc("block/red_mushroom_trapdoor"), true);
        trapdoorBlockItem(BlockRegistration.RED_MUSHROOM_TRAPDOOR);

        buttonBlock((ButtonBlock) BlockRegistration.RED_MUSHROOM_BUTTON.get(), blockTexture(BlockRegistration.RED_MUSHROOM_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) BlockRegistration.RED_MUSHROOM_PRESSURE_PLATE.get(), blockTexture(BlockRegistration.RED_MUSHROOM_PLANKS.get()));
        blockItem(BlockRegistration.RED_MUSHROOM_PRESSURE_PLATE);

        simpleBlockWithItem(BlockRegistration.RED_MUSHROOM_WINDOW.get(), models().cubeAll("red_mushroom_window", modLoc("block/red_mushroom_window")).renderType("cutout"));
        paneBlockWithRenderType((IronBarsBlock) BlockRegistration.RED_MUSHROOM_WINDOW_PANE.get(), modLoc("block/red_mushroom_window"), modLoc("block/red_mushroom_glass_pane_top"), "cutout");
        columnBlockWithItem(BlockRegistration.RED_MUSHROOM_BOOKSHELF, BlockRegistration.RED_MUSHROOM_PLANKS);

        //MISC BLOCKS
        //CHALCEDONY
        blockWithItem((BlockRegistration.CHALCEDONY));
        slabBlock((SlabBlock) BlockRegistration.CHALCEDONY_SLAB.get(), blockTexture(BlockRegistration.CHALCEDONY.get()), blockTexture(BlockRegistration.CHALCEDONY.get()));
        blockItem(BlockRegistration.CHALCEDONY_SLAB);
        stairsBlock((StairBlock) BlockRegistration.CHALCEDONY_STAIRS.get(), blockTexture(BlockRegistration.CHALCEDONY.get()));
        blockItem(BlockRegistration.CHALCEDONY_STAIRS);
        blockWithItem((BlockRegistration.POLISHED_CHALCEDONY));
        blockWithItem((BlockRegistration.CHALCEDONY_BRICKS));
        slabBlock((SlabBlock) BlockRegistration.CHALCEDONY_BRICK_SLAB.get(), blockTexture(BlockRegistration.CHALCEDONY_BRICKS.get()), blockTexture(BlockRegistration.CHALCEDONY_BRICKS.get()));
        blockItem(BlockRegistration.CHALCEDONY_BRICK_SLAB);
        stairsBlock((StairBlock) BlockRegistration.CHALCEDONY_BRICK_STAIRS.get(), blockTexture(BlockRegistration.CHALCEDONY_BRICKS.get()));
        blockItem(BlockRegistration.CHALCEDONY_BRICK_STAIRS);
        blockWithItem((BlockRegistration.CHISELED_CHALCEDONY));
        horizontalBlock(BlockRegistration.CHALCEDONY_BORDER.get(), modLoc("block/chalcedony_border"), modLoc("block/chalcedony_border"), modLoc("block/chalcedony_border"));
        blockItem(BlockRegistration.CHALCEDONY_BORDER);
        horizontalBlock(BlockRegistration.CHALCEDONY_ACANTHUS.get(), modLoc("block/chalcedony_acanthus"), modLoc("block/chalcedony_acanthus"), modLoc("block/chalcedony_acanthus"));
        blockItem(BlockRegistration.CHALCEDONY_ACANTHUS);
        horizontalBlock(BlockRegistration.CHALCEDONY_HELIX.get(), modLoc("block/chalcedony_helix"), modLoc("block/chalcedony_helix"), modLoc("block/chalcedony_helix"));
        blockItem(BlockRegistration.CHALCEDONY_HELIX);
        blockWithItem((BlockRegistration.CHALCEDONY_TILES));
        blockWithItem((BlockRegistration.CHALCEDONY_SMALL_TILES));
        blockWithItem((BlockRegistration.STARRY_CHISELED_CHALCEDONY));
        axisBlock((RotatedPillarBlock) BlockRegistration.CHALCEDONY_PILLAR.get(),
                new ResourceLocation(Cluttered.MODID + ":block/chalcedony_pillar"),
                new ResourceLocation(Cluttered.MODID + ":block/chalcedony_pillar_top" ));
        blockItem(BlockRegistration.CHALCEDONY_PILLAR);

        directionalBlock(BlockRegistration.CHALCEDONY_PILLAR_BASE.get(), models().cubeColumn("block/chalcedony_pillar_base", modLoc("block/chalcedony_pillar_base"), modLoc("block/chalcedony_pillar_top")));
        blockItem(BlockRegistration.CHALCEDONY_PILLAR_BASE);
        directionalBlock(BlockRegistration.CHALCEDONY_PILLAR_DORIC.get(), models().cubeColumn("block/chalcedony_pillar_doric", modLoc("block/chalcedony_pillar_doric"), modLoc("block/chalcedony_pillar_top")));
        blockItem(BlockRegistration.CHALCEDONY_PILLAR_DORIC);
        directionalBlock(BlockRegistration.CHALCEDONY_PILLAR_IONIC.get(), models().cubeColumn("block/chalcedony_pillar_ionic", modLoc("block/chalcedony_pillar_ionic"), modLoc("block/chalcedony_pillar_top")));
        blockItem(BlockRegistration.CHALCEDONY_PILLAR_IONIC);

        axisBlock((RotatedPillarBlock) BlockRegistration.STARRY_CHALCEDONY_PILLAR.get(),
                new ResourceLocation(Cluttered.MODID + ":block/chalcedony_pillar_starry"),
                new ResourceLocation(Cluttered.MODID + ":block/chalcedony_pillar_starry_top" ));
        blockItem(BlockRegistration.STARRY_CHALCEDONY_PILLAR);

        directionalBlock(BlockRegistration.STARRY_CHALCEDONY_PILLAR_BASE.get(), models().cubeColumn("block/chalcedony_pillar_starry_base", modLoc("block/chalcedony_pillar_starry_base"), modLoc("block/chalcedony_pillar_starry_top")));
        blockItem(BlockRegistration.STARRY_CHALCEDONY_PILLAR_BASE);
        directionalBlock(BlockRegistration.STARRY_CHALCEDONY_PILLAR_DORIC.get(), models().cubeColumn("block/chalcedony_pillar_starry_doric", modLoc("block/chalcedony_pillar_starry_doric"), modLoc("block/chalcedony_pillar_starry_top")));
        blockItem(BlockRegistration.STARRY_CHALCEDONY_PILLAR_DORIC);
        directionalBlock(BlockRegistration.STARRY_CHALCEDONY_PILLAR_IONIC.get(), models().cubeColumn("block/chalcedony_pillar_starry_ionic", modLoc("block/chalcedony_pillar_starry_ionic"), modLoc("block/chalcedony_pillar_starry_top")));
        blockItem(BlockRegistration.STARRY_CHALCEDONY_PILLAR_IONIC);

        simpleBlockWithItem(BlockRegistration.CHALCEDONY_WINDOW.get(), models().cubeAll("chalcedony_window", modLoc("block/chalcedony_window")).renderType("cutout"));
        paneBlockWithRenderType((IronBarsBlock) BlockRegistration.CHALCEDONY_WINDOW_PANE.get(), modLoc("block/chalcedony_window"), modLoc("block/chalcedony_glass_pane_top"), "cutout");


        //DEEP CHALCEDONY
        blockWithItem((BlockRegistration.DEEP_CHALCEDONY));
        slabBlock((SlabBlock) BlockRegistration.DEEP_CHALCEDONY_SLAB.get(), blockTexture(BlockRegistration.DEEP_CHALCEDONY.get()), blockTexture(BlockRegistration.DEEP_CHALCEDONY.get()));
        blockItem(BlockRegistration.DEEP_CHALCEDONY_SLAB);
        stairsBlock((StairBlock) BlockRegistration.DEEP_CHALCEDONY_STAIRS.get(), blockTexture(BlockRegistration.DEEP_CHALCEDONY.get()));
        blockItem(BlockRegistration.DEEP_CHALCEDONY_STAIRS);
        blockWithItem((BlockRegistration.DEEP_POLISHED_CHALCEDONY));
        blockWithItem((BlockRegistration.DEEP_CHALCEDONY_BRICKS));
        slabBlock((SlabBlock) BlockRegistration.DEEP_CHALCEDONY_BRICK_SLAB.get(), blockTexture(BlockRegistration.DEEP_CHALCEDONY_BRICKS.get()), blockTexture(BlockRegistration.DEEP_CHALCEDONY_BRICKS.get()));
        blockItem(BlockRegistration.DEEP_CHALCEDONY_BRICK_SLAB);
        stairsBlock((StairBlock) BlockRegistration.DEEP_CHALCEDONY_BRICK_STAIRS.get(), blockTexture(BlockRegistration.DEEP_CHALCEDONY_BRICKS.get()));
        blockItem(BlockRegistration.DEEP_CHALCEDONY_BRICK_STAIRS);
        blockWithItem((BlockRegistration.DEEP_CHISELED_CHALCEDONY));
        horizontalBlock(BlockRegistration.DEEP_CHALCEDONY_BORDER.get(), modLoc("block/deep_chalcedony_border"), modLoc("block/deep_chalcedony_border"), modLoc("block/deep_chalcedony_border"));
        blockItem(BlockRegistration.DEEP_CHALCEDONY_BORDER);
        horizontalBlock(BlockRegistration.DEEP_CHALCEDONY_ACANTHUS.get(), modLoc("block/deep_chalcedony_acanthus"), modLoc("block/deep_chalcedony_acanthus"), modLoc("block/deep_chalcedony_acanthus"));
        blockItem(BlockRegistration.DEEP_CHALCEDONY_ACANTHUS);
        horizontalBlock(BlockRegistration.DEEP_CHALCEDONY_HELIX.get(), modLoc("block/deep_chalcedony_helix"), modLoc("block/deep_chalcedony_helix"), modLoc("block/deep_chalcedony_helix"));
        blockItem(BlockRegistration.DEEP_CHALCEDONY_HELIX);
        blockWithItem((BlockRegistration.DEEP_CHALCEDONY_TILES));
        blockWithItem((BlockRegistration.DEEP_CHALCEDONY_SMALL_TILES));
        blockWithItem((BlockRegistration.DEEP_STARRY_CHISELED_CHALCEDONY));
        axisBlock((RotatedPillarBlock) BlockRegistration.DEEP_CHALCEDONY_PILLAR.get(),
                new ResourceLocation(Cluttered.MODID + ":block/deep_chalcedony_pillar"),
                new ResourceLocation(Cluttered.MODID + ":block/deep_chalcedony_pillar_top"));
        blockItem(BlockRegistration.DEEP_CHALCEDONY_PILLAR);

        directionalBlock(BlockRegistration.DEEP_CHALCEDONY_PILLAR_BASE.get(), models().cubeColumn("block/deep_chalcedony_pillar_base", modLoc("block/deep_chalcedony_pillar_base"), modLoc("block/deep_chalcedony_pillar_top")));
        blockItem(BlockRegistration.DEEP_CHALCEDONY_PILLAR_BASE);
        directionalBlock(BlockRegistration.DEEP_CHALCEDONY_PILLAR_DORIC.get(), models().cubeColumn("block/deep_chalcedony_pillar_doric", modLoc("block/deep_chalcedony_pillar_doric"), modLoc("block/deep_chalcedony_pillar_top")));
        blockItem(BlockRegistration.DEEP_CHALCEDONY_PILLAR_DORIC);
        directionalBlock(BlockRegistration.DEEP_CHALCEDONY_PILLAR_IONIC.get(), models().cubeColumn("block/deep_chalcedony_pillar_ionic", modLoc("block/deep_chalcedony_pillar_ionic"), modLoc("block/deep_chalcedony_pillar_top")));
        blockItem(BlockRegistration.DEEP_CHALCEDONY_PILLAR_IONIC);

        axisBlock((RotatedPillarBlock) BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR.get(),
                new ResourceLocation(Cluttered.MODID + ":block/deep_chalcedony_pillar_starry"),
                new ResourceLocation(Cluttered.MODID + ":block/deep_chalcedony_pillar_starry_top"));
        blockItem(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR);

        directionalBlock(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_BASE.get(), models().cubeColumn("block/deep_chalcedony_pillar_starry_base", modLoc("block/deep_chalcedony_pillar_starry_base"), modLoc("block/deep_chalcedony_pillar_starry_top")));
        blockItem(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_BASE);
        directionalBlock(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_DORIC.get(), models().cubeColumn("block/deep_chalcedony_pillar_starry_doric", modLoc("block/deep_chalcedony_pillar_starry_doric"), modLoc("block/deep_chalcedony_pillar_starry_top")));
        blockItem(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_DORIC);
        directionalBlock(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_IONIC.get(), models().cubeColumn("block/deep_chalcedony_pillar_starry_ionic", modLoc("block/deep_chalcedony_pillar_starry_ionic"), modLoc("block/deep_chalcedony_pillar_starry_top")));
        blockItem(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_IONIC);

        simpleBlockWithItem(BlockRegistration.DEEP_CHALCEDONY_WINDOW.get(), models().cubeAll("deep_chalcedony_window", modLoc("block/deep_chalcedony_window")).renderType("cutout"));
        paneBlockWithRenderType((IronBarsBlock) BlockRegistration.DEEP_CHALCEDONY_WINDOW_PANE.get(), modLoc("block/deep_chalcedony_window"), modLoc("block/deep_chalcedony_glass_pane_top"), "cutout");



        //MARBLE
        blockWithItem((BlockRegistration.MARBLE));
        slabBlock((SlabBlock) BlockRegistration.MARBLE_SLAB.get(), blockTexture(BlockRegistration.MARBLE.get()), blockTexture(BlockRegistration.MARBLE.get()));
        blockItem(BlockRegistration.MARBLE_SLAB);
        stairsBlock((StairBlock) BlockRegistration.MARBLE_STAIRS.get(), blockTexture(BlockRegistration.MARBLE.get()));
        blockItem(BlockRegistration.MARBLE_STAIRS);
        blockWithItem((BlockRegistration.POLISHED_MARBLE));
        blockWithItem((BlockRegistration.MARBLE_BRICKS));
        slabBlock((SlabBlock) BlockRegistration.MARBLE_BRICK_SLAB.get(), blockTexture(BlockRegistration.MARBLE_BRICKS.get()), blockTexture(BlockRegistration.MARBLE_BRICKS.get()));
        blockItem(BlockRegistration.MARBLE_BRICK_SLAB);
        stairsBlock((StairBlock) BlockRegistration.MARBLE_BRICK_STAIRS.get(), blockTexture(BlockRegistration.MARBLE_BRICKS.get()));
        blockItem(BlockRegistration.MARBLE_BRICK_STAIRS);
        blockWithItem((BlockRegistration.CHISELED_MARBLE));
        horizontalBlock(BlockRegistration.MARBLE_BORDER.get(), modLoc("block/marble_border"), modLoc("block/marble_border"), modLoc("block/marble_border"));
        blockItem(BlockRegistration.MARBLE_BORDER);
        horizontalBlock(BlockRegistration.MARBLE_ACANTHUS.get(), modLoc("block/marble_acanthus"), modLoc("block/marble_acanthus"), modLoc("block/marble_acanthus"));
        blockItem(BlockRegistration.MARBLE_ACANTHUS);
        horizontalBlock(BlockRegistration.MARBLE_HELIX.get(), modLoc("block/marble_helix"), modLoc("block/marble_helix"), modLoc("block/marble_helix"));
        blockItem(BlockRegistration.MARBLE_HELIX);
        blockWithItem((BlockRegistration.MARBLE_TILES));
        blockWithItem((BlockRegistration.MARBLE_SMALL_TILES));
        blockWithItem((BlockRegistration.STARRY_CHISELED_MARBLE));
        axisBlock((RotatedPillarBlock) BlockRegistration.MARBLE_PILLAR.get(),
                new ResourceLocation(Cluttered.MODID + ":block/marble_pillar"),
                new ResourceLocation(Cluttered.MODID + ":block/marble_pillar_top"));
        blockItem(BlockRegistration.MARBLE_PILLAR);

        directionalBlock(BlockRegistration.MARBLE_PILLAR_BASE.get(), models().cubeColumn("block/marble_pillar_base", modLoc("block/marble_pillar_base"), modLoc("block/marble_pillar_top")));
        blockItem(BlockRegistration.MARBLE_PILLAR_BASE);
        directionalBlock(BlockRegistration.MARBLE_PILLAR_DORIC.get(), models().cubeColumn("block/marble_pillar_doric", modLoc("block/marble_pillar_doric"), modLoc("block/marble_pillar_top")));
        blockItem(BlockRegistration.MARBLE_PILLAR_DORIC);
        directionalBlock(BlockRegistration.MARBLE_PILLAR_IONIC.get(), models().cubeColumn("block/marble_pillar_ionic", modLoc("block/marble_pillar_ionic"), modLoc("block/marble_pillar_top")));
        blockItem(BlockRegistration.MARBLE_PILLAR_IONIC);

        //MISC FULL BLOCKS
        simpleBlockWithItem(BlockRegistration.BLACK_CAT_WINDOW.get(), models().cubeAll("black_cat_window", modLoc("block/black_cat_window")).renderType("cutout"));
        paneBlockWithRenderType((IronBarsBlock) BlockRegistration.BLACK_CAT_WINDOW_PANE.get(), modLoc("block/black_cat_window"), modLoc("block/cat_glass_pane_top"), "cutout");

        simpleBlockWithItem(BlockRegistration.YELLOW_PLANTER.get(), models().cubeTop("tarrey_town_planter_yellow", modLoc("block/tarrey_town_planter_yellow"), modLoc("block/tarrey_town_planter_top")));
        simpleBlockWithItem(BlockRegistration.PINK_PLANTER.get(), models().cubeTop("tarrey_town_planter_pink", modLoc("block/tarrey_town_planter_pink"), modLoc("block/tarrey_town_planter_top")));
        simpleBlockWithItem(BlockRegistration.PURPLE_PLANTER.get(), models().cubeTop("tarrey_town_planter_purple", modLoc("block/tarrey_town_planter_purple"), modLoc("block/tarrey_town_planter_top")));
        simpleBlockWithItem(BlockRegistration.BEIGE_PLANTER.get(), models().cubeTop("tarrey_town_planter_beige", modLoc("block/tarrey_town_planter_beige"), modLoc("block/tarrey_town_planter_top")));
        simpleBlockWithItem(BlockRegistration.GREEN_PLANTER.get(), models().cubeTop("tarrey_town_planter_green", modLoc("block/tarrey_town_planter_green"), modLoc("block/tarrey_town_planter_top")));
        simpleBlockWithItem(BlockRegistration.FLUORESCENT_PLANTER.get(), models().cubeTop("tarrey_town_planter_fluorescent", modLoc("block/tarrey_town_planter_fluorescent"), modLoc("block/tarrey_town_planter_top")));
        simpleBlockWithItem(BlockRegistration.RED_PLANTER.get(), models().cubeTop("tarrey_town_planter_red", modLoc("block/tarrey_town_planter_red"), modLoc("block/tarrey_town_planter_top")));
        simpleBlockWithItem(BlockRegistration.BLUE_PLANTER.get(), models().cubeTop("tarrey_town_planter_blue", modLoc("block/tarrey_town_planter_blue"), modLoc("block/tarrey_town_planter_top")));

        blockWithItem(BlockRegistration.STARRY_WALLPAPER);
        simpleBlockWithItem(BlockRegistration.STARRY_WALLPAPER_TOP.get(), models().cubeColumn("starry_wallpaper_upper_trim", modLoc("block/starry_wallpaper_upper_trim"), modLoc("block/starry_wallpaper")));
        simpleBlockWithItem(BlockRegistration.STARRY_WALLPAPER_BOTTOM.get(), models().cubeColumn("starry_wallpaper_lower_trim", modLoc("block/starry_wallpaper_lower_trim"), modLoc("block/starry_wallpaper")));
        blockWithItem(BlockRegistration.DARK_STARRY_WALLPAPER);
        simpleBlockWithItem(BlockRegistration.DARK_STARRY_WALLPAPER_TOP.get(), models().cubeColumn("dark_starry_wallpaper_upper_trim", modLoc("block/dark_starry_wallpaper_upper_trim"), modLoc("block/dark_starry_wallpaper")));
        simpleBlockWithItem(BlockRegistration.DARK_STARRY_WALLPAPER_BOTTOM.get(), models().cubeColumn("dark_starry_wallpaper_lower_trim", modLoc("block/dark_starry_wallpaper_lower_trim"), modLoc("block/dark_starry_wallpaper")));

        blockWithItem(BlockRegistration.RETRO_RAINBOW_WALLPAPER);
        blockWithItem(BlockRegistration.APPLE_WALLPAPER);
        blockWithItem(BlockRegistration.BLUE_ROSE_STRIPED_WALLPAPER);
        blockWithItem(BlockRegistration.CHECKERED_FRUIT_WALLPAPER);
        blockWithItem(BlockRegistration.CHECKERED_GREEN_WALLPAPER);
        blockWithItem(BlockRegistration.CHECKERED_GREEN_STRAWBERRY_WALLPAPER);
        blockWithItem(BlockRegistration.CHECKERED_PINK_WALLPAPER);
        blockWithItem(BlockRegistration.CHECKERED_PINK_STRAWBERRY_WALLPAPER);

        blockWithItem(BlockRegistration.CHIC_WALLPAPER);
        simpleBlockWithItem(BlockRegistration.CHIC_WALLPAPER_UPPER_TRIM.get(), models().cubeColumn("chic_wallpaper_upper_trim", modLoc("block/chic_wallpaper_upper_trim"), modLoc("block/chic_wallpaper")));
        simpleBlockWithItem(BlockRegistration.CHIC_WALLPAPER_LOWER_TRIM.get(), models().cubeColumn("chic_wallpaper_lower_trim", modLoc("block/chic_wallpaper_lower_trim"), modLoc("block/chic_wallpaper")));
        blockWithItem(BlockRegistration.FLORAL_BERRY_WALLPAPER);
        blockWithItem(BlockRegistration.FLORAL_BORDER_WALLPAPER);
        blockWithItem(BlockRegistration.CONFECTIONARY_WALLPAPER);
        blockWithItem(BlockRegistration.GHOST_WALLPAPER);
        simpleBlockWithItem(BlockRegistration.GHOST_WALLPAPER_TRIM.get(), models().cubeColumn("ghost_wallpaper_trim", modLoc("block/ghost_wallpaper_trim"), modLoc("block/ghost_wallpaper")));
        blockWithItem(BlockRegistration.GHOST_WALLPAPER_WAINSCOTING);

        blockWithItem(BlockRegistration.HALLOWEEN_WALLPAPER);
        blockWithItem(BlockRegistration.HALLOWEEN_WAINSCOTING);
        blockWithItem(BlockRegistration.MARIGOLD_WALLPAPER);
        blockWithItem(BlockRegistration.MINT_WALLPAPER);
        blockWithItem(BlockRegistration.PINK_STRIPE_WALLPAPER);
        simpleBlockWithItem(BlockRegistration.PINK_STRIPE_WALLPAPER_LOWER_TRIM.get(), models().cubeColumn("pink_striped_wallpaper_lower_trim", modLoc("block/pink_striped_wallpaper_lower_trim"), modLoc("block/pink_striped_wallpaper")));
        simpleBlockWithItem(BlockRegistration.PINK_STRIPE_WALLPAPER_UPPER_TRIM.get(), models().cubeColumn("pink_striped_wallpaper_upper_trim", modLoc("block/pink_striped_wallpaper_upper_trim"), modLoc("block/pink_striped_wallpaper")));
        blockWithItem(BlockRegistration.RIALTO_GOLD_WALLPAPER);
        blockWithItem(BlockRegistration.STRIPED_FLORAL_WALLPAPER);

        blockWithItem(BlockRegistration.DIAMOND_WALLPAPER_APPLE);
        blockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY);
        blockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY);
        blockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BONES);
        blockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET);
        blockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM);
        blockWithItem(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES);
        blockWithItem(BlockRegistration.DIAMOND_WALLPAPER_LEMON);
        blockWithItem(BlockRegistration.DIAMOND_WALLPAPER_ORANGE);
        blockWithItem(BlockRegistration.DIAMOND_WALLPAPER_PEAR);
        blockWithItem(BlockRegistration.DIAMOND_WALLPAPER_PLUM);
        blockWithItem(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM);
        blockWithItem(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES);
        blockWithItem(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY);
        blockWithItem(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR);

        //with the intention of putting top textures in possibly
        simpleBlockWithItem(BlockRegistration.BLUE_WAINSCOTING.get(), models().cubeColumn("blue_wainscoting", modLoc("block/blue_wainscoting"), modLoc("block/blue_wainscoting")));
        simpleBlockWithItem(BlockRegistration.BROWN_WAINSCOTING.get(), models().cubeColumn("brown_wainscoting", modLoc("block/brown_wainscoting"), modLoc("block/brown_wainscoting")));
        simpleBlockWithItem(BlockRegistration.WILLOW_WAINSCOTING.get(), models().cubeColumn("willow_wainscoting", modLoc("block/willow_wainscoting"), modLoc("block/willow_wainscoting")));
        simpleBlockWithItem(BlockRegistration.FLOWERING_WILLOW_WAINSCOTING.get(), models().cubeColumn("flowering_willow_wainscoting", modLoc("block/flowering_willow_wainscoting"), modLoc("block/flowering_willow_wainscoting")));
        simpleBlockWithItem(BlockRegistration.POPLAR_WAINSCOTING.get(), models().cubeColumn("poplar_wainscoting", modLoc("block/poplar_wainscoting"), modLoc("block/poplar_wainscoting")));
        simpleBlockWithItem(BlockRegistration.FLOWERING_POPLAR_WAINSCOTING.get(), models().cubeColumn("flowering_poplar_wainscoting", modLoc("block/flowering_poplar_wainscoting"), modLoc("block/flowering_poplar_wainscoting")));
        simpleBlockWithItem(BlockRegistration.CRABAPPLE_WAINSCOTING.get(), models().cubeColumn("crabapple_wainscoting", modLoc("block/crabapple_wainscoting"), modLoc("block/crabapple_wainscoting")));
        simpleBlockWithItem(BlockRegistration.FLOWERING_CRABAPPLE_WAINSCOTING.get(), models().cubeColumn("flowering_crabapple_wainscoting", modLoc("block/flowering_crabapple_wainscoting"), modLoc("block/flowering_crabapple_wainscoting")));
        simpleBlockWithItem(BlockRegistration.SYCAMORE_WAINSCOTING.get(), models().cubeColumn("sycamore_wainscoting", modLoc("block/sycamore_wainscoting"), modLoc("block/sycamore_wainscoting")));
        simpleBlockWithItem(BlockRegistration.MAPLE_WAINSCOTING.get(), models().cubeColumn("fluorescent_maple_wainscoting", modLoc("block/fluorescent_maple_wainscoting"), modLoc("block/fluorescent_maple_wainscoting")));
        simpleBlockWithItem(BlockRegistration.BLUE_MUSHROOM_WAINSCOTING.get(), models().cubeColumn("blue_mushroom_wainscoting", modLoc("block/blue_mushroom_wainscoting"), modLoc("block/blue_mushroom_wainscoting")));
        simpleBlockWithItem(BlockRegistration.RED_MUSHROOM_WAINSCOTING.get(), models().cubeColumn("red_mushroom_wainscoting", modLoc("block/red_mushroom_wainscoting"), modLoc("block/red_mushroom_wainscoting")));
        simpleBlockWithItem(BlockRegistration.ALABASTER_WAINSCOTING.get(), models().cubeColumn("alabaster_wainscoting", modLoc("block/alabaster_wainscoting"), modLoc("block/alabaster_wainscoting")));

        blockWithItem(BlockRegistration.GINGERBREAD_BRICKS);
        simpleBlockWithItem(BlockRegistration.GINGERBREAD_BRICKS_TOP.get(), models().cubeColumn("gingerbread_bricks_top", modLoc("block/gingerbread_bricks_top"), modLoc("block/gingerbread_bricks")));
        horizontalBlock(BlockRegistration.GINGERBREAD_BRICKS_SIDE.get(), models().cube("gingerbread_bricks_corner",
                modLoc("block/gingerbread_bricks"), modLoc("block/gingerbread_bricks"),
                modLoc("block/gingerbread_bricks_side"), modLoc("block/gingerbread_bricks_side"),
                modLoc("block/gingerbread_bricks_side_alt"),  modLoc("block/gingerbread_bricks_side_alt")).texture("particle", "block/gingerbread_bricks"));
        blockItem(BlockRegistration.GINGERBREAD_BRICKS_SIDE);
        horizontalBlock(BlockRegistration.GINGERBREAD_BRICKS_TOP_CORNER.get(), models().cube("gingerbread_bricks_top_corner",
                modLoc("block/gingerbread_bricks"), modLoc("block/gingerbread_bricks"),
                modLoc("block/gingerbread_bricks_top_corner_alt"), modLoc("block/gingerbread_bricks_top_corner_alt"),
                modLoc("block/gingerbread_bricks_top_corner"),  modLoc("block/gingerbread_bricks_top_corner")).texture("particle", "block/gingerbread_bricks"));
        blockItem(BlockRegistration.GINGERBREAD_BRICKS_TOP_CORNER);
        stairsBlock((StairBlock) BlockRegistration.GINGERBREAD_BRICK_STAIRS.get(), blockTexture(BlockRegistration.GINGERBREAD_BRICKS.get()));
        blockItem(BlockRegistration.GINGERBREAD_BRICK_STAIRS);
        slabBlock((SlabBlock) BlockRegistration.GINGERBREAD_BRICK_SLAB.get(), blockTexture(BlockRegistration.GINGERBREAD_BRICKS.get()), blockTexture(BlockRegistration.GINGERBREAD_BRICKS.get()));
        blockItem(BlockRegistration.GINGERBREAD_BRICK_SLAB);


        horizontalBlock(BlockRegistration.ESPERANCA_TILE.get(), models().getBuilder("block/esperanca_tile").parent(models().getExistingFile(mcLoc("template_glazed_terracotta"))).texture("pattern", "block/esperanca_tile"));
        blockItem(BlockRegistration.ESPERANCA_TILE);
        horizontalBlock(BlockRegistration.LILIY_HILLS_TILE.get(), models().getBuilder("block/lily_hills_tile").parent(models().getExistingFile(mcLoc("template_glazed_terracotta"))).texture("pattern", "block/lily_hills_tile"));
        blockItem(BlockRegistration.LILIY_HILLS_TILE);
        horizontalBlock(BlockRegistration.HANNISH_TILE.get(), models().getBuilder("block/hannish_tile").parent(models().getExistingFile(mcLoc("template_glazed_terracotta"))).texture("pattern", "block/hannish_tile"));
        blockItem(BlockRegistration.HANNISH_TILE);

        blockWithItem(BlockRegistration.MARBLE_TILE);
        blockWithItem(BlockRegistration.MARBLE_TILE_CHISELED);
        horizontalBlock(BlockRegistration.MARBLE_TILE_BORDER.get(), models().cubeColumn("marble_tile_border", modLoc("block/marble_tile_border"), modLoc("block/marble_tile_border")));
        blockItem(BlockRegistration.MARBLE_TILE_BORDER);
        horizontalBlock(BlockRegistration.MARBLE_TILE_BORDER_CIRCLE.get(), models().cubeColumn("marble_tile_border_circle", modLoc("block/marble_tile_border_circle"), modLoc("block/marble_tile_border_circle")));
        blockItem(BlockRegistration.MARBLE_TILE_BORDER_CIRCLE);
        horizontalBlock(BlockRegistration.MARBLE_TILE_BORDER_DETAIL.get(), models().cubeColumn("marble_tile_border_detailed", modLoc("block/marble_tile_border_detailed"), modLoc("block/marble_tile_border_detailed")));
        blockItem(BlockRegistration.MARBLE_TILE_BORDER_DETAIL);
        horizontalBlock(BlockRegistration.MARBLE_TILE_CORNER.get(), models().getBuilder("block/marble_tile_corner").parent(models().getExistingFile(mcLoc("template_glazed_terracotta"))).texture("pattern", "block/marble_tile_corner"));
        blockItem(BlockRegistration.MARBLE_TILE_CORNER);
        horizontalBlock(BlockRegistration.MARBLE_TILE_CORNER_CIRCLE.get(), models().getBuilder("block/marble_tile_corner_circle").parent(models().getExistingFile(mcLoc("template_glazed_terracotta"))).texture("pattern", "block/marble_tile_corner_circle"));
        blockItem(BlockRegistration.MARBLE_TILE_CORNER_CIRCLE);

        blockWithItem(BlockRegistration.VERDANT_TILE);
        horizontalBlock(BlockRegistration.VERDANT_TILE_CORNER.get(), models().getBuilder("block/verdant_tile_corner").parent(models().getExistingFile(mcLoc("template_glazed_terracotta"))).texture("pattern", "block/verdant_tile_corner"));
        blockItem(BlockRegistration.VERDANT_TILE_CORNER);
        horizontalBlock(BlockRegistration.VERDANT_TILE_EDGE.get(), models().cubeColumn("verdant_tile_edge", modLoc("block/verdant_tile"), modLoc("block/verdant_tile_edge")));
        blockItem(BlockRegistration.VERDANT_TILE_EDGE);

        horizontalBlock(BlockRegistration.AURA_TILES.get(), models().getBuilder("block/aura_tiles").parent(models().getExistingFile(mcLoc("template_glazed_terracotta"))).texture("pattern", "block/aura_tiles"));
        blockItem(BlockRegistration.AURA_TILES);
        horizontalBlock(BlockRegistration.BIFURCATING_TILES.get(), models().getBuilder("block/bifurcating_tiles").parent(models().getExistingFile(mcLoc("template_glazed_terracotta"))).texture("pattern", "block/bifurcating_tiles"));
        blockItem(BlockRegistration.BIFURCATING_TILES);
        horizontalBlock(BlockRegistration.BLACK_AMARYLLIS_TILES.get(), models().getBuilder("block/black_amaryllis_tiles").parent(models().getExistingFile(mcLoc("template_glazed_terracotta"))).texture("pattern", "block/black_amaryllis_tiles"));
        blockItem(BlockRegistration.BLACK_AMARYLLIS_TILES);
        horizontalBlock(BlockRegistration.ROSETTE_TILES.get(), models().getBuilder("block/rosette_tiles").parent(models().getExistingFile(mcLoc("template_glazed_terracotta"))).texture("pattern", "block/rosette_tiles"));
        blockItem(BlockRegistration.ROSETTE_TILES);
        horizontalBlock(BlockRegistration.SEISMIC_TILES.get(), models().getBuilder("block/seismic_tiles").parent(models().getExistingFile(mcLoc("template_glazed_terracotta"))).texture("pattern", "block/seismic_tiles"));
        blockItem(BlockRegistration.SEISMIC_TILES);

        blockWithItem(BlockRegistration.IRIDESCENT_TILES);
        blockWithItem(BlockRegistration.SMALL_IRIDESCENT_TILES);
        blockWithItem(BlockRegistration.GREEN_TILES);
        blockWithItem(BlockRegistration.SMALL_GREEN_TILES);
        blockWithItem(BlockRegistration.YELLOW_TILES);
        blockWithItem(BlockRegistration.SMALL_YELLOW_TILES);
        blockWithItem(BlockRegistration.PINK_TILES);
        blockWithItem(BlockRegistration.SMALL_PINK_TILES);
        blockWithItem(BlockRegistration.PURPLE_TILES);
        blockWithItem(BlockRegistration.SMALL_PURPLE_TILES);
        blockWithItem(BlockRegistration.KITCHEN_TILES);

        blockWithItem(BlockRegistration.CHISELED_GOLD_BLOCK);
        blockWithItem(BlockRegistration.WICKER_BLOCK);
        blockWithItem(BlockRegistration.EYE_BLOCK);
        doorBlockWithRenderType((DoorBlock) BlockRegistration.DYNASTY_DOOR.get(), modLoc("block/dynasty_door_bottom"), modLoc("block/dynasty_door_top"), "cutout");

        simpleBlockWithItem(BlockRegistration.ALABASTER_WINDOW_DIVIDED.get(), models().cubeAll("alabaster_window_divided", modLoc("block/alabaster_window_divided")).renderType("cutout"));
        paneBlockWithRenderType((IronBarsBlock) BlockRegistration.ALABASTER_WINDOW_PANE.get(), modLoc("block/alabaster_window_divided"), modLoc("block/alabaster_glass_pane_top"), "cutout");
        simpleBlockWithItem(BlockRegistration.ALABASTER_PANEL_ALEXANDRIA.get(), models().cubeAll("alabaster_alexandria_panel", modLoc("block/alabaster_alexandria_panel")).renderType("cutout"));
        simpleBlockWithItem(BlockRegistration.ALABASTER_PANEL_ATLANTIC.get(), models().cubeAll("alabaster_atlantic_panel", modLoc("block/alabaster_atlantic_panel")).renderType("cutout"));
        simpleBlockWithItem(BlockRegistration.ALABASTER_PANEL_AUGUSTINE.get(), models().cubeAll("alabaster_augustine_panel", modLoc("block/alabaster_augustine_panel")).renderType("cutout"));
        simpleBlockWithItem(BlockRegistration.ALABASTER_PANEL_CANTERBURY.get(), models().cubeAll("alabaster_canterbury_panel", modLoc("block/alabaster_canterbury_panel")).renderType("cutout"));
        doorBlockWithRenderType((DoorBlock) BlockRegistration.ALABASTER_SCREEN_DOOR.get(), modLoc("block/alabaster_screen_door_bottom"), modLoc("block/alabaster_screen_door_top"), "cutout");
        doorBlockWithRenderType((DoorBlock) BlockRegistration.ALABASTER_FRENCH_DOOR.get(), modLoc("block/alabaster_french_door_bottom"), modLoc("block/alabaster_french_door_top"), "cutout");
        simpleBlockWithItem(BlockRegistration.WOOD_WINDOW_DIVIDED.get(), models().cubeAll("wooden_window_divided", modLoc("block/wooden_window_divided")).renderType("cutout"));
        paneBlockWithRenderType((IronBarsBlock) BlockRegistration.WOOD_WINDOW_PANE.get(), modLoc("block/wooden_window_divided"), modLoc("block/wooden_glass_pane_top"), "cutout");
        simpleBlockWithItem(BlockRegistration.WOOD_PANEL_ALEXANDRIA.get(), models().cubeAll("wooden_alexandria_panel", modLoc("block/wooden_alexandria_panel")).renderType("cutout"));
        simpleBlockWithItem(BlockRegistration.WOOD_PANEL_ATLANTIC.get(), models().cubeAll("wooden_atlantic_panel", modLoc("block/wooden_atlantic_panel")).renderType("cutout"));
        simpleBlockWithItem(BlockRegistration.WOOD_PANEL_AUGUSTINE.get(), models().cubeAll("wooden_augustine_panel", modLoc("block/wooden_augustine_panel")).renderType("cutout"));
        simpleBlockWithItem(BlockRegistration.WOOD_PANEL_CANTERBURY.get(), models().cubeAll("wooden_canterbury_panel", modLoc("block/wooden_canterbury_panel")).renderType("cutout"));
        doorBlockWithRenderType((DoorBlock) BlockRegistration.WOOD_SCREEN_DOOR.get(), modLoc("block/wooden_screen_door_bottom"), modLoc("block/wooden_screen_door_top"), "cutout");
        doorBlockWithRenderType((DoorBlock) BlockRegistration.WOOD_FRENCH_DOOR.get(), modLoc("block/wooden_french_door_bottom"), modLoc("block/wooden_french_door_top"), "cutout");


    }


    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

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
