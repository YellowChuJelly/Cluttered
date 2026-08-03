package net.redchujelly.cluttered.blocks.entity;

import dev.architectury.injectables.annotations.ExpectPlatform;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.redchujelly.cluttered.Cluttered;
import net.redchujelly.cluttered.blocks.BlockRegistration;

import java.util.Arrays;
import java.util.function.Supplier;

public class BlockEntityRegistration {
//    static RegistrySupplier<?>[] oneRow = new RegistrySupplier[]{
//            BlockRegistration.KITCHEN_SET_BROWN_CABINET_MINI,
//            BlockRegistration.KITCHEN_SET_PINK_CABINET_MINI,
//            BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_MINI,
//            BlockRegistration.KITCHEN_SET_PURPLE_CABINET_MINI,
//            BlockRegistration.KITCHEN_SET_WHITE_CABINET_MINI,
//            BlockRegistration.KITCHEN_SET_YELLOW_CABINET_MINI,
//
//            BlockRegistration.ENDTABLE_AMETHYST,
//            BlockRegistration.ENDTABLE_BUBBLEGUM,
//            BlockRegistration.ENDTABLE_CHARCOAL,
//            BlockRegistration.ENDTABLE_MEADOW,
//            BlockRegistration.ENDTABLE_PERIWINKLE,
//            BlockRegistration.ENDTABLE_WOOD,
//            BlockRegistration.COTTAGE_SIDE_TABLE,
//            BlockRegistration.NIGHTSTAND_GREEN,
//    };
//
//    static RegistrySupplier<?>[] twoRows = new RegistrySupplier[]{
//            BlockRegistration.KITCHEN_SET_BROWN_CABINET,
//            BlockRegistration.KITCHEN_SET_BROWN_CABINET_INNER_CORNER,
//            BlockRegistration.KITCHEN_SET_BROWN_CABINET_OPEN,
//            BlockRegistration.KITCHEN_SET_BROWN_CABINET_GLASS,
//            BlockRegistration.KITCHEN_SET_PINK_CABINET,
//            BlockRegistration.KITCHEN_SET_PINK_CABINET_INNER_CORNER,
//            BlockRegistration.KITCHEN_SET_PINK_CABINET_OPEN,
//            BlockRegistration.KITCHEN_SET_PINK_CABINET_GLASS,
//            BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET,
//            BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_INNER_CORNER,
//            BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_OPEN,
//            BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_GLASS,
//            BlockRegistration.KITCHEN_SET_PURPLE_CABINET,
//            BlockRegistration.KITCHEN_SET_PURPLE_CABINET_INNER_CORNER,
//            BlockRegistration.KITCHEN_SET_PURPLE_CABINET_OPEN,
//            BlockRegistration.KITCHEN_SET_PURPLE_CABINET_GLASS,
//            BlockRegistration.KITCHEN_SET_WHITE_CABINET,
//            BlockRegistration.KITCHEN_SET_WHITE_CABINET_INNER_CORNER,
//            BlockRegistration.KITCHEN_SET_WHITE_CABINET_OPEN,
//            BlockRegistration.KITCHEN_SET_WHITE_CABINET_GLASS,
//            BlockRegistration.KITCHEN_SET_YELLOW_CABINET,
//            BlockRegistration.KITCHEN_SET_YELLOW_CABINET_INNER_CORNER,
//            BlockRegistration.KITCHEN_SET_YELLOW_CABINET_OPEN,
//            BlockRegistration.KITCHEN_SET_YELLOW_CABINET_GLASS,
//
//            BlockRegistration.COTTAGE_BOOKCASE,
//            BlockRegistration.DESK_GREEN,
//            BlockRegistration.DESK_GREEN_CLUTTERED,
//            BlockRegistration.DESK_BROWN,
//            BlockRegistration.DESK_BROWN_CLUTTERED,
//            BlockRegistration.FILING_BOX,
//    };
//
//    static RegistrySupplier<?>[] threeRows = new RegistrySupplier[]{
//            BlockRegistration.KITCHEN_SET_BROWN_COUNTER,
//            BlockRegistration.KITCHEN_SET_BROWN_COUNTER_OUTER_CORNER_LEFT,
//            BlockRegistration.KITCHEN_SET_BROWN_COUNTER_OUTER_CORNER_RIGHT,
//            BlockRegistration.KITCHEN_SET_PINK_COUNTER,
//            BlockRegistration.KITCHEN_SET_PINK_COUNTER_OUTER_CORNER_LEFT,
//            BlockRegistration.KITCHEN_SET_PINK_COUNTER_OUTER_CORNER_RIGHT,
//            BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER,
//            BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_OUTER_CORNER_LEFT,
//            BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_OUTER_CORNER_RIGHT,
//            BlockRegistration.KITCHEN_SET_PURPLE_COUNTER,
//            BlockRegistration.KITCHEN_SET_PURPLE_COUNTER_OUTER_CORNER_LEFT,
//            BlockRegistration.KITCHEN_SET_PURPLE_COUNTER_OUTER_CORNER_RIGHT,
//            BlockRegistration.KITCHEN_SET_WHITE_COUNTER,
//            BlockRegistration.KITCHEN_SET_WHITE_COUNTER_OUTER_CORNER_LEFT,
//            BlockRegistration.KITCHEN_SET_WHITE_COUNTER_OUTER_CORNER_RIGHT,
//            BlockRegistration.KITCHEN_SET_YELLOW_COUNTER,
//            BlockRegistration.KITCHEN_SET_YELLOW_COUNTER_OUTER_CORNER_LEFT,
//            BlockRegistration.KITCHEN_SET_YELLOW_COUNTER_OUTER_CORNER_RIGHT,
//
//            BlockRegistration.BLACK_CAT_COUNTER_DRAWERS,
//            BlockRegistration.BLACK_CAT_COUNTER_RIGHT_DOOR,
//            BlockRegistration.BLACK_CAT_COUNTER_LEFT_DOOR,
//            BlockRegistration.SWEETHEART_COUNTER_DRAWERS,
//            BlockRegistration.SWEETHEART_COUNTER_RIGHT_DOOR,
//            BlockRegistration.SWEETHEART_COUNTER_LEFT_DOOR,
//
//            BlockRegistration.BRIEFCASE_BLANK,
//            BlockRegistration.BRIEFCASE_ROVER,
//
//            BlockRegistration.CHINA_CABINET,
//
//            BlockRegistration.PASTEL_CABINET,
//    };
//
//    static RegistrySupplier<?>[] sixRows = new RegistrySupplier[]{
//            BlockRegistration.CARD_INDEX,
//            BlockRegistration.GENERAL_STORE_CABINET,
//            BlockRegistration.DARKWOOD_CABINET,
//            BlockRegistration.RED_MUSHROOM_WARDROBE,
//            BlockRegistration.BLUE_MUSHROOM_WARDROBE,
//            BlockRegistration.PASTEL_WARDROBE,
//            BlockRegistration.MERMAID_DRESSER,
//    };
//
//    static RegistrySupplier<?>[] fridges = new RegistrySupplier[]{
//            BlockRegistration.RETRO_FRIDGE_BLACK,
//            BlockRegistration.RETRO_FRIDGE_BLUE,
//            BlockRegistration.RETRO_FRIDGE_PINK,
//            BlockRegistration.RETRO_FRIDGE_RED,
//            BlockRegistration.RETRO_FRIDGE_PURPLE,
//            BlockRegistration.RETRO_FRIDGE_YELLOW,
//            BlockRegistration.RETRO_FRIDGE_TURQUOISE,
//            BlockRegistration.RETRO_FRIDGE_WHITE,
//    };
//
//    static RegistrySupplier<?>[] cardboardBox = new RegistrySupplier[]{
//            BlockRegistration.CARDBOARD_BOX,
//    };
//
//    static RegistrySupplier<?>[] safe = new RegistrySupplier[]{
//            BlockRegistration.SAFE_NOVAKID,
//    };
    protected static RegistrySupplier<?>[] oneRow = new RegistrySupplier[]{
            BlockRegistration.WILLOW_LEAVES
    };

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(Cluttered.MOD_ID, Registries.BLOCK_ENTITY_TYPE);


