package net.redchujelly.cluttered.block.multiblock;

import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class LargeTableBlock extends MultiblockPlacer{

    public static final IntegerProperty MULTIBLOCK_PART = IntegerProperty.create("part", 1, 4);
    private static final int[][][] MULTIBLOCK_SHAPE = {
            {
                    {1,3},
                    {2,4}
            },
    };

    public LargeTableBlock(Properties pProperties) {
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
}
