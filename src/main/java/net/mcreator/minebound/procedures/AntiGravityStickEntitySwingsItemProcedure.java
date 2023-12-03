package net.mcreator.minebound.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class AntiGravityStickEntitySwingsItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double xVel = 0;
		double yVel = 0;
		double zVel = 0;
		xVel = (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX() - entity.getX()) / 20;
		yVel = (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY() - entity.getY()) / 20;
		zVel = (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ() - entity.getZ()) / 20;
		entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() + xVel), (entity.getDeltaMovement().y() + yVel), (entity.getDeltaMovement().z() + zVel)));
	}
}
