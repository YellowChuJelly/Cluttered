package net.redchujelly.cluttered.worldgen.tree.custom;

import com.mojang.serialization.Codec;
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
import net.redchujelly.cluttered.setup.TrunkPlacerTypesRegistration;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class WillowTrunkPlacer extends TrunkPlacer {
    public static final Codec<WillowTrunkPlacer> CODEC = RecordCodecBuilder.create(willowTrunkPlacerInstance ->
            trunkPlacerParts(willowTrunkPlacerInstance).apply(willowTrunkPlacerInstance, WillowTrunkPlacer::new));

    public WillowTrunkPlacer(int pBaseHeight, int pHeightRandA, int pHeightRandB) {
        super(pBaseHeight, pHeightRandA, pHeightRandB);
    }

    @Override
    protected TrunkPlacerType<?> type() {
        return TrunkPlacerTypesRegistration.WILLOW_TRUNK_PLACER.get();
    }

    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader pLevel, BiConsumer<BlockPos, BlockState> biConsumer, RandomSource randomSource, int freeTreeHeight, BlockPos pPos, TreeConfiguration treeConfiguration) {
        setDirtAt(pLevel, biConsumer, randomSource, pPos.below(), treeConfiguration);

        List<FoliagePlacer.FoliageAttachment> foliageSpots = new ArrayList<>();
        int maxHeight = freeTreeHeight + randomSource.nextInt(heightRandA, heightRandB) + randomSource.nextInt(-3, 0);
        int xOffset = 0;
        int zOffset = 0;

        //TRUNK
        //8 of these bad boys in the list. first 4 are NESW bottom log heights. second 4 are NESW top log heights. for the sides of the tree.
        List<Integer> sideHeights = List.of(randomSource.nextInt(0, 5), randomSource.nextInt(0, 5),randomSource.nextInt(0, 5),
                randomSource.nextInt(0, 5),randomSource.nextInt(0, 5),randomSource.nextInt(0, 5),randomSource.nextInt(0, 5),
                randomSource.nextInt(0, 5));

        BlockPos nextPos = pPos;

        placeLog(pLevel, biConsumer, randomSource, pPos, treeConfiguration);
        for (int i = 0; i < maxHeight; i++) {
            if(randomSource.nextFloat() > .85f){
                zOffset += randomSource.nextInt(-1, 1);
            }
            if(randomSource.nextFloat() > .85f){
                xOffset += randomSource.nextInt(-1, 1);
            }
            nextPos = new BlockPos(pPos.getX() + xOffset, pPos.getY() + i, pPos.getZ() + zOffset);
            placeLog(pLevel, biConsumer, randomSource, nextPos, treeConfiguration);
            placeLog(pLevel, biConsumer, randomSource, nextPos.below(), treeConfiguration);

            if (i - 2 <= sideHeights.get(0) || i >= maxHeight - sideHeights.get(4)){
                placeLog(pLevel, biConsumer, randomSource, nextPos.north(), treeConfiguration);
            }
            if (i - 2 <= sideHeights.get(1) || i >= maxHeight - sideHeights.get(5)){
                placeLog(pLevel, biConsumer, randomSource, nextPos.east(), treeConfiguration);
            }
            if (i - 2 <= sideHeights.get(2) || i >= maxHeight - sideHeights.get(6)){
                placeLog(pLevel, biConsumer, randomSource, nextPos.south(), treeConfiguration);
            }
            if (i - 2 <= sideHeights.get(3) || i >= maxHeight - sideHeights.get(7)){
                placeLog(pLevel, biConsumer, randomSource, nextPos.west(), treeConfiguration);
            }
        }
        foliageSpots.add(new FoliagePlacer.FoliageAttachment(nextPos, 0, false));

            //BRANCHES
            //Generates some number of branches
            int branchNumber = randomSource.nextInt(3, 8);
            BlockPos pastPos = nextPos;

            for (int j = 1; j <= branchNumber; j++) {
                nextPos = pastPos;
                int branchMaxBlocks = randomSource.nextInt(12, 20);
                int branchAngle = (360 / branchNumber) * j + randomSource.nextInt(-15, 15);
                if (branchAngle < 0) {
                    branchAngle += 360;
                } else if (branchAngle >= 360) {
                    branchAngle -= 360;
                }

                BlockState logDirection = treeConfiguration.trunkProvider.getState(randomSource, pPos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.X);
                if ((branchAngle > 45 && branchAngle <= 135) || (branchAngle < 315 && branchAngle >= 225)) {
                    logDirection = treeConfiguration.trunkProvider.getState(randomSource, pPos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z);
                }

                BlockState pastLogDirection = logDirection;

                boolean wentDown = false;
                if (branchAngle < 90) {
                    for (int k = 0; k < branchMaxBlocks; ) {
                        logDirection = pastLogDirection;

                        if(k % 2 == 0 || wentDown){
                            foliageSpots.add(new FoliagePlacer.FoliageAttachment(nextPos, 0, false));
                        }
                        wentDown = false;

                        if (randomSource.nextFloat() > (float) branchAngle / 90) {
                            nextPos = nextPos.east();
                        } else {
                            nextPos = nextPos.north();
                        }
                        if (randomSource.nextFloat() < k / (branchMaxBlocks * (float) (1 + randomSource.nextInt(0, 2)))) {
                            nextPos = nextPos.below();
                            logDirection = treeConfiguration.trunkProvider.getState(randomSource, pPos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.Y);
                            wentDown = true;
                        }
                        biConsumer.accept(nextPos, (BlockState) Function.identity().apply(logDirection));
                        k++;
                        if (wentDown) {
                            biConsumer.accept(nextPos.above(), (BlockState) Function.identity().apply(logDirection));
                            k++;
                        }
                    }
                } else if (branchAngle < 180) {
                    for (int k = 0; k < branchMaxBlocks; ) {
                        logDirection = pastLogDirection;

                        if(k % 2 == 0 || wentDown){
                            foliageSpots.add(new FoliagePlacer.FoliageAttachment(nextPos, 0, false));
                        }
                        wentDown = false;

                        if (randomSource.nextFloat() > (float) (branchAngle - 90) / 90) {
                            nextPos = nextPos.south();
                        } else {
                            nextPos = nextPos.east();
                        }
                        if (randomSource.nextFloat() < k / (branchMaxBlocks * (float) (1 + randomSource.nextInt(0, 2)))) {
                            nextPos = nextPos.below();
                            logDirection = treeConfiguration.trunkProvider.getState(randomSource, pPos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.Y);
                            wentDown = true;
                        }
                        biConsumer.accept(nextPos, (BlockState) Function.identity().apply(logDirection));
                        k++;
                        if (wentDown) {
                            biConsumer.accept(nextPos.above(), (BlockState) Function.identity().apply(logDirection));
                            k++;
                        }
                    }
                } else if (branchAngle < 270) {
                    for (int k = 0; k < branchMaxBlocks; ) {
                        logDirection = pastLogDirection;

                        if(k % 2 == 0 || wentDown){
                            foliageSpots.add(new FoliagePlacer.FoliageAttachment(nextPos, 0, false));
                        }
                        wentDown = false;

                        if (randomSource.nextFloat() > (float) (branchAngle - 180) / 90) {
                            nextPos = nextPos.west();
                        } else {
                            nextPos = nextPos.south();
                        }
                        if (randomSource.nextFloat() < k / (branchMaxBlocks * (float) (1 + randomSource.nextInt(0, 2)))) {
                            nextPos = nextPos.below();
                            logDirection = treeConfiguration.trunkProvider.getState(randomSource, pPos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.Y);
                            wentDown = true;
                        }
                        biConsumer.accept(nextPos, (BlockState) Function.identity().apply(logDirection));
                        k++;
                        if (wentDown) {
                            biConsumer.accept(nextPos.above(), (BlockState) Function.identity().apply(logDirection));
                            k++;
                        }
                    }
                } else {
                    for (int k = 0; k < branchMaxBlocks; ) {
                        logDirection = pastLogDirection;

                        if(k % 2 == 0 || wentDown){
                            foliageSpots.add(new FoliagePlacer.FoliageAttachment(nextPos, 0, false));
                        }
                        wentDown = false;


                        if (randomSource.nextFloat() > (float) (branchAngle - 270) / 90) {
                            nextPos = nextPos.north();
                        } else {
                            nextPos = nextPos.west();
                        }
                        if (randomSource.nextFloat() < k / (branchMaxBlocks * (float) (1 + randomSource.nextInt(0, 2)))) {
                            nextPos = nextPos.below();
                            logDirection = treeConfiguration.trunkProvider.getState(randomSource, pPos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.Y);
                            wentDown = true;
                        }
                        biConsumer.accept(nextPos, (BlockState) Function.identity().apply(logDirection));
                        k++;
                        if (wentDown) {
                            biConsumer.accept(nextPos.above(), (BlockState) Function.identity().apply(logDirection));
                            k++;
                        }
                    }
                }
                foliageSpots.add(new FoliagePlacer.FoliageAttachment(nextPos, 0, false));
            }
            return foliageSpots;
        }
}
