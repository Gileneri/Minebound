package net.mcreator.minebound.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.minebound.network.MineboundModVariables;

public class HUDDisplayEnergy19Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean shouldDisplay = false;
		shouldDisplay = false;
		if (Math.round((entity.getCapability(MineboundModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MineboundModVariables.PlayerVariables())).PLAYER_CURRENT_ENERGY)
				/ (entity.getCapability(MineboundModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MineboundModVariables.PlayerVariables())).PLAYER_MAX_ENERGY >= 0.36667) {
			shouldDisplay = true;
		}
		return shouldDisplay;
	}
}
