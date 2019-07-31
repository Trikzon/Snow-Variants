package json;

public class SnowStairTemplate {

    public final String modid, name, rawName, all, side, bottom, originName;

    public SnowStairTemplate(String modid, String name, String all) {
        this.modid = modid;
        this.name = modid + "_" + name;
        rawName = name;
        this.all = all;
        side = null;
        bottom = null;
        originName = null;

        Generator.STAIRS.add(this);
    }

    public SnowStairTemplate(String modid, String name, String side, String bottom) {
        this.modid = modid;
        this.name = modid + "_" + name;
        rawName = name;
        all = null;
        this.side = side;
        this.bottom = bottom;
        originName = null;

        Generator.STAIRS.add(this);
    }

    public SnowStairTemplate(String modid, String name, String all, String originName, int old) {
        this.modid = modid;
        this.name = name;
        rawName = name;
        this.all = all;
        side = null;
        bottom = null;
        this.originName = originName;

        Generator.STAIRS.add(this);
    }

    public SnowStairTemplate(String modid, String name, String side, String bottom, String originName) {
        this.modid = modid;
        this.name = name;
        rawName = name;
        all = null;
        this.side = side;
        this.bottom = bottom;
        this.originName = originName;

        Generator.STAIRS.add(this);
    }
}
