package trikzon.snowvariants.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import trikzon.snowvariants.SnowVariants;

public class SnowSlab extends Block {

    public final Block origin;
    public final int originMeta;

    protected static final AxisAlignedBB AABB_BOTTOM_HALF = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D);

    public SnowSlab(Block origin, int originMeta) {
        super(origin.getMaterial(origin.getDefaultState()));
        this.origin = origin;
        this.originMeta = originMeta;

        setRegistryName(SnowVariants.MODID, origin.getRegistryName().getResourceDomain() + "_" + origin.getRegistryName().getResourcePath());
        setUnlocalizedName(SnowVariants.MODID + "." + getRegistryName().getResourcePath());
        setCreativeTab(SnowVariants.itemGroup);
        setHardness(origin.getBlockHardness(null, null, null));
        setResistance(origin.getExplosionResistance(null, null, null, null));

        ModBlocks.SNOW_SLABS.add(this);
    }

    /**
     * Used to manually insert old names from version 1.12.2-1.2.3 and less to keep compatibility
     * @param origin
     * @param name
     */
    public SnowSlab(Block origin, int originMeta, String name) {
        super(origin.getMaterial(origin.getDefaultState()));
        this.origin = origin;
        this.originMeta = originMeta;

        setRegistryName(SnowVariants.MODID, name);
        setUnlocalizedName(SnowVariants.MODID + "." + getRegistryName().getResourcePath());
        setCreativeTab(SnowVariants.itemGroup);
        setHardness(origin.getBlockHardness(null, null, null));
        setResistance(origin.getExplosionResistance(null, null, null, null));
        setSoundType(origin.getSoundType());

        ModBlocks.SNOW_SLABS.add(this);
    }

    @Override
    public boolean isFullBlock(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT;
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return AABB_BOTTOM_HALF;
    }

    @Override
    public boolean isSideSolid(IBlockState base_state, IBlockAccess world, BlockPos pos, EnumFacing side) {
        return side == EnumFacing.DOWN;
    }

    @Override
    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        drops.add(new ItemStack(origin, 1, originMeta));
        drops.add(new ItemStack(Blocks.SNOW_LAYER));
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (playerIn.getHeldItem(hand).getItem() instanceof ItemSpade) {

            if (facing != EnumFacing.UP) return false;
            if (!(origin instanceof BlockSlab)) return false;
            // If world is server
            if (!worldIn.isRemote) {
                worldIn.setBlockState(pos, origin.getStateFromMeta(originMeta));
                if (!playerIn.isCreative()) {
                    worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5f, pos.getY() + 0.5f, pos.getZ() + 0.5f, new ItemStack(Blocks.SNOW_LAYER)));
                    playerIn.getHeldItem(hand).damageItem(1, playerIn);
                }
            // If world is client
            } else {
                worldIn.playSound(playerIn, pos, SoundEvents.BLOCK_SNOW_BREAK, SoundCategory.BLOCKS, (SoundType.SNOW.getVolume() + 1.0f) / 2.0f, SoundType.SNOW.getPitch() * 0.8f);
            }
            return true;
        }
        return false;
    }
}
