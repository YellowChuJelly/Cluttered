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

public class GreenDeskBlock extends MultiblockStorage {
    private  static final VoxelShape SHAPE_N_1 = Shapes.or(Block.box(1,9,0,16,14,15), Block.box(0,0,0,3,16,3), Block.box(0,0,12,3,16,15), Block.box(0,14,0,16,16,16) );
    private  static final VoxelShape SHAPE_S_1 = Shapes.or(Block.box(0,9,1,15,14,16), Block.box(13,0,13,16,16,16), Block.box(13,0,1,16,16,4), Block.box(0,14,0,16,16,16));
    private  static final VoxelShape SHAPE_E_1 = Shapes.or(Block.box(1,9,1,16,14,16), Block.box(13,0,0,16,16,3), Block.box(1,0,0,4,16,3), Block.box(0,14,0,16,16,16));
    private  static final VoxelShape SHAPE_W_1 = Shapes.or(Block.box(0,9,0,15,14,15), Block.box(0,0,13,3,16,16), Block.box(12,0,13,15,16,16), Block.box(0,14,0,16,16,16));

    private  static final VoxelShape SHAPE_N_2 = Shapes.or(Block.box(0,9,0,15,14,15), Block.box(13,0,12,16,16,15), Block.box(13,0,0,16,16,3), Block.box(0,14,0,16,16,16));
    private  static final VoxelShape SHAPE_S_2 = Shapes.or(Block.box(1,9,1,16,14,16), Block.box(0,0,1,3,16,4), Block.box(0,0,13,3,16,16), Block.box(0,14,0,16,16,16));
    private  static final VoxelShape SHAPE_E_2 = Shapes.or(Block.box(1,9,0,16,14,15), Block.box(1,0,13,4,16,16), Block.box(13,0,13,16,16,16), Block.box(0,14,0,16,16,16));
    private  static final VoxelShape SHAPE_W_2 = Shapes.or(Block.box(0,9,1,15,14,16), Block.box(12,0,0,15,16,3), Block.box(0,0,0,3,16,3), Block.box(0,14,0,16,16,16));

    private  static final VoxelShape SHAPE_N_34 = Block.box(0,0,0, 16,9,7);
    private  static final VoxelShape SHAPE_S_34 = Block.box(0,0,9,16,9,16);
    private  static final VoxelShape SHAPE_E_34 = Block.box(9,0,0,16,9,16);
    private  static final VoxelShape SHAPE_W_34 = Block.box(0,0,0,7,9,16);


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

    public GreenDeskBlock(Properties pProperties) {
        super(pProperties);
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
            default ->{
                switch (facing){
                    case SOUTH -> {
                        return SHAPE_S_34;
                    }
                    case EAST -> {
                        return SHAPE_E_34;
                    }
                    case WEST -> {
                        return SHAPE_W_34;
                    }
                    default -> {
                        return SHAPE_N_34;
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
        return TileEntityRegistration.TWO_ROWS_BE.get().create(blockPos, blockState);
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
