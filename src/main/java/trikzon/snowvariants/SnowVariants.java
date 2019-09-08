package trikzon.snowvariants;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import trikzon.snowvariants.blocks.ModBlocks;
import trikzon.snowvariants.compat.AppliedEnergistics2;


@Mod(modid = SnowVariants.MODID, name = SnowVariants.NAME, version = SnowVariants.VERSION, dependencies = SnowVariants.DEPENDENCIES)
public class SnowVariants {
    public static final String MODID = "snowvariants", NAME = "Snow Variants", VERSION = "1.12.2-1.3.1";
    public static final String DEPENDENCIES = "after:appliedenergistics2;after:astralsorcery;";

    public static final Logger LOGGER = LogManager.getLogger(NAME);

    public static CreativeTabs itemGroup = new CreativeTabs(SnowVariants.MODID) {
        @Override
        public ItemStack getTabIconItem() {
            return ModBlocks.MINECRAFT_SPRUCE_STAIRS != null ?
                    new ItemStack(ModBlocks.MINECRAFT_SPRUCE_STAIRS) :
                    new ItemStack(Blocks.SPRUCE_STAIRS);
        }
    };
}
