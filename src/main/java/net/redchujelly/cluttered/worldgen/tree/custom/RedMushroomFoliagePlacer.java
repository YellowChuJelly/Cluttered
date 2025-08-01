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

public class RedMushroomFoliagePlacer extends FoliagePlacer {
    public static final Codec<RedMushroomFoliagePlacer> CODEC = RecordCodecBuilder.create(redMushroomFoliagePlacerInstance
            -> foliagePlacerParts(redMushroomFoliagePlacerInstance).and(Codec.intRange(0, 16).fieldOf("height").forGetter(fp -> fp.height))
            .apply(redMushroomFoliagePlacerInstance, RedMushroomFoliagePlacer::new));

    private final int height;

    public RedMushroomFoliagePlacer(IntProvider pRadius, IntProvider pOffset, int height) {
        super(pRadius, pOffset);
        this.height = height;
    }

    @Override
    protected FoliagePlacerType<?> type() {
        return FoliagePlacerTypeRegistration.RED_MUSHROOM_FOLIAGE_PLACER.get();
    }

    @Override
    protected void createFoliage(LevelSimulatedReader pLevel, FoliageSetter pBlockSetter, RandomSource pRandom, TreeConfiguration pConfig, int pMaxFreeTreeHeight, FoliageAttachment pAttachment, int pFoliageHeight, int pFoliageRadius, int pOffset) {
        float layerSize = (float) ( this.height / 5) - 0.001f;
        for (int i = 0; i < this.height;){
            if (i < 2 * layerSize){
                placeLeavesRow(pLevel, pBlockSetter, pRandom, pConfig, pAttachment.pos(), 1, -i, pAttachment.doubleTrunk());
            } else if (i < 4*layerSize){
                placeLeavesRow(pLevel, pBlockSetter, pRandom, pConfig, pAttachment.pos(), 2, -i, pAttachment.doubleTrunk());
            } else {
                placeLeavesRow(pLevel, pBlockSetter, pRandom, pConfig, pAttachment.pos(), 3, -i, pAttachment.doubleTrunk());
            }
            i++;
        }




    }

    @Override
    public int foliageHeight(RandomSource pRandom, int pHeight, TreeConfiguration pConfig) {
        return this.height;
    }

    @Override
    protected boolean shouldSkipLocation(RandomSource pRandom, int pLocalX, int pLocalY, int pLocalZ, int pRange, boolean pLarge) {
        float layerSize = (float) ( this.height / 5) - 0.001f;

        if (-pLocalY < 1 * layerSize){
            return pLocalX == pLocalZ && pLocalX == pRange;
        } else if (-pLocalY < 2 * layerSize){
            return false;
        } else if (-pLocalY < 4 * layerSize){
            return pLocalX == pLocalZ && pLocalX == pRange || (pLocalX <= 1 && pLocalZ <=1);
        } else {
            return Math.abs(pLocalX) + Math.abs(pLocalZ) >= (pRange * 2) - 1 || (pLocalX <= 1 && pLocalZ <=1);
        }
    }

}