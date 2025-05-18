package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
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
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.redchujelly.cluttered.setup.ItemRegistration;
import net.redchujelly.cluttered.util.GarlandOffset;
import java.util.Map;

public class GarlandBlock extends SmallFurnitureBlock{

    private static final VoxelShape SHAPE_NORTH = Block.box(0, 0, 0, 16, 16, 2);
    private static final VoxelShape SHAPE_EAST = Block.box(14, 0, 0, 16, 16, 16);
    private static final VoxelShape SHAPE_SOUTH = Block.box(0, 0, 14, 16, 16, 16);
    private static final VoxelShape SHAPE_WEST = Block.box(0, 0, 0, 2, 16, 16);


    public static final EnumProperty<GarlandOffset> OFFSET = EnumProperty.create("offset", GarlandOffset.class);
    private static final Map<GarlandOffset, GarlandOffset> OFFSET_MAP;

    public GarlandBlock(Properties pProperties) {
        super(pProperties);
        registerDefaultState(this.defaultBlockState().setValue(OFFSET, GarlandOffset.NONE));
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        boolean isWaterlogged = pContext.getLevel().getFluidState(pContext.getClickedPos()).getType() == Fluids.WATER;
        return this.defaultBlockState().setValue(BlockStateProperties.WATERLOGGED, isWaterlogged).setValue(FACING, pContext.getHorizontalDirection());
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if (pPlayer.getItemInHand(pHand).is(ItemRegistration.HAND_DRILL.get()) && !pPlayer.isCrouching()){
            if (!pLevel.isClientSide){
                GarlandOffset oldOffset = pState.getValue(GarlandBlock.OFFSET);
                GarlandOffset newOffset = OFFSET_MAP.get(oldOffset);

                pLevel.setBlock(pPos, pState.setValue(OFFSET, newOffset), 2);
                pLevel.playSound(null, pPos, SoundEvents.SHEEP_SHEAR, SoundSource.BLOCKS);
            }
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
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
        pBuilder.add(OFFSET);
    }

    static { OFFSET_MAP = Map.of(
            GarlandOffset.NONE, GarlandOffset.RIGHT,
            GarlandOffset.RIGHT, GarlandOffset.LEFT,
            GarlandOffset.LEFT, GarlandOffset.NONE);
    }
}
