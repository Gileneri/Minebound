package net.mcreator.minebound.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

import net.mcreator.minebound.entity.MechTestBodyEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerControlMechVerticalMovementProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		Entity riderEntity = null;
		if (entity.isPassenger()) {
			if ((entity.getVehicle()) instanceof MechTestBodyEntity) {
				if (entity.getXRot() < -25) {
					(entity.getVehicle()).setDeltaMovement(new Vec3(((entity.getVehicle()).getDeltaMovement().x()), 0.2, ((entity.getVehicle()).getDeltaMovement().z())));
				} else if (entity.getXRot() > 40) {
					(entity.getVehicle()).setDeltaMovement(new Vec3(((entity.getVehicle()).getDeltaMovement().x()), (-0.2), ((entity.getVehicle()).getDeltaMovement().z())));
				}
				if ((entity.getVehicle()).isInWater()) {
					(entity.getVehicle()).setDeltaMovement(new Vec3(((entity.getVehicle()).getDeltaMovement().x()), ((entity.getVehicle()).getDeltaMovement().y() - 0.05), ((entity.getVehicle()).getDeltaMovement().z())));
				}
				for (int index0 = 0; index0 < (int) (3); index0++) {
					entity.fallDistance = 0;
				}
			}
		}
	}
}
