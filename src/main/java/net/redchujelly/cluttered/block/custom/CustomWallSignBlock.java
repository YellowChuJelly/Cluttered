package net.redchujelly.cluttered.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.redchujelly.cluttered.block.entity.ClutteredSignBlockEntity;

public class CustomWallSignBlock extends WallSignBlock {
    public CustomWallSignBlock(Properties pProperties, WoodType pType) {
        super(pProperties, pType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new ClutteredSignBlockEntity(pPos, pState);
    }

    @Override
    public String getDescriptionId() {
        return this.asItem().getDescriptionId();
    }
}
