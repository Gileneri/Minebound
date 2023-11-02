
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.test.world.inventory.MMUpgradeGUITestMenu;
import net.mcreator.test.TestMod;

public class TestModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, TestMod.MODID);
	public static final RegistryObject<MenuType<MMUpgradeGUITestMenu>> MM_UPGRADE_GUI_TEST = REGISTRY.register("mm_upgrade_gui_test", () -> IForgeMenuType.create(MMUpgradeGUITestMenu::new));
}
