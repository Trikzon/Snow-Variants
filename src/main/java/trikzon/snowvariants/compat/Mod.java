package trikzon.snowvariants.compat;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import trikzon.snowvariants.SnowVariants;
import trikzon.snowvariants.blocks.SnowSlab;
import trikzon.snowvariants.blocks.SnowStair;

public class Mod {

    public final String MODID;

    public Mod(String modid) {
        MODID = modid;
    }

    public void createStair(String registryName) {
        Block block = Block.REGISTRY.getObject(new ResourceLocation(MODID + ":" + registryName));
        if (block != null && block != Blocks.AIR)
            new SnowStair(block);
        else {
            SnowVariants.LOGGER.error("Snow Variants found " + registryName + " from " + MODID + " is null.");
            SnowVariants.LOGGER.error("Please report this to the Snow Variants github: https://github.com/Trikzon/Snow-Variants/issues");
            SnowVariants.LOGGER.error("Snow Variants Version: " + SnowVariants.VERSION);
        }
    }

    public void createSlab(String registryName, int originMeta) {
        Block block = Block.REGISTRY.getObject(new ResourceLocation(MODID + ":" + registryName));
        if (block != null && block != Blocks.AIR)
            new SnowSlab(block, originMeta);
        else {
            SnowVariants.LOGGER.error("Snow Variants found " + registryName + " from " + MODID + " is null.");
            SnowVariants.LOGGER.error("Please report this to the Snow Variants github: https://github.com/Trikzon/Snow-Variants/issues");
            SnowVariants.LOGGER.error("Snow Variants Version: " + SnowVariants.VERSION);
        }
    }

    public void createSlab(String registryName) {
        createSlab(registryName, 0);
    }
}
