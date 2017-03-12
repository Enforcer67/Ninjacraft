package de.bitowner.ninjacraft;

import de.bitowner.ninjacraft.init.BasicBiome;
import de.bitowner.ninjacraft.init.BasicBlocks;
import de.bitowner.ninjacraft.init.BasicItems;
import de.bitowner.ninjacraft.init.BasicWeapons;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	
	
	public void preInit(FMLPreInitializationEvent event) {
		BasicItems.init();
		BasicBlocks.init();
		BasicWeapons.init();
	  
	  }

	  public void init(FMLInitializationEvent event) {
		  BasicItems.initRecipes();
		  BasicBlocks.initRecipes();
		  BasicWeapons.initRecipes();
		  
		  BasicBiome.initBiome();
	  }

	  public void postInit(FMLPostInitializationEvent event) {
		  
	}
}
