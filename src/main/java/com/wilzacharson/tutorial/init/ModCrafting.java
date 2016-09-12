package com.wilzacharson.tutorial.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void register() {
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.cheese), "CCC","CCC","CCC", 'C', ModItems.cheese); 
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.smores), "CCC", "MMM", "GGG", 'C', Blocks.COCOA, 'M', ModItems.marshmallow, 'G', ModItems.graham_cracker);
	}
}
