
package net.mcreator.minebound.potion;

public class FoodPoisoningMobEffect extends MobEffect {

	public FoodPoisoningMobEffect() {
		super(MobEffectCategory.HARMFUL, -13945570);
	}

	@Override
	public String getDescriptionId() {
		return "effect.minebound.food_poisoning";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		FoodPoisoningOnEffectActiveTickProcedure.execute(

		);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
