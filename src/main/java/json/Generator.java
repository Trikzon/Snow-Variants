package json;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import static trikzon.snowvariants.SnowVariants.MODID;

public class Generator {

    public static ArrayList<SnowStairTemplate> STAIRS = new ArrayList<>();
    public static ArrayList<SnowSlabTemplate> SLABS = new ArrayList<>();

    public static void main(String[] args) {

        new SnowStairTemplate("minecraft", "purpur_stairs", "purpur_block");
        new SnowStairTemplate("minecraft", "oak_stairs", "oak_planks");
        new SnowStairTemplate("minecraft", "cobblestone_stairs", "cobblestone");
        new SnowStairTemplate("minecraft", "brick_stairs", "bricks");
        new SnowStairTemplate("minecraft", "stone_brick_stairs", "stone_bricks");
        new SnowStairTemplate("minecraft", "nether_brick_stairs", "nether_bricks");
        new SnowStairTemplate("minecraft", "sandstone_stairs", "sandstone_top", "sandstone", "sandstone_bottom");
        new SnowStairTemplate("minecraft", "spruce_stairs", "spruce_planks");
        new SnowStairTemplate("minecraft", "birch_stairs", "birch_planks");
        new SnowStairTemplate("minecraft", "jungle_stairs", "jungle_planks");
        new SnowStairTemplate("minecraft", "quartz_stairs", "quartz_block_top", "quartz_block_side", "quartz_block_top");
        new SnowStairTemplate("minecraft", "acacia_stairs", "acacia_planks");
        new SnowStairTemplate("minecraft", "dark_oak_stairs", "dark_oak_planks");
        new SnowStairTemplate("minecraft", "prismarine_stairs", "prismarine");
        new SnowStairTemplate("minecraft", "prismarine_brick_stairs", "prismarine_bricks");
        new SnowStairTemplate("minecraft", "dark_prismarine_stairs", "dark_prismarine");
        new SnowStairTemplate("minecraft", "red_sandstone_stairs", "red_sandstone_top", "red_sandstone", "red_sandstone_bottom");
        new SnowStairTemplate("minecraft", "polished_granite_stairs", "polished_granite");
        new SnowStairTemplate("minecraft", "smooth_red_sandstone_stairs", "red_sandstone_top");
        new SnowStairTemplate("minecraft", "mossy_stone_brick_stairs", "mossy_stone_bricks");
        new SnowStairTemplate("minecraft", "polished_diorite_stairs", "polished_diorite");
        new SnowStairTemplate("minecraft", "mossy_cobblestone_stairs", "mossy_cobblestone");
        new SnowStairTemplate("minecraft", "end_stone_brick_stairs", "end_stone_bricks");
        new SnowStairTemplate("minecraft", "stone_stairs", "stone");
        new SnowStairTemplate("minecraft", "smooth_sandstone_stairs", "sandstone_top");
        new SnowStairTemplate("minecraft", "smooth_quartz_stairs", "quartz_block_bottom");
        new SnowStairTemplate("minecraft", "granite_stairs", "granite");
        new SnowStairTemplate("minecraft", "andesite_stairs", "andesite");
        new SnowStairTemplate("minecraft", "red_nether_brick_stairs", "red_nether_bricks");
        new SnowStairTemplate("minecraft", "polished_andesite_stairs", "polished_andesite");
        new SnowStairTemplate("minecraft", "diorite_stairs", "diorite");

        new SnowSlabTemplate("minecraft", "oak_slab", "oak_planks");
        new SnowSlabTemplate("minecraft", "spruce_slab", "spruce_planks");
        new SnowSlabTemplate("minecraft", "birch_slab", "birch_planks");
        new SnowSlabTemplate("minecraft", "jungle_slab", "jungle_planks");
        new SnowSlabTemplate("minecraft", "acacia_slab", "acacia_planks");
        new SnowSlabTemplate("minecraft", "dark_oak_slab", "dark_oak_planks");
        new SnowSlabTemplate("minecraft", "stone_slab", "stone");
        new SnowSlabTemplate("minecraft", "smooth_stone_slab", "smooth_stone");
        new SnowSlabTemplate("minecraft", "sandstone_slab", "sandstone_top", "sandstone", "sandstone_bottom");
        new SnowSlabTemplate("minecraft", "cut_sandstone_slab", "sandstone_top", "cut_sandstone", "sandstone_top");
        new SnowSlabTemplate("minecraft", "petrified_oak_slab", "oak_planks");
        new SnowSlabTemplate("minecraft", "cobblestone_slab", "cobblestone");
        new SnowSlabTemplate("minecraft", "brick_slab", "bricks");
        new SnowSlabTemplate("minecraft", "stone_brick_slab", "stone_bricks");
        new SnowSlabTemplate("minecraft", "nether_brick_slab", "nether_bricks");
        new SnowSlabTemplate("minecraft", "quartz_slab", "quartz_block_top", "quartz_block_side", "quartz_block_top");
        new SnowSlabTemplate("minecraft", "red_sandstone_slab", "red_sandstone_top", "red_sandstone", "red_sandstone_bottom");
        new SnowSlabTemplate("minecraft", "cut_red_sandstone_slab", "red_sandstone_top", "cut_red_sandstone", "red_sandstone_top");
        new SnowSlabTemplate("minecraft", "purpur_slab", "purpur_block");
        new SnowSlabTemplate("minecraft", "prismarine_slab", "prismarine");
        new SnowSlabTemplate("minecraft", "prismarine_brick_slab", "prismarine_bricks");
        new SnowSlabTemplate("minecraft", "dark_prismarine_slab", "dark_prismarine");
        new SnowSlabTemplate("minecraft", "polished_granite_slab", "polished_granite");
        new SnowSlabTemplate("minecraft", "smooth_red_sandstone_slab", "red_sandstone_top");
        new SnowSlabTemplate("minecraft", "mossy_stone_brick_slab", "mossy_stone_bricks");
        new SnowSlabTemplate("minecraft", "polished_diorite_slab", "polished_diorite");
        new SnowSlabTemplate("minecraft", "mossy_cobblestone_slab", "mossy_cobblestone");
        new SnowSlabTemplate("minecraft", "end_stone_brick_slab", "end_stone_bricks");
        new SnowSlabTemplate("minecraft", "smooth_sandstone_slab", "sandstone_top");
        new SnowSlabTemplate("minecraft", "smooth_quartz_slab", "quartz_block_bottom");
        new SnowSlabTemplate("minecraft", "granite_slab", "granite");
        new SnowSlabTemplate("minecraft", "andesite_slab", "andesite");
        new SnowSlabTemplate("minecraft", "red_nether_brick_slab", "red_nether_bricks");
        new SnowSlabTemplate("minecraft", "polished_andesite_slab", "polished_andesite");
        new SnowSlabTemplate("minecraft", "diorite_slab", "diorite");

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
            try (FileWriter file = new FileWriter("src/main/resources/data/snowvariants/recipes/" + temp.name + ".json")) {
                file.write(recipe(temp));
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /**Loot Table*/
            try (FileWriter file = new FileWriter("src/main/resources/data/snowvariants/loot_tables/blocks/" + temp.name + ".json")) {
                file.write(lootTable(temp));
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
            try (FileWriter file = new FileWriter("src/main/resources/data/snowvariants/recipes/" + temp.name + ".json")) {
                file.write(recipe(temp));
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /**Loot Table*/
            try (FileWriter file = new FileWriter("src/main/resources/data/snowvariants/loot_tables/blocks/" + temp.name + ".json")) {
                file.write(lootTable(temp));
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
                "    \"facing=east,half=bottom,shape=straight\":  { \"model\": \"" + MODID + ":block/" + name + "\" },\n" +
                "    \"facing=west,half=bottom,shape=straight\":  { \"model\": \"" + MODID + ":block/" + name + "\", \"y\": 180, \"uvlock\": true },\n" +
                "    \"facing=south,half=bottom,shape=straight\": { \"model\": \"" + MODID + ":block/" + name + "\", \"y\": 90, \"uvlock\": true },\n" +
                "    \"facing=north,half=bottom,shape=straight\": { \"model\": \"" + MODID + ":block/" + name + "\", \"y\": 270, \"uvlock\": true },\n" +
                "    \"facing=east,half=bottom,shape=outer_right\":  { \"model\": \"" + MODID + ":block/" + name + "_outer\" },\n" +
                "    \"facing=west,half=bottom,shape=outer_right\":  { \"model\": \"" + MODID + ":block/" + name + "_outer\", \"y\": 180, \"uvlock\": true },\n" +
                "    \"facing=south,half=bottom,shape=outer_right\": { \"model\": \"" + MODID + ":block/" + name + "_outer\", \"y\": 90, \"uvlock\": true },\n" +
                "    \"facing=north,half=bottom,shape=outer_right\": { \"model\": \"" + MODID + ":block/" + name + "_outer\", \"y\": 270, \"uvlock\": true },\n" +
                "    \"facing=east,half=bottom,shape=outer_left\":  { \"model\": \"" + MODID + ":block/" + name + "_outer\", \"y\": 270, \"uvlock\": true },\n" +
                "    \"facing=west,half=bottom,shape=outer_left\":  { \"model\": \"" + MODID + ":block/" + name + "_outer\", \"y\": 90, \"uvlock\": true },\n" +
                "    \"facing=south,half=bottom,shape=outer_left\": { \"model\": \"" + MODID + ":block/" + name + "_outer\" },\n" +
                "    \"facing=north,half=bottom,shape=outer_left\": { \"model\": \"" + MODID + ":block/" + name + "_outer\", \"y\": 180, \"uvlock\": true },\n" +
                "    \"facing=east,half=bottom,shape=inner_right\":  { \"model\": \"" + MODID + ":block/" + name + "_inner\" },\n" +
                "    \"facing=west,half=bottom,shape=inner_right\":  { \"model\": \"" + MODID + ":block/" + name + "_inner\", \"y\": 180, \"uvlock\": true },\n" +
                "    \"facing=south,half=bottom,shape=inner_right\": { \"model\": \"" + MODID + ":block/" + name + "_inner\", \"y\": 90, \"uvlock\": true },\n" +
                "    \"facing=north,half=bottom,shape=inner_right\": { \"model\": \"" + MODID + ":block/" + name + "_inner\", \"y\": 270, \"uvlock\": true },\n" +
                "    \"facing=east,half=bottom,shape=inner_left\":  { \"model\": \"" + MODID + ":block/" + name + "_inner\", \"y\": 270, \"uvlock\": true },\n" +
                "    \"facing=west,half=bottom,shape=inner_left\":  { \"model\": \"" + MODID + ":block/" + name + "_inner\", \"y\": 90, \"uvlock\": true },\n" +
                "    \"facing=south,half=bottom,shape=inner_left\": { \"model\": \"" + MODID + ":block/" + name + "_inner\" },\n" +
                "    \"facing=north,half=bottom,shape=inner_left\": { \"model\": \"" + MODID + ":block/" + name + "_inner\", \"y\": 180, \"uvlock\": true },\n" +
                "    \"facing=east,half=top,shape=straight\":  { \"model\": \"" + MODID + ":block/" + name + "\", \"x\": 180, \"uvlock\": true },\n" +
                "    \"facing=west,half=top,shape=straight\":  { \"model\": \"" + MODID + ":block/" + name + "\", \"x\": 180, \"y\": 180, \"uvlock\": true },\n" +
                "    \"facing=south,half=top,shape=straight\": { \"model\": \"" + MODID + ":block/" + name + "\", \"x\": 180, \"y\": 90, \"uvlock\": true },\n" +
                "    \"facing=north,half=top,shape=straight\": { \"model\": \"" + MODID + ":block/" + name + "\", \"x\": 180, \"y\": 270, \"uvlock\": true },\n" +
                "    \"facing=east,half=top,shape=outer_right\":  { \"model\": \"" + MODID + ":block/" + name + "_outer\", \"x\": 180, \"y\": 90, \"uvlock\": true },\n" +
                "    \"facing=west,half=top,shape=outer_right\":  { \"model\": \"" + MODID + ":block/" + name + "_outer\", \"x\": 180, \"y\": 270, \"uvlock\": true },\n" +
                "    \"facing=south,half=top,shape=outer_right\": { \"model\": \"" + MODID + ":block/" + name + "_outer\", \"x\": 180, \"y\": 180, \"uvlock\": true },\n" +
                "    \"facing=north,half=top,shape=outer_right\": { \"model\": \"" + MODID + ":block/" + name + "_outer\", \"x\": 180, \"uvlock\": true },\n" +
                "    \"facing=east,half=top,shape=outer_left\":  { \"model\": \"" + MODID + ":block/" + name + "_outer\", \"x\": 180, \"uvlock\": true },\n" +
                "    \"facing=west,half=top,shape=outer_left\":  { \"model\": \"" + MODID + ":block/" + name + "_outer\", \"x\": 180, \"y\": 180, \"uvlock\": true },\n" +
                "    \"facing=south,half=top,shape=outer_left\": { \"model\": \"" + MODID + ":block/" + name + "_outer\", \"x\": 180, \"y\": 90, \"uvlock\": true },\n" +
                "    \"facing=north,half=top,shape=outer_left\": { \"model\": \"" + MODID + ":block/" + name + "_outer\", \"x\": 180, \"y\": 270, \"uvlock\": true },\n" +
                "    \"facing=east,half=top,shape=inner_right\":  { \"model\": \"" + MODID + ":block/" + name + "_inner\", \"x\": 180, \"y\": 90, \"uvlock\": true },\n" +
                "    \"facing=west,half=top,shape=inner_right\":  { \"model\": \"" + MODID + ":block/" + name + "_inner\", \"x\": 180, \"y\": 270, \"uvlock\": true },\n" +
                "    \"facing=south,half=top,shape=inner_right\": { \"model\": \"" + MODID + ":block/" + name + "_inner\", \"x\": 180, \"y\": 180, \"uvlock\": true },\n" +
                "    \"facing=north,half=top,shape=inner_right\": { \"model\": \"" + MODID + ":block/" + name + "_inner\", \"x\": 180, \"uvlock\": true },\n" +
                "    \"facing=east,half=top,shape=inner_left\":  { \"model\": \"" + MODID + ":block/" + name + "_inner\", \"x\": 180, \"uvlock\": true },\n" +
                "    \"facing=west,half=top,shape=inner_left\":  { \"model\": \"" + MODID + ":block/" + name + "_inner\", \"x\": 180, \"y\": 180, \"uvlock\": true },\n" +
                "    \"facing=south,half=top,shape=inner_left\": { \"model\": \"" + MODID + ":block/" + name + "_inner\", \"x\": 180, \"y\": 90, \"uvlock\": true },\n" +
                "    \"facing=north,half=top,shape=inner_left\": { \"model\": \"" + MODID + ":block/" + name + "_inner\", \"x\": 180, \"y\": 270, \"uvlock\": true }\n" +
                "  }\n" +
                "}";
        return out;
    }

    public static String stairBlockModel(SnowStairTemplate temp) {
        String bottom = temp.all == null ? temp.bottom : temp.all;
        String top = temp.all == null ? temp.top : temp.all;
        String side = temp.all == null ? temp.side : temp.all;

        String out = "{\n" +
                "  \"parent\": \"" + MODID + ":block/snow_stair\",\n" +
                "  \"textures\": {\n" +
                "    \"bottom\": \"" + temp.modid + ":block/" + bottom + "\",\n" +
                "    \"top\": \"" + temp.modid + ":block/" + top + "\",\n" +
                "    \"side\": \"" + temp.modid + ":block/" + side + "\",\n" +
                "    \"snowTop\": \"minecraft:block/snow\",\n" +
                "    \"snowSide\": \"" + MODID + ":block/snow_side\"\n" +
                "  }\n" +
                "}";
        return out;
    }

    public static String stairInnerBlockModel(SnowStairTemplate temp) {
        String bottom = temp.all == null ? temp.bottom : temp.all;
        String top = temp.all == null ? temp.top : temp.all;
        String side = temp.all == null ? temp.side : temp.all;

        String out = "{\n" +
                "  \"parent\": \"" + MODID + ":block/snow_stair_inner\",\n" +
                "  \"textures\": {\n" +
                "    \"bottom\": \"" + temp.modid + ":block/" + bottom + "\",\n" +
                "    \"top\": \"" + temp.modid + ":block/" + top + "\",\n" +
                "    \"side\": \"" + temp.modid + ":block/" + side + "\",\n" +
                "    \"snowTop\": \"minecraft:block/snow\",\n" +
                "    \"snowSide\": \"" + MODID + ":block/snow_side\"\n" +
                "  }\n" +
                "}";
        return out;
    }

    public static String stairOuterBlockModel(SnowStairTemplate temp) {
        String bottom = temp.all == null ? temp.bottom : temp.all;
        String top = temp.all == null ? temp.top : temp.all;
        String side = temp.all == null ? temp.side : temp.all;

        String out = "{\n" +
                "\t\"parent\": \"" + MODID +":block/snow_stair_outer\",\n" +
                "\t\"textures\": {\n" +
                "\t\t\"bottom\": \"" + temp.modid + ":block/" + bottom + "\",\n" +
                "\t\t\"top\": \"" + temp.modid + ":block/" + top + "\",\n" +
                "\t\t\"side\": \"" + temp.modid + ":block/" + side + "\",\n" +
                "\t\t\"snowTop\": \"minecraft:block/snow\",\n" +
                "\t\t\"snowSide\": \"" + MODID + ":block/snow_side\"\n" +
                "\t}\n" +
                "}";

        return out;
    }

    public static String slabBlockState (String name) {
        String out = "{\n" +
                "  \"variants\": {\n" +
                "    \"\": {\n" +
                "      \"model\": \"snowvariants:block/" + name + "\"\n" +
                "    }\n" +
                "  }\n" +
                "}";

        return out;
    }

    public static String slabBlockModel(SnowSlabTemplate temp) {
        String bottom = temp.all == null ? temp.bottom : temp.all;
        String top = temp.all == null ? temp.top : temp.all;
        String side = temp.all == null ? temp.side : temp.all;

        String out = "{\n" +
                "  \"parent\": \"snowvariants:block/snow_slab\",\n" +
                "  \"textures\": {\n" +
                "    \"bottom\": \"" + temp.modid + ":block/" + bottom + "\",\n" +
                "    \"top\": \"" + temp.modid + ":block/" + top + "\",\n" +
                "    \"side\": \"" + temp.modid + ":block/" + side + "\",\n" +
                "    \"snowTop\": \"minecraft:block/snow\",\n" +
                "    \"snowSide\": \"snowvariants:block/snow_side\"\n" +
                "  }\n" +
                "}";

        return out;
    }

    public static String blockItemModel(String name) {
        String out = "{\n" +
                "  \"parent\": \"" + MODID + ":block/" + name + "\"\n" +
                "}";
        return out;
    }

    public static String recipe(SnowStairTemplate temp) {
        String out = "{\n" +
                "  \"type\": \"crafting_shaped\",\n" +
                "  \"pattern\": [\n" +
                "    \"A\",\n" +
                "    \"B\"\n" +
                "  ],\n" +
                "  \"key\": {\n" +
                "    \"A\": {\n" +
                "      \"item\": \"minecraft:snow\"\n" +
                "    },\n" +
                "    \"B\": {\n" +
                "      \"item\": \"" + temp.modid + ":" + temp.rawName + "\"\n" +
                "    }\n" +
                "  },\n" +
                "  \"result\": {\n" +
                "    \"item\": \"snowvariants:" + temp.name + "\"\n" +
                "  }\n" +
                "}";

        return out;
    }

    public static String recipe(SnowSlabTemplate temp) {
        String out = "{\n" +
                "  \"type\": \"crafting_shaped\",\n" +
                "  \"pattern\": [\n" +
                "    \"A\",\n" +
                "    \"B\"\n" +
                "  ],\n" +
                "  \"key\": {\n" +
                "    \"A\": {\n" +
                "      \"item\": \"minecraft:snow\"\n" +
                "    },\n" +
                "    \"B\": {\n" +
                "      \"item\": \"" + temp.modid + ":" + temp.rawName + "\"\n" +
                "    }\n" +
                "  },\n" +
                "  \"result\": {\n" +
                "    \"item\": \"snowvariants:" + temp.name + "\"\n" +
                "  }\n" +
                "}";

        return out;
    }

    public static String lootTable(SnowStairTemplate temp) {
        String out = "{\n" +
                "  \"type\": \"minecraft:block\",\n" +
                "  \"pools\": [\n" +
                "    {\n" +
                "      \"rolls\": 1,\n" +
                "      \"entries\": [\n" +
                "        {\n" +
                "          \"type\": \"minecraft:item\",\n" +
                "          \"name\": \"" + temp.modid + ":" + temp.rawName + "\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"conditions\": [\n" +
                "        {\n" +
                "          \"condition\": \"minecraft:survives_explosion\"\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"rolls\": 1,\n" +
                "      \"entries\": [\n" +
                "        {\n" +
                "          \"type\": \"minecraft:item\",\n" +
                "          \"name\": \"minecraft:snow\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"conditions\": [\n" +
                "        {\n" +
                "          \"condition\": \"minecraft:survives_explosion\"\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        return out;
    }

    public static String lootTable(SnowSlabTemplate temp) {
        String out = "{\n" +
                "  \"type\": \"minecraft:block\",\n" +
                "  \"pools\": [\n" +
                "    {\n" +
                "      \"rolls\": 1,\n" +
                "      \"entries\": [\n" +
                "        {\n" +
                "          \"type\": \"minecraft:item\",\n" +
                "          \"name\": \"" + temp.modid + ":" + temp.rawName + "\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"conditions\": [\n" +
                "        {\n" +
                "          \"condition\": \"minecraft:survives_explosion\"\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"rolls\": 1,\n" +
                "      \"entries\": [\n" +
                "        {\n" +
                "          \"type\": \"minecraft:item\",\n" +
                "          \"name\": \"minecraft:snow\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"conditions\": [\n" +
                "        {\n" +
                "          \"condition\": \"minecraft:survives_explosion\"\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        return out;
    }
}
