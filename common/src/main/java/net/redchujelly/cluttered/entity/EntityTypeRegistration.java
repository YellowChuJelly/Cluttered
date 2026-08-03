package net.redchujelly.cluttered.entity;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.redchujelly.cluttered.Cluttered;
import net.redchujelly.cluttered.entity.custom.ChairEntity;

public class EntityTypeRegistration {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create( Cluttered.MOD_ID, Registries.ENTITY_TYPE);

    public static final RegistrySupplier<EntityType<Entity>> CHAIR_ENTITY =  ENTITY_TYPES.register("chair_entity",
            () -> EntityType.Builder.of(ChairEntity::new, MobCategory.MISC)
                    .sized(1.0f, 1.0f)
                    .build(new ResourceLocation(Cluttered.MOD_ID, "chair-entity").toString()));
    public static void init (){
        ENTITY_TYPES.register();
    }
}
