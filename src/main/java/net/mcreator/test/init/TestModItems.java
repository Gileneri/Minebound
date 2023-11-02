
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.test.item.PoisonItem;
import net.mcreator.test.item.OrbitalItem;
import net.mcreator.test.item.MattermanipulatorbetaItem;
import net.mcreator.test.item.HigherItem;
import net.mcreator.test.item.DebugTestToolItem;
import net.mcreator.test.TestMod;

public class TestModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);
	public static final RegistryObject<Item> HIGHER = REGISTRY.register("higher", () -> new HigherItem());
	public static final RegistryObject<Item> POISON_BUCKET = REGISTRY.register("poison_bucket", () -> new PoisonItem());
	public static final RegistryObject<Item> MATTERMANIPULATORBETA = REGISTRY.register("mattermanipulatorbeta", () -> new MattermanipulatorbetaItem());
	public static final RegistryObject<Item> TEXTURE = block(TestModBlocks.TEXTURE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DEBUG_TEST_TOOL = REGISTRY.register("debug_test_tool", () -> new DebugTestToolItem());
	public static final RegistryObject<Item> ORBITAL = REGISTRY.register("orbital", () -> new OrbitalItem());
	public static final RegistryObject<Item> TEST_LIGHT_BLOCK = block(TestModBlocks.TEST_LIGHT_BLOCK, null);
	public static final RegistryObject<Item> MECH_TEST_BODY_SPAWN_EGG = REGISTRY.register("mech_test_body_spawn_egg", () -> new ForgeSpawnEggItem(TestModEntities.MECH_TEST_BODY, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> TEST_BUTTON = block(TestModBlocks.TEST_BUTTON, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> TEST_DOOR = doubleBlock(TestModBlocks.TEST_DOOR, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> TEST_PRESSURE_PLATE = block(TestModBlocks.TEST_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> TEST_LIGHT_OFF = block(TestModBlocks.TEST_LIGHT_OFF, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> TEST_LIGHT_ON = block(TestModBlocks.TEST_LIGHT_ON, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> TEST_REDSTONE_OFF = block(TestModBlocks.TEST_REDSTONE_OFF, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> TEST_REDSTONE_ON = block(TestModBlocks.TEST_REDSTONE_ON, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> ALIENROCK = block(TestModBlocks.ALIENROCK, TestModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> ASH = block(TestModBlocks.ASH, TestModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> BLASTSTONE = block(TestModBlocks.BLASTSTONE, TestModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> BLUEGLOWROCK = block(TestModBlocks.BLUEGLOWROCK, TestModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> BRAINS = block(TestModBlocks.BRAINS, TestModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> CLAY = block(TestModBlocks.CLAY, TestModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> CLOUD = block(TestModBlocks.CLOUD, TestModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> SMOOTHCOBBLESTONE = block(TestModBlocks.SMOOTHCOBBLESTONE, TestModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> CORRUPTDIRT = block(TestModBlocks.CORRUPTDIRT, TestModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> DIRESTONE = block(TestModBlocks.DIRESTONE, TestModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> DIRTMATERIAL = block(TestModBlocks.DIRTMATERIAL, TestModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> DRYDIRT = block(TestModBlocks.DRYDIRT, TestModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> DRYSAND = block(TestModBlocks.DRYSAND, TestModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> FLESHCHUNK = block(TestModBlocks.FLESHCHUNK, TestModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> FLESHPILE = block(TestModBlocks.FLESHPILE, TestModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> FROZENDIRT = block(TestModBlocks.FROZENDIRT, TestModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> THEBLOCK = block(TestModBlocks.THEBLOCK, TestModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> GEODECRYSTALS = block(TestModBlocks.GEODECRYSTALS, TestModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> GEODESTONE = block(TestModBlocks.GEODESTONE, TestModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> COARSEGRAVEL = block(TestModBlocks.COARSEGRAVEL, TestModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> HIVEBLOCK = block(TestModBlocks.HIVEBLOCK, TestModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> ICEMATERIAL = block(TestModBlocks.ICEMATERIAL, TestModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> ICEBLOCK = block(TestModBlocks.ICEBLOCK, TestModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> JELLYBLOB = block(TestModBlocks.JELLYBLOB, TestModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> JUNKPILE = block(TestModBlocks.JUNKPILE, TestModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> LIMESTONE = block(TestModBlocks.LIMESTONE, TestModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> LOOSESILT = block(TestModBlocks.LOOSESILT, TestModTabs.TAB_NATURALTILES);
	public static final RegistryObject<Item> MAGMAROCK = block(TestModBlocks.MAGMAROCK, TestModTabs.TAB_NATURALTILES);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
