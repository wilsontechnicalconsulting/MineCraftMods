package com.wilzacharson.tutorial.items;

import com.wilzacharson.tutorial.Reference;

import net.minecraft.item.ItemFood;

public class ItemMarshMallow extends ItemFood {

	public ItemMarshMallow() {
		super(2, 0.5f, true);
		setUnlocalizedName(Reference.TutorialItems.MARSHMALLOW.getUnlocalizedName());
		setRegistryName(Reference.TutorialItems.MARSHMALLOW.getRegistryName());
		
	}

}
