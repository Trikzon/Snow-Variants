package trikzon.snowvariants.compat;

import net.minecraftforge.fml.common.Loader;
import trikzon.snowvariants.SnowVariants;

public class ModChecker {

	public static boolean isGingerbreadLoaded;
	public static boolean isBotaniaLoaded;

	public ModChecker() {
		this.isGingerbreadLoaded = Loader.isModLoaded("gingerbread");
		this.isBotaniaLoaded = Loader.isModLoaded("botania");
	}

	public static void successMessagePreInit() {
		if(isGingerbreadLoaded) printSuccessMessagePreInit("Gingerbread");
		if(isBotaniaLoaded) printSuccessMessagePreInit("Botania");
	}

	public static void printSuccessMessagePreInit(String modName) {
		SnowVariants.logger.info("Snow Variants detected " + modName + ": enabling support!");
	}

	public static void printSuccessMessageInit() {
		int modTotal = 0;
		int objectTotal = 0;

		if(isGingerbreadLoaded) {
			if(Gingerbread.stairsGingerbreadGingerbread==null) printErrorMessageStairsGingerbreadGingerbread();
			else objectTotal += 1;
			if(Gingerbread.slabGingerbreadGingerbread==null) printErrorMessageSlabGingerbreadGingerbread();
			else objectTotal +=1;
			modTotal += 1;
		}
		if(isBotaniaLoaded) {
			if(Botania.slabBotaniaLivingwood==null) printErrorMessageSlabBotaniaLivingwood();
			else objectTotal +=1;
			if(Botania.slabBotaniaLivingwoodPlank==null) printErrorMessageSlabBotaniaLivingwoodPlank();
			else objectTotal +=1;
			if(Botania.slabBotaniaLivingrock==null) printErrorMessageSlabBotaniaLivingrock();
			else objectTotal +=1;
			if(Botania.slabBotaniaLivingrockBrick==null) printErrorMessageSlabBotaniaLivingrockBrick();
			else objectTotal +=1;
			if(Botania.slabBotaniaDreamwood==null) printErrorMessageSlabBotaniaDreamwood();
			else objectTotal +=1;
			if(Botania.slabBotaniaDreamWoodPlank==null) printErrorMessageSlabBotaniaDreamwoodPlank();
			else objectTotal +=1;
			if(Botania.slabBotaniaQuartzSmokey==null) printErrorMessageSlabBotaniaQuartzSmokey();
			else objectTotal +=1;
			if(Botania.slabBotaniaQuartzMana==null) printErrorMessageSlabBotaniaQuartzMana();
			else objectTotal +=1;
			if(Botania.slabBotaniaQuartzBlaze==null) printErrorMessageSlabBotaniaQuartzBlaze();
			else objectTotal +=1;
			if(Botania.slabBotaniaQuartzLavender==null) printErrorMessageSlabBotaniaQuartzLavender();
			else objectTotal +=1;
			if(Botania.slabBotaniaQuartzRed==null) printErrorMessageSlabBotaniaQuartzRed();
			else objectTotal +=1;
			if(Botania.slabBotaniaQuartzElven==null) printErrorMessageSlabBotaniaQuartzElven();
			else objectTotal +=1;
			if(Botania.slabBotaniaQuartzSunny==null) printErrorMessageSlabBotaniaQuartzSunny();
			else objectTotal +=1;
			if(Botania.slabBotaniaMetamorphicStoneForest==null) printErrorMessageSlabBotaniaMetamorphicStoneForest();
			else objectTotal +=1;
			if(Botania.slabBotaniaMetamorphicStonePlains==null) printErrorMessageSlabBotaniaMetamorphicStonePlains();
			else objectTotal +=1;
			if(Botania.slabBotaniaMetamorphicStoneMountain==null) printErrorMessageSlabBotaniaMetamorphicStoneMountain();
			else objectTotal +=1;
			if(Botania.slabBotaniaMetamorphicStoneFungal==null) printErrorMessageSlabBotaniaMetamorphicStoneFungal();
			else objectTotal +=1;
			if(Botania.slabBotaniaMetamorphicStoneSwamp==null) printErrorMessageSlabBotaniaMetamorphicStoneSwamp();
			else objectTotal +=1;
			if(Botania.slabBotaniaMetamorphicStoneDesert==null) printErrorMessageSlabBotaniaMetamorphicStoneDesert();
			else objectTotal +=1;
			if(Botania.slabBotaniaMetamorphicStoneTaiga==null) printErrorMessageSlabBotaniaMetamorphicStoneTaiga();
			else objectTotal +=1;
			if(Botania.slabBotaniaMetamorphicStoneMesa==null) printErrorMessageSlabBotaniaMetamorphicStoneMesa();
			else objectTotal +=1;
			if(Botania.slabBotaniaMetamorphicCobblestoneForest==null) printErrorMessageSlabBotaniaMetamorphicCobblestoneForest();
			else objectTotal +=1;
			if(Botania.slabBotaniaMetamorphicCobblestonePlains==null) printErrorMessageSlabBotaniaMetamorphicCobblestonePlains();
			else objectTotal +=1;
			if(Botania.slabBotaniaMetamorphicCobblestoneMountain==null) printErrorMessageSlabBotaniaMetamorphicCobblestoneMountain();
			else objectTotal +=1;
			if(Botania.slabBotaniaMetamorphicCobblestoneFungal==null) printErrorMessageSlabBotaniaMetamorphicCobblestoneFungal();
			else objectTotal +=1;
			if(Botania.slabBotaniaMetamorphicCobblestoneSwamp==null) printErrorMessageSlabBotaniaMetamorphicCobblestoneSwamp();
			else objectTotal +=1;
			if(Botania.slabBotaniaMetamorphicCobblestoneDesert==null) printErrorMessageSlabBotaniaMetamorphicCobblestoneDesert();
			else objectTotal +=1;
			if(Botania.slabBotaniaMetamorphicCobblestoneTaiga==null) printErrorMessageSlabBotaniaMetamorphicCobblestoneTaiga();
			else objectTotal +=1;
			if(Botania.slabBotaniaMetamorphicCobblestoneMesa==null) printErrorMessageSlabBotaniaMetamorphicCobblestoneMesa();
			else objectTotal +=1;
			if(Botania.slabBotaniaMetamorphicStoneBrickForest==null) printErrorMessageSlabBotaniaMetamorphicStoneBrickForest();
			else objectTotal +=1;
			if(Botania.slabBotaniaMetamorphicStoneBrickPlains==null) printErrorMessageSlabBotaniaMetamorphicStoneBrickPlains();
			else objectTotal +=1;
			if(Botania.slabBotaniaMetamorphicStoneBrickMountain==null) printErrorMessageSlabBotaniaMetamorphicStoneBrickMountain();
			else objectTotal +=1;
			if(Botania.slabBotaniaMetamorphicStoneBrickFungal==null) printErrorMessageSlabBotaniaMetamorphicStoneBrickFungal();
			else objectTotal +=1;
			if(Botania.slabBotaniaMetamorphicStoneBrickSwamp==null) printErrorMessageSlabBotaniaMetamorphicStoneBrickSwamp();
			else objectTotal +=1;
			if(Botania.slabBotaniaMetamorphicStoneBrickDesert==null) printErrorMessageSlabBotaniaMetamorphicStoneBrickDesert();
			else objectTotal +=1;
			if(Botania.slabBotaniaMetamorphicStoneBrickTaiga==null) printErrorMessageSlabBotaniaMetamorphicStoneBrickTaiga();
			else objectTotal +=1;
			if(Botania.slabBotaniaMetamorphicStoneBrickMesa==null) printErrorMessageSlabBotaniaMetamorphicStoneBrickMesa();
			else objectTotal +=1;
			if(Botania.slabBotaniaPortuguesePavementWhite==null) printErrorMessageSlabBotaniaPortuguesePavementWhite();
			else objectTotal +=1;
			if(Botania.slabBotaniaPortuguesePavementBlack==null) printErrorMessageSlabBotaniaPortuguesePavementBlack();
			else objectTotal +=1;
			if(Botania.slabBotaniaPortuguesePavementBlue==null) printErrorMessageSlabBotaniaPortuguesePavementBlue();
			else objectTotal +=1;
			if(Botania.slabBotaniaPortuguesePavementRed==null) printErrorMessageSlabBotaniaPortuguesePavementRed();
			else objectTotal +=1;
			if(Botania.slabBotaniaPortuguesePavementYellow==null) printErrorMessageSlabBotaniaPortuguesePavementYellow();
			else objectTotal +=1;
			if(Botania.slabBotaniaPortuguesePavementGreen==null) printErrorMessageSlabBotaniaPortuguesePavementGreen();
			else objectTotal +=1;
			if(Botania.slabBotaniaShimmerrock==null) printErrorMessageSlabBotaniaShimmerrock();
			else objectTotal +=1;
			if(Botania.slabBotaniaShimmerwoodPlank==null) printErrorMessageSlabBotaniaShimmerwoodPlank();
			else objectTotal +=1;
			modTotal +=1;
		}
		if(modTotal>0) {
			String output = "Snow Variants successfully added support for " + modTotal + " mod";
			if (modTotal > 1) output = output + "s";
			output = output + " with " + objectTotal + " object";
			if (objectTotal > 1) output = output + "s";
			output = output + " detected.";
			SnowVariants.logger.info(output);
		}
	}

