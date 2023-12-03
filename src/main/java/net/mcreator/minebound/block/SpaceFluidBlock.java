
package net.mcreator.minebound.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class SpaceFluidBlock extends LiquidBlock {
	public SpaceFluidBlock() {
		super(() -> MineboundModFluids.SPACE_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER, MaterialColor.NONE).strength(100f).noCollission().noLootTable());
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		SpaceFluidMobplayerCollidesBlockProcedure.execute();
	}
}