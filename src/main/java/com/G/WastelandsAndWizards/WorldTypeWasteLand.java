package com.G.WastelandsAndWizards;

import net.minecraft.world.WorldType;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.GenLayerBiomeEdge;
import net.minecraft.world.gen.layer.GenLayerZoom;

/**
 * Created by skynet on 7/9/2017.
 */
public class WorldTypeWasteLand extends WorldType {

    public WorldTypeWasteLand(int par1, String name) {
        super(name);
    }

    public GenLayer getBiomeLayer(long worldSeed, GenLayer parentLayer, String chunkProviderSettingsJson)
    {
        GenLayer ret = new wasteGenLayerBiome(200L, parentLayer, this, chunkProviderSettingsJson);
        ret = GenLayerZoom.magnify(1000L, ret, 2);
        ret = new GenLayerBiomeEdge(1000L, ret);
        return ret;
    }

}