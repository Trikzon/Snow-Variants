package json;

public class SnowStairTemplate {

    public final String modid, name, rawName, all, top, side, bottom;

    public SnowStairTemplate(String modid, String name, String all) {
        this.modid = modid;
        this.name = modid + "_" + name;
        rawName = name;
        this.all = all;
        top = null;
        side = null;
        bottom = null;

        Generator.STAIRS.add(this);
    }

    public SnowStairTemplate(String modid, String name, String top, String side, String bottom) {
        this.modid = modid;
        this.name = modid + "_" + name;
        rawName = name;
        all = null;
        this.top = top;
        this.side = side;
        this.bottom = bottom;

        Generator.STAIRS.add(this);
    }
}
