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

import net.redchujelly.cluttered.block.multiblock.MultiblockPlacer;
import net.redchujelly.cluttered.setup.BlockRegistration;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HandDrillItem extends Item {
    public HandDrillItem(Properties pProperties) {
        super(pProperties);
    }
    private static final Map<Block, Block> BLOCK_CYCLE_MAP = new HashMap<>(){{
        put(BlockRegistration.WILLOW_BOOKSHELF_BLACK_CAT.get(), BlockRegistration.WILLOW_BOOKSHELF_CALICO_CAT.get());
        put(BlockRegistration.WILLOW_BOOKSHELF_CALICO_CAT.get(), BlockRegistration.WILLOW_BOOKSHELF_BOTTLES.get());
        put(BlockRegistration.WILLOW_BOOKSHELF_BOTTLES.get(), BlockRegistration.WILLOW_BOOKSHELF_VASE.get());
        put(BlockRegistration.WILLOW_BOOKSHELF_VASE.get(), BlockRegistration.WILLOW_BOOKSHELF_COBWEB.get());
        put(BlockRegistration.WILLOW_BOOKSHELF_COBWEB.get(), BlockRegistration.WILLOW_BOOKSHELF_BLACK_CAT.get());

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

        put(BlockRegistration.COLOSSEO_PILLAR.get(), BlockRegistration.COLOSSEO_PILLAR_BASE.get());
        put(BlockRegistration.COLOSSEO_PILLAR_BASE.get(), BlockRegistration.COLOSSEO_PILLAR_TOP.get());
        put(BlockRegistration.COLOSSEO_PILLAR_TOP.get(), BlockRegistration.COLOSSEO_PILLAR.get());

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

        put(BlockRegistration.CHIC_WALLPAPER.get(), BlockRegistration.CHIC_WALLPAPER_LOWER_TRIM.get());
        put(BlockRegistration.CHIC_WALLPAPER_LOWER_TRIM.get(), BlockRegistration.CHIC_WALLPAPER_UPPER_TRIM.get());
        put(BlockRegistration.CHIC_WALLPAPER_UPPER_TRIM.get(), BlockRegistration.CHIC_WALLPAPER.get());

        put(BlockRegistration.GHOST_WALLPAPER.get(), BlockRegistration.GHOST_WALLPAPER_TRIM.get());
        put(BlockRegistration.GHOST_WALLPAPER_TRIM.get(), BlockRegistration.GHOST_WALLPAPER_WAINSCOTING.get());
        put(BlockRegistration.GHOST_WALLPAPER_WAINSCOTING.get(), BlockRegistration.GHOST_WALLPAPER_BOTTOM.get());
        put(BlockRegistration.GHOST_WALLPAPER_BOTTOM.get(), BlockRegistration.GHOST_WALLPAPER_TOP.get());
        put(BlockRegistration.GHOST_WALLPAPER_TOP.get(), BlockRegistration.GHOST_WALLPAPER.get());

        put(BlockRegistration.HALLOWEEN_WALLPAPER.get(), BlockRegistration.HALLOWEEN_WALLPAPER_BOTTOM.get());
        put(BlockRegistration.HALLOWEEN_WALLPAPER_BOTTOM.get(), BlockRegistration.HALLOWEEN_WALLPAPER_TOP.get());
        put(BlockRegistration.HALLOWEEN_WALLPAPER_TOP.get(), BlockRegistration.HALLOWEEN_WAINSCOTING.get());
        put(BlockRegistration.HALLOWEEN_WAINSCOTING.get(), BlockRegistration.HALLOWEEN_WALLPAPER.get());

        put(BlockRegistration.PINK_STRIPE_WALLPAPER.get(), BlockRegistration.PINK_STRIPE_WALLPAPER_LOWER_TRIM.get());
        put(BlockRegistration.PINK_STRIPE_WALLPAPER_LOWER_TRIM.get(), BlockRegistration.PINK_STRIPE_WALLPAPER_UPPER_TRIM.get());
        put(BlockRegistration.PINK_STRIPE_WALLPAPER_UPPER_TRIM.get(), BlockRegistration.PINK_STRIPE_WALLPAPER.get());

        put(BlockRegistration.MARIGOLD_WALLPAPER.get(), BlockRegistration.MARIGOLD_WALLPAPER_BOTTOM.get());
        put(BlockRegistration.MARIGOLD_WALLPAPER_BOTTOM.get(), BlockRegistration.MARIGOLD_WALLPAPER_TOP.get());
        put(BlockRegistration.MARIGOLD_WALLPAPER_TOP.get(), BlockRegistration.MARIGOLD_WALLPAPER.get());

        put(BlockRegistration.RIALTO_GOLD_WALLPAPER.get(), BlockRegistration.RIALTO_GOLD_WALLPAPER_BOTTOM.get());
        put(BlockRegistration.RIALTO_GOLD_WALLPAPER_BOTTOM.get(), BlockRegistration.RIALTO_GOLD_WALLPAPER_TOP.get());
        put(BlockRegistration.RIALTO_GOLD_WALLPAPER_TOP.get(), BlockRegistration.RIALTO_GOLD_WALLPAPER.get());

        put(BlockRegistration.BLUE_ROSE_STRIPED_WALLPAPER.get(), BlockRegistration.BLUE_ROSE_STRIPED_WALLPAPER_BOTTOM.get());
        put(BlockRegistration.BLUE_ROSE_STRIPED_WALLPAPER_BOTTOM.get(), BlockRegistration.BLUE_ROSE_STRIPED_WALLPAPER_TOP.get());
        put(BlockRegistration.BLUE_ROSE_STRIPED_WALLPAPER_TOP.get(), BlockRegistration.BLUE_ROSE_STRIPED_WALLPAPER.get());

        put(BlockRegistration.CONFECTIONARY_WALLPAPER.get(), BlockRegistration.CONFECTIONARY_WALLPAPER_BOTTOM.get());
        put(BlockRegistration.CONFECTIONARY_WALLPAPER_BOTTOM.get(), BlockRegistration.CONFECTIONARY_WALLPAPER_TOP.get());
        put(BlockRegistration.CONFECTIONARY_WALLPAPER_TOP.get(), BlockRegistration.BLUE_WAINSCOTING.get());
        put(BlockRegistration.BLUE_WAINSCOTING.get(), BlockRegistration.CONFECTIONARY_WALLPAPER.get());

        put(BlockRegistration.MINT_WALLPAPER.get(), BlockRegistration.MINT_WALLPAPER_BOTTOM.get());
        put(BlockRegistration.MINT_WALLPAPER_BOTTOM.get(), BlockRegistration.MINT_WALLPAPER_TOP.get());
        put(BlockRegistration.MINT_WALLPAPER_TOP.get(), BlockRegistration.BROWN_WAINSCOTING.get());
        put(BlockRegistration.BROWN_WAINSCOTING.get(), BlockRegistration.MINT_WALLPAPER.get());

        put(BlockRegistration.STRIPED_FLORAL_WALLPAPER.get(), BlockRegistration.STRIPED_FLORAL_WALLPAPER_BOTTOM.get());
        put(BlockRegistration.STRIPED_FLORAL_WALLPAPER_BOTTOM.get(), BlockRegistration.STRIPED_FLORAL_WALLPAPER_TOP.get());
        put(BlockRegistration.STRIPED_FLORAL_WALLPAPER_TOP.get(), BlockRegistration.STRIPED_FLORAL_WALLPAPER.get());

        put(BlockRegistration.FLORAL_BERRY_WALLPAPER.get(), BlockRegistration.FLORAL_BERRY_WALLPAPER_BOTTOM.get());
        put(BlockRegistration.FLORAL_BERRY_WALLPAPER_BOTTOM.get(), BlockRegistration.FLORAL_BERRY_WALLPAPER_TOP.get());
        put(BlockRegistration.FLORAL_BERRY_WALLPAPER_TOP.get(), BlockRegistration.FLORAL_BERRY_WALLPAPER.get());

        put(BlockRegistration.DIAMOND_WALLPAPER_APPLE.get(), BlockRegistration.DIAMOND_WALLPAPER_APPLE_BOTTOM_BROWN.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_APPLE_BOTTOM_BROWN.get(), BlockRegistration.DIAMOND_WALLPAPER_APPLE_TOP_BROWN.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_APPLE_TOP_BROWN.get(), BlockRegistration.DIAMOND_WALLPAPER_APPLE_BOTTOM_WHITE.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_APPLE_BOTTOM_WHITE.get(), BlockRegistration.DIAMOND_WALLPAPER_APPLE_TOP_WHITE.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_APPLE_TOP_WHITE.get(), BlockRegistration.DIAMOND_WALLPAPER_APPLE_BOTTOM_COLOR.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_APPLE_BOTTOM_COLOR.get(), BlockRegistration.DIAMOND_WALLPAPER_APPLE_TOP_COLOR.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_APPLE_TOP_COLOR.get(), BlockRegistration.DIAMOND_WALLPAPER_APPLE.get());

        put(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY.get(), BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_BOTTOM_BROWN.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_BOTTOM_BROWN.get(), BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_TOP_BROWN.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_TOP_BROWN.get(), BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_BOTTOM_WHITE.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_BOTTOM_WHITE.get(), BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_TOP_WHITE.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_TOP_WHITE.get(), BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_BOTTOM_COLOR.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_BOTTOM_COLOR.get(), BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_TOP_COLOR.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_TOP_COLOR.get(), BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY.get());

        put(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY.get(), BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_BOTTOM_BROWN.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_BOTTOM_BROWN.get(), BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_TOP_BROWN.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_TOP_BROWN.get(), BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_BOTTOM_WHITE.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_BOTTOM_WHITE.get(), BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_TOP_WHITE.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_TOP_WHITE.get(), BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_BOTTOM_COLOR.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_BOTTOM_COLOR.get(), BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_TOP_COLOR.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_TOP_COLOR.get(), BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY.get());

        put(BlockRegistration.DIAMOND_WALLPAPER_BONES.get(), BlockRegistration.DIAMOND_WALLPAPER_BONES_BOTTOM_BROWN.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_BONES_BOTTOM_BROWN.get(), BlockRegistration.DIAMOND_WALLPAPER_BONES_TOP_BROWN.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_BONES_TOP_BROWN.get(), BlockRegistration.DIAMOND_WALLPAPER_BONES_BOTTOM_WHITE.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_BONES_BOTTOM_WHITE.get(), BlockRegistration.DIAMOND_WALLPAPER_BONES_TOP_WHITE.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_BONES_TOP_WHITE.get(), BlockRegistration.DIAMOND_WALLPAPER_BONES.get());

        put(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET.get(), BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_BOTTOM_BROWN.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_BOTTOM_BROWN.get(), BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_TOP_BROWN.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_TOP_BROWN.get(), BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_BOTTOM_WHITE.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_BOTTOM_WHITE.get(), BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_TOP_WHITE.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_TOP_WHITE.get(), BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_BOTTOM_COLOR.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_BOTTOM_COLOR.get(), BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_TOP_COLOR.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_TOP_COLOR.get(), BlockRegistration.DIAMOND_WALLPAPER_BOUQUET.get());

        put(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM.get(), BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_BOTTOM_BROWN.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_BOTTOM_BROWN.get(), BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_TOP_BROWN.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_TOP_BROWN.get(), BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_BOTTOM_WHITE.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_BOTTOM_WHITE.get(), BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_TOP_WHITE.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_TOP_WHITE.get(), BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_BOTTOM_COLOR.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_BOTTOM_COLOR.get(), BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_TOP_COLOR.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_TOP_COLOR.get(), BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM.get());

        put(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES.get(), BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_BOTTOM_BROWN.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_BOTTOM_BROWN.get(), BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_TOP_BROWN.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_TOP_BROWN.get(), BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_BOTTOM_WHITE.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_BOTTOM_WHITE.get(), BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_TOP_WHITE.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_TOP_WHITE.get(), BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_BOTTOM_COLOR.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_BOTTOM_COLOR.get(), BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_TOP_COLOR.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_TOP_COLOR.get(), BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES.get());

        put(BlockRegistration.DIAMOND_WALLPAPER_LEMON.get(), BlockRegistration.DIAMOND_WALLPAPER_LEMON_BOTTOM_BROWN.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_LEMON_BOTTOM_BROWN.get(), BlockRegistration.DIAMOND_WALLPAPER_LEMON_TOP_BROWN.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_LEMON_TOP_BROWN.get(), BlockRegistration.DIAMOND_WALLPAPER_LEMON_BOTTOM_WHITE.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_LEMON_BOTTOM_WHITE.get(), BlockRegistration.DIAMOND_WALLPAPER_LEMON_TOP_WHITE.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_LEMON_TOP_WHITE.get(), BlockRegistration.DIAMOND_WALLPAPER_LEMON_BOTTOM_COLOR.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_LEMON_BOTTOM_COLOR.get(), BlockRegistration.DIAMOND_WALLPAPER_LEMON_TOP_COLOR.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_LEMON_TOP_COLOR.get(), BlockRegistration.DIAMOND_WALLPAPER_LEMON.get());

        put(BlockRegistration.DIAMOND_WALLPAPER_ORANGE.get(), BlockRegistration.DIAMOND_WALLPAPER_ORANGE_BOTTOM_BROWN.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_BOTTOM_BROWN.get(), BlockRegistration.DIAMOND_WALLPAPER_ORANGE_TOP_BROWN.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_TOP_BROWN.get(), BlockRegistration.DIAMOND_WALLPAPER_ORANGE_BOTTOM_WHITE.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_BOTTOM_WHITE.get(), BlockRegistration.DIAMOND_WALLPAPER_ORANGE_TOP_WHITE.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_TOP_WHITE.get(), BlockRegistration.DIAMOND_WALLPAPER_ORANGE_BOTTOM_COLOR.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_BOTTOM_COLOR.get(), BlockRegistration.DIAMOND_WALLPAPER_ORANGE_TOP_COLOR.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_TOP_COLOR.get(), BlockRegistration.DIAMOND_WALLPAPER_ORANGE.get());

        put(BlockRegistration.DIAMOND_WALLPAPER_PEAR.get(), BlockRegistration.DIAMOND_WALLPAPER_PEAR_BOTTOM_BROWN.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_PEAR_BOTTOM_BROWN.get(), BlockRegistration.DIAMOND_WALLPAPER_PEAR_TOP_BROWN.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_PEAR_TOP_BROWN.get(), BlockRegistration.DIAMOND_WALLPAPER_PEAR_BOTTOM_WHITE.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_PEAR_BOTTOM_WHITE.get(), BlockRegistration.DIAMOND_WALLPAPER_PEAR_TOP_WHITE.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_PEAR_TOP_WHITE.get(), BlockRegistration.DIAMOND_WALLPAPER_PEAR_BOTTOM_COLOR.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_PEAR_BOTTOM_COLOR.get(), BlockRegistration.DIAMOND_WALLPAPER_PEAR_TOP_COLOR.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_PEAR_TOP_COLOR.get(), BlockRegistration.DIAMOND_WALLPAPER_PEAR.get());

        put(BlockRegistration.DIAMOND_WALLPAPER_PLUM.get(), BlockRegistration.DIAMOND_WALLPAPER_PLUM_BOTTOM_BROWN.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_PLUM_BOTTOM_BROWN.get(), BlockRegistration.DIAMOND_WALLPAPER_PLUM_TOP_BROWN.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_PLUM_TOP_BROWN.get(), BlockRegistration.DIAMOND_WALLPAPER_PLUM_BOTTOM_WHITE.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_PLUM_BOTTOM_WHITE.get(), BlockRegistration.DIAMOND_WALLPAPER_PLUM_TOP_WHITE.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_PLUM_TOP_WHITE.get(), BlockRegistration.DIAMOND_WALLPAPER_PLUM_BOTTOM_COLOR.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_PLUM_BOTTOM_COLOR.get(), BlockRegistration.DIAMOND_WALLPAPER_PLUM_TOP_COLOR.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_PLUM_TOP_COLOR.get(), BlockRegistration.DIAMOND_WALLPAPER_PLUM.get());

        put(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES.get(), BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_BOTTOM_BROWN.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_BOTTOM_BROWN.get(), BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_TOP_BROWN.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_TOP_BROWN.get(), BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_BOTTOM_WHITE.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_BOTTOM_WHITE.get(), BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_TOP_WHITE.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_TOP_WHITE.get(), BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_BOTTOM_COLOR.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_BOTTOM_COLOR.get(), BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_TOP_COLOR.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_TOP_COLOR.get(), BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES.get());

        put(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM.get(), BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_BOTTOM_BROWN.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_BOTTOM_BROWN.get(), BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_TOP_BROWN.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_TOP_BROWN.get(), BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_BOTTOM_WHITE.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_BOTTOM_WHITE.get(), BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_TOP_WHITE.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_TOP_WHITE.get(), BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_BOTTOM_COLOR.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_BOTTOM_COLOR.get(), BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_TOP_COLOR.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_TOP_COLOR.get(), BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM.get());

        put(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY.get(), BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_BOTTOM_BROWN.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_BOTTOM_BROWN.get(), BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_TOP_BROWN.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_TOP_BROWN.get(), BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_BOTTOM_WHITE.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_BOTTOM_WHITE.get(), BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_TOP_WHITE.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_TOP_WHITE.get(), BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_BOTTOM_COLOR.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_BOTTOM_COLOR.get(), BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_TOP_COLOR.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_TOP_COLOR.get(), BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY.get());

        put(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR.get(), BlockRegistration.DIAMOND_WALLPAPER_ANCHOR_BOTTOM_BROWN.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR_BOTTOM_BROWN.get(), BlockRegistration.DIAMOND_WALLPAPER_ANCHOR_TOP_BROWN.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR_TOP_BROWN.get(), BlockRegistration.DIAMOND_WALLPAPER_ANCHOR_BOTTOM_WHITE.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR_BOTTOM_WHITE.get(), BlockRegistration.DIAMOND_WALLPAPER_ANCHOR_TOP_WHITE.get());
        put(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR_TOP_WHITE.get(), BlockRegistration.DIAMOND_WALLPAPER_ANCHOR.get());

        put(BlockRegistration.GINGERBREAD_BRICKS.get(), BlockRegistration.GINGERBREAD_BRICKS_TOP.get());
        put(BlockRegistration.GINGERBREAD_BRICKS_TOP.get(), BlockRegistration.GINGERBREAD_BRICKS_SIDE.get());
        put(BlockRegistration.GINGERBREAD_BRICKS_SIDE.get(), BlockRegistration.GINGERBREAD_BRICKS_TOP_CORNER.get());
        put(BlockRegistration.GINGERBREAD_BRICKS_TOP_CORNER.get(), BlockRegistration.GINGERBREAD_BRICKS.get());

        put(BlockRegistration.MARBLE_TILE.get(), BlockRegistration.MARBLE_TILE_CHISELED.get());
        put(BlockRegistration.MARBLE_TILE_CHISELED.get(), BlockRegistration.MARBLE_TILE_BORDER.get());
        put(BlockRegistration.MARBLE_TILE_BORDER.get(), BlockRegistration.MARBLE_TILE_BORDER_CIRCLE.get());
        put(BlockRegistration.MARBLE_TILE_BORDER_CIRCLE.get(), BlockRegistration.MARBLE_TILE_BORDER_DETAIL.get());
        put(BlockRegistration.MARBLE_TILE_BORDER_DETAIL.get(), BlockRegistration.MARBLE_TILE_CORNER.get());
        put(BlockRegistration.MARBLE_TILE_CORNER.get(), BlockRegistration.MARBLE_TILE_CORNER_CIRCLE.get());
        put(BlockRegistration.MARBLE_TILE_CORNER_CIRCLE.get(), BlockRegistration.MARBLE_TILE.get());

        put(BlockRegistration.VERDANT_TILE.get(), BlockRegistration.VERDANT_TILE_EDGE.get());
        put(BlockRegistration.VERDANT_TILE_EDGE.get(), BlockRegistration.VERDANT_TILE_CORNER.get());
        put(BlockRegistration.VERDANT_TILE_CORNER.get(), BlockRegistration.VERDANT_TILE.get());

        put(BlockRegistration.ALABASTER_WINDOW_DIVIDED.get(), BlockRegistration.ALABASTER_PANEL_ALEXANDRIA.get());
        put(BlockRegistration.ALABASTER_PANEL_ALEXANDRIA.get(), BlockRegistration.ALABASTER_PANEL_ATLANTIC.get());
        put(BlockRegistration.ALABASTER_PANEL_ATLANTIC.get(), BlockRegistration.ALABASTER_PANEL_AUGUSTINE.get());
        put(BlockRegistration.ALABASTER_PANEL_AUGUSTINE.get(), BlockRegistration.ALABASTER_PANEL_CANTERBURY.get());
        put(BlockRegistration.ALABASTER_PANEL_CANTERBURY.get(), BlockRegistration.ALABASTER_WINDOW_DIVIDED.get());

        put(BlockRegistration.WOOD_WINDOW_DIVIDED.get(), BlockRegistration.WOOD_PANEL_ALEXANDRIA.get());
        put(BlockRegistration.WOOD_PANEL_ALEXANDRIA.get(), BlockRegistration.WOOD_PANEL_ATLANTIC.get());
        put(BlockRegistration.WOOD_PANEL_ATLANTIC.get(), BlockRegistration.WOOD_PANEL_AUGUSTINE.get());
        put(BlockRegistration.WOOD_PANEL_AUGUSTINE.get(), BlockRegistration.WOOD_PANEL_CANTERBURY.get());
        put(BlockRegistration.WOOD_PANEL_CANTERBURY.get(), BlockRegistration.WOOD_WINDOW_DIVIDED.get());

    }};

    private BlockState getNextBlock(BlockState block) {
        if (BLOCK_CYCLE_MAP.containsKey(block.getBlock())) {
            return BLOCK_CYCLE_MAP.get(block.getBlock()).defaultBlockState();
        }
        return null;
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        BlockPos pos = pContext.getClickedPos();
        BlockState state = level.getBlockState(pos);
        BlockState nextState = getNextBlock(state);
        if (pContext.getPlayer().isCrouching()){
            if (!level.isClientSide) {
                if (state.getBlock() instanceof MultiblockPlacer){
                    return InteractionResult.PASS;
                }
                if (state.hasProperty(BlockStateProperties.FACING)) {
                    facingRotation(state, level, pos);
                }
                else if (state.hasProperty(BlockStateProperties.AXIS)) {
                    axisRotation(state, level, pos);
                }
                else if (state.hasProperty(BlockStateProperties.HORIZONTAL_FACING)) {
                    horizontalFacingRotation(state, level, pos);
                }
                else if (state.hasProperty(BlockStateProperties.HORIZONTAL_AXIS)) {
                    horizontalAxisRotation(state, level, pos);
                }
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

    private static void facingRotation(BlockState state, Level level, BlockPos pos) {
        //Rotates a "facing" block in a cycle including up and down
        Direction facing = state.getValue(BlockStateProperties.FACING);
        if (facing == Direction.WEST) {facing = Direction.UP;}
        else if (facing == Direction.UP) {facing = facing.getOpposite();}
        else if (facing == Direction.DOWN) {facing = Direction.NORTH;}
        else {facing = facing.getClockWise();}
        level.setBlock(pos, state.setValue(BlockStateProperties.FACING, facing), 2);
        level.playSound(null, pos, SoundEvents.AXE_SCRAPE, SoundSource.BLOCKS);
    }

    private static void axisRotation(BlockState state, Level level, BlockPos pos){
        //Rotates an "axis" block in a cycle including the Y axis
        Direction.Axis axis = state.getValue(BlockStateProperties.AXIS);
        if (axis == Direction.Axis.X) {axis = Direction.Axis.Y;}
        else if (axis == Direction.Axis.Y){axis = Direction.Axis.Z;}
        else axis = Direction.Axis.X;
        level.setBlock(pos, state.setValue(BlockStateProperties.AXIS, axis), 2);
        level.playSound(null, pos, SoundEvents.AXE_SCRAPE, SoundSource.BLOCKS);
    }

    private static void horizontalFacingRotation(BlockState state, Level level, BlockPos pos) {
        //Rotates a "horizontal facing" block in a cycle
        Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
        facing = facing.getClockWise();
        level.setBlock(pos, state.setValue(BlockStateProperties.HORIZONTAL_FACING, facing), 2);
        level.playSound(null, pos, SoundEvents.AXE_SCRAPE, SoundSource.BLOCKS);
    }

    private static void horizontalAxisRotation(BlockState state, Level level, BlockPos pos){
        //Rotates a "horizontal axis" block in a cycle
        Direction.Axis axis = state.getValue(BlockStateProperties.HORIZONTAL_AXIS);
        if (axis == Direction.Axis.X) {axis = Direction.Axis.Z;}
        else axis = Direction.Axis.X;
        level.setBlock(pos, state.setValue(BlockStateProperties.HORIZONTAL_AXIS, axis), 2);
        level.playSound(null, pos, SoundEvents.AXE_SCRAPE, SoundSource.BLOCKS);
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
