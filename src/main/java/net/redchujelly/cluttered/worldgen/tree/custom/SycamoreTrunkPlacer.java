package net.redchujelly.cluttered.worldgen.tree.custom;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.redchujelly.cluttered.setup.TrunkPlacerTypeRegistration;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class SycamoreTrunkPlacer extends TrunkPlacer {
    public static final MapCodec<SycamoreTrunkPlacer> CODEC = RecordCodecBuilder.mapCodec(crabappleTrunkPlacerInstance ->
            trunkPlacerParts(crabappleTrunkPlacerInstance).apply(crabappleTrunkPlacerInstance, SycamoreTrunkPlacer::new));

    public SycamoreTrunkPlacer(int pBaseHeight, int pHeightRandA, int pHeightRandB) {
        super(pBaseHeight, pHeightRandA, pHeightRandB);
    }

    @Override
    protected TrunkPlacerType<?> type() {
        return TrunkPlacerTypeRegistration.SYCAMORE_TRUNK_PLACER.get();
    }

    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader pLevel, BiConsumer<BlockPos, BlockState> pBlockSetter, RandomSource pRandom, int pFreeTreeHeight, BlockPos pPos, TreeConfiguration pConfig) {
        setDirtAt(pLevel, pBlockSetter, pRandom, pPos.below(), pConfig);
        List<FoliagePlacer.FoliageAttachment> foliageSpots = new ArrayList<>();
        int maxHeight = pFreeTreeHeight + pRandom.nextInt(heightRandA, heightRandB);
        List<Direction> directions = new ArrayList<>(List.of(Direction.NORTH, Direction.SOUTH, Direction.EAST, Direction.WEST));

        //randomizes the location of the trunk around the tree
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
        int branches = pRandom.nextInt(1,4);
        for (int j = 0; j < branches; j++){
            Direction branchDirection = directions.get(pRandom.nextInt(0, directions.size()));
            directions.remove(branchDirection);

            //Starts the branch in the correct spot on the tree
            if (branchDirection.equals(Direction.NORTH)){
                pPos = pPos.north();
            }
            else if (branchDirection.equals(Direction.EAST)){
                pPos = pPos.east();
            }

            //randomizes the half of the tree that the branch comes from
            if (branchDirection.equals(Direction.NORTH) || branchDirection.equals(Direction.SOUTH)){
                if (pRandom.nextBoolean()){
                    pPos = pPos.east();
                }
            } else if (pRandom.nextBoolean()){
                pPos = pPos.north();
            }

            int branchHeight = pRandom.nextInt(3, maxHeight - 2);
            int branchLength = pRandom.nextInt(2, 5);
            BlockState log = pConfig.trunkProvider.getState(pRandom, pPos).setValue(RotatedPillarBlock.AXIS, branchDirection.getAxis());
            BlockPos nextPos = pPos;

            //places logs for branches
            for (int b = 0; b < branchLength;){
                nextPos = pPos.above(branchHeight).relative(branchDirection, b + 1);

                if (pRandom.nextFloat() < 0.2){
                    pBlockSetter.accept(nextPos, (BlockState) Function.identity().apply(log));
                    branchHeight++;
                }
                pBlockSetter.accept(nextPos, (BlockState) Function.identity().apply(log));
                if (b == 0){
                    pBlockSetter.accept(nextPos.relative(branchDirection, -1), (BlockState) Function.identity().apply(log));
                }
                b++;
                if (b == branchLength){
                    foliageSpots.add(new FoliagePlacer.FoliageAttachment(nextPos, 0, false));
                }
            }


        }


        return foliageSpots;
    }
}
