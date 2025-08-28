package net.redchujelly.cluttered.util;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.redchujelly.cluttered.setup.BlockRegistration;
import net.redchujelly.cluttered.setup.TileEntityRegistration;

import java.util.HashMap;
import java.util.Map;

public class ClutteredFurnitureUpdater {
    //This class just provides the updated ID of old cluttered blocks
    private static final Map<String, Block> UPDATED_BLOCK_MAP = new HashMap<>();

    static {
        UPDATED_BLOCK_MAP.put("luphie_pink_bookshelf", BlockRegistration.CRABAPPLE_BOOKSHELF.get());
        UPDATED_BLOCK_MAP.put("luphie_pink_planks", BlockRegistration.CRABAPPLE_PLANKS.get());
        UPDATED_BLOCK_MAP.put("luphie_pink_log", BlockRegistration.CRABAPPLE_LOG.get());
        UPDATED_BLOCK_MAP.put("stripped_luphie_pink_log", BlockRegistration.STRIPPED_CRABAPPLE_LOG.get());
        UPDATED_BLOCK_MAP.put("luphie_pink_wood", BlockRegistration.CRABAPPLE_WOOD.get());
        UPDATED_BLOCK_MAP.put("stripped_luphie_pink_wood", BlockRegistration.CRABAPPLE_WOOD.get());
        UPDATED_BLOCK_MAP.put("luphie_pink_stairs", BlockRegistration.CRABAPPLE_STAIRS.get());
        UPDATED_BLOCK_MAP.put("luphie_pink_slab", BlockRegistration.CRABAPPLE_SLAB.get());
        UPDATED_BLOCK_MAP.put("luphie_pink_fence", BlockRegistration.CRABAPPLE_FENCE.get());
        UPDATED_BLOCK_MAP.put("luphie_pink_fence_gate", BlockRegistration.CRABAPPLE_FENCE_GATE.get());
        UPDATED_BLOCK_MAP.put("luphie_pink_button", BlockRegistration.CRABAPPLE_BUTTON.get());
        UPDATED_BLOCK_MAP.put("luphie_pink_pressure_plate",BlockRegistration.CRABAPPLE_PRESSURE_PLATE.get());
        UPDATED_BLOCK_MAP.put("luphie_pink_window", BlockRegistration.CRABAPPLE_WINDOW.get());
        UPDATED_BLOCK_MAP.put("luphie_pink_heart_door", BlockRegistration.CRABAPPLE_DOOR.get());
        UPDATED_BLOCK_MAP.put("luphie_pink_trapdoor", BlockRegistration.CRABAPPLE_TRAPDOOR.get());
        UPDATED_BLOCK_MAP.put("pink_tarry_town_planter", BlockRegistration.PINK_PLANTER.get());

        UPDATED_BLOCK_MAP.put("luphie_flowering_pink_bookshelf", BlockRegistration.FLOWERING_CRABAPPLE_BOOKSHELF.get());
        UPDATED_BLOCK_MAP.put("luphie_flowering_pink_planks", BlockRegistration.FLOWERING_CRABAPPLE_PLANKS.get());
        UPDATED_BLOCK_MAP.put("luphie_flowering_pink_log", BlockRegistration.FLOWERING_CRABAPPLE_LOG.get());
        UPDATED_BLOCK_MAP.put("stripped_luphie_flowering_pinklog", BlockRegistration.STRIPPED_FLOWERING_CRABAPPLE_LOG.get());
        UPDATED_BLOCK_MAP.put("luphie_flowering_pink_wood", BlockRegistration.FLOWERING_CRABAPPLE_WOOD.get());
        UPDATED_BLOCK_MAP.put("stripped_luphie_flowering_pink_wood", BlockRegistration.STRIPPED_FLOWERING_CRABAPPLE_WOOD.get());
        UPDATED_BLOCK_MAP.put("luphie_flowering_pink_stairs", BlockRegistration.FLOWERING_CRABAPPLE_STAIRS.get());
        UPDATED_BLOCK_MAP.put("luphie_flowering_pink_slab", BlockRegistration.FLOWERING_CRABAPPLE_SLAB.get());
        UPDATED_BLOCK_MAP.put("luphie_flowering_pink_fence", BlockRegistration.FLOWERING_CRABAPPLE_FENCE.get());
        UPDATED_BLOCK_MAP.put("luphie_flowering_pink_fence_gate", BlockRegistration.FLOWERING_CRABAPPLE_FENCE_GATE.get());
        UPDATED_BLOCK_MAP.put("luphie_flowering_pink_button", BlockRegistration.FLOWERING_CRABAPPLE_BUTTON.get());
        UPDATED_BLOCK_MAP.put("luphie_flowering_pink_pressure_plate", BlockRegistration.FLOWERING_WILLOW_PRESSURE_PLATE.get());
        UPDATED_BLOCK_MAP.put("luphie_flowering_pink_window", BlockRegistration.FLOWERING_CRABAPPLE_WINDOW.get());
        UPDATED_BLOCK_MAP.put("luphie_flowering_pink_heart_door", BlockRegistration.FLOWERING_CRABAPPLE_DOOR.get());
        UPDATED_BLOCK_MAP.put("luphie_flowering_pink_trapdoor", BlockRegistration.FLOWERING_CRABAPPLE_TRAPDOOR.get());

        UPDATED_BLOCK_MAP.put("luphie_purple_jar_bookshelf", BlockRegistration.WILLOW_BOOKSHELF_BOTTLES.get());
        UPDATED_BLOCK_MAP.put("luphie_purple_vase_bookshelf", BlockRegistration.WILLOW_BOOKSHELF_VASE.get());
        UPDATED_BLOCK_MAP.put("luphie_purple_cobweb_bookshelf", BlockRegistration.WILLOW_BOOKSHELF_COBWEB.get());
        UPDATED_BLOCK_MAP.put("luphie_purple_black_cat_bookshelf", BlockRegistration.WILLOW_BOOKSHELF_BLACK_CAT.get());
        UPDATED_BLOCK_MAP.put("luphie_purple_calico_cat_bookshelf", BlockRegistration.WILLOW_BOOKSHELF_CALICO_CAT.get());
        UPDATED_BLOCK_MAP.put("luphie_purple_planks", BlockRegistration.WILLOW_PLANKS.get());
        UPDATED_BLOCK_MAP.put("luphie_purple_log", BlockRegistration.WILLOW_LOG.get());
        UPDATED_BLOCK_MAP.put("stripped_luphie_purplelog", BlockRegistration.STRIPPED_WILLOW_LOG.get());
        UPDATED_BLOCK_MAP.put("luphie_purple_wood", BlockRegistration.WILLOW_WOOD.get());
        UPDATED_BLOCK_MAP.put("stripped_luphie_purple_wood", BlockRegistration.STRIPPED_WILLOW_WOOD.get());
        UPDATED_BLOCK_MAP.put("luphie_purple_stairs", BlockRegistration.WILLOW_STAIRS.get());
        UPDATED_BLOCK_MAP.put("luphie_purple_slab", BlockRegistration.WILLOW_SLAB.get());
        UPDATED_BLOCK_MAP.put("luphie_purple_fence", BlockRegistration.WILLOW_FENCE.get());
        UPDATED_BLOCK_MAP.put("luphie_purple_fence_gate", BlockRegistration.WILLOW_FENCE_GATE.get());
        UPDATED_BLOCK_MAP.put("luphie_purple_button", BlockRegistration.WILLOW_BUTTON.get());
        UPDATED_BLOCK_MAP.put("luphie_purple_pressure_plate", BlockRegistration.WILLOW_PRESSURE_PLATE.get());
        UPDATED_BLOCK_MAP.put("luphie_purple_door", BlockRegistration.WILLOW_LOG_DOOR.get());
        UPDATED_BLOCK_MAP.put("luphie_purple_iron_door", BlockRegistration.WILLOW_LOG_DOOR.get());
        UPDATED_BLOCK_MAP.put("luphie_purple_trapdoor", BlockRegistration.WILLOW_TRAPDOOR.get());
        UPDATED_BLOCK_MAP.put("purple_tarry_town_planter", BlockRegistration.PURPLE_PLANTER.get());

        UPDATED_BLOCK_MAP.put("luphie_flowering_purple_planks", BlockRegistration.FLOWERING_WILLOW_PLANKS.get());
        UPDATED_BLOCK_MAP.put("luphie_flowering_purple_log", BlockRegistration.FLOWERING_WILLOW_LOG.get());
        UPDATED_BLOCK_MAP.put("stripped_luphie_flowering_purple_log", BlockRegistration.STRIPPED_FLOWERING_WILLOW_LOG.get());
        UPDATED_BLOCK_MAP.put("luphie_flowering_purple_wood", BlockRegistration.FLOWERING_WILLOW_WOOD.get());
        UPDATED_BLOCK_MAP.put("stripped_luphie_flowering_purple_wood", BlockRegistration.STRIPPED_FLOWERING_WILLOW_WOOD.get());
        UPDATED_BLOCK_MAP.put("luphie_flowering_purple_stairs", BlockRegistration.FLOWERING_WILLOW_STAIRS.get());
        UPDATED_BLOCK_MAP.put("luphie_flowering_purple_slab", BlockRegistration.FLOWERING_WILLOW_SLAB.get());
        UPDATED_BLOCK_MAP.put("luphie_flowering_purple_fence", BlockRegistration.FLOWERING_WILLOW_FENCE.get());
        UPDATED_BLOCK_MAP.put("luphie_flowering_purple_fence_gate", BlockRegistration.FLOWERING_WILLOW_FENCE_GATE.get());
        UPDATED_BLOCK_MAP.put("luphie_flowering_purple_button", BlockRegistration.FLOWERING_WILLOW_BUTTON.get());
        UPDATED_BLOCK_MAP.put("luphie_flowering_purple_pressure_plate", BlockRegistration.FLOWERING_WILLOW_PRESSURE_PLATE.get());
        UPDATED_BLOCK_MAP.put("luphie_flowering_purple_door", BlockRegistration.FLOWERING_WILLOW_DOOR.get());
        UPDATED_BLOCK_MAP.put("luphie_flowering_purple_trapdoor", BlockRegistration.FLOWERING_WILLOW_TRAPDOOR.get());

        UPDATED_BLOCK_MAP.put("luphie_yellow_bookshelf", BlockRegistration.POPLAR_BOOKSHELF.get());
        UPDATED_BLOCK_MAP.put("luphie_yellow_planks", BlockRegistration.POPLAR_PLANKS.get());
        UPDATED_BLOCK_MAP.put("luphie_yellow_log", BlockRegistration.POPLAR_LOG.get());
        UPDATED_BLOCK_MAP.put("stripped_luphie_yellow_log", BlockRegistration.STRIPPED_POPLAR_LOG.get());
        UPDATED_BLOCK_MAP.put("luphie_yellow_wood", BlockRegistration.POPLAR_WOOD.get());
        UPDATED_BLOCK_MAP.put("stripped_luphie_yellow_wood", BlockRegistration.STRIPPED_POPLAR_WOOD.get());
        UPDATED_BLOCK_MAP.put("luphie_yellow_stairs", BlockRegistration.POPLAR_STAIRS.get());
        UPDATED_BLOCK_MAP.put("luphie_yellow_slab", BlockRegistration.POPLAR_SLAB.get());
        UPDATED_BLOCK_MAP.put("luphie_yellow_fence", BlockRegistration.POPLAR_FENCE.get());
        UPDATED_BLOCK_MAP.put("luphie_yellow_fence_gate", BlockRegistration.POPLAR_FENCE_GATE.get());
        UPDATED_BLOCK_MAP.put("luphie_yellow_button", BlockRegistration.POPLAR_BUTTON.get());
        UPDATED_BLOCK_MAP.put("luphie_yellow_pressure_plate", BlockRegistration.POPLAR_PRESSURE_PLATE.get());
        UPDATED_BLOCK_MAP.put("luphie_yellow_door", BlockRegistration.POPLAR_DOOR.get());
        UPDATED_BLOCK_MAP.put("luphie_yellow_trapdoor", BlockRegistration.POPLAR_TRAPDOOR.get());
        UPDATED_BLOCK_MAP.put("yellow_tarry_town_planter", BlockRegistration.YELLOW_PLANTER.get());

        UPDATED_BLOCK_MAP.put("luphie_flowering_yellow_bookshelf", BlockRegistration.FLOWERING_POPLAR_BOOKSHELF.get());
        UPDATED_BLOCK_MAP.put("luphie_flowering_yellow_planks", BlockRegistration.FLOWERING_POPLAR_PLANKS.get());
        UPDATED_BLOCK_MAP.put("luphie_flowering_yellow_log", BlockRegistration.FLOWERING_POPLAR_LOG.get());
        UPDATED_BLOCK_MAP.put("stripped_luphie_flowering_log", BlockRegistration.STRIPPED_FLOWERING_POPLAR_LOG.get());
        UPDATED_BLOCK_MAP.put("luphie_flowering_yellow_wood", BlockRegistration.FLOWERING_POPLAR_WOOD.get());
        UPDATED_BLOCK_MAP.put("stripped_luphie_flowering_wood", BlockRegistration.STRIPPED_FLOWERING_POPLAR_WOOD.get());
        UPDATED_BLOCK_MAP.put("luphie_flowering_yellow_stairs", BlockRegistration.FLOWERING_POPLAR_STAIRS.get());
        UPDATED_BLOCK_MAP.put("luphie_flowering_yellow_slab", BlockRegistration.FLOWERING_POPLAR_SLAB.get());
        UPDATED_BLOCK_MAP.put("luphie_flowering_yellow_fence", BlockRegistration.FLOWERING_POPLAR_FENCE.get());
        UPDATED_BLOCK_MAP.put("luphie_flowering_yellow_fence_gate", BlockRegistration.FLOWERING_POPLAR_FENCE_GATE.get());
        UPDATED_BLOCK_MAP.put("luphie_flowering_yellow_button", BlockRegistration.FLOWERING_POPLAR_BUTTON.get());
        UPDATED_BLOCK_MAP.put("luphie_flowering_yellow_pressure_plate", BlockRegistration.FLOWERING_POPLAR_PRESSURE_PLATE.get());
        UPDATED_BLOCK_MAP.put("luphie_flowering_yellow_door", BlockRegistration.FLOWERING_POPLAR_DOOR.get());
        UPDATED_BLOCK_MAP.put("luphie_flowering_yellow_trapdoor", BlockRegistration.FLOWERING_POPLAR_TRAPDOOR.get());

        UPDATED_BLOCK_MAP.put("luphie_green_bookshelf", BlockRegistration.SYCAMORE_BOOKSHELF.get());
        UPDATED_BLOCK_MAP.put("luphie_green_planks", BlockRegistration.SYCAMORE_PLANKS.get());
        UPDATED_BLOCK_MAP.put("luphie_green_log", BlockRegistration.SYCAMORE_LOG.get());
        UPDATED_BLOCK_MAP.put("stripped_luphie_green_log", BlockRegistration.STRIPPED_SYCAMORE_LOG.get());
        UPDATED_BLOCK_MAP.put("luphie_green_wood", BlockRegistration.SYCAMORE_WOOD.get());
        UPDATED_BLOCK_MAP.put("stripped_luphie_green_wood", BlockRegistration.STRIPPED_SYCAMORE_WOOD.get());
        UPDATED_BLOCK_MAP.put("luphie_green_stairs", BlockRegistration.SYCAMORE_STAIRS.get());
        UPDATED_BLOCK_MAP.put("luphie_green_slab", BlockRegistration.SYCAMORE_SLAB.get());
        UPDATED_BLOCK_MAP.put("luphie_green_fence", BlockRegistration.SYCAMORE_FENCE.get());
        UPDATED_BLOCK_MAP.put("luphie_green_fence_gate", BlockRegistration.SYCAMORE_FENCE_GATE.get());
        UPDATED_BLOCK_MAP.put("luphie_green_button", BlockRegistration.SYCAMORE_BUTTON.get());
        UPDATED_BLOCK_MAP.put("luphie_green_pressure_plate", BlockRegistration.SYCAMORE_PRESSURE_PLATE.get());
        UPDATED_BLOCK_MAP.put("luphie_green_door", BlockRegistration.SYCAMORE_DOOR.get());
        UPDATED_BLOCK_MAP.put("luphie_green_trapdoor", BlockRegistration.SYCAMORE_TRAPDOOR.get());
        UPDATED_BLOCK_MAP.put("green_tarry_town_planter", BlockRegistration.GREEN_PLANTER.get());

        UPDATED_BLOCK_MAP.put("luphie_glow_bookshelf", BlockRegistration.MAPLE_BOOKSHELF.get());
        UPDATED_BLOCK_MAP.put("luphie_glow_planks", BlockRegistration.MAPLE_PLANKS.get());
        UPDATED_BLOCK_MAP.put("luphie_glow_log", BlockRegistration.MAPLE_LOG.get());
        UPDATED_BLOCK_MAP.put("stripped_luphie_glow_log", BlockRegistration.STRIPPED_MAPLE_LOG.get());
        UPDATED_BLOCK_MAP.put("luphie_glow_wood", BlockRegistration.MAPLE_WOOD.get());
        UPDATED_BLOCK_MAP.put("stripped_luphie_glow_wood", BlockRegistration.STRIPPED_MAPLE_WOOD.get());
        UPDATED_BLOCK_MAP.put("luphie_glow_stairs", BlockRegistration.MAPLE_STAIRS.get());
        UPDATED_BLOCK_MAP.put("luphie_glow_slab", BlockRegistration.MAPLE_SLAB.get());
        UPDATED_BLOCK_MAP.put("luphie_glow_fence", BlockRegistration.MAPLE_FENCE.get());
        UPDATED_BLOCK_MAP.put("luphie_glow_fence_gate", BlockRegistration.MAPLE_FENCE_GATE.get());
        UPDATED_BLOCK_MAP.put("luphie_glow_button", BlockRegistration.MAPLE_BUTTON.get());
        UPDATED_BLOCK_MAP.put("luphie_glow_pressure_plate", BlockRegistration.MAPLE_PRESSURE_PLATE.get());
        UPDATED_BLOCK_MAP.put("luphie_glow_door", BlockRegistration.MAPLE_DOOR.get());
        UPDATED_BLOCK_MAP.put("luphie_glow_trapdoor", BlockRegistration.MAPLE_TRAPDOOR.get());
        UPDATED_BLOCK_MAP.put("glow_tarry_town_planter", BlockRegistration.FLUORESCENT_PLANTER.get());

        UPDATED_BLOCK_MAP.put("luphie_blue_mushroom_bookshelf", BlockRegistration.BLUE_MUSHROOM_BOOKSHELF.get());
        UPDATED_BLOCK_MAP.put("luphie_blue_mushroom_planks", BlockRegistration.BLUE_MUSHROOM_PLANKS.get());
        UPDATED_BLOCK_MAP.put("luphie_blue_mushroom_block", BlockRegistration.BLUE_MUSHROOM_CAP.get());
        UPDATED_BLOCK_MAP.put("luphie_decorative_blue_mushroom", BlockRegistration.BLUE_MUSHROOM_SAPLING.get());
        UPDATED_BLOCK_MAP.put("luphie_blue_mushroom_stairs", BlockRegistration.BLUE_MUSHROOM_STAIRS.get());
        UPDATED_BLOCK_MAP.put("luphie_blue_mushroom_slab", BlockRegistration.BLUE_MUSHROOM_SLAB.get());
        UPDATED_BLOCK_MAP.put("luphie_blue_mushroom_fence", BlockRegistration.BLUE_MUSHROOM_FENCE.get());
        UPDATED_BLOCK_MAP.put("luphie_blue_mushroom_fence_gate", BlockRegistration.BLUE_MUSHROOM_FENCE_GATE.get());
        UPDATED_BLOCK_MAP.put("luphie_blue_mushroom_button", BlockRegistration.BLUE_MUSHROOM_BUTTON.get());
        UPDATED_BLOCK_MAP.put("luphie_blue_mushroom_pressure_plate", BlockRegistration.BLUE_MUSHROOM_PRESSURE_PLATE.get());
        UPDATED_BLOCK_MAP.put("luphie_glowshroom_door", BlockRegistration.BLUE_MUSHROOM_DOOR.get());
        UPDATED_BLOCK_MAP.put("luphie_blue_mushroom_trapdoor", BlockRegistration.BLUE_MUSHROOM_TRAPDOOR.get());
        UPDATED_BLOCK_MAP.put("blue_mushroom_tarry_town_planter", BlockRegistration.BLUE_PLANTER.get());

        UPDATED_BLOCK_MAP.put("luphie_mushroom_bookshelf", BlockRegistration.RED_MUSHROOM_BOOKSHELF.get());
        UPDATED_BLOCK_MAP.put("luphie_decorative_mushroom_block", BlockRegistration.RED_MUSHROOM_BOOKSHELF.get());
        UPDATED_BLOCK_MAP.put("luphie_mushroom_door", BlockRegistration.RED_MUSHROOM_DOOR.get());
        UPDATED_BLOCK_MAP.put("luphie_decorative_mushroom", BlockRegistration.RED_MUSHROOM_SAPLING.get());

        //WALLPAPERS
        UPDATED_BLOCK_MAP.put("luphie_pastel_strawberry_wallpaper", BlockRegistration.FLORAL_BERRY_WALLPAPER.get());
        UPDATED_BLOCK_MAP.put("luphie_floral_striped_wallpaper", BlockRegistration.STRIPED_FLORAL_WALLPAPER.get());
        UPDATED_BLOCK_MAP.put("luphie_confectionary_wallpaper_a", BlockRegistration.BLUE_WAINSCOTING.get());
        UPDATED_BLOCK_MAP.put("luphie_confectionary_wallpaper_b", BlockRegistration.CONFECTIONARY_WALLPAPER.get());
        UPDATED_BLOCK_MAP.put("luphie_choco_mint_wallpaper_1", BlockRegistration.BROWN_WAINSCOTING.get());
        UPDATED_BLOCK_MAP.put("luphie_choco_mint_wallpaper_b", BlockRegistration.MINT_WALLPAPER.get());
        UPDATED_BLOCK_MAP.put("luphie_halloween_wallpaper_a", BlockRegistration.HALLOWEEN_WAINSCOTING.get());
        UPDATED_BLOCK_MAP.put("luphie_halloween_wallpaper_b", BlockRegistration.HALLOWEEN_WALLPAPER.get());
        UPDATED_BLOCK_MAP.put("checkeredwallpaperlime", BlockRegistration.CHECKERED_GREEN_WALLPAPER.get());
        UPDATED_BLOCK_MAP.put("checkeredstrawberrywallpaperlime", BlockRegistration.CHECKERED_GREEN_STRAWBERRY_WALLPAPER.get());
        UPDATED_BLOCK_MAP.put("checkeredwallpaperpink", BlockRegistration.CHECKERED_PINK_WALLPAPER.get());
        UPDATED_BLOCK_MAP.put("checkeredstrawberrywallpaperpink", BlockRegistration.CHECKERED_PINK_STRAWBERRY_WALLPAPER.get());
        UPDATED_BLOCK_MAP.put("anchorwallpaper", BlockRegistration.DIAMOND_WALLPAPER_ANCHOR.get());
        UPDATED_BLOCK_MAP.put("anchorwallpaperwainscot", BlockRegistration.BROWN_WAINSCOTING.get());

        //MISC
        UPDATED_BLOCK_MAP.put("luphie_dynasty_door", BlockRegistration.DYNASTY_DOOR.get());
        UPDATED_BLOCK_MAP.put("luphie_cat_window", BlockRegistration.BLACK_CAT_WINDOW.get());
        UPDATED_BLOCK_MAP.put("lily_hills_flooring", BlockRegistration.LILIY_HILLS_TILE.get());

        //KITCHEN STUFF
        UPDATED_BLOCK_MAP.put("luphie_white_counter", BlockRegistration.KITCHEN_SET_WHITE_COUNTER.get());
        UPDATED_BLOCK_MAP.put("luphie_white_sink", BlockRegistration.KITCHEN_SET_WHITE_COUNTER_SINK.get());
        UPDATED_BLOCK_MAP.put("luphie_white_inner_corner_counter", BlockRegistration.KITCHEN_SET_WHITE_COUNTER_INNER_CORNER.get());
        UPDATED_BLOCK_MAP.put("luphie_white_right_outer_corner_counter", BlockRegistration.KITCHEN_SET_WHITE_COUNTER_OUTER_CORNER_RIGHT.get());
        UPDATED_BLOCK_MAP.put("luphie_white_left_outer_corner_counter", BlockRegistration.KITCHEN_SET_WHITE_COUNTER_OUTER_CORNER_LEFT.get());
        UPDATED_BLOCK_MAP.put("luphie_white_cabinet", BlockRegistration.KITCHEN_SET_WHITE_CABINET.get());
        UPDATED_BLOCK_MAP.put("luphie_white_mini_cabinet", BlockRegistration.KITCHEN_SET_WHITE_CABINET_MINI.get());
        UPDATED_BLOCK_MAP.put("luphie_white_glass_cabinet", BlockRegistration.KITCHEN_SET_WHITE_CABINET_GLASS.get());
        UPDATED_BLOCK_MAP.put("luphie_white_shelf_cabinet", BlockRegistration.KITCHEN_SET_WHITE_CABINET_OPEN.get());
        UPDATED_BLOCK_MAP.put("luphie_white_inner_corner_cabinet", BlockRegistration.KITCHEN_SET_WHITE_CABINET_INNER_CORNER.get());
        UPDATED_BLOCK_MAP.put("luphie_white_outer_corner_cabinet", BlockRegistration.KITCHEN_SET_WHITE_CABINET_OUTER_CORNER.get());

        UPDATED_BLOCK_MAP.put("luphie_pink_counter", BlockRegistration.KITCHEN_SET_PINK_COUNTER.get());
        UPDATED_BLOCK_MAP.put("luphie_pink_sink", BlockRegistration.KITCHEN_SET_PINK_COUNTER_SINK.get());
        UPDATED_BLOCK_MAP.put("luphie_pink_inner_corner_counter", BlockRegistration.KITCHEN_SET_PINK_COUNTER_INNER_CORNER.get());
        UPDATED_BLOCK_MAP.put("luphie_pink_right_outer_corner_counter", BlockRegistration.KITCHEN_SET_PINK_COUNTER_OUTER_CORNER_RIGHT.get());
        UPDATED_BLOCK_MAP.put("luphie_pink_left_outer_corner_counter", BlockRegistration.KITCHEN_SET_PINK_COUNTER_OUTER_CORNER_LEFT.get());
        UPDATED_BLOCK_MAP.put("luphie_pink_cabinet", BlockRegistration.KITCHEN_SET_PINK_CABINET.get());
        UPDATED_BLOCK_MAP.put("luphie_pink_mini_cabinet", BlockRegistration.KITCHEN_SET_PINK_CABINET_MINI.get());
        UPDATED_BLOCK_MAP.put("luphie_pink_glass_cabinet", BlockRegistration.KITCHEN_SET_PINK_CABINET_GLASS.get());
        UPDATED_BLOCK_MAP.put("luphie_pink_shelf_cabinet", BlockRegistration.KITCHEN_SET_PINK_CABINET_OPEN.get());
        UPDATED_BLOCK_MAP.put("luphie_pink_inner_corner_cabinet", BlockRegistration.KITCHEN_SET_PINK_CABINET_INNER_CORNER.get());
        UPDATED_BLOCK_MAP.put("luphie_pink_outer_corner_cabinet", BlockRegistration.KITCHEN_SET_PINK_CABINET_OUTER_CORNER.get());
        
        UPDATED_BLOCK_MAP.put("luphie_yellow_counter", BlockRegistration.KITCHEN_SET_YELLOW_COUNTER.get());
        UPDATED_BLOCK_MAP.put("luphie_yellow_sink", BlockRegistration.KITCHEN_SET_YELLOW_COUNTER_SINK.get());
        UPDATED_BLOCK_MAP.put("luphie_yellow_inner_corner_counter", BlockRegistration.KITCHEN_SET_YELLOW_COUNTER_INNER_CORNER.get());
        UPDATED_BLOCK_MAP.put("luphie_yellow_right_outer_corner_counter", BlockRegistration.KITCHEN_SET_YELLOW_COUNTER_OUTER_CORNER_RIGHT.get());
        UPDATED_BLOCK_MAP.put("luphie_yellow_left_outer_corner_counter", BlockRegistration.KITCHEN_SET_YELLOW_COUNTER_OUTER_CORNER_LEFT.get());
        UPDATED_BLOCK_MAP.put("luphie_yellow_cabinet", BlockRegistration.KITCHEN_SET_YELLOW_CABINET.get());
        UPDATED_BLOCK_MAP.put("luphie_yellow_mini_cabinet", BlockRegistration.KITCHEN_SET_YELLOW_CABINET_MINI.get());
        UPDATED_BLOCK_MAP.put("luphie_yellow_glass_cabinet", BlockRegistration.KITCHEN_SET_YELLOW_CABINET_GLASS.get());
        UPDATED_BLOCK_MAP.put("luphie_yellow_shelf_cabinet", BlockRegistration.KITCHEN_SET_YELLOW_CABINET_OPEN.get());
        UPDATED_BLOCK_MAP.put("luphie_yellow_inner_corner_cabinet", BlockRegistration.KITCHEN_SET_YELLOW_CABINET_INNER_CORNER.get());
        UPDATED_BLOCK_MAP.put("luphie_yellow_outer_corner_cabinet", BlockRegistration.KITCHEN_SET_YELLOW_CABINET_OUTER_CORNER.get());
        
        UPDATED_BLOCK_MAP.put("luphie_light_green_counter", BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER.get());
        UPDATED_BLOCK_MAP.put("luphie_light_green_sink", BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_SINK.get());
        UPDATED_BLOCK_MAP.put("luphie_light_green_inner_corner_counter", BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_INNER_CORNER.get());
        UPDATED_BLOCK_MAP.put("luphie_light_green_right_outer_corner_counter", BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_OUTER_CORNER_RIGHT.get());
        UPDATED_BLOCK_MAP.put("luphie_light_green_left_outer_corner_counter", BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_OUTER_CORNER_LEFT.get());
        UPDATED_BLOCK_MAP.put("luphie_light_green_cabinet", BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET.get());
        UPDATED_BLOCK_MAP.put("luphie_light_green_mini_cabinet", BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_MINI.get());
        UPDATED_BLOCK_MAP.put("luphie_light_green_glass_cabinet", BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_GLASS.get());
        UPDATED_BLOCK_MAP.put("luphie_light_green_shelf_cabinet", BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_OPEN.get());
        UPDATED_BLOCK_MAP.put("luphie_light_green_inner_corner_cabinet", BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_INNER_CORNER.get());
        UPDATED_BLOCK_MAP.put("luphie_light_green_outer_corner_cabinet", BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_OUTER_CORNER.get());

        UPDATED_BLOCK_MAP.put("luphie_black_counter", BlockRegistration.KITCHEN_SET_PURPLE_COUNTER.get());
        UPDATED_BLOCK_MAP.put("luphie_black_sink", BlockRegistration.KITCHEN_SET_PURPLE_COUNTER_SINK.get());
        UPDATED_BLOCK_MAP.put("luphie_black_inner_corner_counter", BlockRegistration.KITCHEN_SET_PURPLE_COUNTER_INNER_CORNER.get());
        UPDATED_BLOCK_MAP.put("luphie_black_right_outer_corner_counter", BlockRegistration.KITCHEN_SET_PURPLE_COUNTER_OUTER_CORNER_RIGHT.get());
        UPDATED_BLOCK_MAP.put("luphie_black_left_outer_corner_counter", BlockRegistration.KITCHEN_SET_PURPLE_COUNTER_OUTER_CORNER_LEFT.get());
        UPDATED_BLOCK_MAP.put("luphie_black_cabinet", BlockRegistration.KITCHEN_SET_PURPLE_CABINET.get());
        UPDATED_BLOCK_MAP.put("luphie_black_mini_cabinet", BlockRegistration.KITCHEN_SET_PURPLE_CABINET_MINI.get());
        UPDATED_BLOCK_MAP.put("luphie_black_glass_cabinet", BlockRegistration.KITCHEN_SET_PURPLE_CABINET_GLASS.get());
        UPDATED_BLOCK_MAP.put("luphie_black_shelf_cabinet", BlockRegistration.KITCHEN_SET_PURPLE_CABINET_OPEN.get());
        UPDATED_BLOCK_MAP.put("luphie_black_inner_corner_cabinet", BlockRegistration.KITCHEN_SET_PURPLE_CABINET_INNER_CORNER.get());
        UPDATED_BLOCK_MAP.put("luphie_black_outer_corner_cabinet", BlockRegistration.KITCHEN_SET_PURPLE_CABINET_OUTER_CORNER.get());

        UPDATED_BLOCK_MAP.put("luphie_card_index", BlockRegistration.CARD_INDEX.get());
    }

    public static Block getUpdatedName(String oldName){
        return UPDATED_BLOCK_MAP.getOrDefault(oldName, null);
    }

}
