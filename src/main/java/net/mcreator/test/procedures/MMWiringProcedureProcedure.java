package net.mcreator.test.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class MMWiringProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		boolean outputOrInput = false;
		String subString1 = "";
		String subString2 = "";
		double whichBlockFace = 0;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		if (!world.isClientSide()) {
			if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("forge:mm_wirable")))) {
				if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((10 + (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMrangeLevel") * 2))),
						ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.UP) {
					whichBlockFace = 1;
					outputOrInput = true;
				} else if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((10 + (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMrangeLevel") * 2))),
						ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.NORTH) {
					whichBlockFace = 2;
					outputOrInput = true;
				} else if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((10 + (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMrangeLevel") * 2))),
						ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.SOUTH) {
					whichBlockFace = 3;
					outputOrInput = true;
				} else if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((10 + (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMrangeLevel") * 2))),
						ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.DOWN) {
					whichBlockFace = 1;
					outputOrInput = false;
				} else if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((10 + (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMrangeLevel") * 2))),
						ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.WEST) {
					whichBlockFace = 2;
					outputOrInput = false;
				} else if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((10 + (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMrangeLevel") * 2))),
						ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.EAST) {
					whichBlockFace = 3;
					outputOrInput = false;
				}
				if (outputOrInput == true) {
					if (itemstack.getOrCreateTag().getDouble("MMwireCarryingInput") > 0) {
						xPos = itemstack.getOrCreateTag().getDouble(("MMwireXin" + itemstack.getOrCreateTag().getDouble("MMwireCarryingInput")));
						yPos = itemstack.getOrCreateTag().getDouble(("MMwireYin" + itemstack.getOrCreateTag().getDouble("MMwireCarryingInput")));
						zPos = itemstack.getOrCreateTag().getDouble(("MMwireZin" + itemstack.getOrCreateTag().getDouble("MMwireCarryingInput")));
						for (int index0 = 0; index0 < (int) (2); index0++) {
							if ((new Object() {
								public String getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getString(tag);
									return "";
								}
							}.getValue(world, new BlockPos(xPos, yPos, zPos), "MMwiringBlockInfo")).length() < 8) {
								if (!world.isClientSide()) {
									BlockPos _bp = new BlockPos(xPos, yPos, zPos);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putString("MMwiringBlockInfo", "00000000");
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
							}
							subString1 = (new Object() {
								public String getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getString(tag);
									return "";
								}
							}.getValue(world, new BlockPos(xPos, yPos, zPos), "MMwiringBlockInfo")).substring((int) 0, (int) (itemstack.getOrCreateTag().getDouble("MMwireBlockFace")));
							subString2 = (new Object() {
								public String getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getString(tag);
									return "";
								}
							}.getValue(world, new BlockPos(xPos, yPos, zPos), "MMwiringBlockInfo")).substring((int) (itemstack.getOrCreateTag().getDouble("MMwireBlockFace") + 1), (int) 8);
							if (!world.isClientSide()) {
								BlockPos _bp = new BlockPos(xPos, yPos, zPos);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getPersistentData().putString("MMwiringBlockInfo", (subString1 + "1" + subString2));
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							xPos = x;
							yPos = y;
							zPos = z;
							itemstack.getOrCreateTag().putDouble("MMwireBlockFace", whichBlockFace);
						}
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(xPos, yPos, zPos);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putDouble(("MMwireX" + whichBlockFace), (itemstack.getOrCreateTag().getDouble(("MMwireXin" + itemstack.getOrCreateTag().getDouble("MMwireCarryingInput")))));
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(xPos, yPos, zPos);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putDouble(("MMwireY" + whichBlockFace), (itemstack.getOrCreateTag().getDouble(("MMwireYin" + itemstack.getOrCreateTag().getDouble("MMwireCarryingInput")))));
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(xPos, yPos, zPos);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putDouble(("MMwireZ" + whichBlockFace), (itemstack.getOrCreateTag().getDouble(("MMwireZin" + itemstack.getOrCreateTag().getDouble("MMwireCarryingInput")))));
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						MMWiringTagResetProcedure.execute(itemstack);
						itemstack.getOrCreateTag().putDouble("MMwireBlockFace", 0);
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Linked receiver to transmitter."), (true));
					} else {
						if (itemstack.getOrCreateTag().getDouble("MMwireCarryingOutput") > 0) {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("Transmitter block coordinates updated..."), (true));
						} else {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("Added transmitter block coordinates..."), (true));
						}
						MMWiringTagResetProcedure.execute(itemstack);
						itemstack.getOrCreateTag().putDouble("MMwireBlockFace", whichBlockFace);
						itemstack.getOrCreateTag().putDouble("MMwireCarryingOutput", whichBlockFace);
						itemstack.getOrCreateTag().putDouble(("MMwireXout" + whichBlockFace), x);
						itemstack.getOrCreateTag().putDouble(("MMwireYout" + whichBlockFace), y);
						itemstack.getOrCreateTag().putDouble(("MMwireZout" + whichBlockFace), z);
					}
				} else if (outputOrInput == false) {
					if (itemstack.getOrCreateTag().getDouble("MMwireCarryingOutput") > 0) {
						xPos = itemstack.getOrCreateTag().getDouble(("MMwireXout" + itemstack.getOrCreateTag().getDouble("MMwireCarryingOutput")));
						yPos = itemstack.getOrCreateTag().getDouble(("MMwireYout" + itemstack.getOrCreateTag().getDouble("MMwireCarryingOutput")));
						zPos = itemstack.getOrCreateTag().getDouble(("MMwireZout" + itemstack.getOrCreateTag().getDouble("MMwireCarryingOutput")));
						for (int index1 = 0; index1 < (int) (2); index1++) {
							if ((new Object() {
								public String getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getString(tag);
									return "";
								}
							}.getValue(world, new BlockPos(xPos, yPos, zPos), "MMwiringBlockInfo")).length() < 8) {
								if (!world.isClientSide()) {
									BlockPos _bp = new BlockPos(xPos, yPos, zPos);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putString("MMwiringBlockInfo", "00000000");
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
							}
							subString1 = (new Object() {
								public String getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getString(tag);
									return "";
								}
							}.getValue(world, new BlockPos(xPos, yPos, zPos), "MMwiringBlockInfo")).substring((int) 0, (int) (itemstack.getOrCreateTag().getDouble("MMwireBlockFace")));
							subString2 = (new Object() {
								public String getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getString(tag);
									return "";
								}
							}.getValue(world, new BlockPos(xPos, yPos, zPos), "MMwiringBlockInfo")).substring((int) (itemstack.getOrCreateTag().getDouble("MMwireBlockFace") + 1), (int) 8);
							if (!world.isClientSide()) {
								BlockPos _bp = new BlockPos(xPos, yPos, zPos);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getPersistentData().putString("MMwiringBlockInfo", (subString1 + "1" + subString2));
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							xPos = x;
							yPos = y;
							zPos = z;
							itemstack.getOrCreateTag().putDouble("MMwireBlockFace", (whichBlockFace + 3));
						}
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(itemstack.getOrCreateTag().getDouble(("MMwireXout" + itemstack.getOrCreateTag().getDouble("MMwireCarryingOutput"))),
									itemstack.getOrCreateTag().getDouble(("MMwireYout" + itemstack.getOrCreateTag().getDouble("MMwireCarryingOutput"))),
									itemstack.getOrCreateTag().getDouble(("MMwireZout" + itemstack.getOrCreateTag().getDouble("MMwireCarryingOutput"))));
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putDouble(("MMwireX" + itemstack.getOrCreateTag().getDouble("MMwireBlockFace")), x);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(itemstack.getOrCreateTag().getDouble(("MMwireXout" + itemstack.getOrCreateTag().getDouble("MMwireCarryingOutput"))),
									itemstack.getOrCreateTag().getDouble(("MMwireYout" + itemstack.getOrCreateTag().getDouble("MMwireCarryingOutput"))),
									itemstack.getOrCreateTag().getDouble(("MMwireZout" + itemstack.getOrCreateTag().getDouble("MMwireCarryingOutput"))));
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putDouble(("MMwireY" + itemstack.getOrCreateTag().getDouble("MMwireBlockFace")), y);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(itemstack.getOrCreateTag().getDouble(("MMwireXout" + itemstack.getOrCreateTag().getDouble("MMwireCarryingOutput"))),
									itemstack.getOrCreateTag().getDouble(("MMwireYout" + itemstack.getOrCreateTag().getDouble("MMwireCarryingOutput"))),
									itemstack.getOrCreateTag().getDouble(("MMwireZout" + itemstack.getOrCreateTag().getDouble("MMwireCarryingOutput"))));
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putDouble(("MMwireZ" + itemstack.getOrCreateTag().getDouble("MMwireBlockFace")), z);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						MMWiringTagResetProcedure.execute(itemstack);
						itemstack.getOrCreateTag().putDouble("MMwireBlockFace", 0);
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Linked transmitter to receiver."), (true));
					} else {
						if (itemstack.getOrCreateTag().getDouble("MMwireCarryingInput") > 0) {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("Receiver block coordinates updated..."), (true));
						} else {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("Added receiver block coordinates..."), (true));
						}
						MMWiringTagResetProcedure.execute(itemstack);
						itemstack.getOrCreateTag().putDouble("MMwireBlockFace", (whichBlockFace + 3));
						itemstack.getOrCreateTag().putDouble("MMwireCarryingInput", whichBlockFace);
						itemstack.getOrCreateTag().putDouble(("MMwireXin" + whichBlockFace), x);
						itemstack.getOrCreateTag().putDouble(("MMwireYin" + whichBlockFace), y);
						itemstack.getOrCreateTag().putDouble(("MMwireZin" + whichBlockFace), z);
					}
				}
			} else {
				if (itemstack.getOrCreateTag().getDouble("MMwireCarryingInput") > 0 || itemstack.getOrCreateTag().getDouble("MMwireCarryingOutput") > 0) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("Removed stored coordinates..."), (true));
					itemstack.getOrCreateTag().putDouble("MMwireBlockFace", 0);
					MMWiringTagResetProcedure.execute(itemstack);
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("Unable to wire this type of block."), (true));
				}
			}
		}
	}
}
