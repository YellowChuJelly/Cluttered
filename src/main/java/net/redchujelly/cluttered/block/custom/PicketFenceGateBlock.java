package net.redchujelly.cluttered.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.redchujelly.cluttered.block.custom.furniture.PicketFenceGateOpen;

public class PicketFenceGateBlock extends CustomHorizontalBlock {
    private static final VoxelShape SHAPE_NS = Block.box(0,0,6,16,16,10);
    private static final VoxelShape COLLISION_SHAPE_NS = Block.box(0,0,6,16,24,10);
    private static final VoxelShape SUPPORT_SHAPE_NS = Shapes.or(Block.box(0,0,0,2,16,16), Block.box(14,0,0,16,16,16), SHAPE_NS);

    private static final VoxelShape SHAPE_EW = Block.box(6,0,0,10,16,16);
    private static final VoxelShape COLLISION_SHAPE_EW = Block.box(6,0,0,10,24,16);
    private static final VoxelShape SUPPORT_SHAPE_EW = Shapes.or(Block.box(0,0,0,16,16,2), Block.box(0,0,14,16,16,16), SHAPE_EW);

    public static final EnumProperty<PicketFenceGateOpen> OPEN_STATE = EnumProperty.create("open_state", PicketFenceGateOpen.class);
    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;

    public PicketFenceGateBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.defaultBlockState().setValue(OPEN_STATE, PicketFenceGateOpen.CLOSED).setValue(POWERED, false));
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        Direction facing = pState.getValue(FACING);
        return facing.equals(Direction.NORTH) || facing.equals(Direction.SOUTH) ? SHAPE_NS : SHAPE_EW;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        PicketFenceGateOpen openState = pState.getValue(OPEN_STATE);
        if (openState.equals(PicketFenceGateOpen.CLOSED)){
            Direction facing = pState.getValue(FACING);
            return facing.equals(Direction.NORTH) || facing.equals(Direction.SOUTH) ? COLLISION_SHAPE_NS : COLLISION_SHAPE_EW;
        }
        else return Shapes.empty();
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        Level level = pContext.getLevel();
        BlockPos blockpos = pContext.getClickedPos();
        boolean powered = level.hasNeighborSignal(blockpos);
        PicketFenceGateOpen openState = PicketFenceGateOpen.CLOSED;
        if (powered){
            openState = PicketFenceGateOpen.FORWARD;
        }
        return this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite()).setValue(POWERED, powered).setValue(OPEN_STATE, openState);
    }

	@Override
	protected InteractionResult useWithoutItem(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, BlockHitResult pHitResult) {
        if (!pLevel.isClientSide){
            if (!pState.getValue(OPEN_STATE).equals(PicketFenceGateOpen.CLOSED)){
                pLevel.setBlock(pPos, pState.setValue(OPEN_STATE, PicketFenceGateOpen.CLOSED), 10);
                pLevel.playSound(null, pPos, SoundEvents.FENCE_GATE_CLOSE, SoundSource.BLOCKS);
            }
            else {
                Direction playerFacing = pPlayer.getDirection();
                Direction blockFacing = pState.getValue(FACING);
                if (!playerFacing.equals(blockFacing)){
                    pLevel.setBlock(pPos, pState.setValue(OPEN_STATE, PicketFenceGateOpen.FORWARD), 10);
                }
                else {
                    pLevel.setBlock(pPos, pState.setValue(OPEN_STATE, PicketFenceGateOpen.BACKWARD), 10);
                }

                pLevel.playSound(null, pPos, SoundEvents.FENCE_GATE_OPEN, SoundSource.BLOCKS);
            }
        }
        return InteractionResult.sidedSuccess(pLevel.isClientSide);
    }

    @Override
    public void neighborChanged(BlockState pState, Level pLevel, BlockPos pPos, Block pBlock, BlockPos pFromPos, boolean pIsMoving) {
        if (!pLevel.isClientSide) {
            boolean powered = pLevel.hasNeighborSignal(pPos);
            PicketFenceGateOpen opensTo = powered ? PicketFenceGateOpen.FORWARD : PicketFenceGateOpen.CLOSED;
            if (pState.getValue(POWERED) != powered) {
                pLevel.setBlock(pPos, (pState.setValue(POWERED, powered)).setValue(OPEN_STATE, opensTo), 2);
                if (pState.getValue(OPEN_STATE).equals(PicketFenceGateOpen.CLOSED) && powered) {
                    pLevel.playSound(null, pPos, SoundEvents.FENCE_GATE_OPEN, SoundSource.BLOCKS, 1.0F, pLevel.getRandom().nextFloat() * 0.1F + 0.9F);
                }
                else if (!pState.getValue(OPEN_STATE).equals(PicketFenceGateOpen.CLOSED) && !powered){
                    pLevel.playSound(null, pPos, SoundEvents.FENCE_GATE_CLOSE, SoundSource.BLOCKS, 1.0F, pLevel.getRandom().nextFloat() * 0.1F + 0.9F);
                }
            }
        }

    }

    @Override
    public VoxelShape getBlockSupportShape(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        Direction facing = pState.getValue(FACING);
        return facing.equals(Direction.NORTH) || facing.equals(Direction.SOUTH) ? SUPPORT_SHAPE_NS : SUPPORT_SHAPE_EW;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        super.createBlockStateDefinition(pBuilder);
        pBuilder.add(OPEN_STATE).add(POWERED);
    }

    public boolean isPathfindable(BlockState pState, BlockGetter pLevel, BlockPos pPos, PathComputationType pType) {
        switch (pType) {
            case LAND -> {
                return !pState.getValue(OPEN_STATE).equals(PicketFenceGateOpen.CLOSED);
            }
            case WATER -> {
                return false;
            }
            case AIR -> {
                return !pState.getValue(OPEN_STATE).equals(PicketFenceGateOpen.CLOSED);
            }
            default -> {
                return false;
            }
        }
    }


}
