
package net.mcreator.minebound.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.minebound.entity.BlockIndicatorEntity1Entity;
import net.mcreator.minebound.client.model.Modelmb_blockIndicatorEntity;

public class BlockIndicatorEntity1Renderer extends MobRenderer<BlockIndicatorEntity1Entity, Modelmb_blockIndicatorEntity<BlockIndicatorEntity1Entity>> {
	public BlockIndicatorEntity1Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelmb_blockIndicatorEntity(context.bakeLayer(Modelmb_blockIndicatorEntity.LAYER_LOCATION)), 0f);
		this.addLayer(new EyesLayer<BlockIndicatorEntity1Entity, Modelmb_blockIndicatorEntity<BlockIndicatorEntity1Entity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("minebound:textures/entities/blockindicatorentity_texture1.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(BlockIndicatorEntity1Entity entity) {
		return new ResourceLocation("minebound:textures/entities/invisible_entity_texture.png");
	}
}
