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

        standardCubeItem(BlockRegistration.FISH_WALLPAPER, "fish_wallpaper_1");


        //FURNITURE
        blockitemFromModel(BlockRegistration.APPLE_CHAIR);

        blockitemFromModel(BlockRegistration.BIRDHOUSE_UNPAINTED);
        blockitemFromModel(BlockRegistration.BIRDHOUSE_RED);
        blockitemFromModel(BlockRegistration.BIRDHOUSE_BLUE);
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

        blockitemFromModel(BlockRegistration.COTTAGE_BOOKCASE);
        blockitemFromModel(BlockRegistration.COTTAGE_STANDING_LAMP);
        blockitemFromModel(BlockRegistration.DRYING_HERBS);
        blockitemFromModel(BlockRegistration.HANGING_CLOTH);

        //MULTIBLOCK FURNITURE
        blockitemFromModel(BlockRegistration.DESK_BROWN);
        blockitemFromModel(BlockRegistration.DESK_BROWN_CLUTTERED);
        blockitemFromModel(BlockRegistration.DESK_GREEN);
        blockitemFromModel(BlockRegistration.DESK_GREEN_CLUTTERED);
        blockitemFromModel(BlockRegistration.ANTIQUE_STANDING_LAMP);
        blockitemFromModel(BlockRegistration.LOVELY_LOVE_SEAT);
        blockitemFromModel(BlockRegistration.LOVELY_LOVE_SEAT_BLACK);
        blockitemFromModel(BlockRegistration.BULLETIN_BOARD_CLUTTERED);


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
        blockitemFromModel(BlockRegistration.ARMCHAIR_FUSCHIA);
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
}
