package trikzon.snowvariants.events;

import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.Half;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.*;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import trikzon.snowvariants.blocks.ModBlocks;
import trikzon.snowvariants.blocks.SnowSlab;
import trikzon.snowvariants.blocks.SnowStair;

@Mod.EventBusSubscriber
public class TransformationEvent {

    @SubscribeEvent()
    public static void onBlockRightClicked(PlayerInteractEvent.RightClickBlock event) {
        boolean success = false;
        BlockPos successPos = null;

        World world = event.getWorld();
        if (!(event.getEntity() instanceof PlayerEntity)) return;
        PlayerEntity playerIn = event.getEntityPlayer();

        if (!world.isRemote) {
            if (!(playerIn.getHeldItem(event.getHand()).isItemEqual(new ItemStack(Blocks.SNOW)))) return;

            RayTraceResult rayTraceResult = rayTrace(world, playerIn);
            if (rayTraceResult == null) return;
            if (rayTraceResult.getType() != RayTraceResult.Type.BLOCK) return;
//            if (!getDirectionFromVector(rayTraceResult.getHitVec()).equals(Direction.UP)) return;

            BlockPos blockPos = new BlockPos(rayTraceResult.getHitVec());
            BlockState blockStateAtPos = world.getBlockState(blockPos);
            Block blockAtPos = blockStateAtPos.getBlock();

            if (blockAtPos instanceof StairsBlock) {
                for (SnowStair block : ModBlocks.SNOW_STAIRS) {
                    if (blockAtPos.equals(block.origin)) {
                        if (blockStateAtPos.get(BlockStateProperties.HALF).equals(Half.BOTTOM)) {
                            world.setBlockState(blockPos, block.getDefaultState()
                            .with(BlockStateProperties.HORIZONTAL_FACING, blockStateAtPos.get(BlockStateProperties.HORIZONTAL_FACING))
                            .with(BlockStateProperties.HALF, blockStateAtPos.get(BlockStateProperties.HALF))
                            .with(BlockStateProperties.STAIRS_SHAPE, blockStateAtPos.get(BlockStateProperties.STAIRS_SHAPE)));

                            if (!playerIn.isCreative())
                                playerIn.getHeldItem(event.getHand()).shrink(1);

                            successPos = blockPos;
                            playerIn.playSound(SoundEvents.BLOCK_SNOW_PLACE, (SoundType.SNOW.getVolume() + 1.0f) / 2.0f, SoundType.SNOW.getPitch() * 0.8f);
//                            world.playSound(playerIn, blockPos, SoundType.SNOW.getPlaceSound(), SoundCategory.BLOCKS, (SoundType.SNOW.getVolume() + 1.0f) / 2.0f, SoundType.SNOW.getPitch() * 0.8f);
                            success = true;
                        }

                        break;
                    }
                }
            }

            if (blockAtPos instanceof SlabBlock) {
                for (SnowSlab block : ModBlocks.SNOW_SLABS) {
                    if (blockAtPos.equals(block.origin)) {
                        if (blockStateAtPos.get(BlockStateProperties.SLAB_TYPE).equals(SlabType.BOTTOM)) {
                            world.setBlockState(blockPos, block.getDefaultState());

                            if (!playerIn.isCreative())
                                playerIn.getHeldItem(event.getHand()).shrink(1);

                            successPos = blockPos;
                            world.playSound(playerIn, blockPos, SoundType.SNOW.getPlaceSound(), SoundCategory.BLOCKS, (SoundType.SNOW.getVolume() + 1.0f) / 2.0f, SoundType.SNOW.getPitch() * 0.8f);
                            success = true;
                        }
                    }
                }
            }
        }
        if (world.isRemote && success) {
            //TODO: It doesn't play a sound
//            world.playSound(playerIn, successPos, SoundType.SNOW.getPlaceSound(), SoundCategory.BLOCKS, (SoundType.SNOW.getVolume() + 1.0f) / 2.0f, SoundType.SNOW.getPitch() * 0.8f);
        }

    }


    public static RayTraceResult rayTrace (World worldIn, PlayerEntity player) {
        float f = player.rotationPitch;
        float f1 = player.rotationYaw;
        Vec3d vec3d = player.getEyePosition(1.0F);
        float f2 = MathHelper.cos(-f1 * ((float)Math.PI / 180F) - (float)Math.PI);
        float f3 = MathHelper.sin(-f1 * ((float)Math.PI / 180F) - (float)Math.PI);
        float f4 = -MathHelper.cos(-f * ((float)Math.PI / 180F));
        float f5 = MathHelper.sin(-f * ((float)Math.PI / 180F));
        float f6 = f3 * f4;
        float f7 = f2 * f4;
        double d0 = player.getAttribute(PlayerEntity.REACH_DISTANCE).getValue();;
        Vec3d vec3d1 = vec3d.add((double)f6 * d0, (double)f5 * d0, (double)f7 * d0);
        return worldIn.rayTraceBlocks(new RayTraceContext(vec3d, vec3d1, RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, player));
    }

    public static Direction getDirectionFromVector(Vec3d vec3d) {
        return Direction.getFacingFromVector((float)vec3d.getX(), (float)vec3d.getY(), (float)vec3d.getZ());
    }
}
