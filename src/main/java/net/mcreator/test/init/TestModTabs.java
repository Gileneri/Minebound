
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class TestModTabs {
	public static CreativeModeTab TAB_NATURALTILES;

	public static void load() {
		TAB_NATURALTILES = new CreativeModeTab("tabnaturaltiles") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TestModBlocks.DIRTMATERIAL.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
