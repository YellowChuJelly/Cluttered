package net.redchujelly.cluttered.setup;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.redchujelly.cluttered.Cluttered;
import net.redchujelly.cluttered.entity.ChairEntity;

public class EntityTypeRegistration {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Cluttered.MODID);

    public static final RegistryObject<EntityType<Entity>> CHAIR_ENTITY =  ENTITY_TYPES.register("chair_entity",
            () -> EntityType.Builder.of(ChairEntity::new, MobCategory.MISC)
                    .sized(1.0f, 1.0f)
                    .build(new ResourceLocation(Cluttered.MODID, "chair-entity").toString()));
    public static void register (IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
