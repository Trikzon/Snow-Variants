package trikzon.snowvariants.compat;

public class AstralSorcery extends Mod {

    public AstralSorcery() {
        super("astralsorcery");
    }

    @Override
    public void registerSlabs() {
        createStair("blockmarblestairs");
    }

    @Override
    public void registerStairs() {
        createSlab("blockmarbleslab");
    }
}
