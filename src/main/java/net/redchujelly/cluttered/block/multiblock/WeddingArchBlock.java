package net.redchujelly.cluttered.block.multiblock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.redchujelly.cluttered.block.custom.PicketFenceGateBlock;
import org.jetbrains.annotations.Nullable;

public class WeddingArchBlock extends MultiblockPlacer{

    private static final VoxelShape SUPPORT_SHAPE = Shapes.or(Block.box(0,0,0,16,16,4), Block.box(0,0,0,4,16,16), Block.box(0,0,12,16,16,16),Block.box(12,0,0,16,16,16));

    private static final VoxelShape SHAPE_1367 = Block.box(6,0,6,10,16,10);
    private static final VoxelShape SHAPE_N_1367 = Block.box(6,0,8,10,16,16);
    private static final VoxelShape SHAPE_S_1367 = Block.box(6,0,0,10,16,8);
    private static final VoxelShape SHAPE_E_1367 = Block.box(0,0,6,8,16,10);
    private static final VoxelShape SHAPE_W_1367 = Block.box(8,0,6,16,16,10);

    private static final VoxelShape SHAPE_N_35 = Block.box(2,0,6,16,16,10);
    private static final VoxelShape SHAPE_S_35 = Block.box(0,0,6,14,16,10);
    private static final VoxelShape SHAPE_E_35 = Block.box(6,0,2,10,16,16);
    private static final VoxelShape SHAPE_W_35 = Block.box(6,0,0,10,16,14);

    private static final VoxelShape SHAPE_NS_4 = Block.box(0,0,6,16,16,10);
    private static final VoxelShape SHAPE_EW_4 = Block.box(6,0,0,10,16,16);

    public static final BooleanProperty NORTH = BlockStateProperties.NORTH;
    public static final BooleanProperty EAST = BlockStateProperties.EAST;
    public static final BooleanProperty WEST = BlockStateProperties.WEST;
    public static final BooleanProperty SOUTH = BlockStateProperties.SOUTH;

