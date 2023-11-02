package net.mcreator.test.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.Registry;

import net.mcreator.test.init.TestModParticleTypes;

public class PoisonedOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double baseRate = 0;
		double rateWithAmplifier = 0;
		if (!entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("test:poison_creature")))) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 30, 0, (false), (false)));
			entity.hurt(DamageSource.GENERIC, 1);
			if ((ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("test:higher"))) == (entity.level.dimension()) && !entity.isInWaterOrBubble()) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (TestModParticleTypes.POISON_DRIP.get()), x, y, z, 1, 0.2, 0.8, 0.2, 1);
			}
		}
	}
}
