package net.redchujelly.cluttered.blocks.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.redchujelly.cluttered.blocks.entity.ClutteredHangingSignBlockEntity;

public class CustomHangingSignBlock extends CeilingHangingSignBlock {
    public CustomHangingSignBlock(Properties pProperties, WoodType pType) {
        super(pProperties, pType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new ClutteredHangingSignBlockEntity(pPos, pState);
    }
}
