package net.redchujelly.cluttered.blocks.entity.fabric;

import dev.architectury.registry.registries.RegistrySupplier;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.redchujelly.cluttered.blocks.entity.CardboardBoxBlockEntity;
import net.redchujelly.cluttered.blocks.entity.CustomStorageBlockEntity;
import net.redchujelly.cluttered.blocks.entity.FridgeBlockEntity;

import java.util.Arrays;
import java.util.function.Supplier;

import static net.redchujelly.cluttered.blocks.entity.BlockEntityRegistration.BLOCK_ENTITIES;

public class BlockEntityRegistrationImpl{

    //Basically from the tanuki-decor code with some changes (i made it worse sorry)
    public static RegistrySupplier<BlockEntityType<CustomStorageBlockEntity>> registerWithStorage(Supplier<Supplier<BlockEntityType<CustomStorageBlockEntity>>> type, int rows, RegistrySupplier<Block>[] block, String name){
        return BLOCK_ENTITIES.register(name, () -> FabricBlockEntityTypeBuilder.create((blockPos, blockState) ->
                new CustomStorageBlockEntity((type.get().get()), blockPos, blockState, rows), Arrays.stream(block).iterator().next().get()).build());
    }

    public static RegistrySupplier<BlockEntityType<CustomStorageBlockEntity>> registerWithStorageAndSounds(Supplier<Supplier<BlockEntityType<CustomStorageBlockEntity>>> type, int rows, RegistrySupplier<Block>[] block, String name, SoundEvent openSound, SoundEvent closeSound){
        return BLOCK_ENTITIES.register(name, () -> FabricBlockEntityTypeBuilder.create((blockPos, blockState) ->
                        new CustomStorageBlockEntity(type.get().get(), blockPos, blockState, rows, openSound, closeSound), Arrays.stream(block).iterator().next().get())
                .build());
    }

    public static RegistrySupplier<BlockEntityType<FridgeBlockEntity>> registerFridge(Supplier<Supplier<BlockEntityType<FridgeBlockEntity>>> type, int rows, RegistrySupplier<Block>[] block, String name){
        return BLOCK_ENTITIES.register(name, () -> FabricBlockEntityTypeBuilder.create((blockPos, blockState) ->
                        new FridgeBlockEntity(type.get().get(), blockPos, blockState, rows), Arrays.stream(block).iterator().next().get())
                .build());
    }

    public static RegistrySupplier<BlockEntityType<CardboardBoxBlockEntity>> registerCardboardBox(Supplier<Supplier<BlockEntityType<CardboardBoxBlockEntity>>> type, int rows, RegistrySupplier<Block>[] block, String name){
        return BLOCK_ENTITIES.register(name, () -> FabricBlockEntityTypeBuilder.create((blockPos, blockState) ->
                        new CardboardBoxBlockEntity(type.get().get(), blockPos, blockState, rows), Arrays.stream(block).iterator().next().get())
                .build(null));
    }

    public static void init(){
        BLOCK_ENTITIES.register();
    }

}
