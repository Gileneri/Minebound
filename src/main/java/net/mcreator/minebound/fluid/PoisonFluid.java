
package net.mcreator.minebound.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.minebound.init.MineboundModItems;
import net.mcreator.minebound.init.MineboundModFluids;
import net.mcreator.minebound.init.MineboundModFluidTypes;
import net.mcreator.minebound.init.MineboundModBlocks;

public abstract class PoisonFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> MineboundModFluidTypes.POISON_TYPE.get(), () -> MineboundModFluids.POISON.get(), () -> MineboundModFluids.FLOWING_POISON.get())
			.explosionResistance(100f).bucket(() -> MineboundModItems.POISON_BUCKET.get()).block(() -> (LiquidBlock) MineboundModBlocks.POISON.get());

	private PoisonFluid() {
		super(PROPERTIES);
	}

	public static class Source extends PoisonFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends PoisonFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
