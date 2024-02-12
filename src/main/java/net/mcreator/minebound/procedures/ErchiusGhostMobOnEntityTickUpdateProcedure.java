package net.mcreator.minebound.procedures;

import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

import net.mcreator.minebound.init.MineboundModMobEffects;
import net.mcreator.minebound.init.MineboundModItems;

import java.util.stream.Collectors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Comparator;

public class ErchiusGhostMobOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		Entity targetPlayer = null;
		double xVelocity = 0;
		double searchDistance = 0;
		double velocityThreshold = 0;
		double velocityAdjustment = 0;
		double zVelocity = 0;
		double yVelocity = 0;
		double fuelCounter = 0;
		double velocity = 0;
		double fuelMemory = 0;
		if (entity.isAlive() && !world.isClientSide()) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 4, (false), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 4, (false), (false)));
			if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 160, 160, 160), e -> true).isEmpty()
					|| !world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 160, 160, 160), e -> true).isEmpty()) {
				if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 64, 64, 64), e -> true).isEmpty()
						|| !world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 64, 64, 64), e -> true).isEmpty()) {
					{
						final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(64 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (entityiterator instanceof Player || entityiterator instanceof ServerPlayer) {
								{
									AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
									entityiterator.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _iitemhandlerref.set(capability));
									if (_iitemhandlerref.get() != null) {
										for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
											ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
											if (itemstackiterator.getItem() == MineboundModItems.CRYSTAL_ERCHIUS_FUEL.get()) {
												fuelCounter = fuelCounter + (itemstackiterator).getCount();
											}
										}
									}
								}
								if (fuelCounter > fuelMemory) {
									fuelMemory = fuelCounter;
									targetPlayer = entityiterator;
								}
							}
						}
					}
				}
				if (targetPlayer == null) {
					{
						final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(160 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (entityiterator instanceof Player || entityiterator instanceof ServerPlayer) {
								if ((entityiterator.getDisplayName().getString()).equals(entity.getPersistentData().getString("mb_target"))) {
									targetPlayer = entityiterator;
									break;
								}
							}
						}
					}
				}
				if (targetPlayer == null) {
					if (!entity.level.isClientSide())
						entity.discard();
				} else {
					{
						AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
						targetPlayer.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _iitemhandlerref.set(capability));
						if (_iitemhandlerref.get() != null) {
							for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
								ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
								if (itemstackiterator.getItem() == MineboundModItems.CRYSTAL_ERCHIUS_FUEL.get()) {
									fuelCounter = fuelCounter + (itemstackiterator).getCount();
								}
							}
						}
					}
					velocity = (Math.cbrt((5 + fuelCounter) * (10 / 3)) + fuelCounter / 300) / 200;
					if (Math.sqrt(Math.pow(entity.getX() - targetPlayer.getX(), 2) + Math.pow(entity.getY() - targetPlayer.getY(), 2) + Math.pow(entity.getZ() - targetPlayer.getZ(), 2)) > 64) {
						xVelocity = targetPlayer.getDeltaMovement().x();
						yVelocity = targetPlayer.getDeltaMovement().y();
						zVelocity = targetPlayer.getDeltaMovement().z();
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 5, 0));
						if (entity.getX() - targetPlayer.getX() > 10) {
							if (xVelocity > 0) {
								xVelocity = xVelocity * (-1);
							}
							xVelocity = xVelocity - 1;
						} else if (entity.getX() - targetPlayer.getX() < -10) {
							if (xVelocity < 0) {
								xVelocity = xVelocity * (-1);
							}
							xVelocity = xVelocity + 1;
						}
						if (entity.getY() - targetPlayer.getY() > 10) {
							if (yVelocity > 0) {
								yVelocity = yVelocity * (-1);
							}
							yVelocity = yVelocity - 1;
						} else if (entity.getY() - targetPlayer.getY() < -10) {
							if (yVelocity < 0) {
								yVelocity = yVelocity * (-1);
							}
							yVelocity = yVelocity + 1;
						}
						if (entity.getZ() - targetPlayer.getZ() > 10) {
							if (zVelocity > 0) {
								zVelocity = zVelocity * (-1);
							}
							zVelocity = zVelocity - 1;
						} else if (entity.getZ() - targetPlayer.getZ() < -10) {
							if (zVelocity < 0) {
								zVelocity = zVelocity * (-1);
							}
							zVelocity = zVelocity + 1;
						}
						if (Math.abs(entity.getX() - targetPlayer.getX()) < 10) {
							xVelocity = (xVelocity * Math.abs(entity.getX() - targetPlayer.getX())) / 10;
						}
						if (Math.abs(entity.getY() - targetPlayer.getY()) < 10) {
							yVelocity = (yVelocity * Math.abs(entity.getY() - targetPlayer.getY())) / 10;
						}
						if (Math.abs(entity.getZ() - targetPlayer.getZ()) < 10) {
							zVelocity = (zVelocity * Math.abs(entity.getZ() - targetPlayer.getZ())) / 10;
						}
					} else {
						if (entity.getX() - targetPlayer.getX() > 0) {
							xVelocity = velocity * (-1);
						} else if (entity.getX() - targetPlayer.getX() < 0) {
							xVelocity = velocity;
						}
						if (entity.getY() - targetPlayer.getY() > 0) {
							yVelocity = velocity * (-1);
						} else if (entity.getY() - targetPlayer.getY() < 0) {
							yVelocity = velocity;
						}
						if (entity.getZ() - targetPlayer.getZ() > 0) {
							zVelocity = velocity * (-1);
						} else if (entity.getZ() - targetPlayer.getZ() < 0) {
							zVelocity = velocity;
						}
						if (Math.abs(entity.getX() - targetPlayer.getX()) < 5) {
							xVelocity = (xVelocity * Math.abs(entity.getX() - targetPlayer.getX())) / 5;
						}
						if (Math.abs(entity.getY() - targetPlayer.getY()) < 5) {
							yVelocity = (yVelocity * Math.abs(entity.getY() - targetPlayer.getY())) / 5;
						}
						if (Math.abs(entity.getZ() - targetPlayer.getZ()) < 5) {
							zVelocity = (zVelocity * Math.abs(entity.getZ() - targetPlayer.getZ())) / 5;
						}
					}
					entity.setDeltaMovement(new Vec3(xVelocity, yVelocity, zVelocity));
					{
						Entity _ent = entity;
						_ent.setYRot((float) ((-1) * Math.atan2(targetPlayer.getX() - entity.getX(), targetPlayer.getZ() - entity.getZ()) * (180 / Math.PI)));
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
			} else {
				if (!entity.level.isClientSide())
					entity.discard();
			}
			if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 20, 20, 20), e -> true).isEmpty()
					|| !world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 20, 20, 20), e -> true).isEmpty()) {
				{
					final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if ((entityiterator instanceof Player || entityiterator instanceof ServerPlayer) && !(new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayer _serverPlayer) {
									return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
								} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
									return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
											&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
								}
								return false;
							}
						}.checkGamemode(entityiterator))) {
							if (entityiterator instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MineboundModMobEffects.SPOOKED.get(), 20, 1, (false), (true)));
						}
					}
				}
				{
					final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if ((entityiterator instanceof Player || entityiterator instanceof ServerPlayer) && !(new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayer _serverPlayer) {
									return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
								} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
									return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
											&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
								}
								return false;
							}
						}.checkGamemode(entityiterator))) {
							if (entityiterator instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MineboundModMobEffects.SPOOKED.get(), 20, 2, (false), (true)));
						}
					}
				}
			}
		}
	}
}
