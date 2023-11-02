package net.mcreator.minebound.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.minebound.init.MineboundModBlocks;

public class FlashlightTestProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double raytraceDistance = 0;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		double counter = 0;
		if (!world.isClientSide() && entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
				.getBlockPos().getY() <= 2000) {
			raytraceDistance = 5;
			xPos = entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getX();
			yPos = entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getY();
			zPos = entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getZ();
			if ((world.isEmptyBlock(new BlockPos(xPos, yPos, zPos)) || (world.getBlockState(new BlockPos(xPos, yPos, zPos))).getBlock() instanceof LiquidBlock) && world.getMaxLocalRawBrightness(new BlockPos(xPos, yPos, zPos)) < 14) {
				if ((world.getFluidState(new BlockPos(xPos, yPos, zPos)).createLegacyBlock()).getBlock() == Blocks.WATER) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"setblock ~ ~ ~ test:test_light_block[waterlogged=true]");
				} else {
					world.setBlock(new BlockPos(xPos, yPos, zPos), MineboundModBlocks.TEST_LIGHT_BLOCK.get().defaultBlockState(), 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(xPos, yPos, zPos);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("flashlightCounter", 0);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if ((world.getBlockState(new BlockPos(xPos, yPos, zPos))).getBlock() == MineboundModBlocks.TEST_LIGHT_BLOCK.get()) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(xPos, yPos, zPos);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("flashlightCounter", 0);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else {
				counter = Math.ceil(raytraceDistance / 2);
				for (int index0 = 0; index0 < (int) (counter); index0++) {
					raytraceDistance = raytraceDistance - 2;
					if (raytraceDistance <= 0) {
						raytraceDistance = 0.00001;
					}
					xPos = entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos()
							.getX();
					yPos = entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos()
							.getY();
					zPos = entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytraceDistance)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos()
							.getZ();
					if ((world.isEmptyBlock(new BlockPos(xPos, yPos, zPos)) || (world.getBlockState(new BlockPos(xPos, yPos, zPos))).getBlock() instanceof LiquidBlock) && world.getMaxLocalRawBrightness(new BlockPos(xPos, yPos, zPos)) < 14) {
						if ((world.getFluidState(new BlockPos(xPos, yPos, zPos)).createLegacyBlock()).getBlock() == Blocks.WATER) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"setblock ~ ~ ~ test:test_light_block[waterlogged=true]");
						} else {
							world.setBlock(new BlockPos(xPos, yPos, zPos), MineboundModBlocks.TEST_LIGHT_BLOCK.get().defaultBlockState(), 3);
						}
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(xPos, yPos, zPos);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putDouble("flashlightCounter", 0);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(xPos, yPos, zPos))).getBlock() == MineboundModBlocks.TEST_LIGHT_BLOCK.get()) {
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(xPos, yPos, zPos);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putDouble("flashlightCounter", 0);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
					}
				}
			}
		}
	}
}
