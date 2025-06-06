
package net.mcreator.minebound.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.common.IPlantable;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.minebound.procedures.BlaststonecoalPlayerStartsToDestroyProcedure;
import net.mcreator.minebound.init.MineboundModItems;

import java.util.List;
import java.util.Collections;

public class MoondusterchiuscrystalfuelBlock extends Block {
	public MoondusterchiuscrystalfuelBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_ORANGE)
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> new SoundEvent(new ResourceLocation("minebound:ore_breaking1_2")), () -> new SoundEvent(new ResourceLocation("minebound:footstep_sand")),
						() -> new SoundEvent(new ResourceLocation("minebound:inventory_putdown1")), () -> new SoundEvent(new ResourceLocation("minebound:ore_breaking1_2")), () -> new SoundEvent(new ResourceLocation("minebound:silence"))))
				.strength(4.5f, 10f).lightLevel(s -> 9).requiresCorrectToolForDrops().randomTicks());
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
			return tieredItem.getTier().getLevel() >= 1;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(MineboundModItems.CRYSTAL_ERCHIUS_FUEL.get()));
	}

	@Override
	public void attack(BlockState blockstate, Level world, BlockPos pos, Player entity) {
		super.attack(blockstate, world, pos, entity);
		BlaststonecoalPlayerStartsToDestroyProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
	}
}
