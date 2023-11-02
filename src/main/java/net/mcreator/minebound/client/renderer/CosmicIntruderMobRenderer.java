
package net.mcreator.minebound.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.minebound.entity.CosmicIntruderMobEntity;
import net.mcreator.minebound.client.model.Modelmb_blockIndicatorEntity;

public class CosmicIntruderMobRenderer extends MobRenderer<CosmicIntruderMobEntity, Modelmb_blockIndicatorEntity<CosmicIntruderMobEntity>> {
	public CosmicIntruderMobRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmb_blockIndicatorEntity(context.bakeLayer(Modelmb_blockIndicatorEntity.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CosmicIntruderMobEntity entity) {
		return new ResourceLocation("minebound:textures/entities/white_entity_texture.png");
	}
}
