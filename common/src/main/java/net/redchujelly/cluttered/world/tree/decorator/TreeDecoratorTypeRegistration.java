package net.redchujelly.cluttered.world.tree.decorator;

import com.mojang.serialization.Codec;
import dev.architectury.injectables.annotations.ExpectPlatform;
import dev.architectury.platform.Platform;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.redchujelly.cluttered.Cluttered;

import java.util.function.Supplier;

public class TreeDecoratorTypeRegistration {
    public static final DeferredRegister<TreeDecoratorType<?>> TREE_DECORATORS =
            DeferredRegister.create(Cluttered.MOD_ID, Registries.TREE_DECORATOR_TYPE);

    public static final Supplier<TreeDecoratorType<WillowTreeDecorator>> WILLOW_TREE_DECORATOR = registerType("willow_tree_decorator", WillowTreeDecorator.CODEC);

    @ExpectPlatform
    public static <P extends TreeDecorator> Supplier<TreeDecoratorType<P>> registerType(String id, Codec<P> codec){
        throw new IllegalStateException();
    }

    public static void init(){
        TREE_DECORATORS.register();
    }
}
