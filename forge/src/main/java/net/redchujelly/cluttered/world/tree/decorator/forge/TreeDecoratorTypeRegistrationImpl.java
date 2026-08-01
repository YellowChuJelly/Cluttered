package net.redchujelly.cluttered.world.tree.decorator.forge;

import com.mojang.serialization.Codec;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.redchujelly.cluttered.world.tree.decorator.TreeDecoratorTypeRegistration;
import net.redchujelly.cluttered.world.tree.foliageplacer.FoliagePlacerTypeRegistration;

import java.util.function.Supplier;

public class TreeDecoratorTypeRegistrationImpl extends TreeDecoratorTypeRegistration {

    public static <P extends TreeDecorator> Supplier<TreeDecoratorType<P>> registerType(String id, Codec<P> codec){
        return TREE_DECORATORS.register(id, () -> new TreeDecoratorType<>(codec));
    }
}
