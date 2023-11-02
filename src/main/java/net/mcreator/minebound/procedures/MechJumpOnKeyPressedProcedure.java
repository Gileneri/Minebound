package net.mcreator.minebound.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

import net.mcreator.minebound.entity.MechTestBodyEntity;

public class MechJumpOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isPassenger()) {
			if ((entity.getVehicle()) instanceof MechTestBodyEntity) {
				if ((entity.getVehicle()).isOnGround()) {
					(entity.getVehicle()).setDeltaMovement(new Vec3(((entity.getVehicle()).getDeltaMovement().x()), 0.8, ((entity.getVehicle()).getDeltaMovement().z())));
				} else if ((entity.getVehicle()).isInWater()) {
					(entity.getVehicle()).setDeltaMovement(new Vec3(((entity.getVehicle()).getDeltaMovement().x()), 0.2, ((entity.getVehicle()).getDeltaMovement().z())));
				}
			}
		}
	}
}
