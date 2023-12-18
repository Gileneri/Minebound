
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minebound.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.minebound.fluid.PoisonFluid;
import net.mcreator.minebound.fluid.CoreLavaFluid;
import net.mcreator.minebound.MineboundMod;

public class MineboundModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, MineboundMod.MODID);
	public static final RegistryObject<FlowingFluid> POISON = REGISTRY.register("poison", () -> new PoisonFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_POISON = REGISTRY.register("flowing_poison", () -> new PoisonFluid.Flowing());
	public static final RegistryObject<FlowingFluid> CORE_LAVA = REGISTRY.register("core_lava", () -> new CoreLavaFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_CORE_LAVA = REGISTRY.register("flowing_core_lava", () -> new CoreLavaFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(POISON.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_POISON.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(CORE_LAVA.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_CORE_LAVA.get(), RenderType.translucent());
		}
	}
}
