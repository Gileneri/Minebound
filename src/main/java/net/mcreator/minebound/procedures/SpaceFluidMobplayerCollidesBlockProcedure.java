package net.mcreator.minebound.procedures;

import net.minecraft.world.entity.Entity;

public class SpaceFluidMobplayerCollidesBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSprinting((false));
	}
}
