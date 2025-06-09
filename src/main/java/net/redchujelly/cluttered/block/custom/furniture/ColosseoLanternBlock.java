package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ColosseoLanternBlock extends SmallLampBlock{
    private static final VoxelShape SHAPE_NORTH = Shapes.or(Block.box(5,3,15,11,13,16), Block.box(7.5,3,5,8.5,13,16), Block.box(6,13,5,10,19,9));
    private static final VoxelShape SHAPE_SOUTH = Shapes.or(Block.box(5,3,0,11,13,1), Block.box(7.5,3,0,8.5,13,11), Block.box(6,13,7,10,19,11));
    private static final VoxelShape SHAPE_EAST = Shapes.or(Block.box(0,3,5,1,13,11), Block.box(0,3,7.5,11,13,8.5), Block.box(7,13,6,11,19,10));
    private static final VoxelShape SHAPE_WEST = Shapes.or(Block.box(15,3,5,16,13,11), Block.box(5,3,7.5,16,13,8.5), Block.box(5,13,6,9,19,10));

    public ColosseoLanternBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        Direction facing = pState.getValue(FACING);
        return switch (facing) {
            case SOUTH -> SHAPE_SOUTH;
            case EAST -> SHAPE_EAST;
            case WEST -> SHAPE_WEST;
            default -> SHAPE_NORTH;
        };
    }
}
