package net.mcreator.minebound.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.minebound.init.MineboundModBlocks;

import java.util.Map;

public class ConnectedPillarProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean belowIsPillar = false;
		boolean aboveIsPillar = false;
		aboveIsPillar = false;
		belowIsPillar = false;
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == MineboundModBlocks.PILLAR_BLOCK.get() || (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == MineboundModBlocks.PILLAR_BLOCK_TOP.get()
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == MineboundModBlocks.PILLAR_BLOCK_MIDDLE.get() || (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == MineboundModBlocks.PILLAR_BLOCK_BOTTOM.get()) {
			aboveIsPillar = true;
		}
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == MineboundModBlocks.PILLAR_BLOCK.get() || (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == MineboundModBlocks.PILLAR_BLOCK_TOP.get()
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == MineboundModBlocks.PILLAR_BLOCK_MIDDLE.get() || (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == MineboundModBlocks.PILLAR_BLOCK_BOTTOM.get()) {
			belowIsPillar = true;
		}
		if (aboveIsPillar == false && belowIsPillar == false) {
			if (!((world.getBlockState(new BlockPos(x, y, z))).getBlock() == MineboundModBlocks.PILLAR_BLOCK.get())) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = MineboundModBlocks.PILLAR_BLOCK.get().defaultBlockState();
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
		} else if (aboveIsPillar == false && belowIsPillar == true) {
			if (!((world.getBlockState(new BlockPos(x, y, z))).getBlock() == MineboundModBlocks.PILLAR_BLOCK_TOP.get())) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = MineboundModBlocks.PILLAR_BLOCK_TOP.get().defaultBlockState();
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
		} else if (aboveIsPillar == true && belowIsPillar == true) {
			if (!((world.getBlockState(new BlockPos(x, y, z))).getBlock() == MineboundModBlocks.PILLAR_BLOCK_MIDDLE.get())) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = MineboundModBlocks.PILLAR_BLOCK_MIDDLE.get().defaultBlockState();
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
		} else if (aboveIsPillar == true && belowIsPillar == false) {
			if (!((world.getBlockState(new BlockPos(x, y, z))).getBlock() == MineboundModBlocks.PILLAR_BLOCK_BOTTOM.get())) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = MineboundModBlocks.PILLAR_BLOCK_BOTTOM.get().defaultBlockState();
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
		}
	}
}
