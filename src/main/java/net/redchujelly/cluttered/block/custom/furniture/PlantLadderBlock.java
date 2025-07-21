package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PlantLadderBlock extends SmallFurnitureBlock{
    private static final VoxelShape SHAPE_NORTH = Shapes.or(Block.box(1,0,3,15,9,16), Block.box(1,9,7,15,18,16));
    private static final VoxelShape SHAPE_SOUTH = Shapes.or(Block.box(1,0,0,15,9,13 ), Block.box(1,9,0,15,18,9));
    private static final VoxelShape SHAPE_EAST = Shapes.or(Block.box(0,0,1,13,9,15 ), Block.box(0,9,1,9,18,15));
    private static final VoxelShape SHAPE_WEST = Shapes.or(Block.box(3,0,1,16,9,15 ), Block.box(7,9,1,16,18,15));

    public PlantLadderBlock(Properties pProperties) {
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
