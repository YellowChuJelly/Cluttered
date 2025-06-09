package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class HeavenlyArrayBlock extends SmallFurnitureBlock{
    private static final VoxelShape SHAPE_NORTH = Block.box(0,0,13,16,16,16);
    private static final VoxelShape SHAPE_SOUTH = Block.box(0,0,0,16,16,3);
    private static final VoxelShape SHAPE_EAST = Block.box(0,0,0,3,16,16);
    private static final VoxelShape SHAPE_WEST = Block.box(13,0,0,16,16,16);

    public HeavenlyArrayBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) {
        return 4;
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
