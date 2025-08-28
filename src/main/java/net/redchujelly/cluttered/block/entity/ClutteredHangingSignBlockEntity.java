package net.redchujelly.cluttered.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.redchujelly.cluttered.setup.TileEntityRegistration;

public class ClutteredHangingSignBlockEntity extends SignBlockEntity {
    public ClutteredHangingSignBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(TileEntityRegistration.CLUTTERED_HANGING_SIGN_BE.get(), pPos, pBlockState);
    }

    @Override
    public BlockEntityType<?> getType() {
        return TileEntityRegistration.CLUTTERED_HANGING_SIGN_BE.get();
    }
}
