package trikzon.snowvariants.events;

import net.minecraft.block.*;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.WorldServer;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import trikzon.snowvariants.blocks.ModBlocks;
import trikzon.snowvariants.blocks.SnowSlab;
import trikzon.snowvariants.blocks.SnowStair;

import java.util.Iterator;
import java.util.Random;

@Mod.EventBusSubscriber
public class SnowEvent {

    private final static int NUM_TICKS = 10;
    private final static Random random = new Random();

    @SubscribeEvent
    public static void onWorldTick(TickEvent.WorldTickEvent event) {
        if (event.side.isClient()) return;
        final WorldServer world = (WorldServer)event.world;
        if (event.phase != TickEvent.Phase.END || world.getTotalWorldTime() % NUM_TICKS != 0 || !world.isRaining()) return;

        for (Iterator<Chunk> iterator = world.getPersistentChunkIterable(world.getPlayerChunkMap().getChunkIterator()); iterator.hasNext();) {
            final Chunk chunk = iterator.next();

            for (int x  = 0; x < 16; x++) {
                for (int z = 0; z < 16; z++) {
                    final BlockPos pos = world.getHeight(chunk.getPos().getBlock(x, 0, z)).down();
                    final IBlockState state = world.getBlockState(pos);

                    if (canSnowAt(pos, world) && random.nextInt(16) == 0) {
                        final Block block = state.getBlock();

                        if (block instanceof BlockStairs) {
                            if (state.getValue(BlockStairs.HALF).equals(BlockStairs.EnumHalf.BOTTOM)) {
                                for (SnowStair stair : ModBlocks.SNOW_STAIRS) {
                                    if (block == stair.origin) {
                                        world.setBlockState(pos, stair.getDefaultState()
                                                .withProperty(BlockStairs.HALF, state.getValue(BlockStairs.HALF))
                                                .withProperty(BlockStairs.FACING, state.getValue(BlockStairs.FACING))
                                                .withProperty(BlockStairs.SHAPE, state.getValue(BlockStairs.SHAPE)));
                                        break;
                                    }
                                }
                            }
                        } else if (block instanceof BlockSlab) {
                            for (SnowSlab slab : ModBlocks.SNOW_SLABS) {
                                IBlockState originBlockState = slab.origin.getStateFromMeta(slab.originMeta);
                                if (state == originBlockState) {
                                    if (state.getValue(BlockSlab.HALF) == BlockSlab.EnumBlockHalf.BOTTOM) {
                                        world.setBlockState(pos, slab.getDefaultState());
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    public static boolean canSnowAt(BlockPos pos, WorldServer world) {
        Biome biome = world.getBiome(pos);
        float temp = biome.getTemperature(pos);

        if (temp >= 0.15F) {
            return false;
        }
        else return true;
    }
}
