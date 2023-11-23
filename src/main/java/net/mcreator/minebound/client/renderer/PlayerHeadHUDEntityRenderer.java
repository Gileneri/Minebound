
package net.mcreator.minebound.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.minebound.entity.PlayerHeadHUDEntityEntity;

public class PlayerHeadHUDEntityRenderer extends HumanoidMobRenderer<PlayerHeadHUDEntityEntity, HumanoidModel<PlayerHeadHUDEntityEntity>> {
	public PlayerHeadHUDEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(PlayerHeadHUDEntityEntity entity) {
		return new ResourceLocation("minebound:textures/entities/invisible_entity_texture.png");
	}
}
