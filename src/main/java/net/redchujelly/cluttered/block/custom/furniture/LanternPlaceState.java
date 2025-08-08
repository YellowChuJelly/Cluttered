package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.util.StringRepresentable;

public enum LanternPlaceState implements StringRepresentable {
    FLOOR("floor"),
    WALL("wall"),
    CEILING("ceiling");

    private final String name;

    @Override
    public String getSerializedName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.getSerializedName();
    }

    private LanternPlaceState(String pName){this.name = pName;}
}
