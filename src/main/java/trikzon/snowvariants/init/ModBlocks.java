package trikzon.snowvariants.init;

import net.minecraft.block.SoundType;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.registry.GameRegistry;
import trikzon.snowvariants.objects.BlockStairBase;

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
}
