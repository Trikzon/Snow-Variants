package trikzon.snowvariants;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import trikzon.snowvariants.events.VariantTransformEvent;
import trikzon.snowvariants.init.ModBlocks;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(modid = SnowVariants.MODID, name = SnowVariants.NAME, version = SnowVariants.VERSION   )
public class SnowVariants {

    public static final String MODID = "snowvariants", NAME = "Snow Variants", VERSION = "1.2.0";

    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();

    public static CreativeTabs itemGroup = new CreativeTabs(MODID) {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModBlocks.SNOW_SPRUCE_STAIRS);
        }
    };

    public SnowVariants() {
        MinecraftForge.EVENT_BUS.register(this);

        VariantTransformEvent variantTransformEvent = new VariantTransformEvent();
        MinecraftForge.EVENT_BUS.register(variantTransformEvent);

    }
}
