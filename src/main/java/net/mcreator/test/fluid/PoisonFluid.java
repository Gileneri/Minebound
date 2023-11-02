
package net.mcreator.test.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.test.init.TestModItems;
import net.mcreator.test.init.TestModFluids;
import net.mcreator.test.init.TestModFluidTypes;
import net.mcreator.test.init.TestModBlocks;

public abstract class PoisonFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> TestModFluidTypes.POISON_TYPE.get(), () -> TestModFluids.POISON.get(), () -> TestModFluids.FLOWING_POISON.get()).explosionResistance(100f)
			.bucket(() -> TestModItems.POISON_BUCKET.get()).block(() -> (LiquidBlock) TestModBlocks.POISON.get());

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
