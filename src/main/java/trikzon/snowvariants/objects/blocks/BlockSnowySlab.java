package trikzon.snowvariants.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStoneSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import trikzon.snowvariants.init.ModBlocks;
import trikzon.snowvariants.objects.BlockBase;

public class BlockSnowySlab extends BlockBase {

	protected static final AxisAlignedBB AABB_BOTTOM_HALF = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D);
	public BlockSnowySlab(String name, Block originBlock) {
		super(name, originBlock.getDefaultState().getMaterial());
		this.setHardness(2.0f);
		this.setResistance(30.0f);
		if(originBlock.equals(Blocks.STONE)) {
			this.setSoundType(SoundType.STONE);
		} else if(originBlock.equals(Blocks.SANDSTONE)) {
			this.setSoundType(SoundType.STONE);
		} else if(originBlock.equals(Blocks.COBBLESTONE)) {
			this.setSoundType(SoundType.STONE);
		} else if(originBlock.equals(Blocks.BRICK_BLOCK)) {
			this.setSoundType(SoundType.STONE);
		} else if(originBlock.equals(Blocks.STONEBRICK)) {
			this.setSoundType(SoundType.STONE);
		} else if(originBlock.equals(Blocks.NETHER_BRICK)) {
			this.setSoundType(SoundType.STONE);
		} else if(originBlock.equals(Blocks.QUARTZ_BLOCK)) {
			this.setSoundType(SoundType.STONE);
		} else if(originBlock.equals(Blocks.PLANKS)) {
			this.setSoundType(SoundType.WOOD);
		} else if(originBlock.equals(Blocks.RED_SANDSTONE)) {
			this.setSoundType(SoundType.STONE);
		} else if(originBlock.equals(Blocks.PURPUR_BLOCK)) {
			this.setSoundType(SoundType.STONE);
		}
	}

	@Override
	public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
		if(face.equals(EnumFacing.DOWN))
			return BlockFaceShape.SOLID;
		return BlockFaceShape.UNDEFINED;
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return AABB_BOTTOM_HALF;
	}

	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	@Override
	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
		if(state.getBlock().getDefaultState().equals(ModBlocks.slabStoneSnow.getDefaultState())) {
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.STONE_SLAB), 1, 0));
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.SNOW_LAYER), 1));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.slabSandstoneSnow.getDefaultState())) {
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.STONE_SLAB), 1, 1));
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.SNOW_LAYER), 1));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.slabCobblestoneSnow.getDefaultState())) {
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.STONE_SLAB), 1, 3));
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.SNOW_LAYER), 1));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.slabBrickSnow.getDefaultState())) {
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.STONE_SLAB), 1, 4));
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.SNOW_LAYER), 1));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.slabStoneBrickSnow.getDefaultState())) {
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.STONE_SLAB), 1, 5));
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.SNOW_LAYER), 1));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.slabNetherBrickSnow.getDefaultState())) {
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.STONE_SLAB), 1, 6));
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.SNOW_LAYER), 1));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.slabQuartzSnow.getDefaultState())) {
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.STONE_SLAB), 1, 7));
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.SNOW_LAYER), 1));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.slabOakSnow.getDefaultState())) {
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.WOODEN_SLAB), 1, 0));
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.SNOW_LAYER), 1));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.slabSpruceSnow.getDefaultState())) {
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.WOODEN_SLAB), 1, 1));
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.SNOW_LAYER), 1));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.slabBirchSnow.getDefaultState())) {
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.WOODEN_SLAB), 1, 2));
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.SNOW_LAYER), 1));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.slabJungleSnow.getDefaultState())) {
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.WOODEN_SLAB), 1, 3));
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.SNOW_LAYER), 1));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.slabAcaciaSnow.getDefaultState())) {
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.WOODEN_SLAB), 1, 4));
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.SNOW_LAYER), 1));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.slabDarkOakSnow.getDefaultState())) {
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.WOODEN_SLAB), 1, 5));
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.SNOW_LAYER), 1));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.slabRedSandstoneSnow.getDefaultState())) {
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.STONE_SLAB2), 1, 0));
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.SNOW_LAYER), 1));
		}else if(state.getBlock().getDefaultState().equals(ModBlocks.slabPurpurSnow.getDefaultState())) {
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.PURPUR_SLAB), 1, 0));
			drops.add(new ItemStack(Item.getItemFromBlock(Blocks.SNOW_LAYER), 1));
		}
	}

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
		if(target.sideHit.equals(EnumFacing.UP))
			return new ItemStack(Item.getItemFromBlock(Blocks.SNOW_LAYER));
		if(state.getBlock().getDefaultState().equals(ModBlocks.slabStoneSnow.getDefaultState()))
			return new ItemStack(Item.getItemFromBlock(Blocks.STONE_SLAB), 1, 0);
		else if(state.getBlock().getDefaultState().equals(ModBlocks.slabSandstoneSnow.getDefaultState()))
			return new ItemStack(Item.getItemFromBlock(Blocks.STONE_SLAB), 1, 1);
		else if(state.getBlock().getDefaultState().equals(ModBlocks.slabCobblestoneSnow.getDefaultState()))
			return new ItemStack(Item.getItemFromBlock(Blocks.STONE_SLAB), 1, 3);
		else if(state.getBlock().getDefaultState().equals(ModBlocks.slabBrickSnow.getDefaultState()))
			return new ItemStack(Item.getItemFromBlock(Blocks.STONE_SLAB), 1, 4);
		else if(state.getBlock().getDefaultState().equals(ModBlocks.slabStoneBrickSnow.getDefaultState()))
			return new ItemStack(Item.getItemFromBlock(Blocks.STONE_SLAB), 1, 5);
		else if(state.getBlock().getDefaultState().equals(ModBlocks.slabNetherBrickSnow.getDefaultState()))
			return new ItemStack(Item.getItemFromBlock(Blocks.STONE_SLAB), 1, 6);
		else if(state.getBlock().getDefaultState().equals(ModBlocks.slabQuartzSnow.getDefaultState()))
			return new ItemStack(Item.getItemFromBlock(Blocks.STONE_SLAB), 1, 7);
		else if(state.getBlock().getDefaultState().equals(ModBlocks.slabOakSnow.getDefaultState()))
			return new ItemStack(Item.getItemFromBlock(Blocks.WOODEN_SLAB), 1, 0);
		else if(state.getBlock().getDefaultState().equals(ModBlocks.slabSpruceSnow.getDefaultState()))
			return new ItemStack(Item.getItemFromBlock(Blocks.WOODEN_SLAB), 1, 1);
		else if(state.getBlock().getDefaultState().equals(ModBlocks.slabBirchSnow.getDefaultState()))
			return new ItemStack(Item.getItemFromBlock(Blocks.WOODEN_SLAB), 1, 2);
		else if(state.getBlock().getDefaultState().equals(ModBlocks.slabJungleSnow.getDefaultState()))
			return new ItemStack(Item.getItemFromBlock(Blocks.WOODEN_SLAB), 1, 3);
		else if(state.getBlock().getDefaultState().equals(ModBlocks.slabAcaciaSnow.getDefaultState()))
			return new ItemStack(Item.getItemFromBlock(Blocks.WOODEN_SLAB), 1, 4);
		else if(state.getBlock().getDefaultState().equals(ModBlocks.slabDarkOakSnow.getDefaultState()))
			return new ItemStack(Item.getItemFromBlock(Blocks.WOODEN_SLAB), 1, 5);
		else if(state.getBlock().getDefaultState().equals(ModBlocks.slabRedSandstoneSnow.getDefaultState()))
			return new ItemStack(Item.getItemFromBlock(Blocks.STONE_SLAB2), 1, 0);
		else if(state.getBlock().getDefaultState().equals(ModBlocks.slabPurpurSnow.getDefaultState()))
			return new ItemStack(Item.getItemFromBlock(Blocks.PURPUR_SLAB),1, 0);
		return new ItemStack(Items.AIR);
	}
}
