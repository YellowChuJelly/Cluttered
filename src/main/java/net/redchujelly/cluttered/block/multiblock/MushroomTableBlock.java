package net.redchujelly.cluttered.block.multiblock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class MushroomTableBlock extends DarkwoodTableBlock{
    private static final VoxelShape SHAPE_TOP = Block.box(0,10,0,16,16,16);
    private static final VoxelShape SHAPE_NORTH = Shapes.or(SHAPE_TOP, Block.box(12,0,0,16,10,4));
    private static final VoxelShape SHAPE_SOUTH = Shapes.or(SHAPE_TOP, Block.box(0,0,12,4,10,16));
    private static final VoxelShape SHAPE_EAST = Shapes.or(SHAPE_TOP, Block.box(12,0,12,16,10,16));
    private static final VoxelShape SHAPE_WEST = Shapes.or(SHAPE_TOP, Block.box(0,0,0,4,10,4));

    public MushroomTableBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        Direction facing = pState.getValue(FACING);
        int part = pState.getValue(MULTIBLOCK_PART);
        //Gets the correct rotation based on the table part
        facing = switch (part){
            case 2 -> facing.getCounterClockWise();
            case 3 -> facing.getClockWise();
            case 4 -> facing.getOpposite();
            default -> facing;
        };
        return switch (facing) {
            case SOUTH -> SHAPE_SOUTH;
            case EAST -> SHAPE_EAST;
            case WEST -> SHAPE_WEST;
            default -> SHAPE_NORTH;
        };
    }
}
