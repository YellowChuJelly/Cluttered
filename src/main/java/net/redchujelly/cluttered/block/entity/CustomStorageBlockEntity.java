package net.redchujelly.cluttered.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class CustomStorageBlockEntity extends RandomizableContainerBlockEntity {
    private NonNullList<ItemStack> items;
    private final int size;

    public CustomStorageBlockEntity(BlockEntityType<?> pType, BlockPos pPos, BlockState pBlockState, int rows) {
        super(pType, pPos, pBlockState);
        this.size = rows * 9;
        this.items = NonNullList.withSize(size, ItemStack.EMPTY);
    }

    @Override
    protected NonNullList<ItemStack> getItems() {
        return this.items;
    }

    @Override
    protected void setItems(NonNullList<ItemStack> pItems) {
        this.items = pItems;
    }

    protected void saveAdditional(CompoundTag pTag) {
        super.saveAdditional(pTag);
        if (!this.trySaveLootTable(pTag)) {
            ContainerHelper.saveAllItems(pTag, this.items);
        }

    }

    public void load(CompoundTag pTag) {
        super.load(pTag);
        this.items = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
        if (!this.tryLoadLootTable(pTag)) {
            ContainerHelper.loadAllItems(pTag, this.items);
        }

    }

    @Override
    protected Component getDefaultName() {
        return Component.translatable("cluttered.storage");
    }

    @Override
    protected AbstractContainerMenu createMenu(int pId, Inventory pInventory) {
        return switch (this.size / 9) {
            case 1 -> new ChestMenu(MenuType.GENERIC_9x1, pId, pInventory, this, size/9);
            case 2 -> new ChestMenu(MenuType.GENERIC_9x2, pId, pInventory, this, size/9);
            case 4 -> new ChestMenu(MenuType.GENERIC_9x4, pId, pInventory, this, size/9);
            case 5 -> new ChestMenu(MenuType.GENERIC_9x5, pId, pInventory, this, size/9);
            case 6 -> ChestMenu.sixRows(pId, pInventory, this);
            default -> ChestMenu.threeRows(pId, pInventory, this);
        };
    }

    @Override
    public int getContainerSize() {
        return size;
    }
}
