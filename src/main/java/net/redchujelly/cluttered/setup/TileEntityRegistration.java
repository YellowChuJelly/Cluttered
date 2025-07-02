package net.redchujelly.cluttered.setup;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.redchujelly.cluttered.Cluttered;
import net.redchujelly.cluttered.block.entity.CardboardBoxBlockEntity;
import net.redchujelly.cluttered.block.entity.CustomStorageBlockEntity;
import net.redchujelly.cluttered.block.entity.FridgeBlockEntity;

import java.util.Arrays;
import java.util.function.Supplier;

public class TileEntityRegistration {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Cluttered.MODID);

    /* In all honesty I don't know what this list is good for. The field it ultimately goes in apparently lists blocks that
    the block entity can be tied to? But I tried it without adding some and they worked fine so I dunno.
    I'm gonna keep adding them though. */

    static RegistryObject<?>[] twoRows = new RegistryObject[]{
            BlockRegistration.KITCHEN_SET_BROWN_CABINET,
            BlockRegistration.KITCHEN_SET_BROWN_CABINET_INNER_CORNER,
            BlockRegistration.KITCHEN_SET_BROWN_CABINET_OPEN,
            BlockRegistration.KITCHEN_SET_BROWN_CABINET_GLASS,
            BlockRegistration.KITCHEN_SET_PINK_CABINET,
            BlockRegistration.KITCHEN_SET_PINK_CABINET_INNER_CORNER,
            BlockRegistration.KITCHEN_SET_PINK_CABINET_OPEN,
            BlockRegistration.KITCHEN_SET_PINK_CABINET_GLASS,
            BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET,
            BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_INNER_CORNER,
            BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_OPEN,
            BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_GLASS,
            BlockRegistration.KITCHEN_SET_PURPLE_CABINET,
            BlockRegistration.KITCHEN_SET_PURPLE_CABINET_INNER_CORNER,
            BlockRegistration.KITCHEN_SET_PURPLE_CABINET_OPEN,
            BlockRegistration.KITCHEN_SET_PURPLE_CABINET_GLASS,
            BlockRegistration.KITCHEN_SET_WHITE_CABINET,
            BlockRegistration.KITCHEN_SET_WHITE_CABINET_INNER_CORNER,
            BlockRegistration.KITCHEN_SET_WHITE_CABINET_OPEN,
            BlockRegistration.KITCHEN_SET_WHITE_CABINET_GLASS,
            BlockRegistration.KITCHEN_SET_YELLOW_CABINET,
            BlockRegistration.KITCHEN_SET_YELLOW_CABINET_INNER_CORNER,
            BlockRegistration.KITCHEN_SET_YELLOW_CABINET_OPEN,
            BlockRegistration.KITCHEN_SET_YELLOW_CABINET_GLASS,
    };
    static RegistryObject<?>[] oneRow = new RegistryObject[]{
            BlockRegistration.KITCHEN_SET_BROWN_CABINET_MINI,
            BlockRegistration.KITCHEN_SET_PINK_CABINET_MINI,
            BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_MINI,
            BlockRegistration.KITCHEN_SET_PURPLE_CABINET_MINI,
            BlockRegistration.KITCHEN_SET_WHITE_CABINET_MINI,
            BlockRegistration.KITCHEN_SET_YELLOW_CABINET_MINI,

            BlockRegistration.ENDTABLE_AMETHYST,
            BlockRegistration.ENDTABLE_BUBBLEGUM,
            BlockRegistration.ENDTABLE_CHARCOAL,
            BlockRegistration.ENDTABLE_MEADOW,
            BlockRegistration.ENDTABLE_PERIWINKLE,
            BlockRegistration.ENDTABLE_WOOD,
            BlockRegistration.COTTAGE_SIDE_TABLE,
            BlockRegistration.NIGHTSTAND_GREEN,


    };

    static RegistryObject<?>[] fourRows = new RegistryObject[]{
            BlockRegistration.SAFE_NOVAKID
    };

    static RegistryObject<?>[] threeRows = new RegistryObject[]{
            BlockRegistration.KITCHEN_SET_BROWN_COUNTER,
            BlockRegistration.KITCHEN_SET_BROWN_COUNTER_OUTER_CORNER_LEFT,
            BlockRegistration.KITCHEN_SET_BROWN_COUNTER_OUTER_CORNER_RIGHT,
            BlockRegistration.KITCHEN_SET_PINK_COUNTER,
            BlockRegistration.KITCHEN_SET_PINK_COUNTER_OUTER_CORNER_LEFT,
            BlockRegistration.KITCHEN_SET_PINK_COUNTER_OUTER_CORNER_RIGHT,
            BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER,
            BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_OUTER_CORNER_LEFT,
            BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_OUTER_CORNER_RIGHT,
            BlockRegistration.KITCHEN_SET_PURPLE_COUNTER,
            BlockRegistration.KITCHEN_SET_PURPLE_COUNTER_OUTER_CORNER_LEFT,
            BlockRegistration.KITCHEN_SET_PURPLE_COUNTER_OUTER_CORNER_RIGHT,
            BlockRegistration.KITCHEN_SET_WHITE_COUNTER,
            BlockRegistration.KITCHEN_SET_WHITE_COUNTER_OUTER_CORNER_LEFT,
            BlockRegistration.KITCHEN_SET_WHITE_COUNTER_OUTER_CORNER_RIGHT,
            BlockRegistration.KITCHEN_SET_YELLOW_COUNTER,
            BlockRegistration.KITCHEN_SET_YELLOW_COUNTER_OUTER_CORNER_LEFT,
            BlockRegistration.KITCHEN_SET_YELLOW_COUNTER_OUTER_CORNER_RIGHT,

            BlockRegistration.BRIEFCASE_BLANK,
            BlockRegistration.BRIEFCASE_ROVER,
    };

    static RegistryObject<?>[] fridges = new RegistryObject[]{
            BlockRegistration.RETRO_FRIDGE_BLACK,
            BlockRegistration.RETRO_FRIDGE_BLUE,
            BlockRegistration.RETRO_FRIDGE_PINK,
            BlockRegistration.RETRO_FRIDGE_RED,
            BlockRegistration.RETRO_FRIDGE_PURPLE,
            BlockRegistration.RETRO_FRIDGE_YELLOW,
            BlockRegistration.RETRO_FRIDGE_TURQUOISE,
            BlockRegistration.RETRO_FRIDGE_WHITE,
    };

    static RegistryObject<?>[] cardboardBox = new RegistryObject[]{
            BlockRegistration.CARDBOARD_BOX_OPEN,
            BlockRegistration.CARDBOARD_BOX_CLOSED,
            BlockRegistration.CARDBOARD_BOX_CLUTTERED,
    };




    public static final RegistryObject<BlockEntityType<CustomStorageBlockEntity>> KITCHEN_SET_HALF_CABINET_BE = registerWithStorage(
            () -> TileEntityRegistration.KITCHEN_SET_HALF_CABINET_BE, 1,  (RegistryObject<Block>[]) oneRow, "kitchen_set_half_cabinet_be");
    public static final RegistryObject<BlockEntityType<CustomStorageBlockEntity>> KITCHEN_SET_CABINET_BE = registerWithStorage(
            () -> TileEntityRegistration.KITCHEN_SET_CABINET_BE, 2,  (RegistryObject<Block>[]) twoRows, "kitchen_set_cabinet_be");
    public static final RegistryObject<BlockEntityType<CustomStorageBlockEntity>> KITCHEN_SET_COUNTER_BE = registerWithStorage(
            () -> TileEntityRegistration.KITCHEN_SET_COUNTER_BE, 3,  (RegistryObject<Block>[]) threeRows, "kitchen_set_counter_be");
    public static final RegistryObject<BlockEntityType<CustomStorageBlockEntity>> FOUR_ROWS_BE = registerWithStorage(
            () -> TileEntityRegistration.FOUR_ROWS_BE, 4,  (RegistryObject<Block>[]) fourRows, "four_rows_be");

    public static final RegistryObject<BlockEntityType<FridgeBlockEntity>> RETRO_FRIDGE_BE = registerFridge(
            () -> TileEntityRegistration.RETRO_FRIDGE_BE, 6,  (RegistryObject<Block>[]) fridges, "retro_fridge_be");

    public static final RegistryObject<BlockEntityType<CardboardBoxBlockEntity>> CARDBOARD_BOX_BE = registerCardboardBox(
            () -> TileEntityRegistration.CARDBOARD_BOX_BE, 2,  (RegistryObject<Block>[]) cardboardBox, "cardboard_box_be");




    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }


    //Basically from the tanuki-decor code with some changes
    private static RegistryObject<BlockEntityType<CustomStorageBlockEntity>> registerWithStorage(Supplier<Supplier<BlockEntityType<CustomStorageBlockEntity>>> type, int rows, RegistryObject<Block>[] block, String name){

        return BLOCK_ENTITIES.register(name, () -> BlockEntityType.Builder.of((blockPos, blockState) ->
                new CustomStorageBlockEntity(type.get().get(), blockPos, blockState, rows), Arrays.stream(block).iterator().next().get())
                .build(null));
    }

    private static RegistryObject<BlockEntityType<FridgeBlockEntity>> registerFridge(Supplier<Supplier<BlockEntityType<FridgeBlockEntity>>> type, int rows, RegistryObject<Block>[] block, String name){

        return BLOCK_ENTITIES.register(name, () -> BlockEntityType.Builder.of((blockPos, blockState) ->
                new FridgeBlockEntity(type.get().get(), blockPos, blockState, rows), Arrays.stream(block).iterator().next().get())
                .build(null));
    }

    private static RegistryObject<BlockEntityType<CardboardBoxBlockEntity>> registerCardboardBox(Supplier<Supplier<BlockEntityType<CardboardBoxBlockEntity>>> type, int rows, RegistryObject<Block>[] block, String name){

        return BLOCK_ENTITIES.register(name, () -> BlockEntityType.Builder.of((blockPos, blockState) ->
                new CardboardBoxBlockEntity(type.get().get(), blockPos, blockState, rows), Arrays.stream(block).iterator().next().get())
                .build(null));
    }

}
