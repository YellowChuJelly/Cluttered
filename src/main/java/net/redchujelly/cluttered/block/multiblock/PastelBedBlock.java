package net.redchujelly.cluttered.block.multiblock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PastelBedBlock extends MushroomBedBlock{
    private static final VoxelShape SHAPE = Block.box(0,0,0,16,10,16);
    private static final VoxelShape BACK_NORTH = Block.box(0.5,0,0, 16, 19, 2);
    private static final VoxelShape BACK_SOUTH = Block.box(0,0,14, 16, 19, 16);
    private static final VoxelShape BACK_EAST = Block.box(14,0,0, 16, 19, 16);
    private static final VoxelShape BACK_WEST = Block.box(0,0,0, 2, 19, 16);


    public PastelBedBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        Direction facing = pState.getValue(FACING);
        if (pState.getValue(getMultiblockPart()) == 1){
            return SHAPE;
        }
        return switch (facing) {
            case SOUTH -> Shapes.or(SHAPE, BACK_SOUTH);
            case EAST -> Shapes.or(SHAPE, BACK_EAST);
            case WEST -> Shapes.or(SHAPE, BACK_WEST);
            default -> Shapes.or(SHAPE, BACK_NORTH);
        };
    }
}
