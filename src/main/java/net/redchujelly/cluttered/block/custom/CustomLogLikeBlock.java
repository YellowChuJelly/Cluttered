package net.redchujelly.cluttered.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import net.redchujelly.cluttered.setup.BlockRegistration;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

public class CustomLogLikeBlock extends RotatedPillarBlock {
    public CustomLogLikeBlock(Properties pProperties) {
        super(pProperties);
    }

    private Block getStrippedCounterpart(Block block) {
        Map<Block, Block> strippedCounterparts = new HashMap<>() {
            {
                put(BlockRegistration.WILLOW_LOG.get(), BlockRegistration.STRIPPED_WILLOW_LOG.get());
                put(BlockRegistration.WILLOW_WOOD.get(), BlockRegistration.STRIPPED_WILLOW_WOOD.get());
                put(BlockRegistration.FLOWERING_WILLOW_LOG.get(), BlockRegistration.STRIPPED_FLOWERING_WILLOW_LOG.get());
                put(BlockRegistration.FLOWERING_WILLOW_WOOD.get(), BlockRegistration.STRIPPED_FLOWERING_WILLOW_WOOD.get());
                put(BlockRegistration.POPLAR_LOG.get(), BlockRegistration.STRIPPED_POPLAR_LOG.get());
                put(BlockRegistration.POPLAR_WOOD.get(), BlockRegistration.STRIPPED_POPLAR_WOOD.get());
                put(BlockRegistration.FLOWERING_POPLAR_LOG.get(), BlockRegistration.STRIPPED_FLOWERING_POPLAR_LOG.get());
                put(BlockRegistration.FLOWERING_POPLAR_WOOD.get(), BlockRegistration.STRIPPED_FLOWERING_POPLAR_WOOD.get());
                put(BlockRegistration.CRABAPPLE_LOG.get(), BlockRegistration.STRIPPED_CRABAPPLE_LOG.get());
                put(BlockRegistration.CRABAPPLE_WOOD.get(), BlockRegistration.STRIPPED_CRABAPPLE_WOOD.get());
                put(BlockRegistration.FLOWERING_CRABAPPLE_LOG.get(), BlockRegistration.STRIPPED_FLOWERING_CRABAPPLE_LOG.get());
                put(BlockRegistration.FLOWERING_CRABAPPLE_WOOD.get(), BlockRegistration.STRIPPED_FLOWERING_CRABAPPLE_WOOD.get());
                put(BlockRegistration.SYCAMORE_LOG.get(), BlockRegistration.STRIPPED_SYCAMORE_LOG.get());
                put(BlockRegistration.SYCAMORE_WOOD.get(), BlockRegistration.STRIPPED_SYCAMORE_WOOD.get());
                put(BlockRegistration.MAPLE_LOG.get(), BlockRegistration.STRIPPED_MAPLE_LOG.get());
                put(BlockRegistration.MAPLE_WOOD.get(), BlockRegistration.STRIPPED_MAPLE_WOOD.get());
            }
        };

        return strippedCounterparts.getOrDefault(block, null);
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if(context.getItemInHand().getItem() instanceof AxeItem) {
            if(getStrippedCounterpart(state.getBlock()) != null) {
                return getStrippedCounterpart(state.getBlock()).defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }
        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}
