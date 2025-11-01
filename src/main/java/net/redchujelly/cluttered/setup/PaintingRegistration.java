package net.redchujelly.cluttered.setup;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.redchujelly.cluttered.Cluttered;

public class PaintingRegistration {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS =
            DeferredRegister.create(Registries.PAINTING_VARIANT, Cluttered.MODID);

    //16x16 PAINTINGS
    public static final DeferredHolder<PaintingVariant, PaintingVariant> MIMIKYU = PAINTING_VARIANTS.register("mimikyu",
            () -> new PaintingVariant(16, 16, ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, "mimikyu")));
    public static final DeferredHolder<PaintingVariant, PaintingVariant> CANDLE = PAINTING_VARIANTS.register("candle",
            () -> new PaintingVariant(16, 16, ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, "candle")));
    public static final DeferredHolder<PaintingVariant, PaintingVariant> CAT_SHORT = PAINTING_VARIANTS.register("cat_short",
            () -> new PaintingVariant(16, 16, ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, "cat_short")));
    public static final DeferredHolder<PaintingVariant, PaintingVariant> BEACH_CROW = PAINTING_VARIANTS.register("crow_on_a_beach",
            () -> new PaintingVariant(16, 16, ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, "crow_on_a_beach")));
    public static final DeferredHolder<PaintingVariant, PaintingVariant> EGGPLANTS = PAINTING_VARIANTS.register("eggplants_lynnhays",
            () -> new PaintingVariant(16, 16, ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, "eggplants_lynnhays")));
    public static final DeferredHolder<PaintingVariant, PaintingVariant> ETIENNE = PAINTING_VARIANTS.register("etienne_carolhoffnagle",
            () -> new PaintingVariant(16, 16, ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, "etienne_carolhoffnagle")));
    public static final DeferredHolder<PaintingVariant, PaintingVariant> FLOWER_POTS = PAINTING_VARIANTS.register("flower_pots",
            () -> new PaintingVariant(16, 16, ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, "flower_pots")));
    public static final DeferredHolder<PaintingVariant, PaintingVariant> LEMONS = PAINTING_VARIANTS.register("lemons",
            () -> new PaintingVariant(16, 16, ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, "lemons")));
    public static final DeferredHolder<PaintingVariant, PaintingVariant> RED_MUSHROOM = PAINTING_VARIANTS.register("red_mushroom",
            () -> new PaintingVariant(16, 16, ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, "red_mushroom")));
    public static final DeferredHolder<PaintingVariant, PaintingVariant> HEIDEDAHL = PAINTING_VARIANTS.register("stiefmutterchen_heidedahl",
            () -> new PaintingVariant(16, 16, ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, "stiefmutterchen_heidedahl")));
    public static final DeferredHolder<PaintingVariant, PaintingVariant> TWO_CATS = PAINTING_VARIANTS.register("two_cats",
            () -> new PaintingVariant(16, 16, ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, "two_cats")));

    //16x32 PAINTINGS
    public static final DeferredHolder<PaintingVariant, PaintingVariant> CAT_TALL = PAINTING_VARIANTS.register("cat_tall",
            () -> new PaintingVariant(16, 32, ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, "cat_tall")));
    public static final DeferredHolder<PaintingVariant, PaintingVariant> DAY_SKY = PAINTING_VARIANTS.register("day_sky",
            () -> new PaintingVariant(16, 32, ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, "day_sky")));
    public static final DeferredHolder<PaintingVariant, PaintingVariant> NIGHT_SKY = PAINTING_VARIANTS.register("night_sky",
            () -> new PaintingVariant(16, 32, ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, "night_sky")));
    public static final DeferredHolder<PaintingVariant, PaintingVariant> FROGMAN = PAINTING_VARIANTS.register("frogman_washington",
            () -> new PaintingVariant(16, 32, ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, "frogman_washington")));
    public static final DeferredHolder<PaintingVariant, PaintingVariant> FLAMENETTLE = PAINTING_VARIANTS.register("van_gogh_flamenettle",
            () -> new PaintingVariant(16, 32, ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, "van_gogh_flamenettle")));
    public static final DeferredHolder<PaintingVariant, PaintingVariant> SUNFLOWER_VASE = PAINTING_VARIANTS.register("vase_of_sunflowers",
            () -> new PaintingVariant(16, 32, ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, "vase_of_sunflowers")));
    public static final DeferredHolder<PaintingVariant, PaintingVariant> WORM = PAINTING_VARIANTS.register("worm",
            () -> new PaintingVariant(16, 32, ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, "worm")));

    //32x16 PAINTINGS
    public static final DeferredHolder<PaintingVariant, PaintingVariant> BUTTERFLIES = PAINTING_VARIANTS.register("pinned_butterflies",
            () -> new PaintingVariant(32, 16, ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, "pinned_butterflies")));
    public static final DeferredHolder<PaintingVariant, PaintingVariant> HORSE = PAINTING_VARIANTS.register("van_gogh_horse",
            () -> new PaintingVariant(32, 16, ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, "van_gogh_horse")));

    //32x32 PAINTINGS
    public static final DeferredHolder<PaintingVariant, PaintingVariant> SUNFLOWER_GOLD = PAINTING_VARIANTS.register("gold_sunflower",
            () -> new PaintingVariant(32, 32, ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, "gold_sunflower")));
    public static final DeferredHolder<PaintingVariant, PaintingVariant> WHEATFIELD = PAINTING_VARIANTS.register("van_gogh_wheatfield",
            () -> new PaintingVariant(32, 32, ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, "van_gogh_wheatfield")));
    public static final DeferredHolder<PaintingVariant, PaintingVariant> RIDLEY_FIRE = PAINTING_VARIANTS.register("ridley_fire",
            () -> new PaintingVariant(32, 32, ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, "ridley_fire")));
    public static final DeferredHolder<PaintingVariant, PaintingVariant> RIDLEY_DIMENSION = PAINTING_VARIANTS.register("ridley_dimension",
            () -> new PaintingVariant(32, 32, ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, "ridley_dimension")));


    public static void register(IEventBus eventBus){
        PAINTING_VARIANTS.register(eventBus);
    }
}
