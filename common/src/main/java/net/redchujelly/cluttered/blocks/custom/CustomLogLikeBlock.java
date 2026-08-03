package net.redchujelly.cluttered.blocks.custom;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

import java.util.Map;
import java.util.Random;

public class CustomLogLikeBlock extends RotatedPillarBlock {
    public static Map<Block, RegistrySupplier<Block>> strippedCounterparts;
    public static Map<Block, RegistrySupplier<Block>> shearedCounterparts;
    public static Map<Block, RegistrySupplier<Block>> flowerCounterparts;

    public CustomLogLikeBlock(Properties pProperties) {
        super(pProperties);
    }


    //@Override
    //public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
    //    return true;
    //}
//
    //@Override
    //public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
    //    return 5;
    //}
//
    //@Override
    //public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
    //    return 5;
    //}

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        Item item = player.getItemInHand(hand).getItem();
        if(item instanceof AxeItem) {
            if(getStrippedCounterpart(state.getBlock()) != null) {
                if (level.isClientSide){
                    return InteractionResult.SUCCESS;
                }
                level.setBlock(pos, getStrippedCounterpart(state.getBlock()).defaultBlockState().setValue(AXIS, state.getValue(AXIS)), 2);
                level.playSound(null, pos, SoundEvents.AXE_STRIP, SoundSource.BLOCKS);
                if (item.canBeDepleted()) {
                    player.getItemInHand(hand).hurtAndBreak(1, player, (guy) -> guy.broadcastBreakEvent(hand));
                }
                return InteractionResult.SUCCESS;
            }
        }
        if(item instanceof ShearsItem) {
            if(getShearedCounterpart(state.getBlock()) != null) {
                if (level.isClientSide){
                    return InteractionResult.SUCCESS;
                }
                level.setBlock(pos, getShearedCounterpart(state.getBlock()).defaultBlockState().setValue(AXIS, state.getValue(AXIS)), 2);
                Item flower = getFlowerCounterpart(state.getBlock()).asItem();
                Random r = new Random();
                int rand = r.nextInt(1,5);
                popResource(level, pos, new ItemStack(flower, rand));
                level.playSound(null, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS);
                if (item.canBeDepleted()) {
                    player.getItemInHand(hand).hurtAndBreak(1, player, (guy) -> guy.broadcastBreakEvent(hand));
                }
                return InteractionResult.SUCCESS;
            }
        }
        return InteractionResult.FAIL;
    }

    public Block getStrippedCounterpart(Block block) {

        RegistrySupplier<Block> toReturn = strippedCounterparts.getOrDefault(block, null);
        if (toReturn != null){
            return toReturn.get();
        }
        return null;
    }

    public Block getShearedCounterpart(Block block) {
        RegistrySupplier<Block> toReturn = shearedCounterparts.getOrDefault(block, null);
        if (toReturn != null){
            return toReturn.get();
        }
        return null;
    }

    public Block getFlowerCounterpart(Block block) {
        RegistrySupplier<Block> toReturn = flowerCounterparts.getOrDefault(block, null);
        if (toReturn != null){
            return toReturn.get();
        }
        return null;
    }

    public static void setStrippedCounterparts(Map<Block, RegistrySupplier<Block>> map){
        strippedCounterparts = map;
    }

    public static void setShearedCounterparts(Map<Block, RegistrySupplier<Block>> map){
        shearedCounterparts = map;
    }

    public static void setFlowerCounterparts(Map<Block, RegistrySupplier<Block>> map){
        flowerCounterparts = map;
    }

}
