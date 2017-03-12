package de.bitowner.ninjacraft.item;

import de.bitowner.ninjacraft.Ninjacraft;
import de.bitowner.ninjacraft.init.BasicItems;
import de.bitowner.ninjacraft.lib.Names;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class Alice extends Item {

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand)
	{
		
		player.addExperienceLevel(100);
			
		
		player.spawnSweepParticles();
		player.spawnRunningParticles();
		player.world.spawnParticle(EnumParticleTypes.EXPLOSION_LARGE, player.posX, player.posY, player.posZ, 20, 21, 21, 1);
		
		//world.createExplosion(player, player.posX, player.posY, player.posZ, 1, true);
		
		if(! world.isRemote){
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(1),24000,10));

		}
		
		
		
		return super.onItemRightClick(world, player, hand);
	}
	
	
	
	@Override
	public String getUnlocalizedName(ItemStack stack){
		
		
		return "item." + Ninjacraft.RESOURCE_PREFIX + Names.HEART_ALICE; // item.ninjacraft:heart_alice
	}
}
