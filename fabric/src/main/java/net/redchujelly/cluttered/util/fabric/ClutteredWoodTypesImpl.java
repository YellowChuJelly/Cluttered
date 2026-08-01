package net.redchujelly.cluttered.util.fabric;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.redchujelly.cluttered.Cluttered;
import net.redchujelly.cluttered.mixin.WoodTypeInvoker;

public class ClutteredWoodTypesImpl {
    public static WoodType register(String id, BlockSetType type){
        return WoodTypeInvoker.cluttered_callRegister(new WoodType(Cluttered.MOD_ID + ":" + id, type));
    }
}
