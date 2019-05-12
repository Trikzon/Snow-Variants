package trikzon.snowvariants.proxy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import trikzon.snowvariants.SnowVariants;
import trikzon.snowvariants.init.ModBlocks;

/**
 * @author Trikzon
 */
@Mod.EventBusSubscriber
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {

    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }

    @SubscribeEvent
    public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
        IForgeRegistry<Block> registry = blockRegistryEvent.getRegistry();

        registerBlock(ModBlocks.SNOW_OAK_STAIRS, "snow_oak_stairs", registry);
        registerBlock(ModBlocks.SNOW_COBBLESTONE_STAIRS, "snow_cobblestone_stairs", registry);
        registerBlock(ModBlocks.SNOW_BRICK_STAIRS, "snow_brick_stairs", registry);
        registerBlock(ModBlocks.SNOW_STONE_BRICK_STAIRS, "snow_stone_brick_stairs", registry);
        registerBlock(ModBlocks.SNOW_NETHER_BRICK_STAIRS, "snow_nether_brick_stairs", registry);
        registerBlock(ModBlocks.SNOW_SANDSTONE_STAIRS, "snow_sandstone_stairs", registry);
        registerBlock(ModBlocks.SNOW_SPRUCE_STAIRS, "snow_spruce_stairs", registry);
        registerBlock(ModBlocks.SNOW_BIRCH_STAIRS, "snow_birch_stairs", registry);
        registerBlock(ModBlocks.SNOW_JUNGLE_STAIRS, "snow_jungle_stairs", registry);
        registerBlock(ModBlocks.SNOW_QUARTZ_STAIRS, "snow_quartz_stairs", registry);
        registerBlock(ModBlocks.SNOW_ACACIA_STAIRS, "snow_acacia_stairs", registry);
        registerBlock(ModBlocks.SNOW_DARK_OAK_STAIRS, "snow_dark_oak_stairs", registry);
        registerBlock(ModBlocks.SNOW_RED_SANDSTONE_STAIRS, "snow_red_sandstone_stairs", registry);
        registerBlock(ModBlocks.SNOW_PURPUR_STAIRS, "snow_purpur_stairs", registry);

        registerBlock(ModBlocks.SNOW_SMOOTH_STONE_SLAB, "snow_smooth_stone_slab", registry);
        registerBlock(ModBlocks.SNOW_SANDSTONE_SLAB, "snow_sandstone_slab", registry);
        registerBlock(ModBlocks.SNOW_COBBLESTONE_SLAB, "snow_cobblestone_slab", registry);
        registerBlock(ModBlocks.SNOW_BRICK_SLAB, "snow_brick_slab", registry);
        registerBlock(ModBlocks.SNOW_STONE_BRICK_SLAB, "snow_stone_brick_slab", registry);
        registerBlock(ModBlocks.SNOW_NETHER_BRICK_SLAB, "snow_nether_brick_slab", registry);
        registerBlock(ModBlocks.SNOW_QUARTZ_SLAB, "snow_quartz_slab", registry);
        registerBlock(ModBlocks.SNOW_OAK_SLAB, "snow_oak_slab", registry);
        registerBlock(ModBlocks.SNOW_SPRUCE_SLAB, "snow_spruce_slab", registry);
        registerBlock(ModBlocks.SNOW_BIRCH_SLAB, "snow_birch_slab", registry);
        registerBlock(ModBlocks.SNOW_JUNGLE_SLAB, "snow_jungle_slab", registry);
        registerBlock(ModBlocks.SNOW_ACACIA_SLAB, "snow_acacia_slab", registry);
        registerBlock(ModBlocks.SNOW_DARK_OAK_SLAB, "snow_dark_oak_slab", registry);
        registerBlock(ModBlocks.SNOW_RED_SANDSTONE_SLAB, "snow_red_sandstone_slab", registry);
        registerBlock(ModBlocks.SNOW_PURPUR_SLAB, "snow_purpur_slab", registry);
    }

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> itemRegistryEvent) {
        IForgeRegistry<Item>  registry = itemRegistryEvent.getRegistry();

        registerItemBlock(ModBlocks.SNOW_OAK_STAIRS, registry);
        registerItemBlock(ModBlocks.SNOW_COBBLESTONE_STAIRS, registry);
        registerItemBlock(ModBlocks.SNOW_BRICK_STAIRS, registry);
        registerItemBlock(ModBlocks.SNOW_STONE_BRICK_STAIRS, registry);
        registerItemBlock(ModBlocks.SNOW_NETHER_BRICK_STAIRS, registry);
        registerItemBlock(ModBlocks.SNOW_SANDSTONE_STAIRS, registry);
        registerItemBlock(ModBlocks.SNOW_SPRUCE_STAIRS, registry);
        registerItemBlock(ModBlocks.SNOW_BIRCH_STAIRS, registry);
        registerItemBlock(ModBlocks.SNOW_JUNGLE_STAIRS, registry);
        registerItemBlock(ModBlocks.SNOW_QUARTZ_STAIRS, registry);
        registerItemBlock(ModBlocks.SNOW_ACACIA_STAIRS, registry);
        registerItemBlock(ModBlocks.SNOW_DARK_OAK_STAIRS, registry);
        registerItemBlock(ModBlocks.SNOW_RED_SANDSTONE_STAIRS, registry);
        registerItemBlock(ModBlocks.SNOW_PURPUR_STAIRS, registry);

        registerItemBlock(ModBlocks.SNOW_SMOOTH_STONE_SLAB, registry);
        registerItemBlock(ModBlocks.SNOW_SANDSTONE_SLAB, registry);
        registerItemBlock(ModBlocks.SNOW_COBBLESTONE_SLAB, registry);
        registerItemBlock(ModBlocks.SNOW_BRICK_SLAB, registry);
        registerItemBlock(ModBlocks.SNOW_STONE_BRICK_SLAB, registry);
        registerItemBlock(ModBlocks.SNOW_NETHER_BRICK_SLAB, registry);
        registerItemBlock(ModBlocks.SNOW_QUARTZ_SLAB, registry);
        registerItemBlock(ModBlocks.SNOW_OAK_SLAB, registry);
        registerItemBlock(ModBlocks.SNOW_SPRUCE_SLAB, registry);
        registerItemBlock(ModBlocks.SNOW_BIRCH_SLAB, registry);
        registerItemBlock(ModBlocks.SNOW_JUNGLE_SLAB, registry);
        registerItemBlock(ModBlocks.SNOW_ACACIA_SLAB, registry);
        registerItemBlock(ModBlocks.SNOW_DARK_OAK_SLAB, registry);
        registerItemBlock(ModBlocks.SNOW_RED_SANDSTONE_SLAB, registry);
        registerItemBlock(ModBlocks.SNOW_PURPUR_SLAB, registry);
    }

    public static Block registerBlock(Block block, String name, IForgeRegistry<Block> r) {
        block.setRegistryName(new ResourceLocation(SnowVariants.MODID, name));

        block.setUnlocalizedName(SnowVariants.MODID + "." + name);
        r.register(block);

        return block;
    }

    public static ItemBlock registerItemBlock(Block block, IForgeRegistry<Item> r) {
        ItemBlock ib = new ItemBlock(block);
        ib.setRegistryName(block.getRegistryName());

        r.register(ib);

        return ib;
    }
}
