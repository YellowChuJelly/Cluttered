package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.component.DataComponents;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionContents;
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
	protected ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
		if (stack.is(Items.BUCKET) || stack.is(Items.GLASS_BOTTLE)) {
			if (!level.isClientSide){
				ItemStack filledItem;
				SoundEvent sound;
				if (stack.is(Items.GLASS_BOTTLE)){
					ItemStack i = new ItemStack(Items.POTION);
					i.set(DataComponents.POTION_CONTENTS, new PotionContents(Potions.WATER));
					filledItem = i;
					sound = SoundEvents.BOTTLE_FILL;
				}
				else {
					filledItem = new ItemStack(Items.WATER_BUCKET);
					sound = SoundEvents.BUCKET_FILL;
				}

				if (stack.getCount() == 1){
					player.setItemInHand(hand, filledItem);
				} else if (player.addItem(filledItem)) {
					stack.shrink(1);
				} else {
					player.drop(filledItem, true);
					stack.shrink(1);
				}
				level.playSound(null, pos, sound, SoundSource.BLOCKS);
			}
			return ItemInteractionResult.SUCCESS;
		}
		return super.useItemOn(stack, state, level, pos, player, hand, hitResult);
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