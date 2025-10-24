package net.redchujelly.cluttered.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ClutteredCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> REPLACE_OLD_CLUTTERED_FURNITURE;

    static {
        BUILDER.push("Cluttered Configs");

        REPLACE_OLD_CLUTTERED_FURNITURE = BUILDER.comment("Should old Cluttered blocks be replaced with their new counterparts? " +
                        "\nIf the old version is not installed and this is set to false they will disappear." +
                        "\nThis setting may not work correctly if changed AFTER loading a world. Be sure to make a backup." +
                        "\nDefaults to true.")
                        .define("Replace old blocks:", true);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
