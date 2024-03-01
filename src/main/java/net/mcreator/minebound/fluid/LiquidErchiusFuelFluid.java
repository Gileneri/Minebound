
package net.mcreator.minebound.fluid;

public abstract class LiquidErchiusFuelFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> MineboundModFluidTypes.LIQUID_ERCHIUS_FUEL_TYPE.get(), () -> MineboundModFluids.LIQUID_ERCHIUS_FUEL.get(),
			() -> MineboundModFluids.FLOWING_LIQUID_ERCHIUS_FUEL.get()).explosionResistance(100f).bucket(() -> MineboundModItems.LIQUID_ERCHIUS_FUEL_BUCKET.get()).block(() -> (LiquidBlock) MineboundModBlocks.LIQUID_ERCHIUS_FUEL.get());

	private LiquidErchiusFuelFluid() {
		super(PROPERTIES);
	}

	public static class Source extends LiquidErchiusFuelFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends LiquidErchiusFuelFluid {
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
