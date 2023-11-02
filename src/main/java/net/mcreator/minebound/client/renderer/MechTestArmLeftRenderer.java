
package net.mcreator.minebound.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.minebound.entity.MechTestArmLeftEntity;
import net.mcreator.minebound.client.model.ModelmechTest_armLeft;

public class MechTestArmLeftRenderer extends MobRenderer<MechTestArmLeftEntity, ModelmechTest_armLeft<MechTestArmLeftEntity>> {
	public MechTestArmLeftRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelmechTest_armLeft(context.bakeLayer(ModelmechTest_armLeft.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(MechTestArmLeftEntity entity) {
		return new ResourceLocation("minebound:textures/entities/white_entity_texture.png");
	}
}
