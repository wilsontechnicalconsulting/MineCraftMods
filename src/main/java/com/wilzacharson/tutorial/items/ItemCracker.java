package com.wilzacharson.tutorial.items;

import com.wilzacharson.tutorial.Reference;
import com.wilzacharson.tutorial.Tutorial;
import com.wilzacharson.tutorial.TutorialTab;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemCracker extends ItemFood {
	
	public ItemCracker() {
		super(1, 0.0f, false);
		setUnlocalizedName(Reference.TutorialItems.CRACKER.getUnlocalizedName());
		setRegistryName(Reference.TutorialItems.CRACKER.getRegistryName());
		setCreativeTab(Tutorial.CREATIVE_TAB);
		
	}

}
