
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.test.client.model.ModelmechTest_legRight;
import net.mcreator.test.client.model.ModelmechTest_legLeft;
import net.mcreator.test.client.model.ModelmechTest_body;
import net.mcreator.test.client.model.ModelmechTest_armRight;
import net.mcreator.test.client.model.ModelmechTest_armLeft;
import net.mcreator.test.client.model.Modelmb_blockIndicatorEntity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class TestModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelmechTest_body.LAYER_LOCATION, ModelmechTest_body::createBodyLayer);
		event.registerLayerDefinition(ModelmechTest_legLeft.LAYER_LOCATION, ModelmechTest_legLeft::createBodyLayer);
		event.registerLayerDefinition(ModelmechTest_legRight.LAYER_LOCATION, ModelmechTest_legRight::createBodyLayer);
		event.registerLayerDefinition(ModelmechTest_armLeft.LAYER_LOCATION, ModelmechTest_armLeft::createBodyLayer);
		event.registerLayerDefinition(Modelmb_blockIndicatorEntity.LAYER_LOCATION, Modelmb_blockIndicatorEntity::createBodyLayer);
		event.registerLayerDefinition(ModelmechTest_armRight.LAYER_LOCATION, ModelmechTest_armRight::createBodyLayer);
	}
}
