package trikzon.snowvariants.events;

import net.minecraft.block.*;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
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

    private final static int NUM_TICKS = 40;
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
                    final BlockPos pos = world.getHeight(chunk.getPos().getBlock(x, 0, z));
                    final BlockPos posDown = world.getHeight(chunk.getPos().getBlock(x, 0, z)).down();
                    final IBlockState state = world.getBlockState(pos);
                    final IBlockState stateDown = world.getBlockState(posDown);

                    if ((canSnowAt(pos, world) || canSnowAt(pos, world)) && random.nextInt(24) == 0) {
                        final Block block = state.getBlock();
                        final Block blockDown = stateDown.getBlock();

                        if (block instanceof BlockStairs && !(block instanceof SnowStair)) {
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
                        } else if (blockDown instanceof BlockStairs && !(blockDown instanceof SnowStair)) {
                            if (stateDown.getValue(BlockStairs.HALF).equals(BlockStairs.EnumHalf.BOTTOM)) {
                                for (SnowStair stair : ModBlocks.SNOW_STAIRS) {
                                    if (blockDown == stair.origin) {
                                        world.setBlockState(posDown, stair.getDefaultState()
                                                .withProperty(BlockStairs.HALF, stateDown.getValue(BlockStairs.HALF))
                                                .withProperty(BlockStairs.FACING, stateDown.getValue(BlockStairs.FACING))
                                                .withProperty(BlockStairs.SHAPE, stateDown.getValue(BlockStairs.SHAPE)));
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
                        } else if (blockDown instanceof BlockSlab) {
                            for (SnowSlab slab : ModBlocks.SNOW_SLABS) {
                                IBlockState originBlockState = slab.origin.getStateFromMeta(slab.originMeta);
                                if (stateDown == originBlockState) {
                                    if (stateDown.getValue(BlockSlab.HALF) == BlockSlab.EnumBlockHalf.BOTTOM) {
                                        world.setBlockState(posDown, slab.getDefaultState());
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
