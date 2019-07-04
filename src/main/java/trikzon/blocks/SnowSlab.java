package trikzon.blocks;

import net.minecraft.block.Block;
import trikzon.SnowVariants;

public class SnowSlab extends Block {

    public final Block origin;

    public SnowSlab(Block block) {
        super(Block.Properties.create(block.getMaterial(block.getDefaultState())));
        setRegistryName(SnowVariants.MODID, block.getRegistryName().getNamespace() + "_" + block.getRegistryName().getPath());
        ModBlocks.SNOW_SLABS.add(this);

        origin = block;
    }
}
