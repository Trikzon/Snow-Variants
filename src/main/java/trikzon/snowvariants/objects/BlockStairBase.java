package trikzon.snowvariants.objects;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import trikzon.snowvariants.SnowVariants;

import java.util.Random;

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

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Items.AIR;
	}

	@Override
	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
		drops.add(new ItemStack(Item.getItemFromBlock(Blocks.SNOW_LAYER), 1));
		System.out.println(getUnlocalizedName());
		switch (getUnlocalizedName()) {
			case "tile.snowvariants.stairs_oak_snow":
				drops.add(new ItemStack(Item.getItemFromBlock(Blocks.OAK_STAIRS), 1));
				drops.add(new ItemStack(Item.getItemFromBlock(Blocks.SNOW_LAYER), 1));
		}
	}
}
