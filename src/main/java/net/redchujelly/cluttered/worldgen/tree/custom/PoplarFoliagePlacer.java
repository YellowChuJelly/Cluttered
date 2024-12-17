package net.redchujelly.cluttered.worldgen.tree.custom;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.redchujelly.cluttered.setup.FoliagePlacerTypeRegistration;

public class PoplarFoliagePlacer extends FoliagePlacer {
    public static final Codec<PoplarFoliagePlacer> CODEC = RecordCodecBuilder.create(poplarFoliagePlacerInstance
            -> foliagePlacerParts(poplarFoliagePlacerInstance).and(Codec.intRange(0, 16).fieldOf("height").forGetter(fp -> fp.height))
            .apply(poplarFoliagePlacerInstance, PoplarFoliagePlacer::new));

    private final int height;

    public PoplarFoliagePlacer(IntProvider pRadius, IntProvider pOffset, int height) {
        super(pRadius, pOffset);
        this.height = height;
    }

    @Override
    protected FoliagePlacerType<?> type() {
        return FoliagePlacerTypeRegistration.POPLAR_FOLIAGE_PLACER.get();
    }

    @Override
    protected void createFoliage(LevelSimulatedReader levelSimulatedReader, FoliageSetter foliageSetter, RandomSource randomSource,
                                 TreeConfiguration treeConfiguration, int i, FoliageAttachment foliageAttachment, int i1, int i2, int i3) {

        BlockPos nextPos = foliageAttachment.pos();

        int maxHeight = this.height + randomSource.nextInt(-1, 1);
        int topHeight = randomSource.nextInt(1, 3);
        int radius;
        for (int j = 0; j < maxHeight; j++){
            if (j ==0){
                tryPlaceLeaf(levelSimulatedReader, foliageSetter, randomSource, treeConfiguration, nextPos.above());
            }
            radius = 2;
            if (j < topHeight){
                radius = 1;
            } if (maxHeight - j < 3){
                radius = 1;
            }
            placeLeavesRow(levelSimulatedReader, foliageSetter, randomSource, treeConfiguration, nextPos, radius, 0, foliageAttachment.doubleTrunk());
            nextPos = nextPos.below();
        }
    }

    @Override
    public int foliageHeight(RandomSource randomSource, int i, TreeConfiguration treeConfiguration) {
        return this.height;
    }

    @Override
    protected boolean shouldSkipLocation(RandomSource pRandom, int pLocalX, int pLocalY, int pLocalZ, int pRange, boolean b) {
        return pLocalX == pRange && pLocalZ == pRange && (pRandom.nextInt(0,2) == 0 || pLocalY == 0);
    }
}
