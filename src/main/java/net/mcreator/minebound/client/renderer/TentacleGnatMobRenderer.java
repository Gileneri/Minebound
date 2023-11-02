
package net.mcreator.minebound.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.minebound.entity.TentacleGnatMobEntity;
import net.mcreator.minebound.client.model.Modelmb_blockIndicatorEntity;

public class TentacleGnatMobRenderer extends MobRenderer<TentacleGnatMobEntity, Modelmb_blockIndicatorEntity<TentacleGnatMobEntity>> {
	public TentacleGnatMobRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmb_blockIndicatorEntity(context.bakeLayer(Modelmb_blockIndicatorEntity.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TentacleGnatMobEntity entity) {
		return new ResourceLocation("minebound:textures/entities/white_entity_texture.png");
	}
}
