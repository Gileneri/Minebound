package net.mcreator.minebound.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class HUDDisplayFood6Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean shouldDisplay = false;
		shouldDisplay = false;
		if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) >= 15) {
			shouldDisplay = true;
		}
		return shouldDisplay;
	}
}
