package trikzon.snowvariants.init;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import trikzon.snowvariants.SnowVariants;
import trikzon.snowvariants.blocks.VariantSlab;
import trikzon.snowvariants.blocks.VariantStairs;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber()
public class ModBlocks {

    public static final List<VariantStairs> VARIANT_STAIRS_LIST = new ArrayList<>();
    public static final List<VariantSlab> VARIANT_SLABS_LIST = new ArrayList<>();

    public static final VariantStairs SNOW_OAK_STAIRS = new VariantStairs(Blocks.PLANKS, Blocks.OAK_STAIRS, new ItemStack(Blocks.SNOW), SoundType.SNOW, Material.WOOD, 1.5f,1.5f, SoundType.WOOD);
    public static final VariantStairs SNOW_COBBLESTONE_STAIRS = new VariantStairs(Blocks.COBBLESTONE, Blocks.STONE_STAIRS, new ItemStack(Blocks.SNOW), SoundType.SNOW, Material.ROCK, 1.5f, 1.5f, SoundType.STONE);
    public static final VariantStairs SNOW_BRICK_STAIRS = new VariantStairs(Blocks.BRICK_BLOCK, Blocks.BRICK_STAIRS, new ItemStack(Blocks.SNOW), SoundType.SNOW, Material.ROCK, 1.5f, 1.5f, SoundType.STONE);
    public static final VariantStairs SNOW_STONE_BRICK_STAIRS = new VariantStairs(Blocks.STONE_BRICK_STAIRS, Blocks.STONE_BRICK_STAIRS, new ItemStack(Blocks.SNOW), SoundType.SNOW, Material.ROCK, 1.5f, 1.5f, SoundType.STONE);
    public static final VariantStairs SNOW_NETHER_BRICK_STAIRS = new VariantStairs(Blocks.NETHER_BRICK, Blocks.NETHER_BRICK_STAIRS, new ItemStack(Blocks.SNOW), SoundType.SNOW, Material.ROCK, 1.5f, 1.5f, SoundType.STONE);
    public static final VariantStairs SNOW_SANDSTONE_STAIRS = new VariantStairs(Blocks.SANDSTONE, Blocks.SANDSTONE_STAIRS, new ItemStack(Blocks.SNOW), SoundType.SNOW, Material.ROCK, 1.5f, 1.5f, SoundType.STONE);
    public static final VariantStairs SNOW_SPRUCE_STAIRS = new VariantStairs(Blocks.PLANKS, Blocks.SPRUCE_STAIRS, new ItemStack(Blocks.SNOW), SoundType.SNOW, Material.WOOD, 1.5f, 1.5f, SoundType.WOOD);
    public static final VariantStairs SNOW_BIRCH_STAIRS = new VariantStairs(Blocks.PLANKS, Blocks.BIRCH_STAIRS, new ItemStack(Blocks.SNOW), SoundType.SNOW, Material.WOOD, 1.5f, 1.5f, SoundType.WOOD);
    public static final VariantStairs SNOW_JUNGLE_STAIRS = new VariantStairs(Blocks.PLANKS, Blocks.JUNGLE_STAIRS, new ItemStack(Blocks.SNOW), SoundType.SNOW, Material.WOOD, 1.5f, 1.5f, SoundType.WOOD);
    public static final VariantStairs SNOW_QUARTZ_STAIRS = new VariantStairs(Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_STAIRS, new ItemStack(Blocks.SNOW), SoundType.SNOW, Material.ROCK, 1.5f, 1.5f, SoundType.STONE);
    public static final VariantStairs SNOW_ACACIA_STAIRS = new VariantStairs(Blocks.PLANKS, Blocks.ACACIA_STAIRS, new ItemStack(Blocks.SNOW), SoundType.SNOW, Material.WOOD, 1.5f, 1.5f, SoundType.WOOD);
    public static final VariantStairs SNOW_DARK_OAK_STAIRS = new VariantStairs(Blocks.PLANKS, Blocks.DARK_OAK_STAIRS, new ItemStack(Blocks.SNOW), SoundType.SNOW, Material.WOOD, 1.5f, 1.5f, SoundType.WOOD);
    public static final VariantStairs SNOW_RED_SANDSTONE_STAIRS = new VariantStairs(Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE_STAIRS, new ItemStack(Blocks.SNOW), SoundType.SNOW, Material.ROCK, 1.5f, 1.5f, SoundType.STONE);
    public static final VariantStairs SNOW_PURPUR_STAIRS = new VariantStairs(Blocks.PURPUR_BLOCK, Blocks.PURPUR_STAIRS, new ItemStack(Blocks.SNOW), SoundType.SNOW, Material.ROCK, 1.5f, 1.5f, SoundType.STONE);

