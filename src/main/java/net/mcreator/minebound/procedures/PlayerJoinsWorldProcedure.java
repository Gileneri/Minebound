package net.mcreator.minebound.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.minebound.network.MineboundModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerJoinsWorldProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 100;
			entity.getCapability(MineboundModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.PLAYER_MAX_ENERGY = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
