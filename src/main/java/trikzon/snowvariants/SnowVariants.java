package trikzon.snowvariants;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import trikzon.snowvariants.blocks.ModBlocks;


@Mod(modid = SnowVariants.MODID, name = SnowVariants.NAME, version = SnowVariants.VERSION)
public class SnowVariants {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID =  "snowvariants", NAME = "Snow Variants", VERSION = "1.12.2-1.3.0";

    public static CreativeTabs itemGroup = new CreativeTabs(SnowVariants.MODID) {
        @Override
        public ItemStack getTabIconItem() {
            return ModBlocks.MINECRAFT_SPRUCE_STAIRS != null ?
                    new ItemStack(ModBlocks.MINECRAFT_SPRUCE_STAIRS) :
                    new ItemStack(Blocks.SPRUCE_STAIRS);
        }
    };
}
