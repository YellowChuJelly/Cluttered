package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.redchujelly.cluttered.setup.ItemRegistration;

public class BracketBlock extends SmallFurnitureBlock {

    private static final VoxelShape SHAPE_NORTH = Shapes.join(Block.box(7.5, 10, 0, 8.5, 16, 16), Block.box(7.5, 0, 10, 8.5, 10, 16), BooleanOp.OR);
    private static final VoxelShape SHAPE_EAST =  Shapes.join(Block.box(0, 10, 7.5, 16, 16, 8.5), Block.box(0, 0, 7.5, 6, 10, 8.5), BooleanOp.OR);
    private static final VoxelShape SHAPE_SOUTH = Shapes.join( Block.box(7.5, 10, 0, 8.5, 16, 16), Block.box(7.5, 0, 0, 8.5, 10, 6), BooleanOp.OR);
    private static final VoxelShape SHAPE_WEST = Shapes.join(Block.box(0, 10, 7.5, 16, 16, 8.5), Block.box(10, 0, 7.5, 16, 10, 8.5), BooleanOp.OR);

    public static final BooleanProperty OFFSET = BooleanProperty.create("offset");

    public BracketBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.defaultBlockState().setValue(OFFSET, true));
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        Direction clickedFace = pContext.getClickedFace();
        if(clickedFace.equals(Direction.DOWN) || clickedFace.equals(Direction.UP)){
            clickedFace = pContext.getHorizontalDirection();
        }
        BlockState behindState = pContext.getLevel().getBlockState(pContext.getClickedPos().relative(clickedFace.getOpposite()));
        return this.defaultBlockState().setValue(FACING, clickedFace)
                .setValue(OFFSET, behindState.is(BlockTags.FENCES) || behindState.is(BlockTags.WOODEN_FENCES));
    }

    @Override
    public BlockState updateShape(BlockState pState, Direction pDirection, BlockState pNeighborState, LevelAccessor pLevel, BlockPos pPos, BlockPos pNeighborPos) {
        Direction facingOpp = pState.getValue(FACING).getOpposite();
        BlockPos behindPos = pPos.relative(facingOpp);

        if(pNeighborPos.equals(behindPos) && (pNeighborState.is(BlockTags.FENCES) || pNeighborState.is(BlockTags.WOODEN_FENCES))){
            pLevel.setBlock(pPos, pState.setValue(OFFSET, true), 2);
        }

        return super.updateShape(pState, pDirection, pNeighborState, pLevel, pPos, pNeighborPos);
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if (pPlayer.getItemInHand(pHand).is(ItemRegistration.HAND_DRILL.get()) && !pPlayer.isCrouching()){
            if (!pLevel.isClientSide){
                pLevel.setBlock(pPos, pState.setValue(OFFSET, !pState.getValue(OFFSET)), 2);
                pLevel.playSound(null, pPos, SoundEvents.UI_STONECUTTER_TAKE_RESULT, SoundSource.BLOCKS);
            }
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        super.createBlockStateDefinition(pBuilder);
        pBuilder.add(OFFSET);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        Direction facing = pState.getValue(FACING);
        return switch (facing) {
            case SOUTH -> SHAPE_SOUTH;
            case EAST -> SHAPE_EAST;
            case WEST -> SHAPE_WEST;
            default -> SHAPE_NORTH;
        };
    }
}

