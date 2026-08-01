package net.redchujelly.cluttered.sounds;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.redchujelly.cluttered.Cluttered;

public class SoundEventRegistration {

    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(Cluttered.MOD_ID, Registries.SOUND_EVENT);

    public static final RegistrySupplier<SoundEvent> POLAROID_FLASH = registerSoundEvent("polaroid_flash");

    private static RegistrySupplier<SoundEvent> registerSoundEvent(String name){
        ResourceLocation id = new ResourceLocation(Cluttered.MOD_ID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void init(){
        SOUND_EVENTS.register();
    }
}
