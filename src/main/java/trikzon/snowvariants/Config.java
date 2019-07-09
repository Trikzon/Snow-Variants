package trikzon.snowvariants;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

import java.nio.file.Path;

@Mod.EventBusSubscriber
public class Config {

    public static final String CATEGORY_GENERAL = "general";
    public static final String CATEGORY_MOD = "mod";

    private static final ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();

    public static ForgeConfigSpec COMMON_CONFIG;

    public static ForgeConfigSpec.BooleanValue GENERAL_REGISTER_ITEMS;
    public static ForgeConfigSpec.BooleanValue GENERAL_REGISTER_STAIRS;
    public static ForgeConfigSpec.BooleanValue GENERAL_REGISTER_SLABS;

    public static final String SUBCATEGORY_MOD_MINECRAFT = "minecraft";
    public static ForgeConfigSpec.BooleanValue MOD_MINECRAFT_STAIRS;
    public static ForgeConfigSpec.BooleanValue MOD_MINECRAFT_SLABS;

    static {

        COMMON_BUILDER.comment("General Settings").push(CATEGORY_GENERAL);
        setupGeneralConfig();
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Mod Specific Settings. False Overrides General Values").push(CATEGORY_MOD);
        setupModConfig();
        COMMON_BUILDER.pop();

        COMMON_CONFIG = COMMON_BUILDER.build();
    }

    private static void setupGeneralConfig() {
        GENERAL_REGISTER_ITEMS = COMMON_BUILDER.comment("Register ItemBlocks Of Snow Variants. False Overrides Mod Specific Values")
                .define("registerItems", true);
        GENERAL_REGISTER_STAIRS = COMMON_BUILDER.comment("Register Snow Stair Variants. False Overrides Mod Specific Values")
                .define("registerStairs", true);
        GENERAL_REGISTER_SLABS = COMMON_BUILDER.comment("Register Snow Slab Variants. False Overrides Mod Specific Values")
                .define("registerSlabs", true);
    }

    private static void setupModConfig() {
        COMMON_BUILDER.comment("Minecraft Settings").push(SUBCATEGORY_MOD_MINECRAFT);
        MOD_MINECRAFT_STAIRS = COMMON_BUILDER.comment("Register All Snow Minecraft Stair Variants")
                .define("registerMinecraftStairs", true);
        MOD_MINECRAFT_SLABS = COMMON_BUILDER.comment("Register All Snow Minecraft Slab Variants")
                .define("registerMinecraftSlabs", true);

    }

    public static void loadConfig(ForgeConfigSpec spec, Path path) {

        final CommentedFileConfig configData = CommentedFileConfig.builder(path)
                .sync()
                .autosave()
                .writingMode(WritingMode.REPLACE)
                .build();

        configData.load();
        spec.setConfig(configData);
    }

    @SubscribeEvent
    public static void onLoad(final ModConfig.Loading event) {

    }

    @SubscribeEvent
    public static void onReload(final ModConfig.ConfigReloading event) {

    }
}
