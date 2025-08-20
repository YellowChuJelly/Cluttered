package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;

public class MushroomTVBlock extends SmallFurnitureBlock{

    public static final IntegerProperty CHANNEL = IntegerProperty.create("channel", 0, 4);

    public MushroomTVBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.defaultBlockState().setValue(CHANNEL, 0));
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        boolean isWaterlogged = pContext.getLevel().getFluidState(pContext.getClickedPos()).getType() == Fluids.WATER;
        return this.defaultBlockState().setValue(WATERLOGGED, isWaterlogged).setValue(FACING, pContext.getHorizontalDirection());
    }

    @Override
    public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) {
        return state.getValue(CHANNEL) == 0 ? 0 : 6;
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if (!pLevel.isClientSide) {
            int channel = pState.getValue(CHANNEL);
            if (channel < 4){
                channel++;
            }
            else channel = 0;
            pLevel.setBlock(pPos, pState.setValue(CHANNEL, channel), 2);
            pLevel.playSound(null, pPos, SoundEvents.STONE_BUTTON_CLICK_ON, SoundSource.BLOCKS);
        }
        return InteractionResult.SUCCESS;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        super.createBlockStateDefinition(pBuilder);
        pBuilder.add(CHANNEL);
    }
}
