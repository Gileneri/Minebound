
package net.mcreator.minebound.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;
import net.minecraft.network.chat.Component;

import net.mcreator.minebound.init.MineboundModTabs;
import net.mcreator.minebound.init.MineboundModFluids;

import java.util.List;

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
