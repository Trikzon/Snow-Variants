package trikzon.snowvariants;

import net.minecraftforge.common.config.Config;

@Config(modid = SnowVariants.MODID, category = "")
public class ModConfig {
    @Config.Name("General Category")
    public static GeneralCategory generalCat = new GeneralCategory();
    public static class GeneralCategory {

        @Config.RequiresMcRestart
        @Config.Comment({"Register ItemBlocks Of Snow Variants.", "False Overrides Mod Specific Values."})
        public boolean registerItems = true;
        @Config.RequiresMcRestart
        @Config.Comment({"Register Snow Stair Variants.", "False Overrides Mod Specific Values."})
        public boolean registerStairs = true;
        @Config.RequiresMcRestart
        @Config.Comment({"Register Snow Slab Variants.", "False Overrides Mod Specific Values."})
        public boolean registerSlabs = true;

    }

    @Config.Name("Mod Specific Category")
    public static ModCategory modCat = new ModCategory();
    public static class ModCategory {

        @Config.Name("Minecraft Sub Category")
        public MinecraftSubCategory minecraftSub = new MinecraftSubCategory();
        public static class MinecraftSubCategory {

            @Config.RequiresMcRestart
            @Config.Comment("Register All Snow Minecraft Slab Variants.")
            public boolean registerMinecraftStairs = true;
            @Config.RequiresMcRestart
            @Config.Comment("Register All Snow Minecraft Stair Variants.")
            public boolean registerMinecraftSlabs = true;

        }
    }
}
