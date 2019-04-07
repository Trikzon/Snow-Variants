package trikzon.snowvariants.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import trikzon.snowvariants.init.ModBlocks;

public class VariantStairs extends BlockStairs {
    private final Block originStair;

    public VariantStairs(Block originBlock, Block originStair, Properties properties) {
        super(originBlock.getDefaultState(), properties);

        this.originStair = originStair;

        ModBlocks.VARIANT_STAIRS_LIST.add(this);
    }

    @Override
    public boolean isFullCube(IBlockState p_149686_1_) {
        return false;
    }

    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT_MIPPED;
    }

    public Block getOriginStair() {
        return originStair;
    }
}
