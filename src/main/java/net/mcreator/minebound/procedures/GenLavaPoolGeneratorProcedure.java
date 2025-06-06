package net.mcreator.minebound.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.minebound.init.MineboundModBlocks;
import net.mcreator.minebound.MineboundMod;

import java.util.Map;

public class GenLavaPoolGeneratorProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if (!((world.getBlockState(new BlockPos(x, y - 1, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR)) {
			if ((world.getBlockState(new BlockPos(x + 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
				world.setBlock(new BlockPos(x + 1, y, z), MineboundModBlocks.GEN_LAVA.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x - 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
				world.setBlock(new BlockPos(x - 1, y, z), MineboundModBlocks.GEN_LAVA.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x, y, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
				world.setBlock(new BlockPos(x, y, z + 1), MineboundModBlocks.GEN_LAVA.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x, y, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
				world.setBlock(new BlockPos(x, y, z - 1), MineboundModBlocks.GEN_LAVA.get().defaultBlockState(), 3);
			}
		}
		MineboundMod.queueServerWork(40, () -> {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == MineboundModBlocks.GEN_LAVA.get()) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = MineboundModBlocks.LAVA.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
		});
		if (y == -340) {
			world.setBlock(new BlockPos(x, y, z), MineboundModBlocks.MUD.get().defaultBlockState(), 3);
		}
		if ((blockstate.getBlock().getStateDefinition().getProperty("level") instanceof IntegerProperty _getip20 ? blockstate.getValue(_getip20) : -1) >= 3) {
			if ((world.getBlockState(new BlockPos(x + 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
				world.setBlock(new BlockPos(x + 1, y, z), MineboundModBlocks.MUD.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x - 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
				world.setBlock(new BlockPos(x - 1, y, z), MineboundModBlocks.MUD.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x, y, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
				world.setBlock(new BlockPos(x, y, z + 1), MineboundModBlocks.MUD.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x, y, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
				world.setBlock(new BlockPos(x, y, z - 1), MineboundModBlocks.MUD.get().defaultBlockState(), 3);
			}
		}
	}
}
