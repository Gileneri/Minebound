
package net.mcreator.test.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.test.procedures.PoisonedOnEffectActiveTickProcedure;
import net.mcreator.test.procedures.PoisonedActiveTickConditionProcedure;

public class PoisonedMobEffect extends MobEffect {
	public PoisonedMobEffect() {
		super(MobEffectCategory.HARMFUL, -3022496);
	}

	@Override
	public String getDescriptionId() {
		return "effect.test.poisoned";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		PoisonedOnEffectActiveTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return PoisonedActiveTickConditionProcedure.execute(amplifier, duration);
	}
}
