
package net.mcreator.minebound.world.features.ores;

public class MoonDustFeature extends OreFeature {

	public static MoonDustFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new MoonDustFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("minebound:moon_dust", FEATURE,
				new OreConfiguration(List.of(OreConfiguration.target(new BlockStateMatchTest(MineboundModBlocks.MOONROCK.get().defaultBlockState()), MineboundModBlocks.MOON_DUST.get().defaultBlockState())), 64));
		PLACED_FEATURE = PlacementUtils.register("minebound:moon_dust", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(31), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(-113), VerticalAnchor.absolute(64)), BiomeFilter.biome()));
		return FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minebound:moon_dimension")));

	public MoonDustFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;

		return super.place(context);
	}

}
