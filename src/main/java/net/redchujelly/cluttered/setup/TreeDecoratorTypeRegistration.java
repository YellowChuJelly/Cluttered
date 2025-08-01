package net.redchujelly.cluttered.setup;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.redchujelly.cluttered.Cluttered;
import net.redchujelly.cluttered.worldgen.tree.custom.PoplarTreeDecorator;

public class TreeDecoratorTypeRegistration {
    public static final DeferredRegister<TreeDecoratorType<?>> TREE_DECORATORS =
            DeferredRegister.create(Registries.TREE_DECORATOR_TYPE, Cluttered.MODID);


    public static final RegistryObject<TreeDecoratorType<PoplarTreeDecorator>> POPLAR_TREE_DECORATOR =
            TREE_DECORATORS.register("poplar_tree_decorator", () -> new TreeDecoratorType<>(PoplarTreeDecorator.CODEC));


    public static void register(IEventBus eventBus){
        TREE_DECORATORS.register(eventBus);
    }
}
