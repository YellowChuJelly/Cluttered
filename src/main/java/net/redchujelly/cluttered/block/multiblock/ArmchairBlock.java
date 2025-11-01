package net.redchujelly.cluttered.block.multiblock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.redchujelly.cluttered.entity.ChairEntity;
import net.redchujelly.cluttered.setup.EntityTypeRegistration;

public class ArmchairBlock extends MultiblockChair{

    private static final float SEAT_Y_OFFSET = 0.675f;

    private static final VoxelShape SHAPE_NORTH_2 = Shapes.join(Shapes.join(Block.box(0,0,0,12,10,16), Block.box(8,10,0,14,17,16), BooleanOp.OR), Block.box(0,10,0,13,17,4), BooleanOp.OR);
    private static final VoxelShape SHAPE_NORTH_1 = Shapes.join(Shapes.join(Block.box(4,0,0,16,10,16), Block.box(2,10,0,8,17,16), BooleanOp.OR), Block.box(3,10,0,16,17,4), BooleanOp.OR);
    private static final VoxelShape SHAPE_EAST_1 = Shapes.join(Shapes.join(Block.box(0,0,4,16,10,16), Block.box(0,10,2,16,17,8), BooleanOp.OR), Block.box(12,10,3,16,17,16), BooleanOp.OR);
    private static final VoxelShape SHAPE_EAST_2 = Shapes.join(Shapes.join(Block.box(0,0,0,16,10,12), Block.box(0,10,8,16,17,14), BooleanOp.OR), Block.box(12,10,0,16,17,13), BooleanOp.OR);
    private static final VoxelShape SHAPE_SOUTH_1 = Shapes.join(Shapes.join(Block.box(0,0,0,12,10,16), Block.box(8,10,0,14,17,16), BooleanOp.OR), Block.box(0,10,12,13,17,16), BooleanOp.OR);
    private static final VoxelShape SHAPE_SOUTH_2 = Shapes.join(Shapes.join(Block.box(4,0,0,16,10,16), Block.box(2,10,0,8,17,16), BooleanOp.OR), Block.box(3,10,12,16,17,16), BooleanOp.OR);
    private static final VoxelShape SHAPE_WEST_1 = Shapes.join(Shapes.join(Block.box(0,0,0,16,10,12), Block.box(0,10,8,16,17,14), BooleanOp.OR), Block.box(0,10,0,4,17,13), BooleanOp.OR);
    private static final VoxelShape SHAPE_WEST_2 = Shapes.join(Shapes.join(Block.box(0,0,4,16,10,16), Block.box(0,10,2,16,17,8), BooleanOp.OR), Block.box(0,10,3,4,17,16), BooleanOp.OR);


    public ArmchairBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, BlockHitResult pHit) {
        if (!pState.getValue(OCCUPIED) && !pPlayer.isShiftKeyDown()){
            if (!pLevel.isClientSide) {
                BlockPos otherHalf = getOtherHalfPos(pState, pPos);
                boolean otherHalfReal = pLevel.getBlockState(otherHalf).is(this.asBlock());
                float[] seatOffset = getSeatXZOffset(pState, pPos);

                pLevel.setBlock(pPos, pState.setValue(OCCUPIED, true), 2);
                if (otherHalfReal){
                    pLevel.setBlock(otherHalf, pLevel.getBlockState(otherHalf).setValue(OCCUPIED, true), 2);
                }
                Entity seat = new ChairEntity(EntityTypeRegistration.CHAIR_ENTITY.get(), pLevel, pPos);
                seat.setPos(pPos.getX() + .5f + seatOffset[0], pPos.getY() - 1 + getSeatOffset(), pPos.getZ() +.5f + seatOffset[1]);
                pLevel.addFreshEntity(seat);
                pPlayer.startRiding(seat);
            }
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }

    @Override
    public BlockState updateShape(BlockState pState, Direction pDirection, BlockState pNeighborState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pNeighborPos) {
        BlockPos otherHalfPos = getOtherHalfPos(pState, pCurrentPos);
        if (pNeighborState.getBlock().equals(this.asBlock())){
            if (!pNeighborState.getValue(OCCUPIED) && pNeighborPos.equals(otherHalfPos)){
                pLevel.setBlock(pCurrentPos, pState.setValue(OCCUPIED, false), 2);
            }
        }

        return super.updateShape(pState, pDirection, pNeighborState, pLevel, pCurrentPos, pNeighborPos);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        int part = pState.getValue(MULTIBLOCK_PART);
        Direction facing = pState.getValue(FACING);
        return switch (facing) {
            case SOUTH -> part == 1 ? SHAPE_SOUTH_1 : SHAPE_SOUTH_2;
            case EAST -> part == 1 ? SHAPE_EAST_1 : SHAPE_EAST_2;
            case WEST -> part == 1 ? SHAPE_WEST_1 : SHAPE_WEST_2;
            default -> part == 1 ? SHAPE_NORTH_1 : SHAPE_NORTH_2;
        };
    }

    private BlockPos getOtherHalfPos(BlockState state1, BlockPos pos1){
        int part = state1.getValue(MULTIBLOCK_PART);
        Direction facing = state1.getValue(FACING);

        if (facing.equals(Direction.NORTH)){return part == 1 ? pos1.east() : pos1.west();}
        if (facing.equals(Direction.EAST)){return part == 1 ? pos1.south() : pos1.north();}
        if (facing.equals(Direction.SOUTH)){return part == 1 ? pos1.west() : pos1.east();}
        else {return part == 1 ? pos1.north() : pos1.south();}
    }

    @Override
    public float getSeatOffset() {
        return SEAT_Y_OFFSET;
    }

    private float[] getSeatXZOffset(BlockState state1, BlockPos pos1){
        int part = state1.getValue(MULTIBLOCK_PART);
        Direction facing = state1.getValue(FACING);

        if (facing.equals(Direction.NORTH)){return part == 1 ? new float[]{0.5f, 0f} : new float[]{-0.5f, 0f};}
        if (facing.equals(Direction.EAST)){return part == 1 ? new float[]{0f, 0.5f} : new float[]{0f, -0.5f};}
        if (facing.equals(Direction.SOUTH)){return part == 1 ? new float[]{-0.5f, 0f} : new float[]{0.5f, 0f};}
        else {return part == 1 ? new float[]{0f, -0.5f} : new float[]{0f, 0.5f};}
    }
}
