package net.redchujelly.cluttered.blocks.forge;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.redchujelly.cluttered.blocks.BlockRegistration;
import net.redchujelly.cluttered.blocks.forge_blocks.ForgeDarkwoodBedBlock;
import net.redchujelly.cluttered.blocks.forge_blocks.ForgeMushroomBedBlock;
import net.redchujelly.cluttered.blocks.forge_blocks.ForgePastelBedBlock;

public class BlockRegistrationImpl extends BlockRegistration {

    public static <T extends Block> RegistrySupplier<T> registerBed(String name, String bed, BlockBehaviour.Properties properties) {
        if (bed.equals("mushroom")){
            return (RegistrySupplier<T>) registerBlock(name, () -> new ForgeMushroomBedBlock(properties));
        }
        if (bed.equals("darkwood")){
            return (RegistrySupplier<T>) registerBlock(name, () -> new ForgeDarkwoodBedBlock(properties));
        }
        else{
            return (RegistrySupplier<T>) registerBlock(name, () -> new ForgePastelBedBlock(properties));
        }
    }
}
