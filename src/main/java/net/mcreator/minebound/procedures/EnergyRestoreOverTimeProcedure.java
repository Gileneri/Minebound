package net.mcreator.minebound.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.minebound.network.MineboundModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EnergyRestoreOverTimeProcedure {
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
		if ((entity.getCapability(MineboundModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MineboundModVariables.PlayerVariables())).PLAYER_CURRENT_ENERGY < 0) {
			{
				double _setval = 0;
				entity.getCapability(MineboundModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PLAYER_CURRENT_ENERGY = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (entity.getPersistentData().getDouble("energyCooldown") <= 0 && (entity.getPersistentData().getDouble("energyStatus") != 0 && entity.getPersistentData().getDouble("energyStatus") != 2
				|| (entity.getCapability(MineboundModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MineboundModVariables.PlayerVariables())).PLAYER_CURRENT_ENERGY >= (entity
						.getCapability(MineboundModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MineboundModVariables.PlayerVariables())).PLAYER_MAX_ENERGY)) {
			entity.getPersistentData().putDouble("energyStatus", 0);
		} else if ((entity.getCapability(MineboundModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MineboundModVariables.PlayerVariables())).PLAYER_CURRENT_ENERGY <= 0 && entity.getPersistentData().getDouble("energyStatus") != 2) {
			entity.getPersistentData().putDouble("energyStatus", 2);
			entity.getPersistentData().putDouble("energyCooldown", 160);
		} else if (entity.getPersistentData().getDouble("energyCooldown") > 0 && entity.getPersistentData().getDouble("energyStatus") != 1 && entity.getPersistentData().getDouble("energyStatus") != 2) {
			entity.getPersistentData().putDouble("energyStatus", 1);
		}
		if (entity.getPersistentData().getDouble("energyCooldown") > 0) {
			entity.getPersistentData().putDouble("energyCooldown", (entity.getPersistentData().getDouble("energyCooldown") - 1));
		} else {
			if ((entity.getCapability(MineboundModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MineboundModVariables.PlayerVariables())).PLAYER_CURRENT_ENERGY < (entity.getCapability(MineboundModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MineboundModVariables.PlayerVariables())).PLAYER_MAX_ENERGY) {
				{
					double _setval = (entity.getCapability(MineboundModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MineboundModVariables.PlayerVariables())).PLAYER_CURRENT_ENERGY + 2.78;
					entity.getCapability(MineboundModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PLAYER_CURRENT_ENERGY = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if ((entity.getCapability(MineboundModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MineboundModVariables.PlayerVariables())).PLAYER_CURRENT_ENERGY > (entity
						.getCapability(MineboundModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MineboundModVariables.PlayerVariables())).PLAYER_MAX_ENERGY) {
					{
						double _setval = (entity.getCapability(MineboundModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MineboundModVariables.PlayerVariables())).PLAYER_MAX_ENERGY;
						entity.getCapability(MineboundModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.PLAYER_CURRENT_ENERGY = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		}
	}
}
