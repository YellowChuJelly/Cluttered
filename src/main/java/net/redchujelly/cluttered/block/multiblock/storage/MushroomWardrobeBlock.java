package net.redchujelly.cluttered.block.multiblock.storage;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.redchujelly.cluttered.setup.TileEntityRegistration;
import org.jetbrains.annotations.Nullable;

public class MushroomWardrobeBlock extends MultiblockStorage{

    public static final IntegerProperty MULTIBLOCK_PART = IntegerProperty.create("part", 1, 6);
    private static final int[][][] MULTIBLOCK_SHAPE = {
            {
                    {1},
                    {2}
            },
            {
                    {3},
                    {4}
            },
            {
                    {5},
                    {6}
            },
    };

    public MushroomWardrobeBlock(Properties pProperties) {
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
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        if (blockState.getValue(MULTIBLOCK_PART) != 1){
            return null;
        }
        return TileEntityRegistration.SIX_ROWS_BE.get().create(blockPos, blockState);
    }
}
