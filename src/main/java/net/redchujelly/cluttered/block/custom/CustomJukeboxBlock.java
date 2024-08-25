package net.redchujelly.cluttered.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.JukeboxBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.JukeboxBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;

public class CustomJukeboxBlock extends JukeboxBlock {
    public CustomJukeboxBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if (pState.getValue(HAS_RECORD)) {
            return super.use(pState, pLevel, pPos, pPlayer, pHand, pHit);
        } else if (pPlayer.getItemInHand(pHand).getItem() instanceof RecordItem) {
            ItemStack record = pPlayer.getItemInHand(pHand);
            if (!pLevel.isClientSide) {
                BlockEntity blockEntity = pLevel.getBlockEntity(pPos);
                if (blockEntity instanceof JukeboxBlockEntity) {
                    JukeboxBlockEntity jukeboxBlockEntity = (JukeboxBlockEntity) blockEntity;
                    jukeboxBlockEntity.setFirstItem(record.copy());
                    pLevel.gameEvent(GameEvent.BLOCK_CHANGE, pPos, GameEvent.Context.of(pPlayer, pState));
                }

                record.shrink(1);
                if (pPlayer != null) {
                    pPlayer.awardStat(Stats.PLAY_RECORD);
                }
            }
            return InteractionResult.sidedSuccess(pLevel.isClientSide);
        }
        else {
            return InteractionResult.PASS;
        }
    }
}
