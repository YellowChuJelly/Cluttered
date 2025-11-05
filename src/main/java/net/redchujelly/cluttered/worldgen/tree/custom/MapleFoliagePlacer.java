package net.redchujelly.cluttered.worldgen.tree.custom;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.redchujelly.cluttered.setup.FoliagePlacerTypeRegistration;

public class MapleFoliagePlacer extends FoliagePlacer {
    public static final MapCodec<MapleFoliagePlacer> CODEC = RecordCodecBuilder.mapCodec(poplarFoliagePlacerInstance
            -> foliagePlacerParts(poplarFoliagePlacerInstance).apply(poplarFoliagePlacerInstance, MapleFoliagePlacer::new));

    public MapleFoliagePlacer(IntProvider pRadius, IntProvider pOffset) {
        super(pRadius, pOffset);
    }

    @Override
    protected FoliagePlacerType<?> type() {
        return FoliagePlacerTypeRegistration.MAPLE_FOLIAGE_PLACER.get();
    }

    @Override
    protected void createFoliage(LevelSimulatedReader pLevel, FoliageSetter pBlockSetter, RandomSource pRandom, TreeConfiguration pConfig, int pMaxFreeTreeHeight, FoliageAttachment pAttachment, int pFoliageHeight, int pFoliageRadius, int pOffset) {
        float sizeMultiplier = (float) pRandom.nextInt(100, 130) / 100;
        int height = (int) (8 * sizeMultiplier);
        int radius = 4;

        for (int i = 0; i <= height;){
            if (i == 0){
                radius = (int) (2 * sizeMultiplier);
            }
            if (i == 1){
                radius = (int) (3 * sizeMultiplier);
            }
            if (i > 1){
                radius = (int) (4 * sizeMultiplier);
            }
            if (i > 5){
                radius = (int) (3 * sizeMultiplier);
            }
            if (i > 7){
                radius = (int) (2 * sizeMultiplier);
            }
            if (i == height){
                radius = (int) (1 * sizeMultiplier);
            }

            placeLeavesRow(pLevel, pBlockSetter, pRandom, pConfig, pAttachment.pos().above(), radius, i, pAttachment.doubleTrunk());
            i++;
        }
    }

    @Override
    public int foliageHeight(RandomSource pRandom, int pHeight, TreeConfiguration pConfig) {
        return 0;
    }

    @Override
    protected boolean shouldSkipLocation(RandomSource pRandom, int pLocalX, int pLocalY, int pLocalZ, int pRange, boolean pLarge) {
        float sizeMultiplier = (float) pRandom.nextInt(90, 110) / 100;
        double distance = Math.sqrt(Math.pow(pLocalX, 2) + Math.pow(pLocalZ, 2));
        float radius = pRange * sizeMultiplier;

        return distance > radius;
    }
}
