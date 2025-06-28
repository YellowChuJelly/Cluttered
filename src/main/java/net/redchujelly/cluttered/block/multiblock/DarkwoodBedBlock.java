package net.redchujelly.cluttered.block.multiblock;

import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class DarkwoodBedBlock extends MultiblockPlacer{

    public static final IntegerProperty MULTIBLOCK_PART = IntegerProperty.create("part", 1, 6);
    private static final int[][][] MULTIBLOCK_SHAPE = {
            {
                    {1,3,5},
                    {2,4,6}
            },
    };
    public DarkwoodBedBlock(Properties pProperties) {
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
