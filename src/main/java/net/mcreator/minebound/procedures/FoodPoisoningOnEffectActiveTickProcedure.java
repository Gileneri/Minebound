package net.mcreator.minebound.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.minebound.init.MineboundModMobEffects;

public class FoodPoisoningOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			if (entity instanceof Player || entity instanceof ServerPlayer) {
				if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MineboundModMobEffects.FOOD_POISONING.get()) ? _livEnt.getEffect(MineboundModMobEffects.FOOD_POISONING.get()).getDuration() : 0) % 20 == 0) {
					if (entity instanceof LivingEntity _entity)
						_entity.hurt(new DamageSource("got poisoned").bypassArmor(), (float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) * 0.01 + 0.2));
				}
			}
		}
	}
}
