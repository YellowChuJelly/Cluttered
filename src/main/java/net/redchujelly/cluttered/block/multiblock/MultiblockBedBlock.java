package net.redchujelly.cluttered.block.multiblock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.vehicle.DismountHelper;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class MultiblockBedBlock extends MultiblockPlacer{
    private static final VoxelShape SHAPE = Block.box(0,0,0,16,9,16);
    public static final BooleanProperty OCCUPIED = BlockStateProperties.OCCUPIED;

    public static final IntegerProperty MULTIBLOCK_PART = IntegerProperty.create("part", 1, 6);
    private static final int[][][] MULTIBLOCK_SHAPE = {
            {
                    {1,3,5},
                    {2,4,6},
            },
    };

    public MultiblockBedBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.defaultBlockState().setValue(OCCUPIED, false));
    }

	@Override
	public boolean isBed(BlockState state, BlockGetter level, BlockPos pos, LivingEntity sleeper) {
		return true;
	}

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }

    @Override
    public Direction getBedDirection(BlockState state, LevelReader level, BlockPos pos) {
        return state.getValue(FACING);
    }

    //@Override
    //public void setBedOccupied(BlockState state, Level level, BlockPos pos, LivingEntity sleeper, boolean occupied) {
    //    BlockPos pos1 = findBlockState1(pos, level);
    //    Direction facing = state.getValue(FACING);
    //    if(state.getValue(getMultiblockPart()) % 2 != 0){
    //        BlockPos[] posList = new BlockPos[]{pos1, pos1.relative(facing), pos1.relative(facing, 2)};
    //        for (BlockPos block : posList){
    //            if (level.getBlockState(block).is(this.asBlock())){
    //                level.setBlock(block, state.setValue(OCCUPIED, occupied), 10);
    //            }
    //        }
    //    }
    //    else {
    //        pos1 = pos1.relative(facing.getClockWise());
    //        BlockPos[] posList = new BlockPos[]{pos1, pos1.relative(facing), pos1.relative(facing, 2)};
    //        for (BlockPos block : posList){
    //            if (level.getBlockState(block).is(this.asBlock())){
    //                level.setBlock(block, state.setValue(OCCUPIED, occupied), 10);
    //            }
    //        }
    //    }
    //}

    @Override
    public void setBedOccupied(BlockState state, Level level, BlockPos pos, LivingEntity sleeper, boolean occupied) {
        level.setBlock(pos, state.setValue(OCCUPIED, occupied), 2);
    }

    protected InteractionResult useWithoutItem(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, BlockHitResult pHit) {
        if (pLevel.isClientSide) {
            return InteractionResult.CONSUME;
        } else {
            int part = pState.getValue(getMultiblockPart());
            if(part == 3 || part == 4){
                pPos = pPos.relative(pState.getValue(FACING));
                pState = pLevel.getBlockState(pPos);
                if (!pState.is(this)) {
                    return InteractionResult.CONSUME;
                }
            }
            if (part == 1 || part == 2){
                pPos = pPos.relative(pState.getValue(FACING), 2);
                pState = pLevel.getBlockState(pPos);
                if (!pState.is(this)) {
                    return InteractionResult.CONSUME;
                }
            }

            if (!canSetSpawn(pLevel)) {
                pLevel.removeBlock(pPos, false);
                BlockPos removePos = pPos.relative((pState.getValue(FACING)).getOpposite());
                if (pLevel.getBlockState(removePos).is(this)) {
                    pLevel.removeBlock(removePos, false);
                }

                Vec3 center = pPos.getCenter();
                pLevel.explode(null, pLevel.damageSources().badRespawnPointExplosion(center), null, center, 5.0F, true, Level.ExplosionInteraction.BLOCK);
            } else if (pState.getValue(OCCUPIED)) {
                pPlayer.displayClientMessage(Component.translatable("block.minecraft.bed.occupied"), true);

                return InteractionResult.SUCCESS;
            } else {
                pPlayer.startSleepInBed(pPos).ifLeft((sleepingProblem) -> {
                    if (sleepingProblem.getMessage() != null) {
                        pPlayer.displayClientMessage(sleepingProblem.getMessage(), true);
                    }
                });
            }
            return InteractionResult.SUCCESS;
        }
    }

    public static boolean canSetSpawn(Level pLevel) {
        return pLevel.dimensionType().bedWorks();
    }

    public void fallOn(Level pLevel, BlockState pState, BlockPos pPos, Entity pEntity, float pFallDistance) {
        super.fallOn(pLevel, pState, pPos, pEntity, pFallDistance * 0.5F);
    }

    public void updateEntityAfterFallOn(BlockGetter pLevel, Entity pEntity) {
        if (pEntity.isSuppressingBounce()) {
            super.updateEntityAfterFallOn(pLevel, pEntity);
        } else {
            this.bounceUp(pEntity);
        }

    }

    private void bounceUp(Entity pEntity) {
        Vec3 $$1 = pEntity.getDeltaMovement();
        if ($$1.y < (double)0.0F) {
            double $$2 = pEntity instanceof LivingEntity ? (double)1.0F : 0.8;
            pEntity.setDeltaMovement($$1.x, -$$1.y * (double)0.66F * $$2, $$1.z);
        }

    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        super.createBlockStateDefinition(pBuilder);
        pBuilder.add(OCCUPIED);
    }

    public boolean isPathfindable(BlockState pState, BlockGetter pLevel, BlockPos pPos, PathComputationType pType) {
        return false;
    }

    @Override
    public IntegerProperty getMultiblockPart() {
        return MULTIBLOCK_PART;
    }

    @Override
    public int[][][] getMultiblockShape() {
        return MULTIBLOCK_SHAPE;
    }
}
