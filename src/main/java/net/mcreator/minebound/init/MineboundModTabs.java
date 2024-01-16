
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minebound.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MineboundModTabs {
	public static CreativeModeTab TAB_NATURALTILES;
	public static CreativeModeTab TAB_CRAFTABLEBLOCKS;
	public static CreativeModeTab TAB_VILLAGEAND_DUNGEON_BLOCKS;
	public static CreativeModeTab TAB_ITEMS_AND_ORES;

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
		TAB_CRAFTABLEBLOCKS = new CreativeModeTab("tabcraftableblocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MineboundModBlocks.ASPHALT.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_VILLAGEAND_DUNGEON_BLOCKS = new CreativeModeTab("tabvillageand_dungeon_blocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MineboundModBlocks.ANCIENT_BLOCK.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_ITEMS_AND_ORES = new CreativeModeTab("tabitems_and_ores") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MineboundModItems.CRYSTAL_ERCHIUS_FUEL.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
