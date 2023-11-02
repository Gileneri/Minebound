// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelmechTest_body<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mechtest_body"), "main");
	private final ModelPart body_bone;

	public ModelmechTest_body(ModelPart root) {
		this.body_bone = root.getChild("body_bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body_bone = partdefinition.addOrReplaceChild("body_bone", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-16.0F, -64.0F, -16.0F, 32.0F, 40.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body_bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}