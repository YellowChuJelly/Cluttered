package net.redchujelly.cluttered.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.ContainerOpenersCounter;
import net.minecraft.world.level.block.state.BlockState;
import net.redchujelly.cluttered.block.multiblock.FridgeBlock;

public class FridgeBlockEntity extends CustomStorageBlockEntity{
    private final ContainerOpenersCounter openersCounter;

    public FridgeBlockEntity(BlockEntityType<?> pType, BlockPos pPos, BlockState pBlockState, int rows) {
        super(pType, pPos, pBlockState, rows);
        this.openersCounter = new ContainerOpenersCounter() {
            @Override
            protected void onOpen(Level level, BlockPos blockPos, BlockState blockState) {
                level.playSound(null, pPos, SoundEvents.IRON_DOOR_OPEN, SoundSource.BLOCKS);
                FridgeBlock.setOpenAndClosed(level, pPos, pBlockState, true);
            }

            @Override
            protected void onClose(Level level, BlockPos blockPos, BlockState blockState) {
                level.playSound(null, pPos, SoundEvents.IRON_DOOR_CLOSE, SoundSource.BLOCKS);
                FridgeBlock.setOpenAndClosed(level, pPos, pBlockState, false);

            }

            @Override
            protected void openerCountChanged(Level level, BlockPos blockPos, BlockState blockState, int i, int i1) {

            }

            @Override
            protected boolean isOwnContainer(Player player) {
                return false;
            }
        };
    }

    @Override
    protected Component getDefaultName() {
        return Component.translatable("cluttered.fridge");
    }

    public void startOpen(Player pPlayer) {
        if (!this.remove && !pPlayer.isSpectator()) {
            this.openersCounter.incrementOpeners(pPlayer, this.getLevel(), this.getBlockPos(), this.getBlockState());
        }

    }

    public void stopOpen(Player pPlayer) {
        if (!this.remove && !pPlayer.isSpectator()) {
            this.openersCounter.decrementOpeners(pPlayer, this.getLevel(), this.getBlockPos(), this.getBlockState());
        }

    }

}
