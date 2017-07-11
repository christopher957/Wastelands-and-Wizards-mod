package com.G.WastelandsAndWizards;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by skynet on 8/6/2016.
 */
public class RadSand extends Block {

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

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        AxisAlignedBB axis = new AxisAlignedBB(0.875D, 0.875D, 0.875D, 0.875D, 0.875D, 0.875D);
        return axis;
    }

    @SideOnly(Side.CLIENT)
    public double getMaxRenderDistanceSquared()
    {
        return 4096.0D;
    }

    @Override
    public void onEntityCollidedWithBlock (World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
        entityIn.setFire(1);
        entityIn.setGlowing(true);
    }
    }
