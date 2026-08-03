package net.redchujelly.cluttered.paintings;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.redchujelly.cluttered.Cluttered;

public class PaintingRegistration {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS =
            DeferredRegister.create(Cluttered.MOD_ID, Registries.PAINTING_VARIANT);

    //16x16 PAINTINGS
    public static final RegistrySupplier<PaintingVariant> MIMIKYU = PAINTING_VARIANTS.register("mimikyu",
            () -> new PaintingVariant(16, 16));
    public static final RegistrySupplier<PaintingVariant> CANDLE = PAINTING_VARIANTS.register("candle",
            () -> new PaintingVariant(16, 16));
    public static final RegistrySupplier<PaintingVariant> CAT_SHORT = PAINTING_VARIANTS.register("cat_short",
            () -> new PaintingVariant(16, 16));
    public static final RegistrySupplier<PaintingVariant> BEACH_CROW = PAINTING_VARIANTS.register("crow_on_a_beach",
            () -> new PaintingVariant(16, 16));
    public static final RegistrySupplier<PaintingVariant> EGGPLANTS = PAINTING_VARIANTS.register("eggplants_lynnhays",
            () -> new PaintingVariant(16, 16));
    public static final RegistrySupplier<PaintingVariant> ETIENNE = PAINTING_VARIANTS.register("etienne_carolhoffnagle",
            () -> new PaintingVariant(16, 16));
    public static final RegistrySupplier<PaintingVariant> FLOWER_POTS = PAINTING_VARIANTS.register("flower_pots",
            () -> new PaintingVariant(16, 16));
    public static final RegistrySupplier<PaintingVariant> LEMONS = PAINTING_VARIANTS.register("lemons",
            () -> new PaintingVariant(16, 16));
    public static final RegistrySupplier<PaintingVariant> RED_MUSHROOM = PAINTING_VARIANTS.register("red_mushroom",
            () -> new PaintingVariant(16, 16));
    public static final RegistrySupplier<PaintingVariant> HEIDEDAHL = PAINTING_VARIANTS.register("stiefmutterchen_heidedahl",
            () -> new PaintingVariant(16, 16));
    public static final RegistrySupplier<PaintingVariant> TWO_CATS = PAINTING_VARIANTS.register("two_cats",
            () -> new PaintingVariant(16, 16));

    //16x32 PAINTINGS
    public static final RegistrySupplier<PaintingVariant> CAT_TALL = PAINTING_VARIANTS.register("cat_tall",
            () -> new PaintingVariant(16, 32));
    public static final RegistrySupplier<PaintingVariant> DAY_SKY = PAINTING_VARIANTS.register("day_sky",
            () -> new PaintingVariant(16, 32));
    public static final RegistrySupplier<PaintingVariant> NIGHT_SKY = PAINTING_VARIANTS.register("night_sky",
            () -> new PaintingVariant(16, 32));
    public static final RegistrySupplier<PaintingVariant> FROGMAN = PAINTING_VARIANTS.register("frogman_washington",
            () -> new PaintingVariant(16, 32));
    public static final RegistrySupplier<PaintingVariant> FLAMENETTLE = PAINTING_VARIANTS.register("van_gogh_flamenettle",
            () -> new PaintingVariant(16, 32));
    public static final RegistrySupplier<PaintingVariant> SUNFLOWER_VASE = PAINTING_VARIANTS.register("vase_of_sunflowers",
            () -> new PaintingVariant(16, 32));
    public static final RegistrySupplier<PaintingVariant> WORM = PAINTING_VARIANTS.register("worm",
            () -> new PaintingVariant(16, 32));

    //32x16 PAINTINGS
    public static final RegistrySupplier<PaintingVariant> BUTTERFLIES = PAINTING_VARIANTS.register("pinned_butterflies",
            () -> new PaintingVariant(32, 16));
    public static final RegistrySupplier<PaintingVariant> HORSE = PAINTING_VARIANTS.register("van_gogh_horse",
            () -> new PaintingVariant(32, 16));

    //32x32 PAINTINGS
    public static final RegistrySupplier<PaintingVariant> SUNFLOWER_GOLD = PAINTING_VARIANTS.register("gold_sunflower",
            () -> new PaintingVariant(32, 32));
    public static final RegistrySupplier<PaintingVariant> WHEATFIELD = PAINTING_VARIANTS.register("van_gogh_wheatfield",
            () -> new PaintingVariant(32, 32));
    public static final RegistrySupplier<PaintingVariant> RIDLEY_FIRE = PAINTING_VARIANTS.register("ridley_fire",
            () -> new PaintingVariant(32, 32));
    public static final RegistrySupplier<PaintingVariant> RIDLEY_DIMENSION = PAINTING_VARIANTS.register("ridley_dimension",
            () -> new PaintingVariant(32, 32));

    public static void init(){
        PAINTING_VARIANTS.register();
    }
}
