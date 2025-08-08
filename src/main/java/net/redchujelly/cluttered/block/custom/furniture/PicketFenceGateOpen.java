package net.redchujelly.cluttered.block.custom.furniture;

import net.minecraft.util.StringRepresentable;

public enum PicketFenceGateOpen implements StringRepresentable {
    CLOSED("closed"),
    FORWARD("forward"),
    BACKWARD("backward");

    private final String name;

    @Override
    public String getSerializedName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.getSerializedName();
    }

    private PicketFenceGateOpen(String pName){this.name = pName;}
}
