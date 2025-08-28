package net.redchujelly.cluttered.util;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.redchujelly.cluttered.Cluttered;

public class ClutteredWoodTypes {
    public static final WoodType WILLOW = WoodType.register(new WoodType(Cluttered.MODID + ":willow", BlockSetType.OAK));
    public static final WoodType FLOWERING_WILLOW = WoodType.register(new WoodType(Cluttered.MODID + ":flowering_willow", BlockSetType.OAK));
    public static final WoodType POPLAR = WoodType.register(new WoodType(Cluttered.MODID + ":poplar", BlockSetType.OAK));
    public static final WoodType FLOWERING_POPLAR = WoodType.register(new WoodType(Cluttered.MODID + ":flowering_poplar", BlockSetType.OAK));
    public static final WoodType CRABAPPLE = WoodType.register(new WoodType(Cluttered.MODID + ":crabapple", BlockSetType.OAK));
    public static final WoodType FLOWERING_CRABAPPLE = WoodType.register(new WoodType(Cluttered.MODID + ":flowering_crabapple", BlockSetType.OAK));
    public static final WoodType SYCAMORE = WoodType.register(new WoodType(Cluttered.MODID + ":sycamore", BlockSetType.OAK));
    public static final WoodType MAPLE = WoodType.register(new WoodType(Cluttered.MODID + ":fluorescent_maple", BlockSetType.OAK));
    public static final WoodType RED_MUSHROOM = WoodType.register(new WoodType(Cluttered.MODID + ":red_mushroom", BlockSetType.CRIMSON));
    public static final WoodType BLUE_MUSHROOM = WoodType.register(new WoodType(Cluttered.MODID + ":blue_mushroom", BlockSetType.WARPED));
}
