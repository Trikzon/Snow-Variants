package trikzon.snowvariants.events;

import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import net.minecraft.world.server.ChunkHolder;
import net.minecraft.world.server.ChunkManager;
import net.minecraft.world.server.ServerChunkProvider;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;


@Mod.EventBusSubscriber
public class WorldTickEvent {


    /**
     * Thank you @SteveBeeblebrox for the help with this event
     */
    @SubscribeEvent
    public static void onWorldTick(TickEvent.WorldTickEvent event) {
        if (event.phase == TickEvent.Phase.END && event.world.getChunkProvider() instanceof ServerChunkProvider) {
            ChunkManager manager = ((ServerChunkProvider) event.world.getChunkProvider()).chunkManager;
            Long2ObjectLinkedOpenHashMap<ChunkHolder> field_219252_f = ObfuscationReflectionHelper.getPrivateValue(ChunkManager.class, manager, "field_219252_f");

            for (ChunkHolder holder : field_219252_f.values()) {
                if (holder.func_219298_c() != null) {
                    MinecraftForge.EVENT_BUS.post(new ChunkTickEvent(event.world, holder.func_219298_c()));
                }
            }
        }
    }
}
