
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.test.block.entity.TestRedstoneOnBlockEntity;
import net.mcreator.test.block.entity.TestRedstoneOffBlockEntity;
import net.mcreator.test.block.entity.TestPressurePlateBlockEntity;
import net.mcreator.test.block.entity.TestLightOnBlockEntity;
import net.mcreator.test.block.entity.TestLightOffBlockEntity;
import net.mcreator.test.block.entity.TestLightBlockBlockEntity;
import net.mcreator.test.block.entity.TestDoorBlockEntity;
import net.mcreator.test.block.entity.TestButtonBlockEntity;
import net.mcreator.test.TestMod;

public class TestModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, TestMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> TEST_LIGHT_BLOCK = register("test_light_block", TestModBlocks.TEST_LIGHT_BLOCK, TestLightBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TEST_BUTTON = register("test_button", TestModBlocks.TEST_BUTTON, TestButtonBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TEST_DOOR = register("test_door", TestModBlocks.TEST_DOOR, TestDoorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TEST_PRESSURE_PLATE = register("test_pressure_plate", TestModBlocks.TEST_PRESSURE_PLATE, TestPressurePlateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TEST_LIGHT_OFF = register("test_light_off", TestModBlocks.TEST_LIGHT_OFF, TestLightOffBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TEST_LIGHT_ON = register("test_light_on", TestModBlocks.TEST_LIGHT_ON, TestLightOnBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TEST_REDSTONE_OFF = register("test_redstone_off", TestModBlocks.TEST_REDSTONE_OFF, TestRedstoneOffBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TEST_REDSTONE_ON = register("test_redstone_on", TestModBlocks.TEST_REDSTONE_ON, TestRedstoneOnBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
