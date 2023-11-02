
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.test.client.renderer.MechTestLegRightRenderer;
import net.mcreator.test.client.renderer.MechTestLegLeftRenderer;
import net.mcreator.test.client.renderer.MechTestBodyRenderer;
import net.mcreator.test.client.renderer.MechTestArmRightRenderer;
import net.mcreator.test.client.renderer.MechTestArmLeftRenderer;
import net.mcreator.test.client.renderer.BlockIndicatorEntity3Renderer;
import net.mcreator.test.client.renderer.BlockIndicatorEntity2Renderer;
import net.mcreator.test.client.renderer.BlockIndicatorEntity1Renderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TestModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TestModEntities.MECH_TEST_BODY.get(), MechTestBodyRenderer::new);
		event.registerEntityRenderer(TestModEntities.MECH_TEST_ARM_LEFT.get(), MechTestArmLeftRenderer::new);
		event.registerEntityRenderer(TestModEntities.MECH_TEST_ARM_RIGHT.get(), MechTestArmRightRenderer::new);
		event.registerEntityRenderer(TestModEntities.MECH_TEST_LEG_LEFT.get(), MechTestLegLeftRenderer::new);
		event.registerEntityRenderer(TestModEntities.MECH_TEST_LEG_RIGHT.get(), MechTestLegRightRenderer::new);
		event.registerEntityRenderer(TestModEntities.BLOCK_INDICATOR_ENTITY_2.get(), BlockIndicatorEntity2Renderer::new);
		event.registerEntityRenderer(TestModEntities.BLOCK_INDICATOR_ENTITY_3.get(), BlockIndicatorEntity3Renderer::new);
		event.registerEntityRenderer(TestModEntities.BLOCK_INDICATOR_ENTITY_1.get(), BlockIndicatorEntity1Renderer::new);
	}
}
