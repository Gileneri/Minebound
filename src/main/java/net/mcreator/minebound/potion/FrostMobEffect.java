
package net.mcreator.minebound.potion;

public class FrostMobEffect extends MobEffect {

	public FrostMobEffect() {
		super(MobEffectCategory.HARMFUL, -12736291);
	}

	@Override
	public String getDescriptionId() {
		return "effect.minebound.frost";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		FrostEffectStartsProcedure.execute(

		);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		FrostEffectExpiresProcedure.execute(entity.level, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
