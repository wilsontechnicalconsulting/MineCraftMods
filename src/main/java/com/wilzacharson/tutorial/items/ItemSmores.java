package com.wilzacharson.tutorial.items;

import com.wilzacharson.tutorial.Reference;
import com.wilzacharson.tutorial.Tutorial;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemSmores extends ItemFood {

	public ItemSmores() {
		super(4, 0.8f, true);
		setUnlocalizedName(Reference.TutorialItems.SMORES.getUnlocalizedName());
		setRegistryName(Reference.TutorialItems.SMORES.getRegistryName());
		setCreativeTab(Tutorial.CREATIVE_TAB);
		
	}
}





