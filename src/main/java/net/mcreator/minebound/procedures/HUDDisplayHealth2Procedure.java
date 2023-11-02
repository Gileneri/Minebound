package net.mcreator.minebound.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class HUDDisplayHealth2Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean shouldDisplay = false;
		shouldDisplay = false;
		if (Math.round(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) / (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) >= 0.93334) {
			shouldDisplay = true;
		}
		return shouldDisplay;
	}
}
