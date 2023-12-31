
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

public abstract class SpaceFluidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> MineboundModFluidTypes.SPACE_FLUID_TYPE.get(), () -> MineboundModFluids.SPACE_FLUID.get(), () -> MineboundModFluids.FLOWING_SPACE_FLUID.get())
			.explosionResistance(100f).slopeFindDistance(1).bucket(() -> MineboundModItems.SPACE_FLUID_BUCKET.get()).block(() -> (LiquidBlock) MineboundModBlocks.SPACE_FLUID.get());

	private SpaceFluidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends SpaceFluidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends SpaceFluidFluid {
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
