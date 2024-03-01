package net.mcreator.minebound.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

import net.mcreator.minebound.init.MineboundModParticleTypes;
import net.mcreator.minebound.init.MineboundModMobEffects;
import net.mcreator.minebound.init.MineboundModBlocks;

public class PoisonedOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			if (!entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("minebound:poison_creature")))) {
				if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MineboundModMobEffects.POISONED.get()) ? _livEnt.getEffect(MineboundModMobEffects.POISONED.get()).getDuration() : 0) % 20 == 0) {
					if (entity instanceof LivingEntity _entity)
						_entity.hurt(new DamageSource("poisoned").bypassArmor(), 1);
				}
				if ((ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minebound:higher"))) == (entity.level.dimension())
						&& !(entity.isInWaterOrBubble() || (world.getFluidState(new BlockPos(x, y, z)).createLegacyBlock()).getBlock() == MineboundModBlocks.POISON.get())) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (MineboundModParticleTypes.POISON_DRIP.get()), x, y, z, 1, 0.2, 0.8, 0.2, 1);
				} else {
					if (!((world.getFluidState(new BlockPos(x, y, z)).createLegacyBlock()).getBlock() == MineboundModBlocks.POISON.get())) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (MineboundModParticleTypes.POISON_DRIP.get()), x, y, z, 1, 0.2, 0.8, 0.2, 1);
					}
				}
			}
		}
	}
}
