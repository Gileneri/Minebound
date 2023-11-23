package net.mcreator.minebound.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PseudoGravityProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		double velocityMultiplier = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.GLOWING) : false)
				&& (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.GLOWING) ? _livEnt.getEffect(MobEffects.GLOWING).getAmplifier() : 0) == 100) {
			if (entity.getDeltaMovement().y() < 0 && entity.getY() > 100) {
				velocityMultiplier = (100 - (entity.getY() - 100) / 10) / 100;
				if (velocityMultiplier < 0.5) {
					velocityMultiplier = 0.5;
				}
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() * velocityMultiplier), (entity.getDeltaMovement().z())));
			}
		}
	}
}
