
package net.mcreator.minebound.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.minebound.procedures.FullBellyOnEffectActiveTickProcedure;

public class FullBellyMobEffect extends MobEffect {
	public FullBellyMobEffect() {
		super(MobEffectCategory.HARMFUL, -11255002);
	}

	@Override
	public String getDescriptionId() {
		return "effect.minebound.full_belly";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		FullBellyOnEffectActiveTickProcedure.execute(entity.level, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
