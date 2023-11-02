
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.test.TestMod;

public class TestModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TestMod.MODID);
	public static final RegistryObject<SoundEvent> ATOM = REGISTRY.register("atom", () -> new SoundEvent(new ResourceLocation("test", "atom")));
	public static final RegistryObject<SoundEvent> ATOM4 = REGISTRY.register("atom4", () -> new SoundEvent(new ResourceLocation("test", "atom4")));
	public static final RegistryObject<SoundEvent> INVENTORY_PICKUP1 = REGISTRY.register("inventory_pickup1", () -> new SoundEvent(new ResourceLocation("test", "inventory_pickup1")));
	public static final RegistryObject<SoundEvent> FOOTSTEP_ROCK = REGISTRY.register("footstep_rock", () -> new SoundEvent(new ResourceLocation("test", "footstep_rock")));
	public static final RegistryObject<SoundEvent> FOOTSTEP_STONE3 = REGISTRY.register("footstep_stone3", () -> new SoundEvent(new ResourceLocation("test", "footstep_stone3")));
	public static final RegistryObject<SoundEvent> ATOM2 = REGISTRY.register("atom2", () -> new SoundEvent(new ResourceLocation("test", "atom2")));
	public static final RegistryObject<SoundEvent> SAND_FALL1 = REGISTRY.register("sand_fall1", () -> new SoundEvent(new ResourceLocation("test", "sand_fall1")));
	public static final RegistryObject<SoundEvent> FOOTSTEP_ASH = REGISTRY.register("footstep_ash", () -> new SoundEvent(new ResourceLocation("test", "footstep_ash")));
	public static final RegistryObject<SoundEvent> FOOTSTEP_STONE2 = REGISTRY.register("footstep_stone2", () -> new SoundEvent(new ResourceLocation("test", "footstep_stone2")));
	public static final RegistryObject<SoundEvent> STONE_HITTING1 = REGISTRY.register("stone_hitting1", () -> new SoundEvent(new ResourceLocation("test", "stone_hitting1")));
	public static final RegistryObject<SoundEvent> STONE_HITTING_SLOWED1 = REGISTRY.register("stone_hitting_slowed1", () -> new SoundEvent(new ResourceLocation("test", "stone_hitting_slowed1")));
	public static final RegistryObject<SoundEvent> BRAIN_BREAKING1 = REGISTRY.register("brain_breaking1", () -> new SoundEvent(new ResourceLocation("test", "brain_breaking1")));
	public static final RegistryObject<SoundEvent> ROCK_HITTING1 = REGISTRY.register("rock_hitting1", () -> new SoundEvent(new ResourceLocation("test", "rock_hitting1")));
	public static final RegistryObject<SoundEvent> ASH_HITTING1 = REGISTRY.register("ash_hitting1", () -> new SoundEvent(new ResourceLocation("test", "ash_hitting1")));
	public static final RegistryObject<SoundEvent> STONE2_HITTING = REGISTRY.register("stone2_hitting", () -> new SoundEvent(new ResourceLocation("test", "stone2_hitting")));
	public static final RegistryObject<SoundEvent> HITTING_CLAY1 = REGISTRY.register("hitting_clay1", () -> new SoundEvent(new ResourceLocation("test", "hitting_clay1")));
	public static final RegistryObject<SoundEvent> FOOTSTEP_CLAY1 = REGISTRY.register("footstep_clay1", () -> new SoundEvent(new ResourceLocation("test", "footstep_clay1")));
	public static final RegistryObject<SoundEvent> SILENCE = REGISTRY.register("silence", () -> new SoundEvent(new ResourceLocation("test", "silence")));
	public static final RegistryObject<SoundEvent> FOOTSTEP_DIRT = REGISTRY.register("footstep_dirt", () -> new SoundEvent(new ResourceLocation("test", "footstep_dirt")));
	public static final RegistryObject<SoundEvent> BREAK_DIRT = REGISTRY.register("break_dirt", () -> new SoundEvent(new ResourceLocation("test", "break_dirt")));
	public static final RegistryObject<SoundEvent> FOOTSPET_STONE = REGISTRY.register("footspet_stone", () -> new SoundEvent(new ResourceLocation("test", "footspet_stone")));
	public static final RegistryObject<SoundEvent> BREAK_STONE = REGISTRY.register("break_stone", () -> new SoundEvent(new ResourceLocation("test", "break_stone")));
	public static final RegistryObject<SoundEvent> BREAKING_DRY_DIRT = REGISTRY.register("breaking_dry_dirt", () -> new SoundEvent(new ResourceLocation("test", "breaking_dry_dirt")));
	public static final RegistryObject<SoundEvent> INVENTORY_PUTDOWN1 = REGISTRY.register("inventory_putdown1", () -> new SoundEvent(new ResourceLocation("test", "inventory_putdown1")));
	public static final RegistryObject<SoundEvent> FOOTSTEP_DRY_DIRT = REGISTRY.register("footstep_dry_dirt", () -> new SoundEvent(new ResourceLocation("test", "footstep_dry_dirt")));
	public static final RegistryObject<SoundEvent> BREAKING_SAND = REGISTRY.register("breaking_sand", () -> new SoundEvent(new ResourceLocation("test", "breaking_sand")));
	public static final RegistryObject<SoundEvent> FOOTSTEP_SAND = REGISTRY.register("footstep_sand", () -> new SoundEvent(new ResourceLocation("test", "footstep_sand")));
	public static final RegistryObject<SoundEvent> FOOTSTEP_MUD = REGISTRY.register("footstep_mud", () -> new SoundEvent(new ResourceLocation("test", "footstep_mud")));
	public static final RegistryObject<SoundEvent> BREAKING_MUD = REGISTRY.register("breaking_mud", () -> new SoundEvent(new ResourceLocation("test", "breaking_mud")));
	public static final RegistryObject<SoundEvent> FOOTSTEP_ICE = REGISTRY.register("footstep_ice", () -> new SoundEvent(new ResourceLocation("test", "footstep_ice")));
	public static final RegistryObject<SoundEvent> BREAKING_ICE = REGISTRY.register("breaking_ice", () -> new SoundEvent(new ResourceLocation("test", "breaking_ice")));
	public static final RegistryObject<SoundEvent> FOOTSTEP_BRAINS = REGISTRY.register("footstep_brains", () -> new SoundEvent(new ResourceLocation("test", "footstep_brains")));
	public static final RegistryObject<SoundEvent> BREAKING_CRYSTAL = REGISTRY.register("breaking_crystal", () -> new SoundEvent(new ResourceLocation("test", "breaking_crystal")));
	public static final RegistryObject<SoundEvent> FOOTSTEP_CRYSTALS = REGISTRY.register("footstep_crystals", () -> new SoundEvent(new ResourceLocation("test", "footstep_crystals")));
	public static final RegistryObject<SoundEvent> FOOTSTEP_GRAVEL = REGISTRY.register("footstep_gravel", () -> new SoundEvent(new ResourceLocation("test", "footstep_gravel")));
	public static final RegistryObject<SoundEvent> BREAKING_GRAVEL = REGISTRY.register("breaking_gravel", () -> new SoundEvent(new ResourceLocation("test", "breaking_gravel")));
	public static final RegistryObject<SoundEvent> BREAKING_BONE = REGISTRY.register("breaking_bone", () -> new SoundEvent(new ResourceLocation("test", "breaking_bone")));
	public static final RegistryObject<SoundEvent> FOOTSTEP_BONE = REGISTRY.register("footstep_bone", () -> new SoundEvent(new ResourceLocation("test", "footstep_bone")));
}
