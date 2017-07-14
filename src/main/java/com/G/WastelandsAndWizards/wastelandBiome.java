package com.G.WastelandsAndWizards;

import net.minecraft.init.Biomes;
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
        WASTELAND_BIOME = new biomeWasteland(137, new  Biome.BiomeProperties("WASTELAND_BIOME"));
    }

    public static void registerBiome() {
        BiomeManager.addBiome(BiomeManager.BiomeType.DESERT, new BiomeManager.BiomeEntry(WASTELAND_BIOME, 10000));
        BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(WASTELAND_BIOME, 10000));
        BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(WASTELAND_BIOME, 10000));
        BiomeManager.addBiome(BiomeManager.BiomeType.ICY, new BiomeManager.BiomeEntry(WASTELAND_BIOME, 10000));
        BiomeManager.removeSpawnBiome(Biomes.FOREST);
        BiomeManager.removeSpawnBiome(Biomes.PLAINS);
        BiomeManager.removeSpawnBiome(Biomes.TAIGA_HILLS);
        BiomeManager.removeSpawnBiome(Biomes.FOREST_HILLS);
        BiomeManager.removeSpawnBiome(Biomes.JUNGLE);
        BiomeManager.removeSpawnBiome(Biomes.JUNGLE_HILLS);
        BiomeManager.removeSpawnBiome(Biomes.TAIGA);
        BiomeManager.removeSpawnBiome(Biomes.TAIGA_HILLS);
        BiomeManager.addSpawnBiome(WASTELAND_BIOME);
        GameRegistry.register(WASTELAND_BIOME);
    }

}
