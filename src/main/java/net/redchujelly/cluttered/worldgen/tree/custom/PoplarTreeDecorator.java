package net.redchujelly.cluttered.worldgen.tree.custom;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.redchujelly.cluttered.setup.BlockRegistration;
import net.redchujelly.cluttered.setup.TreeDecoratorTypeRegistration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PoplarTreeDecorator extends TreeDecorator {
    //public static final Codec<PoplarTreeDecorator> CODEC = RecordCodecBuilder.create(poplarTreeDecoratorInstance ->
    //        poplarTreeDecoratorInstance.group(Codec.floatRange(0.0f,1.0f).fieldOf("probability").forGetter(poplarTreeDecorator -> poplarTreeDecorator.probability)).apply(poplarTreeDecoratorInstance, PoplarTreeDecorator::new));

    public static final Codec<PoplarTreeDecorator> CODEC = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(PoplarTreeDecorator::new,
            (poplarTreeDecoratorInstance) -> poplarTreeDecoratorInstance.probability).codec();

    private final float probability;

    public PoplarTreeDecorator(float probability) {
        super();
        this.probability = probability;
    }

    private static final Map<Block, Block> FLOWERING_VARIANTS = new HashMap<>(){{
        put(BlockRegistration.POPLAR_LEAVES.get(), BlockRegistration.WILLOW_LEAVES.get());
        put(BlockRegistration.POPLAR_LOG.get(), BlockRegistration.FLOWERING_POPLAR_LOG.get());
        put(BlockRegistration.WILLOW_LEAVES.get(), BlockRegistration.FLOWERING_WILLOW_WINDOW.get());
        put(BlockRegistration.WILLOW_LOG.get(), BlockRegistration.FLOWERING_WILLOW_LOG.get());
    }};

    @Override
    protected TreeDecoratorType<?> type() {
        return TreeDecoratorTypeRegistration.POPLAR_TREE_DECORATOR.get();
    }

    @Override
    public void place(Context pContext) {
        List<BlockPos> list = pContext.leaves();
        RandomSource randomsource = pContext.random();
        Level level = (Level) pContext.level();

        for (BlockPos treePos : list){
            if (randomsource.nextFloat() < probability){
                BlockState treeBlock = level.getBlockState(treePos);

                if (FLOWERING_VARIANTS.containsKey(treeBlock.getBlock())){
                    if (treeBlock.getBlock() instanceof LeavesBlock) {
                        level.setBlock(treePos, FLOWERING_VARIANTS.get(treeBlock.getBlock()).defaultBlockState().setValue(LeavesBlock.PERSISTENT, false), 10);
                    }
                }
            }
        }

        list = pContext.logs();

        for (BlockPos treePos : list){
            if (randomsource.nextFloat() < probability){
                BlockState treeBlock = level.getBlockState(treePos);

                if (FLOWERING_VARIANTS.containsKey(treeBlock.getBlock())){
                    if (treeBlock.getBlock() instanceof RotatedPillarBlock){
                        level.setBlock(treePos, FLOWERING_VARIANTS.get(treeBlock.getBlock()).defaultBlockState().setValue(BlockStateProperties.AXIS, treeBlock.getValue(BlockStateProperties.AXIS)), 10);
                    }
                }
            }
        }

    }
}
