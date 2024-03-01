
package net.mcreator.minebound.potion;

public class BurningMobEffect extends MobEffect {

	public BurningMobEffect() {
		super(MobEffectCategory.HARMFUL, -35313);
	}

	@Override
	public String getDescriptionId() {
		return "effect.minebound.burning";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		BurningOnEffectActiveTickProcedure.execute(

		);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
