package net.redchujelly.cluttered.blocks.custom.furniture;

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
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class KitchenSinkBlock extends SmallFurnitureBlock{
    private static final VoxelShape SHAPE_NORTH = Shapes.join(Block.box(0,0,1, 16,14,16), Block.box(0,14,0,16,16,16), BooleanOp.OR);
    private static final VoxelShape SHAPE_SOUTH = Shapes.join(Block.box(0,0,0, 16,14,15), Block.box(0,14,0,16,16,16), BooleanOp.OR);
    private static final VoxelShape SHAPE_EAST = Shapes.join(Block.box(0,0,0, 15,14,16), Block.box(0,14,0,16,16,16), BooleanOp.OR);
    private static final VoxelShape SHAPE_WEST = Shapes.join(Block.box(1,0,0, 16,14,16), Block.box(0,14,0,16,16,16), BooleanOp.OR);

    public KitchenSinkBlock(Properties pProperties) {
        super(pProperties);
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