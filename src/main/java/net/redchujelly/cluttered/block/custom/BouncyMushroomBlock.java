package net.redchujelly.cluttered.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

public class BouncyMushroomBlock extends CustomWoodBlock {
    public BouncyMushroomBlock(Properties pProperties) {
        super(pProperties);
    }

    //copied from slime block class
    @Override
    public void fallOn(Level pLevel, BlockState pState, BlockPos pPos, Entity pEntity, float pFallDistance) {
        if (pEntity.isSuppressingBounce()) {
            super.fallOn(pLevel, pState, pPos, pEntity, pFallDistance);
        } else {
            pEntity.causeFallDamage(pFallDistance, 0.0F, pLevel.damageSources().fall());
        }
    }

    @Override
    public void updateEntityAfterFallOn(BlockGetter pLevel, Entity pEntity) {
        if (pEntity.isSuppressingBounce()) {
            super.updateEntityAfterFallOn(pLevel, pEntity);
        } else {
            this.bounceUp(pEntity);
        }
    }

    private void bounceUp(Entity pEntity) {
        Vec3 movement = pEntity.getDeltaMovement();
        if (movement.y < -0.0) {
            if (movement.y < -.35) {
                pEntity.playSound(SoundEvents.SHROOMLIGHT_PLACE, Math.min(2.0f,  (float)(movement.y * -1.0f)), Math.max(Math.min(2.0f,  (float)(movement.y * -1.3f)), 0.8f));
            }
            double $$2 = pEntity instanceof LivingEntity ? 1.0 : 0.8;
            pEntity.setDeltaMovement(movement.x, -movement.y * $$2, movement.z);
        }

    }
}
