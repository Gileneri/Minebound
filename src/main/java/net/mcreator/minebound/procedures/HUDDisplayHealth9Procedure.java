package net.mcreator.minebound.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class HUDDisplayHealth9Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean shouldDisplay = false;
		shouldDisplay = false;
		if (Math.round(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) / (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) >= 0.7) {
			shouldDisplay = true;
		}
		return shouldDisplay;
	}
}
