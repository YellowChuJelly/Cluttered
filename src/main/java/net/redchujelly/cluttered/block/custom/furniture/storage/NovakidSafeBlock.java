package net.redchujelly.cluttered.block.custom.furniture.storage;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.redchujelly.cluttered.setup.TileEntityRegistration;
import org.jetbrains.annotations.Nullable;

public class NovakidSafeBlock extends StorageBlock{
    private static final VoxelShape SHAPE_NS = Block.box(1,1,2,15,11,14);
    private static final VoxelShape SHAPE_EW = Block.box(2,1,1,14,11,15);

    public NovakidSafeBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return pState.getValue(FACING).equals(Direction.NORTH) || pState.getValue(FACING).equals(Direction.SOUTH) ? SHAPE_NS : SHAPE_EW;
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return TileEntityRegistration.SAFE_BE.get().create(blockPos, blockState);
    }
}
