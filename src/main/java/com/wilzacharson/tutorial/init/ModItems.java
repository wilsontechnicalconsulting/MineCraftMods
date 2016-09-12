package com.wilzacharson.tutorial.init;

import com.wilzacharson.tutorial.Reference;
import com.wilzacharson.tutorial.items.ItemCheese;
import com.wilzacharson.tutorial.items.ItemCracker;
import com.wilzacharson.tutorial.items.ItemSmores;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item cheese;
	public static Item cracker;
	public static Item smores;
	

	public static void init() {
		cheese = new ItemCheese();
		cracker = new ItemCracker();
		smores = new ItemSmores();
	}
	
	public static void register() {
		GameRegistry.register(cheese);
		GameRegistry.register(cracker);
		GameRegistry.register(smores);
	}
	
	public static void registerRenders() {
		registerRender(cheese);
		registerRender(cracker);
		registerRender(smores);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
