package net.redchujelly.cluttered.util;

import net.minecraft.util.StringRepresentable;

public enum CardboardBoxStates implements StringRepresentable {
    CLOSED("closed"),
    EMPTY("empty"),
    FULL("full");

    private final String name;

    @Override
    public String getSerializedName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.getSerializedName();
    }

    private CardboardBoxStates(String pName){this.name = pName;}
}

