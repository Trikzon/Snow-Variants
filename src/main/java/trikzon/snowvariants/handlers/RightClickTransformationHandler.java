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
import trikzon.snowvariants.compat.Botania;
import trikzon.snowvariants.compat.ModChecker;
import trikzon.snowvariants.compat.Gingerbread;
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
					if(Gingerbread.stairsGingerbreadGingerbread==null) ModChecker.printErrorMessageStairsGingerbreadGingerbread();
					else this.convertStair(worldIn, playerIn, blockPos, Gingerbread.stairsGingerbreadGingerbread, ModBlocks.stairsGingerbreadSnow);
					if(Gingerbread.slabGingerbreadGingerbread==null) ModChecker.printErrorMessageSlabGingerbreadGingerbread();
					else this.convertSlab(worldIn, playerIn, blockPos, Gingerbread.slabGingerbreadGingerbread, ModBlocks.slabGingerbreadSnow);
				}

				if(ModChecker.isBotaniaLoaded) {
					if(Botania.slabBotaniaLivingwood==null) ModChecker.printErrorMessageSlabBotaniaLivingwood();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaLivingwood, ModBlocks.slabBotaniaLivingwood);
					if(Botania.slabBotaniaLivingwoodPlank==null) ModChecker.printErrorMessageSlabBotaniaLivingwoodPlank();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaLivingwoodPlank, ModBlocks.slabBotaniaLivingwoodPlank);
					if(Botania.slabBotaniaLivingrock==null) ModChecker.printErrorMessageSlabBotaniaLivingrock();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaLivingrock, ModBlocks.slabBotaniaLivingrock);
					if(Botania.slabBotaniaLivingrockBrick==null) ModChecker.printErrorMessageSlabBotaniaLivingrockBrick();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaLivingrockBrick, ModBlocks.slabBotaniaLivingrockBrick);
					if(Botania.slabBotaniaDreamwood==null) ModChecker.printErrorMessageSlabBotaniaDreamwood();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaDreamwood, ModBlocks.slabBotaniaDreamwood);
					if(Botania.slabBotaniaDreamWoodPlank==null) ModChecker.printErrorMessageSlabBotaniaDreamwoodPlank();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaDreamWoodPlank, ModBlocks.slabBotaniaDreamwoodPlank);
					if(Botania.slabBotaniaQuartzSmokey==null) ModChecker.printErrorMessageSlabBotaniaQuartzSmokey();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaQuartzSmokey, ModBlocks.slabBotaniaQuartzSmokey);
					if(Botania.slabBotaniaQuartzMana==null) ModChecker.printErrorMessageSlabBotaniaQuartzMana();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaQuartzMana, ModBlocks.slabBotaniaQuartzMana);
					if(Botania.slabBotaniaQuartzBlaze==null) ModChecker.printErrorMessageSlabBotaniaQuartzBlaze();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaQuartzBlaze, ModBlocks.slabBotaniaQuartzBlaze);
					if(Botania.slabBotaniaQuartzLavender==null) ModChecker.printErrorMessageSlabBotaniaQuartzLavender();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaQuartzLavender, ModBlocks.slabBotaniaQuartzLavender);
					if(Botania.slabBotaniaQuartzRed==null) ModChecker.printErrorMessageSlabBotaniaQuartzRed();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaQuartzRed, ModBlocks.slabBotaniaQuartzRed);
					if(Botania.slabBotaniaQuartzElven==null) ModChecker.printErrorMessageSlabBotaniaQuartzElven();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaQuartzElven, ModBlocks.slabBotaniaQuartzElven);
					if(Botania.slabBotaniaQuartzSunny==null) ModChecker.printErrorMessageSlabBotaniaQuartzSunny();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaQuartzSunny, ModBlocks.slabBotaniaQuartzSunny);
					if(Botania.slabBotaniaMetamorphicStoneForest==null) ModChecker.printErrorMessageSlabBotaniaMetamorphicStoneForest();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaMetamorphicStoneForest, ModBlocks.slabBotaniaMetamorphicStoneForest);
					if(Botania.slabBotaniaMetamorphicStonePlains==null) ModChecker.printErrorMessageSlabBotaniaMetamorphicStonePlains();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaMetamorphicStonePlains, ModBlocks.slabBotaniaMetamorphicStonePlains);
					if(Botania.slabBotaniaMetamorphicStoneMountain==null) ModChecker.printErrorMessageSlabBotaniaMetamorphicStoneMountain();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaMetamorphicStoneMountain, ModBlocks.slabBotaniaMetamorphicStoneMountain);
					if(Botania.slabBotaniaMetamorphicStoneFungal==null) ModChecker.printErrorMessageSlabBotaniaMetamorphicStoneFungal();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaMetamorphicStoneFungal, ModBlocks.slabBotaniaMetamorphicStoneFungal);
					if(Botania.slabBotaniaMetamorphicStoneSwamp==null) ModChecker.printErrorMessageSlabBotaniaMetamorphicStoneSwamp();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaMetamorphicStoneSwamp, ModBlocks.slabBotaniaMetamorphicStoneSwamp);
					if(Botania.slabBotaniaMetamorphicStoneDesert==null) ModChecker.printErrorMessageSlabBotaniaMetamorphicStoneDesert();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaMetamorphicStoneDesert, ModBlocks.slabBotaniaMetamorphicStoneDesert);
					if(Botania.slabBotaniaMetamorphicStoneTaiga==null) ModChecker.printErrorMessageSlabBotaniaMetamorphicStoneTaiga();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaMetamorphicStoneTaiga, ModBlocks.slabBotaniaMetamorphicStoneTaiga);
					if(Botania.slabBotaniaMetamorphicStoneMesa==null) ModChecker.printErrorMessageSlabBotaniaMetamorphicStoneMesa();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaMetamorphicStoneMesa, ModBlocks.slabBotaniaMetamorphicStoneMesa);
					if(Botania.slabBotaniaMetamorphicCobblestoneForest==null) ModChecker.printErrorMessageSlabBotaniaMetamorphicCobblestoneForest();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaMetamorphicCobblestoneForest, ModBlocks.slabBotaniaMetamorphicCobblestoneForest);
					if(Botania.slabBotaniaMetamorphicCobblestonePlains==null) ModChecker.printErrorMessageSlabBotaniaMetamorphicCobblestonePlains();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaMetamorphicCobblestonePlains, ModBlocks.slabBotaniaMetamorphicCobblestonePlains);
					if(Botania.slabBotaniaMetamorphicCobblestoneMountain==null) ModChecker.printErrorMessageSlabBotaniaMetamorphicCobblestoneMountain();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaMetamorphicCobblestoneMountain, ModBlocks.slabBotaniaMetamorphicCobblestoneMountain);
					if(Botania.slabBotaniaMetamorphicCobblestoneFungal==null) ModChecker.printErrorMessageSlabBotaniaMetamorphicCobblestoneFungal();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaMetamorphicCobblestoneFungal, ModBlocks.slabBotaniaMetamorphicCobblestoneFungal);
					if(Botania.slabBotaniaMetamorphicCobblestoneSwamp==null) ModChecker.printErrorMessageSlabBotaniaMetamorphicCobblestoneSwamp();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaMetamorphicCobblestoneSwamp, ModBlocks.slabBotaniaMetamorphicCobblestoneSwamp);
					if(Botania.slabBotaniaMetamorphicCobblestoneDesert==null) ModChecker.printErrorMessageSlabBotaniaMetamorphicCobblestoneDesert();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaMetamorphicCobblestoneDesert, ModBlocks.slabBotaniaMetamorphicCobblestoneDesert);
					if(Botania.slabBotaniaMetamorphicCobblestoneTaiga==null) ModChecker.printErrorMessageSlabBotaniaMetamorphicCobblestoneTaiga();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaMetamorphicCobblestoneTaiga, ModBlocks.slabBotaniaMetamorphicCobblestoneTaiga);
					if(Botania.slabBotaniaMetamorphicCobblestoneMesa==null) ModChecker.printErrorMessageSlabBotaniaMetamorphicCobblestoneMesa();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaMetamorphicCobblestoneMesa, ModBlocks.slabBotaniaMetamorphicCobblestoneMesa);
					if(Botania.slabBotaniaMetamorphicStoneBrickForest==null) ModChecker.printErrorMessageSlabBotaniaMetamorphicStoneBrickForest();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaMetamorphicStoneBrickForest, ModBlocks.slabBotaniaMetamorphicStoneBrickForest);
					if(Botania.slabBotaniaMetamorphicStoneBrickPlains==null) ModChecker.printErrorMessageSlabBotaniaMetamorphicStoneBrickPlains();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaMetamorphicStoneBrickPlains, ModBlocks.slabBotaniaMetamorphicStoneBrickPlains);
					if(Botania.slabBotaniaMetamorphicStoneBrickMountain==null) ModChecker.printErrorMessageSlabBotaniaMetamorphicStoneBrickMountain();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaMetamorphicStoneBrickMountain, ModBlocks.slabBotaniaMetamorphicStoneBrickMountain);
					if(Botania.slabBotaniaMetamorphicStoneBrickFungal==null) ModChecker.printErrorMessageSlabBotaniaMetamorphicStoneBrickFungal();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaMetamorphicStoneBrickFungal, ModBlocks.slabBotaniaMetamorphicStoneBrickFungal);
					if(Botania.slabBotaniaMetamorphicStoneBrickSwamp==null) ModChecker.printErrorMessageSlabBotaniaMetamorphicStoneBrickSwamp();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaMetamorphicStoneBrickSwamp, ModBlocks.slabBotaniaMetamorphicStoneBrickSwamp);
					if(Botania.slabBotaniaMetamorphicStoneBrickDesert==null) ModChecker.printErrorMessageSlabBotaniaMetamorphicStoneBrickDesert();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaMetamorphicStoneBrickDesert, ModBlocks.slabBotaniaMetamorphicStoneBrickDesert);
					if(Botania.slabBotaniaMetamorphicStoneBrickTaiga==null) ModChecker.printErrorMessageSlabBotaniaMetamorphicStoneBrickTaiga();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaMetamorphicStoneBrickTaiga, ModBlocks.slabBotaniaMetamorphicStoneBrickTaiga);
					if(Botania.slabBotaniaMetamorphicStoneBrickMesa==null) ModChecker.printErrorMessageSlabBotaniaMetamorphicStoneBrickMesa();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaMetamorphicStoneBrickMesa, ModBlocks.slabBotaniaMetamorphicStoneBrickMesa);
					if(Botania.slabBotaniaPortuguesePavementWhite==null) ModChecker.printErrorMessageSlabBotaniaPortuguesePavementWhite();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaPortuguesePavementWhite, ModBlocks.slabBotaniaPortuguesePavementWhite);
					if(Botania.slabBotaniaPortuguesePavementBlack==null) ModChecker.printErrorMessageSlabBotaniaPortuguesePavementBlack();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaPortuguesePavementBlack, ModBlocks.slabBotaniaPortuguesePavementBlack);
					if(Botania.slabBotaniaPortuguesePavementBlue==null) ModChecker.printErrorMessageSlabBotaniaPortuguesePavementBlue();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaPortuguesePavementBlue, ModBlocks.slabBotaniaPortuguesePavementBlue);
					if(Botania.slabBotaniaPortuguesePavementRed==null) ModChecker.printErrorMessageSlabBotaniaPortuguesePavementRed();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaPortuguesePavementRed, ModBlocks.slabBotaniaPortuguesePavementRed);
					if(Botania.slabBotaniaPortuguesePavementYellow==null) ModChecker.printErrorMessageSlabBotaniaPortuguesePavementYellow();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaPortuguesePavementYellow, ModBlocks.slabBotaniaPortuguesePavementYellow);
					if(Botania.slabBotaniaPortuguesePavementGreen==null) ModChecker.printErrorMessageSlabBotaniaPortuguesePavementGreen();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaPortuguesePavementGreen, ModBlocks.slabBotaniaPortuguesePavementGreen);
					if(Botania.slabBotaniaShimmerrock==null) ModChecker.printErrorMessageSlabBotaniaShimmerrock();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaShimmerrock, ModBlocks.slabBotaniaShimmerrock);
					if(Botania.slabBotaniaShimmerwoodPlank==null) ModChecker.printErrorMessageSlabBotaniaShimmerwoodPlank();
					else this.convertSlab(worldIn, playerIn, blockPos, Botania.slabBotaniaShimmerwoodPlank, ModBlocks.slabBotaniaShimmerwoodPlank);
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
