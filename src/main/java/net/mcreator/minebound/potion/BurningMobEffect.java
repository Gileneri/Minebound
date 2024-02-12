
package net.mcreator.minebound.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.minebound.procedures.BurningOnEffectActiveTickProcedure;

public class BurningMobEffect extends MobEffect {
	public BurningMobEffect() {
		super(MobEffectCategory.HARMFUL, -35313);
	}

	@Override
	public String getDescriptionId() {
		return "effect.minebound.burning";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		BurningOnEffectActiveTickProcedure.execute(entity.level, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
