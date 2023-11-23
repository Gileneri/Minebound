package net.mcreator.minebound.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.minebound.entity.PlayerHeadHUDEntityEntity;
import net.mcreator.minebound.entity.BlockIndicatorEntity3Entity;
import net.mcreator.minebound.entity.BlockIndicatorEntity2Entity;
import net.mcreator.minebound.entity.BlockIndicatorEntity1Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BeforeEntityIsHurtProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		boolean preventDamage = false;
		preventDamage = false;
		if (!world.isClientSide()) {
			if (entity instanceof BlockIndicatorEntity1Entity || entity instanceof BlockIndicatorEntity2Entity || entity instanceof BlockIndicatorEntity3Entity || entity instanceof PlayerHeadHUDEntityEntity) {
				preventDamage = true;
			}
			if (preventDamage == true) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
			}
		}
	}
}
