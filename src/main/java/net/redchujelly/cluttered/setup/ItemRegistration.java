package net.redchujelly.cluttered.setup;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.redchujelly.cluttered.Cluttered;
import net.redchujelly.cluttered.item.HandDrillItem;
import org.jetbrains.annotations.Nullable;

public class ItemRegistration {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Cluttered.MODID);

    public static final RegistryObject<Item> HAND_DRILL = ITEMS.register("hand_drill",
            () -> new HandDrillItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> WILLOW_SIGN = registerSign("willow", BlockRegistration.WILLOW_SIGN, BlockRegistration.WILLOW_WALL_SIGN);
    public static final RegistryObject<Item> WILLOW_HANGING_SIGN = registerHangingSign("willow", BlockRegistration.WILLOW_HANGING_SIGN, BlockRegistration.WILLOW_WALL_HANGING_SIGN);
    public static final RegistryObject<Item> FLOWERING_WILLOW_SIGN = registerSign("flowering_willow", BlockRegistration.FLOWERING_WILLOW_SIGN, BlockRegistration.FLOWERING_WILLOW_WALL_SIGN);
    public static final RegistryObject<Item> FLOWERING_WILLOW_HANGING_SIGN = registerHangingSign("flowering_willow", BlockRegistration.FLOWERING_WILLOW_HANGING_SIGN, BlockRegistration.FLOWERING_WILLOW_WALL_HANGING_SIGN);
    public static final RegistryObject<Item> POPLAR_SIGN = registerSign("poplar", BlockRegistration.POPLAR_SIGN, BlockRegistration.POPLAR_WALL_SIGN);
    public static final RegistryObject<Item> POPLAR_HANGING_SIGN = registerHangingSign("poplar", BlockRegistration.POPLAR_HANGING_SIGN, BlockRegistration.POPLAR_WALL_HANGING_SIGN);
    public static final RegistryObject<Item> FLOWERING_POPLAR_SIGN = registerSign("flowering_poplar", BlockRegistration.FLOWERING_POPLAR_SIGN, BlockRegistration.FLOWERING_POPLAR_WALL_SIGN);
    public static final RegistryObject<Item> FLOWERING_POPLAR_HANGING_SIGN = registerHangingSign("flowering_poplar", BlockRegistration.FLOWERING_POPLAR_HANGING_SIGN, BlockRegistration.FLOWERING_POPLAR_WALL_HANGING_SIGN);
    public static final RegistryObject<Item> CRABAPPLE_SIGN = registerSign("crabapple", BlockRegistration.CRABAPPLE_SIGN, BlockRegistration.CRABAPPLE_WALL_SIGN);
    public static final RegistryObject<Item> CRABAPPLE_HANGING_SIGN = registerHangingSign("crabapple", BlockRegistration.CRABAPPLE_HANGING_SIGN, BlockRegistration.CRABAPPLE_WALL_HANGING_SIGN);
    public static final RegistryObject<Item> FLOWERING_CRABAPPLE_SIGN = registerSign("flowering_crabapple", BlockRegistration.FLOWERING_CRABAPPLE_SIGN, BlockRegistration.FLOWERING_CRABAPPLE_WALL_SIGN);
    public static final RegistryObject<Item> FLOWERING_CRABAPPLE_HANGING_SIGN = registerHangingSign("flowering_crabapple", BlockRegistration.FLOWERING_CRABAPPLE_HANGING_SIGN, BlockRegistration.FLOWERING_CRABAPPLE_WALL_HANGING_SIGN);
    public static final RegistryObject<Item> SYCAMORE_SIGN = registerSign("sycamore", BlockRegistration.SYCAMORE_SIGN, BlockRegistration.SYCAMORE_WALL_SIGN);
    public static final RegistryObject<Item> SYCAMORE_HANGING_SIGN = registerHangingSign("sycamore", BlockRegistration.SYCAMORE_HANGING_SIGN, BlockRegistration.SYCAMORE_WALL_HANGING_SIGN);
    public static final RegistryObject<Item> MAPLE_SIGN = registerSign("fluorescent_maple", BlockRegistration.MAPLE_SIGN, BlockRegistration.MAPLE_WALL_SIGN);
    public static final RegistryObject<Item> MAPLE_HANGING_SIGN = registerHangingSign("fluorescent_maple", BlockRegistration.MAPLE_HANGING_SIGN, BlockRegistration.MAPLE_WALL_HANGING_SIGN);
    public static final RegistryObject<Item> BLUE_MUSHROOM_SIGN = registerSign("blue_mushroom", BlockRegistration.BLUE_MUSHROOM_SIGN, BlockRegistration.BLUE_MUSHROOM_WALL_SIGN);
    public static final RegistryObject<Item> BLUE_MUSHROOM_HANGING_SIGN = registerHangingSign("blue_mushroom", BlockRegistration.BLUE_MUSHROOM_HANGING_SIGN, BlockRegistration.BLUE_MUSHROOM_WALL_HANGING_SIGN);
    public static final RegistryObject<Item> RED_MUSHROOM_SIGN = registerSign("red_mushroom", BlockRegistration.RED_MUSHROOM_SIGN, BlockRegistration.RED_MUSHROOM_WALL_SIGN);
    public static final RegistryObject<Item> RED_MUSHROOM_HANGING_SIGN = registerHangingSign("red_mushroom", BlockRegistration.RED_MUSHROOM_HANGING_SIGN, BlockRegistration.RED_MUSHROOM_WALL_HANGING_SIGN);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    private static <T extends Block> RegistryObject<Item> registerSign(String name, RegistryObject<T> floorSign, RegistryObject<T> wallSign) {
        return ITEMS.register(name + "_sign",
                () -> new SignItem(new Item.Properties().stacksTo(16), floorSign.get(), wallSign.get()){
                    @Override
                    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
                        return 200;
                    }
                });
    }

    private static <T extends Block> RegistryObject<Item> registerHangingSign(String name, RegistryObject<T> floorSign, RegistryObject<T> wallSign) {
        return ITEMS.register(name + "_hanging_sign",
                () -> new HangingSignItem(floorSign.get(), wallSign.get(), new Item.Properties().stacksTo(16)){
                    @Override
                    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
                        return 200;
                    }
                });
    }
    
}