    public static final RegistrySupplier<BlockEntityType<CustomStorageBlockEntity>> ONE_ROW_BE = registerWithStorage(
        () -> BlockEntityRegistration.ONE_ROW_BE, 1,  (RegistrySupplier<Block>[]) oneRow, "one_row_be");
    public static final RegistrySupplier<BlockEntityType<CustomStorageBlockEntity>> TWO_ROWS_BE = registerWithStorage(
            () -> BlockEntityRegistration.TWO_ROWS_BE, 2,  (RegistrySupplier<Block>[]) oneRow, "two_rows_be");
    public static final RegistrySupplier<BlockEntityType<CustomStorageBlockEntity>> THREE_ROWS_BE = registerWithStorage(
            () -> BlockEntityRegistration.THREE_ROWS_BE, 3,  (RegistrySupplier<Block>[]) oneRow, "three_rows_be");

    public static final RegistrySupplier<BlockEntityType<CustomStorageBlockEntity>> SIX_ROWS_BE = registerWithStorage(
            () -> BlockEntityRegistration.SIX_ROWS_BE, 6,  (RegistrySupplier<Block>[]) oneRow, "six_rows_be");

    public static final RegistrySupplier<BlockEntityType<CustomStorageBlockEntity>> SAFE_BE = registerWithStorageAndSounds(
            () -> BlockEntityRegistration.SAFE_BE, 4,  (RegistrySupplier<Block>[]) oneRow, "safe_be", SoundEvents.IRON_TRAPDOOR_OPEN, SoundEvents.IRON_TRAPDOOR_CLOSE);
    public static final RegistrySupplier<BlockEntityType<FridgeBlockEntity>> RETRO_FRIDGE_BE = registerFridge(
            () -> BlockEntityRegistration.RETRO_FRIDGE_BE, 6,  (RegistrySupplier<Block>[]) oneRow, "retro_fridge_be");
    public static final RegistrySupplier<BlockEntityType<CardboardBoxBlockEntity>> CARDBOARD_BOX_BE = registerCardboardBox(
            () -> BlockEntityRegistration.CARDBOARD_BOX_BE, 2,  (RegistrySupplier<Block>[]) oneRow, "cardboard_box_be");

