package net.redchujelly.cluttered.mixin;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FireBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(FireBlock.class)
public interface ForgeFireBlockInvoker {
    @Invoker("setFlammable")
    void cluttered_invokeSetFlammable(Block block, int encouragement, int flammability);

}
