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

public class MushroomWardrobeBlock extends MultiblockStorage{
    private static final VoxelShape SHAPE_N_1 = Shapes.or(Block.box(8,0,1,16,7,13), Block.box(1,7,0,16,16,14));
    private static final VoxelShape SHAPE_S_1 = Shapes.or(Block.box(0,0,3,8,7,15), Block.box(0,7,2,15,16,16));
    private static final VoxelShape SHAPE_E_1 = Shapes.or(Block.box(3,0,8,15,7,16), Block.box(2,7,1,16,16,16));
    private static final VoxelShape SHAPE_W_1 = Shapes.or(Block.box(1,0,0,13,7,8), Block.box(0,7,0,14,16,15));

    private static final VoxelShape SHAPE_N_2 = Shapes.or(Block.box(0,0,1,8,7,13), Block.box(0,7,0,15,16,14));
    private static final VoxelShape SHAPE_S_2 = Shapes.or(Block.box(8,0,3,16,7,15), Block.box(1,7,2,16,16,16));
    private static final VoxelShape SHAPE_E_2 = Shapes.or(Block.box(3,0,0,15,7,8), Block.box(2,7,0,16,16,15));
    private static final VoxelShape SHAPE_W_2 = Shapes.or(Block.box(1,0,8,13,7,16), Block.box(0,7,1,14,16,16));

    private static final VoxelShape SHAPE_N_3 = Block.box(1,0,0,16,16,14);
    private static final VoxelShape SHAPE_S_3 = Block.box(0,0,2,15,16,16);
    private static final VoxelShape SHAPE_E_3 = Block.box(2,0,1,16,16,16);
    private static final VoxelShape SHAPE_W_3 = Block.box(0,0,0,14,16,15);

    private static final VoxelShape SHAPE_N_4 = Block.box(0,0,0,15,16,14);
    private static final VoxelShape SHAPE_S_4 = Block.box(1,0,2,16,16,16);
    private static final VoxelShape SHAPE_E_4 = Block.box(2,0,0,16,16,15);
    private static final VoxelShape SHAPE_W_4 = Block.box(0,0,1,14,16,16);

    private static final VoxelShape SHAPE_N_5 = Block.box(1,0,0,16,11,14);
    private static final VoxelShape SHAPE_S_5 = Block.box(0,0,2,15,11,16);
    private static final VoxelShape SHAPE_E_5 = Block.box(2,0,1,16,11,16);
    private static final VoxelShape SHAPE_W_5 = Block.box(0,0,0,14,11,15);

    private static final VoxelShape SHAPE_N_6 = Block.box(0,0,0,15,11,14);
    private static final VoxelShape SHAPE_S_6 = Block.box(1,0,2,16,11,16);
    private static final VoxelShape SHAPE_E_6 = Block.box(2,0,0,16,11,15);
    private static final VoxelShape SHAPE_W_6 = Block.box(0,0,1,14,11,16);


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

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        int part = pState.getValue(getMultiblockPart());
        Direction facing = pState.getValue(FACING);

        switch (part){
            case 1 -> {
                switch (facing){
                    case SOUTH -> {
                        return SHAPE_S_1;
                    }
                    case EAST -> {
                        return SHAPE_E_1;
                    }
                    case WEST -> {
                        return SHAPE_W_1;
                    }
                    default -> {
                        return SHAPE_N_1;
                    }
                }
            }
            case 2 -> {
                switch (facing){
                    case SOUTH -> {
                        return SHAPE_S_2;
                    }
                    case EAST -> {
                        return SHAPE_E_2;
                    }
                    case WEST -> {
                        return SHAPE_W_2;
                    }
                    default -> {
                        return SHAPE_N_2;
                    }
                }
            }
            case 3 ->{
                switch (facing){
                    case SOUTH -> {
                        return SHAPE_S_3;
                    }
                    case EAST -> {
                        return SHAPE_E_3;
                    }
                    case WEST -> {
                        return SHAPE_W_3;
                    }
                    default -> {
                        return SHAPE_N_3;
                    }
                }
            }
            case 4 ->{
                switch (facing){
                    case SOUTH -> {
                        return SHAPE_S_4;
                    }
                    case EAST -> {
                        return SHAPE_E_4;
                    }
                    case WEST -> {
                        return SHAPE_W_4;
                    }
                    default -> {
                        return SHAPE_N_4;
                    }
                }
            }
            case 5 ->{
                switch (facing){
                    case SOUTH -> {
                        return SHAPE_S_5;
                    }
                    case EAST -> {
                        return SHAPE_E_5;
                    }
                    case WEST -> {
                        return SHAPE_W_5;
                    }
                    default -> {
                        return SHAPE_N_5;
                    }
                }
            }
            default ->{
                switch (facing){
                    case SOUTH -> {
                        return SHAPE_S_6;
                    }
                    case EAST -> {
                        return SHAPE_E_6;
                    }
                    case WEST -> {
                        return SHAPE_W_6;
                    }
                    default -> {
                        return SHAPE_N_6;
                    }
                }
            }
        }
    }

    public MushroomWardrobeBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public IntegerProperty getMultiblockPart() {
        return MULTIBLOCK_PART;
    }

    @Override
    public int[][][] getMultiblockShape() {
        return MULTIBLOCK_SHAPE;
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        if (blockState.getValue(getMultiblockPart()) != 1){
            return null;
        }
        return TileEntityRegistration.SIX_ROWS_BE.get().create(blockPos, blockState);
    }
}
