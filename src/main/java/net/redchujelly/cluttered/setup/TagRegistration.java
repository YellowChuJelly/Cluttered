package net.redchujelly.cluttered.setup;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.redchujelly.cluttered.Cluttered;

public class TagRegistration {
    public static class Blocks {

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Cluttered.MODID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> WILLOW_LOG = tag("willow_log");
        public static final TagKey<Item> FLOWERING_WILLOW_LOG = tag("flowering_willow_log");
        public static final TagKey<Item> POPLAR_LOG = tag("poplar_log");
        public static final TagKey<Item> FLOWERING_POPLAR_LOG = tag("flowering_poplar_log");
        public static final TagKey<Item> CRABAPPLE_LOG = tag("crabapple_log");
        public static final TagKey<Item> FLOWERING_CRABAPPLE_LOG = tag("flowering_crabapple_log");
        public static final TagKey<Item> SYCAMORE_LOG = tag("sycamore_log");
        public static final TagKey<Item> MAPLE_LOG = tag("fluorescent_maple_log");
        public static final TagKey<Item> BLUE_MUSHROOM_LOG = tag("blue_mushroom_log");
        public static final TagKey<Item> RED_MUSHROOM_LOG = tag("red_mushroom_log");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Cluttered.MODID, name));
        }
    }
}
