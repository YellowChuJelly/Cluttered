package net.redchujelly.cluttered.worldgen.tree.custom;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.redchujelly.cluttered.block.custom.WillowVinesBlock;
import net.redchujelly.cluttered.setup.BlockRegistration;
import net.redchujelly.cluttered.setup.TreeDecoratorTypeRegistration;

public class WillowTreeDecorator extends TreeDecorator {
    //public static final Codec<PoplarTreeDecorator> CODEC = RecordCodecBuilder.create(poplarTreeDecoratorInstance ->
    //        poplarTreeDecoratorInstance.group(Codec.floatRange(0.0f,1.0f).fieldOf("probability").forGetter(poplarTreeDecorator -> poplarTreeDecorator.probability)).apply(poplarTreeDecoratorInstance, PoplarTreeDecorator::new));

    public static final MapCodec<WillowTreeDecorator> CODEC = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(WillowTreeDecorator::new,
            (willowTreeDecoratorInstance) -> willowTreeDecoratorInstance.probability);

    private final float probability;

    public WillowTreeDecorator(float probability) {
        super();
        this.probability = probability;
    }

    @Override
    protected TreeDecoratorType<?> type() {
        return TreeDecoratorTypeRegistration.WILLOW_TREE_DECORATOR.get();
    }

    @Override
    public void place(Context pContext) {
        RandomSource randomsource = pContext.random();

        for (BlockPos leafPos : pContext.leaves()){
            if (pContext.isAir(leafPos.below())){
                if (randomsource.nextFloat() < this.probability) {
                    int strandLength = randomsource.nextInt(4,8);
                    if (randomsource.nextBoolean()){
                        strandLength -= 4;
                    }
                    for (int i = 0; i < strandLength;){
                        i++;
                        if (!pContext.isAir(leafPos.below(i))){
                            break;
                        }
                        pContext.setBlock(leafPos.below(i), BlockRegistration.WILLOW_VINES.get().defaultBlockState().setValue(WillowVinesBlock.GRADIENT, Math.min(i, 6)).setValue(WillowVinesBlock.BOTTOM, i == strandLength));
                    }
                }
            }
        }

    }
}
