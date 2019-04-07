package trikzon.snowvariants.events;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.Half;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.*;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import trikzon.snowvariants.blocks.VariantStairs;
import trikzon.snowvariants.init.ModBlocks;

public class VariantTransformEvent {

    @SubscribeEvent(priority = EventPriority.HIGH)
    public void onBlockRightClick(PlayerInteractEvent.RightClickBlock event) {
        World worldIn = event.getWorld();
        if (!(event.getEntity() instanceof EntityPlayer)) return;
        EntityPlayer playerIn = event.getEntityPlayer();

        RayTraceResult rayTraceResult = this.getRaytraceResult(playerIn, worldIn);
        if(rayTraceResult == null) return;

        if(rayTraceResult.type == RayTraceResult.Type.BLOCK) {
            if(rayTraceResult.sideHit.equals(EnumFacing.UP)) {
                ItemStack itemInHand = playerIn.getHeldItem(EnumHand.MAIN_HAND);
                BlockPos blockPos = rayTraceResult.getBlockPos();
                IBlockState blockStateAtPos = worldIn.getBlockState(blockPos);
                Block blockAtPos = blockStateAtPos.getBlock();

                if(new ItemStack(itemInHand.getItem()).toString().equals(new ItemStack(Blocks.SNOW).toString())) {

                    boolean success = false;

                    for (VariantStairs variantStairs : ModBlocks.VARIANT_STAIRS_LIST) {
                        if(blockAtPos.equals(variantStairs.getOriginStair())) {
                            if(!blockStateAtPos.get(BlockStateProperties.HALF).equals(Half.BOTTOM)) break;
                            worldIn.setBlockState(blockPos, variantStairs.getDefaultState()
                                    .with(BlockStateProperties.HORIZONTAL_FACING, blockStateAtPos.get(BlockStateProperties.HORIZONTAL_FACING))
                                    .with(BlockStateProperties.HALF, blockStateAtPos.get(BlockStateProperties.HALF))
                                    .with(BlockStateProperties.STAIRS_SHAPE, blockStateAtPos.get(BlockStateProperties.STAIRS_SHAPE))
                                    .with(BlockStateProperties.WATERLOGGED, blockStateAtPos.get(BlockStateProperties.WATERLOGGED)));
                            success = true;

                        }

                        if(success) {
                            worldIn.playSound(playerIn, blockPos, SoundType.SNOW.getPlaceSound(), SoundCategory.BLOCKS, (SoundType.SNOW.getVolume() + 1.0F) / 2.0F, SoundType.SNOW.getPitch() * 0.8F);
                            if(!playerIn.isCreative()) itemInHand.shrink(1);
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
        Vec3d vec3d1 = vec3d.add((double)f7 * 5.0D, (double)f6 * 5.0D, (double)f8 * 5.0D);
        RayTraceResult raytraceresult = worldIn.rayTraceBlocks(vec3d, vec3d1, RayTraceFluidMode.NEVER);
        return raytraceresult;
    }
}
