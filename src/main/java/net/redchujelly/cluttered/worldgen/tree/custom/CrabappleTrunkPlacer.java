package net.redchujelly.cluttered.worldgen.tree.custom;

import com.mojang.serialization.MapCodec;
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

public class CrabappleTrunkPlacer extends TrunkPlacer {
    public static final MapCodec<CrabappleTrunkPlacer> CODEC = RecordCodecBuilder.mapCodec(crabappleTrunkPlacerInstance ->
            trunkPlacerParts(crabappleTrunkPlacerInstance).apply(crabappleTrunkPlacerInstance, CrabappleTrunkPlacer::new));

    public CrabappleTrunkPlacer(int pBaseHeight, int pHeightRandA, int pHeightRandB) {
        super(pBaseHeight, pHeightRandA, pHeightRandB);
    }

    @Override
    protected TrunkPlacerType<?> type() {
        return TrunkPlacerTypeRegistration.CRABAPPLE_TRUNK_PLACER.get();
    }

    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader pLevel, BiConsumer<BlockPos, BlockState> pBlockSetter, RandomSource pRandom, int pFreeTreeHeight, BlockPos pPos, TreeConfiguration pConfig) {
        setDirtAt(pLevel, pBlockSetter, pRandom, pPos.below(), pConfig);

        int maxHeight = pFreeTreeHeight;
        List<FoliagePlacer.FoliageAttachment> foliageAttachments = new ArrayList<>();
        List<Direction> directions = List.of(Direction.NORTH, Direction.SOUTH, Direction.EAST, Direction.WEST);
        Direction movement = directions.get(pRandom.nextInt(0,4));

        boolean split = false;
        boolean branch1End = false;
        boolean branch2End = false;
        int horizontalOffset = 0;
        float splitChance = 0.0f;


        for (int i = 0; i < maxHeight;){
            //Sees if the trunk should split horizontally and mirror itself
            splitChance += 0.1f;
            if (i > 0 && pRandom.nextFloat() < 0.2f){
                split = true;
            }
            //Handles the split trunk placement
            if (split){
                if (!branch1End) {
                    placeLog(pLevel, pBlockSetter, pRandom, pPos.relative(Direction.UP, i).relative(movement, horizontalOffset), pConfig);
                    if (i > 1) {
                        foliageAttachments.add(new FoliagePlacer.FoliageAttachment(pPos.relative(Direction.UP, i).relative(movement, horizontalOffset), 0, false));
                    }
                }
                if (!branch2End) {
                    placeLog(pLevel, pBlockSetter, pRandom, pPos.relative(Direction.UP, i).relative(movement, -horizontalOffset), pConfig);
                    if (i > 1) {
                        foliageAttachments.add(new FoliagePlacer.FoliageAttachment(pPos.relative(Direction.UP, i).relative(movement, -horizontalOffset), 0, false));
                    }

                }
                if (i > 0){
                    if (!branch1End) {
                        placeLog(pLevel, pBlockSetter, pRandom, pPos.relative(Direction.UP, i - 1).relative(movement, horizontalOffset), pConfig);
                    }
                    if (!branch2End) {
                        placeLog(pLevel, pBlockSetter, pRandom, pPos.relative(Direction.UP, i - 1).relative(movement, -horizontalOffset), pConfig);
                    }
                }
                //Sees if one branch should end early
                if (branch1End == branch2End){
                    if (pRandom.nextFloat() < 0.25){
                        if (pRandom.nextBoolean()){
                            branch1End = true;
                            foliageAttachments.add(new FoliagePlacer.FoliageAttachment(pPos.relative(Direction.UP, i).relative(movement, horizontalOffset), 0, false));

                        } else {
                            branch2End = true;
                            foliageAttachments.add(new FoliagePlacer.FoliageAttachment(pPos.relative(Direction.UP, i).relative(movement, -horizontalOffset), 0, false));
                        }
                    }
                }
                //Increments the horizontal offset for how far the split trunk goes
                horizontalOffset++;
            }

            //Places a straight log if the tree hasnt split yet
            else {
                placeLog(pLevel, pBlockSetter, pRandom, pPos.relative(Direction.UP, i), pConfig);
            }

            i++;
            //adds the foliage spots to the list
            if (i > maxHeight){
                if (!split){
                    foliageAttachments.add(new FoliagePlacer.FoliageAttachment(pPos.relative(Direction.UP, i), 0, false));
                }
                if (!branch1End && split) {
                    foliageAttachments.add(new FoliagePlacer.FoliageAttachment(pPos.relative(Direction.UP, i).relative(movement, horizontalOffset), 0, false));
                }
                if (!branch2End && split) {
                    foliageAttachments.add(new FoliagePlacer.FoliageAttachment(pPos.relative(Direction.UP, i).relative(movement, -horizontalOffset), 0, false));
                }
            }
        }
        if (foliageAttachments.size() <= 1){
            horizontalOffset--;
            if (!split){
                foliageAttachments.add(new FoliagePlacer.FoliageAttachment(pPos.relative(Direction.UP, maxHeight), 0, false));
            }
            if (!branch1End && split) {
                foliageAttachments.add(new FoliagePlacer.FoliageAttachment(pPos.relative(Direction.UP, maxHeight -1).relative(movement, horizontalOffset), 0, false));
            }
            if (!branch2End && split) {
                foliageAttachments.add(new FoliagePlacer.FoliageAttachment(pPos.relative(Direction.UP, maxHeight -1).relative(movement, -horizontalOffset), 0, false));
            }
        }

        return foliageAttachments;
    }
}
