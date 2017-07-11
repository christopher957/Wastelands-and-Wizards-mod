package com.G.WastelandsAndWizards;

import net.minecraft.block.BlockDoublePlant;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
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
            this.theBiomeDecorator.flowersPerChunk = 4;
            this.theBiomeDecorator.grassPerChunk = 10;
            this.topBlock = ModBlocks.radsand_block.getDefaultState();
            this.fillerBlock = ModBlocks.radsand_block.getDefaultState();

            this.setRegistryName("WASTELAND_BIOME");

            properties.setWaterColor(Color.GREEN.getGreen());

        }

//        public BlockFlower.EnumFlowerType pickRandomFlower(Random rand, BlockPos pos) {
//            double d0 = GRASS_COLOR_NOISE.getValue((double) pos.getX() / 200.0D, (double) pos.getZ() / 200.0D);
//
//            if (d0 < -0.8D) {
//                int j = rand.nextInt(4);
//
//                switch (j) {
//                    case 0:
//                        return BlockFlower.EnumFlowerType.ORANGE_TULIP;
//                    case 1:
//                        return BlockFlower.EnumFlowerType.RED_TULIP;
//                    case 2:
//                        return BlockFlower.EnumFlowerType.PINK_TULIP;
//                    case 3:
//                    default:
//                        return BlockFlower.EnumFlowerType.WHITE_TULIP;
//                }
//            } else if (rand.nextInt(3) > 0) {
//                int i = rand.nextInt(3);
//                return i == 0 ? BlockFlower.EnumFlowerType.POPPY
//                        : (i == 1 ? BlockFlower.EnumFlowerType.HOUSTONIA : BlockFlower.EnumFlowerType.OXEYE_DAISY);
//            } else {
//                return BlockFlower.EnumFlowerType.DANDELION;
//            }
//        }

        public void decorate(World worldIn, Random rand, BlockPos pos) {
            double d0 = GRASS_COLOR_NOISE.getValue((double) pos.getX() / 200.0D, (double) pos.getZ() / 200.0D);

            if (d0 < -0.8D) {
                this.theBiomeDecorator.flowersPerChunk = 15;
                this.theBiomeDecorator.grassPerChunk = 5;
            } else {
                this.theBiomeDecorator.flowersPerChunk = 4;
                this.theBiomeDecorator.grassPerChunk = 10;
                DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.GRASS);

                for (int i = 0; i < 7; ++i) {
                    int j = rand.nextInt(16) + 8;
                    int k = rand.nextInt(16) + 8;
                    int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
                    DOUBLE_PLANT_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
                }
            }

            super.decorate(worldIn, rand, pos);
        }

//        @Override
//          public void addDefaultFlowers() {
//        BlockFlower red = net.minecraft.init.Blocks.RED_FLOWER;
//        BlockFlower yel = net.minecraft.init.Blocks.YELLOW_FLOWER;
//        addFlower(red.getDefaultState().withProperty(red.getTypeProperty(), BlockFlower.EnumFlowerType.ORANGE_TULIP),
//                3);
//        addFlower(red.getDefaultState().withProperty(red.getTypeProperty(), BlockFlower.EnumFlowerType.RED_TULIP), 3);
//        addFlower(red.getDefaultState().withProperty(red.getTypeProperty(), BlockFlower.EnumFlowerType.PINK_TULIP), 3);
//        addFlower(red.getDefaultState().withProperty(red.getTypeProperty(), BlockFlower.EnumFlowerType.WHITE_TULIP), 3);
//        addFlower(red.getDefaultState().withProperty(red.getTypeProperty(), BlockFlower.EnumFlowerType.POPPY), 20);
//        addFlower(red.getDefaultState().withProperty(red.getTypeProperty(), BlockFlower.EnumFlowerType.HOUSTONIA), 20);
//        addFlower(red.getDefaultState().withProperty(red.getTypeProperty(), BlockFlower.EnumFlowerType.OXEYE_DAISY),
//                20);
//        addFlower(yel.getDefaultState().withProperty(yel.getTypeProperty(), BlockFlower.EnumFlowerType.DANDELION), 30);
//    }

        public WorldGenAbstractTree genBigTreeChance(Random rand) {
            return (WorldGenAbstractTree) (rand.nextInt(3) == 0 ? BIG_TREE_FEATURE : TREE_FEATURE);
        }
}
