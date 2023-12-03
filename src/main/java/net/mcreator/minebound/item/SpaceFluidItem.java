
package net.mcreator.minebound.item;

import net.minecraft.network.chat.Component;

public class SpaceFluidItem extends BucketItem {

	public SpaceFluidItem() {
		super(MineboundModFluids.SPACE_FLUID, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.RARE).tab(CreativeModeTab.TAB_MISC));
	}

}
