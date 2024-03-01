
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minebound.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.minebound.world.features.ores.TarTestFeature;
import net.mcreator.minebound.world.features.ores.MoonstoneFeature;
import net.mcreator.minebound.world.features.ores.MoonrockFeature;
import net.mcreator.minebound.world.features.ores.MoonDustFeature;
import net.mcreator.minebound.world.features.ToxicislandsFeature;
import net.mcreator.minebound.world.features.GlassTopperStructureFeature;
import net.mcreator.minebound.world.features.ErchiusFuelPoolFeature;
import net.mcreator.minebound.world.features.ErchiusCavePoolFeature;
import net.mcreator.minebound.world.features.AirTopperStructureFeature;
import net.mcreator.minebound.MineboundMod;

@Mod.EventBusSubscriber
public class MineboundModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MineboundMod.MODID);
	public static final RegistryObject<Feature<?>> MOON_DUST = REGISTRY.register("moon_dust", MoonDustFeature::feature);
	public static final RegistryObject<Feature<?>> MOONROCK = REGISTRY.register("moonrock", MoonrockFeature::feature);
	public static final RegistryObject<Feature<?>> MOONSTONE = REGISTRY.register("moonstone", MoonstoneFeature::feature);
	public static final RegistryObject<Feature<?>> TAR_TEST = REGISTRY.register("tar_test", TarTestFeature::feature);
	public static final RegistryObject<Feature<?>> TOXICISLANDS = REGISTRY.register("toxicislands", ToxicislandsFeature::new);
	public static final RegistryObject<Feature<?>> GLASS_TOPPER_STRUCTURE = REGISTRY.register("glass_topper_structure", GlassTopperStructureFeature::feature);
	public static final RegistryObject<Feature<?>> AIR_TOPPER_STRUCTURE = REGISTRY.register("air_topper_structure", AirTopperStructureFeature::feature);
	public static final RegistryObject<Feature<?>> ERCHIUS_FUEL_POOL = REGISTRY.register("erchius_fuel_pool", ErchiusFuelPoolFeature::new);
	public static final RegistryObject<Feature<?>> ERCHIUS_CAVE_POOL = REGISTRY.register("erchius_cave_pool", ErchiusCavePoolFeature::new);
}
