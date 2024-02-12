package net.mcreator.minebound.procedures;

import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.minebound.init.MineboundModItems;
import net.mcreator.minebound.init.MineboundModEntities;
import net.mcreator.minebound.entity.ErchiusGhostMobEntity;

import java.util.stream.Collectors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Comparator;

public class SpookedOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		boolean allowSpawn = false;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		double numberOfPlayers = 0;
		double numberOfGhosts = 0;
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(128 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof Player || entityiterator instanceof ServerPlayer) {
					{
						AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
						entityiterator.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _iitemhandlerref.set(capability));
						if (_iitemhandlerref.get() != null) {
							for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
								ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
								if (itemstackiterator.getItem() == MineboundModItems.CRYSTAL_ERCHIUS_FUEL.get()) {
									numberOfPlayers = numberOfPlayers + 1;
									break;
								}
							}
						}
					}
				} else if (entityiterator instanceof ErchiusGhostMobEntity) {
					numberOfGhosts = numberOfGhosts + 1;
				}
			}
		}
		if (numberOfGhosts < numberOfPlayers) {
			allowSpawn = true;
			xPos = entity.getX() + Mth.nextInt(RandomSource.create(), -40, 40);
			yPos = entity.getY() + Mth.nextInt(RandomSource.create(), -5, 5);
			zPos = entity.getZ() + Mth.nextInt(RandomSource.create(), -40, 40);
			if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(xPos, yPos, zPos), 40, 40, 40), e -> true).isEmpty()
					|| !world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(xPos, yPos, zPos), 40, 40, 40), e -> true).isEmpty()) {
				allowSpawn = false;
			}
			if (allowSpawn == true) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new ErchiusGhostMobEntity(MineboundModEntities.ERCHIUS_GHOST_MOB.get(), _level);
					entityToSpawn.moveTo(xPos, yPos, zPos, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!world.getEntitiesOfClass(ErchiusGhostMobEntity.class, AABB.ofSize(new Vec3(xPos, yPos, zPos), 4, 4, 4), e -> true).isEmpty()) {
					entity.getPersistentData().putBoolean("mb_hunted", (true));
					((Entity) world.getEntitiesOfClass(ErchiusGhostMobEntity.class, AABB.ofSize(new Vec3(xPos, yPos, zPos), 4, 4, 4), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(xPos, yPos, zPos)).findFirst().orElse(null)).getPersistentData().putString("mb_target", (entity.getDisplayName().getString()));
				}
			}
		}
	}
}
