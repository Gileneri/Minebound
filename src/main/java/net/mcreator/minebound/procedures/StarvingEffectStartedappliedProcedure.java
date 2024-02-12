package net.mcreator.minebound.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class StarvingEffectStartedappliedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(
					new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"attribute @e[distance=..1,limit=1] minecraft:generic.movement_speed modifier add a713b713-717c-471c-ac90-cb6dd36db542 \"starbound_starving_slow\" -0.15 multiply_base");
	}
}
