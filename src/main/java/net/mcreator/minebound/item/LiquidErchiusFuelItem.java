
package net.mcreator.minebound.item;

import net.minecraft.network.chat.Component;

public class LiquidErchiusFuelItem extends BucketItem {

	public LiquidErchiusFuelItem() {
		super(MineboundModFluids.LIQUID_ERCHIUS_FUEL, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(MineboundModTabs.TAB_ITEMS_AND_ORES));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("a"));
		list.add(Component.literal("a"));
		list.add(Component.literal("a"));
		list.add(Component.literal("a"));
		list.add(Component.literal("a"));
	}
}
