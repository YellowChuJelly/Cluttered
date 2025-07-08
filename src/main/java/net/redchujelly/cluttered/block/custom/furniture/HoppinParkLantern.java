package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.redchujelly.cluttered.setup.BlockRegistration;
import net.redchujelly.cluttered.util.LanternPlaceState;

public class HoppinParkLantern extends SmallLampBlock{
    public static final EnumProperty<LanternPlaceState> PLACE_STATE = EnumProperty.create("place_state", LanternPlaceState.class);

    private static final VoxelShape LANTERN_SHAPE = Shapes.or(Block.box(5,0,5,11,11,11), Block.box(4,8,4,12,9,12), Block.box(7,11,7,9,13,9));
    private static final VoxelShape LANTERN_SHAPE_UP = Shapes.or(Block.box(5,3,5,11,14,11), Block.box(4,11,4,12,12,12), Block.box(7,14,7,9,16,9));

    private static final VoxelShape WALL_SHAPE_N = Shapes.or(Block.box(5,5,0,11,15,1), Block.box(7.5,5,1,8.5,14,10), Block.box(5,0,6,11,11,12), Block.box(4,8,5,12,9,13));
    private static final VoxelShape WALL_SHAPE_S = Shapes.or(Block.box(5,5,15,11,15,16), Block.box(7.5,5,6,8.5,14,15), Block.box(5,0,4,11,11,10), Block.box(4,8,3,12,9,11));
    private static final VoxelShape WALL_SHAPE_E = Shapes.or(Block.box(15,5,5,16,15,11), Block.box(6,5,7.5,15,14,8.5), Block.box(4,0,5,10,11,11), Block.box(3,8,4,11,9,12));
    private static final VoxelShape WALL_SHAPE_W = Shapes.or(Block.box(0,5,5,1,15,11), Block.box(1,5,7.5,10,14,8.5), Block.box(6,0,5,12,11,11), Block.box(5,8,4,13,9,12));

    public HoppinParkLantern(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.defaultBlockState().setValue(PLACE_STATE, LanternPlaceState.FLOOR));

    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        Direction surface = pContext.getClickedFace();
        Direction facing = pContext.getHorizontalDirection().getOpposite();
        LanternPlaceState shouldPlaceOn;

        if (surface.equals(Direction.UP)){
            shouldPlaceOn = LanternPlaceState.FLOOR;
        }
        else if (surface.equals(Direction.DOWN)){
            shouldPlaceOn = LanternPlaceState.CEILING;
        }
        else {
            shouldPlaceOn = LanternPlaceState.WALL;
            facing = pContext.getClickedFace().getOpposite();
        }
        return defaultBlockState().setValue(PLACE_STATE, shouldPlaceOn).setValue(FACING, facing);

    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        LanternPlaceState placedOn = pState.getValue(PLACE_STATE);

        if (placedOn.equals(LanternPlaceState.FLOOR)){
            return LANTERN_SHAPE;
        } else if (placedOn.equals(LanternPlaceState.CEILING)) {
            return LANTERN_SHAPE_UP;
        }
        else {
            Direction facing = pState.getValue(FACING);

            switch (facing){
                case SOUTH -> {
                    return WALL_SHAPE_S;
                }
                case EAST -> {
                    return WALL_SHAPE_E;
                }
                case WEST -> {
                    return WALL_SHAPE_W;
                }
                default -> {
                    return WALL_SHAPE_N;
                }
            }
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        super.createBlockStateDefinition(pBuilder);
        pBuilder.add(PLACE_STATE);
    }
}