    public static final IntegerProperty MULTIBLOCK_PART = IntegerProperty.create("part", 1, 7);
    private static final int[][][] MULTIBLOCK_SHAPE = {
            {
                    {1},
                    {0},
                    {7}
            },
            {
                    {2},
                    {0},
                    {6}
            },
            {
                    {3},
                    {4},
                    {5}
            },
    };
    public WeddingArchBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.defaultBlockState().setValue(NORTH, false).setValue(SOUTH, false).setValue(EAST, false).setValue(WEST, false));
    }

    @Override
    public VoxelShape getBlockSupportShape(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        return SUPPORT_SHAPE;
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        int part = pState.getValue(MULTIBLOCK_PART);
        if (part == 1 || part == 2 || part == 6 || part == 7){
            return SHAPE_1367;
        }
        Direction facing = pState.getValue(FACING);
        if (part == 4){
            return facing.equals(Direction.NORTH) || facing.equals(Direction.SOUTH) ? SHAPE_NS_4 : SHAPE_EW_4;
        }
        return switch (facing) {
            case SOUTH -> part == 3 ? SHAPE_S_35 : SHAPE_N_35;
            case EAST -> part == 3 ? SHAPE_E_35 : SHAPE_W_35;
            case WEST -> part == 3 ? SHAPE_W_35 : SHAPE_E_35;
            default -> part == 3 ? SHAPE_N_35 : SHAPE_S_35;
        };

    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        Level level = pContext.getLevel();
        BlockPos OGpos = pContext.getClickedPos();
        Direction direction = pContext.getHorizontalDirection();
        int[][][] multiblockShape = getMultiblockShape();

        int maxHeight = getMultiblockShape().length;
        int OGx = OGpos.getX();
        int OGy = OGpos.getY();
        int OGz = OGpos.getZ();
        int xOffset = 0;
        int zOffset = 0;

        if (!(OGpos.getY() + maxHeight < level.getMaxBuildHeight())) {
            return null;
        }
        for(int y = 0; y < maxHeight; y++) {
            for(int x = 0; x < multiblockShape[y].length; x++) {
                for(int z = 0; z < multiblockShape[y][x].length; z++) {
                    //0 in this case refers to no block being there, so it gets ignored.
                    if(multiblockShape[y][x][z] != 0) {
                        //setting the direction to properly reflect the players facing direction
                        xOffset = getXOffset(direction, x, z);
                        zOffset = getZOffset(direction, x, z);
                        if (!level.getBlockState(new BlockPos(OGx + xOffset, OGy + y, OGz + zOffset)).canBeReplaced()) {
                            return null;
                        }
                    }
                }
            }
        }

        //from vanilla fence code
        BlockGetter $$1 = pContext.getLevel();
        BlockPos $$2 = pContext.getClickedPos();
        BlockPos $$4 = $$2.north();
        BlockPos $$5 = $$2.east();
        BlockPos $$6 = $$2.south();
        BlockPos $$7 = $$2.west();
        BlockState $$8 = $$1.getBlockState($$4);
        BlockState $$9 = $$1.getBlockState($$5);
        BlockState $$10 = $$1.getBlockState($$6);
        BlockState $$11 = $$1.getBlockState($$7);

        return this.defaultBlockState().setValue(FACING, direction).setValue(NORTH, this.connectsTo($$8)).setValue(EAST, this.connectsTo($$9)).setValue(SOUTH, this.connectsTo($$10)).setValue(WEST, this.connectsTo($$11));
    }

    //Computers love doing nested loops, btw. its their favorite activity; they told me that. its good for them.
    @Override
    public void onPlace(BlockState pState, Level pLevel, BlockPos pPos, BlockState pOldState, boolean pIsMoving) {
        if (!pLevel.isClientSide) {
            Direction direction = pState.getValue(FACING);
            int[][][] multiblockShape = getMultiblockShape();
            int OGx = pPos.getX();
            int OGy = pPos.getY();
            int OGz = pPos.getZ();
            //Only the original block placed by the player should place the rest.
            //Is this a good system? No clue honestly. It works, though!
            if (pState.getValue(getMultiblockPart()) == 1 && !pOldState.is(this.asBlock())) {
                for (int y = 0; y < multiblockShape.length; y++) {
                    for (int x = 0; x < multiblockShape[y].length; x++) {
                        for (int z = 0; z < multiblockShape[y][x].length; z++) {
                            if (x + y + z != 0 && multiblockShape[y][x][z] != 0) {
                                int xOffset = getXOffset(direction, x, z);
                                int zOffset = getZOffset(direction, x, z);

                                BlockGetter $$1 = pLevel;
                                BlockPos $$2 = new BlockPos(OGx + xOffset, OGy + y, OGz + zOffset);
                                BlockPos $$4 = $$2.north();
                                BlockPos $$5 = $$2.east();
                                BlockPos $$6 = $$2.south();
                                BlockPos $$7 = $$2.west();
                                BlockState $$8 = $$1.getBlockState($$4);
                                BlockState $$9 = $$1.getBlockState($$5);
                                BlockState $$10 = $$1.getBlockState($$6);
                                BlockState $$11 = $$1.getBlockState($$7);

                                pLevel.setBlock($$2, defaultBlockState().setValue(getMultiblockPart(), multiblockShape[y][x][z]).setValue(FACING, direction).setValue(NORTH, this.connectsTo($$8)).setValue(EAST, this.connectsTo($$9)).setValue(SOUTH, this.connectsTo($$10)).setValue(WEST, this.connectsTo($$11)), 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public BlockState updateShape(BlockState pState, Direction pDirection, BlockState pNeighborState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pNeighborPos) {
        //BlockPos state1Pos = null;
        //if (pState.getValue(getMultiblockPart()) != 1) {
        //    state1Pos = findBlockState1(pCurrentPos, pLevel);
        //} else {
        //    state1Pos = pCurrentPos;
        //}
        //if (state1Pos != null) {
        //    if (!canSurvive(pLevel.getBlockState(state1Pos), pLevel, state1Pos)) {
        //        pLevel.scheduleTick(pCurrentPos, this, 0);
        //    }
        //} else {
        //    pLevel.scheduleTick(pCurrentPos, this, 0);
        //}
        if (pDirection.equals(Direction.NORTH)){
            pLevel.setBlock(pCurrentPos, pState.setValue(NORTH, connectsTo(pNeighborState)), 2);
        }
        else if (pDirection.equals(Direction.SOUTH)){
            pLevel.setBlock(pCurrentPos, pState.setValue(SOUTH, connectsTo(pNeighborState)), 2);
        }
        else if (pDirection.equals(Direction.EAST)){
            pLevel.setBlock(pCurrentPos, pState.setValue(EAST, connectsTo(pNeighborState)), 2);
        }
        else if (pDirection.equals(Direction.WEST)){
            pLevel.setBlock(pCurrentPos, pState.setValue(WEST, connectsTo(pNeighborState)), 2);
        }

        return super.updateShape(pState, pDirection, pNeighborState, pLevel, pCurrentPos, pNeighborPos);
    }

    private boolean connectsTo(BlockState pState) {
        if (pState.getBlock() instanceof WeddingArchBlock){
            return false;
        }
        boolean neighborFence = pState.is(BlockTags.WOODEN_FENCES) || pState.is(BlockTags.FENCES) || pState.is(BlockTags.WALLS);
        if (!neighborFence){
            if (pState.getBlock() instanceof FenceGateBlock || pState.getBlock() instanceof PicketFenceGateBlock){
                neighborFence = pState.getValue(FACING).equals(pState.getValue(FACING)) || pState.getValue(FACING).equals(pState.getValue(FACING).getOpposite());
            }
        }
        return neighborFence;
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
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        super.createBlockStateDefinition(pBuilder);
        pBuilder.add(NORTH).add(SOUTH).add(EAST).add(WEST);
    }
}
