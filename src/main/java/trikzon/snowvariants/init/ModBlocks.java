package trikzon.snowvariants.init;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.registry.GameRegistry;
import trikzon.snowvariants.objects.BlockStairBase;
import trikzon.snowvariants.objects.blocks.BlockSnowySlab;

public class ModBlocks {

	@GameRegistry.ObjectHolder("snowvariants:stairs_oak_snow")
	public static BlockStairBase stairsOakSnow = new BlockStairBase(Blocks.PLANKS, "stairs_oak_snow", SoundType.WOOD);

	@GameRegistry.ObjectHolder("snowvariants:stairs_cobblestone_snow")
	public static BlockStairBase stairsCobblestoneSnow = new BlockStairBase(Blocks.COBBLESTONE, "stairs_cobblestone_snow", SoundType.STONE);

	@GameRegistry.ObjectHolder("snowvariants:stairs_brick_snow")
	public static BlockStairBase stairsBrickSnow = new BlockStairBase(Blocks.BRICK_BLOCK, "stairs_brick_snow", SoundType.STONE);

	@GameRegistry.ObjectHolder("snowvariants:stairs_stone_brick_snow")
	public static BlockStairBase stairsStoneBrickSnow = new BlockStairBase(Blocks.STONEBRICK, "stairs_stone_brick_snow", SoundType.STONE);

	@GameRegistry.ObjectHolder("snowvariants:stairs_nether_brick_snow")
	public static BlockStairBase stairsNetherBrickSnow = new BlockStairBase(Blocks.NETHER_BRICK, "stairs_nether_brick_snow", SoundType.STONE);

	@GameRegistry.ObjectHolder("snowvariants:stairs_sandstone_snow")
	public static BlockStairBase stairsSandstoneSnow = new BlockStairBase(Blocks.SANDSTONE, "stairs_sandstone_snow", SoundType.STONE);

	@GameRegistry.ObjectHolder("snowvariants:stairs_spruce_snow")
	public static BlockStairBase stairsSpruceSnow = new BlockStairBase(Blocks.PLANKS, "stairs_spruce_snow", SoundType.WOOD);

	@GameRegistry.ObjectHolder("snowvariants:stairs_birch_snow")
	public static BlockStairBase stairsBirchSnow = new BlockStairBase(Blocks.PLANKS, "stairs_birch_snow", SoundType.WOOD);

	@GameRegistry.ObjectHolder("snowvariants:stairs_jungle_snow")
	public static BlockStairBase stairsJungleSnow = new BlockStairBase(Blocks.PLANKS, "stairs_jungle_snow", SoundType.WOOD);

	@GameRegistry.ObjectHolder("snowvariants:stairs_quartz_snow")
	public static BlockStairBase stairsQuartzSnow = new BlockStairBase(Blocks.QUARTZ_BLOCK, "stairs_quartz_snow", SoundType.STONE);

	@GameRegistry.ObjectHolder("snowvariants:stairs_acacia_snow")
	public static BlockStairBase stairsAcaciaSnow = new BlockStairBase(Blocks.PLANKS, "stairs_acacia_snow", SoundType.WOOD);

	@GameRegistry.ObjectHolder("snowvariants:stairs_dark_oak_snow")
	public static BlockStairBase stairsDarkOakSnow = new BlockStairBase(Blocks.PLANKS, "stairs_dark_oak_snow", SoundType.WOOD);

	@GameRegistry.ObjectHolder("snowvariants:stairs_red_sandstone_snow")
	public static BlockStairBase stairsRedSandstoneSnow = new BlockStairBase(Blocks.RED_SANDSTONE, "stairs_red_sandstone_snow", SoundType.STONE);

	@GameRegistry.ObjectHolder("snowvariants:stairs_purpur_snow")
	public static BlockStairBase stairsPurpurSnow = new BlockStairBase(Blocks.PURPUR_BLOCK, "stairs_purpur_snow", SoundType.STONE);

