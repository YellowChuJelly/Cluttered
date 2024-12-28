package net.redchujelly.cluttered.block.multiblock;

import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class TwoByTwoFullSizeBlock extends MultiblockPlacer{

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

    public TwoByTwoFullSizeBlock(Properties pProperties) {
        super(pProperties);
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
