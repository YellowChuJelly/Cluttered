package net.redchujelly.cluttered.block.custom.furniture.storage;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.redchujelly.cluttered.setup.TileEntityRegistration;
import org.jetbrains.annotations.Nullable;

public class PastelCabinetBlock extends StorageBlock{

    private static final VoxelShape SHAPE_NORTH = Block.box(0,3,3,16,16,16);
    private static final VoxelShape SHAPE_SOUTH = Block.box(0,3,0,16,16,13);
    private static final VoxelShape SHAPE_EAST = Block.box(0,3,0,13,16,16);
    private static final VoxelShape SHAPE_WEST = Block.box(3,3,0,16,16,16);

    public PastelCabinetBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        Direction facing = pState.getValue(FACING);
        return switch (facing) {
            case SOUTH -> SHAPE_SOUTH;
            case EAST -> SHAPE_EAST;
            case WEST -> SHAPE_WEST;
            default -> SHAPE_NORTH;
        };
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return TileEntityRegistration.THREE_ROWS_BE.get().create(blockPos, blockState);
    }
}
