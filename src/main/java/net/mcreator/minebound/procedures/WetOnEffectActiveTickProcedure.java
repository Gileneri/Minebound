package net.mcreator.minebound.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.minebound.init.MineboundModParticleTypes;

public class WetOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			if (!(entity instanceof LivingEntity _livEnt ? _livEnt.getMobType() == MobType.WATER : false)) {
				if (entity.getDeltaMovement().y() > 0) {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() * 0.11), (entity.getDeltaMovement().y() * 0.11), (entity.getDeltaMovement().z() * 0.11)));
				} else {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() * 0.11), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() * 0.11)));
				}
				if (!entity.isInWaterOrBubble()) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (MineboundModParticleTypes.DRIPING_WET.get()), x, y, z, 1, 0.2, 0.8, 0.2, 2);
				}
			}
		}
	}
}
