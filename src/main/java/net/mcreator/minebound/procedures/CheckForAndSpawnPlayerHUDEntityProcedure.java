package net.mcreator.minebound.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.minebound.entity.PlayerHeadHUDEntityEntity;

import javax.annotation.Nullable;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class CheckForAndSpawnPlayerHUDEntityProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean foundTarget = false;
		if (!world.getEntitiesOfClass(PlayerHeadHUDEntityEntity.class, AABB.ofSize(new Vec3(x, (y + 1000000), z), 32, 32, 32), e -> true).isEmpty()) {
			if (!(((Entity) world.getEntitiesOfClass(PlayerHeadHUDEntityEntity.class, AABB.ofSize(new Vec3(x, (y + 1000000), z), 32, 32, 32), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, (y + 1000000), z)).findFirst().orElse(null)).getDisplayName().getString()).equals(entity.getDisplayName().getString())) {
				foundTarget = false;
				{
					final Vec3 _center = new Vec3(x, (y + 1000000), z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof PlayerHeadHUDEntityEntity) {
							if ((entityiterator.getDisplayName().getString()).equals(entity.getDisplayName().getString()) || (entityiterator.getDisplayName().getString()).equals("Notch") && (entity.getDisplayName().getString()).equals("Dev")) {
								foundTarget = true;
								break;
							}
						}
					}
				}
				if (foundTarget == false) {
					if ((entity.getDisplayName().getString()).equals("Dev")) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 1000000), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									("summon minebound:player_head_hud_entity ~ ~ ~ {CustomName:'[{\"text\":\"" + "Notch"
											+ "\"}]',Invulnerable:1b,NoAI:1b,NoGravity:1b,PersistenceRequired:1b,Silent:1b,ActiveEffects:[{Id:14,Duration:99999999,Amplifier:0,ShowParticles:0b}],ArmorItems:[{},{},{},{id:player_head,tag:{SkullOwner:"
											+ "Notch" + "},Count:1}],ArmorDropChances:[0f,0f,0f,0.00f]}"));
					} else {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 1000000), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									("summon minebound:player_head_hud_entity ~ ~ ~ {CustomName:'[{\"text\":\"" + "" + entity.getDisplayName().getString()
											+ "\"}]',Invulnerable:1b,NoAI:1b,NoGravity:1b,PersistenceRequired:1b,Silent:1b,ActiveEffects:[{Id:14,Duration:99999999,Amplifier:0,ShowParticles:0b}],ArmorItems:[{},{},{},{id:player_head,tag:{SkullOwner:"
											+ entity.getDisplayName().getString() + "},Count:1}],ArmorDropChances:[0f,0f,0f,0.00f]}"));
					}
				}
			}
		} else {
			if ((entity.getDisplayName().getString()).equals("Dev")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 1000000), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("summon minebound:player_head_hud_entity ~ ~ ~ {CustomName:'[{\"text\":\"" + "Notch"
									+ "\"}]',Invulnerable:1b,NoAI:1b,NoGravity:1b,PersistenceRequired:1b,Silent:1b,ActiveEffects:[{Id:14,Duration:99999999,Amplifier:0,ShowParticles:0b}],ArmorItems:[{},{},{},{id:player_head,tag:{SkullOwner:" + "Notch"
									+ "},Count:1}],ArmorDropChances:[0f,0f,0f,0.00f]}"));
			} else {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 1000000), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("summon minebound:player_head_hud_entity ~ ~ ~ {CustomName:'[{\"text\":\"" + "" + entity.getDisplayName().getString()
									+ "\"}]',Invulnerable:1b,NoAI:1b,NoGravity:1b,PersistenceRequired:1b,Silent:1b,ActiveEffects:[{Id:14,Duration:99999999,Amplifier:0,ShowParticles:0b}],ArmorItems:[{},{},{},{id:player_head,tag:{SkullOwner:"
									+ entity.getDisplayName().getString() + "},Count:1}],ArmorDropChances:[0f,0f,0f,0.00f]}"));
			}
		}
	}
}
