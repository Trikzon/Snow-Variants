package trikzon.snowvariants;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import trikzon.snowvariants.blocks.ModBlocks;
import trikzon.snowvariants.blocks.SnowSlab;
import trikzon.snowvariants.blocks.SnowStair;

@Mod.EventBusSubscriber(modid = SnowVariants.MODID)
public class RegistryEvents {

    @SubscribeEvent
    public static void onBlockRegistry(final RegistryEvent.Register<Block> event) {
        if (ModConfig.generalCat.registerStairs) {
            if (ModConfig.modCat.minecraftSub.registerMinecraftStairs)
                registerMinecraftStairs();
        }

        if (ModConfig.generalCat.registerSlabs) {
            if (ModConfig.modCat.minecraftSub.registerMinecraftSlabs)
                registerMinecraftSlabs();
        }


        if (ModConfig.generalCat.registerStairs) {
            for (Block block : ModBlocks.SNOW_STAIRS)
                event.getRegistry().register(block);
        }
        if (ModConfig.generalCat.registerSlabs) {
            for (Block block : ModBlocks.SNOW_SLABS)
                event.getRegistry().register(block);
        }
    }

    public static void registerMinecraftStairs() {
        new SnowStair(Blocks.OAK_STAIRS, "snow_oak_stairs");
        new SnowStair(Blocks.STONE_STAIRS, "snow_cobblestone_stairs");
        new SnowStair(Blocks.BRICK_STAIRS, "snow_brick_stairs");
        new SnowStair(Blocks.STONE_BRICK_STAIRS, "snow_stone_brick_stairs");
        new SnowStair(Blocks.NETHER_BRICK_STAIRS, "snow_nether_brick_stairs");
        new SnowStair(Blocks.SANDSTONE_STAIRS, "snow_sandstone_stairs");
        new SnowStair(Blocks.SPRUCE_STAIRS, "snow_spruce_stairs");
        new SnowStair(Blocks.BIRCH_STAIRS, "snow_birch_stairs");
        new SnowStair(Blocks.JUNGLE_STAIRS, "snow_jungle_stairs");
        new SnowStair(Blocks.QUARTZ_STAIRS, "snow_quartz_stairs");
        new SnowStair(Blocks.ACACIA_STAIRS, "snow_acacia_stairs");
        new SnowStair(Blocks.DARK_OAK_STAIRS, "snow_dark_oak_stairs");
        new SnowStair(Blocks.RED_SANDSTONE_STAIRS, "snow_red_sandstone_stairs");
        new SnowStair(Blocks.PURPUR_STAIRS, "snow_purpur_stairs");
    }

    public static void registerMinecraftSlabs() {
        new SnowSlab(Blocks.STONE_SLAB, 0, "snow_smooth_stone_slab");
        new SnowSlab(Blocks.STONE_SLAB, 1, "snow_sandstone_slab");
        new SnowSlab(Blocks.STONE_SLAB, 3, "snow_cobblestone_slab");
        new SnowSlab(Blocks.STONE_SLAB, 4, "snow_brick_slab");
        new SnowSlab(Blocks.STONE_SLAB, 5, "snow_stone_brick_slab");
        new SnowSlab(Blocks.STONE_SLAB, 6, "snow_nether_brick_slab");
        new SnowSlab(Blocks.STONE_SLAB, 7, "snow_quartz_slab");
        new SnowSlab(Blocks.WOODEN_SLAB, 0, "snow_oak_slab");
        new SnowSlab(Blocks.WOODEN_SLAB, 1, "snow_spruce_slab");
        new SnowSlab(Blocks.WOODEN_SLAB, 2, "snow_birch_slab");
        new SnowSlab(Blocks.WOODEN_SLAB, 3, "snow_jungle_slab");
        new SnowSlab(Blocks.WOODEN_SLAB, 4, "snow_acacia_slab");
        new SnowSlab(Blocks.WOODEN_SLAB, 5, "snow_dark_oak_slab");
        new SnowSlab(Blocks.STONE_SLAB2, 0, "snow_red_sandstone_slab");
        new SnowSlab(Blocks.PURPUR_SLAB, 0, "snow_purpur_slab");
    }

    @SubscribeEvent
    public static void onItemRegistry(final RegistryEvent.Register<Item> event){

        if (ModConfig.generalCat.registerItems) {
            if (ModConfig.generalCat.registerStairs)
                for (Block block : ModBlocks.SNOW_STAIRS)
                    event.getRegistry().register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
            if (ModConfig.generalCat.registerSlabs)
                for (Block block : ModBlocks.SNOW_SLABS)
                    event.getRegistry().register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        }
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        for (SnowStair stair : ModBlocks.SNOW_STAIRS) {
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(stair), 0, new ModelResourceLocation(stair.getRegistryName(), "inventory"));
        }
        for (SnowSlab slab : ModBlocks.SNOW_SLABS) {
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(slab), 0, new ModelResourceLocation(slab.getRegistryName(), "inventory"));
        }
    }
}
