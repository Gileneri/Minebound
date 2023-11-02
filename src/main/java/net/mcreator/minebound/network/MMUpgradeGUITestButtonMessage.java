
package net.mcreator.minebound.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.minebound.world.inventory.MMUpgradeGUITestMenu;
import net.mcreator.minebound.procedures.MMUpgradeGUIButtonWhenClicked9Procedure;
import net.mcreator.minebound.procedures.MMUpgradeGUIButtonWhenClicked8Procedure;
import net.mcreator.minebound.procedures.MMUpgradeGUIButtonWhenClicked7Procedure;
import net.mcreator.minebound.procedures.MMUpgradeGUIButtonWhenClicked6Procedure;
import net.mcreator.minebound.procedures.MMUpgradeGUIButtonWhenClicked5Procedure;
import net.mcreator.minebound.procedures.MMUpgradeGUIButtonWhenClicked4Procedure;
import net.mcreator.minebound.procedures.MMUpgradeGUIButtonWhenClicked3Procedure;
import net.mcreator.minebound.procedures.MMUpgradeGUIButtonWhenClicked2Procedure;
import net.mcreator.minebound.procedures.MMUpgradeGUIButtonWhenClicked1Procedure;
import net.mcreator.minebound.procedures.MMUpgradeGUIButtonWhenClicked12Procedure;
import net.mcreator.minebound.procedures.MMUpgradeGUIButtonWhenClicked11Procedure;
import net.mcreator.minebound.procedures.MMUpgradeGUIButtonWhenClicked10Procedure;
import net.mcreator.minebound.MineboundMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MMUpgradeGUITestButtonMessage {
	private final int buttonID, x, y, z;

	public MMUpgradeGUITestButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public MMUpgradeGUITestButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(MMUpgradeGUITestButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(MMUpgradeGUITestButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = MMUpgradeGUITestMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			MMUpgradeGUIButtonWhenClicked1Procedure.execute(world, entity);
		}
		if (buttonID == 1) {

			MMUpgradeGUIButtonWhenClicked2Procedure.execute(world, entity);
		}
		if (buttonID == 2) {

			MMUpgradeGUIButtonWhenClicked3Procedure.execute(world, entity);
		}
		if (buttonID == 3) {

			MMUpgradeGUIButtonWhenClicked4Procedure.execute(world, entity);
		}
		if (buttonID == 4) {

			MMUpgradeGUIButtonWhenClicked5Procedure.execute(world, entity);
		}
		if (buttonID == 5) {

			MMUpgradeGUIButtonWhenClicked6Procedure.execute(world, entity);
		}
		if (buttonID == 6) {

			MMUpgradeGUIButtonWhenClicked7Procedure.execute(world, entity);
		}
		if (buttonID == 7) {

			MMUpgradeGUIButtonWhenClicked8Procedure.execute(world, entity);
		}
		if (buttonID == 8) {

			MMUpgradeGUIButtonWhenClicked9Procedure.execute(world, entity);
		}
		if (buttonID == 9) {

			MMUpgradeGUIButtonWhenClicked10Procedure.execute(world, entity);
		}
		if (buttonID == 10) {

			MMUpgradeGUIButtonWhenClicked11Procedure.execute(world, entity);
		}
		if (buttonID == 11) {

			MMUpgradeGUIButtonWhenClicked12Procedure.execute(world, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		MineboundMod.addNetworkMessage(MMUpgradeGUITestButtonMessage.class, MMUpgradeGUITestButtonMessage::buffer, MMUpgradeGUITestButtonMessage::new, MMUpgradeGUITestButtonMessage::handler);
	}
}
