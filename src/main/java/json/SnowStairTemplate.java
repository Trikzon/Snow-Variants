package json;

public class SnowStairTemplate {

    public final String name, all, top, side, bottom;

    public SnowStairTemplate(String name, String all) {
        this.name = name;
        this.all = all;
        top = null;
        side = null;
        bottom = null;

        Generator.STAIRS.add(this);
    }

    public SnowStairTemplate(String name, String top, String side, String bottom) {
        this.name = name;
        all = null;
        this.top = top;
        this.side = side;
        this.bottom = bottom;

        Generator.STAIRS.add(this);
    }
}
