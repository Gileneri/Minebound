package net.mcreator.test.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.test.init.TestModMobEffects;
import net.mcreator.test.init.TestModBlocks;
import net.mcreator.test.entity.BlockIndicatorEntity2Entity;
import net.mcreator.test.entity.BlockIndicatorEntity1Entity;

import java.util.Comparator;

public class MMOnRightClickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double raytraceDistance = 0;
		double targetX = 0;
		double targetY = 0;
		double targetZ = 0;
		double zPos = 0;
		double yPos = 0;
		double xPos = 0;
		double powerMultiplier = 0;
		double radiusHeight = 0;
		double radiusWidth = 0;
		double offsetWidth = 0;
		double offsetHeight = 0;
		double radiusDepth = 0;
		double offsetDepth = 0;
		powerMultiplier = 0.455;
		raytraceDistance = 10 + itemstack.getOrCreateTag().getDouble("MMrangeLevel") * 2;
		targetX = entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX() + 0.5;
		targetY = entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY();
		targetZ = entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ() + 0.5;
		if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(TestModMobEffects.SHIELD_GENERATOR_EFFECT.get()) : false)) {
			if (itemstack.getOrCreateTag().getDouble("MMmodeEnabled") == 3) {
				MMExamineProcedureProcedure.execute(entity);
			} else if (itemstack.getOrCreateTag().getBoolean("hasMMliquidUpgrade") == true && entity.isShiftKeyDown() && !(itemstack.getOrCreateTag().getDouble("MMmodeEnabled") == 2)) {
				if (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
						.getType() == HitResult.Type.BLOCK) {
					targetX = entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
							.getBlockPos().getX() + 0.5;
					targetY = entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
							.getBlockPos().getY();
					targetZ = entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
							.getBlockPos().getZ() + 0.5;
					if (itemstack.getOrCreateTag().getDouble("MMmodeEnabled") == 0) {
						if ((world.getFluidState(new BlockPos(targetX, targetY, targetZ)).createLegacyBlock()).getBlock() instanceof LiquidBlock) {
							if ((world.getFluidState(new BlockPos(targetX, targetY, targetZ)).createLegacyBlock()).getBlock() == Blocks.WATER) {
								for (int index0 = 0; index0 < (int) (4); index0++) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.OAK_BUTTON));
										entityToSpawn.setPickUpDelay(0);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if ((world.getFluidState(new BlockPos(targetX, targetY, targetZ)).createLegacyBlock()).getBlock() == Blocks.LAVA) {
								for (int index1 = 0; index1 < (int) (4); index1++) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.ACACIA_BUTTON));
										entityToSpawn.setPickUpDelay(0);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if ((world.getFluidState(new BlockPos(targetX, targetY, targetZ)).createLegacyBlock()).getBlock() == TestModBlocks.POISON.get()) {
								for (int index2 = 0; index2 < (int) (4); index2++) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.WARPED_BUTTON));
										entityToSpawn.setPickUpDelay(0);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
							world.levelEvent(2001, new BlockPos(targetX, targetY, targetZ), Block.getId((world.getFluidState(new BlockPos(targetX, targetY, targetZ)).createLegacyBlock())));
							world.setBlock(new BlockPos(targetX, targetY, targetZ), Blocks.AIR.defaultBlockState(), 3);
						} else {
							if (!world.isEmptyBlock(new BlockPos(targetX, targetY, targetZ))) {
								if (!world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3(targetX, targetY, targetZ), 0.2, 0.2, 0.2), e -> true).isEmpty()) {
									if (((Entity) world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3(targetX, targetY, targetZ), 0.2, 0.2, 0.2), e -> true).stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(targetX, targetY, targetZ)).findFirst().orElse(null)).getPersistentData().getDouble("MMminingProgress") <= 0) {
										if (world.getBlockState(new BlockPos(targetX, targetY, targetZ)).getDestroySpeed(world, new BlockPos(targetX, targetY, targetZ)) < 20) {
											((Entity) world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3(targetX, targetY, targetZ), 0.2, 0.2, 0.2), e -> true).stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
												}
											}.compareDistOf(targetX, targetY, targetZ)).findFirst().orElse(null)).getPersistentData().putDouble("MMminingProgress",
													(world.getBlockState(new BlockPos(targetX, targetY, targetZ)).getDestroySpeed(world, new BlockPos(targetX, targetY, targetZ))));
										} else {
											((Entity) world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3(targetX, targetY, targetZ), 0.2, 0.2, 0.2), e -> true).stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
												}
											}.compareDistOf(targetX, targetY, targetZ)).findFirst().orElse(null)).getPersistentData().putDouble("MMminingProgress",
													(16 + world.getBlockState(new BlockPos(targetX, targetY, targetZ)).getDestroySpeed(world, new BlockPos(targetX, targetY, targetZ)) / 5));
										}
									} else {
										((Entity) world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3(targetX, targetY, targetZ), 0.2, 0.2, 0.2), e -> true).stream().sorted(new Object() {
											Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
												return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
											}
										}.compareDistOf(targetX, targetY, targetZ)).findFirst().orElse(null)).getPersistentData().putDouble("MMminingProgress",
												(((Entity) world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3(targetX, targetY, targetZ), 0.2, 0.2, 0.2), e -> true).stream().sorted(new Object() {
													Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
														return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
													}
												}.compareDistOf(targetX, targetY, targetZ)).findFirst().orElse(null)).getPersistentData().getDouble("MMminingProgress") - (itemstack.getOrCreateTag().getDouble("MMpowerLevel") + 1) * powerMultiplier));
										if (((Entity) world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3(targetX, targetY, targetZ), 0.2, 0.2, 0.2), e -> true).stream().sorted(new Object() {
											Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
												return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
											}
										}.compareDistOf(targetX, targetY, targetZ)).findFirst().orElse(null)).getPersistentData().getDouble("MMminingProgress") > 0) {
											if (world instanceof Level _level) {
												if (!_level.isClientSide()) {
													_level.playSound(null, new BlockPos(targetX, targetY, targetZ), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.step")), SoundSource.BLOCKS, 1, 1);
												} else {
													_level.playLocalSound(targetX, targetY, targetZ, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.step")), SoundSource.BLOCKS, 1, 1, false);
												}
											}
											world.levelEvent(2001, new BlockPos(targetX, targetY, targetZ), Block.getId((world.getFluidState(new BlockPos(targetX, targetY, targetZ)).createLegacyBlock())));
										} else {
											{
												BlockPos _pos = new BlockPos(targetX, targetY, targetZ);
												Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
												world.destroyBlock(_pos, false);
											}
										}
									}
								}
							}
						}
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
					} else if (itemstack.getOrCreateTag().getDouble("MMmodeEnabled") == 1) {
						MMPaintingProcedureProcedure.execute(world, targetX, targetY, targetZ, entity);
					}
				}
			} else {
				if (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
						.getType() == HitResult.Type.BLOCK) {
					if (itemstack.getOrCreateTag().getDouble("MMradiusLevel") < 1 || entity.isShiftKeyDown() || itemstack.getOrCreateTag().getDouble("MMmodeEnabled") == 2) {
						if (!world.isEmptyBlock(new BlockPos(targetX, targetY, targetZ))) {
							if (!world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3(targetX, targetY, targetZ), 0.2, 0.2, 0.2), e -> true).isEmpty()
									&& (itemstack.getOrCreateTag().getDouble("MMmodeEnabled") == 0 || itemstack.getOrCreateTag().getDouble("MMmodeEnabled") == 1)) {
								if (itemstack.getOrCreateTag().getDouble("MMmodeEnabled") == 0) {
									if (((Entity) world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3(targetX, targetY, targetZ), 0.2, 0.2, 0.2), e -> true).stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(targetX, targetY, targetZ)).findFirst().orElse(null)).getPersistentData().getDouble("MMminingProgress") <= 0) {
										if (world.getBlockState(new BlockPos(targetX, targetY, targetZ)).getDestroySpeed(world, new BlockPos(targetX, targetY, targetZ)) < 20) {
											((Entity) world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3(targetX, targetY, targetZ), 0.2, 0.2, 0.2), e -> true).stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
												}
											}.compareDistOf(targetX, targetY, targetZ)).findFirst().orElse(null)).getPersistentData().putDouble("MMminingProgress",
													(world.getBlockState(new BlockPos(targetX, targetY, targetZ)).getDestroySpeed(world, new BlockPos(targetX, targetY, targetZ))));
										} else {
											((Entity) world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3(targetX, targetY, targetZ), 0.2, 0.2, 0.2), e -> true).stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
												}
											}.compareDistOf(targetX, targetY, targetZ)).findFirst().orElse(null)).getPersistentData().putDouble("MMminingProgress",
													(16 + world.getBlockState(new BlockPos(targetX, targetY, targetZ)).getDestroySpeed(world, new BlockPos(targetX, targetY, targetZ)) / 5));
										}
									} else {
										((Entity) world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3(targetX, targetY, targetZ), 0.2, 0.2, 0.2), e -> true).stream().sorted(new Object() {
											Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
												return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
											}
										}.compareDistOf(targetX, targetY, targetZ)).findFirst().orElse(null)).getPersistentData().putDouble("MMminingProgress",
												(((Entity) world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3(targetX, targetY, targetZ), 0.2, 0.2, 0.2), e -> true).stream().sorted(new Object() {
													Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
														return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
													}
												}.compareDistOf(targetX, targetY, targetZ)).findFirst().orElse(null)).getPersistentData().getDouble("MMminingProgress") - (itemstack.getOrCreateTag().getDouble("MMpowerLevel") + 1) * powerMultiplier));
										if (((Entity) world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3(targetX, targetY, targetZ), 0.2, 0.2, 0.2), e -> true).stream().sorted(new Object() {
											Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
												return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
											}
										}.compareDistOf(targetX, targetY, targetZ)).findFirst().orElse(null)).getPersistentData().getDouble("MMminingProgress") > 0) {
											if (world instanceof Level _level) {
												if (!_level.isClientSide()) {
													_level.playSound(null, new BlockPos(targetX, targetY, targetZ), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.step")), SoundSource.BLOCKS, 1, 1);
												} else {
													_level.playLocalSound(targetX, targetY, targetZ, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.step")), SoundSource.BLOCKS, 1, 1, false);
												}
											}
											world.levelEvent(2001, new BlockPos(targetX, targetY, targetZ), Block.getId((world.getFluidState(new BlockPos(targetX, targetY, targetZ)).createLegacyBlock())));
										} else {
											{
												BlockPos _pos = new BlockPos(targetX, targetY, targetZ);
												Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
												world.destroyBlock(_pos, false);
											}
										}
									}
								} else if (itemstack.getOrCreateTag().getDouble("MMmodeEnabled") == 1) {
									MMPaintingProcedureProcedure.execute(world, targetX, targetY, targetZ, entity);
								}
							} else if (itemstack.getOrCreateTag().getDouble("MMmodeEnabled") == 2 && !world.getEntitiesOfClass(BlockIndicatorEntity2Entity.class, AABB.ofSize(new Vec3(targetX, targetY, targetZ), 0.2, 0.2, 0.2), e -> true).isEmpty()) {
								MMWiringProcedureProcedure.execute(world, targetX, targetY, targetZ, entity, itemstack);
							}
						}
					} else {
						offsetWidth = 0;
						offsetHeight = 0;
						offsetDepth = 0;
						if (itemstack.getOrCreateTag().getDouble("MMradiusLevel") >= 1) {
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
						if (itemstack.getOrCreateTag().getDouble("MMradiusLevel") >= 2) {
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
						if (itemstack.getOrCreateTag().getDouble("MMradiusLevel") >= 3) {
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
						for (int index3 = 0; index3 < (int) (radiusWidth); index3++) {
							yPos = offsetHeight;
							for (int index4 = 0; index4 < (int) (radiusHeight); index4++) {
								zPos = offsetDepth;
								for (int index5 = 0; index5 < (int) (radiusDepth); index5++) {
									if (!world.isEmptyBlock(new BlockPos(xPos + targetX, yPos + 0.5 + targetY, zPos + targetZ))
											&& !((world.getBlockState(new BlockPos(xPos + targetX, yPos + 0.5 + targetY, zPos + targetZ))).getBlock() instanceof LiquidBlock)) {
										if (!world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ)), 0.2, 0.2, 0.2), e -> true).isEmpty()) {
											if (itemstack.getOrCreateTag().getDouble("MMmodeEnabled") == 0) {
												if (((Entity) world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ)), 0.2, 0.2, 0.2), e -> true).stream()
														.sorted(new Object() {
															Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
															}
														}.compareDistOf((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ))).findFirst().orElse(null)).getPersistentData().getDouble("MMminingProgress") <= 0) {
													if (world.getBlockState(new BlockPos(xPos + targetX, yPos + 0.5 + targetY, zPos + targetZ)).getDestroySpeed(world, new BlockPos(xPos + targetX, yPos + 0.5 + targetY, zPos + targetZ)) < 20) {
														((Entity) world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ)), 0.2, 0.2, 0.2), e -> true).stream()
																.sorted(new Object() {
																	Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																		return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																	}
																}.compareDistOf((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ))).findFirst().orElse(null)).getPersistentData().putDouble("MMminingProgress", (world
																		.getBlockState(new BlockPos(xPos + targetX, yPos + 0.5 + targetY, zPos + targetZ)).getDestroySpeed(world, new BlockPos(xPos + targetX, yPos + 0.5 + targetY, zPos + targetZ))));
													} else {
														((Entity) world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ)), 0.2, 0.2, 0.2), e -> true).stream()
																.sorted(new Object() {
																	Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																		return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																	}
																}.compareDistOf((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ))).findFirst().orElse(null)).getPersistentData()
																.putDouble("MMminingProgress", (16 + world.getBlockState(new BlockPos(xPos + targetX, yPos + 0.5 + targetY, zPos + targetZ)).getDestroySpeed(world,
																		new BlockPos(xPos + targetX, yPos + 0.5 + targetY, zPos + targetZ)) / 5));
													}
												} else {
													((Entity) world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ)), 0.2, 0.2, 0.2), e -> true).stream()
															.sorted(new Object() {
																Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																	return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																}
															}.compareDistOf((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ))).findFirst().orElse(null)).getPersistentData().putDouble("MMminingProgress",
																	(((Entity) world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ)), 0.2, 0.2, 0.2), e -> true)
																			.stream().sorted(new Object() {
																				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																				}
																			}.compareDistOf((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ))).findFirst().orElse(null)).getPersistentData().getDouble("MMminingProgress")
																			- (itemstack.getOrCreateTag().getDouble("MMpowerLevel") + 1) * powerMultiplier));
													if (((Entity) world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ)), 0.2, 0.2, 0.2), e -> true).stream()
															.sorted(new Object() {
																Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																	return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																}
															}.compareDistOf((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ))).findFirst().orElse(null)).getPersistentData().getDouble("MMminingProgress") > 0) {
														if (world instanceof Level _level) {
															if (!_level.isClientSide()) {
																_level.playSound(null, new BlockPos(xPos + targetX, yPos + 0.5 + targetY, zPos + targetZ), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.step")),
																		SoundSource.BLOCKS, 1, 1);
															} else {
																_level.playLocalSound((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.step")), SoundSource.BLOCKS, 1,
																		1, false);
															}
														}
														world.levelEvent(2001, new BlockPos(xPos + targetX, yPos + 0.5 + targetY, zPos + targetZ),
																Block.getId((world.getBlockState(new BlockPos(xPos + targetX, yPos + 0.5 + targetY, zPos + targetZ)))));
													} else {
														{
															BlockPos _pos = new BlockPos(xPos + targetX, yPos + 0.5 + targetY, zPos + targetZ);
															Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
															world.destroyBlock(_pos, false);
														}
													}
												}
											} else if (itemstack.getOrCreateTag().getDouble("MMmodeEnabled") == 1) {
												MMPaintingProcedureProcedure.execute(world, (xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ), entity);
											} else if (itemstack.getOrCreateTag().getDouble("MMmodeEnabled") == 2) {
												MMWiringProcedureProcedure.execute(world, (xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ), entity, itemstack);
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
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
				}
			}
		}
	}
}
