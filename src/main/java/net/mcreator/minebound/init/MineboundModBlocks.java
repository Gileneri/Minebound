
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minebound.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.minebound.block.TheblockBlock;
import net.mcreator.minebound.block.TextureBlock;
import net.mcreator.minebound.block.TestRedstoneOnBlock;
import net.mcreator.minebound.block.TestRedstoneOffBlock;
import net.mcreator.minebound.block.TestPressurePlateBlock;
import net.mcreator.minebound.block.TestLightOnBlock;
import net.mcreator.minebound.block.TestLightOffBlock;
import net.mcreator.minebound.block.TestLightBlockBlock;
import net.mcreator.minebound.block.TestDoorBlock;
import net.mcreator.minebound.block.TestButtonBlock;
import net.mcreator.minebound.block.SmoothcobblestoneBlock;
import net.mcreator.minebound.block.PoisonBlock;
import net.mcreator.minebound.block.OrbitalPortalBlock;
import net.mcreator.minebound.block.MagmarockBlock;
import net.mcreator.minebound.block.LoosesiltBlock;
import net.mcreator.minebound.block.LimestoneBlock;
import net.mcreator.minebound.block.JunkpileBlock;
import net.mcreator.minebound.block.JellyblobBlock;
import net.mcreator.minebound.block.IcematerialBlock;
import net.mcreator.minebound.block.IceblockBlock;
import net.mcreator.minebound.block.HiveblockBlock;
import net.mcreator.minebound.block.HigherPortalBlock;
import net.mcreator.minebound.block.GeodestoneBlock;
import net.mcreator.minebound.block.GeodecrystalsBlock;
import net.mcreator.minebound.block.FrozendirtBlock;
import net.mcreator.minebound.block.FleshpileBlock;
import net.mcreator.minebound.block.FleshchunkBlock;
import net.mcreator.minebound.block.DrysandBlock;
import net.mcreator.minebound.block.DrydirtBlock;
import net.mcreator.minebound.block.DirtmaterialBlock;
import net.mcreator.minebound.block.DirestoneBlock;
import net.mcreator.minebound.block.CorruptdirtBlock;
import net.mcreator.minebound.block.CoreLavaBlock;
import net.mcreator.minebound.block.CoarsegravelBlock;
import net.mcreator.minebound.block.CloudBlock;
import net.mcreator.minebound.block.ClayBlock;
import net.mcreator.minebound.block.BrainsBlock;
import net.mcreator.minebound.block.BlueglowrockBlock;
import net.mcreator.minebound.block.BlaststoneBlock;
import net.mcreator.minebound.block.AshBlock;
import net.mcreator.minebound.block.AlienrockBlock;
import net.mcreator.minebound.MineboundMod;

