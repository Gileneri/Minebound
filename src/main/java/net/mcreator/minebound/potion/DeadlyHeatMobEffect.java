
package net.mcreator.minebound.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.minebound.procedures.DeadlyHeatOnEffectActiveTickProcedure;

public class DeadlyHeatMobEffect extends MobEffect {
	public DeadlyHeatMobEffect() {
		super(MobEffectCategory.HARMFUL, -26368);
	}

	@Override
	public String getDescriptionId() {
		return "effect.minebound.deadly_heat";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		DeadlyHeatOnEffectActiveTickProcedure.execute(entity.level, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
