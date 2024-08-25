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
import net.redchujelly.cluttered.block.custom.CustomLogLikeBlock;
import net.redchujelly.cluttered.block.custom.CustomWoodBlock;
import net.redchujelly.cluttered.block.custom.CustomWoodFenceBlock;
import net.redchujelly.cluttered.block.custom.CustomWoodSlabBlock;
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
            () -> new StairBlock(() -> BlockRegistration.WILLOW_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).mapColor(DyeColor.PURPLE)), 300);
    public static final RegistryObject<Block> WILLOW_FENCE = registerFuelBlock("willow_fence",
            () -> new CustomWoodFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).mapColor(DyeColor.PURPLE)), 300);
    public static final RegistryObject<Block> WILLOW_FENCE_GATE = registerFuelBlock("willow_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE).mapColor(DyeColor.PURPLE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE), 300);
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
            () -> new StairBlock(() -> BlockRegistration.FLOWERING_WILLOW_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).mapColor(DyeColor.PURPLE)), 300);
    public static final RegistryObject<Block> FLOWERING_WILLOW_FENCE = registerFuelBlock("flowering_willow_fence",
            () -> new CustomWoodFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).mapColor(DyeColor.PURPLE)), 300);
    public static final RegistryObject<Block> FLOWERING_WILLOW_FENCE_GATE = registerFuelBlock("flowering_willow_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE).mapColor(DyeColor.PURPLE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE), 300);
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
            () -> new StairBlock(() -> BlockRegistration.POPLAR_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).mapColor(DyeColor.YELLOW)), 300);
    public static final RegistryObject<Block> POPLAR_FENCE = registerFuelBlock("poplar_fence",
            () -> new CustomWoodFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).mapColor(DyeColor.YELLOW)), 300);
    public static final RegistryObject<Block> POPLAR_FENCE_GATE = registerFuelBlock("poplar_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE).mapColor(DyeColor.YELLOW), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE), 300);
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
