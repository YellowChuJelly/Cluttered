package net.redchujelly.cluttered.mixin;

import com.llamalad7.mixinextras.expression.Definition;
import com.llamalad7.mixinextras.expression.Expression;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.Block;
import net.redchujelly.cluttered.blocks.multiblock.MultiblockBedBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

//HUGE thanks to Unilock as always!!!
@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {
    @Definition(id = "BedBlock", type = BedBlock.class)
    @Expression("? instanceof BedBlock")
    @WrapOperation(method = "method_18405", at = @At("MIXINEXTRAS:EXPRESSION"))
    private static boolean cluttered_notBedBlock(Object object, Operation<Boolean> original){
        return original.call(object) || (object instanceof Block block && block instanceof MultiblockBedBlock);
    }


    @Definition(id = "BedBlock", type = BedBlock.class)
    @Expression("? instanceof BedBlock")
    @WrapOperation(method = "startSleeping", at = @At("MIXINEXTRAS:EXPRESSION"))
    private static boolean cluttered_setBedOccupied(Object object, Operation<Boolean> original){
        return original.call(object) || (object instanceof Block block && block instanceof MultiblockBedBlock);
    }

    @Definition(id = "BedBlock", type = BedBlock.class)
    @Expression("? instanceof BedBlock")
    @WrapOperation(method = "method_18404", at = @At("MIXINEXTRAS:EXPRESSION"))
    private static boolean cluttered_setBedUnoccupied(Object object, Operation<Boolean> original){
        return original.call(object) || (object instanceof Block block && block instanceof MultiblockBedBlock);
    }


}
