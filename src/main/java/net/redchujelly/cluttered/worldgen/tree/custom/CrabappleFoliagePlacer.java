package net.redchujelly.cluttered.worldgen.tree.custom;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.redchujelly.cluttered.setup.FoliagePlacerTypeRegistration;

public class CrabappleFoliagePlacer extends FoliagePlacer {
    public static final Codec<CrabappleFoliagePlacer> CODEC = RecordCodecBuilder.create(crabappleFoliagePlacerInstance
            -> foliagePlacerParts(crabappleFoliagePlacerInstance).and(Codec.intRange(0, 16).fieldOf("height").forGetter(fp -> fp.height))
            .apply(crabappleFoliagePlacerInstance, CrabappleFoliagePlacer::new));

    private final int height;

    public CrabappleFoliagePlacer(IntProvider pRadius, IntProvider pOffset, int height) {
        super(pRadius, pOffset);
        this.height = height;
    }

    @Override
    public int foliageHeight(RandomSource pRandom, int pHeight, TreeConfiguration pConfig) {
        return this.height;
    }

    @Override
    protected FoliagePlacerType<?> type() {
        return FoliagePlacerTypeRegistration.CRABAPPLE_FOLIAGE_PLACER.get();
    }

    @Override
    protected void createFoliage(LevelSimulatedReader pLevel, FoliageSetter pBlockSetter, RandomSource pRandom, TreeConfiguration pConfig, int pMaxFreeTreeHeight, FoliageAttachment pAttachment, int pFoliageHeight, int pFoliageRadius, int pOffset) {
        for (int i = 0; i < this.height;) {
            if (i == 0) {
                placeLeavesRow(pLevel, pBlockSetter, pRandom, pConfig, pAttachment.pos().above(), 1, -i, pAttachment.doubleTrunk());
                placeLeavesRow(pLevel, pBlockSetter, pRandom, pConfig, pAttachment.pos().above(), 1, 1, pAttachment.doubleTrunk());
            } else if (i < 2){
                placeLeavesRow(pLevel, pBlockSetter, pRandom, pConfig, pAttachment.pos().above(), 2, -i, pAttachment.doubleTrunk());
            } else if (i == this.height - 1){
                placeLeavesRow(pLevel, pBlockSetter, pRandom, pConfig, pAttachment.pos().above(), 1, -i, pAttachment.doubleTrunk());
            }

            i++;
        }
    }


    @Override
    protected boolean shouldSkipLocation(RandomSource pRandom, int pLocalX, int pLocalY, int pLocalZ, int pRange, boolean pLarge) {
        double distance = Math.sqrt(Math.pow(pLocalX, 2) + Math.pow(pLocalZ, 2));
        if (pLocalY == 0){
            return pLocalX == pLocalZ && pLocalX == pRange && pRandom.nextBoolean();
        }
        if (pLocalY == 1){
            return pLocalX == pLocalZ && pLocalX == pRange || pRandom.nextFloat() < 0.14f;
        }
        return distance > pRange;
    }
}
