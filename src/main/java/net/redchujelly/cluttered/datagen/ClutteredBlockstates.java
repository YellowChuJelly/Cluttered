package net.redchujelly.cluttered.datagen;

import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.redchujelly.cluttered.Cluttered;
import net.redchujelly.cluttered.block.custom.*;
import net.redchujelly.cluttered.block.custom.furniture.*;
import net.redchujelly.cluttered.block.custom.furniture.storage.CardboardBoxBlock;
import net.redchujelly.cluttered.block.multiblock.MultiblockPlacer;
import net.redchujelly.cluttered.setup.BlockRegistration;
import net.redchujelly.cluttered.block.custom.furniture.CardboardBoxState;
import net.redchujelly.cluttered.block.custom.furniture.LanternPlaceState;
import net.redchujelly.cluttered.block.custom.furniture.PicketFenceGateOpen;

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

        simpleBlockWithItem(BlockRegistration.WILLOW_LEAVES.get(), models().cubeAll("willow_leaves", modLoc("block/willow_leaves")).renderType("cutout"));
        simpleBlockWithItem(BlockRegistration.WILLOW_SAPLING.get(), models().cross("willow_sapling", modLoc("block/willow_sapling")).renderType("cutout"));
        simpleBlockWithItem(BlockRegistration.POTTED_WILLOW_SAPLING.get(), models().singleTexture("potted_willow_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(BlockRegistration.WILLOW_SAPLING.get())).renderType("cutout").ao(false));

        this.getVariantBuilder(BlockRegistration.WILLOW_VINES.get())
                .forAllStates(state -> ConfiguredModel.builder().modelFile(models().getBuilder("willow_vines_state_" + state.getValue(WillowVinesBlock.GRADIENT) + "_bottom_" + state.getValue(WillowVinesBlock.BOTTOM))
                        .parent(models().cross("willow_vines_" + state.getValue(WillowVinesBlock.GRADIENT) + "_bottom_" + state.getValue(WillowVinesBlock.BOTTOM), modLoc(state.getValue(WillowVinesBlock.BOTTOM) ?
                                        "block/willow_vines_end_" + state.getValue(WillowVinesBlock.GRADIENT) :
                                "block/willow_vines_" + state.getValue(WillowVinesBlock.GRADIENT)
                                )).renderType("cutout"))).build());


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

        simpleBlockWithItem(BlockRegistration.FLOWERING_WILLOW_LEAVES.get(), models().cubeAll("flowering_willow_leaves", modLoc("block/flowering_willow_leaves")).renderType("cutout"));
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

        simpleBlockWithItem(BlockRegistration.POPLAR_LEAVES.get(), models().cubeAll("poplar_leaves", modLoc("block/poplar_leaves")).renderType("cutout"));
        simpleBlockWithItem(BlockRegistration.POPLAR_SAPLING.get(), models().cross("poplar_sapling", modLoc("block/poplar_sapling")).renderType("cutout"));
        simpleBlockWithItem(BlockRegistration.POTTED_POPLAR_SAPLING.get(), models().singleTexture("potted_poplar_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(BlockRegistration.POPLAR_SAPLING.get())).renderType("cutout").ao(false));


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
        simpleBlockWithItem(BlockRegistration.FLOWERING_POPLAR_LEAVES.get(), models().cubeAll("flowering_poplar_leaves", modLoc("block/flowering_poplar_leaves")).renderType("cutout"));

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
        simpleBlockWithItem(BlockRegistration.CRABAPPLE_LEAVES.get(), models().cubeAll("crabapple_leaves", modLoc("block/crabapple_leaves")).renderType("cutout"));
        simpleBlockWithItem(BlockRegistration.CRABAPPLE_SAPLING.get(), models().cross("crabapple_sapling", modLoc("block/crabapple_sapling")).renderType("cutout"));
        simpleBlockWithItem(BlockRegistration.POTTED_CRABAPPLE_SAPLING.get(), models().singleTexture("potted_crabapple_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(BlockRegistration.CRABAPPLE_SAPLING.get())).renderType("cutout").ao(false));

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
        //simpleBlockWithItem(BlockRegistration.FLOWERING_CRABAPPLE_LEAVES.get(), models().cubeAll("flowering_crabapple_leaves", modLoc("block/flowering_crabapple_leaves")).renderType("cutout"));

        this.getVariantBuilder(BlockRegistration.FLOWERING_CRABAPPLE_LEAVES.get())
                .partialState().modelForState()
                .modelFile(models().cubeAll("flowering_crabapple_leaves_1", modLoc("block/flowering_crabapple_leaves_1")).renderType("cutout"))
                .nextModel().modelFile(models().cubeAll("flowering_crabapple_leaves_2", modLoc("block/flowering_crabapple_leaves_2")).renderType("cutout"))
                .addModel();
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
        simpleBlockWithItem(BlockRegistration.SYCAMORE_LEAVES.get(), models().cubeAll("sycamore_leaves", modLoc("block/sycamore_leaves")).renderType("cutout"));
        simpleBlockWithItem(BlockRegistration.SYCAMORE_SAPLING.get(), models().cross("sycamore_sapling", modLoc("block/sycamore_sapling")).renderType("cutout"));
        simpleBlockWithItem(BlockRegistration.POTTED_SYCAMORE_SAPLING.get(), models().singleTexture("potted_sycamore_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(BlockRegistration.SYCAMORE_SAPLING.get())).renderType("cutout").ao(false));

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
        simpleBlockWithItem(BlockRegistration.MAPLE_LEAVES.get(), models().cubeAll("fluorescent_maple_leaves", modLoc("block/fluorescent_maple_leaves")).renderType("cutout"));
        simpleBlockWithItem(BlockRegistration.MAPLE_LEAVES_FLOWERING.get(), models().cubeAll("flowering_fluorescent_maple_leaves", modLoc("block/flowering_fluorescent_maple_leaves")).renderType("cutout"));
        simpleBlockWithItem(BlockRegistration.MAPLE_SAPLING.get(), models().cross("fluorescent_maple_sapling", modLoc("block/fluorescent_maple_sapling")).renderType("cutout"));
        simpleBlockWithItem(BlockRegistration.POTTED_MAPLE_SAPLING.get(), models().singleTexture("potted_fluorescent_maple_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(BlockRegistration.MAPLE_SAPLING.get())).renderType("cutout").ao(false));

        //BLUE MUSHROOM WOODSET
        blockWithItem((BlockRegistration.BLUE_MUSHROOM_PLANKS));
        this.getVariantBuilder(BlockRegistration.BLUE_MUSHROOM_CAP.get())
                .partialState().modelForState()
                .modelFile(models().cubeAll("blue_mushroom_cap_1", modLoc("block/blue_mushroom_cap_2")))
                .nextModel().modelFile(models().cubeAll("blue_mushroom_cap_2", modLoc("block/blue_mushroom_cap_2")))
                .nextModel().modelFile(models().cubeAll("blue_mushroom_cap_3", modLoc("block/blue_mushroom_cap_3")))
                .nextModel().modelFile(models().cubeAll("blue_mushroom_cap_4", modLoc("block/blue_mushroom_cap_4")))
                .addModel();
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

        simpleBlockWithItem(BlockRegistration.BLUE_MUSHROOM_SAPLING.get(), models().cross("blue_roundhead", modLoc("block/blue_roundhead")).renderType("cutout"));
        simpleBlockWithItem(BlockRegistration.POTTED_BLUE_MUSHROOM_SAPLING.get(), models().singleTexture("potted_blue_roundhead", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(BlockRegistration.BLUE_MUSHROOM_SAPLING.get())).renderType("cutout").ao(false));

        //RED MUSHROOM WOODSET
        blockWithItem((BlockRegistration.RED_MUSHROOM_PLANKS));
        this.getVariantBuilder(BlockRegistration.RED_MUSHROOM_CAP.get())
                .partialState().modelForState()
                .modelFile(models().cubeAll("red_mushroom_cap_1", modLoc("block/red_mushroom_cap_2")))
                .nextModel().modelFile(models().cubeAll("red_mushroom_cap_2", modLoc("block/red_mushroom_cap_2")))
                .nextModel().modelFile(models().cubeAll("red_mushroom_cap_3", modLoc("block/red_mushroom_cap_3")))
                .nextModel().modelFile(models().cubeAll("red_mushroom_cap_4", modLoc("block/red_mushroom_cap_4")))
                .addModel();
        
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



        simpleBlockWithItem(BlockRegistration.RED_MUSHROOM_SAPLING.get(), models().cross("fly_agaric", modLoc("block/fly_agaric")).renderType("cutout"));
        simpleBlockWithItem(BlockRegistration.POTTED_RED_MUSHROOM_SAPLING.get(), models().singleTexture("potted_fly_agaric", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(BlockRegistration.RED_MUSHROOM_SAPLING.get())).renderType("cutout").ao(false));

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
        horizontalBlock(BlockRegistration.CHALCEDONY_MEANDER.get(), modLoc("block/meander_chalcedony"), modLoc("block/meander_chalcedony"), modLoc("block/meander_chalcedony"));
        blockItem(BlockRegistration.CHALCEDONY_MEANDER);
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

        this.getVariantBuilder(BlockRegistration.STARRY_CHALCEDONY_PILLAR.get())
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.Y).modelForState().modelFile(models().cubeColumn("chalcedony_pillar_starry", modLoc("block/chalcedony_pillar_starry"), modLoc("block/chalcedony_pillar_top"))).nextModel()
                .modelFile(models().cubeColumn("chalcedony_pillar_starry_2", modLoc("block/chalcedony_starry_pillar_alt"), modLoc("block/chalcedony_pillar_top"))).addModel()
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.Z).modelForState().modelFile(models().cubeColumn("chalcedony_pillar_starry_3", modLoc("block/chalcedony_pillar_starry"), modLoc("block/chalcedony_pillar_top"))).rotationX(90).nextModel()
                .modelFile(models().cubeColumn("chalcedony_pillar_starry_4", modLoc("block/chalcedony_starry_pillar_alt"), modLoc("block/chalcedony_pillar_top"))).rotationX(90).addModel()
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.X).modelForState().modelFile(models().cubeColumn("chalcedony_pillar_starry_5", modLoc("block/chalcedony_pillar_starry"), modLoc("block/chalcedony_pillar_top"))).rotationX(90).rotationY(90).nextModel()
                .modelFile(models().cubeColumn("chalcedony_pillar_starry_6", modLoc("block/chalcedony_starry_pillar_alt"), modLoc("block/chalcedony_pillar_top"))).rotationX(90).rotationY(90).addModel();
        blockItem(BlockRegistration.STARRY_CHALCEDONY_PILLAR);

        directionalBlock(BlockRegistration.STARRY_CHALCEDONY_PILLAR_BASE.get(), models().cubeColumn("block/chalcedony_pillar_starry_base", modLoc("block/chalcedony_pillar_starry_base"), modLoc("block/chalcedony_pillar_starry_top")));
        blockItem(BlockRegistration.STARRY_CHALCEDONY_PILLAR_BASE);
        directionalBlock(BlockRegistration.STARRY_CHALCEDONY_PILLAR_DORIC.get(), models().cubeColumn("block/chalcedony_pillar_starry_doric", modLoc("block/chalcedony_pillar_starry_doric"), modLoc("block/chalcedony_pillar_starry_top")));
        blockItem(BlockRegistration.STARRY_CHALCEDONY_PILLAR_DORIC);
        directionalBlock(BlockRegistration.STARRY_CHALCEDONY_PILLAR_IONIC.get(), models().cubeColumn("block/chalcedony_pillar_starry_ionic", modLoc("block/chalcedony_pillar_starry_ionic"), modLoc("block/chalcedony_pillar_starry_top")));
        blockItem(BlockRegistration.STARRY_CHALCEDONY_PILLAR_IONIC);

        simpleBlockWithItem(BlockRegistration.CHALCEDONY_WINDOW.get(), models().cubeAll("chalcedony_window", modLoc("block/chalcedony_window")).renderType("cutout"));
        paneBlockWithRenderType((IronBarsBlock) BlockRegistration.CHALCEDONY_WINDOW_PANE.get(), modLoc("block/chalcedony_window"), modLoc("block/chalcedony_glass_pane_top"), "cutout");

        horizontalBlock(BlockRegistration.CHALCEDONY_TEXTILES.get(), modLoc("block/textile_block_chalcedony"), modLoc("block/textile_block_chalcedony"), modLoc("block/textile_block_chalcedony"));
        blockItem(BlockRegistration.CHALCEDONY_TEXTILES);

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
        horizontalBlock(BlockRegistration.DEEP_CHALCEDONY_MEANDER.get(), modLoc("block/meander_deep_chalcedony"), modLoc("block/meander_deep_chalcedony"), modLoc("block/meander_deep_chalcedony"));
        blockItem(BlockRegistration.DEEP_CHALCEDONY_MEANDER);
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


        this.getVariantBuilder(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR.get())
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.Y).modelForState().modelFile(models().cubeColumn("deep_chalcedony_pillar_starry", modLoc("block/deep_chalcedony_pillar_starry"), modLoc("block/deep_chalcedony_pillar_top"))).nextModel()
                .modelFile(models().cubeColumn("deep_chalcedony_pillar_starry_2", modLoc("block/deep_chalcedony_starry_pillar_alt"), modLoc("block/deep_chalcedony_pillar_top"))).addModel()
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.Z).modelForState().modelFile(models().cubeColumn("deep_chalcedony_pillar_starry_3", modLoc("block/deep_chalcedony_pillar_starry"), modLoc("block/deep_chalcedony_pillar_top"))).rotationX(90).nextModel()
                .modelFile(models().cubeColumn("deep_chalcedony_pillar_starry_4", modLoc("block/deep_chalcedony_starry_pillar_alt"), modLoc("block/deep_chalcedony_pillar_top"))).rotationX(90).addModel()
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.X).modelForState().modelFile(models().cubeColumn("deep_chalcedony_pillar_starry_5", modLoc("block/deep_chalcedony_pillar_starry"), modLoc("block/deep_chalcedony_pillar_top"))).rotationX(90).rotationY(90).nextModel()
                .modelFile(models().cubeColumn("deep_chalcedony_pillar_starry_6", modLoc("block/deep_chalcedony_starry_pillar_alt"), modLoc("block/deep_chalcedony_pillar_top"))).rotationX(90).rotationY(90).addModel();
        blockItem(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR);

        directionalBlock(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_BASE.get(), models().cubeColumn("block/deep_chalcedony_pillar_starry_base", modLoc("block/deep_chalcedony_pillar_starry_base"), modLoc("block/deep_chalcedony_pillar_starry_top")));
        blockItem(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_BASE);
        directionalBlock(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_DORIC.get(), models().cubeColumn("block/deep_chalcedony_pillar_starry_doric", modLoc("block/deep_chalcedony_pillar_starry_doric"), modLoc("block/deep_chalcedony_pillar_starry_top")));
        blockItem(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_DORIC);
        directionalBlock(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_IONIC.get(), models().cubeColumn("block/deep_chalcedony_pillar_starry_ionic", modLoc("block/deep_chalcedony_pillar_starry_ionic"), modLoc("block/deep_chalcedony_pillar_starry_top")));
        blockItem(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_IONIC);

        simpleBlockWithItem(BlockRegistration.DEEP_CHALCEDONY_WINDOW.get(), models().cubeAll("deep_chalcedony_window", modLoc("block/deep_chalcedony_window")).renderType("cutout"));
        paneBlockWithRenderType((IronBarsBlock) BlockRegistration.DEEP_CHALCEDONY_WINDOW_PANE.get(), modLoc("block/deep_chalcedony_window"), modLoc("block/deep_chalcedony_glass_pane_top"), "cutout");

        horizontalBlock(BlockRegistration.DEEP_CHALCEDONY_TEXTILES.get(), modLoc("block/textile_block_deep_chalcedony"), modLoc("block/textile_block_deep_chalcedony"), modLoc("block/textile_block_deep_chalcedony"));
        blockItem(BlockRegistration.DEEP_CHALCEDONY_TEXTILES);

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
        horizontalBlock(BlockRegistration.MARBLE_MEANDER.get(), modLoc("block/meander_marble"), modLoc("block/meander_marble"), modLoc("block/meander_marble"));
        blockItem(BlockRegistration.MARBLE_MEANDER);
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

        horizontalBlock(BlockRegistration.MARBLE_TEXTILES.get(), modLoc("block/textile_block_marble"), modLoc("block/textile_block_marble"), modLoc("block/textile_block_marble"));
        blockItem(BlockRegistration.MARBLE_TEXTILES);

        balustradeBlock(BlockRegistration.MARBLE_BALUSTRADE);
        balustradeBlock(BlockRegistration.DEEP_CHALCEDONY_BALUSTRADE);
        balustradeBlock(BlockRegistration.CHALCEDONY_BALUSTRADE);
        picketFenceBlock(BlockRegistration.MARBLE_PICKET_FENCE);
        picketFenceBlock(BlockRegistration.CHALCEDONY_PICKET_FENCE);
        picketFenceBlock(BlockRegistration.DEEP_CHALCEDONY_PICKET_FENCE);
        picketFenceBlock(BlockRegistration.WOODEN_PICKET_FENCE);

        bracketBlock(BlockRegistration.MARBLE_BRACKET_VICTORIAN);
        bracketBlock(BlockRegistration.MARBLE_BRACKET_SCROLL);
        bracketBlock(BlockRegistration.MARBLE_BRACKET_BOW_SCROLL);
        bracketBlock(BlockRegistration.MARBLE_BRACKET_BOW);
        bracketBlock(BlockRegistration.MARBLE_BRACKET_STAR);
        bracketBlock(BlockRegistration.MARBLE_BRACKET_STAR_SCROLL);
        bracketBlock(BlockRegistration.MARBLE_BRACKET_SCROLL_SHELF);

        bracketBlock(BlockRegistration.CHALCEDONY_BRACKET_VICTORIAN);
        bracketBlock(BlockRegistration.CHALCEDONY_BRACKET_SCROLL);
        bracketBlock(BlockRegistration.CHALCEDONY_BRACKET_BOW_SCROLL);
        bracketBlock(BlockRegistration.CHALCEDONY_BRACKET_BOW);
        bracketBlock(BlockRegistration.CHALCEDONY_BRACKET_STAR);
        bracketBlock(BlockRegistration.CHALCEDONY_BRACKET_STAR_SCROLL);
        bracketBlock(BlockRegistration.CHALCEDONY_BRACKET_SCROLL_SHELF);

        bracketBlock(BlockRegistration.DEEP_CHALCEDONY_BRACKET_VICTORIAN);
        bracketBlock(BlockRegistration.DEEP_CHALCEDONY_BRACKET_SCROLL);
        bracketBlock(BlockRegistration.DEEP_CHALCEDONY_BRACKET_BOW_SCROLL);
        bracketBlock(BlockRegistration.DEEP_CHALCEDONY_BRACKET_BOW);
        bracketBlock(BlockRegistration.DEEP_CHALCEDONY_BRACKET_STAR);
        bracketBlock(BlockRegistration.DEEP_CHALCEDONY_BRACKET_STAR_SCROLL);
        bracketBlock(BlockRegistration.DEEP_CHALCEDONY_BRACKET_SCROLL_SHELF);

        bracketBlock(BlockRegistration.WOODEN_BRACKET_VICTORIAN);
        bracketBlock(BlockRegistration.WOODEN_BRACKET_SCROLL);
        bracketBlock(BlockRegistration.WOODEN_BRACKET_BOW_SCROLL);
        bracketBlock(BlockRegistration.WOODEN_BRACKET_BOW);
        bracketBlock(BlockRegistration.WOODEN_BRACKET_STAR);
        bracketBlock(BlockRegistration.WOODEN_BRACKET_STAR_SCROLL);
        bracketBlock(BlockRegistration.WOODEN_BRACKET_SCROLL_SHELF);

        //MISC FULL BLOCKS
        simpleBlockWithItem(BlockRegistration.BLACK_CAT_WINDOW.get(), models().cubeAll("black_cat_window", modLoc("block/black_cat_window")).renderType("translucent"));
        paneBlockWithRenderType((IronBarsBlock) BlockRegistration.BLACK_CAT_WINDOW_PANE.get(), modLoc("block/black_cat_window"), modLoc("block/cat_glass_pane_top"), "translucent");

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

        blockWithItem(BlockRegistration.BLUE_ROSE_STRIPED_WALLPAPER);
        simpleBlockWithItem(BlockRegistration.BLUE_ROSE_STRIPED_WALLPAPER_TOP.get(), models().cubeColumn("blue_rose_striped_wallpaper_top", modLoc("block/blue_rose_striped_wallpaper_top"), modLoc("block/blue_rose_striped_wallpaper")));
        simpleBlockWithItem(BlockRegistration.BLUE_ROSE_STRIPED_WALLPAPER_BOTTOM.get(), models().cubeColumn("blue_rose_striped_wallpaper_bottom", modLoc("block/blue_rose_striped_wallpaper_bottom"), modLoc("block/blue_rose_striped_wallpaper")));

        blockWithItem(BlockRegistration.CONFECTIONARY_WALLPAPER);
        simpleBlockWithItem(BlockRegistration.CONFECTIONARY_WALLPAPER_TOP.get(), models().cubeColumn("confectionary_wallpaper_top", modLoc("block/confectionary_wallpaper_top"), modLoc("block/confectionary_wallpaper")));
        simpleBlockWithItem(BlockRegistration.CONFECTIONARY_WALLPAPER_BOTTOM.get(), models().cubeColumn("confectionary_wallpaper_bottom", modLoc("block/confectionary_wallpaper_bottom"), modLoc("block/confectionary_wallpaper")));

        blockWithItem(BlockRegistration.MINT_WALLPAPER);
        simpleBlockWithItem(BlockRegistration.MINT_WALLPAPER_TOP.get(), models().cubeColumn("mint_wallpaper_top", modLoc("block/mint_wallpaper_top"), modLoc("block/mint_wallpaper")));
        simpleBlockWithItem(BlockRegistration.MINT_WALLPAPER_BOTTOM.get(), models().cubeColumn("mint_wallpaper_bottom", modLoc("block/mint_wallpaper_bottom"), modLoc("block/mint_wallpaper")));

        blockWithItem(BlockRegistration.STRIPED_FLORAL_WALLPAPER);
        simpleBlockWithItem(BlockRegistration.STRIPED_FLORAL_WALLPAPER_TOP.get(), models().cubeColumn("striped_floral_wallpaper_top", modLoc("block/striped_floral_wallpaper_top"), modLoc("block/striped_floral_wallpaper")));
        simpleBlockWithItem(BlockRegistration.STRIPED_FLORAL_WALLPAPER_BOTTOM.get(), models().cubeColumn("striped_floral_wallpaper_bottom", modLoc("block/striped_floral_wallpaper_bottom"), modLoc("block/striped_floral_wallpaper")));

        blockWithItem(BlockRegistration.FLORAL_BERRY_WALLPAPER);
        simpleBlockWithItem(BlockRegistration.FLORAL_BERRY_WALLPAPER_TOP.get(), models().cubeColumn("floral_berry_wallpaper_top", modLoc("block/floral_berry_wallpaper_top"), modLoc("block/floral_berry_wallpaper")));
        simpleBlockWithItem(BlockRegistration.FLORAL_BERRY_WALLPAPER_BOTTOM.get(), models().cubeColumn("floral_berry_wallpaper_bottom", modLoc("block/floral_berry_wallpaper_bottom"), modLoc("block/floral_berry_wallpaper")));

        blockWithItem(BlockRegistration.RETRO_RAINBOW_WALLPAPER);
        blockWithItem(BlockRegistration.APPLE_WALLPAPER);
        blockWithItem(BlockRegistration.CHECKERED_FRUIT_WALLPAPER);
        blockWithItem(BlockRegistration.CHECKERED_GREEN_WALLPAPER);
        blockWithItem(BlockRegistration.CHECKERED_GREEN_STRAWBERRY_WALLPAPER);
        blockWithItem(BlockRegistration.CHECKERED_PINK_WALLPAPER);
        blockWithItem(BlockRegistration.CHECKERED_PINK_STRAWBERRY_WALLPAPER);

        blockWithItem(BlockRegistration.CHIC_WALLPAPER);
        simpleBlockWithItem(BlockRegistration.CHIC_WALLPAPER_UPPER_TRIM.get(), models().cubeColumn("chic_wallpaper_upper_trim", modLoc("block/chic_wallpaper_upper_trim"), modLoc("block/chic_wallpaper")));
        simpleBlockWithItem(BlockRegistration.CHIC_WALLPAPER_LOWER_TRIM.get(), models().cubeColumn("chic_wallpaper_lower_trim", modLoc("block/chic_wallpaper_lower_trim"), modLoc("block/chic_wallpaper")));
        blockWithItem(BlockRegistration.FLORAL_BORDER_WALLPAPER);
        blockWithItem(BlockRegistration.GHOST_WALLPAPER);
        simpleBlockWithItem(BlockRegistration.GHOST_WALLPAPER_TRIM.get(), models().cubeColumn("ghost_wallpaper_trim", modLoc("block/ghost_wallpaper_trim"), modLoc("block/ghost_wallpaper")));
        simpleBlockWithItem(BlockRegistration.GHOST_WALLPAPER_BOTTOM.get(), models().cubeColumn("ghost_wallpaper_bottom", modLoc("block/ghost_wallpaper_bottom"), modLoc("block/ghost_wallpaper")));
        simpleBlockWithItem(BlockRegistration.GHOST_WALLPAPER_TOP.get(), models().cubeColumn("ghost_wallpaper_top", modLoc("block/ghost_wallpaper_top"), modLoc("block/ghost_wallpaper")));
        blockWithItem(BlockRegistration.GHOST_WALLPAPER_WAINSCOTING);

        blockWithItem(BlockRegistration.HALLOWEEN_WALLPAPER);
        blockWithItem(BlockRegistration.HALLOWEEN_WALLPAPER_TOP);
        blockWithItem(BlockRegistration.HALLOWEEN_WALLPAPER_BOTTOM);
        blockWithItem(BlockRegistration.HALLOWEEN_WAINSCOTING);
        blockWithItem(BlockRegistration.MARIGOLD_WALLPAPER);
        simpleBlockWithItem(BlockRegistration.MARIGOLD_WALLPAPER_BOTTOM.get(), models().cubeColumn("marigold_wallpaper_bottom", modLoc("block/marigold_wallpaper_bottom"), modLoc("block/marigold_wallpaper")));
        simpleBlockWithItem(BlockRegistration.MARIGOLD_WALLPAPER_TOP.get(), models().cubeColumn("marigold_wallpaper_top", modLoc("block/marigold_wallpaper_top"), modLoc("block/marigold_wallpaper")));
        blockWithItem(BlockRegistration.PINK_STRIPE_WALLPAPER);
        simpleBlockWithItem(BlockRegistration.PINK_STRIPE_WALLPAPER_LOWER_TRIM.get(), models().cubeColumn("pink_striped_wallpaper_lower_trim", modLoc("block/pink_striped_wallpaper_lower_trim"), modLoc("block/pink_striped_wallpaper")));
        simpleBlockWithItem(BlockRegistration.PINK_STRIPE_WALLPAPER_UPPER_TRIM.get(), models().cubeColumn("pink_striped_wallpaper_upper_trim", modLoc("block/pink_striped_wallpaper_upper_trim"), modLoc("block/pink_striped_wallpaper")));
        blockWithItem(BlockRegistration.RIALTO_GOLD_WALLPAPER);
        simpleBlockWithItem(BlockRegistration.RIALTO_GOLD_WALLPAPER_TOP.get(), models().cubeColumn("rialto_wallpaper_upper_trim", modLoc("block/rialto_wallpaper_upper_trim"), modLoc("block/rialto_gold_wallpaper")));
        simpleBlockWithItem(BlockRegistration.RIALTO_GOLD_WALLPAPER_BOTTOM.get(), models().cubeColumn("rialto_wallpaper_lower_trim", modLoc("block/rialto_wallpaper_lower_trim"), modLoc("block/rialto_gold_wallpaper")));

        blockWithItem(BlockRegistration.DIAMOND_WALLPAPER_APPLE);
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_APPLE_BOTTOM_BROWN.get(), models().cubeColumn("diamond_wallpaper_apple_bottom_brown", modLoc("block/diamond_wallpaper_apple_bottom_brown"), modLoc("block/diamond_wallpaper_apple")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_APPLE_TOP_BROWN.get(), models().cubeColumn("diamond_wallpaper_apple_top_brown", modLoc("block/diamond_wallpaper_apple_top_brown"), modLoc("block/diamond_wallpaper_apple")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_APPLE_BOTTOM_WHITE.get(), models().cubeColumn("diamond_wallpaper_apple_bottom_white", modLoc("block/diamond_wallpaper_apple_bottom_white"), modLoc("block/diamond_wallpaper_apple")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_APPLE_TOP_WHITE.get(), models().cubeColumn("diamond_wallpaper_apple_top_white", modLoc("block/diamond_wallpaper_apple_top_white"), modLoc("block/diamond_wallpaper_apple")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_APPLE_BOTTOM_COLOR.get(), models().cubeColumn("diamond_wallpaper_apple_bottom_color", modLoc("block/diamond_wallpaper_apple_bottom_color"), modLoc("block/diamond_wallpaper_apple")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_APPLE_TOP_COLOR.get(), models().cubeColumn("diamond_wallpaper_apple_top_color", modLoc("block/diamond_wallpaper_apple_top_color"), modLoc("block/diamond_wallpaper_apple")));

        blockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY);
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_BOTTOM_BROWN.get(), models().cubeColumn("diamond_wallpaper_blackberry_bottom_brown", modLoc("block/diamond_wallpaper_blackberry_bottom_brown"), modLoc("block/diamond_wallpaper_blackberry")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_TOP_BROWN.get(), models().cubeColumn("diamond_wallpaper_blackberry_top_brown", modLoc("block/diamond_wallpaper_blackberry_top_brown"), modLoc("block/diamond_wallpaper_blackberry")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_BOTTOM_WHITE.get(), models().cubeColumn("diamond_wallpaper_blackberry_bottom_white", modLoc("block/diamond_wallpaper_blackberry_bottom_white"), modLoc("block/diamond_wallpaper_blackberry")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_TOP_WHITE.get(), models().cubeColumn("diamond_wallpaper_blackberry_top_white", modLoc("block/diamond_wallpaper_blackberry_top_white"), modLoc("block/diamond_wallpaper_blackberry")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_BOTTOM_COLOR.get(), models().cubeColumn("diamond_wallpaper_blackberry_bottom_color", modLoc("block/diamond_wallpaper_blackberry_bottom_color"), modLoc("block/diamond_wallpaper_blackberry")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_TOP_COLOR.get(), models().cubeColumn("diamond_wallpaper_blackberry_top_color", modLoc("block/diamond_wallpaper_blackberry_top_color"), modLoc("block/diamond_wallpaper_blackberry")));

        blockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY);
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_BOTTOM_BROWN.get(), models().cubeColumn("diamond_wallpaper_blueberry_bottom_brown", modLoc("block/diamond_wallpaper_blueberry_bottom_brown"), modLoc("block/diamond_wallpaper_blueberry")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_TOP_BROWN.get(), models().cubeColumn("diamond_wallpaper_blueberry_top_brown", modLoc("block/diamond_wallpaper_blueberry_top_brown"), modLoc("block/diamond_wallpaper_blueberry")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_BOTTOM_WHITE.get(), models().cubeColumn("diamond_wallpaper_blueberry_bottom_white", modLoc("block/diamond_wallpaper_blueberry_bottom_white"), modLoc("block/diamond_wallpaper_blueberry")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_TOP_WHITE.get(), models().cubeColumn("diamond_wallpaper_blueberry_top_white", modLoc("block/diamond_wallpaper_blueberry_top_white"), modLoc("block/diamond_wallpaper_blueberry")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_BOTTOM_COLOR.get(), models().cubeColumn("diamond_wallpaper_blueberry_bottom_color", modLoc("block/diamond_wallpaper_blueberry_bottom_color"), modLoc("block/diamond_wallpaper_blueberry")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_TOP_COLOR.get(), models().cubeColumn("diamond_wallpaper_blueberry_top_color", modLoc("block/diamond_wallpaper_blueberry_top_color"), modLoc("block/diamond_wallpaper_blueberry")));

        blockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BONES);
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BONES_BOTTOM_BROWN.get(), models().cubeColumn("diamond_wallpaper_bones_bottom_brown", modLoc("block/diamond_wallpaper_bones_bottom_brown"), modLoc("block/diamond_wallpaper_bones")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BONES_TOP_BROWN.get(), models().cubeColumn("diamond_wallpaper_bones_top_brown", modLoc("block/diamond_wallpaper_bones_top_brown"), modLoc("block/diamond_wallpaper_bones")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BONES_BOTTOM_WHITE.get(), models().cubeColumn("diamond_wallpaper_bones_bottom_white", modLoc("block/diamond_wallpaper_bones_bottom_white"), modLoc("block/diamond_wallpaper_bones")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BONES_TOP_WHITE.get(), models().cubeColumn("diamond_wallpaper_bones_top_white", modLoc("block/diamond_wallpaper_bones_top_white"), modLoc("block/diamond_wallpaper_bones")));

        blockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET);
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_BOTTOM_BROWN.get(), models().cubeColumn("diamond_wallpaper_bouquet_bottom_brown", modLoc("block/diamond_wallpaper_bouquet_bottom_brown"), modLoc("block/diamond_wallpaper_bouquet")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_TOP_BROWN.get(), models().cubeColumn("diamond_wallpaper_bouquet_top_brown", modLoc("block/diamond_wallpaper_bouquet_top_brown"), modLoc("block/diamond_wallpaper_bouquet")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_BOTTOM_WHITE.get(), models().cubeColumn("diamond_wallpaper_bouquet_bottom_white", modLoc("block/diamond_wallpaper_bouquet_bottom_white"), modLoc("block/diamond_wallpaper_bouquet")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_TOP_WHITE.get(), models().cubeColumn("diamond_wallpaper_bouquet_top_white", modLoc("block/diamond_wallpaper_bouquet_top_white"), modLoc("block/diamond_wallpaper_bouquet")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_BOTTOM_COLOR.get(), models().cubeColumn("diamond_wallpaper_bouquet_bottom_color", modLoc("block/diamond_wallpaper_bouquet_bottom_color"), modLoc("block/diamond_wallpaper_bouquet")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_TOP_COLOR.get(), models().cubeColumn("diamond_wallpaper_bouquet_top_color", modLoc("block/diamond_wallpaper_bouquet_top_color"), modLoc("block/diamond_wallpaper_bouquet")));

        blockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM);
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_BOTTOM_BROWN.get(), models().cubeColumn("diamond_wallpaper_brown_mushroom_bottom_brown", modLoc("block/diamond_wallpaper_brown_mushroom_bottom_brown"), modLoc("block/diamond_wallpaper_brown_mushroom")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_TOP_BROWN.get(), models().cubeColumn("diamond_wallpaper_brown_mushroom_top_brown", modLoc("block/diamond_wallpaper_brown_mushroom_top_brown"), modLoc("block/diamond_wallpaper_brown_mushroom")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_BOTTOM_WHITE.get(), models().cubeColumn("diamond_wallpaper_brown_mushroom_bottom_white", modLoc("block/diamond_wallpaper_brown_mushroom_bottom_white"), modLoc("block/diamond_wallpaper_brown_mushroom")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_TOP_WHITE.get(), models().cubeColumn("diamond_wallpaper_brown_mushroom_top_white", modLoc("block/diamond_wallpaper_brown_mushroom_top_white"), modLoc("block/diamond_wallpaper_brown_mushroom")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_BOTTOM_COLOR.get(), models().cubeColumn("diamond_wallpaper_brown_mushroom_bottom_color", modLoc("block/diamond_wallpaper_brown_mushroom_bottom_color"), modLoc("block/diamond_wallpaper_brown_mushroom")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_TOP_COLOR.get(), models().cubeColumn("diamond_wallpaper_brown_mushroom_top_color", modLoc("block/diamond_wallpaper_brown_mushroom_top_color"), modLoc("block/diamond_wallpaper_brown_mushroom")));

        blockWithItem(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES);
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_BOTTOM_BROWN.get(), models().cubeColumn("diamond_wallpaper_green_grapes_bottom_brown", modLoc("block/diamond_wallpaper_green_grapes_bottom_brown"), modLoc("block/diamond_wallpaper_green_grapes")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_TOP_BROWN.get(), models().cubeColumn("diamond_wallpaper_green_grapes_top_brown", modLoc("block/diamond_wallpaper_green_grapes_top_brown"), modLoc("block/diamond_wallpaper_green_grapes")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_BOTTOM_WHITE.get(), models().cubeColumn("diamond_wallpaper_green_grapes_bottom_white", modLoc("block/diamond_wallpaper_green_grapes_bottom_white"), modLoc("block/diamond_wallpaper_green_grapes")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_TOP_WHITE.get(), models().cubeColumn("diamond_wallpaper_green_grapes_top_white", modLoc("block/diamond_wallpaper_green_grapes_top_white"), modLoc("block/diamond_wallpaper_green_grapes")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_BOTTOM_COLOR.get(), models().cubeColumn("diamond_wallpaper_green_grapes_bottom_color", modLoc("block/diamond_wallpaper_green_grapes_bottom_color"), modLoc("block/diamond_wallpaper_green_grapes")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_TOP_COLOR.get(), models().cubeColumn("diamond_wallpaper_green_grapes_top_color", modLoc("block/diamond_wallpaper_green_grapes_top_color"), modLoc("block/diamond_wallpaper_green_grapes")));

        blockWithItem(BlockRegistration.DIAMOND_WALLPAPER_LEMON);
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_LEMON_BOTTOM_BROWN.get(), models().cubeColumn("diamond_wallpaper_lemon_bottom_brown", modLoc("block/diamond_wallpaper_lemon_bottom_brown"), modLoc("block/diamond_wallpaper_lemon")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_LEMON_TOP_BROWN.get(), models().cubeColumn("diamond_wallpaper_lemon_top_brown", modLoc("block/diamond_wallpaper_lemon_top_brown"), modLoc("block/diamond_wallpaper_lemon")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_LEMON_BOTTOM_WHITE.get(), models().cubeColumn("diamond_wallpaper_lemon_bottom_white", modLoc("block/diamond_wallpaper_lemon_bottom_white"), modLoc("block/diamond_wallpaper_lemon")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_LEMON_TOP_WHITE.get(), models().cubeColumn("diamond_wallpaper_lemon_top_white", modLoc("block/diamond_wallpaper_lemon_top_white"), modLoc("block/diamond_wallpaper_lemon")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_LEMON_BOTTOM_COLOR.get(), models().cubeColumn("diamond_wallpaper_lemon_bottom_color", modLoc("block/diamond_wallpaper_lemon_bottom_color"), modLoc("block/diamond_wallpaper_lemon")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_LEMON_TOP_COLOR.get(), models().cubeColumn("diamond_wallpaper_lemon_top_color", modLoc("block/diamond_wallpaper_lemon_top_color"), modLoc("block/diamond_wallpaper_lemon")));

        blockWithItem(BlockRegistration.DIAMOND_WALLPAPER_ORANGE);
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_BOTTOM_BROWN.get(), models().cubeColumn("diamond_wallpaper_orange_bottom_brown", modLoc("block/diamond_wallpaper_orange_bottom_brown"), modLoc("block/diamond_wallpaper_orange")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_TOP_BROWN.get(), models().cubeColumn("diamond_wallpaper_orange_top_brown", modLoc("block/diamond_wallpaper_orange_top_brown"), modLoc("block/diamond_wallpaper_orange")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_BOTTOM_WHITE.get(), models().cubeColumn("diamond_wallpaper_orange_bottom_white", modLoc("block/diamond_wallpaper_orange_bottom_white"), modLoc("block/diamond_wallpaper_orange")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_TOP_WHITE.get(), models().cubeColumn("diamond_wallpaper_orange_top_white", modLoc("block/diamond_wallpaper_orange_top_white"), modLoc("block/diamond_wallpaper_orange")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_BOTTOM_COLOR.get(), models().cubeColumn("diamond_wallpaper_orange_bottom_color", modLoc("block/diamond_wallpaper_orange_bottom_color"), modLoc("block/diamond_wallpaper_orange")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_TOP_COLOR.get(), models().cubeColumn("diamond_wallpaper_orange_top_color", modLoc("block/diamond_wallpaper_orange_top_color"), modLoc("block/diamond_wallpaper_orange")));

        blockWithItem(BlockRegistration.DIAMOND_WALLPAPER_PEAR);
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_PEAR_BOTTOM_BROWN.get(), models().cubeColumn("diamond_wallpaper_pear_bottom_brown", modLoc("block/diamond_wallpaper_pear_bottom_brown"), modLoc("block/diamond_wallpaper_pear")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_PEAR_TOP_BROWN.get(), models().cubeColumn("diamond_wallpaper_pear_top_brown", modLoc("block/diamond_wallpaper_pear_top_brown"), modLoc("block/diamond_wallpaper_pear")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_PEAR_BOTTOM_WHITE.get(), models().cubeColumn("diamond_wallpaper_pear_bottom_white", modLoc("block/diamond_wallpaper_pear_bottom_white"), modLoc("block/diamond_wallpaper_pear")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_PEAR_TOP_WHITE.get(), models().cubeColumn("diamond_wallpaper_pear_top_white", modLoc("block/diamond_wallpaper_pear_top_white"), modLoc("block/diamond_wallpaper_pear")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_PEAR_BOTTOM_COLOR.get(), models().cubeColumn("diamond_wallpaper_pear_bottom_color", modLoc("block/diamond_wallpaper_pear_bottom_color"), modLoc("block/diamond_wallpaper_pear")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_PEAR_TOP_COLOR.get(), models().cubeColumn("diamond_wallpaper_pear_top_color", modLoc("block/diamond_wallpaper_pear_top_color"), modLoc("block/diamond_wallpaper_pear")));

        blockWithItem(BlockRegistration.DIAMOND_WALLPAPER_PLUM);
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_PLUM_BOTTOM_BROWN.get(), models().cubeColumn("diamond_wallpaper_plum_bottom_brown", modLoc("block/diamond_wallpaper_plum_bottom_brown"), modLoc("block/diamond_wallpaper_plum")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_PLUM_TOP_BROWN.get(), models().cubeColumn("diamond_wallpaper_plum_top_brown", modLoc("block/diamond_wallpaper_plum_top_brown"), modLoc("block/diamond_wallpaper_plum")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_PLUM_BOTTOM_WHITE.get(), models().cubeColumn("diamond_wallpaper_plum_bottom_white", modLoc("block/diamond_wallpaper_plum_bottom_white"), modLoc("block/diamond_wallpaper_plum")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_PLUM_TOP_WHITE.get(), models().cubeColumn("diamond_wallpaper_plum_top_white", modLoc("block/diamond_wallpaper_plum_top_white"), modLoc("block/diamond_wallpaper_plum")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_PLUM_BOTTOM_COLOR.get(), models().cubeColumn("diamond_wallpaper_plum_bottom_color", modLoc("block/diamond_wallpaper_plum_bottom_color"), modLoc("block/diamond_wallpaper_plum")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_PLUM_TOP_COLOR.get(), models().cubeColumn("diamond_wallpaper_plum_top_color", modLoc("block/diamond_wallpaper_plum_top_color"), modLoc("block/diamond_wallpaper_plum")));

        blockWithItem(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM);
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_BOTTOM_BROWN.get(), models().cubeColumn("diamond_wallpaper_red_mushroom_bottom_brown", modLoc("block/diamond_wallpaper_red_mushroom_bottom_brown"), modLoc("block/diamond_wallpaper_red_mushroom")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_TOP_BROWN.get(), models().cubeColumn("diamond_wallpaper_red_mushroom_top_brown", modLoc("block/diamond_wallpaper_red_mushroom_top_brown"), modLoc("block/diamond_wallpaper_red_mushroom")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_BOTTOM_WHITE.get(), models().cubeColumn("diamond_wallpaper_red_mushroom_bottom_white", modLoc("block/diamond_wallpaper_red_mushroom_bottom_white"), modLoc("block/diamond_wallpaper_red_mushroom")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_TOP_WHITE.get(), models().cubeColumn("diamond_wallpaper_red_mushroom_top_white", modLoc("block/diamond_wallpaper_red_mushroom_top_white"), modLoc("block/diamond_wallpaper_red_mushroom")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_BOTTOM_COLOR.get(), models().cubeColumn("diamond_wallpaper_red_mushroom_bottom_color", modLoc("block/diamond_wallpaper_red_mushroom_bottom_color"), modLoc("block/diamond_wallpaper_red_mushroom")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_TOP_COLOR.get(), models().cubeColumn("diamond_wallpaper_red_mushroom_top_color", modLoc("block/diamond_wallpaper_red_mushroom_top_color"), modLoc("block/diamond_wallpaper_red_mushroom")));

        blockWithItem(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES);
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_BOTTOM_BROWN.get(), models().cubeColumn("diamond_wallpaper_purple_grapes_bottom_brown", modLoc("block/diamond_wallpaper_purple_grapes_bottom_brown"), modLoc("block/diamond_wallpaper_purple_grapes")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_TOP_BROWN.get(), models().cubeColumn("diamond_wallpaper_purple_grapes_top_brown", modLoc("block/diamond_wallpaper_purple_grapes_top_brown"), modLoc("block/diamond_wallpaper_purple_grapes")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_BOTTOM_WHITE.get(), models().cubeColumn("diamond_wallpaper_purple_grapes_bottom_white", modLoc("block/diamond_wallpaper_purple_grapes_bottom_white"), modLoc("block/diamond_wallpaper_purple_grapes")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_TOP_WHITE.get(), models().cubeColumn("diamond_wallpaper_purple_grapes_top_white", modLoc("block/diamond_wallpaper_purple_grapes_top_white"), modLoc("block/diamond_wallpaper_purple_grapes")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_BOTTOM_COLOR.get(), models().cubeColumn("diamond_wallpaper_purple_grapes_bottom_color", modLoc("block/diamond_wallpaper_purple_grapes_bottom_color"), modLoc("block/diamond_wallpaper_purple_grapes")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_TOP_COLOR.get(), models().cubeColumn("diamond_wallpaper_purple_grapes_top_color", modLoc("block/diamond_wallpaper_purple_grapes_top_color"), modLoc("block/diamond_wallpaper_purple_grapes")));

        blockWithItem(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY);
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_BOTTOM_BROWN.get(), models().cubeColumn("diamond_wallpaper_strawberry_bottom_brown", modLoc("block/diamond_wallpaper_strawberry_bottom_brown"), modLoc("block/diamond_wallpaper_strawberry")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_TOP_BROWN.get(), models().cubeColumn("diamond_wallpaper_strawberry_top_brown", modLoc("block/diamond_wallpaper_strawberry_top_brown"), modLoc("block/diamond_wallpaper_strawberry")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_BOTTOM_WHITE.get(), models().cubeColumn("diamond_wallpaper_strawberry_bottom_white", modLoc("block/diamond_wallpaper_strawberry_bottom_white"), modLoc("block/diamond_wallpaper_strawberry")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_TOP_WHITE.get(), models().cubeColumn("diamond_wallpaper_strawberry_top_white", modLoc("block/diamond_wallpaper_strawberry_top_white"), modLoc("block/diamond_wallpaper_strawberry")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_BOTTOM_COLOR.get(), models().cubeColumn("diamond_wallpaper_strawberry_bottom_color", modLoc("block/diamond_wallpaper_strawberry_bottom_color"), modLoc("block/diamond_wallpaper_strawberry")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_TOP_COLOR.get(), models().cubeColumn("diamond_wallpaper_strawberry_top_color", modLoc("block/diamond_wallpaper_strawberry_top_color"), modLoc("block/diamond_wallpaper_strawberry")));

        blockWithItem(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR);
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR_BOTTOM_BROWN.get(), models().cubeColumn("diamond_wallpaper_anchor_bottom_brown", modLoc("block/diamond_wallpaper_anchor_bottom_brown"), modLoc("block/diamond_wallpaper_anchor")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR_TOP_BROWN.get(), models().cubeColumn("diamond_wallpaper_anchor_top_brown", modLoc("block/diamond_wallpaper_anchor_top_brown"), modLoc("block/diamond_wallpaper_anchor")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR_BOTTOM_WHITE.get(), models().cubeColumn("diamond_wallpaper_anchor_bottom_white", modLoc("block/diamond_wallpaper_anchor_bottom_white"), modLoc("block/diamond_wallpaper_anchor")));
        simpleBlockWithItem(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR_TOP_WHITE.get(), models().cubeColumn("diamond_wallpaper_anchor_top_white", modLoc("block/diamond_wallpaper_anchor_top_white"), modLoc("block/diamond_wallpaper_anchor")));

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

        horizontalBlock(BlockRegistration.STONE_TEXTILES.get(), modLoc("block/textile_block_stone"), modLoc("block/textile_block_stone"), modLoc("block/textile_block_stone"));
        blockItem(BlockRegistration.STONE_TEXTILES);

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

        blockWithItem(BlockRegistration.X_TILE_TERRACOTTA);
        blockWithItem(BlockRegistration.X_TILE_INVERSE_TERRACOTTA);
        blockWithItem(BlockRegistration.X_TILE_BLUE);
        blockWithItem(BlockRegistration.X_TILE_INVERSE_BLUE);
        blockWithItem(BlockRegistration.X_TILE_GRAY);
        blockWithItem(BlockRegistration.X_TILE_INVERSE_GRAY);

        blockWithItem(BlockRegistration.MARBLE_TILE);
        blockWithItem(BlockRegistration.MARBLE_TILE_CHISELED);
        horizontalBlock(BlockRegistration.MARBLE_TILE_BORDER.get(), models().cubeColumn("marble_tile_border", modLoc("block/marble_tile_border"), modLoc("block/marble_tile_border")));
        blockItem(BlockRegistration.MARBLE_TILE_BORDER);
        horizontalBlock(BlockRegistration.MARBLE_TILE_BORDER_CIRCLE.get(), models().cubeColumn("marble_tile_border_circle", modLoc("block/marble_tile_border_circle"), modLoc("block/marble_tile_border_circle")));
        blockItem(BlockRegistration.MARBLE_TILE_BORDER_CIRCLE);
        horizontalBlock(BlockRegistration.MARBLE_TILE_BORDER_DETAIL.get(), models().cubeColumn("marble_tile_border_detailed", modLoc("block/marble_tile_border_detailed"), modLoc("block/marble_tile_border_detailed")));
        blockItem(BlockRegistration.MARBLE_TILE_BORDER_DETAIL);
        horizontalBlock(BlockRegistration.MARBLE_TILE_CORNER.get(), models().getBuilder("block/marble_tile_corner").parent(models().getExistingFile(mcLoc("observer"))).texture("top", "block/marble_tile_corner").texture("bottom", "block/marble_tile_border").texture("side", "block/marble_tile_border").texture("front", "block/marble_tile_border").texture("particle", "block/marble_tile_border"));
        blockItem(BlockRegistration.MARBLE_TILE_CORNER);
        horizontalBlock(BlockRegistration.MARBLE_TILE_CORNER_CIRCLE.get(), models().getBuilder("block/marble_tile_corner_circle").parent(models().getExistingFile(mcLoc("observer"))).texture("top", "block/marble_tile_corner_circle").texture("bottom", "block/marble_tile_border").texture("side", "block/marble_tile_border").texture("front", "block/marble_tile_border").texture("particle", "block/marble_tile_border"));
        blockItem(BlockRegistration.MARBLE_TILE_CORNER_CIRCLE);

        blockWithItem(BlockRegistration.VERDANT_TILE);
        horizontalBlock(BlockRegistration.VERDANT_TILE_CORNER.get(), models().getBuilder("block/verdant_tile_corner").parent(models().getExistingFile(mcLoc("observer"))).texture("top", "block/verdant_tile_corner").texture("bottom", "block/verdant_tile").texture("side", "block/verdant_tile").texture("front", "block/verdant_tile").texture("particle", "block/verdant_tile"));
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
        doorBlockWithRenderType((DoorBlock) BlockRegistration.DYNASTY_DOOR.get(), modLoc("block/dynasty_door_bottom"), modLoc("block/dynasty_door_top"), "cutout");


        simpleBlockWithItem(BlockRegistration.GREENHOUSE_WINDOW.get(), models().cubeAll("greenhouse_window", modLoc("block/greenhouse_window_panes")).renderType("cutout"));
        horizontalBlock(BlockRegistration.GREENHOUSE_WINDOW_ARCH_LEFT.get(), models().cube("block/greenhouse_window_arch_left", modLoc("block/greenhouse_window_arch_left"), modLoc("block/greenhouse_window_arch_left"), modLoc("block/greenhouse_window_arch_left"), modLoc("block/greenhouse_window_arch_right"), modLoc("block/greenhouse_window_arch_left"), modLoc("block/greenhouse_window_arch_right")).texture("particle", modLoc("block/greenhouse_window_arch_right")).renderType("cutout"));
        blockItem(BlockRegistration.GREENHOUSE_WINDOW_ARCH_LEFT);
        horizontalBlock(BlockRegistration.GREENHOUSE_WINDOW_ARCH_RIGHT.get(), models().cube("block/greenhouse_window_arch_right", modLoc("block/greenhouse_window_arch_right"), modLoc("block/greenhouse_window_arch_right"), modLoc("block/greenhouse_window_arch_right"), modLoc("block/greenhouse_window_arch_left"), modLoc("block/greenhouse_window_arch_right"), modLoc("block/greenhouse_window_arch_left")).texture("particle", modLoc("block/greenhouse_window_arch_right")).renderType("cutout"));
        blockItem(BlockRegistration.GREENHOUSE_WINDOW_ARCH_RIGHT);
        horizontalBlock(BlockRegistration.GREENHOUSE_WINDOW_POINT.get(), models().cubeAll("greenhouse_window_pointed", modLoc("block/greenhouse_window_overlapping_pointed_arches")).renderType("cutout"));
        blockItem(BlockRegistration.GREENHOUSE_WINDOW_POINT);
        simpleBlockWithItem(BlockRegistration.GREENHOUSE_WINDOW_CIRCLE.get(), models().cubeAll("greenhouse_window_circle", modLoc("block/greenhouse_window_circle")).renderType("cutout"));
        horizontalBlock(BlockRegistration.GREENHOUSE_WINDOW_ROUNDED.get(), models().cubeAll("greenhouse_window_rounded", modLoc("block/greenhouse_window_rounded_top")).renderType("cutout"));
        blockItem(BlockRegistration.GREENHOUSE_WINDOW_ROUNDED);
        horizontalBlock(BlockRegistration.GREENHOUSE_WINDOW_RADIAL_LEFT.get(), models().cube("block/greenhouse_window_radial_left", modLoc("block/greenhouse_window_radial_left"), modLoc("block/greenhouse_window_radial_left"), modLoc("block/greenhouse_window_radial_left"), modLoc("block/greenhouse_window_radial_right"), modLoc("block/greenhouse_window_radial_left"), modLoc("block/greenhouse_window_radial_right")).texture("particle", modLoc("block/greenhouse_window_arch_right")).renderType("cutout"));
        blockItem(BlockRegistration.GREENHOUSE_WINDOW_RADIAL_LEFT);
        horizontalBlock(BlockRegistration.GREENHOUSE_WINDOW_RADIAL_RIGHT.get(), models().cube("block/greenhouse_window_radial_right", modLoc("block/greenhouse_window_radial_right"), modLoc("block/greenhouse_window_radial_right"), modLoc("block/greenhouse_window_radial_right"), modLoc("block/greenhouse_window_radial_left"), modLoc("block/greenhouse_window_radial_right"), modLoc("block/greenhouse_window_radial_left")).texture("particle", modLoc("block/greenhouse_window_arch_right")).renderType("cutout"));
        blockItem(BlockRegistration.GREENHOUSE_WINDOW_RADIAL_RIGHT);

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

        directionalBlock(BlockRegistration.COLOSSEO_PILLAR.get(), models().cubeColumn("colosseo_pillar", modLoc("block/colosseo_pillar"), modLoc("block/colosseo_pillar_chiseled")));
        blockItem(BlockRegistration.COLOSSEO_PILLAR);
        directionalBlock(BlockRegistration.COLOSSEO_PILLAR_BASE.get(), models().cubeColumn("colosseo_pillar_base", modLoc("block/colosseo_pillar_base"), modLoc("block/colosseo_pillar_chiseled")));
        blockItem(BlockRegistration.COLOSSEO_PILLAR_BASE);
        directionalBlock(BlockRegistration.COLOSSEO_PILLAR_TOP.get(), models().cubeColumn("colosseo_pillar_top", modLoc("block/colosseo_pillar_top"), modLoc("block/colosseo_pillar_chiseled")));
        blockItem(BlockRegistration.COLOSSEO_PILLAR_TOP);

        horizontalBlock(BlockRegistration.HONEY_JAR_BLOCK.get(), models().cube("jam_jar_honey", modLoc("block/jam_jar_honey_bottom"),
                modLoc("block/jam_jar_blue_top"),
                modLoc("block/jam_jar_honey"),
                modLoc("block/jam_jar_honey_side"),
                modLoc("block/jam_jar_honey_side"),
                modLoc("block/jam_jar_honey_side")).texture("particle", "block/jam_jar_honey_side"));
        blockItem(BlockRegistration.HONEY_JAR_BLOCK);
        horizontalBlock(BlockRegistration.ORANGE_JAR_BLOCK.get(), models().cube("jam_jar_orange", modLoc("block/jam_jar_orange_marmalade_bottom"),
                modLoc("block/jam_jar_blue_top"),
                modLoc("block/jam_jar_orange_marmalade"),
                modLoc("block/jam_jar_orange_marmalade_side"),
                modLoc("block/jam_jar_orange_marmalade_side"),
                modLoc("block/jam_jar_orange_marmalade_side")).texture("particle", "block/jam_jar_orange_marmalade_side"));
        blockItem(BlockRegistration.ORANGE_JAR_BLOCK);
        horizontalBlock(BlockRegistration.CHERRY_JAR_BLOCK.get(), models().cube("jam_jar_cherry", modLoc("block/jam_jar_cherry_bottom"),
                modLoc("block/jam_jar_red_top"),
                modLoc("block/jam_jar_cherry"),
                modLoc("block/jam_jar_cherry_side"),
                modLoc("block/jam_jar_cherry_side"),
                modLoc("block/jam_jar_cherry_side")).texture("particle", "block/jam_jar_cherry_side"));
        blockItem(BlockRegistration.CHERRY_JAR_BLOCK);
        horizontalBlock(BlockRegistration.STRAWBERRY_JAR_BLOCK.get(), models().cube("jam_jar_strawberry", modLoc("block/jam_jar_strawberry_bottom"),
                modLoc("block/jam_jar_red_top"),
                modLoc("block/jam_jar_strawberry"),
                modLoc("block/jam_jar_strawberry_side"),
                modLoc("block/jam_jar_strawberry_side"),
                modLoc("block/jam_jar_strawberry_side")).texture("particle", "block/jam_jar_cherry_side"));
        blockItem(BlockRegistration.STRAWBERRY_JAR_BLOCK);
        horizontalBlock(BlockRegistration.BLUEBERRY_JAR_BLOCK.get(), models().cube("jam_jar_blueberry", modLoc("block/jam_jar_blueberry_bottom"),
                modLoc("block/jam_jar_red_top"),
                modLoc("block/jam_jar_blueberry"),
                modLoc("block/jam_jar_blueberry_side"),
                modLoc("block/jam_jar_blueberry_side"),
                modLoc("block/jam_jar_blueberry_side")).texture("particle", "block/jam_jar_blueberry_side"));
        blockItem(BlockRegistration.BLUEBERRY_JAR_BLOCK);
        horizontalBlock(BlockRegistration.APRICOT_JAR_BLOCK.get(), models().cube("jam_jar_apricot", modLoc("block/jam_jar_apricot_bottom"),
                modLoc("block/jam_jar_red_top"),
                modLoc("block/jam_jar_apricot"),
                modLoc("block/jam_jar_apricot_side"),
                modLoc("block/jam_jar_apricot_side"),
                modLoc("block/jam_jar_apricot_side")).texture("particle", "block/jam_jar_apricot_side"));
        blockItem(BlockRegistration.APRICOT_JAR_BLOCK);

        this.getVariantBuilder(BlockRegistration.EYE_BLOCK.get())
                .partialState()
                .with(EyeBlock.LOOKING_LEFT, true).with(EyeBlock.BLINK_FRAME, 0)
                .modelForState().modelFile(models().cubeAll("eye_block_left_0", modLoc("block/eye_block_left_0"))).addModel()
                .partialState()
                .with(EyeBlock.LOOKING_LEFT, true).with(EyeBlock.BLINK_FRAME, 1)
                .modelForState().modelFile(models().cubeAll("eye_block_left_1", modLoc("block/eye_block_left_1"))).addModel()
                .partialState()
                .with(EyeBlock.LOOKING_LEFT, true).with(EyeBlock.BLINK_FRAME, 2)
                .modelForState().modelFile(models().cubeAll("eye_block_left_2", modLoc("block/eye_block_left_2"))).addModel()
                .partialState()
                .with(EyeBlock.LOOKING_LEFT, true).with(EyeBlock.BLINK_FRAME, 3)
                .modelForState().modelFile(models().cubeAll("eye_block_left_3", modLoc("block/eye_block_left_3"))).addModel()
                .partialState()
                .with(EyeBlock.LOOKING_LEFT, true).with(EyeBlock.BLINK_FRAME, 4)
                .modelForState().modelFile(models().cubeAll("eye_block_left_4", modLoc("block/eye_block_left_4"))).addModel()
                .partialState()
                .with(EyeBlock.LOOKING_LEFT, true).with(EyeBlock.BLINK_FRAME, 5)
                .modelForState().modelFile(models().cubeAll("eye_block_left_5", modLoc("block/eye_block_left_5"))).addModel()
                .partialState()
                .with(EyeBlock.LOOKING_LEFT, false).with(EyeBlock.BLINK_FRAME, 0)
                .modelForState().modelFile(models().cubeAll("eye_block_right_0", modLoc("block/eye_block_right_0"))).addModel()
                .partialState()
                .partialState()
                .with(EyeBlock.LOOKING_LEFT, false).with(EyeBlock.BLINK_FRAME, 1)
                .modelForState().modelFile(models().cubeAll("eye_block_right_1", modLoc("block/eye_block_right_1"))).addModel()
                .partialState()
                .partialState()
                .with(EyeBlock.LOOKING_LEFT, false).with(EyeBlock.BLINK_FRAME, 2)
                .modelForState().modelFile(models().cubeAll("eye_block_right_2", modLoc("block/eye_block_right_2"))).addModel()
                .partialState()
                .partialState()
                .with(EyeBlock.LOOKING_LEFT, false).with(EyeBlock.BLINK_FRAME, 3)
                .modelForState().modelFile(models().cubeAll("eye_block_right_3", modLoc("block/eye_block_right_3"))).addModel()
                .partialState()
                .partialState()
                .with(EyeBlock.LOOKING_LEFT, false).with(EyeBlock.BLINK_FRAME, 4)
                .modelForState().modelFile(models().cubeAll("eye_block_right_4", modLoc("block/eye_block_right_4"))).addModel()
                .partialState()
                .partialState()
                .with(EyeBlock.LOOKING_LEFT, false).with(EyeBlock.BLINK_FRAME, 5)
                .modelForState().modelFile(models().cubeAll("eye_block_right_5", modLoc("block/eye_block_right_5"))).addModel()
                .partialState();
 blockItem(BlockRegistration.EYE_BLOCK);

        doorBlock((DoorBlock) BlockRegistration.ART_NOUVEAU_DOOR.get(), modLoc("block/art_nouveau_door_bottom"), modLoc("block/art_nouveau_door_top"));
        doorBlock((DoorBlock) BlockRegistration.ART_NOUVEAU_DOOR_DARK.get(), modLoc("block/art_nouveau_door_dark_bottom"), modLoc("block/art_nouveau_door_dark_top"));

        blockWithItem(BlockRegistration.TARTAN_YELLOW_WALLPAPER);

        blockWithItem(BlockRegistration.TROPICAL_FISH_WALLPAPER);
        this.getVariantBuilder(BlockRegistration.FISH_WALLPAPER.get())
                .partialState().modelForState()
                .modelFile(models().cubeAll("fish_wallpaper_1", modLoc("block/fish_wallpaper_1")))
                .nextModel().modelFile(models().cubeAll("fish_wallpaper_2", modLoc("block/fish_wallpaper_2")))
                .nextModel().modelFile(models().cubeAll("fish_wallpaper_3", modLoc("block/fish_wallpaper_3")))
                .nextModel().modelFile(models().cubeAll("fish_wallpaper_4", modLoc("block/fish_wallpaper_4")))
                .nextModel().modelFile(models().cubeAll("fish_wallpaper_5", modLoc("block/fish_wallpaper_5")))
                .nextModel().modelFile(models().cubeAll("fish_wallpaper_6", modLoc("block/fish_wallpaper_6")))
                .addModel();
        this.getVariantBuilder(BlockRegistration.VARYING_BRICKS.get())
                .partialState().modelForState()
                .modelFile(models().cubeAll("bricks_varying_1", modLoc("block/bricks_varying_1")))
                .nextModel().modelFile(models().cubeAll("bricks_varying_2", modLoc("block/bricks_varying_2")))
                .nextModel().modelFile(models().cubeAll("bricks_varying_3", modLoc("block/bricks_varying_3")))
                .nextModel().modelFile(models().cubeAll("bricks_varying_4", modLoc("block/bricks_varying_4")))
                .addModel();
        this.getVariantBuilder(BlockRegistration.VARYING_BRICKS_BORDER.get())
                .partialState().modelForState()
                .modelFile(models().cubeColumn("bricks_varying_bordered_1", modLoc("block/bricks_varying_bordered_1"),modLoc("block/bricks_varying_1")))
                .nextModel().modelFile(models().cubeColumn("bricks_varying_bordered_2", modLoc("block/bricks_varying_bordered_2"),modLoc("block/bricks_varying_2")))
                .nextModel().modelFile(models().cubeColumn("bricks_varying_bordered_3", modLoc("block/bricks_varying_bordered_3"),modLoc("block/bricks_varying_3")))
                .nextModel().modelFile(models().cubeColumn("bricks_varying_bordered_4", modLoc("block/bricks_varying_bordered_4"),modLoc("block/bricks_varying_4")))
                .addModel();

        //FURNITURE

        //KITCHEN SETS
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_BROWN_CABINET);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_BROWN_CABINET_MINI);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_BROWN_CABINET_GLASS);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_BROWN_CABINET_OPEN);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_BROWN_CABINET_OUTER_CORNER);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_BROWN_CABINET_INNER_CORNER);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_BROWN_COUNTER);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_BROWN_COUNTER_INNER_CORNER);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_BROWN_COUNTER_OUTER_CORNER_LEFT);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_BROWN_COUNTER_OUTER_CORNER_RIGHT);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_BROWN_COUNTER_SINK);

        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_MINI);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_GLASS);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_OPEN);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_OUTER_CORNER);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_INNER_CORNER);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_INNER_CORNER);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_OUTER_CORNER_LEFT);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_OUTER_CORNER_RIGHT);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_SINK);

        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_PINK_CABINET);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_PINK_CABINET_MINI);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_PINK_CABINET_GLASS);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_PINK_CABINET_OPEN);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_PINK_CABINET_OUTER_CORNER);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_PINK_CABINET_INNER_CORNER);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_PINK_COUNTER);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_PINK_COUNTER_INNER_CORNER);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_PINK_COUNTER_OUTER_CORNER_LEFT);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_PINK_COUNTER_OUTER_CORNER_RIGHT);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_PINK_COUNTER_SINK);

        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_PURPLE_CABINET);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_PURPLE_CABINET_MINI);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_PURPLE_CABINET_GLASS);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_PURPLE_CABINET_OPEN);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_PURPLE_CABINET_OUTER_CORNER);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_PURPLE_CABINET_INNER_CORNER);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_PURPLE_COUNTER);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_PURPLE_COUNTER_INNER_CORNER);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_PURPLE_COUNTER_OUTER_CORNER_LEFT);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_PURPLE_COUNTER_OUTER_CORNER_RIGHT);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_PURPLE_COUNTER_SINK);

        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_WHITE_CABINET);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_WHITE_CABINET_MINI);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_WHITE_CABINET_GLASS);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_WHITE_CABINET_OPEN);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_WHITE_CABINET_OUTER_CORNER);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_WHITE_CABINET_INNER_CORNER);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_WHITE_COUNTER);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_WHITE_COUNTER_INNER_CORNER);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_WHITE_COUNTER_OUTER_CORNER_LEFT);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_WHITE_COUNTER_OUTER_CORNER_RIGHT);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_WHITE_COUNTER_SINK);

        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_YELLOW_CABINET);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_YELLOW_CABINET_MINI);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_YELLOW_CABINET_GLASS);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_YELLOW_CABINET_OPEN);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_YELLOW_CABINET_OUTER_CORNER);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_YELLOW_CABINET_INNER_CORNER);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_YELLOW_COUNTER);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_YELLOW_COUNTER_INNER_CORNER);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_YELLOW_COUNTER_OUTER_CORNER_LEFT);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_YELLOW_COUNTER_OUTER_CORNER_RIGHT);
        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SET_YELLOW_COUNTER_SINK);

        hFacingBlockWithCustomModel(BlockRegistration.KITCHEN_SCALE);

        multiblockParts(BlockRegistration.ANCIENT_CODEX);
        multiblockParts(BlockRegistration.ANTIQUE_BOOK_STAND);
        multiBlockWithOneModel(BlockRegistration.ANTIQUE_LIBRARY_BOOKS);
        flatFacingBlock(BlockRegistration.ANTIQUE_MAP, 0);
        hFacingBlockWithCustomModel(BlockRegistration.ANTIQUE_MINI_TABLE);
        hFacingBlockWithCustomModel(BlockRegistration.APPLE_CHAIR);

        hFacingBlockWithCustomModel(BlockRegistration.BIRDHOUSE_UNPAINTED);
        hFacingBlockWithCustomModel(BlockRegistration.BIRDHOUSE_RED);
        hFacingBlockWithCustomModel(BlockRegistration.BIRDHOUSE_BLUE);
        hFacingBlockWithCustomModel(BlockRegistration.BIRDHOUSE_PASTEL);
        hFacingBlockWithCustomModel(BlockRegistration.BRIEFCASE_BLANK);
        hFacingBlockWithCustomModel(BlockRegistration.BRIEFCASE_ROVER);
        hFacingBlockWithCustomModel(BlockRegistration.BUNNY_BOOK_ENDS);
        hFacingBlockWithCustomModel(BlockRegistration.BOX_OF_PAINTS);
        hFacingBlockWithCustomModel(BlockRegistration.BUTTON_STOOL);

        multiBlockWithOneModel(BlockRegistration.BIKE_YELLOW);
        multiBlockWithOneModel(BlockRegistration.BIKE_YELLOW_FLOWERS);
        multiBlockWithOneModel(BlockRegistration.BIKE_BLUE);
        multiBlockWithOneModel(BlockRegistration.BIKE_BLUE_FLOWERS);
        multiBlockWithOneModel(BlockRegistration.BIKE_PINK);
        multiBlockWithOneModel(BlockRegistration.BIKE_PINK_FLOWERS);
        multiBlockWithOneModel(BlockRegistration.BIKE_PURPLE);
        multiBlockWithOneModel(BlockRegistration.BIKE_PURPLE_FLOWERS);

        recordPlayerBlock(BlockRegistration.RECORD_PLAYER_BLUE);
        recordPlayerBlock(BlockRegistration.RECORD_PLAYER_YELLOW);
        recordPlayerBlock(BlockRegistration.RECORD_PLAYER_RED);
        recordPlayerBlock(BlockRegistration.RECORD_PLAYER_PURPLE);
        recordPlayerBlock(BlockRegistration.RECORD_PLAYER_PINK);
        recordPlayerBlock(BlockRegistration.RECORD_PLAYER_WHITE);
        recordPlayerBlock(BlockRegistration.RECORD_PLAYER_BROWN);

        hFacingBlockWithCustomModel(BlockRegistration.BEE_LAMP);
        hFacingBlockWithCustomModel(BlockRegistration.BEE_LAMP_ANGRY);

        multiblockParts(BlockRegistration.DESK_GREEN);
        multiblockParts(BlockRegistration.DESK_BROWN);
        multiblockParts(BlockRegistration.DESK_GREEN_CLUTTERED);
        multiblockParts(BlockRegistration.DESK_BROWN_CLUTTERED);

        multiblockParts(BlockRegistration.POTION_SHELF);
        multiblockParts(BlockRegistration.DORADO_CABINET);
        multiblockParts(BlockRegistration.DORADO_CABINET_CLUTTERED);
        multiblockParts(BlockRegistration.HAVANA_CABINET);
        multiblockParts(BlockRegistration.HAVANA_CABINET_CLUTTERED);
        multiblockParts(BlockRegistration.MUREX_CABINET);
        multiblockParts(BlockRegistration.MUREX_CABINET_CLUTTERED);

        multiblockParts(BlockRegistration.CONFECTIONERY_TABLE_BLUE);
        multiblockParts(BlockRegistration.CONFECTIONERY_TABLE_PINK);


        //ALL this for jam jars
       this.getMultipartBuilder(BlockRegistration.JAM_JARS.get())
                        .part().modelFile(models().getBuilder("block/jam_jars_row_1_apricot_n").parent(models().getExistingFile(modLoc("block/jam_jar_row_1"))).texture("0", "block/jam_jar_mini_apricot")).weight(1).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_1_blueberry_n").parent(models().getExistingFile(modLoc("block/jam_jar_row_1"))).texture("0", "block/jam_jar_mini_blueberry")).weight(1).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_1_cherry_n").parent(models().getExistingFile(modLoc("block/jam_jar_row_1"))).texture("0", "block/jam_jar_mini_cherry")).weight(1).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_1_honey_n").parent(models().getExistingFile(modLoc("block/jam_jar_row_1"))).texture("0", "block/jam_jar_mini_honey")).weight(1).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_1_orange_n").parent(models().getExistingFile(modLoc("block/jam_jar_row_1"))).texture("0", "block/jam_jar_mini_orange_marmalade")).weight(1).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_1_strawberry_n").parent(models().getExistingFile(modLoc("block/jam_jar_row_1"))).texture("0", "block/jam_jar_mini_strawberry")).weight(1)
                                    .addModel().condition(JamJarsBlock.STACKED, false).condition(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).end()
                        .part().modelFile(models().getBuilder("block/jam_jars_row_1_apricot_s").parent(models().getExistingFile(modLoc("block/jam_jar_row_1"))).texture("0", "block/jam_jar_mini_apricot")).weight(1).rotationY(180).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_1_blueberry_s").parent(models().getExistingFile(modLoc("block/jam_jar_row_1"))).texture("0", "block/jam_jar_mini_blueberry")).weight(1).rotationY(180).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_1_cherry_s").parent(models().getExistingFile(modLoc("block/jam_jar_row_1"))).texture("0", "block/jam_jar_mini_cherry")).weight(1).rotationY(180).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_1_honey_s").parent(models().getExistingFile(modLoc("block/jam_jar_row_1"))).texture("0", "block/jam_jar_mini_honey")).weight(1).rotationY(180).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_1_orange_s").parent(models().getExistingFile(modLoc("block/jam_jar_row_1"))).texture("0", "block/jam_jar_mini_orange_marmalade")).weight(1).rotationY(180).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_1_strawberry_s").parent(models().getExistingFile(modLoc("block/jam_jar_row_1"))).texture("0", "block/jam_jar_mini_strawberry")).weight(1).rotationY(180)
                                    .addModel().condition(JamJarsBlock.STACKED, false).condition(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).end()
                        .part().modelFile(models().getBuilder("block/jam_jars_row_1_apricot_e").parent(models().getExistingFile(modLoc("block/jam_jar_row_1"))).texture("0", "block/jam_jar_mini_apricot")).weight(1).rotationY(90).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_1_blueberry_e").parent(models().getExistingFile(modLoc("block/jam_jar_row_1"))).texture("0", "block/jam_jar_mini_blueberry")).weight(1).rotationY(90).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_1_cherry_e").parent(models().getExistingFile(modLoc("block/jam_jar_row_1"))).texture("0", "block/jam_jar_mini_cherry")).weight(1).rotationY(90).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_1_honey_e").parent(models().getExistingFile(modLoc("block/jam_jar_row_1"))).texture("0", "block/jam_jar_mini_honey")).weight(1).rotationY(90).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_1_orange_e").parent(models().getExistingFile(modLoc("block/jam_jar_row_1"))).texture("0", "block/jam_jar_mini_orange_marmalade")).weight(1).rotationY(90).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_1_strawberry_e").parent(models().getExistingFile(modLoc("block/jam_jar_row_1"))).texture("0", "block/jam_jar_mini_strawberry")).weight(1).rotationY(90)
                                    .addModel().condition(JamJarsBlock.STACKED, false).condition(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).end()
                        .part().modelFile(models().getBuilder("block/jam_jars_row_1_apricot_w").parent(models().getExistingFile(modLoc("block/jam_jar_row_1"))).texture("0", "block/jam_jar_mini_apricot")).weight(1).rotationY(270).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_1_blueberry_w").parent(models().getExistingFile(modLoc("block/jam_jar_row_1"))).texture("0", "block/jam_jar_mini_blueberry")).weight(1).rotationY(270).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_1_cherry_w").parent(models().getExistingFile(modLoc("block/jam_jar_row_1"))).texture("0", "block/jam_jar_mini_cherry")).weight(1).rotationY(270).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_1_honey_w").parent(models().getExistingFile(modLoc("block/jam_jar_row_1"))).texture("0", "block/jam_jar_mini_honey")).weight(1).rotationY(270).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_1_orange_w").parent(models().getExistingFile(modLoc("block/jam_jar_row_1"))).texture("0", "block/jam_jar_mini_orange_marmalade")).weight(1).rotationY(270).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_1_strawberry_w").parent(models().getExistingFile(modLoc("block/jam_jar_row_1"))).texture("0", "block/jam_jar_mini_strawberry")).weight(1).rotationY(270)
                                    .addModel().condition(JamJarsBlock.STACKED, false).condition(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).end()

                        .part().modelFile(models().getBuilder("block/jam_jars_row_2_apricot_n").parent(models().getExistingFile(modLoc("block/jam_jar_row_2"))).texture("0", "block/jam_jar_mini_apricot")).weight(2).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_2_blueberry_n").parent(models().getExistingFile(modLoc("block/jam_jar_row_2"))).texture("0", "block/jam_jar_mini_blueberry")).weight(2).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_2_cherry_n").parent(models().getExistingFile(modLoc("block/jam_jar_row_2"))).texture("0", "block/jam_jar_mini_cherry")).weight(2).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_2_honey_n").parent(models().getExistingFile(modLoc("block/jam_jar_row_2"))).texture("0", "block/jam_jar_mini_honey")).weight(2).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_2_orange_n").parent(models().getExistingFile(modLoc("block/jam_jar_row_2"))).texture("0", "block/jam_jar_mini_orange_marmalade")).weight(2).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_2_strawberry_n").parent(models().getExistingFile(modLoc("block/jam_jar_row_2"))).texture("0", "block/jam_jar_mini_strawberry")).weight(2)
                                    .addModel().condition(JamJarsBlock.STACKED, false).condition(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).end()
                        .part().modelFile(models().getBuilder("block/jam_jars_row_2_apricot_s").parent(models().getExistingFile(modLoc("block/jam_jar_row_2"))).texture("0", "block/jam_jar_mini_apricot")).weight(2).rotationY(180).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_2_blueberry_s").parent(models().getExistingFile(modLoc("block/jam_jar_row_2"))).texture("0", "block/jam_jar_mini_blueberry")).weight(2).rotationY(180).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_2_cherry_s").parent(models().getExistingFile(modLoc("block/jam_jar_row_2"))).texture("0", "block/jam_jar_mini_cherry")).weight(2).rotationY(180).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_2_honey_s").parent(models().getExistingFile(modLoc("block/jam_jar_row_2"))).texture("0", "block/jam_jar_mini_honey")).weight(2).rotationY(180).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_2_orange_s").parent(models().getExistingFile(modLoc("block/jam_jar_row_2"))).texture("0", "block/jam_jar_mini_orange_marmalade")).weight(2).rotationY(180).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_2_strawberry_s").parent(models().getExistingFile(modLoc("block/jam_jar_row_2"))).texture("0", "block/jam_jar_mini_strawberry")).weight(2).rotationY(180)
                                    .addModel().condition(JamJarsBlock.STACKED, false).condition(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).end()
                        .part().modelFile(models().getBuilder("block/jam_jars_row_2_apricot_e").parent(models().getExistingFile(modLoc("block/jam_jar_row_2"))).texture("0", "block/jam_jar_mini_apricot")).weight(2).rotationY(90).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_2_blueberry_e").parent(models().getExistingFile(modLoc("block/jam_jar_row_2"))).texture("0", "block/jam_jar_mini_blueberry")).weight(2).rotationY(90).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_2_cherry_e").parent(models().getExistingFile(modLoc("block/jam_jar_row_2"))).texture("0", "block/jam_jar_mini_cherry")).weight(2).rotationY(90).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_2_honey_e").parent(models().getExistingFile(modLoc("block/jam_jar_row_2"))).texture("0", "block/jam_jar_mini_honey")).weight(2).rotationY(90).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_2_orange_e").parent(models().getExistingFile(modLoc("block/jam_jar_row_2"))).texture("0", "block/jam_jar_mini_orange_marmalade")).weight(2).rotationY(90).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_2_strawberry_e").parent(models().getExistingFile(modLoc("block/jam_jar_row_2"))).texture("0", "block/jam_jar_mini_strawberry")).weight(2).rotationY(90)
                                    .addModel().condition(JamJarsBlock.STACKED, false).condition(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).end()
                        .part().modelFile(models().getBuilder("block/jam_jars_row_2_apricot_w").parent(models().getExistingFile(modLoc("block/jam_jar_row_2"))).texture("0", "block/jam_jar_mini_apricot")).weight(2).rotationY(270).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_2_blueberry_w").parent(models().getExistingFile(modLoc("block/jam_jar_row_2"))).texture("0", "block/jam_jar_mini_blueberry")).weight(2).rotationY(270).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_2_cherry_w").parent(models().getExistingFile(modLoc("block/jam_jar_row_2"))).texture("0", "block/jam_jar_mini_cherry")).weight(2).rotationY(270).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_2_honey_w").parent(models().getExistingFile(modLoc("block/jam_jar_row_2"))).texture("0", "block/jam_jar_mini_honey")).weight(2).rotationY(270).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_2_orange_w").parent(models().getExistingFile(modLoc("block/jam_jar_row_2"))).texture("0", "block/jam_jar_mini_orange_marmalade")).weight(2).rotationY(270).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_2_strawberry_w").parent(models().getExistingFile(modLoc("block/jam_jar_row_2"))).texture("0", "block/jam_jar_mini_strawberry")).weight(2).rotationY(270)
                                    .addModel().condition(JamJarsBlock.STACKED, false).condition(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).end()

                        .part().modelFile(models().getBuilder("block/jam_jars_row_3_apricot_n").parent(models().getExistingFile(modLoc("block/jam_jar_row_3"))).texture("0", "block/jam_jar_mini_apricot")).weight(3).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_3_blueberry_n").parent(models().getExistingFile(modLoc("block/jam_jar_row_3"))).texture("0", "block/jam_jar_mini_blueberry")).weight(3).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_3_cherry_n").parent(models().getExistingFile(modLoc("block/jam_jar_row_3"))).texture("0", "block/jam_jar_mini_cherry")).weight(3).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_3_honey_n").parent(models().getExistingFile(modLoc("block/jam_jar_row_3"))).texture("0", "block/jam_jar_mini_honey")).weight(3).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_3_orange_n").parent(models().getExistingFile(modLoc("block/jam_jar_row_3"))).texture("0", "block/jam_jar_mini_orange_marmalade")).weight(3).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_3_strawberry_n").parent(models().getExistingFile(modLoc("block/jam_jar_row_3"))).texture("0", "block/jam_jar_mini_strawberry")).weight(3)
                                    .addModel().condition(JamJarsBlock.STACKED, false).condition(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).end()
                        .part().modelFile(models().getBuilder("block/jam_jars_row_3_apricot_s").parent(models().getExistingFile(modLoc("block/jam_jar_row_3"))).texture("0", "block/jam_jar_mini_apricot")).weight(3).rotationY(180).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_3_blueberry_s").parent(models().getExistingFile(modLoc("block/jam_jar_row_3"))).texture("0", "block/jam_jar_mini_blueberry")).weight(3).rotationY(180).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_3_cherry_s").parent(models().getExistingFile(modLoc("block/jam_jar_row_3"))).texture("0", "block/jam_jar_mini_cherry")).weight(3).rotationY(180).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_3_honey_s").parent(models().getExistingFile(modLoc("block/jam_jar_row_3"))).texture("0", "block/jam_jar_mini_honey")).weight(3).rotationY(180).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_3_orange_s").parent(models().getExistingFile(modLoc("block/jam_jar_row_3"))).texture("0", "block/jam_jar_mini_orange_marmalade")).rotationY(180).weight(3).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_3_strawberry_s").parent(models().getExistingFile(modLoc("block/jam_jar_row_3"))).texture("0", "block/jam_jar_mini_strawberry")).weight(3).rotationY(180)
                                    .addModel().condition(JamJarsBlock.STACKED, false).condition(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).end()
                        .part().modelFile(models().getBuilder("block/jam_jars_row_3_apricot_e").parent(models().getExistingFile(modLoc("block/jam_jar_row_3"))).texture("0", "block/jam_jar_mini_apricot")).weight(3).rotationY(90).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_3_blueberry_e").parent(models().getExistingFile(modLoc("block/jam_jar_row_3"))).texture("0", "block/jam_jar_mini_blueberry")).weight(3).rotationY(90).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_3_cherry_e").parent(models().getExistingFile(modLoc("block/jam_jar_row_3"))).texture("0", "block/jam_jar_mini_cherry")).weight(3).rotationY(90).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_3_honey_e").parent(models().getExistingFile(modLoc("block/jam_jar_row_3"))).texture("0", "block/jam_jar_mini_honey")).weight(3).rotationY(90).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_3_orange_e").parent(models().getExistingFile(modLoc("block/jam_jar_row_3"))).texture("0", "block/jam_jar_mini_orange_marmalade")).weight(3).rotationY(90).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_3_strawberry_e").parent(models().getExistingFile(modLoc("block/jam_jar_row_3"))).texture("0", "block/jam_jar_mini_strawberry")).weight(3).rotationY(90)
                                    .addModel().condition(JamJarsBlock.STACKED, false).condition(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).end()
                        .part().modelFile(models().getBuilder("block/jam_jars_row_3_apricot_w").parent(models().getExistingFile(modLoc("block/jam_jar_row_3"))).texture("0", "block/jam_jar_mini_apricot")).weight(3).rotationY(270).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_3_blueberry_w").parent(models().getExistingFile(modLoc("block/jam_jar_row_3"))).texture("0", "block/jam_jar_mini_blueberry")).weight(3).rotationY(270).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_3_cherry_w").parent(models().getExistingFile(modLoc("block/jam_jar_row_3"))).texture("0", "block/jam_jar_mini_cherry")).weight(3).rotationY(270).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_3_honey_w").parent(models().getExistingFile(modLoc("block/jam_jar_row_3"))).texture("0", "block/jam_jar_mini_honey")).weight(3).rotationY(270).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_3_orange_w").parent(models().getExistingFile(modLoc("block/jam_jar_row_3"))).texture("0", "block/jam_jar_mini_orange_marmalade")).weight(3).rotationY(270).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_row_3_strawberry_w").parent(models().getExistingFile(modLoc("block/jam_jar_row_3"))).texture("0", "block/jam_jar_mini_strawberry")).weight(3).rotationY(270)
                                    .addModel().condition(JamJarsBlock.STACKED, false).condition(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).end()

                        .part().modelFile(models().getBuilder("block/jam_jars_stack_1_apricot_n").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_1"))).texture("0", "block/jam_jar_mini_apricot")).weight(1).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_1_blueberry_n").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_1"))).texture("0", "block/jam_jar_mini_blueberry")).weight(1).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_1_cherry_n").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_1"))).texture("0", "block/jam_jar_mini_cherry")).weight(1).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_1_honey_n").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_1"))).texture("0", "block/jam_jar_mini_honey")).weight(1).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_1_orange_n").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_1"))).texture("0", "block/jam_jar_mini_orange_marmalade")).weight(1).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_1_strawberry_n").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_1"))).texture("0", "block/jam_jar_mini_strawberry")).weight(1)
                                    .addModel().condition(JamJarsBlock.STACKED, true).condition(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).end()
                        .part().modelFile(models().getBuilder("block/jam_jars_stack_1_apricot_s").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_1"))).texture("0", "block/jam_jar_mini_apricot")).weight(1).rotationY(180).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_1_blueberry_s").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_1"))).texture("0", "block/jam_jar_mini_blueberry")).weight(1).rotationY(180).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_1_cherry_s").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_1"))).texture("0", "block/jam_jar_mini_cherry")).weight(1).rotationY(180).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_1_honey_s").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_1"))).texture("0", "block/jam_jar_mini_honey")).weight(1).rotationY(180).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_1_orange_s").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_1"))).texture("0", "block/jam_jar_mini_orange_marmalade")).rotationY(180).weight(1).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_1_strawberry_s").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_1"))).texture("0", "block/jam_jar_mini_strawberry")).rotationY(180).weight(1)
                                    .addModel().condition(JamJarsBlock.STACKED, true).condition(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).end()
                        .part().modelFile(models().getBuilder("block/jam_jars_stack_1_apricot_e").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_1"))).texture("0", "block/jam_jar_mini_apricot")).weight(1).rotationY(90).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_1_blueberry_e").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_1"))).texture("0", "block/jam_jar_mini_blueberry")).weight(1).rotationY(90).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_1_cherry_e").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_1"))).texture("0", "block/jam_jar_mini_cherry")).weight(1).rotationY(90).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_1_honey_e").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_1"))).texture("0", "block/jam_jar_mini_honey")).weight(1).rotationY(90).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_1_orange_e").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_1"))).texture("0", "block/jam_jar_mini_orange_marmalade")).weight(1).rotationY(90).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_1_strawberry_e").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_1"))).texture("0", "block/jam_jar_mini_strawberry")).weight(1).rotationY(90)
                                    .addModel().condition(JamJarsBlock.STACKED, true).condition(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).end()
                        .part().modelFile(models().getBuilder("block/jam_jars_stack_1_apricot_w").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_1"))).texture("0", "block/jam_jar_mini_apricot")).weight(1).rotationY(270).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_1_blueberry_w").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_1"))).texture("0", "block/jam_jar_mini_blueberry")).weight(1).rotationY(270).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_1_cherry_w").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_1"))).texture("0", "block/jam_jar_mini_cherry")).weight(1).rotationY(270).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_1_honey_w").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_1"))).texture("0", "block/jam_jar_mini_honey")).weight(1).rotationY(270).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_1_orange_w").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_1"))).texture("0", "block/jam_jar_mini_orange_marmalade")).weight(1).rotationY(270).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_1_strawberry_w").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_1"))).texture("0", "block/jam_jar_mini_strawberry")).weight(1).rotationY(270)
                                    .addModel().condition(JamJarsBlock.STACKED, true).condition(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).end()

                        .part().modelFile(models().getBuilder("block/jam_jars_stack_2_apricot_n").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_2"))).texture("0", "block/jam_jar_mini_apricot")).weight(2).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_2_blueberry_n").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_2"))).texture("0", "block/jam_jar_mini_blueberry")).weight(2).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_2_cherry_n").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_2"))).texture("0", "block/jam_jar_mini_cherry")).weight(2).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_2_honey_n").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_2"))).texture("0", "block/jam_jar_mini_honey")).weight(2).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_2_orange_n").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_2"))).texture("0", "block/jam_jar_mini_orange_marmalade")).weight(2).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_2_strawberry_n").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_2"))).texture("0", "block/jam_jar_mini_strawberry")).weight(2)
                                    .addModel().condition(JamJarsBlock.STACKED, true).condition(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).end()
                        .part().modelFile(models().getBuilder("block/jam_jars_stack_2_apricot_s").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_2"))).texture("0", "block/jam_jar_mini_apricot")).weight(2).rotationY(180).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_2_blueberry_s").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_2"))).texture("0", "block/jam_jar_mini_blueberry")).weight(2).rotationY(180).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_2_cherry_s").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_2"))).texture("0", "block/jam_jar_mini_cherry")).weight(2).rotationY(180).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_2_honey_s").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_2"))).texture("0", "block/jam_jar_mini_honey")).weight(2).rotationY(180).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_2_orange_s").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_2"))).texture("0", "block/jam_jar_mini_orange_marmalade")).weight(2).rotationY(180).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_2_strawberry_s").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_2"))).texture("0", "block/jam_jar_mini_strawberry")).weight(2).rotationY(180)
                                    .addModel().condition(JamJarsBlock.STACKED, true).condition(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).end()
                        .part().modelFile(models().getBuilder("block/jam_jars_stack_2_apricot_e").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_2"))).texture("0", "block/jam_jar_mini_apricot")).weight(2).rotationY(90).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_2_blueberry_e").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_2"))).texture("0", "block/jam_jar_mini_blueberry")).weight(2).rotationY(90).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_2_cherry_e").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_2"))).texture("0", "block/jam_jar_mini_cherry")).weight(2).rotationY(90).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_2_honey_e").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_2"))).texture("0", "block/jam_jar_mini_honey")).weight(2).rotationY(90).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_2_orange_e").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_2"))).texture("0", "block/jam_jar_mini_orange_marmalade")).weight(2).rotationY(90).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_2_strawberry_e").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_2"))).texture("0", "block/jam_jar_mini_strawberry")).weight(2).rotationY(90)
                                    .addModel().condition(JamJarsBlock.STACKED, true).condition(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).end()
                        .part().modelFile(models().getBuilder("block/jam_jars_stack_2_apricot_w").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_2"))).texture("0", "block/jam_jar_mini_apricot")).weight(2).rotationY(270).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_2_blueberry_w").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_2"))).texture("0", "block/jam_jar_mini_blueberry")).weight(2).rotationY(270).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_2_cherry_w").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_2"))).texture("0", "block/jam_jar_mini_cherry")).weight(2).rotationY(270).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_2_honey_w").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_2"))).texture("0", "block/jam_jar_mini_honey")).weight(2).rotationY(270).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_2_orange_w").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_2"))).texture("0", "block/jam_jar_mini_orange_marmalade")).weight(2).rotationY(270).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_2_strawberry_w").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_2"))).texture("0", "block/jam_jar_mini_strawberry")).weight(2).rotationY(270)
                                    .addModel().condition(JamJarsBlock.STACKED, true).condition(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).end()

                        .part().modelFile(models().getBuilder("block/jam_jars_stack_3_apricot_n").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_3"))).texture("0", "block/jam_jar_mini_apricot")).weight(3).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_3_blueberry_n").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_3"))).texture("0", "block/jam_jar_mini_blueberry")).weight(3).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_3_cherry_n").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_3"))).texture("0", "block/jam_jar_mini_cherry")).weight(3).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_3_honey_n").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_3"))).texture("0", "block/jam_jar_mini_honey")).weight(3).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_3_orange_n").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_3"))).texture("0", "block/jam_jar_mini_orange_marmalade")).weight(3).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_3_strawberry_n").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_3"))).texture("0", "block/jam_jar_mini_strawberry")).weight(3)
                                    .addModel().condition(JamJarsBlock.STACKED, true).condition(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).end()
                        .part().modelFile(models().getBuilder("block/jam_jars_stack_3_apricot_s").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_3"))).texture("0", "block/jam_jar_mini_apricot")).weight(3).rotationY(180).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_3_blueberry_s").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_3"))).texture("0", "block/jam_jar_mini_blueberry")).weight(3).rotationY(180).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_3_cherry_s").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_3"))).texture("0", "block/jam_jar_mini_cherry")).weight(3).rotationY(180).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_3_honey_s").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_3"))).texture("0", "block/jam_jar_mini_honey")).weight(3).rotationY(180).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_3_orange_s").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_3"))).texture("0", "block/jam_jar_mini_orange_marmalade")).weight(3).rotationY(180).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_3_strawberry_s").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_3"))).texture("0", "block/jam_jar_mini_strawberry")).weight(3).rotationY(180)
                                    .addModel().condition(JamJarsBlock.STACKED, true).condition(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).end()
                        .part().modelFile(models().getBuilder("block/jam_jars_stack_3_apricot_e").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_3"))).texture("0", "block/jam_jar_mini_apricot")).weight(3).rotationY(90).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_3_blueberry_e").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_3"))).texture("0", "block/jam_jar_mini_blueberry")).weight(3).rotationY(90).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_3_cherry_e").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_3"))).texture("0", "block/jam_jar_mini_cherry")).weight(3).rotationY(90).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_3_honey_e").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_3"))).texture("0", "block/jam_jar_mini_honey")).weight(3).rotationY(90).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_3_orange_e").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_3"))).texture("0", "block/jam_jar_mini_orange_marmalade")).weight(3).rotationY(90).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_3_strawberry_e").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_3"))).texture("0", "block/jam_jar_mini_strawberry")).weight(3).rotationY(90)
                                    .addModel().condition(JamJarsBlock.STACKED, true).condition(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).end()
                        .part().modelFile(models().getBuilder("block/jam_jars_stack_3_apricot_w").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_3"))).texture("0", "block/jam_jar_mini_apricot")).weight(3).rotationY(270).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_3_blueberry_w").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_3"))).texture("0", "block/jam_jar_mini_blueberry")).weight(3).rotationY(270).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_3_cherry_w").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_3"))).texture("0", "block/jam_jar_mini_cherry")).weight(3).rotationY(270).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_3_honey_w").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_3"))).texture("0", "block/jam_jar_mini_honey")).weight(3).rotationY(270).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_3_orange_w").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_3"))).texture("0", "block/jam_jar_mini_orange_marmalade")).weight(3).rotationY(270).nextModel()
                            .modelFile(models().getBuilder("block/jam_jars_stack_3_strawberry_w").parent(models().getExistingFile(modLoc("block/jam_jar_pyramid_3"))).texture("0", "block/jam_jar_mini_strawberry")).weight(3).rotationY(270)
                                    .addModel().condition(JamJarsBlock.STACKED, true).condition(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).end();


        hFacingBlockWithCustomModel(BlockRegistration.SAFE_NOVAKID);
        lanternBlock(BlockRegistration.HOPPIN_PARK_LANTERN);
        hFacingBlockWithCustomModel(BlockRegistration.SEA_GEM_LANTERN);
        hFacingBlockWithCustomModel(BlockRegistration.SEA_GEM_LANTERN_CEILING);
        multiblockParts(BlockRegistration.VIOLET_SCREEN);
        hFacingBlockWithCustomModel(BlockRegistration.HANGING_SHELVES_PLANTS);
        hFacingBlockWithCustomModel(BlockRegistration.HANGING_SHELVES_POTTERY);
        hFacingBlockWithCustomModel(BlockRegistration.POK_TA_POK_HOOP);
        hFacingBlockWithCustomModel(BlockRegistration.POK_TA_POK_HOOP_SNAKES);

        hFacingBlockWithCustomModel(BlockRegistration.RETRO_TOASTER_BLACK);
        hFacingBlockWithCustomModel(BlockRegistration.RETRO_TOASTER_BLUE);
        hFacingBlockWithCustomModel(BlockRegistration.RETRO_TOASTER_PINK);
        hFacingBlockWithCustomModel(BlockRegistration.RETRO_TOASTER_PURPLE);
        hFacingBlockWithCustomModel(BlockRegistration.RETRO_TOASTER_TURQUOISE);
        hFacingBlockWithCustomModel(BlockRegistration.RETRO_TOASTER_RED);
        hFacingBlockWithCustomModel(BlockRegistration.RETRO_TOASTER_WHITE);
        hFacingBlockWithCustomModel(BlockRegistration.RETRO_TOASTER_YELLOW);

        simpleBlockWithItem(BlockRegistration.THREAD_SPOOL_YELLOW.get(), models().getExistingFile(modLoc("block/spool_of_thread_yellow")));
        simpleBlockWithItem(BlockRegistration.THREAD_SPOOL_GREEN.get(), models().getExistingFile(modLoc("block/spool_of_thread_green")));
        simpleBlockWithItem(BlockRegistration.THREAD_SPOOL_PURPLE.get(), models().getExistingFile(modLoc("block/spool_of_thread_purple")));
        simpleBlockWithItem(BlockRegistration.THREAD_SPOOL_PINK.get(), models().getExistingFile(modLoc("block/spool_of_thread_pink")));

        hFacingBlockWithCustomModel(BlockRegistration.CAT_MUGS_CLUTTERED);
        hFacingBlockWithCustomModel(BlockRegistration.CAT_PLANT_POT_BLACK);
        hFacingBlockWithCustomModel(BlockRegistration.CAT_PLANT_POT_ORANGE);
        hFacingBlockWithCustomModel(BlockRegistration.COFFEE_GRINDER);
        flatFacingBlock(BlockRegistration.CAULDRON_POSTER, -90);

        hFacingBlockWithCustomModel(BlockRegistration.COTTAGE_CHAIR);
        hFacingBlockWithCustomModel(BlockRegistration.COTTAGE_CHAIR_CUSHIONED);
        hFacingBlockWithCustomModel(BlockRegistration.COTTAGE_OTTOMAN);
        hFacingBlockWithCustomModel(BlockRegistration.MADONNA_OTTOMAN);

        multiBlockWithOneModel(BlockRegistration.GUMBALL_MACHINE_RED);
        multiBlockWithOneModel(BlockRegistration.GUMBALL_MACHINE_BLUE);
        multiBlockWithOneModel(BlockRegistration.GUMBALL_MACHINE_PURPLE);

        simpleBlockWithItem(BlockRegistration.GLOWSHROOM_TERRARIUM_YELLOW.get(), models().getExistingFile(modLoc("block/glowshroom_terrarium_yellow")));
        simpleBlockWithItem(BlockRegistration.GLOWSHROOM_TERRARIUM_GREEN.get(), models().getExistingFile(modLoc("block/glowshroom_terrarium_green")));
        simpleBlockWithItem(BlockRegistration.GLOWSHROOM_TERRARIUM_BLUE.get(), models().getExistingFile(modLoc("block/glowshroom_terrarium_blue")));
        simpleBlockWithItem(BlockRegistration.GLOWSHROOM_TERRARIUM_PURPLE.get(), models().getExistingFile(modLoc("block/glowshroom_terrarium_purple")));
        simpleBlockWithItem(BlockRegistration.GLOWSHROOM_TERRARIUM_PINK.get(), models().getExistingFile(modLoc("block/glowshroom_terrarium_pink")));
        simpleBlockWithItem(BlockRegistration.MUSHROOM_TERRARIUM_RED.get(), models().getExistingFile(modLoc("block/mushroom_terrarium_red")));
        simpleBlockWithItem(BlockRegistration.MUSHROOM_TERRARIUM_BROWN.get(), models().getExistingFile(modLoc("block/mushroom_terrarium_brown")));

        hFacingBlockWithCustomModel(BlockRegistration.MINI_CACTUS_SET);
        hFacingBlockWithCustomModel(BlockRegistration.MUSHROOM_JARS);
        hFacingBlockWithCustomModel(BlockRegistration.NEWSPAPER_PILE_SHORT);
        hFacingBlockWithCustomModel(BlockRegistration.NEWSPAPER_PILE_TALL);
        hFacingBlockWithCustomModel(BlockRegistration.PAPER_PILE);

        hFacingBlockWithCustomModel(BlockRegistration.FENCE_SHELF);
        hFacingBlockWithCustomModel(BlockRegistration.HANGING_PLANT_POT_FLOWERS);
        hFacingBlockWithCustomModel(BlockRegistration.HANGING_PLANT_POT_GRASS);
        simpleBlockWithItem(BlockRegistration.PEDESTAL_HK.get(), models().getExistingFile(modLoc("block/pedestal_hk")));
        hFacingBlockWithCustomModel(BlockRegistration.PICNIC_BASKET);
        hFacingBlockWithCustomModel(BlockRegistration.PICNIC_BASKET_PREPARED);
        hFacingBlockWithCustomModel(BlockRegistration.BASKET_OF_FLOWERS);
        hFacingBlockWithCustomModel(BlockRegistration.BASKET_OF_PRODUCE);

        //DARKWOOD
        multiblockParts(BlockRegistration.DARKWOOD_BED_GEOMETRIC);
        multiblockParts(BlockRegistration.DARKWOOD_BED_QUILTED);
        multiblockParts(BlockRegistration.DARKWOOD_BED_SOUTHERN_FLAIR);
        multiblockParts(BlockRegistration.DARKWOOD_CABINET);
        multiblockParts(BlockRegistration.DARKWOOD_CHAIR_GEOMETRIC);
        multiblockParts(BlockRegistration.DARKWOOD_CHAIR_QUILTED);
        multiblockParts(BlockRegistration.DARKWOOD_CHAIR_SOUTHERN_FLAIR);
        multiblockParts(BlockRegistration.DARKWOOD_SOFA_GEOMETRIC);
        multiblockParts(BlockRegistration.DARKWOOD_SOFA_QUILTED);
        multiblockParts(BlockRegistration.DARKWOOD_SOFA_SOUTHERN_FLAIR);
        multiblockParts(BlockRegistration.DARKWOOD_DECORATIVE_SHELVES_GEOMETRIC);
        multiblockParts(BlockRegistration.DARKWOOD_DECORATIVE_SHELVES_QUILTED);
        multiblockParts(BlockRegistration.DARKWOOD_DECORATIVE_SHELVES_SOUTHERN_FLAIR);
        multiblockParts(BlockRegistration.DARKWOOD_TABLE);
        hFacingBlockWithCustomModel(BlockRegistration.DARKWOOD_CLOCK);
        hFacingBlockWithCustomModel(BlockRegistration.DARKWOOD_STOOL);
        hFacingBlockWithCustomModel(BlockRegistration.DARKWOOD_ENDTABLE);

        hFacingBlockWithCustomModel(BlockRegistration.WATERING_CAN);
        hFacingBlockWithCustomModel(BlockRegistration.WATERING_CAN_COPPER);

        hFacingBlockWithCustomModel(BlockRegistration.ROVER_STOOL);

        getVariantBuilder(BlockRegistration.RUBIKS_CUBE.get())
                .forAllStates(state ->
                        ConfiguredModel.builder()
                                .modelFile(state.getValue(RubiksCubeBlock.SOLVED) ? models().getExistingFile(modLoc("rubiks_cube")) : models().getExistingFile(modLoc("rubiks_cube_scrambled")))
                                .rotationY((int) state.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot() - 180)
                                .build());
        getVariantBuilder(BlockRegistration.RUBIKS_CUBE_PASTEL.get())
                .forAllStates(state ->
                        ConfiguredModel.builder()
                                .modelFile(state.getValue(RubiksCubeBlock.SOLVED) ? models().getExistingFile(modLoc("rubiks_cube_pastel")) : models().getExistingFile(modLoc("rubiks_cube_scrambled_pastel")))
                                .rotationY((int) state.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot() - 180)
                                .build());

        hFacingBlockWithCustomModel(BlockRegistration.ROW_OF_SMALL_BOOKS);
        hFacingBlockWithCustomModel(BlockRegistration.ROW_OF_SMALL_BOOKS_PASTEL);
        hFacingBlockWithCustomModel(BlockRegistration.SCATTERED_PAPERS);
        hFacingBlockWithCustomModel(BlockRegistration.SEWING_MACHINE_ANTIQUE);

        hFacingBlockWithCustomModel(BlockRegistration.ROW_OF_SMALL_BOOKS_SHELVED);
        hFacingBlockWithCustomModel(BlockRegistration.ROW_OF_SMALL_BOOKS_PASTEL_SHELVED);
        hFacingBlockWithCustomModel(BlockRegistration.STAINED_GLASS_LAMP);
        hFacingBlockWithCustomModel(BlockRegistration.SMALL_BUSH);
        hFacingBlockWithCustomModel(BlockRegistration.TEDDY_BEAR);

        hFacingBlockWithCustomModel(BlockRegistration.SMALL_SHELF);
        hFacingBlockWithCustomModel(BlockRegistration.SMALL_SHELF_PINK);
        hFacingBlockWithCustomModel(BlockRegistration.TWO_FLOWER_POTS);
        hFacingBlockWithCustomModel(BlockRegistration.TRADITIONAL_RADIO);
        multiblockParts(BlockRegistration.SEWING_MANNEQUIN);

        simpleBlockWithItem(BlockRegistration.STARS_PENDANT.get(), models().cross("stars_pendant", modLoc("block/stars_pendant")).renderType("cutout"));
        simpleBlockWithItem(BlockRegistration.MOON_PENDANT.get(), models().cross("moon_pendant", modLoc("block/moon_pendant")).renderType("cutout"));
        flatFacingBlock(BlockRegistration.MOON_DECORATION, -90);

        facingBlockWithCustomModel(BlockRegistration.CAGED_BULB);
        facingBlockWithCustomModel(BlockRegistration.VICTORIAN_STREETLIGHT_CROWN_MARBLE);
        facingBlockWithCustomModel(BlockRegistration.VICTORIAN_STREETLIGHT_2);
        hFacingBlockWithCustomModel(BlockRegistration.COLOSSEO_WALL_LANTERN);
        multiblockParts(BlockRegistration.BULLETIN_BOARD);
        multiblockParts(BlockRegistration.BULLETIN_BOARD_CLUTTERED);
        flatFacingBlock(BlockRegistration.POLAROIDS_A, -90);
        flatFacingBlock(BlockRegistration.POLAROIDS_B, -90);
        flatFacingBlock(BlockRegistration.POLAROIDS_C, -90);
        hFacingBlockWithCustomModel(BlockRegistration.OSSON_PENDANT_BLACK);
        hFacingBlockWithCustomModel(BlockRegistration.OSSON_PENDANT_BROWN);
        hFacingBlockWithCustomModel(BlockRegistration.OSSON_PENDANT_ORANGE);
        hFacingBlockWithCustomModel(BlockRegistration.OSSON_PENDANT_RACING_GREEN);
        hFacingBlockWithCustomModel(BlockRegistration.OSSON_PENDANT_SAGE_GREEN);
        hFacingBlockWithCustomModel(BlockRegistration.OSSON_PENDANT_RED);
        hFacingBlockWithCustomModel(BlockRegistration.OSSON_PENDANT_YELLOW);
        hFacingBlockWithCustomModel(BlockRegistration.OSSON_PENDANT_WHITE);

        multiblockParts(BlockRegistration.COTTAGE_BOOKCASE);
        multiblockParts(BlockRegistration.COTTAGE_STANDING_LAMP);
        multiBlockWithOneModel(BlockRegistration.DRYING_HERBS);
        hFacingBlockWithCustomModel(BlockRegistration.HANGING_CLOTH);

        multiblockParts(BlockRegistration.BAMBOO_BOOKSHELF);
        multiblockParts(BlockRegistration.FWISH_BOOKCASE);
        multiblockParts(BlockRegistration.RETRO_CAFE_SHELF);
        multiblockParts(BlockRegistration.RETRO_CAFE_SHELF_WINDOW);

        //TO DO?
        multiblockParts(BlockRegistration.BLACK_CAT_TABLE);
        multiblockParts(BlockRegistration.BLACK_CAT_SINK);
        multiblockParts(BlockRegistration.SWEETHEART_TABLE);
        multiblockParts(BlockRegistration.SWEETHEART_SINK);
        multiblockParts(BlockRegistration.CARD_INDEX);
        multiblockParts(BlockRegistration.CHINA_CABINET);
        multiblockParts(BlockRegistration.CUPID_BENCH);
        multiblockParts(BlockRegistration.GENERAL_STORE_CABINET);
        retroFridge(BlockRegistration.RETRO_FRIDGE_BLACK);
        retroFridge(BlockRegistration.RETRO_FRIDGE_BLUE);
        retroFridge(BlockRegistration.RETRO_FRIDGE_PINK);
        retroFridge(BlockRegistration.RETRO_FRIDGE_PURPLE);
        retroFridge(BlockRegistration.RETRO_FRIDGE_RED);
        retroFridge(BlockRegistration.RETRO_FRIDGE_TURQUOISE);
        retroFridge(BlockRegistration.RETRO_FRIDGE_WHITE);
        retroFridge(BlockRegistration.RETRO_FRIDGE_YELLOW);
        hFacingBlockWithCustomModel(BlockRegistration.BLACK_CAT_COUNTER_DRAWERS);
        hFacingBlockWithCustomModel(BlockRegistration.BLACK_CAT_COUNTER_LEFT_DOOR);
        hFacingBlockWithCustomModel(BlockRegistration.BLACK_CAT_COUNTER_RIGHT_DOOR);
        hFacingBlockWithCustomModel(BlockRegistration.SWEETHEART_COUNTER_DRAWERS);
        hFacingBlockWithCustomModel(BlockRegistration.SWEETHEART_COUNTER_LEFT_DOOR);
        hFacingBlockWithCustomModel(BlockRegistration.SWEETHEART_COUNTER_RIGHT_DOOR);
        hFacingBlockWithCustomModel(BlockRegistration.BOOK_OPEN);
        hFacingBlockWithCustomModel(BlockRegistration.BRASS_KEY);
        hFacingBlockWithCustomModel(BlockRegistration.ENVELOPE_STACK);
        hFacingBlockWithCustomModel(BlockRegistration.FLOWER_DESK_LAMP);
        hFacingBlockWithCustomModel(BlockRegistration.FLOWER_SHELF_BLUE);
        hFacingBlockWithCustomModel(BlockRegistration.FLOWER_SHELF_GREEN);
        hFacingBlockWithCustomModel(BlockRegistration.FLOWER_SHELF_PASTEL_YELLOW);
        hFacingBlockWithCustomModel(BlockRegistration.FLOWER_SHELF_PINK);
        hFacingBlockWithCustomModel(BlockRegistration.FLOWER_SHELF_PURPLE);
        hFacingBlockWithCustomModel(BlockRegistration.FLOWER_SHELF_YELLOW);
        hFacingBlockWithCustomModel(BlockRegistration.FLOWER_SHELF_CANDLE_BLUE);
        hFacingBlockWithCustomModel(BlockRegistration.FLOWER_SHELF_CANDLE_GREEN);
        hFacingBlockWithCustomModel(BlockRegistration.FLOWER_SHELF_CANDLE_PASTEL_YELLOW);
        hFacingBlockWithCustomModel(BlockRegistration.FLOWER_SHELF_CANDLE_PINK);
        hFacingBlockWithCustomModel(BlockRegistration.FLOWER_SHELF_CANDLE_PURPLE);
        hFacingBlockWithCustomModel(BlockRegistration.FLOWER_SHELF_CANDLE_YELLOW);
        hFacingBlockWithCustomModel(BlockRegistration.FLOWER_SHELF_PLANT);
        hFacingBlockWithCustomModel(BlockRegistration.FLOWER_TEA_KETTLE);
        hFacingBlockWithCustomModel(BlockRegistration.FWISH_ARMCHAIR);
        hFacingBlockWithCustomModel(BlockRegistration.FWISH_OTTOMAN);
        hFacingBlockWithCustomModel(BlockRegistration.HEAVENLY_ORNAMENTAL_ARRAY);
        hFacingBlockWithCustomModel(BlockRegistration.PLANT_LADDER);
        hFacingBlockWithCustomModel(BlockRegistration.POLAROID_CAMERA);
        hFacingBlockWithCustomModel(BlockRegistration.PUZZLE_PIECE_TABLE_BLUE);
        hFacingBlockWithCustomModel(BlockRegistration.PUZZLE_PIECE_TABLE_GREEN);
        hFacingBlockWithCustomModel(BlockRegistration.PUZZLE_PIECE_TABLE_RED);
        hFacingBlockWithCustomModel(BlockRegistration.PUZZLE_PIECE_TABLE_YELLOW);
        hFacingBlockWithCustomModel(BlockRegistration.PUZZLE_PIECE_TABLE_PASTEL_BLUE);
        hFacingBlockWithCustomModel(BlockRegistration.PUZZLE_PIECE_TABLE_PASTEL_PINK);
        hFacingBlockWithCustomModel(BlockRegistration.PUZZLE_PIECE_TABLE_PASTEL_PURPLE);
        hFacingBlockWithCustomModel(BlockRegistration.PUZZLE_PIECE_TABLE_PASTEL_YELLOW);
        hFacingBlockWithCustomModel(BlockRegistration.SALT_PEPPER_SHAKERS);
        hFacingBlockWithCustomModel(BlockRegistration.SAND_SEAL_PLUSH_BLUE);
        hFacingBlockWithCustomModel(BlockRegistration.SAND_SEAL_PLUSH_GREEN);
        hFacingBlockWithCustomModel(BlockRegistration.SAND_SEAL_PLUSH_RED);
        hFacingBlockWithCustomModel(BlockRegistration.SKETCHBOOK_SINGLE);
        hFacingBlockWithCustomModel(BlockRegistration.STACK_OF_BOOKS);
        hFacingBlockWithCustomModel(BlockRegistration.STACK_OF_BOOKS_TALL);
        hFacingBlockWithCustomModel(BlockRegistration.STEAMPUNK_GLOBE);
        hFacingBlockWithCustomModel(BlockRegistration.SWEETHEART_BAKING_SET_BOWL);
        hFacingBlockWithCustomModel(BlockRegistration.SWEETHEART_BAKING_SET_INGREDIENTS);
        hFacingBlockWithCustomModel(BlockRegistration.WINE_BOTTLE_RACK);
        hFacingBlockWithCustomModel(BlockRegistration.WINE_BOTTLES);
        hFacingBlockWithCustomModel(BlockRegistration.YELLOW_NOTEPAD);
        hFacingBlockWithCustomModel(BlockRegistration.FABRIC_BOLTS);
        hFacingBlockWithCustomModel(BlockRegistration.SCISSORS_AND_THREAD);
        hFacingBlockWithCustomModel(BlockRegistration.SLICED_BREAD);
        hFacingBlockWithCustomModel(BlockRegistration.VIAL_STAND);
        hFacingBlockWithCustomModel(BlockRegistration.PINEAPPLE);
        hFacingBlockWithCustomModel(BlockRegistration.MUSHROOM_FLAT);
        hFacingBlockWithCustomModel(BlockRegistration.HONEYCOMB_LAMP);
        hFacingBlockWithCustomModel(BlockRegistration.UNLIVING_CHAIR);

        multiblockParts(BlockRegistration.ANTIQUE_STANDING_LAMP);

        //GARLANDS
        garlandBlock(BlockRegistration.BLACK_CAT_GARLAND);
        garlandBlock(BlockRegistration.BLOSSOM_GARLAND);
        garlandBlock(BlockRegistration.BUNNY_GARLAND);
        garlandBlock(BlockRegistration.POLAROID_A_GARLAND);
        garlandBlock(BlockRegistration.POLAROID_B_GARLAND);
        garlandBlock(BlockRegistration.SUNFLOWER_GARLAND);
        garlandBlock(BlockRegistration.STARRY_GARLAND);

        //CAKES
        this.getVariantBuilder(BlockRegistration.HEART_CAKE.get())
                .partialState().with(HeartCakeBlock.BITES, 0).with(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH)
                    .modelForState().modelFile(models().getExistingFile(modLoc("block/heart_cake"))).rotationY(0).addModel()
                .partialState().with(HeartCakeBlock.BITES, 0).with(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST)
                    .modelForState().modelFile(models().getExistingFile(modLoc("block/heart_cake"))).rotationY(90).addModel()
                .partialState().with(HeartCakeBlock.BITES, 0).with(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH)
                    .modelForState().modelFile(models().getExistingFile(modLoc("block/heart_cake"))).rotationY(180).addModel()
                .partialState().with(HeartCakeBlock.BITES, 0).with(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST)
                    .modelForState().modelFile(models().getExistingFile(modLoc("block/heart_cake"))).rotationY(270).addModel()

                .partialState().with(HeartCakeBlock.BITES, 1).with(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH)
                    .modelForState().modelFile(models().getExistingFile(modLoc("block/heart_cake_1"))).rotationY(0).addModel()
                .partialState().with(HeartCakeBlock.BITES, 1).with(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST)
                    .modelForState().modelFile(models().getExistingFile(modLoc("block/heart_cake_1"))).rotationY(90).addModel()
                .partialState().with(HeartCakeBlock.BITES, 1).with(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH)
                    .modelForState().modelFile(models().getExistingFile(modLoc("block/heart_cake_1"))).rotationY(180).addModel()
                .partialState().with(HeartCakeBlock.BITES, 1).with(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST)
                    .modelForState().modelFile(models().getExistingFile(modLoc("block/heart_cake_1"))).rotationY(270).addModel()

                .partialState().with(HeartCakeBlock.BITES, 2).with(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH)
                    .modelForState().modelFile(models().getExistingFile(modLoc("block/heart_cake_2"))).rotationY(0).addModel()
                .partialState().with(HeartCakeBlock.BITES, 2).with(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST)
                    .modelForState().modelFile(models().getExistingFile(modLoc("block/heart_cake_2"))).rotationY(90).addModel()
                .partialState().with(HeartCakeBlock.BITES, 2).with(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH)
                    .modelForState().modelFile(models().getExistingFile(modLoc("block/heart_cake_2"))).rotationY(180).addModel()
                .partialState().with(HeartCakeBlock.BITES, 2).with(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST)
                    .modelForState().modelFile(models().getExistingFile(modLoc("block/heart_cake_2"))).rotationY(270).addModel();
        hFacingBlockWithCustomModel(BlockRegistration.BERRY_CAKE);

        //FLAGS
        flatFacingBlock(BlockRegistration.MINI_FLAG_BI, 0);
        flatFacingBlock(BlockRegistration.MINI_FLAG_LESBIAN, 0);
        flatFacingBlock(BlockRegistration.MINI_FLAG_TRANS, 0);
        flatFacingBlock(BlockRegistration.MINI_FLAG_NONBINARY, 0);
        flatFacingBlock(BlockRegistration.MINI_FLAG_PAN, 0);
        flatFacingBlock(BlockRegistration.MINI_FLAG_RAINBOW, 0);
        flatFacingBlock(BlockRegistration.MINI_FLAG_ACE, 0);

        //TODO
        flatFacingBlock(BlockRegistration.ANIMATED_FLAG_ASEXUAL, 0);
        flatFacingBlock(BlockRegistration.ANIMATED_FLAG_BISEXUAL, 0);
        flatFacingBlock(BlockRegistration.ANIMATED_FLAG_PANSEXUAL, 0);
        flatFacingBlock(BlockRegistration.ANIMATED_FLAG_RAINBOW, 0);
        flatFacingBlock(BlockRegistration.ANIMATED_FLAG_TRANSGENDER, 0);
        flatFacingBlock(BlockRegistration.ANIMATED_FLAG_NONBINARY, 0);
        flatFacingBlock(BlockRegistration.ANIMATED_FLAG_LESBIAN, 0);

        //CHAIRS
        multiblockParts(BlockRegistration.LOVELY_LOVE_SEAT);
        multiblockParts(BlockRegistration.LOVELY_LOVE_SEAT_BLACK);

        //ARMCHAIRS
        multiblockParts(BlockRegistration.ARMCHAIR_WHITE);
        multiblockParts(BlockRegistration.ARMCHAIR_LIGHT_GRAY);
        multiblockParts(BlockRegistration.ARMCHAIR_GRAY);
        multiblockParts(BlockRegistration.ARMCHAIR_BLACK);
        multiblockParts(BlockRegistration.ARMCHAIR_BROWN);
        multiblockParts(BlockRegistration.ARMCHAIR_RED);
        multiblockParts(BlockRegistration.ARMCHAIR_ORANGE);
        multiblockParts(BlockRegistration.ARMCHAIR_YELLOW);
        multiblockParts(BlockRegistration.ARMCHAIR_LIME);
        multiblockParts(BlockRegistration.ARMCHAIR_GREEN);
        multiblockParts(BlockRegistration.ARMCHAIR_CYAN);
        multiblockParts(BlockRegistration.ARMCHAIR_LIGHT_BLUE);
        multiblockParts(BlockRegistration.ARMCHAIR_BLUE);
        multiblockParts(BlockRegistration.ARMCHAIR_PURPLE);
        multiblockParts(BlockRegistration.ARMCHAIR_MAGENTA);
        multiblockParts(BlockRegistration.ARMCHAIR_PINK);
        multiblockParts(BlockRegistration.ARMCHAIR_FUCHSIA);
        multiblockParts(BlockRegistration.ARMCHAIR_IVORY);
        multiblockParts(BlockRegistration.ARMCHAIR_FLOWER);
        multiblockParts(BlockRegistration.ARMCHAIR_STRAWBERRY);
        multiblockParts(BlockRegistration.ARMCHAIR_HEART);
        multiblockParts(BlockRegistration.ARMCHAIR_WATERMELON);
        multiblockParts(BlockRegistration.ARMCHAIR_LEMON);
        multiblockParts(BlockRegistration.ARMCHAIR_STARRY);
        multiblockParts(BlockRegistration.ARMCHAIR_BLACK_CAT);
        multiblockParts(BlockRegistration.COTTAGE_ARMCHAIR);

        //MISC
        multiblockParts(BlockRegistration.TABLE_PLAIN);
        multiblockParts(BlockRegistration.TABLE_TABLECLOTH);

        //ENDTABLES
        hFacingBlockWithCustomModel(BlockRegistration.COTTAGE_SIDE_TABLE);
        hFacingBlockWithCustomModel(BlockRegistration.ENDTABLE_AMETHYST);
        hFacingBlockWithCustomModel(BlockRegistration.ENDTABLE_BUBBLEGUM);
        hFacingBlockWithCustomModel(BlockRegistration.ENDTABLE_CHARCOAL);
        hFacingBlockWithCustomModel(BlockRegistration.ENDTABLE_MEADOW);
        hFacingBlockWithCustomModel(BlockRegistration.ENDTABLE_PERIWINKLE);
        hFacingBlockWithCustomModel(BlockRegistration.ENDTABLE_SUNSHINE);
        hFacingBlockWithCustomModel(BlockRegistration.ENDTABLE_WOOD);
        hFacingBlockWithCustomModel(BlockRegistration.ENDTABLE_DECOR);
        hFacingBlockWithCustomModel(BlockRegistration.NIGHTSTAND_GREEN);
        hFacingBlockWithCustomModel(BlockRegistration.ROSE_END_TABLE);
        hFacingBlockWithCustomModel(BlockRegistration.ROSE_END_TABLE_BLACK);
        
        picketFencegateBlock(BlockRegistration.CHALCEDONY_PICKET_FENCE_GATE);
        picketFencegateBlock(BlockRegistration.DEEP_CHALCEDONY_PICKET_FENCE_GATE);
        picketFencegateBlock(BlockRegistration.MARBLE_PICKET_FENCE_GATE);
        picketFencegateBlock(BlockRegistration.WOODEN_PICKET_FENCE_GATE);


        this.getVariantBuilder(BlockRegistration.CARDBOARD_BOX.get())
                .forAllStates(state -> ConfiguredModel.builder().modelFile(
                                state.getValue(CardboardBoxBlock.OPEN_STATE).equals(CardboardBoxState.CLOSED) ?
                                        models().getExistingFile(modLoc("block/cardboard_box_closed")) :
                                state.getValue(CardboardBoxBlock.OPEN_STATE).equals(CardboardBoxState.EMPTY) ?
                                        models().getExistingFile(modLoc("block/cardboard_box_open")) :
                                        models().getExistingFile(modLoc("block/cardboard_box_cluttered")))
                        .rotationY((int) state.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot())
                        .build());
    }

    private void retroFridge(RegistryObject<Block> block) {
        String name = block.getId().toString().replace("cluttered:", "");

        this.getVariantBuilder(block.get())
                .forAllStates(state -> ConfiguredModel.builder().modelFile(
                                state.getValue(BlockStateProperties.OPEN) ?
                                        models().getExistingFile(modLoc("block/" + name  + "_open_" + state.getValue(MultiblockPlacer.MULTIBLOCK_PART))):
                                        models().getExistingFile(modLoc("block/" + name + "_"  + state.getValue(MultiblockPlacer.MULTIBLOCK_PART))))
                        .rotationY((int) state.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot())
                        .build());
    }


    private void multiblockParts(RegistryObject<Block> block) {
        String name = block.getId().toString().replace("cluttered:", "");

        getVariantBuilder(block.get())
                .forAllStates(state ->
                        ConfiguredModel.builder().modelFile(models().getExistingFile(modLoc(name + "_" + state.getValue(((MultiblockPlacer) block.get()).getMultiblockPart()))))
                                .rotationY((int) state.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot())
                                .build());
    }

    private void multiBlockWithOneModel(RegistryObject<Block> block){
        String name = "block/" + block.getId().toString().replace("cluttered:", "");
        this.getVariantBuilder(block.get())
                .partialState().with(((MultiblockPlacer) block.get()).getMultiblockPart(), 1).with(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH)
                .modelForState().modelFile(models().getExistingFile(modLoc(name)))
                .rotationY(180)
                .addModel()
                .partialState().with(((MultiblockPlacer) block.get()).getMultiblockPart(), 1).with(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST)
                .modelForState().modelFile(models().getExistingFile(modLoc(name)))
                .rotationY(270)
                .addModel()
                .partialState().with(((MultiblockPlacer) block.get()).getMultiblockPart(), 1).with(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH)
                .modelForState().modelFile(models().getExistingFile(modLoc(name)))
                .rotationY(0)
                .addModel()
                .partialState().with(((MultiblockPlacer) block.get()).getMultiblockPart(), 1).with(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST)
                .modelForState().modelFile(models().getExistingFile(modLoc(name)))
                .rotationY(90)
                .addModel()
                .partialState().with(((MultiblockPlacer) block.get()).getMultiblockPart(), 2)
                .modelForState().modelFile(models().cubeAll(name.replace("block/", "") + "2", modLoc("block/blank_texture")).renderType("cutout"))
                .addModel();
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
        String woodType;
        if (!isWood) {
            woodType = log.getId().toString().replace("cluttered:", "").replace("_log", "");
            axisBlock((RotatedPillarBlock) log.get(),
                    new ResourceLocation(Cluttered.MODID + ":block/" + woodType + "_log"),
                    new ResourceLocation(Cluttered.MODID + ":block/" + woodType + "_log_top" ));
        }
        else {
            woodType = log.getId().toString().replace("cluttered:", "").replace("_wood", "");
            axisBlock((RotatedPillarBlock) log.get(),
                    new ResourceLocation(Cluttered.MODID + ":block/" + woodType + "_log"),
                    new ResourceLocation(Cluttered.MODID + ":block/" + woodType + "_log"));
        }
        blockItem(log);
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

    private void hFacingBlockWithCustomModel(RegistryObject<Block> block){
        String id = block.getId().toString().replace("cluttered:", "");
        this.getVariantBuilder(block.get())
                .forAllStates(state ->
                        ConfiguredModel.builder()
                                .modelFile(models().getExistingFile(modLoc("block/" + id)))
                                .rotationY((int) state.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot() - 180)
                                .build());
    }
    private void facingBlockWithCustomModel(RegistryObject<Block> block){
        String id = block.getId().toString().replace("cluttered:", "");
        this.getVariantBuilder(block.get())
                .forAllStates(state ->
                        ConfiguredModel.builder()
                                .modelFile(models().getExistingFile(modLoc("block/" + id)))
                                .rotationY((int) state.getValue(BlockStateProperties.FACING).toYRot() - 180)
                                .rotationX(state.getValue(BlockStateProperties.FACING).equals(Direction.DOWN) ? 0 : state.getValue(BlockStateProperties.FACING).equals(Direction.UP) ? 180 : -90)
                                .build());
    }

    private void flatFacingBlock(RegistryObject<Block> block, int offsetX){
        String id = block.getId().toString().replace("cluttered:", "");
        this.getVariantBuilder(block.get())
                .forAllStates(state ->
                        ConfiguredModel.builder()
                                .modelFile(models().getExistingFile(modLoc("block/" + id)))
                                .rotationY((int)state.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot() + (state.getValue(BlockStateProperties.ATTACH_FACE).equals(AttachFace.WALL) ? 180 : 0))
                                .rotationX(state.getValue(BlockStateProperties.ATTACH_FACE).equals(AttachFace.WALL) ? 90 + offsetX : (state.getValue(BlockStateProperties.ATTACH_FACE).equals(AttachFace.CEILING) ? 180 + offsetX : offsetX))
                                .build());
    }

    private void recordPlayerBlock(RegistryObject<Block> block){
        String id = block.getId().toString().replace("cluttered:", "");

        this.getMultipartBuilder(block.get())
                .part().modelFile(models().getExistingFile(modLoc("block/" + id))).rotationY(0).addModel()
                    .condition(CustomJukeboxBlock.FACING, Direction.NORTH).end()
                .part().modelFile(models().getExistingFile(modLoc("block/" + id))).rotationY(90).addModel()
                    .condition(CustomJukeboxBlock.FACING, Direction.EAST).end()
                .part().modelFile(models().getExistingFile(modLoc("block/" + id))).rotationY(180).addModel()
                    .condition(CustomJukeboxBlock.FACING, Direction.SOUTH).end()
                .part().modelFile(models().getExistingFile(modLoc("block/" + id))).rotationY(270).addModel()
                    .condition(CustomJukeboxBlock.FACING, Direction.WEST).end()
                .part().modelFile(models().getExistingFile(modLoc("block/record"))).rotationY(0).addModel()
                    .condition(CustomJukeboxBlock.HAS_RECORD, true).condition(CustomJukeboxBlock.FACING, Direction.NORTH).end()
                .part().modelFile(models().getExistingFile(modLoc("block/record"))).rotationY(90).addModel()
                    .condition(CustomJukeboxBlock.HAS_RECORD, true).condition(CustomJukeboxBlock.FACING, Direction.EAST).end()
                .part().modelFile(models().getExistingFile(modLoc("block/record"))).rotationY(180).addModel()
                    .condition(CustomJukeboxBlock.HAS_RECORD, true).condition(CustomJukeboxBlock.FACING, Direction.SOUTH).end()
                .part().modelFile(models().getExistingFile(modLoc("block/record"))).rotationY(270).addModel()
                    .condition(CustomJukeboxBlock.HAS_RECORD, true).condition(CustomJukeboxBlock.FACING, Direction.WEST).end();
    }
    private void garlandBlock(RegistryObject<Block> block){
        String id = block.getId().toString().replace("cluttered:", "");

        this.getVariantBuilder(block.get()).forAllStates(state ->
                ConfiguredModel.builder().modelFile(models().getExistingFile(modLoc("block/" + id + "_" + state.getValue(GarlandBlock.OFFSET).getSerializedName())))
                        .rotationY((int) state.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot()).build());
    }

    private void lanternBlock(RegistryObject<Block> block){
        String id = block.getId().toString().replace("cluttered:", "");

        this.getVariantBuilder(block.get())
                .forAllStates(state -> ConfiguredModel.builder().modelFile(
                                state.getValue(HoppinParkLantern.PLACE_STATE).equals(LanternPlaceState.FLOOR) ?
                                        models().getExistingFile(modLoc("block/" + id)) :
                                        state.getValue(HoppinParkLantern.PLACE_STATE).equals(LanternPlaceState.WALL) ?
                                                models().getExistingFile(modLoc("block/" + id + "_wall")) :
                                                models().getExistingFile(modLoc("block/" + id + "_ceiling")))
                        .rotationY((int) state.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot())
                        .build());
    }

    private void balustradeBlock(RegistryObject<Block> block){
        String id = block.getId().toString().replace("cluttered:", "");

        BlockModelBuilder post = models().getBuilder("block/" + id + "_post").parent(models().getExistingFile(modLoc("block/balustrade_post"))).texture("2", modLoc("block/" + id)).texture("particle", modLoc("block/" + id));
        BlockModelBuilder side = models().getBuilder("block/" + id + "_side").parent(models().getExistingFile(modLoc("block/balustrade_side"))).texture("2", modLoc("block/" + id)).texture("particle", modLoc("block/" + id));
        this.getMultipartBuilder(block.get())
                .part().modelFile(post).addModel().useOr().nestedGroup()
                    .condition(FenceBlock.NORTH, true)
                    .condition(FenceBlock.SOUTH, false)
                .end()
                .nestedGroup()
                    .condition(FenceBlock.SOUTH, true)
                    .condition(FenceBlock.NORTH, false)
                .end()
                .nestedGroup()
                    .condition(FenceBlock.EAST, true)
                    .condition(FenceBlock.WEST, false)
                .end()
                .nestedGroup()
                    .condition(FenceBlock.WEST, true)
                    .condition(FenceBlock.EAST, false)
                .end()
                .nestedGroup()
                    .condition(FenceBlock.WEST, true)
                    .condition(FenceBlock.EAST, true)
                    .condition(FenceBlock.NORTH, true)
                    .condition(FenceBlock.SOUTH, true)
                .end()
                .nestedGroup()
                    .condition(FenceBlock.WEST, false)
                    .condition(FenceBlock.EAST, false)
                    .condition(FenceBlock.NORTH, false)
                    .condition(FenceBlock.SOUTH, false)
                .end()
                .end()
                .part().modelFile(side).rotationY((int) Direction.NORTH.getOpposite().toYRot()).addModel()
                .condition(FenceBlock.NORTH, true).end()
                .part().modelFile(side).rotationY((int) Direction.EAST.getOpposite().toYRot()).addModel()
                .condition(FenceBlock.EAST, true).end()
                .part().modelFile(side).rotationY((int) Direction.SOUTH.getOpposite().toYRot()).addModel()
                .condition(FenceBlock.SOUTH, true).end()
                .part().modelFile(side).rotationY((int) Direction.WEST.getOpposite().toYRot()).addModel()
                .condition(FenceBlock.WEST, true).end();
    }

    private void bracketBlock(RegistryObject<Block> block){
        String id = block.getId().toString().replace("cluttered:", "");

        this.getVariantBuilder(block.get())
                .forAllStates(state -> ConfiguredModel.builder().modelFile(
                        //OK the formatting looks weird and is bad but its just a ternary operator
                        //for which model to use (offset or not) and then another couple of ternary operators
                        //to decide if its flipped or not
                        //I love ternary operators i think <3
                                state.getValue(BracketBlock.OFFSET) ?
                                        models().getBuilder("block/" + id + "_offset").parent(models().getExistingFile(modLoc("block/bracket_offset"))).texture("missing", "block/" + id).texture("particle", "block/" + id) :
                                        models().getBuilder("block/" + id + "_base").parent(models().getExistingFile(modLoc("block/bracket_base"))).texture("missing", "block/" + id).texture("particle", "block/" + id))
                        .rotationY(state.getValue(BracketBlock.IS_UP) ? (int)state.getValue(BlockStateProperties.HORIZONTAL_FACING).getOpposite().toYRot() : (int)state.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot()).rotationX(state.getValue(BracketBlock.IS_UP) ? 0 : 180).build());
    }

    private void picketFenceBlock(RegistryObject<Block> block){
        String id = block.getId().toString().replace("cluttered:", "");

        BlockModelBuilder post = models().getBuilder("block/" + id + "_post").parent(models().getExistingFile(modLoc("block/picket_fence_post"))).texture("2", modLoc("block/" + id)).texture("particle", modLoc("block/" + id));
        BlockModelBuilder side = models().getBuilder("block/" + id + "_side").parent(models().getExistingFile(modLoc("block/picket_fence_side"))).texture("2", modLoc("block/" + id)).texture("particle", modLoc("block/" + id));
        this.getMultipartBuilder(block.get())
                .part().modelFile(post).addModel().end()
                .part().modelFile(side).rotationY((int) Direction.NORTH.getOpposite().toYRot()).addModel()
                .condition(FenceBlock.NORTH, true).end()
                .part().modelFile(side).rotationY((int) Direction.EAST.getOpposite().toYRot()).addModel()
                .condition(FenceBlock.EAST, true).end()
                .part().modelFile(side).rotationY((int) Direction.SOUTH.getOpposite().toYRot()).addModel()
                .condition(FenceBlock.SOUTH, true).end()
                .part().modelFile(side).rotationY((int) Direction.WEST.getOpposite().toYRot()).addModel()
                .condition(FenceBlock.WEST, true).end();
    }

    private void picketFencegateBlock(RegistryObject<Block> block){
        String id = block.getId().toString().replace("cluttered:", "");

        this.getVariantBuilder(block.get())
                .forAllStates(state ->
                        ConfiguredModel.builder().modelFile(
                                        //ternary operator with a nested ternary operator
                                        state.getValue(PicketFenceGateBlock.OPEN_STATE).equals(PicketFenceGateOpen.CLOSED) ?
                                                //ternary operator result 1
                                                models().getBuilder("block/" + id + "_closed").parent(models().getExistingFile(modLoc("block/picket_fence_gate_closed"))).texture("1", "block/" + id).texture("particle", "block/" + id) :
                                                //ternary operator result 2 (nested ternary)
                                                state.getValue(PicketFenceGateBlock.OPEN_STATE).equals(PicketFenceGateOpen.FORWARD) ?
                                                        //nested ternary operator result 1
                                                        models().getBuilder("block/" + id + "_forward").parent(models().getExistingFile(modLoc("block/picket_fence_gate_open_forwards"))).texture("1", "block/" + id).texture("particle", "block/" + id) :
                                                        //nested ternary operator result 2
                                                        models().getBuilder("block/" + id + "_backward").parent(models().getExistingFile(modLoc("block/picket_fence_gate_open_backwards"))).texture("1", "block/" + id).texture("particle", "block/" + id)
                                )
                                .rotationY((int) state.getValue(BlockStateProperties.HORIZONTAL_FACING).getOpposite().toYRot())
                                .build()
                );
    }

    //private void flatFacingBlock(RegistryObject<Block> block){
    //    String id = block.getId().toString().replace("cluttered:", "");
//
    //    this.getVariantBuilder(block.get())
    //            .forAllStates(state ->
    //                    ConfiguredModel.builder()
    //                            .modelFile(models().getExistingFile(modLoc("block/cauldron_poster")))
    //                            .rotationY((int)state.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot() + (state.getValue(BlockStateProperties.ATTACH_FACE).equals(AttachFace.WALL) ? 180 : 0))
    //                            .rotationX(state.getValue(BlockStateProperties.ATTACH_FACE).equals(AttachFace.WALL) ? 0 : (state.getValue(BlockStateProperties.ATTACH_FACE).equals(AttachFace.CEILING) ? 90 : -90))
    //                            .build());
    //}
}
