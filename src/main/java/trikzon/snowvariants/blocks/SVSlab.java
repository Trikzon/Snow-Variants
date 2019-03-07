package trikzon.snowvariants.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import trikzon.snowvariants.SnowVariants;
import trikzon.snowvariants.init.EnumMaterials;

public class SVSlab extends Block {

    protected static final AxisAlignedBB AABB_BOTTOM_HALF = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D);
    private final EnumMaterials enumMaterials;

    public SVSlab(EnumMaterials enumMaterials) {
        super(enumMaterials.getMaterial());
        this.enumMaterials = enumMaterials;

        this.setRegistryName(SnowVariants.MODID, enumMaterials.getName());
        this.setHarvestLevel(enumMaterials.getToolType(), enumMaterials.getToolLevel());
        this.setHardness(enumMaterials.getHardness());
        this.setResistance(enumMaterials.getResistance());
        this.setSoundType(enumMaterials.getSoundType());
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return AABB_BOTTOM_HALF;
    }

    @Override
    public boolean isTopSolid(IBlockState state) {
        return false;
    }

    @Override
    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
        if(!face.equals(EnumFacing.DOWN)) return BlockFaceShape.UNDEFINED;
        else return BlockFaceShape.SOLID;
    }

    @Override
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
        if(!target.sideHit.equals(EnumFacing.UP))
            return new ItemStack(enumMaterials.getStairsOrigin());
        else return new ItemStack(Blocks.SNOW);
    }

    @Override
    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        drops.add(new ItemStack(enumMaterials.getStairsOrigin(), 1));
        drops.add(new ItemStack(Blocks.SNOW, 1));
    }

    @Override
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }
}
