package trikzon.snowvariants.events;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.Half;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import trikzon.snowvariants.blocks.ModBlocks;
import trikzon.snowvariants.blocks.SnowSlab;
import trikzon.snowvariants.blocks.SnowStair;

import java.util.Random;

@Mod.EventBusSubscriber
public class SnowEvent {

    private final static int NUM_TICKS = 40;
    private final static Random random = new Random();

    @SubscribeEvent
    public static void onChunkTick(ChunkTickEvent event) {
        if (event.getWorld().isRemote) return;
        final ServerWorld world = (ServerWorld) event.getWorld();
        if (world.getGameTime() % NUM_TICKS != 0 || !world.isRaining()) return;

        Chunk chunk = event.getChunk();

        for (int x = 0; x < 16; x++) {
            for (int z = 0; z < 16; z++) {
                final BlockPos pos = world.getHeight(Heightmap.Type.MOTION_BLOCKING, chunk.getPos().getBlock(x,0, z)).down();
                final BlockState state = world.getBlockState(pos);

                Biome biome = world.getBiome(pos);
                float temp = biome.getTemperature(pos);
                boolean canSnowAtPos = !(temp >= 0.15);

                if (canSnowAtPos && random.nextInt(24) == 0) {
                    final Block block = state.getBlock();

                    if (block instanceof StairsBlock && !(block instanceof SnowStair)) {
                        if (state.get(BlockStateProperties.HALF) == Half.BOTTOM) {
                            for (SnowStair stair : ModBlocks.SNOW_STAIRS) {
                                if (block == stair.origin) {
                                    world.setBlockState(pos, stair.getDefaultState()
                                            .with(BlockStateProperties.HALF, state.get(BlockStateProperties.HALF))
                                            .with(BlockStateProperties.HORIZONTAL_FACING, state.get(BlockStateProperties.HORIZONTAL_FACING))
                                            .with(BlockStateProperties.STAIRS_SHAPE, state.get(BlockStateProperties.STAIRS_SHAPE)));
                                    break;
                                }
                            }
                        }
                    } else if (block instanceof SlabBlock) {
                        for (SnowSlab slab : ModBlocks.SNOW_SLABS) {
                            if (state == slab.origin.getDefaultState()) {
                                if (state.get(BlockStateProperties.SLAB_TYPE) == SlabType.BOTTOM) {
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
