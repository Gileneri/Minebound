package net.mcreator.minebound.procedures;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class MMWireDoorOpenCloseProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (((world.getBlockState(new BlockPos(x, y, z))).getBlock().getStateDefinition().getProperty("open") instanceof BooleanProperty _getbp1 && (world.getBlockState(new BlockPos(x, y, z))).getValue(_getbp1)) == false) {
			{
				BlockPos _pos = new BlockPos(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("open") instanceof BooleanProperty _booleanProp)
					world.setBlock(_pos, _bs.setValue(_booleanProp, (true)), 3);
			}
		} else if (((world.getBlockState(new BlockPos(x, y, z))).getBlock().getStateDefinition().getProperty("open") instanceof BooleanProperty _getbp4 && (world.getBlockState(new BlockPos(x, y, z))).getValue(_getbp4)) == true) {
			{
				BlockPos _pos = new BlockPos(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("open") instanceof BooleanProperty _booleanProp)
					world.setBlock(_pos, _bs.setValue(_booleanProp, (false)), 3);
			}
		}
	}
}
