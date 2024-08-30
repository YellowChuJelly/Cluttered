package net.redchujelly.cluttered.item;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

import net.redchujelly.cluttered.setup.BlockRegistration;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HandDrillItem extends Item {
    public HandDrillItem(Properties pProperties) {
        super(pProperties);
    }

    private BlockState getNextBlock(BlockState block) {
        Map<Block, Block> blockCycle = new HashMap<>(){{
            put(BlockRegistration.CHALCEDONY_PILLAR.get(), BlockRegistration.CHALCEDONY_PILLAR_BASE.get());
            put(BlockRegistration.CHALCEDONY_PILLAR_BASE.get(), BlockRegistration.CHALCEDONY_PILLAR_DORIC.get());
            put(BlockRegistration.CHALCEDONY_PILLAR_DORIC.get(), BlockRegistration.CHALCEDONY_PILLAR_IONIC.get());
            put(BlockRegistration.CHALCEDONY_PILLAR_IONIC.get(), BlockRegistration.CHALCEDONY_PILLAR.get());

            put(BlockRegistration.DEEP_CHALCEDONY_PILLAR.get(), BlockRegistration.DEEP_CHALCEDONY_PILLAR_BASE.get());
            put(BlockRegistration.DEEP_CHALCEDONY_PILLAR_BASE.get(), BlockRegistration.DEEP_CHALCEDONY_PILLAR_DORIC.get());
            put(BlockRegistration.DEEP_CHALCEDONY_PILLAR_DORIC.get(), BlockRegistration.DEEP_CHALCEDONY_PILLAR_IONIC.get());
            put(BlockRegistration.DEEP_CHALCEDONY_PILLAR_IONIC.get(), BlockRegistration.DEEP_CHALCEDONY_PILLAR.get());

            put(BlockRegistration.STARRY_CHALCEDONY_PILLAR.get(), BlockRegistration.STARRY_CHALCEDONY_PILLAR_BASE.get());
            put(BlockRegistration.STARRY_CHALCEDONY_PILLAR_BASE.get(), BlockRegistration.STARRY_CHALCEDONY_PILLAR_DORIC.get());
            put(BlockRegistration.STARRY_CHALCEDONY_PILLAR_DORIC.get(), BlockRegistration.STARRY_CHALCEDONY_PILLAR_IONIC.get());
            put(BlockRegistration.STARRY_CHALCEDONY_PILLAR_IONIC.get(), BlockRegistration.STARRY_CHALCEDONY_PILLAR.get());

            put(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR.get(), BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_BASE.get());
            put(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_BASE.get(), BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_DORIC.get());
            put(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_DORIC.get(), BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_IONIC.get());
            put(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_IONIC.get(), BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR.get());
            
            put(BlockRegistration.MARBLE_PILLAR.get(), BlockRegistration.MARBLE_PILLAR_BASE.get());
            put(BlockRegistration.MARBLE_PILLAR_BASE.get(), BlockRegistration.MARBLE_PILLAR_DORIC.get());
            put(BlockRegistration.MARBLE_PILLAR_DORIC.get(), BlockRegistration.MARBLE_PILLAR_IONIC.get());
            put(BlockRegistration.MARBLE_PILLAR_IONIC.get(), BlockRegistration.MARBLE_PILLAR.get());

            put(BlockRegistration.CHALCEDONY_BORDER.get(), BlockRegistration.CHALCEDONY_ACANTHUS.get());
            put(BlockRegistration.CHALCEDONY_ACANTHUS.get(), BlockRegistration.CHALCEDONY_HELIX.get());
            put(BlockRegistration.CHALCEDONY_HELIX.get(), BlockRegistration.CHALCEDONY_BORDER.get());

            put(BlockRegistration.DEEP_CHALCEDONY_BORDER.get(), BlockRegistration.DEEP_CHALCEDONY_ACANTHUS.get());
            put(BlockRegistration.DEEP_CHALCEDONY_ACANTHUS.get(), BlockRegistration.DEEP_CHALCEDONY_HELIX.get());
            put(BlockRegistration.DEEP_CHALCEDONY_HELIX.get(), BlockRegistration.DEEP_CHALCEDONY_BORDER.get());

            put(BlockRegistration.MARBLE_BORDER.get(), BlockRegistration.MARBLE_ACANTHUS.get());
            put(BlockRegistration.MARBLE_ACANTHUS.get(), BlockRegistration.MARBLE_HELIX.get());
            put(BlockRegistration.MARBLE_HELIX.get(), BlockRegistration.MARBLE_BORDER.get());

            put(BlockRegistration.STARRY_WALLPAPER.get(), BlockRegistration.STARRY_WALLPAPER_BOTTOM.get());
            put(BlockRegistration.STARRY_WALLPAPER_BOTTOM.get(), BlockRegistration.STARRY_WALLPAPER_TOP.get());
            put(BlockRegistration.STARRY_WALLPAPER_TOP.get(), BlockRegistration.STARRY_WALLPAPER.get());

            put(BlockRegistration.DARK_STARRY_WALLPAPER.get(), BlockRegistration.DARK_STARRY_WALLPAPER_BOTTOM.get());
            put(BlockRegistration.DARK_STARRY_WALLPAPER_BOTTOM.get(), BlockRegistration.DARK_STARRY_WALLPAPER_TOP.get());
            put(BlockRegistration.DARK_STARRY_WALLPAPER_TOP.get(), BlockRegistration.DARK_STARRY_WALLPAPER.get());

            put(BlockRegistration.CHECKERED_GREEN_WALLPAPER.get(), BlockRegistration.CHECKERED_GREEN_STRAWBERRY_WALLPAPER.get());
            put(BlockRegistration.CHECKERED_GREEN_STRAWBERRY_WALLPAPER.get(), BlockRegistration.CHECKERED_GREEN_WALLPAPER.get());

            put(BlockRegistration.CHECKERED_PINK_WALLPAPER.get(), BlockRegistration.CHECKERED_PINK_STRAWBERRY_WALLPAPER.get());
            put(BlockRegistration.CHECKERED_PINK_STRAWBERRY_WALLPAPER.get(), BlockRegistration.CHECKERED_PINK_WALLPAPER.get());



        }};
        if (blockCycle.containsKey(block.getBlock())) {
            return blockCycle.get(block.getBlock()).defaultBlockState();
        }
        return null;
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        BlockPos pos = pContext.getClickedPos();
        BlockState state = level.getBlockState(pos);
        BlockState nextState = getNextBlock(state);
        if (pContext.getPlayer().isShiftKeyDown() && state.hasProperty(BlockStateProperties.FACING)){
            if (!level.isClientSide) {
                Direction facing = state.getValue(BlockStateProperties.FACING);
                if (facing.equals(Direction.UP) || facing.equals(Direction.DOWN)) {facing = facing.getOpposite();}
                else {facing = facing.getClockWise();}
                level.setBlock(pos, state.setValue(BlockStateProperties.FACING, facing), 2);
                level.playSound(null, pos, SoundEvents.AXE_SCRAPE, SoundSource.BLOCKS);
            }
            return InteractionResult.SUCCESS;
        }
        else if (nextState != null) {
            if(!level.isClientSide){
                level.setBlock(pos, swapAxisAndFacing(state, nextState, pContext.getHorizontalDirection()), 3);
                level.playSound(null, pos, SoundEvents.UI_STONECUTTER_TAKE_RESULT, SoundSource.BLOCKS);
            }
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }
    //yeah i know this sucks will fix later
    //TODO fix this mess
    private BlockState swapAxisAndFacing(BlockState state, BlockState nextState, Direction playerFacing){
        if (state.hasProperty(BlockStateProperties.AXIS)) {
            Direction.Axis axis = state.getValue(BlockStateProperties.AXIS);
            if (nextState.hasProperty(BlockStateProperties.AXIS)) {return nextState.setValue(BlockStateProperties.AXIS, axis);}
            else if (nextState.hasProperty(BlockStateProperties.FACING)) {
                if (!axis.equals(Direction.Axis.Y)) {return nextState.setValue(BlockStateProperties.FACING, playerFacing);}
                else return nextState.setValue(BlockStateProperties.FACING, Direction.UP);}}
        else if (state.hasProperty(BlockStateProperties.FACING)) {
            Direction facing = state.getValue(BlockStateProperties.FACING);
            if (nextState.hasProperty(BlockStateProperties.FACING)) {return nextState.setValue(BlockStateProperties.FACING, facing);}
            else if (nextState.hasProperty(BlockStateProperties.AXIS)) {
                if (facing.equals(Direction.UP) || (facing.equals(Direction.DOWN))){return nextState.setValue(BlockStateProperties.AXIS, Direction.Axis.Y);}
                else if (facing.equals(Direction.NORTH) || facing.equals(Direction.SOUTH)) {return nextState.setValue(BlockStateProperties.AXIS, Direction.Axis.Z);}
                else return nextState.setValue(BlockStateProperties.AXIS, Direction.Axis.X);}
            else return nextState;}
        return nextState;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("cluttered.hand_drill.tooltip"));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
