
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minebound.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.minebound.fluid.types.TarOilFluidType;
import net.mcreator.minebound.fluid.types.SwampWaterFluidType;
import net.mcreator.minebound.fluid.types.StickySlimeFluidType;
import net.mcreator.minebound.fluid.types.PoisonFluidType;
import net.mcreator.minebound.fluid.types.LiquidErchiusFuelFluidType;
import net.mcreator.minebound.fluid.types.LavaFluidType;
import net.mcreator.minebound.fluid.types.HealingWaterFluidType;
import net.mcreator.minebound.fluid.types.GenLavaFluidType;
import net.mcreator.minebound.fluid.types.CoreLavaFluidType;
import net.mcreator.minebound.fluid.types.CoconutMilkFluidType;
import net.mcreator.minebound.MineboundMod;

public class MineboundModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, MineboundMod.MODID);
	public static final RegistryObject<FluidType> POISON_TYPE = REGISTRY.register("poison", () -> new PoisonFluidType());
	public static final RegistryObject<FluidType> CORE_LAVA_TYPE = REGISTRY.register("core_lava", () -> new CoreLavaFluidType());
	public static final RegistryObject<FluidType> LIQUID_ERCHIUS_FUEL_TYPE = REGISTRY.register("liquid_erchius_fuel", () -> new LiquidErchiusFuelFluidType());
	public static final RegistryObject<FluidType> STICKY_SLIME_TYPE = REGISTRY.register("sticky_slime", () -> new StickySlimeFluidType());
	public static final RegistryObject<FluidType> TAR_OIL_TYPE = REGISTRY.register("tar_oil", () -> new TarOilFluidType());
	public static final RegistryObject<FluidType> SWAMP_WATER_TYPE = REGISTRY.register("swamp_water", () -> new SwampWaterFluidType());
	public static final RegistryObject<FluidType> COCONUT_MILK_TYPE = REGISTRY.register("coconut_milk", () -> new CoconutMilkFluidType());
	public static final RegistryObject<FluidType> LAVA_TYPE = REGISTRY.register("lava", () -> new LavaFluidType());
	public static final RegistryObject<FluidType> HEALING_WATER_TYPE = REGISTRY.register("healing_water", () -> new HealingWaterFluidType());
	public static final RegistryObject<FluidType> GEN_LAVA_TYPE = REGISTRY.register("gen_lava", () -> new GenLavaFluidType());
}
