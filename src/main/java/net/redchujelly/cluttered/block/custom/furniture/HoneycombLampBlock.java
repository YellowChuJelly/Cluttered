package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class HoneycombLampBlock extends SmallLampBlock{
    private static final VoxelShape SHAPE = Shapes.join(Shapes.join(Block.box(2,9,2,14,19,14), Block.box(7,1,7,9,9,9), BooleanOp.OR), Block.box(4,0,4,12,1,12), BooleanOp.OR);

    public HoneycombLampBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }
}
