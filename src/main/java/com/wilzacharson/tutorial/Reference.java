package com.wilzacharson.tutorial;

public class Reference {
	
	public static final String MOD_ID = "wtm";
	public static final String NAME = "Wilzacharson Tutorial Mod";
	public static final String VERSION = "1.0";
	
	public static final String CLIENT_PROXY_CLASS = "com.wilzacharson.tutorial.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.wilzacharson.tutorial.proxy.ServerProxy";
	
	public static final String  ACCEPTED_VERSIONS = "[1.9.4]";
	
	
	public static enum TutorialItems {
		CHEESE("cheese", "ItemCheese"),
		CRACKER("cracker", "ItemCracker"),
		SMORES("smores", "ItemSmores"),
		CHEESE_AND_CRACKERS("cheese_and_crackers", "ItemCheeseCrackers"),
		MARSHMALLOW("marshmallow", "ItemMarshMallow"),
		GRAHAM_CRACKER("graham_cracker", "ItemGrahamCracker");
		
		
		private String unlocalizedName;
		private String registryName;
		
		TutorialItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
			
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
	}
	/*
	 * BLOCKS Build Below Here **************************
	 */
	
	public static enum TutorialBlocks {
		CHEESE("cheese", "BlockCheese"),
		SMORES("smores", "BlockSmores");
	
		
		
		private String unlocalizedName;
		private String registryName;
		
		TutorialBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
			
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
}
