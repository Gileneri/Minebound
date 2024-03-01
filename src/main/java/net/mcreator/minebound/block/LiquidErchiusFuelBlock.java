
package net.mcreator.minebound.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class LiquidErchiusFuelBlock extends LiquidBlock {
	public LiquidErchiusFuelBlock() {
		super(() -> MineboundModFluids.LIQUID_ERCHIUS_FUEL.get(),
				BlockBehaviour.Properties.of(Material.WATER, MaterialColor.COLOR_MAGENTA).strength(100f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 3).noCollission().noLootTable());
	}
}