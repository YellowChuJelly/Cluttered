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

public class MermaidDresserBlock extends MultiblockStorage{

    private static final VoxelShape SHAPE_TOP = Block.box(0,14,0,16,16,16);

    private static final VoxelShape SHAPE_N_1 = Shapes.or(Block.box(1,0,0,16,14,15), SHAPE_TOP);
    private static final VoxelShape SHAPE_S_1 = Shapes.or(Block.box(0,0,1,15,14,16), SHAPE_TOP);
    private static final VoxelShape SHAPE_E_1 = Shapes.or(Block.box(1,0,1,16,14,16), SHAPE_TOP);
    private static final VoxelShape SHAPE_W_1 = Shapes.or(Block.box(0,0,0,15,14,15), SHAPE_TOP);

    private static final VoxelShape SHAPE_N_2= Shapes.or(Block.box(0,0,0,15,14,15), SHAPE_TOP);
    private static final VoxelShape SHAPE_S_2= Shapes.or(Block.box(1,0,1,16,14,16), SHAPE_TOP);
    private static final VoxelShape SHAPE_E_2= Shapes.or(Block.box(1,0,0,16,14,15), SHAPE_TOP);
    private static final VoxelShape SHAPE_W_2= Shapes.or(Block.box(0,0,1,15,14,16), SHAPE_TOP);

    public static final IntegerProperty MULTIBLOCK_PART = IntegerProperty.create("part", 1, 2);
    private static final int[][][] MULTIBLOCK_SHAPE = {
            {
                    {1},
                    {2}
            }
    };

    public MermaidDresserBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        int part = pState.getValue(MULTIBLOCK_PART);
        Direction facing = pState.getValue(FACING);
        return switch (facing) {
            case SOUTH -> part == 1 ? SHAPE_S_1 : SHAPE_S_2;
            case EAST -> part == 1 ? SHAPE_E_1 : SHAPE_E_2;
            case WEST -> part == 1 ? SHAPE_W_1 : SHAPE_W_2;
            default -> part == 1 ? SHAPE_N_1 : SHAPE_N_2;
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


    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        if (blockState.getValue(MULTIBLOCK_PART) != 1){
            return null;
        }
        return TileEntityRegistration.SIX_ROWS_BE.get().create(blockPos, blockState);
    }
}
