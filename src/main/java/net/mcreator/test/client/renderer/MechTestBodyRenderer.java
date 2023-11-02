
package net.mcreator.test.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.test.entity.MechTestBodyEntity;
import net.mcreator.test.client.model.ModelmechTest_body;

public class MechTestBodyRenderer extends MobRenderer<MechTestBodyEntity, ModelmechTest_body<MechTestBodyEntity>> {
	public MechTestBodyRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelmechTest_body(context.bakeLayer(ModelmechTest_body.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MechTestBodyEntity entity) {
		return new ResourceLocation("test:textures/entities/mechtestbody_texture.png");
	}
}
