
package net.mcreator.minebound.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.minebound.procedures.CoreLavaUpdateTickProcedure;
import net.mcreator.minebound.init.MineboundModFluids;

public class CoreLavaBlock extends LiquidBlock {
	public CoreLavaBlock() {
		super(() -> MineboundModFluids.CORE_LAVA.get(), BlockBehaviour.Properties.of(Material.LAVA, MaterialColor.COLOR_RED).strength(1000f).lightLevel(s -> 15).noCollission().noLootTable());
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		world.scheduleTick(pos, this, 10);
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		CoreLavaUpdateTickProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		world.scheduleTick(pos, this, 10);
	}
}
