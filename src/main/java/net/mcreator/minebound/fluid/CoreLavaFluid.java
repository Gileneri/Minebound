
package net.mcreator.minebound.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.minebound.init.MineboundModFluids;
import net.mcreator.minebound.init.MineboundModFluidTypes;
import net.mcreator.minebound.init.MineboundModBlocks;

public abstract class CoreLavaFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> MineboundModFluidTypes.CORE_LAVA_TYPE.get(), () -> MineboundModFluids.CORE_LAVA.get(), () -> MineboundModFluids.FLOWING_CORE_LAVA.get())
			.explosionResistance(1000f).levelDecreasePerBlock(2).block(() -> (LiquidBlock) MineboundModBlocks.CORE_LAVA.get());

	private CoreLavaFluid() {
		super(PROPERTIES);
	}

	public static class Source extends CoreLavaFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends CoreLavaFluid {
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
