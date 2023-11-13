package net.mcreator.minebound.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import java.util.Map;

public class MMPaintingProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean isBlockDyeable = false;
		double dyeColor = 0;
		double blockColor = 0;
		String colorName = "";
		String blockTypeName = "";
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("minebound:dye_item_tag")))) {
			if ((ForgeRegistries.ITEMS.getKey((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()).toString()).contains("pink")) {
				dyeColor = 16;
				colorName = "pink";
			} else if ((ForgeRegistries.ITEMS.getKey((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()).toString()).contains("magenta")) {
				dyeColor = 15;
				colorName = "magenta";
			} else if ((ForgeRegistries.ITEMS.getKey((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()).toString()).contains("purple")) {
				dyeColor = 14;
				colorName = "purple";
			} else if ((ForgeRegistries.ITEMS.getKey((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()).toString()).contains("light_blue")) {
				dyeColor = 12;
				colorName = "light_blue";
			} else if ((ForgeRegistries.ITEMS.getKey((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()).toString()).contains("blue")) {
				dyeColor = 13;
				colorName = "blue";
			} else if ((ForgeRegistries.ITEMS.getKey((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()).toString()).contains("cyan")) {
				dyeColor = 11;
				colorName = "cyan";
			} else if ((ForgeRegistries.ITEMS.getKey((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()).toString()).contains("lime_green")) {
				dyeColor = 9;
				colorName = "lime_green";
			} else if ((ForgeRegistries.ITEMS.getKey((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()).toString()).contains("green")) {
				dyeColor = 10;
				colorName = "green";
			} else if ((ForgeRegistries.ITEMS.getKey((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()).toString()).contains("yellow")) {
				dyeColor = 8;
				colorName = "yellow";
			} else if ((ForgeRegistries.ITEMS.getKey((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()).toString()).contains("orange")) {
				dyeColor = 7;
				colorName = "orange";
			} else if ((ForgeRegistries.ITEMS.getKey((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()).toString()).contains("red")) {
				dyeColor = 6;
				colorName = "red";
			} else if ((ForgeRegistries.ITEMS.getKey((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()).toString()).contains("brown")) {
				dyeColor = 5;
				colorName = "brown";
			} else if ((ForgeRegistries.ITEMS.getKey((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()).toString()).contains("black")) {
				dyeColor = 4;
				colorName = "black";
			} else if ((ForgeRegistries.ITEMS.getKey((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()).toString()).contains("light_gray")) {
				dyeColor = 2;
				colorName = "light_gray";
			} else if ((ForgeRegistries.ITEMS.getKey((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()).toString()).contains("gray")) {
				dyeColor = 3;
				colorName = "gray";
			} else if ((ForgeRegistries.ITEMS.getKey((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()).toString()).contains("white")) {
				dyeColor = 1;
				colorName = "white";
			}
			if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:wool")))) {
				blockTypeName = "_wool";
			} else if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:wool_carpets")))) {
				blockTypeName = "_carpet";
			} else if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:impermeable")))) {
				blockTypeName = "_stained_glass";
			} else if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("minebound:vanilla_stained_glass_pane_block_tag")))) {
				blockTypeName = "_stained_glass_pane";
			} else if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:terracotta")))) {
				blockTypeName = "_terracotta";
			} else if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("minebound:vanilla_glazed_terracotta_block_tag")))) {
				blockTypeName = "_glazed_terracotta";
			} else if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("minebound:vanilla_concrete_block_tag")))) {
				if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(new BlockPos(x, y, z))).getBlock()).toString()).contains("powder")) {
					blockTypeName = "_concrete_powder";
				} else {
					blockTypeName = "_concrete";
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:shulker_boxes")))) {
				blockTypeName = "_shulker_box";
			} else if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:banners")))) {
				if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(new BlockPos(x, y, z))).getBlock()).toString()).contains("wall")) {
					blockTypeName = "_wall_banner";
				} else {
					blockTypeName = "_banner";
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:candles")))
					|| (world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:candle_cakes")))) {
				if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(new BlockPos(x, y, z))).getBlock()).toString()).contains("cake")) {
					blockTypeName = "_candle_cake";
				} else {
					blockTypeName = "_candle";
				}
			}
			if (!(colorName).isEmpty() && !(blockTypeName).isEmpty()) {
				if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(new BlockPos(x, y, z))).getBlock()).toString()).contains("pink")) {
					blockColor = 16;
				} else if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(new BlockPos(x, y, z))).getBlock()).toString()).contains("magenta")) {
					blockColor = 15;
				} else if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(new BlockPos(x, y, z))).getBlock()).toString()).contains("purple")) {
					blockColor = 14;
				} else if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(new BlockPos(x, y, z))).getBlock()).toString()).contains("light_blue")) {
					blockColor = 12;
				} else if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(new BlockPos(x, y, z))).getBlock()).toString()).contains("blue")) {
					blockColor = 13;
				} else if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(new BlockPos(x, y, z))).getBlock()).toString()).contains("cyan")) {
					blockColor = 11;
				} else if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(new BlockPos(x, y, z))).getBlock()).toString()).contains("lime_green")) {
					blockColor = 9;
				} else if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(new BlockPos(x, y, z))).getBlock()).toString()).contains("green")) {
					blockColor = 10;
				} else if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(new BlockPos(x, y, z))).getBlock()).toString()).contains("yellow")) {
					blockColor = 8;
				} else if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(new BlockPos(x, y, z))).getBlock()).toString()).contains("orange")) {
					blockColor = 7;
				} else if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(new BlockPos(x, y, z))).getBlock()).toString()).contains("red")) {
					blockColor = 6;
				} else if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(new BlockPos(x, y, z))).getBlock()).toString()).contains("brown")) {
					blockColor = 5;
				} else if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(new BlockPos(x, y, z))).getBlock()).toString()).contains("black")) {
					blockColor = 4;
				} else if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(new BlockPos(x, y, z))).getBlock()).toString()).contains("light_gray")) {
					blockColor = 2;
				} else if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(new BlockPos(x, y, z))).getBlock()).toString()).contains("gray")) {
					blockColor = 3;
				} else if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(new BlockPos(x, y, z))).getBlock()).toString()).contains("white")) {
					blockColor = 1;
				}
				if (dyeColor != blockColor) {
					{
						BlockPos _bp = new BlockPos(x, y, z);
						BlockState _bs = ForgeRegistries.BLOCKS.getValue(new ResourceLocation((("minecraft:" + colorName + blockTypeName)).toLowerCase(java.util.Locale.ENGLISH))).defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						BlockEntity _be = world.getBlockEntity(_bp);
						CompoundTag _bnbt = null;
						if (_be != null) {
							_bnbt = _be.saveWithFullMetadata();
							_be.setRemoved();
						}
						world.setBlock(_bp, _bs, 3);
						if (_bnbt != null) {
							_be = world.getBlockEntity(_bp);
							if (_be != null) {
								try {
									_be.load(_bnbt);
								} catch (Exception ignored) {
								}
							}
						}
					}
				}
			}
		}
	}
}
