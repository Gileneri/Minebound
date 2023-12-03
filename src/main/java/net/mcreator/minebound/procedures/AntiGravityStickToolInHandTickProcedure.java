package net.mcreator.minebound.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class AntiGravityStickToolInHandTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"fill ~-5 ~-5 ~-5 ~5 ~5 ~5 minebound:slidy_nothing replace air");
		if (MineboundModVariables.MapVariables.get(world).UNIQUE_PLAYER_COUNT <= -20) {
			MineboundModVariables.MapVariables.get(world).UNIQUE_PLAYER_COUNT = 0;
			MineboundModVariables.MapVariables.get(world).syncData(world);
		} else {
			MineboundModVariables.MapVariables.get(world).UNIQUE_PLAYER_COUNT = MineboundModVariables.MapVariables.get(world).UNIQUE_PLAYER_COUNT - 1;
			MineboundModVariables.MapVariables.get(world).syncData(world);
		}
		entity.setAirSupply((int) MineboundModVariables.MapVariables.get(world).UNIQUE_PLAYER_COUNT);
	}
}
