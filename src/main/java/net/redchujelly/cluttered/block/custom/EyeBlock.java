package net.redchujelly.cluttered.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class EyeBlock extends Block {
    public static final BooleanProperty LOOKING_LEFT = BooleanProperty.create("looking_left");
    public static final IntegerProperty BLINK_FRAME = IntegerProperty.create("frame", 0,5);
    public EyeBlock(Properties pProperties) {

        super(pProperties);
        this.registerDefaultState(this.getStateDefinition().any().setValue(LOOKING_LEFT, true).setValue(BLINK_FRAME, 0));
    }

    @Override
    public boolean isRandomlyTicking(BlockState pState) {
        return pState.getValue(BLINK_FRAME) == 0;
    }

    @Override
    public void tick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        if (pState.hasProperty(BLINK_FRAME)){
            int frame = pState.getValue(BLINK_FRAME);
            if (frame < 5){
                pLevel.setBlock(pPos, pState.setValue(BLINK_FRAME, frame + 1), 2);
                pLevel.scheduleTick(pPos, this, 4);
            }
            if (frame == 5){
                pLevel.setBlock(pPos, pState.setValue(BLINK_FRAME, 0), 2);
            }
        }
    }

    @Override
    public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        if (!pLevel.isClientSide){
            float random = pRandom.nextFloat();
            if (random < 0.08){
                pLevel.scheduleTick(pPos, this, 0);
                pLevel.playSound(null, pPos, SoundEvents.FROGSPAWN_BREAK, SoundSource.BLOCKS);
            } else if (random < 0.5) {
                pLevel.setBlock(pPos, pState.setValue(LOOKING_LEFT, !pState.getValue(LOOKING_LEFT)), 2);
                pLevel.playSound(null, pPos, SoundEvents.FROGSPAWNSTEP, SoundSource.BLOCKS);
            }
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
		super.createBlockStateDefinition(pBuilder);
        pBuilder.add(LOOKING_LEFT).add(BLINK_FRAME);
    }

	@Override
	public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
		tooltipComponents.add(Component.translatable("cluttered.eye_block.tooltip"));
		super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
	}
}
