
package net.mcreator.minebound.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.minebound.procedures.ReturnPlayerModelProcedure;
import net.mcreator.minebound.procedures.ReturnPlayerDisplayNameProcedure;
import net.mcreator.minebound.procedures.HUDDisplayHealth9Procedure;
import net.mcreator.minebound.procedures.HUDDisplayHealth8Procedure;
import net.mcreator.minebound.procedures.HUDDisplayHealth7Procedure;
import net.mcreator.minebound.procedures.HUDDisplayHealth6Procedure;
import net.mcreator.minebound.procedures.HUDDisplayHealth5Procedure;
import net.mcreator.minebound.procedures.HUDDisplayHealth4Procedure;
import net.mcreator.minebound.procedures.HUDDisplayHealth3Procedure;
import net.mcreator.minebound.procedures.HUDDisplayHealth30Procedure;
import net.mcreator.minebound.procedures.HUDDisplayHealth2Procedure;
import net.mcreator.minebound.procedures.HUDDisplayHealth29Procedure;
import net.mcreator.minebound.procedures.HUDDisplayHealth28Procedure;
import net.mcreator.minebound.procedures.HUDDisplayHealth27Procedure;
import net.mcreator.minebound.procedures.HUDDisplayHealth26Procedure;
import net.mcreator.minebound.procedures.HUDDisplayHealth25Procedure;
import net.mcreator.minebound.procedures.HUDDisplayHealth24Procedure;
import net.mcreator.minebound.procedures.HUDDisplayHealth23Procedure;
import net.mcreator.minebound.procedures.HUDDisplayHealth22Procedure;
import net.mcreator.minebound.procedures.HUDDisplayHealth21Procedure;
import net.mcreator.minebound.procedures.HUDDisplayHealth20Procedure;
import net.mcreator.minebound.procedures.HUDDisplayHealth1Procedure;
import net.mcreator.minebound.procedures.HUDDisplayHealth19Procedure;
import net.mcreator.minebound.procedures.HUDDisplayHealth18Procedure;
import net.mcreator.minebound.procedures.HUDDisplayHealth17Procedure;
import net.mcreator.minebound.procedures.HUDDisplayHealth16Procedure;
import net.mcreator.minebound.procedures.HUDDisplayHealth15Procedure;
import net.mcreator.minebound.procedures.HUDDisplayHealth14Procedure;
import net.mcreator.minebound.procedures.HUDDisplayHealth13Procedure;
import net.mcreator.minebound.procedures.HUDDisplayHealth12Procedure;
import net.mcreator.minebound.procedures.HUDDisplayHealth11Procedure;
import net.mcreator.minebound.procedures.HUDDisplayHealth10Procedure;
import net.mcreator.minebound.procedures.HUDDisplayFood9Procedure;
import net.mcreator.minebound.procedures.HUDDisplayFood8Procedure;
import net.mcreator.minebound.procedures.HUDDisplayFood7Procedure;
import net.mcreator.minebound.procedures.HUDDisplayFood6Procedure;
import net.mcreator.minebound.procedures.HUDDisplayFood5Procedure;
import net.mcreator.minebound.procedures.HUDDisplayFood4Procedure;
import net.mcreator.minebound.procedures.HUDDisplayFood3Procedure;
import net.mcreator.minebound.procedures.HUDDisplayFood2Procedure;
import net.mcreator.minebound.procedures.HUDDisplayFood20Procedure;
import net.mcreator.minebound.procedures.HUDDisplayFood1Procedure;
import net.mcreator.minebound.procedures.HUDDisplayFood19Procedure;
import net.mcreator.minebound.procedures.HUDDisplayFood18Procedure;
import net.mcreator.minebound.procedures.HUDDisplayFood17Procedure;
import net.mcreator.minebound.procedures.HUDDisplayFood16Procedure;
import net.mcreator.minebound.procedures.HUDDisplayFood15Procedure;
import net.mcreator.minebound.procedures.HUDDisplayFood14Procedure;
import net.mcreator.minebound.procedures.HUDDisplayFood13Procedure;
import net.mcreator.minebound.procedures.HUDDisplayFood12Procedure;
import net.mcreator.minebound.procedures.HUDDisplayFood11Procedure;
import net.mcreator.minebound.procedures.HUDDisplayFood10Procedure;
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
import net.mcreator.minebound.procedures.AllowIfInSurvivalOrAdventureModeProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class TopLeftHUDUIOverlay {
	@SubscribeEvent(priority = EventPriority.LOW)
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
		if (AllowIfInSurvivalOrAdventureModeProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_main.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 0, posY + 0, 0, 0, 103, 34, 103, 34);

			if (HUDDisplayHealth1Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_health_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 88, posY + 13, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayHealth2Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_health_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 86, posY + 13, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayHealth3Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_health_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 84, posY + 13, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayHealth4Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_health_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 82, posY + 13, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayHealth5Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_health_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 80, posY + 13, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayHealth6Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_health_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 78, posY + 13, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayHealth7Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_health_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 76, posY + 13, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayHealth8Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_health_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 74, posY + 13, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayHealth9Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_health_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 72, posY + 13, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayHealth10Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_health_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 70, posY + 13, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayHealth11Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_health_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 68, posY + 13, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayHealth12Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_health_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 66, posY + 13, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayHealth13Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_health_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 64, posY + 13, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayHealth14Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_health_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 62, posY + 13, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayHealth15Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_health_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 60, posY + 13, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayHealth16Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_health_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 58, posY + 13, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayHealth17Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_health_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 56, posY + 13, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayHealth18Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_health_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 54, posY + 13, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayHealth19Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_health_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 52, posY + 13, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayHealth20Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_health_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 50, posY + 13, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayHealth21Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_health_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 48, posY + 13, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayHealth22Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_health_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 46, posY + 13, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayHealth23Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_health_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 44, posY + 13, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayHealth24Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_health_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 42, posY + 13, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayHealth25Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_health_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 40, posY + 13, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayHealth26Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_health_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 38, posY + 13, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayHealth27Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_health_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 36, posY + 13, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayHealth28Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_health_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 34, posY + 13, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayHealth29Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_health_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 32, posY + 13, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayHealth30Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_health_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 30, posY + 13, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayFood1Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_food_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 67, posY + 29, 0, 0, 2, 3, 2, 3);
			}
			if (HUDDisplayFood2Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_food_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 65, posY + 29, 0, 0, 2, 3, 2, 3);
			}
			if (HUDDisplayFood3Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_food_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 63, posY + 29, 0, 0, 2, 3, 2, 3);
			}
			if (HUDDisplayFood4Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_food_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 61, posY + 29, 0, 0, 2, 3, 2, 3);
			}
			if (HUDDisplayFood5Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_food_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 59, posY + 29, 0, 0, 2, 3, 2, 3);
			}
			if (HUDDisplayFood6Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_food_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 57, posY + 29, 0, 0, 2, 3, 2, 3);
			}
			if (HUDDisplayFood7Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_food_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 55, posY + 29, 0, 0, 2, 3, 2, 3);
			}
			if (HUDDisplayFood8Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_food_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 53, posY + 29, 0, 0, 2, 3, 2, 3);
			}
			if (HUDDisplayFood9Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_food_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 51, posY + 29, 0, 0, 2, 3, 2, 3);
			}
			if (HUDDisplayFood10Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_food_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 49, posY + 29, 0, 0, 2, 3, 2, 3);
			}
			if (HUDDisplayFood11Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_food_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 47, posY + 29, 0, 0, 2, 3, 2, 3);
			}
			if (HUDDisplayFood12Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_food_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 45, posY + 29, 0, 0, 2, 3, 2, 3);
			}
			if (HUDDisplayFood13Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_food_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 43, posY + 29, 0, 0, 2, 3, 2, 3);
			}
			if (HUDDisplayFood14Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_food_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 41, posY + 29, 0, 0, 2, 3, 2, 3);
			}
			if (HUDDisplayFood15Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_food_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 39, posY + 29, 0, 0, 2, 3, 2, 3);
			}
			if (HUDDisplayFood16Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_food_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 37, posY + 29, 0, 0, 2, 3, 2, 3);
			}
			if (HUDDisplayFood17Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_food_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 35, posY + 29, 0, 0, 2, 3, 2, 3);
			}
			if (HUDDisplayFood18Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_food_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 33, posY + 29, 0, 0, 2, 3, 2, 3);
			}
			if (HUDDisplayFood19Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_food_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 31, posY + 29, 0, 0, 2, 3, 2, 3);
			}
			if (HUDDisplayFood20Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_food_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 29, posY + 29, 0, 0, 2, 3, 2, 3);
			}
			if (HUDDisplayEnergy1Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 88, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy2Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 86, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy3Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 84, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy4Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 82, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy5Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 80, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy6Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 78, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy7Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 76, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy8Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 74, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy9Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 72, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy10Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 70, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy11Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 68, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy12Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 66, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy13Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 64, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy14Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 62, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy15Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 60, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy16Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 58, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy17Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 56, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy18Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 54, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy19Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 52, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy20Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 50, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy21Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 48, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy22Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 46, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy23Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 44, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy24Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 42, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy25Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 40, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy26Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 38, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy27Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 36, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy28Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 34, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy29Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_right.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 32, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			if (HUDDisplayEnergy30Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("minebound:textures/screens/hud_ui_energy_left.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 30, posY + 21, 0, 0, 2, 7, 2, 7);
			}
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					ReturnPlayerDisplayNameProcedure.execute(entity), posX + 33, posY + 3, -1);
			if (ReturnPlayerModelProcedure.execute(world, entity) instanceof LivingEntity livingEntity) {
				InventoryScreen.renderEntityInInventoryRaw(posX + 16, posY + 68, 27, -0.6f, 0, livingEntity);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
