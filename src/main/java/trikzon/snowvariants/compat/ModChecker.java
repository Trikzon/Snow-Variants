package trikzon.snowvariants.compat;

import net.minecraftforge.fml.common.Loader;
import trikzon.snowvariants.SnowVariants;

public class ModChecker {

	public static boolean isGingerbreadLoaded;

	public ModChecker() {
		this.isGingerbreadLoaded = Loader.isModLoaded("gingerbread");
	}

	public static void printSuccessMessage() {
		if(isGingerbreadLoaded) SnowVariants.logger.info("Snow Variants detected Gingerbread: enabling support!");
	}

	public static void checkErrorMessage() {
		if(isGingerbreadLoaded) {
			if(ModGetter.stairsGingerbread==null) printErrorMessageStairsGingerbread();
			if(ModGetter.slabGingerbread==null) printErrorMessageSlabGingerbread();
		}
	}

	public static void printErrorMessage(String modName, String modID, String blockID) {
		SnowVariants.logger.error(modName + " with modid '" + modID + "' was found but '" + blockID + "' is null.");
		SnowVariants.logger.error("Please update Snow Variants and " + modName + " to their latest release.");
		SnowVariants.logger.error("If error persists, leave an issue on Snow Variants' issue tracker on github. https://github.com/trikzon/Snow-Variants/issues");
	}

	public static void printErrorMessageStairsGingerbread() { printErrorMessage("Gingerbread", "gingerbread", "block_gingerbread_stairs"); }
	public static void printErrorMessageSlabGingerbread() { printErrorMessage("Gingerbread", "gingerbread", "block_gingerbread_slab_half"); }
}
