package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.util.StringRepresentable;

public enum GarlandOffset implements StringRepresentable {
    NONE("center"),
    LEFT("left"),
    RIGHT("right");

    private final String name;

    @Override
    public String getSerializedName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.getSerializedName();
    }

    private GarlandOffset(String pName){this.name = pName;}
}
