package net.mcreator.minebound.procedures;

import net.minecraftforge.eventbus.api.Event;

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
					|| (world.getFluidState(new BlockPos(x, y, z)).createLegacyBlock()).getBlock() == MineboundModItems.DELETED_MOD_ELEMENT.get()) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MineboundModMobEffects.DELETED_MOD_ELEMENT.get());
			}
		}
	}
}
