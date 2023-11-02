
package net.mcreator.test.block;

import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.common.IPlantable;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;

public class BlaststoneBlock extends Block {
	public BlaststoneBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY)
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> new SoundEvent(new ResourceLocation("test:stone2_hitting")), () -> new SoundEvent(new ResourceLocation("test:footstep_stone2")),
						() -> new SoundEvent(new ResourceLocation("test:inventory_pickup1")), () -> new SoundEvent(new ResourceLocation("test:stone2_hitting")), () -> new SoundEvent(new ResourceLocation("test:footstep_stone3"))))
				.strength(11f, 10f).requiresCorrectToolForDrops());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A77Block"));
		list.add(Component.literal("_____________________"));
		list.add(Component.literal("\u00A7fSharp rocks produced"));
		list.add(Component.literal("\u00A7fby blasts of enormous"));
		list.add(Component.literal("\u00A7fheat."));
		list.add(Component.literal("___________________"));
		list.add(Component.literal("Common           \u25A0*0"));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction direction, IPlantable plantable) {
		return true;
	}

	@Override
	public PushReaction getPistonPushReaction(BlockState state) {
		return PushReaction.BLOCK;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof PickaxeItem tieredItem)
			return tieredItem.getTier().getLevel() >= 0;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
