package trikzon.snowvariants.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import trikzon.snowvariants.SnowVariants;
import trikzon.snowvariants.init.ModBlocks;

public class VariantStairs extends BlockStairs {
    private final Block originStair;
    private final ItemStack transformingItem;
    private final SoundType transformingSound;

    public VariantStairs(Block originBlock, Block originStair, ItemStack transformingItem, SoundType transformingSound, Material material, float hardness, float resistance, SoundType sound) {
        super(originBlock.getDefaultState());

        this.originStair = originStair;
        this.transformingItem = transformingItem;
        this.transformingSound = transformingSound;

        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setSoundType(sound);
        this.setCreativeTab(SnowVariants.itemGroup);

        ModBlocks.VARIANT_STAIRS_LIST.add(this);
    }

    @Override
    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        drops.add(transformingItem);
        drops.add(new ItemStack(originStair));
    }

    @Override
    public boolean isFullCube(IBlockState p_149686_1_) {
        return false;
    }

    @Override
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT_MIPPED;
    }

    public Block getOriginStair() {
        return originStair;
    }

    public SoundType getTransformingSound() {
        return transformingSound;
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
        return new ItemStack(originStair);
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if(player.getHeldItem(hand).getItem() instanceof ItemSpade && facing.equals(EnumFacing.UP)) {
            /**If world is server*/
            if (!worldIn.isRemote) {
                worldIn.setBlockState(pos, originStair.getDefaultState()
                        .withProperty(BlockStairs.SHAPE, worldIn.getBlockState(pos).getValue(BlockStairs.SHAPE))
                        .withProperty(BlockStairs.HALF, worldIn.getBlockState(pos).getValue(BlockStairs.HALF))
                        .withProperty(BlockStairs.FACING, worldIn.getBlockState(pos).getValue(BlockStairs.FACING)));
                if(!player.isCreative()) {
                    worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5f, pos.getY() + 0.5f, pos.getZ() + 0.5f, transformingItem));
                    player.getHeldItem(hand).damageItem(1, player);
                }
                /**If world is client*/
            } else {
                worldIn.playSound(player, pos, getTransformingSound().getBreakSound(), SoundCategory.BLOCKS, (getTransformingSound().getVolume() + 1.0F) / 2.0F, getTransformingSound().getPitch() * 0.8F);
            }
            return true;
        }
        return false;
    }
}
