package net.mcreator.minebound.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class WhenStarvingShoulpStartProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			if (entity.isAlive()) {
				if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) == 0
						&& (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MineboundModMobEffects.STARVING.get()) ? _livEnt.getEffect(MineboundModMobEffects.STARVING.get()).getDuration() : 0) <= 1) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MineboundModMobEffects.STARVING.get(), 21, 0, (false), (true)));
				}
			}
		}
	}
}
