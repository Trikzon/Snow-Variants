package trikzon.snowvariants.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockReader;
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

    public SoundType getTransformingSound() {
        return transformingSound;
    }

    @Override
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, IBlockReader world, BlockPos pos, EntityPlayer player) {
        if(player.isCreative()) return super.getPickBlock(state, target, world, pos, player);
        System.out.println(new ItemStack(this));
        System.out.println(player.inventory.getSizeInventory());
        for (int i = 0; i < player.inventory.getSizeInventory(); i++) {
            System.out.println(new ItemStack(player.inventory.getStackInSlot(i).getItem()));
            if(new ItemStack(player.inventory.getStackInSlot(i).getItem()).toString().equals(new ItemStack(this).toString())) {
                return super.getPickBlock(state, target, world, pos, player);
            }
        }
        if(target.sideHit.equals(EnumFacing.UP)) return transformingItem;
        return new ItemStack(originStair);
    }

    @Override
    public boolean onBlockActivated(IBlockState state, World worldIn, BlockPos pos, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
        if(!worldIn.isRemote) {
            if(player.getHeldItem(hand).getItem() instanceof ItemSpade) {
                worldIn.setBlockState(pos, originStair.getDefaultState()
                        .with(BlockStairs.SHAPE, worldIn.getBlockState(pos).get(BlockStairs.SHAPE))
                        .with(BlockStairs.HALF, worldIn.getBlockState(pos).get(BlockStairs.HALF))
                        .with(BlockStairs.FACING, worldIn.getBlockState(pos).get(BlockStairs.FACING)));
                worldIn.playSound(player, pos, getTransformingSound().getBreakSound(), SoundCategory.BLOCKS, (getTransformingSound().getVolume() + 1.0F) / 2.0F, getTransformingSound().getPitch() * 0.8F);
                if(!player.isCreative())
                    worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5f, pos.up().getY(), pos.getZ() + 0.5f, transformingItem));
                return true;
            }
        }
        return false;
    }
}
