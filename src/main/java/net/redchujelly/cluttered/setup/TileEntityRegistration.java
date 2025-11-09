package net.redchujelly.cluttered.setup;

import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.redchujelly.cluttered.Cluttered;
import net.redchujelly.cluttered.block.entity.*;

import java.util.Arrays;
import java.util.function.Supplier;

public class TileEntityRegistration {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, Cluttered.MODID);

    /* In all honesty I don't know what this list is good for. The field it ultimately goes in apparently lists blocks that
    the block entity can be tied to? But I tried it without adding some and they worked fine so I dunno.
    I'm gonna keep adding them though. Also, maybe I did it in a sketchy way.*/

    static DeferredHolder<?, ?>[] oneRow = new DeferredHolder[]{
            BlockRegistration.KITCHEN_SET_BROWN_CABINET_MINI,
			BlockRegistration.KITCHEN_SET_BROWN_CABINET_OUTER_CORNER,
            BlockRegistration.KITCHEN_SET_PINK_CABINET_MINI,
			BlockRegistration.KITCHEN_SET_PINK_CABINET_OUTER_CORNER,
            BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_MINI,
			BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_OUTER_CORNER,
            BlockRegistration.KITCHEN_SET_PURPLE_CABINET_MINI,
			BlockRegistration.KITCHEN_SET_PURPLE_CABINET_OUTER_CORNER,
            BlockRegistration.KITCHEN_SET_WHITE_CABINET_MINI,
			BlockRegistration.KITCHEN_SET_WHITE_CABINET_OUTER_CORNER,
            BlockRegistration.KITCHEN_SET_YELLOW_CABINET_MINI,
			BlockRegistration.KITCHEN_SET_YELLOW_CABINET_OUTER_CORNER,

            BlockRegistration.ENDTABLE_AMETHYST,
            BlockRegistration.ENDTABLE_BUBBLEGUM,
            BlockRegistration.ENDTABLE_CHARCOAL,
            BlockRegistration.ENDTABLE_MEADOW,
            BlockRegistration.ENDTABLE_PERIWINKLE,
            BlockRegistration.ENDTABLE_WOOD,
            BlockRegistration.COTTAGE_SIDE_TABLE,
            BlockRegistration.NIGHTSTAND_GREEN,
    };

    static DeferredHolder<?, ?>[] twoRows = new DeferredHolder[]{
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

            BlockRegistration.COTTAGE_BOOKCASE,
            BlockRegistration.DESK_GREEN,
            BlockRegistration.DESK_GREEN_CLUTTERED,
            BlockRegistration.DESK_BROWN,
            BlockRegistration.DESK_BROWN_CLUTTERED,
            BlockRegistration.FILING_BOX,
    };

    static DeferredHolder<?, ?>[] threeRows = new DeferredHolder[]{
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

            BlockRegistration.BLACK_CAT_COUNTER_DRAWERS,
            BlockRegistration.BLACK_CAT_COUNTER_RIGHT_DOOR,
            BlockRegistration.BLACK_CAT_COUNTER_LEFT_DOOR,
            BlockRegistration.SWEETHEART_COUNTER_DRAWERS,
            BlockRegistration.SWEETHEART_COUNTER_RIGHT_DOOR,
            BlockRegistration.SWEETHEART_COUNTER_LEFT_DOOR,

            BlockRegistration.BRIEFCASE_BLANK,
            BlockRegistration.BRIEFCASE_ROVER,

            BlockRegistration.CHINA_CABINET,

            BlockRegistration.PASTEL_CABINET,
    };

    static DeferredHolder<?, ?>[] sixRows = new DeferredHolder[]{
            BlockRegistration.CARD_INDEX,
            BlockRegistration.GENERAL_STORE_CABINET,
            BlockRegistration.DARKWOOD_CABINET,
            BlockRegistration.RED_MUSHROOM_WARDROBE,
            BlockRegistration.BLUE_MUSHROOM_WARDROBE,
            BlockRegistration.PASTEL_WARDROBE,
            BlockRegistration.MERMAID_DRESSER,
    };

    static DeferredHolder<?, ?>[] fridges = new DeferredHolder[]{
            BlockRegistration.RETRO_FRIDGE_BLACK,
            BlockRegistration.RETRO_FRIDGE_BLUE,
            BlockRegistration.RETRO_FRIDGE_PINK,
            BlockRegistration.RETRO_FRIDGE_RED,
            BlockRegistration.RETRO_FRIDGE_PURPLE,
            BlockRegistration.RETRO_FRIDGE_YELLOW,
            BlockRegistration.RETRO_FRIDGE_TURQUOISE,
            BlockRegistration.RETRO_FRIDGE_WHITE,
    };

    static DeferredHolder<?, ?>[] cardboardBox = new DeferredHolder[]{
            BlockRegistration.CARDBOARD_BOX,
    };

    static DeferredHolder<?, ?>[] safe = new DeferredHolder[]{
            BlockRegistration.SAFE_NOVAKID,
    };


    //IntelliJ keeps telling me not to do it this way basically but...
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CustomStorageBlockEntity>> ONE_ROW_BE = registerWithStorage(
            () -> TileEntityRegistration.ONE_ROW_BE, 1,  oneRow, "one_row_be");
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CustomStorageBlockEntity>> TWO_ROWS_BE = registerWithStorage(
            () -> TileEntityRegistration.TWO_ROWS_BE, 2,  twoRows, "two_rows_be");
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CustomStorageBlockEntity>> THREE_ROWS_BE = registerWithStorage(
            () -> TileEntityRegistration.THREE_ROWS_BE, 3,  threeRows, "three_rows_be");

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CustomStorageBlockEntity>> SIX_ROWS_BE = registerWithStorage(
            () -> TileEntityRegistration.SIX_ROWS_BE, 6,  sixRows, "six_rows_be");

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CustomStorageBlockEntity>> SAFE_BE = registerWithStorageAndSounds(
            () -> TileEntityRegistration.SAFE_BE, 4,  safe, "safe_be", SoundEvents.IRON_TRAPDOOR_OPEN, SoundEvents.IRON_TRAPDOOR_CLOSE);
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<FridgeBlockEntity>> RETRO_FRIDGE_BE = registerFridge(
            () -> TileEntityRegistration.RETRO_FRIDGE_BE, 6,  fridges, "retro_fridge_be");
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CardboardBoxBlockEntity>> CARDBOARD_BOX_BE = registerCardboardBox(
            () -> TileEntityRegistration.CARDBOARD_BOX_BE, 2,  cardboardBox, "cardboard_box_be");

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ClutteredSignBlockEntity>> CLUTTERED_SIGN_BE = BLOCK_ENTITIES.register(
            "cluttered_sign", () -> BlockEntityType.Builder.of(ClutteredSignBlockEntity::new,
                            BlockRegistration.WILLOW_SIGN.get(),
                            BlockRegistration.WILLOW_WALL_SIGN.get(),
                            BlockRegistration.FLOWERING_WILLOW_SIGN.get(),
                            BlockRegistration.FLOWERING_WILLOW_WALL_SIGN.get(),
                            BlockRegistration.POPLAR_SIGN.get(),
                            BlockRegistration.POPLAR_WALL_SIGN.get(),
                            BlockRegistration.FLOWERING_POPLAR_SIGN.get(),
                            BlockRegistration.FLOWERING_POPLAR_WALL_SIGN.get(),
                            BlockRegistration.CRABAPPLE_SIGN.get(),
                            BlockRegistration.CRABAPPLE_WALL_SIGN.get(),
                            BlockRegistration.FLOWERING_CRABAPPLE_SIGN.get(),
                            BlockRegistration.FLOWERING_CRABAPPLE_WALL_SIGN.get(),
                            BlockRegistration.SYCAMORE_SIGN.get(),
                            BlockRegistration.SYCAMORE_WALL_SIGN.get(),
                            BlockRegistration.MAPLE_SIGN.get(),
                            BlockRegistration.MAPLE_WALL_SIGN.get(),
                            BlockRegistration.BLUE_MUSHROOM_SIGN.get(),
                            BlockRegistration.BLUE_MUSHROOM_WALL_SIGN.get(),
                            BlockRegistration.RED_MUSHROOM_SIGN.get(),
                            BlockRegistration.RED_MUSHROOM_WALL_SIGN.get()
                    ).build(null)
    );

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ClutteredHangingSignBlockEntity>> CLUTTERED_HANGING_SIGN_BE = BLOCK_ENTITIES.register(
            "cluttered_hanging_sign", () -> BlockEntityType.Builder.of(ClutteredHangingSignBlockEntity::new,
                            BlockRegistration.WILLOW_HANGING_SIGN.get(),
                            BlockRegistration.WILLOW_WALL_HANGING_SIGN.get(),
                            BlockRegistration.FLOWERING_WILLOW_HANGING_SIGN.get(),
                            BlockRegistration.FLOWERING_WILLOW_WALL_HANGING_SIGN.get(),
                            BlockRegistration.POPLAR_HANGING_SIGN.get(),
                            BlockRegistration.POPLAR_WALL_HANGING_SIGN.get(),
                            BlockRegistration.FLOWERING_POPLAR_HANGING_SIGN.get(),
                            BlockRegistration.FLOWERING_POPLAR_WALL_HANGING_SIGN.get(),
                            BlockRegistration.CRABAPPLE_HANGING_SIGN.get(),
                            BlockRegistration.CRABAPPLE_WALL_HANGING_SIGN.get(),
                            BlockRegistration.FLOWERING_CRABAPPLE_HANGING_SIGN.get(),
                            BlockRegistration.FLOWERING_CRABAPPLE_WALL_HANGING_SIGN.get(),
                            BlockRegistration.SYCAMORE_HANGING_SIGN.get(),
                            BlockRegistration.SYCAMORE_WALL_HANGING_SIGN.get(),
                            BlockRegistration.MAPLE_HANGING_SIGN.get(),
                            BlockRegistration.MAPLE_WALL_HANGING_SIGN.get(),
                            BlockRegistration.BLUE_MUSHROOM_HANGING_SIGN.get(),
                            BlockRegistration.BLUE_MUSHROOM_WALL_HANGING_SIGN.get(),
                            BlockRegistration.RED_MUSHROOM_HANGING_SIGN.get(),
                            BlockRegistration.RED_MUSHROOM_WALL_HANGING_SIGN.get()
                    ).build(null)
    );




    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }


    //Basically from the tanuki-decor code with some changes (i made it worse sorry)
    private static DeferredHolder<BlockEntityType<?>, BlockEntityType<CustomStorageBlockEntity>> registerWithStorage(Supplier<Supplier<BlockEntityType<CustomStorageBlockEntity>>> type, int rows, DeferredHolder<?, ?>[] block, String name){

        return BLOCK_ENTITIES.register(name, () -> BlockEntityType.Builder.of((blockPos, blockState) ->
                new CustomStorageBlockEntity(type.get().get(), blockPos, blockState, rows), Arrays.stream(block).map(DeferredHolder::get).toArray(Block[]::new))
                .build(null));
    }

    private static DeferredHolder<BlockEntityType<?>, BlockEntityType <CustomStorageBlockEntity>> registerWithStorageAndSounds(Supplier<Supplier<BlockEntityType<CustomStorageBlockEntity>>> type, int rows, DeferredHolder<?, ?>[] block, String name, SoundEvent openSound, SoundEvent closeSound){

        return BLOCK_ENTITIES.register(name, () -> BlockEntityType.Builder.of((blockPos, blockState) ->
                new CustomStorageBlockEntity(type.get().get(), blockPos, blockState, rows, openSound, closeSound), Arrays.stream(block).map(DeferredHolder::get).toArray(Block[]::new))
                .build(null));
    }

    private static DeferredHolder<BlockEntityType<?>, BlockEntityType <FridgeBlockEntity>> registerFridge(Supplier<Supplier<BlockEntityType<FridgeBlockEntity>>> type, int rows, DeferredHolder<?, ?>[] block, String name){

        return BLOCK_ENTITIES.register(name, () -> BlockEntityType.Builder.of((blockPos, blockState) ->
                new FridgeBlockEntity(type.get().get(), blockPos, blockState, rows), Arrays.stream(block).map(DeferredHolder::get).toArray(Block[]::new))
                .build(null));
    }

    private static DeferredHolder<BlockEntityType<?>, BlockEntityType <CardboardBoxBlockEntity>> registerCardboardBox(Supplier<Supplier<BlockEntityType<CardboardBoxBlockEntity>>> type, int rows, DeferredHolder<?, ?>[] block, String name){

        return BLOCK_ENTITIES.register(name, () -> BlockEntityType.Builder.of((blockPos, blockState) ->
                new CardboardBoxBlockEntity(type.get().get(), blockPos, blockState, rows), Arrays.stream(block).map(DeferredHolder::get).toArray(Block[]::new))
                .build(null));
    }

}
