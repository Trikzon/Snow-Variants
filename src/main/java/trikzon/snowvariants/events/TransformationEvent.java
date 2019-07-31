package trikzon.snowvariants.events;

import net.minecraft.block.*;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import trikzon.snowvariants.blocks.ModBlocks;
import trikzon.snowvariants.blocks.SnowSlab;
import trikzon.snowvariants.blocks.SnowStair;

@Mod.EventBusSubscriber
public class TransformationEvent {

    @SubscribeEvent()
    public static void onBlockRightClicked(PlayerInteractEvent.RightClickBlock event) {
        // Debug Mode:
        if (true) {
            if (!event.getWorld().isRemote) {
                IBlockState state = event.getWorld().getBlockState(event.getPos());
                Block block = state.getBlock();
                System.out.println(block.getMetaFromState(state));
            }
        }

        if (event.getHand() == EnumHand.MAIN_HAND) return;
        EntityPlayer player = event.getEntityPlayer();
        ItemStack item = player.getHeldItem(EnumHand.MAIN_HAND);

        if (item.isItemEqual(new ItemStack(Blocks.SNOW_LAYER))) {

            if (event.getFace() != EnumFacing.UP) return;

            IBlockState blockState = event.getWorld().getBlockState(event.getPos());
            Block block = blockState.getBlock();

            if (block instanceof BlockStairs) {
                for (SnowStair stair : ModBlocks.SNOW_STAIRS) {
                    if (block.equals(stair.origin)) {
                        if (blockState.getValue(BlockStairs.HALF).equals(BlockStairs.EnumHalf.BOTTOM)) {
                            event.getWorld().setBlockState(event.getPos(), stair.getDefaultState()
                                    .withProperty(BlockStairs.HALF, blockState.getValue(BlockStairs.HALF))
                                    .withProperty(BlockStairs.FACING, blockState.getValue(BlockStairs.FACING))
                                    .withProperty(BlockStairs.SHAPE, blockState.getValue(BlockStairs.SHAPE)));
                            if (!player.isCreative())
                                item.shrink(1);

                            player.playSound(SoundEvents.BLOCK_SNOW_PLACE, (SoundType.SNOW.getVolume() + 1.0f) / 2.0f, SoundType.SNOW.getPitch() * 0.8f);
                            break;
                        }
                    }
                }
            } else if (block instanceof BlockSlab) {
                for (SnowSlab slab : ModBlocks.SNOW_SLABS) {
                    IBlockState originBlockState = slab.origin.getStateFromMeta(slab.originMeta);
                    if (blockState == originBlockState) {
                        if (blockState.getValue(BlockSlab.HALF) == BlockSlab.EnumBlockHalf.BOTTOM) {
                            event.getWorld().setBlockState(event.getPos(), slab.getDefaultState());
                            if (!player.isCreative())
                                item.shrink(1);

                            player.playSound(SoundEvents.BLOCK_SNOW_PLACE, (SoundType.SNOW.getVolume() + 1.0f) / 2.0f, SoundType.SNOW.getPitch() * 0.8f);
                            break;
                        }
                    }
                }
            }
        }
    }
}
