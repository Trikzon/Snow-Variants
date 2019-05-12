package trikzon.snowvariants.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import trikzon.snowvariants.blocks.VariantSlab;
import trikzon.snowvariants.blocks.VariantStairs;
import trikzon.snowvariants.init.ModBlocks;

/**
 * @author Trikzon
 */
@Mod.EventBusSubscriber
public class ClientProxy extends CommonProxy {

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void registerModels(ModelRegistryEvent event) {
        for(VariantStairs stair : ModBlocks.VARIANT_STAIRS_LIST) {
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(stair), 0, new ModelResourceLocation(stair.getRegistryName(), "inventory"));
        }
        for(VariantSlab slab : ModBlocks.VARIANT_SLABS_LIST) {
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(slab), 0, new ModelResourceLocation(slab.getRegistryName(), "inventory"));
        }
    }
}
