package net.redchujelly.cluttered.mixin;

import net.minecraft.world.level.block.state.properties.WoodType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(WoodType.class)
public interface WoodTypeInvoker {
    @Invoker("register")
    static WoodType cluttered_callRegister(WoodType woodType){
        throw new AssertionError();
    }
}
