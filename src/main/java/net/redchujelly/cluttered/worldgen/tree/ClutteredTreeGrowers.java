package net.redchujelly.cluttered.worldgen.tree;

import net.minecraft.world.level.block.grower.TreeGrower;
import net.redchujelly.cluttered.worldgen.ClutteredConfiguredFeatures;

import java.util.Optional;

public class ClutteredTreeGrowers {
	public static final TreeGrower BLUE_MUSHROOM = new TreeGrower(
			"cluttered:blue_mushroom",
			Optional.empty(), 
			Optional.of(ClutteredConfiguredFeatures.BLUE_MUSHROOM_KEY),
			Optional.empty()
	);

	public static final TreeGrower CRABAPPLE = new TreeGrower(
			"cluttered:crabapple",
			Optional.empty(),
			Optional.of(ClutteredConfiguredFeatures.CRABAPPLE_KEY),
			Optional.empty()
	);

	public static final TreeGrower MAPLE = new TreeGrower(
			"cluttered:maple",
			Optional.empty(),
			Optional.of(ClutteredConfiguredFeatures.MAPLE_KEY),
			Optional.empty()
	);

	public static final TreeGrower POPLAR = new TreeGrower(
			"cluttered:poplar",
			Optional.empty(),
			Optional.of(ClutteredConfiguredFeatures.POPLAR_KEY),
			Optional.empty()
	);

	public static final TreeGrower RED_MUSHROOM = new TreeGrower(
			"cluttered:red_mushroom",
			Optional.empty(),
			Optional.of(ClutteredConfiguredFeatures.RED_MUSHROOM_KEY),
			Optional.empty()
	);

	public static final TreeGrower SYCAMORE = new TreeGrower(
			"cluttered:sycamore",
			Optional.empty(),
			Optional.of(ClutteredConfiguredFeatures.SYCAMORE_KEY),
			Optional.empty()
	);

	public static final TreeGrower WILLOW = new TreeGrower(
			"cluttered:willow",
			Optional.empty(),
			Optional.of(ClutteredConfiguredFeatures.WILLOW_KEY),
			Optional.empty()
	);
}
