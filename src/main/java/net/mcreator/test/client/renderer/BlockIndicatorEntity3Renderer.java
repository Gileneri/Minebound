
package net.mcreator.test.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.test.entity.BlockIndicatorEntity3Entity;
import net.mcreator.test.client.model.Modelmb_blockIndicatorEntity;

public class BlockIndicatorEntity3Renderer extends MobRenderer<BlockIndicatorEntity3Entity, Modelmb_blockIndicatorEntity<BlockIndicatorEntity3Entity>> {
	public BlockIndicatorEntity3Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelmb_blockIndicatorEntity(context.bakeLayer(Modelmb_blockIndicatorEntity.LAYER_LOCATION)), 0f);
		this.addLayer(new EyesLayer<BlockIndicatorEntity3Entity, Modelmb_blockIndicatorEntity<BlockIndicatorEntity3Entity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("test:textures/entities/block_indicator_entity_texture3.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(BlockIndicatorEntity3Entity entity) {
		return new ResourceLocation("test:textures/entities/invisible_entity_texture.png");
	}
}
