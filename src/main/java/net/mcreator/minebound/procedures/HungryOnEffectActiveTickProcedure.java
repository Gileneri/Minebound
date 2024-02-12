package net.mcreator.minebound.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class HungryOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			if (entity instanceof Player || entity instanceof ServerPlayer) {
				if (entity.isAlive()) {
					if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MineboundModMobEffects.HUNGRY.get()) ? _livEnt.getEffect(MineboundModMobEffects.HUNGRY.get()).getDuration() : 0) % 20 == 0) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("minebound:starving1")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("minebound:starving1")), SoundSource.PLAYERS, 1, 1, false);
							}
						}
					}
				}
			}
		}
	}
}
