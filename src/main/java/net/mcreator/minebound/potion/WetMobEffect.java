
package net.mcreator.minebound.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.minebound.procedures.WetOnEffectActiveTickProcedure;

public class WetMobEffect extends MobEffect {
	public WetMobEffect() {
		super(MobEffectCategory.HARMFUL, -16724788);
	}

	@Override
	public String getDescriptionId() {
		return "effect.minebound.wet";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		WetOnEffectActiveTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
