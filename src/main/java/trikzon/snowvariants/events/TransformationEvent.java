package trikzon.snowvariants.events;

import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.Half;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.*;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import trikzon.snowvariants.blocks.ModBlocks;
import trikzon.snowvariants.blocks.SnowSlab;
import trikzon.snowvariants.blocks.SnowStair;

@Mod.EventBusSubscriber
public class TransformationEvent {

    @SubscribeEvent()
    public static void onBlockRightClicked(PlayerInteractEvent.RightClickBlock event) {

        PlayerEntity player = event.getEntityPlayer();
        ItemStack item = player.getHeldItem(event.getHand());

        if (item.isItemEqual(new ItemStack(Blocks.SNOW))) {

            if (!event.getFace().equals(Direction.UP)) return;

            BlockState blockState = event.getWorld().getBlockState(event.getPos());
            Block block = blockState.getBlock();

            if (block instanceof StairsBlock) {
                for (SnowStair stair : ModBlocks.SNOW_STAIRS) {
                    if (block.equals(stair.origin)) {
                        if (blockState.get(BlockStateProperties.HALF).equals(Half.BOTTOM)) {
                            event.getWorld().setBlockState(event.getPos(), stair.getDefaultState()
                                    .with(BlockStateProperties.HALF, blockState.get(BlockStateProperties.HALF))
                                    .with(BlockStateProperties.HORIZONTAL_FACING, blockState.get(BlockStateProperties.HORIZONTAL_FACING))
                                    .with(BlockStateProperties.STAIRS_SHAPE, blockState.get(BlockStateProperties.STAIRS_SHAPE)));
                            if (!player.isCreative())
                                item.shrink(1);

                            player.playSound(SoundEvents.BLOCK_SNOW_PLACE, (SoundType.SNOW.getVolume() + 1.0f) / 2.0f, SoundType.SNOW.getPitch() * 0.8f);
                        }
                    }
                }
            } else if (block instanceof SlabBlock) {
                for (SnowSlab slab : ModBlocks.SNOW_SLABS) {
                    if (block.equals(slab.origin)) {
                        if (blockState.get(BlockStateProperties.SLAB_TYPE).equals(SlabType.BOTTOM)) {
                            event.getWorld().setBlockState(event.getPos(), slab.getDefaultState());
                            if (!player.isCreative())
                                item.shrink(1);

                            player.playSound(SoundEvents.BLOCK_SNOW_PLACE, (SoundType.SNOW.getVolume() + 1.0f) / 2.0f, SoundType.SNOW.getPitch() * 0.8f);
                        }
                    }
                }
            }
        }
    }
}
