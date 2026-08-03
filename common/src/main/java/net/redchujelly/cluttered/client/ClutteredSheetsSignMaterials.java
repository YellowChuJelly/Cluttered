package net.redchujelly.cluttered.client;

import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.resources.model.Material;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.redchujelly.cluttered.util.ClutteredWoodTypes;

public class ClutteredSheetsSignMaterials {

    public static void addWoodTypes() {
        Sheets.SIGN_MATERIALS.put(ClutteredWoodTypes.WILLOW, createSignMaterial(ClutteredWoodTypes.WILLOW));
        Sheets.HANGING_SIGN_MATERIALS.put(ClutteredWoodTypes.WILLOW, createHangingSignMaterial(ClutteredWoodTypes.WILLOW));
        Sheets.SIGN_MATERIALS.put(ClutteredWoodTypes.FLOWERING_WILLOW, createSignMaterial(ClutteredWoodTypes.FLOWERING_WILLOW));
        Sheets.HANGING_SIGN_MATERIALS.put(ClutteredWoodTypes.FLOWERING_WILLOW, createHangingSignMaterial(ClutteredWoodTypes.FLOWERING_WILLOW));
        Sheets.SIGN_MATERIALS.put(ClutteredWoodTypes.POPLAR, createSignMaterial(ClutteredWoodTypes.POPLAR));
        Sheets.HANGING_SIGN_MATERIALS.put(ClutteredWoodTypes.POPLAR, createHangingSignMaterial(ClutteredWoodTypes.POPLAR));
        Sheets.SIGN_MATERIALS.put(ClutteredWoodTypes.FLOWERING_POPLAR, createSignMaterial(ClutteredWoodTypes.FLOWERING_POPLAR));
        Sheets.HANGING_SIGN_MATERIALS.put(ClutteredWoodTypes.FLOWERING_POPLAR, createHangingSignMaterial(ClutteredWoodTypes.FLOWERING_POPLAR));
        Sheets.SIGN_MATERIALS.put(ClutteredWoodTypes.CRABAPPLE, createSignMaterial(ClutteredWoodTypes.CRABAPPLE));
        Sheets.HANGING_SIGN_MATERIALS.put(ClutteredWoodTypes.CRABAPPLE, createHangingSignMaterial(ClutteredWoodTypes.CRABAPPLE));
        Sheets.SIGN_MATERIALS.put(ClutteredWoodTypes.FLOWERING_CRABAPPLE, createSignMaterial(ClutteredWoodTypes.FLOWERING_CRABAPPLE));
        Sheets.HANGING_SIGN_MATERIALS.put(ClutteredWoodTypes.FLOWERING_CRABAPPLE, createHangingSignMaterial(ClutteredWoodTypes.FLOWERING_CRABAPPLE));
        Sheets.SIGN_MATERIALS.put(ClutteredWoodTypes.SYCAMORE, createSignMaterial(ClutteredWoodTypes.SYCAMORE));
        Sheets.HANGING_SIGN_MATERIALS.put(ClutteredWoodTypes.SYCAMORE, createHangingSignMaterial(ClutteredWoodTypes.SYCAMORE));
        Sheets.SIGN_MATERIALS.put(ClutteredWoodTypes.MAPLE, createSignMaterial(ClutteredWoodTypes.MAPLE));
        Sheets.HANGING_SIGN_MATERIALS.put(ClutteredWoodTypes.MAPLE, createHangingSignMaterial(ClutteredWoodTypes.MAPLE));
        Sheets.SIGN_MATERIALS.put(ClutteredWoodTypes.RED_MUSHROOM, createSignMaterial(ClutteredWoodTypes.RED_MUSHROOM));
        Sheets.HANGING_SIGN_MATERIALS.put(ClutteredWoodTypes.RED_MUSHROOM, createHangingSignMaterial(ClutteredWoodTypes.RED_MUSHROOM));
        Sheets.SIGN_MATERIALS.put(ClutteredWoodTypes.BLUE_MUSHROOM, createSignMaterial(ClutteredWoodTypes.BLUE_MUSHROOM));
        Sheets.HANGING_SIGN_MATERIALS.put(ClutteredWoodTypes.BLUE_MUSHROOM, createHangingSignMaterial(ClutteredWoodTypes.BLUE_MUSHROOM));
    }

    private static Material createSignMaterial(WoodType p_173386_) {
        ResourceLocation location = new ResourceLocation(p_173386_.name());
        return new Material(Sheets.SIGN_SHEET, new ResourceLocation(location.getNamespace(), "entity/signs/" + location.getPath()));
    }

    private static Material createHangingSignMaterial(WoodType p_251735_) {
        ResourceLocation location = new ResourceLocation(p_251735_.name());
        return new Material(Sheets.SIGN_SHEET, new ResourceLocation(location.getNamespace(), "entity/signs/hanging/" + location.getPath()));
    }
}
