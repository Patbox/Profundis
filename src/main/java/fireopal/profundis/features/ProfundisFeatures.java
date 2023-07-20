package fireopal.profundis.features;

import fireopal.profundis.Profundis;
import fireopal.profundis.features.features.AmethystVeinFeature;
import fireopal.profundis.features.features.CavePillarFeature;
import fireopal.profundis.features.features.CaveSurfaceFeature;
import fireopal.profundis.features.features.FrozenWaterFeature;
import fireopal.profundis.features.features.IcicleFeature;
import fireopal.profundis.features.features.LargeOreFeature;
import fireopal.profundis.features.features.LavaFixerFeature;
import fireopal.profundis.features.features.NetherrackBaseFeature;
import fireopal.profundis.features.features.NotStupidDeltaFeature;
import fireopal.profundis.features.features.ShelfFungiFeature;
import fireopal.profundis.features.features.TerracottaBandsLargeOreFeature;
import fireopal.profundis.features.features.config.AmethystVeinFeatureConfig;
import fireopal.profundis.features.features.config.CavePillarFeatureConfig;
import fireopal.profundis.features.features.config.CaveSurfaceFeatureConfig;
import fireopal.profundis.features.features.config.IcicleFeatureConfig;
import fireopal.profundis.features.features.config.LargeOreFeatureConfig;
import fireopal.profundis.features.features.config.NetherrackBaseFeatureConfig;
import fireopal.profundis.features.features.config.ShelfFungiFeatureConfig;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.DeltaFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;

public class ProfundisFeatures {
    private static <C extends FeatureConfig, F extends Feature<C>> F register(String id, F feature) {
        return (F)Registry.register(Registries.FEATURE, Profundis.id(id), feature);
    }

    public final static Feature<IcicleFeatureConfig> ICICLE_FEATURE;
    public final static Feature<CaveSurfaceFeatureConfig> CAVE_SURFACE_FEATURE;
    public final static Feature<CavePillarFeatureConfig> CAVE_PILLAR_FEATURE;
    public final static Feature<DefaultFeatureConfig> LAVA_FIXER_FEATURE;
    public final static Feature<DeltaFeatureConfig> NOT_STUPID_DELTA_FEATURE;
    public final static Feature<NetherrackBaseFeatureConfig> NETHERRACK_BASE_FEATURE;
    public final static Feature<ShelfFungiFeatureConfig> SHELF_FUNGI_FEATURE;
    public final static Feature<AmethystVeinFeatureConfig> AMETHYST_VEIN_FEATURE;
    public final static Feature<LargeOreFeatureConfig> LARGE_ORE_FEATURE;
    public final static Feature<LargeOreFeatureConfig> TERACOTTA_BANDS_LARGE_ORE_FEATURE;
    public final static Feature<DefaultFeatureConfig> FROZEN_WATER_FEATURE;

    static {
        ICICLE_FEATURE = register("icicle", new IcicleFeature(IcicleFeatureConfig.CODEC));
        CAVE_SURFACE_FEATURE = register("cave_surface_feature", new CaveSurfaceFeature(CaveSurfaceFeatureConfig.CODEC));
        CAVE_PILLAR_FEATURE = register("cave_pillar_feature", new CavePillarFeature(CavePillarFeatureConfig.CODEC));
        LAVA_FIXER_FEATURE = register("lava_fixer_feature", new LavaFixerFeature(DefaultFeatureConfig.CODEC));
        NOT_STUPID_DELTA_FEATURE = register("not_stupid_delta_feature", new NotStupidDeltaFeature(DeltaFeatureConfig.CODEC));
        NETHERRACK_BASE_FEATURE = register("netherrack_base_feature", new NetherrackBaseFeature(NetherrackBaseFeatureConfig.CODEC));
        SHELF_FUNGI_FEATURE = register("shelf_fungi_feature", new ShelfFungiFeature(ShelfFungiFeatureConfig.CODEC));
        AMETHYST_VEIN_FEATURE = register("amethyst_vein_feature", new AmethystVeinFeature(AmethystVeinFeatureConfig.CODEC));
        LARGE_ORE_FEATURE = register("large_ore_feature", new LargeOreFeature(LargeOreFeatureConfig.CODEC)); 
        TERACOTTA_BANDS_LARGE_ORE_FEATURE = register("terracotta_bands_large_ore_feature", new TerracottaBandsLargeOreFeature(LargeOreFeatureConfig.CODEC));  
        FROZEN_WATER_FEATURE = register("frozen_water_feature", new FrozenWaterFeature(DefaultFeatureConfig.CODEC));
    }

    public static void init() {
        new ProfundisFeatures();
    }

}