    public static final VariantSlab SNOW_SMOOTH_STONE_SLAB = new VariantSlab(Blocks.STONE_SLAB, new ItemStack(Blocks.SNOW), SoundType.SNOW, Material.ROCK, 1.5f, 1.5f, SoundType.STONE);
    public static final VariantSlab SNOW_SANDSTONE_SLAB = new VariantSlab(Blocks.STONE_SLAB, new ItemStack(Blocks.SNOW), SoundType.SNOW, Material.ROCK, 1.5f, 1.5f, SoundType.STONE);
    public static final VariantSlab SNOW_COBBLESTONE_SLAB = new VariantSlab(Blocks.STONE_SLAB, new ItemStack(Blocks.SNOW), SoundType.SNOW, Material.ROCK, 1.5f, 1.5f, SoundType.STONE);
    public static final VariantSlab SNOW_BRICK_SLAB = new VariantSlab(Blocks.STONE_SLAB, new ItemStack(Blocks.SNOW), SoundType.SNOW, Material.ROCK, 1.5f, 1.5f, SoundType.STONE);
    public static final VariantSlab SNOW_STONE_BRICK_SLAB = new VariantSlab(Blocks.STONE_SLAB, new ItemStack(Blocks.SNOW), SoundType.SNOW, Material.ROCK, 1.5f, 1.5f, SoundType.STONE);
    public static final VariantSlab SNOW_NETHER_BRICK_SLAB = new VariantSlab(Blocks.STONE_SLAB, new ItemStack(Blocks.SNOW), SoundType.SNOW, Material.ROCK, 1.5f, 1.5f, SoundType.STONE);
    public static final VariantSlab SNOW_QUARTZ_SLAB = new VariantSlab(Blocks.STONE_SLAB, new ItemStack(Blocks.SNOW), SoundType.SNOW, Material.ROCK, 1.5f, 1.5f, SoundType.STONE);
    public static final VariantSlab SNOW_OAK_SLAB = new VariantSlab(Blocks.WOODEN_SLAB, new ItemStack(Blocks.SNOW), SoundType.SNOW, Material.WOOD, 1.5f, 1.5f, SoundType.WOOD);
    public static final VariantSlab SNOW_SPRUCE_SLAB = new VariantSlab(Blocks.WOODEN_SLAB, new ItemStack(Blocks.SNOW), SoundType.SNOW, Material.WOOD, 1.5f, 1.5f, SoundType.WOOD);
    public static final VariantSlab SNOW_BIRCH_SLAB = new VariantSlab(Blocks.WOODEN_SLAB, new ItemStack(Blocks.SNOW), SoundType.SNOW, Material.WOOD, 1.5f, 1.5f, SoundType.WOOD);
    public static final VariantSlab SNOW_JUNGLE_SLAB = new VariantSlab(Blocks.WOODEN_SLAB, new ItemStack(Blocks.SNOW), SoundType.SNOW, Material.WOOD, 1.5f, 1.5f, SoundType.WOOD);
    public static final VariantSlab SNOW_ACACIA_SLAB = new VariantSlab(Blocks.WOODEN_SLAB, new ItemStack(Blocks.SNOW), SoundType.SNOW, Material.WOOD, 1.5f, 1.5f, SoundType.WOOD);
    public static final VariantSlab SNOW_DARK_OAK_SLAB = new VariantSlab(Blocks.WOODEN_SLAB, new ItemStack(Blocks.SNOW), SoundType.SNOW, Material.WOOD, 1.5f, 1.5f, SoundType.WOOD);
    public static final VariantSlab SNOW_RED_SANDSTONE_SLAB = new VariantSlab(Blocks.STONE_SLAB2, new ItemStack(Blocks.SNOW), SoundType.SNOW, Material.ROCK, 1.5f, 1.5f, SoundType.STONE);
    public static final VariantSlab SNOW_PURPUR_SLAB = new VariantSlab(Blocks.PURPUR_SLAB, new ItemStack(Blocks.SNOW), SoundType.SNOW, Material.ROCK, 1.5f, 1.5f, SoundType.STONE);

