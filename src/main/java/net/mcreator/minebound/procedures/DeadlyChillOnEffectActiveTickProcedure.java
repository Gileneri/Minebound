package net.mcreator.minebound.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.minebound.network.MineboundModVariables;
import net.mcreator.minebound.init.MineboundModMobEffects;

public class DeadlyChillOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == Items.DIAMOND_LEGGINGS) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MineboundModMobEffects.DEADLY_CHILL.get());
		} else {
			if (!world.isClientSide()) {
				if (entity instanceof Player || entity instanceof ServerPlayer) {
					if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MineboundModMobEffects.DEADLY_CHILL.get()) ? _livEnt.getEffect(MineboundModMobEffects.DEADLY_CHILL.get()).getDuration() : 0) % 20 == 0) {
						if ((entity.getCapability(MineboundModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MineboundModVariables.PlayerVariables())).PLAYER_CURRENT_ENERGY > 0) {
							{
								double _setval = (entity.getCapability(MineboundModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MineboundModVariables.PlayerVariables())).PLAYER_CURRENT_ENERGY - 7.5;
								entity.getCapability(MineboundModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.PLAYER_CURRENT_ENERGY = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else {
							if (entity instanceof LivingEntity _entity)
								_entity.hurt(new DamageSource("froze").bypassArmor(), 3);
						}
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 5, -2, (false), (false)));
			}
			if (entity.getPersistentData().getDouble("energyStatus") != 2) {
				entity.getPersistentData().putDouble("energyStatus", 1);
			}
			if (entity.getPersistentData().getDouble("energyCooldown") < 34) {
				entity.getPersistentData().putDouble("energyCooldown", 34);
			}
		}
	}
}
