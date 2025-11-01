package net.redchujelly.cluttered.block.custom.food;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.redchujelly.cluttered.block.custom.furniture.SmallFurnitureBlock;
import net.redchujelly.cluttered.setup.BlockRegistration;

public class PastryBlock extends SmallFurnitureBlock {
    private final int hunger;
    private final float saturation;

    private static final VoxelShape PLATE_SHAPE = Block.box(2,0,2,14,1,14);
    private static final VoxelShape SHAPE = Shapes.or(Block.box(4,0,4,12,6,12), PLATE_SHAPE);


    public PastryBlock(Properties pProperties, int hunger, float saturation) {
        super(pProperties);
        this.hunger = hunger;
        this.saturation = saturation;

    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, BlockHitResult pHit) {
        if (pLevel.isClientSide) {
            if (eat(pLevel, pPos, pState, pPlayer).consumesAction()) {
                return InteractionResult.SUCCESS;
            }

            if (pPlayer.getItemInHand(pHand).isEmpty()) {
                return InteractionResult.CONSUME;
            }
        }

        return eat(pLevel, pPos, pState, pPlayer);
    }

    protected InteractionResult eat(LevelAccessor pLevel, BlockPos pPos, BlockState pState, Player pPlayer) {
        if (!pPlayer.canEat(false)) {
            return InteractionResult.PASS;
        } else {
            pPlayer.awardStat(Stats.EAT_CAKE_SLICE);
            pPlayer.getFoodData().eat(this.hunger, this.saturation);
            pLevel.gameEvent(pPlayer, GameEvent.EAT, pPos);
            pLevel.playSound(null, pPlayer.blockPosition(), SoundEvents.GENERIC_EAT, SoundSource.PLAYERS);
            pLevel.setBlock(pPos, BlockRegistration.PASTRY_PLATE.get().defaultBlockState().setValue(FACING, pState.getValue(FACING)), 2);

            return InteractionResult.SUCCESS;
        }
    }
}
