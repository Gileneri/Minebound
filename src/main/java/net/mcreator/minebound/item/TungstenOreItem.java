
package net.mcreator.minebound.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.minebound.init.MineboundModTabs;

public class TungstenOreItem extends Item {
	public TungstenOreItem() {
		super(new Item.Properties().tab(MineboundModTabs.TAB_ITEMS_AND_ORES).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}
}
