
package net.mcreator.minebound.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.minebound.entity.TentacleBombMobEntity;
import net.mcreator.minebound.client.model.Modelmb_blockIndicatorEntity;

public class TentacleBombMobRenderer extends MobRenderer<TentacleBombMobEntity, Modelmb_blockIndicatorEntity<TentacleBombMobEntity>> {
	public TentacleBombMobRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmb_blockIndicatorEntity(context.bakeLayer(Modelmb_blockIndicatorEntity.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TentacleBombMobEntity entity) {
		return new ResourceLocation("minebound:textures/entities/white_entity_texture.png");
	}
}
