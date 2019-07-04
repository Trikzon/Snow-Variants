package trikzon.snowvariants.setup;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import trikzon.snowvariants.SnowVariants;
import trikzon.snowvariants.blocks.ModBlocks;
import trikzon.snowvariants.blocks.SnowSlab;
import trikzon.snowvariants.blocks.SnowStair;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = SnowVariants.MODID)
public class RegistryEvents {

    @SubscribeEvent
    public static void onBlockRegistry(final RegistryEvent.Register<Block> event) {
        registerMinecraftBlocks();

        for (Block block : ModBlocks.SNOW_STAIRS)
            event.getRegistry().register(block);
        for (Block block : ModBlocks.SNOW_SLABS)
            event.getRegistry().register(block);
    }

    public static void registerMinecraftBlocks() {
        new SnowStair(Blocks.PURPUR_STAIRS);
        new SnowStair(Blocks.OAK_STAIRS);
        new SnowStair(Blocks.COBBLESTONE_STAIRS);
        new SnowStair(Blocks.BRICK_STAIRS);
        new SnowStair(Blocks.STONE_BRICK_STAIRS);
        new SnowStair(Blocks.NETHER_BRICK_STAIRS);
        new SnowStair(Blocks.SANDSTONE_STAIRS);
        new SnowStair(Blocks.SPRUCE_STAIRS);
        new SnowStair(Blocks.BIRCH_STAIRS);
        new SnowStair(Blocks.JUNGLE_STAIRS);
        new SnowStair(Blocks.QUARTZ_STAIRS);
        new SnowStair(Blocks.ACACIA_STAIRS);
        new SnowStair(Blocks.DARK_OAK_STAIRS);
        new SnowStair(Blocks.PRISMARINE_STAIRS);
        new SnowStair(Blocks.PRISMARINE_BRICK_STAIRS);
        new SnowStair(Blocks.DARK_PRISMARINE_STAIRS);
        new SnowStair(Blocks.RED_SANDSTONE_STAIRS);
        new SnowStair(Blocks.POLISHED_GRANITE_STAIRS);
        new SnowStair(Blocks.SMOOTH_RED_SANDSTONE_STAIRS);
        new SnowStair(Blocks.MOSSY_STONE_BRICK_STAIRS);
        new SnowStair(Blocks.POLISHED_DIORITE_STAIRS);
        new SnowStair(Blocks.MOSSY_COBBLESTONE_STAIRS);
        new SnowStair(Blocks.END_STONE_BRICK_STAIRS);
        new SnowStair(Blocks.STONE_STAIRS);
        new SnowStair(Blocks.SMOOTH_SANDSTONE_STAIRS);
        new SnowStair(Blocks.SMOOTH_QUARTZ_STAIRS);
        new SnowStair(Blocks.GRANITE_STAIRS);
        new SnowStair(Blocks.ANDESITE_STAIRS);
        new SnowStair(Blocks.RED_NETHER_BRICK_STAIRS);
        new SnowStair(Blocks.POLISHED_ANDESITE_STAIRS);
        new SnowStair(Blocks.DIORITE_STAIRS);

        new SnowSlab(Blocks.OAK_SLAB);
        new SnowSlab(Blocks.SPRUCE_SLAB);
        new SnowSlab(Blocks.BIRCH_SLAB);
        new SnowSlab(Blocks.JUNGLE_SLAB);
        new SnowSlab(Blocks.ACACIA_SLAB);
        new SnowSlab(Blocks.DARK_OAK_SLAB);
        new SnowSlab(Blocks.STONE_SLAB);
        new SnowSlab(Blocks.SMOOTH_STONE_SLAB);
        new SnowSlab(Blocks.SANDSTONE_SLAB);
        new SnowSlab(Blocks.CUT_SANDSTONE_SLAB);
        new SnowSlab(Blocks.PETRIFIED_OAK_SLAB);
        new SnowSlab(Blocks.COBBLESTONE_SLAB);
        new SnowSlab(Blocks.BRICK_SLAB);
        new SnowSlab(Blocks.STONE_BRICK_SLAB);
        new SnowSlab(Blocks.NETHER_BRICK_SLAB);
        new SnowSlab(Blocks.QUARTZ_SLAB);
        new SnowSlab(Blocks.RED_SANDSTONE_SLAB);
        new SnowSlab(Blocks.CUT_RED_SANDSTONE_SLAB);
        new SnowSlab(Blocks.PURPUR_SLAB);
        new SnowSlab(Blocks.PRISMARINE_SLAB);
        new SnowSlab(Blocks.PRISMARINE_BRICK_SLAB);
        new SnowSlab(Blocks.DARK_PRISMARINE_SLAB);
        new SnowSlab(Blocks.POLISHED_GRANITE_SLAB);
        new SnowSlab(Blocks.SMOOTH_RED_SANDSTONE_SLAB);
        new SnowSlab(Blocks.MOSSY_STONE_BRICK_SLAB);
        new SnowSlab(Blocks.POLISHED_DIORITE_SLAB);
        new SnowSlab(Blocks.MOSSY_COBBLESTONE_SLAB);
        new SnowSlab(Blocks.END_STONE_BRICK_SLAB);
        new SnowSlab(Blocks.SMOOTH_SANDSTONE_SLAB);
        new SnowSlab(Blocks.SMOOTH_QUARTZ_SLAB);
        new SnowSlab(Blocks.GRANITE_SLAB);
        new SnowSlab(Blocks.ANDESITE_SLAB);
        new SnowSlab(Blocks.RED_NETHER_BRICK_SLAB);
        new SnowSlab(Blocks.POLISHED_ANDESITE_SLAB);
        new SnowSlab(Blocks.DIORITE_SLAB);
    }

    @SubscribeEvent
    public static void onItemRegistry(final RegistryEvent.Register<Item> event){

        for (Block block : ModBlocks.SNOW_STAIRS)
            event.getRegistry().register(new BlockItem(block, new Item.Properties().group(SnowVariants.itemGroup)).setRegistryName(block.getRegistryName()));
        for (Block block : ModBlocks.SNOW_SLABS)
            event.getRegistry().register(new BlockItem(block, new Item.Properties().group(SnowVariants.itemGroup)).setRegistryName(block.getRegistryName()));
    }
}
