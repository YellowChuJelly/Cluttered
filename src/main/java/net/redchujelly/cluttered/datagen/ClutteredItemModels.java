package net.redchujelly.cluttered.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.redchujelly.cluttered.Cluttered;

public class ClutteredItemModels extends ItemModelProvider {
    public ClutteredItemModels(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Cluttered.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }
}
