
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minebound.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.minebound.item.VioliumOreItem;
import net.mcreator.minebound.item.TungstenOreItem;
import net.mcreator.minebound.item.TungstenBarItem;
import net.mcreator.minebound.item.TitaniumOreItem;
import net.mcreator.minebound.item.TitaniumBarItem;
import net.mcreator.minebound.item.SolariumStarItem;
import net.mcreator.minebound.item.SolariumOreItem;
import net.mcreator.minebound.item.SilverOreItem;
import net.mcreator.minebound.item.SilverBarItem;
import net.mcreator.minebound.item.SbDiamondItem;
import net.mcreator.minebound.item.RubiumOreItem;
import net.mcreator.minebound.item.RefinedVioliumItem;
import net.mcreator.minebound.item.RefinedRubiumItem;
import net.mcreator.minebound.item.RefinedFeroziumItem;
import net.mcreator.minebound.item.RefinedAegisaltItem;
import net.mcreator.minebound.item.PrismShardItem;
import net.mcreator.minebound.item.PoisonItem;
import net.mcreator.minebound.item.OrbitalItem;
import net.mcreator.minebound.item.MattermanipulatorbetaItem;
import net.mcreator.minebound.item.LiquidErchiusFuelItem;
import net.mcreator.minebound.item.IronOreItem;
import net.mcreator.minebound.item.IronBarItem;
import net.mcreator.minebound.item.HigherItem;
import net.mcreator.minebound.item.GoldOreItem;
import net.mcreator.minebound.item.GoldBarItem;
import net.mcreator.minebound.item.FeroziumOreItem;
import net.mcreator.minebound.item.DurasteelOreItem;
import net.mcreator.minebound.item.DurasteelBarItem;
import net.mcreator.minebound.item.DebugTestToolItem;
import net.mcreator.minebound.item.CrystalErchiusFuelItem;
import net.mcreator.minebound.item.CoreFragmentItem;
import net.mcreator.minebound.item.CopperOreItem;
import net.mcreator.minebound.item.CopperBarItem;
import net.mcreator.minebound.item.CoalItem;
import net.mcreator.minebound.item.AegisaltOreItem;
import net.mcreator.minebound.MineboundMod;

