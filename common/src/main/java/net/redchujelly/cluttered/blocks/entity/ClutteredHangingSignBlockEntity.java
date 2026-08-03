package net.redchujelly.cluttered.blocks.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class ClutteredHangingSignBlockEntity extends SignBlockEntity {
    public ClutteredHangingSignBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(BlockEntityRegistration.CLUTTERED_HANGING_SIGN_BE.get(), pPos, pBlockState);
    }

    @Override
    public BlockEntityType<?> getType() {
        return BlockEntityRegistration.CLUTTERED_HANGING_SIGN_BE.get();
    }
}
