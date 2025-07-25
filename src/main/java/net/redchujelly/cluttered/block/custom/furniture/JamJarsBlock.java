package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class JamJarsBlock extends SmallFurnitureBlock{

    private static final VoxelShape SHAPE_NORTH = Block.box(1,0,11,15,5.25,15);
    private static final VoxelShape SHAPE_SOUTH = Block.box(1,0,1,15,5.25,5);
    private static final VoxelShape SHAPE_EAST = Block.box(1,0,1,5,5.25,15);
    private static final VoxelShape SHAPE_WEST = Block.box(11,0,1,15,5.25,15);

    private static final VoxelShape SHAPE_NORTH_STACK = Block.box(3.5,0,11,12.5,10.5,15);
    private static final VoxelShape SHAPE_SOUTH_STACK = Block.box(3.5,0,1,12.5,10.5,5);
    private static final VoxelShape SHAPE_EAST_STACK = Block.box(1,0,3.5,5,10.5,12.5);
    private static final VoxelShape SHAPE_WEST_STACK = Block.box(11,0,3.5,15,10.5,12.5);

    public static final BooleanProperty STACKED = BooleanProperty.create("stacked");

    public JamJarsBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if (pPlayer.getItemInHand(pHand).isEmpty()){
            if (!pLevel.isClientSide){
                boolean stacked = pState.getValue(STACKED);
                pLevel.setBlock(pPos, pState.setValue(STACKED, !stacked), 2);
            }
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        Direction facing = pState.getValue(FACING);
        boolean stacked = pState.getValue(STACKED);
        return switch (facing) {
            case SOUTH -> stacked ? SHAPE_SOUTH_STACK : SHAPE_SOUTH;
            case EAST -> stacked ? SHAPE_EAST_STACK : SHAPE_EAST;
            case WEST -> stacked ? SHAPE_WEST_STACK : SHAPE_WEST;
            default -> stacked ? SHAPE_NORTH_STACK : SHAPE_NORTH;
        };
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        super.createBlockStateDefinition(pBuilder);
        pBuilder.add(STACKED);
    }
}
