package com.wilzacharson.tutorial.items;

import com.wilzacharson.tutorial.Reference;
import com.wilzacharson.tutorial.Tutorial;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemCheese extends ItemFood {

	public ItemCheese() {
		super(1, 0.0f, false);
		setUnlocalizedName(Reference.TutorialItems.CHEESE.getUnlocalizedName());
		setRegistryName(Reference.TutorialItems.CHEESE.getRegistryName());
		setCreativeTab(Tutorial.CREATIVE_TAB);
		
	}
}
