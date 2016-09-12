package com.wilzacharson.tutorial;

import com.wilzacharson.tutorial.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TutorialTab extends CreativeTabs {

	public TutorialTab() {
		super("tabTutorial");
		
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.cheese;
	}
}
