package trikzon.snowvariants.init;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import trikzon.snowvariants.blocks.VariantSlab;
import trikzon.snowvariants.blocks.VariantStairs;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber()
public class ModBlocks {

    public static final List<VariantStairs> VARIANT_STAIRS_LIST = new ArrayList<>();
    public static final List<VariantSlab> VARIANT_SLABS_LIST = new ArrayList<>();

    public static final VariantStairs SNOW_OAK_STAIRS = new VariantStairs(Blocks.PLANKS, Blocks.OAK_STAIRS, new ItemStack(Blocks.SNOW_LAYER), SoundType.SNOW, Material.WOOD, 1.5f,1.5f, SoundType.WOOD);
    public static final VariantStairs SNOW_COBBLESTONE_STAIRS = new VariantStairs(Blocks.COBBLESTONE, Blocks.STONE_STAIRS, new ItemStack(Blocks.SNOW_LAYER), SoundType.SNOW, Material.ROCK, 1.5f, 1.5f, SoundType.STONE);
    public static final VariantStairs SNOW_BRICK_STAIRS = new VariantStairs(Blocks.BRICK_BLOCK, Blocks.BRICK_STAIRS, new ItemStack(Blocks.SNOW_LAYER), SoundType.SNOW, Material.ROCK, 1.5f, 1.5f, SoundType.STONE);
    public static final VariantStairs SNOW_STONE_BRICK_STAIRS = new VariantStairs(Blocks.STONEBRICK, Blocks.STONE_BRICK_STAIRS, new ItemStack(Blocks.SNOW_LAYER), SoundType.SNOW, Material.ROCK, 1.5f, 1.5f, SoundType.STONE);
    public static final VariantStairs SNOW_NETHER_BRICK_STAIRS = new VariantStairs(Blocks.NETHER_BRICK, Blocks.NETHER_BRICK_STAIRS, new ItemStack(Blocks.SNOW_LAYER), SoundType.SNOW, Material.ROCK, 1.5f, 1.5f, SoundType.STONE);
    public static final VariantStairs SNOW_SANDSTONE_STAIRS = new VariantStairs(Blocks.SANDSTONE, Blocks.SANDSTONE_STAIRS, new ItemStack(Blocks.SNOW_LAYER), SoundType.SNOW, Material.ROCK, 1.5f, 1.5f, SoundType.STONE);
    public static final VariantStairs SNOW_SPRUCE_STAIRS = new VariantStairs(Blocks.PLANKS, Blocks.SPRUCE_STAIRS, new ItemStack(Blocks.SNOW_LAYER), SoundType.SNOW, Material.WOOD, 1.5f, 1.5f, SoundType.WOOD);
    public static final VariantStairs SNOW_BIRCH_STAIRS = new VariantStairs(Blocks.PLANKS, Blocks.BIRCH_STAIRS, new ItemStack(Blocks.SNOW_LAYER), SoundType.SNOW, Material.WOOD, 1.5f, 1.5f, SoundType.WOOD);
    public static final VariantStairs SNOW_JUNGLE_STAIRS = new VariantStairs(Blocks.PLANKS, Blocks.JUNGLE_STAIRS, new ItemStack(Blocks.SNOW_LAYER), SoundType.SNOW, Material.WOOD, 1.5f, 1.5f, SoundType.WOOD);
    public static final VariantStairs SNOW_QUARTZ_STAIRS = new VariantStairs(Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_STAIRS, new ItemStack(Blocks.SNOW_LAYER), SoundType.SNOW, Material.ROCK, 1.5f, 1.5f, SoundType.STONE);
    public static final VariantStairs SNOW_ACACIA_STAIRS = new VariantStairs(Blocks.PLANKS, Blocks.ACACIA_STAIRS, new ItemStack(Blocks.SNOW_LAYER), SoundType.SNOW, Material.WOOD, 1.5f, 1.5f, SoundType.WOOD);
    public static final VariantStairs SNOW_DARK_OAK_STAIRS = new VariantStairs(Blocks.PLANKS, Blocks.DARK_OAK_STAIRS, new ItemStack(Blocks.SNOW_LAYER), SoundType.SNOW, Material.WOOD, 1.5f, 1.5f, SoundType.WOOD);
    public static final VariantStairs SNOW_RED_SANDSTONE_STAIRS = new VariantStairs(Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE_STAIRS, new ItemStack(Blocks.SNOW_LAYER), SoundType.SNOW, Material.ROCK, 1.5f, 1.5f, SoundType.STONE);
    public static final VariantStairs SNOW_PURPUR_STAIRS = new VariantStairs(Blocks.PURPUR_BLOCK, Blocks.PURPUR_STAIRS, new ItemStack(Blocks.SNOW_LAYER), SoundType.SNOW, Material.ROCK, 1.5f, 1.5f, SoundType.STONE);

