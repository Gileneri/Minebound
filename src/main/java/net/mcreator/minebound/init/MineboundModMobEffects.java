
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minebound.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.minebound.potion.WetMobEffect;
import net.mcreator.minebound.potion.StarvingMobEffect;
import net.mcreator.minebound.potion.SpookedMobEffect;
import net.mcreator.minebound.potion.ShieldGeneratorEffectMobEffect;
import net.mcreator.minebound.potion.PoisonedMobEffect;
import net.mcreator.minebound.potion.HungryMobEffect;
import net.mcreator.minebound.potion.FullBellyMobEffect;
import net.mcreator.minebound.potion.FrostMobEffect;
import net.mcreator.minebound.potion.FoodPoisoningMobEffect;
import net.mcreator.minebound.potion.DeadlyradiationMobEffect;
import net.mcreator.minebound.potion.DeadlyHeatMobEffect;
import net.mcreator.minebound.potion.DeadlyChillMobEffect;
import net.mcreator.minebound.potion.BurningMobEffect;
import net.mcreator.minebound.MineboundMod;

public class MineboundModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MineboundMod.MODID);
	public static final RegistryObject<MobEffect> POISONED = REGISTRY.register("poisoned", () -> new PoisonedMobEffect());
	public static final RegistryObject<MobEffect> WET = REGISTRY.register("wet", () -> new WetMobEffect());
	public static final RegistryObject<MobEffect> DEADLYRADIATION = REGISTRY.register("deadlyradiation", () -> new DeadlyradiationMobEffect());
	public static final RegistryObject<MobEffect> SHIELD_GENERATOR_EFFECT = REGISTRY.register("shield_generator_effect", () -> new ShieldGeneratorEffectMobEffect());
	public static final RegistryObject<MobEffect> DEADLY_CHILL = REGISTRY.register("deadly_chill", () -> new DeadlyChillMobEffect());
	public static final RegistryObject<MobEffect> DEADLY_HEAT = REGISTRY.register("deadly_heat", () -> new DeadlyHeatMobEffect());
	public static final RegistryObject<MobEffect> SPOOKED = REGISTRY.register("spooked", () -> new SpookedMobEffect());
	public static final RegistryObject<MobEffect> BURNING = REGISTRY.register("burning", () -> new BurningMobEffect());
	public static final RegistryObject<MobEffect> FOOD_POISONING = REGISTRY.register("food_poisoning", () -> new FoodPoisoningMobEffect());
	public static final RegistryObject<MobEffect> FULL_BELLY = REGISTRY.register("full_belly", () -> new FullBellyMobEffect());
	public static final RegistryObject<MobEffect> FROST = REGISTRY.register("frost", () -> new FrostMobEffect());
	public static final RegistryObject<MobEffect> HUNGRY = REGISTRY.register("hungry", () -> new HungryMobEffect());
	public static final RegistryObject<MobEffect> STARVING = REGISTRY.register("starving", () -> new StarvingMobEffect());
}
