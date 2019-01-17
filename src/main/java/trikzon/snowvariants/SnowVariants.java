package trikzon.snowvariants;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import trikzon.snowvariants.compat.ModChecker;
import trikzon.snowvariants.proxy.CommonProxy;

@Mod(modid = SnowVariants.MODID, name = SnowVariants.NAME, version = SnowVariants.VERSION)
public class SnowVariants {

	public static final String MODID = "snowvariants";
	public static final String NAME = "Snow Variants";
	public static final String VERSION = "1.0.0";

	@SidedProxy(clientSide = "trikzon.snowvariants.proxy.ClientProxy", serverSide = "trikzon.snowvariants.proxy.ServerProxy")
	public static CommonProxy proxy;

	@Mod.Instance
	public static SnowVariants instance;

	public static Logger logger;

	public static ModChecker modChecker;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
		proxy.preInit(event);
		modChecker = new ModChecker();
		ModChecker.successMessagePreInit();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
		ModChecker.printSuccessMessageInit();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}
}
