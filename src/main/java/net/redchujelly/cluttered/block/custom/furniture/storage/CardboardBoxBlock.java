package net.redchujelly.cluttered.block.custom.furniture.storage;

import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.redchujelly.cluttered.block.entity.CardboardBoxBlockEntity;
import net.redchujelly.cluttered.block.entity.CustomStorageBlockEntity;
import net.redchujelly.cluttered.setup.TileEntityRegistration;
import net.redchujelly.cluttered.util.CardboardBoxStates;
import org.jetbrains.annotations.Nullable;

public class CardboardBoxBlock extends StorageBlock{

    public static final EnumProperty<CardboardBoxStates> OPEN_STATE = EnumProperty.create("open_state", CardboardBoxStates.class);

    public CardboardBoxBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.defaultBlockState().setValue(OPEN_STATE, CardboardBoxStates.EMPTY));
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if (pLevel.isClientSide) {
            return InteractionResult.SUCCESS;
        }
        if (!pPlayer.isCrouching()) {
            BlockEntity blockEntity = pLevel.getBlockEntity(pPos);
            if (blockEntity instanceof CustomStorageBlockEntity) {
                pPlayer.openMenu((CustomStorageBlockEntity) blockEntity);
                return InteractionResult.CONSUME;
            }
        } else {
            if (pState.getValue(OPEN_STATE).equals(CardboardBoxStates.CLOSED)) {
                BlockEntity entity = pLevel.getBlockEntity(pPos);
                if (!(entity instanceof CardboardBoxBlockEntity)){
                    pLevel.removeBlock(pPos,false);
                    return InteractionResult.CONSUME;
                }

                pLevel.setBlock(pPos, pState.setValue(OPEN_STATE, ((CardboardBoxBlockEntity) entity).containsItems() ? CardboardBoxStates.FULL : CardboardBoxStates.EMPTY), 2);
            } else {
                pLevel.setBlock(pPos, pState.setValue(OPEN_STATE, CardboardBoxStates.CLOSED), 2);
            }
        }
        return InteractionResult.CONSUME;
    }


    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        super.createBlockStateDefinition(pBuilder);
        pBuilder.add(OPEN_STATE);
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return TileEntityRegistration.CARDBOARD_BOX_BE.get().create(blockPos, blockState);
    }

    public static void updateOpenState(BlockPos pos, Level level){
        BlockState state = level.getBlockState(pos);
        if (state.getBlock() instanceof CardboardBoxBlock){
            level.setBlock(pos, state.setValue(OPEN_STATE, getOpenState(pos, level)), 2);
        }
    }

    private static CardboardBoxStates getOpenState(BlockPos pos, Level level){
        BlockState stateAtPos = level.getBlockState(pos);
        BlockEntity entity = level.getBlockEntity(pos);
        if (entity instanceof CardboardBoxBlockEntity){
            if (stateAtPos.hasProperty(OPEN_STATE)){
                if (stateAtPos.getValue(OPEN_STATE).equals(CardboardBoxStates.CLOSED)){
                    return CardboardBoxStates.CLOSED;
                }
                else if (((CardboardBoxBlockEntity) entity).containsItems()){
                    return CardboardBoxStates.FULL;
                }
            }
        }
        return CardboardBoxStates.EMPTY;
    }
}
