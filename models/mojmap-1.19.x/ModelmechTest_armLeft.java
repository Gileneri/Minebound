// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelmechTest_armLeft<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mechtest_armleft"), "main");
	private final ModelPart arm_socket_left;

	public ModelmechTest_armLeft(ModelPart root) {
		this.arm_socket_left = root.getChild("arm_socket_left");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition arm_socket_left = partdefinition.addOrReplaceChild("arm_socket_left", CubeListBuilder.create(),
				PartPose.offset(13.0F, -25.0F, 2.0F));

		PartDefinition arm_bone_left = arm_socket_left
				.addOrReplaceChild("arm_bone_left",
						CubeListBuilder.create().texOffs(0, 0).addBox(10.0F, -4.0F, -6.0F, 8.0F, 32.0F, 12.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-7.0F, 5.0F, 3.0F, -1.309F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		arm_socket_left.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.arm_socket_left.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}