package net.redchujelly.cluttered.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;


public class MushroomSaplingBlock extends SaplingBlock {
    protected static final VoxelShape SHAPE = Block.box(5.0D, 0.0D, 5.0D, 11.0D, 6.0D, 11.0D);

    public MushroomSaplingBlock(TreeGrower pTreeGrower, Properties pProperties) {
        super(pTreeGrower, pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }

    @Override
    protected boolean mayPlaceOn(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        return pState.is(BlockTags.MUSHROOM_GROW_BLOCK) || pState.is(Blocks.MYCELIUM) || pState.is(Blocks.SOUL_SOIL) || super.mayPlaceOn(pState, pLevel, pPos);
    }

    @Override
    public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        if (mushroomGrowOkay(pLevel, pPos)) {
            if (pRandom.nextInt(25) == 0) {
                int i = 5;

                for(BlockPos blockpos : BlockPos.betweenClosed(pPos.offset(-4, -1, -4), pPos.offset(4, 1, 4))) {
                    if (pLevel.getBlockState(blockpos).is(this)) {
                        --i;
                        if (i <= 0) {
                            return;
                        }
                    }
                }

                BlockPos blockpos1 = pPos.offset(pRandom.nextInt(3) - 1, pRandom.nextInt(2) - pRandom.nextInt(2), pRandom.nextInt(3) - 1);

                for(int k = 0; k < 4; ++k) {
                    if (pLevel.isEmptyBlock(blockpos1) && mushroomGrowOkay(pLevel, blockpos1)) {
                        pPos = blockpos1;
                    }

                    blockpos1 = pPos.offset(pRandom.nextInt(3) - 1, pRandom.nextInt(2) - pRandom.nextInt(2), pRandom.nextInt(3) - 1);
                }

                if (pLevel.isEmptyBlock(blockpos1) && mushroomGrowOkay(pLevel, blockpos1)) {
                    pLevel.setBlock(blockpos1, pState, 2);
                }
            }

        }

    }

    private boolean mushroomGrowOkay(ServerLevel pLevel, BlockPos pPos){
        BlockPos blockpos = pPos.below();
        BlockState blockstate = pLevel.getBlockState(blockpos);
        if (blockstate.is(BlockTags.MUSHROOM_GROW_BLOCK)) {
            return true;
        } else {
            return pLevel.getRawBrightness(pPos, 0) < 13 && blockstate.canSustainPlant(pLevel, blockpos, net.minecraft.core.Direction.UP, pLevel.getBlockState(pPos)).isTrue();
        }
    }
}
