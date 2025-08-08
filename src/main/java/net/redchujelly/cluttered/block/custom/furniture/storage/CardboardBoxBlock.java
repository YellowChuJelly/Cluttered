package net.redchujelly.cluttered.block.custom.furniture.storage;

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
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.redchujelly.cluttered.block.entity.CardboardBoxBlockEntity;
import net.redchujelly.cluttered.block.entity.CustomStorageBlockEntity;
import net.redchujelly.cluttered.setup.TileEntityRegistration;
import net.redchujelly.cluttered.block.custom.furniture.CardboardBoxState;
import org.jetbrains.annotations.Nullable;

public class CardboardBoxBlock extends StorageBlock{
    private static final VoxelShape SHAPE_CLOSED_NS = Block.box(4,0,2.5, 12,7,13.5);
    private static final VoxelShape SHAPE_CLOSED_EW = Block.box(2.5,0,4, 13.5,7,12);

    private static final VoxelShape SHAPE_FULL_NS = Block.box(4,0,2.5, 12,11,13.5);
    private static final VoxelShape SHAPE_FULL_EW = Block.box(2.5,0,4, 13.5,11,12);

    public static final EnumProperty<CardboardBoxState> OPEN_STATE = EnumProperty.create("open_state", CardboardBoxState.class);

    public CardboardBoxBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.defaultBlockState().setValue(OPEN_STATE, CardboardBoxState.EMPTY));
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        Direction facing = pState.getValue(FACING);
        if (pState.getValue(OPEN_STATE).equals(CardboardBoxState.FULL)){
            return facing.equals(Direction.NORTH) || facing.equals(Direction.SOUTH) ? SHAPE_FULL_NS : SHAPE_FULL_EW;
        }
        return facing.equals(Direction.NORTH) || facing.equals(Direction.SOUTH) ? SHAPE_CLOSED_NS : SHAPE_CLOSED_EW;
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
            if (pState.getValue(OPEN_STATE).equals(CardboardBoxState.CLOSED)) {
                BlockEntity entity = pLevel.getBlockEntity(pPos);
                if (!(entity instanceof CardboardBoxBlockEntity)){
                    pLevel.removeBlock(pPos,false);
                    return InteractionResult.CONSUME;
                }

                pLevel.setBlock(pPos, pState.setValue(OPEN_STATE, ((CardboardBoxBlockEntity) entity).containsItems() ? CardboardBoxState.FULL : CardboardBoxState.EMPTY), 2);
            } else {
                pLevel.setBlock(pPos, pState.setValue(OPEN_STATE, CardboardBoxState.CLOSED), 2);
            }
            pLevel.playSound(null, pPos, SoundEvents.CAVE_VINES_BREAK, SoundSource.BLOCKS);
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

    private static CardboardBoxState getOpenState(BlockPos pos, Level level){
        BlockState stateAtPos = level.getBlockState(pos);
        BlockEntity entity = level.getBlockEntity(pos);
        if (entity instanceof CardboardBoxBlockEntity){
            if (stateAtPos.hasProperty(OPEN_STATE)){
                if (stateAtPos.getValue(OPEN_STATE).equals(CardboardBoxState.CLOSED)){
                    return CardboardBoxState.CLOSED;
                }
                else if (((CardboardBoxBlockEntity) entity).containsItems()){
                    return CardboardBoxState.FULL;
                }
            }
        }
        return CardboardBoxState.EMPTY;
    }
}
