package net.redchujelly.cluttered.util;

import net.minecraft.world.level.block.ComposterBlock;
import net.redchujelly.cluttered.blocks.BlockRegistration;

public class ClutteredCompostables {
    public static void addCompost(){

        ComposterBlock.COMPOSTABLES.put(BlockRegistration.WILLOW_LEAVES.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.FLOWERING_CARPET_WILLOW.get().asItem(), 0.075F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.WILLOW_SAPLING.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.WILLOW_VINES.get().asItem(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.POPLAR_LEAVES.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.FLOWERING_CARPET_POPLAR.get().asItem(), 0.075F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.FLOWERING_POPLAR_LEAVES.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.POPLAR_SAPLING.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.CRABAPPLE_LEAVES.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.FLOWERING_CARPET_CRABAPPLE.get().asItem(), 0.075F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.CRABAPPLE_SAPLING.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.SYCAMORE_LEAVES.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.SYCAMORE_SAPLING.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.MAPLE_LEAVES_FLOWERING.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.MAPLE_LEAVES.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.MAPLE_SAPLING.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.BLUE_MUSHROOM_SAPLING.get().asItem(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.RED_MUSHROOM_SAPLING.get().asItem(), 0.65F);

    }
}
