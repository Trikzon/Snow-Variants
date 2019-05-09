package trikzon.snowvariants.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
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

    public SoundType getTransformingSound() {
        return transformingSound;
    }

    @Override
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, IBlockReader world, BlockPos pos, EntityPlayer player) {
        if(player.isCreative()) return super.getPickBlock(state, target, world, pos, player);
        for (int i = 0; i < player.inventory.getSizeInventory(); i++) {
            if(new ItemStack(player.inventory.getStackInSlot(i).getItem()).toString().equals(new ItemStack(this).toString())) {
                return super.getPickBlock(state, target, world, pos, player);
            }
        }
        if(target.sideHit.equals(EnumFacing.UP)) return transformingItem;
        return new ItemStack(originSlab);
    }

    @Override
    public boolean onBlockActivated(IBlockState state, World worldIn, BlockPos pos, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
        if(!worldIn.isRemote) {
            if(player.getHeldItem(hand).getItem() instanceof ItemSpade) {
                worldIn.setBlockState(pos, originSlab.getDefaultState());
                if(!player.isCreative())
                    worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5f, pos.getY() + 0.5f, pos.getZ() + 0.5f, transformingItem));
                return true;
            }
        }
        return false;
    }
}
