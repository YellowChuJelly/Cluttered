package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class SeaGemLanternBlock extends HoppinParkLantern{

    private static final VoxelShape SHAPE_NORTH = Block.box(5,6,0,11,15,9);
    private static final VoxelShape SHAPE_SOUTH = Block.box(5,6,7,11,15,16);
    private static final VoxelShape SHAPE_EAST = Block.box(7,6,5,16,15,11);
    private static final VoxelShape SHAPE_WEST = Block.box(0,6,5,9,15,11);
    private static final VoxelShape SHAPE_FLOOR = Block.box(4,0,4,12,10,12);
    private static final VoxelShape SHAPE_CEILING = Block.box(4,2,4,12,16,12);

    public SeaGemLanternBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        Direction facing = pState.getValue(FACING);
        if (pState.getValue(PLACE_STATE).equals(LanternPlaceState.FLOOR)){
            return SHAPE_FLOOR;
        }
        else if (pState.getValue(PLACE_STATE).equals(LanternPlaceState.CEILING)){
            return SHAPE_CEILING;
        }
        Shapes.or(SHAPE_SOUTH, SHAPE_FLOOR);
        return switch (facing) {
            case SOUTH -> Shapes.or(SHAPE_SOUTH, SHAPE_FLOOR);
            case EAST -> Shapes.or(SHAPE_EAST, SHAPE_FLOOR);
            case WEST -> Shapes.or(SHAPE_WEST, SHAPE_FLOOR);
            default -> Shapes.or(SHAPE_NORTH, SHAPE_FLOOR);
        };
    }
}
