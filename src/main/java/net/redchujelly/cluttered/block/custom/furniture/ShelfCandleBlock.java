package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.FlintAndSteelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ShelfCandleBlock extends SmallFurnitureBlock{
    private static final VoxelShape SHAPE_NORTH = Block.box(6.5,0,10.5,9.5,3,13.5);
    private static final VoxelShape SHAPE_SOUTH = Block.box(6.5,0,2.5,9.5,3,5.5);
    private static final VoxelShape SHAPE_EAST = Block.box(2.5,0,6.5,5.5,3,9.5);
    private static final VoxelShape SHAPE_WEST = Block.box(10.5,0,6.5,13.5,3,9.5);

    private static final Vec3 PARTICLE_OFFSET_N = new Vec3(0.5, 0.25, 0.75);
    private static final Vec3 PARTICLE_OFFSET_S = new Vec3(0.5, 0.25, 0.25);
    private static final Vec3 PARTICLE_OFFSET_E = new Vec3(0.25, 0.25, 0.5);
    private static final Vec3 PARTICLE_OFFSET_W = new Vec3(0.75, 0.25, 0.5);

    public static final BooleanProperty LIT = BlockStateProperties.LIT;

    public ShelfCandleBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(defaultBlockState().setValue(LIT, false));
    }

    @Override
    public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) {
        return state.getValue(LIT) ? 10 : 0;
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        ItemStack item = pPlayer.getItemInHand(pHand);
        if (!pState.getValue(LIT) && !pState.getValue(SmallFurnitureBlock.WATERLOGGED)){
            if (item.getItem() instanceof FlintAndSteelItem) {
                if (!pLevel.isClientSide) {
                    pLevel.setBlock(pPos, pState.setValue(LIT, true), 2);
                    if (item.isDamageableItem()) {
                        item.hurtAndBreak(1, pPlayer, (player) -> player.broadcastBreakEvent(pHand));
                    }
                }
                return InteractionResult.SUCCESS;
            }
        } else if (item.isEmpty()) {
            if (!pLevel.isClientSide){
                pLevel.setBlock(pPos, pState.setValue(LIT, false), 2);
            }
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }

    @Override
    public void animateTick(BlockState pState, Level pLevel, BlockPos pPos, RandomSource pRandom) {
        if (pState.getValue(LIT)){
            Vec3 offset = getOffset(pState);
            float random = pRandom.nextFloat();
            if (random < .3f){
                pLevel.addParticle(ParticleTypes.SMOKE, pPos.getX() + offset.x, pPos.getY() + offset.y, pPos.getZ() + offset.z, 0, 0, 0);
                if (random < 0.17f){
                    pLevel.playSound(null, pPos, SoundEvents.CANDLE_AMBIENT, SoundSource.BLOCKS, 1.0F + pRandom.nextFloat(), pRandom.nextFloat() * 0.7F + 0.3F);
                }
            }
            pLevel.addParticle(ParticleTypes.SMALL_FLAME, pPos.getX() + offset.x, pPos.getY() + offset.y, pPos.getZ() + offset.z, 0, 0, 0);
        }
    }

    private Vec3 getOffset(BlockState state){
        return switch (state.getValue(FACING)){
            case SOUTH -> PARTICLE_OFFSET_S;
            case EAST -> PARTICLE_OFFSET_E;
            case WEST -> PARTICLE_OFFSET_W;
            default -> PARTICLE_OFFSET_N;
        };
    }

    public boolean placeLiquid(LevelAccessor pLevel, BlockPos pPos, BlockState pState, FluidState pFluidState) {
        if (!pState.getValue(WATERLOGGED) && pFluidState.getType() == Fluids.WATER) {
            BlockState waterState = pState.setValue(WATERLOGGED, true);
            if (pState.getValue(LIT)) {
                pLevel.setBlock(pPos, waterState.setValue(LIT, false), 2);
            } else {
                pLevel.setBlock(pPos, waterState, 3);
            }

            pLevel.scheduleTick(pPos, pFluidState.getType(), pFluidState.getType().getTickDelay(pLevel));
            return true;
        } else {
            return false;
        }
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
}
