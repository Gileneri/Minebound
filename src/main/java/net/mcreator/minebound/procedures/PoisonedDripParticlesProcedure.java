package net.mcreator.minebound.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.minebound.init.MineboundModParticleTypes;
import net.mcreator.minebound.init.MineboundModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PoisonedDripParticlesProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MineboundModMobEffects.POISONED.get()) : false) || (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.POISON) : false)) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (MineboundModParticleTypes.POISON_DRIP.get()), x, y, z, 1, 0.2, 0.8, 0.2, 1);
		}
	}
}
