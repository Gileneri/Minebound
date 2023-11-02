
package net.mcreator.minebound.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.minebound.procedures.HUDDisplayEnergy9Procedure;
import net.mcreator.minebound.procedures.HUDDisplayEnergy8Procedure;
import net.mcreator.minebound.procedures.HUDDisplayEnergy7Procedure;
import net.mcreator.minebound.procedures.HUDDisplayEnergy6Procedure;
import net.mcreator.minebound.procedures.HUDDisplayEnergy5Procedure;
import net.mcreator.minebound.procedures.HUDDisplayEnergy4Procedure;
import net.mcreator.minebound.procedures.HUDDisplayEnergy3Procedure;
import net.mcreator.minebound.procedures.HUDDisplayEnergy30Procedure;
import net.mcreator.minebound.procedures.HUDDisplayEnergy2Procedure;
import net.mcreator.minebound.procedures.HUDDisplayEnergy29Procedure;
import net.mcreator.minebound.procedures.HUDDisplayEnergy28Procedure;
import net.mcreator.minebound.procedures.HUDDisplayEnergy27Procedure;
import net.mcreator.minebound.procedures.HUDDisplayEnergy26Procedure;
import net.mcreator.minebound.procedures.HUDDisplayEnergy25Procedure;
import net.mcreator.minebound.procedures.HUDDisplayEnergy24Procedure;
import net.mcreator.minebound.procedures.HUDDisplayEnergy23Procedure;
import net.mcreator.minebound.procedures.HUDDisplayEnergy22Procedure;
import net.mcreator.minebound.procedures.HUDDisplayEnergy21Procedure;
import net.mcreator.minebound.procedures.HUDDisplayEnergy20Procedure;
import net.mcreator.minebound.procedures.HUDDisplayEnergy1Procedure;
import net.mcreator.minebound.procedures.HUDDisplayEnergy19Procedure;
import net.mcreator.minebound.procedures.HUDDisplayEnergy18Procedure;
import net.mcreator.minebound.procedures.HUDDisplayEnergy17Procedure;
import net.mcreator.minebound.procedures.HUDDisplayEnergy16Procedure;
import net.mcreator.minebound.procedures.HUDDisplayEnergy15Procedure;
import net.mcreator.minebound.procedures.HUDDisplayEnergy14Procedure;
import net.mcreator.minebound.procedures.HUDDisplayEnergy13Procedure;
import net.mcreator.minebound.procedures.HUDDisplayEnergy12Procedure;
import net.mcreator.minebound.procedures.HUDDisplayEnergy11Procedure;
import net.mcreator.minebound.procedures.HUDDisplayEnergy10Procedure;
import net.mcreator.minebound.procedures.AllowBlueEnergyUIProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class HUDBlueEnergyOverlay {
	@SubscribeEvent(priority = EventPriority.LOWEST)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		int posX = 0;
        int posY = 0;
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level;
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (AllowBlueEnergyUIProcedure.execute(entity)) {
			if (HUDDisplayEnergy1Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_blue_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 88, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy2Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_blue_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 86, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy3Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_blue_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 84, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy4Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_blue_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 82, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy5Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_blue_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 80, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy6Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_blue_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 78, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy7Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_blue_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 76, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy8Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_blue_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 74, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy9Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_blue_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 72, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy10Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_blue_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 70, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy11Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_blue_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 68, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy12Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_blue_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 66, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy13Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_blue_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 64, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy14Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_blue_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 62, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy15Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_blue_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 60, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy16Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_blue_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 58, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy17Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_blue_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 56, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy18Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_blue_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 54, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy19Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_blue_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 52, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy20Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_blue_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 50, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy21Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_blue_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 48, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy22Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_blue_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 46, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy23Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_blue_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 44, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy24Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_blue_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 42, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy25Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_blue_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 40, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy26Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_blue_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 38, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy27Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_blue_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 36, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy28Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_blue_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 34, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy29Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_blue_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 32, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy30Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_blue_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 30, posY + 21, 0, 0, 2, 7, 2, 7);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
