package de.bitowner.ninjacraft.item;

import de.bitowner.ninjacraft.Ninjacraft;
import de.bitowner.ninjacraft.init.BasicItems;
import de.bitowner.ninjacraft.lib.Names;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class LutetiumSwordSmall extends ItemSword{

	public LutetiumSwordSmall() {
		super(Ninjacraft.lutetiumToolMaterial);
		setCreativeTab(Ninjacraft.ninjacraftTab);

		
		}
	

		public void initRecipes() {

			GameRegistry.addShapedRecipe(new ItemStack(this),
					" l "," l ","rlg",
					
					'l', BasicItems.lutetiumBar,
					'r', Items.REDSTONE,
					'g', Items.GOLD_NUGGET);
			
		}

		@Override
		public String getUnlocalizedName(ItemStack stack){
			
			
			return "item." + Ninjacraft.RESOURCE_PREFIX + Names.LUTETIUM_SWORD_SMALL; 
		}
}
