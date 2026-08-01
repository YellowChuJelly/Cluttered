package net.redchujelly.cluttered.util.forge;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.redchujelly.cluttered.Cluttered;

public class ClutteredWoodTypesImpl {
    public static WoodType register(String id, BlockSetType type){
        return WoodType.register(new WoodType(Cluttered.MOD_ID + ":" + id, type));
    }
}
