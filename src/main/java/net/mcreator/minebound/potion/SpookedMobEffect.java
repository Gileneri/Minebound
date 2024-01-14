
package net.mcreator.minebound.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class SpookedMobEffect extends MobEffect {
	public SpookedMobEffect() {
		super(MobEffectCategory.HARMFUL, -39169);
	}

	@Override
	public String getDescriptionId() {
		return "effect.minebound.spooked";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
