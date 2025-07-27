package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PokTaPokHoopSnakesBlock extends PokTaPokHoopBlock{

    private static final VoxelShape SHAPE_NORTH = Shapes.or(Block.box(4,0,-3, 12, 7, 16), Block.box(4,12,-3, 12, 19, 16), Block.box(4,0,-3,12,19,4), Block.box(4,0,9,12,19,16));
    private static final VoxelShape SHAPE_SOUTH = Shapes.or(Block.box(4,0,0, 12, 7, 19), Block.box(4,12,0, 12, 19, 19), Block.box(4,0,0,12,19,7), Block.box(4,0,12,12,19,19));
    private static final VoxelShape SHAPE_EAST = Shapes.or(Block.box(0,0,4  , 19, 7, 12), Block.box(0,12,4  , 19, 19, 12), Block.box(0,0,4,7,19,12), Block.box(12,0,4,19,19,12));
    private static final VoxelShape SHAPE_WEST = Shapes.or(Block.box(-3,0,4  , 16, 7, 12), Block.box(-3,12,4  , 16, 19, 12), Block.box(9,0,4,16,19,12), Block.box(-3,0,4,4,19,12));

    public PokTaPokHoopSnakesBlock(Properties pProperties) {
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
