package net.redchujelly.cluttered.block.multiblock.storage;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.redchujelly.cluttered.setup.TileEntityRegistration;
import org.jetbrains.annotations.Nullable;

public class PastelWardrobeBlock extends MultiblockStorage {

    private static final VoxelShape SHAPE_NORTH = Block.box(3,0,0,16,16,16);
    private static final VoxelShape SHAPE_SOUTH = Block.box(0,0,0,13,16,16);
    private static final VoxelShape SHAPE_EAST = Block.box(0,0,3,16,16,16);
    private static final VoxelShape SHAPE_WEST = Block.box(0,0,0,16,16,13);

    private static final VoxelShape SHAPE_BOTTOM = Block.box(0,0,0,16,9,16);
    private static final VoxelShape SHAPE_TOP = Block.box(0,7,0,16,16,16);

    public static final IntegerProperty MULTIBLOCK_PART = IntegerProperty.create("part", 1, 6);
    private static final int[][][] MULTIBLOCK_SHAPE = {
            {
                    {1},
                    {2}
            },
            {
                    {3},
                    {4}
            },
            {
                    {5},
                    {6}
            },
    };

    public PastelWardrobeBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        int part = pState.getValue(MULTIBLOCK_PART);
        Direction facing = pState.getValue(FACING);
        VoxelShape shape =  switch (facing) {
            case SOUTH -> part % 2 == 1 ? SHAPE_SOUTH : SHAPE_NORTH;
            case EAST -> part % 2 == 1 ? SHAPE_EAST : SHAPE_WEST;
            case WEST -> part % 2 == 1 ? SHAPE_WEST : SHAPE_EAST;
            default -> part % 2 == 1 ? SHAPE_NORTH : SHAPE_SOUTH;
        };

        if (part == 1 || part == 2){
            shape = Shapes.or(shape, SHAPE_BOTTOM);
        } else if (part == 5 || part == 6){
            shape = Shapes.or(shape, SHAPE_TOP);
        }
        return shape;
    }

    @Override
    public int[][][] getMultiblockShape() {
        return MULTIBLOCK_SHAPE;
    }

    @Override
    public IntegerProperty getMultiblockPart() {
        return MULTIBLOCK_PART;
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        if (blockState.getValue(MULTIBLOCK_PART) != 1){
            return null;
        }
        return TileEntityRegistration.SIX_ROWS_BE.get().create(blockPos, blockState);
    }
}
