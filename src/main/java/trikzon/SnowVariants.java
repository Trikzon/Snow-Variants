package trikzon;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import trikzon.setup.ClientProxy;
import trikzon.setup.IProxy;
import trikzon.setup.ServerProxy;


@Mod(SnowVariants.MODID)
public class SnowVariants {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID =  "snowvariants";

    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());

    public static ItemGroup itemGroup = new ItemGroup(SnowVariants.MODID) {
        @Override
        public ItemStack createIcon() {
            return null;
        }
    };

    public SnowVariants() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_CONFIG);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        Config.loadConfig(Config.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve("snowvariants-common.toml"));

//        ModList.get().isLoaded()
    }

    private void setup(final FMLCommonSetupEvent event) {
        proxy.init();
    }
}
