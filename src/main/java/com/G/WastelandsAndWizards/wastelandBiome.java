package com.G.WastelandsAndWizards;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by skynet on 7/9/2017.
 */
public class wastelandBiome {

    public static Biome WASTELAND_BIOME;

    public wastelandBiome() {
        initBiome();
        registerBiome();
    }

    public static void initBiome() {
        WASTELAND_BIOME = new biomeWasteland(137, new Biome.BiomeProperties("wasteLand"));
    }

    public static void registerBiome() {
        BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(WASTELAND_BIOME, 3));
        GameRegistry.register(WASTELAND_BIOME);
    }

}
