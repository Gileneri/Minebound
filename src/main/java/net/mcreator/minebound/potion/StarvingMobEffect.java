
package net.mcreator.minebound.potion;

public class StarvingMobEffect extends MobEffect {

	public StarvingMobEffect() {
		super(MobEffectCategory.HARMFUL, -10092544);
	}

	@Override
	public String getDescriptionId() {
		return "effect.minebound.starving";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		StarvingEffectStartedappliedProcedure.execute(entity.level, entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		StarvingOnEffectActiveTickProcedure.execute(

		);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		StarvingEffectExpiresProcedure.execute(

		);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
