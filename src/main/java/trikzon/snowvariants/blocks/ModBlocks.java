package trikzon.snowvariants.blocks;

import net.minecraftforge.fml.common.registry.GameRegistry;
import trikzon.snowvariants.SnowVariants;

import java.util.ArrayList;
import java.util.List;

@GameRegistry.ObjectHolder(SnowVariants.MODID)
public class ModBlocks {

    public static List<SnowStair> SNOW_STAIRS = new ArrayList<>();
    public static List<SnowSlab> SNOW_SLABS = new ArrayList<>();

    @GameRegistry.ObjectHolder("snow_spruce_stairs")
    public static final SnowStair MINECRAFT_SPRUCE_STAIRS = null;
}
