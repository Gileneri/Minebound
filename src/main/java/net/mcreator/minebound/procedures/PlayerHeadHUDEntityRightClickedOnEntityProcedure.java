package net.mcreator.minebound.procedures;

import net.minecraft.world.entity.Entity;

public class PlayerHeadHUDEntityRightClickedOnEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.level.isClientSide())
			entity.discard();
	}
}
