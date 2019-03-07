package trikzon.snowvariants;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = SnowVariants.MODID, name = SnowVariants.NAME, version = SnowVariants.VERSION)
public class SnowVariants {

    public static final String MODID = "snowvariants";
    public static final String NAME = "Snow Variants";
    public static final String VERSION = "1.1.1";

//    @SidedProxy(clientSide = "trikzon.snowvariants.proxy.ClientProxy", serverSide = "trikzon.snowvariants.proxy.ServerProxy")
//    public static CommonProxy proxy;

    @Mod.Instance
    public static SnowVariants instance;

    public static Logger LOGGER;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LOGGER = event.getModLog();
//        proxy.preInit(event);

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
//        proxy.init(event);

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
//        proxy.postInit(event);

    }
}
