package net.mcreator.minebound.procedures;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.minebound.world.inventory.MMUpgradeGUITestMenu;
import net.mcreator.minebound.init.MineboundModItems;

import io.netty.buffer.Unpooled;

public class MMUpgradeGUIToggleKeybindOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MineboundModItems.MATTERMANIPULATORBETA.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == MineboundModItems.MATTERMANIPULATORBETA.get()) {
			if ((entity instanceof Player _plr ? _plr.containerMenu instanceof MMUpgradeGUITestMenu : false) != true) {
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos(x, y, z);
						NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return Component.literal("MMUpgradeGUITest");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new MMUpgradeGUITestMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			} else if ((entity instanceof Player _plr ? _plr.containerMenu instanceof MMUpgradeGUITestMenu : false) == true) {
				if (entity instanceof Player _player)
					_player.closeContainer();
			}
		}
	}
}
