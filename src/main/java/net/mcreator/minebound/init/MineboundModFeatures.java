
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
import net.mcreator.minebound.world.features.ToxicislandsFeature;
import net.mcreator.minebound.world.features.GlassTopperStructureFeature;
import net.mcreator.minebound.world.features.AirTopperStructureFeature;
import net.mcreator.minebound.MineboundMod;

@Mod.EventBusSubscriber
public class MineboundModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MineboundMod.MODID);
	public static final RegistryObject<Feature<?>> GLASS_TOPPER_STRUCTURE = REGISTRY.register("glass_topper_structure", GlassTopperStructureFeature::feature);
	public static final RegistryObject<Feature<?>> TOXICISLANDS = REGISTRY.register("toxicislands", ToxicislandsFeature::new);
	public static final RegistryObject<Feature<?>> AIR_TOPPER_STRUCTURE = REGISTRY.register("air_topper_structure", AirTopperStructureFeature::feature);
	public static final RegistryObject<Feature<?>> TAR_TEST = REGISTRY.register("tar_test", TarTestFeature::feature);
}
