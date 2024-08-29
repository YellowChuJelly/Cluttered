package net.redchujelly.cluttered.setup;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.redchujelly.cluttered.Cluttered;
import net.redchujelly.cluttered.block.custom.*;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

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
                    BlockSetType.OAK, 30, true), 10);
    public static final RegistryObject<Block> POPLAR_PRESSURE_PLATE = registerFuelBlock("poplar_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).mapColor(DyeColor.YELLOW),
                    BlockSetType.OAK), 300);
    public static final RegistryObject<Block> POPLAR_BOOKSHELF = registerFuelBlock("poplar_bookshelf",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF).mapColor(DyeColor.YELLOW)), 300);
    public static final RegistryObject<Block> POPLAR_WINDOW = registerBlock("poplar_window",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).mapColor(DyeColor.YELLOW).noOcclusion()));
    public static final RegistryObject<Block>POPLAR_WINDOW_PANE = registerBlock("poplar_window_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS_PANE).mapColor(DyeColor.YELLOW).noOcclusion()));

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
                    BlockSetType.OAK, 30, true), 10);
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
                    BlockSetType.OAK, 30, true), 10);
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
                    BlockSetType.OAK, 30, true), 10);
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
                    BlockSetType.OAK, 30, true), 10);
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
                    BlockSetType.OAK, 30, true), 10);
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
    public static final RegistryObject<Block> BLUE_MUSHROOM_CAP = registerFuelBlock("blue_mushroom_cap",
            () -> new BouncyMushroomBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.BLUE).sound(SoundType.SHROOMLIGHT)), 300);
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
                    BlockSetType.OAK, 30, true), 10);
    public static final RegistryObject<Block> BLUE_MUSHROOM_PRESSURE_PLATE = registerFuelBlock("blue_mushroom_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).mapColor(DyeColor.BLUE).sound(SoundType.SHROOMLIGHT),
                    BlockSetType.OAK), 300);
    public static final RegistryObject<Block> BLUE_MUSHROOM_BOOKSHELF = registerFuelBlock("blue_mushroom_bookshelf",
            () -> new CustomWoodBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF).mapColor(DyeColor.BLUE).sound(SoundType.SHROOMLIGHT)), 300);
    public static final RegistryObject<Block> BLUE_MUSHROOM_WINDOW = registerBlock("blue_mushroom_window",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).mapColor(DyeColor.BLUE).noOcclusion()));
    public static final RegistryObject<Block> BLUE_MUSHROOM_WINDOW_PANE = registerBlock("blue_mushroom_window_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS_PANE).mapColor(DyeColor.BLUE).noOcclusion()));

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
                    BlockSetType.OAK, 30, true), 10);
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
