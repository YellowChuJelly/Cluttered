package net.redchujelly.cluttered.block.multiblock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.redchujelly.cluttered.setup.SoundRegistration;

public class RetroCafeShelfWindowBlock extends MultiblockPlacer{

    private static final VoxelShape SHAPE_NORTH = Shapes.join(Block.box(0,0,7, 16,10,9), Block.box(0,0,7,8,15,9), BooleanOp.OR );
    private static final VoxelShape SHAPE_EAST = Shapes.join(Block.box(7,0,0, 9,10,16), Block.box(7,0,8,9,15,16), BooleanOp.OR );
    private static final VoxelShape SHAPE_SOUTH = Shapes.join(Block.box(0,0,7, 16,10,9), Block.box(8,0,7,16,15,9), BooleanOp.OR );
    private static final VoxelShape SHAPE_WEST = Shapes.join(Block.box(7,0,0, 9,10,16), Block.box(7,0,0,9,15,8), BooleanOp.OR );


    public static final IntegerProperty MULTIBLOCK_PART = IntegerProperty.create("part", 1, 2);
    private static final int[][][] MULTIBLOCK_SHAPE = {
            {
                    {1},
                    {2}
            },
    };

    public RetroCafeShelfWindowBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        int part = pState.getValue(getMultiblockPart());
        Direction facing = pState.getValue(FACING);
        return switch (facing) {
            case SOUTH -> part == 1 ? SHAPE_NORTH : SHAPE_SOUTH;
            case EAST -> part == 1 ? SHAPE_EAST : SHAPE_WEST;
            case WEST -> part == 1 ? SHAPE_WEST : SHAPE_EAST;
            default -> part == 1 ? SHAPE_SOUTH : SHAPE_NORTH;
        };
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
