package net.redchujelly.cluttered.block.multiblock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class DarkwoodBedBlock extends MultiblockBedBlock {

    private static final VoxelShape SHAPE_N_1 = Shapes.or(Block.box(1,3,0,16,10,7), Block.box(0,3,7,16,14,10), Block.box(0,0,7,4,15,11));
    private static final VoxelShape SHAPE_S_1 = Shapes.or(Block.box(0,3,9,15,10,16), Block.box(0,3,6,16,14,9), Block.box(12,0,5,16,15,9));
    private static final VoxelShape SHAPE_E_1 = Shapes.or(Block.box(9,3,1,16,10,16), Block.box(6,3,0,9,14,16), Block.box(5,0,0,9,15,4));
    private static final VoxelShape SHAPE_W_1 = Shapes.or(Block.box(0,3,0,7,10,15), Block.box(7,3,0,10,14,16), Block.box(7,0,12,11,15,16));

    private static final VoxelShape SHAPE_N_2 = Shapes.or(Block.box(0,3,0,15,10,7), Block.box(0,3,7,16,14,10), Block.box(12,0,7,16,15,11));
    private static final VoxelShape SHAPE_S_2 = Shapes.or(Block.box(1,3,9,16,10,16), Block.box(0,3,6,16,14,9), Block.box(0,0,5,4,15,9));
    private static final VoxelShape SHAPE_E_2 = Shapes.or(Block.box(9,3,0,16,10,15), Block.box(6,3,0,9,14,16), Block.box(5,0,12,9,15,16));
    private static final VoxelShape SHAPE_W_2 = Shapes.or(Block.box(0,3,1,7,10,16), Block.box(7,3,0,10,14,16), Block.box(7,0,0,11,15,4));

    private static final VoxelShape SHAPE_N_3 = Block.box(1,3,0,16,10,16);
    private static final VoxelShape SHAPE_S_3 = Block.box(0,3,0,15,10,16);
    private static final VoxelShape SHAPE_E_3 = Block.box(0,3,1,16,10,16);
    private static final VoxelShape SHAPE_W_3 = Block.box(0,3,0,16,10,15);

    private static final VoxelShape SHAPE_N_4 = Block.box(0,3,0,15,10,16);
    private static final VoxelShape SHAPE_S_4 = Block.box(1,3,0,16,10,16);
    private static final VoxelShape SHAPE_W_4 = Block.box(0,3,1,16,10,16);
    private static final VoxelShape SHAPE_E_4 = Block.box(0,3,0,16,10,15);

    private static final VoxelShape SHAPE_N_5 = Shapes.or(Block.box(1,3,0,16,10,16), Block.box(0,3,0,16,20,3), Block.box(0,0,0,4,20,4));
    private static final VoxelShape SHAPE_S_5 = Shapes.or(Block.box(0,3,0,15,10,16), Block.box(0,3,13,16,20,16), Block.box(12,0,12,16,20,16));
    private static final VoxelShape SHAPE_E_5 = Shapes.or(Block.box(0,3,1,16,10,16), Block.box(13,3,0,16,20,16), Block.box(12,0,0,16,20,4));
    private static final VoxelShape SHAPE_W_5 = Shapes.or(Block.box(0,3,0,16,10,15), Block.box(0,3,0,3,20,16), Block.box(0,0,12,4,20,16));

    private static final VoxelShape SHAPE_N_6 = Shapes.or(Block.box(0,3,0,15,10,16), Block.box(0,3,0,16,20,3), Block.box(12,0,0,16,20,4));
    private static final VoxelShape SHAPE_S_6 = Shapes.or(Block.box(1,3,0,16,10,16), Block.box(0,3,13,16,20,16), Block.box(0,0,12,4,20,16));
    private static final VoxelShape SHAPE_E_6 = Shapes.or(Block.box(0,3,0,16,10,15), Block.box(13,3,0,16,20,16), Block.box(12,0,12,16,20,16));
    private static final VoxelShape SHAPE_W_6 = Shapes.or(Block.box(0,3,1,16,10,16), Block.box(0,3,0,3,20,16), Block.box(0,0,0,4,20,4));

    public static final IntegerProperty MULTIBLOCK_PART = IntegerProperty.create("part", 1, 6);
    private static final int[][][] MULTIBLOCK_SHAPE = {
            {
                    {1,3,5},
                    {2,4,6}
            },
    };
    public DarkwoodBedBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        int part = pState.getValue(getMultiblockPart());
        Direction facing = pState.getValue(FACING);
        switch (part){
            case 1 -> {
                switch (facing){
                    case SOUTH -> {return SHAPE_S_1;}
                    case EAST -> {return SHAPE_E_1;}
                    case WEST -> {return SHAPE_W_1;}
                    default -> {return SHAPE_N_1;}
                }
            }
            case 2 -> {
                switch (facing){
                    case SOUTH -> {return SHAPE_S_2;}
                    case EAST -> {return SHAPE_E_2;}
                    case WEST -> {return SHAPE_W_2;}
                    default -> {return SHAPE_N_2;}
                }
            }
            case 3 -> {
                switch (facing){
                    case SOUTH -> {return SHAPE_S_3;}
                    case EAST -> {return SHAPE_E_3;}
                    case WEST -> {return SHAPE_W_3;}
                    default -> {return SHAPE_N_3;}
                }
            }
            case 4 -> {
                switch (facing){
                    case SOUTH -> {return SHAPE_S_4;}
                    case EAST -> {return SHAPE_E_4;}
                    case WEST -> {return SHAPE_W_4;}
                    default -> {return SHAPE_N_4;}
                }
            }
            case 5 -> {
                switch (facing){
                    case SOUTH -> {return SHAPE_S_5;}
                    case EAST -> {return SHAPE_E_5;}
                    case WEST -> {return SHAPE_W_5;}
                    default -> {return SHAPE_N_5;}
                }
            }
            default -> {
                switch (facing){
                    case SOUTH -> {return SHAPE_S_6;}
                    case EAST -> {return SHAPE_E_6;}
                    case WEST -> {return SHAPE_W_6;}
                    default -> {return SHAPE_N_6;}
                }
            }
        }
    }

    @Override
    public IntegerProperty getMultiblockPart() {
        return MULTIBLOCK_PART;
    }

    @Override
    public int[][][] getMultiblockShape() {
        return MULTIBLOCK_SHAPE;
    }
}
