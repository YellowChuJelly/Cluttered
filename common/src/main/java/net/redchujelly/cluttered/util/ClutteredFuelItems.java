package net.redchujelly.cluttered.util;

import dev.architectury.registry.fuel.FuelRegistry;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.level.block.Block;
import net.redchujelly.cluttered.blocks.BlockRegistration;

import java.util.HashMap;

public class ClutteredFuelItems {
    public static void addFuelItems(){
        HashMap<RegistrySupplier<Block>, Integer> fuelMap = BlockRegistration.FUEL_BLOCKS;

        for (RegistrySupplier<Block> fuel : fuelMap.keySet()){
            FuelRegistry.register(fuelMap.get(fuel), fuel.get());
        }
    }

}