public class MineboundModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MineboundMod.MODID);
	public static final RegistryObject<Block> HIGHER_PORTAL = REGISTRY.register("higher_portal", () -> new HigherPortalBlock());
	public static final RegistryObject<Block> POISON = REGISTRY.register("poison", () -> new PoisonBlock());
	public static final RegistryObject<Block> TEXTURE = REGISTRY.register("texture", () -> new TextureBlock());
	public static final RegistryObject<Block> ORBITAL_PORTAL = REGISTRY.register("orbital_portal", () -> new OrbitalPortalBlock());
	public static final RegistryObject<Block> TEST_LIGHT_BLOCK = REGISTRY.register("test_light_block", () -> new TestLightBlockBlock());
	public static final RegistryObject<Block> TEST_BUTTON = REGISTRY.register("test_button", () -> new TestButtonBlock());
	public static final RegistryObject<Block> TEST_DOOR = REGISTRY.register("test_door", () -> new TestDoorBlock());
	public static final RegistryObject<Block> TEST_PRESSURE_PLATE = REGISTRY.register("test_pressure_plate", () -> new TestPressurePlateBlock());
	public static final RegistryObject<Block> TEST_LIGHT_OFF = REGISTRY.register("test_light_off", () -> new TestLightOffBlock());
	public static final RegistryObject<Block> TEST_LIGHT_ON = REGISTRY.register("test_light_on", () -> new TestLightOnBlock());
	public static final RegistryObject<Block> TEST_REDSTONE_OFF = REGISTRY.register("test_redstone_off", () -> new TestRedstoneOffBlock());
	public static final RegistryObject<Block> TEST_REDSTONE_ON = REGISTRY.register("test_redstone_on", () -> new TestRedstoneOnBlock());
	public static final RegistryObject<Block> ALIENROCK = REGISTRY.register("alienrock", () -> new AlienrockBlock());
	public static final RegistryObject<Block> ASH = REGISTRY.register("ash", () -> new AshBlock());
	public static final RegistryObject<Block> BLASTSTONE = REGISTRY.register("blaststone", () -> new BlaststoneBlock());
	public static final RegistryObject<Block> BLUEGLOWROCK = REGISTRY.register("blueglowrock", () -> new BlueglowrockBlock());
	public static final RegistryObject<Block> BRAINS = REGISTRY.register("brains", () -> new BrainsBlock());
	public static final RegistryObject<Block> CLAY = REGISTRY.register("clay", () -> new ClayBlock());
	public static final RegistryObject<Block> CLOUD = REGISTRY.register("cloud", () -> new CloudBlock());
	public static final RegistryObject<Block> SMOOTHCOBBLESTONE = REGISTRY.register("smoothcobblestone", () -> new SmoothcobblestoneBlock());
	public static final RegistryObject<Block> CORRUPTDIRT = REGISTRY.register("corruptdirt", () -> new CorruptdirtBlock());
	public static final RegistryObject<Block> DIRESTONE = REGISTRY.register("direstone", () -> new DirestoneBlock());
	public static final RegistryObject<Block> DIRTMATERIAL = REGISTRY.register("dirtmaterial", () -> new DirtmaterialBlock());
	public static final RegistryObject<Block> DRYDIRT = REGISTRY.register("drydirt", () -> new DrydirtBlock());
	public static final RegistryObject<Block> DRYSAND = REGISTRY.register("drysand", () -> new DrysandBlock());
	public static final RegistryObject<Block> FLESHCHUNK = REGISTRY.register("fleshchunk", () -> new FleshchunkBlock());
	public static final RegistryObject<Block> FLESHPILE = REGISTRY.register("fleshpile", () -> new FleshpileBlock());
	public static final RegistryObject<Block> FROZENDIRT = REGISTRY.register("frozendirt", () -> new FrozendirtBlock());
	public static final RegistryObject<Block> THEBLOCK = REGISTRY.register("theblock", () -> new TheblockBlock());
	public static final RegistryObject<Block> GEODECRYSTALS = REGISTRY.register("geodecrystals", () -> new GeodecrystalsBlock());
	public static final RegistryObject<Block> GEODESTONE = REGISTRY.register("geodestone", () -> new GeodestoneBlock());
	public static final RegistryObject<Block> COARSEGRAVEL = REGISTRY.register("coarsegravel", () -> new CoarsegravelBlock());
	public static final RegistryObject<Block> HIVEBLOCK = REGISTRY.register("hiveblock", () -> new HiveblockBlock());
	public static final RegistryObject<Block> ICEMATERIAL = REGISTRY.register("icematerial", () -> new IcematerialBlock());
	public static final RegistryObject<Block> ICEBLOCK = REGISTRY.register("iceblock", () -> new IceblockBlock());
	public static final RegistryObject<Block> JELLYBLOB = REGISTRY.register("jellyblob", () -> new JellyblobBlock());
	public static final RegistryObject<Block> JUNKPILE = REGISTRY.register("junkpile", () -> new JunkpileBlock());
	public static final RegistryObject<Block> LIMESTONE = REGISTRY.register("limestone", () -> new LimestoneBlock());
	public static final RegistryObject<Block> LOOSESILT = REGISTRY.register("loosesilt", () -> new LoosesiltBlock());
	public static final RegistryObject<Block> MAGMAROCK = REGISTRY.register("magmarock", () -> new MagmarockBlock());
	public static final RegistryObject<Block> CORE_LAVA = REGISTRY.register("core_lava", () -> new CoreLavaBlock());
}
