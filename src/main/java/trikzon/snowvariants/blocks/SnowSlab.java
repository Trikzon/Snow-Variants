package trikzon.snowvariants.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import trikzon.snowvariants.SnowVariants;

public class SnowSlab extends Block {

    public final Block origin;

    public SnowSlab(Block block) {
        super(Block.Properties.from(block));
        setRegistryName(SnowVariants.MODID, block.getRegistryName().getNamespace() + "_" + block.getRegistryName().getPath());
        ModBlocks.SNOW_SLABS.add(this);

        origin = block;
    }

    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT_MIPPED;
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D);
    }

    @Override
    public boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if (player.getHeldItem(handIn).getItem() instanceof ShovelItem) {

            if (!hit.getFace().equals(Direction.UP)) return false;
            //If world is server
            if (!worldIn.isRemote) {
                worldIn.setBlockState(pos, origin.getDefaultState().with(BlockStateProperties.SLAB_TYPE, SlabType.BOTTOM));
                if (!player.isCreative()) {
                    worldIn.addEntity(new ItemEntity(worldIn, pos.getX() + 0.5f, pos.getY() + 0.5f, pos.getZ() + 0.5f, new ItemStack(Blocks.SNOW)));
                    player.getHeldItem(handIn).setDamage(player.getHeldItem(handIn).getDamage() - 1);
                }
            //If world is client
            } else {
                worldIn.playSound(player, pos, SoundEvents.BLOCK_SNOW_BREAK, SoundCategory.BLOCKS, (SoundType.SNOW.getVolume() + 1.0F) / 2.0F, SoundType.SNOW.getPitch() * 0.8F);
            }
            return true;
        }
        return false;
    }
}
