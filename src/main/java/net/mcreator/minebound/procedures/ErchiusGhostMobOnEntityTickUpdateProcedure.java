package net.mcreator.minebound.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class ErchiusGhostMobOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xVelocity = 0;
		double searchDistance = 0;
		double velocityThreshold = 0;
		double velocityAdjustment = 0;
		double zVelocity = 0;
		double yVelocity = 0;
		if (entity.isAlive() && !world.isClientSide()) {
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null) {
				if (!(entity.getPersistentData().getDouble("cdWaitTimer") > 200)) {
					entity.getPersistentData().putDouble("cdWaitTimer", (entity.getPersistentData().getDouble("cdWaitTimer") + 1));
				} else {
					if (!entity.level.isClientSide())
						entity.discard();
				}
			} else {
				searchDistance = 12;
				xVelocity = entity.getDeltaMovement().x();
				yVelocity = entity.getDeltaMovement().y();
				zVelocity = entity.getDeltaMovement().z();
				velocityThreshold = 0.15;
				velocityAdjustment = 0.01;
				if (entity.getX() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX() > 1) {
					if (Math.abs(entity.getDeltaMovement().x()) < velocityThreshold) {
						xVelocity = entity.getDeltaMovement().x() - velocityAdjustment;
					}
				} else if (entity.getX() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX() < -1) {
					if (Math.abs(entity.getDeltaMovement().x()) < velocityThreshold) {
						xVelocity = entity.getDeltaMovement().x() + velocityAdjustment;
					}
				}
				if (world.getBlockState(new BlockPos(x, y, z)).canOcclude() && !world.getBlockState(new BlockPos(x, y + 1, z)).canOcclude()) {
					yVelocity = entity.getDeltaMovement().y() + velocityAdjustment / 2;
				} else {
					if (entity.getY() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() > 0.75) {
						if (Math.abs(entity.getDeltaMovement().y()) < velocityThreshold) {
							yVelocity = entity.getDeltaMovement().y() - velocityAdjustment;
						}
					} else if (entity.getY() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() < -0.75) {
						if (Math.abs(entity.getDeltaMovement().y()) < velocityThreshold) {
							yVelocity = entity.getDeltaMovement().y() + velocityAdjustment / 2;
						}
					}
				}
				if (entity.getZ() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ() > 1) {
					if (Math.abs(entity.getDeltaMovement().z()) < velocityThreshold) {
						zVelocity = entity.getDeltaMovement().z() - velocityAdjustment;
					}
				} else if (entity.getZ() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ() < -1) {
					if (Math.abs(entity.getDeltaMovement().z()) < velocityThreshold) {
						zVelocity = entity.getDeltaMovement().z() + velocityAdjustment;
					}
				}
				entity.setDeltaMovement(new Vec3((xVelocity + (((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).getCount() * 0.1),
						(yVelocity + (((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).getCount() * 0.1),
						(zVelocity + (((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).getCount() * 0.1)));
				{
					Entity _ent = entity;
					_ent.setYRot((float) ((-1) * Math.atan2((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX() - entity.getX(), (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ() - entity.getZ())
							* (180 / Math.PI)));
					_ent.setXRot(entity.getXRot());
					_ent.setYBodyRot(_ent.getYRot());
					_ent.setYHeadRot(_ent.getYRot());
					_ent.yRotO = _ent.getYRot();
					_ent.xRotO = _ent.getXRot();
					if (_ent instanceof LivingEntity _entity) {
						_entity.yBodyRotO = _entity.getYRot();
						_entity.yHeadRotO = _entity.getYRot();
					}
				}
			}
		}
	}
}
