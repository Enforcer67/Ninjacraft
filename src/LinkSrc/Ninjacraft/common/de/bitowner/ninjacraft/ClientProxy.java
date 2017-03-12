package de.bitowner.ninjacraft;

import de.bitowner.ninjacraft.init.BasicBlocks;
import de.bitowner.ninjacraft.init.BasicItems;
import de.bitowner.ninjacraft.init.BasicWeapons;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import scala.tools.nsc.backend.icode.BasicBlocks.BasicBlock;

public class ClientProxy extends CommonProxy {

	
	
@Override
	public void preInit(FMLPreInitializationEvent event) {

	  super.preInit(event);
	  }




@Override
	  public void init(FMLInitializationEvent event) {
		
	super.init(event);	 
	
	//Init ITEMS & BLOCKS
	BasicItems.initClient(Minecraft.getMinecraft().getRenderItem().getItemModelMesher());
	BasicBlocks.initClient(Minecraft.getMinecraft().getRenderItem().getItemModelMesher());
	BasicWeapons.initClient(Minecraft.getMinecraft().getRenderItem().getItemModelMesher());
	  }




@Override
	  public void postInit(FMLPostInitializationEvent event) {

	super.postInit(event);
	}
	
}
