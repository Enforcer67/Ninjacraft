package de.bitowner.ninjacraft.item;

import de.bitowner.ninjacraft.Ninjacraft;
import de.bitowner.ninjacraft.init.BasicItems;
import de.bitowner.ninjacraft.lib.Names;
import net.minecraft.block.Block;
import net.minecraft.block.state.BlockStateBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

public class SpaklingItem extends Item{
	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand)
	{
		
		player.addExperienceLevel(100);
		
		
		
	    return super.onItemRightClick(world, player, hand);
	}
		
		
	 @Override
	 public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	    {
		
		 IBlockState bs = worldIn.getBlockState(pos);
		
		
			if(! worldIn.isRemote){
				 player.entityDropItem(new ItemStack(bs.getBlock()), 5);

			}
		
		 
	        return EnumActionResult.PASS;
	    }
	
	
	
		
	@Override
	public String getUnlocalizedName(ItemStack stack){
		
		
		return "item." + Ninjacraft.RESOURCE_PREFIX + Names.SPARKLING_ITEM; // item.ninjacraft:sparkling_item
	}
	
	
		
}
