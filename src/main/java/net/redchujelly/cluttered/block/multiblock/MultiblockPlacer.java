package net.redchujelly.cluttered.block.multiblock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.PushReaction;
import org.jetbrains.annotations.Nullable;

public class MultiblockPlacer extends Block {

    public static final IntegerProperty MULTIBLOCK_PART = IntegerProperty.create("part", 1, 2);
    public static final DirectionProperty FACING = BlockStateProperties.FACING;

    //3D Array of the shape of the multiblock.
    //The first layer is supposed to be height(y), second is width(x) and third is depth(z)
    private static final int[][][] MULTIBLOCK_SHAPE = {
            {
                    {1,2,2,2},
            },
    };

    //New multiblocks will simply override these with their own 3D array and max parts.
    public int[][][] getMultiblockShape(){
        return MULTIBLOCK_SHAPE;
    }
    public IntegerProperty getMultiblockPart(){
        return MULTIBLOCK_PART;
    }

    //Weird stuff happens when its pushed by a piston.
    @Override
    public @Nullable PushReaction getPistonPushReaction(BlockState state) {
        return PushReaction.BLOCK;
    }

    public MultiblockPlacer(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.stateDefinition.any()
                        .setValue(MULTIBLOCK_PART, 1)
                        .setValue(FACING, Direction.NORTH));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING).add(getMultiblockPart());
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
        return this.defaultBlockState().setValue(FACING, direction);
    }

    private int getXOffset(Direction facing, int x, int z) {
        int xOffset = 0;

        if (facing.equals(Direction.NORTH)) {xOffset = x;}
        if (facing.equals(Direction.SOUTH)) {xOffset = -x;}
        if (facing.equals(Direction.EAST)) {xOffset = z;}
        if (facing.equals(Direction.WEST)) {xOffset = -z;}
        return xOffset;
    }

    private int getZOffset(Direction facing, int x, int z) {
        int zOffset = 0;

        if (facing.equals(Direction.NORTH)) {zOffset = -z;}
        if (facing.equals(Direction.SOUTH)) {zOffset = z;}
        if (facing.equals(Direction.EAST)) {zOffset = x;}
        if (facing.equals(Direction.WEST)) {zOffset = -x;}
        return zOffset;
    }

    @Override
    public void tick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        BlockPos state1Pos = null;
        if (pState.getValue(MULTIBLOCK_PART) != 1) {
            state1Pos = findBlockState1(pPos, pLevel);
        } else {
            state1Pos = pPos;
        }
        if (state1Pos != null) {
            if (!canSurvive(pLevel.getBlockState(state1Pos), pLevel, state1Pos)) {
                pLevel.destroyBlock(pPos, true);
            }
        }
        else {
            pLevel.destroyBlock(pPos, true);
        }
    }

    @Override
    public BlockState updateShape(BlockState pState, Direction pDirection, BlockState pNeighborState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pNeighborPos) {
        BlockPos state1Pos = null;
        if (pState.getValue(MULTIBLOCK_PART) != 1) {
            state1Pos = findBlockState1(pCurrentPos, pLevel);
        } else {
            state1Pos = pCurrentPos;
        }
        if (state1Pos != null) {
            if (!canSurvive(pLevel.getBlockState(state1Pos), pLevel, state1Pos)) {
                pLevel.scheduleTick(pCurrentPos, this, 2);
            }
        } else {
            pLevel.scheduleTick(pCurrentPos, this, 1);
        }
        return super.updateShape(pState, pDirection, pNeighborState, pLevel, pCurrentPos, pNeighborPos);
    }

    @Override
    public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
        if (!pLevel.getBlockState(pPos).is(this)) {return true;}

        Direction facing = pState.getValue(FACING);
        if (pState.getValue(MULTIBLOCK_PART) != 1) {
            return true;
        }

        int OGx = pPos.getX();
        int OGy = pPos.getY();
        int OGz = pPos.getZ();
        int[][][] multiblockShape = getMultiblockShape();
        for(int y = 0; y < multiblockShape.length; y++) {
            for (int x = 0; x < multiblockShape[y].length; x++) {
                for (int z = 0; z < multiblockShape[y][x].length; z++) {
                    int xOffset = getXOffset(facing, x, z);
                    int zOffset = getZOffset(facing, x, z);
                    int part = 0;
                    BlockState state = pLevel.getBlockState(new BlockPos(OGx + xOffset, OGy + y, OGz + zOffset));

                    if (state.hasProperty(MULTIBLOCK_PART))
                        part = state.getValue(MULTIBLOCK_PART);
                    if (multiblockShape[y][x][z] != 0) {
                        if (multiblockShape[y][x][z] != part) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    private BlockPos findBlockState1(BlockPos currentPos, LevelAccessor level) {

        if (!level.getBlockState(currentPos).hasProperty(FACING)) {
            return null;
        }
        Direction facing = level.getBlockState(currentPos).getValue(FACING);
        int[][][] multiblockShape = getMultiblockShape();

        int partNum = level.getBlockState(currentPos).getValue(MULTIBLOCK_PART);

        //Subtracts relative X, Y, Z from blockpos. This probably works.
        for(int y = 0; y < multiblockShape.length; y++) {
            for (int x = 0; x < multiblockShape[y].length; x++) {
                for (int z = 0; z < multiblockShape[y][x].length; z++) {
                    if (multiblockShape[y][x][z] == partNum) {
                        int xOffset = -getXOffset(facing, x, z);
                        int zOffset = -getZOffset(facing, x, z);
                        BlockPos possibleState1 = new BlockPos(currentPos.getX() + xOffset, currentPos.getY() - y, currentPos.getZ() + zOffset);
                        if (level.getBlockState(possibleState1).equals(this.defaultBlockState().setValue(FACING, facing))) {
                            return possibleState1;
                        }
                    }
                }
            }
        }
        return null;
    }

    //Computers love doing nested for loops, btw. its their favorite activity and they told me that. its good for them.
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
            if (pState.getValue(getMultiblockPart()) == 1) {
                for(int y = 0; y < multiblockShape.length; y++) {
                    for(int x = 0; x < multiblockShape[y].length; x++) {
                        for (int z = 0; z < multiblockShape[y][x].length; z++) {
                            if (x+y+z != 0 && multiblockShape[y][x][z] != 0) {
                                int xOffset = getXOffset(direction, x, z);
                                int zOffset = getZOffset(direction, x, z);
                                pLevel.setBlock(new BlockPos(OGx + xOffset, OGy + y, OGz + zOffset),this.defaultBlockState().setValue(getMultiblockPart(), multiblockShape[y][x][z]).setValue(FACING, direction), 2);
                            }
                        }
                    }
                }
            }
        }
    }
}
