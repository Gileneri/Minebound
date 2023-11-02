
package net.mcreator.minebound.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.minebound.entity.CrustoiseMobChargingEntity;
import net.mcreator.minebound.client.model.Modelmb_blockIndicatorEntity;

public class CrustoiseMobChargingRenderer extends MobRenderer<CrustoiseMobChargingEntity, Modelmb_blockIndicatorEntity<CrustoiseMobChargingEntity>> {
	public CrustoiseMobChargingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmb_blockIndicatorEntity(context.bakeLayer(Modelmb_blockIndicatorEntity.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrustoiseMobChargingEntity entity) {
		return new ResourceLocation("minebound:textures/entities/white_entity_texture.png");
	}
}
