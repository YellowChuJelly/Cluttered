package net.redchujelly.cluttered.setup;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.redchujelly.cluttered.Cluttered;
import net.redchujelly.cluttered.entity.ChairEntity;

public class EntityTypeRegistration {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(Registries.ENTITY_TYPE, Cluttered.MODID);

    public static final DeferredHolder<EntityType<?>, EntityType<Entity>> CHAIR_ENTITY =  ENTITY_TYPES.register("chair_entity",
            () -> EntityType.Builder.of(ChairEntity::new, MobCategory.MISC)
                    .sized(1.0f, 1.0f)
                    .build(ResourceLocation.fromNamespaceAndPath(Cluttered.MODID, "chair").toString()));
    public static void register (IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
