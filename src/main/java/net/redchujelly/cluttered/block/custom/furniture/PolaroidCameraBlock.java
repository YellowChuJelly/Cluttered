package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
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
import net.minecraftforge.registries.RegistryObject;
import net.redchujelly.cluttered.setup.BlockRegistration;
import net.redchujelly.cluttered.setup.SoundRegistration;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Random;

public class PolaroidCameraBlock extends SmallFurnitureBlock{
    private static final VoxelShape SHAPE = Block.box(3,0,3,13,8,13);

    private static final List<RegistryObject<Block>> OUTPUT_LIST = List.of(
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
    public void appendHoverText(ItemStack pStack, @Nullable BlockGetter pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
        pTooltip.add(Component.translatable("cluttered.polaroid_camera.tooltip"));
        super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        ItemStack item = pPlayer.getItemInHand(pHand);
        if (item.is(Items.PAPER)){
            if (!pLevel.isClientSide){
                item.shrink(1);
                Random r = new Random();
                int rand = r.nextInt(0,OUTPUT_LIST.size());
                Item polaroid = OUTPUT_LIST.get(rand).get().asItem();
                popResource(pLevel, pPos, new ItemStack(polaroid, 1));
                pLevel.playSound(null, pPos, SoundRegistration.POLAROID_FLASH.get(), SoundSource.BLOCKS);
            }
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }
}
