package trikzon.snowvariants.blocks;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import trikzon.snowvariants.SnowVariants;
import trikzon.snowvariants.init.EnumMaterials;

public class SVStairs extends BlockStairs {

    private final EnumMaterials enumMaterials;

    public SVStairs(IBlockState modelState, EnumMaterials enumMaterials) {
        super(enumMaterials.getBlockOrigin().getDefaultState());
        this.enumMaterials = enumMaterials;

        this.setRegistryName(SnowVariants.MODID, enumMaterials.getName());
        this.setHarvestLevel(enumMaterials.getToolType(), enumMaterials.getToolLevel());
        this.blockHardness = enumMaterials.getHardness();
        this.blockResistance = enumMaterials.getResistance();
        this.blockSoundType = enumMaterials.getSoundType();
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
