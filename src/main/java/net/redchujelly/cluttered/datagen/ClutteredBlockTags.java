package net.redchujelly.cluttered.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.redchujelly.cluttered.Cluttered;
import net.redchujelly.cluttered.setup.BlockRegistration;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ClutteredBlockTags extends BlockTagsProvider {
    public ClutteredBlockTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Cluttered.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tagNewWoodset("willow");
        tagNewWoodset("flowering_willow");
        tagNewWoodset("poplar");
        tagNewWoodset("flowering_poplar");
        tagNewWoodset("crabapple");
        tagNewWoodset("flowering_crabapple");
        tagNewWoodset("sycamore");
        tagNewWoodset("fluorescent_maple");
        tagNewWoodset("blue_mushroom");
        tagNewWoodset("red_mushroom");

        tag(BlockTags.MINEABLE_WITH_HOE)
                .add(BlockRegistration.BLUE_MUSHROOM_CAP.get())
                .add(BlockRegistration.EYE_BLOCK.get());
        tag(BlockTags.ENCHANTMENT_POWER_PROVIDER)
                .add(BlockRegistration.WILLOW_BOOKSHELF_BLACK_CAT.get())
                .add(BlockRegistration.WILLOW_BOOKSHELF_CALICO_CAT.get())
                .add(BlockRegistration.WILLOW_BOOKSHELF_COBWEB.get())
                .add(BlockRegistration.WILLOW_BOOKSHELF_BOTTLES.get())
                .add(BlockRegistration.WILLOW_BOOKSHELF_VASE.get())

                .add(BlockRegistration.ANTIQUE_BOOK_STAND.get())
                .add(BlockRegistration.ANCIENT_CODEX.get())
                .add(BlockRegistration.BUNNY_BOOK_ENDS.get())
                .add(BlockRegistration.ANTIQUE_LIBRARY_BOOKS.get())
                .add(BlockRegistration.COTTAGE_BOOKCASE.get())
                .add(BlockRegistration.BAMBOO_BOOKSHELF.get())
                .add(BlockRegistration.FWISH_BOOKCASE.get())
                .add(BlockRegistration.RETRO_CAFE_SHELF.get())
                .add(BlockRegistration.BOOK_OPEN.get())
                .add(BlockRegistration.ROW_OF_SMALL_BOOKS.get())
                .add(BlockRegistration.ROW_OF_SMALL_BOOKS_PASTEL.get())
                .add(BlockRegistration.ROW_OF_SMALL_BOOKS_SHELVED.get())
                .add(BlockRegistration.ROW_OF_SMALL_BOOKS_PASTEL_SHELVED.get())
                .add(BlockRegistration.BOOK_OPEN.get())
                .add(BlockRegistration.STACK_OF_BOOKS.get())
                .add(BlockRegistration.STACK_OF_BOOKS_TALL.get());

        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(BlockRegistration.WILLOW_DOOR.get())
                .add(BlockRegistration.WILLOW_LOG_DOOR.get())
                .add(BlockRegistration.WILLOW_GARDEN_DOOR.get())

                .add(BlockRegistration.YELLOW_PLANTER.get())
                .add(BlockRegistration.PINK_PLANTER.get())
                .add(BlockRegistration.PURPLE_PLANTER.get())
                .add(BlockRegistration.BEIGE_PLANTER.get())
                .add(BlockRegistration.GREEN_PLANTER.get())
                .add(BlockRegistration.FLUORESCENT_PLANTER.get())
                .add(BlockRegistration.RED_PLANTER.get())
                .add(BlockRegistration.BLUE_PLANTER.get())
                .add(BlockRegistration.STARRY_WALLPAPER.get())
                .add(BlockRegistration.STARRY_WALLPAPER_TOP.get())
                .add(BlockRegistration.STARRY_WALLPAPER_BOTTOM.get())
                .add(BlockRegistration.DARK_STARRY_WALLPAPER.get())
                .add(BlockRegistration.DARK_STARRY_WALLPAPER_TOP.get())
                .add(BlockRegistration.DARK_STARRY_WALLPAPER_BOTTOM.get())

                .add(BlockRegistration.RETRO_RAINBOW_WALLPAPER.get())
                .add(BlockRegistration.APPLE_WALLPAPER.get())
                .add(BlockRegistration.BLUE_ROSE_STRIPED_WALLPAPER.get())
                .add(BlockRegistration.CHECKERED_FRUIT_WALLPAPER.get())
                .add(BlockRegistration.CHECKERED_PINK_WALLPAPER.get())
                .add(BlockRegistration.CHECKERED_PINK_STRAWBERRY_WALLPAPER.get())
                .add(BlockRegistration.CHECKERED_GREEN_WALLPAPER.get())
                .add(BlockRegistration.CHECKERED_GREEN_STRAWBERRY_WALLPAPER.get())

                .add(BlockRegistration.CHIC_WALLPAPER.get())
                .add(BlockRegistration.CHIC_WALLPAPER_LOWER_TRIM.get())
                .add(BlockRegistration.CHIC_WALLPAPER_UPPER_TRIM.get())
                .add(BlockRegistration.FLORAL_BERRY_WALLPAPER.get())
                .add(BlockRegistration.FLORAL_BORDER_WALLPAPER.get())
                .add(BlockRegistration.CONFECTIONARY_WALLPAPER.get())
                .add(BlockRegistration.GHOST_WALLPAPER.get())
                .add(BlockRegistration.GHOST_WALLPAPER_TRIM.get())
                .add(BlockRegistration.GHOST_WALLPAPER_WAINSCOTING.get())

                .add(BlockRegistration.HALLOWEEN_WALLPAPER.get())
                .add(BlockRegistration.HALLOWEEN_WAINSCOTING.get())
                .add(BlockRegistration.MARIGOLD_WALLPAPER.get())
                .add(BlockRegistration.MINT_WALLPAPER.get())
                .add(BlockRegistration.PINK_STRIPE_WALLPAPER_LOWER_TRIM.get())
                .add(BlockRegistration.PINK_STRIPE_WALLPAPER.get())
                .add(BlockRegistration.PINK_STRIPE_WALLPAPER_UPPER_TRIM.get())
                .add(BlockRegistration.RIALTO_GOLD_WALLPAPER.get())
                .add(BlockRegistration.RIALTO_GOLD_WALLPAPER_TOP.get())
                .add(BlockRegistration.RIALTO_GOLD_WALLPAPER_BOTTOM.get())
                .add(BlockRegistration.STRIPED_FLORAL_WALLPAPER.get())

                .add(BlockRegistration.DIAMOND_WALLPAPER_APPLE.get())
                .add(BlockRegistration.DIAMOND_WALLPAPER_BLACKBERRY.get())
                .add(BlockRegistration.DIAMOND_WALLPAPER_BLUEBERRY.get())
                .add(BlockRegistration.DIAMOND_WALLPAPER_BONES.get())
                .add(BlockRegistration.DIAMOND_WALLPAPER_BOUQUET.get())
                .add(BlockRegistration.DIAMOND_WALLPAPER_BROWN_MUSHROOM.get())
                .add(BlockRegistration.DIAMOND_WALLPAPER_GREEN_GRAPES.get())
                .add(BlockRegistration.DIAMOND_WALLPAPER_LEMON.get())
                .add(BlockRegistration.DIAMOND_WALLPAPER_ORANGE.get())
                .add(BlockRegistration.DIAMOND_WALLPAPER_PEAR.get())
                .add(BlockRegistration.DIAMOND_WALLPAPER_PLUM.get())
                .add(BlockRegistration.DIAMOND_WALLPAPER_RED_MUSHROOM.get())
                .add(BlockRegistration.DIAMOND_WALLPAPER_PURPLE_GRAPES.get())
                .add(BlockRegistration.DIAMOND_WALLPAPER_STRAWBERRY.get())
                .add(BlockRegistration.DIAMOND_WALLPAPER_ANCHOR.get())

                .add(BlockRegistration.WICKER_BLOCK.get())
                .add(BlockRegistration.DYNASTY_DOOR.get())
                .add(BlockRegistration.WOOD_WINDOW_DIVIDED.get())
                .add(BlockRegistration.WOOD_WINDOW_PANE.get())
                .add(BlockRegistration.WOOD_PANEL_ATLANTIC.get())
                .add(BlockRegistration.WOOD_PANEL_AUGUSTINE.get())
                .add(BlockRegistration.WOOD_PANEL_ALEXANDRIA.get())
                .add(BlockRegistration.WOOD_PANEL_CANTERBURY.get())
                .add(BlockRegistration.WOOD_SCREEN_DOOR.get())
                .add(BlockRegistration.WOOD_FRENCH_DOOR.get())

                .add(BlockRegistration.BLUE_WAINSCOTING.get())
                .add(BlockRegistration.BROWN_WAINSCOTING.get());

        tag(BlockTags.WOODEN_DOORS)
                .add(BlockRegistration.WILLOW_LOG_DOOR.get())
                .add(BlockRegistration.WILLOW_GARDEN_DOOR.get())
                .add(BlockRegistration.DYNASTY_DOOR.get())
                .add(BlockRegistration.WOOD_FRENCH_DOOR.get())
                .add(BlockRegistration.WOOD_SCREEN_DOOR.get());

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(BlockRegistration.CHALCEDONY.get())
                .add(BlockRegistration.CHALCEDONY_STAIRS.get())
                .add(BlockRegistration.CHALCEDONY_SLAB.get())
                .add(BlockRegistration.POLISHED_CHALCEDONY.get())
                .add(BlockRegistration.CHALCEDONY_BRICKS.get())
                .add(BlockRegistration.CHALCEDONY_BRICK_STAIRS.get())
                .add(BlockRegistration.CHALCEDONY_BRICK_SLAB.get())
                .add(BlockRegistration.CHALCEDONY_TILES.get())
                .add(BlockRegistration.CHALCEDONY_SMALL_TILES.get())
                .add(BlockRegistration.CHISELED_CHALCEDONY.get())
                .add(BlockRegistration.CHALCEDONY_BORDER.get())
                .add(BlockRegistration.CHALCEDONY_ACANTHUS.get())
                .add(BlockRegistration.CHALCEDONY_HELIX.get())
                .add(BlockRegistration.STARRY_CHISELED_CHALCEDONY.get())
                .add(BlockRegistration.CHALCEDONY_PILLAR.get())
                .add(BlockRegistration.CHALCEDONY_PILLAR_BASE.get())
                .add(BlockRegistration.CHALCEDONY_PILLAR_DORIC.get())
                .add(BlockRegistration.CHALCEDONY_PILLAR_IONIC.get())
                .add(BlockRegistration.STARRY_CHALCEDONY_PILLAR.get())
                .add(BlockRegistration.STARRY_CHALCEDONY_PILLAR_BASE.get())
                .add(BlockRegistration.STARRY_CHALCEDONY_PILLAR_DORIC.get())
                .add(BlockRegistration.STARRY_CHALCEDONY_PILLAR_IONIC.get())
                .add(BlockRegistration.CHALCEDONY_WINDOW.get())
                .add(BlockRegistration.CHALCEDONY_WINDOW_PANE.get())

                .add(BlockRegistration.CHALCEDONY_BALUSTRADE.get())
                .add(BlockRegistration.CHALCEDONY_PICKET_FENCE.get())

                .add(BlockRegistration.CHALCEDONY_BRACKET_BOW.get())
                .add(BlockRegistration.CHALCEDONY_BRACKET_SCROLL.get())
                .add(BlockRegistration.CHALCEDONY_BRACKET_BOW_SCROLL.get())
                .add(BlockRegistration.CHALCEDONY_BRACKET_STAR.get())
                .add(BlockRegistration.CHALCEDONY_BRACKET_STAR_SCROLL.get())
                .add(BlockRegistration.CHALCEDONY_BRACKET_VICTORIAN.get())

                .add(BlockRegistration.DEEP_CHALCEDONY.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_STAIRS.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_SLAB.get())
                .add(BlockRegistration.DEEP_POLISHED_CHALCEDONY.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_BRICKS.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_BRICK_STAIRS.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_BRICK_SLAB.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_TILES.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_SMALL_TILES.get())
                .add(BlockRegistration.DEEP_CHISELED_CHALCEDONY.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_BORDER.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_ACANTHUS.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_HELIX.get())
                .add(BlockRegistration.DEEP_STARRY_CHISELED_CHALCEDONY.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_PILLAR.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_PILLAR_BASE.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_PILLAR_DORIC.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_PILLAR_IONIC.get())
                .add(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR.get())
                .add(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_BASE.get())
                .add(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_IONIC.get())
                .add(BlockRegistration.DEEP_STARRY_CHALCEDONY_PILLAR_DORIC.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_WINDOW.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_WINDOW_PANE.get())

                .add(BlockRegistration.DEEP_CHALCEDONY_BRACKET_BOW.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_BRACKET_SCROLL.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_BRACKET_BOW_SCROLL.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_BRACKET_STAR.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_BRACKET_STAR_SCROLL.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_BRACKET_VICTORIAN.get())

                .add(BlockRegistration.DEEP_CHALCEDONY_BALUSTRADE.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_PICKET_FENCE.get())

                .add(BlockRegistration.MARBLE.get())
                .add(BlockRegistration.MARBLE_STAIRS.get())
                .add(BlockRegistration.MARBLE_SLAB.get())
                .add(BlockRegistration.POLISHED_MARBLE.get())
                .add(BlockRegistration.MARBLE_BRICKS.get())
                .add(BlockRegistration.MARBLE_BRICK_STAIRS.get())
                .add(BlockRegistration.MARBLE_BRICK_SLAB.get())
                .add(BlockRegistration.MARBLE_TILES.get())
                .add(BlockRegistration.MARBLE_SMALL_TILES.get())
                .add(BlockRegistration.CHISELED_MARBLE.get())
                .add(BlockRegistration.MARBLE_BORDER.get())
                .add(BlockRegistration.MARBLE_ACANTHUS.get())
                .add(BlockRegistration.MARBLE_HELIX.get())
                .add(BlockRegistration.STARRY_CHISELED_MARBLE.get())
                .add(BlockRegistration.MARBLE_PILLAR.get())
                .add(BlockRegistration.MARBLE_PILLAR_BASE.get())
                .add(BlockRegistration.MARBLE_PILLAR_DORIC.get())
                .add(BlockRegistration.MARBLE_PILLAR_IONIC.get())

                .add(BlockRegistration.MARBLE_BRACKET_BOW.get())
                .add(BlockRegistration.MARBLE_BRACKET_SCROLL.get())
                .add(BlockRegistration.MARBLE_BRACKET_BOW_SCROLL.get())
                .add(BlockRegistration.MARBLE_BRACKET_STAR.get())
                .add(BlockRegistration.MARBLE_BRACKET_STAR_SCROLL.get())
                .add(BlockRegistration.MARBLE_BRACKET_VICTORIAN.get())

                .add(BlockRegistration.MARBLE_BALUSTRADE.get())
                .add(BlockRegistration.MARBLE_PICKET_FENCE.get())

                .add(BlockRegistration.GINGERBREAD_BRICKS.get())
                .add(BlockRegistration.GINGERBREAD_BRICK_STAIRS.get())
                .add(BlockRegistration.GINGERBREAD_BRICK_SLAB.get())
                .add(BlockRegistration.GINGERBREAD_BRICKS_SIDE.get())
                .add(BlockRegistration.GINGERBREAD_BRICKS_TOP.get())
                .add(BlockRegistration.GINGERBREAD_BRICKS_TOP_CORNER.get())

                .add(BlockRegistration.ESPERANCA_TILE.get())
                .add(BlockRegistration.HANNISH_TILE.get())
                .add(BlockRegistration.LILIY_HILLS_TILE.get())
                .add(BlockRegistration.AURA_TILES.get())
                .add(BlockRegistration.BIFURCATING_TILES.get())
                .add(BlockRegistration.BLACK_AMARYLLIS_TILES.get())
                .add(BlockRegistration.ROSETTE_TILES.get())
                .add(BlockRegistration.SEISMIC_TILES.get())

                .add(BlockRegistration.VERDANT_TILE.get())
                .add(BlockRegistration.VERDANT_TILE_EDGE.get())
                .add(BlockRegistration.VERDANT_TILE_CORNER.get())

                .add(BlockRegistration.IRIDESCENT_TILES.get())
                .add(BlockRegistration.SMALL_IRIDESCENT_TILES.get())
                .add(BlockRegistration.GREEN_TILES.get())
                .add(BlockRegistration.SMALL_GREEN_TILES.get())
                .add(BlockRegistration.YELLOW_TILES.get())
                .add(BlockRegistration.SMALL_YELLOW_TILES.get())
                .add(BlockRegistration.PINK_TILES.get())
                .add(BlockRegistration.SMALL_PINK_TILES.get())
                .add(BlockRegistration.PURPLE_TILES.get())
                .add(BlockRegistration.SMALL_PURPLE_TILES.get())
                .add(BlockRegistration.KITCHEN_TILES.get())

                .add(BlockRegistration.MARBLE_TILE.get())
                .add(BlockRegistration.MARBLE_TILE_CHISELED.get())
                .add(BlockRegistration.MARBLE_TILE_BORDER.get())
                .add(BlockRegistration.MARBLE_TILE_BORDER_DETAIL.get())
                .add(BlockRegistration.MARBLE_TILE_BORDER_CIRCLE.get())
                .add(BlockRegistration.MARBLE_TILE_CORNER.get())
                .add(BlockRegistration.MARBLE_TILE_CORNER_CIRCLE.get())

                .add(BlockRegistration.ALABASTER_WINDOW_DIVIDED.get())
                .add(BlockRegistration.ALABASTER_WINDOW_PANE.get())
                .add(BlockRegistration.ALABASTER_PANEL_ATLANTIC.get())
                .add(BlockRegistration.ALABASTER_PANEL_AUGUSTINE.get())
                .add(BlockRegistration.ALABASTER_PANEL_ALEXANDRIA.get())
                .add(BlockRegistration.ALABASTER_PANEL_CANTERBURY.get())
                .add(BlockRegistration.ALABASTER_SCREEN_DOOR.get())
                .add(BlockRegistration.ALABASTER_FRENCH_DOOR.get())
                .add(BlockRegistration.ALABASTER_WAINSCOTING.get())

                .add(BlockRegistration.COLOSSEO_PILLAR_BASE.get())
                .add(BlockRegistration.COLOSSEO_PILLAR.get())
                .add(BlockRegistration.COLOSSEO_PILLAR_TOP.get())

                .add(BlockRegistration.CHISELED_GOLD_BLOCK.get());

        tag(BlockTags.WALLS)
                //Brackets are in here because it lets them connect to glass panes and it looks really nice
                .add(BlockRegistration.MARBLE_BRACKET_BOW.get())
                .add(BlockRegistration.MARBLE_BRACKET_BOW_SCROLL.get())
                .add(BlockRegistration.MARBLE_BRACKET_VICTORIAN.get())
                .add(BlockRegistration.MARBLE_BRACKET_STAR.get())
                .add(BlockRegistration.MARBLE_BRACKET_STAR_SCROLL.get())
                .add(BlockRegistration.MARBLE_BRACKET_SCROLL.get())

                .add(BlockRegistration.CHALCEDONY_BRACKET_BOW.get())
                .add(BlockRegistration.CHALCEDONY_BRACKET_BOW_SCROLL.get())
                .add(BlockRegistration.CHALCEDONY_BRACKET_VICTORIAN.get())
                .add(BlockRegistration.CHALCEDONY_BRACKET_STAR.get())
                .add(BlockRegistration.CHALCEDONY_BRACKET_STAR_SCROLL.get())
                .add(BlockRegistration.CHALCEDONY_BRACKET_SCROLL.get())

                .add(BlockRegistration.DEEP_CHALCEDONY_BRACKET_BOW.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_BRACKET_BOW_SCROLL.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_BRACKET_VICTORIAN.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_BRACKET_STAR.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_BRACKET_STAR_SCROLL.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_BRACKET_SCROLL.get());

        tag(BlockTags.BIG_DRIPLEAF_PLACEABLE)
                .add(BlockRegistration.YELLOW_PLANTER.get())
                .add(BlockRegistration.PINK_PLANTER.get())
                .add(BlockRegistration.PURPLE_PLANTER.get())
                .add(BlockRegistration.BEIGE_PLANTER.get())
                .add(BlockRegistration.GREEN_PLANTER.get())
                .add(BlockRegistration.FLUORESCENT_PLANTER.get())
                .add(BlockRegistration.RED_PLANTER.get())
                .add(BlockRegistration.BLUE_PLANTER.get());
        tag(BlockTags.SMALL_DRIPLEAF_PLACEABLE)
                .add(BlockRegistration.YELLOW_PLANTER.get())
                .add(BlockRegistration.PINK_PLANTER.get())
                .add(BlockRegistration.PURPLE_PLANTER.get())
                .add(BlockRegistration.BEIGE_PLANTER.get())
                .add(BlockRegistration.GREEN_PLANTER.get())
                .add(BlockRegistration.FLUORESCENT_PLANTER.get())
                .add(BlockRegistration.RED_PLANTER.get())
                .add(BlockRegistration.BLUE_PLANTER.get());
        tag(BlockTags.DEAD_BUSH_MAY_PLACE_ON)
                .add(BlockRegistration.YELLOW_PLANTER.get())
                .add(BlockRegistration.PINK_PLANTER.get())
                .add(BlockRegistration.PURPLE_PLANTER.get())
                .add(BlockRegistration.BEIGE_PLANTER.get())
                .add(BlockRegistration.GREEN_PLANTER.get())
                .add(BlockRegistration.FLUORESCENT_PLANTER.get())
                .add(BlockRegistration.RED_PLANTER.get())
                .add(BlockRegistration.BLUE_PLANTER.get());
        tag(BlockTags.MUSHROOM_GROW_BLOCK)
                .add(BlockRegistration.YELLOW_PLANTER.get())
                .add(BlockRegistration.PINK_PLANTER.get())
                .add(BlockRegistration.PURPLE_PLANTER.get())
                .add(BlockRegistration.BEIGE_PLANTER.get())
                .add(BlockRegistration.GREEN_PLANTER.get())
                .add(BlockRegistration.FLUORESCENT_PLANTER.get())
                .add(BlockRegistration.RED_PLANTER.get())
                .add(BlockRegistration.BLUE_PLANTER.get());
        tag(BlockTags.BAMBOO_PLANTABLE_ON)
                .add(BlockRegistration.YELLOW_PLANTER.get())
                .add(BlockRegistration.PINK_PLANTER.get())
                .add(BlockRegistration.PURPLE_PLANTER.get())
                .add(BlockRegistration.BEIGE_PLANTER.get())
                .add(BlockRegistration.GREEN_PLANTER.get())
                .add(BlockRegistration.FLUORESCENT_PLANTER.get())
                .add(BlockRegistration.RED_PLANTER.get())
                .add(BlockRegistration.BLUE_PLANTER.get());
        tag(BlockTags.SAPLINGS)
                .add(BlockRegistration.WILLOW_SAPLING.get())
                .add(BlockRegistration.POPLAR_SAPLING.get());
        tag(BlockTags.LEAVES)
                .add(BlockRegistration.WILLOW_LEAVES.get())
                .add(BlockRegistration.POPLAR_LEAVES.get());
        tag(BlockTags.FENCES)
                .add(BlockRegistration.MARBLE_BALUSTRADE.get())
                .add(BlockRegistration.MARBLE_PICKET_FENCE.get())
                .add(BlockRegistration.CHALCEDONY_BALUSTRADE.get())
                .add(BlockRegistration.CHALCEDONY_PICKET_FENCE.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_BALUSTRADE.get())
                .add(BlockRegistration.DEEP_CHALCEDONY_PICKET_FENCE.get());
    }

    public void tagNewWoodset(String woodType){

        Block log = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_log"));
        Block wood = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_wood"));
        Block strippedLog = null;
        Block strippedWood = null;
        if (ForgeRegistries.BLOCKS.containsKey(new ResourceLocation(Cluttered.MODID + ":" + "stripped_" + woodType + "_log"))) {
            strippedLog = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + "stripped_" + woodType + "_log"));
            strippedWood = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + "stripped_" + woodType + "_wood"));
        }
        Block planks = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_planks"));
        Block stairs = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_stairs"));
        Block slab = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_slab"));
        Block fence = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_fence"));
        Block fenceGate = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_fence_gate"));
        Block button = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_button"));
        Block pressurePlate = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_pressure_plate"));
        Block door = null;
        if (ForgeRegistries.BLOCKS.containsKey(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_door"))) {
            door = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_door"));
        }
        Block trapdoor = null;
        if (ForgeRegistries.BLOCKS.containsKey(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_trapdoor"))) {
            trapdoor = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_trapdoor"));
        }
        Block window = null;
        Block pane = null;
        if (ForgeRegistries.BLOCKS.containsKey(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_window"))) {
            window = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_window"));
            pane = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_window_pane"));
        }
        Block bookshelf = null;
        if (ForgeRegistries.BLOCKS.containsKey(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_bookshelf"))) {
            bookshelf = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_bookshelf"));
        }
        Block wainscoting = null;
        if (ForgeRegistries.BLOCKS.containsKey(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_wainscoting"))) {
            wainscoting = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Cluttered.MODID + ":" + woodType + "_wainscoting"));
        }

        tag(BlockTags.LOGS)
                .add(log)
                .add(wood);
        tag(BlockTags.LOGS_THAT_BURN)
                .add(log)
                .add(wood);
        if(strippedLog != null){
            tag(BlockTags.LOGS)
                    .add(strippedLog)
                    .add(strippedWood);
            tag(BlockTags.LOGS_THAT_BURN)
                    .add(strippedLog)
                    .add(strippedWood);
            tag(BlockTags.MINEABLE_WITH_AXE)
                    .add(strippedLog)
                    .add(strippedWood);
        }
        tag(BlockTags.PLANKS)
                .add(planks);
        tag(BlockTags.STAIRS)
                .add(stairs);
        tag(BlockTags.WOODEN_STAIRS)
                .add(stairs);
        tag(BlockTags.SLABS)
                .add(slab);
        tag(BlockTags.WOODEN_SLABS)
                .add(slab);
        tag(BlockTags.FENCES)
                .add(fence);
        tag(BlockTags.WOODEN_FENCES)
                .add(fence);
        tag(BlockTags.FENCE_GATES)
                .add(fenceGate);
        tag(BlockTags.FENCE_GATES)
                .add(fenceGate);
        tag(BlockTags.BUTTONS)
                .add(button);
        tag(BlockTags.WOODEN_BUTTONS)
                .add(button);
        tag(BlockTags.PRESSURE_PLATES)
                .add(pressurePlate);
        tag(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(pressurePlate);
        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(log)
                .add(wood)
                .add(planks)
                .add(stairs)
                .add(slab)
                .add(button)
                .add(pressurePlate)
                .add(fence)
                .add(fenceGate);
        if (door != null){
            tag(BlockTags.DOORS)
                    .add(door);
            tag(BlockTags.WOODEN_DOORS)
                    .add(door);
            tag(BlockTags.MINEABLE_WITH_AXE)
                    .add(door);
        }
        if (trapdoor != null){
            tag(BlockTags.TRAPDOORS)
                    .add(trapdoor);
            tag(BlockTags.WOODEN_TRAPDOORS)
                    .add(trapdoor);
            tag(BlockTags.MINEABLE_WITH_AXE)
                    .add(trapdoor);
        }
        if (bookshelf != null){
            tag(BlockTags.ENCHANTMENT_POWER_PROVIDER)
                    .add(bookshelf);
            tag(BlockTags.MINEABLE_WITH_AXE)
                    .add(bookshelf);
        }
        if (wainscoting != null){
            tag(BlockTags.MINEABLE_WITH_AXE)
                    .add(wainscoting);
        }
        if (window != null){
            tag(BlockTags.MINEABLE_WITH_AXE)
                    .add(window)
                    .add(pane);
        }

    }
}
