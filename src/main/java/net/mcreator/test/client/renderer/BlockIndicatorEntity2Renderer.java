
package net.mcreator.test.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.test.entity.BlockIndicatorEntity2Entity;
import net.mcreator.test.client.model.Modelmb_blockIndicatorEntity;

public class BlockIndicatorEntity2Renderer extends MobRenderer<BlockIndicatorEntity2Entity, Modelmb_blockIndicatorEntity<BlockIndicatorEntity2Entity>> {
	public BlockIndicatorEntity2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelmb_blockIndicatorEntity(context.bakeLayer(Modelmb_blockIndicatorEntity.LAYER_LOCATION)), 0f);
		this.addLayer(new EyesLayer<BlockIndicatorEntity2Entity, Modelmb_blockIndicatorEntity<BlockIndicatorEntity2Entity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("test:textures/entities/blockindicatorentity_texture2.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(BlockIndicatorEntity2Entity entity) {
		return new ResourceLocation("test:textures/entities/invisible_entity_texture.png");
	}
}
