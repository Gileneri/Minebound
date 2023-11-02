package net.mcreator.minebound.procedures;

import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import java.util.concurrent.atomic.AtomicReference;

public class MMUpgradeGUIButtonsCheckPlayerForCurrencyProcedure {
	public static double execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return 0;
		double playerModules = 0;
		playerModules = 0;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.SUNFLOWER)) : false) {
			{
				AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
				entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _iitemhandlerref.set(capability));
				if (_iitemhandlerref.get() != null) {
					for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
						ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
						if (itemstackiterator.getItem() == Blocks.SUNFLOWER.asItem()) {
							playerModules = playerModules + (itemstackiterator).getCount();
						}
					}
				}
			}
		}
		return playerModules;
	}
}
