package net.mcreator.minebound.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

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
