package net.redchujelly.cluttered.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.ContainerOpenersCounter;
import net.minecraft.world.level.block.state.BlockState;
import net.redchujelly.cluttered.block.custom.furniture.storage.CardboardBoxBlock;


public class CardboardBoxBlockEntity extends CustomStorageBlockEntity{
    private final ContainerOpenersCounter openersCounter;

    public CardboardBoxBlockEntity(BlockEntityType<?> pType, BlockPos pPos, BlockState pBlockState, int rows) {
        super(pType, pPos, pBlockState, rows);
        this.openersCounter = new ContainerOpenersCounter() {
            @Override
            protected void onOpen(Level level, BlockPos blockPos, BlockState blockState) {
                level.playSound(null, pPos, SoundEvents.BAMBOO_HIT, SoundSource.BLOCKS);
            }

            @Override
            protected void onClose(Level level, BlockPos blockPos, BlockState blockState) {
                level.playSound(null, pPos, SoundEvents.BAMBOO_HIT, SoundSource.BLOCKS);
                CardboardBoxBlock.updateOpenState(pPos, level);
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

    public boolean containsItems(){
        NonNullList<ItemStack> items = this.getItems();
        for (ItemStack item : items){
            if (!item.getItem().equals(Items.AIR)){
                return true;
            }
        }
        return false;
    }


}
