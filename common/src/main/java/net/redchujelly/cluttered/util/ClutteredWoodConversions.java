package net.redchujelly.cluttered.util;

import net.redchujelly.cluttered.blocks.BlockRegistration;
import net.redchujelly.cluttered.blocks.custom.CustomLogLikeBlock;

import java.util.HashMap;

public class ClutteredWoodConversions {

    public static void addConversions(){
        CustomLogLikeBlock.setStrippedCounterparts(new HashMap<>() {
            {
                put(BlockRegistration.WILLOW_LOG.get(), BlockRegistration.STRIPPED_WILLOW_LOG);
                put(BlockRegistration.WILLOW_WOOD.get(), BlockRegistration.STRIPPED_WILLOW_WOOD);
                put(BlockRegistration.FLOWERING_WILLOW_LOG.get(), BlockRegistration.STRIPPED_FLOWERING_WILLOW_LOG);
                put(BlockRegistration.FLOWERING_WILLOW_WOOD.get(), BlockRegistration.STRIPPED_FLOWERING_WILLOW_WOOD);
                put(BlockRegistration.POPLAR_LOG.get(), BlockRegistration.STRIPPED_POPLAR_LOG);
                put(BlockRegistration.POPLAR_WOOD.get(), BlockRegistration.STRIPPED_POPLAR_WOOD);
                put(BlockRegistration.FLOWERING_POPLAR_LOG.get(), BlockRegistration.STRIPPED_FLOWERING_POPLAR_LOG);
                put(BlockRegistration.FLOWERING_POPLAR_WOOD.get(), BlockRegistration.STRIPPED_FLOWERING_POPLAR_WOOD);
                put(BlockRegistration.CRABAPPLE_LOG.get(), BlockRegistration.STRIPPED_CRABAPPLE_LOG);
                put(BlockRegistration.CRABAPPLE_WOOD.get(), BlockRegistration.STRIPPED_CRABAPPLE_WOOD);
                put(BlockRegistration.FLOWERING_CRABAPPLE_LOG.get(), BlockRegistration.STRIPPED_FLOWERING_CRABAPPLE_LOG);
                put(BlockRegistration.FLOWERING_CRABAPPLE_WOOD.get(), BlockRegistration.STRIPPED_FLOWERING_CRABAPPLE_WOOD);
                put(BlockRegistration.SYCAMORE_LOG.get(), BlockRegistration.STRIPPED_SYCAMORE_LOG);
                put(BlockRegistration.SYCAMORE_WOOD.get(), BlockRegistration.STRIPPED_SYCAMORE_WOOD);
                put(BlockRegistration.MAPLE_LOG.get(), BlockRegistration.STRIPPED_MAPLE_LOG);
                put(BlockRegistration.MAPLE_WOOD.get(), BlockRegistration.STRIPPED_MAPLE_WOOD);
            }
        });
        CustomLogLikeBlock.setFlowerCounterparts(new HashMap<>() {
            {
                put(BlockRegistration.FLOWERING_WILLOW_LOG.get(), BlockRegistration.FLOWERING_CARPET_WILLOW);
                put(BlockRegistration.FLOWERING_WILLOW_WOOD.get(), BlockRegistration.FLOWERING_CARPET_WILLOW);
                put(BlockRegistration.STRIPPED_FLOWERING_WILLOW_LOG.get(), BlockRegistration.FLOWERING_CARPET_WILLOW);
                put(BlockRegistration.STRIPPED_FLOWERING_WILLOW_WOOD.get(), BlockRegistration.FLOWERING_CARPET_WILLOW);
                put(BlockRegistration.FLOWERING_POPLAR_LOG.get(), BlockRegistration.FLOWERING_CARPET_POPLAR);
                put(BlockRegistration.FLOWERING_POPLAR_WOOD.get(), BlockRegistration.FLOWERING_CARPET_POPLAR);
                put(BlockRegistration.STRIPPED_FLOWERING_POPLAR_LOG.get(), BlockRegistration.FLOWERING_CARPET_POPLAR);
                put(BlockRegistration.STRIPPED_FLOWERING_POPLAR_WOOD.get(), BlockRegistration.FLOWERING_CARPET_POPLAR);
                put(BlockRegistration.FLOWERING_CRABAPPLE_LOG.get(), BlockRegistration.FLOWERING_CARPET_CRABAPPLE);
                put(BlockRegistration.FLOWERING_CRABAPPLE_WOOD.get(), BlockRegistration.FLOWERING_CARPET_CRABAPPLE);
                put(BlockRegistration.STRIPPED_FLOWERING_CRABAPPLE_LOG.get(), BlockRegistration.FLOWERING_CARPET_CRABAPPLE);
                put(BlockRegistration.STRIPPED_FLOWERING_CRABAPPLE_WOOD.get(), BlockRegistration.FLOWERING_CARPET_CRABAPPLE);
            }
        });
        CustomLogLikeBlock.setShearedCounterparts(new HashMap<>() {
            {
                put(BlockRegistration.FLOWERING_WILLOW_LOG.get(), BlockRegistration.WILLOW_LOG);
                put(BlockRegistration.FLOWERING_WILLOW_WOOD.get(), BlockRegistration.WILLOW_WOOD);
                put(BlockRegistration.STRIPPED_FLOWERING_WILLOW_LOG.get(), BlockRegistration.STRIPPED_WILLOW_LOG);
                put(BlockRegistration.STRIPPED_FLOWERING_WILLOW_WOOD.get(), BlockRegistration.STRIPPED_WILLOW_WOOD);
                put(BlockRegistration.FLOWERING_POPLAR_LOG.get(), BlockRegistration.POPLAR_LOG);
                put(BlockRegistration.FLOWERING_POPLAR_WOOD.get(), BlockRegistration.POPLAR_WOOD);
                put(BlockRegistration.STRIPPED_FLOWERING_POPLAR_LOG.get(), BlockRegistration.STRIPPED_POPLAR_LOG);
                put(BlockRegistration.STRIPPED_FLOWERING_POPLAR_WOOD.get(), BlockRegistration.STRIPPED_POPLAR_WOOD);
                put(BlockRegistration.FLOWERING_CRABAPPLE_LOG.get(), BlockRegistration.CRABAPPLE_LOG);
                put(BlockRegistration.FLOWERING_CRABAPPLE_WOOD.get(), BlockRegistration.CRABAPPLE_WOOD);
                put(BlockRegistration.STRIPPED_FLOWERING_CRABAPPLE_LOG.get(), BlockRegistration.STRIPPED_CRABAPPLE_LOG);
                put(BlockRegistration.STRIPPED_FLOWERING_CRABAPPLE_WOOD.get(), BlockRegistration.STRIPPED_CRABAPPLE_WOOD);
            }
        });
    }

}
