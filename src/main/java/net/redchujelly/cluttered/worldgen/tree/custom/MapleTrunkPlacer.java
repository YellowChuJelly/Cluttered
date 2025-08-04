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
import net.redchujelly.cluttered.setup.TrunkPlacerTypeRegistration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class MapleTrunkPlacer extends TrunkPlacer {
    public static final Codec<MapleTrunkPlacer> CODEC = RecordCodecBuilder.create(mapleTrunkPlacerInstance ->
            trunkPlacerParts(mapleTrunkPlacerInstance).apply(mapleTrunkPlacerInstance, MapleTrunkPlacer::new));
    private static final Logger log = LoggerFactory.getLogger(MapleTrunkPlacer.class);

    public MapleTrunkPlacer(int pBaseHeight, int pHeightRandA, int pHeightRandB) {
        super(pBaseHeight, pHeightRandA, pHeightRandB);
    }

    @Override
    protected TrunkPlacerType<?> type() {
        return TrunkPlacerTypeRegistration.MAPLE_TRUNK_PLACER.get();
    }

    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader pLevel, BiConsumer<BlockPos, BlockState> pBlockSetter, RandomSource pRandom, int pFreeTreeHeight, BlockPos pPos, TreeConfiguration pConfig) {
        setDirtAt(pLevel, pBlockSetter, pRandom, pPos.below(), pConfig);

        List<Direction> directions = List.of(Direction.NORTH, Direction.SOUTH, Direction.EAST, Direction.WEST);
        List<FoliagePlacer.FoliageAttachment> foliageAttachments = new ArrayList<>();
        int maxHeight = baseHeight + pRandom.nextInt(heightRandA, heightRandB + 1);
        int stumpHeight = pRandom.nextInt(2, 3);
        int branchHeight1 = pRandom.nextInt(2, 5);
        int branchHeight2 = branchHeight1 + pRandom.nextInt(1,3);
        int branchHeight3 = branchHeight2 + pRandom.nextInt(2, 4);
        int tempHeight = branchHeight1;
        int branchLength;
        int roots = 2;
        if (pRandom.nextBoolean()){
            roots++;
        }

        for (int r = 0; r < roots;){
            Direction cardinal = directions.get(pRandom.nextInt(0,4));
            int amount = pRandom.nextIntBetweenInclusive(-1,1);
            placeLog(pLevel, pBlockSetter, pRandom, pPos.relative(cardinal).relative(cardinal.getClockWise(), amount), pConfig);
            r++;
        }
        //places stump
        for (int s = 0; s < stumpHeight;){
            placeLog(pLevel, pBlockSetter, pRandom, pPos.above(s), pConfig);
            s++;
        }
        pPos = pPos.above(stumpHeight - 1);

        for (int i = 1; i <= maxHeight;){

            //Places the trunk
            placeLog(pLevel, pBlockSetter, pRandom, pPos.above(i), pConfig);

            //Places the first layer of branches
            if (i == tempHeight){
                //Adds the foliage spot to
                foliageAttachments.add(new FoliagePlacer.FoliageAttachment(pPos.above(branchHeight1 - 2), 0, false));
                branchLength = 4;
                //One branch for each direction
                for (Direction direction : directions){
                    tempHeight = branchHeight1;
                    if (pRandom.nextFloat() < 0.25f){
                        branchLength--;
                    }
                    for (int j = 1; j <= branchLength;){
                        //Chance to skip a branch
                        if (j == 1 && pRandom.nextFloat() < 0.1){
                            break;
                        }
                        if (j == branchLength){
                            tempHeight++;
                        }
                        BlockState log = pConfig.trunkProvider.getState(pRandom, pPos).setValue(RotatedPillarBlock.AXIS, direction.getAxis());
                        pBlockSetter.accept(pPos.above(tempHeight).relative(direction, j), (BlockState) Function.identity().apply(log));
                        j++;
                    }
                }
            }
            //Places the second layer of branches
            if (i + 1 == branchHeight2){
                branchLength = pRandom.nextInt(2, 4);
                //One branch for each direction
                for (Direction direction : directions){
                    tempHeight = branchHeight2;
                    if (pRandom.nextFloat() < 0.25f){
                        branchLength--;
                    }
                    for (int j = 1; j <= branchLength;){
                        //Chance to skip a branch
                        if (j == 1 && pRandom.nextFloat() < 0.1){
                            break;
                        }
                        if (j == branchLength){
                            tempHeight++;
                        }
                        BlockState log = pConfig.trunkProvider.getState(pRandom, pPos).setValue(RotatedPillarBlock.AXIS, direction.getAxis());
                        pBlockSetter.accept(pPos.above(tempHeight).relative(direction, j), (BlockState) Function.identity().apply(log));
                        j++;
                    }
                }
            }
            //Places the third layer of branches
            if (i + 1 == branchHeight3){
                branchLength = 1;
                //One branch for each direction
                for (Direction direction : directions){
                    tempHeight = branchHeight3;
                    for (int j = 1; j <= branchLength;){
                        //Chance to skip a branch
                        if (j == 1 && pRandom.nextFloat() < 0.1){
                            break;
                        }
                        if (j == branchLength){
                            tempHeight++;
                        }
                        BlockState log = pConfig.trunkProvider.getState(pRandom, pPos).setValue(RotatedPillarBlock.AXIS, direction.getAxis());
                        pBlockSetter.accept(pPos.above(tempHeight).relative(direction, j), (BlockState) Function.identity().apply(log));
                        j++;
                    }
                }
            }

            i++;
        }


        return foliageAttachments;
    }
}
