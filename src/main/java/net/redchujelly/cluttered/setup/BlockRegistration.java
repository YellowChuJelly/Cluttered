package net.redchujelly.cluttered.setup;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.redchujelly.cluttered.Cluttered;
import net.redchujelly.cluttered.block.custom.*;
import net.redchujelly.cluttered.block.custom.furniture.*;
import net.redchujelly.cluttered.block.multiblock.*;
import net.redchujelly.cluttered.worldgen.ClutteredConfiguredFeatures;
import net.redchujelly.cluttered.worldgen.tree.PoplarTreeGrower;
import net.redchujelly.cluttered.worldgen.tree.WillowTreeGrower;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class BlockRegistration {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Cluttered.MODID);


    //WILLOW WOODSET
    public static final RegistryObject<Block> WILLOW_LOG = registerFuelBlock("willow_log",
            () -> new CustomLogLikeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.PURPLE)), 300);
    public static final RegistryObject<Block> STRIPPED_WILLOW_LOG = registerFuelBlock("stripped_willow_log",
            () -> new CustomLogLikeBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).mapColor(DyeColor.PURPLE)), 300);
    public static final RegistryObject<Block> WILLOW_WOOD = registerFuelBlock("willow_wood",
            () -> new CustomLogLikeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).mapColor(DyeColor.PURPLE)), 300);
    public static final RegistryObject<Block> STRIPPED_WILLOW_WOOD = registerFuelBlock("stripped_willow_wood",
            () -> new CustomLogLikeBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).mapColor(DyeColor.PURPLE)), 300);
    public static final RegistryObject<Block> WILLOW_PLANKS = registerFuelBlock("willow_planks",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.PURPLE)), 300);
    public static final RegistryObject<Block> WILLOW_SLAB = registerFuelBlock("willow_slab",
            () -> new CustomWoodSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).mapColor(DyeColor.PURPLE)), 150);
    public static final RegistryObject<Block> WILLOW_STAIRS = registerFuelBlock("willow_stairs",
            () -> new CustomWoodStairs(() -> BlockRegistration.WILLOW_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).mapColor(DyeColor.PURPLE)), 300);
    public static final RegistryObject<Block> WILLOW_FENCE = registerFuelBlock("willow_fence",
            () -> new CustomWoodFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).mapColor(DyeColor.PURPLE)), 300);
    public static final RegistryObject<Block> WILLOW_FENCE_GATE = registerFuelBlock("willow_fence_gate",
            () -> new CustomWoodFenceGate(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE).mapColor(DyeColor.PURPLE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE), 300);
    public static final RegistryObject<Block> WILLOW_LOG_DOOR = registerFuelBlock("willow_log_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(DyeColor.PURPLE), BlockSetType.OAK), 300);
    public static final RegistryObject<Block> WILLOW_GARDEN_DOOR = registerFuelBlock("willow_garden_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(DyeColor.PURPLE), BlockSetType.OAK), 300);
    public static final RegistryObject<Block> WILLOW_DOOR = registerFuelBlock("willow_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(DyeColor.PURPLE), BlockSetType.OAK), 300);
    public static final RegistryObject<Block> WILLOW_TRAPDOOR = registerFuelBlock("willow_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).mapColor(DyeColor.PURPLE), BlockSetType.OAK), 300);
    public static final RegistryObject<Block> WILLOW_BUTTON = registerFuelBlock("willow_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).mapColor(DyeColor.PURPLE),
            BlockSetType.OAK, 30, true), 100);
    public static final RegistryObject<Block> WILLOW_PRESSURE_PLATE = registerFuelBlock("willow_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).mapColor(DyeColor.PURPLE),
            BlockSetType.OAK), 300);
    public static final RegistryObject<Block> WILLOW_LEAVES = registerBlock("willow_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(DyeColor.PURPLE)));
    //public static final RegistryObject<Block> WILLOW_VINES = registerBlock("willow_vines",
    //        () -> new WillowVineBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(DyeColor.PURPLE)));
    public static final RegistryObject<Block> WILLOW_SAPLING = registerFuelBlock("willow_sapling",
            () -> new SaplingBlock(new WillowTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING).mapColor(DyeColor.PURPLE)), 100);
    public static final RegistryObject<Block> POTTED_WILLOW_SAPLING = BLOCKS.register("potted_willow_sapling",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), BlockRegistration.WILLOW_SAPLING,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_BIRCH_SAPLING)));

    public static final RegistryObject<Block> WILLOW_BOOKSHELF_BLACK_CAT = registerFuelBlock("willow_bookshelf_black_cat",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF).mapColor(DyeColor.PURPLE)), 300);
    public static final RegistryObject<Block> WILLOW_BOOKSHELF_CALICO_CAT = registerFuelBlock("willow_bookshelf_calico_cat",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF).mapColor(DyeColor.PURPLE)), 300);
    public static final RegistryObject<Block> WILLOW_BOOKSHELF_COBWEB = registerFuelBlock("willow_bookshelf_cobweb",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF).mapColor(DyeColor.PURPLE)), 300);
    public static final RegistryObject<Block> WILLOW_BOOKSHELF_BOTTLES = registerFuelBlock("willow_bookshelf_bottles",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF).mapColor(DyeColor.PURPLE)), 300);
    public static final RegistryObject<Block> WILLOW_BOOKSHELF_VASE = registerFuelBlock("willow_bookshelf_vase",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF).mapColor(DyeColor.PURPLE)), 300);
    public static final RegistryObject<Block> WILLOW_WINDOW = registerBlock("willow_window",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).mapColor(DyeColor.PURPLE).noOcclusion()));
    public static final RegistryObject<Block> WILLOW_WINDOW_PANE = registerBlock("willow_window_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS_PANE).mapColor(DyeColor.PURPLE).noOcclusion()));

    //FLOWERING WILLOW WOODSET
    public static final RegistryObject<Block> FLOWERING_WILLOW_LOG = registerFuelBlock("flowering_willow_log",
            () -> new CustomLogLikeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.PURPLE)), 300);
    public static final RegistryObject<Block> STRIPPED_FLOWERING_WILLOW_LOG = registerFuelBlock("stripped_flowering_willow_log",
            () -> new CustomLogLikeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.PURPLE)), 300);
    public static final RegistryObject<Block> FLOWERING_WILLOW_WOOD = registerFuelBlock("flowering_willow_wood",
            () -> new CustomLogLikeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.PURPLE)), 300);
    public static final RegistryObject<Block> STRIPPED_FLOWERING_WILLOW_WOOD = registerFuelBlock("stripped_flowering_willow_wood",
            () -> new CustomLogLikeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.PURPLE)), 300);
    public static final RegistryObject<Block> FLOWERING_WILLOW_PLANKS = registerFuelBlock("flowering_willow_planks",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.PURPLE)), 300);
    public static final RegistryObject<Block> FLOWERING_WILLOW_SLAB = registerFuelBlock("flowering_willow_slab",
            () -> new CustomWoodSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).mapColor(DyeColor.PURPLE)), 150);
    public static final RegistryObject<Block> FLOWERING_WILLOW_STAIRS = registerFuelBlock("flowering_willow_stairs",
            () -> new CustomWoodStairs(() -> BlockRegistration.FLOWERING_WILLOW_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).mapColor(DyeColor.PURPLE)), 300);
    public static final RegistryObject<Block> FLOWERING_WILLOW_FENCE = registerFuelBlock("flowering_willow_fence",
            () -> new CustomWoodFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).mapColor(DyeColor.PURPLE)), 300);
    public static final RegistryObject<Block> FLOWERING_WILLOW_FENCE_GATE = registerFuelBlock("flowering_willow_fence_gate",
            () -> new CustomWoodFenceGate(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE).mapColor(DyeColor.PURPLE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE), 300);
    public static final RegistryObject<Block> FLOWERING_WILLOW_DOOR = registerFuelBlock("flowering_willow_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(DyeColor.PURPLE), BlockSetType.OAK), 300);
    public static final RegistryObject<Block> FLOWERING_WILLOW_TRAPDOOR = registerFuelBlock("flowering_willow_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).mapColor(DyeColor.PURPLE), BlockSetType.OAK), 300);
    public static final RegistryObject<Block> FLOWERING_WILLOW_BUTTON = registerFuelBlock("flowering_willow_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).mapColor(DyeColor.PURPLE),
                    BlockSetType.OAK, 30, true), 100);
    public static final RegistryObject<Block> FLOWERING_WILLOW_PRESSURE_PLATE = registerFuelBlock("flowering_willow_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).mapColor(DyeColor.PURPLE),
                    BlockSetType.OAK), 300);
    public static final RegistryObject<Block> FLOWERING_WILLOW_WINDOW = registerBlock("flowering_willow_window",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).mapColor(DyeColor.PURPLE).noOcclusion()));
    public static final RegistryObject<Block> FLOWERING_WILLOW_WINDOW_PANE = registerBlock("flowering_willow_window_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS_PANE).mapColor(DyeColor.PURPLE).noOcclusion()));

    //POPLAR WOODSET
    public static final RegistryObject<Block> POPLAR_LOG = registerFuelBlock("poplar_log",
            () -> new CustomLogLikeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.YELLOW)), 300);
    public static final RegistryObject<Block> STRIPPED_POPLAR_LOG = registerFuelBlock("stripped_poplar_log",
            () -> new CustomLogLikeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.YELLOW)), 300);
    public static final RegistryObject<Block> POPLAR_WOOD = registerFuelBlock("poplar_wood",
            () -> new CustomLogLikeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.YELLOW)), 300);
    public static final RegistryObject<Block> STRIPPED_POPLAR_WOOD = registerFuelBlock("stripped_poplar_wood",
            () -> new CustomLogLikeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.YELLOW)), 300);
    public static final RegistryObject<Block> POPLAR_PLANKS = registerFuelBlock("poplar_planks",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.YELLOW)), 300);
    public static final RegistryObject<Block> POPLAR_SLAB = registerFuelBlock("poplar_slab",
            () -> new CustomWoodSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).mapColor(DyeColor.YELLOW)), 150);
    public static final RegistryObject<Block> POPLAR_STAIRS = registerFuelBlock("poplar_stairs",
            () -> new CustomWoodStairs(() -> BlockRegistration.POPLAR_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).mapColor(DyeColor.YELLOW)), 300);
    public static final RegistryObject<Block> POPLAR_FENCE = registerFuelBlock("poplar_fence",
            () -> new CustomWoodFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).mapColor(DyeColor.YELLOW)), 300);
    public static final RegistryObject<Block> POPLAR_FENCE_GATE = registerFuelBlock("poplar_fence_gate",
            () -> new CustomWoodFenceGate(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE).mapColor(DyeColor.YELLOW), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE), 300);
    public static final RegistryObject<Block> POPLAR_DOOR = registerFuelBlock("poplar_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(DyeColor.YELLOW), BlockSetType.OAK), 300);
    public static final RegistryObject<Block> POPLAR_TRAPDOOR = registerFuelBlock("poplar_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).mapColor(DyeColor.YELLOW), BlockSetType.OAK), 300);
    public static final RegistryObject<Block> POPLAR_BUTTON = registerFuelBlock("poplar_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).mapColor(DyeColor.YELLOW),
                    BlockSetType.OAK, 30, true), 100);
    public static final RegistryObject<Block> POPLAR_PRESSURE_PLATE = registerFuelBlock("poplar_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).mapColor(DyeColor.YELLOW),
                    BlockSetType.OAK), 300);
    public static final RegistryObject<Block> POPLAR_BOOKSHELF = registerFuelBlock("poplar_bookshelf",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF).mapColor(DyeColor.YELLOW)), 300);
    public static final RegistryObject<Block> POPLAR_WINDOW = registerBlock("poplar_window",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).mapColor(DyeColor.YELLOW).noOcclusion()));
    public static final RegistryObject<Block> POPLAR_WINDOW_PANE = registerBlock("poplar_window_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS_PANE).mapColor(DyeColor.YELLOW).noOcclusion()));
    public static final RegistryObject<Block> POPLAR_LEAVES = registerBlock("poplar_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(DyeColor.YELLOW)));
    public static final RegistryObject<Block> POPLAR_SAPLING = registerFuelBlock("poplar_sapling",
            () -> new SaplingBlock(new PoplarTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING).mapColor(DyeColor.YELLOW)), 100);
    public static final RegistryObject<Block> POTTED_POPLAR_SAPLING = BLOCKS.register("potted_poplar_sapling",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), BlockRegistration.POPLAR_SAPLING,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_BIRCH_SAPLING)));

    //FLOWERING POPLAR WOODSET
    public static final RegistryObject<Block> FLOWERING_POPLAR_LOG = registerFuelBlock("flowering_poplar_log",
            () -> new CustomLogLikeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.YELLOW)), 300);
    public static final RegistryObject<Block> STRIPPED_FLOWERING_POPLAR_LOG = registerFuelBlock("stripped_flowering_poplar_log",
            () -> new CustomLogLikeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.YELLOW)), 300);
    public static final RegistryObject<Block> FLOWERING_POPLAR_WOOD = registerFuelBlock("flowering_poplar_wood",
            () -> new CustomLogLikeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.YELLOW)), 300);
    public static final RegistryObject<Block> STRIPPED_FLOWERING_POPLAR_WOOD = registerFuelBlock("stripped_flowering_poplar_wood",
            () -> new CustomLogLikeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.YELLOW)), 300);
    public static final RegistryObject<Block> FLOWERING_POPLAR_PLANKS = registerFuelBlock("flowering_poplar_planks",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.YELLOW)), 300);
    public static final RegistryObject<Block> FLOWERING_POPLAR_SLAB = registerFuelBlock("flowering_poplar_slab",
            () -> new CustomWoodSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).mapColor(DyeColor.YELLOW)), 150);
    public static final RegistryObject<Block> FLOWERING_POPLAR_STAIRS = registerFuelBlock("flowering_poplar_stairs",
            () -> new CustomWoodStairs(() -> BlockRegistration.FLOWERING_POPLAR_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).mapColor(DyeColor.YELLOW)), 300);
    public static final RegistryObject<Block> FLOWERING_POPLAR_FENCE = registerFuelBlock("flowering_poplar_fence",
            () -> new CustomWoodFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).mapColor(DyeColor.YELLOW)), 300);
    public static final RegistryObject<Block> FLOWERING_POPLAR_FENCE_GATE = registerFuelBlock("flowering_poplar_fence_gate",
            () -> new CustomWoodFenceGate(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE).mapColor(DyeColor.YELLOW), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE), 300);
    public static final RegistryObject<Block> FLOWERING_POPLAR_DOOR = registerFuelBlock("flowering_poplar_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(DyeColor.YELLOW), BlockSetType.OAK), 300);
    public static final RegistryObject<Block> FLOWERING_POPLAR_TRAPDOOR = registerFuelBlock("flowering_poplar_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).mapColor(DyeColor.YELLOW), BlockSetType.OAK), 300);
    public static final RegistryObject<Block> FLOWERING_POPLAR_BUTTON = registerFuelBlock("flowering_poplar_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).mapColor(DyeColor.YELLOW),
                    BlockSetType.OAK, 30, true), 100);
    public static final RegistryObject<Block> FLOWERING_POPLAR_PRESSURE_PLATE = registerFuelBlock("flowering_poplar_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).mapColor(DyeColor.YELLOW),
                    BlockSetType.OAK), 300);
    public static final RegistryObject<Block> FLOWERING_POPLAR_BOOKSHELF = registerFuelBlock("flowering_poplar_bookshelf",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF).mapColor(DyeColor.YELLOW)), 300);
    public static final RegistryObject<Block> FLOWERING_POPLAR_WINDOW = registerBlock("flowering_poplar_window",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).mapColor(DyeColor.YELLOW).noOcclusion()));
    public static final RegistryObject<Block> FLOWERING_POPLAR_WINDOW_PANE = registerBlock("flowering_poplar_window_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS_PANE).mapColor(DyeColor.YELLOW).noOcclusion()));

    //CRABAPPLE WOODSET
    public static final RegistryObject<Block> CRABAPPLE_LOG = registerFuelBlock("crabapple_log",
            () -> new CustomLogLikeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.PINK)), 300);
    public static final RegistryObject<Block> STRIPPED_CRABAPPLE_LOG = registerFuelBlock("stripped_crabapple_log",
            () -> new CustomLogLikeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.PINK)), 300);
    public static final RegistryObject<Block> CRABAPPLE_WOOD = registerFuelBlock("crabapple_wood",
            () -> new CustomLogLikeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.PINK)), 300);
    public static final RegistryObject<Block> STRIPPED_CRABAPPLE_WOOD = registerFuelBlock("stripped_crabapple_wood",
            () -> new CustomLogLikeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.PINK)), 300);
    public static final RegistryObject<Block> CRABAPPLE_PLANKS = registerFuelBlock("crabapple_planks",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.PINK)), 300);
    public static final RegistryObject<Block> CRABAPPLE_SLAB = registerFuelBlock("crabapple_slab",
            () -> new CustomWoodSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).mapColor(DyeColor.PINK)), 150);
    public static final RegistryObject<Block> CRABAPPLE_STAIRS = registerFuelBlock("crabapple_stairs",
            () -> new CustomWoodStairs(() -> BlockRegistration.CRABAPPLE_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).mapColor(DyeColor.PINK)), 300);
    public static final RegistryObject<Block> CRABAPPLE_FENCE = registerFuelBlock("crabapple_fence",
            () -> new CustomWoodFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).mapColor(DyeColor.PINK)), 300);
    public static final RegistryObject<Block> CRABAPPLE_FENCE_GATE = registerFuelBlock("crabapple_fence_gate",
            () -> new CustomWoodFenceGate(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE).mapColor(DyeColor.PINK), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE), 300);
    public static final RegistryObject<Block> CRABAPPLE_DOOR = registerFuelBlock("crabapple_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(DyeColor.PINK), BlockSetType.OAK), 300);
    public static final RegistryObject<Block> CRABAPPLE_TRAPDOOR = registerFuelBlock("crabapple_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).mapColor(DyeColor.PINK), BlockSetType.OAK), 300);
    public static final RegistryObject<Block> CRABAPPLE_BUTTON = registerFuelBlock("crabapple_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).mapColor(DyeColor.PINK),
                    BlockSetType.OAK, 30, true), 100);
    public static final RegistryObject<Block> CRABAPPLE_PRESSURE_PLATE = registerFuelBlock("crabapple_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).mapColor(DyeColor.PINK),
                    BlockSetType.OAK), 300);
    public static final RegistryObject<Block> CRABAPPLE_BOOKSHELF = registerFuelBlock("crabapple_bookshelf",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF).mapColor(DyeColor.PINK)), 300);
    public static final RegistryObject<Block> CRABAPPLE_WINDOW = registerBlock("crabapple_window",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).mapColor(DyeColor.PINK).noOcclusion()));
    public static final RegistryObject<Block> CRABAPPLE_WINDOW_PANE = registerBlock("crabapple_window_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS_PANE).mapColor(DyeColor.PINK).noOcclusion()));

    //FLOWERING CRABAPPLE WOODSET
    public static final RegistryObject<Block> FLOWERING_CRABAPPLE_LOG = registerFuelBlock("flowering_crabapple_log",
            () -> new CustomLogLikeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.PINK)), 300);
    public static final RegistryObject<Block> STRIPPED_FLOWERING_CRABAPPLE_LOG = registerFuelBlock("stripped_flowering_crabapple_log",
            () -> new CustomLogLikeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.PINK)), 300);
    public static final RegistryObject<Block> FLOWERING_CRABAPPLE_WOOD = registerFuelBlock("flowering_crabapple_wood",
            () -> new CustomLogLikeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.PINK)), 300);
    public static final RegistryObject<Block> STRIPPED_FLOWERING_CRABAPPLE_WOOD = registerFuelBlock("stripped_flowering_crabapple_wood",
            () -> new CustomLogLikeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.PINK)), 300);
    public static final RegistryObject<Block> FLOWERING_CRABAPPLE_PLANKS = registerFuelBlock("flowering_crabapple_planks",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.PINK)), 300);
    public static final RegistryObject<Block> FLOWERING_CRABAPPLE_SLAB = registerFuelBlock("flowering_crabapple_slab",
            () -> new CustomWoodSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).mapColor(DyeColor.PINK)), 150);
    public static final RegistryObject<Block> FLOWERING_CRABAPPLE_STAIRS = registerFuelBlock("flowering_crabapple_stairs",
            () -> new CustomWoodStairs(() -> BlockRegistration.FLOWERING_CRABAPPLE_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).mapColor(DyeColor.PINK)), 300);
    public static final RegistryObject<Block> FLOWERING_CRABAPPLE_FENCE = registerFuelBlock("flowering_crabapple_fence",
            () -> new CustomWoodFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).mapColor(DyeColor.PINK)), 300);
    public static final RegistryObject<Block> FLOWERING_CRABAPPLE_FENCE_GATE = registerFuelBlock("flowering_crabapple_fence_gate",
            () -> new CustomWoodFenceGate(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE).mapColor(DyeColor.PINK), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE), 300);
    public static final RegistryObject<Block> FLOWERING_CRABAPPLE_DOOR = registerFuelBlock("flowering_crabapple_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(DyeColor.PINK), BlockSetType.OAK), 300);
    public static final RegistryObject<Block> FLOWERING_CRABAPPLE_TRAPDOOR = registerFuelBlock("flowering_crabapple_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).mapColor(DyeColor.PINK), BlockSetType.OAK), 300);
    public static final RegistryObject<Block> FLOWERING_CRABAPPLE_BUTTON = registerFuelBlock("flowering_crabapple_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).mapColor(DyeColor.PINK),
                    BlockSetType.OAK, 30, true), 100);
    public static final RegistryObject<Block> FLOWERING_CRABAPPLE_PRESSURE_PLATE = registerFuelBlock("flowering_crabapple_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).mapColor(DyeColor.PINK),
                    BlockSetType.OAK), 300);
    public static final RegistryObject<Block> FLOWERING_CRABAPPLE_BOOKSHELF = registerFuelBlock("flowering_crabapple_bookshelf",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF).mapColor(DyeColor.PINK)), 300);
    public static final RegistryObject<Block> FLOWERING_CRABAPPLE_WINDOW = registerBlock("flowering_crabapple_window",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).mapColor(DyeColor.PINK).noOcclusion()));
    public static final RegistryObject<Block> FLOWERING_CRABAPPLE_WINDOW_PANE = registerBlock("flowering_crabapple_window_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS_PANE).mapColor(DyeColor.PINK).noOcclusion()));

    //SYCAMORE WOODSET
    public static final RegistryObject<Block> SYCAMORE_LOG = registerFuelBlock("sycamore_log",
            () -> new CustomLogLikeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.GREEN)), 300);
    public static final RegistryObject<Block> STRIPPED_SYCAMORE_LOG = registerFuelBlock("stripped_sycamore_log",
            () -> new CustomLogLikeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.GREEN)), 300);
    public static final RegistryObject<Block> SYCAMORE_WOOD = registerFuelBlock("sycamore_wood",
            () -> new CustomLogLikeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.GREEN)), 300);
    public static final RegistryObject<Block> STRIPPED_SYCAMORE_WOOD = registerFuelBlock("stripped_sycamore_wood",
            () -> new CustomLogLikeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.GREEN)), 300);
    public static final RegistryObject<Block> SYCAMORE_PLANKS = registerFuelBlock("sycamore_planks",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.GREEN)), 300);
    public static final RegistryObject<Block> SYCAMORE_SLAB = registerFuelBlock("sycamore_slab",
            () -> new CustomWoodSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).mapColor(DyeColor.GREEN)), 150);
    public static final RegistryObject<Block> SYCAMORE_STAIRS = registerFuelBlock("sycamore_stairs",
            () -> new CustomWoodStairs(() -> BlockRegistration.SYCAMORE_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).mapColor(DyeColor.GREEN)), 300);
    public static final RegistryObject<Block> SYCAMORE_FENCE = registerFuelBlock("sycamore_fence",
            () -> new CustomWoodFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).mapColor(DyeColor.GREEN)), 300);
    public static final RegistryObject<Block> SYCAMORE_FENCE_GATE = registerFuelBlock("sycamore_fence_gate",
            () -> new CustomWoodFenceGate(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE).mapColor(DyeColor.GREEN), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE), 300);
    public static final RegistryObject<Block> SYCAMORE_DOOR = registerFuelBlock("sycamore_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(DyeColor.GREEN), BlockSetType.OAK), 300);
    public static final RegistryObject<Block> SYCAMORE_TRAPDOOR = registerFuelBlock("sycamore_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).mapColor(DyeColor.GREEN), BlockSetType.OAK), 300);
    public static final RegistryObject<Block> SYCAMORE_BUTTON = registerFuelBlock("sycamore_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).mapColor(DyeColor.GREEN),
                    BlockSetType.OAK, 30, true), 100);
    public static final RegistryObject<Block> SYCAMORE_PRESSURE_PLATE = registerFuelBlock("sycamore_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).mapColor(DyeColor.GREEN),
                    BlockSetType.OAK), 300);
    public static final RegistryObject<Block> SYCAMORE_BOOKSHELF = registerFuelBlock("sycamore_bookshelf",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF).mapColor(DyeColor.GREEN)), 300);
    public static final RegistryObject<Block> SYCAMORE_WINDOW = registerBlock("sycamore_window",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).mapColor(DyeColor.GREEN).noOcclusion()));
    public static final RegistryObject<Block> SYCAMORE_WINDOW_PANE = registerBlock("sycamore_window_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS_PANE).mapColor(DyeColor.GREEN).noOcclusion()));

    //FLUORESCENT MAPLE WOODSET
    public static final RegistryObject<Block> MAPLE_LOG = registerFuelBlock("fluorescent_maple_log",
            () -> new CustomLogLikeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.CYAN).lightLevel(p -> 4).noOcclusion()), 300);
    public static final RegistryObject<Block> STRIPPED_MAPLE_LOG = registerFuelBlock("stripped_fluorescent_maple_log",
            () -> new CustomLogLikeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.CYAN).lightLevel(p -> 4).noOcclusion()), 300);
    public static final RegistryObject<Block> MAPLE_WOOD = registerFuelBlock("fluorescent_maple_wood",
            () -> new CustomLogLikeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.CYAN).lightLevel(p -> 4).noOcclusion()), 300);
    public static final RegistryObject<Block> STRIPPED_MAPLE_WOOD = registerFuelBlock("stripped_fluorescent_maple_wood",
            () -> new CustomLogLikeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.CYAN).lightLevel(p -> 4).noOcclusion()), 300);
    public static final RegistryObject<Block> MAPLE_PLANKS = registerFuelBlock("fluorescent_maple_planks",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.CYAN).lightLevel(p -> 4).noOcclusion()), 300);
    public static final RegistryObject<Block> MAPLE_SLAB = registerFuelBlock("fluorescent_maple_slab",
            () -> new CustomWoodSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).mapColor(DyeColor.CYAN).lightLevel(p -> 4).noOcclusion()), 150);
    public static final RegistryObject<Block> MAPLE_STAIRS = registerFuelBlock("fluorescent_maple_stairs",
            () -> new CustomWoodStairs(() -> BlockRegistration.MAPLE_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).mapColor(DyeColor.CYAN).lightLevel(p -> 4).noOcclusion()), 300);
    public static final RegistryObject<Block> MAPLE_FENCE = registerFuelBlock("fluorescent_maple_fence",
            () -> new CustomWoodFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).mapColor(DyeColor.CYAN).lightLevel(p -> 4).noOcclusion()), 300);
    public static final RegistryObject<Block> MAPLE_FENCE_GATE = registerFuelBlock("fluorescent_maple_fence_gate",
            () -> new CustomWoodFenceGate(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE).mapColor(DyeColor.CYAN).lightLevel(p -> 4).noOcclusion(), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE), 300);
    public static final RegistryObject<Block> MAPLE_DOOR = registerFuelBlock("fluorescent_maple_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(DyeColor.CYAN).lightLevel(p -> 4).noOcclusion(), BlockSetType.OAK), 300);
    public static final RegistryObject<Block> MAPLE_TRAPDOOR = registerFuelBlock("fluorescent_maple_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).mapColor(DyeColor.CYAN).lightLevel(p -> 4).noOcclusion(), BlockSetType.OAK), 300);
    public static final RegistryObject<Block> MAPLE_BUTTON = registerFuelBlock("fluorescent_maple_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).mapColor(DyeColor.CYAN).lightLevel(p -> 4).noOcclusion(),
                    BlockSetType.OAK, 30, true), 100);
    public static final RegistryObject<Block> MAPLE_PRESSURE_PLATE = registerFuelBlock("fluorescent_maple_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).mapColor(DyeColor.CYAN).lightLevel(p -> 4).noOcclusion(),
                    BlockSetType.OAK), 300);
    public static final RegistryObject<Block> MAPLE_BOOKSHELF = registerFuelBlock("fluorescent_maple_bookshelf",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF).mapColor(DyeColor.CYAN).lightLevel(p -> 4).noOcclusion()), 300);
    public static final RegistryObject<Block> MAPLE_WINDOW = registerBlock("fluorescent_maple_window",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).mapColor(DyeColor.CYAN).lightLevel(p -> 4).noOcclusion()));
    public static final RegistryObject<Block> MAPLE_WINDOW_PANE = registerBlock("fluorescent_maple_window_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS_PANE).mapColor(DyeColor.CYAN).lightLevel(p -> 4).noOcclusion()));

    //BLUE MUSHROOM WOODSET
    public static final RegistryObject<Block> BLUE_MUSHROOM_LOG = registerFuelBlock("blue_mushroom_log",
            () -> new CustomLogLikeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.BLUE).sound(SoundType.SHROOMLIGHT)), 300);
    public static final RegistryObject<Block> BLUE_MUSHROOM_WOOD = registerFuelBlock("blue_mushroom_wood",
            () -> new CustomLogLikeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.BLUE).sound(SoundType.SHROOMLIGHT)), 300);
    public static final RegistryObject<Block> BLUE_MUSHROOM_PLANKS = registerFuelBlock("blue_mushroom_planks",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.BLUE).sound(SoundType.SHROOMLIGHT)), 300);
    public static final RegistryObject<Block> BLUE_MUSHROOM_CAP = registerBlock("blue_mushroom_cap",
            () -> new BouncyMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM_BLOCK).mapColor(DyeColor.BLUE).sound(SoundType.SHROOMLIGHT)));
    public static final RegistryObject<Block> BLUE_MUSHROOM_SAPLING = registerBlock("blue_roundhead",
            () -> new FungusBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).mapColor(DyeColor.BLUE), ClutteredConfiguredFeatures.BLUE_MUHSROOM_KEY, Blocks.MYCELIUM));
    public static final RegistryObject<Block> BLUE_MUSHROOM_SLAB = registerFuelBlock("blue_mushroom_slab",
            () -> new CustomWoodSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).mapColor(DyeColor.BLUE).sound(SoundType.SHROOMLIGHT)), 150);
    public static final RegistryObject<Block> BLUE_MUSHROOM_STAIRS = registerFuelBlock("blue_mushroom_stairs",
            () -> new CustomWoodStairs(() -> BlockRegistration.BLUE_MUSHROOM_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).mapColor(DyeColor.BLUE).sound(SoundType.SHROOMLIGHT)), 300);
    public static final RegistryObject<Block> BLUE_MUSHROOM_FENCE = registerFuelBlock("blue_mushroom_fence",
            () -> new CustomWoodFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).mapColor(DyeColor.BLUE).sound(SoundType.SHROOMLIGHT)), 300);
    public static final RegistryObject<Block> BLUE_MUSHROOM_FENCE_GATE = registerFuelBlock("blue_mushroom_fence_gate",
            () -> new CustomWoodFenceGate(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE).mapColor(DyeColor.BLUE).sound(SoundType.SHROOMLIGHT), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE), 300);
    public static final RegistryObject<Block> BLUE_MUSHROOM_DOOR = registerFuelBlock("blue_mushroom_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(DyeColor.BLUE).sound(SoundType.SHROOMLIGHT), BlockSetType.OAK), 300);
    public static final RegistryObject<Block> BLUE_MUSHROOM_TRAPDOOR = registerFuelBlock("blue_mushroom_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).mapColor(DyeColor.BLUE).sound(SoundType.SHROOMLIGHT), BlockSetType.OAK), 300);
    public static final RegistryObject<Block> BLUE_MUSHROOM_BUTTON = registerFuelBlock("blue_mushroom_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).mapColor(DyeColor.BLUE).sound(SoundType.SHROOMLIGHT),
                    BlockSetType.OAK, 30, true), 100);
    public static final RegistryObject<Block> BLUE_MUSHROOM_PRESSURE_PLATE = registerFuelBlock("blue_mushroom_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).mapColor(DyeColor.BLUE).sound(SoundType.SHROOMLIGHT),
                    BlockSetType.OAK), 300);
    public static final RegistryObject<Block> BLUE_MUSHROOM_BOOKSHELF = registerFuelBlock("blue_mushroom_bookshelf",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF).mapColor(DyeColor.BLUE).sound(SoundType.SHROOMLIGHT)), 300);
    public static final RegistryObject<Block> BLUE_MUSHROOM_WINDOW = registerBlock("blue_mushroom_window",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).mapColor(DyeColor.BLUE).noOcclusion()));
    public static final RegistryObject<Block> BLUE_MUSHROOM_WINDOW_PANE = registerBlock("blue_mushroom_window_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS_PANE).mapColor(DyeColor.BLUE).noOcclusion()));
    public static final RegistryObject<Block> POTTED_BLUE_MUSHROOM_SAPLING = BLOCKS.register("potted_blue_roundhead",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), BlockRegistration.BLUE_MUSHROOM_SAPLING,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_BIRCH_SAPLING)));

    //RED MUSHROOM WOODSET
    public static final RegistryObject<Block> RED_MUSHROOM_LOG = registerFuelBlock("red_mushroom_log",
            () -> new CustomLogLikeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.RED).sound(SoundType.SHROOMLIGHT)), 300);
    public static final RegistryObject<Block> RED_MUSHROOM_WOOD = registerFuelBlock("red_mushroom_wood",
            () -> new CustomLogLikeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.RED).sound(SoundType.SHROOMLIGHT)), 300);
    public static final RegistryObject<Block> RED_MUSHROOM_PLANKS = registerFuelBlock("red_mushroom_planks",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.RED).sound(SoundType.SHROOMLIGHT)), 300);
    public static final RegistryObject<Block> RED_MUSHROOM_CAP = registerFuelBlock("red_mushroom_cap",
            () -> new BouncyMushroomBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.RED).sound(SoundType.SHROOMLIGHT)), 300);
    public static final RegistryObject<Block> RED_MUSHROOM_SLAB = registerFuelBlock("red_mushroom_slab",
            () -> new CustomWoodSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).mapColor(DyeColor.RED).sound(SoundType.SHROOMLIGHT)), 150);
    public static final RegistryObject<Block> RED_MUSHROOM_STAIRS = registerFuelBlock("red_mushroom_stairs",
            () -> new CustomWoodStairs(() -> BlockRegistration.RED_MUSHROOM_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).mapColor(DyeColor.RED).sound(SoundType.SHROOMLIGHT)), 300);
    public static final RegistryObject<Block> RED_MUSHROOM_FENCE = registerFuelBlock("red_mushroom_fence",
            () -> new CustomWoodFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).mapColor(DyeColor.RED).sound(SoundType.SHROOMLIGHT)), 300);
    public static final RegistryObject<Block> RED_MUSHROOM_FENCE_GATE = registerFuelBlock("red_mushroom_fence_gate",
            () -> new CustomWoodFenceGate(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE).mapColor(DyeColor.RED).sound(SoundType.SHROOMLIGHT), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE), 300);
    public static final RegistryObject<Block> RED_MUSHROOM_DOOR = registerFuelBlock("red_mushroom_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(DyeColor.RED).sound(SoundType.SHROOMLIGHT), BlockSetType.OAK), 300);
    public static final RegistryObject<Block> RED_MUSHROOM_TRAPDOOR = registerFuelBlock("red_mushroom_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).mapColor(DyeColor.RED).sound(SoundType.SHROOMLIGHT), BlockSetType.OAK), 300);
    public static final RegistryObject<Block> RED_MUSHROOM_BUTTON = registerFuelBlock("red_mushroom_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).mapColor(DyeColor.RED).sound(SoundType.SHROOMLIGHT),
                    BlockSetType.OAK, 30, true), 100);
    public static final RegistryObject<Block> RED_MUSHROOM_PRESSURE_PLATE = registerFuelBlock("red_mushroom_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).mapColor(DyeColor.RED).sound(SoundType.SHROOMLIGHT),
                    BlockSetType.OAK), 300);
    public static final RegistryObject<Block> RED_MUSHROOM_BOOKSHELF = registerFuelBlock("red_mushroom_bookshelf",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF).mapColor(DyeColor.RED).sound(SoundType.SHROOMLIGHT)), 300);
    public static final RegistryObject<Block> RED_MUSHROOM_WINDOW = registerBlock("red_mushroom_window",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).mapColor(DyeColor.RED).noOcclusion()));
    public static final RegistryObject<Block> RED_MUSHROOM_WINDOW_PANE = registerBlock("red_mushroom_window_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS_PANE).mapColor(DyeColor.RED).noOcclusion()));

    //CHALCEDONY SET
    public static final RegistryObject<Block> CHALCEDONY = registerBlock("raw_chalcedony",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> CHALCEDONY_STAIRS = registerBlock("chalcedony_stairs",
            () -> new StairBlock(() -> BlockRegistration.CHALCEDONY.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.QUARTZ_STAIRS).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> CHALCEDONY_SLAB = registerBlock("chalcedony_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_SLAB).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> CHALCEDONY_BRICKS = registerBlock("chalcedony_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> CHALCEDONY_BRICK_STAIRS = registerBlock("chalcedony_brick_stairs",
            () -> new StairBlock(() -> BlockRegistration.CHALCEDONY.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.QUARTZ_STAIRS).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> CHALCEDONY_BRICK_SLAB = registerBlock("chalcedony_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_SLAB).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> CHALCEDONY_TILES = registerBlock("chalcedony_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> CHALCEDONY_SMALL_TILES = registerBlock("chalcedony_subway_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> POLISHED_CHALCEDONY = registerBlock("chalcedony_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> CHISELED_CHALCEDONY = registerBlock("chalcedony_chiseled_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> CHALCEDONY_BORDER = registerBlock("chalcedony_border",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> CHALCEDONY_ACANTHUS = registerBlock("chalcedony_acanthus",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> CHALCEDONY_HELIX = registerBlock("chalcedony_helix",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> STARRY_CHISELED_CHALCEDONY = registerBlock("chalcedony_sun_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> CHALCEDONY_PILLAR = registerBlock("chalcedony_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> CHALCEDONY_PILLAR_BASE = registerBlock("chalcedony_pillar_base",
            () -> new DirectionalPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> CHALCEDONY_PILLAR_DORIC = registerBlock("chalcedony_pillar_doric",
            () -> new DirectionalPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> CHALCEDONY_PILLAR_IONIC = registerBlock("chalcedony_pillar_ionic",
            () -> new DirectionalPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> STARRY_CHALCEDONY_PILLAR = registerBlock("chalcedony_pillar_starry",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> STARRY_CHALCEDONY_PILLAR_BASE = registerBlock("chalcedony_pillar_starry_base",
            () -> new DirectionalPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> STARRY_CHALCEDONY_PILLAR_DORIC = registerBlock("chalcedony_pillar_starry_doric",
            () -> new DirectionalPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> STARRY_CHALCEDONY_PILLAR_IONIC = registerBlock("chalcedony_pillar_starry_ionic",
            () -> new DirectionalPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.WHITE)));

    public static final RegistryObject<Block> CHALCEDONY_BRACKET_VICTORIAN = registerBlock("chalcedony_victorian_bracket",
            () -> new BracketBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.WHITE).noOcclusion()));
    public static final RegistryObject<Block> CHALCEDONY_BRACKET_BOW = registerBlock("chalcedony_victorian_bracket_bow",
            () -> new BracketBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.WHITE).noOcclusion()));
    public static final RegistryObject<Block> CHALCEDONY_BRACKET_BOW_SCROLL = registerBlock("chalcedony_victorian_bracket_bow_scroll",
            () -> new BracketBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.WHITE).noOcclusion()));
    public static final RegistryObject<Block> CHALCEDONY_BRACKET_SCROLL = registerBlock("chalcedony_victorian_bracket_scroll",
            () -> new BracketBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.WHITE).noOcclusion()));
    public static final RegistryObject<Block> CHALCEDONY_BRACKET_STAR = registerBlock("chalcedony_victorian_bracket_star",
            () -> new BracketBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.WHITE).noOcclusion()));
    public static final RegistryObject<Block> CHALCEDONY_BRACKET_STAR_SCROLL = registerBlock("chalcedony_victorian_bracket_star_scroll",
            () -> new BracketBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.WHITE).noOcclusion()));

    public static final RegistryObject<Block> CHALCEDONY_WINDOW = registerBlock("chalcedony_window",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> CHALCEDONY_WINDOW_PANE = registerBlock("chalcedony_window_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).mapColor(DyeColor.WHITE)));

    //DEEP CHALCEDONY SET
    public static final RegistryObject<Block> DEEP_CHALCEDONY = registerBlock("deep_raw_chalcedony",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_BLUE)));
    public static final RegistryObject<Block> DEEP_CHALCEDONY_STAIRS = registerBlock("deep_chalcedony_stairs",
            () -> new StairBlock(() -> BlockRegistration.DEEP_CHALCEDONY.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.QUARTZ_STAIRS).mapColor(DyeColor.LIGHT_BLUE)));
    public static final RegistryObject<Block> DEEP_CHALCEDONY_SLAB = registerBlock("deep_chalcedony_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_SLAB).mapColor(DyeColor.LIGHT_BLUE)));
    public static final RegistryObject<Block> DEEP_CHALCEDONY_BRICKS = registerBlock("deep_chalcedony_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS).mapColor(DyeColor.LIGHT_BLUE)));
    public static final RegistryObject<Block> DEEP_CHALCEDONY_BRICK_STAIRS = registerBlock("deep_chalcedony_brick_stairs",
            () -> new StairBlock(() -> BlockRegistration.DEEP_CHALCEDONY.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.QUARTZ_STAIRS).mapColor(DyeColor.LIGHT_BLUE)));
    public static final RegistryObject<Block> DEEP_CHALCEDONY_BRICK_SLAB = registerBlock("deep_chalcedony_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_SLAB).mapColor(DyeColor.LIGHT_BLUE)));
    public static final RegistryObject<Block> DEEP_CHALCEDONY_TILES = registerBlock("deep_chalcedony_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS).mapColor(DyeColor.LIGHT_BLUE)));
    public static final RegistryObject<Block> DEEP_CHALCEDONY_SMALL_TILES = registerBlock("deep_chalcedony_subway_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS).mapColor(DyeColor.LIGHT_BLUE)));
    public static final RegistryObject<Block> DEEP_POLISHED_CHALCEDONY = registerBlock("deep_chalcedony_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS).mapColor(DyeColor.LIGHT_BLUE)));
    public static final RegistryObject<Block> DEEP_CHISELED_CHALCEDONY = registerBlock("deep_chalcedony_chiseled_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS).mapColor(DyeColor.LIGHT_BLUE)));
    public static final RegistryObject<Block> DEEP_CHALCEDONY_BORDER = registerBlock("deep_chalcedony_border",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS).mapColor(DyeColor.LIGHT_BLUE)));
    public static final RegistryObject<Block> DEEP_CHALCEDONY_ACANTHUS = registerBlock("deep_chalcedony_acanthus",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS).mapColor(DyeColor.LIGHT_BLUE)));
    public static final RegistryObject<Block> DEEP_CHALCEDONY_HELIX = registerBlock("deep_chalcedony_helix",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS).mapColor(DyeColor.LIGHT_BLUE)));
    public static final RegistryObject<Block> DEEP_STARRY_CHISELED_CHALCEDONY = registerBlock("deep_chalcedony_sun_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS).mapColor(DyeColor.LIGHT_BLUE)));
    public static final RegistryObject<Block> DEEP_CHALCEDONY_PILLAR = registerBlock("deep_chalcedony_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.LIGHT_BLUE)));
    public static final RegistryObject<Block> DEEP_CHALCEDONY_PILLAR_BASE = registerBlock("deep_chalcedony_pillar_base",
            () -> new DirectionalPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.LIGHT_BLUE)));
    public static final RegistryObject<Block> DEEP_CHALCEDONY_PILLAR_DORIC = registerBlock("deep_chalcedony_pillar_doric",
            () -> new DirectionalPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.LIGHT_BLUE)));
    public static final RegistryObject<Block> DEEP_CHALCEDONY_PILLAR_IONIC = registerBlock("deep_chalcedony_pillar_ionic",
            () -> new DirectionalPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.LIGHT_BLUE)));
    public static final RegistryObject<Block> DEEP_STARRY_CHALCEDONY_PILLAR = registerBlock("deep_chalcedony_pillar_starry",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.LIGHT_BLUE)));
    public static final RegistryObject<Block> DEEP_STARRY_CHALCEDONY_PILLAR_BASE = registerBlock("deep_chalcedony_pillar_starry_base",
            () -> new DirectionalPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.LIGHT_BLUE)));
    public static final RegistryObject<Block> DEEP_STARRY_CHALCEDONY_PILLAR_DORIC = registerBlock("deep_chalcedony_pillar_starry_doric",
            () -> new DirectionalPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.LIGHT_BLUE)));
    public static final RegistryObject<Block> DEEP_STARRY_CHALCEDONY_PILLAR_IONIC = registerBlock("deep_chalcedony_pillar_starry_ionic",
            () -> new DirectionalPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.LIGHT_BLUE)));

    public static final RegistryObject<Block> DEEP_CHALCEDONY_BRACKET_VICTORIAN = registerBlock("deep_chalcedony_victorian_bracket",
            () -> new BracketBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_BLUE).noOcclusion()));
    public static final RegistryObject<Block> DEEP_CHALCEDONY_BRACKET_BOW = registerBlock("deep_chalcedony_victorian_bracket_bow",
            () -> new BracketBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_BLUE).noOcclusion()));
    public static final RegistryObject<Block> DEEP_CHALCEDONY_BRACKET_BOW_SCROLL = registerBlock("deep_chalcedony_victorian_bracket_bow_scroll",
            () -> new BracketBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_BLUE).noOcclusion()));
    public static final RegistryObject<Block> DEEP_CHALCEDONY_BRACKET_SCROLL = registerBlock("deep_chalcedony_victorian_bracket_scroll",
            () -> new BracketBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_BLUE).noOcclusion()));
    public static final RegistryObject<Block> DEEP_CHALCEDONY_BRACKET_STAR = registerBlock("deep_chalcedony_victorian_bracket_star",
            () -> new BracketBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_BLUE).noOcclusion()));
    public static final RegistryObject<Block> DEEP_CHALCEDONY_BRACKET_STAR_SCROLL = registerBlock("deep_chalcedony_victorian_bracket_star_scroll",
            () -> new BracketBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_BLUE).noOcclusion()));


    public static final RegistryObject<Block> DEEP_CHALCEDONY_WINDOW = registerBlock("deep_chalcedony_window",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).mapColor(DyeColor.LIGHT_BLUE)));
    public static final RegistryObject<Block> DEEP_CHALCEDONY_WINDOW_PANE = registerBlock("deep_chalcedony_window_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).mapColor(DyeColor.LIGHT_BLUE)));
    //MARBLE SET
    public static final RegistryObject<Block> MARBLE = registerBlock("raw_marble",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> MARBLE_STAIRS = registerBlock("marble_stairs",
            () -> new StairBlock(() -> BlockRegistration.MARBLE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.QUARTZ_STAIRS).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> MARBLE_SLAB = registerBlock("marble_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_SLAB).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> MARBLE_BRICKS = registerBlock("marble_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> MARBLE_BRICK_STAIRS = registerBlock("marble_brick_stairs",
            () -> new StairBlock(() -> BlockRegistration.MARBLE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.QUARTZ_STAIRS).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> MARBLE_BRICK_SLAB = registerBlock("marble_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_SLAB).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> MARBLE_TILES = registerBlock("marble_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> MARBLE_SMALL_TILES = registerBlock("marble_subway_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> POLISHED_MARBLE = registerBlock("marble_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> CHISELED_MARBLE = registerBlock("marble_chiseled_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> MARBLE_BORDER = registerBlock("marble_border",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> MARBLE_ACANTHUS = registerBlock("marble_acanthus",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> MARBLE_HELIX = registerBlock("marble_helix",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> STARRY_CHISELED_MARBLE = registerBlock("marble_sun_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> MARBLE_PILLAR = registerBlock("marble_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> MARBLE_PILLAR_BASE = registerBlock("marble_pillar_base",
            () -> new DirectionalPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> MARBLE_PILLAR_DORIC = registerBlock("marble_pillar_doric",
            () -> new DirectionalPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> MARBLE_PILLAR_IONIC = registerBlock("marble_pillar_ionic",
            () -> new DirectionalPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.WHITE)));

    //TODO maybe change to the other type
    public static final RegistryObject<Block> MARBLE_BRACKET_VICTORIAN = registerBlock("marble_victorian_bracket",
            () -> new BracketBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.WHITE).noOcclusion()));
    public static final RegistryObject<Block> MARBLE_BRACKET_BOW = registerBlock("marble_victorian_bracket_bow",
            () -> new BracketBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.WHITE).noOcclusion()));
    public static final RegistryObject<Block> MARBLE_BRACKET_BOW_SCROLL = registerBlock("marble_victorian_bracket_bow_scroll",
            () -> new BracketBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.WHITE).noOcclusion()));
    public static final RegistryObject<Block> MARBLE_BRACKET_SCROLL = registerBlock("marble_victorian_bracket_scroll",
            () -> new BracketBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.WHITE).noOcclusion()));
    public static final RegistryObject<Block> MARBLE_BRACKET_STAR = registerBlock("marble_victorian_bracket_star",
            () -> new BracketBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.WHITE).noOcclusion()));
    public static final RegistryObject<Block> MARBLE_BRACKET_STAR_SCROLL = registerBlock("marble_victorian_bracket_star_scroll",
            () -> new BracketBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.WHITE).noOcclusion()));

    //MISC FULL BLOCKS
    //CAT WINDOWS
    public static final RegistryObject<Block> BLACK_CAT_WINDOW = registerBlock("black_cat_window",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistryObject<Block> BLACK_CAT_WINDOW_PANE = registerBlock("black_cat_window_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS_PANE)));

    //PLANTER BOXES
    public static final RegistryObject<Block> YELLOW_PLANTER = registerBlock("tarrey_town_planter_yellow",
            () -> new PlanterBoxBlock(BlockBehaviour.Properties.copy(Blocks.FARMLAND).mapColor(DyeColor.YELLOW).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PINK_PLANTER = registerBlock("tarrey_town_planter_pink",
            () -> new PlanterBoxBlock(BlockBehaviour.Properties.copy(Blocks.FARMLAND).mapColor(DyeColor.PINK).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GREEN_PLANTER = registerBlock("tarrey_town_planter_green",
            () -> new PlanterBoxBlock(BlockBehaviour.Properties.copy(Blocks.FARMLAND).mapColor(DyeColor.GREEN).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PURPLE_PLANTER = registerBlock("tarrey_town_planter_purple",
            () -> new PlanterBoxBlock(BlockBehaviour.Properties.copy(Blocks.FARMLAND).mapColor(DyeColor.PURPLE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FLUORESCENT_PLANTER = registerBlock("tarrey_town_planter_fluorescent",
            () -> new PlanterBoxBlock(BlockBehaviour.Properties.copy(Blocks.FARMLAND).mapColor(DyeColor.LIGHT_BLUE).sound(SoundType.WOOD).noOcclusion().lightLevel(p -> 4)));
    public static final RegistryObject<Block> BEIGE_PLANTER = registerBlock("tarrey_town_planter_beige",
            () -> new PlanterBoxBlock(BlockBehaviour.Properties.copy(Blocks.FARMLAND).mapColor(DyeColor.LIGHT_GRAY).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLUE_PLANTER = registerBlock("tarrey_town_planter_blue",
            () -> new PlanterBoxBlock(BlockBehaviour.Properties.copy(Blocks.FARMLAND).mapColor(DyeColor.BLUE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RED_PLANTER = registerBlock("tarrey_town_planter_red",
            () -> new PlanterBoxBlock(BlockBehaviour.Properties.copy(Blocks.FARMLAND).mapColor(DyeColor.RED).sound(SoundType.WOOD)));

    //WALLPAPERS
    public static final RegistryObject<Block> STARRY_WALLPAPER = registerBlock("starry_wallpaper",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL).sound(SoundType.SPORE_BLOSSOM).lightLevel(p -> 4).noOcclusion()));
    public static final RegistryObject<Block> STARRY_WALLPAPER_TOP = registerBlock("starry_wallpaper_upper_trim",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL).sound(SoundType.SPORE_BLOSSOM).lightLevel(p -> 4).noOcclusion()));
    public static final RegistryObject<Block> STARRY_WALLPAPER_BOTTOM = registerBlock("starry_wallpaper_lower_trim",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL).sound(SoundType.SPORE_BLOSSOM).lightLevel(p -> 4).noOcclusion()));
    public static final RegistryObject<Block> DARK_STARRY_WALLPAPER = registerBlock("dark_starry_wallpaper",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DARK_STARRY_WALLPAPER_TOP = registerBlock("dark_starry_wallpaper_upper_trim",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DARK_STARRY_WALLPAPER_BOTTOM = registerBlock("dark_starry_wallpaper_lower_trim",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL).sound(SoundType.SPORE_BLOSSOM)));

    public static final RegistryObject<Block> RETRO_RAINBOW_WALLPAPER = registerBlock("retro_rainbow_wallpaper",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> APPLE_WALLPAPER = registerBlock("apple_wallpaper",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> BLUE_ROSE_STRIPED_WALLPAPER = registerBlock("blue_rose_striped_wallpaper",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> CHECKERED_FRUIT_WALLPAPER = registerBlock("checkered_fruit_wallpaper",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> CHECKERED_GREEN_WALLPAPER = registerBlock("checkered_green_wallpaper",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> CHECKERED_GREEN_STRAWBERRY_WALLPAPER = registerBlock("checkered_green_strawberry_wallpaper",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> CHECKERED_PINK_WALLPAPER = registerBlock("checkered_pink_wallpaper",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> CHECKERED_PINK_STRAWBERRY_WALLPAPER = registerBlock("checkered_pink_strawberry_wallpaper",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> CHIC_WALLPAPER = registerBlock("chic_wallpaper",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> CHIC_WALLPAPER_UPPER_TRIM = registerBlock("chic_wallpaper_upper_trim",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> CHIC_WALLPAPER_LOWER_TRIM = registerBlock("chic_wallpaper_lower_trim",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> CONFECTIONARY_WALLPAPER = registerBlock("confectionary_wallpaper",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> FLORAL_BERRY_WALLPAPER = registerBlock("floral_berry_wallpaper",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> FLORAL_BORDER_WALLPAPER = registerBlock("floral_border_wallpaper",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> GHOST_WALLPAPER = registerBlock("ghost_wallpaper",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> GHOST_WALLPAPER_TRIM = registerBlock("ghost_wallpaper_trim",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> GHOST_WALLPAPER_BOTTOM = registerBlock("ghost_wallpaper_bottom",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> GHOST_WALLPAPER_TOP = registerBlock("ghost_wallpaper_top",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> GHOST_WALLPAPER_WAINSCOTING = registerBlock("ghost_wallpaper_wainscoting",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.PURPLE)));
    public static final RegistryObject<Block> HALLOWEEN_WALLPAPER = registerBlock("halloween_wallpaper",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> HALLOWEEN_WALLPAPER_BOTTOM = registerBlock("halloween_wallpaper_bottom",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> HALLOWEEN_WALLPAPER_TOP = registerBlock("halloween_wallpaper_top",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> HALLOWEEN_WAINSCOTING = registerBlock("halloween_wainscoting",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.PURPLE)));
    public static final RegistryObject<Block> RIALTO_GOLD_WALLPAPER = registerBlock("rialto_gold_wallpaper",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> RIALTO_GOLD_WALLPAPER_TOP = registerBlock("rialto_wallpaper_upper_trim",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> RIALTO_GOLD_WALLPAPER_BOTTOM = registerBlock("rialto_wallpaper_lower_trim",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> MARIGOLD_WALLPAPER = registerBlock("marigold_wallpaper",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> MARIGOLD_WALLPAPER_BOTTOM = registerBlock("marigold_wallpaper_bottom",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> MARIGOLD_WALLPAPER_TOP = registerBlock("marigold_wallpaper_top",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> MINT_WALLPAPER = registerBlock("mint_wallpaper",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> PINK_STRIPE_WALLPAPER = registerBlock("pink_striped_wallpaper",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> PINK_STRIPE_WALLPAPER_LOWER_TRIM = registerBlock("pink_striped_wallpaper_lower_trim",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> PINK_STRIPE_WALLPAPER_UPPER_TRIM = registerBlock("pink_striped_wallpaper_upper_trim",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> FISH_WALLPAPER = registerBlock("fish_wallpaper",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL).sound(SoundType.SPORE_BLOSSOM)));


    //DIAMOND WALLPAPER
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_APPLE = registerBlock("diamond_wallpaper_apple",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_APPLE_BOTTOM_BROWN = registerBlock("diamond_wallpaper_apple_bottom_brown",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_APPLE_TOP_BROWN = registerBlock("diamond_wallpaper_apple_top_brown",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_APPLE_BOTTOM_WHITE = registerBlock("diamond_wallpaper_apple_bottom_white",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_APPLE_TOP_WHITE = registerBlock("diamond_wallpaper_apple_top_white",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_APPLE_BOTTOM_COLOR = registerBlock("diamond_wallpaper_apple_bottom_color",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_APPLE_TOP_COLOR = registerBlock("diamond_wallpaper_apple_top_color",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).sound(SoundType.SPORE_BLOSSOM)));

    public static final RegistryObject<Block> DIAMOND_WALLPAPER_BLACKBERRY = registerBlock("diamond_wallpaper_blackberry",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_BLACKBERRY_BOTTOM_BROWN = registerBlock("diamond_wallpaper_blackberry_bottom_brown",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_BLACKBERRY_TOP_BROWN = registerBlock("diamond_wallpaper_blackberry_top_brown",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_BLACKBERRY_BOTTOM_WHITE = registerBlock("diamond_wallpaper_blackberry_bottom_white",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_BLACKBERRY_TOP_WHITE = registerBlock("diamond_wallpaper_blackberry_top_white",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_BLACKBERRY_BOTTOM_COLOR = registerBlock("diamond_wallpaper_blackberry_bottom_color",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_BLACKBERRY_TOP_COLOR = registerBlock("diamond_wallpaper_blackberry_top_color",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL).sound(SoundType.SPORE_BLOSSOM)));

    public static final RegistryObject<Block> DIAMOND_WALLPAPER_BLUEBERRY = registerBlock("diamond_wallpaper_blueberry",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_BLUEBERRY_BOTTOM_BROWN = registerBlock("diamond_wallpaper_blueberry_bottom_brown",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_BLUEBERRY_TOP_BROWN = registerBlock("diamond_wallpaper_blueberry_top_brown",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_BLUEBERRY_BOTTOM_WHITE = registerBlock("diamond_wallpaper_blueberry_bottom_white",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_BLUEBERRY_TOP_WHITE = registerBlock("diamond_wallpaper_blueberry_top_white",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_BLUEBERRY_BOTTOM_COLOR = registerBlock("diamond_wallpaper_blueberry_bottom_color",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_BLUEBERRY_TOP_COLOR = registerBlock("diamond_wallpaper_blueberry_top_color",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL).sound(SoundType.SPORE_BLOSSOM)));

    public static final RegistryObject<Block> DIAMOND_WALLPAPER_BONES = registerBlock("diamond_wallpaper_bones",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_BONES_BOTTOM_BROWN = registerBlock("diamond_wallpaper_bones_bottom_brown",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_BONES_TOP_BROWN = registerBlock("diamond_wallpaper_bones_top_brown",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_BONES_BOTTOM_WHITE = registerBlock("diamond_wallpaper_bones_bottom_white",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_BONES_TOP_WHITE = registerBlock("diamond_wallpaper_bones_top_white",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL).sound(SoundType.SPORE_BLOSSOM)));

    public static final RegistryObject<Block> DIAMOND_WALLPAPER_BOUQUET = registerBlock("diamond_wallpaper_bouquet",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_BOUQUET_BOTTOM_BROWN = registerBlock("diamond_wallpaper_bouquet_bottom_brown",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_BOUQUET_TOP_BROWN = registerBlock("diamond_wallpaper_bouquet_top_brown",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_BOUQUET_BOTTOM_WHITE = registerBlock("diamond_wallpaper_bouquet_bottom_white",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_BOUQUET_TOP_WHITE = registerBlock("diamond_wallpaper_bouquet_top_white",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_BOUQUET_BOTTOM_COLOR = registerBlock("diamond_wallpaper_bouquet_bottom_color",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_BOUQUET_TOP_COLOR = registerBlock("diamond_wallpaper_bouquet_top_color",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL).sound(SoundType.SPORE_BLOSSOM)));

    public static final RegistryObject<Block> DIAMOND_WALLPAPER_BROWN_MUSHROOM = registerBlock("diamond_wallpaper_brown_mushroom",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_BROWN_MUSHROOM_BOTTOM_BROWN = registerBlock("diamond_wallpaper_brown_mushroom_bottom_brown",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_BROWN_MUSHROOM_TOP_BROWN = registerBlock("diamond_wallpaper_brown_mushroom_top_brown",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_BROWN_MUSHROOM_BOTTOM_WHITE = registerBlock("diamond_wallpaper_brown_mushroom_bottom_white",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_BROWN_MUSHROOM_TOP_WHITE = registerBlock("diamond_wallpaper_brown_mushroom_top_white",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_BROWN_MUSHROOM_BOTTOM_COLOR = registerBlock("diamond_wallpaper_brown_mushroom_bottom_color",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_BROWN_MUSHROOM_TOP_COLOR = registerBlock("diamond_wallpaper_brown_mushroom_top_color",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL).sound(SoundType.SPORE_BLOSSOM)));


    public static final RegistryObject<Block> DIAMOND_WALLPAPER_GREEN_GRAPES = registerBlock("diamond_wallpaper_green_grapes",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_GREEN_GRAPES_BOTTOM_BROWN = registerBlock("diamond_wallpaper_green_grapes_bottom_brown",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_GREEN_GRAPES_TOP_BROWN = registerBlock("diamond_wallpaper_green_grapes_top_brown",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_GREEN_GRAPES_BOTTOM_WHITE = registerBlock("diamond_wallpaper_green_grapes_bottom_white",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_GREEN_GRAPES_TOP_WHITE = registerBlock("diamond_wallpaper_green_grapes_top_white",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_GREEN_GRAPES_BOTTOM_COLOR = registerBlock("diamond_wallpaper_green_grapes_bottom_color",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_GREEN_GRAPES_TOP_COLOR = registerBlock("diamond_wallpaper_green_grapes_top_color",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL).sound(SoundType.SPORE_BLOSSOM)));

    public static final RegistryObject<Block> DIAMOND_WALLPAPER_LEMON = registerBlock("diamond_wallpaper_lemon",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_LEMON_BOTTOM_BROWN = registerBlock("diamond_wallpaper_lemon_bottom_brown",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_LEMON_TOP_BROWN = registerBlock("diamond_wallpaper_lemon_top_brown",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_LEMON_BOTTOM_WHITE = registerBlock("diamond_wallpaper_lemon_bottom_white",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_LEMON_TOP_WHITE = registerBlock("diamond_wallpaper_lemon_top_white",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_LEMON_BOTTOM_COLOR = registerBlock("diamond_wallpaper_lemon_bottom_color",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_LEMON_TOP_COLOR = registerBlock("diamond_wallpaper_lemon_top_color",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL).sound(SoundType.SPORE_BLOSSOM)));

    public static final RegistryObject<Block> DIAMOND_WALLPAPER_ORANGE = registerBlock("diamond_wallpaper_orange",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_ORANGE_BOTTOM_BROWN = registerBlock("diamond_wallpaper_orange_bottom_brown",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_ORANGE_TOP_BROWN = registerBlock("diamond_wallpaper_orange_top_brown",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_ORANGE_BOTTOM_WHITE = registerBlock("diamond_wallpaper_orange_bottom_white",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_ORANGE_TOP_WHITE = registerBlock("diamond_wallpaper_orange_top_white",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_ORANGE_BOTTOM_COLOR = registerBlock("diamond_wallpaper_orange_bottom_color",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_ORANGE_TOP_COLOR = registerBlock("diamond_wallpaper_orange_top_color",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL).sound(SoundType.SPORE_BLOSSOM)));

    public static final RegistryObject<Block> DIAMOND_WALLPAPER_PEAR = registerBlock("diamond_wallpaper_pear",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_PEAR_BOTTOM_BROWN = registerBlock("diamond_wallpaper_pear_bottom_brown",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_PEAR_TOP_BROWN = registerBlock("diamond_wallpaper_pear_top_brown",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_PEAR_BOTTOM_WHITE = registerBlock("diamond_wallpaper_pear_bottom_white",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_PEAR_TOP_WHITE = registerBlock("diamond_wallpaper_pear_top_white",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_PEAR_BOTTOM_COLOR = registerBlock("diamond_wallpaper_pear_bottom_color",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_PEAR_TOP_COLOR = registerBlock("diamond_wallpaper_pear_top_color",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL).sound(SoundType.SPORE_BLOSSOM)));

    public static final RegistryObject<Block> DIAMOND_WALLPAPER_PLUM = registerBlock("diamond_wallpaper_plum",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_PLUM_BOTTOM_BROWN = registerBlock("diamond_wallpaper_plum_bottom_brown",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_PLUM_TOP_BROWN = registerBlock("diamond_wallpaper_plum_top_brown",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_PLUM_BOTTOM_WHITE = registerBlock("diamond_wallpaper_plum_bottom_white",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_PLUM_TOP_WHITE = registerBlock("diamond_wallpaper_plum_top_white",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_PLUM_BOTTOM_COLOR = registerBlock("diamond_wallpaper_plum_bottom_color",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_PLUM_TOP_COLOR = registerBlock("diamond_wallpaper_plum_top_color",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL).sound(SoundType.SPORE_BLOSSOM)));

    public static final RegistryObject<Block> DIAMOND_WALLPAPER_PURPLE_GRAPES = registerBlock("diamond_wallpaper_purple_grapes",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_PURPLE_GRAPES_BOTTOM_BROWN = registerBlock("diamond_wallpaper_purple_grapes_bottom_brown",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_PURPLE_GRAPES_TOP_BROWN = registerBlock("diamond_wallpaper_purple_grapes_top_brown",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_PURPLE_GRAPES_BOTTOM_WHITE = registerBlock("diamond_wallpaper_purple_grapes_bottom_white",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_PURPLE_GRAPES_TOP_WHITE = registerBlock("diamond_wallpaper_purple_grapes_top_white",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_PURPLE_GRAPES_BOTTOM_COLOR = registerBlock("diamond_wallpaper_purple_grapes_bottom_color",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_PURPLE_GRAPES_TOP_COLOR = registerBlock("diamond_wallpaper_purple_grapes_top_color",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL).sound(SoundType.SPORE_BLOSSOM)));

    public static final RegistryObject<Block> DIAMOND_WALLPAPER_STRAWBERRY = registerBlock("diamond_wallpaper_strawberry",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_STRAWBERRY_BOTTOM_BROWN = registerBlock("diamond_wallpaper_strawberry_bottom_brown",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_STRAWBERRY_TOP_BROWN = registerBlock("diamond_wallpaper_strawberry_top_brown",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_STRAWBERRY_BOTTOM_WHITE = registerBlock("diamond_wallpaper_strawberry_bottom_white",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_STRAWBERRY_TOP_WHITE = registerBlock("diamond_wallpaper_strawberry_top_white",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_STRAWBERRY_BOTTOM_COLOR = registerBlock("diamond_wallpaper_strawberry_bottom_color",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_STRAWBERRY_TOP_COLOR = registerBlock("diamond_wallpaper_strawberry_top_color",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).sound(SoundType.SPORE_BLOSSOM)));

    public static final RegistryObject<Block> DIAMOND_WALLPAPER_RED_MUSHROOM = registerBlock("diamond_wallpaper_red_mushroom",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_RED_MUSHROOM_BOTTOM_BROWN = registerBlock("diamond_wallpaper_red_mushroom_bottom_brown",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_RED_MUSHROOM_TOP_BROWN = registerBlock("diamond_wallpaper_red_mushroom_top_brown",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_RED_MUSHROOM_BOTTOM_WHITE = registerBlock("diamond_wallpaper_red_mushroom_bottom_white",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_RED_MUSHROOM_TOP_WHITE = registerBlock("diamond_wallpaper_red_mushroom_top_white",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_RED_MUSHROOM_BOTTOM_COLOR = registerBlock("diamond_wallpaper_red_mushroom_bottom_color",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_RED_MUSHROOM_TOP_COLOR = registerBlock("diamond_wallpaper_red_mushroom_top_color",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).sound(SoundType.SPORE_BLOSSOM)));

    public static final RegistryObject<Block> DIAMOND_WALLPAPER_ANCHOR = registerBlock("diamond_wallpaper_anchor",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_ANCHOR_BOTTOM_BROWN = registerBlock("diamond_wallpaper_anchor_bottom_brown",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_ANCHOR_TOP_BROWN = registerBlock("diamond_wallpaper_anchor_top_brown",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_ANCHOR_BOTTOM_WHITE = registerBlock("diamond_wallpaper_anchor_bottom_white",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> DIAMOND_WALLPAPER_ANCHOR_TOP_WHITE = registerBlock("diamond_wallpaper_anchor_top_white",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL).sound(SoundType.SPORE_BLOSSOM)));

    //TODO ? WALLPAPER TRIMS
    public static final RegistryObject<Block> BLUE_ROSE_STRIPED_WALLPAPER_BOTTOM = registerBlock("blue_rose_striped_wallpaper_bottom",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> BLUE_ROSE_STRIPED_WALLPAPER_TOP = registerBlock("blue_rose_striped_wallpaper_top",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> CONFECTIONARY_WALLPAPER_BOTTOM = registerBlock("confectionary_wallpaper_bottom",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> CONFECTIONARY_WALLPAPER_TOP = registerBlock("confectionary_wallpaper_top",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> MINT_WALLPAPER_BOTTOM = registerBlock("mint_wallpaper_bottom",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> MINT_WALLPAPER_TOP = registerBlock("mint_wallpaper_top",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> STRIPED_FLORAL_WALLPAPER = registerBlock("striped_floral_wallpaper",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> STRIPED_FLORAL_WALLPAPER_BOTTOM = registerBlock("striped_floral_wallpaper_bottom",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> STRIPED_FLORAL_WALLPAPER_TOP = registerBlock("striped_floral_wallpaper_top",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> FLORAL_BERRY_WALLPAPER_BOTTOM = registerBlock("floral_berry_wallpaper_bottom",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL).sound(SoundType.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> FLORAL_BERRY_WALLPAPER_TOP = registerBlock("floral_berry_wallpaper_top",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL).sound(SoundType.SPORE_BLOSSOM)));

    //WAINSCOTING
    public static final RegistryObject<Block> BLUE_WAINSCOTING = registerFuelBlock("blue_wainscoting",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.BLUE)), 300);
    public static final RegistryObject<Block> BROWN_WAINSCOTING = registerFuelBlock("brown_wainscoting",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.BLUE)), 300);
    public static final RegistryObject<Block> WILLOW_WAINSCOTING = registerFuelBlock("willow_wainscoting",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.PURPLE)), 300);
    public static final RegistryObject<Block> FLOWERING_WILLOW_WAINSCOTING = registerFuelBlock("flowering_willow_wainscoting",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.PURPLE)), 300);
    public static final RegistryObject<Block> POPLAR_WAINSCOTING = registerFuelBlock("poplar_wainscoting",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.YELLOW)), 300);
    public static final RegistryObject<Block> FLOWERING_POPLAR_WAINSCOTING = registerFuelBlock("flowering_poplar_wainscoting",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.YELLOW)), 300);
    public static final RegistryObject<Block> CRABAPPLE_WAINSCOTING = registerFuelBlock("crabapple_wainscoting",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.PINK)), 300);
    public static final RegistryObject<Block> FLOWERING_CRABAPPLE_WAINSCOTING = registerFuelBlock("flowering_crabapple_wainscoting",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.PINK)), 300);
    public static final RegistryObject<Block> SYCAMORE_WAINSCOTING = registerFuelBlock("sycamore_wainscoting",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.GREEN)), 300);
    public static final RegistryObject<Block> MAPLE_WAINSCOTING = registerFuelBlock("fluorescent_maple_wainscoting",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.LIGHT_BLUE).lightLevel(p -> 4).noOcclusion()), 300);
    public static final RegistryObject<Block> BLUE_MUSHROOM_WAINSCOTING = registerFuelBlock("blue_mushroom_wainscoting",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.BLUE).sound(SoundType.SHROOMLIGHT)), 300);
    public static final RegistryObject<Block> RED_MUSHROOM_WAINSCOTING = registerFuelBlock("red_mushroom_wainscoting",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.RED).sound(SoundType.SHROOMLIGHT)), 300);
    public static final RegistryObject<Block> ALABASTER_WAINSCOTING = registerBlock("alabaster_wainscoting",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK)));

    //BRICKS AND TILES
    public static final RegistryObject<Block> GINGERBREAD_BRICKS = registerBlock("gingerbread_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BROWN).sound(SoundType.CHERRY_WOOD)));
    public static final RegistryObject<Block> GINGERBREAD_BRICKS_TOP = registerBlock("gingerbread_bricks_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BROWN).sound(SoundType.CHERRY_WOOD)));
    public static final RegistryObject<Block> GINGERBREAD_BRICKS_SIDE = registerBlock("gingerbread_bricks_corner",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BROWN).sound(SoundType.CHERRY_WOOD)));
    public static final RegistryObject<Block> GINGERBREAD_BRICKS_TOP_CORNER = registerBlock("gingerbread_bricks_top_corner",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BROWN).sound(SoundType.CHERRY_WOOD)));
    public static final RegistryObject<Block> GINGERBREAD_BRICK_STAIRS = registerBlock("gingerbread_brick_stairs",
            () -> new StairBlock(() -> BlockRegistration.GINGERBREAD_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.QUARTZ_STAIRS).mapColor(DyeColor.BROWN).sound(SoundType.CHERRY_WOOD)));
    public static final RegistryObject<Block> GINGERBREAD_BRICK_SLAB = registerBlock("gingerbread_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BROWN).sound(SoundType.CHERRY_WOOD)));

    public static final RegistryObject<Block> ESPERANCA_TILE = registerBlock("esperanca_tile",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).mapColor(DyeColor.LIGHT_BLUE)));
    public static final RegistryObject<Block> LILIY_HILLS_TILE = registerBlock("lily_hills_tile",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).mapColor(DyeColor.BROWN)));
    public static final RegistryObject<Block> HANNISH_TILE = registerBlock("hannish_tile",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).mapColor(DyeColor.PURPLE)));
    public static final RegistryObject<Block> AURA_TILES = registerBlock("aura_tiles",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).mapColor(DyeColor.ORANGE)));
    public static final RegistryObject<Block> BIFURCATING_TILES = registerBlock("bifurcating_tiles",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> BLACK_AMARYLLIS_TILES = registerBlock("black_amaryllis_tiles",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).mapColor(DyeColor.BLACK)));
    public static final RegistryObject<Block> ROSETTE_TILES = registerBlock("rosette_tiles",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).mapColor(DyeColor.ORANGE)));
    public static final RegistryObject<Block> SEISMIC_TILES = registerBlock("seismic_tiles",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).mapColor(DyeColor.LIGHT_GRAY)));

    public static final RegistryObject<Block> VERDANT_TILE = registerBlock("verdant_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).mapColor(DyeColor.GREEN)));
    public static final RegistryObject<Block> VERDANT_TILE_EDGE = registerBlock("verdant_tile_edge",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).mapColor(DyeColor.GREEN)));
    public static final RegistryObject<Block> VERDANT_TILE_CORNER = registerBlock("verdant_tile_corner",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).mapColor(DyeColor.GREEN)));

    public static final RegistryObject<Block> MARBLE_TILE = registerBlock("marble_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> MARBLE_TILE_CHISELED = registerBlock("marble_tile_chiseled",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).mapColor(DyeColor.YELLOW)));
    public static final RegistryObject<Block> MARBLE_TILE_BORDER = registerBlock("marble_tile_border",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> MARBLE_TILE_BORDER_CIRCLE = registerBlock("marble_tile_border_circle",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> MARBLE_TILE_BORDER_DETAIL = registerBlock("marble_tile_border_detailed",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> MARBLE_TILE_CORNER = registerBlock("marble_tile_corner",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> MARBLE_TILE_CORNER_CIRCLE = registerBlock("marble_tile_corner_circle",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).mapColor(DyeColor.WHITE)));

    public static final RegistryObject<Block> IRIDESCENT_TILES = registerBlock("tiles_iridescent",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).mapColor(DyeColor.PINK)));
    public static final RegistryObject<Block> SMALL_IRIDESCENT_TILES = registerBlock("tiles_iridescent_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).mapColor(DyeColor.PINK)));
    public static final RegistryObject<Block> GREEN_TILES = registerBlock("tiles_green",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).mapColor(DyeColor.GREEN)));
    public static final RegistryObject<Block> SMALL_GREEN_TILES = registerBlock("subway_tiles_green",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).mapColor(DyeColor.GREEN)));
    public static final RegistryObject<Block> YELLOW_TILES = registerBlock("tiles_yellow",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).mapColor(DyeColor.YELLOW)));
    public static final RegistryObject<Block> SMALL_YELLOW_TILES = registerBlock("subway_tiles_yellow",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).mapColor(DyeColor.YELLOW)));
    public static final RegistryObject<Block> PURPLE_TILES = registerBlock("tiles_purple",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).mapColor(DyeColor.PURPLE)));
    public static final RegistryObject<Block> SMALL_PURPLE_TILES = registerBlock("subway_tiles_purple",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).mapColor(DyeColor.PURPLE)));
    public static final RegistryObject<Block> PINK_TILES = registerBlock("tiles_pink",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).mapColor(DyeColor.PINK)));
    public static final RegistryObject<Block> SMALL_PINK_TILES = registerBlock("subway_tiles_pink",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).mapColor(DyeColor.PINK)));
    public static final RegistryObject<Block> KITCHEN_TILES = registerBlock("tiles_kitchen",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).mapColor(DyeColor.RED)));

    public static final RegistryObject<Block> WICKER_BLOCK = registerFuelBlock("wicker_block",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.BAMBOO)), 150);
    public static final RegistryObject<Block> CHISELED_GOLD_BLOCK = registerBlock("chiseled_gold_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)));
    public static final RegistryObject<Block> EYE_BLOCK = registerBlock("eye_block",
            () -> new EyeBlock(BlockBehaviour.Properties.copy(Blocks.HAY_BLOCK).sound(SoundType.FROGSPAWN)));
    public static final RegistryObject<Block> DYNASTY_DOOR = registerFuelBlock("dynasty_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(DyeColor.CYAN), BlockSetType.OAK), 300);

    public static final RegistryObject<Block> ALABASTER_WINDOW_DIVIDED = registerBlock("alabaster_window_divided",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistryObject<Block> ALABASTER_WINDOW_PANE = registerBlock("alabaster_window_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistryObject<Block> ALABASTER_PANEL_CANTERBURY = registerBlock("alabaster_canterbury_panel",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistryObject<Block> ALABASTER_PANEL_ATLANTIC = registerBlock("alabaster_atlantic_panel",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistryObject<Block> ALABASTER_PANEL_ALEXANDRIA = registerBlock("alabaster_alexandria_panel",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistryObject<Block> ALABASTER_PANEL_AUGUSTINE = registerBlock("alabaster_augustine_panel",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistryObject<Block> ALABASTER_SCREEN_DOOR = registerBlock("alabaster_screen_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_DOOR), BlockSetType.STONE));    
    public static final RegistryObject<Block> ALABASTER_FRENCH_DOOR = registerBlock("alabaster_french_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_DOOR), BlockSetType.STONE));
    
    public static final RegistryObject<Block> WOOD_WINDOW_DIVIDED = registerBlock("wooden_window_divided",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).mapColor(DyeColor.BROWN)));
    public static final RegistryObject<Block> WOOD_WINDOW_PANE = registerBlock("wooden_window_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).mapColor(DyeColor.BROWN)));
    public static final RegistryObject<Block> WOOD_PANEL_CANTERBURY = registerBlock("wooden_canterbury_panel",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).mapColor(DyeColor.BROWN)));
    public static final RegistryObject<Block> WOOD_PANEL_ATLANTIC = registerBlock("wooden_atlantic_panel",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).mapColor(DyeColor.BROWN)));
    public static final RegistryObject<Block> WOOD_PANEL_ALEXANDRIA = registerBlock("wooden_alexandria_panel",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).mapColor(DyeColor.BROWN)));
    public static final RegistryObject<Block> WOOD_PANEL_AUGUSTINE = registerBlock("wooden_augustine_panel",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).mapColor(DyeColor.BROWN)));
    public static final RegistryObject<Block> WOOD_SCREEN_DOOR = registerBlock("wooden_screen_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> WOOD_FRENCH_DOOR = registerBlock("wooden_french_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));

    public static final RegistryObject<Block> COLOSSEO_PILLAR = registerBlock("colosseo_pillar",
            () -> new DirectionalPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.RED)));
    public static final RegistryObject<Block> COLOSSEO_PILLAR_BASE = registerBlock("colosseo_pillar_base",
            () -> new DirectionalPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.RED)));
    public static final RegistryObject<Block> COLOSSEO_PILLAR_TOP = registerBlock("colosseo_pillar_top",
            () -> new DirectionalPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.RED)));

    public static final RegistryObject<Block> HONEY_JAR_BLOCK = registerBlock("jam_jar_honey",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.SCULK_CATALYST)));
    public static final RegistryObject<Block> ORANGE_JAR_BLOCK = registerBlock("jam_jar_orange",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.SCULK_CATALYST)));
    public static final RegistryObject<Block> CHERRY_JAR_BLOCK = registerBlock("jam_jar_cherry",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.SCULK_CATALYST)));
    public static final RegistryObject<Block> STRAWBERRY_JAR_BLOCK = registerBlock("jam_jar_strawberry",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.SCULK_CATALYST)));
    public static final RegistryObject<Block> BLUEBERRY_JAR_BLOCK = registerBlock("jam_jar_blueberry",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.SCULK_CATALYST)));
    public static final RegistryObject<Block> APRICOT_JAR_BLOCK = registerBlock("jam_jar_apricot",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.SCULK_CATALYST)));

    public static final RegistryObject<Block> ART_NOUVEAU_DOOR = registerFuelBlock("art_nouveau_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(DyeColor.YELLOW), BlockSetType.OAK), 300);
    public static final RegistryObject<Block> ART_NOUVEAU_DOOR_DARK = registerFuelBlock("art_nouveau_door_dark",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(DyeColor.BROWN), BlockSetType.OAK), 300);


    //TODO MOVE THESE TO STONE SETS
    public static final RegistryObject<Block> MARBLE_BALUSTRADE = registerBlock("marble_balustrade",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> MARBLE_PICKET_FENCE = registerBlock("marble_picket_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> CHALCEDONY_BALUSTRADE = registerBlock("chalcedony_balustrade",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).mapColor(DyeColor.BLUE)));
    public static final RegistryObject<Block> CHALCEDONY_PICKET_FENCE = registerBlock("chalcedony_picket_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).mapColor(DyeColor.BLUE)));
    public static final RegistryObject<Block> DEEP_CHALCEDONY_BALUSTRADE = registerBlock("deep_chalcedony_balustrade",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).mapColor(DyeColor.BLUE)));
    public static final RegistryObject<Block> DEEP_CHALCEDONY_PICKET_FENCE = registerBlock("deep_chalcedony_picket_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).mapColor(DyeColor.BLUE)));

    //SMALL FURNITURE
    //MISC
    public static final RegistryObject<Block> BIRDHOUSE_UNPAINTED = registerBlock("birdhouse_unpainted",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BIRDHOUSE_RED = registerBlock("birdhouse_red",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.RED)));
    public static final RegistryObject<Block> BIRDHOUSE_BLUE = registerBlock("birdhouse_blue",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.BLUE)));
    public static final RegistryObject<Block> BIRDHOUSE_PASTEL = registerBlock("birdhouse_pastel",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.BLUE)));

    public static final RegistryObject<Block> CARDBOARD_BOX_OPEN = registerBlock("cardboard_box_open",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.HAY_BLOCK).mapColor(DyeColor.BROWN)));
    public static final RegistryObject<Block> CARDBOARD_BOX_CLOSED = registerBlock("cardboard_box_closed",
            () -> new SmallFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.HAY_BLOCK).mapColor(DyeColor.BROWN)));
    public static final RegistryObject<Block> CARDBOARD_BOX_CLUTTERED = registerBlock("cardboard_box_cluttered",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.HAY_BLOCK).mapColor(DyeColor.BROWN)));

    public static final RegistryObject<Block> KITCHEN_SCALE = registerBlock("analog_kitchen_scale",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).mapColor(DyeColor.RED)));
    public static final RegistryObject<Block> ANTIQUE_MINI_TABLE = registerBlock("antique_mini_table",
            () -> new AntiqueMiniTableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.BROWN).noOcclusion()));
    public static final RegistryObject<Block> ANCIENT_CODEX = registerBlock("ancient_codex",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.BROWN).noOcclusion()));
    public static final RegistryObject<Block> ANTIQUE_BOOK_STAND = registerBlock("antique_book_stand",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.BROWN).noOcclusion()));

    public static final RegistryObject<Block> BRIEFCASE_BLANK = registerBlock("briefcase_blank",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.RED)));
    public static final RegistryObject<Block> BRIEFCASE_ROVER = registerBlock("briefcase_rover",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.RED)));
    public static final RegistryObject<Block> BUNNY_BOOK_ENDS = registerBlock("bunny_book_ends",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.YELLOW)));
    public static final RegistryObject<Block> BOX_OF_PAINTS = registerBlock("box_of_paints",
            () -> new FragileMediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.BROWN).noCollission()));

    public static final RegistryObject<Block> THREAD_SPOOL_YELLOW = registerBlock("spool_of_thread_yellow",
            () -> new ThreadSpoolBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL)));
    public static final RegistryObject<Block> THREAD_SPOOL_GREEN = registerBlock("spool_of_thread_green",
            () -> new ThreadSpoolBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL)));
    public static final RegistryObject<Block> THREAD_SPOOL_PURPLE = registerBlock("spool_of_thread_purple",
            () -> new ThreadSpoolBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL)));
    public static final RegistryObject<Block> THREAD_SPOOL_PINK = registerBlock("spool_of_thread_pink",
            () -> new ThreadSpoolBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL)));
    public static final RegistryObject<Block> CAT_MUGS_CLUTTERED = registerBlock("cat_mugs_cluttered",
            () -> new FragileSmallFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE).sound(SoundType.DECORATED_POT)));
    public static final RegistryObject<Block> CAT_PLANT_POT_BLACK = registerBlock("cat_plant_pot_black",
            () -> new SmallFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE).sound(SoundType.DECORATED_POT)));
    public static final RegistryObject<Block> CAT_PLANT_POT_ORANGE = registerBlock("cat_plant_pot_orange",
            () -> new SmallFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE).sound(SoundType.DECORATED_POT)));
    public static final RegistryObject<Block> COFFEE_GRINDER = registerBlock("coffee_grinder",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> ENDTABLE_DECOR = registerBlock("endtable_decor",
            () -> new FragileMediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.HAY_BLOCK).sound(SoundType.DECORATED_POT).noCollission()));
    public static final RegistryObject<Block> MINI_CACTUS_SET = registerBlock("mini_cactus_set",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.HAY_BLOCK).sound(SoundType.DECORATED_POT).mapColor(DyeColor.GREEN).noCollission()));
    public static final RegistryObject<Block> MUSHROOM_JARS = registerBlock("mushroom_jars",
            () -> new MushroomJarsBlock(BlockBehaviour.Properties.copy(Blocks.HAY_BLOCK).sound(SoundType.GLASS).mapColor(DyeColor.BROWN)));
    public static final RegistryObject<Block> NEWSPAPER_PILE_SHORT = registerBlock("newspaper_pile_short",
            () -> new ShortPaperPileBlock(BlockBehaviour.Properties.copy(Blocks.HAY_BLOCK).sound(SoundType.SPORE_BLOSSOM).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> NEWSPAPER_PILE_TALL = registerBlock("newspaper_pile_tall",
            () -> new TallPaperPileBlock(BlockBehaviour.Properties.copy(Blocks.HAY_BLOCK).sound(SoundType.SPORE_BLOSSOM).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> PAPER_PILE = registerBlock("paper_pile",
            () -> new ShortPaperPileBlock(BlockBehaviour.Properties.copy(Blocks.HAY_BLOCK).sound(SoundType.SPORE_BLOSSOM).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> FENCE_SHELF = registerBlock("fence_shelf_blue",
            () -> new FenceShelfBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.BLUE)));
    public static final RegistryObject<Block> HANGING_PLANT_POT_FLOWERS = registerBlock("hanging_plant_pot_flowers",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.DECORATED_POT).mapColor(DyeColor.BROWN)));
    public static final RegistryObject<Block> HANGING_PLANT_POT_GRASS = registerBlock("hanging_plant_pot_grass",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.DECORATED_POT).mapColor(DyeColor.BROWN)));
    public static final RegistryObject<Block> PEDESTAL_HK = registerBlock("pedestal_hk",
            () -> new PedestalBlock(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(DyeColor.ORANGE)));
    public static final RegistryObject<Block> PICNIC_BASKET = registerBlock("picnic_basket",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL).mapColor(DyeColor.BLUE)));
    public static final RegistryObject<Block> PICNIC_BASKET_PREPARED = registerBlock("picnic_basket_prepared",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL).mapColor(DyeColor.BLUE)));
    public static final RegistryObject<Block> BASKET_OF_FLOWERS = registerBlock("basket_of_flowers",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL).mapColor(DyeColor.YELLOW)));
    public static final RegistryObject<Block> BASKET_OF_PRODUCE = registerBlock("basket_of_produce",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL).mapColor(DyeColor.ORANGE)));

    public static final RegistryObject<Block> ROW_OF_SMALL_BOOKS = registerBlock("row_of_small_books",
            () -> new SmallBookRowBlock(BlockBehaviour.Properties.copy(Blocks.HAY_BLOCK).sound(SoundType.SPORE_BLOSSOM).mapColor(DyeColor.BLUE)));
    public static final RegistryObject<Block> ROW_OF_SMALL_BOOKS_PASTEL = registerBlock("row_of_small_books_pastel",
            () -> new SmallBookRowBlock(BlockBehaviour.Properties.copy(Blocks.HAY_BLOCK).sound(SoundType.SPORE_BLOSSOM).mapColor(DyeColor.PINK)));
    public static final RegistryObject<Block> ROW_OF_SMALL_BOOKS_SHELVED = registerBlock("row_of_small_books_shelved",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.BLUE)));
    public static final RegistryObject<Block> ROW_OF_SMALL_BOOKS_PASTEL_SHELVED = registerBlock("row_of_small_books_pastel_shelved",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.PINK)));
    public static final RegistryObject<Block> SMALL_SHELF = registerBlock("small_shelf",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.BROWN)));
    public static final RegistryObject<Block> SMALL_SHELF_PINK = registerBlock("small_shelf_pink",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.PINK)));
    public static final RegistryObject<Block> RUBIKS_CUBE = registerBlock("rubiks_cube",
            () -> new RubiksCubeBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL).sound(SoundType.DEEPSLATE_BRICKS).mapColor(DyeColor.RED)));
    public static final RegistryObject<Block> RUBIKS_CUBE_PASTEL = registerBlock("rubiks_cube_pastel",
            () -> new RubiksCubeBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL).sound(SoundType.DEEPSLATE_BRICKS).mapColor(DyeColor.PINK)));
    public static final RegistryObject<Block> SCATTERED_PAPERS = registerBlock("scattered_papers",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.HAY_BLOCK).sound(SoundType.SPORE_BLOSSOM).mapColor(DyeColor.WHITE).noCollission()));
    public static final RegistryObject<Block> SEWING_MACHINE_ANTIQUE = registerBlock("sewing_machine_antique",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.ANVIL).mapColor(DyeColor.BLACK)));
    public static final RegistryObject<Block> SMALL_BUSH = registerBlock("small_bush",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> TEDDY_BEAR = registerBlock("teddy_bear",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));

    public static final RegistryObject<Block> POLAROID_CAMERA = registerBlock("polaroid_camera",
            () -> new PolaroidCameraBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL).sound(SoundType.SCAFFOLDING)));

    //TODO idr if i ahve another to do somewhere else sorry
    public static final RegistryObject<Block> BOOK_OPEN = registerBlock("book_open",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> BRASS_KEY = registerBlock("brass_key",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> ENVELOPE_STACK = registerBlock("envelope_stack",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> FLOWER_DESK_LAMP = registerBlock("flower_desk_lamp",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> FLOWER_SHELF_BLUE = registerBlock("flower_shelf_blue",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> FLOWER_SHELF_GREEN = registerBlock("flower_shelf_green",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> FLOWER_SHELF_PASTEL_YELLOW = registerBlock("flower_shelf_pastel_yellow",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> FLOWER_SHELF_PINK = registerBlock("flower_shelf_pink",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> FLOWER_SHELF_PURPLE = registerBlock("flower_shelf_purple",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> FLOWER_SHELF_YELLOW = registerBlock("flower_shelf_yellow",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> FLOWER_SHELF_CANDLE_BLUE = registerBlock("flower_shelf_candle_blue",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> FLOWER_SHELF_CANDLE_GREEN = registerBlock("flower_shelf_candle_green",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> FLOWER_SHELF_CANDLE_PASTEL_YELLOW = registerBlock("flower_shelf_candle_pastel_yellow",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> FLOWER_SHELF_CANDLE_PINK = registerBlock("flower_shelf_candle_pink",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> FLOWER_SHELF_CANDLE_PURPLE = registerBlock("flower_shelf_candle_purple",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> FLOWER_SHELF_CANDLE_YELLOW = registerBlock("flower_shelf_candle_yellow",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> FLOWER_SHELF_PLANT = registerBlock("flower_shelf_plant",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> FLOWER_TEA_KETTLE = registerBlock("flower_tea_kettle",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> HEAVENLY_ORNAMENTAL_ARRAY = registerBlock("heavenly_ornamental_array",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> SALT_PEPPER_SHAKERS = registerBlock("salt_pepper_shakers",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> SAND_SEAL_PLUSH_BLUE = registerBlock("sand_seal_plush_blue",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> SAND_SEAL_PLUSH_GREEN = registerBlock("sand_seal_plush_green",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> SAND_SEAL_PLUSH_RED = registerBlock("sand_seal_plush_red",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> SKETCHBOOK_SINGLE = registerBlock("sketchbook_single",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> STACK_OF_BOOKS = registerBlock("stack_of_books",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> STACK_OF_BOOKS_TALL = registerBlock("stack_of_books_tall",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> SWEETHEART_BAKING_SET_BOWL = registerBlock("sweetheart_baking_set_bowl",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> SWEETHEART_BAKING_SET_INGREDIENTS = registerBlock("sweetheart_baking_set_ingredients",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> WINE_BOTTLE_RACK = registerBlock("wine_bottle_rack",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> WINE_BOTTLES = registerBlock("wine_bottles",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> YELLOW_NOTEPAD = registerBlock("yellow_notepad",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> FABRIC_BOLTS = registerBlock("fabric_bolts",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> SCISSORS_AND_THREAD = registerBlock("scissors_and_thread",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> SLICED_BREAD = registerBlock("sliced_bread",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> VIAL_STAND = registerBlock("vial_stand",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> PINEAPPLE = registerBlock("pineapple",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> MUSHROOM_FLAT = registerBlock("mushroom_flat",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> HONEYCOMB_LAMP = registerBlock("honeycomb_lamp",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));

    public static final RegistryObject<Block> CHINA_CABINET = registerBlock("china_cabinet",
            () -> new GumballMachineBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF).mapColor(DyeColor.GREEN).noOcclusion()));
    public static final RegistryObject<Block> GENERAL_STORE_CABINET = registerBlock("general_store_cabinet",
            () -> new TwoByTwoFullSizeBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF).mapColor(DyeColor.GREEN).noOcclusion()));
    public static final RegistryObject<Block> RETRO_FRIDGE_BLACK = registerBlock("retro_fridge_black",
            () -> new GumballMachineBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF).mapColor(DyeColor.GREEN).noOcclusion()));
    public static final RegistryObject<Block> RETRO_FRIDGE_BLUE = registerBlock("retro_fridge_blue",
            () -> new GumballMachineBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF).mapColor(DyeColor.GREEN).noOcclusion()));
    public static final RegistryObject<Block> RETRO_FRIDGE_PINK = registerBlock("retro_fridge_pink",
            () -> new GumballMachineBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF).mapColor(DyeColor.GREEN).noOcclusion()));
    public static final RegistryObject<Block> RETRO_FRIDGE_PURPLE = registerBlock("retro_fridge_purple",
            () -> new GumballMachineBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF).mapColor(DyeColor.GREEN).noOcclusion()));
    public static final RegistryObject<Block> RETRO_FRIDGE_RED = registerBlock("retro_fridge_red",
            () -> new GumballMachineBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF).mapColor(DyeColor.GREEN).noOcclusion()));
    public static final RegistryObject<Block> RETRO_FRIDGE_TURQUOISE = registerBlock("retro_fridge_turquoise",
            () -> new GumballMachineBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF).mapColor(DyeColor.GREEN).noOcclusion()));
    public static final RegistryObject<Block> RETRO_FRIDGE_WHITE = registerBlock("retro_fridge_white",
            () -> new GumballMachineBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF).mapColor(DyeColor.GREEN).noOcclusion()));
    public static final RegistryObject<Block> RETRO_FRIDGE_YELLOW = registerBlock("retro_fridge_yellow",
            () -> new GumballMachineBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF).mapColor(DyeColor.GREEN).noOcclusion()));
    public static final RegistryObject<Block> FWISH_ARMCHAIR = registerBlock("fwish_armchair",
            () -> new MadonnaOttomanBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.BLUE).noOcclusion()));
    public static final RegistryObject<Block> FWISH_OTTOMAN = registerBlock("fwish_ottoman",
            () -> new MadonnaOttomanBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.BLUE).noOcclusion()));
    public static final RegistryObject<Block> PLANT_LADDER = registerBlock("plant_ladder",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.BLUE).noOcclusion()));
    public static final RegistryObject<Block> STEAMPUNK_GLOBE = registerBlock("steampunk_globe",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.BLUE).noOcclusion()));
    public static final RegistryObject<Block> UNLIVING_CHAIR = registerBlock("unliving_chair",
            () -> new MadonnaOttomanBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.BLUE).noOcclusion()));

    public static final RegistryObject<Block> TRADITIONAL_RADIO = registerBlock("traditional_radio",
            () -> new CustomJukeboxBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> TWO_FLOWER_POTS = registerBlock("two_flower_pots",
            () -> new MushroomJarsBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL).sound(SoundType.DECORATED_POT)));
    public static final RegistryObject<Block> SEWING_MANNEQUIN = registerBlock("sewing_mannequin",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> STARS_PENDANT = registerBlock("stars_pendant",
            () -> new StarPendantBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.SMALL_AMETHYST_BUD).mapColor(DyeColor.YELLOW).noCollission()));
    public static final RegistryObject<Block> MOON_PENDANT = registerBlock("moon_pendant",
            () -> new StarPendantBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.SMALL_AMETHYST_BUD).mapColor(DyeColor.YELLOW).noCollission()));

    //TODO fix these
    public static final RegistryObject<Block> OSSON_PENDANT_BLACK = registerBlock("osson_pendant_black",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL)));
    public static final RegistryObject<Block> OSSON_PENDANT_BROWN = registerBlock("osson_pendant_brown",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> OSSON_PENDANT_ORANGE = registerBlock("osson_pendant_orange",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL)));
    public static final RegistryObject<Block> OSSON_PENDANT_RACING_GREEN = registerBlock("osson_pendant_racing_green",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL)));
    public static final RegistryObject<Block> OSSON_PENDANT_SAGE_GREEN = registerBlock("osson_pendant_sage_green",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL)));
    public static final RegistryObject<Block> OSSON_PENDANT_RED = registerBlock("osson_pendant_red",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL)));
    public static final RegistryObject<Block> OSSON_PENDANT_YELLOW = registerBlock("osson_pendant_yellow",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL)));
    public static final RegistryObject<Block> OSSON_PENDANT_WHITE = registerBlock("osson_pendant_white",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> COTTAGE_BOOKCASE = registerBlock("cottage_bookcase",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> COTTAGE_STANDING_LAMP = registerBlock("cottage_standing_lamp",
            () -> new SmallLampBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> DRYING_HERBS = registerBlock("drying_herbs",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> HANGING_CLOTH = registerBlock("hanging_cloth",
            () -> new MediumFurnitureBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    //SMALL TABLES
    public static final RegistryObject<Block> COTTAGE_SIDE_TABLE = registerBlock("cottage_side_table",
            () -> new EndTableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ENDTABLE_AMETHYST = registerBlock("endtable_amethyst",
            () -> new EndTableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ENDTABLE_BUBBLEGUM = registerBlock("endtable_bubblegum",
            () -> new EndTableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ENDTABLE_CHARCOAL = registerBlock("endtable_charcoal",
            () -> new EndTableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ENDTABLE_MEADOW = registerBlock("endtable_meadow",
            () -> new EndTableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ENDTABLE_PERIWINKLE = registerBlock("endtable_periwinkle",
            () -> new EndTableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ENDTABLE_SUNSHINE = registerBlock("endtable_sunshine",
            () -> new EndTableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ENDTABLE_WOOD = registerBlock("endtable_wood",
            () -> new EndTableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> NIGHTSTAND_GREEN = registerBlock("nightstand_green",
            () -> new EndTableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.GREEN).noOcclusion()));
    public static final RegistryObject<Block> ROSE_END_TABLE = registerBlock("rose_end_table",
            () -> new EndTableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.GREEN).noOcclusion()));
    public static final RegistryObject<Block> ROSE_END_TABLE_BLACK = registerBlock("rose_end_table_black",
            () -> new EndTableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.GREEN).noOcclusion()));

    public static final RegistryObject<Block> PUZZLE_PIECE_TABLE_BLUE = registerBlock("puzzle_piece_table_blue",
            () -> new PuzzlePieceTableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.BLUE).noOcclusion()));
    public static final RegistryObject<Block> PUZZLE_PIECE_TABLE_PASTEL_BLUE = registerBlock("puzzle_piece_table_pastel_blue",
            () -> new PuzzlePieceTableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.LIGHT_BLUE).noOcclusion()));
    public static final RegistryObject<Block> PUZZLE_PIECE_TABLE_PASTEL_PINK = registerBlock("puzzle_piece_table_pastel_pink",
            () -> new PuzzlePieceTableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.PINK).noOcclusion()));
    public static final RegistryObject<Block> PUZZLE_PIECE_TABLE_PASTEL_PURPLE = registerBlock("puzzle_piece_table_pastel_purple",
            () -> new PuzzlePieceTableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.PURPLE).noOcclusion()));
    public static final RegistryObject<Block> PUZZLE_PIECE_TABLE_PASTEL_YELLOW = registerBlock("puzzle_piece_table_pastel_yellow",
            () -> new PuzzlePieceTableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.YELLOW).noOcclusion()));
    public static final RegistryObject<Block> PUZZLE_PIECE_TABLE_RED = registerBlock("puzzle_piece_table_red",
            () -> new PuzzlePieceTableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.RED).noOcclusion()));
    public static final RegistryObject<Block> PUZZLE_PIECE_TABLE_YELLOW = registerBlock("puzzle_piece_table_yellow",
            () -> new PuzzlePieceTableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.YELLOW).noOcclusion()));
    public static final RegistryObject<Block> PUZZLE_PIECE_TABLE_GREEN = registerBlock("puzzle_piece_table_green",
            () -> new PuzzlePieceTableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.GREEN).noOcclusion()));


    //ROTATIONAL FACE BLOCKS
    public static final RegistryObject<Block> ANTIQUE_MAP = registerBlock("antique_map",
            () -> new FlatDirectionalBlock(BlockBehaviour.Properties.copy(Blocks.SPORE_BLOSSOM).mapColor(DyeColor.BROWN)));
    public static final RegistryObject<Block> CAULDRON_POSTER = registerBlock("cauldron_poster",
            () -> new FlatDirectionalBlock(BlockBehaviour.Properties.copy(Blocks.SPORE_BLOSSOM).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> MOON_DECORATION = registerBlock("moon_decoration",
            () -> new FlatDirectionalBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).lightLevel(p -> 10).sound(SoundType.SMALL_AMETHYST_BUD).mapColor(DyeColor.YELLOW).noOcclusion().noCollission()));
    public static final RegistryObject<Block> CAGED_BULB = registerBlock("caged_bulb",
            () -> new CagedBulbBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).mapColor(DyeColor.BLACK)));
    public static final RegistryObject<Block> POLAROIDS_A = registerBlock("polaroids_a",
            () -> new FlatDirectionalBlock(BlockBehaviour.Properties.copy(Blocks.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> POLAROIDS_B = registerBlock("polaroids_b",
            () -> new FlatDirectionalBlock(BlockBehaviour.Properties.copy(Blocks.SPORE_BLOSSOM)));
    public static final RegistryObject<Block> POLAROIDS_C = registerBlock("polaroids_c",
            () -> new FlatDirectionalBlock(BlockBehaviour.Properties.copy(Blocks.SPORE_BLOSSOM)));

    public static final RegistryObject<Block> MINI_FLAG_BI = registerBlock("mini_flag_bi",
            () -> new MiniFlagBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL).noCollission()));
    public static final RegistryObject<Block> MINI_FLAG_LESBIAN = registerBlock("mini_flag_lesbian",
            () -> new MiniFlagBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL).noCollission()));
    public static final RegistryObject<Block> MINI_FLAG_TRANS = registerBlock("mini_flag_trans",
            () -> new MiniFlagBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL).noCollission()));
    public static final RegistryObject<Block> MINI_FLAG_NONBINARY = registerBlock("mini_flag_nonbinary",
            () -> new MiniFlagBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL).noCollission()));
    public static final RegistryObject<Block> MINI_FLAG_PAN = registerBlock("mini_flag_pan",
            () -> new MiniFlagBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL).noCollission()));
    public static final RegistryObject<Block> MINI_FLAG_RAINBOW = registerBlock("mini_flag_rainbow",
            () -> new MiniFlagBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).noCollission()));
    public static final RegistryObject<Block> MINI_FLAG_ACE = registerBlock("mini_flag_ace",
            () -> new MiniFlagBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).noCollission()));

    //TODO
    public static final RegistryObject<Block> ANIMATED_FLAG_ASEXUAL = registerBlock("animated_flag_asexual",
            () -> new FlatDirectionalBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).noCollission()));
    public static final RegistryObject<Block> ANIMATED_FLAG_BISEXUAL = registerBlock("animated_flag_bisexual",
            () -> new FlatDirectionalBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).noCollission()));
    public static final RegistryObject<Block> ANIMATED_FLAG_PANSEXUAL = registerBlock("animated_flag_pansexual",
            () -> new FlatDirectionalBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).noCollission()));
    public static final RegistryObject<Block> ANIMATED_FLAG_LESBIAN = registerBlock("animated_flag_lesbian",
            () -> new FlatDirectionalBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).noCollission()));
    public static final RegistryObject<Block> ANIMATED_FLAG_TRANSGENDER = registerBlock("animated_flag_transgender",
            () -> new FlatDirectionalBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).noCollission()));
    public static final RegistryObject<Block> ANIMATED_FLAG_NONBINARY = registerBlock("animated_flag_nonbinary",
            () -> new FlatDirectionalBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).noCollission()));
    public static final RegistryObject<Block> ANIMATED_FLAG_RAINBOW = registerBlock("animated_flag_rainbow",
            () -> new FlatDirectionalBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).noCollission()));


    //LAMPS
    public static final RegistryObject<Block> BEE_LAMP = registerBlock("bee_lamp",
            () -> new SmallLampBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.GLASS).mapColor(DyeColor.YELLOW)));
    public static final RegistryObject<Block> BEE_LAMP_ANGRY = registerBlock("bee_lamp_angry",
            () -> new SmallLampBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.GLASS).mapColor(DyeColor.YELLOW)));
    public static final RegistryObject<Block> STAINED_GLASS_LAMP = registerBlock("stained_glass_lamp",
            () -> new StainedGlassLampBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.GLASS).mapColor(DyeColor.YELLOW)));
    public static final RegistryObject<Block> COLOSSEO_WALL_LANTERN = registerBlock("colosseo_wall_lantern",
            () -> new SmallLampBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).mapColor(DyeColor.GREEN)));

    //TERRARIUMS
    public static final RegistryObject<Block> GLOWSHROOM_TERRARIUM_YELLOW = registerBlock("glowshroom_terrarium_yellow",
            () -> new MushroomTerrariumBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.GLASS).mapColor(DyeColor.YELLOW), true));
    public static final RegistryObject<Block> GLOWSHROOM_TERRARIUM_GREEN = registerBlock("glowshroom_terrarium_green",
            () -> new MushroomTerrariumBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.GLASS).mapColor(DyeColor.GREEN), true));
    public static final RegistryObject<Block> GLOWSHROOM_TERRARIUM_BLUE = registerBlock("glowshroom_terrarium_blue",
            () -> new MushroomTerrariumBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.GLASS).mapColor(DyeColor.BLUE), true));
    public static final RegistryObject<Block> GLOWSHROOM_TERRARIUM_PURPLE = registerBlock("glowshroom_terrarium_purple",
            () -> new MushroomTerrariumBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.GLASS).mapColor(DyeColor.PURPLE), true));
    public static final RegistryObject<Block> GLOWSHROOM_TERRARIUM_PINK = registerBlock("glowshroom_terrarium_pink",
            () -> new MushroomTerrariumBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.GLASS).mapColor(DyeColor.PINK), true));
    public static final RegistryObject<Block> MUSHROOM_TERRARIUM_RED = registerBlock("mushroom_terrarium_red",
            () -> new MushroomTerrariumBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.GLASS).mapColor(DyeColor.RED), false));
    public static final RegistryObject<Block> MUSHROOM_TERRARIUM_BROWN = registerBlock("mushroom_terrarium_brown",
            () -> new MushroomTerrariumBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.GLASS).mapColor(DyeColor.BROWN), false));


    //RECORD PLAYERS
    public static final RegistryObject<Block> RECORD_PLAYER_BLUE = registerBlock("record_player_blue",
            () -> new CustomJukeboxBlock(BlockBehaviour.Properties.copy(Blocks.JUKEBOX).mapColor(DyeColor.BLUE)));
    public static final RegistryObject<Block> RECORD_PLAYER_BROWN = registerBlock("record_player_brown",
            () -> new CustomJukeboxBlock(BlockBehaviour.Properties.copy(Blocks.JUKEBOX).mapColor(DyeColor.BROWN)));
    public static final RegistryObject<Block> RECORD_PLAYER_PINK = registerBlock("record_player_pink",
            () -> new CustomJukeboxBlock(BlockBehaviour.Properties.copy(Blocks.JUKEBOX).mapColor(DyeColor.PINK)));
    public static final RegistryObject<Block> RECORD_PLAYER_PURPLE = registerBlock("record_player_purple",
            () -> new CustomJukeboxBlock(BlockBehaviour.Properties.copy(Blocks.JUKEBOX).mapColor(DyeColor.PURPLE)));
    public static final RegistryObject<Block> RECORD_PLAYER_RED = registerBlock("record_player_red",
            () -> new CustomJukeboxBlock(BlockBehaviour.Properties.copy(Blocks.JUKEBOX).mapColor(DyeColor.RED)));
    public static final RegistryObject<Block> RECORD_PLAYER_WHITE = registerBlock("record_player_white",
            () -> new CustomJukeboxBlock(BlockBehaviour.Properties.copy(Blocks.JUKEBOX).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> RECORD_PLAYER_YELLOW = registerBlock("record_player_yellow",
            () -> new CustomJukeboxBlock(BlockBehaviour.Properties.copy(Blocks.JUKEBOX).mapColor(DyeColor.YELLOW)));

    //CAKES
    public static final RegistryObject<Block> HEART_CAKE = registerBlock("heart_cake",
            () -> new HeartCakeBlock(BlockBehaviour.Properties.copy(Blocks.CAKE).mapColor(DyeColor.RED)));
    public static final RegistryObject<Block> BERRY_CAKE = registerBlock("berry_cake",
            () -> new BerryCakeBlock(BlockBehaviour.Properties.copy(Blocks.CAKE).mapColor(DyeColor.RED)));

    //SMALL CHAIRS
    public static final RegistryObject<Block> APPLE_CHAIR = registerBlock("apple_chair",
            () -> new AppleChairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.RED).noOcclusion()));
    public static final RegistryObject<Block> BUTTON_STOOL = registerBlock("button_stool",
            () -> new ButtonStoolBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.BROWN).noOcclusion()));
    public static final RegistryObject<Block> ROVER_STOOL = registerBlock("rover_stool",
            () -> new RoverStoolBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.RED).noOcclusion()));
    public static final RegistryObject<Block> COTTAGE_CHAIR = registerBlock("cottage_chair",
            () -> new CottageChairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.BROWN).noOcclusion()));
    public static final RegistryObject<Block> COTTAGE_CHAIR_CUSHIONED = registerBlock("cottage_chair_cushioned",
            () -> new CottageChairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.PINK).noOcclusion()));
    public static final RegistryObject<Block> COTTAGE_OTTOMAN = registerBlock("cottage_ottoman",
            () -> new CottageOttomanBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.PINK).noOcclusion()));
    public static final RegistryObject<Block> MADONNA_OTTOMAN = registerBlock("madonna_ottoman",
            () -> new MadonnaOttomanBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.BLUE).noOcclusion()));

    //GARLANDS
    public static final RegistryObject<Block> BLACK_CAT_GARLAND = registerBlock("garland_black_cat",
            () -> new GarlandBlock(BlockBehaviour.Properties.copy(Blocks.SPORE_BLOSSOM).mapColor(DyeColor.BLACK)));
    public static final RegistryObject<Block> BLOSSOM_GARLAND = registerBlock("garland_blossom",
            () -> new GarlandBlock(BlockBehaviour.Properties.copy(Blocks.SPORE_BLOSSOM).mapColor(DyeColor.BLACK)));
    public static final RegistryObject<Block> BUNNY_GARLAND = registerBlock("garland_bunny",
            () -> new GarlandBlock(BlockBehaviour.Properties.copy(Blocks.SPORE_BLOSSOM).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> POLAROID_A_GARLAND = registerBlock("garland_polaroid_a",
            () -> new GarlandBlock(BlockBehaviour.Properties.copy(Blocks.SPORE_BLOSSOM).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> POLAROID_B_GARLAND = registerBlock("garland_polaroid_b",
            () -> new GarlandBlock(BlockBehaviour.Properties.copy(Blocks.SPORE_BLOSSOM).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> SUNFLOWER_GARLAND = registerBlock("garland_sunflower",
            () -> new GarlandBlock(BlockBehaviour.Properties.copy(Blocks.SPORE_BLOSSOM).mapColor(DyeColor.YELLOW)));

    //KITCHEN SET SMALL
    public static final RegistryObject<Block> BLACK_CAT_COUNTER_DRAWERS= registerBlock("black_cat_counter_drawers",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL).noOcclusion()));
    public static final RegistryObject<Block> BLACK_CAT_COUNTER_LEFT_DOOR= registerBlock("black_cat_counter_left_door",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL).noOcclusion()));
    public static final RegistryObject<Block> BLACK_CAT_COUNTER_RIGHT_DOOR= registerBlock("black_cat_counter_right_door",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL).noOcclusion()));
    public static final RegistryObject<Block> SWEETHEART_COUNTER_DRAWERS= registerBlock("sweetheart_counter_drawers",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL).noOcclusion()));
    public static final RegistryObject<Block> SWEETHEART_COUNTER_LEFT_DOOR= registerBlock("sweetheart_counter_left_door",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL).noOcclusion()));
    public static final RegistryObject<Block> SWEETHEART_COUNTER_RIGHT_DOOR= registerBlock("sweetheart_counter_right_door",
            () -> new CustomHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL).noOcclusion()));

    //MULTIBLOCK FURNITURE
    //MISC NO FUNCTION
    public static final RegistryObject<Block> DESK_GREEN = registerBlock("desk_green",
            () -> new GreenDeskBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.WOOD).mapColor(DyeColor.GREEN).noOcclusion()));
    public static final RegistryObject<Block> DESK_BROWN = registerBlock("desk_brown",
            () -> new GreenDeskBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.WOOD).mapColor(DyeColor.BROWN).noOcclusion()));
    public static final RegistryObject<Block> DESK_GREEN_CLUTTERED = registerBlock("desk_green_cluttered",
            () -> new GreenDeskBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.WOOD).mapColor(DyeColor.BROWN).noOcclusion()));
    public static final RegistryObject<Block> DESK_BROWN_CLUTTERED = registerBlock("desk_brown_cluttered",
            () -> new GreenDeskBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.WOOD).mapColor(DyeColor.BROWN).noOcclusion()));

    public static final RegistryObject<Block> ANTIQUE_LIBRARY_BOOKS = registerBlock("antique_library_books",
            () -> new AntiqueLibraryBooksBlock(BlockBehaviour.Properties.copy(Blocks.HAY_BLOCK).sound(SoundType.SPORE_BLOSSOM).mapColor(DyeColor.RED).noOcclusion()));

    public static final RegistryObject<Block> GUMBALL_MACHINE_RED = registerBlock("gumball_machine_red",
            () -> new GumballMachineBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).mapColor(DyeColor.RED).noOcclusion()));
    public static final RegistryObject<Block> GUMBALL_MACHINE_BLUE = registerBlock("gumball_machine_blue",
            () -> new GumballMachineBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).mapColor(DyeColor.BLUE)));
    public static final RegistryObject<Block> GUMBALL_MACHINE_PURPLE = registerBlock("gumball_machine_purple",
            () -> new GumballMachineBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).mapColor(DyeColor.PURPLE)));
    public static final RegistryObject<Block> BULLETIN_BOARD = registerBlock("bulletin_board",
            () -> new BullitenBoardBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.BROWN).noOcclusion()));
    public static final RegistryObject<Block> BULLETIN_BOARD_CLUTTERED = registerBlock("bulletin_board_cluttered",
            () -> new BullitenBoardBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.BROWN).noOcclusion()));

    //CABINETS AND SHELVES
    public static final RegistryObject<Block> CARD_INDEX = registerBlock("card_index",
            () -> new TwoByTwoFullSizeBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF).mapColor(DyeColor.GREEN).noOcclusion()));
    public static final RegistryObject<Block> BAMBOO_BOOKSHELF = registerBlock("bamboo_bookshelf",
            () -> new TwoByTwoFullSizeBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF).mapColor(DyeColor.GREEN).noOcclusion()));
    public static final RegistryObject<Block> FWISH_BOOKCASE = registerBlock("fwish_bookcase",
            () -> new FwishBookcaseBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF).mapColor(DyeColor.BLUE).noOcclusion()));

    //TODO
    public static final RegistryObject<Block> CUPID_BENCH = registerBlock("cupid_bench",
            () -> new LovelyLoveSeatBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL).noOcclusion()));

    public static final RegistryObject<Block> BLACK_CAT_SINK = registerBlock("black_cat_sink",
            () -> new TableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.BROWN).noOcclusion()));
    public static final RegistryObject<Block> BLACK_CAT_TABLE = registerBlock("black_cat_table",
            () -> new TableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.BROWN).noOcclusion()));
    public static final RegistryObject<Block> SWEETHEART_SINK = registerBlock("sweetheart_sink",
            () -> new TableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.BROWN).noOcclusion()));
    public static final RegistryObject<Block> SWEETHEART_TABLE = registerBlock("sweetheart_table",
            () -> new TableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.BROWN).noOcclusion()));

    public static final RegistryObject<Block> TABLE_PLAIN = registerBlock("table",
            () -> new TableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.BROWN).noOcclusion()));
    public static final RegistryObject<Block> TABLE_TABLECLOTH = registerBlock("table_with_white_tablecloth",
            () -> new TableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.WHITE).noOcclusion()));

    public static final RegistryObject<Block> RETRO_CAFE_SHELF = registerBlock("retro_cafe_shelf",
            () -> new TwoByTwoFullSizeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.WOOD).mapColor(DyeColor.BROWN).noOcclusion()));
    public static final RegistryObject<Block> RETRO_CAFE_SHELF_WINDOW = registerBlock("retro_cafe_shelf_window",
            () -> new RetroCafeShelfWindowBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.GLASS).mapColor(DyeColor.PURPLE).noOcclusion()));


    //BIKES
    public static final RegistryObject<Block> BIKE_YELLOW = registerBlock("bicycle_yellow",
            () -> new BicycleBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).mapColor(DyeColor.YELLOW).noOcclusion()));
    public static final RegistryObject<Block> BIKE_BLUE = registerBlock("bicycle_blue",
            () -> new BicycleBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).mapColor(DyeColor.BLUE).noOcclusion()));
    public static final RegistryObject<Block> BIKE_PURPLE = registerBlock("bicycle_purple",
            () -> new BicycleBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).mapColor(DyeColor.PURPLE).noOcclusion()));
    public static final RegistryObject<Block> BIKE_PINK = registerBlock("bicycle_pink",
            () -> new BicycleBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).mapColor(DyeColor.PINK).noOcclusion()));
    public static final RegistryObject<Block> BIKE_YELLOW_FLOWERS = registerBlock("bicycle_with_flowers_yellow",
            () -> new BicycleBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).mapColor(DyeColor.YELLOW).noOcclusion()));
    public static final RegistryObject<Block> BIKE_BLUE_FLOWERS = registerBlock("bicycle_with_flowers_blue",
            () -> new BicycleBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).mapColor(DyeColor.BLUE).noOcclusion()));
    public static final RegistryObject<Block> BIKE_PURPLE_FLOWERS = registerBlock("bicycle_with_flowers_purple",
            () -> new BicycleBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).mapColor(DyeColor.PURPLE).noOcclusion()));
    public static final RegistryObject<Block> BIKE_PINK_FLOWERS = registerBlock("bicycle_with_flowers_pink",
            () -> new BicycleBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).mapColor(DyeColor.PINK).noOcclusion()));

    //LAMPS
    public static final RegistryObject<Block> ANTIQUE_STANDING_LAMP = registerBlock("antique_standing_lamp",
            () -> new SmallLampBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).mapColor(DyeColor.BROWN)));

    //CHAIRS
    public static final RegistryObject<Block> LOVELY_LOVE_SEAT = registerBlock("lovely_love_seat_basic",
            () -> new LovelyLoveSeatBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL).noOcclusion()));
    public static final RegistryObject<Block> LOVELY_LOVE_SEAT_BLACK = registerBlock("lovely_love_seat_black",
            () -> new LovelyLoveSeatBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL).noOcclusion()));

    //ARMCHAIRS
    public static final RegistryObject<Block> ARMCHAIR_BLACK = registerBlock("armchair_black",
            () -> new ArmchairBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL).noOcclusion()));
    public static final RegistryObject<Block> ARMCHAIR_BLACK_CAT = registerBlock("armchair_black_cat",
            () -> new ArmchairBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL).noOcclusion()));
    public static final RegistryObject<Block> ARMCHAIR_BLUE = registerBlock("armchair_blue",
            () -> new ArmchairBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL).noOcclusion()));
    public static final RegistryObject<Block> ARMCHAIR_BROWN = registerBlock("armchair_brown",
            () -> new ArmchairBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL).noOcclusion()));
    public static final RegistryObject<Block> ARMCHAIR_CYAN = registerBlock("armchair_cyan",
            () -> new ArmchairBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL).noOcclusion()));
    public static final RegistryObject<Block> ARMCHAIR_FLOWER = registerBlock("armchair_flower",
            () -> new ArmchairBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL).noOcclusion()));
    public static final RegistryObject<Block> ARMCHAIR_FUCHSIA = registerBlock("armchair_fuchsia",
            () -> new ArmchairBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL).noOcclusion()));
    public static final RegistryObject<Block> ARMCHAIR_GRAY = registerBlock("armchair_gray",
            () -> new ArmchairBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL).noOcclusion()));
    public static final RegistryObject<Block> ARMCHAIR_GREEN = registerBlock("armchair_green",
            () -> new ArmchairBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL).noOcclusion()));
    public static final RegistryObject<Block> ARMCHAIR_HEART = registerBlock("armchair_heart",
            () -> new ArmchairBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL).noOcclusion()));
    public static final RegistryObject<Block> ARMCHAIR_IVORY = registerBlock("armchair_ivory",
            () -> new ArmchairBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).noOcclusion()));
    public static final RegistryObject<Block> ARMCHAIR_LEMON = registerBlock("armchair_lemon",
            () -> new ArmchairBlock(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL).noOcclusion()));
    public static final RegistryObject<Block> ARMCHAIR_LIGHT_BLUE = registerBlock("armchair_light_blue",
            () -> new ArmchairBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL).noOcclusion()));
    public static final RegistryObject<Block> ARMCHAIR_LIGHT_GRAY = registerBlock("armchair_light_gray",
            () -> new ArmchairBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_WOOL).noOcclusion()));
    public static final RegistryObject<Block> ARMCHAIR_LIME = registerBlock("armchair_lime",
            () -> new ArmchairBlock(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL).noOcclusion()));
    public static final RegistryObject<Block> ARMCHAIR_MAGENTA = registerBlock("armchair_magenta",
            () -> new ArmchairBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL).noOcclusion()));
    public static final RegistryObject<Block> ARMCHAIR_ORANGE = registerBlock("armchair_orange",
            () -> new ArmchairBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL).noOcclusion()));
    public static final RegistryObject<Block> ARMCHAIR_PINK = registerBlock("armchair_pink",
            () -> new ArmchairBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL).noOcclusion()));
    public static final RegistryObject<Block> ARMCHAIR_PURPLE = registerBlock("armchair_purple",
            () -> new ArmchairBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL).noOcclusion()));
    public static final RegistryObject<Block> ARMCHAIR_RED = registerBlock("armchair_red",
            () -> new ArmchairBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).noOcclusion()));
    public static final RegistryObject<Block> ARMCHAIR_STARRY = registerBlock("armchair_starry",
            () -> new ArmchairBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL).noOcclusion()));
    public static final RegistryObject<Block> ARMCHAIR_STRAWBERRY = registerBlock("armchair_strawberry",
            () -> new ArmchairBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL).noOcclusion()));
    public static final RegistryObject<Block> ARMCHAIR_WATERMELON = registerBlock("armchair_watermelon",
            () -> new ArmchairBlock(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL).noOcclusion()));
    public static final RegistryObject<Block> ARMCHAIR_WHITE = registerBlock("armchair_white",
            () -> new ArmchairBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).noOcclusion()));
    public static final RegistryObject<Block> ARMCHAIR_YELLOW = registerBlock("armchair_yellow",
            () -> new ArmchairBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL).noOcclusion()));

    public static final RegistryObject<Block> COTTAGE_ARMCHAIR = registerBlock("cottage_armchair",
            () -> new CottageArmchairBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).noOcclusion()));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<T> registerFuelBlock(String name, Supplier<T> block, int burnTime) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerFuelBlockItem(name, toReturn, burnTime);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ItemRegistration.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    private static <T extends Block> RegistryObject<Item> registerFuelBlockItem(String name, RegistryObject<T> block, int burnTime) {
        return ItemRegistration.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()) {
            @Override
            public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
                return burnTime;
            }
        });
    }

    public static void register (IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
