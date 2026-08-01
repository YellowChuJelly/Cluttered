package net.redchujelly.cluttered.util;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.redchujelly.cluttered.blocks.BlockRegistration;

public class FabricBlockRenderTypeMapper {
    public static void setup(){
        //CUTOUTS
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_WILLOW_SAPLING.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_POPLAR_SAPLING.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_CRABAPPLE_SAPLING.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_SYCAMORE_SAPLING.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_MAPLE_SAPLING.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_RED_MUSHROOM_SAPLING.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTTED_BLUE_MUSHROOM_SAPLING.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.WILLOW_SAPLING.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.WILLOW_VINES.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.WILLOW_GARDEN_DOOR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.WILLOW_WINDOW.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.WILLOW_WINDOW_PANE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.WILLOW_LEAVES.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FLOWERING_CARPET_WILLOW.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FLOWERING_WILLOW_WINDOW.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FLOWERING_WILLOW_WINDOW_PANE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FLOWERING_WILLOW_LEAVES.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POPLAR_SAPLING.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POPLAR_LEAVES.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FLOWERING_CARPET_POPLAR.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FLOWERING_POPLAR_LEAVES.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.CRABAPPLE_SAPLING.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.CRABAPPLE_DOOR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.CRABAPPLE_TRAPDOOR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.CRABAPPLE_WINDOW.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.CRABAPPLE_WINDOW_PANE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.CRABAPPLE_LEAVES.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FLOWERING_CARPET_CRABAPPLE.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FLOWERING_CRABAPPLE_DOOR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FLOWERING_CRABAPPLE_TRAPDOOR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FLOWERING_CRABAPPLE_WINDOW.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FLOWERING_CRABAPPLE_WINDOW_PANE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FLOWERING_CRABAPPLE_LEAVES.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.SYCAMORE_SAPLING.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.SYCAMORE_WINDOW.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.SYCAMORE_WINDOW_PANE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.SYCAMORE_LEAVES.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MAPLE_SAPLING.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MAPLE_DOOR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MAPLE_TRAPDOOR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MAPLE_WINDOW.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MAPLE_WINDOW_PANE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MAPLE_LEAVES.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MAPLE_LEAVES_FLOWERING.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BLUE_MUSHROOM_SAPLING.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BLUE_MUSHROOM_WINDOW.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BLUE_MUSHROOM_WINDOW_PANE.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.RED_MUSHROOM_WINDOW.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.RED_MUSHROOM_SAPLING.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.RED_MUSHROOM_WINDOW_PANE.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.CHALCEDONY_WINDOW.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.CHALCEDONY_WINDOW_PANE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.CHALCEDONY_BRACKET_BOW.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.CHALCEDONY_BRACKET_SCROLL.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.CHALCEDONY_BRACKET_BOW_SCROLL.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.CHALCEDONY_BRACKET_STAR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.CHALCEDONY_BRACKET_SCROLL_SHELF.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.CHALCEDONY_BRACKET_STAR_SCROLL.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.CHALCEDONY_BRACKET_VICTORIAN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.CHALCEDONY_PICKET_FENCE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.CHALCEDONY_PICKET_FENCE_GATE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.CHALCEDONY_BALUSTRADE.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DEEP_CHALCEDONY_WINDOW.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DEEP_CHALCEDONY_WINDOW_PANE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DEEP_CHALCEDONY_BRACKET_BOW.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DEEP_CHALCEDONY_BRACKET_SCROLL.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DEEP_CHALCEDONY_BRACKET_BOW_SCROLL.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DEEP_CHALCEDONY_BRACKET_STAR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DEEP_CHALCEDONY_BRACKET_SCROLL_SHELF.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DEEP_CHALCEDONY_BRACKET_STAR_SCROLL.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DEEP_CHALCEDONY_BRACKET_VICTORIAN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DEEP_CHALCEDONY_PICKET_FENCE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DEEP_CHALCEDONY_PICKET_FENCE_GATE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DEEP_CHALCEDONY_BALUSTRADE.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MARBLE_BRACKET_BOW.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MARBLE_BRACKET_SCROLL.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MARBLE_BRACKET_BOW_SCROLL.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MARBLE_BRACKET_STAR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MARBLE_BRACKET_SCROLL_SHELF.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MARBLE_BRACKET_STAR_SCROLL.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MARBLE_BRACKET_VICTORIAN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MARBLE_PICKET_FENCE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MARBLE_PICKET_FENCE_GATE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MARBLE_BALUSTRADE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ALABASTER_FRENCH_DOOR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ALABASTER_SCREEN_DOOR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ALABASTER_WINDOW_DIVIDED.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ALABASTER_WINDOW_PANE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.GREENHOUSE_WINDOW.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.GREENHOUSE_WINDOW_ARCH_LEFT.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.GREENHOUSE_WINDOW_ARCH_RIGHT.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.GREENHOUSE_WINDOW_CIRCLE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.GREENHOUSE_WINDOW_POINT.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.GREENHOUSE_WINDOW_ROUNDED.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.GREENHOUSE_WINDOW_RADIAL_LEFT.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.GREENHOUSE_WINDOW_RADIAL_RIGHT.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.WOODEN_BRACKET_BOW.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.WOODEN_BRACKET_SCROLL.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.WOODEN_BRACKET_BOW_SCROLL.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.WOODEN_BRACKET_STAR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.WOODEN_BRACKET_SCROLL_SHELF.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.WOODEN_BRACKET_STAR_SCROLL.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.WOODEN_BRACKET_VICTORIAN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.WOODEN_PICKET_FENCE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.WOODEN_PICKET_FENCE_GATE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.WOOD_FRENCH_DOOR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.WOOD_SCREEN_DOOR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.WOOD_WINDOW_DIVIDED.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.WOOD_WINDOW_PANE.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BLACK_CAT_WINDOW.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BLACK_CAT_WINDOW_PANE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DYNASTY_DOOR.get(), RenderType.cutout());

