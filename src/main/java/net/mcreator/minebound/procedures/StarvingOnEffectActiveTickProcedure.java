package net.mcreator.minebound.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class StarvingOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double starvationIncrement = 0;
		String starvationCounter = "";
		String deathAttack = "";
		if (!world.isClientSide()) {
			if (entity.isAlive()) {
				if (!(world.getDifficulty() == Difficulty.PEACEFUL)) {
					starvationCounter = "starvingTag";
					entity.getPersistentData().putDouble(starvationCounter, (entity.getPersistentData().getDouble(starvationCounter) + 3));
					if (entity.getPersistentData().getDouble(starvationCounter) > 300 && entity.getPersistentData().getDouble(starvationCounter) % 30 == 0
							|| entity.getPersistentData().getDouble(starvationCounter) > 180 && entity.getPersistentData().getDouble(starvationCounter) % 40 == 0 || entity.getPersistentData().getDouble(starvationCounter) % 60 == 0) {
						if (entity instanceof LivingEntity _entity)
							_entity.hurt(new DamageSource("starved").bypassArmor(), (float) (1.6 + entity.getPersistentData().getDouble(starvationCounter) / 1000));
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("minebound:starving2")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("minebound:starving2")), SoundSource.PLAYERS, 1, 1, false);
							}
						}
					}
				} else {
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(MineboundModMobEffects.STARVING.get());
				}
			}
		}
	}
}
