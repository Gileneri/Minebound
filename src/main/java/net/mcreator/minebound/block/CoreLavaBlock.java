
package net.mcreator.minebound.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.minebound.procedures.CoreLavaUpdateTickProcedure;
import net.mcreator.minebound.init.MineboundModFluids;

public class CoreLavaBlock extends LiquidBlock {
	public CoreLavaBlock() {
		super(() -> MineboundModFluids.CORE_LAVA.get(), BlockBehaviour.Properties.of(Material.LAVA, MaterialColor.COLOR_RED).strength(1000f).lightLevel(s -> 15).noCollission().noLootTable());
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
		CoreLavaUpdateTickProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}
