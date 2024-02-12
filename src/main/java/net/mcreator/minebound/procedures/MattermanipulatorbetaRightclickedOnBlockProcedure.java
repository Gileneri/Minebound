package net.mcreator.minebound.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class MattermanipulatorbetaRightclickedOnBlockProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) {
			MineboundMod.LOGGER.info("1");
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) {
			MineboundMod.LOGGER.info("2");
		}
	}
}
