
package net.mcreator.minebound.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.minebound.entity.MechTestLegLeftEntity;
import net.mcreator.minebound.client.model.ModelmechTest_legLeft;

public class MechTestLegLeftRenderer extends MobRenderer<MechTestLegLeftEntity, ModelmechTest_legLeft<MechTestLegLeftEntity>> {
	public MechTestLegLeftRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelmechTest_legLeft(context.bakeLayer(ModelmechTest_legLeft.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(MechTestLegLeftEntity entity) {
		return new ResourceLocation("minebound:textures/entities/white_entity_texture.png");
	}
}
