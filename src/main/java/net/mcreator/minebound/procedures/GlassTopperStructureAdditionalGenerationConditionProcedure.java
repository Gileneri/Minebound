package net.mcreator.minebound.procedures;

public class GlassTopperStructureAdditionalGenerationConditionProcedure {
	public static boolean execute(double y) {
		boolean shouldAllow = false;
		shouldAllow = false;
		if (y > 100) {
			shouldAllow = true;
		}
		return shouldAllow;
	}
}