public class MineboundModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MineboundMod.MODID);
	public static final RegistryObject<Item> HIGHER = REGISTRY.register("higher", () -> new HigherItem());
	public static final RegistryObject<Item> MATTERMANIPULATORBETA = REGISTRY.register("mattermanipulatorbeta", () -> new MattermanipulatorbetaItem());
	public static final RegistryObject<Item> DEBUG_TEST_TOOL = REGISTRY.register("debug_test_tool", () -> new DebugTestToolItem());
	public static final RegistryObject<Item> POISON_BUCKET = REGISTRY.register("poison_bucket", () -> new PoisonItem());
	public static final RegistryObject<Item> MECH_TEST_BODY_SPAWN_EGG = REGISTRY.register("mech_test_body_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.MECH_TEST_BODY, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> GLEAP_MOB_SPAWN_EGG = REGISTRY.register("gleap_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.GLEAP_MOB, -26368, -13261, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> NUTMIDGE_MOB_SPAWN_EGG = REGISTRY.register("nutmidge_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.NUTMIDGE_MOB, -6724096, -52, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> NUTMIDGELING_MOB_SPAWN_EGG = REGISTRY.register("nutmidgeling_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.NUTMIDGELING_MOB, -52, -52, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> KING_NUTMIDGELING_MOB_SPAWN_EGG = REGISTRY.register("king_nutmidgeling_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.KING_NUTMIDGELING_MOB, -52, -6697984, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> POPTOP_MOB_SPAWN_EGG = REGISTRY.register("poptop_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.POPTOP_MOB, -52, -13421773, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ADULT_POPTOP_MOB_SPAWN_EGG = REGISTRY.register("adult_poptop_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.ADULT_POPTOP_MOB, -52, -13421773, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> CRUSTOISE_MOB_SPAWN_EGG = REGISTRY.register("crustoise_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.CRUSTOISE_MOB, -6710887, -26317, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> TINTIC_MOB_SPAWN_EGG = REGISTRY.register("tintic_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.TINTIC_MOB, -3355444, -13261, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BATONG_MOB_SPAWN_EGG = REGISTRY.register("batong_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.BATONG_MOB, -13421773, -3407821, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SPOOKIT_MOB_SPAWN_EGG = REGISTRY.register("spookit_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.SPOOKIT_MOB, -10066330, -13261, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> PEBLIT_MOB_SPAWN_EGG = REGISTRY.register("peblit_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.PEBLIT_MOB, -10066330, -103, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> IGUARMOR_MOB_SPAWN_EGG = REGISTRY.register("iguarmor_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.IGUARMOR_MOB, -13382656, -3407872, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SCAVERAN_MOB_SPAWN_EGG = REGISTRY.register("scaveran_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.SCAVERAN_MOB, -16738048, -13261, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> VOLTIP_MOB_SPAWN_EGG = REGISTRY.register("voltip_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.VOLTIP_MOB, -13261, -3407872, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> FENNIX_MOB_SPAWN_EGG = REGISTRY.register("fennix_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.FENNIX_MOB, -3407872, -13312, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> LILODON_MOB_SPAWN_EGG = REGISTRY.register("lilodon_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.LILODON_MOB, -16737844, -3355444, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> PETRICUB_MOB_SPAWN_EGG = REGISTRY.register("petricub_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.PETRICUB_MOB, -10340744, -13312, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> PARATAIL_MOB_SPAWN_EGG = REGISTRY.register("paratail_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.PARATAIL_MOB, -6847394, -3381760, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> WISPER_MOB_SPAWN_EGG = REGISTRY.register("wisper_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.WISPER_MOB, -6684673, -3342337, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SKIMBUS_MOB_SPAWN_EGG = REGISTRY.register("skimbus_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.SKIMBUS_MOB, -10040065, -16750951, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> PULPIN_MOB_SPAWN_EGG = REGISTRY.register("pulpin_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.PULPIN_MOB, -10040065, -6697729, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> CAPRICOAT_MOB_SPAWN_EGG = REGISTRY.register("capricoat_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.CAPRICOAT_MOB, -1710619, -8233423, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SCANDROID_MOB_SPAWN_EGG = REGISTRY.register("scandroid_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.SCANDROID_MOB, -10066330, -3342337, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BOBOT_MOB_SPAWN_EGG = REGISTRY.register("bobot_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.BOBOT_MOB, -10066330, -26215, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> MONOPUS_MOB_SPAWN_EGG = REGISTRY.register("monopus_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.MONOPUS_MOB, -9551483, -6710887, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SNAGGLER_MOB_SPAWN_EGG = REGISTRY.register("snaggler_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.SNAGGLER_MOB, -10053376, -7307690, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> OCULOB_MOB_SPAWN_EGG = REGISTRY.register("oculob_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.OCULOB_MOB, -10040320, -16737946, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> MIASMOP_MOB_SPAWN_EGG = REGISTRY.register("miasmop_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.MIASMOP_MOB, -16737844, -154, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> AGROBAT_MOB_SPAWN_EGG = REGISTRY.register("agrobat_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.AGROBAT_MOB, -10053376, -8716123, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SQUEEM_MOB_SPAWN_EGG = REGISTRY.register("squeem_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.SQUEEM_MOB, -13382656, -8716123, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SNAUNT_MOB_SPAWN_EGG = REGISTRY.register("snaunt_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.SNAUNT_MOB, -10053376, -26368, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> PETROPOD_MOB_SPAWN_EGG = REGISTRY.register("petropod_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.PETROPOD_MOB, -13395712, -3342490, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> CRUTTER_MOB_SPAWN_EGG = REGISTRY.register("crutter_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.CRUTTER_MOB, -6674316, -16750900, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SNUFFISH_MOB_SPAWN_EGG = REGISTRY.register("snuffish_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.SNUFFISH_MOB, -16750900, -13261, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> CRABCANO_MOB_SPAWN_EGG = REGISTRY.register("crabcano_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.CRABCANO_MOB, -39424, -205, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> PYROMANTLE_MOB_SPAWN_EGG = REGISTRY.register("pyromantle_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.PYROMANTLE_MOB, -26368, -13494016, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> IGNOME_MOB_SPAWN_EGG = REGISTRY.register("ignome_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.IGNOME_MOB, -13494016, -26368, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SMOGLIN_MOB_SPAWN_EGG = REGISTRY.register("smoglin_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.SMOGLIN_MOB, -13421773, -13312, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BOBFAE_MOB_SPAWN_EGG = REGISTRY.register("bobfae_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.BOBFAE_MOB, -3381760, -16737844, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ERCHIUS_GHOST_MOB_SPAWN_EGG = REGISTRY.register("erchius_ghost_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.ERCHIUS_GHOST_MOB, -3368449, -3368449, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> QUAGMUTT_MOB_SPAWN_EGG = REGISTRY.register("quagmutt_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.QUAGMUTT_MOB, -13382656, -6697984, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> RINGRAM_MOB_SPAWN_EGG = REGISTRY.register("ringram_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.RINGRAM_MOB, -6724096, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> PIPKIN_MOB_SPAWN_EGG = REGISTRY.register("pipkin_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.PIPKIN_MOB, -3381760, -6719232, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SPORGUS_MOB_SPAWN_EGG = REGISTRY.register("sporgus_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.SPORGUS_MOB, -52, -10040320, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ANGLURE_MOB_SPAWN_EGG = REGISTRY.register("anglure_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.ANGLURE_MOB, -5617186, -103, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> LUMOTH_MOB_SPAWN_EGG = REGISTRY.register("lumoth_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.LUMOTH_MOB, -26317, -103, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> OOGLER_MOB_SPAWN_EGG = REGISTRY.register("oogler_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.OOGLER_MOB, -52, -26113, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> NARFIN_MOB_SPAWN_EGG = REGISTRY.register("narfin_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.NARFIN_MOB, -6697729, -26113, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> TOUMINGO_MOB_SPAWN_EGG = REGISTRY.register("toumingo_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.TOUMINGO_MOB, -13408513, -154, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> TRICTUS_MOB_SPAWN_EGG = REGISTRY.register("trictus_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.TRICTUS_MOB, -6697984, -154, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> MANDRAFLORA_MOB_SPAWN_EGG = REGISTRY.register("mandraflora_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.MANDRAFLORA_MOB, -13210, -13382656, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BULBOP_MOB_SPAWN_EGG = REGISTRY.register("bulbop_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.BULBOP_MOB, -13210, -13382656, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> HYPNARE_MOB_SPAWN_EGG = REGISTRY.register("hypnare_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.HYPNARE_MOB, -6697984, -26113, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> YOKAT_MOB_SPAWN_EGG = REGISTRY.register("yokat_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.YOKAT_MOB, -5753905, -5093490, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ORBIDE_MOB_SPAWN_EGG = REGISTRY.register("orbide_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.ORBIDE_MOB, -14341818, -6697729, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> TARONI_MOB_SPAWN_EGG = REGISTRY.register("taroni_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.TARONI_MOB, -13092284, -39322, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> HEMOGOBLIN_MOB_SPAWN_EGG = REGISTRY.register("hemogoblin_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.HEMOGOBLIN_MOB, -3580836, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> APEX_MUTANT_MOB_SPAWN_EGG = REGISTRY.register("apex_mutant_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.APEX_MUTANT_MOB, -7434693, -13159, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> GOSMET_MOB_SPAWN_EGG = REGISTRY.register("gosmet_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.GOSMET_MOB, -1, -154, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> IXOLING_MOB_SPAWN_EGG = REGISTRY.register("ixoling_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.IXOLING_MOB, -1513274, -39322, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> KLUEX_SENTRY_MOB_SPAWN_EGG = REGISTRY.register("kluex_sentry_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.KLUEX_SENTRY_MOB, -6714812, -65485, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> KLUEX_TOTEM_MOB_SPAWN_EGG = REGISTRY.register("kluex_totem_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.KLUEX_TOTEM_MOB, -6714812, -65485, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> MINI_DRONE_MOB_SPAWN_EGG = REGISTRY.register("mini_drone_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.MINI_DRONE_MOB, -1, -16737793, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> MOTHER_POPTOP_MOB_SPAWN_EGG = REGISTRY.register("mother_poptop_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.MOTHER_POPTOP_MOB, -52, -13421773, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> MOONTANT_MOB_SPAWN_EGG = REGISTRY.register("moontant_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.MOONTANT_MOB, -26215, -26215, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> PO_MOB_SPAWN_EGG = REGISTRY.register("po_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.PO_MOB, -10926283, -26215, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> PO_GOLEM_MOB_SPAWN_EGG = REGISTRY.register("po_golem_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.PO_GOLEM_MOB, -10926283, -11123661, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> PUNCHY_MOB_SPAWN_EGG = REGISTRY.register("punchy_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.PUNCHY_MOB, -1, -26164, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SWARPION_MOB_SPAWN_EGG = REGISTRY.register("swarpion_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.SWARPION_MOB, -15132391, -16711936, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> TENTACLE_BOMB_MOB_SPAWN_EGG = REGISTRY.register("tentacle_bomb_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.TENTACLE_BOMB_MOB, -6750208, -52429, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> TENTACLE_CLAM_MOB_SPAWN_EGG = REGISTRY.register("tentacle_clam_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.TENTACLE_CLAM_MOB, -6750208, -3355444, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> TENTACLE_CRAWLER_MOB_SPAWN_EGG = REGISTRY.register("tentacle_crawler_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.TENTACLE_CRAWLER_MOB, -6750208, -16737895, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> TENTACLE_GHOST_MOB_SPAWN_EGG = REGISTRY.register("tentacle_ghost_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.TENTACLE_GHOST_MOB, -6750208, -6684673, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> TENTACLE_GNAT_MOB_SPAWN_EGG = REGISTRY.register("tentacle_gnat_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.TENTACLE_GNAT_MOB, -6750208, -13261, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> TENTACLE_SPAWNER_MOB_SPAWN_EGG = REGISTRY.register("tentacle_spawner_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.TENTACLE_SPAWNER_MOB, -6750208, -16737895, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> TRIPLOD_MOB_SPAWN_EGG = REGISTRY.register("triplod_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.TRIPLOD_MOB, -2173788, -6684673, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> PARASPRITE_MOB_SPAWN_EGG = REGISTRY.register("parasprite_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.PARASPRITE_MOB, -3373568, -2697564, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> COSMIC_INTRUDER_MOB_SPAWN_EGG = REGISTRY.register("cosmic_intruder_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.COSMIC_INTRUDER_MOB, -16737946, -3394816, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> CHICKEN_MOB_SPAWN_EGG = REGISTRY.register("chicken_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.CHICKEN_MOB, -1, -52429, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ROBOT_CHICKEN_MOB_SPAWN_EGG = REGISTRY.register("robot_chicken_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.ROBOT_CHICKEN_MOB, -6710887, -52429, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> MOOSHI_MOB_SPAWN_EGG = REGISTRY.register("mooshi_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.MOOSHI_MOB, -1, -13421773, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> FLUFFALO_MOB_SPAWN_EGG = REGISTRY.register("fluffalo_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.FLUFFALO_MOB, -10332641, -3355444, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> FLUFFALO_FIRE_MOB_SPAWN_EGG = REGISTRY.register("fluffalo_fire_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.FLUFFALO_FIRE_MOB, -3399424, -7245455, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> FLUFFALO_POISON_MOB_SPAWN_EGG = REGISTRY.register("fluffalo_poison_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.FLUFFALO_POISON_MOB, -6697984, -13261, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> FLUFFALO_ICE_MOB_SPAWN_EGG = REGISTRY.register("fluffalo_ice_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.FLUFFALO_ICE_MOB, -10040065, -26113, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> FLUFFALO_ELECTRIC_MOB_SPAWN_EGG = REGISTRY.register("fluffalo_electric_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.FLUFFALO_ELECTRIC_MOB, -6675774, -10066330, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ASTROFAE_MOB_SPAWN_EGG = REGISTRY.register("astrofae_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.ASTROFAE_MOB, -855310, -16737844, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> CHIROPTERROR_MOB_SPAWN_EGG = REGISTRY.register("chiropterror_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.CHIROPTERROR_MOB, -11841173, -3342439, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> COSMOSTACHE_MOB_SPAWN_EGG = REGISTRY.register("cosmostache_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.COSMOSTACHE_MOB, -3355444, -10040065, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> HEAVY_DRONE_MOB_SPAWN_EGG = REGISTRY.register("heavy_drone_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.HEAVY_DRONE_MOB, -6710887, -13382656, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> MASTEROID_MOB_SPAWN_EGG = REGISTRY.register("masteroid_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.MASTEROID_MOB, -10924229, -16737793, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> OMNICANNON_MOB_SPAWN_EGG = REGISTRY.register("omnicannon_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.OMNICANNON_MOB, -11115008, -12368044, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> RUSTICK_MOB_SPAWN_EGG = REGISTRY.register("rustick_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.RUSTICK_MOB, -10200244, -6710785, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SPINEMINE_MOB_SPAWN_EGG = REGISTRY.register("spinemine_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.SPINEMINE_MOB, -10920855, -39424, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> TRIFANGLE_MOB_SPAWN_EGG = REGISTRY.register("trifangle_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.TRIFANGLE_MOB, -13993787, -16491, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> TWIGUN_MOB_SPAWN_EGG = REGISTRY.register("twigun_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.TWIGUN_MOB, -12431779, -4936860, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> RACER_MOB_1_SPAWN_EGG = REGISTRY.register("racer_mob_1_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.RACER_MOB_1, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> RACER_MOB_2_SPAWN_EGG = REGISTRY.register("racer_mob_2_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.RACER_MOB_2, -1, -3355444, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> RACER_MOB_3_SPAWN_EGG = REGISTRY.register("racer_mob_3_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.RACER_MOB_3, -1, -6710887, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> RACER_MOB_4_SPAWN_EGG = REGISTRY.register("racer_mob_4_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.RACER_MOB_4, -1, -10066330, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> RACER_MOB_5_SPAWN_EGG = REGISTRY.register("racer_mob_5_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.RACER_MOB_5, -1, -13421773, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> RACER_MOB_6_SPAWN_EGG = REGISTRY.register("racer_mob_6_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.RACER_MOB_6, -1, -16777216, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ORBITAL = REGISTRY.register("orbital", () -> new OrbitalItem());
	public static final RegistryObject<Item> TEST_BUTTON = block(MineboundModBlocks.TEST_BUTTON, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> TEST_DOOR = doubleBlock(MineboundModBlocks.TEST_DOOR, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> TEST_PRESSURE_PLATE = block(MineboundModBlocks.TEST_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> TEST_LIGHT_OFF = block(MineboundModBlocks.TEST_LIGHT_OFF, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> TEST_LIGHT_ON = block(MineboundModBlocks.TEST_LIGHT_ON, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> TEST_REDSTONE_OFF = block(MineboundModBlocks.TEST_REDSTONE_OFF, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> TEST_REDSTONE_ON = block(MineboundModBlocks.TEST_REDSTONE_ON, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> ALIENROCK = block(MineboundModBlocks.ALIENROCK, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> ASH = block(MineboundModBlocks.ASH, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> BLASTSTONE = block(MineboundModBlocks.BLASTSTONE, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> BLUEGLOWROCK = block(MineboundModBlocks.BLUEGLOWROCK, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> BRAINS = block(MineboundModBlocks.BRAINS, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> CLAY = block(MineboundModBlocks.CLAY, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> SMOOTHCOBBLESTONE = block(MineboundModBlocks.SMOOTHCOBBLESTONE, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> CORRUPTDIRT = block(MineboundModBlocks.CORRUPTDIRT, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> DIRESTONE = block(MineboundModBlocks.DIRESTONE, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> DIRTMATERIAL = block(MineboundModBlocks.DIRTMATERIAL, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> DRYDIRT = block(MineboundModBlocks.DRYDIRT, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> DRYSAND = block(MineboundModBlocks.DRYSAND, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> FLESHCHUNK = block(MineboundModBlocks.FLESHCHUNK, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> FLESHPILE = block(MineboundModBlocks.FLESHPILE, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> FROZENDIRT = block(MineboundModBlocks.FROZENDIRT, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> GEODECRYSTALS = block(MineboundModBlocks.GEODECRYSTALS, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> GEODESTONE = block(MineboundModBlocks.GEODESTONE, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> COARSEGRAVEL = block(MineboundModBlocks.COARSEGRAVEL, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> HIVEBLOCK = block(MineboundModBlocks.HIVEBLOCK, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> ICEMATERIAL = block(MineboundModBlocks.ICEMATERIAL, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> ICEBLOCK = block(MineboundModBlocks.ICEBLOCK, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> JELLYBLOB = block(MineboundModBlocks.JELLYBLOB, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> JUNKPILE = block(MineboundModBlocks.JUNKPILE, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> LIMESTONE = block(MineboundModBlocks.LIMESTONE, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> LOOSESILT = block(MineboundModBlocks.LOOSESILT, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> MAGMAROCK = block(MineboundModBlocks.MAGMAROCK, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> METEORITEROCK = block(MineboundModBlocks.METEORITEROCK, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> MOON_DUST = block(MineboundModBlocks.MOON_DUST, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> MOONROCK = block(MineboundModBlocks.MOONROCK, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> MOONSTONE = block(MineboundModBlocks.MOONSTONE, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> MUD = block(MineboundModBlocks.MUD, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> OBSIDIAN = block(MineboundModBlocks.OBSIDIAN, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> PLANT_MATTER = block(MineboundModBlocks.PLANT_MATTER, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> SAND = block(MineboundModBlocks.SAND, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> ROUGHSANDSTONE = block(MineboundModBlocks.ROUGHSANDSTONE, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> SLIME_GLOB = block(MineboundModBlocks.SLIME_GLOB, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> SLUSH = block(MineboundModBlocks.SLUSH, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> SMOOTHICE = block(MineboundModBlocks.SMOOTHICE, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> THICKSNOW = block(MineboundModBlocks.THICKSNOW, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> STONERUBBLE = block(MineboundModBlocks.STONERUBBLE, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> STRIPED_WOOD = block(MineboundModBlocks.STRIPED_WOOD, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> TAR = block(MineboundModBlocks.TAR, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> TENTACLE_CLUSTER = block(MineboundModBlocks.TENTACLE_CLUSTER, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> VINE_BLOCK = block(MineboundModBlocks.VINE_BLOCK, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> WASTE = block(MineboundModBlocks.WASTE, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> WET_DIRT = block(MineboundModBlocks.WET_DIRT, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> WOODEN_LOG = block(MineboundModBlocks.WOODEN_LOG, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> YELLOW_GLOW_ROCK = block(MineboundModBlocks.YELLOW_GLOW_ROCK, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> UNREFINED_MUDSTONE = block(MineboundModBlocks.UNREFINED_MUDSTONE, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> UNREFINED_ANDESITE = block(MineboundModBlocks.UNREFINED_ANDESITE, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> UNREFINED_DACITE = block(MineboundModBlocks.UNREFINED_DACITE, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> UNREFINED_GNEISS = block(MineboundModBlocks.UNREFINED_GNEISS, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> UNREFINED_LIMESTONE = block(MineboundModBlocks.UNREFINED_LIMESTONE, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> GRANITE_ROCK = block(MineboundModBlocks.GRANITE_ROCK, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> UNREFINED_CHERT = block(MineboundModBlocks.UNREFINED_CHERT, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> UNREFINED_GRITSTONE = block(MineboundModBlocks.UNREFINED_GRITSTONE, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> UNREFINED_CONGLOMERATE = block(MineboundModBlocks.UNREFINED_CONGLOMERATE, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> UNREFINED_ARKOSE = block(MineboundModBlocks.UNREFINED_ARKOSE, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> PACKED_BONES = block(MineboundModBlocks.PACKED_BONES, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> DEADCORE = block(MineboundModBlocks.DEADCORE, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> CLOUD = block(MineboundModBlocks.CLOUD, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> ASTEROID_MAGMAROCK = block(MineboundModBlocks.ASTEROID_MAGMAROCK, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> ASTEROID_MATEORITEROCK = block(MineboundModBlocks.ASTEROID_MATEORITEROCK, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> TAR_TEST = block(MineboundModBlocks.TAR_TEST, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> THEBLOCK = block(MineboundModBlocks.THEBLOCK, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> ASPHALT = block(MineboundModBlocks.ASPHALT, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> ASPHALT_SLAB = block(MineboundModBlocks.ASPHALT_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> BRICKS = block(MineboundModBlocks.BRICKS, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> CABINROOFING = block(MineboundModBlocks.CABINROOFING, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> CABIN_ROOFING_STAIRS = block(MineboundModBlocks.CABIN_ROOFING_STAIRS, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> CABIN_ROOFING_SLAB = block(MineboundModBlocks.CABIN_ROOFING_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> COBBLESTONE_BRICKS = block(MineboundModBlocks.COBBLESTONE_BRICKS, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> COPPER_GEAR_BLOCK = block(MineboundModBlocks.COPPER_GEAR_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> COPPER_ROOFING = block(MineboundModBlocks.COPPER_ROOFING, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> COPPER_ROOFING_STAIRS = block(MineboundModBlocks.COPPER_ROOFING_STAIRS, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> COPPER_ROOFING_SLAB = block(MineboundModBlocks.COPPER_ROOFING_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> CRYSTAL_BLOCK = block(MineboundModBlocks.CRYSTAL_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> GLASS_BLOCK = block(MineboundModBlocks.GLASS_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> IRON_BLOCK = block(MineboundModBlocks.IRON_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> GOLD_BLOCK = block(MineboundModBlocks.GOLD_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> MUSHROOM_BLOCK = block(MineboundModBlocks.MUSHROOM_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> PACKED_DIRT = block(MineboundModBlocks.PACKED_DIRT, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> PILE_OF_EYES = block(MineboundModBlocks.PILE_OF_EYES, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> PLATINUM_BLOCK = block(MineboundModBlocks.PLATINUM_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> RAINBOW_WOOD_PLANKS = block(MineboundModBlocks.RAINBOW_WOOD_PLANKS, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> REED_BLOCK = block(MineboundModBlocks.REED_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> REED_BLOCK_SLAB = block(MineboundModBlocks.REED_BLOCK_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> SILVER_BLOCK = block(MineboundModBlocks.SILVER_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> SMOOTH_METAL = block(MineboundModBlocks.SMOOTH_METAL, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> SMOOTH_PLATED_BLOCK = block(MineboundModBlocks.SMOOTH_PLATED_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> TIMBER = block(MineboundModBlocks.TIMBER, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> TITANIUM_PANEL = block(MineboundModBlocks.TITANIUM_PANEL, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> TREASURE_HOARD = block(MineboundModBlocks.TREASURE_HOARD, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> TREATED_WOOD = block(MineboundModBlocks.TREATED_WOOD, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> TUNGSTEN_BLOCK = block(MineboundModBlocks.TUNGSTEN_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> TUNGSTEN_SLAB = block(MineboundModBlocks.TUNGSTEN_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> AVIANTECHBLOCK = block(MineboundModBlocks.AVIANTECHBLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> BAMBOO = block(MineboundModBlocks.BAMBOO, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> BAMBOO_STAIRS = block(MineboundModBlocks.BAMBOO_STAIRS, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> BAMBOO_SLAB = block(MineboundModBlocks.BAMBOO_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> BLACKGLASS = block(MineboundModBlocks.BLACKGLASS, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> CACTI = block(MineboundModBlocks.CACTI, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> CLASSIC_BASEBOARD = block(MineboundModBlocks.CLASSIC_BASEBOARD, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> CLASSIC_BASEBORD_SLAB = block(MineboundModBlocks.CLASSIC_BASEBORD_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> CLASSICWALLPAPER = block(MineboundModBlocks.CLASSICWALLPAPER, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> CLASSIC_WALPAPER_PANEL = block(MineboundModBlocks.CLASSIC_WALPAPER_PANEL, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> CONCRETE_BLOCK = block(MineboundModBlocks.CONCRETE_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> CONCRETE_STAIRS = block(MineboundModBlocks.CONCRETE_STAIRS, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> CONCRETE_BLOCK_SLAB = block(MineboundModBlocks.CONCRETE_BLOCK_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> DARK_SMOOTH_STONE = block(MineboundModBlocks.DARK_SMOOTH_STONE, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> DARK_SMOOTH_STONE_STAIRS = block(MineboundModBlocks.DARK_SMOOTH_STONE_STAIRS, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> DARK_SMOOTH_STONE_SLAB = block(MineboundModBlocks.DARK_SMOOTH_STONE_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> DARK_TOMB_BRICKS = block(MineboundModBlocks.DARK_TOMB_BRICKS, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> DARK_TOMB_BRICKS_SLAB = block(MineboundModBlocks.DARK_TOMB_BRICKS_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> FLOWER_BLOCK = block(MineboundModBlocks.FLOWER_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> HAZARD_BLOCK = block(MineboundModBlocks.HAZARD_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> HEAVY_IRON_BARS = block(MineboundModBlocks.HEAVY_IRON_BARS, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> HEAVY_STONE_BRICKS = block(MineboundModBlocks.HEAVY_STONE_BRICKS, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> HEAVY_STONE_BRICKS_STAIRS = block(MineboundModBlocks.HEAVY_STONE_BRICKS_STAIRS, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> HEAVY_STONE_BRICKS_SLAB = block(MineboundModBlocks.HEAVY_STONE_BRICKS_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> HITECH_BLOCK = block(MineboundModBlocks.HITECH_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> JUNK_TECH = block(MineboundModBlocks.JUNK_TECH, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> LIGHT_METAL = block(MineboundModBlocks.LIGHT_METAL, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> LIGHT_METAL_SLAB = block(MineboundModBlocks.LIGHT_METAL_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> LUNAR_BASE_BLOCK = block(MineboundModBlocks.LUNAR_BASE_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> LUNAR_BASE_BLOCK_SLAB = block(MineboundModBlocks.LUNAR_BASE_BLOCK_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> METAL_BARS = block(MineboundModBlocks.METAL_BARS, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> METAL_RAILING = block(MineboundModBlocks.METAL_RAILING, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> METAL_RAILING_SLAB = block(MineboundModBlocks.METAL_RAILING_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> MIRROR_BLOCK = block(MineboundModBlocks.MIRROR_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> MOSSY_PACKED_DIRT = block(MineboundModBlocks.MOSSY_PACKED_DIRT, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> ORNATE_FLOORING = block(MineboundModBlocks.ORNATE_FLOORING, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> ORNATE_FLOORING_STAIRS = block(MineboundModBlocks.ORNATE_FLOORING_STAIRS, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> ORNATE_FLOORING_SLAB = block(MineboundModBlocks.ORNATE_FLOORING_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> ORNATE_ROOFING = block(MineboundModBlocks.ORNATE_ROOFING, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> ORNATE_ROOFING_STAIRS = block(MineboundModBlocks.ORNATE_ROOFING_STAIRS, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> ORNATE_ROOFING_SLAB = block(MineboundModBlocks.ORNATE_ROOFING_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> ORNATE_TILES = block(MineboundModBlocks.ORNATE_TILES, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> ORNATE_TILES_SLAB = block(MineboundModBlocks.ORNATE_TILES_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> ORNATE_WALL = block(MineboundModBlocks.ORNATE_WALL, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> ORNATE_WALL_SLAB = block(MineboundModBlocks.ORNATE_WALL_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> ORNATE_WALL_PANEL = block(MineboundModBlocks.ORNATE_WALL_PANEL, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> ORNATEWOOD_BLOCK = block(MineboundModBlocks.ORNATEWOOD_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> THICK_ORNATE_WOOD = block(MineboundModBlocks.THICK_ORNATE_WOOD, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> OUTPOST_CONCRETE = block(MineboundModBlocks.OUTPOST_CONCRETE, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> OUTPOST_CONCRETE_WALL = block(MineboundModBlocks.OUTPOST_CONCRETE_WALL, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> OUTPOST_CONCRETE_SLAB = block(MineboundModBlocks.OUTPOST_CONCRETE_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> OUTPOST_SUPPORT_BEAM_BLOCK = block(MineboundModBlocks.OUTPOST_SUPPORT_BEAM_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> OUTPOST_THICK_SUPPORT_BEAM = block(MineboundModBlocks.OUTPOST_THICK_SUPPORT_BEAM, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> OUTPOST_SUPPORT_BEAM_SLAB = block(MineboundModBlocks.OUTPOST_SUPPORT_BEAM_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> OUTPOST_SUPPORT_THICKWALL = block(MineboundModBlocks.OUTPOST_SUPPORT_THICKWALL, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> OUTPOST_SUPPORT_WALL_SLABS = block(MineboundModBlocks.OUTPOST_SUPPORT_WALL_SLABS, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> OUTPOST_WALL_BLOCK = block(MineboundModBlocks.OUTPOST_WALL_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> OUTPOST_WALL_SLAB = block(MineboundModBlocks.OUTPOST_WALL_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> PAINTED_BRICKS = block(MineboundModBlocks.PAINTED_BRICKS, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> PETAL_BLOCKS = block(MineboundModBlocks.PETAL_BLOCKS, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> PILE_OF_BOOKS = block(MineboundModBlocks.PILE_OF_BOOKS, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> PRESSURISED_BEAM_BLOCK = block(MineboundModBlocks.PRESSURISED_BEAM_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> PRESSURISED_THICK_BEAM = block(MineboundModBlocks.PRESSURISED_THICK_BEAM, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> PRESSURISED_BEAM_SLAB = block(MineboundModBlocks.PRESSURISED_BEAM_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> PRESSURISED_DURASTEEL = block(MineboundModBlocks.PRESSURISED_DURASTEEL, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> PRESSURISED_DURASTEEL_SLAB = block(MineboundModBlocks.PRESSURISED_DURASTEEL_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> PRESSURISED_DURASTEEL_PANEL = block(MineboundModBlocks.PRESSURISED_DURASTEEL_PANEL, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> PRESSURISED_GIRDER_BLOCK = block(MineboundModBlocks.PRESSURISED_GIRDER_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> PRESSURISED_THICK_GIRDER = block(MineboundModBlocks.PRESSURISED_THICK_GIRDER, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> PRESSURISED_GIRDER_SLAB = block(MineboundModBlocks.PRESSURISED_GIRDER_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> REINFORCED_TECH_BLOCK = block(MineboundModBlocks.REINFORCED_TECH_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> REINFORCED_TECH_BLOCK_SLAB = block(MineboundModBlocks.REINFORCED_TECH_BLOCK_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> ROCK_BRICKS = block(MineboundModBlocks.ROCK_BRICKS, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> RUSTY_METAL = block(MineboundModBlocks.RUSTY_METAL, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> RUSTY_METAL_SLAB = block(MineboundModBlocks.RUSTY_METAL_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> SANDSTONE_BRICKS = block(MineboundModBlocks.SANDSTONE_BRICKS, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> SANDSTONE_BRICKS_STAIRS = block(MineboundModBlocks.SANDSTONE_BRICKS_STAIRS, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> SANDSTONE_BRICKS_SLAB = block(MineboundModBlocks.SANDSTONE_BRICKS_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> SHADOW_BRICKS_BLOCK = block(MineboundModBlocks.SHADOW_BRICKS_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> SHADOW_BRICKS_STAIRS = block(MineboundModBlocks.SHADOW_BRICKS_STAIRS, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> SHADOW_BRICKS_SLAB = block(MineboundModBlocks.SHADOW_BRICKS_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> SHADOW_SPIKED_BLOCK = block(MineboundModBlocks.SHADOW_SPIKED_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> SHADOW_SPIKED_SLAB = block(MineboundModBlocks.SHADOW_SPIKED_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> SHIP_SUPPORT_BLOCK = block(MineboundModBlocks.SHIP_SUPPORT_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> SHIP_THICK_SUPPOT = block(MineboundModBlocks.SHIP_THICK_SUPPOT, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> SHIP_SUPPORT_SLAB = block(MineboundModBlocks.SHIP_SUPPORT_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> SHOJI_SCREEN_BLOCK = block(MineboundModBlocks.SHOJI_SCREEN_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> SHOJI_SCREEN_STAIRS = block(MineboundModBlocks.SHOJI_SCREEN_STAIRS, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> SHOJI_SCREEN_SLAB = block(MineboundModBlocks.SHOJI_SCREEN_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> SHOJI_SCREEN_PANEL = block(MineboundModBlocks.SHOJI_SCREEN_PANEL, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> SIMPLE_TEMPLE_BLOCK = block(MineboundModBlocks.SIMPLE_TEMPLE_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> SIMPLE_TEMPLE_STAIRS = block(MineboundModBlocks.SIMPLE_TEMPLE_STAIRS, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> SIMPLE_TEMPLE_SLAB = block(MineboundModBlocks.SIMPLE_TEMPLE_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> SMALL_STONE_BRICKS = block(MineboundModBlocks.SMALL_STONE_BRICKS, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> SMALL_STONE_BRICKS_SLAB = block(MineboundModBlocks.SMALL_STONE_BRICKS_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> SMALL_STONE_BRICKS_WALL = block(MineboundModBlocks.SMALL_STONE_BRICKS_WALL, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> SMALL_TEMPLE_BRICKS = block(MineboundModBlocks.SMALL_TEMPLE_BRICKS, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> SMALL_TEMPLE_BRICKS_SLAB = block(MineboundModBlocks.SMALL_TEMPLE_BRICKS_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> SMALL_TEMPLE_BRICKS_WALL = block(MineboundModBlocks.SMALL_TEMPLE_BRICKS_WALL, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> SMALL_TOMB_BRICKS = block(MineboundModBlocks.SMALL_TOMB_BRICKS, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> SMALL_TOMB_BRICKS_SLAB = block(MineboundModBlocks.SMALL_TOMB_BRICKS_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> SMOOTH_TOMB_BRICKS = block(MineboundModBlocks.SMOOTH_TOMB_BRICKS, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> SMOOTH_TOMB_BRICKS_SLAB = block(MineboundModBlocks.SMOOTH_TOMB_BRICKS_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> SOFT_BRICKS = block(MineboundModBlocks.SOFT_BRICKS, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> STONE_TILES = block(MineboundModBlocks.STONE_TILES, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> TACKY_WALLPAPER_BLOCK = block(MineboundModBlocks.TACKY_WALLPAPER_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> TACKY_WALLPAPER_PANEL = block(MineboundModBlocks.TACKY_WALLPAPER_PANEL, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> TEMPLE_BLOCK = block(MineboundModBlocks.TEMPLE_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> TEMPLE_STAIRS = block(MineboundModBlocks.TEMPLE_STAIRS, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> TEMPLE_SLAB = block(MineboundModBlocks.TEMPLE_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> TEMPLE_BRICKS = block(MineboundModBlocks.TEMPLE_BRICKS, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> TEMPLE_BRICKS_SLAB = block(MineboundModBlocks.TEMPLE_BRICKS_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> TEMPLE_BRICKSWALL = block(MineboundModBlocks.TEMPLE_BRICKSWALL, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> THATCH = block(MineboundModBlocks.THATCH, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> THATCH_SLAB = block(MineboundModBlocks.THATCH_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> TOMB_BRICKS = block(MineboundModBlocks.TOMB_BRICKS, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> TOMB_BRICKS_SLAB = block(MineboundModBlocks.TOMB_BRICKS_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> UNMARKED_TOMB_BRICKS = block(MineboundModBlocks.UNMARKED_TOMB_BRICKS, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> UNMARKED_TOMB_BRICKS_WALL = block(MineboundModBlocks.UNMARKED_TOMB_BRICKS_WALL, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> UNREFINED_WOOD = block(MineboundModBlocks.UNREFINED_WOOD, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> WALL_BLOCK = block(MineboundModBlocks.WALL_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> WALL_SLAB = block(MineboundModBlocks.WALL_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> WALL_PANEL = block(MineboundModBlocks.WALL_PANEL, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> WICKER = block(MineboundModBlocks.WICKER, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> WICKER_SUPPORT_BLOCK = block(MineboundModBlocks.WICKER_SUPPORT_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> WICKER_SUPPORT_SLAB = block(MineboundModBlocks.WICKER_SUPPORT_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> WOOD_PANELLING = block(MineboundModBlocks.WOOD_PANELLING, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> WOODEN_BRIDGE_BLOCK = block(MineboundModBlocks.WOODEN_BRIDGE_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> WOODEN_BRIDGE_SLAB = block(MineboundModBlocks.WOODEN_BRIDGE_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> GLYPH_BLOCK = block(MineboundModBlocks.GLYPH_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> NEON_BLOCK = block(MineboundModBlocks.NEON_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> PLANT_BLOCK = block(MineboundModBlocks.PLANT_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> PLANT_BLOCK_SLAB = block(MineboundModBlocks.PLANT_BLOCK_SLAB, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> RUSTY_BLOCK = block(MineboundModBlocks.RUSTY_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> WINDOW_LATTICE = block(MineboundModBlocks.WINDOW_LATTICE, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> WOODEN_BLINDS = block(MineboundModBlocks.WOODEN_BLINDS, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> WOODEN_WINDOW = block(MineboundModBlocks.WOODEN_WINDOW, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> COPPER_WINDOW = block(MineboundModBlocks.COPPER_WINDOW, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> ANCIENT_BLOCK = block(MineboundModBlocks.ANCIENT_BLOCK, MineboundModTabs.TAB_VILLAGEAND_DUNGEON_BLOCKS);
	public static final RegistryObject<Item> ANCIENT_STAIRS = block(MineboundModBlocks.ANCIENT_STAIRS, MineboundModTabs.TAB_VILLAGEAND_DUNGEON_BLOCKS);
	public static final RegistryObject<Item> ANCIENT_SLAB = block(MineboundModBlocks.ANCIENT_SLAB, MineboundModTabs.TAB_VILLAGEAND_DUNGEON_BLOCKS);
	public static final RegistryObject<Item> ANCIENT_BRICK_BLOCK = block(MineboundModBlocks.ANCIENT_BRICK_BLOCK, MineboundModTabs.TAB_VILLAGEAND_DUNGEON_BLOCKS);
	public static final RegistryObject<Item> ANCIENT_BRICK_SLAB = block(MineboundModBlocks.ANCIENT_BRICK_SLAB, MineboundModTabs.TAB_VILLAGEAND_DUNGEON_BLOCKS);
	public static final RegistryObject<Item> GRASSY_ROCK = block(MineboundModBlocks.GRASSY_ROCK, MineboundModTabs.TAB_VILLAGEAND_DUNGEON_BLOCKS);
	public static final RegistryObject<Item> GRASSY_STAIRS = block(MineboundModBlocks.GRASSY_STAIRS, MineboundModTabs.TAB_VILLAGEAND_DUNGEON_BLOCKS);
	public static final RegistryObject<Item> GRASSY_SLAB = block(MineboundModBlocks.GRASSY_SLAB, MineboundModTabs.TAB_VILLAGEAND_DUNGEON_BLOCKS);
	public static final RegistryObject<Item> ERCHIUS_CRYSTAL = block(MineboundModBlocks.ERCHIUS_CRYSTAL, MineboundModTabs.TAB_VILLAGEAND_DUNGEON_BLOCKS);
	public static final RegistryObject<Item> ERCHIUS_CRYSTAL_SLAB = block(MineboundModBlocks.ERCHIUS_CRYSTAL_SLAB, MineboundModTabs.TAB_VILLAGEAND_DUNGEON_BLOCKS);
	public static final RegistryObject<Item> MATTER_BLOCK = block(MineboundModBlocks.MATTER_BLOCK, MineboundModTabs.TAB_VILLAGEAND_DUNGEON_BLOCKS);
	public static final RegistryObject<Item> RAW_SEWAGE = block(MineboundModBlocks.RAW_SEWAGE, MineboundModTabs.TAB_VILLAGEAND_DUNGEON_BLOCKS);
	public static final RegistryObject<Item> RIDGE_BLOCK = block(MineboundModBlocks.RIDGE_BLOCK, MineboundModTabs.TAB_VILLAGEAND_DUNGEON_BLOCKS);
	public static final RegistryObject<Item> RIDGE_SLAB = block(MineboundModBlocks.RIDGE_SLAB, MineboundModTabs.TAB_VILLAGEAND_DUNGEON_BLOCKS);
	public static final RegistryObject<Item> SHADOW_ROCK = block(MineboundModBlocks.SHADOW_ROCK, MineboundModTabs.TAB_VILLAGEAND_DUNGEON_BLOCKS);
	public static final RegistryObject<Item> SHADOW_ROCK_STAIRS = block(MineboundModBlocks.SHADOW_ROCK_STAIRS, MineboundModTabs.TAB_VILLAGEAND_DUNGEON_BLOCKS);
	public static final RegistryObject<Item> SHADOW_ROCK_SLAB = block(MineboundModBlocks.SHADOW_ROCK_SLAB, MineboundModTabs.TAB_VILLAGEAND_DUNGEON_BLOCKS);
	public static final RegistryObject<Item> SOD_BLOCK = block(MineboundModBlocks.SOD_BLOCK, MineboundModTabs.TAB_VILLAGEAND_DUNGEON_BLOCKS);
	public static final RegistryObject<Item> SOD_SLAB = block(MineboundModBlocks.SOD_SLAB, MineboundModTabs.TAB_VILLAGEAND_DUNGEON_BLOCKS);
	public static final RegistryObject<Item> TEST_LIGHT_BLOCK = block(MineboundModBlocks.TEST_LIGHT_BLOCK, null);
	public static final RegistryObject<Item> COPPER_FENCE = block(MineboundModBlocks.COPPER_FENCE, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> COPPER_FENCE_CORNER_1 = block(MineboundModBlocks.COPPER_FENCE_CORNER_1, null);
	public static final RegistryObject<Item> COPPER_FENCE_CORNER_2 = block(MineboundModBlocks.COPPER_FENCE_CORNER_2, null);
	public static final RegistryObject<Item> COPPER_FENCE_CORNER_3 = block(MineboundModBlocks.COPPER_FENCE_CORNER_3, null);
	public static final RegistryObject<Item> WOODEN_FENCE = block(MineboundModBlocks.WOODEN_FENCE, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> WOODEN_FENCE_CORNER = block(MineboundModBlocks.WOODEN_FENCE_CORNER, null);
	public static final RegistryObject<Item> WOODEN_FENCE_CROSS = block(MineboundModBlocks.WOODEN_FENCE_CROSS, null);
	public static final RegistryObject<Item> WOODEN_FENCE_CROSS_2 = block(MineboundModBlocks.WOODEN_FENCE_CROSS_2, null);
	public static final RegistryObject<Item> BLACK_BLOCK = block(MineboundModBlocks.BLACK_BLOCK, MineboundModTabs.TAB_VILLAGEAND_DUNGEON_BLOCKS);
	public static final RegistryObject<Item> PILLAR_BLOCK = block(MineboundModBlocks.PILLAR_BLOCK, MineboundModTabs.TAB_CRAFTABLEBLOCKS);
	public static final RegistryObject<Item> PILLAR_BLOCK_BOTTOM = block(MineboundModBlocks.PILLAR_BLOCK_BOTTOM, null);
	public static final RegistryObject<Item> PILLAR_BLOCK_MIDDLE = block(MineboundModBlocks.PILLAR_BLOCK_MIDDLE, null);
	public static final RegistryObject<Item> PILLAR_BLOCK_TOP = block(MineboundModBlocks.PILLAR_BLOCK_TOP, null);
	public static final RegistryObject<Item> CRYSTAL_ERCHIUS_FUEL = REGISTRY.register("crystal_erchius_fuel", () -> new CrystalErchiusFuelItem());
	public static final RegistryObject<Item> CORE_FRAGMENT = REGISTRY.register("core_fragment", () -> new CoreFragmentItem());
	public static final RegistryObject<Item> COAL = REGISTRY.register("coal", () -> new CoalItem());
	public static final RegistryObject<Item> PRISM_SHARD = REGISTRY.register("prism_shard", () -> new PrismShardItem());
	public static final RegistryObject<Item> COPPER_ORE = REGISTRY.register("copper_ore", () -> new CopperOreItem());
	public static final RegistryObject<Item> SILVER_ORE = REGISTRY.register("silver_ore", () -> new SilverOreItem());
	public static final RegistryObject<Item> GOLD_ORE = REGISTRY.register("gold_ore", () -> new GoldOreItem());
	public static final RegistryObject<Item> TUNGSTEN_ORE = REGISTRY.register("tungsten_ore", () -> new TungstenOreItem());
	public static final RegistryObject<Item> IRON_ORE = REGISTRY.register("iron_ore", () -> new IronOreItem());
	public static final RegistryObject<Item> TITANIUM_ORE = REGISTRY.register("titanium_ore", () -> new TitaniumOreItem());
	public static final RegistryObject<Item> DURASTEEL_ORE = REGISTRY.register("durasteel_ore", () -> new DurasteelOreItem());
	public static final RegistryObject<Item> AEGISALT_ORE = REGISTRY.register("aegisalt_ore", () -> new AegisaltOreItem());
	public static final RegistryObject<Item> FEROZIUM_ORE = REGISTRY.register("ferozium_ore", () -> new FeroziumOreItem());
	public static final RegistryObject<Item> VIOLIUM_ORE = REGISTRY.register("violium_ore", () -> new VioliumOreItem());
	public static final RegistryObject<Item> SOLARIUM_ORE = REGISTRY.register("solarium_ore", () -> new SolariumOreItem());
	public static final RegistryObject<Item> SB_DIAMOND = REGISTRY.register("sb_diamond", () -> new SbDiamondItem());
	public static final RegistryObject<Item> COPPER_BAR = REGISTRY.register("copper_bar", () -> new CopperBarItem());
	public static final RegistryObject<Item> SILVER_BAR = REGISTRY.register("silver_bar", () -> new SilverBarItem());
	public static final RegistryObject<Item> GOLD_BAR = REGISTRY.register("gold_bar", () -> new GoldBarItem());
	public static final RegistryObject<Item> TUNGSTEN_BAR = REGISTRY.register("tungsten_bar", () -> new TungstenBarItem());
	public static final RegistryObject<Item> IRON_BAR = REGISTRY.register("iron_bar", () -> new IronBarItem());
	public static final RegistryObject<Item> TITANIUM_BAR = REGISTRY.register("titanium_bar", () -> new TitaniumBarItem());
	public static final RegistryObject<Item> DURASTEEL_BAR = REGISTRY.register("durasteel_bar", () -> new DurasteelBarItem());
	public static final RegistryObject<Item> REFINED_AEGISALT = REGISTRY.register("refined_aegisalt", () -> new RefinedAegisaltItem());
	public static final RegistryObject<Item> REFINED_FEROZIUM = REGISTRY.register("refined_ferozium", () -> new RefinedFeroziumItem());
	public static final RegistryObject<Item> REFINED_VIOLIUM = REGISTRY.register("refined_violium", () -> new RefinedVioliumItem());
	public static final RegistryObject<Item> SOLARIUM_STAR = REGISTRY.register("solarium_star", () -> new SolariumStarItem());
	public static final RegistryObject<Item> RUBIUM_ORE = REGISTRY.register("rubium_ore", () -> new RubiumOreItem());
	public static final RegistryObject<Item> REFINED_RUBIUM = REGISTRY.register("refined_rubium", () -> new RefinedRubiumItem());
	public static final RegistryObject<Item> LIQUID_ERCHIUS_FUEL_BUCKET = REGISTRY.register("liquid_erchius_fuel_bucket", () -> new LiquidErchiusFuelItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
