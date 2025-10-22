package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class SteampunkLampBlock extends SmallFurnitureBlock{

    private static final VoxelShape SHAPE_NORTH = Shapes.or(Block.box(8.5,1,8,9.5,7,16), Block.box(4,7,5.5,12,19,13.5));
    private static final VoxelShape SHAPE_SOUTH = Shapes.or(Block.box(8.5,1,0,9.5,7,8), Block.box(4,7,2.5,12,19,10.5));
    private static final VoxelShape SHAPE_EAST = Shapes.or(Block.box(0,1,7.5,8,7,8.5), Block.box(2.5,7,4,10.5,19,12));
    private static final VoxelShape SHAPE_WEST = Shapes.or(Block.box(8,1,7.5,16,7,8.5), Block.box(5.5,7,4,13.5,19,12));

    public SteampunkLampBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) {
        return 15;
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
