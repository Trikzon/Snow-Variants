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
import trikzon.snowvariants.handlers.SnowTransformationHandler;
import trikzon.snowvariants.init.ModBlocks;

@Mod.EventBusSubscriber
public class CommonProxy {
	public void preInit(FMLPreInitializationEvent e) {
	}

	public void init(FMLInitializationEvent e) {
		SnowTransformationHandler snowTransformation = new SnowTransformationHandler();
		MinecraftForge.EVENT_BUS.register(snowTransformation);
		FMLCommonHandler.instance().bus().register(snowTransformation);
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
	}
}
