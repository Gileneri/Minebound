package net.mcreator.minebound.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.minebound.MineboundMod;

public class SpiralSearchBaseProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean toggleXorZ = false;
		boolean foundBlock = false;
		boolean toggleNorP = false;
		boolean visualize = false;
		double speedModifier = 0;
		double zPos = 0;
		double yPos = 0;
		double counter2 = 0;
		double counter1 = 0;
		double xPos = 0;
		double range = 0;
		double height = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == (ItemStack.EMPTY).getItem()) {
			MineboundMod.LOGGER.info(world
					.getBlockState(new BlockPos(
							entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getX(),
							entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getY(),
							entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getZ()))
					.getDestroySpeed(world, new BlockPos(
							entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getX(),
							entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getY(),
							entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getZ())));
		} else {
			foundBlock = false;
			toggleXorZ = true;
			toggleNorP = false;
			speedModifier = 0.15;
			xPos = x;
			yPos = y - 1;
			zPos = z;
			counter1 = 1;
			counter2 = 2;
			visualize = true;
			if (visualize == true) {
				range = ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).getCount();
				height = 2;
			} else if (visualize == false) {
				range = 29;
				height = 3;
			}
			for (int index0 = 0; index0 < (int) (range); index0++) {
				for (int index1 = 0; index1 < (int) (counter1); index1++) {
					for (int index2 = 0; index2 < (int) (height); index2++) {
						if (visualize == true) {
							world.setBlock(new BlockPos(xPos, yPos, zPos), Blocks.GRAY_STAINED_GLASS.defaultBlockState(), 3);
						} else if (visualize == false) {
							if (foundBlock != true) {
								if ((world.getBlockState(new BlockPos(xPos, yPos, zPos))).is(BlockTags.create(new ResourceLocation("minecraft:logs")))) {
									foundBlock = true;
									if (entity.getX() < xPos) {
										entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() + speedModifier), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z())));
									} else if (entity.getX() > xPos) {
										entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() - speedModifier), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z())));
									}
									if (entity.getZ() < zPos) {
										entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() + speedModifier)));
									} else if (entity.getZ() > zPos) {
										entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() - speedModifier)));
									}
								}
							}
						}
						yPos = yPos + 1;
					}
					if (toggleXorZ == true) {
						if (toggleNorP == true) {
							xPos = xPos + 1;
						} else if (toggleNorP == false) {
							xPos = xPos - 1;
						}
					} else if (toggleXorZ == false) {
						if (toggleNorP == true) {
							zPos = zPos + 1;
						} else if (toggleNorP == false) {
							zPos = zPos - 1;
						}
					}
					yPos = yPos - height;
				}
				if (toggleXorZ == true) {
					toggleXorZ = false;
				} else if (toggleXorZ == false) {
					toggleXorZ = true;
				}
				counter2 = counter2 - 1;
				if (counter2 == 0) {
					if (toggleNorP == true) {
						toggleNorP = false;
					} else if (toggleNorP == false) {
						toggleNorP = true;
					}
					counter1 = counter1 + 1;
					counter2 = 2;
				}
			}
		}
	}
}
