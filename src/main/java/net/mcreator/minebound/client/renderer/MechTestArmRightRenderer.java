
package net.mcreator.minebound.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.minebound.entity.MechTestArmRightEntity;
import net.mcreator.minebound.client.model.ModelmechTest_armRight;

public class MechTestArmRightRenderer extends MobRenderer<MechTestArmRightEntity, ModelmechTest_armRight<MechTestArmRightEntity>> {
	public MechTestArmRightRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelmechTest_armRight(context.bakeLayer(ModelmechTest_armRight.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(MechTestArmRightEntity entity) {
		return new ResourceLocation("minebound:textures/entities/white_entity_texture.png");
	}
}
