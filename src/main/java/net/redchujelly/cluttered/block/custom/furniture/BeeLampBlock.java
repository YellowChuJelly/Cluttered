package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class BeeLampBlock extends SmallLampBlock{
    private static final VoxelShape SHAPE_NS = Block.box(4.5,1,3,11.5, 8, 13);
    private static final VoxelShape SHAPE_EW = Block.box(3,1,4.5,13, 8, 11.5);
    private final boolean redstone;

    public BeeLampBlock(Properties pProperties, boolean isRedstone) {
        super(pProperties);
        redstone = isRedstone;
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return pState.getValue(FACING).equals(Direction.NORTH) || pState.getValue(FACING).equals(Direction.SOUTH) ? SHAPE_NS : SHAPE_EW;
    }

    @Override
    public int getSignal(BlockState pState, BlockGetter pLevel, BlockPos pPos, Direction pDirection) {
        return redstone ? 15 : 0;
    }

    @Override
    public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) {
        return redstone ? 7 : 15;
    }

    private void updateNeighbors(BlockState pState, Level pLevel, BlockPos pPos){
        pLevel.updateNeighborsAt(pPos, this);
    }

    //@Override
    //protected InteractionResult useWithoutItem(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, BlockHitResult pHit) {
    //    if (!pLevel.isClientSide){
    //        boolean lit = pState.getValue(LIT);
    //        pLevel.setBlock(pPos, pState.setValue(LIT, !lit), 2);
    //        this.updateNeighbors(pState, pLevel, pPos);
    //        pLevel.playSound(null, pPos, SoundEvents.LEVER_CLICK, SoundSource.BLOCKS);
    //    }
    //    return InteractionResult.SUCCESS;
    //}

    @Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        if (!pIsMoving && !pState.is(pNewState.getBlock())) {
            this.updateNeighbors(pState, pLevel, pPos);

            super.onRemove(pState, pLevel, pPos, pNewState, pIsMoving);
        }
    }

    @Override
    public boolean canConnectRedstone(BlockState state, BlockGetter level, BlockPos pos, @Nullable Direction direction) {
        return redstone;
    }
}
