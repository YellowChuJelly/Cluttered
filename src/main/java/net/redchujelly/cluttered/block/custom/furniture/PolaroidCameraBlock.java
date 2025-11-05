package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.redchujelly.cluttered.setup.BlockRegistration;
import net.redchujelly.cluttered.setup.SoundRegistration;

import java.util.List;
import java.util.Random;

public class PolaroidCameraBlock extends SmallFurnitureBlock{
    private static final VoxelShape SHAPE = Block.box(3,0,3,13,8,13);

    private static final List<DeferredHolder<Block, ? extends Block>> OUTPUT_LIST = List.of(
            BlockRegistration.POLAROIDS_A,
            BlockRegistration.POLAROIDS_B,
            BlockRegistration.POLAROIDS_C
    );

    public PolaroidCameraBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }

	@Override
	public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
		tooltipComponents.add(Component.translatable("cluttered.polaroid_camera.tooltip"));
		super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
	}

	@Override
	protected ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
		if (stack.is(Items.PAPER)){
			if (!level.isClientSide){
				stack.shrink(1);
				Random r = new Random();
				int rand = r.nextInt(0,OUTPUT_LIST.size());
				Item polaroid = OUTPUT_LIST.get(rand).get().asItem();
				popResource(level, pos, new ItemStack(polaroid, 1));
				level.playSound(null, pos, SoundRegistration.POLAROID_FLASH.get(), SoundSource.BLOCKS);
			}
			return ItemInteractionResult.SUCCESS;
		}
		return super.useItemOn(stack, state, level, pos, player, hand, hitResult);
	}
}
