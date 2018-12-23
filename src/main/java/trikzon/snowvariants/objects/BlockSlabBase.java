package trikzon.snowvariants.objects;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyHelper;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import trikzon.snowvariants.SnowVariants;

import java.util.Collection;

public class BlockSlabBase extends BlockSlabBaseBase {

	public BlockSlabBase(String name, SoundType soundType, Material material) {
		super(name, soundType, material);
	}

	@Override
	public boolean isDouble() {
		if(this.getUnlocalizedName().substring(this.getUnlocalizedName().length()-6).equals("double"))
			return true;
		else
			return false;
	}
}

abstract class BlockSlabBaseBase extends BlockSlab {

	public static final DummyBlockProperty DUMMY_VARIANT = DummyBlockProperty.create("dummy");

	public BlockSlabBaseBase(String name, SoundType soundType, Material material) {
		super(material);
		this.setUnlocalizedName(SnowVariants.MODID + "." + name);
		this.setRegistryName(name);

		this.setSoundType(soundType);
		IBlockState state = this.blockState.getBaseState();

		if(!this.isDouble())
			state = state.withProperty(HALF, EnumBlockHalf.BOTTOM);

		this.setLightLevel(0);
		this.setHardness(2.2F);
		this.setHarvestLevel("pickaxe", 0);
		this.setDefaultState(state);
		this.useNeighborBrightness = true;
	}

	@Override
	public String getUnlocalizedName(int meta) {
		return this.getUnlocalizedName();
	}

	@Override
	public IProperty<?> getVariantProperty() {
		return DUMMY_VARIANT;
	}

	@Override
	public Comparable<?> getTypeForItem(ItemStack stack) {
		return false;
	}

	@Override
	public int damageDropped(IBlockState state) {
		return 0;
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		if(!this.isDouble())
			return this.getDefaultState().withProperty(HALF, EnumBlockHalf.values()[meta % EnumBlockHalf.values().length]);
		return this.getDefaultState();
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		if(this.isDouble())
			return 0;
		return (state.getValue(HALF)).ordinal() + 1;
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] {HALF, DUMMY_VARIANT});
	}
}

/**
 * Used purely for the slabs. Every slab requires a variant so this is a great
 * class to use if you have no variant
 *
 * @author CJMinecraft
 *
 */
class DummyBlockProperty extends PropertyHelper<Boolean> {

	/**
	 * Initialise the dummy property
	 *
	 * @param name
	 *            The name of the property
	 */
	protected DummyBlockProperty(String name) {
		super(name, Boolean.class);
	}

	/**
	 * Say that we only allow false as a valid value
	 */
	@Override
	public Collection<Boolean> getAllowedValues() {
		return ImmutableSet.<Boolean>of(Boolean.valueOf(false));
	}

	/**
	 * Parse a value. Will always be false
	 */
	@Override
	public Optional<Boolean> parseValue(String value) {
		return Optional.<Boolean>of(Boolean.valueOf(false));
	}

	/**
	 * The name from the value. Will always be false
	 */
	@Override
	public String getName(Boolean value) {
		return "false";
	}

	/**
	 * Create a new dummy property
	 *
	 * @param name
	 *            The name of the property
	 * @return the new dummy property
	 */
	public static DummyBlockProperty create(String name) {
		return new DummyBlockProperty(name);
	}

}
