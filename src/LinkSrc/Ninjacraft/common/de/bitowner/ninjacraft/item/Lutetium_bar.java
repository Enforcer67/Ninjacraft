package de.bitowner.ninjacraft.item;

import de.bitowner.ninjacraft.Ninjacraft;
import de.bitowner.ninjacraft.init.BasicItems;
import de.bitowner.ninjacraft.lib.Names;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Lutetium_bar extends Item{

	public Lutetium_bar() {
		setCreativeTab(Ninjacraft.ninjacraftTab);
	}
	
	
	
	 @Override
	 public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	    {
		
		 IBlockState bs = worldIn.getBlockState(pos);
					
		 return EnumActionResult.PASS;
	    }
	
	
	
		
	@Override
	public String getUnlocalizedName(ItemStack stack){
		
		
		return "item." + Ninjacraft.RESOURCE_PREFIX + Names.LUTETIUM_BAR; 
	}

	public void addRecipes() {

		GameRegistry.addSmelting(BasicItems.lutetiumRoh, new ItemStack(BasicItems.lutetiumBar), 1.0f);
	}
}
