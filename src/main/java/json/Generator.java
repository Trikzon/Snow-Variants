package json;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import static trikzon.snowvariants.SnowVariants.MODID;

public class Generator {

    public static ArrayList<SnowStairTemplate> STAIRS = new ArrayList<>();

    public static void main(String[] args) {

        new SnowStairTemplate("minecraft_spruce_stairs", "spruce_planks");

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
                "    \"bottom\": \"minecraft:block/" + bottom + "\",\n" +
                "    \"top\": \"minecraft:block/" + top + "\",\n" +
                "    \"side\": \"minecraft:block/" + side + "\",\n" +
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
                "    \"bottom\": \"minecraft:block/" + bottom + "\",\n" +
                "    \"top\": \"minecraft:block/" + top + "\",\n" +
                "    \"side\": \"minecraft:block/" + side + "\",\n" +
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
                "\t\t\"bottom\": \"minecraft:block/" + bottom + "\",\n" +
                "\t\t\"top\": \"minecraft:block/" + top + "\",\n" +
                "\t\t\"side\": \"minecraft:block/" + side + "\",\n" +
                "\t\t\"snowTop\": \"minecraft:block/snow\",\n" +
                "\t\t\"snowSide\": \"" + MODID + ":block/snow_side\"\n" +
                "\t}\n" +
                "}";

        return out;
    }
}
