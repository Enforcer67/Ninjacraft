package de.bitowner.ninjacraft.block;

import java.util.Random;

import de.bitowner.ninjacraft.Ninjacraft;
import de.bitowner.ninjacraft.init.BasicItems;
import de.bitowner.ninjacraft.lib.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class Wissen_Der_Wahrheit extends Block {

	public Wissen_Der_Wahrheit() {
		super(Material.GOURD);
		
		setHardness(3.0f);		
		setResistance(10.0f);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(Ninjacraft.ninjacraftTab);
	}
	
public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		
				
		return BasicItems.wissen;
	}
	
	@Override
	public String getUnlocalizedName() {

		return "tile." + Ninjacraft.RESOURCE_PREFIX + Names.WISSEN_DER_WAHRHEIT;
	}

}