    @SubscribeEvent
    public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
        IForgeRegistry<Block>  registry = blockRegistryEvent.getRegistry();

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
        registerBlock(SNOW_RED_SANDSTONE_STAIRS, "snow_red_sandstone_stairs", registry);
        registerBlock(SNOW_PURPUR_STAIRS, "snow_purpur_stairs", registry);

        registerBlock(SNOW_SMOOTH_STONE_SLAB, "snow_smooth_stone_slab", registry);
        registerBlock(SNOW_SANDSTONE_SLAB, "snow_sandstone_slab", registry);
        registerBlock(SNOW_COBBLESTONE_SLAB, "snow_cobblestone_slab", registry);
        registerBlock(SNOW_BRICK_SLAB, "snow_brick_slab", registry);
        registerBlock(SNOW_STONE_BRICK_SLAB, "snow_stone_brick_slab", registry);
        registerBlock(SNOW_NETHER_BRICK_SLAB, "snow_nether_brick_slab", registry);
        registerBlock(SNOW_QUARTZ_SLAB, "snow_quartz_slab", registry);
        registerBlock(SNOW_OAK_SLAB, "snow_oak_slab", registry);
        registerBlock(SNOW_SPRUCE_SLAB, "snow_spruce_slab", registry);
        registerBlock(SNOW_BIRCH_SLAB, "snow_birch_slab", registry);
        registerBlock(SNOW_JUNGLE_SLAB, "snow_jungle_slab", registry);
        registerBlock(SNOW_ACACIA_SLAB, "snow_acacia_slab", registry);
        registerBlock(SNOW_DARK_OAK_SLAB, "snow_dark_oak_slab", registry);
        registerBlock(SNOW_RED_SANDSTONE_SLAB, "snow_red_sandstone_slab", registry);
        registerBlock(SNOW_PURPUR_SLAB, "snow_purpur_slab", registry);
    }

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> itemRegistryEvent) {
        IForgeRegistry<Item>  registry = itemRegistryEvent.getRegistry();

        registerItemBlock(SNOW_OAK_STAIRS, registry);
        registerItemBlock(SNOW_COBBLESTONE_STAIRS, registry);
        registerItemBlock(SNOW_BRICK_STAIRS, registry);
        registerItemBlock(SNOW_STONE_BRICK_STAIRS, registry);
        registerItemBlock(SNOW_NETHER_BRICK_STAIRS, registry);
        registerItemBlock(SNOW_SANDSTONE_STAIRS, registry);
        registerItemBlock(SNOW_SPRUCE_STAIRS, registry);
        registerItemBlock(SNOW_BIRCH_STAIRS, registry);
        registerItemBlock(SNOW_JUNGLE_STAIRS, registry);
        registerItemBlock(SNOW_QUARTZ_STAIRS, registry);
        registerItemBlock(SNOW_ACACIA_STAIRS, registry);
        registerItemBlock(SNOW_DARK_OAK_STAIRS, registry);
        registerItemBlock(SNOW_RED_SANDSTONE_STAIRS, registry);
        registerItemBlock(SNOW_PURPUR_STAIRS, registry);

        registerItemBlock(SNOW_SMOOTH_STONE_SLAB, registry);
        registerItemBlock(SNOW_SANDSTONE_SLAB, registry);
        registerItemBlock(SNOW_COBBLESTONE_SLAB, registry);
        registerItemBlock(SNOW_BRICK_SLAB, registry);
        registerItemBlock(SNOW_STONE_BRICK_SLAB, registry);
        registerItemBlock(SNOW_NETHER_BRICK_SLAB, registry);
        registerItemBlock(SNOW_QUARTZ_SLAB, registry);
        registerItemBlock(SNOW_OAK_SLAB, registry);
        registerItemBlock(SNOW_SPRUCE_SLAB, registry);
        registerItemBlock(SNOW_BIRCH_SLAB, registry);
        registerItemBlock(SNOW_JUNGLE_SLAB, registry);
        registerItemBlock(SNOW_ACACIA_SLAB, registry);
        registerItemBlock(SNOW_DARK_OAK_SLAB, registry);
        registerItemBlock(SNOW_RED_SANDSTONE_SLAB, registry);
        registerItemBlock(SNOW_PURPUR_SLAB, registry);
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
