package com.G.WastelandsAndWizards;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {

    public static Block tutorialBlock;
    public static Block RadGlass;
    public static Block RadSand;

    public static void createBlocks() {
        GameRegistry.registerBlock(tutorialBlock = new BasicBlock("tutorial_block"), "tutorial_block");
        GameRegistry.registerBlock(RadGlass = new BasicBlock("radglass_block"), "radglass_block");
        GameRegistry.registerBlock(RadSand = new BasicBlock("radsand_block"), "radsand_block");
    }
}