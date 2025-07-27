package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PokTaPokHoopBlock extends SmallFurnitureBlock{

    private static final VoxelShape SHAPE_NS = Shapes.or(Block.box(5,0,0,11,16,4), Block.box(5,0,12,11,16,16), Block.box(5,0,0,11,4,16), Block.box(5,12,0,11,16,16));
    private static final VoxelShape SHAPE_EW = Shapes.or(Block.box(12,0,5,16,16,11), Block.box(0,0,5,4,16,11), Block.box(0,0,5,16,4,11), Block.box(0,12,5,16,16,11));

    public PokTaPokHoopBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return pState.getValue(FACING).equals(Direction.NORTH) || pState.getValue(FACING).equals(Direction.SOUTH) ? SHAPE_NS : SHAPE_EW;
    }
}
