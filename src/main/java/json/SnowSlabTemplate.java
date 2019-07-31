package json;

public class SnowSlabTemplate {

    public final String modid, name, rawName, all, side, bottom, originName;
    public final int meta;

    public SnowSlabTemplate(String modid, String name, String all, int meta) {
        this.modid = modid;
        this.name = modid + "_" + name;
        rawName = name;
        this.all = all;
        side = null;
        bottom = null;
        originName = null;
        this.meta = meta;

        Generator.SLABS.add(this);
    }

    public SnowSlabTemplate(String modid, String name, String side, String bottom, int meta) {
        this.modid = modid;
        this.name = modid + "_" + name;
        rawName = name;
        all = null;
        this.side = side;
        this.bottom = bottom;
        originName = null;
        this.meta = meta;

        Generator.SLABS.add(this);
    }

    public SnowSlabTemplate(String modid, String name, String all, int meta,  String originName, int old) {
        this.modid = modid;
        this.name = name;
        rawName = name;
        this.all = all;
        side = null;
        bottom = null;
        this.meta = meta;
        this.originName = originName;

        Generator.SLABS.add(this);
    }

    public SnowSlabTemplate(String modid, String name, String side, String bottom, int meta, String originName) {
        this.modid = modid;
        this.name = name;
        rawName = name;
        all = null;
        this.side = side;
        this.bottom = bottom;
        this.meta = meta;
        this.originName = originName;

        Generator.SLABS.add(this);
    }
}
