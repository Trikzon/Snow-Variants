package trikzon.snowvariants.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import trikzon.snowvariants.SnowVariants;
import trikzon.snowvariants.init.ModBlocks;

public class VariantSlab extends Block {
    private final Block originSlab;
    private final ItemStack transformingItem;
    private final SoundType transformingSound;
    private final int meta;
    protected static final AxisAlignedBB AABB_SLAB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D);


    public VariantSlab(Block originSlab, int meta, ItemStack transformingItem, SoundType transformingSound, Material material, float hardness, float resistance, SoundType sound) {
        super(material);

        this.originSlab = originSlab;
        this.transformingItem = transformingItem;
        this.transformingSound = transformingSound;
        this.meta = meta;

        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setSoundType(sound);
        this.setCreativeTab(SnowVariants.itemGroup);
        this.setLightOpacity(0);

        ModBlocks.VARIANT_SLABS_LIST.add(this);
    }

    @Override
    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        drops.add(transformingItem);
        drops.add(new ItemStack(originSlab, 1, meta));
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return AABB_SLAB;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState p_149686_1_) {
        return false;
    }

    @Override
    public boolean isFullBlock(IBlockState state) {
        return false;
    }

    @Override
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT_MIPPED;
    }

    @Override
    public BlockFaceShape getBlockFaceShape(IBlockAccess p_193383_1_, IBlockState p_193383_2_, BlockPos p_193383_3_, EnumFacing face) {
        if(!face.equals(EnumFacing.DOWN)) return BlockFaceShape.UNDEFINED;
        else return BlockFaceShape.SOLID;
    }

    public Block getOriginSlab() {
        return originSlab;
    }

    public SoundType getTransformingSound() {
        return transformingSound;
    }

    public int getMeta() {
        return meta;
    }

    @Override
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
        if(player.isCreative()) return super.getPickBlock(state, target, world, pos, player);
        for (int i = 0; i < player.inventory.getSizeInventory(); i++) {
            if(new ItemStack(player.inventory.getStackInSlot(i).getItem()).toString().equals(new ItemStack(this).toString())) {
                return super.getPickBlock(state, target, world, pos, player);
            }
        }
        if(target.sideHit.equals(EnumFacing.UP)) return transformingItem;
        return new ItemStack(originSlab, 1, meta);
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if(!worldIn.isRemote) {
            if(player.getHeldItem(hand).getItem() instanceof ItemSpade) {
                worldIn.setBlockState(pos, originSlab.getStateFromMeta(meta));
                if(!player.isCreative())
                    worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5f, pos.getY() + 0.5f, pos.getZ() + 0.5f, transformingItem));
                return true;
            }
        }
        return false;
    }
}
