package de.bitowner.ninjacraft;

import java.util.Random;

import de.bitowner.ninjacraft.init.BasicItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Ninjacraft.MOD_ID, name = Ninjacraft.Mod_NAME,version = Ninjacraft.VERSION, dependencies = Ninjacraft.DEPENDENCIES)
public class Ninjacraft {
	//ToolMaterial
	public static ToolMaterial lutetiumToolMaterial = EnumHelper.addToolMaterial("LutetiumToolMaterial", 0, 630, 2, 7, 50);
	
	//Constants
public static final String MOD_ID = "ninjacraft";
public static final String Mod_NAME = "Ninjacraft ";
public static final String VERSION = "@VERSION@";
public static final String DEPENDENCIES = "required-after:forge@[13.20.0.2228,)";	
public static final String RESOURCE_PREFIX = MOD_ID.toLowerCase() + ":"; //ninjacraft:
	
//Variables
public static Random random = new Random();



@Instance(MOD_ID)
public static Ninjacraft instance;

@SidedProxy(clientSide = "de.bitowner.ninjacraft.ClientProxy", serverSide = "de.bitowner.ninjacraft.CommonProxy")
public static CommonProxy proxy;

@EventHandler
public void preInit(FMLPreInitializationEvent event ){
	proxy.preInit(event);
	
}

@EventHandler
public void init(FMLInitializationEvent event ){
	proxy.init(event);
}


@EventHandler
public void postInit(FMLPostInitializationEvent event ){
	proxy.postInit(event);
}

public static CreativeTabs ninjacraftTab = new CreativeTabs(Ninjacraft.RESOURCE_PREFIX + "Ninjacraft") {

    @Override
    public ItemStack getTabIconItem() {
    	
      return new ItemStack(BasicItems.thedeath);
    }
};


}
