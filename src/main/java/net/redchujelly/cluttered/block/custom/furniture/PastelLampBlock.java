package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PastelLampBlock extends SmallLampBlock{

    private static final VoxelShape SHAPE_NORTH = Block.box(5.5,2,9.5,10.5,14.5,16);
    private static final VoxelShape SHAPE_SOUTH = Block.box(5.5,2,0,10.5,14.5,6.5);
    private static final VoxelShape SHAPE_EAST = Block.box(0,2,5.5,6.5,14.5,10.5);
    private static final VoxelShape SHAPE_WEST = Block.box(6.5,2,5.5,16,14.5,10.5);

    public PastelLampBlock(Properties pProperties) {
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
