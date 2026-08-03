package net.redchujelly.cluttered.mixin;

import com.llamalad7.mixinextras.expression.Definition;
import com.llamalad7.mixinextras.expression.Expression;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.Block;
import net.redchujelly.cluttered.blocks.multiblock.MultiblockBedBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

//HUGE thanks to Unilock as always!!!
@Mixin(Player.class)
public class PlayerMixin {
    @Definition(id = "BedBlock", type = BedBlock.class)
    @Expression("? instanceof BedBlock")
    @WrapOperation(method = "findRespawnPositionAndUseSpawnBlock", at = @At("MIXINEXTRAS:EXPRESSION"))
    private static boolean cluttered_notBedBlock(Object object, Operation<Boolean> original){
        return original.call(object) || (object instanceof Block block && block instanceof MultiblockBedBlock);
    }
}
