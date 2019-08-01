package json;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Generator {

    public static ArrayList<SnowStairTemplate> STAIRS = new ArrayList<>();
    public static ArrayList<SnowSlabTemplate> SLABS = new ArrayList<>();

    public static void main(String[] args) {

        new SnowStairTemplate("minecraft", "snow_oak_stairs", "planks_oak", "oak_stairs", 1);
        new SnowStairTemplate("minecraft", "snow_cobblestone_stairs", "cobblestone", "stone_stairs", 1);
        new SnowStairTemplate("minecraft", "snow_brick_stairs", "brick", "brick_stairs", 1);
        new SnowStairTemplate("minecraft", "snow_stone_brick_stairs", "stonebrick", "stone_brick_stairs", 1);
        new SnowStairTemplate("minecraft", "snow_nether_brick_stairs", "nether_brick", "nether_brick_stairs", 1);
        new SnowStairTemplate("minecraft", "snow_sandstone_stairs", "sandstone_normal", "sandstone_bottom", "sandstone_stairs");
        new SnowStairTemplate("minecraft", "snow_spruce_stairs", "planks_spruce", "spruce_stairs", 1);
        new SnowStairTemplate("minecraft", "snow_birch_stairs", "planks_birch", "birch_stairs", 1);
        new SnowStairTemplate("minecraft", "snow_jungle_stairs", "planks_jungle", "jungle_stairs", 1);
        new SnowStairTemplate("minecraft", "snow_quartz_stairs", "quartz_block_side", "quartz_block_top", "quartz_stairs");
        new SnowStairTemplate("minecraft", "snow_acacia_stairs", "planks_acacia", "acacia_stairs", 1);
        new SnowStairTemplate("minecraft", "snow_dark_oak_stairs", "planks_big_oak", "dark_oak_stairs", 1);
        new SnowStairTemplate("minecraft", "snow_red_sandstone_stairs", "red_sandstone_normal", "red_sandstone_bottom", "red_sandstone_stairs");
        new SnowStairTemplate("minecraft", "snow_purpur_stairs", "purpur_block", "purpur_stairs", 1);

        new SnowSlabTemplate("minecraft", "snow_smooth_stone_slab", "stone_slab_side", "stone_slab_top", 0, "stone_slab");
        new SnowSlabTemplate("minecraft", "snow_sandstone_slab", "sandstone_normal", "sandstone_bottom", 1, "stone_slab");
        new SnowSlabTemplate("minecraft", "snow_cobblestone_slab", "cobblestone", 3, "stone_slab", 1);
        new SnowSlabTemplate("minecraft", "snow_brick_slab", "brick", 4, "stone_slab", 1);
        new SnowSlabTemplate("minecraft", "snow_stone_brick_slab", "stonebrick", 5, "stone_slab", 1);
        new SnowSlabTemplate("minecraft", "snow_nether_brick_slab", "nether_brick", 6, "stone_slab", 1);
        new SnowSlabTemplate("minecraft", "snow_quartz_slab", "quartz_block_side", "quartz_block_top", 7, "stone_slab");
        new SnowSlabTemplate("minecraft", "snow_oak_slab", "planks_oak", 0, "wooden_slab", 1);
        new SnowSlabTemplate("minecraft", "snow_spruce_slab", "planks_spruce", 1, "wooden_slab", 1);
        new SnowSlabTemplate("minecraft", "snow_birch_slab", "planks_birch", 2, "wooden_slab", 1);
        new SnowSlabTemplate("minecraft", "snow_jungle_slab", "planks_jungle", 3, "wooden_slab", 1);
        new SnowSlabTemplate("minecraft", "snow_acacia_slab", "planks_acacia", 4, "wooden_slab", 1);
        new SnowSlabTemplate("minecraft", "snow_dark_oak_slab", "planks_big_oak", 5, "wooden_slab", 1);
        new SnowSlabTemplate("minecraft", "snow_red_sandstone_slab", "red_sandstone_normal", "red_sandstone_bottom", 0, "stone_slab2");
        new SnowSlabTemplate("minecraft", "snow_purpur_slab", "purpur_block", 0, "purpur_slab", 1);

        new SnowStairTemplate("appliedenergistics2", "sky_stone_stairs", "sky_stone_block");
        new SnowStairTemplate("appliedenergistics2", "smooth_sky_stone_stairs", "smooth_sky_stone_block");
        new SnowStairTemplate("appliedenergistics2", "sky_stone_brick_stairs", "sky_stone_brick");
        new SnowStairTemplate("appliedenergistics2", "sky_stone_small_brick_stairs", "sky_stone_small_brick");
        new SnowStairTemplate("appliedenergistics2", "fluix_stairs", "fluix_block");
        new SnowStairTemplate("appliedenergistics2", "quartz_stairs", "quartz_block");
        new SnowStairTemplate("appliedenergistics2", "chiseled_quartz_stairs", "chiseled_quartz_block_side", "chiseled_quartz_block_top");
        new SnowStairTemplate("appliedenergistics2", "quartz_pillar_stairs", "quartz_pillar_side", "quartz_pillar_top");

        new SnowSlabTemplate("appliedenergistics2", "sky_stone_slab", "sky_stone_block", 0);
        new SnowSlabTemplate("appliedenergistics2", "smooth_sky_stone_slab", "smooth_sky_stone_block", 0);
        new SnowSlabTemplate("appliedenergistics2", "sky_stone_brick_slab", "sky_stone_brick", 0);
        new SnowSlabTemplate("appliedenergistics2", "sky_stone_small_brick_slab", "sky_stone_small_brick", 0);
        new SnowSlabTemplate("appliedenergistics2", "fluix_slab", "fluix_block", 0);
        new SnowSlabTemplate("appliedenergistics2", "quartz_slab", "quartz_block", 0);
        new SnowSlabTemplate("appliedenergistics2", "chiseled_quartz_slab", "chiseled_quartz_block_side", "chiseled_quartz_block_top", 0);
        new SnowSlabTemplate("appliedenergistics2", "quartz_pillar_slab", "quartz_pillar_side", "quartz_pillar_top", 0);

        for (SnowStairTemplate temp : STAIRS) {
            /**Blockstate*/
            try (FileWriter file = new FileWriter("src/main/resources/assets/snowvariants/blockstates/" + temp.name + ".json")) {
                file.write(stairBlockState(temp.name));
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /**Block Model*/
            try (FileWriter file = new FileWriter("src/main/resources/assets/snowvariants/models/block/" + temp.name + ".json")) {
                file.write(stairBlockModel(temp));
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /**Inner Block Model*/
            try (FileWriter file = new FileWriter("src/main/resources/assets/snowvariants/models/block/" + temp.name + "_inner" + ".json")) {
                file.write(stairInnerBlockModel(temp));
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /**Outer Block Model*/
            try (FileWriter file = new FileWriter("src/main/resources/assets/snowvariants/models/block/" + temp.name + "_outer" + ".json")) {
                file.write(stairOuterBlockModel(temp));
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /**Item Model*/
            try (FileWriter file = new FileWriter("src/main/resources/assets/snowvariants/models/item/" + temp.name + ".json")) {
                file.write(blockItemModel(temp.name));
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /**Recipe*/
            try (FileWriter file = new FileWriter("src/main/resources/assets/snowvariants/recipes/" + temp.name + ".json")) {
                file.write(recipe(temp));
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Generated files for " + temp.name);
        }

        for (SnowSlabTemplate temp : SLABS) {

            /**BlockState*/
            try (FileWriter file = new FileWriter("src/main/resources/assets/snowvariants/blockstates/" + temp.name + ".json")) {
                file.write(slabBlockState(temp.name));
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /**Block Model*/
            try (FileWriter file = new FileWriter("src/main/resources/assets/snowvariants/models/block/" + temp.name + ".json")) {
                file.write(slabBlockModel(temp));
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /**Item Model*/
            try (FileWriter file = new FileWriter("src/main/resources/assets/snowvariants/models/item/" + temp.name + ".json")) {
                file.write(blockItemModel(temp.name));
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /**Recipe*/
            try (FileWriter file = new FileWriter("src/main/resources/assets/snowvariants/recipes/" + temp.name + ".json")) {
                file.write(recipe(temp));
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Generated files for " + temp.name);
        }

    }

    private static String stairBlockState (String name) {
        String out = "{\n" +
                "  \"variants\": {\n" +
                "    \"facing=east,half=bottom,shape=straight\":  { \"model\": \"snowvariants:" + name + "\" },\n" +
                "    \"facing=west,half=bottom,shape=straight\":  { \"model\": \"snowvariants:" + name + "\", \"y\": 180, \"uvlock\": true },\n" +
                "    \"facing=south,half=bottom,shape=straight\": { \"model\": \"snowvariants:" + name + "\", \"y\": 90, \"uvlock\": true },\n" +
                "    \"facing=north,half=bottom,shape=straight\": { \"model\": \"snowvariants:" + name + "\", \"y\": 270, \"uvlock\": true },\n" +
                "    \"facing=east,half=bottom,shape=outer_right\":  { \"model\": \"snowvariants:" + name + "_outer\" },\n" +
                "    \"facing=west,half=bottom,shape=outer_right\":  { \"model\": \"snowvariants:" + name + "_outer\", \"y\": 180, \"uvlock\": true },\n" +
                "    \"facing=south,half=bottom,shape=outer_right\": { \"model\": \"snowvariants:" + name + "_outer\", \"y\": 90, \"uvlock\": true },\n" +
                "    \"facing=north,half=bottom,shape=outer_right\": { \"model\": \"snowvariants:" + name + "_outer\", \"y\": 270, \"uvlock\": true },\n" +
                "    \"facing=east,half=bottom,shape=outer_left\":  { \"model\": \"snowvariants:" + name + "_outer\", \"y\": 270, \"uvlock\": true },\n" +
                "    \"facing=west,half=bottom,shape=outer_left\":  { \"model\": \"snowvariants:" + name + "_outer\", \"y\": 90, \"uvlock\": true },\n" +
                "    \"facing=south,half=bottom,shape=outer_left\": { \"model\": \"snowvariants:" + name + "_outer\" },\n" +
                "    \"facing=north,half=bottom,shape=outer_left\": { \"model\": \"snowvariants:" + name + "_outer\", \"y\": 180, \"uvlock\": true },\n" +
                "    \"facing=east,half=bottom,shape=inner_right\":  { \"model\": \"snowvariants:" + name + "_inner\" },\n" +
                "    \"facing=west,half=bottom,shape=inner_right\":  { \"model\": \"snowvariants:" + name + "_inner\", \"y\": 180, \"uvlock\": true },\n" +
                "    \"facing=south,half=bottom,shape=inner_right\": { \"model\": \"snowvariants:" + name + "_inner\", \"y\": 90, \"uvlock\": true },\n" +
                "    \"facing=north,half=bottom,shape=inner_right\": { \"model\": \"snowvariants:" + name + "_inner\", \"y\": 270, \"uvlock\": true },\n" +
                "    \"facing=east,half=bottom,shape=inner_left\":  { \"model\": \"snowvariants:" + name + "_inner\", \"y\": 270, \"uvlock\": true },\n" +
                "    \"facing=west,half=bottom,shape=inner_left\":  { \"model\": \"snowvariants:" + name + "_inner\", \"y\": 90, \"uvlock\": true },\n" +
                "    \"facing=south,half=bottom,shape=inner_left\": { \"model\": \"snowvariants:" + name + "_inner\" },\n" +
                "    \"facing=north,half=bottom,shape=inner_left\": { \"model\": \"snowvariants:" + name + "_inner\", \"y\": 180, \"uvlock\": true },\n" +
                "    \"facing=east,half=top,shape=straight\":  { \"model\": \"snowvariants:" + name + "\", \"x\": 180, \"uvlock\": true },\n" +
                "    \"facing=west,half=top,shape=straight\":  { \"model\": \"snowvariants:" + name + "\", \"x\": 180, \"y\": 180, \"uvlock\": true },\n" +
                "    \"facing=south,half=top,shape=straight\": { \"model\": \"snowvariants:" + name + "\", \"x\": 180, \"y\": 90, \"uvlock\": true },\n" +
                "    \"facing=north,half=top,shape=straight\": { \"model\": \"snowvariants:" + name + "\", \"x\": 180, \"y\": 270, \"uvlock\": true },\n" +
                "    \"facing=east,half=top,shape=outer_right\":  { \"model\": \"snowvariants:" + name + "_outer\", \"x\": 180, \"y\": 90, \"uvlock\": true },\n" +
                "    \"facing=west,half=top,shape=outer_right\":  { \"model\": \"snowvariants:" + name + "_outer\", \"x\": 180, \"y\": 270, \"uvlock\": true },\n" +
                "    \"facing=south,half=top,shape=outer_right\": { \"model\": \"snowvariants:" + name + "_outer\", \"x\": 180, \"y\": 180, \"uvlock\": true },\n" +
                "    \"facing=north,half=top,shape=outer_right\": { \"model\": \"snowvariants:" + name + "_outer\", \"x\": 180, \"uvlock\": true },\n" +
                "    \"facing=east,half=top,shape=outer_left\":  { \"model\": \"snowvariants:" + name + "_outer\", \"x\": 180, \"uvlock\": true },\n" +
                "    \"facing=west,half=top,shape=outer_left\":  { \"model\": \"snowvariants:" + name + "_outer\", \"x\": 180, \"y\": 180, \"uvlock\": true },\n" +
                "    \"facing=south,half=top,shape=outer_left\": { \"model\": \"snowvariants:" + name + "_outer\", \"x\": 180, \"y\": 90, \"uvlock\": true },\n" +
                "    \"facing=north,half=top,shape=outer_left\": { \"model\": \"snowvariants:" + name + "_outer\", \"x\": 180, \"y\": 270, \"uvlock\": true },\n" +
                "    \"facing=east,half=top,shape=inner_right\":  { \"model\": \"snowvariants:" + name + "_inner\", \"x\": 180, \"y\": 90, \"uvlock\": true },\n" +
                "    \"facing=west,half=top,shape=inner_right\":  { \"model\": \"snowvariants:" + name + "_inner\", \"x\": 180, \"y\": 270, \"uvlock\": true },\n" +
                "    \"facing=south,half=top,shape=inner_right\": { \"model\": \"snowvariants:" + name + "_inner\", \"x\": 180, \"y\": 180, \"uvlock\": true },\n" +
                "    \"facing=north,half=top,shape=inner_right\": { \"model\": \"snowvariants:" + name + "_inner\", \"x\": 180, \"uvlock\": true },\n" +
                "    \"facing=east,half=top,shape=inner_left\":  { \"model\": \"snowvariants:" + name + "_inner\", \"x\": 180, \"uvlock\": true },\n" +
                "    \"facing=west,half=top,shape=inner_left\":  { \"model\": \"snowvariants:" + name + "_inner\", \"x\": 180, \"y\": 180, \"uvlock\": true },\n" +
                "    \"facing=south,half=top,shape=inner_left\": { \"model\": \"snowvariants:" + name + "_inner\", \"x\": 180, \"y\": 90, \"uvlock\": true },\n" +
                "    \"facing=north,half=top,shape=inner_left\": { \"model\": \"snowvariants:" + name + "_inner\", \"x\": 180, \"y\": 270, \"uvlock\": true }\n" +
                "  }\n" +
                "}";
        return out;
    }

    public static String stairBlockModel(SnowStairTemplate temp) {
        String bottom = temp.all == null ? temp.bottom : temp.all;
        String side = temp.all == null ? temp.side : temp.all;

        String out = "{\n" +
                "  \"parent\": \"snowvariants:block/snow_stair\",\n" +
                "  \"textures\": {\n" +
                "    \"bottom\": \"" + temp.modid + ":blocks/" + bottom + "\",\n" +
                "    \"side\": \"" + temp.modid + ":blocks/" + side + "\"\n" +
                "  }\n" +
                "}";
        return out;
    }

    public static String stairInnerBlockModel(SnowStairTemplate temp) {
        String bottom = temp.all == null ? temp.bottom : temp.all;
        String side = temp.all == null ? temp.side : temp.all;

        String out = "{\n" +
                "  \"parent\": \"snowvariants:block/snow_stair_inner\",\n" +
                "  \"textures\": {\n" +
                "    \"bottom\": \"" + temp.modid + ":blocks/" + bottom + "\",\n" +
                "    \"side\": \"" + temp.modid + ":blocks/" + side + "\"\n" +
                "  }\n" +
                "}";
        return out;
    }

    public static String stairOuterBlockModel(SnowStairTemplate temp) {
        String bottom = temp.all == null ? temp.bottom : temp.all;
        String side = temp.all == null ? temp.side : temp.all;

        String out = "{\n" +
                "\t\"parent\": \"snowvariants:block/snow_stair_outer\",\n" +
                "\t\"textures\": {\n" +
                "\t\t\"bottom\": \"" + temp.modid + ":blocks/" + bottom + "\",\n" +
                "\t\t\"side\": \"" + temp.modid + ":blocks/" + side + "\"\n" +
                "\t}\n" +
                "}";

        return out;
    }

    public static String slabBlockState (String name) {
        String out = "{\n" +
                "  \"variants\": {\n" +
                "    \"normal\": { \"model\": \"snowvariants:" + name + "\" }\n" +
                "  }\n" +
                "}";

        return out;
    }

    public static String slabBlockModel(SnowSlabTemplate temp) {
        String bottom = temp.all == null ? temp.bottom : temp.all;
        String side = temp.all == null ? temp.side : temp.all;

        String out = "{\n" +
                "  \"parent\": \"snowvariants:block/snow_slab\",\n" +
                "  \"textures\": {\n" +
                "    \"bottom\": \"" + temp.modid + ":blocks/" + bottom + "\",\n" +
                "    \"side\": \"" + temp.modid + ":blocks/" + side + "\"\n" +
                "  }\n" +
                "}";

        return out;
    }

    public static String blockItemModel(String name) {
        String out = "{\n" +
                "  \"parent\": \"snowvariants:block/" + name + "\"\n" +
                "}";
        return out;
    }

    public static String recipe(SnowStairTemplate temp) {
        String originName = temp.originName == null ? temp.rawName : temp.originName;
        String out = "{\n" +
                "  \"type\": \"minecraft:crafting_shaped\",\n" +
                "  \"pattern\": [\n" +
                "    \"A\",\n" +
                "    \"B\"\n" +
                "  ],\n" +
                "  \"key\": {\n" +
                "    \"A\": {\n" +
                "      \"item\": \"minecraft:snow_layer\"\n" +
                "    },\n" +
                "    \"B\": {\n" +
                "      \"item\": \"" + temp.modid + ":" + originName + "\"\n" +
                "    }\n" +
                "  },\n" +
                "  \"result\": {\n" +
                "    \"item\": \"snowvariants:" + temp.name + "\"\n" +
                "  }\n" +
                "}";

        return out;
    }

    public static String recipe(SnowSlabTemplate temp) {
        String originName = temp.originName == null ? temp.rawName : temp.originName;
        String out = "{\n" +
                "  \"type\": \"minecraft:crafting_shaped\",\n" +
                "  \"pattern\": [\n" +
                "    \"A\",\n" +
                "    \"B\"\n" +
                "  ],\n" +
                "  \"key\": {\n" +
                "    \"A\": {\n" +
                "      \"item\": \"minecraft:snow_layer\"\n" +
                "    },\n" +
                "    \"B\": {\n" +
                "      \"item\": \"" + temp.modid + ":" + originName + "\",\n" +
                "      \"data\": " + temp.meta + "\n" +
                "    }\n" +
                "  },\n" +
                "  \"result\": {\n" +
                "    \"item\": \"snowvariants:" + temp.name + "\"\n" +
                "  }\n" +
                "}";

        return out;
    }
}
