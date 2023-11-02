
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.test.entity.MechTestLegRightEntity;
import net.mcreator.test.entity.MechTestLegLeftEntity;
import net.mcreator.test.entity.MechTestBodyEntity;
import net.mcreator.test.entity.MechTestArmRightEntity;
import net.mcreator.test.entity.MechTestArmLeftEntity;
import net.mcreator.test.entity.BlockIndicatorEntity3Entity;
import net.mcreator.test.entity.BlockIndicatorEntity2Entity;
import net.mcreator.test.entity.BlockIndicatorEntity1Entity;
import net.mcreator.test.TestMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TestModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TestMod.MODID);
	public static final RegistryObject<EntityType<MechTestBodyEntity>> MECH_TEST_BODY = register("mech_test_body",
			EntityType.Builder.<MechTestBodyEntity>of(MechTestBodyEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(MechTestBodyEntity::new)

					.sized(3f, 4f));
	public static final RegistryObject<EntityType<MechTestArmLeftEntity>> MECH_TEST_ARM_LEFT = register("mech_test_arm_left",
			EntityType.Builder.<MechTestArmLeftEntity>of(MechTestArmLeftEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(MechTestArmLeftEntity::new)

					.sized(0.3f, 2.5f));
	public static final RegistryObject<EntityType<MechTestArmRightEntity>> MECH_TEST_ARM_RIGHT = register("mech_test_arm_right",
			EntityType.Builder.<MechTestArmRightEntity>of(MechTestArmRightEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(MechTestArmRightEntity::new)

					.sized(0.3f, 2.5f));
	public static final RegistryObject<EntityType<MechTestLegLeftEntity>> MECH_TEST_LEG_LEFT = register("mech_test_leg_left",
			EntityType.Builder.<MechTestLegLeftEntity>of(MechTestLegLeftEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(MechTestLegLeftEntity::new)

					.sized(0.3f, 2.5f));
	public static final RegistryObject<EntityType<MechTestLegRightEntity>> MECH_TEST_LEG_RIGHT = register("mech_test_leg_right",
			EntityType.Builder.<MechTestLegRightEntity>of(MechTestLegRightEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(MechTestLegRightEntity::new)

					.sized(0.3f, 2.5f));
	public static final RegistryObject<EntityType<BlockIndicatorEntity2Entity>> BLOCK_INDICATOR_ENTITY_2 = register("block_indicator_entity_2", EntityType.Builder.<BlockIndicatorEntity2Entity>of(BlockIndicatorEntity2Entity::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlockIndicatorEntity2Entity::new).fireImmune().sized(1.01f, 1.01f));
	public static final RegistryObject<EntityType<BlockIndicatorEntity3Entity>> BLOCK_INDICATOR_ENTITY_3 = register("block_indicator_entity_3", EntityType.Builder.<BlockIndicatorEntity3Entity>of(BlockIndicatorEntity3Entity::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlockIndicatorEntity3Entity::new).fireImmune().sized(1.01f, 1.01f));
	public static final RegistryObject<EntityType<BlockIndicatorEntity1Entity>> BLOCK_INDICATOR_ENTITY_1 = register("block_indicator_entity_1", EntityType.Builder.<BlockIndicatorEntity1Entity>of(BlockIndicatorEntity1Entity::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlockIndicatorEntity1Entity::new).fireImmune().sized(1.01f, 1.01f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			MechTestBodyEntity.init();
			MechTestArmLeftEntity.init();
			MechTestArmRightEntity.init();
			MechTestLegLeftEntity.init();
			MechTestLegRightEntity.init();
			BlockIndicatorEntity2Entity.init();
			BlockIndicatorEntity3Entity.init();
			BlockIndicatorEntity1Entity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MECH_TEST_BODY.get(), MechTestBodyEntity.createAttributes().build());
		event.put(MECH_TEST_ARM_LEFT.get(), MechTestArmLeftEntity.createAttributes().build());
		event.put(MECH_TEST_ARM_RIGHT.get(), MechTestArmRightEntity.createAttributes().build());
		event.put(MECH_TEST_LEG_LEFT.get(), MechTestLegLeftEntity.createAttributes().build());
		event.put(MECH_TEST_LEG_RIGHT.get(), MechTestLegRightEntity.createAttributes().build());
		event.put(BLOCK_INDICATOR_ENTITY_2.get(), BlockIndicatorEntity2Entity.createAttributes().build());
		event.put(BLOCK_INDICATOR_ENTITY_3.get(), BlockIndicatorEntity3Entity.createAttributes().build());
		event.put(BLOCK_INDICATOR_ENTITY_1.get(), BlockIndicatorEntity1Entity.createAttributes().build());
	}
}
