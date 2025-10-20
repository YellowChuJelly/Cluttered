package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PastelChairBlock extends ChairBlock{

    private static final VoxelShape SHAPE = Block.box(3.5,0,3.5, 12.5, 8, 12.5);
    private static final VoxelShape BACK_NORTH = Block.box(3.5,8,11.5, 12.5, 21, 13.5);
    private static final VoxelShape BACK_SOUTH = Block.box(3.5,8,2, 12.5, 21, 4.5);
    private static final VoxelShape BACK_EAST = Block.box(2.5,8,3.5, 4.5, 21, 12.5);
    private static final VoxelShape BACK_WEST = Block.box(11.5,8,3.5, 13.5, 21, 12.5);

    private static final float SEAT_OFFSET =  0.5f;

    public PastelChairBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        Direction facing = pState.getValue(FACING);
        return switch (facing) {
            case SOUTH -> Shapes.or(SHAPE, BACK_SOUTH);
            case EAST -> Shapes.or(SHAPE, BACK_EAST);
            case WEST -> Shapes.or(SHAPE, BACK_WEST);
            default -> Shapes.or(SHAPE, BACK_NORTH);
        };
    }

    @Override
    public float getSeatOffset(){
        return SEAT_OFFSET;
    }
}
