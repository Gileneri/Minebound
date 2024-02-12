package net.mcreator.minebound.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.minebound.init.MineboundModMobEffects;
import net.mcreator.minebound.init.MineboundModEntities;
import net.mcreator.minebound.entity.BlockIndicatorEntity3Entity;
import net.mcreator.minebound.entity.BlockIndicatorEntity2Entity;
import net.mcreator.minebound.entity.BlockIndicatorEntity1Entity;

import java.util.Comparator;

public class MMWhenInHandTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double raytraceDistance = 0;
		double targetX = 0;
		double targetY = 0;
		double targetZ = 0;
		double zPos = 0;
		double yPos = 0;
		double xPos = 0;
		double radiusHeight = 0;
		double radiusWidth = 0;
		double offsetWidth = 0;
		double offsetHeight = 0;
		double radiusDepth = 0;
		double offsetDepth = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ReturnMMProcedure.execute().getItem()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ReturnMMProcedure.execute().getItem()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ReturnMMProcedure.execute().getItem()) {
				raytraceDistance = 10 + (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMrangeLevel") * 2;
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ReturnMMProcedure.execute().getItem()) {
				raytraceDistance = 10 + (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMrangeLevel") * 2;
			}
			targetX = entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()
					+ 0.5;
			targetY = entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY();
			targetZ = entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()
					+ 0.5;
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ReturnMMProcedure.execute().getItem()) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MineboundModMobEffects.SHIELD_GENERATOR_EFFECT.get()) : false)
						|| world.getBlockState(new BlockPos(targetX, targetY + 0.5, targetZ)).getDestroySpeed(world, new BlockPos(targetX, targetY + 0.5, targetZ)) < 0
								&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMradiusLevel") < 1) {
					if (!world.getEntitiesOfClass(BlockIndicatorEntity3Entity.class, AABB.ofSize(new Vec3(targetX, (targetY + 0.5), targetZ), 0.2, 0.2, 0.2), e -> true).isEmpty()) {
						if (((Entity) world.getEntitiesOfClass(BlockIndicatorEntity3Entity.class, AABB.ofSize(new Vec3(targetX, (targetY + 0.5), targetZ), 0.2, 0.2, 0.2), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(targetX, (targetY + 0.5), targetZ)).findFirst().orElse(null)) instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 2, 0, (false), (false)));
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new BlockIndicatorEntity3Entity(MineboundModEntities.BLOCK_INDICATOR_ENTITY_3.get(), _level);
							entityToSpawn.moveTo(targetX, targetY, targetZ, 0, 0);
							entityToSpawn.setYBodyRot(0);
							entityToSpawn.setYHeadRot(0);
							entityToSpawn.setDeltaMovement(0, 0, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMmodeEnabled") == 3) {
						if (!world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3(targetX, (targetY + 0.5), targetZ), 0.2, 0.2, 0.2), e -> true).isEmpty()) {
							if (((Entity) world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3(targetX, (targetY + 0.5), targetZ), 0.2, 0.2, 0.2), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(targetX, (targetY + 0.5), targetZ)).findFirst().orElse(null)) instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 2, 0, (false), (false)));
						} else {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new BlockIndicatorEntity1Entity(MineboundModEntities.BLOCK_INDICATOR_ENTITY_1.get(), _level);
								entityToSpawn.moveTo(targetX, targetY, targetZ, 0, 0);
								entityToSpawn.setYBodyRot(0);
								entityToSpawn.setYHeadRot(0);
								entityToSpawn.setDeltaMovement(0, 0, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						}
						FlashlightTestProcedure.execute(world, entity);
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getBoolean("hasMMliquidUpgrade") == true && entity.isShiftKeyDown()
							&& !((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMmodeEnabled") == 2)) {
						if (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
								.getType() == HitResult.Type.BLOCK) {
							targetX = entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
									.getBlockPos().getX() + 0.5;
							targetY = entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
									.getBlockPos().getY();
							targetZ = entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
									.getBlockPos().getZ() + 0.5;
							if (!world.isEmptyBlock(new BlockPos(targetX, targetY + 0.5, targetZ))) {
								if (!world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3(targetX, (targetY + 0.5), targetZ), 0.2, 0.2, 0.2), e -> true).isEmpty()) {
									if (((Entity) world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3(targetX, (targetY + 0.5), targetZ), 0.2, 0.2, 0.2), e -> true).stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(targetX, (targetY + 0.5), targetZ)).findFirst().orElse(null)) instanceof LivingEntity _entity)
										_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 2, 0, (false), (false)));
								} else {
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = new BlockIndicatorEntity1Entity(MineboundModEntities.BLOCK_INDICATOR_ENTITY_1.get(), _level);
										entityToSpawn.moveTo(targetX, targetY, targetZ, 0, 0);
										entityToSpawn.setYBodyRot(0);
										entityToSpawn.setYHeadRot(0);
										entityToSpawn.setDeltaMovement(0, 0, 0);
										if (entityToSpawn instanceof Mob _mobToSpawn)
											_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
										world.addFreshEntity(entityToSpawn);
									}
								}
							}
						}
					} else {
						if (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
								.getType() == HitResult.Type.BLOCK) {
							if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMradiusLevel") < 1 || entity.isShiftKeyDown()
									|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMmodeEnabled") == 2) {
								if (!world.isEmptyBlock(new BlockPos(targetX, targetY + 0.5, targetZ)) && !((world.getBlockState(new BlockPos(targetX, targetY + 0.5, targetZ))).getBlock() instanceof LiquidBlock)) {
									if (!world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3(targetX, (targetY + 0.5), targetZ), 0.2, 0.2, 0.2), e -> true).isEmpty()) {
										if (((Entity) world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3(targetX, (targetY + 0.5), targetZ), 0.2, 0.2, 0.2), e -> true).stream().sorted(new Object() {
											Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
												return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
											}
										}.compareDistOf(targetX, (targetY + 0.5), targetZ)).findFirst().orElse(null)) instanceof LivingEntity _entity)
											_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 2, 0, (false), (false)));
									} else if (!world.getEntitiesOfClass(BlockIndicatorEntity2Entity.class, AABB.ofSize(new Vec3(targetX, (targetY + 0.5), targetZ), 0.2, 0.2, 0.2), e -> true).isEmpty()) {
										if (((Entity) world.getEntitiesOfClass(BlockIndicatorEntity2Entity.class, AABB.ofSize(new Vec3(targetX, (targetY + 0.5), targetZ), 0.2, 0.2, 0.2), e -> true).stream().sorted(new Object() {
											Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
												return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
											}
										}.compareDistOf(targetX, (targetY + 0.5), targetZ)).findFirst().orElse(null)) instanceof LivingEntity _entity)
											_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 2, 0, (false), (false)));
									} else if (!world.getEntitiesOfClass(BlockIndicatorEntity3Entity.class, AABB.ofSize(new Vec3(targetX, (targetY + 0.5), targetZ), 0.2, 0.2, 0.2), e -> true).isEmpty()) {
										if (((Entity) world.getEntitiesOfClass(BlockIndicatorEntity3Entity.class, AABB.ofSize(new Vec3(targetX, (targetY + 0.5), targetZ), 0.2, 0.2, 0.2), e -> true).stream().sorted(new Object() {
											Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
												return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
											}
										}.compareDistOf(targetX, (targetY + 0.5), targetZ)).findFirst().orElse(null)) instanceof LivingEntity _entity)
											_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 2, 0, (false), (false)));
									} else {
										if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMmodeEnabled") == 2) {
											if (world instanceof ServerLevel _level) {
												Entity entityToSpawn = new BlockIndicatorEntity2Entity(MineboundModEntities.BLOCK_INDICATOR_ENTITY_2.get(), _level);
												entityToSpawn.moveTo(targetX, targetY, targetZ, 0, 0);
												entityToSpawn.setYBodyRot(0);
												entityToSpawn.setYHeadRot(0);
												entityToSpawn.setDeltaMovement(0, 0, 0);
												if (entityToSpawn instanceof Mob _mobToSpawn)
													_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
												world.addFreshEntity(entityToSpawn);
											}
										} else if (world.getBlockState(new BlockPos(targetX, targetY, targetZ)).getDestroySpeed(world, new BlockPos(targetX, targetY, targetZ)) >= 0) {
											if (world instanceof ServerLevel _level) {
												Entity entityToSpawn = new BlockIndicatorEntity1Entity(MineboundModEntities.BLOCK_INDICATOR_ENTITY_1.get(), _level);
												entityToSpawn.moveTo(targetX, targetY, targetZ, 0, 0);
												entityToSpawn.setYBodyRot(0);
												entityToSpawn.setYHeadRot(0);
												entityToSpawn.setDeltaMovement(0, 0, 0);
												if (entityToSpawn instanceof Mob _mobToSpawn)
													_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
												world.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												Entity entityToSpawn = new BlockIndicatorEntity3Entity(MineboundModEntities.BLOCK_INDICATOR_ENTITY_3.get(), _level);
												entityToSpawn.moveTo(targetX, targetY, targetZ, 0, 0);
												entityToSpawn.setYBodyRot(0);
												entityToSpawn.setYHeadRot(0);
												entityToSpawn.setDeltaMovement(0, 0, 0);
												if (entityToSpawn instanceof Mob _mobToSpawn)
													_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
												world.addFreshEntity(entityToSpawn);
											}
										}
									}
								}
							} else {
								offsetWidth = 0;
								offsetHeight = 0;
								offsetDepth = 0;
								if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMradiusLevel") >= 1) {
									if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
											.getDirection()) == Direction.DOWN
											|| (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getDirection()) == Direction.UP) {
										if (entity.getX() > targetX) {
											offsetWidth = -1;
										}
										if (entity.getZ() > targetZ) {
											offsetDepth = -1;
										}
										radiusWidth = 2;
										radiusHeight = 1;
										radiusDepth = 2;
									} else if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
											.getDirection()) == Direction.NORTH
											|| (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getDirection()) == Direction.SOUTH) {
										if (entity.getX() > targetX) {
											offsetWidth = -1;
										}
										if (entity.getY() + entity.getBbHeight() / 2 > targetY) {
											offsetHeight = -1;
										}
										radiusWidth = 2;
										radiusHeight = 2;
										radiusDepth = 1;
									} else if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
											.getDirection()) == Direction.WEST
											|| (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getDirection()) == Direction.EAST) {
										if (entity.getY() + entity.getBbHeight() / 2 > targetY) {
											offsetHeight = -1;
										}
										if (entity.getZ() > targetZ) {
											offsetDepth = -1;
										}
										radiusWidth = 1;
										radiusHeight = 2;
										radiusDepth = 2;
									}
								}
								if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMradiusLevel") >= 2) {
									if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
											.getDirection()) == Direction.EAST) {
										offsetWidth = -1;
									} else if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
											.getDirection()) == Direction.UP) {
										offsetHeight = -1;
									} else if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
											.getDirection()) == Direction.SOUTH) {
										offsetDepth = -1;
									}
									radiusWidth = 2;
									radiusHeight = 2;
									radiusDepth = 2;
								}
								if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMradiusLevel") >= 3) {
									if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
											.getDirection()) == Direction.DOWN
											|| (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getDirection()) == Direction.UP) {
										if (entity.getX() < targetX) {
											offsetWidth = -1;
										}
										if (entity.getZ() < targetZ) {
											offsetDepth = -1;
										}
										radiusWidth = 3;
										radiusHeight = 2;
										radiusDepth = 3;
									} else if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
											.getDirection()) == Direction.NORTH
											|| (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getDirection()) == Direction.SOUTH) {
										if (entity.getX() < targetX) {
											offsetWidth = -1;
										}
										if (entity.getY() + entity.getBbHeight() / 2 < targetY) {
											offsetHeight = -1;
										}
										radiusWidth = 3;
										radiusHeight = 3;
										radiusDepth = 2;
									} else if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
											.getDirection()) == Direction.WEST
											|| (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getDirection()) == Direction.EAST) {
										if (entity.getY() + entity.getBbHeight() / 2 < targetY) {
											offsetHeight = -1;
										}
										if (entity.getZ() < targetZ) {
											offsetDepth = -1;
										}
										radiusWidth = 2;
										radiusHeight = 3;
										radiusDepth = 3;
									}
								}
								xPos = offsetWidth;
								for (int index0 = 0; index0 < (int) (radiusWidth); index0++) {
									yPos = offsetHeight;
									for (int index1 = 0; index1 < (int) (radiusHeight); index1++) {
										zPos = offsetDepth;
										for (int index2 = 0; index2 < (int) (radiusDepth); index2++) {
											if (!world.isEmptyBlock(new BlockPos(xPos + targetX, yPos + 0.5 + targetY, zPos + targetZ))
													&& !((world.getBlockState(new BlockPos(xPos + targetX, yPos + 0.5 + targetY, zPos + targetZ))).getBlock() instanceof LiquidBlock)) {
												if (world.getBlockState(new BlockPos(xPos + targetX, yPos + 0.5 + targetY, zPos + targetZ)).getDestroySpeed(world, new BlockPos(xPos + targetX, yPos + 0.5 + targetY, zPos + targetZ)) >= 0) {
													if (!world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ)), 0.2, 0.2, 0.2), e -> true).isEmpty()) {
														if (((Entity) world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ)), 0.2, 0.2, 0.2), e -> true).stream()
																.sorted(new Object() {
																	Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																		return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																	}
																}.compareDistOf((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ))).findFirst().orElse(null)) instanceof LivingEntity _entity)
															_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 2, 0, (false), (false)));
													} else {
														if (world instanceof ServerLevel _level) {
															Entity entityToSpawn = new BlockIndicatorEntity1Entity(MineboundModEntities.BLOCK_INDICATOR_ENTITY_1.get(), _level);
															entityToSpawn.moveTo((xPos + targetX), (yPos + targetY), (zPos + targetZ), 0, 0);
															entityToSpawn.setYBodyRot(0);
															entityToSpawn.setYHeadRot(0);
															entityToSpawn.setDeltaMovement(0, 0, 0);
															if (entityToSpawn instanceof Mob _mobToSpawn)
																_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
															world.addFreshEntity(entityToSpawn);
														}
													}
												} else {
													if (!world.getEntitiesOfClass(BlockIndicatorEntity3Entity.class, AABB.ofSize(new Vec3((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ)), 0.2, 0.2, 0.2), e -> true).isEmpty()) {
														if (((Entity) world.getEntitiesOfClass(BlockIndicatorEntity3Entity.class, AABB.ofSize(new Vec3((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ)), 0.2, 0.2, 0.2), e -> true).stream()
																.sorted(new Object() {
																	Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																		return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																	}
																}.compareDistOf((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ))).findFirst().orElse(null)) instanceof LivingEntity _entity)
															_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 2, 0, (false), (false)));
													} else {
														if (world instanceof ServerLevel _level) {
															Entity entityToSpawn = new BlockIndicatorEntity3Entity(MineboundModEntities.BLOCK_INDICATOR_ENTITY_3.get(), _level);
															entityToSpawn.moveTo((xPos + targetX), (yPos + targetY), (zPos + targetZ), 0, 0);
															entityToSpawn.setYBodyRot(0);
															entityToSpawn.setYHeadRot(0);
															entityToSpawn.setDeltaMovement(0, 0, 0);
															if (entityToSpawn instanceof Mob _mobToSpawn)
																_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
															world.addFreshEntity(entityToSpawn);
														}
													}
												}
											}
											zPos = zPos + 1;
										}
										yPos = yPos + 1;
									}
									xPos = xPos + 1;
								}
							}
						}
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ReturnMMProcedure.execute().getItem()) {
				if (!world.isEmptyBlock(new BlockPos(targetX, targetY, targetZ)) && !((world.getBlockState(new BlockPos(targetX, targetY, targetZ))).getBlock() instanceof LiquidBlock)) {
					if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getDirection()) == Direction.DOWN) {
						targetY = targetY - 1;
					} else if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getDirection()) == Direction.UP) {
						targetY = targetY + 1;
					} else if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getDirection()) == Direction.NORTH) {
						targetZ = targetZ - 1;
					} else if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getDirection()) == Direction.SOUTH) {
						targetZ = targetZ + 1;
					} else if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getDirection()) == Direction.WEST) {
						targetX = targetX - 1;
					} else if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getDirection()) == Direction.EAST) {
						targetX = targetX + 1;
					}
					if (entity.isShiftKeyDown()) {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MineboundModMobEffects.SHIELD_GENERATOR_EFFECT.get()) : false)
								|| !(world.isEmptyBlock(new BlockPos(targetX, targetY, targetZ)) || (world.getBlockState(new BlockPos(targetX, targetY, targetZ))).getBlock() instanceof LiquidBlock)) {
							if (!world.getEntitiesOfClass(BlockIndicatorEntity3Entity.class, AABB.ofSize(new Vec3(targetX, (targetY + 0.5), targetZ), 0.2, 0.2, 0.2), e -> true).isEmpty()) {
								if (((Entity) world.getEntitiesOfClass(BlockIndicatorEntity3Entity.class, AABB.ofSize(new Vec3(targetX, (targetY + 0.5), targetZ), 0.2, 0.2, 0.2), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(targetX, (targetY + 0.5), targetZ)).findFirst().orElse(null)) instanceof LivingEntity _entity)
									_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 2, 0, (false), (false)));
							} else {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = new BlockIndicatorEntity3Entity(MineboundModEntities.BLOCK_INDICATOR_ENTITY_3.get(), _level);
									entityToSpawn.moveTo(targetX, targetY, targetZ, 0, 0);
									entityToSpawn.setYBodyRot(0);
									entityToSpawn.setYHeadRot(0);
									entityToSpawn.setDeltaMovement(0, 0, 0);
									if (entityToSpawn instanceof Mob _mobToSpawn)
										_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
									world.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (!world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3(targetX, (targetY + 0.5), targetZ), 0.2, 0.2, 0.2), e -> true).isEmpty()) {
								if (((Entity) world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3(targetX, (targetY + 0.5), targetZ), 0.2, 0.2, 0.2), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(targetX, (targetY + 0.5), targetZ)).findFirst().orElse(null)) instanceof LivingEntity _entity)
									_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 2, 0, (false), (false)));
							} else {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = new BlockIndicatorEntity1Entity(MineboundModEntities.BLOCK_INDICATOR_ENTITY_1.get(), _level);
									entityToSpawn.moveTo(targetX, targetY, targetZ, 0, 0);
									entityToSpawn.setYBodyRot(0);
									entityToSpawn.setYHeadRot(0);
									entityToSpawn.setDeltaMovement(0, 0, 0);
									if (entityToSpawn instanceof Mob _mobToSpawn)
										_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
									world.addFreshEntity(entityToSpawn);
								}
							}
						}
					} else {
						if (!world.isClientSide()) {
							offsetWidth = 0;
							offsetHeight = 0;
							offsetDepth = 0;
							if (((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
									.getDirection()) == Direction.DOWN
									|| (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
											.getDirection()) == Direction.UP
									|| entity.getXRot() < -45 || entity.getXRot() > 45) && !(entity.getXRot() >= -45 && entity.getXRot() <= 45)) {
								if (entity.getX() > targetX) {
									offsetWidth = -1;
								}
								if (entity.getZ() > targetZ) {
									offsetDepth = -1;
								}
								radiusWidth = 2;
								radiusHeight = 1;
								radiusDepth = 2;
							} else if (entity.getYRot() > -135 && entity.getYRot() < -45 || entity.getYRot() > 45 && entity.getYRot() < 135) {
								if (entity.getY() + entity.getBbHeight() / 2 > targetY) {
									offsetHeight = 0;
								}
								if (entity.getZ() > targetZ) {
									offsetDepth = -1;
								}
								radiusWidth = 1;
								radiusHeight = 2;
								radiusDepth = 2;
							} else {
								if (entity.getX() > targetX) {
									offsetWidth = -1;
								}
								if (entity.getY() + entity.getBbHeight() / 2 > targetY) {
									offsetHeight = 0;
								}
								radiusWidth = 2;
								radiusHeight = 2;
								radiusDepth = 1;
							}
							xPos = offsetWidth;
							for (int index3 = 0; index3 < (int) (radiusWidth); index3++) {
								yPos = offsetHeight;
								for (int index4 = 0; index4 < (int) (radiusHeight); index4++) {
									zPos = offsetDepth;
									for (int index5 = 0; index5 < (int) (radiusDepth); index5++) {
										if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MineboundModMobEffects.SHIELD_GENERATOR_EFFECT.get()) : false)
												|| !(world.isEmptyBlock(new BlockPos(xPos + targetX, yPos + 0.5 + targetY, zPos + targetZ))
														|| (world.getBlockState(new BlockPos(xPos + targetX, yPos + 0.5 + targetY, zPos + targetZ))).getBlock() instanceof LiquidBlock)) {
											if (!world.getEntitiesOfClass(BlockIndicatorEntity3Entity.class, AABB.ofSize(new Vec3((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ)), 0.2, 0.2, 0.2), e -> true).isEmpty()) {
												if (((Entity) world.getEntitiesOfClass(BlockIndicatorEntity3Entity.class, AABB.ofSize(new Vec3((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ)), 0.2, 0.2, 0.2), e -> true).stream()
														.sorted(new Object() {
															Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
															}
														}.compareDistOf((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ))).findFirst().orElse(null)) instanceof LivingEntity _entity)
													_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 2, 0, (false), (false)));
											} else {
												if (world instanceof ServerLevel _level) {
													Entity entityToSpawn = new BlockIndicatorEntity3Entity(MineboundModEntities.BLOCK_INDICATOR_ENTITY_3.get(), _level);
													entityToSpawn.moveTo((xPos + targetX), (yPos + targetY), (zPos + targetZ), 0, 0);
													entityToSpawn.setYBodyRot(0);
													entityToSpawn.setYHeadRot(0);
													entityToSpawn.setDeltaMovement(0, 0, 0);
													if (entityToSpawn instanceof Mob _mobToSpawn)
														_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
													world.addFreshEntity(entityToSpawn);
												}
											}
										} else {
											if (!world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ)), 0.2, 0.2, 0.2), e -> true).isEmpty()) {
												if (((Entity) world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ)), 0.2, 0.2, 0.2), e -> true).stream()
														.sorted(new Object() {
															Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
															}
														}.compareDistOf((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ))).findFirst().orElse(null)) instanceof LivingEntity _entity)
													_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 2, 0, (false), (false)));
											} else {
												if (world instanceof ServerLevel _level) {
													Entity entityToSpawn = new BlockIndicatorEntity1Entity(MineboundModEntities.BLOCK_INDICATOR_ENTITY_1.get(), _level);
													entityToSpawn.moveTo((xPos + targetX), (yPos + targetY), (zPos + targetZ), 0, 0);
													entityToSpawn.setYBodyRot(0);
													entityToSpawn.setYHeadRot(0);
													entityToSpawn.setDeltaMovement(0, 0, 0);
													if (entityToSpawn instanceof Mob _mobToSpawn)
														_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
													world.addFreshEntity(entityToSpawn);
												}
											}
										}
										zPos = zPos + 1;
									}
									yPos = yPos + 1;
								}
								xPos = xPos + 1;
							}
						}
					}
				}
			}
		}
	}
}
