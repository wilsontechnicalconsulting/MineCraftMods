package com.wilzacharson.tutorial.block;

import com.wilzacharson.tutorial.Reference;
import com.wilzacharson.tutorial.Tutorial;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSmores extends Block {
	
	public BlockSmores() {
		super(Material.CAKE);
		setUnlocalizedName(Reference.TutorialBlocks.SMORES.getUnlocalizedName());
		setRegistryName(Reference.TutorialBlocks.SMORES.getRegistryName());
		setHardness(1.0f);	
		setCreativeTab(Tutorial.CREATIVE_TAB);
		
	}
	
}
