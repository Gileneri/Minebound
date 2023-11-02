
package net.mcreator.minebound.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.minebound.entity.PunchyMobEntity;
import net.mcreator.minebound.client.model.Modelmb_blockIndicatorEntity;

public class PunchyMobRenderer extends MobRenderer<PunchyMobEntity, Modelmb_blockIndicatorEntity<PunchyMobEntity>> {
	public PunchyMobRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmb_blockIndicatorEntity(context.bakeLayer(Modelmb_blockIndicatorEntity.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(PunchyMobEntity entity) {
		return new ResourceLocation("minebound:textures/entities/white_entity_texture.png");
	}
}
