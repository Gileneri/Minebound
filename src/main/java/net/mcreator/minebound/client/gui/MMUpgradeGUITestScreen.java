package net.mcreator.minebound.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.minebound.world.inventory.MMUpgradeGUITestMenu;
import net.mcreator.minebound.network.MMUpgradeGUITestButtonMessage;
import net.mcreator.minebound.MineboundMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class MMUpgradeGUITestScreen extends AbstractContainerScreen<MMUpgradeGUITestMenu> {
	private final static HashMap<String, Object> guistate = MMUpgradeGUITestMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;
	Button button_empty1;
	Button button_empty2;
	Button button_empty3;
	Button button_empty4;
	Button button_empty5;
	Button button_empty6;
	Button button_empty7;
	Button button_empty8;
	Button button_empty9;
	Button button_empty10;
	Button button_empty11;

	public MMUpgradeGUITestScreen(MMUpgradeGUITestMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 200;
		this.imageHeight = 170;
	}

	private static final ResourceLocation texture = new ResourceLocation("minebound:textures/screens/mm_upgrade_gui_test.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		button_empty = new Button(this.leftPos + 9, this.topPos + 2, 82, 20, Component.translatable("gui.minebound.mm_upgrade_gui_test.button_empty"), e -> {
			if (true) {
				MineboundMod.PACKET_HANDLER.sendToServer(new MMUpgradeGUITestButtonMessage(0, x, y, z));
				MMUpgradeGUITestButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = new Button(this.leftPos + 9, this.topPos + 29, 82, 20, Component.translatable("gui.minebound.mm_upgrade_gui_test.button_empty1"), e -> {
			if (true) {
				MineboundMod.PACKET_HANDLER.sendToServer(new MMUpgradeGUITestButtonMessage(1, x, y, z));
				MMUpgradeGUITestButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
		button_empty2 = new Button(this.leftPos + 9, this.topPos + 56, 82, 20, Component.translatable("gui.minebound.mm_upgrade_gui_test.button_empty2"), e -> {
			if (true) {
				MineboundMod.PACKET_HANDLER.sendToServer(new MMUpgradeGUITestButtonMessage(2, x, y, z));
				MMUpgradeGUITestButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:button_empty2", button_empty2);
		this.addRenderableWidget(button_empty2);
		button_empty3 = new Button(this.leftPos + 9, this.topPos + 92, 82, 20, Component.translatable("gui.minebound.mm_upgrade_gui_test.button_empty3"), e -> {
			if (true) {
				MineboundMod.PACKET_HANDLER.sendToServer(new MMUpgradeGUITestButtonMessage(3, x, y, z));
				MMUpgradeGUITestButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:button_empty3", button_empty3);
		this.addRenderableWidget(button_empty3);
		button_empty4 = new Button(this.leftPos + 9, this.topPos + 119, 82, 20, Component.translatable("gui.minebound.mm_upgrade_gui_test.button_empty4"), e -> {
			if (true) {
				MineboundMod.PACKET_HANDLER.sendToServer(new MMUpgradeGUITestButtonMessage(4, x, y, z));
				MMUpgradeGUITestButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:button_empty4", button_empty4);
		this.addRenderableWidget(button_empty4);
		button_empty5 = new Button(this.leftPos + 9, this.topPos + 146, 82, 20, Component.translatable("gui.minebound.mm_upgrade_gui_test.button_empty5"), e -> {
			if (true) {
				MineboundMod.PACKET_HANDLER.sendToServer(new MMUpgradeGUITestButtonMessage(5, x, y, z));
				MMUpgradeGUITestButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:button_empty5", button_empty5);
		this.addRenderableWidget(button_empty5);
		button_empty6 = new Button(this.leftPos + 107, this.topPos + 2, 82, 20, Component.translatable("gui.minebound.mm_upgrade_gui_test.button_empty6"), e -> {
			if (true) {
				MineboundMod.PACKET_HANDLER.sendToServer(new MMUpgradeGUITestButtonMessage(6, x, y, z));
				MMUpgradeGUITestButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:button_empty6", button_empty6);
		this.addRenderableWidget(button_empty6);
		button_empty7 = new Button(this.leftPos + 107, this.topPos + 29, 82, 20, Component.translatable("gui.minebound.mm_upgrade_gui_test.button_empty7"), e -> {
			if (true) {
				MineboundMod.PACKET_HANDLER.sendToServer(new MMUpgradeGUITestButtonMessage(7, x, y, z));
				MMUpgradeGUITestButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:button_empty7", button_empty7);
		this.addRenderableWidget(button_empty7);
		button_empty8 = new Button(this.leftPos + 107, this.topPos + 56, 82, 20, Component.translatable("gui.minebound.mm_upgrade_gui_test.button_empty8"), e -> {
			if (true) {
				MineboundMod.PACKET_HANDLER.sendToServer(new MMUpgradeGUITestButtonMessage(8, x, y, z));
				MMUpgradeGUITestButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		guistate.put("button:button_empty8", button_empty8);
		this.addRenderableWidget(button_empty8);
		button_empty9 = new Button(this.leftPos + 107, this.topPos + 92, 82, 20, Component.translatable("gui.minebound.mm_upgrade_gui_test.button_empty9"), e -> {
			if (true) {
				MineboundMod.PACKET_HANDLER.sendToServer(new MMUpgradeGUITestButtonMessage(9, x, y, z));
				MMUpgradeGUITestButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		});
		guistate.put("button:button_empty9", button_empty9);
		this.addRenderableWidget(button_empty9);
		button_empty10 = new Button(this.leftPos + 107, this.topPos + 119, 82, 20, Component.translatable("gui.minebound.mm_upgrade_gui_test.button_empty10"), e -> {
			if (true) {
				MineboundMod.PACKET_HANDLER.sendToServer(new MMUpgradeGUITestButtonMessage(10, x, y, z));
				MMUpgradeGUITestButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		});
		guistate.put("button:button_empty10", button_empty10);
		this.addRenderableWidget(button_empty10);
		button_empty11 = new Button(this.leftPos + 107, this.topPos + 146, 82, 20, Component.translatable("gui.minebound.mm_upgrade_gui_test.button_empty11"), e -> {
			if (true) {
				MineboundMod.PACKET_HANDLER.sendToServer(new MMUpgradeGUITestButtonMessage(11, x, y, z));
				MMUpgradeGUITestButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		});
		guistate.put("button:button_empty11", button_empty11);
		this.addRenderableWidget(button_empty11);
	}
}
