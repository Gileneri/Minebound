package net.mcreator.minebound.procedures;

import net.minecraft.world.entity.Entity;

public class ReturnPlayerDisplayNameProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		Entity theEntity = null;
		return entity.getDisplayName().getString();
	}
}
