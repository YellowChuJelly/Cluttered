package net.redchujelly.cluttered.blocks.fabric;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.redchujelly.cluttered.blocks.BlockRegistration;
import net.redchujelly.cluttered.blocks.multiblock.DarkwoodBedBlock;
import net.redchujelly.cluttered.blocks.multiblock.MushroomBedBlock;
import net.redchujelly.cluttered.blocks.multiblock.PastelBedBlock;

public class BlockRegistrationImpl extends BlockRegistration {
    public static <T extends Block> RegistrySupplier<T> registerBed(String name, String bed, BlockBehaviour.Properties properties) {
        if (bed.equals("mushroom")){
            return (RegistrySupplier<T>) registerBlock(name, () -> new MushroomBedBlock(properties));
        }
        if (bed.equals("darkwood")){
            return (RegistrySupplier<T>) registerBlock(name, () -> new DarkwoodBedBlock(properties));
        }
        else{
            return (RegistrySupplier<T>) registerBlock(name, () -> new PastelBedBlock(properties));
        }
    }
}
