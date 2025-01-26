package net.redchujelly.cluttered.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public class ChairEntity extends Entity {

    private final BlockPos CHAIR_POS;
    private final Level CHAIR_LEVEL;

    public ChairEntity(EntityType<?> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
        CHAIR_POS = new BlockPos(0, 0, 0);
        CHAIR_LEVEL = pLevel;
    }
    public ChairEntity(EntityType<?> pEntityType, Level pLevel, BlockPos pos) {
        super(pEntityType, pLevel);
        CHAIR_POS = pos;
        CHAIR_LEVEL = pLevel;
    }

    @Override
    protected void defineSynchedData() {
    }

    @Override
    protected void readAdditionalSaveData(CompoundTag compoundTag) {
    }

    @Override
    protected void addAdditionalSaveData(CompoundTag compoundTag) {
    }

    @Override
    protected void removePassenger(Entity pPassenger) {
        this.teleportTo(this.getX(), this.getY() + 0.5f, this.getZ());
        super.removePassenger(pPassenger);
        kill();
    }

    @Override
    public void kill() {
        BlockState chair = CHAIR_LEVEL.getBlockState(CHAIR_POS);
        if (chair.hasProperty(BlockStateProperties.OCCUPIED)) {
            this.teleportTo(this.getX(), this.getY() + 0.5f, this.getZ());
            CHAIR_LEVEL.setBlock(CHAIR_POS, chair.setValue(BlockStateProperties.OCCUPIED, false), 2);
        }
        super.kill();
    }

    @Override
    public void dismountTo(double pX, double pY, double pZ) {
        super.dismountTo(pX, pY, pZ);
    }

    @Override
    public boolean canBeCollidedWith() {
        return false;
    }

    @Override
    public boolean isInvisible() {
        return true;
    }

    @Override
    public boolean isNoGravity() {
        return true;
    }
}
