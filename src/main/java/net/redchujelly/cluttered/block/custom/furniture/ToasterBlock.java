package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ToasterBlock extends SmallFurnitureBlock{

    private static final VoxelShape SHAPE_NORTH = Block.box(2,1,4,14,10,13);
    private static final VoxelShape SHAPE_SOUTH = Block.box(2,1,3,14,10,12);
    private static final VoxelShape SHAPE_EAST = Block.box(3,1,2,12,10,14);
    private static final VoxelShape SHAPE_WEST = Block.box(4,1,2,13,10,14);

    public ToasterBlock(Properties pProperties) {
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
