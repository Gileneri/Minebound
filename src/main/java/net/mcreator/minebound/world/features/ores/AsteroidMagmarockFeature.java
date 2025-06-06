
package net.mcreator.minebound.world.features.ores;

import net.minecraft.world.level.levelgen.structure.templatesystem.BlockStateMatchTest;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.mcreator.minebound.init.MineboundModBlocks;

import java.util.Set;
import java.util.List;

public class AsteroidMagmarockFeature extends OreFeature {
	public static AsteroidMagmarockFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new AsteroidMagmarockFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("minebound:asteroid_magmarock", FEATURE,
				new OreConfiguration(List.of(OreConfiguration.target(new BlockStateMatchTest(MineboundModBlocks.ASTEROID_METEORITEROCK.get().defaultBlockState()), MineboundModBlocks.ASTEROID_MAGMAROCK.get().defaultBlockState())), 30));
		PLACED_FEATURE = PlacementUtils.register("minebound:asteroid_magmarock", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(10), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(150)), BiomeFilter.biome()));
		return FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minebound:toxicoceanplanet")),
			ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minebound:oceanic_planet")), ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minebound:lava_planet")),
			ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minebound:articplanet")), ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minebound:radioactive_moon")),
			ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minebound:gentle_moon")), ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minebound:savannah_planet")),
			ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minebound:asteroid_field")), ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minebound:temperate_moon")),
			ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minebound:decayed_planet")), ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minebound:fiery_moon")),
			ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minebound:volcanic_planet")), ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minebound:tundra_planet")),
			ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minebound:desert_planet")), ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minebound:barren_planet")),
			ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minebound:garden_planet")), ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minebound:mutated_planet")),
			ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minebound:frozen_moon")), ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minebound:snow_planet")),
			ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minebound:midnight_planet")), ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minebound:forest_planet")),
			ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minebound:jungle_planet")));

	public AsteroidMagmarockFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}
