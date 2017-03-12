package de.bitowner.ninjacraft.item;

import de.bitowner.ninjacraft.Ninjacraft;
import de.bitowner.ninjacraft.lib.Names;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class The_Death extends Item{
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand)
	{
		
		
		
		
		
	    return super.onItemRightClick(world, player, hand);
	}
		
		
	 @Override
	 public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	    {
		
		 IBlockState bs = worldIn.getBlockState(pos);
			
				
		 
	        return EnumActionResult.PASS;
	    }
	
	
	
		
	@Override
	public String getUnlocalizedName(ItemStack stack){
		
		
		return "item." + Ninjacraft.RESOURCE_PREFIX + Names.THE_DEATH; 
	}
	
	

}
