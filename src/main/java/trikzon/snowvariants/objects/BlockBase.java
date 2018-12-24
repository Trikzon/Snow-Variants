package trikzon.snowvariants.objects;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import trikzon.snowvariants.SnowVariants;

/**
 * A class to be used in all my mods to make block making easier
 * @author Trikzon
 */
public class BlockBase extends Block {

	public static final double PIXEL_LENGTH = 1D/16D;

	public BlockBase(String name, SoundType soundType, Material material) {
		super(material);
		this.setUnlocalizedName(SnowVariants.MODID + "." + name);
		this.setRegistryName(name);

		this.setSoundType(soundType);

		this.setLightOpacity( 255 );
		this.setLightLevel( 0 );
		this.setHardness( 2.2F );
		this.setHarvestLevel( "pickaxe", 0 );
	}
}
