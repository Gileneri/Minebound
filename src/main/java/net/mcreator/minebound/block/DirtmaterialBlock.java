
package net.mcreator.minebound.block;

import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.common.IPlantable;

import net.minecraft.world.level.storage.loot.LootContext;
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

public class DirtmaterialBlock extends Block {
	public DirtmaterialBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT)
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> new SoundEvent(new ResourceLocation("minebound:break_dirt")), () -> new SoundEvent(new ResourceLocation("minebound:footstep_dirt")),
						() -> new SoundEvent(new ResourceLocation("minebound:inventory_pickup1")), () -> new SoundEvent(new ResourceLocation("minebound:break_dirt")), () -> new SoundEvent(new ResourceLocation("minebound:silence"))))
				.strength(2f).requiresCorrectToolForDrops());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A77Block"));
		list.add(Component.literal("___________________"));
		list.add(Component.literal("\u00A7fDirty looking dirt."));
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
