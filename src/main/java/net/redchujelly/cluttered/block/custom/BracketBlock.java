package net.redchujelly.cluttered.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.redchujelly.cluttered.block.custom.furniture.SmallFurnitureBlock;

import java.util.List;

public class BracketBlock extends SmallFurnitureBlock {

    private static final VoxelShape SHAPE_NORTH_UP = Shapes.join(Block.box(7, 10, 0, 9, 16, 16), Block.box(7, 0, 10, 9, 16, 16), BooleanOp.OR);
    private static final VoxelShape SHAPE_NORTH_DOWN = Shapes.join(Block.box(7, 0, 0, 9, 6, 16), Block.box(7, 0, 10, 9, 16, 16), BooleanOp.OR);
    private static final VoxelShape SHAPE_EAST_UP =  Shapes.join(Block.box(0, 10, 7, 16, 16, 9), Block.box(0, 0, 7, 6, 16, 9), BooleanOp.OR);
    private static final VoxelShape SHAPE_EAST_DOWN =  Shapes.join(Block.box(0, 0, 7, 16, 6, 9), Block.box(0, 0, 7, 6, 16, 9), BooleanOp.OR);
    private static final VoxelShape SHAPE_SOUTH_UP = Shapes.join( Block.box(7, 10, 0, 9, 16, 16), Block.box(7, 0, 0, 9, 16, 6), BooleanOp.OR);
    private static final VoxelShape SHAPE_SOUTH_DOWN = Shapes.join( Block.box(7, 0, 0, 9, 6, 16), Block.box(7, 0, 0, 9, 16, 6), BooleanOp.OR);
    private static final VoxelShape SHAPE_WEST_UP = Shapes.join(Block.box(0, 10, 7, 16, 16, 9), Block.box(10, 0, 7, 16, 16, 9), BooleanOp.OR);
    private static final VoxelShape SHAPE_WEST_DOWN = Shapes.join(Block.box(0, 0, 7, 16, 6, 9), Block.box(10, 0, 7, 16, 16, 9), BooleanOp.OR);

    private static final VoxelShape SUPPORT_SHAPE_UP = Block.box(0,14,0,16,16,16);
    private static final VoxelShape SUPPORT_SHAPE_DOWN = Block.box(0,0,0,16,2,16);
    private static final VoxelShape SUPPORT_SHAPE_SOUTH = Block.box(0,0,0,16,16,2);
    private static final VoxelShape SUPPORT_SHAPE_NORTH = Block.box(0,0,14,16,16,16);
    private static final VoxelShape SUPPORT_SHAPE_WEST = Block.box(14,0,0,16,16,16);
    private static final VoxelShape SUPPORT_SHAPE_EAST = Block.box(0,0,0,2,16,16);

    public static final BooleanProperty OFFSET = BooleanProperty.create("offset");
    public static final BooleanProperty IS_UP = BooleanProperty.create("is_up");

    public BracketBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.defaultBlockState().setValue(OFFSET, true));
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        Direction clickedFace = pContext.getClickedFace();
        boolean shouldBeUP = pContext.getClickLocation().y - pContext.getClickedPos().getY() > 0.5;
        if(clickedFace.equals(Direction.DOWN) || clickedFace.equals(Direction.UP)){
            shouldBeUP = clickedFace.equals(Direction.DOWN);
            clickedFace = pContext.getHorizontalDirection().getOpposite();
        }
        BlockState behindState = pContext.getLevel().getBlockState(pContext.getClickedPos().relative(clickedFace.getOpposite()));
        return this.defaultBlockState().setValue(FACING, clickedFace)
                .setValue(OFFSET, behindState.is(BlockTags.FENCES) || behindState.is(BlockTags.WOODEN_FENCES))
                .setValue(IS_UP, shouldBeUP);
    }

	@Override
	public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
		tooltipComponents.add(Component.translatable("cluttered.bracket.tooltip"));
		super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
	}

    //@Override
    //protected InteractionResult useWithoutItem(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, BlockHitResult pHit) {
    //    if (pPlayer.getItemInHand(pHand).is(ItemRegistration.HAND_DRILL.get()) && pPlayer.isCrouching()){
    //        if (!pLevel.isClientSide){
    //            pLevel.setBlock(pPos, pState.setValue(OFFSET, !pState.getValue(OFFSET)), 2);
    //            pLevel.playSound(null, pPos, SoundEvents.UI_STONECUTTER_TAKE_RESULT, SoundSource.BLOCKS);
    //        }
    //        return InteractionResult.SUCCESS;
    //    }
    //    return InteractionResult.PASS;
    //}

    @Override
    public VoxelShape getBlockSupportShape(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        Direction facing = pState.getValue(FACING);
        boolean is_up = pState.getValue(IS_UP);
        if (pState.getValue(OFFSET)){
            return switch (facing) {
                case SOUTH -> is_up ? SHAPE_SOUTH_UP : SHAPE_SOUTH_DOWN;
                case EAST -> is_up ? SHAPE_EAST_UP : SHAPE_EAST_DOWN;
                case WEST -> is_up ? SHAPE_WEST_UP : SHAPE_WEST_DOWN;
                default -> is_up ? SHAPE_NORTH_UP : SHAPE_NORTH_DOWN;
            };
        }
        else {
            VoxelShape shapeH = switch (facing){
                case SOUTH -> SUPPORT_SHAPE_SOUTH;
                case EAST -> SUPPORT_SHAPE_EAST;
                case WEST -> SUPPORT_SHAPE_WEST;
                default -> SUPPORT_SHAPE_NORTH;
            };
            VoxelShape shapeV = is_up ? SUPPORT_SHAPE_UP : SUPPORT_SHAPE_DOWN;
            return Shapes.or(shapeH, shapeV);
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        super.createBlockStateDefinition(pBuilder);
        pBuilder.add(OFFSET).add(IS_UP);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        Direction facing = pState.getValue(FACING);
        boolean is_up = pState.getValue(IS_UP);
        return switch (facing) {
            case SOUTH -> is_up ? SHAPE_SOUTH_UP : SHAPE_SOUTH_DOWN;
            case EAST -> is_up ? SHAPE_EAST_UP : SHAPE_EAST_DOWN;
            case WEST -> is_up ? SHAPE_WEST_UP : SHAPE_WEST_DOWN;
            default -> is_up ? SHAPE_NORTH_UP : SHAPE_NORTH_DOWN;
        };
    }

}

