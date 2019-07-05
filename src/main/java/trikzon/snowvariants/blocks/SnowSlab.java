package trikzon.snowvariants.blocks;

import net.minecraft.block.Block;
import net.minecraft.util.BlockRenderLayer;
import trikzon.snowvariants.SnowVariants;

public class SnowSlab extends Block {

    public final Block origin;

    public SnowSlab(Block block) {
        super(Block.Properties.from(block));
        setRegistryName(SnowVariants.MODID, block.getRegistryName().getNamespace() + "_" + block.getRegistryName().getPath());
        ModBlocks.SNOW_SLABS.add(this);

        origin = block;
    }

    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT_MIPPED;
    }
}
