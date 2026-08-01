package net.redchujelly.cluttered.world.tree.decorator.fabric;

import com.mojang.serialization.Codec;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.redchujelly.cluttered.mixin.TreeDecoratorTypeInvoker;
import net.redchujelly.cluttered.world.tree.decorator.TreeDecoratorTypeRegistration;

import java.util.function.Supplier;

public class TreeDecoratorTypeRegistrationImpl extends TreeDecoratorTypeRegistration {

    public static <P extends TreeDecorator> Supplier<TreeDecoratorType<P>> registerType(String id, Codec<P> codec){
        return TREE_DECORATORS.register(id, () -> TreeDecoratorTypeInvoker.cluttered_newTreeDecorator(codec));
    }
}
