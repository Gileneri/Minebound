package net.mcreator.minebound.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class PlayerHeadHUDEntityOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean foundTarget = false;
		if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, (y - 1000000), z), 32, 32, 32), e -> true).isEmpty()
				|| !world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, (y - 1000000), z), 32, 32, 32), e -> true).isEmpty()) {
			foundTarget = false;
			if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, (y - 1000000), z), 32, 32, 32), e -> true).isEmpty()) {
				if ((((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, (y - 1000000), z), 32, 32, 32), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, (y - 1000000), z)).findFirst().orElse(null)).getDisplayName().getString()).equals(entity.getDisplayName().getString())) {
					foundTarget = true;
					{
						Entity _ent = entity;
						_ent.teleportTo((((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, (y - 1000000), z), 32, 32, 32), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, (y - 1000000), z)).findFirst().orElse(null)).getX()), (((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, (y - 1000000), z), 32, 32, 32), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, (y - 1000000), z)).findFirst().orElse(null)).getY() + 1000000),
								(((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, (y - 1000000), z), 32, 32, 32), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, (y - 1000000), z)).findFirst().orElse(null)).getZ()));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, (y - 1000000), z), 32, 32, 32), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, (y - 1000000), z)).findFirst().orElse(null)).getX()), (((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, (y - 1000000), z), 32, 32, 32), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, (y - 1000000), z)).findFirst().orElse(null)).getY() + 1000000),
									(((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, (y - 1000000), z), 32, 32, 32), e -> true).stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(x, (y - 1000000), z)).findFirst().orElse(null)).getZ()), _ent.getYRot(), _ent.getXRot());
					}
				}
			}
			if (!world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, (y - 1000000), z), 32, 32, 32), e -> true).isEmpty()) {
				if ((((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, (y - 1000000), z), 32, 32, 32), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, (y - 1000000), z)).findFirst().orElse(null)).getDisplayName().getString()).equals(entity.getDisplayName().getString())) {
					foundTarget = true;
					{
						Entity _ent = entity;
						_ent.teleportTo((((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, (y - 1000000), z), 32, 32, 32), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, (y - 1000000), z)).findFirst().orElse(null)).getX()), (((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, (y - 1000000), z), 32, 32, 32), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, (y - 1000000), z)).findFirst().orElse(null)).getY() + 1000000),
								(((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, (y - 1000000), z), 32, 32, 32), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, (y - 1000000), z)).findFirst().orElse(null)).getZ()));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, (y - 1000000), z), 32, 32, 32), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, (y - 1000000), z)).findFirst().orElse(null)).getX()),
									(((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, (y - 1000000), z), 32, 32, 32), e -> true).stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(x, (y - 1000000), z)).findFirst().orElse(null)).getY() + 1000000),
									(((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, (y - 1000000), z), 32, 32, 32), e -> true).stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(x, (y - 1000000), z)).findFirst().orElse(null)).getZ()), _ent.getYRot(), _ent.getXRot());
					}
				}
			}
			if (foundTarget == false) {
				{
					final Vec3 _center = new Vec3(x, (y - 1000000), z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof Player || entityiterator instanceof ServerPlayer) {
							if ((entityiterator.getDisplayName().getString()).equals(entity.getDisplayName().getString())) {
								foundTarget = true;
								{
									Entity _ent = entity;
									_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 1000000), (entityiterator.getZ()));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 1000000), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
								}
								break;
							}
						}
					}
				}
			}
			if (foundTarget == false) {
				if (!entity.level.isClientSide())
					entity.discard();
			}
		} else {
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}
