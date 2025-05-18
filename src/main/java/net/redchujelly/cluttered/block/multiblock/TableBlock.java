package net.redchujelly.cluttered.block.multiblock;

import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class TableBlock extends MultiblockPlacer{


    public static final IntegerProperty MULTIBLOCK_PART = IntegerProperty.create("part", 1, 2);
    private static final int[][][] MULTIBLOCK_SHAPE = {
            {
                    {1},
                    {2}
            },
    };


    public TableBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public IntegerProperty getMultiblockPart() {
        return super.getMultiblockPart();
    }

    @Override
    public int[][][] getMultiblockShape() {
        return MULTIBLOCK_SHAPE;
    }
}
