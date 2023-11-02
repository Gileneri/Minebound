
package net.mcreator.minebound.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TestMonsterStatItemItem extends Item {
	public TestMonsterStatItemItem() {
		super(new Item.Properties().tab(null).stacksTo(1).rarity(Rarity.EPIC));
	}
}
