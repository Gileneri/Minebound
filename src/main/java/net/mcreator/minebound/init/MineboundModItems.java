
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

import net.mcreator.minebound.item.PoisonItem;
import net.mcreator.minebound.item.OrbitalItem;
import net.mcreator.minebound.item.MattermanipulatorbetaItem;
import net.mcreator.minebound.item.HigherItem;
import net.mcreator.minebound.item.DebugTestToolItem;
import net.mcreator.minebound.MineboundMod;

public class MineboundModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MineboundMod.MODID);
	public static final RegistryObject<Item> HIGHER = REGISTRY.register("higher", () -> new HigherItem());
	public static final RegistryObject<Item> POISON_BUCKET = REGISTRY.register("poison_bucket", () -> new PoisonItem());
	public static final RegistryObject<Item> MATTERMANIPULATORBETA = REGISTRY.register("mattermanipulatorbeta", () -> new MattermanipulatorbetaItem());
	public static final RegistryObject<Item> TEXTURE = block(MineboundModBlocks.TEXTURE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DEBUG_TEST_TOOL = REGISTRY.register("debug_test_tool", () -> new DebugTestToolItem());
	public static final RegistryObject<Item> ORBITAL = REGISTRY.register("orbital", () -> new OrbitalItem());
	public static final RegistryObject<Item> TEST_LIGHT_BLOCK = block(MineboundModBlocks.TEST_LIGHT_BLOCK, null);
	public static final RegistryObject<Item> MECH_TEST_BODY_SPAWN_EGG = REGISTRY.register("mech_test_body_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.MECH_TEST_BODY, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
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
	public static final RegistryObject<Item> CLOUD = block(MineboundModBlocks.CLOUD, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> SMOOTHCOBBLESTONE = block(MineboundModBlocks.SMOOTHCOBBLESTONE, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> CORRUPTDIRT = block(MineboundModBlocks.CORRUPTDIRT, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> DIRESTONE = block(MineboundModBlocks.DIRESTONE, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> GLEAP_MOB_SPAWN_EGG = REGISTRY.register("gleap_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.GLEAP_MOB, -26368, -13261, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> DIRTMATERIAL = block(MineboundModBlocks.DIRTMATERIAL, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> DRYDIRT = block(MineboundModBlocks.DRYDIRT, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> DRYSAND = block(MineboundModBlocks.DRYSAND, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> FLESHCHUNK = block(MineboundModBlocks.FLESHCHUNK, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> FLESHPILE = block(MineboundModBlocks.FLESHPILE, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> NUTMIDGE_MOB_SPAWN_EGG = REGISTRY.register("nutmidge_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.NUTMIDGE_MOB, -6724096, -52, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> FROZENDIRT = block(MineboundModBlocks.FROZENDIRT, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> THEBLOCK = block(MineboundModBlocks.THEBLOCK, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> NUTMIDGELING_MOB_SPAWN_EGG = REGISTRY.register("nutmidgeling_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.NUTMIDGELING_MOB, -52, -52, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> GEODECRYSTALS = block(MineboundModBlocks.GEODECRYSTALS, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> KING_NUTMIDGELING_MOB_SPAWN_EGG = REGISTRY.register("king_nutmidgeling_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.KING_NUTMIDGELING_MOB, -52, -6697984, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> GEODESTONE = block(MineboundModBlocks.GEODESTONE, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> POPTOP_MOB_SPAWN_EGG = REGISTRY.register("poptop_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.POPTOP_MOB, -52, -13421773, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> COARSEGRAVEL = block(MineboundModBlocks.COARSEGRAVEL, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> ADULT_POPTOP_MOB_SPAWN_EGG = REGISTRY.register("adult_poptop_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.ADULT_POPTOP_MOB, -52, -13421773, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> HIVEBLOCK = block(MineboundModBlocks.HIVEBLOCK, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> CRUSTOISE_MOB_SPAWN_EGG = REGISTRY.register("crustoise_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(MineboundModEntities.CRUSTOISE_MOB, -6710887, -26317, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ICEMATERIAL = block(MineboundModBlocks.ICEMATERIAL, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> ICEBLOCK = block(MineboundModBlocks.ICEBLOCK, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> TINTIC_MOB_SPAWN_EGG = REGISTRY.register("tintic_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.TINTIC_MOB, -3355444, -13261, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> JELLYBLOB = block(MineboundModBlocks.JELLYBLOB, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> BATONG_MOB_SPAWN_EGG = REGISTRY.register("batong_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.BATONG_MOB, -13421773, -3407821, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> JUNKPILE = block(MineboundModBlocks.JUNKPILE, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> LIMESTONE = block(MineboundModBlocks.LIMESTONE, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> SPOOKIT_MOB_SPAWN_EGG = REGISTRY.register("spookit_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.SPOOKIT_MOB, -10066330, -13261, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> LOOSESILT = block(MineboundModBlocks.LOOSESILT, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> PEBLIT_MOB_SPAWN_EGG = REGISTRY.register("peblit_mob_spawn_egg", () -> new ForgeSpawnEggItem(MineboundModEntities.PEBLIT_MOB, -10066330, -103, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> MAGMAROCK = block(MineboundModBlocks.MAGMAROCK, MineboundModTabs.TAB_NATURALTILES);
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
	public static final RegistryObject<Item> TAR_TEST = block(MineboundModBlocks.TAR_TEST, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> ASTEROID_MAGMAROCK = block(MineboundModBlocks.ASTEROID_MAGMAROCK, MineboundModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> ASTEROID_MATEORITEROCK = block(MineboundModBlocks.ASTEROID_MATEORITEROCK, MineboundModTabs.TAB_NATURALTILES);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
