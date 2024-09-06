package net.redchujelly.cluttered.setup;

import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.redchujelly.cluttered.Cluttered;

public class PaintingRegistration {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, Cluttered.MODID);

    //16x16 PAINTINGS
    public static final RegistryObject<PaintingVariant> MIMIKYU = PAINTING_VARIANTS.register("mimikyu",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> CANDLE = PAINTING_VARIANTS.register("candle",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> CAT_SHORT = PAINTING_VARIANTS.register("cat_short",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> BEACH_CROW = PAINTING_VARIANTS.register("crow_on_a_beach",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> EGGPLANTS = PAINTING_VARIANTS.register("eggplants_lynnhays",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> ETIENNE = PAINTING_VARIANTS.register("etienne_carolhoffnagle",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> FLOWER_POTS = PAINTING_VARIANTS.register("flower_pots",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> LEMONS = PAINTING_VARIANTS.register("lemons",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> RED_MUSHROOM = PAINTING_VARIANTS.register("red_mushroom",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> HEIDEDAHL = PAINTING_VARIANTS.register("stiefmutterchen_heidedahl",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> TWO_CATS = PAINTING_VARIANTS.register("two_cats",
            () -> new PaintingVariant(16, 16));

    //16x32 PAINTINGS
    public static final RegistryObject<PaintingVariant> CAT_TALL = PAINTING_VARIANTS.register("cat_tall",
            () -> new PaintingVariant(16, 32));
    public static final RegistryObject<PaintingVariant> DAY_SKY = PAINTING_VARIANTS.register("day_sky",
            () -> new PaintingVariant(16, 32));
    public static final RegistryObject<PaintingVariant> NIGHT_SKY = PAINTING_VARIANTS.register("night_sky",
            () -> new PaintingVariant(16, 32));
    public static final RegistryObject<PaintingVariant> FROGMAN = PAINTING_VARIANTS.register("frogman_washington",
            () -> new PaintingVariant(16, 32));
    public static final RegistryObject<PaintingVariant> FLAMENETTLE = PAINTING_VARIANTS.register("van_gogh_flamenettle",
            () -> new PaintingVariant(16, 32));
    public static final RegistryObject<PaintingVariant> SUNFLOWER_VASE = PAINTING_VARIANTS.register("vase_of_sunflowers",
            () -> new PaintingVariant(16, 32));
    public static final RegistryObject<PaintingVariant> WORM = PAINTING_VARIANTS.register("worm",
            () -> new PaintingVariant(16, 32));

    //32x16 PAINTINGS
    public static final RegistryObject<PaintingVariant> BUTTERFLIES = PAINTING_VARIANTS.register("pinned_butterflies",
            () -> new PaintingVariant(32, 16));
    public static final RegistryObject<PaintingVariant> HORSE = PAINTING_VARIANTS.register("van_gogh_horse",
            () -> new PaintingVariant(32, 16));

    //32x32 PAINTINGS
    public static final RegistryObject<PaintingVariant> SUNFLOWER_GOLD = PAINTING_VARIANTS.register("gold_sunflower",
            () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> WHEATFIELD = PAINTING_VARIANTS.register("van_gogh_wheatfield",
            () -> new PaintingVariant(32, 32));

    //MISC SIZE
    public static final RegistryObject<PaintingVariant> CATBOY = PAINTING_VARIANTS.register("catboy",
            () -> new PaintingVariant(48, 48));


    public static void register(IEventBus eventBus){
        PAINTING_VARIANTS.register(eventBus);
    }
}
