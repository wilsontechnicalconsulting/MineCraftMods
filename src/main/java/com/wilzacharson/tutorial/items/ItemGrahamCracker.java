package com.wilzacharson.tutorial.items;

import com.wilzacharson.tutorial.Reference;
import com.wilzacharson.tutorial.Tutorial;

import net.minecraft.item.ItemFood;

public class ItemGrahamCracker extends ItemFood {

	public ItemGrahamCracker() {
		super(2, 0.5f, true);
		setUnlocalizedName(Reference.TutorialItems.GRAHAM_CRACKER.getUnlocalizedName());
		setRegistryName(Reference.TutorialItems.GRAHAM_CRACKER.getRegistryName());
		setCreativeTab(Tutorial.CREATIVE_TAB);	
	}

}