        //CUTOUTS-FURNITURE
        //LAMPS
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.HONEYCOMB_LAMP.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BEE_LAMP.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BEE_LAMP_ANGRY.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.HOPPIN_PARK_LANTERN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.SEA_GEM_LANTERN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.COLOSSEO_WALL_LANTERN.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ANTIQUE_STANDING_LAMP.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.CAGED_BULB.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.OSSON_PENDANT_WHITE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.OSSON_PENDANT_BLACK.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.OSSON_PENDANT_BROWN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.OSSON_PENDANT_RED.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.OSSON_PENDANT_ORANGE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.OSSON_PENDANT_YELLOW.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.OSSON_PENDANT_SAGE_GREEN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.OSSON_PENDANT_RACING_GREEN.get(), RenderType.cutout());

        //FRUIT SET
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.APPLE_CHAIR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.LEMON_TABLE.get(), RenderType.cutout());

        //FWISH SET
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FWISH_ARMCHAIR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FWISH_OTTOMAN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FWISH_BOOKCASE.get(), RenderType.cutout());

        //MERMAID SET
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MERMAID_PEARL.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MERMAID_DRESSER.get(), RenderType.cutout());

        //ROVER SET
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ROVER_MUG.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ROVER_STOOL.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BRIEFCASE_BLANK.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BRIEFCASE_ROVER.get(), RenderType.cutout());

        //IMPERIAL SET
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.IMPERIAL_CHAIR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.IMPERIAL_TABLE.get(), RenderType.cutout());

        //LUNAR OBSERVATORY SET
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.LUNAR_OBSERVATORY_TABLE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.LUNAR_OBSERVATORY_PEDESTAL.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.LUNAR_OBSERVATORY_BOOKS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.LUNAR_OBSERVATORY_PAPER_BASKET.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.LUNAR_OBSERVATORY_GLOBE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.LUNAR_OBSERVATORY_JARS.get(), RenderType.cutout());

        //COTTAGE SET
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.COTTAGE_CHAIR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.COTTAGE_CHAIR_CUSHIONED.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.COTTAGE_ARMCHAIR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.COTTAGE_OTTOMAN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.COTTAGE_SIDE_TABLE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.COTTAGE_STANDING_LAMP.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.COTTAGE_BOOKCASE.get(), RenderType.cutout());

        //DARKWOOD SET
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DARKWOOD_CHAIR_GEOMETRIC.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DARKWOOD_CHAIR_QUILTED.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DARKWOOD_CHAIR_SOUTHERN_FLAIR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DARKWOOD_SOFA_GEOMETRIC.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DARKWOOD_SOFA_QUILTED.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DARKWOOD_SOFA_SOUTHERN_FLAIR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DARKWOOD_DECORATIVE_SHELVES_GEOMETRIC.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DARKWOOD_DECORATIVE_SHELVES_QUILTED.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DARKWOOD_DECORATIVE_SHELVES_SOUTHERN_FLAIR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DARKWOOD_ENDTABLE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DARKWOOD_TABLE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DARKWOOD_STOOL.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DARKWOOD_CABINET.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DARKWOOD_CLOCK.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DARKWOOD_BED_GEOMETRIC.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DARKWOOD_BED_QUILTED.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DARKWOOD_BED_SOUTHERN_FLAIR.get(), RenderType.cutout());

        //PASTEL SET (ACNH)
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.WOODEN_BLOCK_BOOKSHELF_PASTEL.get(), RenderType.cutout());

        //PASTEL SET (STARBOUND)
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.PASTEL_CHAIR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.PASTEL_STOOL.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.PASTEL_TABLE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.PASTEL_LIGHT.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.PASTEL_CABINET.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.PASTEL_WARDROBE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.PASTEL_BED.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.PASTEL_PLUSH.get(), RenderType.cutout());


        //STEAMPUNK SET
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BRASS_KEY.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.STEAMPUNK_LAMP.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.STEAMPUNK_GLOBE.get(), RenderType.cutout());

        //MUSHROOM SETS
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BLUE_MUSHROOM_TABLE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BLUE_MUSHROOM_WARDROBE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BLUE_MUSHROOM_BED.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BLUE_MUSHROOM_TV.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BLUE_MUSHROOM_LAMP.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.RED_MUSHROOM_TABLE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.RED_MUSHROOM_WARDROBE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.RED_MUSHROOM_BED.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.RED_MUSHROOM_TV.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.RED_MUSHROOM_LAMP.get(), RenderType.cutout());

        //FLAGS
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MINI_FLAG_RAINBOW.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MINI_FLAG_LESBIAN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MINI_FLAG_BI.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MINI_FLAG_PAN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MINI_FLAG_ACE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MINI_FLAG_TRANS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MINI_FLAG_NONBINARY.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ANIMATED_FLAG_RAINBOW.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ANIMATED_FLAG_LESBIAN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ANIMATED_FLAG_BISEXUAL.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ANIMATED_FLAG_PANSEXUAL.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ANIMATED_FLAG_ASEXUAL.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ANIMATED_FLAG_TRANSGENDER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ANIMATED_FLAG_NONBINARY.get(), RenderType.cutout());

        //OUTDOORS
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.PICNIC_BASKET.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.PICNIC_BASKET_PREPARED.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BASKET_OF_PRODUCE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BASKET_OF_FLOWERS.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BIRDHOUSE_UNPAINTED.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BIRDHOUSE_RED.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BIRDHOUSE_BLUE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BIRDHOUSE_PASTEL.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.CUPID_BENCH.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BIKE_YELLOW.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BIKE_YELLOW_FLOWERS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BIKE_BLUE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BIKE_BLUE_FLOWERS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BIKE_PURPLE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BIKE_PURPLE_FLOWERS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BIKE_PINK.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BIKE_PINK_FLOWERS.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POK_TA_POK_HOOP.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POK_TA_POK_HOOP_SNAKES.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.WEDDING_ARCH.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.WATERING_CAN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.WATERING_CAN_COPPER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.SMALL_BUSH.get(), RenderType.cutout());

        //PLANTS
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.TWO_FLOWER_POTS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MINI_CACTUS_SET.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.SEAWEED_PLANTER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.CAT_PLANT_POT_BLACK.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.CAT_PLANT_POT_ORANGE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.HANGING_PLANT_POT_FLOWERS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.HANGING_PLANT_POT_GRASS.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.PLANT_LADDER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FENCE_SHELF.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MINI_HANGING_TERRARIUMS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MUSHROOM_JARS.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MUSHROOM_TERRARIUM_RED.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MUSHROOM_TERRARIUM_BROWN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.GLOWSHROOM_TERRARIUM_YELLOW.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.GLOWSHROOM_TERRARIUM_GREEN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.GLOWSHROOM_TERRARIUM_BLUE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.GLOWSHROOM_TERRARIUM_PURPLE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.GLOWSHROOM_TERRARIUM_PINK.get(), RenderType.cutout());



        //LIVING ROOM
        //SHELVES (LIVING ROOM SUB)
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.HANGING_SHELVES_PLANTS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.HANGING_SHELVES_POTTERY.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FLOWER_SHELF_PLANT.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FLOWER_SHELF_BLUE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FLOWER_SHELF_GREEN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FLOWER_SHELF_PASTEL_YELLOW.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FLOWER_SHELF_PINK.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FLOWER_SHELF_PURPLE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FLOWER_SHELF_YELLOW.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FLOWER_SHELF_CANDLE_BLUE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FLOWER_SHELF_CANDLE_GREEN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FLOWER_SHELF_CANDLE_PASTEL_YELLOW.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FLOWER_SHELF_CANDLE_PINK.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FLOWER_SHELF_CANDLE_PURPLE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FLOWER_SHELF_CANDLE_YELLOW.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.SMALL_SHELF.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.SMALL_SHELF_PINK.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.RECORD_PLAYER_RED.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.RECORD_PLAYER_YELLOW.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.RECORD_PLAYER_BLUE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.RECORD_PLAYER_PURPLE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.RECORD_PLAYER_PINK.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.RECORD_PLAYER_BROWN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.RECORD_PLAYER_WHITE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.TRADITIONAL_RADIO.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.UNLIVING_CHAIR.get(), RenderType.cutout());
        //LOVESEATS
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.LOVELY_LOVE_SEAT.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.LOVELY_LOVE_SEAT_BLACK.get(), RenderType.cutout());

        //ARMCHAIRS
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ARMCHAIR_WHITE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ARMCHAIR_LIGHT_GRAY.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ARMCHAIR_GRAY.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ARMCHAIR_BLACK.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ARMCHAIR_BROWN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ARMCHAIR_RED.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ARMCHAIR_ORANGE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ARMCHAIR_YELLOW.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ARMCHAIR_LIME.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ARMCHAIR_GREEN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ARMCHAIR_CYAN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ARMCHAIR_LIGHT_BLUE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ARMCHAIR_BLUE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ARMCHAIR_PURPLE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ARMCHAIR_MAGENTA.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ARMCHAIR_PINK.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ARMCHAIR_FUCHSIA.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ARMCHAIR_IVORY.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ARMCHAIR_FLOWER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ARMCHAIR_STRAWBERRY.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ARMCHAIR_HEART.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ARMCHAIR_WATERMELON.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ARMCHAIR_LEMON.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ARMCHAIR_STARRY.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ARMCHAIR_BLACK_CAT.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MADONNA_OTTOMAN.get(), RenderType.cutout());

        //TABLES (LIVING ROOM SUB)
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ANTIQUE_MINI_TABLE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.PEDESTAL_HK.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.PUZZLE_PIECE_TABLE_BLUE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.PUZZLE_PIECE_TABLE_GREEN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.PUZZLE_PIECE_TABLE_RED.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.PUZZLE_PIECE_TABLE_YELLOW.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.PUZZLE_PIECE_TABLE_PASTEL_BLUE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.PUZZLE_PIECE_TABLE_PASTEL_PINK.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.PUZZLE_PIECE_TABLE_PASTEL_PURPLE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.PUZZLE_PIECE_TABLE_PASTEL_YELLOW.get(), RenderType.cutout());

        //BEDROOM
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ROSE_END_TABLE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ROSE_END_TABLE_BLACK.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ENDTABLE_AMETHYST.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ENDTABLE_BUBBLEGUM.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ENDTABLE_CHARCOAL.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ENDTABLE_MEADOW.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ENDTABLE_PERIWINKLE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ENDTABLE_SUNSHINE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ENDTABLE_WOOD.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.NIGHTSTAND_GREEN.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ENDTABLE_DECOR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.VIOLET_SCREEN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.SAFE_NOVAKID.get(), RenderType.cutout());

        //TOYS
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.RUBIKS_CUBE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.RUBIKS_CUBE_PASTEL.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.TEDDY_BEAR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.SAND_SEAL_PLUSH_BLUE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.SAND_SEAL_PLUSH_GREEN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.SAND_SEAL_PLUSH_RED.get(), RenderType.cutout());

        //STARS?
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.HEAVENLY_ORNAMENTAL_ARRAY.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.STARS_PENDANT.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MOON_PENDANT.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MOON_DECORATION.get(), RenderType.cutout());

        //GARLANDS
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BLACK_CAT_GARLAND.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BLOSSOM_GARLAND.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BUNNY_GARLAND.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POLAROID_A_GARLAND.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POLAROID_B_GARLAND.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.SUNFLOWER_GARLAND.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.STARRY_GARLAND.get(), RenderType.cutout());

        //LIBRARY
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BAMBOO_BOOKSHELF.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.SMALL_BOOKCASE.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ANCIENT_CODEX.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ANTIQUE_BOOK_STAND.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BUNNY_BOOK_ENDS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ROW_OF_SMALL_BOOKS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ROW_OF_SMALL_BOOKS_PASTEL.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ROW_OF_SMALL_BOOKS_SHELVED.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ROW_OF_SMALL_BOOKS_PASTEL_SHELVED.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BOOK_OPEN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.STACK_OF_BOOKS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.STACK_OF_BOOKS_TALL.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ANTIQUE_LIBRARY_BOOKS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.RITO_BOOKS.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ANTIQUE_MAP.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.NEWSPAPER_PILE_SHORT.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.NEWSPAPER_PILE_TALL.get(), RenderType.cutout());

        //OFFICE
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.SCATTERED_PAPERS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.PAPER_PILE.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.OFFICE_SUPPLIES_A.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.OFFICE_SUPPLIES_B.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ENVELOPE_STACK.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.YELLOW_NOTEPAD.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.SKETCHBOOK_SINGLE.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.CARDBOARD_BOX.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FILING_BOX.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BULLETIN_BOARD.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BULLETIN_BOARD_CLUTTERED.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.CARD_INDEX.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DESK_GREEN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DESK_BROWN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DESK_GREEN_CLUTTERED.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DESK_BROWN_CLUTTERED.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FLOWER_DESK_LAMP.get(), RenderType.cutout());

        //POLAROIDS
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POLAROID_CAMERA.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POLAROIDS_A.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POLAROIDS_B.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POLAROIDS_C.get(), RenderType.cutout());

        //PAINTING
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BOX_OF_PAINTS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.PAINT_WATER_JAR.get(), RenderType.cutout());

        //SEWING
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.SEWING_MANNEQUIN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.SEWING_MACHINE_ANTIQUE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.SEWING_TABLE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.SEWING_CLUTTER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.SCISSORS_AND_THREAD.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FABRIC_BOLTS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.THREAD_SPOOL_YELLOW.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.THREAD_SPOOL_GREEN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.THREAD_SPOOL_PURPLE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.THREAD_SPOOL_PINK.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BUTTON_STOOL.get(), RenderType.cutout());

        //POTIONS
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.CAULDRON_POSTER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.SMALL_CAULDRON.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.VIAL_STAND.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POTION_SHELF.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.RETRO_CAFE_SHELF.get(), RenderType.cutout());

        //KITCHEN
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_BROWN_COUNTER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_BROWN_COUNTER_INNER_CORNER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_BROWN_COUNTER_OUTER_CORNER_RIGHT.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_BROWN_COUNTER_OUTER_CORNER_LEFT.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_BROWN_COUNTER_SINK.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_BROWN_CABINET.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_BROWN_CABINET_MINI.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_BROWN_CABINET_GLASS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_BROWN_CABINET_OPEN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_BROWN_CABINET_INNER_CORNER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_BROWN_CABINET_OUTER_CORNER.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_INNER_CORNER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_OUTER_CORNER_RIGHT.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_OUTER_CORNER_LEFT.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_SINK.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_MINI.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_GLASS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_OPEN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_INNER_CORNER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_OUTER_CORNER.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_PINK_COUNTER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_PINK_COUNTER_INNER_CORNER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_PINK_COUNTER_OUTER_CORNER_RIGHT.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_PINK_COUNTER_OUTER_CORNER_LEFT.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_PINK_COUNTER_SINK.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_PINK_CABINET.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_PINK_CABINET_MINI.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_PINK_CABINET_GLASS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_PINK_CABINET_OPEN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_PINK_CABINET_INNER_CORNER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_PINK_CABINET_OUTER_CORNER.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_PURPLE_COUNTER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_PURPLE_COUNTER_INNER_CORNER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_PURPLE_COUNTER_OUTER_CORNER_RIGHT.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_PURPLE_COUNTER_OUTER_CORNER_LEFT.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_PURPLE_COUNTER_SINK.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_PURPLE_CABINET.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_PURPLE_CABINET_MINI.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_PURPLE_CABINET_GLASS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_PURPLE_CABINET_OPEN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_PURPLE_CABINET_INNER_CORNER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_PURPLE_CABINET_OUTER_CORNER.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_WHITE_COUNTER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_WHITE_COUNTER_INNER_CORNER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_WHITE_COUNTER_OUTER_CORNER_RIGHT.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_WHITE_COUNTER_OUTER_CORNER_LEFT.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_WHITE_COUNTER_SINK.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_WHITE_CABINET.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_WHITE_CABINET_MINI.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_WHITE_CABINET_GLASS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_WHITE_CABINET_OPEN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_WHITE_CABINET_INNER_CORNER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_WHITE_CABINET_OUTER_CORNER.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_YELLOW_COUNTER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_YELLOW_COUNTER_INNER_CORNER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_YELLOW_COUNTER_OUTER_CORNER_RIGHT.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_YELLOW_COUNTER_OUTER_CORNER_LEFT.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_YELLOW_COUNTER_SINK.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_YELLOW_CABINET.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_YELLOW_CABINET_MINI.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_YELLOW_CABINET_GLASS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_YELLOW_CABINET_OPEN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_YELLOW_CABINET_INNER_CORNER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SET_YELLOW_CABINET_OUTER_CORNER.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BLACK_CAT_COUNTER_DRAWERS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BLACK_CAT_COUNTER_LEFT_DOOR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BLACK_CAT_COUNTER_RIGHT_DOOR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BLACK_CAT_SINK.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BLACK_CAT_TABLE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.SWEETHEART_COUNTER_DRAWERS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.SWEETHEART_COUNTER_LEFT_DOOR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.SWEETHEART_COUNTER_RIGHT_DOOR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.SWEETHEART_SINK.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.SWEETHEART_TABLE.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.TABLE_PLAIN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.TABLE_TABLECLOTH.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.CONFECTIONERY_TABLE_BLUE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.CONFECTIONERY_TABLE_PINK.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DORADO_CABINET.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DORADO_CABINET_CLUTTERED.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.HAVANA_CABINET.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.HAVANA_CABINET_CLUTTERED.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MUREX_CABINET.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.MUREX_CABINET_CLUTTERED.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.CHINA_CABINET.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.GENERAL_STORE_CABINET.get(), RenderType.cutout());


        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.RETRO_FRIDGE_BLACK.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.RETRO_FRIDGE_BLUE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.RETRO_FRIDGE_PINK.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.RETRO_FRIDGE_PURPLE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.RETRO_FRIDGE_RED.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.RETRO_FRIDGE_TURQUOISE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.RETRO_FRIDGE_WHITE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.RETRO_FRIDGE_YELLOW.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.RETRO_TOASTER_BLACK.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.RETRO_TOASTER_BLUE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.RETRO_TOASTER_PINK.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.RETRO_TOASTER_PURPLE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.RETRO_TOASTER_RED.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.RETRO_TOASTER_TURQUOISE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.RETRO_TOASTER_WHITE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.RETRO_TOASTER_YELLOW.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.TARRY_TOWN_STOVE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FLOWER_TEA_KETTLE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.COFFEE_GRINDER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.KITCHEN_SCALE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.HANGING_CLOTH.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.SWEETHEART_BAKING_SET_BOWL.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.SWEETHEART_BAKING_SET_INGREDIENTS.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.DRYING_HERBS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.SALT_PEPPER_SHAKERS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ASSORTED_SPICE_JARS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.JAM_JARS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.ASSORTED_GLASS_JARS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.SMALL_GLASS_JARS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.WINE_BOTTLES.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.WINE_BOTTLE_RACK.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.SELTZER_CANS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.CAT_MUGS_CLUTTERED.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.SLICED_BREAD.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.PINEAPPLE.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.HEART_CAKE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BERRY_CAKE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.CHOCOLATE_CROISSANT.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.BLUEBERRY_MUFFIN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.CINNAMON_BUN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.CROISSANT.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.PANCAKE_STACK.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.HAM_SANDWICH.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.PASTRY_PLATE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.PASTRY_DISPLAY_CASE.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.GUMBALL_MACHINE_RED.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.GUMBALL_MACHINE_BLUE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.GUMBALL_MACHINE_PURPLE.get(), RenderType.cutout());


        //TRANSLUCENTS
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POPLAR_DOOR.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POPLAR_TRAPDOOR.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POPLAR_WINDOW.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.POPLAR_WINDOW_PANE.get(), RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FLOWERING_POPLAR_DOOR.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FLOWERING_POPLAR_TRAPDOOR.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FLOWERING_POPLAR_WINDOW.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.FLOWERING_POPLAR_WINDOW_PANE.get(), RenderType.translucent());

        //TRANSLUCENTS FURNITURE
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.STAINED_GLASS_LAMP.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.GLASS_FLOWER_VASE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistration.RETRO_CAFE_SHELF_WINDOW.get(), RenderType.translucent());


    }
}
