package trikzon.snowvariants.handlers;

import net.minecraft.block.*;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import trikzon.snowvariants.SnowVariants;
import trikzon.snowvariants.compat.ModChecker;
import trikzon.snowvariants.compat.ModGetter;
import trikzon.snowvariants.init.ModBlocks;

public class RightClickTransformationHandler {

	@SubscribeEvent(priority = EventPriority.HIGH)
	public void onItemRightClick(PlayerInteractEvent.RightClickItem event) {
		World worldIn = event.getWorld();
		EntityPlayer playerIn = event.getEntityPlayer();

		RayTraceResult rayTraceResult = this.getRaytraceResult(playerIn, worldIn);
		if (rayTraceResult == null)
			return;
		if (rayTraceResult.typeOfHit == RayTraceResult.Type.BLOCK) {
			if(rayTraceResult.sideHit.equals(EnumFacing.UP)) {
				BlockPos blockPos = rayTraceResult.getBlockPos();

				this.convertStair(worldIn, playerIn, blockPos, Blocks.OAK_STAIRS, ModBlocks.stairsOakSnow);
				this.convertStair(worldIn, playerIn, blockPos, Blocks.STONE_STAIRS, ModBlocks.stairsCobblestoneSnow);
				this.convertStair(worldIn, playerIn, blockPos, Blocks.BRICK_STAIRS, ModBlocks.stairsBrickSnow);
				this.convertStair(worldIn, playerIn, blockPos, Blocks.STONE_BRICK_STAIRS, ModBlocks.stairsCobblestoneSnow);
				this.convertStair(worldIn, playerIn, blockPos, Blocks.NETHER_BRICK_STAIRS, ModBlocks.stairsNetherBrickSnow);
				this.convertStair(worldIn, playerIn, blockPos, Blocks.SANDSTONE_STAIRS, ModBlocks.stairsSandstoneSnow);
				this.convertStair(worldIn, playerIn, blockPos, Blocks.SPRUCE_STAIRS, ModBlocks.stairsSpruceSnow);
				this.convertStair(worldIn, playerIn, blockPos, Blocks.BIRCH_STAIRS, ModBlocks.stairsBirchSnow);
				this.convertStair(worldIn, playerIn, blockPos, Blocks.JUNGLE_STAIRS, ModBlocks.stairsJungleSnow);
				this.convertStair(worldIn, playerIn, blockPos, Blocks.QUARTZ_STAIRS, ModBlocks.stairsQuartzSnow);
				this.convertStair(worldIn, playerIn, blockPos, Blocks.ACACIA_STAIRS, ModBlocks.stairsAcaciaSnow);
				this.convertStair(worldIn, playerIn, blockPos, Blocks.DARK_OAK_STAIRS, ModBlocks.stairsDarkOakSnow);
				this.convertStair(worldIn, playerIn, blockPos, Blocks.RED_SANDSTONE_STAIRS, ModBlocks.stairsRedSandstoneSnow);
				this.convertStair(worldIn, playerIn, blockPos, Blocks.PURPUR_STAIRS, ModBlocks.stairsPurpurSnow);

				this.convertSlabWithVariant(worldIn, playerIn, blockPos, Blocks.STONE_SLAB, BlockStoneSlab.VARIANT, BlockStoneSlab.EnumType.STONE.toString(), ModBlocks.slabStoneSnow);
				this.convertSlabWithVariant(worldIn, playerIn, blockPos, Blocks.STONE_SLAB, BlockStoneSlab.VARIANT, BlockStoneSlab.EnumType.SAND.toString(), ModBlocks.slabSandstoneSnow);
				this.convertSlabWithVariant(worldIn, playerIn, blockPos, Blocks.STONE_SLAB, BlockStoneSlab.VARIANT, BlockStoneSlab.EnumType.COBBLESTONE.toString(), ModBlocks.slabCobblestoneSnow);
				this.convertSlabWithVariant(worldIn, playerIn, blockPos, Blocks.STONE_SLAB, BlockStoneSlab.VARIANT, BlockStoneSlab.EnumType.BRICK.toString(), ModBlocks.slabBrickSnow);
				this.convertSlabWithVariant(worldIn, playerIn, blockPos, Blocks.STONE_SLAB, BlockStoneSlab.VARIANT, BlockStoneSlab.EnumType.SMOOTHBRICK.toString(), ModBlocks.slabStoneBrickSnow);
				this.convertSlabWithVariant(worldIn, playerIn, blockPos, Blocks.STONE_SLAB, BlockStoneSlab.VARIANT, BlockStoneSlab.EnumType.NETHERBRICK.toString(), ModBlocks.slabNetherBrickSnow);
				this.convertSlabWithVariant(worldIn, playerIn, blockPos, Blocks.STONE_SLAB, BlockStoneSlab.VARIANT, BlockStoneSlab.EnumType.QUARTZ.toString(), ModBlocks.slabQuartzSnow);
				this.convertSlabWithVariant(worldIn, playerIn, blockPos, Blocks.WOODEN_SLAB, BlockWoodSlab.VARIANT, BlockPlanks.EnumType.OAK.toString(), ModBlocks.slabOakSnow);
				this.convertSlabWithVariant(worldIn, playerIn, blockPos, Blocks.WOODEN_SLAB, BlockWoodSlab.VARIANT, BlockPlanks.EnumType.SPRUCE.toString(), ModBlocks.slabSpruceSnow);
				this.convertSlabWithVariant(worldIn, playerIn, blockPos, Blocks.WOODEN_SLAB, BlockWoodSlab.VARIANT, BlockPlanks.EnumType.BIRCH.toString(), ModBlocks.slabBirchSnow);
				this.convertSlabWithVariant(worldIn, playerIn, blockPos, Blocks.WOODEN_SLAB, BlockWoodSlab.VARIANT, BlockPlanks.EnumType.JUNGLE.toString(), ModBlocks.slabJungleSnow);
				this.convertSlabWithVariant(worldIn, playerIn, blockPos, Blocks.WOODEN_SLAB, BlockWoodSlab.VARIANT, BlockPlanks.EnumType.ACACIA.toString(), ModBlocks.slabAcaciaSnow);
				this.convertSlabWithVariant(worldIn, playerIn, blockPos, Blocks.WOODEN_SLAB, BlockWoodSlab.VARIANT, BlockPlanks.EnumType.DARK_OAK.toString(), ModBlocks.slabDarkOakSnow);
				this.convertSlab(worldIn, playerIn, blockPos, Blocks.STONE_SLAB2, ModBlocks.slabRedSandstoneSnow);
				this.convertSlab(worldIn, playerIn, blockPos, Blocks.PURPUR_SLAB, ModBlocks.slabPurpurSnow);

				if(ModChecker.isGingerbreadLoaded) {
					this.convertStair(worldIn, playerIn, blockPos, ModGetter.stairsGingerbread, ModBlocks.stairsGingerbreadSnow);
					this.convertSlab(worldIn, playerIn, blockPos, ModGetter.slabGingerbread, ModBlocks.slabGingerbreadSnow);
				}
			}
		}
	}

