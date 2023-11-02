package net.mcreator.minebound.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.minebound.init.MineboundModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PoisonparticlesProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		return execute(null, world, x, y, z, entity);
	}

	private static boolean execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return false;
		boolean under_liquid = false;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		under_liquid = false;
		if ((world
				.getFluidState(new BlockPos(x,
						entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(0.000001)), ClipContext.Block.OUTLINE, ClipContext.Fluid.ANY, entity)).getBlockPos().getY(), z))
				.createLegacyBlock()).getBlock() == MineboundModBlocks.POISON.get()) {
			under_liquid = true;
			for (int index0 = 0; index0 < (int) (15); index0++) {
				xPos = x + Mth.nextDouble(RandomSource.create(), -6, 6);
				yPos = y + Mth.nextDouble(RandomSource.create(), -6, 6);
				zPos = z + Mth.nextDouble(RandomSource.create(), -6, 6);
				if ((world.getFluidState(new BlockPos(xPos, yPos, zPos)).createLegacyBlock()).getBlock() == MineboundModBlocks.POISON.get()) {
					world.addParticle(ParticleTypes.UNDERWATER, xPos, yPos, zPos, 0, 0, 0);
				}
			}
		}
		return under_liquid;
	}
}
