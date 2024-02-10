
package net.mcreator.minebound.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.minebound.procedures.SpookedOnEffectActiveTickProcedure;

public class SpookedMobEffect extends MobEffect {
	public SpookedMobEffect() {
		super(MobEffectCategory.HARMFUL, -39169);
	}

	@Override
	public String getDescriptionId() {
		return "effect.minebound.spooked";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		SpookedOnEffectActiveTickProcedure.execute(entity.level, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
