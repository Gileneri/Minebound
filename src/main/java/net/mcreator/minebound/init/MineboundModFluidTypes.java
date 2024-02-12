
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minebound.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.minebound.fluid.types.PoisonFluidType;
import net.mcreator.minebound.fluid.types.LiquidErchiusFuelFluidType;
import net.mcreator.minebound.fluid.types.CoreLavaFluidType;
import net.mcreator.minebound.MineboundMod;

public class MineboundModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, MineboundMod.MODID);
	public static final RegistryObject<FluidType> POISON_TYPE = REGISTRY.register("poison", () -> new PoisonFluidType());
	public static final RegistryObject<FluidType> CORE_LAVA_TYPE = REGISTRY.register("core_lava", () -> new CoreLavaFluidType());
	public static final RegistryObject<FluidType> LIQUID_ERCHIUS_FUEL_TYPE = REGISTRY.register("liquid_erchius_fuel", () -> new LiquidErchiusFuelFluidType());
}
