package net.redchujelly.cluttered.item;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.redchujelly.cluttered.block.custom.BracketBlock;
import net.redchujelly.cluttered.block.multiblock.MultiblockPlacer;
import net.redchujelly.cluttered.setup.BlockRegistration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HandDrillItem extends Item {
    public HandDrillItem(Properties pProperties) {
        super(pProperties);
    }
    private static final Map<Holder<Block>, Holder<Block>> BLOCK_CYCLE_MAP = new HashMap<>(){{
        put(BlockRegistration.WILLOW_BOOKSHELF_BLACK_CAT, BlockRegistration.WILLOW_BOOKSHELF_CALICO_CAT);
        put(BlockRegistration.WILLOW_BOOKSHELF_CALICO_CAT, BlockRegistration.WILLOW_BOOKSHELF_BOTTLES);
        put(BlockRegistration.WILLOW_BOOKSHELF_BOTTLES, BlockRegistration.WILLOW_BOOKSHELF_VASE);
        put(BlockRegistration.WILLOW_BOOKSHELF_VASE, BlockRegistration.WILLOW_BOOKSHELF_COBWEB);
        put(BlockRegistration.WILLOW_BOOKSHELF_COBWEB, BlockRegistration.WILLOW_BOOKSHELF_BLACK_CAT);

        put(BlockRegistration.CHALCEDONY_PILLAR, BlockRegistration.CHALCEDONY_PILLAR_BASE);
        put(BlockRegistration.CHALCEDONY_PILLAR_BASE, BlockRegistration.CHALCEDONY_PILLAR_DORIC);
        put(BlockRegistration.CHALCEDONY_PILLAR_DORIC, BlockRegistration.CHALCEDONY_PILLAR_IONIC);
        put(BlockRegistration.CHALCEDONY_PILLAR_IONIC, BlockRegistration.CHALCEDONY_PILLAR);

        put(BlockRegistration.DEEP_CHALCEDONY_PILLAR, BlockRegistration.DEEP_CHALCEDONY_PILLAR_BASE);
        put(BlockRegistration.DEEP_CHALCEDONY_PILLAR_BASE, BlockRegistration.DEEP_CHALCEDONY_PILLAR_DORIC);
        put(BlockRegistration.DEEP_CHALCEDONY_PILLAR_DORIC, BlockRegistration.DEEP_CHALCEDONY_PILLAR_IONIC);
        put(BlockRegistration.DEEP_CHALCEDONY_PILLAR_IONIC, BlockRegistration.DEEP_CHALCEDONY_PILLAR);

        put(BlockRegistration.STARRY_CHALCEDONY_PILLAR, BlockRegistration.STARRY_CHALCEDONY_PILLAR_BASE);
        put(BlockRegistration.STARRY_CHALCEDONY_PILLAR_BASE, BlockRegistration.STARRY_CHALCEDONY_PILLAR_DORIC);
        put(BlockRegistration.STARRY_CHALCEDONY_PILLAR_DORIC, BlockRegistration.STARRY_CHALCEDONY_PILLAR_IONIC);
        put(BlockRegistration.STARRY_CHALCEDONY_PILLAR_IONIC, BlockRegistration.STARRY_CHALCEDONY_PILLAR);

        put(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR, BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_BASE);
        put(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_BASE, BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_DORIC);
        put(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_DORIC, BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_IONIC);
        put(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_IONIC, BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR);

        put(BlockRegistration.MARBLE_PILLAR, BlockRegistration.MARBLE_PILLAR_BASE);
        put(BlockRegistration.MARBLE_PILLAR_BASE, BlockRegistration.MARBLE_PILLAR_DORIC);
        put(BlockRegistration.MARBLE_PILLAR_DORIC, BlockRegistration.MARBLE_PILLAR_IONIC);
        put(BlockRegistration.MARBLE_PILLAR_IONIC, BlockRegistration.MARBLE_PILLAR);

        put(BlockRegistration.COLOSSEO_PILLAR, BlockRegistration.COLOSSEO_PILLAR_BASE);
        put(BlockRegistration.COLOSSEO_PILLAR_BASE, BlockRegistration.COLOSSEO_PILLAR_TOP);
        put(BlockRegistration.COLOSSEO_PILLAR_TOP, BlockRegistration.COLOSSEO_PILLAR);

        put(BlockRegistration.CHALCEDONY_BORDER, BlockRegistration.CHALCEDONY_ACANTHUS);
        put(BlockRegistration.CHALCEDONY_ACANTHUS, BlockRegistration.CHALCEDONY_HELIX);
        put(BlockRegistration.CHALCEDONY_HELIX, BlockRegistration.CHALCEDONY_MEANDER);
        put(BlockRegistration.CHALCEDONY_MEANDER, BlockRegistration.CHALCEDONY_TEXTILES);
        put(BlockRegistration.CHALCEDONY_TEXTILES, BlockRegistration.CHALCEDONY_BORDER);

        put(BlockRegistration.DEEP_CHALCEDONY_BORDER, BlockRegistration.DEEP_CHALCEDONY_ACANTHUS);
        put(BlockRegistration.DEEP_CHALCEDONY_ACANTHUS, BlockRegistration.DEEP_CHALCEDONY_HELIX);
        put(BlockRegistration.DEEP_CHALCEDONY_HELIX, BlockRegistration.DEEP_CHALCEDONY_MEANDER);
        put(BlockRegistration.DEEP_CHALCEDONY_MEANDER, BlockRegistration.DEEP_CHALCEDONY_TEXTILES);
        put(BlockRegistration.DEEP_CHALCEDONY_TEXTILES, BlockRegistration.DEEP_CHALCEDONY_BORDER);

        put(BlockRegistration.MARBLE_BORDER, BlockRegistration.MARBLE_ACANTHUS);
        put(BlockRegistration.MARBLE_ACANTHUS, BlockRegistration.MARBLE_HELIX);
        put(BlockRegistration.MARBLE_HELIX, BlockRegistration.MARBLE_MEANDER);
        put(BlockRegistration.MARBLE_MEANDER, BlockRegistration.MARBLE_TEXTILES);
        put(BlockRegistration.MARBLE_TEXTILES, BlockRegistration.MARBLE_BORDER);

        put(BlockRegistration.STARRY_WALLPAPER, BlockRegistration.STARRY_WALLPAPER_BOTTOM);
        put(BlockRegistration.STARRY_WALLPAPER_BOTTOM, BlockRegistration.STARRY_WALLPAPER_TOP);
        put(BlockRegistration.STARRY_WALLPAPER_TOP, BlockRegistration.STARRY_WALLPAPER);

        put(BlockRegistration.DARK_STARRY_WALLPAPER, BlockRegistration.DARK_STARRY_WALLPAPER_BOTTOM);
        put(BlockRegistration.DARK_STARRY_WALLPAPER_BOTTOM, BlockRegistration.DARK_STARRY_WALLPAPER_TOP);
        put(BlockRegistration.DARK_STARRY_WALLPAPER_TOP, BlockRegistration.DARK_STARRY_WALLPAPER);

        put(BlockRegistration.CHECKERED_GREEN_WALLPAPER, BlockRegistration.CHECKERED_GREEN_STRAWBERRY_WALLPAPER);
        put(BlockRegistration.CHECKERED_GREEN_STRAWBERRY_WALLPAPER, BlockRegistration.CHECKERED_GREEN_WALLPAPER);

        put(BlockRegistration.CHECKERED_PINK_WALLPAPER, BlockRegistration.CHECKERED_PINK_STRAWBERRY_WALLPAPER);
        put(BlockRegistration.CHECKERED_PINK_STRAWBERRY_WALLPAPER, BlockRegistration.CHECKERED_PINK_WALLPAPER);

        put(BlockRegistration.CHIC_WALLPAPER, BlockRegistration.CHIC_WALLPAPER_LOWER_TRIM);
        put(BlockRegistration.CHIC_WALLPAPER_LOWER_TRIM, BlockRegistration.CHIC_WALLPAPER_UPPER_TRIM);
        put(BlockRegistration.CHIC_WALLPAPER_UPPER_TRIM, BlockRegistration.CHIC_WALLPAPER);

        put(BlockRegistration.GHOST_WALLPAPER, BlockRegistration.GHOST_WALLPAPER_TRIM);
        put(BlockRegistration.GHOST_WALLPAPER_TRIM, BlockRegistration.GHOST_WALLPAPER_WAINSCOTING);
        put(BlockRegistration.GHOST_WALLPAPER_WAINSCOTING, BlockRegistration.GHOST_WALLPAPER_BOTTOM);
        put(BlockRegistration.GHOST_WALLPAPER_BOTTOM, BlockRegistration.GHOST_WALLPAPER_TOP);
        put(BlockRegistration.GHOST_WALLPAPER_TOP, BlockRegistration.GHOST_WALLPAPER);

        put(BlockRegistration.HALLOWEEN_WALLPAPER, BlockRegistration.HALLOWEEN_WALLPAPER_BOTTOM);
        put(BlockRegistration.HALLOWEEN_WALLPAPER_BOTTOM, BlockRegistration.HALLOWEEN_WALLPAPER_TOP);
        put(BlockRegistration.HALLOWEEN_WALLPAPER_TOP, BlockRegistration.HALLOWEEN_WAINSCOTING);
        put(BlockRegistration.HALLOWEEN_WAINSCOTING, BlockRegistration.HALLOWEEN_WALLPAPER);

        put(BlockRegistration.PINK_STRIPE_WALLPAPER, BlockRegistration.PINK_STRIPE_WALLPAPER_LOWER_TRIM);
        put(BlockRegistration.PINK_STRIPE_WALLPAPER_LOWER_TRIM, BlockRegistration.PINK_STRIPE_WALLPAPER_UPPER_TRIM);
        put(BlockRegistration.PINK_STRIPE_WALLPAPER_UPPER_TRIM, BlockRegistration.PINK_STRIPE_WALLPAPER);

        put(BlockRegistration.MARIGOLD_WALLPAPER, BlockRegistration.MARIGOLD_WALLPAPER_BOTTOM);
        put(BlockRegistration.MARIGOLD_WALLPAPER_BOTTOM, BlockRegistration.MARIGOLD_WALLPAPER_TOP);
        put(BlockRegistration.MARIGOLD_WALLPAPER_TOP, BlockRegistration.MARIGOLD_WALLPAPER);

        put(BlockRegistration.RIALTO_GOLD_WALLPAPER, BlockRegistration.RIALTO_GOLD_WALLPAPER_BOTTOM);
        put(BlockRegistration.RIALTO_GOLD_WALLPAPER_BOTTOM, BlockRegistration.RIALTO_GOLD_WALLPAPER_TOP);
        put(BlockRegistration.RIALTO_GOLD_WALLPAPER_TOP, BlockRegistration.RIALTO_GOLD_WALLPAPER);

        put(BlockRegistration.BLUE_ROSE_STRIPED_WALLPAPER, BlockRegistration.BLUE_ROSE_STRIPED_WALLPAPER_BOTTOM);
        put(BlockRegistration.BLUE_ROSE_STRIPED_WALLPAPER_BOTTOM, BlockRegistration.BLUE_ROSE_STRIPED_WALLPAPER_TOP);
        put(BlockRegistration.BLUE_ROSE_STRIPED_WALLPAPER_TOP, BlockRegistration.BLUE_ROSE_STRIPED_WALLPAPER);

        put(BlockRegistration.CONFECTIONARY_WALLPAPER, BlockRegistration.CONFECTIONARY_WALLPAPER_BOTTOM);
        put(BlockRegistration.CONFECTIONARY_WALLPAPER_BOTTOM, BlockRegistration.CONFECTIONARY_WALLPAPER_TOP);
        put(BlockRegistration.CONFECTIONARY_WALLPAPER_TOP, BlockRegistration.BLUE_WAINSCOTING);
        put(BlockRegistration.BLUE_WAINSCOTING, BlockRegistration.CONFECTIONARY_WALLPAPER);

        put(BlockRegistration.MINT_WALLPAPER, BlockRegistration.MINT_WALLPAPER_BOTTOM);
        put(BlockRegistration.MINT_WALLPAPER_BOTTOM, BlockRegistration.MINT_WALLPAPER_TOP);
        put(BlockRegistration.MINT_WALLPAPER_TOP, BlockRegistration.BROWN_WAINSCOTING);
        put(BlockRegistration.BROWN_WAINSCOTING, BlockRegistration.MINT_WALLPAPER);

        put(BlockRegistration.STRIPED_FLORAL_WALLPAPER, BlockRegistration.STRIPED_FLORAL_WALLPAPER_BOTTOM);
        put(BlockRegistration.STRIPED_FLORAL_WALLPAPER_BOTTOM, BlockRegistration.STRIPED_FLORAL_WALLPAPER_TOP);
        put(BlockRegistration.STRIPED_FLORAL_WALLPAPER_TOP, BlockRegistration.STRIPED_FLORAL_WALLPAPER);

        put(BlockRegistration.FLORAL_BERRY_WALLPAPER, BlockRegistration.FLORAL_BERRY_WALLPAPER_BOTTOM);
        put(BlockRegistration.FLORAL_BERRY_WALLPAPER_BOTTOM, BlockRegistration.FLORAL_BERRY_WALLPAPER_TOP);
        put(BlockRegistration.FLORAL_BERRY_WALLPAPER_TOP, BlockRegistration.FLORAL_BERRY_WALLPAPER);

        put(BlockRegistration.DIAMOND_WALLPAPER_APPLE, BlockRegistration.DIAMOND_WALLPAPER_APPLE_BOTTOM_BROWN);
        put(BlockRegistration.DIAMOND_WALLPAPER_APPLE_BOTTOM_BROWN, BlockRegistration.DIAMOND_WALLPAPER_APPLE_TOP_BROWN);
        put(BlockRegistration.DIAMOND_WALLPAPER_APPLE_TOP_BROWN, BlockRegistration.DIAMOND_WALLPAPER_APPLE_BOTTOM_WHITE);
        put(BlockRegistration.DIAMOND_WALLPAPER_APPLE_BOTTOM_WHITE, BlockRegistration.DIAMOND_WALLPAPER_APPLE_TOP_WHITE);
        put(BlockRegistration.DIAMOND_WALLPAPER_APPLE_TOP_WHITE, BlockRegistration.DIAMOND_WALLPAPER_APPLE_BOTTOM_COLOR);
        put(BlockRegistration.DIAMOND_WALLPAPER_APPLE_BOTTOM_COLOR, BlockRegistration.DIAMOND_WALLPAPER_APPLE_TOP_COLOR);
        put(BlockRegistration.DIAMOND_WALLPAPER_APPLE_TOP_COLOR, BlockRegistration.DIAMOND_WALLPAPER_APPLE);

        put(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY, BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_BOTTOM_BROWN);
        put(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_BOTTOM_BROWN, BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_TOP_BROWN);
        put(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_TOP_BROWN, BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_BOTTOM_WHITE);
        put(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_BOTTOM_WHITE, BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_TOP_WHITE);
        put(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_TOP_WHITE, BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_BOTTOM_COLOR);
        put(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_BOTTOM_COLOR, BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_TOP_COLOR);
        put(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY_TOP_COLOR, BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY);

        put(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY, BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_BOTTOM_BROWN);
        put(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_BOTTOM_BROWN, BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_TOP_BROWN);
        put(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_TOP_BROWN, BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_BOTTOM_WHITE);
        put(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_BOTTOM_WHITE, BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_TOP_WHITE);
        put(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_TOP_WHITE, BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_BOTTOM_COLOR);
        put(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_BOTTOM_COLOR, BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_TOP_COLOR);
        put(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY_TOP_COLOR, BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY);

        put(BlockRegistration.DIAMOND_WALLPAPER_BONES, BlockRegistration.DIAMOND_WALLPAPER_BONES_BOTTOM_BROWN);
        put(BlockRegistration.DIAMOND_WALLPAPER_BONES_BOTTOM_BROWN, BlockRegistration.DIAMOND_WALLPAPER_BONES_TOP_BROWN);
        put(BlockRegistration.DIAMOND_WALLPAPER_BONES_TOP_BROWN, BlockRegistration.DIAMOND_WALLPAPER_BONES_BOTTOM_WHITE);
        put(BlockRegistration.DIAMOND_WALLPAPER_BONES_BOTTOM_WHITE, BlockRegistration.DIAMOND_WALLPAPER_BONES_TOP_WHITE);
        put(BlockRegistration.DIAMOND_WALLPAPER_BONES_TOP_WHITE, BlockRegistration.DIAMOND_WALLPAPER_BONES);

        put(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET, BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_BOTTOM_BROWN);
        put(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_BOTTOM_BROWN, BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_TOP_BROWN);
        put(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_TOP_BROWN, BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_BOTTOM_WHITE);
        put(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_BOTTOM_WHITE, BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_TOP_WHITE);
        put(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_TOP_WHITE, BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_BOTTOM_COLOR);
        put(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_BOTTOM_COLOR, BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_TOP_COLOR);
        put(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET_TOP_COLOR, BlockRegistration.DIAMOND_WALLPAPER_BOUQUET);

        put(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM, BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_BOTTOM_BROWN);
        put(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_BOTTOM_BROWN, BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_TOP_BROWN);
        put(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_TOP_BROWN, BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_BOTTOM_WHITE);
        put(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_BOTTOM_WHITE, BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_TOP_WHITE);
        put(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_TOP_WHITE, BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_BOTTOM_COLOR);
        put(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_BOTTOM_COLOR, BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_TOP_COLOR);
        put(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM_TOP_COLOR, BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM);

        put(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES, BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_BOTTOM_BROWN);
        put(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_BOTTOM_BROWN, BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_TOP_BROWN);
        put(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_TOP_BROWN, BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_BOTTOM_WHITE);
        put(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_BOTTOM_WHITE, BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_TOP_WHITE);
        put(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_TOP_WHITE, BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_BOTTOM_COLOR);
        put(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_BOTTOM_COLOR, BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_TOP_COLOR);
        put(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES_TOP_COLOR, BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES);

        put(BlockRegistration.DIAMOND_WALLPAPER_LEMON, BlockRegistration.DIAMOND_WALLPAPER_LEMON_BOTTOM_BROWN);
        put(BlockRegistration.DIAMOND_WALLPAPER_LEMON_BOTTOM_BROWN, BlockRegistration.DIAMOND_WALLPAPER_LEMON_TOP_BROWN);
        put(BlockRegistration.DIAMOND_WALLPAPER_LEMON_TOP_BROWN, BlockRegistration.DIAMOND_WALLPAPER_LEMON_BOTTOM_WHITE);
        put(BlockRegistration.DIAMOND_WALLPAPER_LEMON_BOTTOM_WHITE, BlockRegistration.DIAMOND_WALLPAPER_LEMON_TOP_WHITE);
        put(BlockRegistration.DIAMOND_WALLPAPER_LEMON_TOP_WHITE, BlockRegistration.DIAMOND_WALLPAPER_LEMON_BOTTOM_COLOR);
        put(BlockRegistration.DIAMOND_WALLPAPER_LEMON_BOTTOM_COLOR, BlockRegistration.DIAMOND_WALLPAPER_LEMON_TOP_COLOR);
        put(BlockRegistration.DIAMOND_WALLPAPER_LEMON_TOP_COLOR, BlockRegistration.DIAMOND_WALLPAPER_LEMON);

        put(BlockRegistration.DIAMOND_WALLPAPER_ORANGE, BlockRegistration.DIAMOND_WALLPAPER_ORANGE_BOTTOM_BROWN);
        put(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_BOTTOM_BROWN, BlockRegistration.DIAMOND_WALLPAPER_ORANGE_TOP_BROWN);
        put(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_TOP_BROWN, BlockRegistration.DIAMOND_WALLPAPER_ORANGE_BOTTOM_WHITE);
        put(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_BOTTOM_WHITE, BlockRegistration.DIAMOND_WALLPAPER_ORANGE_TOP_WHITE);
        put(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_TOP_WHITE, BlockRegistration.DIAMOND_WALLPAPER_ORANGE_BOTTOM_COLOR);
        put(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_BOTTOM_COLOR, BlockRegistration.DIAMOND_WALLPAPER_ORANGE_TOP_COLOR);
        put(BlockRegistration.DIAMOND_WALLPAPER_ORANGE_TOP_COLOR, BlockRegistration.DIAMOND_WALLPAPER_ORANGE);

        put(BlockRegistration.DIAMOND_WALLPAPER_PEAR, BlockRegistration.DIAMOND_WALLPAPER_PEAR_BOTTOM_BROWN);
        put(BlockRegistration.DIAMOND_WALLPAPER_PEAR_BOTTOM_BROWN, BlockRegistration.DIAMOND_WALLPAPER_PEAR_TOP_BROWN);
        put(BlockRegistration.DIAMOND_WALLPAPER_PEAR_TOP_BROWN, BlockRegistration.DIAMOND_WALLPAPER_PEAR_BOTTOM_WHITE);
        put(BlockRegistration.DIAMOND_WALLPAPER_PEAR_BOTTOM_WHITE, BlockRegistration.DIAMOND_WALLPAPER_PEAR_TOP_WHITE);
        put(BlockRegistration.DIAMOND_WALLPAPER_PEAR_TOP_WHITE, BlockRegistration.DIAMOND_WALLPAPER_PEAR_BOTTOM_COLOR);
        put(BlockRegistration.DIAMOND_WALLPAPER_PEAR_BOTTOM_COLOR, BlockRegistration.DIAMOND_WALLPAPER_PEAR_TOP_COLOR);
        put(BlockRegistration.DIAMOND_WALLPAPER_PEAR_TOP_COLOR, BlockRegistration.DIAMOND_WALLPAPER_PEAR);

        put(BlockRegistration.DIAMOND_WALLPAPER_PLUM, BlockRegistration.DIAMOND_WALLPAPER_PLUM_BOTTOM_BROWN);
        put(BlockRegistration.DIAMOND_WALLPAPER_PLUM_BOTTOM_BROWN, BlockRegistration.DIAMOND_WALLPAPER_PLUM_TOP_BROWN);
        put(BlockRegistration.DIAMOND_WALLPAPER_PLUM_TOP_BROWN, BlockRegistration.DIAMOND_WALLPAPER_PLUM_BOTTOM_WHITE);
        put(BlockRegistration.DIAMOND_WALLPAPER_PLUM_BOTTOM_WHITE, BlockRegistration.DIAMOND_WALLPAPER_PLUM_TOP_WHITE);
        put(BlockRegistration.DIAMOND_WALLPAPER_PLUM_TOP_WHITE, BlockRegistration.DIAMOND_WALLPAPER_PLUM_BOTTOM_COLOR);
        put(BlockRegistration.DIAMOND_WALLPAPER_PLUM_BOTTOM_COLOR, BlockRegistration.DIAMOND_WALLPAPER_PLUM_TOP_COLOR);
        put(BlockRegistration.DIAMOND_WALLPAPER_PLUM_TOP_COLOR, BlockRegistration.DIAMOND_WALLPAPER_PLUM);

        put(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES, BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_BOTTOM_BROWN);
        put(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_BOTTOM_BROWN, BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_TOP_BROWN);
        put(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_TOP_BROWN, BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_BOTTOM_WHITE);
        put(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_BOTTOM_WHITE, BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_TOP_WHITE);
        put(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_TOP_WHITE, BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_BOTTOM_COLOR);
        put(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_BOTTOM_COLOR, BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_TOP_COLOR);
        put(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES_TOP_COLOR, BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES);

        put(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM, BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_BOTTOM_BROWN);
        put(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_BOTTOM_BROWN, BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_TOP_BROWN);
        put(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_TOP_BROWN, BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_BOTTOM_WHITE);
        put(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_BOTTOM_WHITE, BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_TOP_WHITE);
        put(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_TOP_WHITE, BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_BOTTOM_COLOR);
        put(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_BOTTOM_COLOR, BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_TOP_COLOR);
        put(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM_TOP_COLOR, BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM);

        put(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY, BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_BOTTOM_BROWN);
        put(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_BOTTOM_BROWN, BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_TOP_BROWN);
        put(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_TOP_BROWN, BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_BOTTOM_WHITE);
        put(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_BOTTOM_WHITE, BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_TOP_WHITE);
        put(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_TOP_WHITE, BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_BOTTOM_COLOR);
        put(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_BOTTOM_COLOR, BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_TOP_COLOR);
        put(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY_TOP_COLOR, BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY);

        put(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR, BlockRegistration.DIAMOND_WALLPAPER_ANCHOR_BOTTOM_BROWN);
        put(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR_BOTTOM_BROWN, BlockRegistration.DIAMOND_WALLPAPER_ANCHOR_TOP_BROWN);
        put(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR_TOP_BROWN, BlockRegistration.DIAMOND_WALLPAPER_ANCHOR_BOTTOM_WHITE);
        put(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR_BOTTOM_WHITE, BlockRegistration.DIAMOND_WALLPAPER_ANCHOR_TOP_WHITE);
        put(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR_TOP_WHITE, BlockRegistration.DIAMOND_WALLPAPER_ANCHOR);

        put(BlockRegistration.GINGERBREAD_BRICKS, BlockRegistration.GINGERBREAD_BRICKS_TOP);
        put(BlockRegistration.GINGERBREAD_BRICKS_TOP, BlockRegistration.GINGERBREAD_BRICKS_SIDE);
        put(BlockRegistration.GINGERBREAD_BRICKS_SIDE, BlockRegistration.GINGERBREAD_BRICKS_TOP_CORNER);
        put(BlockRegistration.GINGERBREAD_BRICKS_TOP_CORNER, BlockRegistration.GINGERBREAD_BRICKS);

        put(BlockRegistration.MARBLE_TILE, BlockRegistration.MARBLE_TILE_CHISELED);
        put(BlockRegistration.MARBLE_TILE_CHISELED, BlockRegistration.MARBLE_TILE_BORDER);
        put(BlockRegistration.MARBLE_TILE_BORDER, BlockRegistration.MARBLE_TILE_BORDER_CIRCLE);
        put(BlockRegistration.MARBLE_TILE_BORDER_CIRCLE, BlockRegistration.MARBLE_TILE_BORDER_DETAIL);
        put(BlockRegistration.MARBLE_TILE_BORDER_DETAIL, BlockRegistration.MARBLE_TILE_CORNER);
        put(BlockRegistration.MARBLE_TILE_CORNER, BlockRegistration.MARBLE_TILE_CORNER_CIRCLE);
        put(BlockRegistration.MARBLE_TILE_CORNER_CIRCLE, BlockRegistration.MARBLE_TILE);

        put(BlockRegistration.VERDANT_TILE, BlockRegistration.VERDANT_TILE_EDGE);
        put(BlockRegistration.VERDANT_TILE_EDGE, BlockRegistration.VERDANT_TILE_CORNER);
        put(BlockRegistration.VERDANT_TILE_CORNER, BlockRegistration.VERDANT_TILE);

        put(BlockRegistration.X_TILE_TERRACOTTA, BlockRegistration.X_TILE_INVERSE_TERRACOTTA);
        put(BlockRegistration.X_TILE_INVERSE_TERRACOTTA, BlockRegistration.X_TILE_TERRACOTTA);

        put(BlockRegistration.X_TILE_BLUE, BlockRegistration.X_TILE_INVERSE_BLUE);
        put(BlockRegistration.X_TILE_INVERSE_BLUE, BlockRegistration.X_TILE_BLUE);

        put(BlockRegistration.X_TILE_GRAY, BlockRegistration.X_TILE_INVERSE_GRAY);
        put(BlockRegistration.X_TILE_INVERSE_GRAY, BlockRegistration.X_TILE_GRAY);

        put(BlockRegistration.VARYING_BRICKS, BlockRegistration.VARYING_BRICKS_BORDER);
        put(BlockRegistration.VARYING_BRICKS_BORDER, BlockRegistration.VARYING_BRICKS);

        put(BlockRegistration.ALABASTER_WINDOW_DIVIDED, BlockRegistration.GREENHOUSE_WINDOW);
        put(BlockRegistration.GREENHOUSE_WINDOW, BlockRegistration.GREENHOUSE_WINDOW_ARCH_LEFT);
        put(BlockRegistration.GREENHOUSE_WINDOW_ARCH_LEFT, BlockRegistration.GREENHOUSE_WINDOW_ARCH_RIGHT);
        put(BlockRegistration.GREENHOUSE_WINDOW_ARCH_RIGHT, BlockRegistration.GREENHOUSE_WINDOW_POINT);
        put(BlockRegistration.GREENHOUSE_WINDOW_POINT, BlockRegistration.GREENHOUSE_WINDOW_RADIAL_LEFT);
        put(BlockRegistration.GREENHOUSE_WINDOW_RADIAL_LEFT, BlockRegistration.GREENHOUSE_WINDOW_RADIAL_RIGHT);
        put(BlockRegistration.GREENHOUSE_WINDOW_RADIAL_RIGHT, BlockRegistration.GREENHOUSE_WINDOW_ROUNDED);
        put(BlockRegistration.GREENHOUSE_WINDOW_ROUNDED, BlockRegistration.GREENHOUSE_WINDOW_CIRCLE);
        put(BlockRegistration.GREENHOUSE_WINDOW_CIRCLE, BlockRegistration.ALABASTER_WINDOW_DIVIDED);

        put(BlockRegistration.CHALCEDONY_BRACKET_SCROLL_SHELF, BlockRegistration.CHALCEDONY_BRACKET_VICTORIAN);
        put(BlockRegistration.CHALCEDONY_BRACKET_VICTORIAN, BlockRegistration.CHALCEDONY_BRACKET_SCROLL);
        put(BlockRegistration.CHALCEDONY_BRACKET_SCROLL, BlockRegistration.CHALCEDONY_BRACKET_BOW_SCROLL);
        put(BlockRegistration.CHALCEDONY_BRACKET_BOW_SCROLL, BlockRegistration.CHALCEDONY_BRACKET_BOW);
        put(BlockRegistration.CHALCEDONY_BRACKET_BOW, BlockRegistration.CHALCEDONY_BRACKET_STAR);
        put(BlockRegistration.CHALCEDONY_BRACKET_STAR, BlockRegistration.CHALCEDONY_BRACKET_STAR_SCROLL);
        put(BlockRegistration.CHALCEDONY_BRACKET_STAR_SCROLL, BlockRegistration.CHALCEDONY_BRACKET_SCROLL_SHELF);
        
        put(BlockRegistration.DEEP_CHALCEDONY_BRACKET_SCROLL_SHELF, BlockRegistration.DEEP_CHALCEDONY_BRACKET_VICTORIAN);
        put(BlockRegistration.DEEP_CHALCEDONY_BRACKET_VICTORIAN, BlockRegistration.DEEP_CHALCEDONY_BRACKET_SCROLL);
        put(BlockRegistration.DEEP_CHALCEDONY_BRACKET_SCROLL, BlockRegistration.DEEP_CHALCEDONY_BRACKET_BOW_SCROLL);
        put(BlockRegistration.DEEP_CHALCEDONY_BRACKET_BOW_SCROLL, BlockRegistration.DEEP_CHALCEDONY_BRACKET_BOW);
        put(BlockRegistration.DEEP_CHALCEDONY_BRACKET_BOW, BlockRegistration.DEEP_CHALCEDONY_BRACKET_STAR);
        put(BlockRegistration.DEEP_CHALCEDONY_BRACKET_STAR, BlockRegistration.DEEP_CHALCEDONY_BRACKET_STAR_SCROLL);
        put(BlockRegistration.DEEP_CHALCEDONY_BRACKET_STAR_SCROLL, BlockRegistration.DEEP_CHALCEDONY_BRACKET_SCROLL_SHELF);
        
        put(BlockRegistration.MARBLE_BRACKET_SCROLL_SHELF, BlockRegistration.MARBLE_BRACKET_VICTORIAN);
        put(BlockRegistration.MARBLE_BRACKET_VICTORIAN, BlockRegistration.MARBLE_BRACKET_SCROLL);
        put(BlockRegistration.MARBLE_BRACKET_SCROLL, BlockRegistration.MARBLE_BRACKET_BOW_SCROLL);
        put(BlockRegistration.MARBLE_BRACKET_BOW_SCROLL, BlockRegistration.MARBLE_BRACKET_BOW);
        put(BlockRegistration.MARBLE_BRACKET_BOW, BlockRegistration.MARBLE_BRACKET_STAR);
        put(BlockRegistration.MARBLE_BRACKET_STAR, BlockRegistration.MARBLE_BRACKET_STAR_SCROLL);
        put(BlockRegistration.MARBLE_BRACKET_STAR_SCROLL, BlockRegistration.MARBLE_BRACKET_SCROLL_SHELF);
        
        put(BlockRegistration.WOODEN_BRACKET_SCROLL_SHELF, BlockRegistration.WOODEN_BRACKET_VICTORIAN);
        put(BlockRegistration.WOODEN_BRACKET_VICTORIAN, BlockRegistration.WOODEN_BRACKET_SCROLL);
        put(BlockRegistration.WOODEN_BRACKET_SCROLL, BlockRegistration.WOODEN_BRACKET_BOW_SCROLL);
        put(BlockRegistration.WOODEN_BRACKET_BOW_SCROLL, BlockRegistration.WOODEN_BRACKET_BOW);
        put(BlockRegistration.WOODEN_BRACKET_BOW, BlockRegistration.WOODEN_BRACKET_STAR);
        put(BlockRegistration.WOODEN_BRACKET_STAR, BlockRegistration.WOODEN_BRACKET_STAR_SCROLL);
        put(BlockRegistration.WOODEN_BRACKET_STAR_SCROLL, BlockRegistration.WOODEN_BRACKET_SCROLL_SHELF);

    }};

    private BlockState getNextBlock(BlockState block) {
		if (BLOCK_CYCLE_MAP.containsKey(block.getBlock().builtInRegistryHolder())) {
            return BLOCK_CYCLE_MAP.get(block.getBlock().builtInRegistryHolder()).value().defaultBlockState();
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
                if (state.getBlock() instanceof MultiblockPlacer || state.getBlock() instanceof BedBlock){
                    return InteractionResult.CONSUME;
                }
                else if (state.getBlock() instanceof BracketBlock){
                    level.setBlock(pos, state.setValue(BracketBlock.OFFSET, !state.getValue(BracketBlock.OFFSET)), 2);
                    level.playSound(null, pos, SoundEvents.AXE_SCRAPE, SoundSource.BLOCKS);
                    return InteractionResult.SUCCESS;
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
                if (state.getBlock() instanceof BracketBlock){
                    level.setBlock(pos, nextState.setValue(BracketBlock.IS_UP, state.getValue(BracketBlock.IS_UP)).setValue(BracketBlock.OFFSET, state.getValue(BracketBlock.OFFSET)).setValue(BracketBlock.FACING, state.getValue(BracketBlock.FACING)), 3);
                }
                else {
                    level.setBlock(pos, swapAxisAndFacing(state, nextState, pContext.getHorizontalDirection()), 3);
                }
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
	public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
		tooltipComponents.add(Component.translatable("cluttered.hand_drill.tooltip"));
		super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
	}
}
