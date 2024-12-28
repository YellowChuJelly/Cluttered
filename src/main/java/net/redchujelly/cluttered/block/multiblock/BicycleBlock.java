package net.redchujelly.cluttered.block.multiblock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BicycleBlock extends MultiblockPlacer {
    private static final VoxelShape SHAPE_NORTH = Block.box(1, 0, 5, 16, 16, 11);
    private static final VoxelShape SHAPE_EAST = Block.box(5, 0, 0, 11, 16, 15);
    private static final VoxelShape SHAPE_SOUTH = Block.box(0, 0, 5, 15, 16, 11);
    private static final VoxelShape SHAPE_WEST = Block.box(5, 0, 1, 11, 16, 16);

    public static final IntegerProperty MULTIBLOCK_PART = IntegerProperty.create("part", 1, 2);
    private static final int[][][] MULTIBLOCK_SHAPE = {
            {
                    {1},
                    {2}
            },
    };

    public BicycleBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        int part = pState.getValue(MULTIBLOCK_PART);
        Direction facing = pState.getValue(FACING);
        return switch (facing) {
            case SOUTH -> part == 1 ? SHAPE_SOUTH : SHAPE_NORTH;
            case EAST -> part == 1 ? SHAPE_EAST : SHAPE_WEST;
            case WEST -> part == 1 ? SHAPE_WEST : SHAPE_EAST;
            default -> part == 1 ? SHAPE_NORTH : SHAPE_SOUTH;
        };
    }

    @Override
    public int[][][] getMultiblockShape() {
        return MULTIBLOCK_SHAPE;
    }

    @Override
    public IntegerProperty getMultiblockPart() {
        return MULTIBLOCK_PART;
    }

}
