package trikzon.snowvariants.objects;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.util.BlockRenderLayer;
import trikzon.snowvariants.SnowVariants;

public class BlockStairBase extends BlockStairs {
	public BlockStairBase(Block block, String name, SoundType soundType) {
		super(block.getDefaultState());

		this.setUnlocalizedName(SnowVariants.MODID + "." + name);
		this.setRegistryName(name);

		this.setSoundType(soundType);
	}

	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT;
	}
}
