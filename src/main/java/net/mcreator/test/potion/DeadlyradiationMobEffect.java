
package net.mcreator.test.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.test.procedures.DeadlyradiationOnEffectActiveTickProcedure;

public class DeadlyradiationMobEffect extends MobEffect {
	public DeadlyradiationMobEffect() {
		super(MobEffectCategory.HARMFUL, -3342592);
	}

	@Override
	public String getDescriptionId() {
		return "effect.test.deadlyradiation";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		DeadlyradiationOnEffectActiveTickProcedure.execute(entity.level, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
