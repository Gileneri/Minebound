package net.mcreator.minebound.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BurningParticlesProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MineboundModMobEffects.DELETED_MOD_ELEMENT.get()) : false) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (MineboundModParticleTypes.BURNING_PARTICLE.get()), x, y, z, 1, 0.2, 0.8, 0.2, 1);
		}
	}
}
