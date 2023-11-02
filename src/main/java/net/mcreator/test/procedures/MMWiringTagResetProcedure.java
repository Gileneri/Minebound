package net.mcreator.test.procedures;

import net.minecraft.world.item.ItemStack;

public class MMWiringTagResetProcedure {
	public static void execute(ItemStack itemstack) {
		double counter = 0;
		itemstack.getOrCreateTag().putDouble("MMwireCarryingInput", 0);
		itemstack.getOrCreateTag().putDouble("MMwireCarryingOutput", 0);
		counter = 1;
		for (int index0 = 0; index0 < (int) (3); index0++) {
			itemstack.getOrCreateTag().putDouble(("MMwireXin" + counter), 0);
			itemstack.getOrCreateTag().putDouble(("MMwireYin" + counter), 0);
			itemstack.getOrCreateTag().putDouble(("MMwireZin" + counter), 0);
			itemstack.getOrCreateTag().putDouble(("MMwireXout" + counter), 0);
			itemstack.getOrCreateTag().putDouble(("MMwireYout" + counter), 0);
			itemstack.getOrCreateTag().putDouble(("MMwireZout" + counter), 0);
			counter = counter + 1;
		}
	}
}
