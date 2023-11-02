// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelmechTest_legRight<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mechtest_legright"), "main");
	private final ModelPart leg_bone_right;

	public ModelmechTest_legRight(ModelPart root) {
		this.leg_bone_right = root.getChild("leg_bone_right");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition leg_bone_right = partdefinition.addOrReplaceChild("leg_bone_right",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-18.0F, 0.0F, -6.0F, 12.0F, 24.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 2.0F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		leg_bone_right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.leg_bone_right.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}