package de.bitowner.ninjacraft.item;

import de.bitowner.ninjacraft.Ninjacraft;
import de.bitowner.ninjacraft.lib.Names;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class Gift_Bottle extends Item{


	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand)
	{
		
		player.getActivePotionEffect(Potion.getPotionById(17));
		player.addExperienceLevel(5);
				
		if(! world.isRemote){
			

		}
		
		
		
		return super.onItemRightClick(world, player, hand);
	}
	
	

	
	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
    {
		entityLiving.replaceItemInInventory(entityLiving.getActiveHand().MAIN_HAND.ordinal(), new ItemStack(Items.GLASS_BOTTLE));
		
        return stack;
    }
	
	
	
	@Override
	public String getUnlocalizedName(ItemStack stack){
		
		
		return "item." + Ninjacraft.RESOURCE_PREFIX + Names.GIFT_BOTTLE; 
	}

}
