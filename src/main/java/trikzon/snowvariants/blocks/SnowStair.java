package trikzon.snowvariants.blocks;

import net.minecraft.block.*;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import trikzon.snowvariants.SnowVariants;

public class SnowStair extends BlockStairs {

    public final Block origin;

    public SnowStair(Block origin) {
        super(origin.getDefaultState());
        this.origin = origin;

        setRegistryName(SnowVariants.MODID, origin.getRegistryName().getResourceDomain() + "_" + origin.getRegistryName().getResourcePath());
        setUnlocalizedName(SnowVariants.MODID + "." + getRegistryName().getResourcePath());
        setCreativeTab(SnowVariants.itemGroup);

        ModBlocks.SNOW_STAIRS.add(this);
    }

    /**
     * Used to manually insert old names from version 1.12.2-1.2.3 and less to keep compatibility
     * @param origin
     * @param name
     */
    public SnowStair(Block origin, String name) {
        super(origin.getDefaultState());
        this.origin = origin;

        setRegistryName(SnowVariants.MODID, name);
        setUnlocalizedName(SnowVariants.MODID + "." + getRegistryName().getResourcePath());
        setCreativeTab(SnowVariants.itemGroup);

        ModBlocks.SNOW_STAIRS.add(this);
    }

    @Override
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT;
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (playerIn.getHeldItem(hand).getItem() instanceof ItemSpade) {

            if (facing != EnumFacing.UP) return false;
            if (!(origin instanceof BlockStairs)) return false;
            // If world is server
            if (!worldIn.isRemote) {
                worldIn.setBlockState(pos, origin.getDefaultState()
                        .withProperty(HALF, state.getValue(HALF))
                        .withProperty(SHAPE, state.getValue(SHAPE))
                        .withProperty(FACING, state.getValue(FACING)));
                if (!playerIn.isCreative()) {
                    worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5f, pos.getY() + 0.5f, pos.getZ() + 0.5f, new ItemStack(Blocks.SNOW_LAYER)));
                    playerIn.getHeldItem(hand).setItemDamage(playerIn.getHeldItem(hand).getItemDamage() - 1);
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
