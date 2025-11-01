package net.redchujelly.cluttered.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class WillowVinesBlock extends Block implements BonemealableBlock {

    private static final VoxelShape SHAPE = Block.box(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);
    private static final int MAX_GRADIENT = 6;
    public static final IntegerProperty GRADIENT = IntegerProperty.create("gradient", 1, MAX_GRADIENT);
    public static final BooleanProperty BOTTOM = BlockStateProperties.BOTTOM;

    public WillowVinesBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.defaultBlockState().setValue(BOTTOM, true).setValue(GRADIENT, 1));
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext pContext) {
        BlockPos abovePos = pContext.getClickedPos().above();
        BlockPos belowPos = pContext.getClickedPos().below();
        BlockState aboveBlock = pContext.getLevel().getBlockState(abovePos);
        BlockState belowBlock = pContext.getLevel().getBlockState(belowPos);
        boolean shouldEnd = !belowBlock.is(this.asBlock());
        int gradientColor = aboveBlock.equals(this.asBlock()) ? (aboveBlock.getValue(GRADIENT) < MAX_GRADIENT ? aboveBlock.getValue(GRADIENT) + 1 : MAX_GRADIENT ) : 1;

        return defaultBlockState().setValue(GRADIENT, gradientColor).setValue(BOTTOM, shouldEnd);
    }

    @Override
    public void tick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        if (!pState.canSurvive(pLevel, pPos)) {
            pLevel.destroyBlock(pPos, true);
        }
    }

    @Override
    public BlockState updateShape(BlockState pState, Direction pDirection, BlockState pNeighborState, LevelAccessor pLevel, BlockPos pPos, BlockPos pNeighborPos) {
        if (!pState.canSurvive(pLevel, pPos)){
            pLevel.scheduleTick(pPos, this, 1);
        }
        int gradient = 1;
        BlockPos abovePos = pPos.above();
        BlockState aboveState = pLevel.getBlockState(abovePos);
        BlockPos belowPos = pPos.below();
        BlockState belowState = pLevel.getBlockState(belowPos);

        if (aboveState.hasProperty(GRADIENT)){
            gradient = aboveState.getValue(GRADIENT) + 1;
            if (gradient > MAX_GRADIENT){
                gradient = MAX_GRADIENT;
            }
        }
        boolean shouldEnd = !belowState.getBlock().equals(this.asBlock());

        return pState.setValue(GRADIENT, gradient).setValue(BOTTOM, shouldEnd);
    }

    public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
        BlockPos blockpos = pPos.above();
        BlockState blockstate = pLevel.getBlockState(blockpos);
        return blockstate.getBlock().equals(this.asBlock()) || blockstate.isFaceSturdy(pLevel, blockpos, Direction.DOWN) || blockstate.getBlock() instanceof LeavesBlock || Block.canSupportCenter(pLevel, blockpos, Direction.DOWN);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        super.createBlockStateDefinition(pBuilder);
        pBuilder.add(GRADIENT).add(BOTTOM);
    }

	@Override
	public boolean isValidBonemealTarget(LevelReader level, BlockPos pos, BlockState state) {
		return true;
	}

    @Override
    public boolean isBonemealSuccess(Level pLevel, RandomSource pRandom, BlockPos pPos, BlockState pState) {
        return true;
    }

    @Override
    public void performBonemeal(ServerLevel pLevel, RandomSource pRandom, BlockPos pPos, BlockState pState) {
        boolean vineBelow = true;
        while (vineBelow){
            if (pLevel.getBlockState(pPos.below()).getBlock().equals(this.asBlock())){
                pPos = pPos.below();
            } else vineBelow = false;
        }

        if (pLevel.getBlockState(pPos.below()).isAir()) {
            int gradient = Math.min(pState.getValue(GRADIENT), MAX_GRADIENT);
            pLevel.setBlock(pPos.below(), pState.setValue(GRADIENT, gradient).setValue(BOTTOM, true), 2);
            if (pLevel.getBlockState(pPos.below(2)).isAir() && pRandom.nextFloat() < 0.2f){
                pLevel.setBlock(pPos.below(2), pState.setValue(GRADIENT, gradient).setValue(BOTTOM, true), 2);
            }
        }
    }
}
