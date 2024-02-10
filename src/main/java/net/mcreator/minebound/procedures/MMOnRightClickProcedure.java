package net.mcreator.minebound.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.Minecraft;

import net.mcreator.minebound.init.MineboundModMobEffects;
import net.mcreator.minebound.init.MineboundModBlocks;
import net.mcreator.minebound.entity.BlockIndicatorEntity2Entity;
import net.mcreator.minebound.entity.BlockIndicatorEntity1Entity;

import javax.annotation.Nullable;

import java.util.Comparator;

@Mod.EventBusSubscriber
public class MMOnRightClickProcedure {
	@SubscribeEvent
	public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
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
		boolean workingBool = false;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ReturnMMProcedure.execute().getItem()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ReturnMMProcedure.execute().getItem()) {
			if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MineboundModMobEffects.SHIELD_GENERATOR_EFFECT.get()) : false)) {
				powerMultiplier = 0.455;
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
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMmodeEnabled") == 3) {
						MMExamineProcedureProcedure.execute(entity);
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
							if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMmodeEnabled") == 0) {
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
									} else if ((world.getFluidState(new BlockPos(targetX, targetY, targetZ)).createLegacyBlock()).getBlock() == MineboundModBlocks.POISON.get()) {
										for (int index2 = 0; index2 < (int) (4); index2++) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.WARPED_BUTTON));
												entityToSpawn.setPickUpDelay(0);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									}
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(targetX, targetY, targetZ), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												("particle minecraft:block " + ForgeRegistries.BLOCKS.getKey((world.getFluidState(new BlockPos(targetX, targetY, targetZ)).createLegacyBlock()).getBlock()).toString()
														+ " ~ ~0.5 ~ 0.5 0.5 0.5 1 3 normal"));
									world.setBlock(new BlockPos(targetX, targetY, targetZ), Blocks.AIR.defaultBlockState(), 3);
								} else {
									if (!world.isEmptyBlock(new BlockPos(targetX, targetY, targetZ))) {
										if (!world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3(targetX, targetY, targetZ), 0.2, 0.2, 0.2), e -> true).isEmpty()
												&& world.getBlockState(new BlockPos(targetX, targetY, targetZ)).getDestroySpeed(world, new BlockPos(targetX, targetY, targetZ)) >= 0) {
											if (((Entity) world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3(targetX, targetY, targetZ), 0.2, 0.2, 0.2), e -> true).stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
												}
											}.compareDistOf(targetX, targetY, targetZ)).findFirst().orElse(null)).getPersistentData().getDouble("MMminingProgress") <= 0
													&& world.getBlockState(new BlockPos(targetX, targetY, targetZ)).getDestroySpeed(world, new BlockPos(targetX, targetY, targetZ)) > 0) {
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
														}.compareDistOf(targetX, targetY, targetZ)).findFirst().orElse(null)).getPersistentData().getDouble("MMminingProgress")
																- ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMpowerLevel") + 1) * powerMultiplier));
											}
											if (((Entity) world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3(targetX, targetY, targetZ), 0.2, 0.2, 0.2), e -> true).stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
												}
											}.compareDistOf(targetX, targetY, targetZ)).findFirst().orElse(null)).getPersistentData().getDouble("MMminingProgress") > 0) {
												if (world instanceof ServerLevel _level)
													_level.getServer().getCommands().performPrefixedCommand(
															new CommandSourceStack(CommandSource.NULL, new Vec3(targetX, targetY, targetZ), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
															("particle minecraft:block " + ForgeRegistries.BLOCKS.getKey((world.getBlockState(new BlockPos(targetX, targetY, targetZ))).getBlock()).toString() + " ~ ~0.5 ~ 0.5 0.5 0.5 1 3 normal"));
												if (world instanceof Level _level) {
													if (!_level.isClientSide()) {
														_level.playSound(null, new BlockPos(targetX, targetY, targetZ), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.step")), SoundSource.BLOCKS, 1,
																(float) Mth.nextDouble(RandomSource.create(), 0.95, 1.05));
													} else {
														_level.playLocalSound(targetX, targetY, targetZ, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.step")), SoundSource.BLOCKS, 1,
																(float) Mth.nextDouble(RandomSource.create(), 0.95, 1.05), false);
													}
												}
											} else {
												if (world instanceof ServerLevel _level)
													_level.getServer().getCommands().performPrefixedCommand(
															new CommandSourceStack(CommandSource.NULL, new Vec3(targetX, targetY, targetZ), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
															("particle minecraft:block " + ForgeRegistries.BLOCKS.getKey((world.getBlockState(new BlockPos(targetX, targetY, targetZ))).getBlock()).toString() + " ~ ~0.5 ~ 0.5 0.5 0.5 1 10 normal"));
												if (world instanceof Level _level) {
													if (!_level.isClientSide()) {
														_level.playSound(null, new BlockPos(targetX, targetY, targetZ), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.break")), SoundSource.BLOCKS, 1,
																(float) Mth.nextDouble(RandomSource.create(), 0.95, 1.05));
													} else {
														_level.playLocalSound(targetX, targetY, targetZ, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.break")), SoundSource.BLOCKS, 1,
																(float) Mth.nextDouble(RandomSource.create(), 0.95, 1.05), false);
													}
												}
												BlockPos _pos = new BlockPos(targetX, targetY, targetZ);
												Block.dropResources(world.getBlockState(_pos), world, new BlockPos(targetX, targetY, targetZ), null);
												world.setBlock(new BlockPos(targetX, targetY, targetZ), Blocks.AIR.defaultBlockState(), 3);
											}
										}
									}
								}
								if (entity instanceof LivingEntity _entity)
									_entity.swing(InteractionHand.MAIN_HAND, true);
							} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMmodeEnabled") == 1) {
								MMPaintingProcedureProcedure.execute(world, targetX, targetY, targetZ, entity);
							}
						}
					} else {
						if (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
								.getType() == HitResult.Type.BLOCK) {
							if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMradiusLevel") < 1 || entity.isShiftKeyDown()
									|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMmodeEnabled") == 2) {
								if (!world.isEmptyBlock(new BlockPos(targetX, targetY, targetZ))) {
									if (!world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3(targetX, targetY, targetZ), 0.2, 0.2, 0.2), e -> true).isEmpty()
											&& world.getBlockState(new BlockPos(targetX, targetY, targetZ)).getDestroySpeed(world, new BlockPos(targetX, targetY, targetZ)) >= 0
											&& ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMmodeEnabled") == 0
													|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMmodeEnabled") == 1)) {
										if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMmodeEnabled") == 0) {
											if (((Entity) world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3(targetX, targetY, targetZ), 0.2, 0.2, 0.2), e -> true).stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
												}
											}.compareDistOf(targetX, targetY, targetZ)).findFirst().orElse(null)).getPersistentData().getDouble("MMminingProgress") <= 0
													&& world.getBlockState(new BlockPos(targetX, targetY, targetZ)).getDestroySpeed(world, new BlockPos(targetX, targetY, targetZ)) > 0) {
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
														}.compareDistOf(targetX, targetY, targetZ)).findFirst().orElse(null)).getPersistentData().getDouble("MMminingProgress")
																- ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMpowerLevel") + 1) * powerMultiplier));
											}
											if (((Entity) world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3(targetX, targetY, targetZ), 0.2, 0.2, 0.2), e -> true).stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
												}
											}.compareDistOf(targetX, targetY, targetZ)).findFirst().orElse(null)).getPersistentData().getDouble("MMminingProgress") > 0) {
												if (world instanceof ServerLevel _level)
													_level.getServer().getCommands().performPrefixedCommand(
															new CommandSourceStack(CommandSource.NULL, new Vec3(targetX, targetY, targetZ), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
															("particle minecraft:block " + ForgeRegistries.BLOCKS.getKey((world.getBlockState(new BlockPos(targetX, targetY, targetZ))).getBlock()).toString() + " ~ ~0.5 ~ 0.5 0.5 0.5 1 3 normal"));
												if (world instanceof Level _level) {
													if (!_level.isClientSide()) {
														_level.playSound(null, new BlockPos(targetX, targetY, targetZ), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.step")), SoundSource.BLOCKS, 1,
																(float) Mth.nextDouble(RandomSource.create(), 0.95, 1.05));
													} else {
														_level.playLocalSound(targetX, targetY, targetZ, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.step")), SoundSource.BLOCKS, 1,
																(float) Mth.nextDouble(RandomSource.create(), 0.95, 1.05), false);
													}
												}
											} else {
												if (world instanceof ServerLevel _level)
													_level.getServer().getCommands().performPrefixedCommand(
															new CommandSourceStack(CommandSource.NULL, new Vec3(targetX, targetY, targetZ), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
															("particle minecraft:block " + ForgeRegistries.BLOCKS.getKey((world.getBlockState(new BlockPos(targetX, targetY, targetZ))).getBlock()).toString() + " ~ ~0.5 ~ 0.5 0.5 0.5 1 10 normal"));
												if (world instanceof Level _level) {
													if (!_level.isClientSide()) {
														_level.playSound(null, new BlockPos(targetX, targetY, targetZ), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.break")), SoundSource.BLOCKS, 1,
																(float) Mth.nextDouble(RandomSource.create(), 0.95, 1.05));
													} else {
														_level.playLocalSound(targetX, targetY, targetZ, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.break")), SoundSource.BLOCKS, 1,
																(float) Mth.nextDouble(RandomSource.create(), 0.95, 1.05), false);
													}
												}
												BlockPos _pos = new BlockPos(targetX, targetY, targetZ);
												Block.dropResources(world.getBlockState(_pos), world, new BlockPos(targetX, targetY, targetZ), null);
												world.setBlock(new BlockPos(targetX, targetY, targetZ), Blocks.AIR.defaultBlockState(), 3);
											}
										} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMmodeEnabled") == 1) {
											MMPaintingProcedureProcedure.execute(world, targetX, targetY, targetZ, entity);
										}
									} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMmodeEnabled") == 2
											&& !world.getEntitiesOfClass(BlockIndicatorEntity2Entity.class, AABB.ofSize(new Vec3(targetX, targetY, targetZ), 0.2, 0.2, 0.2), e -> true).isEmpty()) {
										MMWiringProcedureProcedure.execute(world, targetX, targetY, targetZ, entity);
									}
								}
							} else {
								workingBool = false;
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
								for (int index3 = 0; index3 < (int) (radiusWidth); index3++) {
									yPos = offsetHeight;
									for (int index4 = 0; index4 < (int) (radiusHeight); index4++) {
										zPos = offsetDepth;
										for (int index5 = 0; index5 < (int) (radiusDepth); index5++) {
											if (!world.isEmptyBlock(new BlockPos(xPos + targetX, yPos + 0.5 + targetY, zPos + targetZ))
													&& !((world.getBlockState(new BlockPos(xPos + targetX, yPos + 0.5 + targetY, zPos + targetZ))).getBlock() instanceof LiquidBlock)) {
												if (!world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ)), 0.2, 0.2, 0.2), e -> true).isEmpty()
														&& world.getBlockState(new BlockPos(xPos + targetX, yPos + 0.5 + targetY, zPos + targetZ)).getDestroySpeed(world, new BlockPos(xPos + targetX, yPos + 0.5 + targetY, zPos + targetZ)) >= 0) {
													if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMmodeEnabled") == 0) {
														if (((Entity) world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ)), 0.2, 0.2, 0.2), e -> true).stream()
																.sorted(new Object() {
																	Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																		return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																	}
																}.compareDistOf((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ))).findFirst().orElse(null)).getPersistentData().getDouble("MMminingProgress") <= 0
																&& world.getBlockState(new BlockPos(xPos + targetX, yPos + 0.5 + targetY, zPos + targetZ)).getDestroySpeed(world,
																		new BlockPos(xPos + targetX, yPos + 0.5 + targetY, zPos + targetZ)) > 0) {
															if (world.getBlockState(new BlockPos(xPos + targetX, yPos + 0.5 + targetY, zPos + targetZ)).getDestroySpeed(world, new BlockPos(xPos + targetX, yPos + 0.5 + targetY, zPos + targetZ)) < 20) {
																((Entity) world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ)), 0.2, 0.2, 0.2), e -> true)
																		.stream().sorted(new Object() {
																			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																				return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																			}
																		}.compareDistOf((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ))).findFirst().orElse(null)).getPersistentData()
																		.putDouble("MMminingProgress", (world.getBlockState(new BlockPos(xPos + targetX, yPos + 0.5 + targetY, zPos + targetZ)).getDestroySpeed(world,
																				new BlockPos(xPos + targetX, yPos + 0.5 + targetY, zPos + targetZ))));
															} else {
																((Entity) world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ)), 0.2, 0.2, 0.2), e -> true)
																		.stream().sorted(new Object() {
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
																			(((Entity) world
																					.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ)), 0.2, 0.2, 0.2), e -> true)
																					.stream().sorted(new Object() {
																						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																						}
																					}.compareDistOf((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ))).findFirst().orElse(null)).getPersistentData().getDouble("MMminingProgress")
																					- ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMpowerLevel") + 1) * powerMultiplier));
														}
														if (((Entity) world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ)), 0.2, 0.2, 0.2), e -> true).stream()
																.sorted(new Object() {
																	Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																		return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																	}
																}.compareDistOf((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ))).findFirst().orElse(null)).getPersistentData().getDouble("MMminingProgress") > 0) {
															if (world instanceof ServerLevel _level)
																_level.getServer().getCommands().performPrefixedCommand(
																		new CommandSourceStack(CommandSource.NULL, new Vec3((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ)), Vec2.ZERO, _level, 4, "", Component.literal(""),
																				_level.getServer(), null).withSuppressedOutput(),
																		("particle minecraft:block " + ForgeRegistries.BLOCKS.getKey((world.getBlockState(new BlockPos(xPos + targetX, yPos + 0.5 + targetY, zPos + targetZ))).getBlock()).toString()
																				+ " ~ ~0.5 ~ 0.5 0.5 0.5 1 3 normal"));
															if (world instanceof Level _level) {
																if (!_level.isClientSide()) {
																	_level.playSound(null, new BlockPos(xPos + targetX, yPos + 0.5 + targetY, zPos + targetZ), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.step")),
																			SoundSource.BLOCKS, 1, (float) Mth.nextDouble(RandomSource.create(), 0.95, 1.05));
																} else {
																	_level.playLocalSound((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.step")), SoundSource.BLOCKS,
																			1, (float) Mth.nextDouble(RandomSource.create(), 0.95, 1.05), false);
																}
															}
														} else {
															if (world instanceof ServerLevel _level)
																_level.getServer().getCommands().performPrefixedCommand(
																		new CommandSourceStack(CommandSource.NULL, new Vec3((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ)), Vec2.ZERO, _level, 4, "", Component.literal(""),
																				_level.getServer(), null).withSuppressedOutput(),
																		("particle minecraft:block " + ForgeRegistries.BLOCKS.getKey((world.getBlockState(new BlockPos(xPos + targetX, yPos + 0.5 + targetY, zPos + targetZ))).getBlock()).toString()
																				+ " ~ ~0.5 ~ 0.5 0.5 0.5 1 10 normal"));
															if (world instanceof Level _level) {
																if (!_level.isClientSide()) {
																	_level.playSound(null, new BlockPos(xPos + targetX, yPos + 0.5 + targetY, zPos + targetZ), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.break")),
																			SoundSource.BLOCKS, 1, (float) Mth.nextDouble(RandomSource.create(), 0.95, 1.05));
																} else {
																	_level.playLocalSound((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.break")),
																			SoundSource.BLOCKS, 1, (float) Mth.nextDouble(RandomSource.create(), 0.95, 1.05), false);
																}
															}
															BlockPos _pos = new BlockPos(xPos + targetX, yPos + 0.5 + targetY, zPos + targetZ);
															Block.dropResources(world.getBlockState(_pos), world, new BlockPos(targetX, targetY, targetZ), null);
															world.setBlock(new BlockPos(xPos + targetX, yPos + 0.5 + targetY, zPos + targetZ), Blocks.AIR.defaultBlockState(), 3);
														}
													} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMmodeEnabled") == 1) {
														MMPaintingProcedureProcedure.execute(world, (xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ), entity);
													} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMmodeEnabled") == 2) {
														MMWiringProcedureProcedure.execute(world, (xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ), entity);
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
							if (world.isEmptyBlock(new BlockPos(targetX, targetY, targetZ)) || (world.getBlockState(new BlockPos(targetX, targetY, targetZ))).getBlock() instanceof LiquidBlock) {
								world.setBlock(new BlockPos(targetX, targetY, targetZ),
										((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()), 3);
								if (!(new Object() {
									public boolean checkGamemode(Entity _ent) {
										if (_ent instanceof ServerPlayer _serverPlayer) {
											return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
										} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
											return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
													&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
										}
										return false;
									}
								}.checkGamemode(entity))) {
									((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
								}
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, new BlockPos(targetX, targetY, targetZ), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.BLOCKS, 1,
												(float) Mth.nextDouble(RandomSource.create(), 0.95, 1.05));
									} else {
										_level.playLocalSound(targetX, targetY, targetZ, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.BLOCKS, 1,
												(float) Mth.nextDouble(RandomSource.create(), 0.95, 1.05), false);
									}
								}
								if (entity instanceof LivingEntity _entity)
									_entity.swing(InteractionHand.OFF_HAND, true);
							}
						} else {
							if (!world.isClientSide()) {
								workingBool = false;
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
								for (int index6 = 0; index6 < (int) (radiusWidth); index6++) {
									yPos = offsetHeight;
									for (int index7 = 0; index7 < (int) (radiusHeight); index7++) {
										zPos = offsetDepth;
										for (int index8 = 0; index8 < (int) (radiusDepth); index8++) {
											if (!world.getEntitiesOfClass(BlockIndicatorEntity1Entity.class, AABB.ofSize(new Vec3((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ)), 0.2, 0.2, 0.2), e -> true).isEmpty()) {
												world.setBlock(new BlockPos(xPos + targetX, yPos + 0.5 + targetY, zPos + targetZ),
														((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()),
														3);
												((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
												if (world instanceof Level _level) {
													if (!_level.isClientSide()) {
														_level.playSound(null, new BlockPos(xPos + targetX, yPos + 0.5 + targetY, zPos + targetZ), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.BLOCKS,
																1, (float) Mth.nextDouble(RandomSource.create(), 0.95, 1.05));
													} else {
														_level.playLocalSound((xPos + targetX), (yPos + 0.5 + targetY), (zPos + targetZ), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.BLOCKS, 1,
																(float) Mth.nextDouble(RandomSource.create(), 0.95, 1.05), false);
													}
												}
												if (workingBool == false) {
													workingBool = true;
													if (entity instanceof LivingEntity _entity)
														_entity.swing(InteractionHand.OFF_HAND, true);
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
}
