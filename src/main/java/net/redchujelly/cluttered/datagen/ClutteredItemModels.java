package net.redchujelly.cluttered.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.redchujelly.cluttered.Cluttered;
import net.redchujelly.cluttered.setup.BlockRegistration;
import net.redchujelly.cluttered.setup.ItemRegistration;

public class ClutteredItemModels extends ItemModelProvider {
    public ClutteredItemModels(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Cluttered.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        fenceItem(BlockRegistration.WILLOW_FENCE, BlockRegistration.WILLOW_PLANKS);
        buttonItem(BlockRegistration.WILLOW_BUTTON, BlockRegistration.WILLOW_PLANKS);
        simplePaneBlockItem(BlockRegistration.WILLOW_WINDOW_PANE).renderType("cutout");
        simpleBlockItem(BlockRegistration.WILLOW_DOOR);
        simpleBlockItem(BlockRegistration.WILLOW_LOG_DOOR);
        simpleBlockItem(BlockRegistration.WILLOW_GARDEN_DOOR).renderType("cutout");
        simplePaneBlockItem(BlockRegistration.WILLOW_SAPLING).renderType("cutout");


        fenceItem(BlockRegistration.FLOWERING_WILLOW_FENCE, BlockRegistration.FLOWERING_WILLOW_PLANKS);
        buttonItem(BlockRegistration.FLOWERING_WILLOW_BUTTON, BlockRegistration.FLOWERING_WILLOW_PLANKS);
        simplePaneBlockItem(BlockRegistration.FLOWERING_WILLOW_WINDOW_PANE).renderType("cutout");
        simpleBlockItem(BlockRegistration.FLOWERING_WILLOW_DOOR);

        fenceItem(BlockRegistration.POPLAR_FENCE, BlockRegistration.POPLAR_PLANKS);
        buttonItem(BlockRegistration.POPLAR_BUTTON, BlockRegistration.POPLAR_PLANKS);
        simpleBlockItem(BlockRegistration.POPLAR_DOOR).renderType("translucent");
        simplePaneBlockItem(BlockRegistration.POPLAR_WINDOW_PANE).renderType("translucent");
        simplePaneBlockItem(BlockRegistration.POPLAR_SAPLING).renderType("cutout");

        fenceItem(BlockRegistration.FLOWERING_POPLAR_FENCE, BlockRegistration.FLOWERING_POPLAR_PLANKS);
        buttonItem(BlockRegistration.FLOWERING_POPLAR_BUTTON, BlockRegistration.FLOWERING_POPLAR_PLANKS);
        simpleBlockItem(BlockRegistration.FLOWERING_POPLAR_DOOR).renderType("translucent");
        simplePaneBlockItem(BlockRegistration.FLOWERING_POPLAR_WINDOW_PANE).renderType("translucent");

        fenceItem(BlockRegistration.CRABAPPLE_FENCE, BlockRegistration.CRABAPPLE_PLANKS);
        buttonItem(BlockRegistration.CRABAPPLE_BUTTON, BlockRegistration.CRABAPPLE_PLANKS);
        simpleBlockItem(BlockRegistration.CRABAPPLE_DOOR).renderType("cutout");
        simplePaneBlockItem(BlockRegistration.CRABAPPLE_WINDOW_PANE).renderType("cutout");

        fenceItem(BlockRegistration.FLOWERING_CRABAPPLE_FENCE, BlockRegistration.FLOWERING_CRABAPPLE_PLANKS);
        buttonItem(BlockRegistration.FLOWERING_CRABAPPLE_BUTTON, BlockRegistration.FLOWERING_CRABAPPLE_PLANKS);
        simpleBlockItem(BlockRegistration.FLOWERING_CRABAPPLE_DOOR).renderType("cutout");
        simplePaneBlockItem(BlockRegistration.FLOWERING_CRABAPPLE_WINDOW_PANE).renderType("cutout");

        fenceItem(BlockRegistration.SYCAMORE_FENCE, BlockRegistration.SYCAMORE_PLANKS);
        buttonItem(BlockRegistration.SYCAMORE_BUTTON, BlockRegistration.SYCAMORE_PLANKS);
        simpleBlockItem(BlockRegistration.SYCAMORE_DOOR);
        simplePaneBlockItem(BlockRegistration.SYCAMORE_WINDOW_PANE).renderType("cutout");

        fenceItem(BlockRegistration.MAPLE_FENCE, BlockRegistration.MAPLE_PLANKS);
        buttonItem(BlockRegistration.MAPLE_BUTTON, BlockRegistration.MAPLE_PLANKS);
        simpleBlockItem(BlockRegistration.MAPLE_DOOR).renderType("cutout");
        simplePaneBlockItem(BlockRegistration.MAPLE_WINDOW_PANE).renderType("cutout");

        fenceItem(BlockRegistration.BLUE_MUSHROOM_FENCE, BlockRegistration.BLUE_MUSHROOM_PLANKS);
        buttonItem(BlockRegistration.BLUE_MUSHROOM_BUTTON, BlockRegistration.BLUE_MUSHROOM_PLANKS);
        simpleBlockItem(BlockRegistration.BLUE_MUSHROOM_DOOR);
        simplePaneBlockItem(BlockRegistration.BLUE_MUSHROOM_WINDOW_PANE);
        simplePaneBlockItem(BlockRegistration.BLUE_MUSHROOM_SAPLING).renderType("cutout");

        fenceItem(BlockRegistration.RED_MUSHROOM_FENCE, BlockRegistration.RED_MUSHROOM_PLANKS);
        buttonItem(BlockRegistration.RED_MUSHROOM_BUTTON, BlockRegistration.RED_MUSHROOM_PLANKS);
        simpleBlockItem(BlockRegistration.RED_MUSHROOM_DOOR);
        simplePaneBlockItem(BlockRegistration.RED_MUSHROOM_WINDOW_PANE);

        basicItem(ItemRegistration.HAND_DRILL.get());

        simplePaneBlockItem(BlockRegistration.CHALCEDONY_WINDOW_PANE).renderType("cutout");
        simplePaneBlockItem(BlockRegistration.DEEP_CHALCEDONY_WINDOW_PANE).renderType("cutout");
        simplePaneBlockItem(BlockRegistration.ALABASTER_WINDOW_PANE, "_divided").renderType("cutout");
        simplePaneBlockItem(BlockRegistration.WOOD_WINDOW_PANE, "_divided").renderType("cutout");


        simplePaneBlockItem(BlockRegistration.BLACK_CAT_WINDOW_PANE).renderType("cutout");
        simpleBlockItem(BlockRegistration.DYNASTY_DOOR);
        simpleBlockItem(BlockRegistration.ALABASTER_FRENCH_DOOR).renderType("cutout");
        simpleBlockItem(BlockRegistration.ALABASTER_SCREEN_DOOR).renderType("cutout");
        simpleBlockItem(BlockRegistration.WOOD_FRENCH_DOOR).renderType("cutout");
        simpleBlockItem(BlockRegistration.WOOD_SCREEN_DOOR).renderType("cutout");
        simpleBlockItem(BlockRegistration.ART_NOUVEAU_DOOR);
        simpleBlockItem(BlockRegistration.ART_NOUVEAU_DOOR_DARK);

        balustradeItem(BlockRegistration.MARBLE_BALUSTRADE);
        balustradeItem(BlockRegistration.CHALCEDONY_BALUSTRADE);
        balustradeItem(BlockRegistration.DEEP_CHALCEDONY_BALUSTRADE);
        picketFenceItem(BlockRegistration.MARBLE_PICKET_FENCE);
        picketFenceItem(BlockRegistration.CHALCEDONY_PICKET_FENCE);
        picketFenceItem(BlockRegistration.DEEP_CHALCEDONY_PICKET_FENCE);

        bracketItem(BlockRegistration.DEEP_CHALCEDONY_BRACKET_BOW_SCROLL);
        bracketItem(BlockRegistration.DEEP_CHALCEDONY_BRACKET_BOW);
        bracketItem(BlockRegistration.DEEP_CHALCEDONY_BRACKET_SCROLL);
        bracketItem(BlockRegistration.DEEP_CHALCEDONY_BRACKET_STAR);
        bracketItem(BlockRegistration.DEEP_CHALCEDONY_BRACKET_VICTORIAN);
        bracketItem(BlockRegistration.DEEP_CHALCEDONY_BRACKET_STAR_SCROLL);

        bracketItem(BlockRegistration.CHALCEDONY_BRACKET_BOW_SCROLL);
        bracketItem(BlockRegistration.CHALCEDONY_BRACKET_BOW);
        bracketItem(BlockRegistration.CHALCEDONY_BRACKET_SCROLL);
        bracketItem(BlockRegistration.CHALCEDONY_BRACKET_STAR);
        bracketItem(BlockRegistration.CHALCEDONY_BRACKET_VICTORIAN);
        bracketItem(BlockRegistration.CHALCEDONY_BRACKET_STAR_SCROLL);

        bracketItem(BlockRegistration.MARBLE_BRACKET_BOW_SCROLL);
        bracketItem(BlockRegistration.MARBLE_BRACKET_BOW);
        bracketItem(BlockRegistration.MARBLE_BRACKET_SCROLL);
        bracketItem(BlockRegistration.MARBLE_BRACKET_STAR);
        bracketItem(BlockRegistration.MARBLE_BRACKET_VICTORIAN);
        bracketItem(BlockRegistration.MARBLE_BRACKET_STAR_SCROLL);

        standardCubeItem(BlockRegistration.FISH_WALLPAPER, "fish_wallpaper_1");


        //FURNITURE
        blockitemFromModel(BlockRegistration.APPLE_CHAIR);

        blockitemFromModel(BlockRegistration.BIRDHOUSE_UNPAINTED);
        blockitemFromModel(BlockRegistration.BIRDHOUSE_RED);
        blockitemFromModel(BlockRegistration.BIRDHOUSE_BLUE);
        blockitemFromModel(BlockRegistration.BIRDHOUSE_PASTEL);
        blockitemFromModel(BlockRegistration.BRIEFCASE_BLANK);
        blockitemFromModel(BlockRegistration.BRIEFCASE_ROVER);
        blockitemFromModel(BlockRegistration.BOX_OF_PAINTS);
        blockitemFromModel(BlockRegistration.BUNNY_BOOK_ENDS);
        blockitemFromModel(BlockRegistration.BUTTON_STOOL);
        blockitemFromModel(BlockRegistration.KITCHEN_SCALE);
        blockitemFromModel(BlockRegistration.ANTIQUE_MAP);
        blockitemFromModel(BlockRegistration.ANTIQUE_MINI_TABLE);
        blockitemFromModel(BlockRegistration.ANCIENT_CODEX);
        blockitemFromModel(BlockRegistration.ANTIQUE_BOOK_STAND);
        blockitemFromModel(BlockRegistration.ANTIQUE_LIBRARY_BOOKS);
        blockitemFromModel(BlockRegistration.BEE_LAMP);
        blockitemFromModel(BlockRegistration.BEE_LAMP_ANGRY);
        blockitemFromModel(BlockRegistration.RECORD_PLAYER_WHITE);
        blockitemFromModel(BlockRegistration.RECORD_PLAYER_YELLOW);
        blockitemFromModel(BlockRegistration.RECORD_PLAYER_RED);
        blockitemFromModel(BlockRegistration.RECORD_PLAYER_BROWN);
        blockitemFromModel(BlockRegistration.RECORD_PLAYER_PURPLE);
        blockitemFromModel(BlockRegistration.RECORD_PLAYER_PINK);
        blockitemFromModel(BlockRegistration.RECORD_PLAYER_BLUE );
        blockitemFromModel(BlockRegistration.CARDBOARD_BOX_CLOSED);
        blockitemFromModel(BlockRegistration.CARDBOARD_BOX_OPEN);
        blockitemFromModel(BlockRegistration.CARDBOARD_BOX_CLUTTERED);

        //KITCHEN SETS
        blockitemFromModel(BlockRegistration.KITCHEN_SET_BROWN_CABINET);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_BROWN_CABINET_MINI);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_BROWN_CABINET_GLASS);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_BROWN_CABINET_OPEN);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_BROWN_CABINET_INNER_CORNER);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_BROWN_CABINET_OUTER_CORNER);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_BROWN_COUNTER);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_BROWN_COUNTER_INNER_CORNER);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_BROWN_COUNTER_OUTER_CORNER_RIGHT);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_BROWN_COUNTER_OUTER_CORNER_LEFT);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_BROWN_COUNTER_SINK);

        blockitemFromModel(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_MINI);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_GLASS);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_OPEN);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_INNER_CORNER);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_CABINET_OUTER_CORNER);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_INNER_CORNER);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_OUTER_CORNER_RIGHT);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_OUTER_CORNER_LEFT);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_LIGHT_GREEN_COUNTER_SINK);

        blockitemFromModel(BlockRegistration.KITCHEN_SET_PINK_CABINET);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_PINK_CABINET_MINI);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_PINK_CABINET_GLASS);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_PINK_CABINET_OPEN);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_PINK_CABINET_INNER_CORNER);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_PINK_CABINET_OUTER_CORNER);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_PINK_COUNTER);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_PINK_COUNTER_INNER_CORNER);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_PINK_COUNTER_OUTER_CORNER_RIGHT);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_PINK_COUNTER_OUTER_CORNER_LEFT);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_PINK_COUNTER_SINK);

        blockitemFromModel(BlockRegistration.KITCHEN_SET_PURPLE_CABINET);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_PURPLE_CABINET_MINI);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_PURPLE_CABINET_GLASS);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_PURPLE_CABINET_OPEN);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_PURPLE_CABINET_INNER_CORNER);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_PURPLE_CABINET_OUTER_CORNER);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_PURPLE_COUNTER);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_PURPLE_COUNTER_INNER_CORNER);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_PURPLE_COUNTER_OUTER_CORNER_RIGHT);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_PURPLE_COUNTER_OUTER_CORNER_LEFT);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_PURPLE_COUNTER_SINK);

        blockitemFromModel(BlockRegistration.KITCHEN_SET_WHITE_CABINET);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_WHITE_CABINET_MINI);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_WHITE_CABINET_GLASS);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_WHITE_CABINET_OPEN);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_WHITE_CABINET_INNER_CORNER);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_WHITE_CABINET_OUTER_CORNER);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_WHITE_COUNTER);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_WHITE_COUNTER_INNER_CORNER);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_WHITE_COUNTER_OUTER_CORNER_RIGHT);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_WHITE_COUNTER_OUTER_CORNER_LEFT);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_WHITE_COUNTER_SINK);

        blockitemFromModel(BlockRegistration.KITCHEN_SET_YELLOW_CABINET);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_YELLOW_CABINET_MINI);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_YELLOW_CABINET_GLASS);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_YELLOW_CABINET_OPEN);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_YELLOW_CABINET_INNER_CORNER);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_YELLOW_CABINET_OUTER_CORNER);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_YELLOW_COUNTER);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_YELLOW_COUNTER_INNER_CORNER);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_YELLOW_COUNTER_OUTER_CORNER_RIGHT);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_YELLOW_COUNTER_OUTER_CORNER_LEFT);
        blockitemFromModel(BlockRegistration.KITCHEN_SET_YELLOW_COUNTER_SINK);


        blockitemFromModel(BlockRegistration.BIKE_YELLOW);
        blockitemFromModel(BlockRegistration.BIKE_YELLOW_FLOWERS);
        blockitemFromModel(BlockRegistration.BIKE_BLUE);
        blockitemFromModel(BlockRegistration.BIKE_BLUE_FLOWERS);
        blockitemFromModel(BlockRegistration.BIKE_PURPLE);
        blockitemFromModel(BlockRegistration.BIKE_PURPLE_FLOWERS);
        blockitemFromModel(BlockRegistration.BIKE_PINK);
        blockitemFromModel(BlockRegistration.BIKE_PINK_FLOWERS);

        blockitemFromModel(BlockRegistration.CAT_MUGS_CLUTTERED);
        blockitemFromModel(BlockRegistration.CAT_PLANT_POT_BLACK);
        blockitemFromModel(BlockRegistration.CAT_PLANT_POT_ORANGE);
        blockitemFromModel(BlockRegistration.COFFEE_GRINDER);
        simplePaneBlockItem(BlockRegistration.CAULDRON_POSTER);

        blockitemFromModel(BlockRegistration.COTTAGE_SIDE_TABLE);
        blockitemFromModel(BlockRegistration.ENDTABLE_AMETHYST);
        blockitemFromModel(BlockRegistration.ENDTABLE_BUBBLEGUM);
        blockitemFromModel(BlockRegistration.ENDTABLE_CHARCOAL);
        blockitemFromModel(BlockRegistration.ENDTABLE_MEADOW);
        blockitemFromModel(BlockRegistration.ENDTABLE_PERIWINKLE);
        blockitemFromModel(BlockRegistration.ENDTABLE_SUNSHINE);
        blockitemFromModel(BlockRegistration.ENDTABLE_WOOD);
        blockitemFromModel(BlockRegistration.NIGHTSTAND_GREEN);
        blockitemFromModel(BlockRegistration.ENDTABLE_DECOR);

        blockitemFromModel(BlockRegistration.COTTAGE_CHAIR);
        blockitemFromModel(BlockRegistration.COTTAGE_CHAIR_CUSHIONED);
        blockitemFromModel(BlockRegistration.COTTAGE_OTTOMAN);
        blockitemFromModel(BlockRegistration.MADONNA_OTTOMAN);

        blockitemFromModel(BlockRegistration.GLOWSHROOM_TERRARIUM_YELLOW);
        blockitemFromModel(BlockRegistration.GLOWSHROOM_TERRARIUM_GREEN);
        blockitemFromModel(BlockRegistration.GLOWSHROOM_TERRARIUM_BLUE);
        blockitemFromModel(BlockRegistration.GLOWSHROOM_TERRARIUM_PURPLE);
        blockitemFromModel(BlockRegistration.GLOWSHROOM_TERRARIUM_PINK);
        blockitemFromModel(BlockRegistration.MUSHROOM_TERRARIUM_RED);
        blockitemFromModel(BlockRegistration.MUSHROOM_TERRARIUM_BROWN);

        blockitemFromModel(BlockRegistration.GUMBALL_MACHINE_RED);
        blockitemFromModel(BlockRegistration.GUMBALL_MACHINE_BLUE);
        blockitemFromModel(BlockRegistration.GUMBALL_MACHINE_PURPLE);
        blockitemFromModel(BlockRegistration.MINI_CACTUS_SET);
        blockitemFromModel(BlockRegistration.MUSHROOM_JARS);
        blockitemFromModel(BlockRegistration.NEWSPAPER_PILE_SHORT);
        blockitemFromModel(BlockRegistration.NEWSPAPER_PILE_TALL);
        blockitemFromModel(BlockRegistration.PAPER_PILE);

        blockitemFromModel(BlockRegistration.FENCE_SHELF);
        blockitemFromModel(BlockRegistration.HANGING_PLANT_POT_FLOWERS);
        blockitemFromModel(BlockRegistration.HANGING_PLANT_POT_GRASS);
        blockitemFromModel(BlockRegistration.PEDESTAL_HK);
        blockitemFromModel(BlockRegistration.PICNIC_BASKET);
        blockitemFromModel(BlockRegistration.PICNIC_BASKET_PREPARED);
        blockitemFromModel(BlockRegistration.BASKET_OF_PRODUCE);
        blockitemFromModel(BlockRegistration.BASKET_OF_FLOWERS);

        blockitemFromModel(BlockRegistration.ROVER_STOOL);
        blockitemFromModel(BlockRegistration.RUBIKS_CUBE);
        blockitemFromModel(BlockRegistration.RUBIKS_CUBE_PASTEL);
        blockitemFromModel(BlockRegistration.ROW_OF_SMALL_BOOKS);
        blockitemFromModel(BlockRegistration.ROW_OF_SMALL_BOOKS_PASTEL);
        blockitemFromModel(BlockRegistration.SCATTERED_PAPERS);
        blockitemFromModel(BlockRegistration.SEWING_MACHINE_ANTIQUE);
        blockitemFromModel(BlockRegistration.ROW_OF_SMALL_BOOKS_SHELVED);
        blockitemFromModel(BlockRegistration.ROW_OF_SMALL_BOOKS_PASTEL_SHELVED);
        blockitemFromModel(BlockRegistration.STAINED_GLASS_LAMP);
        blockitemFromModel(BlockRegistration.SMALL_BUSH);
        blockitemFromModel(BlockRegistration.TEDDY_BEAR);
        blockitemFromModel(BlockRegistration.SMALL_SHELF);
        blockitemFromModel(BlockRegistration.SMALL_SHELF_PINK);
        blockitemFromModel(BlockRegistration.TWO_FLOWER_POTS);
        blockitemFromModel(BlockRegistration.TRADITIONAL_RADIO);
        blockitemFromModel(BlockRegistration.SEWING_MANNEQUIN);

        blockitemFromModel(BlockRegistration.OSSON_PENDANT_BLACK);
        blockitemFromModel(BlockRegistration.OSSON_PENDANT_BROWN);
        blockitemFromModel(BlockRegistration.OSSON_PENDANT_ORANGE);
        blockitemFromModel(BlockRegistration.OSSON_PENDANT_RACING_GREEN);
        blockitemFromModel(BlockRegistration.OSSON_PENDANT_SAGE_GREEN);
        blockitemFromModel(BlockRegistration.OSSON_PENDANT_RED);
        blockitemFromModel(BlockRegistration.OSSON_PENDANT_YELLOW);
        blockitemFromModel(BlockRegistration.OSSON_PENDANT_WHITE);

        simplePaneBlockItem(BlockRegistration.STARS_PENDANT);
        simplePaneBlockItem(BlockRegistration.MOON_PENDANT);
        simplePaneBlockItem(BlockRegistration.MOON_DECORATION);
        blockitemFromModel(BlockRegistration.POLAROIDS_A);
        blockitemFromModel(BlockRegistration.CAGED_BULB);
        blockitemFromModel(BlockRegistration.COLOSSEO_WALL_LANTERN);
        blockitemFromModel(BlockRegistration.MINI_FLAG_BI);
        blockitemFromModel(BlockRegistration.MINI_FLAG_LESBIAN);
        blockitemFromModel(BlockRegistration.MINI_FLAG_TRANS);
        blockitemFromModel(BlockRegistration.MINI_FLAG_NONBINARY);
        blockitemFromModel(BlockRegistration.MINI_FLAG_PAN);
        blockitemFromModel(BlockRegistration.MINI_FLAG_RAINBOW);
        blockitemFromModel(BlockRegistration.MINI_FLAG_ACE);

        blockitemFromModel(BlockRegistration.COTTAGE_BOOKCASE);
        blockitemFromModel(BlockRegistration.COTTAGE_STANDING_LAMP);
        blockitemFromModel(BlockRegistration.DRYING_HERBS);
        blockitemFromModel(BlockRegistration.HANGING_CLOTH);
        blockitemFromModel(BlockRegistration.HEART_CAKE);
        blockitemFromModel(BlockRegistration.BERRY_CAKE);

        garlandItem(BlockRegistration.BLACK_CAT_GARLAND);
        garlandItem(BlockRegistration.BLOSSOM_GARLAND);
        garlandItem(BlockRegistration.BUNNY_GARLAND);
        garlandItem(BlockRegistration.POLAROID_A_GARLAND);
        garlandItem(BlockRegistration.POLAROID_B_GARLAND);
        garlandItem(BlockRegistration.SUNFLOWER_GARLAND);

        blockitemFromModel(BlockRegistration.BLACK_CAT_COUNTER_DRAWERS);
        blockitemFromModel(BlockRegistration.BLACK_CAT_COUNTER_LEFT_DOOR);
        blockitemFromModel(BlockRegistration.BLACK_CAT_COUNTER_RIGHT_DOOR);
        blockitemFromModel(BlockRegistration.SWEETHEART_COUNTER_DRAWERS);
        blockitemFromModel(BlockRegistration.SWEETHEART_COUNTER_LEFT_DOOR);
        blockitemFromModel(BlockRegistration.SWEETHEART_COUNTER_RIGHT_DOOR);
        blockitemFromModel(BlockRegistration.BOOK_OPEN);
        blockitemFromModel(BlockRegistration.BRASS_KEY);
        blockitemFromModel(BlockRegistration.ENVELOPE_STACK);
        blockitemFromModel(BlockRegistration.FLOWER_DESK_LAMP);
        blockitemFromModel(BlockRegistration.FLOWER_SHELF_BLUE);
        blockitemFromModel(BlockRegistration.FLOWER_SHELF_GREEN);
        blockitemFromModel(BlockRegistration.FLOWER_SHELF_PINK);
        blockitemFromModel(BlockRegistration.FLOWER_SHELF_PURPLE);
        blockitemFromModel(BlockRegistration.FLOWER_SHELF_PASTEL_YELLOW);
        blockitemFromModel(BlockRegistration.FLOWER_SHELF_YELLOW);
        blockitemFromModel(BlockRegistration.FLOWER_SHELF_CANDLE_BLUE);
        blockitemFromModel(BlockRegistration.FLOWER_SHELF_CANDLE_GREEN);
        blockitemFromModel(BlockRegistration.FLOWER_SHELF_CANDLE_PINK);
        blockitemFromModel(BlockRegistration.FLOWER_SHELF_CANDLE_PURPLE);
        blockitemFromModel(BlockRegistration.FLOWER_SHELF_CANDLE_PASTEL_YELLOW);
        blockitemFromModel(BlockRegistration.FLOWER_SHELF_CANDLE_YELLOW);
        blockitemFromModel(BlockRegistration.FLOWER_SHELF_PLANT);
        blockitemFromModel(BlockRegistration.FLOWER_TEA_KETTLE);
        blockitemFromModel(BlockRegistration.FWISH_ARMCHAIR);
        blockitemFromModel(BlockRegistration.FWISH_OTTOMAN);
        blockitemFromModel(BlockRegistration.HEAVENLY_ORNAMENTAL_ARRAY);
        blockitemFromModel(BlockRegistration.PLANT_LADDER);
        blockitemFromModel(BlockRegistration.POLAROID_CAMERA);
        blockitemFromModel(BlockRegistration.POLAROIDS_B);
        blockitemFromModel(BlockRegistration.POLAROIDS_C);
        blockitemFromModel(BlockRegistration.PUZZLE_PIECE_TABLE_BLUE);
        blockitemFromModel(BlockRegistration.PUZZLE_PIECE_TABLE_GREEN);
        blockitemFromModel(BlockRegistration.PUZZLE_PIECE_TABLE_RED);
        blockitemFromModel(BlockRegistration.PUZZLE_PIECE_TABLE_YELLOW);
        blockitemFromModel(BlockRegistration.PUZZLE_PIECE_TABLE_PASTEL_BLUE);
        blockitemFromModel(BlockRegistration.PUZZLE_PIECE_TABLE_PASTEL_PINK);
        blockitemFromModel(BlockRegistration.PUZZLE_PIECE_TABLE_PASTEL_PURPLE);
        blockitemFromModel(BlockRegistration.PUZZLE_PIECE_TABLE_PASTEL_YELLOW);
        blockitemFromModel(BlockRegistration.SALT_PEPPER_SHAKERS);
        blockitemFromModel(BlockRegistration.SAND_SEAL_PLUSH_BLUE);
        blockitemFromModel(BlockRegistration.SAND_SEAL_PLUSH_GREEN);
        blockitemFromModel(BlockRegistration.SAND_SEAL_PLUSH_RED);
        blockitemFromModel(BlockRegistration.SKETCHBOOK_SINGLE);
        blockitemFromModel(BlockRegistration.STACK_OF_BOOKS);
        blockitemFromModel(BlockRegistration.STACK_OF_BOOKS_TALL);
        blockitemFromModel(BlockRegistration.STEAMPUNK_GLOBE);
        blockitemFromModel(BlockRegistration.WINE_BOTTLE_RACK);
        blockitemFromModel(BlockRegistration.WINE_BOTTLES);
        blockitemFromModel(BlockRegistration.YELLOW_NOTEPAD);
        blockitemFromModel(BlockRegistration.SWEETHEART_BAKING_SET_BOWL);
        blockitemFromModel(BlockRegistration.SWEETHEART_BAKING_SET_INGREDIENTS);
        blockitemFromModel(BlockRegistration.SWEETHEART_SINK);
        blockitemFromModel(BlockRegistration.SWEETHEART_TABLE);
        blockitemFromModel(BlockRegistration.BLACK_CAT_SINK);
        blockitemFromModel(BlockRegistration.BLACK_CAT_TABLE);
        blockitemFromModel(BlockRegistration.CARD_INDEX);
        blockitemFromModel(BlockRegistration.CHINA_CABINET);
        blockitemFromModel(BlockRegistration.CUPID_BENCH);
        blockitemFromModel(BlockRegistration.GENERAL_STORE_CABINET);
        blockitemFromModel(BlockRegistration.RETRO_FRIDGE_BLACK);
        blockitemFromModel(BlockRegistration.RETRO_FRIDGE_BLUE);
        blockitemFromModel(BlockRegistration.RETRO_FRIDGE_PINK);
        blockitemFromModel(BlockRegistration.RETRO_FRIDGE_PURPLE);
        blockitemFromModel(BlockRegistration.RETRO_FRIDGE_RED);
        blockitemFromModel(BlockRegistration.RETRO_FRIDGE_TURQUOISE);
        blockitemFromModel(BlockRegistration.RETRO_FRIDGE_WHITE);
        blockitemFromModel(BlockRegistration.RETRO_FRIDGE_YELLOW);
        blockitemFromModel(BlockRegistration.FABRIC_BOLTS);
        blockitemFromModel(BlockRegistration.SCISSORS_AND_THREAD);
        blockitemFromModel(BlockRegistration.SLICED_BREAD);
        blockitemFromModel(BlockRegistration.ROSE_END_TABLE);
        blockitemFromModel(BlockRegistration.ROSE_END_TABLE_BLACK);
        blockitemFromModel(BlockRegistration.VIAL_STAND);
        blockitemFromModel(BlockRegistration.PINEAPPLE);
        blockitemFromModel(BlockRegistration.MUSHROOM_FLAT);
        blockitemFromModel(BlockRegistration.HONEYCOMB_LAMP);
        blockitemFromModel(BlockRegistration.UNLIVING_CHAIR);

        blockitemFromModel(BlockRegistration.POTION_SHELF);
        blockitemFromModel(BlockRegistration.DORADO_CABINET);
        blockitemFromModel(BlockRegistration.DORADO_CABINET_CLUTTERED);
        blockitemFromModel(BlockRegistration.HAVANA_CABINET);
        blockitemFromModel(BlockRegistration.HAVANA_CABINET_CLUTTERED);
        blockitemFromModel(BlockRegistration.MUREX_CABINET);
        blockitemFromModel(BlockRegistration.MUREX_CABINET_CLUTTERED);

        blockitemFromModel(BlockRegistration.ANIMATED_FLAG_ASEXUAL);
        blockitemFromModel(BlockRegistration.ANIMATED_FLAG_BISEXUAL);
        blockitemFromModel(BlockRegistration.ANIMATED_FLAG_PANSEXUAL);
        blockitemFromModel(BlockRegistration.ANIMATED_FLAG_LESBIAN);
        blockitemFromModel(BlockRegistration.ANIMATED_FLAG_TRANSGENDER);
        blockitemFromModel(BlockRegistration.ANIMATED_FLAG_NONBINARY);
        blockitemFromModel(BlockRegistration.ANIMATED_FLAG_RAINBOW);

        //MULTIBLOCK FURNITURE
        blockitemFromModel(BlockRegistration.DESK_BROWN);
        blockitemFromModel(BlockRegistration.DESK_BROWN_CLUTTERED);
        blockitemFromModel(BlockRegistration.DESK_GREEN);
        blockitemFromModel(BlockRegistration.DESK_GREEN_CLUTTERED);
        blockitemFromModel(BlockRegistration.ANTIQUE_STANDING_LAMP);
        blockitemFromModel(BlockRegistration.LOVELY_LOVE_SEAT);
        blockitemFromModel(BlockRegistration.LOVELY_LOVE_SEAT_BLACK);
        blockitemFromModel(BlockRegistration.BULLETIN_BOARD);
        blockitemFromModel(BlockRegistration.BULLETIN_BOARD_CLUTTERED);
        blockitemFromModel(BlockRegistration.BAMBOO_BOOKSHELF);
        blockitemFromModel(BlockRegistration.FWISH_BOOKCASE);
        blockitemFromModel(BlockRegistration.RETRO_CAFE_SHELF);
        blockitemFromModel(BlockRegistration.RETRO_CAFE_SHELF_WINDOW);
        blockitemFromModel(BlockRegistration.CHINA_CABINET);
        blockitemFromModel(BlockRegistration.CUPID_BENCH);

        blockitemFromModel(BlockRegistration.TABLE_PLAIN);
        blockitemFromModel(BlockRegistration.TABLE_TABLECLOTH);


        blockitemFromModel(BlockRegistration.ARMCHAIR_WHITE);
        blockitemFromModel(BlockRegistration.ARMCHAIR_LIGHT_GRAY);
        blockitemFromModel(BlockRegistration.ARMCHAIR_GRAY);
        blockitemFromModel(BlockRegistration.ARMCHAIR_BLACK);
        blockitemFromModel(BlockRegistration.ARMCHAIR_BROWN);
        blockitemFromModel(BlockRegistration.ARMCHAIR_RED);
        blockitemFromModel(BlockRegistration.ARMCHAIR_ORANGE);
        blockitemFromModel(BlockRegistration.ARMCHAIR_YELLOW);
        blockitemFromModel(BlockRegistration.ARMCHAIR_LIME);
        blockitemFromModel(BlockRegistration.ARMCHAIR_GREEN);
        blockitemFromModel(BlockRegistration.ARMCHAIR_CYAN);
        blockitemFromModel(BlockRegistration.ARMCHAIR_LIGHT_BLUE);
        blockitemFromModel(BlockRegistration.ARMCHAIR_BLUE);
        blockitemFromModel(BlockRegistration.ARMCHAIR_PURPLE);
        blockitemFromModel(BlockRegistration.ARMCHAIR_MAGENTA);
        blockitemFromModel(BlockRegistration.ARMCHAIR_PINK);
        blockitemFromModel(BlockRegistration.ARMCHAIR_FUCHSIA);
        blockitemFromModel(BlockRegistration.ARMCHAIR_IVORY);
        blockitemFromModel(BlockRegistration.ARMCHAIR_FLOWER);
        blockitemFromModel(BlockRegistration.ARMCHAIR_STRAWBERRY);
        blockitemFromModel(BlockRegistration.ARMCHAIR_HEART);
        blockitemFromModel(BlockRegistration.ARMCHAIR_WATERMELON);
        blockitemFromModel(BlockRegistration.ARMCHAIR_LEMON);
        blockitemFromModel(BlockRegistration.ARMCHAIR_STARRY);
        blockitemFromModel(BlockRegistration.ARMCHAIR_BLACK_CAT);

    }

    //From the Kaupenjoe Forge 1.20.1 tutorial #13
    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> base) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", new ResourceLocation(Cluttered.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(base.get()).getPath()));
    }
    public void balustradeItem(RegistryObject<Block> block) {
        String id = block.getId().toString().replace("cluttered:", "");

        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), modLoc("block/balustrade"))
                .texture("2", modLoc("block/" + id));
    }
    public void bracketItem(RegistryObject<Block> block) {
        String id = block.getId().toString().replace("cluttered:", "");

        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), modLoc("block/bracket_base"))
                .texture("missing", modLoc("block/" + id));
    }
    public void picketFenceItem(RegistryObject<Block> block) {
        String id = block.getId().toString().replace("cluttered:", "");

        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), modLoc("block/picket_fence"))
                .texture("2", modLoc("block/" + id));
    }

    public void standardCubeItem (RegistryObject<Block> block, String texture) {
        this.cubeAll(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), modLoc("block/" + texture));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> base) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture", new ResourceLocation(Cluttered.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(base.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Cluttered.MODID, "item/" + item.getId().getPath()));
    }
    private ItemModelBuilder simplePaneBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Cluttered.MODID, "block/" + item.getId().getPath().replace("_pane", "")));
    }
    private ItemModelBuilder simplePaneBlockItem(RegistryObject<Block> item, String end) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Cluttered.MODID, "block/" + item.getId().getPath().replace("_pane", "") + end));
    }

    private ItemModelBuilder blockitemFromModel(RegistryObject<Block> item){
        String model = item.getId().toString().replace("cluttered:", "");
        return withExistingParent(ForgeRegistries.BLOCKS.getKey(item.get()).getPath(),
                new ResourceLocation(Cluttered.MODID, "block/" + model));
    }

    private ItemModelBuilder garlandItem(RegistryObject<Block> item){
        String model = item.getId().toString().replace("cluttered:", "");
        return withExistingParent(ForgeRegistries.BLOCKS.getKey(item.get()).getPath(),
                new ResourceLocation(Cluttered.MODID, "block/" + model + "_right"));
    }
}
