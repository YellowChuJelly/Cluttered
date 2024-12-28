package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
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

public class ChairBlock extends CustomHorizontalBlock {
    public static final BooleanProperty OCCUPIED = BlockStateProperties.OCCUPIED;
    private static final VoxelShape SHAPE = Block.box(0,0,0, 16, 8, 16);
    private static final float SEAT_OFFSET = 0.5f;

    public ChairBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.defaultBlockState().setValue(OCCUPIED, false));
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if (!pState.getValue(OCCUPIED) && !pPlayer.isShiftKeyDown()){
            if (!pLevel.isClientSide) {
                pLevel.setBlock(pPos, pState.setValue(OCCUPIED, true), 2);
                Entity entity = new ChairEntity(EntityTypeRegistration.CHAIR_ENTITY.get(), pLevel, pPos);
                entity.setPos(pPos.getX() + .5, pPos.getY() - 1 + getSeatOffset(), pPos.getZ() + .5);
                pLevel.addFreshEntity(entity);
                pPlayer.startRiding(entity);
            }
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
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
        pBuilder.add(OCCUPIED);
    }
}