	public static void printErrorMessage(String modName, String modID, String blockID) {
		SnowVariants.logger.error(modName + " with modid '" + modID + "' was found but '" + blockID + "' is null.");
		SnowVariants.logger.error("Please update Snow Variants and " + modName + " to their latest release.");
		SnowVariants.logger.error("If error persists, leave an issue on Snow Variants' issue tracker on github. https://github.com/trikzon/Snow-Variants/issues");
	}

	//Gingerbread Errors
	public static void printErrorMessageStairsGingerbreadGingerbread() { printErrorMessage("Gingerbread", "gingerbread", "block_gingerbread_stairs"); }
	public static void printErrorMessageSlabGingerbreadGingerbread() { printErrorMessage("Gingerbread", "gingerbread", "block_gingerbread_slab_half"); }

	//Botania Errors
	public static void printErrorMessageSlabBotaniaLivingwood() { printErrorMessage("Botania", "botania", "livingwood0slab"); }
	public static void printErrorMessageSlabBotaniaLivingwoodPlank() { printErrorMessage("Botania", "botania", "livingwood1slab"); }
	public static void printErrorMessageSlabBotaniaLivingrock() { printErrorMessage("Botania", "botania", "livingrock0slab");}
	public static void printErrorMessageSlabBotaniaLivingrockBrick() { printErrorMessage("Botania", "botania", "livingrock1slab"); }
	public static void printErrorMessageSlabBotaniaDreamwood() { printErrorMessage("Botania", "botania", "dreamwood0slab");}
	public static void printErrorMessageSlabBotaniaDreamwoodPlank() { printErrorMessage("Botania", "botania", "dreamwood1slab"); }
	public static void printErrorMessageSlabBotaniaQuartzSmokey() { printErrorMessage("Botania", "botania", "quartzslabdarkhalf"); }
	public static void printErrorMessageSlabBotaniaQuartzMana() { printErrorMessage("Botania", "botania", "quartzslabmanahalf"); }
	public static void printErrorMessageSlabBotaniaQuartzBlaze() { printErrorMessage("Botania", "botania", "quartzslabblazehalf"); }
	public static void printErrorMessageSlabBotaniaQuartzLavender() { printErrorMessage("Botania", "botania", "quartzslablavenderhalf"); }
	public static void printErrorMessageSlabBotaniaQuartzRed() { printErrorMessage("Botania", "botania", "quartzslabredhalf"); }
	public static void printErrorMessageSlabBotaniaQuartzElven() { printErrorMessage("Botania", "botania", "quartzslabelfhalf"); }
	public static void printErrorMessageSlabBotaniaQuartzSunny() { printErrorMessage("Botania", "botania", "quartzslabsunnyhalf"); }
	public static void printErrorMessageSlabBotaniaMetamorphicStoneForest() { printErrorMessage("Botania", "botania", "biomestonea0slab"); }
	public static void printErrorMessageSlabBotaniaMetamorphicStonePlains() { printErrorMessage("Botania", "botania", "biomestonea1slab"); }
	public static void printErrorMessageSlabBotaniaMetamorphicStoneMountain() { printErrorMessage("Botania", "botania", "biomestonea2slab"); }
	public static void printErrorMessageSlabBotaniaMetamorphicStoneFungal() { printErrorMessage("Botania", "botania", "biomestonea3slab"); }
	public static void printErrorMessageSlabBotaniaMetamorphicStoneSwamp() { printErrorMessage("Botania", "botania", "biomestonea4slab"); }
	public static void printErrorMessageSlabBotaniaMetamorphicStoneDesert() { printErrorMessage("Botania", "botania", "biomestonea5slab"); }
	public static void printErrorMessageSlabBotaniaMetamorphicStoneTaiga() { printErrorMessage("Botania", "botania", "biomestonea6slab"); }
	public static void printErrorMessageSlabBotaniaMetamorphicStoneMesa() { printErrorMessage("Botania", "botania", "biomestonea7slab"); }
	public static void printErrorMessageSlabBotaniaMetamorphicCobblestoneForest() { printErrorMessage("Botania", "botania", "biomestonea8slab"); }
	public static void printErrorMessageSlabBotaniaMetamorphicCobblestonePlains() { printErrorMessage("Botania", "botania", "biomestonea9slab"); }
	public static void printErrorMessageSlabBotaniaMetamorphicCobblestoneMountain() { printErrorMessage("Botania", "botania", "biomestonea10slab"); }
	public static void printErrorMessageSlabBotaniaMetamorphicCobblestoneFungal() { printErrorMessage("Botania", "botania", "biomestonea11slab"); }
	public static void printErrorMessageSlabBotaniaMetamorphicCobblestoneSwamp() { printErrorMessage("Botania", "botania", "biomestonea12slab"); }
	public static void printErrorMessageSlabBotaniaMetamorphicCobblestoneDesert() { printErrorMessage("Botania", "botania", "biomestonea13slab"); }
	public static void printErrorMessageSlabBotaniaMetamorphicCobblestoneTaiga() { printErrorMessage("Botania", "botania", "biomestonea14slab"); }
	public static void printErrorMessageSlabBotaniaMetamorphicCobblestoneMesa() { printErrorMessage("Botania", "botania", "biomestonea15slab"); }
	public static void printErrorMessageSlabBotaniaMetamorphicStoneBrickForest() { printErrorMessage("Botania", "botania", "biomestoneb0slab"); }
	public static void printErrorMessageSlabBotaniaMetamorphicStoneBrickPlains() { printErrorMessage("Botania", "botania", "biomestoneb1slab"); }
	public static void printErrorMessageSlabBotaniaMetamorphicStoneBrickMountain() { printErrorMessage("Botania", "botania", "biomestoneb2slab"); }
	public static void printErrorMessageSlabBotaniaMetamorphicStoneBrickFungal() { printErrorMessage("Botania", "botania", "biomestoneb3slab"); }
	public static void printErrorMessageSlabBotaniaMetamorphicStoneBrickSwamp() { printErrorMessage("Botania", "botania", "biomestoneb4slab"); }
	public static void printErrorMessageSlabBotaniaMetamorphicStoneBrickDesert() { printErrorMessage("Botania", "botania", "biomestoneb5slab"); }
	public static void printErrorMessageSlabBotaniaMetamorphicStoneBrickTaiga() { printErrorMessage("Botania", "botania", "biomestoneb6slab"); }
	public static void printErrorMessageSlabBotaniaMetamorphicStoneBrickMesa() { printErrorMessage("Botania", "botania", "biomestoneb7slab"); }
	public static void printErrorMessageSlabBotaniaPortuguesePavementWhite() { printErrorMessage("Botania", "botania", "pavement0slab"); }
	public static void printErrorMessageSlabBotaniaPortuguesePavementBlack() { printErrorMessage("Botania", "botania", "pavement1slab"); }
	public static void printErrorMessageSlabBotaniaPortuguesePavementBlue() { printErrorMessage("Botania", "botania", "pavement2slab"); }
	public static void printErrorMessageSlabBotaniaPortuguesePavementRed() { printErrorMessage("Botania", "botania", "pavement3slab"); }
	public static void printErrorMessageSlabBotaniaPortuguesePavementYellow() { printErrorMessage("Botania", "botania", "pavement4slab"); }
	public static void printErrorMessageSlabBotaniaPortuguesePavementGreen() { printErrorMessage("Botania", "botania", "pavement5slab"); }
	public static void printErrorMessageSlabBotaniaShimmerrock() { printErrorMessage("Botania", "botania", "shimmerrock0slab"); }
	public static void printErrorMessageSlabBotaniaShimmerwoodPlank() { printErrorMessage("Botania", "botania", "shimmerwoodplanks0slab"); }
}
