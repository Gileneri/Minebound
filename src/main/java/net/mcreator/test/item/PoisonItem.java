
package net.mcreator.test.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;
import net.minecraft.network.chat.Component;

import net.mcreator.test.init.TestModFluids;

import java.util.List;

public class PoisonItem extends BucketItem {
	public PoisonItem() {
		super(TestModFluids.POISON, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MISC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("A measure of strong poison."));
	}
}
