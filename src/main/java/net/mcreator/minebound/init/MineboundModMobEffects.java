
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minebound.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.minebound.potion.WetMobEffect;
import net.mcreator.minebound.potion.ShieldGeneratorEffectMobEffect;
import net.mcreator.minebound.potion.PoisonedMobEffect;
import net.mcreator.minebound.potion.DeadlyradiationMobEffect;
import net.mcreator.minebound.MineboundMod;

public class MineboundModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MineboundMod.MODID);
	public static final RegistryObject<MobEffect> DEADLYRADIATION = REGISTRY.register("deadlyradiation", () -> new DeadlyradiationMobEffect());
	public static final RegistryObject<MobEffect> WET = REGISTRY.register("wet", () -> new WetMobEffect());
	public static final RegistryObject<MobEffect> SHIELD_GENERATOR_EFFECT = REGISTRY.register("shield_generator_effect", () -> new ShieldGeneratorEffectMobEffect());
	public static final RegistryObject<MobEffect> POISONED = REGISTRY.register("poisoned", () -> new PoisonedMobEffect());
}