    public static final VariantSlab SNOW_SMOOTH_STONE_SLAB = new VariantSlab(Blocks.STONE_SLAB, 0, new ItemStack(Blocks.SNOW_LAYER), SoundType.SNOW, Material.ROCK, 1.5f, 1.5f, SoundType.STONE);
    public static final VariantSlab SNOW_SANDSTONE_SLAB = new VariantSlab(Blocks.STONE_SLAB, 1, new ItemStack(Blocks.SNOW_LAYER), SoundType.SNOW, Material.ROCK, 1.5f, 1.5f, SoundType.STONE);
    public static final VariantSlab SNOW_COBBLESTONE_SLAB = new VariantSlab(Blocks.STONE_SLAB, 3, new ItemStack(Blocks.SNOW_LAYER), SoundType.SNOW, Material.ROCK, 1.5f, 1.5f, SoundType.STONE);
    public static final VariantSlab SNOW_BRICK_SLAB = new VariantSlab(Blocks.STONE_SLAB, 4, new ItemStack(Blocks.SNOW_LAYER), SoundType.SNOW, Material.ROCK, 1.5f, 1.5f, SoundType.STONE);
    public static final VariantSlab SNOW_STONE_BRICK_SLAB = new VariantSlab(Blocks.STONE_SLAB, 5, new ItemStack(Blocks.SNOW_LAYER), SoundType.SNOW, Material.ROCK, 1.5f, 1.5f, SoundType.STONE);
    public static final VariantSlab SNOW_NETHER_BRICK_SLAB = new VariantSlab(Blocks.STONE_SLAB, 6, new ItemStack(Blocks.SNOW_LAYER), SoundType.SNOW, Material.ROCK, 1.5f, 1.5f, SoundType.STONE);
    public static final VariantSlab SNOW_QUARTZ_SLAB = new VariantSlab(Blocks.STONE_SLAB, 7, new ItemStack(Blocks.SNOW_LAYER), SoundType.SNOW, Material.ROCK, 1.5f, 1.5f, SoundType.STONE);
    public static final VariantSlab SNOW_OAK_SLAB = new VariantSlab(Blocks.WOODEN_SLAB, 0, new ItemStack(Blocks.SNOW_LAYER), SoundType.SNOW, Material.WOOD, 1.5f, 1.5f, SoundType.WOOD);
    public static final VariantSlab SNOW_SPRUCE_SLAB = new VariantSlab(Blocks.WOODEN_SLAB, 1, new ItemStack(Blocks.SNOW_LAYER), SoundType.SNOW, Material.WOOD, 1.5f, 1.5f, SoundType.WOOD);
    public static final VariantSlab SNOW_BIRCH_SLAB = new VariantSlab(Blocks.WOODEN_SLAB, 2, new ItemStack(Blocks.SNOW_LAYER), SoundType.SNOW, Material.WOOD, 1.5f, 1.5f, SoundType.WOOD);
    public static final VariantSlab SNOW_JUNGLE_SLAB = new VariantSlab(Blocks.WOODEN_SLAB, 3, new ItemStack(Blocks.SNOW_LAYER), SoundType.SNOW, Material.WOOD, 1.5f, 1.5f, SoundType.WOOD);
    public static final VariantSlab SNOW_ACACIA_SLAB = new VariantSlab(Blocks.WOODEN_SLAB, 4, new ItemStack(Blocks.SNOW_LAYER), SoundType.SNOW, Material.WOOD, 1.5f, 1.5f, SoundType.WOOD);
    public static final VariantSlab SNOW_DARK_OAK_SLAB = new VariantSlab(Blocks.WOODEN_SLAB, 5, new ItemStack(Blocks.SNOW_LAYER), SoundType.SNOW, Material.WOOD, 1.5f, 1.5f, SoundType.WOOD);
    public static final VariantSlab SNOW_RED_SANDSTONE_SLAB = new VariantSlab(Blocks.STONE_SLAB2, 0, new ItemStack(Blocks.SNOW_LAYER), SoundType.SNOW, Material.ROCK, 1.5f, 1.5f, SoundType.STONE);
    public static final VariantSlab SNOW_PURPUR_SLAB = new VariantSlab(Blocks.PURPUR_SLAB, 0, new ItemStack(Blocks.SNOW_LAYER), SoundType.SNOW, Material.ROCK, 1.5f, 1.5f, SoundType.STONE);
}
