package trikzon.snowvariants.proxy;

import net.minecraft.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import trikzon.snowvariants.compat.ModChecker;
import trikzon.snowvariants.handlers.RightClickTransformationHandler;
import trikzon.snowvariants.init.ModBlocks;

@Mod.EventBusSubscriber
public class CommonProxy {
	public void preInit(FMLPreInitializationEvent e) {
	}

	public void init(FMLInitializationEvent e) {
		RightClickTransformationHandler rightClickTransformationHandler = new RightClickTransformationHandler();
		MinecraftForge.EVENT_BUS.register(rightClickTransformationHandler);
		FMLCommonHandler.instance().bus().register(rightClickTransformationHandler);
	}

	public void postInit(FMLPostInitializationEvent e) {
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().register(ModBlocks.stairsOakSnow);
		event.getRegistry().register(ModBlocks.stairsCobblestoneSnow);
		event.getRegistry().register(ModBlocks.stairsBrickSnow);
		event.getRegistry().register(ModBlocks.stairsStoneBrickSnow);
		event.getRegistry().register(ModBlocks.stairsNetherBrickSnow);
		event.getRegistry().register(ModBlocks.stairsSandstoneSnow);
		event.getRegistry().register(ModBlocks.stairsSpruceSnow);
		event.getRegistry().register(ModBlocks.stairsBirchSnow);
		event.getRegistry().register(ModBlocks.stairsJungleSnow);
		event.getRegistry().register(ModBlocks.stairsQuartzSnow);
		event.getRegistry().register(ModBlocks.stairsAcaciaSnow);
		event.getRegistry().register(ModBlocks.stairsDarkOakSnow);
		event.getRegistry().register(ModBlocks.stairsRedSandstoneSnow);
		event.getRegistry().register(ModBlocks.stairsPurpurSnow);

		event.getRegistry().register(ModBlocks.slabStoneSnow);
		event.getRegistry().register(ModBlocks.slabSandstoneSnow);
		event.getRegistry().register(ModBlocks.slabCobblestoneSnow);
		event.getRegistry().register(ModBlocks.slabBrickSnow);
		event.getRegistry().register(ModBlocks.slabStoneBrickSnow);
		event.getRegistry().register(ModBlocks.slabNetherBrickSnow);
		event.getRegistry().register(ModBlocks.slabQuartzSnow);
		event.getRegistry().register(ModBlocks.slabOakSnow);
		event.getRegistry().register(ModBlocks.slabSpruceSnow);
		event.getRegistry().register(ModBlocks.slabBirchSnow);
		event.getRegistry().register(ModBlocks.slabJungleSnow);
		event.getRegistry().register(ModBlocks.slabAcaciaSnow);
		event.getRegistry().register(ModBlocks.slabDarkOakSnow);
		event.getRegistry().register(ModBlocks.slabRedSandstoneSnow);
		event.getRegistry().register(ModBlocks.slabPurpurSnow);

		//Gingerbread Support:
		if(ModChecker.isGingerbreadLoaded) {
			event.getRegistry().register(ModBlocks.slabGingerbreadSnow);
			event.getRegistry().register(ModBlocks.stairsGingerbreadSnow);
		}

		if(ModChecker.isBotaniaLoaded) {
			event.getRegistry().register(ModBlocks.slabBotaniaLivingwood);
			event.getRegistry().register(ModBlocks.slabBotaniaLivingwoodPlank);
			event.getRegistry().register(ModBlocks.slabBotaniaLivingrock);
			event.getRegistry().register(ModBlocks.slabBotaniaLivingrockBrick);
			event.getRegistry().register(ModBlocks.slabBotaniaDreamwood);
			event.getRegistry().register(ModBlocks.slabBotaniaDreamwoodPlank);
			event.getRegistry().register(ModBlocks.slabBotaniaQuartzSmokey);
			event.getRegistry().register(ModBlocks.slabBotaniaQuartzMana);
			event.getRegistry().register(ModBlocks.slabBotaniaQuartzBlaze);
			event.getRegistry().register(ModBlocks.slabBotaniaQuartzLavender);
			event.getRegistry().register(ModBlocks.slabBotaniaQuartzRed);
			event.getRegistry().register(ModBlocks.slabBotaniaQuartzElven);
			event.getRegistry().register(ModBlocks.slabBotaniaQuartzSunny);
			event.getRegistry().register(ModBlocks.slabBotaniaMetamorphicStoneForest);
			event.getRegistry().register(ModBlocks.slabBotaniaMetamorphicStonePlains);
			event.getRegistry().register(ModBlocks.slabBotaniaMetamorphicStoneMountain);
			event.getRegistry().register(ModBlocks.slabBotaniaMetamorphicStoneFungal);
			event.getRegistry().register(ModBlocks.slabBotaniaMetamorphicStoneSwamp);
			event.getRegistry().register(ModBlocks.slabBotaniaMetamorphicStoneDesert);
			event.getRegistry().register(ModBlocks.slabBotaniaMetamorphicStoneTaiga);
			event.getRegistry().register(ModBlocks.slabBotaniaMetamorphicStoneMesa);
			event.getRegistry().register(ModBlocks.slabBotaniaMetamorphicCobblestoneForest);
			event.getRegistry().register(ModBlocks.slabBotaniaMetamorphicCobblestonePlains);
			event.getRegistry().register(ModBlocks.slabBotaniaMetamorphicCobblestoneMountain);
			event.getRegistry().register(ModBlocks.slabBotaniaMetamorphicCobblestoneFungal);
			event.getRegistry().register(ModBlocks.slabBotaniaMetamorphicCobblestoneSwamp);
			event.getRegistry().register(ModBlocks.slabBotaniaMetamorphicCobblestoneDesert);
			event.getRegistry().register(ModBlocks.slabBotaniaMetamorphicCobblestoneTaiga);
			event.getRegistry().register(ModBlocks.slabBotaniaMetamorphicCobblestoneMesa);
			event.getRegistry().register(ModBlocks.slabBotaniaMetamorphicStoneBrickForest);
			event.getRegistry().register(ModBlocks.slabBotaniaMetamorphicStoneBrickPlains);
			event.getRegistry().register(ModBlocks.slabBotaniaMetamorphicStoneBrickMountain);
			event.getRegistry().register(ModBlocks.slabBotaniaMetamorphicStoneBrickFungal);
			event.getRegistry().register(ModBlocks.slabBotaniaMetamorphicStoneBrickSwamp);
			event.getRegistry().register(ModBlocks.slabBotaniaMetamorphicStoneBrickDesert);
			event.getRegistry().register(ModBlocks.slabBotaniaMetamorphicStoneBrickTaiga);
			event.getRegistry().register(ModBlocks.slabBotaniaMetamorphicStoneBrickMesa);
			event.getRegistry().register(ModBlocks.slabBotaniaPortuguesePavementWhite);
			event.getRegistry().register(ModBlocks.slabBotaniaPortuguesePavementBlack);
			event.getRegistry().register(ModBlocks.slabBotaniaPortuguesePavementBlue);
			event.getRegistry().register(ModBlocks.slabBotaniaPortuguesePavementRed);
			event.getRegistry().register(ModBlocks.slabBotaniaPortuguesePavementYellow);
			event.getRegistry().register(ModBlocks.slabBotaniaPortuguesePavementGreen);
			event.getRegistry().register(ModBlocks.slabBotaniaShimmerrock);
			event.getRegistry().register(ModBlocks.slabBotaniaShimmerwoodPlank);
		}
	}
}
