package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class LunarObservatoryPedestalTableBlock extends SmallFurnitureBlock{
    private static final VoxelShape SHAPE = Shapes.or(Block.box(5,0,5,11,1,11), Block.box(7.5,0,7.5,8.5,16,8.5),Block.box(6,10,6,10,15,10), Block.box(2,14,2,14,16,14));

    public LunarObservatoryPedestalTableBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }
}
