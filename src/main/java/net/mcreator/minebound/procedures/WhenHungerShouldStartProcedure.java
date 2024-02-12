package net.mcreator.minebound.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.Difficulty;

import net.mcreator.minebound.init.MineboundModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class WhenHungerShouldStartProcedure {
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
			if (entity.isAlive() && !(world.getDifficulty() == Difficulty.PEACEFUL)) {
				if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) <= 2 && (entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) > 0
						&& (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MineboundModMobEffects.HUNGRY.get()) ? _livEnt.getEffect(MineboundModMobEffects.HUNGRY.get()).getDuration() : 0) <= 1) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MineboundModMobEffects.HUNGRY.get(), 21, 0, (false), (true)));
				}
				if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MineboundModMobEffects.STARVING.get()) : false) {
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(MineboundModMobEffects.HUNGRY.get());
				}
			}
		}
	}
}
