package net.redchujelly.cluttered.block.custom.furniture;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FaceAttachedHorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class AnimatedFlagBlock extends FlatDirectionalBlock{
	private static final MapCodec<AnimatedFlagBlock> CODEC = simpleCodec(AnimatedFlagBlock::new);

	private static final VoxelShape SHAPE_NS = Block.box(7,0,0,9,16,16);
    private static final VoxelShape SHAPE_EW = Block.box(0,0,7,16,16,9);

    public AnimatedFlagBlock(Properties pProperties) {
        super(pProperties);
    }

	@Override
	protected MapCodec<? extends FaceAttachedHorizontalDirectionalBlock> codec() {
		return CODEC;
	}

	@Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return pState.getValue(FACING).equals(Direction.NORTH) || pState.getValue(FACING).equals(Direction.SOUTH) ? SHAPE_NS : SHAPE_EW;
    }
}
