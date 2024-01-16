package net.mcreator.minebound.procedures;

import net.minecraft.world.entity.Entity;

public class SpookedEffectExpiresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("mb_hunted", (false));
	}
}
