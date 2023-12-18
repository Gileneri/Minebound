
package net.mcreator.minebound.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.mcreator.minebound.init.MineboundModFluids;

public class SpaceFluidItem extends BucketItem {
	public SpaceFluidItem() {
		super(MineboundModFluids.SPACE_FLUID, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.RARE).tab(CreativeModeTab.TAB_MISC));
	}
}
