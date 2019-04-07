package trikzon.snowvariants.init;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import trikzon.snowvariants.SnowVariants;
import trikzon.snowvariants.blocks.VariantStairs;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks {

    public static final List<VariantStairs> VARIANT_STAIRS_LIST = new ArrayList<>();

    public static final VariantStairs SNOW_PURPUR_STAIRS = new VariantStairs(Blocks.PURPUR_BLOCK, Blocks.PURPUR_STAIRS, createBlockProperties(Material.ROCK, 1.5f, 1.5f, SoundType.STONE));
    public static final VariantStairs SNOW_OAK_STAIRS = new VariantStairs(Blocks.OAK_PLANKS, Blocks.OAK_STAIRS, createBlockProperties(Material.WOOD, 1.5f,1.5f, SoundType.WOOD));
    public static final VariantStairs SNOW_COBBLESTONE_STAIRS = new VariantStairs(Blocks.COBBLESTONE, Blocks.COBBLESTONE_STAIRS, createBlockProperties(Material.ROCK, 1.5f, 1.5f, SoundType.STONE));
    public static final VariantStairs SNOW_BRICK_STAIRS = new VariantStairs(Blocks.BRICKS, Blocks.BRICK_STAIRS, createBlockProperties(Material.ROCK, 1.5f, 1.5f, SoundType.STONE));
    public static final VariantStairs SNOW_STONE_BRICK_STAIRS = new VariantStairs(Blocks.STONE_BRICK_STAIRS, Blocks.STONE_BRICK_STAIRS, createBlockProperties(Material.ROCK, 1.5f, 1.5f, SoundType.STONE));
    public static final VariantStairs SNOW_NETHER_BRICK_STAIRS = new VariantStairs(Blocks.NETHER_BRICKS, Blocks.NETHER_BRICK_STAIRS, createBlockProperties(Material.ROCK, 1.5f, 1.5f, SoundType.STONE));
    public static final VariantStairs SNOW_SANDSTONE_STAIRS = new VariantStairs(Blocks.SANDSTONE, Blocks.SANDSTONE_STAIRS, createBlockProperties(Material.ROCK, 1.5f, 1.5f, SoundType.STONE));
    public static final VariantStairs SNOW_SPRUCE_STAIRS = new VariantStairs(Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_STAIRS, createBlockProperties(Material.WOOD, 1.5f, 1.5f, SoundType.WOOD));
    public static final VariantStairs SNOW_BIRCH_STAIRS = new VariantStairs(Blocks.BIRCH_PLANKS, Blocks.BIRCH_STAIRS, createBlockProperties(Material.WOOD, 1.5f, 1.5f, SoundType.WOOD));
    public static final VariantStairs SNOW_JUNGLE_STAIRS = new VariantStairs(Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_STAIRS, createBlockProperties(Material.WOOD, 1.5f, 1.5f, SoundType.WOOD));
    public static final VariantStairs SNOW_QUARTZ_STAIRS = new VariantStairs(Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_STAIRS, createBlockProperties(Material.ROCK, 1.5f, 1.5f, SoundType.STONE));
    public static final VariantStairs SNOW_ACACIA_STAIRS = new VariantStairs(Blocks.ACACIA_PLANKS, Blocks.ACACIA_STAIRS, createBlockProperties(Material.WOOD, 1.5f, 1.5f, SoundType.WOOD));
    public static final VariantStairs SNOW_DARK_OAK_STAIRS = new VariantStairs(Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_STAIRS, createBlockProperties(Material.WOOD, 1.5f, 1.5f, SoundType.WOOD));
    public static final VariantStairs SNOW_PRISMARINE_STAIRS = new VariantStairs(Blocks.PRISMARINE, Blocks.PRISMARINE_STAIRS, createBlockProperties(Material.ROCK, 1.5f, 1.5f, SoundType.STONE));
    public static final VariantStairs SNOW_PRISMARINE_BRICK_STAIRS = new VariantStairs(Blocks.PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICK_STAIRS, createBlockProperties(Material.ROCK, 1.5f, 1.5f, SoundType.STONE));
    public static final VariantStairs SNOW_DARK_PRISMARINE_STAIRS = new VariantStairs(Blocks.DARK_PRISMARINE, Blocks.DARK_PRISMARINE_STAIRS, createBlockProperties(Material.ROCK, 1.5f, 1.5f, SoundType.STONE));
    public static final VariantStairs SNOW_RED_SANDSTONE_STAIRS = new VariantStairs(Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE_STAIRS, createBlockProperties(Material.ROCK, 1.5f, 1.5f, SoundType.STONE));

    @SubscribeEvent
    public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
        IForgeRegistry<Block>  registry = blockRegistryEvent.getRegistry();

        registerBlock(SNOW_PURPUR_STAIRS, "snow_purpur_stairs", registry);
        registerBlock(SNOW_OAK_STAIRS, "snow_oak_stairs", registry);
        registerBlock(SNOW_COBBLESTONE_STAIRS, "snow_cobblestone_stairs", registry);
        registerBlock(SNOW_BRICK_STAIRS, "snow_brick_stairs", registry);
        registerBlock(SNOW_STONE_BRICK_STAIRS, "snow_stone_brick_stairs", registry);
        registerBlock(SNOW_NETHER_BRICK_STAIRS, "snow_nether_brick_stairs", registry);
        registerBlock(SNOW_SANDSTONE_STAIRS, "snow_sandstone_stairs", registry);
        registerBlock(SNOW_SPRUCE_STAIRS, "snow_spruce_stairs", registry);
        registerBlock(SNOW_BIRCH_STAIRS, "snow_birch_stairs", registry);
        registerBlock(SNOW_JUNGLE_STAIRS, "snow_jungle_stairs", registry);
        registerBlock(SNOW_QUARTZ_STAIRS, "snow_quartz_stairs", registry);
        registerBlock(SNOW_ACACIA_STAIRS, "snow_acacia_stairs", registry);
        registerBlock(SNOW_DARK_OAK_STAIRS, "snow_dark_oak_stairs", registry);
        registerBlock(SNOW_PRISMARINE_STAIRS, "snow_prismarine_stairs", registry);
        registerBlock(SNOW_PRISMARINE_BRICK_STAIRS, "snow_prismarine_brick_stairs", registry);
        registerBlock(SNOW_DARK_PRISMARINE_STAIRS, "snow_dark_prismarine_stairs", registry);
        registerBlock(SNOW_RED_SANDSTONE_STAIRS, "snow_red_sandstone_stairs", registry);
    }

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> itemRegistryEvent) {
        IForgeRegistry<Item>  registry = itemRegistryEvent.getRegistry();

        registerItemBlock(SNOW_PURPUR_STAIRS, createItemProperties(), registry);
        registerItemBlock(SNOW_OAK_STAIRS, createItemProperties(), registry);
        registerItemBlock(SNOW_COBBLESTONE_STAIRS, createItemProperties(), registry);
        registerItemBlock(SNOW_BRICK_STAIRS, createItemProperties(), registry);
        registerItemBlock(SNOW_STONE_BRICK_STAIRS, createItemProperties(), registry);
        registerItemBlock(SNOW_NETHER_BRICK_STAIRS, createItemProperties(), registry);
        registerItemBlock(SNOW_SANDSTONE_STAIRS, createItemProperties(), registry);
        registerItemBlock(SNOW_SPRUCE_STAIRS, createItemProperties(), registry);
        registerItemBlock(SNOW_BIRCH_STAIRS, createItemProperties(), registry);
        registerItemBlock(SNOW_JUNGLE_STAIRS, createItemProperties(), registry);
        registerItemBlock(SNOW_QUARTZ_STAIRS, createItemProperties(), registry);
        registerItemBlock(SNOW_ACACIA_STAIRS, createItemProperties(), registry);
        registerItemBlock(SNOW_DARK_OAK_STAIRS, createItemProperties(), registry);
        registerItemBlock(SNOW_PRISMARINE_STAIRS, createItemProperties(), registry);
        registerItemBlock(SNOW_PRISMARINE_BRICK_STAIRS, createItemProperties(), registry);
        registerItemBlock(SNOW_DARK_PRISMARINE_STAIRS, createItemProperties(), registry);
        registerItemBlock(SNOW_RED_SANDSTONE_STAIRS, createItemProperties(), registry);
    }

    public static Block registerBlock(Block block, String name, IForgeRegistry<Block> r) {
        block.setRegistryName(new ResourceLocation(SnowVariants.MODID, name));

        r.register(block);

        return block;
    }

    public static ItemBlock registerItemBlock(Block block, Item.Properties properties, IForgeRegistry<Item> r) {
        ItemBlock ib = new ItemBlock(block, properties);
        ib.setRegistryName(block.getRegistryName());

        r.register(ib);

        return ib;
    }

    public static Block.Properties createBlockProperties(Material material, float hardness, float resistance, SoundType soundType) {
        return Block.Properties.create(material).hardnessAndResistance(hardness, resistance).sound(soundType);
    }

    public static Item.Properties createItemProperties() {
        return new Item.Properties().group(SnowVariants.itemGroup);
    }
}
