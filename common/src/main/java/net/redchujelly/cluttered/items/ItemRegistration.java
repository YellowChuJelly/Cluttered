package net.redchujelly.cluttered.items;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.level.block.Block;
import net.redchujelly.cluttered.Cluttered;
import net.redchujelly.cluttered.blocks.BlockRegistration;
import net.redchujelly.cluttered.items.custom.HandDrillItem;

import java.util.HashMap;

public class ItemRegistration {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Cluttered.MOD_ID, Registries.ITEM);
    public static final HashMap<RegistrySupplier<Item>, Integer> FUEL_ITEMS = new HashMap<>();

    public static final RegistrySupplier<Item> HAND_DRILL = ITEMS.register("hand_drill",
            () -> new HandDrillItem(new Item.Properties().stacksTo(1)));

    public static final RegistrySupplier<Item> WILLOW_SIGN = registerSign("willow", BlockRegistration.WILLOW_SIGN, BlockRegistration.WILLOW_WALL_SIGN);
    public static final RegistrySupplier<Item> WILLOW_HANGING_SIGN = registerHangingSign("willow", BlockRegistration.WILLOW_HANGING_SIGN, BlockRegistration.WILLOW_WALL_HANGING_SIGN);
    public static final RegistrySupplier<Item> FLOWERING_WILLOW_SIGN = registerSign("flowering_willow", BlockRegistration.FLOWERING_WILLOW_SIGN, BlockRegistration.FLOWERING_WILLOW_WALL_SIGN);
    public static final RegistrySupplier<Item> FLOWERING_WILLOW_HANGING_SIGN = registerHangingSign("flowering_willow", BlockRegistration.FLOWERING_WILLOW_HANGING_SIGN, BlockRegistration.FLOWERING_WILLOW_WALL_HANGING_SIGN);
    public static final RegistrySupplier<Item> POPLAR_SIGN = registerSign("poplar", BlockRegistration.POPLAR_SIGN, BlockRegistration.POPLAR_WALL_SIGN);
    public static final RegistrySupplier<Item> POPLAR_HANGING_SIGN = registerHangingSign("poplar", BlockRegistration.POPLAR_HANGING_SIGN, BlockRegistration.POPLAR_WALL_HANGING_SIGN);
    public static final RegistrySupplier<Item> FLOWERING_POPLAR_SIGN = registerSign("flowering_poplar", BlockRegistration.FLOWERING_POPLAR_SIGN, BlockRegistration.FLOWERING_POPLAR_WALL_SIGN);
    public static final RegistrySupplier<Item> FLOWERING_POPLAR_HANGING_SIGN = registerHangingSign("flowering_poplar", BlockRegistration.FLOWERING_POPLAR_HANGING_SIGN, BlockRegistration.FLOWERING_POPLAR_WALL_HANGING_SIGN);
    public static final RegistrySupplier<Item> CRABAPPLE_SIGN = registerSign("crabapple", BlockRegistration.CRABAPPLE_SIGN, BlockRegistration.CRABAPPLE_WALL_SIGN);
    public static final RegistrySupplier<Item> CRABAPPLE_HANGING_SIGN = registerHangingSign("crabapple", BlockRegistration.CRABAPPLE_HANGING_SIGN, BlockRegistration.CRABAPPLE_WALL_HANGING_SIGN);
    public static final RegistrySupplier<Item> FLOWERING_CRABAPPLE_SIGN = registerSign("flowering_crabapple", BlockRegistration.FLOWERING_CRABAPPLE_SIGN, BlockRegistration.FLOWERING_CRABAPPLE_WALL_SIGN);
    public static final RegistrySupplier<Item> FLOWERING_CRABAPPLE_HANGING_SIGN = registerHangingSign("flowering_crabapple", BlockRegistration.FLOWERING_CRABAPPLE_HANGING_SIGN, BlockRegistration.FLOWERING_CRABAPPLE_WALL_HANGING_SIGN);
    public static final RegistrySupplier<Item> SYCAMORE_SIGN = registerSign("sycamore", BlockRegistration.SYCAMORE_SIGN, BlockRegistration.SYCAMORE_WALL_SIGN);
    public static final RegistrySupplier<Item> SYCAMORE_HANGING_SIGN = registerHangingSign("sycamore", BlockRegistration.SYCAMORE_HANGING_SIGN, BlockRegistration.SYCAMORE_WALL_HANGING_SIGN);
    public static final RegistrySupplier<Item> MAPLE_SIGN = registerSign("fluorescent_maple", BlockRegistration.MAPLE_SIGN, BlockRegistration.MAPLE_WALL_SIGN);
    public static final RegistrySupplier<Item> MAPLE_HANGING_SIGN = registerHangingSign("fluorescent_maple", BlockRegistration.MAPLE_HANGING_SIGN, BlockRegistration.MAPLE_WALL_HANGING_SIGN);
    public static final RegistrySupplier<Item> BLUE_MUSHROOM_SIGN = registerSign("blue_mushroom", BlockRegistration.BLUE_MUSHROOM_SIGN, BlockRegistration.BLUE_MUSHROOM_WALL_SIGN);
    public static final RegistrySupplier<Item> BLUE_MUSHROOM_HANGING_SIGN = registerHangingSign("blue_mushroom", BlockRegistration.BLUE_MUSHROOM_HANGING_SIGN, BlockRegistration.BLUE_MUSHROOM_WALL_HANGING_SIGN);
    public static final RegistrySupplier<Item> RED_MUSHROOM_SIGN = registerSign("red_mushroom", BlockRegistration.RED_MUSHROOM_SIGN, BlockRegistration.RED_MUSHROOM_WALL_SIGN);
    public static final RegistrySupplier<Item> RED_MUSHROOM_HANGING_SIGN = registerHangingSign("red_mushroom", BlockRegistration.RED_MUSHROOM_HANGING_SIGN, BlockRegistration.RED_MUSHROOM_WALL_HANGING_SIGN);


    private static <T extends Block> RegistrySupplier<Item> registerSign(String name, RegistrySupplier<T> floorSign, RegistrySupplier<T> wallSign) {
        RegistrySupplier<Item> toReturn = ITEMS.register(name + "_sign", () -> new SignItem(new Item.Properties().stacksTo(16), floorSign.get(), wallSign.get()));
        FUEL_ITEMS.put(toReturn, 200);
        return toReturn;
    }

    private static <T extends Block> RegistrySupplier<Item> registerHangingSign(String name, RegistrySupplier<T> floorSign, RegistrySupplier<T> wallSign) {
        RegistrySupplier<Item> toReturn = ITEMS.register(name + "_hanging_sign", () -> new HangingSignItem(floorSign.get(), wallSign.get(), new Item.Properties().stacksTo(16)));
        FUEL_ITEMS.put(toReturn, 200);
        return toReturn;
    }


    public static void init(){
        ITEMS.register();
    }

}
