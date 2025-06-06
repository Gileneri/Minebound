
package net.mcreator.minebound.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.minebound.entity.MechTestBodyEntity;
import net.mcreator.minebound.client.model.ModelmechTest_body;

public class MechTestBodyRenderer extends MobRenderer<MechTestBodyEntity, ModelmechTest_body<MechTestBodyEntity>> {
	public MechTestBodyRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelmechTest_body(context.bakeLayer(ModelmechTest_body.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MechTestBodyEntity entity) {
		return new ResourceLocation("minebound:textures/entities/mechtestbody_texture.png");
	}
}
