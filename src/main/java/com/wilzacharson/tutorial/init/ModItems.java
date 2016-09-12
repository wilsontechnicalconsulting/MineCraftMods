package com.wilzacharson.tutorial.init;

import com.wilzacharson.tutorial.Reference;
import com.wilzacharson.tutorial.items.ItemCheese;
import com.wilzacharson.tutorial.items.ItemCheeseCrackers;
import com.wilzacharson.tutorial.items.ItemCracker;
import com.wilzacharson.tutorial.items.ItemGrahamCracker;
import com.wilzacharson.tutorial.items.ItemMarshMallow;
import com.wilzacharson.tutorial.items.ItemSmores;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item cheese;
	public static Item cracker;
	public static Item smores;
	public static Item cheese_and_crackers;
	public static Item marshmallow;
	public static Item graham_cracker;
	
	

	public static void init() {
		cheese = new ItemCheese();
		cracker = new ItemCracker();
		smores = new ItemSmores();
		cheese_and_crackers = new ItemCheeseCrackers();
		marshmallow = new ItemMarshMallow();
		graham_cracker = new ItemGrahamCracker();
		
	}
	
	public static void register() {
		GameRegistry.register(cheese);
		GameRegistry.register(cracker);
		GameRegistry.register(smores);
		GameRegistry.register(cheese_and_crackers);
		GameRegistry.register(marshmallow);
		GameRegistry.register(graham_cracker);
	}
	
	public static void registerRenders() {
		registerRender(cheese);
		registerRender(cracker);
		registerRender(smores);
		registerRender(cheese_and_crackers);
		registerRender(marshmallow);
		registerRender(graham_cracker);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
