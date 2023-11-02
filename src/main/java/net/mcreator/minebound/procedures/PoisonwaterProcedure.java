package net.mcreator.minebound.procedures;

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
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.minebound.init.MineboundModMobEffects;

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
			if ((ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minebound:higher"))) == (entity.level.dimension())
					&& !((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == Items.LEATHER_CHESTPLATE)) {
				if (new Object() {
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
				}.checkGamemode(entity) || entity instanceof PathfinderMob) {
					entity.getPersistentData().putBoolean("poisonloop", (true));
					if (0 < (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
						if (world.getLevelData().isThundering() && world.canSeeSkyFromBelowWater(new BlockPos(entity.getX(), entity.getY(), entity.getZ()))) {
							if (entity instanceof LivingEntity _entity)
								_entity.hurt(new DamageSource("poison_thunder").bypassArmor(), 1);
							if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.POISON) : false)) {
								if (entity instanceof LivingEntity _entity)
									_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 100, 0));
							}
						} else if (world.getLevelData().isRaining() && world.canSeeSkyFromBelowWater(new BlockPos(entity.getX(), entity.getY(), entity.getZ()))) {
							if (entity instanceof LivingEntity _entity)
								_entity.hurt(new DamageSource("poison_rain").bypassArmor(), 1);
							if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MineboundModMobEffects.POISONED.get()) : false)) {
								if (entity instanceof LivingEntity _entity)
									_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 100, 0));
							}
						} else if (entity.isInWaterOrBubble()) {
							if (entity instanceof LivingEntity _entity)
								_entity.hurt(new DamageSource("poison_water").bypassArmor(), 1);
							if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MineboundModMobEffects.POISONED.get()) : false)) {
								if (entity instanceof LivingEntity _entity)
									_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 100, 0));
							}
						}
					}
				}
			}
		}
	}
}
