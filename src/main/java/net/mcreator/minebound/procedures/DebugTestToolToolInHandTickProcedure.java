package net.mcreator.minebound.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class DebugTestToolToolInHandTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, y, z), 32, 32, 32), e -> true).isEmpty()) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof ItemEntity) {
						if (!entityiterator.isNoGravity()) {
							entityiterator.setNoGravity((true));
						}
						entityiterator.setDeltaMovement(new Vec3((entityiterator.getDeltaMovement().x()), (entityiterator.getDeltaMovement().y() - 0.075), (entityiterator.getDeltaMovement().z())));
					}
				}
			}
		}
	}
}
