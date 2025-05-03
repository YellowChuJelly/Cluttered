package net.redchujelly.cluttered.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class EyeBlock extends Block {
    public static final BooleanProperty LOOKING_LEFT = BooleanProperty.create("looking_left");
    public static final BooleanProperty BLINKING = BooleanProperty.create("blinking");
    public EyeBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.getStateDefinition().any().setValue(LOOKING_LEFT, true).setValue(BLINKING, false));
    }

    @Override
    public boolean isRandomlyTicking(BlockState pState) {
        return !pState.getValue(BLINKING);
    }

    @Override
    public void tick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        if (pLevel.getBlockState(pPos).hasProperty(BLINKING)) {
            if (pLevel.getBlockState(pPos).getValue(BLINKING)) {
                pLevel.setBlock(pPos, pState.setValue(BLINKING, false), 2);
            }
        }
    }

    @Override
    public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        if (!pLevel.isClientSide) {
            if ((pLevel.getGameTime()) % 20 == 0){
                pLevel.setBlock(pPos, pState.setValue(BLINKING, true), 2);
                pLevel.scheduleTick(pPos, this, 20);
                pLevel.playSound(null, pPos, SoundEvents.FROGSPAWN_BREAK, SoundSource.BLOCKS, .7f, 1.5f);
            }
            else {
                pLevel.setBlock(pPos, pState.setValue(LOOKING_LEFT, !pState.getValue(LOOKING_LEFT)), 2);
                pLevel.playSound(null, pPos, SoundEvents.FROGSPAWNSTEP, SoundSource.BLOCKS, .1f, 1.0f);
            }
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(LOOKING_LEFT).add(BLINKING);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable BlockGetter pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
        pTooltip.add(Component.translatable("cluttered.eye_block.tooltip"));

        super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
    }
}
