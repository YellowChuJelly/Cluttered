package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ThreadSpoolBlock extends Block {
    private static final VoxelShape SHAPE = Shapes.join(Block.box(1,1,1, 15, 2, 15),
            Shapes.join(Block.box(3, 2, 3, 13, 14, 13), Block.box(1, 14, 1, 15, 16, 15), BooleanOp.OR), BooleanOp.OR);

    public ThreadSpoolBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }
}
