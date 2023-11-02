
package net.mcreator.minebound.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.minebound.entity.RacerMob5Entity;

public class RacerMob5Renderer extends HumanoidMobRenderer<RacerMob5Entity, HumanoidModel<RacerMob5Entity>> {
	public RacerMob5Renderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
		this.addLayer(new EyesLayer<RacerMob5Entity, HumanoidModel<RacerMob5Entity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("minebound:textures/entities/blockindicatorentity_texture1.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(RacerMob5Entity entity) {
		return new ResourceLocation("minebound:textures/entities/white_entity_texture.png");
	}
}
