package net.mcreator.minebound.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.minebound.init.MineboundModEntities;
import net.mcreator.minebound.entity.MechTestLegRightEntity;
import net.mcreator.minebound.entity.MechTestLegLeftEntity;
import net.mcreator.minebound.entity.MechTestArmRightEntity;
import net.mcreator.minebound.entity.MechTestArmLeftEntity;

public class MechTestBodyOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(!world.getEntitiesOfClass(MechTestArmLeftEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).isEmpty())) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new MechTestArmLeftEntity(MineboundModEntities.MECH_TEST_ARM_LEFT.get(), _level);
				entityToSpawn.moveTo(x, y, z, entity.getYRot(), 0);
				entityToSpawn.setYBodyRot(entity.getYRot());
				entityToSpawn.setYHeadRot(entity.getYRot());
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		}
		if (!(!world.getEntitiesOfClass(MechTestArmRightEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).isEmpty())) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new MechTestArmRightEntity(MineboundModEntities.MECH_TEST_ARM_RIGHT.get(), _level);
				entityToSpawn.moveTo(x, y, z, entity.getYRot(), 0);
				entityToSpawn.setYBodyRot(entity.getYRot());
				entityToSpawn.setYHeadRot(entity.getYRot());
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		}
		if (!(!world.getEntitiesOfClass(MechTestLegLeftEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).isEmpty())) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new MechTestLegLeftEntity(MineboundModEntities.MECH_TEST_LEG_LEFT.get(), _level);
				entityToSpawn.moveTo(x, y, z, entity.getYRot(), 0);
				entityToSpawn.setYBodyRot(entity.getYRot());
				entityToSpawn.setYHeadRot(entity.getYRot());
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		}
		if (!(!world.getEntitiesOfClass(MechTestLegRightEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).isEmpty())) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new MechTestLegRightEntity(MineboundModEntities.MECH_TEST_LEG_RIGHT.get(), _level);
				entityToSpawn.moveTo(x, y, z, entity.getYRot(), 0);
				entityToSpawn.setYBodyRot(entity.getYRot());
				entityToSpawn.setYHeadRot(entity.getYRot());
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		}
	}
}
