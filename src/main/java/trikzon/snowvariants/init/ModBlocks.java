package trikzon.snowvariants.init;

import net.minecraft.block.SoundType;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.registry.GameRegistry;
import trikzon.snowvariants.objects.BlockStairBase;

public class ModBlocks {

	@GameRegistry.ObjectHolder("snowvariants:stairs_oak_snow")
	public static BlockStairBase stairsOakSnow = new BlockStairBase(Blocks.PLANKS, "stairs_oak_snow", SoundType.WOOD);
}
