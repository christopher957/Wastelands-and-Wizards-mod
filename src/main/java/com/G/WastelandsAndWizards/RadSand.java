package com.G.WastelandsAndWizards;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by skynet on 8/6/2016.
 */
public class RadSand extends Block {
    protected static final AxisAlignedBB CACTUS_AABB = new AxisAlignedBB(0.0625D, 0.0D, 0.0625D, 0.9375D, 0.9375D, 0.9375D);
    protected static final AxisAlignedBB CACTUS_COLLISION_AABB = new AxisAlignedBB(0.0625D, 0.0D, 0.0625D, 0.9375D, 1.0D, 0.9375D);


    public RadSand(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
//        this.setUnlocalizedName(Main.MODID + ":" + unlocalizedName);
        this.setCreativeTab(CreativeTabs.MISC);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setLightLevel(5);
        this.setLightOpacity(1);

    }

    public RadSand(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.SAND, hardness, resistance);
    }

    public RadSand(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
    }

    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, World worldIn, BlockPos pos)
    {
        return CACTUS_AABB;
    }

    @SideOnly(Side.CLIENT)
    public AxisAlignedBB getSelectedBoundingBox(IBlockState state, World worldIn, BlockPos pos)
    {
        return CACTUS_COLLISION_AABB.offset(pos);
    }


    @Override
    public void onEntityCollidedWithBlock (World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
//        entityIn.setFire(1);
        entityIn.setGlowing(true);
        if (entityIn instanceof EntityLivingBase) { // If the entity is an instance of EntityLivingBase or any class that inherits from it
            ((EntityLivingBase) entityIn).addPotionEffect(new PotionEffect(Potion.getPotionById(19),600,1)); // Cast to EntityLivingBase and call addPotionEffect
        }
    }
    }
