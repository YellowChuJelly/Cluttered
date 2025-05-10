package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.redchujelly.cluttered.block.custom.CustomHorizontalBlock;
import net.redchujelly.cluttered.entity.ChairEntity;
import net.redchujelly.cluttered.setup.EntityTypeRegistration;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ChairBlock extends CustomHorizontalBlock implements SimpleWaterloggedBlock {
    public static final BooleanProperty OCCUPIED = BlockStateProperties.OCCUPIED;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    private static final VoxelShape SHAPE = Block.box(0,0,0, 16, 8, 16);
    private static final float SEAT_OFFSET = 0.5f;

    public ChairBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.defaultBlockState().setValue(OCCUPIED, false).setValue(WATERLOGGED, false));
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if (!pState.getValue(OCCUPIED) && !pPlayer.isShiftKeyDown()){
            if (!pLevel.isClientSide) {
                pLevel.setBlock(pPos, pState.setValue(OCCUPIED, true), 2);
                Entity seat = new ChairEntity(EntityTypeRegistration.CHAIR_ENTITY.get(), pLevel, pPos);
                seat.setPos(pPos.getX() + .5f, pPos.getY() - 1 + getSeatOffset(), pPos.getZ() + .5f);
                pLevel.addFreshEntity(seat);
                pPlayer.startRiding(seat);
            }
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }

    @Override
    public FluidState getFluidState(BlockState pState) {
        return pState.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(pState);
    }

    @Override
    public BlockState updateShape(BlockState pState, Direction pDirection, BlockState pNeighborState, LevelAccessor pLevel, BlockPos pPos, BlockPos pNeighborPos) {
        if(pState.getValue(WATERLOGGED)){
            pLevel.scheduleTick(pPos, Fluids.WATER, Fluids.WATER.getTickDelay(pLevel));
        }
        return super.updateShape(pState, pDirection, pNeighborState, pLevel, pPos, pNeighborPos);
    }

    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        boolean isWaterlogged = pContext.getLevel().getFluidState(pContext.getClickedPos()).getType() == Fluids.WATER;
        return this.defaultBlockState().setValue(WATERLOGGED, isWaterlogged).setValue(FACING, pContext.getHorizontalDirection().getOpposite());
    }

    @Override
    public @Nullable PushReaction getPistonPushReaction(BlockState state) {
        return PushReaction.BLOCK;
    }

    public float getSeatOffset(){
        return SEAT_OFFSET;
    }

    @Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pMovedByPiston) {
        super.onRemove(pState, pLevel, pPos, pNewState, pMovedByPiston);
        List<ChairEntity> chairBlocks = pLevel.getEntitiesOfClass(ChairEntity.class, new AABB(pPos));
        for (ChairEntity chair : chairBlocks){
            chair.kill();
        }
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
            return SHAPE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        super.createBlockStateDefinition(pBuilder);
        pBuilder.add(OCCUPIED).add(WATERLOGGED);
    }
}
