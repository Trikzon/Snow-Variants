package trikzon.snowvariants.events;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.*;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import trikzon.snowvariants.blocks.VariantSlab;
import trikzon.snowvariants.blocks.VariantStairs;
import trikzon.snowvariants.init.ModBlocks;

public class VariantTransformEvent {

    @SubscribeEvent()
    public void onBlockRightClick(PlayerInteractEvent.RightClickBlock event) {
        World worldIn = event.getWorld();
        System.out.println("1");
        if (!(event.getEntity() instanceof EntityPlayer)) return;
        EntityPlayer playerIn = event.getEntityPlayer();
        System.out.println("1");
        RayTraceResult rayTraceResult = this.getRaytraceResult(playerIn, worldIn);
        if(rayTraceResult == null) return;
        System.out.println("1");
        if(rayTraceResult.typeOfHit == RayTraceResult.Type.BLOCK) {
            if(rayTraceResult.sideHit.equals(EnumFacing.UP)) {
                ItemStack itemInHand = playerIn.getHeldItem(EnumHand.MAIN_HAND);
                BlockPos blockPos = rayTraceResult.getBlockPos();
                IBlockState blockStateAtPos = worldIn.getBlockState(blockPos);
                Block blockAtPos = blockStateAtPos.getBlock();
                System.out.println("1");
                if(new ItemStack(itemInHand.getItem()).toString().equals(new ItemStack(Blocks.SNOW).toString())) {
                    System.out.println("1");
                    boolean success = false;

                    for (VariantStairs variantStairs : ModBlocks.VARIANT_STAIRS_LIST) {
                        if(success) break;
                        if(blockAtPos.equals(variantStairs.getOriginStair())) {
                            if(!blockStateAtPos.getValue(BlockStairs.HALF).equals(BlockStairs.EnumHalf.BOTTOM)) break;
                            worldIn.setBlockState(blockPos, variantStairs.getDefaultState()
                                    .withProperty(BlockStairs.FACING, blockStateAtPos.getValue(BlockStairs.FACING))
                                    .withProperty(BlockStairs.HALF, blockStateAtPos.getValue(BlockStairs.HALF))
                                    .withProperty(BlockStairs.SHAPE, blockStateAtPos.getValue(BlockStairs.SHAPE)));
                            worldIn.playSound(playerIn, blockPos, variantStairs.getTransformingSound().getPlaceSound(), SoundCategory.BLOCKS, (variantStairs.getTransformingSound().getVolume() + 1.0F) / 2.0F, variantStairs.getTransformingSound().getPitch() * 0.8F);
                            success = true;

                        }
                    }
                    for (VariantSlab variantSlab : ModBlocks.VARIANT_SLABS_LIST) {
                        if(success) break;
                        if(blockAtPos.equals(variantSlab.getOriginSlab())) {
                            if(!blockStateAtPos.getValue(BlockSlab.HALF).equals(BlockSlab.EnumBlockHalf.BOTTOM)) break;
                            worldIn.setBlockState(blockPos, variantSlab.getDefaultState());
                            worldIn.playSound(playerIn, blockPos, variantSlab.getTransformingSound().getPlaceSound(), SoundCategory.BLOCKS, (variantSlab.getTransformingSound().getVolume() + 1.0F) / 2.0F, variantSlab.getTransformingSound().getPitch() * 0.8F);
                            success = true;

                        }
                    }
                    if(success) {
                        if(!playerIn.isCreative()) itemInHand.shrink(1);
                        System.out.println("1");
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
        RayTraceResult raytraceresult = worldIn.rayTraceBlocks(vec3d, vec3d1);
        return raytraceresult;
    }
}
