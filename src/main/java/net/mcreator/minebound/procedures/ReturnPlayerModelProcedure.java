package net.mcreator.minebound.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.Entity;

import java.util.Comparator;

public class ReturnPlayerModelProcedure {
	public static Entity execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return null;
		Entity theEntity = null;
		if (!world.getEntitiesOfClass(Zombie.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY() + 1000000), (entity.getZ())), 128, 128, 128), e -> true).isEmpty()) {
			theEntity = (Entity) world.getEntitiesOfClass(Zombie.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY() + 1000000), (entity.getZ())), 128, 128, 128), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf((entity.getX()), (entity.getY() + 1000000), (entity.getZ()))).findFirst().orElse(null);
		} else {
			theEntity = entity;
		}
		return theEntity;
	}
}
