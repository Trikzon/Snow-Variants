package trikzon.snowvariants.handlers;

import net.minecraft.block.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
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
import trikzon.snowvariants.init.ModBlocks;

public class SnowTransformationHandler {

	@SubscribeEvent(priority = EventPriority.HIGH)
	public void onItemRightClick(PlayerInteractEvent.RightClickItem event) {
		World worldIn = event.getWorld();
		EntityPlayer playerIn = event.getEntityPlayer();
		ItemStack item = playerIn.getHeldItem(EnumHand.MAIN_HAND);

		if(item.getItem().equals(Item.getItemFromBlock(Blocks.SNOW_LAYER))) {
			RayTraceResult rayTraceResult = getRaytraceResult(playerIn, worldIn);
			if (rayTraceResult == null)
				return;
			if (rayTraceResult.typeOfHit == RayTraceResult.Type.BLOCK)
			{
				BlockPos blockPos = rayTraceResult.getBlockPos();
				if(rayTraceResult.sideHit.equals(EnumFacing.UP)) {
					if(worldIn.getBlockState(blockPos).getBlock().getDefaultState().equals(Blocks.OAK_STAIRS.getDefaultState())) {
						if(worldIn.getBlockState(blockPos).getValue(BlockStairs.HALF).equals(BlockStairs.EnumHalf.BOTTOM)) {
							worldIn.setBlockState(blockPos, ModBlocks.stairsOakSnow.getDefaultState().withProperty(BlockStairs.FACING, worldIn.getBlockState(blockPos).getValue(BlockStairs.FACING)).withProperty(BlockStairs.HALF, worldIn.getBlockState(blockPos).getValue(BlockStairs.HALF)).withProperty(BlockStairs.SHAPE, worldIn.getBlockState(blockPos).getValue(BlockStairs.SHAPE)));
							worldIn.playSound((EntityPlayer)null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
							if (!playerIn.isCreative())
								item.shrink(1);
						}
					}else if(worldIn.getBlockState(blockPos).getBlock().getDefaultState().equals(Blocks.STONE_STAIRS.getDefaultState())) {
						if(worldIn.getBlockState(blockPos).getValue(BlockStairs.HALF).equals(BlockStairs.EnumHalf.BOTTOM)) {
							worldIn.setBlockState(blockPos, ModBlocks.stairsCobblestoneSnow.getDefaultState().withProperty(BlockStairs.FACING, worldIn.getBlockState(blockPos).getValue(BlockStairs.FACING)).withProperty(BlockStairs.HALF, worldIn.getBlockState(blockPos).getValue(BlockStairs.HALF)).withProperty(BlockStairs.SHAPE, worldIn.getBlockState(blockPos).getValue(BlockStairs.SHAPE)));
							worldIn.playSound((EntityPlayer)null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
							if (!playerIn.isCreative())
								item.shrink(1);
						}
					}else if(worldIn.getBlockState(blockPos).getBlock().getDefaultState().equals(Blocks.BRICK_STAIRS.getDefaultState())) {
						if(worldIn.getBlockState(blockPos).getValue(BlockStairs.HALF).equals(BlockStairs.EnumHalf.BOTTOM)) {
							worldIn.setBlockState(blockPos, ModBlocks.stairsBrickSnow.getDefaultState().withProperty(BlockStairs.FACING, worldIn.getBlockState(blockPos).getValue(BlockStairs.FACING)).withProperty(BlockStairs.HALF, worldIn.getBlockState(blockPos).getValue(BlockStairs.HALF)).withProperty(BlockStairs.SHAPE, worldIn.getBlockState(blockPos).getValue(BlockStairs.SHAPE)));
							worldIn.playSound((EntityPlayer)null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
							if (!playerIn.isCreative())
								item.shrink(1);
						}
					}else if(worldIn.getBlockState(blockPos).getBlock().getDefaultState().equals(Blocks.STONE_BRICK_STAIRS.getDefaultState())) {
						if(worldIn.getBlockState(blockPos).getValue(BlockStairs.HALF).equals(BlockStairs.EnumHalf.BOTTOM)) {
							worldIn.setBlockState(blockPos, ModBlocks.stairsStoneBrickSnow.getDefaultState().withProperty(BlockStairs.FACING, worldIn.getBlockState(blockPos).getValue(BlockStairs.FACING)).withProperty(BlockStairs.HALF, worldIn.getBlockState(blockPos).getValue(BlockStairs.HALF)).withProperty(BlockStairs.SHAPE, worldIn.getBlockState(blockPos).getValue(BlockStairs.SHAPE)));
							worldIn.playSound((EntityPlayer)null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
							if (!playerIn.isCreative())
								item.shrink(1);
						}
					}else if(worldIn.getBlockState(blockPos).getBlock().getDefaultState().equals(Blocks.NETHER_BRICK_STAIRS.getDefaultState())) {
						if(worldIn.getBlockState(blockPos).getValue(BlockStairs.HALF).equals(BlockStairs.EnumHalf.BOTTOM)) {
							worldIn.setBlockState(blockPos, ModBlocks.stairsNetherBrickSnow.getDefaultState().withProperty(BlockStairs.FACING, worldIn.getBlockState(blockPos).getValue(BlockStairs.FACING)).withProperty(BlockStairs.HALF, worldIn.getBlockState(blockPos).getValue(BlockStairs.HALF)).withProperty(BlockStairs.SHAPE, worldIn.getBlockState(blockPos).getValue(BlockStairs.SHAPE)));
							worldIn.playSound((EntityPlayer)null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
							if (!playerIn.isCreative())
								item.shrink(1);
						}
					}else if(worldIn.getBlockState(blockPos).getBlock().getDefaultState().equals(Blocks.SANDSTONE_STAIRS.getDefaultState())) {
						if(worldIn.getBlockState(blockPos).getValue(BlockStairs.HALF).equals(BlockStairs.EnumHalf.BOTTOM)) {
							worldIn.setBlockState(blockPos, ModBlocks.stairsSandstoneSnow.getDefaultState().withProperty(BlockStairs.FACING, worldIn.getBlockState(blockPos).getValue(BlockStairs.FACING)).withProperty(BlockStairs.HALF, worldIn.getBlockState(blockPos).getValue(BlockStairs.HALF)).withProperty(BlockStairs.SHAPE, worldIn.getBlockState(blockPos).getValue(BlockStairs.SHAPE)));
							worldIn.playSound((EntityPlayer)null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
							if (!playerIn.isCreative())
								item.shrink(1);
						}
					}else if(worldIn.getBlockState(blockPos).getBlock().getDefaultState().equals(Blocks.SPRUCE_STAIRS.getDefaultState())) {
						if(worldIn.getBlockState(blockPos).getValue(BlockStairs.HALF).equals(BlockStairs.EnumHalf.BOTTOM)) {
							worldIn.setBlockState(blockPos, ModBlocks.stairsSpruceSnow.getDefaultState().withProperty(BlockStairs.FACING, worldIn.getBlockState(blockPos).getValue(BlockStairs.FACING)).withProperty(BlockStairs.HALF, worldIn.getBlockState(blockPos).getValue(BlockStairs.HALF)).withProperty(BlockStairs.SHAPE, worldIn.getBlockState(blockPos).getValue(BlockStairs.SHAPE)));
							worldIn.playSound((EntityPlayer)null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
							if (!playerIn.isCreative())
								item.shrink(1);
						}
					}else if(worldIn.getBlockState(blockPos).getBlock().getDefaultState().equals(Blocks.BIRCH_STAIRS.getDefaultState())) {
						if(worldIn.getBlockState(blockPos).getValue(BlockStairs.HALF).equals(BlockStairs.EnumHalf.BOTTOM)) {
							worldIn.setBlockState(blockPos, ModBlocks.stairsBirchSnow.getDefaultState().withProperty(BlockStairs.FACING, worldIn.getBlockState(blockPos).getValue(BlockStairs.FACING)).withProperty(BlockStairs.HALF, worldIn.getBlockState(blockPos).getValue(BlockStairs.HALF)).withProperty(BlockStairs.SHAPE, worldIn.getBlockState(blockPos).getValue(BlockStairs.SHAPE)));
							worldIn.playSound((EntityPlayer)null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
							if (!playerIn.isCreative())
								item.shrink(1);
						}
					}else if(worldIn.getBlockState(blockPos).getBlock().getDefaultState().equals(Blocks.JUNGLE_STAIRS.getDefaultState())) {
						if(worldIn.getBlockState(blockPos).getValue(BlockStairs.HALF).equals(BlockStairs.EnumHalf.BOTTOM)) {
							worldIn.setBlockState(blockPos, ModBlocks.stairsJungleSnow.getDefaultState().withProperty(BlockStairs.FACING, worldIn.getBlockState(blockPos).getValue(BlockStairs.FACING)).withProperty(BlockStairs.HALF, worldIn.getBlockState(blockPos).getValue(BlockStairs.HALF)).withProperty(BlockStairs.SHAPE, worldIn.getBlockState(blockPos).getValue(BlockStairs.SHAPE)));
							worldIn.playSound((EntityPlayer)null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
							if (!playerIn.isCreative())
								item.shrink(1);
						}
					}else if(worldIn.getBlockState(blockPos).getBlock().getDefaultState().equals(Blocks.QUARTZ_STAIRS.getDefaultState())) {
						if(worldIn.getBlockState(blockPos).getValue(BlockStairs.HALF).equals(BlockStairs.EnumHalf.BOTTOM)) {
							worldIn.setBlockState(blockPos, ModBlocks.stairsQuartzSnow.getDefaultState().withProperty(BlockStairs.FACING, worldIn.getBlockState(blockPos).getValue(BlockStairs.FACING)).withProperty(BlockStairs.HALF, worldIn.getBlockState(blockPos).getValue(BlockStairs.HALF)).withProperty(BlockStairs.SHAPE, worldIn.getBlockState(blockPos).getValue(BlockStairs.SHAPE)));
							worldIn.playSound((EntityPlayer)null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
							if (!playerIn.isCreative())
								item.shrink(1);
						}
					}else if(worldIn.getBlockState(blockPos).getBlock().getDefaultState().equals(Blocks.ACACIA_STAIRS.getDefaultState())) {
						if(worldIn.getBlockState(blockPos).getValue(BlockStairs.HALF).equals(BlockStairs.EnumHalf.BOTTOM)) {
							worldIn.setBlockState(blockPos, ModBlocks.stairsAcaciaSnow.getDefaultState().withProperty(BlockStairs.FACING, worldIn.getBlockState(blockPos).getValue(BlockStairs.FACING)).withProperty(BlockStairs.HALF, worldIn.getBlockState(blockPos).getValue(BlockStairs.HALF)).withProperty(BlockStairs.SHAPE, worldIn.getBlockState(blockPos).getValue(BlockStairs.SHAPE)));
							worldIn.playSound((EntityPlayer)null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
							if (!playerIn.isCreative())
								item.shrink(1);
						}
					}else if(worldIn.getBlockState(blockPos).getBlock().getDefaultState().equals(Blocks.DARK_OAK_STAIRS.getDefaultState())) {
						if(worldIn.getBlockState(blockPos).getValue(BlockStairs.HALF).equals(BlockStairs.EnumHalf.BOTTOM)) {
							worldIn.setBlockState(blockPos, ModBlocks.stairsDarkOakSnow.getDefaultState().withProperty(BlockStairs.FACING, worldIn.getBlockState(blockPos).getValue(BlockStairs.FACING)).withProperty(BlockStairs.HALF, worldIn.getBlockState(blockPos).getValue(BlockStairs.HALF)).withProperty(BlockStairs.SHAPE, worldIn.getBlockState(blockPos).getValue(BlockStairs.SHAPE)));
							worldIn.playSound((EntityPlayer)null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
							if (!playerIn.isCreative())
								item.shrink(1);
						}
					}else if(worldIn.getBlockState(blockPos).getBlock().getDefaultState().equals(Blocks.RED_SANDSTONE_STAIRS.getDefaultState())) {
						if(worldIn.getBlockState(blockPos).getValue(BlockStairs.HALF).equals(BlockStairs.EnumHalf.BOTTOM)) {
							worldIn.setBlockState(blockPos, ModBlocks.stairsCobblestoneSnow.getDefaultState().withProperty(BlockStairs.FACING, worldIn.getBlockState(blockPos).getValue(BlockStairs.FACING)).withProperty(BlockStairs.HALF, worldIn.getBlockState(blockPos).getValue(BlockStairs.HALF)).withProperty(BlockStairs.SHAPE, worldIn.getBlockState(blockPos).getValue(BlockStairs.SHAPE)));
							worldIn.playSound((EntityPlayer)null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
							if (!playerIn.isCreative())
								item.shrink(1);
						}
					}else if(worldIn.getBlockState(blockPos).getBlock().getDefaultState().equals(Blocks.PURPUR_STAIRS.getDefaultState())) {
						if(worldIn.getBlockState(blockPos).getValue(BlockStairs.HALF).equals(BlockStairs.EnumHalf.BOTTOM)) {
							worldIn.setBlockState(blockPos, ModBlocks.stairsPurpurSnow.getDefaultState().withProperty(BlockStairs.FACING, worldIn.getBlockState(blockPos).getValue(BlockStairs.FACING)).withProperty(BlockStairs.HALF, worldIn.getBlockState(blockPos).getValue(BlockStairs.HALF)).withProperty(BlockStairs.SHAPE, worldIn.getBlockState(blockPos).getValue(BlockStairs.SHAPE)));
							worldIn.playSound((EntityPlayer)null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
							if (!playerIn.isCreative())
								item.shrink(1);
						}
					}
					if(worldIn.getBlockState(blockPos).getBlock().getDefaultState().equals(Blocks.STONE_SLAB.getDefaultState())) {
						if(worldIn.getBlockState(blockPos).getValue(BlockStoneSlab.HALF).equals(BlockSlab.EnumBlockHalf.BOTTOM)) {
							if (worldIn.getBlockState(blockPos).getValue(BlockStoneSlab.VARIANT).equals(BlockStoneSlab.EnumType.STONE)) {
								worldIn.setBlockState(blockPos, ModBlocks.slabStoneSnow.getDefaultState());
								worldIn.playSound((EntityPlayer) null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
								if (!playerIn.isCreative())
									item.shrink(1);
							} else if (worldIn.getBlockState(blockPos).getValue(BlockStoneSlab.VARIANT).equals(BlockStoneSlab.EnumType.SAND)) {
								worldIn.setBlockState(blockPos, ModBlocks.slabSandstoneSnow.getDefaultState());
								worldIn.playSound((EntityPlayer) null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
								if (!playerIn.isCreative())
									item.shrink(1);
							} else if (worldIn.getBlockState(blockPos).getValue(BlockStoneSlab.VARIANT).equals(BlockStoneSlab.EnumType.COBBLESTONE)) {
								worldIn.setBlockState(blockPos, ModBlocks.slabCobblestoneSnow.getDefaultState());
								worldIn.playSound((EntityPlayer) null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
								if (!playerIn.isCreative())
									item.shrink(1);
							} else if (worldIn.getBlockState(blockPos).getValue(BlockStoneSlab.VARIANT).equals(BlockStoneSlab.EnumType.BRICK)) {
								worldIn.setBlockState(blockPos, ModBlocks.slabBrickSnow.getDefaultState());
								worldIn.playSound((EntityPlayer) null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
								if (!playerIn.isCreative())
									item.shrink(1);
							} else if (worldIn.getBlockState(blockPos).getValue(BlockStoneSlab.VARIANT).equals(BlockStoneSlab.EnumType.SMOOTHBRICK)) {
								worldIn.setBlockState(blockPos, ModBlocks.slabStoneBrickSnow.getDefaultState());
								worldIn.playSound((EntityPlayer) null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
								if (!playerIn.isCreative())
									item.shrink(1);
							} else if (worldIn.getBlockState(blockPos).getValue(BlockStoneSlab.VARIANT).equals(BlockStoneSlab.EnumType.NETHERBRICK)) {
								worldIn.setBlockState(blockPos, ModBlocks.slabNetherBrickSnow.getDefaultState());
								worldIn.playSound((EntityPlayer) null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
								if (!playerIn.isCreative())
									item.shrink(1);
							} else if (worldIn.getBlockState(blockPos).getValue(BlockStoneSlab.VARIANT).equals(BlockStoneSlab.EnumType.QUARTZ)) {
								worldIn.setBlockState(blockPos, ModBlocks.slabQuartzSnow.getDefaultState());
								worldIn.playSound((EntityPlayer) null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
								if (!playerIn.isCreative())
									item.shrink(1);
							}
						}
					}else if(worldIn.getBlockState(blockPos).getBlock().getDefaultState().equals(Blocks.WOODEN_SLAB.getDefaultState())) {
						if(worldIn.getBlockState(blockPos).getValue(BlockWoodSlab.HALF).equals(BlockSlab.EnumBlockHalf.BOTTOM)) {
							if(worldIn.getBlockState(blockPos).getValue(BlockWoodSlab.VARIANT).equals(BlockPlanks.EnumType.OAK)) {
								worldIn.setBlockState(blockPos, ModBlocks.slabOakSnow.getDefaultState());
								worldIn.playSound((EntityPlayer) null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
								if (!playerIn.isCreative())
									item.shrink(1);
							} else if (worldIn.getBlockState(blockPos).getValue(BlockWoodSlab.VARIANT).equals(BlockPlanks.EnumType.SPRUCE)) {
								worldIn.setBlockState(blockPos, ModBlocks.slabSpruceSnow.getDefaultState());
								worldIn.playSound((EntityPlayer) null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
								if (!playerIn.isCreative())
									item.shrink(1);
							} else if (worldIn.getBlockState(blockPos).getValue(BlockWoodSlab.VARIANT).equals(BlockPlanks.EnumType.BIRCH)) {
								worldIn.setBlockState(blockPos, ModBlocks.slabBirchSnow.getDefaultState());
								worldIn.playSound((EntityPlayer) null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
								if (!playerIn.isCreative())
									item.shrink(1);
							} else if (worldIn.getBlockState(blockPos).getValue(BlockWoodSlab.VARIANT).equals(BlockPlanks.EnumType.JUNGLE)) {
								worldIn.setBlockState(blockPos, ModBlocks.slabJungleSnow.getDefaultState());
								worldIn.playSound((EntityPlayer) null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
								if (!playerIn.isCreative())
									item.shrink(1);
							} else if (worldIn.getBlockState(blockPos).getValue(BlockWoodSlab.VARIANT).equals(BlockPlanks.EnumType.ACACIA)) {
								worldIn.setBlockState(blockPos, ModBlocks.slabAcaciaSnow.getDefaultState());
								worldIn.playSound((EntityPlayer) null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
								if (!playerIn.isCreative())
									item.shrink(1);
							} else if (worldIn.getBlockState(blockPos).getValue(BlockWoodSlab.VARIANT).equals(BlockPlanks.EnumType.DARK_OAK)) {
								worldIn.setBlockState(blockPos, ModBlocks.slabDarkOakSnow.getDefaultState());
								worldIn.playSound((EntityPlayer) null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
								if (!playerIn.isCreative())
									item.shrink(1);
							}
						}
					}else if(worldIn.getBlockState(blockPos).getBlock().getDefaultState().equals(Blocks.STONE_SLAB2.getDefaultState())) {
						if(worldIn.getBlockState(blockPos).getValue(BlockStoneSlabNew.HALF).equals(BlockStoneSlabNew.EnumBlockHalf.BOTTOM)) {
							if(worldIn.getBlockState(blockPos).getValue(BlockStoneSlabNew.VARIANT).equals(BlockStoneSlabNew.EnumType.RED_SANDSTONE)) {
								worldIn.setBlockState(blockPos, ModBlocks.slabRedSandstoneSnow.getDefaultState());
								worldIn.playSound((EntityPlayer) null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
								if (!playerIn.isCreative())
									item.shrink(1);
							}
						}
					}else if(worldIn.getBlockState(blockPos).getBlock().getDefaultState().equals(Blocks.PURPUR_SLAB.getDefaultState())) {
						if(worldIn.getBlockState(blockPos).getValue(BlockPurpurSlab.HALF).equals(BlockPurpurSlab.EnumBlockHalf.BOTTOM)) {
							worldIn.setBlockState(blockPos, ModBlocks.slabPurpurSnow.getDefaultState());
							worldIn.playSound((EntityPlayer) null, blockPos, SoundEvents.BLOCK_SNOW_PLACE, SoundCategory.BLOCKS, 1, 1);
							if (!playerIn.isCreative())
								item.shrink(1);
						}
					}
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
