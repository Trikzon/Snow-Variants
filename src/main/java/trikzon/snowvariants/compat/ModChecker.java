package trikzon.snowvariants.compat;

import net.minecraftforge.fml.common.Loader;
import trikzon.snowvariants.SnowVariants;

public class ModChecker {

	public static boolean isGingerbreadLoaded;

	public ModChecker() {
		this.isGingerbreadLoaded = Loader.isModLoaded("gingerbread");
	}

	public static void printSuccessMessagePreInit() {
		if(isGingerbreadLoaded) SnowVariants.logger.info("Snow Variants detected Gingerbread: enabling support!");
	}

	public static void printSuccessMessageInit() {
		int modTotal = 0;
		int objectTotal = 0;

		if(isGingerbreadLoaded) {
			if(ModGetter.stairsGingerbread==null) printErrorMessageStairsGingerbread();
			else objectTotal += 1;
			if(ModGetter.slabGingerbread==null) printErrorMessageSlabGingerbread();
			else objectTotal +=1;
			modTotal += 1;
		}
		if(modTotal>0) SnowVariants.logger.info("Snow Variants successfully added support for " + modTotal + " mods with " + objectTotal + " objects detected.");
	}

	public static void printErrorMessage(String modName, String modID, String blockID) {
		SnowVariants.logger.error(modName + " with modid '" + modID + "' was found but '" + blockID + "' is null.");
		SnowVariants.logger.error("Please update Snow Variants and " + modName + " to their latest release.");
		SnowVariants.logger.error("If error persists, leave an issue on Snow Variants' issue tracker on github. https://github.com/trikzon/Snow-Variants/issues");
	}

	public static void printErrorMessageStairsGingerbread() { printErrorMessage("Gingerbread", "gingerbread", "block_gingerbread_stairs"); }
	public static void printErrorMessageSlabGingerbread() { printErrorMessage("Gingerbread", "gingerbread", "block_gingerbread_slab_half"); }
}
