package com.wilzacharson.tutorial.block;

import com.wilzacharson.tutorial.Reference;
import com.wilzacharson.tutorial.Tutorial;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCheese extends Block {

	public BlockCheese() {
		super(Material.CAKE);
		setUnlocalizedName(Reference.TutorialBlocks.CHEESE.getUnlocalizedName());
		setRegistryName(Reference.TutorialBlocks.CHEESE.getRegistryName());
		setHardness(1.0f);	
		setCreativeTab(Tutorial.CREATIVE_TAB);
	}
}

