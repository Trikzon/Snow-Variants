package trikzon.snowvariants.objects;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import trikzon.snowvariants.SnowVariants;

import javax.annotation.Nullable;
import java.util.List;

/**
 * A class to be used in all my mods to make block making easier
 * @author Trikzon
 */
public class BlockBase extends Block {

	public static final double PIXEL_LENGTH = 1D/16D;

	public BlockBase(String name, Material material) {
		super(material);
		this.setUnlocalizedName(SnowVariants.MODID + "." + name);
		this.setRegistryName(name);

		this.setLightOpacity( 255 );
		this.setLightLevel( 0 );
		this.setHardness( 2.2F );
	}
}
