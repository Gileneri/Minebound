package net.mcreator.minebound.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.BlockPos;

import net.mcreator.minebound.init.MineboundModMobEffects;
import net.mcreator.minebound.init.MineboundModBlocks;

public class MeltingLavaEffectExpiresProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			if (!((world.getFluidState(new BlockPos(x, y, z)).createLegacyBlock()).getBlock() == MineboundModBlocks.LAVA.get() || (world.getFluidState(new BlockPos(x, y, z)).createLegacyBlock()).getBlock() == MineboundModBlocks.CORE_LAVA.get())) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MineboundModMobEffects.BURNING.get(), 100, 0, (false), (true)));
			}
		}
	}
}
