package net.mcreator.minebound.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.minebound.init.MineboundModMobEffects;

public class BurningOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			if (!entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("minebound:fire_creature")))) {
				if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MineboundModMobEffects.BURNING.get()) ? _livEnt.getEffect(MineboundModMobEffects.BURNING.get()).getDuration() : 0) % 20 == 0) {
					if (entity instanceof LivingEntity _entity)
						_entity.hurt(new DamageSource("burned").bypassArmor(), (float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) * 0.02 + 0.2));
				}
			}
		}
	}
}
