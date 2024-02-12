
package net.mcreator.minebound.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.minebound.procedures.FoodPoisoningOnEffectActiveTickProcedure;

public class FoodPoisoningMobEffect extends MobEffect {
	public FoodPoisoningMobEffect() {
		super(MobEffectCategory.HARMFUL, -13945570);
	}

	@Override
	public String getDescriptionId() {
		return "effect.minebound.food_poisoning";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		FoodPoisoningOnEffectActiveTickProcedure.execute(entity.level, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
