package trikzon.snowvariants.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;
import net.minecraft.util.BlockRenderLayer;
import trikzon.snowvariants.SnowVariants;

public class SnowStair extends StairsBlock {

    public final Block origin;

    public SnowStair(Block block) {
        super(block.getDefaultState(), Block.Properties.from(block));
        setRegistryName(SnowVariants.MODID, block.getRegistryName().getNamespace() + "_" + block.getRegistryName().getPath());
        ModBlocks.SNOW_STAIRS.add(this);

        origin = block;
    }

    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT_MIPPED;
    }
}
