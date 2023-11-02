package net.mcreator.test.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.client.Minecraft;

import net.mcreator.test.init.TestModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PoisonwaterProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level, event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			if ((ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("test:higher"))) == (entity.level.dimension())
					&& !((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == Items.LEATHER_CHESTPLATE)) {
				if ((new Object() {
					public boolean checkGamemode(Entity _ent) {
						if (_ent instanceof ServerPlayer _serverPlayer) {
							return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
						} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
							return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
									&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
						}
						return false;
					}
				}.checkGamemode(entity) || new Object() {
					public boolean checkGamemode(Entity _ent) {
						if (_ent instanceof ServerPlayer _serverPlayer) {
							return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.ADVENTURE;
						} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
							return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
									&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.ADVENTURE;
						}
						return false;
					}
				}.checkGamemode(entity) || entity instanceof PathfinderMob) && !entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("test:poison_creature"))) && entity.isInWaterRainOrBubble()) {
					if (world.getLevelData().isThundering() && (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(TestModMobEffects.POISONED.get()) : false)) {
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(TestModMobEffects.POISONED.get(), 110, 1, (false), (false)));
					} else if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(TestModMobEffects.POISONED.get()) : false)) {
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(TestModMobEffects.POISONED.get(), 60, 0, (false), (false)));
					}
				}
			}
		}
	}
}
