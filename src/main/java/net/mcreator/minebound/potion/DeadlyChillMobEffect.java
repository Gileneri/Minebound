
package net.mcreator.minebound.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.minebound.procedures.DeadlyChillOnEffectActiveTickProcedure;
import net.mcreator.minebound.procedures.DeadlyChillEffectstarsProcedure;
import net.mcreator.minebound.procedures.DeadlyChillEffectExpiresProcedure;

public class DeadlyChillMobEffect extends MobEffect {
	public DeadlyChillMobEffect() {
		super(MobEffectCategory.HARMFUL, -11799555);
	}

	@Override
	public String getDescriptionId() {
		return "effect.minebound.deadly_chill";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		DeadlyChillEffectstarsProcedure.execute(entity.level, entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		DeadlyChillOnEffectActiveTickProcedure.execute(entity.level, entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		DeadlyChillEffectExpiresProcedure.execute(entity.level, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
