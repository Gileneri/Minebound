package net.mcreator.minebound.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.minebound.init.MineboundModMobEffects;
import net.mcreator.minebound.init.MineboundModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BurningExtinguishesProcedure {
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
		if (!world.isClientSide()) {
			if (entity.isInWaterOrBubble() || entity.isInLava() || (world.getFluidState(new BlockPos(x, y, z)).createLegacyBlock()).getBlock() == MineboundModBlocks.POISON.get()
					|| (world.getFluidState(new BlockPos(x, y, z)).createLegacyBlock()).getBlock() == MineboundModBlocks.LIQUID_ERCHIUS_FUEL.get()) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MineboundModMobEffects.BURNING.get());
			}
		}
	}
}
