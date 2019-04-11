package trikzon.snowvariants.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import trikzon.snowvariants.init.ModBlocks;

public class VariantSlab extends Block {
    private final Block originSlab;
    private final ItemStack transformingItem;
    private final SoundType transformingSound;
    protected static final VoxelShape VARIANT_SLAB_SHAPE = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D);

    public VariantSlab(Block originSlab, ItemStack transformingItem, SoundType transformingSound, Properties properties) {
        super(properties);

        this.originSlab = originSlab;
        this.transformingItem = transformingItem;
        this.transformingSound = transformingSound;

        ModBlocks.VARIANT_SLABS_LIST.add(this);
    }

    @Override
    public void getDrops(IBlockState state, NonNullList<ItemStack> drops, World world, BlockPos pos, int fortune) {
        drops.add(transformingItem);
        drops.add(new ItemStack(originSlab));
    }

    @Override
    public VoxelShape getShape(IBlockState state, IBlockReader worldIn, BlockPos pos) {
        return VARIANT_SLAB_SHAPE;
    }

    @Override
    public boolean isFullCube(IBlockState p_149686_1_) {
        return false;
    }

    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT_MIPPED;
    }

    @Override
    public BlockFaceShape getBlockFaceShape(IBlockReader worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
        if(!face.equals(EnumFacing.DOWN)) return BlockFaceShape.UNDEFINED;
        else return BlockFaceShape.SOLID;
    }

    public Block getOriginSlab() {
        return originSlab;
    }

    public ItemStack getTransformingItem() {
        return transformingItem;
    }

    public SoundType getTransformingSound() {
        return transformingSound;
    }


}
