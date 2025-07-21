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

public class DoradoCabinetBlock extends MultiblockStorage{

    private static final VoxelShape SHAPE_COUNTER = Block.box(0,14,0,16,16,16);

    private static final VoxelShape SHAPE_N_1 = Shapes.or(Block.box(1,1,0,16,14,15), SHAPE_COUNTER);
    private static final VoxelShape SHAPE_S_1 = Shapes.or(Block.box(0,1,1,15,14,16), SHAPE_COUNTER);
    private static final VoxelShape SHAPE_E_1 = Shapes.or(Block.box(1,1,1,16,14,16), SHAPE_COUNTER);
    private static final VoxelShape SHAPE_W_1 = Shapes.or(Block.box(0,1,0,15,14,15), SHAPE_COUNTER);

    private static final VoxelShape SHAPE_N_2 = Shapes.or(Block.box(0,1,0,15,14,15), SHAPE_COUNTER);
    private static final VoxelShape SHAPE_S_2 = Shapes.or(Block.box(1,1,1,16,14,16), SHAPE_COUNTER);
    private static final VoxelShape SHAPE_E_2 = Shapes.or(Block.box(1,1,0,16,14,15), SHAPE_COUNTER);
    private static final VoxelShape SHAPE_W_2 = Shapes.or(Block.box(0,1,1,15,14,16), SHAPE_COUNTER);

    private static final VoxelShape SHAPE_N_3 = Shapes.or(Block.box(1,0,0,15,14,10), Block.box(0,14,0,16,16,11));
    private static final VoxelShape SHAPE_S_3 = Shapes.or(Block.box(0,0,6,15,14,16), Block.box(0,14,5,16,16,16));
    private static final VoxelShape SHAPE_E_3 = Shapes.or(Block.box(6,0,1,10,14,16), Block.box(5,14,0,16,16,16));
    private static final VoxelShape SHAPE_W_3 = Shapes.or(Block.box(0,0,0,10,14,15), Block.box(0,14,0,11,16,16));

    private static final VoxelShape SHAPE_N_4 = Shapes.or(Block.box(0,0,0,15,14,10), Block.box(0,14,0,16,16,11));
    private static final VoxelShape SHAPE_S_4 = Shapes.or(Block.box(1,0,6,16,14,16), Block.box(0,14,5,16,16,16));
    private static final VoxelShape SHAPE_E_4 = Shapes.or(Block.box(6,0,0,16,14,15), Block.box(5,14,0,16,16,16));
    private static final VoxelShape SHAPE_W_4 = Shapes.or(Block.box(0,0,1,10,14,16), Block.box(0,14,0,11,16,16));

    public static final IntegerProperty MULTIBLOCK_PART = IntegerProperty.create("part", 1, 4);
    private static final int[][][] MULTIBLOCK_SHAPE = {
            {
                    {1},
                    {2}
            },
            {
                    {3},
                    {4}
            },
    };

    public DoradoCabinetBlock(Properties pProperties) {
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
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        int part = pState.getValue(MULTIBLOCK_PART);
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
            default ->{
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
        }
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        if (blockState.getValue(MULTIBLOCK_PART) != 1){
            return null;
        }
        return TileEntityRegistration.SIX_ROWS_BE.get().create(blockPos, blockState);
    }
}
