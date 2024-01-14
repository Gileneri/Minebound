
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minebound.init;

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

import net.mcreator.minebound.entity.YokatMobEntity;
import net.mcreator.minebound.entity.WisperMobEntity;
import net.mcreator.minebound.entity.VoltipMobEntity;
import net.mcreator.minebound.entity.TwigunMobEntity;
import net.mcreator.minebound.entity.TriplodMobEntity;
import net.mcreator.minebound.entity.TrifangleMobEntity;
import net.mcreator.minebound.entity.TrictusMobRestingEntity;
import net.mcreator.minebound.entity.TrictusMobEntity;
import net.mcreator.minebound.entity.ToumingoMobEntity;
import net.mcreator.minebound.entity.TinticMobEntity;
import net.mcreator.minebound.entity.TentacleSpawnerMobEntity;
import net.mcreator.minebound.entity.TentacleGnatMobEntity;
import net.mcreator.minebound.entity.TentacleGhostMobEntity;
import net.mcreator.minebound.entity.TentacleCrawlerMobEntity;
import net.mcreator.minebound.entity.TentacleClamMobEntity;
import net.mcreator.minebound.entity.TentacleBombMobEntity;
import net.mcreator.minebound.entity.TaroniMobEntity;
import net.mcreator.minebound.entity.SwarpionMobEntity;
import net.mcreator.minebound.entity.SqueemMobEntity;
import net.mcreator.minebound.entity.SporgusMobEntity;
import net.mcreator.minebound.entity.SpookitMobEntity;
import net.mcreator.minebound.entity.SpinemineMobEntity;
import net.mcreator.minebound.entity.SnuffishMobEntity;
import net.mcreator.minebound.entity.SnauntMobEntity;
import net.mcreator.minebound.entity.SnagglerMobEntity;
import net.mcreator.minebound.entity.SmoglinMobEntity;
import net.mcreator.minebound.entity.SkimbusMobEntity;
import net.mcreator.minebound.entity.ScaveranMobEntity;
import net.mcreator.minebound.entity.ScandroidMobEntity;
import net.mcreator.minebound.entity.ScandroidMobChargingEntity;
import net.mcreator.minebound.entity.RustickMobEntity;
import net.mcreator.minebound.entity.RobotChickenMobEntity;
import net.mcreator.minebound.entity.RingramMobEntity;
import net.mcreator.minebound.entity.RacerMob6Entity;
import net.mcreator.minebound.entity.RacerMob5Entity;
import net.mcreator.minebound.entity.RacerMob4Entity;
import net.mcreator.minebound.entity.RacerMob3Entity;
import net.mcreator.minebound.entity.RacerMob2Entity;
import net.mcreator.minebound.entity.RacerMob1Entity;
import net.mcreator.minebound.entity.QuagmuttMobEntity;
import net.mcreator.minebound.entity.PyromantleMobEntity;
import net.mcreator.minebound.entity.PunchyMobEntity;
import net.mcreator.minebound.entity.PulpinMobEntity;
import net.mcreator.minebound.entity.PoptopMobEntity;
import net.mcreator.minebound.entity.PolingMobEntity;
import net.mcreator.minebound.entity.PoletMobEntity;
import net.mcreator.minebound.entity.PoMobEntity;
import net.mcreator.minebound.entity.PoGolemMobEntity;
import net.mcreator.minebound.entity.PlayerHeadHUDEntityEntity;
import net.mcreator.minebound.entity.PipkinMobEntity;
import net.mcreator.minebound.entity.PetropodMobEntity;
import net.mcreator.minebound.entity.PetricubMobEntity;
import net.mcreator.minebound.entity.PeblitMobRestingEntity;
import net.mcreator.minebound.entity.PeblitMobEntity;
import net.mcreator.minebound.entity.ParatailMobEntity;
import net.mcreator.minebound.entity.ParaspriteMobEntity;
import net.mcreator.minebound.entity.OrbideMobRestingEntity;
import net.mcreator.minebound.entity.OrbideMobEntity;
import net.mcreator.minebound.entity.OoglerMobEntity;
import net.mcreator.minebound.entity.OmnicannonMobEntity;
import net.mcreator.minebound.entity.OculobMobEntity;
import net.mcreator.minebound.entity.NutmidgelingMobEntity;
import net.mcreator.minebound.entity.NutmidgeMobEntity;
import net.mcreator.minebound.entity.NutmidgeMobChargingEntity;
import net.mcreator.minebound.entity.NarfinMobEntity;
import net.mcreator.minebound.entity.MotherPoptopMobEntity;
import net.mcreator.minebound.entity.MooshiMobEntity;
import net.mcreator.minebound.entity.MoontantMobEntity;
import net.mcreator.minebound.entity.MonopusMobEntity;
import net.mcreator.minebound.entity.MonopusMobChargingEntity;
import net.mcreator.minebound.entity.MiniDroneMobEntity;
import net.mcreator.minebound.entity.MiasmopMobEntity;
import net.mcreator.minebound.entity.MechTestLegRightEntity;
import net.mcreator.minebound.entity.MechTestLegLeftEntity;
import net.mcreator.minebound.entity.MechTestBodyEntity;
import net.mcreator.minebound.entity.MechTestArmRightEntity;
import net.mcreator.minebound.entity.MechTestArmLeftEntity;
import net.mcreator.minebound.entity.MasteroidMobSEntity;
import net.mcreator.minebound.entity.MasteroidMobMEntity;
import net.mcreator.minebound.entity.MasteroidMobLEntity;
import net.mcreator.minebound.entity.MasteroidMobEntity;
import net.mcreator.minebound.entity.MandrafloraMobEntity;
import net.mcreator.minebound.entity.LumothMobEntity;
import net.mcreator.minebound.entity.LilodonMobEntity;
import net.mcreator.minebound.entity.KluexTotemMobEntity;
import net.mcreator.minebound.entity.KluexSentryMobEntity;
import net.mcreator.minebound.entity.KingNutmidgelingMobEntity;
import net.mcreator.minebound.entity.IxolingMobEntity;
import net.mcreator.minebound.entity.IguarmorMobEntity;
import net.mcreator.minebound.entity.IgnomeMobEntity;
import net.mcreator.minebound.entity.HypnareMobEntity;
import net.mcreator.minebound.entity.HemogoblinMobRearEntity;
import net.mcreator.minebound.entity.HemogoblinMobFrontEntity;
import net.mcreator.minebound.entity.HemogoblinMobEntity;
import net.mcreator.minebound.entity.HeavyDroneMobEntity;
import net.mcreator.minebound.entity.GosmetMobEntity;
import net.mcreator.minebound.entity.GleapMobEntity;
import net.mcreator.minebound.entity.FluffaloPoisonMobEntity;
import net.mcreator.minebound.entity.FluffaloMobEntity;
import net.mcreator.minebound.entity.FluffaloIceMobEntity;
import net.mcreator.minebound.entity.FluffaloFireMobEntity;
import net.mcreator.minebound.entity.FluffaloElectricMobEntity;
import net.mcreator.minebound.entity.FennixMobEntity;
import net.mcreator.minebound.entity.ErchiusGhostMobEntity;
import net.mcreator.minebound.entity.CrutterMobEntity;
import net.mcreator.minebound.entity.CrustoiseMobEntity;
import net.mcreator.minebound.entity.CrustoiseMobChargingEntity;
import net.mcreator.minebound.entity.CrabcanoMobEntity;
import net.mcreator.minebound.entity.CosmostacheMobEntity;
import net.mcreator.minebound.entity.CosmicIntruderMobEntity;
import net.mcreator.minebound.entity.ChiropterrorMobEntity;
import net.mcreator.minebound.entity.ChickenMobEntity;
import net.mcreator.minebound.entity.CapricoatMobEntity;
import net.mcreator.minebound.entity.BulbopMobEntity;
import net.mcreator.minebound.entity.BobotMobEntity;
import net.mcreator.minebound.entity.BobotMobChargingEntity;
import net.mcreator.minebound.entity.BobfaeMobEntity;
import net.mcreator.minebound.entity.BlockIndicatorEntity3Entity;
import net.mcreator.minebound.entity.BlockIndicatorEntity2Entity;
import net.mcreator.minebound.entity.BlockIndicatorEntity1Entity;
import net.mcreator.minebound.entity.BatongMobRestingEntity;
import net.mcreator.minebound.entity.BatongMobEntity;
import net.mcreator.minebound.entity.AstrofaeMobEntity;
import net.mcreator.minebound.entity.ApexMutantMobEntity;
import net.mcreator.minebound.entity.AnglureMobEntity;
import net.mcreator.minebound.entity.AgrobatMobRestingEntity;
import net.mcreator.minebound.entity.AgrobatMobEntity;
import net.mcreator.minebound.entity.AdultPoptopMobEntity;
import net.mcreator.minebound.MineboundMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MineboundModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MineboundMod.MODID);
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
	public static final RegistryObject<EntityType<GleapMobEntity>> GLEAP_MOB = register("gleap_mob",
			EntityType.Builder.<GleapMobEntity>of(GleapMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(GleapMobEntity::new)

					.sized(0.6f, 0.8f));
	public static final RegistryObject<EntityType<NutmidgeMobEntity>> NUTMIDGE_MOB = register("nutmidge_mob",
			EntityType.Builder.<NutmidgeMobEntity>of(NutmidgeMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(NutmidgeMobEntity::new)

					.sized(0.8f, 1.7f));
	public static final RegistryObject<EntityType<NutmidgelingMobEntity>> NUTMIDGELING_MOB = register("nutmidgeling_mob",
			EntityType.Builder.<NutmidgelingMobEntity>of(NutmidgelingMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(NutmidgelingMobEntity::new)

					.sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<KingNutmidgelingMobEntity>> KING_NUTMIDGELING_MOB = register("king_nutmidgeling_mob",
			EntityType.Builder.<KingNutmidgelingMobEntity>of(KingNutmidgelingMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(KingNutmidgelingMobEntity::new)

					.sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<PoptopMobEntity>> POPTOP_MOB = register("poptop_mob",
			EntityType.Builder.<PoptopMobEntity>of(PoptopMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(PoptopMobEntity::new)

					.sized(0.8f, 1f));
	public static final RegistryObject<EntityType<AdultPoptopMobEntity>> ADULT_POPTOP_MOB = register("adult_poptop_mob",
			EntityType.Builder.<AdultPoptopMobEntity>of(AdultPoptopMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(AdultPoptopMobEntity::new)

					.sized(2.9f, 3.4f));
	public static final RegistryObject<EntityType<CrustoiseMobEntity>> CRUSTOISE_MOB = register("crustoise_mob",
			EntityType.Builder.<CrustoiseMobEntity>of(CrustoiseMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(CrustoiseMobEntity::new)

					.sized(0.9f, 0.9f));
	public static final RegistryObject<EntityType<TinticMobEntity>> TINTIC_MOB = register("tintic_mob",
			EntityType.Builder.<TinticMobEntity>of(TinticMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(TinticMobEntity::new)

					.sized(0.9f, 0.9f));
	public static final RegistryObject<EntityType<BatongMobEntity>> BATONG_MOB = register("batong_mob",
			EntityType.Builder.<BatongMobEntity>of(BatongMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(BatongMobEntity::new)

					.sized(0.4f, 0.4f));
	public static final RegistryObject<EntityType<SpookitMobEntity>> SPOOKIT_MOB = register("spookit_mob",
			EntityType.Builder.<SpookitMobEntity>of(SpookitMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(SpookitMobEntity::new)

					.sized(0.4f, 0.4f));
	public static final RegistryObject<EntityType<PeblitMobEntity>> PEBLIT_MOB = register("peblit_mob",
			EntityType.Builder.<PeblitMobEntity>of(PeblitMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(PeblitMobEntity::new)

					.sized(0.4f, 0.4f));
	public static final RegistryObject<EntityType<IguarmorMobEntity>> IGUARMOR_MOB = register("iguarmor_mob",
			EntityType.Builder.<IguarmorMobEntity>of(IguarmorMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(IguarmorMobEntity::new)

					.sized(0.8f, 0.8f));
	public static final RegistryObject<EntityType<ScaveranMobEntity>> SCAVERAN_MOB = register("scaveran_mob",
			EntityType.Builder.<ScaveranMobEntity>of(ScaveranMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(ScaveranMobEntity::new)

					.sized(1.7999999999999998f, 1.5f));
	public static final RegistryObject<EntityType<VoltipMobEntity>> VOLTIP_MOB = register("voltip_mob",
			EntityType.Builder.<VoltipMobEntity>of(VoltipMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(VoltipMobEntity::new)

					.sized(0.6f, 0.9f));
	public static final RegistryObject<EntityType<FennixMobEntity>> FENNIX_MOB = register("fennix_mob",
			EntityType.Builder.<FennixMobEntity>of(FennixMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(FennixMobEntity::new)

					.sized(0.8f, 0.8f));
	public static final RegistryObject<EntityType<LilodonMobEntity>> LILODON_MOB = register("lilodon_mob",
			EntityType.Builder.<LilodonMobEntity>of(LilodonMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(LilodonMobEntity::new)

					.sized(0.8f, 0.9f));
	public static final RegistryObject<EntityType<PetricubMobEntity>> PETRICUB_MOB = register("petricub_mob",
			EntityType.Builder.<PetricubMobEntity>of(PetricubMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(PetricubMobEntity::new)

					.sized(0.9f, 0.9f));
	public static final RegistryObject<EntityType<ParatailMobEntity>> PARATAIL_MOB = register("paratail_mob",
			EntityType.Builder.<ParatailMobEntity>of(ParatailMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(ParatailMobEntity::new)

					.sized(0.8f, 0.8f));
	public static final RegistryObject<EntityType<WisperMobEntity>> WISPER_MOB = register("wisper_mob",
			EntityType.Builder.<WisperMobEntity>of(WisperMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(WisperMobEntity::new)

					.sized(0.8f, 0.8f));
	public static final RegistryObject<EntityType<SkimbusMobEntity>> SKIMBUS_MOB = register("skimbus_mob",
			EntityType.Builder.<SkimbusMobEntity>of(SkimbusMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(SkimbusMobEntity::new)

					.sized(1f, 0.8f));
	public static final RegistryObject<EntityType<PulpinMobEntity>> PULPIN_MOB = register("pulpin_mob",
			EntityType.Builder.<PulpinMobEntity>of(PulpinMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(PulpinMobEntity::new)

					.sized(0.9f, 0.8f));
	public static final RegistryObject<EntityType<CapricoatMobEntity>> CAPRICOAT_MOB = register("capricoat_mob",
			EntityType.Builder.<CapricoatMobEntity>of(CapricoatMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(CapricoatMobEntity::new)

					.sized(1.4f, 1.4f));
	public static final RegistryObject<EntityType<ScandroidMobEntity>> SCANDROID_MOB = register("scandroid_mob",
			EntityType.Builder.<ScandroidMobEntity>of(ScandroidMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(ScandroidMobEntity::new)

					.sized(0.8f, 0.9f));
	public static final RegistryObject<EntityType<BobotMobEntity>> BOBOT_MOB = register("bobot_mob",
			EntityType.Builder.<BobotMobEntity>of(BobotMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(BobotMobEntity::new)

					.sized(1.4f, 2.4f));
	public static final RegistryObject<EntityType<MonopusMobEntity>> MONOPUS_MOB = register("monopus_mob",
			EntityType.Builder.<MonopusMobEntity>of(MonopusMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(MonopusMobEntity::new)

					.sized(0.6f, 1.4f));
	public static final RegistryObject<EntityType<SnagglerMobEntity>> SNAGGLER_MOB = register("snaggler_mob",
			EntityType.Builder.<SnagglerMobEntity>of(SnagglerMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(SnagglerMobEntity::new)

					.sized(0.9f, 0.9f));
	public static final RegistryObject<EntityType<OculobMobEntity>> OCULOB_MOB = register("oculob_mob",
			EntityType.Builder.<OculobMobEntity>of(OculobMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(OculobMobEntity::new)

					.sized(0.8f, 0.9f));
	public static final RegistryObject<EntityType<MiasmopMobEntity>> MIASMOP_MOB = register("miasmop_mob",
			EntityType.Builder.<MiasmopMobEntity>of(MiasmopMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(MiasmopMobEntity::new)

					.sized(0.9f, 1.4f));
	public static final RegistryObject<EntityType<AgrobatMobEntity>> AGROBAT_MOB = register("agrobat_mob",
			EntityType.Builder.<AgrobatMobEntity>of(AgrobatMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(AgrobatMobEntity::new)

					.sized(0.8f, 0.6f));
	public static final RegistryObject<EntityType<SqueemMobEntity>> SQUEEM_MOB = register("squeem_mob",
			EntityType.Builder.<SqueemMobEntity>of(SqueemMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(SqueemMobEntity::new)

					.sized(0.8f, 1.2f));
	public static final RegistryObject<EntityType<SnauntMobEntity>> SNAUNT_MOB = register("snaunt_mob",
			EntityType.Builder.<SnauntMobEntity>of(SnauntMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(SnauntMobEntity::new)

					.sized(0.8f, 1.4f));
	public static final RegistryObject<EntityType<PetropodMobEntity>> PETROPOD_MOB = register("petropod_mob",
			EntityType.Builder.<PetropodMobEntity>of(PetropodMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(PetropodMobEntity::new)

					.sized(0.8f, 1.2f));
	public static final RegistryObject<EntityType<CrutterMobEntity>> CRUTTER_MOB = register("crutter_mob",
			EntityType.Builder.<CrutterMobEntity>of(CrutterMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(CrutterMobEntity::new)

					.sized(0.8f, 1.4f));
	public static final RegistryObject<EntityType<SnuffishMobEntity>> SNUFFISH_MOB = register("snuffish_mob",
			EntityType.Builder.<SnuffishMobEntity>of(SnuffishMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(SnuffishMobEntity::new)

					.sized(0.8f, 0.6f));
	public static final RegistryObject<EntityType<CrabcanoMobEntity>> CRABCANO_MOB = register("crabcano_mob",
			EntityType.Builder.<CrabcanoMobEntity>of(CrabcanoMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(CrabcanoMobEntity::new)

					.sized(0.9f, 0.8f));
	public static final RegistryObject<EntityType<PyromantleMobEntity>> PYROMANTLE_MOB = register("pyromantle_mob",
			EntityType.Builder.<PyromantleMobEntity>of(PyromantleMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(PyromantleMobEntity::new)

					.sized(0.9f, 0.9f));
	public static final RegistryObject<EntityType<IgnomeMobEntity>> IGNOME_MOB = register("ignome_mob",
			EntityType.Builder.<IgnomeMobEntity>of(IgnomeMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(IgnomeMobEntity::new)

					.sized(0.9f, 0.5f));
	public static final RegistryObject<EntityType<SmoglinMobEntity>> SMOGLIN_MOB = register("smoglin_mob",
			EntityType.Builder.<SmoglinMobEntity>of(SmoglinMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(SmoglinMobEntity::new)

					.sized(1.8f, 1.6f));
	public static final RegistryObject<EntityType<BobfaeMobEntity>> BOBFAE_MOB = register("bobfae_mob",
			EntityType.Builder.<BobfaeMobEntity>of(BobfaeMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(BobfaeMobEntity::new)

					.sized(0.9f, 1.1f));
	public static final RegistryObject<EntityType<ErchiusGhostMobEntity>> ERCHIUS_GHOST_MOB = register("erchius_ghost_mob",
			EntityType.Builder.<ErchiusGhostMobEntity>of(ErchiusGhostMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(ErchiusGhostMobEntity::new)

					.sized(3f, 4.5f));
	public static final RegistryObject<EntityType<QuagmuttMobEntity>> QUAGMUTT_MOB = register("quagmutt_mob",
			EntityType.Builder.<QuagmuttMobEntity>of(QuagmuttMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(QuagmuttMobEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<RingramMobEntity>> RINGRAM_MOB = register("ringram_mob",
			EntityType.Builder.<RingramMobEntity>of(RingramMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(RingramMobEntity::new)

					.sized(0.8f, 0.8f));
	public static final RegistryObject<EntityType<PipkinMobEntity>> PIPKIN_MOB = register("pipkin_mob",
			EntityType.Builder.<PipkinMobEntity>of(PipkinMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(PipkinMobEntity::new)

					.sized(0.8f, 1.8f));
	public static final RegistryObject<EntityType<SporgusMobEntity>> SPORGUS_MOB = register("sporgus_mob",
			EntityType.Builder.<SporgusMobEntity>of(SporgusMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(SporgusMobEntity::new)

					.sized(1f, 1.1f));
	public static final RegistryObject<EntityType<AnglureMobEntity>> ANGLURE_MOB = register("anglure_mob",
			EntityType.Builder.<AnglureMobEntity>of(AnglureMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(AnglureMobEntity::new)

					.sized(1f, 1.1f));
	public static final RegistryObject<EntityType<LumothMobEntity>> LUMOTH_MOB = register("lumoth_mob",
			EntityType.Builder.<LumothMobEntity>of(LumothMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(LumothMobEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<OoglerMobEntity>> OOGLER_MOB = register("oogler_mob",
			EntityType.Builder.<OoglerMobEntity>of(OoglerMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(OoglerMobEntity::new)

					.sized(1.5f, 2.5f));
	public static final RegistryObject<EntityType<NarfinMobEntity>> NARFIN_MOB = register("narfin_mob",
			EntityType.Builder.<NarfinMobEntity>of(NarfinMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(NarfinMobEntity::new)

					.sized(0.8f, 0.8f));
	public static final RegistryObject<EntityType<ToumingoMobEntity>> TOUMINGO_MOB = register("toumingo_mob",
			EntityType.Builder.<ToumingoMobEntity>of(ToumingoMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(ToumingoMobEntity::new)

					.sized(1f, 1.6f));
	public static final RegistryObject<EntityType<TrictusMobEntity>> TRICTUS_MOB = register("trictus_mob",
			EntityType.Builder.<TrictusMobEntity>of(TrictusMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(TrictusMobEntity::new)

					.sized(1f, 1.8f));
	public static final RegistryObject<EntityType<MandrafloraMobEntity>> MANDRAFLORA_MOB = register("mandraflora_mob",
			EntityType.Builder.<MandrafloraMobEntity>of(MandrafloraMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(MandrafloraMobEntity::new)

					.sized(1.8f, 2f));
	public static final RegistryObject<EntityType<BulbopMobEntity>> BULBOP_MOB = register("bulbop_mob",
			EntityType.Builder.<BulbopMobEntity>of(BulbopMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(BulbopMobEntity::new)

					.sized(0.4f, 0.6f));
	public static final RegistryObject<EntityType<HypnareMobEntity>> HYPNARE_MOB = register("hypnare_mob",
			EntityType.Builder.<HypnareMobEntity>of(HypnareMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(HypnareMobEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<YokatMobEntity>> YOKAT_MOB = register("yokat_mob",
			EntityType.Builder.<YokatMobEntity>of(YokatMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(YokatMobEntity::new)

					.sized(1f, 1.5f));
	public static final RegistryObject<EntityType<OrbideMobEntity>> ORBIDE_MOB = register("orbide_mob",
			EntityType.Builder.<OrbideMobEntity>of(OrbideMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(OrbideMobEntity::new)

					.sized(1f, 2.5f));
	public static final RegistryObject<EntityType<TaroniMobEntity>> TARONI_MOB = register("taroni_mob",
			EntityType.Builder.<TaroniMobEntity>of(TaroniMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(TaroniMobEntity::new)

					.sized(1f, 1.4f));
	public static final RegistryObject<EntityType<HemogoblinMobEntity>> HEMOGOBLIN_MOB = register("hemogoblin_mob",
			EntityType.Builder.<HemogoblinMobEntity>of(HemogoblinMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(HemogoblinMobEntity::new)

					.sized(1f, 1.2999999999999998f));
	public static final RegistryObject<EntityType<ApexMutantMobEntity>> APEX_MUTANT_MOB = register("apex_mutant_mob",
			EntityType.Builder.<ApexMutantMobEntity>of(ApexMutantMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(ApexMutantMobEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GosmetMobEntity>> GOSMET_MOB = register("gosmet_mob",
			EntityType.Builder.<GosmetMobEntity>of(GosmetMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(GosmetMobEntity::new)

					.sized(1.4f, 1.4f));
	public static final RegistryObject<EntityType<IxolingMobEntity>> IXOLING_MOB = register("ixoling_mob",
			EntityType.Builder.<IxolingMobEntity>of(IxolingMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(IxolingMobEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<KluexSentryMobEntity>> KLUEX_SENTRY_MOB = register("kluex_sentry_mob",
			EntityType.Builder.<KluexSentryMobEntity>of(KluexSentryMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(KluexSentryMobEntity::new)

					.sized(1.8f, 3f));
	public static final RegistryObject<EntityType<KluexTotemMobEntity>> KLUEX_TOTEM_MOB = register("kluex_totem_mob",
			EntityType.Builder.<KluexTotemMobEntity>of(KluexTotemMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(KluexTotemMobEntity::new)

					.sized(2f, 3.8f));
	public static final RegistryObject<EntityType<MiniDroneMobEntity>> MINI_DRONE_MOB = register("mini_drone_mob",
			EntityType.Builder.<MiniDroneMobEntity>of(MiniDroneMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(MiniDroneMobEntity::new)

					.sized(0.8f, 1f));
	public static final RegistryObject<EntityType<MotherPoptopMobEntity>> MOTHER_POPTOP_MOB = register("mother_poptop_mob",
			EntityType.Builder.<MotherPoptopMobEntity>of(MotherPoptopMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(MotherPoptopMobEntity::new)

					.sized(3f, 3.4f));
	public static final RegistryObject<EntityType<MoontantMobEntity>> MOONTANT_MOB = register("moontant_mob",
			EntityType.Builder.<MoontantMobEntity>of(MoontantMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(MoontantMobEntity::new)

					.sized(0.6f, 1.6f));
	public static final RegistryObject<EntityType<PoMobEntity>> PO_MOB = register("po_mob",
			EntityType.Builder.<PoMobEntity>of(PoMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PoMobEntity::new)

					.sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<PoletMobEntity>> POLET_MOB = register("polet_mob",
			EntityType.Builder.<PoletMobEntity>of(PoletMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PoletMobEntity::new)

					.sized(0.52f, 0.52f));
	public static final RegistryObject<EntityType<PolingMobEntity>> POLING_MOB = register("poling_mob",
			EntityType.Builder.<PolingMobEntity>of(PolingMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PolingMobEntity::new)

					.sized(0.45f, 0.45f));
	public static final RegistryObject<EntityType<PoGolemMobEntity>> PO_GOLEM_MOB = register("po_golem_mob",
			EntityType.Builder.<PoGolemMobEntity>of(PoGolemMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(PoGolemMobEntity::new)

					.sized(1.4f, 2f));
	public static final RegistryObject<EntityType<PunchyMobEntity>> PUNCHY_MOB = register("punchy_mob",
			EntityType.Builder.<PunchyMobEntity>of(PunchyMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(PunchyMobEntity::new)

					.sized(1.2f, 1.8f));
	public static final RegistryObject<EntityType<SwarpionMobEntity>> SWARPION_MOB = register("swarpion_mob",
			EntityType.Builder.<SwarpionMobEntity>of(SwarpionMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(SwarpionMobEntity::new)

					.sized(1.3f, 0.8f));
	public static final RegistryObject<EntityType<TentacleBombMobEntity>> TENTACLE_BOMB_MOB = register("tentacle_bomb_mob",
			EntityType.Builder.<TentacleBombMobEntity>of(TentacleBombMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(TentacleBombMobEntity::new)

					.sized(0.8f, 1.4f));
	public static final RegistryObject<EntityType<TentacleClamMobEntity>> TENTACLE_CLAM_MOB = register("tentacle_clam_mob",
			EntityType.Builder.<TentacleClamMobEntity>of(TentacleClamMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(TentacleClamMobEntity::new)

					.sized(0.9f, 0.9f));
	public static final RegistryObject<EntityType<TentacleCrawlerMobEntity>> TENTACLE_CRAWLER_MOB = register("tentacle_crawler_mob",
			EntityType.Builder.<TentacleCrawlerMobEntity>of(TentacleCrawlerMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(TentacleCrawlerMobEntity::new)

					.sized(0.8f, 0.6f));
	public static final RegistryObject<EntityType<TentacleGhostMobEntity>> TENTACLE_GHOST_MOB = register("tentacle_ghost_mob",
			EntityType.Builder.<TentacleGhostMobEntity>of(TentacleGhostMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(TentacleGhostMobEntity::new)

					.sized(1f, 1.5f));
	public static final RegistryObject<EntityType<TentacleGnatMobEntity>> TENTACLE_GNAT_MOB = register("tentacle_gnat_mob",
			EntityType.Builder.<TentacleGnatMobEntity>of(TentacleGnatMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(TentacleGnatMobEntity::new)

					.sized(0.52f, 0.52f));
	public static final RegistryObject<EntityType<TentacleSpawnerMobEntity>> TENTACLE_SPAWNER_MOB = register("tentacle_spawner_mob",
			EntityType.Builder.<TentacleSpawnerMobEntity>of(TentacleSpawnerMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(TentacleSpawnerMobEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<TriplodMobEntity>> TRIPLOD_MOB = register("triplod_mob",
			EntityType.Builder.<TriplodMobEntity>of(TriplodMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(TriplodMobEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<ParaspriteMobEntity>> PARASPRITE_MOB = register("parasprite_mob",
			EntityType.Builder.<ParaspriteMobEntity>of(ParaspriteMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(ParaspriteMobEntity::new)

					.sized(1.5f, 1.5f));
	public static final RegistryObject<EntityType<CosmicIntruderMobEntity>> COSMIC_INTRUDER_MOB = register("cosmic_intruder_mob",
			EntityType.Builder.<CosmicIntruderMobEntity>of(CosmicIntruderMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(CosmicIntruderMobEntity::new)

					.sized(1.5f, 1.8f));
	public static final RegistryObject<EntityType<ChickenMobEntity>> CHICKEN_MOB = register("chicken_mob",
			EntityType.Builder.<ChickenMobEntity>of(ChickenMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(ChickenMobEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<RobotChickenMobEntity>> ROBOT_CHICKEN_MOB = register("robot_chicken_mob",
			EntityType.Builder.<RobotChickenMobEntity>of(RobotChickenMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(RobotChickenMobEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<MooshiMobEntity>> MOOSHI_MOB = register("mooshi_mob",
			EntityType.Builder.<MooshiMobEntity>of(MooshiMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(MooshiMobEntity::new)

					.sized(1.6f, 1.5f));
	public static final RegistryObject<EntityType<FluffaloMobEntity>> FLUFFALO_MOB = register("fluffalo_mob",
			EntityType.Builder.<FluffaloMobEntity>of(FluffaloMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(FluffaloMobEntity::new)

					.sized(2.4f, 2f));
	public static final RegistryObject<EntityType<FluffaloFireMobEntity>> FLUFFALO_FIRE_MOB = register("fluffalo_fire_mob",
			EntityType.Builder.<FluffaloFireMobEntity>of(FluffaloFireMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(FluffaloFireMobEntity::new)

					.sized(2.4f, 2f));
	public static final RegistryObject<EntityType<FluffaloPoisonMobEntity>> FLUFFALO_POISON_MOB = register("fluffalo_poison_mob",
			EntityType.Builder.<FluffaloPoisonMobEntity>of(FluffaloPoisonMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(FluffaloPoisonMobEntity::new)

					.sized(2.4f, 2f));
	public static final RegistryObject<EntityType<FluffaloIceMobEntity>> FLUFFALO_ICE_MOB = register("fluffalo_ice_mob",
			EntityType.Builder.<FluffaloIceMobEntity>of(FluffaloIceMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(FluffaloIceMobEntity::new)

					.sized(2.4f, 2f));
	public static final RegistryObject<EntityType<FluffaloElectricMobEntity>> FLUFFALO_ELECTRIC_MOB = register("fluffalo_electric_mob",
			EntityType.Builder.<FluffaloElectricMobEntity>of(FluffaloElectricMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(FluffaloElectricMobEntity::new)

					.sized(2.4f, 2f));
	public static final RegistryObject<EntityType<AstrofaeMobEntity>> ASTROFAE_MOB = register("astrofae_mob",
			EntityType.Builder.<AstrofaeMobEntity>of(AstrofaeMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(AstrofaeMobEntity::new)

					.sized(1.4f, 1.4f));
	public static final RegistryObject<EntityType<ChiropterrorMobEntity>> CHIROPTERROR_MOB = register("chiropterror_mob",
			EntityType.Builder.<ChiropterrorMobEntity>of(ChiropterrorMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(ChiropterrorMobEntity::new)

					.sized(1.8f, 1.8f));
	public static final RegistryObject<EntityType<CosmostacheMobEntity>> COSMOSTACHE_MOB = register("cosmostache_mob",
			EntityType.Builder.<CosmostacheMobEntity>of(CosmostacheMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(CosmostacheMobEntity::new)

					.sized(0.9f, 0.9f));
	public static final RegistryObject<EntityType<HeavyDroneMobEntity>> HEAVY_DRONE_MOB = register("heavy_drone_mob",
			EntityType.Builder.<HeavyDroneMobEntity>of(HeavyDroneMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(HeavyDroneMobEntity::new)

					.sized(4.2f, 2.4f));
	public static final RegistryObject<EntityType<MasteroidMobEntity>> MASTEROID_MOB = register("masteroid_mob",
			EntityType.Builder.<MasteroidMobEntity>of(MasteroidMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(MasteroidMobEntity::new)

					.sized(3f, 3f));
	public static final RegistryObject<EntityType<OmnicannonMobEntity>> OMNICANNON_MOB = register("omnicannon_mob",
			EntityType.Builder.<OmnicannonMobEntity>of(OmnicannonMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(OmnicannonMobEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<RustickMobEntity>> RUSTICK_MOB = register("rustick_mob",
			EntityType.Builder.<RustickMobEntity>of(RustickMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(RustickMobEntity::new)

					.sized(1.5f, 1.5f));
	public static final RegistryObject<EntityType<SpinemineMobEntity>> SPINEMINE_MOB = register("spinemine_mob",
			EntityType.Builder.<SpinemineMobEntity>of(SpinemineMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(SpinemineMobEntity::new)

					.sized(1.8f, 1.6f));
	public static final RegistryObject<EntityType<TrifangleMobEntity>> TRIFANGLE_MOB = register("trifangle_mob",
			EntityType.Builder.<TrifangleMobEntity>of(TrifangleMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(TrifangleMobEntity::new)

					.sized(1.2f, 1.2f));
	public static final RegistryObject<EntityType<TwigunMobEntity>> TWIGUN_MOB = register("twigun_mob",
			EntityType.Builder.<TwigunMobEntity>of(TwigunMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(TwigunMobEntity::new)

					.sized(1.4f, 1.4f));
	public static final RegistryObject<EntityType<RacerMob1Entity>> RACER_MOB_1 = register("racer_mob_1",
			EntityType.Builder.<RacerMob1Entity>of(RacerMob1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RacerMob1Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RacerMob2Entity>> RACER_MOB_2 = register("racer_mob_2",
			EntityType.Builder.<RacerMob2Entity>of(RacerMob2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RacerMob2Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RacerMob3Entity>> RACER_MOB_3 = register("racer_mob_3",
			EntityType.Builder.<RacerMob3Entity>of(RacerMob3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RacerMob3Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RacerMob4Entity>> RACER_MOB_4 = register("racer_mob_4",
			EntityType.Builder.<RacerMob4Entity>of(RacerMob4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RacerMob4Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RacerMob5Entity>> RACER_MOB_5 = register("racer_mob_5",
			EntityType.Builder.<RacerMob5Entity>of(RacerMob5Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RacerMob5Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RacerMob6Entity>> RACER_MOB_6 = register("racer_mob_6",
			EntityType.Builder.<RacerMob6Entity>of(RacerMob6Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RacerMob6Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PlayerHeadHUDEntityEntity>> PLAYER_HEAD_HUD_ENTITY = register("player_head_hud_entity",
			EntityType.Builder.<PlayerHeadHUDEntityEntity>of(PlayerHeadHUDEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PlayerHeadHUDEntityEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BlockIndicatorEntity1Entity>> BLOCK_INDICATOR_ENTITY_1 = register("block_indicator_entity_1", EntityType.Builder.<BlockIndicatorEntity1Entity>of(BlockIndicatorEntity1Entity::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlockIndicatorEntity1Entity::new).fireImmune().sized(1.01f, 1.01f));
	public static final RegistryObject<EntityType<BlockIndicatorEntity3Entity>> BLOCK_INDICATOR_ENTITY_3 = register("block_indicator_entity_3", EntityType.Builder.<BlockIndicatorEntity3Entity>of(BlockIndicatorEntity3Entity::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlockIndicatorEntity3Entity::new).fireImmune().sized(1.01f, 1.01f));
	public static final RegistryObject<EntityType<BlockIndicatorEntity2Entity>> BLOCK_INDICATOR_ENTITY_2 = register("block_indicator_entity_2", EntityType.Builder.<BlockIndicatorEntity2Entity>of(BlockIndicatorEntity2Entity::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlockIndicatorEntity2Entity::new).fireImmune().sized(1.01f, 1.01f));
	public static final RegistryObject<EntityType<NutmidgeMobChargingEntity>> NUTMIDGE_MOB_CHARGING = register("nutmidge_mob_charging",
			EntityType.Builder.<NutmidgeMobChargingEntity>of(NutmidgeMobChargingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(NutmidgeMobChargingEntity::new)

					.sized(0.8f, 1.7f));
	public static final RegistryObject<EntityType<CrustoiseMobChargingEntity>> CRUSTOISE_MOB_CHARGING = register("crustoise_mob_charging",
			EntityType.Builder.<CrustoiseMobChargingEntity>of(CrustoiseMobChargingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3)
					.setCustomClientFactory(CrustoiseMobChargingEntity::new)

					.sized(0.9f, 0.9f));
	public static final RegistryObject<EntityType<BatongMobRestingEntity>> BATONG_MOB_RESTING = register("batong_mob_resting",
			EntityType.Builder.<BatongMobRestingEntity>of(BatongMobRestingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(BatongMobRestingEntity::new)

					.sized(0.4f, 0.4f));
	public static final RegistryObject<EntityType<PeblitMobRestingEntity>> PEBLIT_MOB_RESTING = register("peblit_mob_resting",
			EntityType.Builder.<PeblitMobRestingEntity>of(PeblitMobRestingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(PeblitMobRestingEntity::new)

					.sized(0.4f, 0.4f));
	public static final RegistryObject<EntityType<ScandroidMobChargingEntity>> SCANDROID_MOB_CHARGING = register("scandroid_mob_charging",
			EntityType.Builder.<ScandroidMobChargingEntity>of(ScandroidMobChargingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3)
					.setCustomClientFactory(ScandroidMobChargingEntity::new)

					.sized(0.8f, 0.9f));
	public static final RegistryObject<EntityType<BobotMobChargingEntity>> BOBOT_MOB_CHARGING = register("bobot_mob_charging",
			EntityType.Builder.<BobotMobChargingEntity>of(BobotMobChargingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(BobotMobChargingEntity::new)

					.sized(1.4f, 2.4f));
	public static final RegistryObject<EntityType<MonopusMobChargingEntity>> MONOPUS_MOB_CHARGING = register("monopus_mob_charging",
			EntityType.Builder.<MonopusMobChargingEntity>of(MonopusMobChargingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(MonopusMobChargingEntity::new)

					.sized(0.6f, 1.4f));
	public static final RegistryObject<EntityType<AgrobatMobRestingEntity>> AGROBAT_MOB_RESTING = register("agrobat_mob_resting",
			EntityType.Builder.<AgrobatMobRestingEntity>of(AgrobatMobRestingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(AgrobatMobRestingEntity::new)

					.sized(0.8f, 0.6f));
	public static final RegistryObject<EntityType<TrictusMobRestingEntity>> TRICTUS_MOB_RESTING = register("trictus_mob_resting",
			EntityType.Builder.<TrictusMobRestingEntity>of(TrictusMobRestingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(TrictusMobRestingEntity::new)

					.sized(1f, 0.8f));
	public static final RegistryObject<EntityType<OrbideMobRestingEntity>> ORBIDE_MOB_RESTING = register("orbide_mob_resting",
			EntityType.Builder.<OrbideMobRestingEntity>of(OrbideMobRestingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(OrbideMobRestingEntity::new)

					.sized(1f, 2.5f));
	public static final RegistryObject<EntityType<HemogoblinMobFrontEntity>> HEMOGOBLIN_MOB_FRONT = register("hemogoblin_mob_front",
			EntityType.Builder.<HemogoblinMobFrontEntity>of(HemogoblinMobFrontEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(HemogoblinMobFrontEntity::new)

					.sized(0.8f, 1.2999999999999998f));
	public static final RegistryObject<EntityType<HemogoblinMobRearEntity>> HEMOGOBLIN_MOB_REAR = register("hemogoblin_mob_rear",
			EntityType.Builder.<HemogoblinMobRearEntity>of(HemogoblinMobRearEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(HemogoblinMobRearEntity::new)

					.sized(0.8f, 0.8f));
	public static final RegistryObject<EntityType<MasteroidMobLEntity>> MASTEROID_MOB_L = register("masteroid_mob_l",
			EntityType.Builder.<MasteroidMobLEntity>of(MasteroidMobLEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(MasteroidMobLEntity::new)

					.sized(3f, 3f));
	public static final RegistryObject<EntityType<MasteroidMobMEntity>> MASTEROID_MOB_M = register("masteroid_mob_m",
			EntityType.Builder.<MasteroidMobMEntity>of(MasteroidMobMEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(MasteroidMobMEntity::new)

					.sized(2f, 2f));
	public static final RegistryObject<EntityType<MasteroidMobSEntity>> MASTEROID_MOB_S = register("masteroid_mob_s",
			EntityType.Builder.<MasteroidMobSEntity>of(MasteroidMobSEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(MasteroidMobSEntity::new)

					.sized(1f, 1f));

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
			GleapMobEntity.init();
			NutmidgeMobEntity.init();
			NutmidgelingMobEntity.init();
			KingNutmidgelingMobEntity.init();
			PoptopMobEntity.init();
			AdultPoptopMobEntity.init();
			CrustoiseMobEntity.init();
			TinticMobEntity.init();
			BatongMobEntity.init();
			SpookitMobEntity.init();
			PeblitMobEntity.init();
			IguarmorMobEntity.init();
			ScaveranMobEntity.init();
			VoltipMobEntity.init();
			FennixMobEntity.init();
			LilodonMobEntity.init();
			PetricubMobEntity.init();
			ParatailMobEntity.init();
			WisperMobEntity.init();
			SkimbusMobEntity.init();
			PulpinMobEntity.init();
			CapricoatMobEntity.init();
			ScandroidMobEntity.init();
			BobotMobEntity.init();
			MonopusMobEntity.init();
			SnagglerMobEntity.init();
			OculobMobEntity.init();
			MiasmopMobEntity.init();
			AgrobatMobEntity.init();
			SqueemMobEntity.init();
			SnauntMobEntity.init();
			PetropodMobEntity.init();
			CrutterMobEntity.init();
			SnuffishMobEntity.init();
			CrabcanoMobEntity.init();
			PyromantleMobEntity.init();
			IgnomeMobEntity.init();
			SmoglinMobEntity.init();
			BobfaeMobEntity.init();
			ErchiusGhostMobEntity.init();
			QuagmuttMobEntity.init();
			RingramMobEntity.init();
			PipkinMobEntity.init();
			SporgusMobEntity.init();
			AnglureMobEntity.init();
			LumothMobEntity.init();
			OoglerMobEntity.init();
			NarfinMobEntity.init();
			ToumingoMobEntity.init();
			TrictusMobEntity.init();
			MandrafloraMobEntity.init();
			BulbopMobEntity.init();
			HypnareMobEntity.init();
			YokatMobEntity.init();
			OrbideMobEntity.init();
			TaroniMobEntity.init();
			HemogoblinMobEntity.init();
			ApexMutantMobEntity.init();
			GosmetMobEntity.init();
			IxolingMobEntity.init();
			KluexSentryMobEntity.init();
			KluexTotemMobEntity.init();
			MiniDroneMobEntity.init();
			MotherPoptopMobEntity.init();
			MoontantMobEntity.init();
			PoMobEntity.init();
			PoletMobEntity.init();
			PolingMobEntity.init();
			PoGolemMobEntity.init();
			PunchyMobEntity.init();
			SwarpionMobEntity.init();
			TentacleBombMobEntity.init();
			TentacleClamMobEntity.init();
			TentacleCrawlerMobEntity.init();
			TentacleGhostMobEntity.init();
			TentacleGnatMobEntity.init();
			TentacleSpawnerMobEntity.init();
			TriplodMobEntity.init();
			ParaspriteMobEntity.init();
			CosmicIntruderMobEntity.init();
			ChickenMobEntity.init();
			RobotChickenMobEntity.init();
			MooshiMobEntity.init();
			FluffaloMobEntity.init();
			FluffaloFireMobEntity.init();
			FluffaloPoisonMobEntity.init();
			FluffaloIceMobEntity.init();
			FluffaloElectricMobEntity.init();
			AstrofaeMobEntity.init();
			ChiropterrorMobEntity.init();
			CosmostacheMobEntity.init();
			HeavyDroneMobEntity.init();
			MasteroidMobEntity.init();
			OmnicannonMobEntity.init();
			RustickMobEntity.init();
			SpinemineMobEntity.init();
			TrifangleMobEntity.init();
			TwigunMobEntity.init();
			RacerMob1Entity.init();
			RacerMob2Entity.init();
			RacerMob3Entity.init();
			RacerMob4Entity.init();
			RacerMob5Entity.init();
			RacerMob6Entity.init();
			PlayerHeadHUDEntityEntity.init();
			BlockIndicatorEntity1Entity.init();
			BlockIndicatorEntity3Entity.init();
			BlockIndicatorEntity2Entity.init();
			NutmidgeMobChargingEntity.init();
			CrustoiseMobChargingEntity.init();
			BatongMobRestingEntity.init();
			PeblitMobRestingEntity.init();
			ScandroidMobChargingEntity.init();
			BobotMobChargingEntity.init();
			MonopusMobChargingEntity.init();
			AgrobatMobRestingEntity.init();
			TrictusMobRestingEntity.init();
			OrbideMobRestingEntity.init();
			HemogoblinMobFrontEntity.init();
			HemogoblinMobRearEntity.init();
			MasteroidMobLEntity.init();
			MasteroidMobMEntity.init();
			MasteroidMobSEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MECH_TEST_BODY.get(), MechTestBodyEntity.createAttributes().build());
		event.put(MECH_TEST_ARM_LEFT.get(), MechTestArmLeftEntity.createAttributes().build());
		event.put(MECH_TEST_ARM_RIGHT.get(), MechTestArmRightEntity.createAttributes().build());
		event.put(MECH_TEST_LEG_LEFT.get(), MechTestLegLeftEntity.createAttributes().build());
		event.put(MECH_TEST_LEG_RIGHT.get(), MechTestLegRightEntity.createAttributes().build());
		event.put(GLEAP_MOB.get(), GleapMobEntity.createAttributes().build());
		event.put(NUTMIDGE_MOB.get(), NutmidgeMobEntity.createAttributes().build());
		event.put(NUTMIDGELING_MOB.get(), NutmidgelingMobEntity.createAttributes().build());
		event.put(KING_NUTMIDGELING_MOB.get(), KingNutmidgelingMobEntity.createAttributes().build());
		event.put(POPTOP_MOB.get(), PoptopMobEntity.createAttributes().build());
		event.put(ADULT_POPTOP_MOB.get(), AdultPoptopMobEntity.createAttributes().build());
		event.put(CRUSTOISE_MOB.get(), CrustoiseMobEntity.createAttributes().build());
		event.put(TINTIC_MOB.get(), TinticMobEntity.createAttributes().build());
		event.put(BATONG_MOB.get(), BatongMobEntity.createAttributes().build());
		event.put(SPOOKIT_MOB.get(), SpookitMobEntity.createAttributes().build());
		event.put(PEBLIT_MOB.get(), PeblitMobEntity.createAttributes().build());
		event.put(IGUARMOR_MOB.get(), IguarmorMobEntity.createAttributes().build());
		event.put(SCAVERAN_MOB.get(), ScaveranMobEntity.createAttributes().build());
		event.put(VOLTIP_MOB.get(), VoltipMobEntity.createAttributes().build());
		event.put(FENNIX_MOB.get(), FennixMobEntity.createAttributes().build());
		event.put(LILODON_MOB.get(), LilodonMobEntity.createAttributes().build());
		event.put(PETRICUB_MOB.get(), PetricubMobEntity.createAttributes().build());
		event.put(PARATAIL_MOB.get(), ParatailMobEntity.createAttributes().build());
		event.put(WISPER_MOB.get(), WisperMobEntity.createAttributes().build());
		event.put(SKIMBUS_MOB.get(), SkimbusMobEntity.createAttributes().build());
		event.put(PULPIN_MOB.get(), PulpinMobEntity.createAttributes().build());
		event.put(CAPRICOAT_MOB.get(), CapricoatMobEntity.createAttributes().build());
		event.put(SCANDROID_MOB.get(), ScandroidMobEntity.createAttributes().build());
		event.put(BOBOT_MOB.get(), BobotMobEntity.createAttributes().build());
		event.put(MONOPUS_MOB.get(), MonopusMobEntity.createAttributes().build());
		event.put(SNAGGLER_MOB.get(), SnagglerMobEntity.createAttributes().build());
		event.put(OCULOB_MOB.get(), OculobMobEntity.createAttributes().build());
		event.put(MIASMOP_MOB.get(), MiasmopMobEntity.createAttributes().build());
		event.put(AGROBAT_MOB.get(), AgrobatMobEntity.createAttributes().build());
		event.put(SQUEEM_MOB.get(), SqueemMobEntity.createAttributes().build());
		event.put(SNAUNT_MOB.get(), SnauntMobEntity.createAttributes().build());
		event.put(PETROPOD_MOB.get(), PetropodMobEntity.createAttributes().build());
		event.put(CRUTTER_MOB.get(), CrutterMobEntity.createAttributes().build());
		event.put(SNUFFISH_MOB.get(), SnuffishMobEntity.createAttributes().build());
		event.put(CRABCANO_MOB.get(), CrabcanoMobEntity.createAttributes().build());
		event.put(PYROMANTLE_MOB.get(), PyromantleMobEntity.createAttributes().build());
		event.put(IGNOME_MOB.get(), IgnomeMobEntity.createAttributes().build());
		event.put(SMOGLIN_MOB.get(), SmoglinMobEntity.createAttributes().build());
		event.put(BOBFAE_MOB.get(), BobfaeMobEntity.createAttributes().build());
		event.put(ERCHIUS_GHOST_MOB.get(), ErchiusGhostMobEntity.createAttributes().build());
		event.put(QUAGMUTT_MOB.get(), QuagmuttMobEntity.createAttributes().build());
		event.put(RINGRAM_MOB.get(), RingramMobEntity.createAttributes().build());
		event.put(PIPKIN_MOB.get(), PipkinMobEntity.createAttributes().build());
		event.put(SPORGUS_MOB.get(), SporgusMobEntity.createAttributes().build());
		event.put(ANGLURE_MOB.get(), AnglureMobEntity.createAttributes().build());
		event.put(LUMOTH_MOB.get(), LumothMobEntity.createAttributes().build());
		event.put(OOGLER_MOB.get(), OoglerMobEntity.createAttributes().build());
		event.put(NARFIN_MOB.get(), NarfinMobEntity.createAttributes().build());
		event.put(TOUMINGO_MOB.get(), ToumingoMobEntity.createAttributes().build());
		event.put(TRICTUS_MOB.get(), TrictusMobEntity.createAttributes().build());
		event.put(MANDRAFLORA_MOB.get(), MandrafloraMobEntity.createAttributes().build());
		event.put(BULBOP_MOB.get(), BulbopMobEntity.createAttributes().build());
		event.put(HYPNARE_MOB.get(), HypnareMobEntity.createAttributes().build());
		event.put(YOKAT_MOB.get(), YokatMobEntity.createAttributes().build());
		event.put(ORBIDE_MOB.get(), OrbideMobEntity.createAttributes().build());
		event.put(TARONI_MOB.get(), TaroniMobEntity.createAttributes().build());
		event.put(HEMOGOBLIN_MOB.get(), HemogoblinMobEntity.createAttributes().build());
		event.put(APEX_MUTANT_MOB.get(), ApexMutantMobEntity.createAttributes().build());
		event.put(GOSMET_MOB.get(), GosmetMobEntity.createAttributes().build());
		event.put(IXOLING_MOB.get(), IxolingMobEntity.createAttributes().build());
		event.put(KLUEX_SENTRY_MOB.get(), KluexSentryMobEntity.createAttributes().build());
		event.put(KLUEX_TOTEM_MOB.get(), KluexTotemMobEntity.createAttributes().build());
		event.put(MINI_DRONE_MOB.get(), MiniDroneMobEntity.createAttributes().build());
		event.put(MOTHER_POPTOP_MOB.get(), MotherPoptopMobEntity.createAttributes().build());
		event.put(MOONTANT_MOB.get(), MoontantMobEntity.createAttributes().build());
		event.put(PO_MOB.get(), PoMobEntity.createAttributes().build());
		event.put(POLET_MOB.get(), PoletMobEntity.createAttributes().build());
		event.put(POLING_MOB.get(), PolingMobEntity.createAttributes().build());
		event.put(PO_GOLEM_MOB.get(), PoGolemMobEntity.createAttributes().build());
		event.put(PUNCHY_MOB.get(), PunchyMobEntity.createAttributes().build());
		event.put(SWARPION_MOB.get(), SwarpionMobEntity.createAttributes().build());
		event.put(TENTACLE_BOMB_MOB.get(), TentacleBombMobEntity.createAttributes().build());
		event.put(TENTACLE_CLAM_MOB.get(), TentacleClamMobEntity.createAttributes().build());
		event.put(TENTACLE_CRAWLER_MOB.get(), TentacleCrawlerMobEntity.createAttributes().build());
		event.put(TENTACLE_GHOST_MOB.get(), TentacleGhostMobEntity.createAttributes().build());
		event.put(TENTACLE_GNAT_MOB.get(), TentacleGnatMobEntity.createAttributes().build());
		event.put(TENTACLE_SPAWNER_MOB.get(), TentacleSpawnerMobEntity.createAttributes().build());
		event.put(TRIPLOD_MOB.get(), TriplodMobEntity.createAttributes().build());
		event.put(PARASPRITE_MOB.get(), ParaspriteMobEntity.createAttributes().build());
		event.put(COSMIC_INTRUDER_MOB.get(), CosmicIntruderMobEntity.createAttributes().build());
		event.put(CHICKEN_MOB.get(), ChickenMobEntity.createAttributes().build());
		event.put(ROBOT_CHICKEN_MOB.get(), RobotChickenMobEntity.createAttributes().build());
		event.put(MOOSHI_MOB.get(), MooshiMobEntity.createAttributes().build());
		event.put(FLUFFALO_MOB.get(), FluffaloMobEntity.createAttributes().build());
		event.put(FLUFFALO_FIRE_MOB.get(), FluffaloFireMobEntity.createAttributes().build());
		event.put(FLUFFALO_POISON_MOB.get(), FluffaloPoisonMobEntity.createAttributes().build());
		event.put(FLUFFALO_ICE_MOB.get(), FluffaloIceMobEntity.createAttributes().build());
		event.put(FLUFFALO_ELECTRIC_MOB.get(), FluffaloElectricMobEntity.createAttributes().build());
		event.put(ASTROFAE_MOB.get(), AstrofaeMobEntity.createAttributes().build());
		event.put(CHIROPTERROR_MOB.get(), ChiropterrorMobEntity.createAttributes().build());
		event.put(COSMOSTACHE_MOB.get(), CosmostacheMobEntity.createAttributes().build());
		event.put(HEAVY_DRONE_MOB.get(), HeavyDroneMobEntity.createAttributes().build());
		event.put(MASTEROID_MOB.get(), MasteroidMobEntity.createAttributes().build());
		event.put(OMNICANNON_MOB.get(), OmnicannonMobEntity.createAttributes().build());
		event.put(RUSTICK_MOB.get(), RustickMobEntity.createAttributes().build());
		event.put(SPINEMINE_MOB.get(), SpinemineMobEntity.createAttributes().build());
		event.put(TRIFANGLE_MOB.get(), TrifangleMobEntity.createAttributes().build());
		event.put(TWIGUN_MOB.get(), TwigunMobEntity.createAttributes().build());
		event.put(RACER_MOB_1.get(), RacerMob1Entity.createAttributes().build());
		event.put(RACER_MOB_2.get(), RacerMob2Entity.createAttributes().build());
		event.put(RACER_MOB_3.get(), RacerMob3Entity.createAttributes().build());
		event.put(RACER_MOB_4.get(), RacerMob4Entity.createAttributes().build());
		event.put(RACER_MOB_5.get(), RacerMob5Entity.createAttributes().build());
		event.put(RACER_MOB_6.get(), RacerMob6Entity.createAttributes().build());
		event.put(PLAYER_HEAD_HUD_ENTITY.get(), PlayerHeadHUDEntityEntity.createAttributes().build());
		event.put(BLOCK_INDICATOR_ENTITY_1.get(), BlockIndicatorEntity1Entity.createAttributes().build());
		event.put(BLOCK_INDICATOR_ENTITY_3.get(), BlockIndicatorEntity3Entity.createAttributes().build());
		event.put(BLOCK_INDICATOR_ENTITY_2.get(), BlockIndicatorEntity2Entity.createAttributes().build());
		event.put(NUTMIDGE_MOB_CHARGING.get(), NutmidgeMobChargingEntity.createAttributes().build());
		event.put(CRUSTOISE_MOB_CHARGING.get(), CrustoiseMobChargingEntity.createAttributes().build());
		event.put(BATONG_MOB_RESTING.get(), BatongMobRestingEntity.createAttributes().build());
		event.put(PEBLIT_MOB_RESTING.get(), PeblitMobRestingEntity.createAttributes().build());
		event.put(SCANDROID_MOB_CHARGING.get(), ScandroidMobChargingEntity.createAttributes().build());
		event.put(BOBOT_MOB_CHARGING.get(), BobotMobChargingEntity.createAttributes().build());
		event.put(MONOPUS_MOB_CHARGING.get(), MonopusMobChargingEntity.createAttributes().build());
		event.put(AGROBAT_MOB_RESTING.get(), AgrobatMobRestingEntity.createAttributes().build());
		event.put(TRICTUS_MOB_RESTING.get(), TrictusMobRestingEntity.createAttributes().build());
		event.put(ORBIDE_MOB_RESTING.get(), OrbideMobRestingEntity.createAttributes().build());
		event.put(HEMOGOBLIN_MOB_FRONT.get(), HemogoblinMobFrontEntity.createAttributes().build());
		event.put(HEMOGOBLIN_MOB_REAR.get(), HemogoblinMobRearEntity.createAttributes().build());
		event.put(MASTEROID_MOB_L.get(), MasteroidMobLEntity.createAttributes().build());
		event.put(MASTEROID_MOB_M.get(), MasteroidMobMEntity.createAttributes().build());
		event.put(MASTEROID_MOB_S.get(), MasteroidMobSEntity.createAttributes().build());
	}
}
