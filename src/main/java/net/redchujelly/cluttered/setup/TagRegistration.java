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

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Cluttered.MODID, name));
        }
    }
}
