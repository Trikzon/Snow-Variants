package trikzon.snowvariants.blocks;

import net.minecraft.block.*;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import trikzon.snowvariants.SnowVariants;

public class SnowStair extends StairsBlock {

    public final Block origin;

    public SnowStair(Block block) {
        super(block.getDefaultState(), Block.Properties.from(block));
        setRegistryName(SnowVariants.MODID, block.getRegistryName().getNamespace() + "_" + block.getRegistryName().getPath());
        ModBlocks.SNOW_STAIRS.add(this);

        origin = block;
    }

    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT_MIPPED;
    }

    @Override
    public boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if (player.getHeldItem(handIn).getItem() instanceof ShovelItem) {
            //If world is server
            if (!worldIn.isRemote) {
                worldIn.setBlockState(pos, origin.getDefaultState()
                        .with(BlockStateProperties.HALF, worldIn.getBlockState(pos).get(BlockStateProperties.HALF))
                        .with(BlockStateProperties.STAIRS_SHAPE, worldIn.getBlockState(pos).get(BlockStateProperties.STAIRS_SHAPE))
                        .with(BlockStateProperties.HORIZONTAL_FACING, worldIn.getBlockState(pos).get(BlockStateProperties.HORIZONTAL_FACING)));
                if (!player.isCreative()) {
                    worldIn.addEntity(new ItemEntity(worldIn, pos.getX() + 0.5f, pos.getY() + 0.5f, pos.getZ() + 0.5f, new ItemStack(Blocks.SNOW)));
                    player.getHeldItem(handIn).setDamage(player.getHeldItem(handIn).getDamage() - 1);
                }
            } else {
                worldIn.playSound(player, pos, SoundEvents.BLOCK_SNOW_BREAK, SoundCategory.BLOCKS, (SoundType.SNOW.getVolume() + 1.0F) / 2.0F, SoundType.SNOW.getPitch() * 0.8F);
            }
            return true;
        }
        return false;
    }
}
