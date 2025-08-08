package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.util.StringRepresentable;

public enum CardboardBoxState implements StringRepresentable {
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

    private CardboardBoxState(String pName){this.name = pName;}
}

