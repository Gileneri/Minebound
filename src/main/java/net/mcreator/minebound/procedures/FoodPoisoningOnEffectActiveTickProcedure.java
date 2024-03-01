package net.mcreator.minebound.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

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
