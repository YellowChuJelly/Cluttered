package net.redchujelly.cluttered.mixin;

import com.llamalad7.mixinextras.expression.Definition;
import com.llamalad7.mixinextras.expression.Expression;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.Block;
import net.redchujelly.cluttered.setup.TagRegistration;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(ServerPlayer.class)
public class ServerPlayerMixin {
	@Definition(id ="block",local = @Local(type = Block.class))
	@Definition(id = "BedBlock", type = BedBlock.class)
	@Expression("block instanceof BedBlock")
	@WrapOperation(method = "findRespawnAndUseSpawnBlock", at = @At("MIXINEXTRAS:EXPRESSION"))
	private static boolean notBedBlock(Object object, Operation<Boolean> original) {
		return original.call(object) || (object instanceof Block block && block.builtInRegistryHolder().is(TagRegistration.Blocks.BEDS));
	}
}
