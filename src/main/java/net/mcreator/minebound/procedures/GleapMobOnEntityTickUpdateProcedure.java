package net.mcreator.minebound.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.minebound.init.MineboundModMobEffects;
import net.mcreator.minebound.entity.TentacleClamMobEntity;
import net.mcreator.minebound.entity.GleapMobEntity;
import net.mcreator.minebound.entity.BulbopMobEntity;
import net.mcreator.minebound.MineboundMod;

public class GleapMobOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double targetX = 0;
		double targetY = 0;
		double targetZ = 0;
		double offsetX = 0;
		double offsetZ = 0;
		double yawAngle = 0;
		double waitTime = 0;
		boolean isAggro = false;
		if (entity.isAlive() && !world.isClientSide()) {
			waitTime = 40;
			yawAngle = entity.getYRot();
			if (true == true) {
				if (yawAngle < 0) {
					yawAngle = yawAngle + 360;
				}
				if (yawAngle > 180) {
					yawAngle = 180 - (yawAngle - 180);
					yawAngle = yawAngle * (-1);
				}
				offsetX = yawAngle / (-90);
				if (offsetX > 1) {
					offsetX = 1 - (offsetX - 1);
				} else if (offsetX < -1) {
					offsetX = (-1) - (offsetX + 1);
				}
				offsetZ = yawAngle - 90;
				if (offsetZ < -180) {
					offsetZ = offsetZ + 360;
				}
				offsetZ = offsetZ / (-90);
				if (offsetZ > 1) {
					offsetZ = 1 - (offsetZ - 1);
				} else if (offsetZ < -1) {
					offsetZ = (-1) - (offsetZ + 1);
				}
				offsetX = offsetX * 10;
				offsetZ = offsetZ * 10;
			}
			if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
				isAggro = true;
				targetX = (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX();
				targetY = (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY();
				targetZ = (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ();
				waitTime = waitTime - 10;
			} else {
				isAggro = false;
				targetX = entity.getX() + offsetX;
				targetY = entity.getY();
				targetZ = entity.getZ() + offsetZ;
			}
			if (entity instanceof Mob _entity)
				_entity.getNavigation().moveTo(targetX, targetY, targetZ, 1);
			if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MineboundModMobEffects.SHIELD_GENERATOR_EFFECT.get()) : false)) {
				if (Math.abs(entity.getDeltaMovement().y()) < 0.255) {
					if (entity.getPersistentData().getDouble("previousXpos") == entity.getX() && entity.getPersistentData().getDouble("previousZpos") == entity.getZ() && isAggro == true) {
						entity.getPersistentData().putDouble("previousXpos", (entity.getX()));
						entity.getPersistentData().putDouble("previousZpos", (entity.getZ()));
						entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 0.67, (entity.getDeltaMovement().z())));
					} else {
						entity.getPersistentData().putDouble("previousXpos", (entity.getX()));
						entity.getPersistentData().putDouble("previousZpos", (entity.getZ()));
						entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 0.56, (entity.getDeltaMovement().z())));
					}
				}
				if (entity instanceof GleapMobEntity || entity instanceof BulbopMobEntity || entity instanceof TentacleClamMobEntity) {
					waitTime = waitTime - 10;
					if (isAggro == true) {
						MineboundMod.queueServerWork(5, () -> {
							if (entity instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 15, 9, (false), (false)));
						});
					} else if (isAggro == false) {
						MineboundMod.queueServerWork(5, () -> {
							if (entity instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 25, 9, (false), (false)));
						});
					}
				} else {
					if (isAggro == true) {
						MineboundMod.queueServerWork(5, () -> {
							if (entity instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 25, 9, (false), (false)));
						});
					} else if (isAggro == false) {
						MineboundMod.queueServerWork(5, () -> {
							if (entity instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 35, 9, (false), (false)));
						});
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MineboundModMobEffects.SHIELD_GENERATOR_EFFECT.get(), (int) waitTime, 0, (false), (false)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 100, -6, (false), (false)));
			}
			if (!entity.isOnGround() && entity.getDeltaMovement().x() == 0) {
				entity.setDeltaMovement(new Vec3((offsetX / 1000), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z())));
			}
			if (!entity.isOnGround() && entity.getDeltaMovement().z() == 0) {
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y()), (offsetZ / 1000)));
			}
		}
	}
}
