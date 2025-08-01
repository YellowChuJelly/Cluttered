package net.redchujelly.cluttered.worldgen.tree.custom;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.redchujelly.cluttered.setup.TrunkPlacerTypeRegistration;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class RedMushroomTrunkPlacer extends TrunkPlacer {
    public static final Codec<RedMushroomTrunkPlacer> CODEC = RecordCodecBuilder.create(redMushroomTrunkPlacerInstance ->
            trunkPlacerParts(redMushroomTrunkPlacerInstance).apply(redMushroomTrunkPlacerInstance, RedMushroomTrunkPlacer::new));

    public RedMushroomTrunkPlacer(int pBaseHeight, int pHeightRandA, int pHeightRandB) {
        super(pBaseHeight, pHeightRandA, pHeightRandB);
    }

    @Override
    protected TrunkPlacerType<?> type() {
        return TrunkPlacerTypeRegistration.RED_MUSHROOM_TRUNK_PLACER.get();
    }

    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader pLevel, BiConsumer<BlockPos, BlockState> pBlockSetter, RandomSource pRandom, int pFreeTreeHeight, BlockPos pPos, TreeConfiguration pConfig) {
        setDirtAt(pLevel, pBlockSetter, pRandom, pPos.below(), pConfig);
        List<FoliagePlacer.FoliageAttachment> foliageSpots = new ArrayList<>();
        int maxHeight = pFreeTreeHeight + pRandom.nextInt(heightRandA, heightRandB);

        //randomizes the location of the trunk around the mushroom
        if(pRandom.nextFloat() > 0.5){
            pPos = pPos.relative(Direction.SOUTH);
        }
        if(pRandom.nextFloat() > 0.5){
            pPos = pPos.relative(Direction.WEST);
        }

        for (int i = 0; i < maxHeight;){
            placeLog(pLevel, pBlockSetter, pRandom, pPos.above(i), pConfig);
            placeLog(pLevel, pBlockSetter, pRandom, pPos.relative(Direction.NORTH).above(i), pConfig);
            placeLog(pLevel, pBlockSetter, pRandom, pPos.relative(Direction.EAST).above(i), pConfig);
            placeLog(pLevel, pBlockSetter, pRandom, pPos.relative(Direction.NORTH).relative(Direction.EAST).above(i), pConfig);

            i++;
        }
        foliageSpots.add(new FoliagePlacer.FoliageAttachment(pPos.above(maxHeight).north(), 0, true));
        return foliageSpots;
    }

}
