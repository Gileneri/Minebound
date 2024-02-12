
package net.mcreator.minebound.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.minebound.procedures.PoisonedOnEffectActiveTickProcedure;

public class PoisonedMobEffect extends MobEffect {
	public PoisonedMobEffect() {
		super(MobEffectCategory.HARMFUL, -3022496);
	}

	@Override
	public String getDescriptionId() {
		return "effect.minebound.poisoned";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		PoisonedOnEffectActiveTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
