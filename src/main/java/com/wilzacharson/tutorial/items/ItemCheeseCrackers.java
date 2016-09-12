package com.wilzacharson.tutorial.items;

import com.wilzacharson.tutorial.Reference;

import net.minecraft.item.ItemFood;

public class ItemCheeseCrackers extends ItemFood {

	public ItemCheeseCrackers() {
		super(4, 0.8f, true);
		setUnlocalizedName(Reference.TutorialItems.CHEESE_AND_CRACKERS.getUnlocalizedName());
		setRegistryName(Reference.TutorialItems.CHEESE_AND_CRACKERS.getRegistryName());
		
	}

}
