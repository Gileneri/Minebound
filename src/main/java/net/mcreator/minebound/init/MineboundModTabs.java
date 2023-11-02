
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minebound.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MineboundModTabs {
	public static CreativeModeTab TAB_NATURALTILES;

	public static void load() {
		TAB_NATURALTILES = new CreativeModeTab("tabnaturaltiles") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MineboundModBlocks.DIRTMATERIAL.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
