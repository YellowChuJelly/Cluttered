package net.redchujelly.cluttered.worldgen.tree.custom;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.predicate.BlockStatePredicate;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.redchujelly.cluttered.block.custom.WillowVinesBlock;
import net.redchujelly.cluttered.setup.BlockRegistration;
import net.redchujelly.cluttered.setup.FoliagePlacerTypeRegistration;

import java.util.List;

public class WillowFoliagePlacer extends FoliagePlacer {
    public static final Codec<WillowFoliagePlacer> CODEC = RecordCodecBuilder.create(willowFoliagePlacerInstance
            -> foliagePlacerParts(willowFoliagePlacerInstance).and(Codec.intRange(0, 16).fieldOf("height").forGetter(fp -> fp.height))
            .and(Codec.intRange(0, 10).fieldOf("length").forGetter(fp -> fp.length)).apply(willowFoliagePlacerInstance, WillowFoliagePlacer::new));

    private final int height;
    private final int length;

    public WillowFoliagePlacer(IntProvider pRadius, IntProvider pOffset, int height, int length) {
        super(pRadius, pOffset);
        this.height = height;
        this.length = length;
    }

    @Override
    protected FoliagePlacerType<?> type() {
        return FoliagePlacerTypeRegistration.WILLOW_FOLIAGE_PLACER.get();
    }

    @Override
    protected void createFoliage(LevelSimulatedReader pLevel, FoliageSetter foliageSetter, RandomSource randomSource,
                                 TreeConfiguration treeConfiguration, int i, FoliageAttachment foliageAttachment, int i1, int i2, int i3) {
        BlockPos base = foliageAttachment.pos().above();
        placeLeavesRow(pLevel, foliageSetter, randomSource, treeConfiguration, base, 1, 0, foliageAttachment.doubleTrunk());
        List<BlockPos> posList = List.of(base.north(), base.north().west(), base.south(), base.south().west(), base.east(), base.north().east(), base.west(),   base.south().east());
        int strandLength;
        boolean longStrand = true;



        for (BlockPos pos : posList){
            if(longStrand){
                strandLength = this.length + randomSource.nextInt(-2, 1);
                longStrand = false;
            }
            else {
                strandLength = this.length + randomSource.nextInt(-8, -4);
                longStrand = true;
            }

            for (int j = 0; j < strandLength; j++){
                if (j == 1){
                    if (longStrand && randomSource.nextFloat() > .20){
                        tryPlaceLeaf(pLevel, foliageSetter, randomSource, treeConfiguration, pos.above());
                    } else if (!longStrand && randomSource.nextFloat() > .68){
                        tryPlaceLeaf(pLevel, foliageSetter, randomSource, treeConfiguration, pos.above());
                    }
                }
                if (pLevel.isStateAtPosition(pos.below(j), BlockStatePredicate.forBlock(BlockRegistration.WILLOW_LOG.get()))){
                    break;
                }
                tryPlaceLeaf(pLevel, foliageSetter, randomSource, treeConfiguration, pos.below(j));
            }
        }
    }

    @Override
    public int foliageHeight(RandomSource randomSource, int i, TreeConfiguration treeConfiguration) {
        return this.height;
    }

    @Override
    protected boolean shouldSkipLocation(RandomSource randomSource, int i, int i1, int i2, int i3, boolean b) {
        return false;
    }
}
