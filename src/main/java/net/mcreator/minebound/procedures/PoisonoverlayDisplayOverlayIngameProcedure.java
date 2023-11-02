package net.mcreator.minebound.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

import net.mcreator.minebound.init.MineboundModBlocks;

public class PoisonoverlayDisplayOverlayIngameProcedure {
	public static boolean execute(LevelAccessor world, double x, double z, Entity entity) {
		if (entity == null)
			return false;
		boolean isSubmerged = false;
		isSubmerged = false;
		if ((world
				.getFluidState(new BlockPos(x,
						entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(0.000001)), ClipContext.Block.OUTLINE, ClipContext.Fluid.ANY, entity)).getBlockPos().getY(), z))
				.createLegacyBlock()).getBlock() == MineboundModBlocks.POISON.get()) {
			isSubmerged = true;
		} else if ((ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minebound:higher"))) == (entity.level.dimension()) && (world
				.getFluidState(new BlockPos(x,
						entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(0.000001)), ClipContext.Block.OUTLINE, ClipContext.Fluid.ANY, entity)).getBlockPos().getY(), z))
				.createLegacyBlock()).getBlock() == Blocks.WATER) {
			isSubmerged = true;
		}
		return isSubmerged;
	}
}
