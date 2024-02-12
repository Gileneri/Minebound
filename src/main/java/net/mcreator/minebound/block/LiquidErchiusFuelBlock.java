
package net.mcreator.minebound.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.minebound.init.MineboundModFluids;

public class LiquidErchiusFuelBlock extends LiquidBlock {
	public LiquidErchiusFuelBlock() {
		super(() -> MineboundModFluids.LIQUID_ERCHIUS_FUEL.get(),
				BlockBehaviour.Properties.of(Material.WATER, MaterialColor.COLOR_MAGENTA).strength(100f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 3).noCollission().noLootTable());
	}
}
