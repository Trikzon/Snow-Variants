package trikzon.snowvariants.compat;

public class AppliedEnergistics2 extends Mod{

    public AppliedEnergistics2() {
        super("appliedenergistics2");
    }

    public void registerStairs() {
        createStair("sky_stone_stairs");
        createStair("smooth_sky_stone_stairs");
        createStair("sky_stone_brick_stairs");
        createStair("sky_stone_small_brick_stairs");
        createStair("fluix_stairs");
        createStair("quartz_stairs");
        createStair("chiseled_quartz_stairs");
        createStair("quartz_pillar_stairs");
    }

    public void registerSlabs() {
        createSlab("sky_stone_slab");
        createSlab("smooth_sky_stone_slab");
        createSlab("sky_stone_brick_slab");
        createSlab("sky_stone_small_brick_slab");
        createSlab("fluix_slab");
        createSlab("quartz_slab");
        createSlab("chiseled_quartz_slab");
        createSlab("quartz_pillar_slab");
    }
}
