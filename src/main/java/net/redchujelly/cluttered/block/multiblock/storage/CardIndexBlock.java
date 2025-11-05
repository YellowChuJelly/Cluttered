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

public class CardIndexBlock extends MultiblockStorage{

    private static final VoxelShape SHAPE_N_1 = Block.box(1,1,0,16,16,15);
    private static final VoxelShape SHAPE_S_1 = Block.box(0,1,1,15,16,16);
    private static final VoxelShape SHAPE_E_1 = Block.box(1,1,1,16,16,16);
    private static final VoxelShape SHAPE_W_1 = Block.box(0,1,0,15,16,15);

    private static final VoxelShape SHAPE_N_2 = Block.box(0,1,0,15,16,15);
    private static final VoxelShape SHAPE_S_2 = Block.box(1,1,1,16,16,16);
    private static final VoxelShape SHAPE_E_2 = Block.box(1,1,0,16,16,15);
    private static final VoxelShape SHAPE_W_2 = Block.box(0,1,1,15,16,16);

    private static final VoxelShape SHAPE_N_3 = Block.box(1,0,0,16,16,15);
    private static final VoxelShape SHAPE_S_3 = Block.box(0,0,1,15,16,16);
    private static final VoxelShape SHAPE_E_3 = Block.box(1,0,1,16,16,16);
    private static final VoxelShape SHAPE_W_3 = Block.box(0,0,0,15,16,15);

    private static final VoxelShape SHAPE_N_4 = Block.box(0,0,0,15,16,15);
    private static final VoxelShape SHAPE_S_4 = Block.box(1,0,1,16,16,16);
    private static final VoxelShape SHAPE_E_4 = Block.box(1,0,0,16,16,15);
    private static final VoxelShape SHAPE_W_4 = Block.box(0,0,1,15,16,16);

    private static final VoxelShape SHAPE_TOP = Block.box(0,14,0,16,16,16);



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

    public CardIndexBlock(Properties pProperties) {
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
                        return Shapes.or(SHAPE_S_3, SHAPE_TOP);
                    }
                    case EAST -> {
                        return Shapes.or(SHAPE_E_3, SHAPE_TOP);
                    }
                    case WEST -> {
                        return Shapes.or(SHAPE_W_3, SHAPE_TOP);
                    }
                    default -> {
                        return Shapes.or(SHAPE_N_3, SHAPE_TOP);
                    }
                }
            }
            default ->{
                switch (facing){
                    case SOUTH -> {
                        return Shapes.or(SHAPE_S_4, SHAPE_TOP);
                    }
                    case EAST -> {
                        return Shapes.or(SHAPE_E_4, SHAPE_TOP);
                    }
                    case WEST -> {
                        return Shapes.or(SHAPE_W_4, SHAPE_TOP);
                    }
                    default -> {
                        return Shapes.or(SHAPE_N_4, SHAPE_TOP);
                    }
                }
            }
        }
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        if (blockState.getValue(getMultiblockPart()) != 1){
            return null;
        }
        return TileEntityRegistration.SIX_ROWS_BE.get().create(blockPos, blockState);
    }
}
