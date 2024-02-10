package net.mcreator.minebound.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.Difficulty;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class StarvingProcedureProcedure {
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
		String starvationCounter = "";
		if (!world.isClientSide()) {
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.HUNGER) : false) {
				if (entity.isAlive()) {
					if (!(world.getDifficulty() == Difficulty.PEACEFUL)) {
						starvationCounter = "WHATEVER YOU NAMED THE TAG";
						entity.getPersistentData().putDouble(starvationCounter, (entity.getPersistentData().getDouble(starvationCounter) + 3));
						if (entity.getPersistentData().getDouble(starvationCounter) > 300 && entity.getPersistentData().getDouble(starvationCounter) % 30 == 0
								|| entity.getPersistentData().getDouble(starvationCounter) > 180 && entity.getPersistentData().getDouble(starvationCounter) % 40 == 0 || entity.getPersistentData().getDouble(starvationCounter) % 60 == 0) {
							if (entity instanceof LivingEntity _entity)
								_entity.hurt(new DamageSource("NAME OF THE CAUSE OF DEATH").bypassArmor(), (float) (1.6 + entity.getPersistentData().getDouble(starvationCounter) / 1000));
						}
					} else {
						if (entity instanceof LivingEntity _entity)
							_entity.removeEffect(MobEffects.HUNGER);
					}
				}
			}
		}
	}
}
