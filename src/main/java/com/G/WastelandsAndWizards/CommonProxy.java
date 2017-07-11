package com.G.WastelandsAndWizards;

import net.minecraft.world.WorldType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
        //this calls the class that creates items
//        ModItems.createItems();
        ModBlocks.createBlocks();
    }

    public void init(FMLInitializationEvent e) {
        //super.init(e); //dont know what this does but it no longer seems to work so if shit no worky figure it out later

        //this calls the class that skins and frames items once they have been created
//        ItemRenderRegister.registerItemRenderer();
        BlockRenderRegister.registerBlockRenderer();
    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event) {
        WorldType THEWASTE = new WorldTypeWasteLand(4, "TheWaste");

    }
}