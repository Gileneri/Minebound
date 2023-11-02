package net.mcreator.minebound.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class MobOnInitialEntitySpawnStatScalingProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double healthMultiplier = 0;
		double baseDamage = 0;
		double damageMultiplier = 0;
		double counter = 0;
		if ((entity.level.dimension()) == (Level.OVERWORLD)) {
			entity.getPersistentData().putDouble("scalingTier", 1);
		} else if ((entity.level.dimension()) == (Level.NETHER)) {
			entity.getPersistentData().putDouble("scalingTier", 2);
		} else if ((entity.level.dimension()) == (Level.END)) {
			entity.getPersistentData().putDouble("scalingTier", 3);
		} else if ((entity.level.dimension()) == (Level.OVERWORLD)) {
			entity.getPersistentData().putDouble("scalingTier", 4);
		} else if ((entity.level.dimension()) == (Level.OVERWORLD)) {
			entity.getPersistentData().putDouble("scalingTier", 5);
		} else if ((entity.level.dimension()) == (Level.OVERWORLD)) {
			entity.getPersistentData().putDouble("scalingTier", 6);
		} else if ((entity.level.dimension()) == (Level.OVERWORLD)) {
			entity.getPersistentData().putDouble("scalingTier", 7);
		} else if ((entity.level.dimension()) == (Level.OVERWORLD)) {
			entity.getPersistentData().putDouble("scalingTier", 8);
		} else if ((entity.level.dimension()) == (Level.OVERWORLD)) {
			entity.getPersistentData().putDouble("scalingTier", 9);
		} else if ((entity.level.dimension()) == (Level.OVERWORLD)) {
			entity.getPersistentData().putDouble("scalingTier", 10);
		} else {
			entity.getPersistentData().putDouble("scalingTier", 0);
		}
		for (int index0 = 0; index0 < (int) (entity.getPersistentData().getDouble("scalingTier") + 1); index0++) {
			counter = counter + 1;
			healthMultiplier = healthMultiplier + counter * 0.15;
		}
		if (healthMultiplier < 1) {
			healthMultiplier = healthMultiplier - 1;
		}
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
						_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
						("attribute @s minecraft:generic.max_health modifier add a713b713-717c-471c-ac90-cb6dd36db538 \"starbound_stat_scaling\" " + "" + healthMultiplier + " multiply"));
			}
		}
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
		if (entity.getPersistentData().getDouble("scalingTier") >= 2) {
			damageMultiplier = 0.75;
		}
		for (int index1 = 0; index1 < (int) (entity.getPersistentData().getDouble("scalingTier") + 1); index1++) {
			damageMultiplier = damageMultiplier + 0.5;
		}
		damageMultiplier = damageMultiplier / 4;
		if (damageMultiplier < 1) {
			damageMultiplier = damageMultiplier - 1;
		}
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands()
						.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
								_ent.getDisplayName(), _ent.level.getServer(), _ent),
								("attribute @s minecraft:generic.attack_damage modifier add a713b713-717c-471c-ac90-cb6dd36db539 \"starbound_stat_scaling\" " + "" + damageMultiplier + " multiply"));
			}
		}
	}
}
