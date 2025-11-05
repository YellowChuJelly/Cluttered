package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.FlintAndSteelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class TarrytownStoveBlock extends SmallFurnitureBlock{

    private static final VoxelShape SHAPE_NORTH = Block.box(0,0,2,16,13,12);
    private static final VoxelShape SHAPE_SOUTH = Block.box(0,0,4,16,13,14);
    private static final VoxelShape SHAPE_EAST = Block.box(4,0,0,14,13,16);
    private static final VoxelShape SHAPE_WEST = Block.box(2,0,0,12,13,16);

    private static final Vec3 PARTICLE_OFFSET_N = new Vec3(0.6875, 1.0625, 0.4375);
    private static final Vec3 PARTICLE_OFFSET_S = new Vec3(0.25, 1.0625, 0.5625);
    private static final Vec3 PARTICLE_OFFSET_E = new Vec3(0.5625, 1.0625, 0.6875);
    private static final Vec3 PARTICLE_OFFSET_W = new Vec3(0.4375, 1.0625, 0.25);

    public static final BooleanProperty LIT = BlockStateProperties.LIT;

    public TarrytownStoveBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.defaultBlockState().setValue(LIT, false));
    }

    @Override
    public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) {
        return state.getValue(LIT) ? 15 : 0;
    }

	@Override
	protected ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
		if (!state.getValue(LIT) && !state.getValue(BlockStateProperties.WATERLOGGED)){
			if (stack.getItem() instanceof FlintAndSteelItem) {
				if (!level.isClientSide) {
					level.setBlock(pos, state.setValue(LIT, true), 2);
					level.playSound(null, pos, SoundEvents.FLINTANDSTEEL_USE, SoundSource.BLOCKS);
					if (stack.isDamageableItem()) {
						stack.hurtAndBreak(1, player, LivingEntity.getSlotForHand(hand));
					}
				}
				return ItemInteractionResult.SUCCESS;
			}
		}
		return super.useItemOn(stack, state, level, pos, player, hand, hitResult);
	}

	@Override
	protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
		if (state.getValue(LIT)) {
			if (!level.isClientSide){
				level.setBlock(pos, state.setValue(LIT, false), 2);
				level.playSound(null, pos, SoundEvents.CANDLE_EXTINGUISH, SoundSource.BLOCKS);
			}
			return InteractionResult.SUCCESS;
		}
		return super.useWithoutItem(state, level, pos, player, hitResult);
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
        pBuilder.add(LIT);
    }

    private Vec3 getOffset(BlockState state){
        return switch (state.getValue(FACING)){
            case SOUTH -> PARTICLE_OFFSET_S;
            case EAST -> PARTICLE_OFFSET_E;
            case WEST -> PARTICLE_OFFSET_W;
            default -> PARTICLE_OFFSET_N;
        };
    }

    public void animateTick(BlockState pState, Level pLevel, BlockPos pPos, RandomSource pRandom) {
        if ((Boolean)pState.getValue(LIT)) {
            double $$4 = (double)pPos.getX() + (double)0.5F;
            double $$5 = (double)pPos.getY();
            double $$6 = (double)pPos.getZ() + (double)0.5F;
            if (pRandom.nextDouble() < 0.1) {
                pLevel.playLocalSound($$4, $$5, $$6, SoundEvents.FURNACE_FIRE_CRACKLE, SoundSource.BLOCKS, 1.0F, 1.0F, false);
            }

            Direction $$7 = (Direction)pState.getValue(FACING);
            Direction.Axis $$8 = $$7.getAxis();
            double $$10 = pRandom.nextDouble() * 0.45 - 0.3;
            double $$11 = $$8 == Direction.Axis.X ? (double)$$7.getStepX() * 0.37 : $$10;
            double $$12 = pRandom.nextDouble() * (double)8.0F / (double)16.0F;
            double $$13 = $$8 == Direction.Axis.Z ? (double)$$7.getStepZ() * 0.37 : $$10;
            pLevel.addParticle(ParticleTypes.SMOKE, $$4 + $$11, $$5 + $$12, $$6 + $$13, (double)0.0F, (double)0.0F, (double)0.0F);
            pLevel.addParticle(ParticleTypes.FLAME, $$4 + $$11, $$5 + $$12, $$6 + $$13, (double)0.0F, (double)0.0F, (double)0.0F);
            if (pRandom.nextDouble() < 0.2){
                pLevel.addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, $$4 + getOffset(pState).x - 0.5f, $$5 + getOffset(pState).y, $$6 + getOffset(pState).z - 0.5f, (double)0.0F, (double)0.03F, (double)0.0F);
            }
        }
    }
}
