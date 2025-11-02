package net.redchujelly.cluttered.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import org.jetbrains.annotations.Nullable;

public class DirectionalPillarBlock extends DirectionalBlock {
	private static final MapCodec<DirectionalPillarBlock> CODEC = simpleCodec(DirectionalPillarBlock::new);

    public DirectionalPillarBlock(Properties properties) {
        super(properties);
    }

	@Override
	protected MapCodec<? extends DirectionalBlock> codec() {
		return CODEC;
	}

	@Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(FACING, pContext.getClickedFace());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING);
    }
}
