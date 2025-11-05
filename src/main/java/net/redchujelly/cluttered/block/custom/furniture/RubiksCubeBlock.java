package net.redchujelly.cluttered.block.custom.furniture;

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
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class RubiksCubeBlock extends SmallFurnitureBlock{

    private static final VoxelShape SHAPE_NORTH = Block.box(4, 0, 6, 12, 7, 14);
    private static final VoxelShape SHAPE_SOUTH = Block.box(4, 0, 2, 12, 7, 10);
    private static final VoxelShape SHAPE_WEST = Block.box(6, 0, 4, 14, 7, 12);
    private static final VoxelShape SHAPE_EAST = Block.box(2, 0, 4, 10, 7, 12);

    public static final BooleanProperty SOLVED = BooleanProperty.create("solved");

    public RubiksCubeBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.getStateDefinition().any().setValue(SOLVED, true));
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, BlockHitResult pHit) {
        if (!pLevel.isClientSide && pState.hasProperty(SOLVED)) {
            pLevel.setBlock(pPos, pState.setValue(SOLVED, !pState.getValue(SOLVED)), 2);
            pLevel.playSound(null, pPos, SoundEvents.ARMOR_STAND_BREAK, SoundSource.BLOCKS);
        }
        return InteractionResult.SUCCESS;
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

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        super.createBlockStateDefinition(pBuilder);
        pBuilder.add(SOLVED);
    }
}
