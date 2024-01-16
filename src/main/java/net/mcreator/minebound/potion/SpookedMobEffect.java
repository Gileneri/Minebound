
package net.mcreator.minebound.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.minebound.procedures.SpookedOnEffectActiveTickProcedure;
import net.mcreator.minebound.procedures.SpookedEffectExpiresProcedure;

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
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		SpookedEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
