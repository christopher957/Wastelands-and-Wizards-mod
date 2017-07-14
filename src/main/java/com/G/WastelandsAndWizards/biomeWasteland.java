package com.G.WastelandsAndWizards;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeDesert;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import java.awt.*;
import java.util.Random;

/**
 * Created by skynet on 7/9/2017.
 */
public class biomeWasteland extends BiomeDesert{

        public biomeWasteland(int par1,  Biome.BiomeProperties properties) {
            super(properties);


//            this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityCheeseCow.class, 8, 4, 4));
            this.theBiomeDecorator.treesPerChunk = 0;
            this.theBiomeDecorator.field_189870_A = 0.05F;
            this.theBiomeDecorator.flowersPerChunk = 0;
            this.theBiomeDecorator.grassPerChunk = 0;
            this.topBlock = ModBlocks.radsand_block.getDefaultState();
            this.fillerBlock = ModBlocks.radglass_block.getDefaultState();

            this.setRegistryName("WASTELAND_BIOME");

            properties.setWaterColor(Color.GREEN.getGreen());

        }

//for a good time uncomment and watch your cpu usage rise!
//        public void decorate(World worldIn, Random rand, BlockPos pos) {
//            for(int i = 0; i < 10; ++i) {
//                BlockPos blockpos = pos.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));
//                if(worldIn.isAirBlock(blockpos)) {
//                    int j = 1 + rand.nextInt(rand.nextInt(3) + 1);
//
//                    for(int k = 0; k < j; ++k) {
////                        if(Blocks.COAL_BLOCK.canPlaceBlockAt(worldIn, blockpos)) {
//                            worldIn.setBlockState(blockpos.up(k), Blocks.COAL_BLOCK.getDefaultState(), 2);
////                        }
//                    }
//                }
//            }
//            super.decorate(worldIn, rand, pos);
//        }


        public WorldGenAbstractTree genBigTreeChance(Random rand) {
            return (WorldGenAbstractTree) (rand.nextInt(3) == 0 ? BIG_TREE_FEATURE : TREE_FEATURE);
        }
}
