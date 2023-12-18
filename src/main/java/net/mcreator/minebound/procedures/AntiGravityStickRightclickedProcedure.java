package net.mcreator.minebound.procedures;

import net.minecraft.world.entity.Entity;

public class AntiGravityStickRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.isNoGravity()) {
			entity.setNoGravity((true));
		} else if (entity.isNoGravity()) {
			entity.setNoGravity((false));
		}
	}
}
