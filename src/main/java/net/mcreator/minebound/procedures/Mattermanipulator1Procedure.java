package net.mcreator.minebound.procedures;

import net.minecraft.world.phys.HitResult;
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
import net.minecraft.core.BlockPos;

public class Mattermanipulator1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double raytraceDistance = 0;
		raytraceDistance = 10;
		if (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
				.getType() == HitResult.Type.BLOCK) {
			if (!entity.isShiftKeyDown() && (world.getFluidState(new BlockPos(
					entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getX(),
					entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getY(),
					entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos()
							.getZ()))
					.createLegacyBlock()).getBlock() instanceof LiquidBlock) {
				world.levelEvent(2001,
						new BlockPos(
								entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
										.getBlockPos().getX(),
								entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
										.getBlockPos().getY(),
								entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
										.getBlockPos().getZ()),
						Block.getId((world.getFluidState(new BlockPos(
								entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
										.getBlockPos().getX(),
								entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
										.getBlockPos().getY(),
								entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
										.getBlockPos().getZ()))
								.createLegacyBlock())));
				world.setBlock(new BlockPos(
						entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos()
								.getX(),
						entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos()
								.getY(),
						entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos()
								.getZ()),
						Blocks.AIR.defaultBlockState(), 3);
				if ((world.getFluidState(new BlockPos(
						entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos()
								.getX(),
						entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos()
								.getY(),
						entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos()
								.getZ()))
						.createLegacyBlock()).getBlock() == Blocks.WATER) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.WARPED_BUTTON));
						entityToSpawn.setPickUpDelay(0);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.WARPED_BUTTON));
						entityToSpawn.setPickUpDelay((int) 0.01);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.WARPED_BUTTON));
						entityToSpawn.setPickUpDelay((int) 0.02);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.WARPED_BUTTON));
						entityToSpawn.setPickUpDelay((int) 0.03);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if ((world.getFluidState(new BlockPos(
						entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos()
								.getX(),
						entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos()
								.getY(),
						entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos()
								.getZ()))
						.createLegacyBlock()).getBlock() == Blocks.LAVA) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.CRIMSON_BUTTON));
						entityToSpawn.setPickUpDelay(0);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.CRIMSON_BUTTON));
						entityToSpawn.setPickUpDelay((int) 0.01);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.CRIMSON_BUTTON));
						entityToSpawn.setPickUpDelay((int) 0.02);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.CRIMSON_BUTTON));
						entityToSpawn.setPickUpDelay((int) 0.03);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
							(new ItemStack((world.getBlockState(new BlockPos(
									entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
											.getBlockPos().getX(),
									entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
											.getBlockPos().getY(),
									entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
											.getBlockPos().getZ())))
									.getBlock())));
					entityToSpawn.setPickUpDelay(0);
					_level.addFreshEntity(entityToSpawn);
				}
				world.destroyBlock(new BlockPos(
						entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),
						entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
						entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
						false);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
		}
	}
}
