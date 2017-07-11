package com.G.WastelandsAndWizards;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 * Created by skynet on 8/6/2016.
 */
public class BlockRenderRegister {
    public static String modid = Main.MODID;

    public static void registerBlockRenderer() {
        reg(ModBlocks.radglass_block);
        reg(ModBlocks.radsand_block);
    }


    public static void reg(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
    }

}
