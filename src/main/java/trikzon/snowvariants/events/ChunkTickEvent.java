package trikzon.snowvariants.events;

import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.eventbus.api.Event;

/**
 * Thank you @SteveBeeblebrox for the help with this event
 */
public class ChunkTickEvent extends Event {

    private World world;
    private Chunk chunk;

    public ChunkTickEvent(World world, Chunk chunk) {
        this.world = world;
        this.chunk = chunk;
    }

    public Chunk getChunk() {
        return chunk;
    }

    public World getWorld() {
        return world;
    }
}
