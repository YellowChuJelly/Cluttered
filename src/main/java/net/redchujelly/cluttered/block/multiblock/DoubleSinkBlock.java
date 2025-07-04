package net.redchujelly.cluttered.block.multiblock;


import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class DoubleSinkBlock extends MultiblockPlacer implements SimpleWaterloggedBlock {
    private static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    private static final VoxelShape SHAPE = Block.box(0,0,0,16,16,16);

    public static final IntegerProperty MULTIBLOCK_PART = IntegerProperty.create("part", 1, 2);
    private static final int[][][] MULTIBLOCK_SHAPE = {
            {
                    {1},
                    {2}
            },
    };

    public DoubleSinkBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.defaultBlockState().setValue(WATERLOGGED, false));
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        ItemStack itemStack = pPlayer.getItemInHand(pHand);
        if (itemStack.getItem().equals(Items.BUCKET) || itemStack.getItem().equals(Items.GLASS_BOTTLE)) {
            if (!pLevel.isClientSide){
                ItemStack filledItem;
                SoundEvent sound;
                if (itemStack.getItem().equals(Items.GLASS_BOTTLE)){
                    filledItem = PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.WATER);
                    sound = SoundEvents.BOTTLE_FILL;
                }
                else {
                    filledItem = new ItemStack(Items.WATER_BUCKET);
                    sound = SoundEvents.BUCKET_FILL;
                }
                
                if (itemStack.getCount() == 1){
                    pPlayer.setItemInHand(pHand, filledItem);
                } else if (pPlayer.addItem(filledItem)) {
                    itemStack.shrink(1);
                } else {
                    pPlayer.drop(filledItem, true);
                    itemStack.shrink(1);
                }
                pLevel.playSound(null, pPos, sound, SoundSource.BLOCKS);
            }
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }

    @Override
    public FluidState getFluidState(BlockState pState) {
        return pState.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(pState);
    }

    @Override
    public BlockState updateShape(BlockState pState, Direction pDirection, BlockState pNeighborState, LevelAccessor pLevel, BlockPos pPos, BlockPos pNeighborPos) {
        if(pState.getValue(WATERLOGGED)){
            pLevel.scheduleTick(pPos, Fluids.WATER, Fluids.WATER.getTickDelay(pLevel));
        }
        return super.updateShape(pState, pDirection, pNeighborState, pLevel, pPos, pNeighborPos);
    }

    @Override
    public int[][][] getMultiblockShape() {
        return MULTIBLOCK_SHAPE;
    }

    @Override
    public IntegerProperty getMultiblockPart() {
        return MULTIBLOCK_PART;
    }


    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        super.createBlockStateDefinition(pBuilder);
        pBuilder.add(WATERLOGGED);
    }
}
