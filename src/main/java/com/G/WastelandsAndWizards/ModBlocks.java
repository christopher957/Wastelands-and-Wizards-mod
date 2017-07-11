package com.G.WastelandsAndWizards;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {

    public static Block radglass_block = new RadGlass("radglass_block");
    public static Block radsand_block = new RadSand("radsand_block");

    public static void createBlocks() {
        register(radglass_block, new ItemBlock(radglass_block), "radglass_block", "radglass_block");
        register(radsand_block, new ItemBlock(radsand_block), "radsand_block", "radsand_block");
    }

    public static void register(Block block, ItemBlock ib, String name, String unlocal)
    {
        block.setUnlocalizedName(unlocal).setRegistryName(Main.MODID, name);
        ib.setUnlocalizedName(unlocal).setRegistryName(Main.MODID, name);
        GameRegistry.register(block);
        GameRegistry.register(ib);
    }
}