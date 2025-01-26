package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ButtonStoolBlock extends ChairBlock{
    private static final VoxelShape SHAPE = Shapes.join(Block.box(4, 0, 4, 12, 7, 12), Block.box(3, 7, 3, 13, 9, 13), BooleanOp.OR);
    private static final float SEAT_OFFSET = 0.5625f;

    public ButtonStoolBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }

    @Override
    public float getSeatOffset(){
        return SEAT_OFFSET;
    }
}
