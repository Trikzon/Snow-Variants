package trikzon.snowvariants.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import trikzon.snowvariants.init.ModBlocks;

public class VariantStairs extends BlockStairs {
    private final Block originStair;
    private final ItemStack transformingItem;
    private final SoundType transformingSound;

    public VariantStairs(Block originBlock, Block originStair, ItemStack transformingItem, SoundType transformingSound, Properties properties) {
        super(originBlock.getDefaultState(), properties);

        this.originStair = originStair;
        this.transformingItem = transformingItem;
        this.transformingSound = transformingSound;

        ModBlocks.VARIANT_STAIRS_LIST.add(this);
    }

    @Override
    public void getDrops(IBlockState state, NonNullList<ItemStack> drops, World world, BlockPos pos, int fortune) {
        drops.add(transformingItem);
        drops.add(new ItemStack(originStair));
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

    public ItemStack getTransformingItem() {
        return transformingItem;
    }

    public SoundType getTransformingSound() {
        return transformingSound;
    }
}
