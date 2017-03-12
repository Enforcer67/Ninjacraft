package de.bitowner.ninjacraft.wurfwaffen;

import de.bitowner.ninjacraft.Ninjacraft;
import de.bitowner.ninjacraft.init.BasicItems;
import de.bitowner.ninjacraft.lib.Names;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmorStand;
import net.minecraft.item.ItemEnderPearl;
import net.minecraft.item.ItemFireball;
import net.minecraft.item.ItemSnowball;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderPlayerEvent.SetArmorModel;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Wurfstern2 extends ItemSnowball{

	
	
	
	public void initRecipes() {
//
//		GameRegistry.addShapedRecipe(new ItemStack(this),
//				" l "," l ","rlg",
//				
//				'l', BasicItems.lutetiumBar,
//				'r', Items.REDSTONE,
//				'g', Items.GOLD_NUGGET);
//		
	}

	@Override
	public String getUnlocalizedName(ItemStack stack){
		
		
		return "item." + Ninjacraft.RESOURCE_PREFIX + Names.WURFSTERN2; 
	}
}
