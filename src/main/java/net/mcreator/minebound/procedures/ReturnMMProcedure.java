package net.mcreator.minebound.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ReturnMMProcedure {
	public static ItemStack execute() {
		return new ItemStack(MineboundModItems.MATTERMANIPULATORBETA.get());
	}
}
