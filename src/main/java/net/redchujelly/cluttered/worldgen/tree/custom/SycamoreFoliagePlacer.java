package net.redchujelly.cluttered.worldgen.tree.custom;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.redchujelly.cluttered.setup.FoliagePlacerTypeRegistration;

public class SycamoreFoliagePlacer extends FoliagePlacer {
    public static final MapCodec<SycamoreFoliagePlacer> CODEC = RecordCodecBuilder.mapCodec(sycamoreFoliagePlacerInstance
            -> foliagePlacerParts(sycamoreFoliagePlacerInstance).and(Codec.intRange(0, 16).fieldOf("height").forGetter(fp -> fp.height))
            .apply(sycamoreFoliagePlacerInstance, SycamoreFoliagePlacer::new));

    private final int height;

    public SycamoreFoliagePlacer(IntProvider pRadius, IntProvider pOffset, int height) {
        super(pRadius, pOffset);
        this.height = height;
    }

    @Override
    protected FoliagePlacerType<?> type() {
        return FoliagePlacerTypeRegistration.SYCAMORE_FOLIAGE_PLACER.get();
    }

    @Override
    public int foliageHeight(RandomSource pRandom, int pHeight, TreeConfiguration pConfig) {
        return this.height;
    }

    @Override
    protected void createFoliage(LevelSimulatedReader pLevel, FoliageSetter pBlockSetter, RandomSource pRandom, TreeConfiguration pConfig, int pMaxFreeTreeHeight, FoliageAttachment pAttachment, int pFoliageHeight, int pFoliageRadius, int pOffset) {
        BlockPos nextPos = pAttachment.pos().above();

        if (pAttachment.doubleTrunk()){
            for (int i = 0; i < height;){

                if (i <= 1) {
                    placeLeavesRow(pLevel, pBlockSetter, pRandom, pConfig, nextPos, 2, -i, true);
                }
                if (i <= 3) {
                    placeLeavesRow(pLevel, pBlockSetter, pRandom, pConfig, nextPos, 3, -i, true);
                }
                if (i <= 5) {
                    placeLeavesRow(pLevel, pBlockSetter, pRandom, pConfig, nextPos, 1, -i, true);
                }

                i++;
            }
        }
        else {
            for (int j = 0; j < 3;){
                placeLeavesRow(pLevel, pBlockSetter, pRandom, pConfig, nextPos, 1, -j, false);
                j++;
            }
        }



    }


    @Override
    protected boolean shouldSkipLocation(RandomSource pRandom, int pLocalX, int pLocalY, int pLocalZ, int pRange, boolean pLarge) {
        if (pLarge){
            double distance = Math.sqrt(Math.pow(pLocalX, 2) + Math.pow(pLocalZ, 2));
            if (pLocalY == 0){
                return distance > 2.0f;
            }
            else if (pLocalY == -1){
                return pLocalX > 2 || pLocalZ > 2.0 + ((float) pRandom.nextInt(0, 40) /100);
            }
            else if (pLocalY >= -3){
                return distance > 3.0f + ((float) pRandom.nextInt(-20, 50) /100);
            }
            else if (-pLocalY == height - 1){
                return pRandom.nextFloat() < 0.7;
            }

        }
        else {
            if (pLocalY == 0){
                return pLocalX == pLocalZ && pLocalX == pRange;
            } else if (pLocalY == -2){
                return pRandom.nextBoolean();
            }
        }
        return false;
    }
}
