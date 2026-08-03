package net.redchujelly.cluttered.util;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ClutteredWoodTypes {
    public static final WoodType WILLOW = register("willow", BlockSetType.OAK);
    public static final WoodType FLOWERING_WILLOW = register("flowering_willow", BlockSetType.OAK);
    public static final WoodType POPLAR = register("poplar", BlockSetType.OAK);
    public static final WoodType FLOWERING_POPLAR = register("flowering_poplar", BlockSetType.OAK);
    public static final WoodType CRABAPPLE = register("crabapple", BlockSetType.OAK);
    public static final WoodType FLOWERING_CRABAPPLE = register("flowering_crabapple", BlockSetType.OAK);
    public static final WoodType SYCAMORE = register("sycamore", BlockSetType.OAK);
    public static final WoodType MAPLE = register("fluorescent_maple", BlockSetType.OAK);
    public static final WoodType RED_MUSHROOM = register("red_mushroom", BlockSetType.CRIMSON);
    public static final WoodType BLUE_MUSHROOM = register("blue_mushroom", BlockSetType.WARPED);

    @ExpectPlatform
    private static WoodType register(String id, BlockSetType type){
        throw new IllegalStateException();
    }
}
