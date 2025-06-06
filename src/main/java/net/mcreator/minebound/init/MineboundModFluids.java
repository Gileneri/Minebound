
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

import net.mcreator.minebound.fluid.TarOilFluid;
import net.mcreator.minebound.fluid.SwampWaterFluid;
import net.mcreator.minebound.fluid.StickySlimeFluid;
import net.mcreator.minebound.fluid.PoisonFluid;
import net.mcreator.minebound.fluid.LiquidErchiusFuelFluid;
import net.mcreator.minebound.fluid.LavaFluid;
import net.mcreator.minebound.fluid.HealingWaterFluid;
import net.mcreator.minebound.fluid.GenLavaFluid;
import net.mcreator.minebound.fluid.CoreLavaFluid;
import net.mcreator.minebound.fluid.CoconutMilkFluid;
import net.mcreator.minebound.MineboundMod;

public class MineboundModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, MineboundMod.MODID);
	public static final RegistryObject<FlowingFluid> POISON = REGISTRY.register("poison", () -> new PoisonFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_POISON = REGISTRY.register("flowing_poison", () -> new PoisonFluid.Flowing());
	public static final RegistryObject<FlowingFluid> CORE_LAVA = REGISTRY.register("core_lava", () -> new CoreLavaFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_CORE_LAVA = REGISTRY.register("flowing_core_lava", () -> new CoreLavaFluid.Flowing());
	public static final RegistryObject<FlowingFluid> LIQUID_ERCHIUS_FUEL = REGISTRY.register("liquid_erchius_fuel", () -> new LiquidErchiusFuelFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_LIQUID_ERCHIUS_FUEL = REGISTRY.register("flowing_liquid_erchius_fuel", () -> new LiquidErchiusFuelFluid.Flowing());
	public static final RegistryObject<FlowingFluid> STICKY_SLIME = REGISTRY.register("sticky_slime", () -> new StickySlimeFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_STICKY_SLIME = REGISTRY.register("flowing_sticky_slime", () -> new StickySlimeFluid.Flowing());
	public static final RegistryObject<FlowingFluid> TAR_OIL = REGISTRY.register("tar_oil", () -> new TarOilFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_TAR_OIL = REGISTRY.register("flowing_tar_oil", () -> new TarOilFluid.Flowing());
	public static final RegistryObject<FlowingFluid> SWAMP_WATER = REGISTRY.register("swamp_water", () -> new SwampWaterFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_SWAMP_WATER = REGISTRY.register("flowing_swamp_water", () -> new SwampWaterFluid.Flowing());
	public static final RegistryObject<FlowingFluid> COCONUT_MILK = REGISTRY.register("coconut_milk", () -> new CoconutMilkFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_COCONUT_MILK = REGISTRY.register("flowing_coconut_milk", () -> new CoconutMilkFluid.Flowing());
	public static final RegistryObject<FlowingFluid> LAVA = REGISTRY.register("lava", () -> new LavaFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_LAVA = REGISTRY.register("flowing_lava", () -> new LavaFluid.Flowing());
	public static final RegistryObject<FlowingFluid> HEALING_WATER = REGISTRY.register("healing_water", () -> new HealingWaterFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_HEALING_WATER = REGISTRY.register("flowing_healing_water", () -> new HealingWaterFluid.Flowing());
	public static final RegistryObject<FlowingFluid> GEN_LAVA = REGISTRY.register("gen_lava", () -> new GenLavaFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_GEN_LAVA = REGISTRY.register("flowing_gen_lava", () -> new GenLavaFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(POISON.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_POISON.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(CORE_LAVA.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_CORE_LAVA.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(LIQUID_ERCHIUS_FUEL.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_LIQUID_ERCHIUS_FUEL.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(STICKY_SLIME.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_STICKY_SLIME.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(TAR_OIL.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_TAR_OIL.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(SWAMP_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_SWAMP_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(COCONUT_MILK.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_COCONUT_MILK.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(LAVA.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_LAVA.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(HEALING_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_HEALING_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(GEN_LAVA.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_GEN_LAVA.get(), RenderType.translucent());
		}
	}
}
