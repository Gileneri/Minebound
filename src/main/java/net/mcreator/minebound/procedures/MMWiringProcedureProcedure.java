package net.mcreator.minebound.procedures;

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
		double counter = 0;
		if (!world.isClientSide()) {
			if (entity.isShiftKeyDown() && (itemstack.getOrCreateTag().getDouble("MMwireCarryingInput") > 0 || itemstack.getOrCreateTag().getDouble("MMwireCarryingOutput") > 0)) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Removed stored block coordinates..."), (true));
				itemstack.getOrCreateTag().putDouble("MMwireBlockFace", 0);
				MMWiringTagResetProcedure.execute(itemstack);
			} else {
				if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("forge:mm_wirable")))) {
					if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f),
							entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((10 + (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMrangeLevel") * 2))),
							ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.UP) {
						whichBlockFace = 1;
					} else if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f),
							entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((10 + (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMrangeLevel") * 2))),
							ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.NORTH) {
						whichBlockFace = 2;
					} else if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f),
							entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((10 + (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMrangeLevel") * 2))),
							ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.WEST) {
						whichBlockFace = 3;
					} else if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f),
							entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((10 + (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMrangeLevel") * 2))),
							ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.DOWN) {
						whichBlockFace = 4;
					} else if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f),
							entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((10 + (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMrangeLevel") * 2))),
							ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.SOUTH) {
						whichBlockFace = 5;
					} else if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f),
							entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((10 + (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("MMrangeLevel") * 2))),
							ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.EAST) {
						whichBlockFace = 6;
					}
					if (itemstack.getOrCreateTag().getDouble("MMwireCarryingInput") > 0) {
						if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("forge:mm_triggerable")))) {
							if (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), ("MMwireX" + whichBlockFace)) != 0 || new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), ("MMwireY" + whichBlockFace)) != 0 || new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), ("MMwireZ" + whichBlockFace)) != 0) {
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal(("This block face already connects to: " + (new ItemStack((world.getBlockState(new BlockPos(new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireX" + whichBlockFace)), new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireY" + whichBlockFace)), new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireZ" + whichBlockFace))))).getBlock())).getDisplayName().getString() + " at " + new java.text.DecimalFormat("##").format(new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireX" + whichBlockFace))) + ", " + new java.text.DecimalFormat("##").format(new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireY" + whichBlockFace))) + ", " + new java.text.DecimalFormat("##").format(new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireZ" + whichBlockFace))) + ".")), (true));
							} else {
								if (!world.isClientSide()) {
									BlockPos _bp = new BlockPos(itemstack.getOrCreateTag().getDouble(("MMwireXin" + itemstack.getOrCreateTag().getDouble("MMwireCarryingInput"))),
											itemstack.getOrCreateTag().getDouble(("MMwireYin" + itemstack.getOrCreateTag().getDouble("MMwireCarryingInput"))),
											itemstack.getOrCreateTag().getDouble(("MMwireZin" + itemstack.getOrCreateTag().getDouble("MMwireCarryingInput"))));
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putDouble(("MMwireX" + itemstack.getOrCreateTag().getDouble("MMwireBlockFace")), x);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
								if (!world.isClientSide()) {
									BlockPos _bp = new BlockPos(itemstack.getOrCreateTag().getDouble(("MMwireXin" + itemstack.getOrCreateTag().getDouble("MMwireCarryingInput"))),
											itemstack.getOrCreateTag().getDouble(("MMwireYin" + itemstack.getOrCreateTag().getDouble("MMwireCarryingInput"))),
											itemstack.getOrCreateTag().getDouble(("MMwireZin" + itemstack.getOrCreateTag().getDouble("MMwireCarryingInput"))));
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putDouble(("MMwireY" + itemstack.getOrCreateTag().getDouble("MMwireBlockFace")), y);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
								if (!world.isClientSide()) {
									BlockPos _bp = new BlockPos(itemstack.getOrCreateTag().getDouble(("MMwireXin" + itemstack.getOrCreateTag().getDouble("MMwireCarryingInput"))),
											itemstack.getOrCreateTag().getDouble(("MMwireYin" + itemstack.getOrCreateTag().getDouble("MMwireCarryingInput"))),
											itemstack.getOrCreateTag().getDouble(("MMwireZin" + itemstack.getOrCreateTag().getDouble("MMwireCarryingInput"))));
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putDouble(("MMwireZ" + itemstack.getOrCreateTag().getDouble("MMwireBlockFace")), z);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
								if (!world.isClientSide()) {
									BlockPos _bp = new BlockPos(x, y, z);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putDouble(("MMwireX" + whichBlockFace), (itemstack.getOrCreateTag().getDouble(("MMwireXin" + itemstack.getOrCreateTag().getDouble("MMwireCarryingInput")))));
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
								if (!world.isClientSide()) {
									BlockPos _bp = new BlockPos(x, y, z);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putDouble(("MMwireY" + whichBlockFace), (itemstack.getOrCreateTag().getDouble(("MMwireYin" + itemstack.getOrCreateTag().getDouble("MMwireCarryingInput")))));
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
								if (!world.isClientSide()) {
									BlockPos _bp = new BlockPos(x, y, z);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putDouble(("MMwireZ" + whichBlockFace), (itemstack.getOrCreateTag().getDouble(("MMwireZin" + itemstack.getOrCreateTag().getDouble("MMwireCarryingInput")))));
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal(("Established connection to: " + (new ItemStack((world.getBlockState(new BlockPos(new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireX" + whichBlockFace)), new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireY" + whichBlockFace)), new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireZ" + whichBlockFace))))).getBlock())).getDisplayName().getString() + " at " + new java.text.DecimalFormat("##").format(new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireX" + whichBlockFace))) + ", " + new java.text.DecimalFormat("##").format(new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireY" + whichBlockFace))) + ", " + new java.text.DecimalFormat("##").format(new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireZ" + whichBlockFace))) + ".")), (true));
								itemstack.getOrCreateTag().putDouble("MMwireBlockFace", 0);
								MMWiringTagResetProcedure.execute(itemstack);
							}
						} else {
							if (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), ("MMwireX" + whichBlockFace)) != 0 || new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), ("MMwireY" + whichBlockFace)) != 0 || new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), ("MMwireZ" + whichBlockFace)) != 0) {
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal(("This block face connects to: " + (new ItemStack((world.getBlockState(new BlockPos(new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireX" + whichBlockFace)), new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireY" + whichBlockFace)), new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireZ" + whichBlockFace))))).getBlock())).getDisplayName().getString() + " at " + new java.text.DecimalFormat("##").format(new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireX" + whichBlockFace))) + ", " + new java.text.DecimalFormat("##").format(new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireY" + whichBlockFace))) + ", " + new java.text.DecimalFormat("##").format(new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireZ" + whichBlockFace))) + ".")), (true));
							} else {
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal("Cannot connect receiver to input-only block..."), (true));
							}
						}
					} else if (itemstack.getOrCreateTag().getDouble("MMwireCarryingOutput") > 0) {
						if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("forge:mm_powerable")))) {
							if (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), ("MMwireX" + whichBlockFace)) != 0 || new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), ("MMwireY" + whichBlockFace)) != 0 || new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), ("MMwireZ" + whichBlockFace)) != 0) {
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal(("This block face already connects to: " + (new ItemStack((world.getBlockState(new BlockPos(new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireX" + whichBlockFace)), new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireY" + whichBlockFace)), new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireZ" + whichBlockFace))))).getBlock())).getDisplayName().getString() + " at " + new java.text.DecimalFormat("##").format(new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireX" + whichBlockFace))) + ", " + new java.text.DecimalFormat("##").format(new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireY" + whichBlockFace))) + ", " + new java.text.DecimalFormat("##").format(new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireZ" + whichBlockFace))) + ".")), (true));
							} else {
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
								if (!world.isClientSide()) {
									BlockPos _bp = new BlockPos(x, y, z);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putDouble(("MMwireX" + whichBlockFace), (itemstack.getOrCreateTag().getDouble(("MMwireXout" + itemstack.getOrCreateTag().getDouble("MMwireCarryingOutput")))));
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
								if (!world.isClientSide()) {
									BlockPos _bp = new BlockPos(x, y, z);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putDouble(("MMwireY" + whichBlockFace), (itemstack.getOrCreateTag().getDouble(("MMwireYout" + itemstack.getOrCreateTag().getDouble("MMwireCarryingOutput")))));
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
								if (!world.isClientSide()) {
									BlockPos _bp = new BlockPos(x, y, z);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putDouble(("MMwireZ" + whichBlockFace), (itemstack.getOrCreateTag().getDouble(("MMwireZout" + itemstack.getOrCreateTag().getDouble("MMwireCarryingOutput")))));
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal(("Established connection to: " + (new ItemStack((world.getBlockState(new BlockPos(new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireX" + whichBlockFace)), new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireY" + whichBlockFace)), new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireZ" + whichBlockFace))))).getBlock())).getDisplayName().getString() + " at " + new java.text.DecimalFormat("##").format(new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireX" + whichBlockFace))) + ", " + new java.text.DecimalFormat("##").format(new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireY" + whichBlockFace))) + ", " + new java.text.DecimalFormat("##").format(new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireZ" + whichBlockFace))) + ".")), (true));
								itemstack.getOrCreateTag().putDouble("MMwireBlockFace", 0);
								MMWiringTagResetProcedure.execute(itemstack);
							}
						} else {
							if (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), ("MMwireX" + whichBlockFace)) != 0 || new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), ("MMwireY" + whichBlockFace)) != 0 || new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), ("MMwireZ" + whichBlockFace)) != 0) {
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal(("This block face connects to: " + (new ItemStack((world.getBlockState(new BlockPos(new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireX" + whichBlockFace)), new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireY" + whichBlockFace)), new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireZ" + whichBlockFace))))).getBlock())).getDisplayName().getString() + " at " + new java.text.DecimalFormat("##").format(new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireX" + whichBlockFace))) + ", " + new java.text.DecimalFormat("##").format(new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireY" + whichBlockFace))) + ", " + new java.text.DecimalFormat("##").format(new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireZ" + whichBlockFace))) + ".")), (true));
							} else {
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal("Cannot connect transmitter to output-only block..."), (true));
							}
						}
					} else {
						if (entity.isShiftKeyDown()) {
							if (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), ("MMwireX" + whichBlockFace)) != 0 || new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), ("MMwireY" + whichBlockFace)) != 0 || new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), ("MMwireZ" + whichBlockFace)) != 0) {
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal(("Severed connection to: " + (new ItemStack((world.getBlockState(new BlockPos(new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireX" + whichBlockFace)), new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireY" + whichBlockFace)), new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireZ" + whichBlockFace))))).getBlock())).getDisplayName().getString() + " at " + new java.text.DecimalFormat("##").format(new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireX" + whichBlockFace))) + ", " + new java.text.DecimalFormat("##").format(new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireY" + whichBlockFace))) + ", " + new java.text.DecimalFormat("##").format(new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireZ" + whichBlockFace))) + ".")), (true));
								counter = 1;
								for (int index0 = 0; index0 < (int) (6); index0++) {
									if (new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireX" + whichBlockFace)), new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireY" + whichBlockFace)), new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), ("MMwireZ" + whichBlockFace))), ("MMwireX" + counter)) == x) {
										if (new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, new BlockPos(new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, new BlockPos(x, y, z), ("MMwireX" + whichBlockFace)), new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, new BlockPos(x, y, z), ("MMwireY" + whichBlockFace)), new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, new BlockPos(x, y, z), ("MMwireZ" + whichBlockFace))), ("MMwireY" + counter)) == y) {
											if (new Object() {
												public double getValue(LevelAccessor world, BlockPos pos, String tag) {
													BlockEntity blockEntity = world.getBlockEntity(pos);
													if (blockEntity != null)
														return blockEntity.getPersistentData().getDouble(tag);
													return -1;
												}
											}.getValue(world, new BlockPos(new Object() {
												public double getValue(LevelAccessor world, BlockPos pos, String tag) {
													BlockEntity blockEntity = world.getBlockEntity(pos);
													if (blockEntity != null)
														return blockEntity.getPersistentData().getDouble(tag);
													return -1;
												}
											}.getValue(world, new BlockPos(x, y, z), ("MMwireX" + whichBlockFace)), new Object() {
												public double getValue(LevelAccessor world, BlockPos pos, String tag) {
													BlockEntity blockEntity = world.getBlockEntity(pos);
													if (blockEntity != null)
														return blockEntity.getPersistentData().getDouble(tag);
													return -1;
												}
											}.getValue(world, new BlockPos(x, y, z), ("MMwireY" + whichBlockFace)), new Object() {
												public double getValue(LevelAccessor world, BlockPos pos, String tag) {
													BlockEntity blockEntity = world.getBlockEntity(pos);
													if (blockEntity != null)
														return blockEntity.getPersistentData().getDouble(tag);
													return -1;
												}
											}.getValue(world, new BlockPos(x, y, z), ("MMwireZ" + whichBlockFace))), ("MMwireZ" + counter)) == z) {
												if (!world.isClientSide()) {
													BlockPos _bp = new BlockPos(new Object() {
														public double getValue(LevelAccessor world, BlockPos pos, String tag) {
															BlockEntity blockEntity = world.getBlockEntity(pos);
															if (blockEntity != null)
																return blockEntity.getPersistentData().getDouble(tag);
															return -1;
														}
													}.getValue(world, new BlockPos(x, y, z), ("MMwireX" + whichBlockFace)), new Object() {
														public double getValue(LevelAccessor world, BlockPos pos, String tag) {
															BlockEntity blockEntity = world.getBlockEntity(pos);
															if (blockEntity != null)
																return blockEntity.getPersistentData().getDouble(tag);
															return -1;
														}
													}.getValue(world, new BlockPos(x, y, z), ("MMwireY" + whichBlockFace)), new Object() {
														public double getValue(LevelAccessor world, BlockPos pos, String tag) {
															BlockEntity blockEntity = world.getBlockEntity(pos);
															if (blockEntity != null)
																return blockEntity.getPersistentData().getDouble(tag);
															return -1;
														}
													}.getValue(world, new BlockPos(x, y, z), ("MMwireZ" + whichBlockFace)));
													BlockEntity _blockEntity = world.getBlockEntity(_bp);
													BlockState _bs = world.getBlockState(_bp);
													if (_blockEntity != null)
														_blockEntity.getPersistentData().putDouble(("MMwireX" + counter), 0);
													if (world instanceof Level _level)
														_level.sendBlockUpdated(_bp, _bs, _bs, 3);
												}
												if (!world.isClientSide()) {
													BlockPos _bp = new BlockPos(new Object() {
														public double getValue(LevelAccessor world, BlockPos pos, String tag) {
															BlockEntity blockEntity = world.getBlockEntity(pos);
															if (blockEntity != null)
																return blockEntity.getPersistentData().getDouble(tag);
															return -1;
														}
													}.getValue(world, new BlockPos(x, y, z), ("MMwireX" + whichBlockFace)), new Object() {
														public double getValue(LevelAccessor world, BlockPos pos, String tag) {
															BlockEntity blockEntity = world.getBlockEntity(pos);
															if (blockEntity != null)
																return blockEntity.getPersistentData().getDouble(tag);
															return -1;
														}
													}.getValue(world, new BlockPos(x, y, z), ("MMwireY" + whichBlockFace)), new Object() {
														public double getValue(LevelAccessor world, BlockPos pos, String tag) {
															BlockEntity blockEntity = world.getBlockEntity(pos);
															if (blockEntity != null)
																return blockEntity.getPersistentData().getDouble(tag);
															return -1;
														}
													}.getValue(world, new BlockPos(x, y, z), ("MMwireZ" + whichBlockFace)));
													BlockEntity _blockEntity = world.getBlockEntity(_bp);
													BlockState _bs = world.getBlockState(_bp);
													if (_blockEntity != null)
														_blockEntity.getPersistentData().putDouble(("MMwireY" + counter), 0);
													if (world instanceof Level _level)
														_level.sendBlockUpdated(_bp, _bs, _bs, 3);
												}
												if (!world.isClientSide()) {
													BlockPos _bp = new BlockPos(new Object() {
														public double getValue(LevelAccessor world, BlockPos pos, String tag) {
															BlockEntity blockEntity = world.getBlockEntity(pos);
															if (blockEntity != null)
																return blockEntity.getPersistentData().getDouble(tag);
															return -1;
														}
													}.getValue(world, new BlockPos(x, y, z), ("MMwireX" + whichBlockFace)), new Object() {
														public double getValue(LevelAccessor world, BlockPos pos, String tag) {
															BlockEntity blockEntity = world.getBlockEntity(pos);
															if (blockEntity != null)
																return blockEntity.getPersistentData().getDouble(tag);
															return -1;
														}
													}.getValue(world, new BlockPos(x, y, z), ("MMwireY" + whichBlockFace)), new Object() {
														public double getValue(LevelAccessor world, BlockPos pos, String tag) {
															BlockEntity blockEntity = world.getBlockEntity(pos);
															if (blockEntity != null)
																return blockEntity.getPersistentData().getDouble(tag);
															return -1;
														}
													}.getValue(world, new BlockPos(x, y, z), ("MMwireZ" + whichBlockFace)));
													BlockEntity _blockEntity = world.getBlockEntity(_bp);
													BlockState _bs = world.getBlockState(_bp);
													if (_blockEntity != null)
														_blockEntity.getPersistentData().putDouble(("MMwireZ" + counter), 0);
													if (world instanceof Level _level)
														_level.sendBlockUpdated(_bp, _bs, _bs, 3);
												}
												break;
											}
										}
									}
									counter = counter + 1;
								}
								if (!world.isClientSide()) {
									BlockPos _bp = new BlockPos(x, y, z);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putDouble(("MMwireX" + whichBlockFace), 0);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
								if (!world.isClientSide()) {
									BlockPos _bp = new BlockPos(x, y, z);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putDouble(("MMwireY" + whichBlockFace), 0);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
								if (!world.isClientSide()) {
									BlockPos _bp = new BlockPos(x, y, z);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putDouble(("MMwireZ" + whichBlockFace), 0);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
							} else {
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal("This block face has no connection to sever..."), (true));
							}
						} else {
							if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("forge:mm_triggerable")))) {
								if (new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getPersistentData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos(x, y, z), ("MMwireX" + whichBlockFace)) != 0 || new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getPersistentData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos(x, y, z), ("MMwireY" + whichBlockFace)) != 0 || new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getPersistentData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos(x, y, z), ("MMwireZ" + whichBlockFace)) != 0) {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal(("This block face currently connects to: " + (new ItemStack((world.getBlockState(new BlockPos(new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, new BlockPos(x, y, z), ("MMwireX" + whichBlockFace)), new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, new BlockPos(x, y, z), ("MMwireY" + whichBlockFace)), new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, new BlockPos(x, y, z), ("MMwireZ" + whichBlockFace))))).getBlock())).getDisplayName().getString() + " at " + new java.text.DecimalFormat("##").format(new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, new BlockPos(x, y, z), ("MMwireX" + whichBlockFace))) + ", " + new java.text.DecimalFormat("##").format(new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, new BlockPos(x, y, z), ("MMwireY" + whichBlockFace))) + ", " + new java.text.DecimalFormat("##").format(new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, new BlockPos(x, y, z), ("MMwireZ" + whichBlockFace))) + ".")), (true));
								} else {
									outputOrInput = true;
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal("Obtained transmitter block coordinates..."), (true));
									itemstack.getOrCreateTag().putDouble("MMwireCarryingOutput", whichBlockFace);
									itemstack.getOrCreateTag().putDouble(("MMwireXout" + whichBlockFace), x);
									itemstack.getOrCreateTag().putDouble(("MMwireYout" + whichBlockFace), y);
									itemstack.getOrCreateTag().putDouble(("MMwireZout" + whichBlockFace), z);
									itemstack.getOrCreateTag().putDouble("MMwireBlockFace", whichBlockFace);
								}
							} else {
								if (new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getPersistentData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos(x, y, z), ("MMwireX" + whichBlockFace)) != 0 || new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getPersistentData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos(x, y, z), ("MMwireY" + whichBlockFace)) != 0 || new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getPersistentData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos(x, y, z), ("MMwireZ" + whichBlockFace)) != 0) {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal(("This block face connects to: " + (new ItemStack((world.getBlockState(new BlockPos(new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, new BlockPos(x, y, z), ("MMwireX" + whichBlockFace)), new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, new BlockPos(x, y, z), ("MMwireY" + whichBlockFace)), new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, new BlockPos(x, y, z), ("MMwireZ" + whichBlockFace))))).getBlock())).getDisplayName().getString() + " at " + new java.text.DecimalFormat("##").format(new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, new BlockPos(x, y, z), ("MMwireX" + whichBlockFace))) + ", " + new java.text.DecimalFormat("##").format(new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, new BlockPos(x, y, z), ("MMwireY" + whichBlockFace))) + ", " + new java.text.DecimalFormat("##").format(new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, new BlockPos(x, y, z), ("MMwireZ" + whichBlockFace))) + ".")), (true));
								} else {
									outputOrInput = false;
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal("Obtained receiver block coordinates..."), (true));
									itemstack.getOrCreateTag().putDouble("MMwireCarryingInput", whichBlockFace);
									itemstack.getOrCreateTag().putDouble(("MMwireXin" + whichBlockFace), x);
									itemstack.getOrCreateTag().putDouble(("MMwireYin" + whichBlockFace), y);
									itemstack.getOrCreateTag().putDouble(("MMwireZin" + whichBlockFace), z);
									itemstack.getOrCreateTag().putDouble("MMwireBlockFace", whichBlockFace);
								}
							}
						}
					}
				} else {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("You don't have any stored coordinates to remove..."), (true));
					} else {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Unable to wire this type of block."), (true));
					}
				}
			}
		}
	}
}