	@GameRegistry.ObjectHolder("snowvariants:slab_stone_snow")
	public static BlockSnowySlab slabStoneSnow = new BlockSnowySlab("slab_stone_snow", Blocks.STONE);

	@GameRegistry.ObjectHolder("snowvariants:slab_sandstone_snow")
	public static BlockSnowySlab slabSandstoneSnow = new BlockSnowySlab("slab_sandstone_snow", Blocks.SANDSTONE);

	@GameRegistry.ObjectHolder("snowvariants:slab_cobblestone_snow")
	public static BlockSnowySlab slabCobblestoneSnow = new BlockSnowySlab("slab_cobblestone_snow", Blocks.COBBLESTONE);

	@GameRegistry.ObjectHolder("snowvariants:slab_brick_snow")
	public static BlockSnowySlab slabBrickSnow = new BlockSnowySlab("slab_brick_snow", Blocks.BRICK_BLOCK);

	@GameRegistry.ObjectHolder("snowvariants:slab_stone_brick_snow")
	public static BlockSnowySlab slabStoneBrickSnow = new BlockSnowySlab("slab_stone_brick_snow", Blocks.STONEBRICK);

	@GameRegistry.ObjectHolder("snowvariants:slab_nether_brick_snow")
	public static BlockSnowySlab slabNetherBrickSnow = new BlockSnowySlab("slab_nether_brick_snow", Blocks.NETHER_BRICK);

	@GameRegistry.ObjectHolder("snowvariants:slab_quartz_snow")
	public static BlockSnowySlab slabQuartzSnow = new BlockSnowySlab("slab_quartz_snow", Blocks.QUARTZ_BLOCK);

	@GameRegistry.ObjectHolder("snowvariants:slab_oak_snow")
	public static BlockSnowySlab slabOakSnow = new BlockSnowySlab("slab_oak_snow", Blocks.PLANKS);

	@GameRegistry.ObjectHolder("snowvariants:slab_spruce_snow")
	public static BlockSnowySlab slabSpruceSnow = new BlockSnowySlab("slab_spruce_snow", Blocks.PLANKS);

	@GameRegistry.ObjectHolder("snowvariants:slab_birch_snow")
	public static BlockSnowySlab slabBirchSnow = new BlockSnowySlab("slab_birch_snow", Blocks.PLANKS);

	@GameRegistry.ObjectHolder("snowvariants:slab_jungle_snow")
	public static BlockSnowySlab slabJungleSnow = new BlockSnowySlab("slab_jungle_snow", Blocks.PLANKS);

	@GameRegistry.ObjectHolder("snowvariants:slab_acacia_snow")
	public static BlockSnowySlab slabAcaciaSnow = new BlockSnowySlab("slab_acacia_snow", Blocks.PLANKS);

	@GameRegistry.ObjectHolder("snowvariants:slab_dark_oak_snow")
	public static BlockSnowySlab slabDarkOakSnow = new BlockSnowySlab("slab_dark_oak_snow", Blocks.PLANKS);

	@GameRegistry.ObjectHolder("snowvariants:slab_red_sandstone_snow")
	public static BlockSnowySlab slabRedSandstoneSnow = new BlockSnowySlab("slab_red_sandstone_snow", Blocks.RED_SANDSTONE);

	@GameRegistry.ObjectHolder("snowvariants:slab_purpur_snow")
	public static BlockSnowySlab slabPurpurSnow = new BlockSnowySlab("slab_purpur_snow", Blocks.PURPUR_BLOCK);

	//Gingerbread Support:
	@GameRegistry.ObjectHolder("snowvariants:stairs_gingerbread_snow")
	public static BlockStairBase stairsGingerbreadSnow = new BlockStairBase(Blocks.PLANKS, "stairs_gingerbread_snow", SoundType.WOOD);

	@GameRegistry.ObjectHolder("snowvariants:slab_gingerbread_snow")
	public static BlockSnowySlab slabGingerbreadSnow = new BlockSnowySlab("slab_gingerbread_snow", Blocks.PLANKS);
}