	public void convertStair(World worldIn, EntityPlayer playerIn, BlockPos blockPos, Block origin, Block snowVariant) {
		if(worldIn.getBlockState(blockPos).getBlock().getDefaultState().equals(origin.getDefaultState())) {
			if (worldIn.getBlockState(blockPos).getValue(BlockStairs.HALF).equals(BlockStairs.EnumHalf.BOTTOM)) {
				ItemStack item = playerIn.getHeldItem(EnumHand.MAIN_HAND);
				worldIn.setBlockState(blockPos, snowVariant.getDefaultState().withProperty(BlockStairs.FACING, worldIn.getBlockState(blockPos).getValue(BlockStairs.FACING)).withProperty(BlockStairs.HALF, worldIn.getBlockState(blockPos).getValue(BlockStairs.HALF)).withProperty(BlockStairs.SHAPE, worldIn.getBlockState(blockPos).getValue(BlockStairs.SHAPE)));
				worldIn.playSound((EntityPlayer)null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
				if (!playerIn.isCreative())
					item.shrink(1);
			}
		}
	}

	public void convertSlab(World worldIn, EntityPlayer playerIn, BlockPos blockPos, Block origin, Block snowVariant) {
		if(worldIn.getBlockState(blockPos).getBlock().getDefaultState().equals(origin.getDefaultState())) {
			if(worldIn.getBlockState(blockPos).getValue(BlockSlab.HALF).equals(BlockSlab.EnumBlockHalf.BOTTOM)) {
				ItemStack item = playerIn.getHeldItem(EnumHand.MAIN_HAND);
				worldIn.setBlockState(blockPos, snowVariant.getDefaultState());
				worldIn.playSound((EntityPlayer) null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
				if (!playerIn.isCreative())
					item.shrink(1);
			}
		}
	}

	public void convertSlabWithVariant(World worldIn, EntityPlayer playerIn, BlockPos blockPos, Block origin, PropertyEnum variantType, String variant, Block snowVariant) {
		if(worldIn.getBlockState(blockPos).getBlock().getDefaultState().equals(origin.getDefaultState())) {
			if(worldIn.getBlockState(blockPos).getValue(BlockSlab.HALF).equals(BlockSlab.EnumBlockHalf.BOTTOM)) {
				if(worldIn.getBlockState(blockPos).getValue(variantType).toString().equals(variant)) {
					ItemStack item = playerIn.getHeldItem(EnumHand.MAIN_HAND);
					worldIn.setBlockState(blockPos, snowVariant.getDefaultState());
					worldIn.playSound((EntityPlayer) null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
					if (!playerIn.isCreative())
						item.shrink(1);
				}
			}
		}
	}

	public RayTraceResult getRaytraceResult(EntityPlayer playerIn, World worldIn) {
		float f1 = playerIn.prevRotationPitch + (playerIn.rotationPitch - playerIn.prevRotationPitch) * 1.0F;
		float f2 = playerIn.prevRotationYaw + (playerIn.rotationYaw - playerIn.prevRotationYaw) * 1.0F;
		double d0 = playerIn.prevPosX + (playerIn.posX - playerIn.prevPosX) * 1.0D;
		double d1 = playerIn.prevPosY + (playerIn.posY - playerIn.prevPosY) * 1.0D + (double)playerIn.getEyeHeight();
		double d2 = playerIn.prevPosZ + (playerIn.posZ - playerIn.prevPosZ) * 1.0D;
		Vec3d vec3d = new Vec3d(d0, d1, d2);
		float f3 = MathHelper.cos(-f2 * 0.017453292F - (float)Math.PI);
		float f4 = MathHelper.sin(-f2 * 0.017453292F - (float)Math.PI);
		float f5 = -MathHelper.cos(-f1 * 0.017453292F);
		float f6 = MathHelper.sin(-f1 * 0.017453292F);
		float f7 = f4 * f5;
		float f8 = f3 * f5;
		Vec3d vec3d1 = vec3d.addVector((double)f7 * 5.0D, (double)f6 * 5.0D, (double)f8 * 5.0D);
		RayTraceResult raytraceresult = worldIn.rayTraceBlocks(vec3d, vec3d1, true);
		return raytraceresult;
	}
}
