package net.mcreator.minebound.procedures;

import net.minecraft.world.item.ItemStack;

import net.mcreator.minebound.init.MineboundModItems;

public class ReturnMMProcedure {
	public static ItemStack execute() {
		return new ItemStack(MineboundModItems.MATTERMANIPULATORBETA.get());
	}
}
