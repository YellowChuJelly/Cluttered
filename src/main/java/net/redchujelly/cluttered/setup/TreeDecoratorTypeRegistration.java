package net.redchujelly.cluttered.setup;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.redchujelly.cluttered.Cluttered;
import net.redchujelly.cluttered.worldgen.tree.custom.WillowTreeDecorator;

public class TreeDecoratorTypeRegistration {
    public static final DeferredRegister<TreeDecoratorType<?>> TREE_DECORATORS =
            DeferredRegister.create(Registries.TREE_DECORATOR_TYPE, Cluttered.MODID);


    public static final DeferredHolder<TreeDecoratorType<?>, TreeDecoratorType<WillowTreeDecorator>> WILLOW_TREE_DECORATOR =
            TREE_DECORATORS.register("willow_tree_decorator", () -> new TreeDecoratorType<>(WillowTreeDecorator.CODEC));


    public static void register(IEventBus eventBus){
        TREE_DECORATORS.register(eventBus);
    }
}
