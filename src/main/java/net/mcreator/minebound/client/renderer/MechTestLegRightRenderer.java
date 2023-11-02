
package net.mcreator.minebound.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.minebound.entity.MechTestLegRightEntity;
import net.mcreator.minebound.client.model.ModelmechTest_legRight;

public class MechTestLegRightRenderer extends MobRenderer<MechTestLegRightEntity, ModelmechTest_legRight<MechTestLegRightEntity>> {
	public MechTestLegRightRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelmechTest_legRight(context.bakeLayer(ModelmechTest_legRight.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(MechTestLegRightEntity entity) {
		return new ResourceLocation("minebound:textures/entities/white_entity_texture.png");
	}
}
