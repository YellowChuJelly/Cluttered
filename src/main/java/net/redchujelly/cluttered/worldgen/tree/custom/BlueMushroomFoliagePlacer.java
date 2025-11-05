package net.redchujelly.cluttered.worldgen.tree.custom;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.redchujelly.cluttered.setup.FoliagePlacerTypeRegistration;

public class BlueMushroomFoliagePlacer extends FoliagePlacer {
    public static final MapCodec<BlueMushroomFoliagePlacer> CODEC = RecordCodecBuilder.mapCodec(blueMushroomFoliagePlacerInstance
            -> foliagePlacerParts(blueMushroomFoliagePlacerInstance).and(Codec.intRange(0, 16).fieldOf("height").forGetter(fp -> fp.height))
            .apply(blueMushroomFoliagePlacerInstance, BlueMushroomFoliagePlacer::new));

    private final int height;

    public BlueMushroomFoliagePlacer(IntProvider pRadius, IntProvider pOffset, int height) {
        super(pRadius, pOffset);
        this.height = height;
    }

    @Override
    protected FoliagePlacerType<?> type() {
        return FoliagePlacerTypeRegistration.BLUE_MUSHROOM_FOLIAGE_PLACER.get();
    }

    @Override
    protected void createFoliage(LevelSimulatedReader pLevel, FoliageSetter pBlockSetter, RandomSource pRandom, TreeConfiguration pConfig, int pMaxFreeTreeHeight, FoliageAttachment pAttachment, int pFoliageHeight, int pFoliageRadius, int pOffset) {
        for (int i = 0; i < height;){
            placeLeavesRow(pLevel, pBlockSetter, pRandom, pConfig, pAttachment.pos(), 3 + i, -i, pAttachment.doubleTrunk());
            i++;
        }

    }

    @Override
    public int foliageHeight(RandomSource pRandom, int pHeight, TreeConfiguration pConfig) {
        return this.height;
    }

    @Override
    protected boolean shouldSkipLocation(RandomSource pRandom, int pLocalX, int pLocalY, int pLocalZ, int pRange, boolean pLarge) {
        double distance = Math.sqrt(Math.pow(pLocalX, 2) + Math.pow(pLocalZ, 2));
        if(pLocalY < 0){
            if (-pLocalY == this.height - 1){
            }
            return distance > this.height + 0.3f - pLocalY || distance < this.height - pLocalY - 1.7;
        }
        else
        {
            return distance > this.height - 0.4 - pLocalY;
        }
    }

}