    public static final RegistrySupplier<BlockEntityType<ClutteredSignBlockEntity>> CLUTTERED_SIGN_BE = BLOCK_ENTITIES.register(
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

    public static final RegistrySupplier<BlockEntityType<ClutteredHangingSignBlockEntity>> CLUTTERED_HANGING_SIGN_BE = BLOCK_ENTITIES.register(
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

    //Basically from the tanuki-decor code with some changes (i made it worse sorry)
    @ExpectPlatform
    protected static RegistrySupplier<BlockEntityType<CustomStorageBlockEntity>> registerWithStorage(Supplier<Supplier<BlockEntityType<CustomStorageBlockEntity>>> type, int rows, RegistrySupplier<Block>[] block, String name){
        throw new AssertionError();
    }

    @ExpectPlatform
    protected static RegistrySupplier<BlockEntityType<CustomStorageBlockEntity>> registerWithStorageAndSounds(Supplier<Supplier<BlockEntityType<CustomStorageBlockEntity>>> type, int rows, RegistrySupplier<Block>[] block, String name, SoundEvent openSound, SoundEvent closeSound){
        throw new AssertionError();
    }

    @ExpectPlatform
    protected static RegistrySupplier<BlockEntityType<FridgeBlockEntity>> registerFridge(Supplier<Supplier<BlockEntityType<FridgeBlockEntity>>> type, int rows, RegistrySupplier<Block>[] block, String name){
        throw new AssertionError();
    }

    @ExpectPlatform
    protected static RegistrySupplier<BlockEntityType<CardboardBoxBlockEntity>> registerCardboardBox(Supplier<Supplier<BlockEntityType<CardboardBoxBlockEntity>>> type, int rows, RegistrySupplier<Block>[] block, String name){
        throw new AssertionError();
    }

    public static void init(){
        BLOCK_ENTITIES.register();
    }

}
