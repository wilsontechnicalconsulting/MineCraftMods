package com.wilzacharson.tutorial.init;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.wilzacharson.tutorial.block.BlockCheese;
import com.wilzacharson.tutorial.block.BlockSmores;
//import com.wilzacharson.tutorial.items.ItemCheese;
//import com.wilzacharson.tutorial.items.ItemCracker;
//import com.wilzacharson.tutorial.items.ItemSmores;

public class ModBlocks {

	public static Block cheese;
	public static Block smores;
	

	public static void init() {
		cheese = new BlockCheese();
		smores = new BlockSmores();
	}
	
	public static void register() {
		registerBlock(cheese);
		registerBlock(smores);
	}
	
	private static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders() {
		registerRender(cheese);
		registerRender(smores);
	}
	
	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
