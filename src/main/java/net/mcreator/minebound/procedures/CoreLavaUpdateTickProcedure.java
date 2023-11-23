package net.mcreator.minebound.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.minebound.init.MineboundModBlocks;

public class CoreLavaUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double yOffset = 0;
		for (int index0 = 0; index0 < (int) (Mth.nextInt(RandomSource.create(), 1, 2)); index0++) {
			if (Math.random() < 0.5) {
				if (!((world.getBlockState(new BlockPos(x, y, z))).getBlock() == MineboundModBlocks.CORE_LAVA.get())) {
					world.setBlock(new BlockPos(x, y, z), MineboundModBlocks.CORE_LAVA.get().defaultBlockState(), 3);
				} else if (!(world.getBlockState(new BlockPos(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("forge:core_lava_immune_blocks")))) {
					world.setBlock(new BlockPos(x - 1, y, z), MineboundModBlocks.CORE_LAVA.get().defaultBlockState(), 3);
				} else if (!(world.getBlockState(new BlockPos(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("forge:core_lava_immune_blocks")))) {
					world.setBlock(new BlockPos(x + 1, y, z), MineboundModBlocks.CORE_LAVA.get().defaultBlockState(), 3);
				}
			} else {
				if (!(world.getBlockState(new BlockPos(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("forge:core_lava_immune_blocks")))) {
					world.setBlock(new BlockPos(x, y - 1, z), MineboundModBlocks.CORE_LAVA.get().defaultBlockState(), 3);
				} else if (!(world.getBlockState(new BlockPos(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("forge:core_lava_immune_blocks")))) {
					world.setBlock(new BlockPos(x, y, z - 1), MineboundModBlocks.CORE_LAVA.get().defaultBlockState(), 3);
				} else if (!(world.getBlockState(new BlockPos(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("forge:core_lava_immune_blocks")))) {
					world.setBlock(new BlockPos(x, y, z + 1), MineboundModBlocks.CORE_LAVA.get().defaultBlockState(), 3);
				}
			}
		}
	}
}
