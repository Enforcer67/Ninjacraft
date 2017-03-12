package de.bitowner.ninjacraft.block;

import java.util.Random;

import de.bitowner.ninjacraft.Ninjacraft;
import de.bitowner.ninjacraft.init.BasicItems;
import de.bitowner.ninjacraft.lib.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Lutetium extends Block{

	public Lutetium() {
		super(Material.GROUND);
		setHardness(2.0f);		
		setResistance(10.0f);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(Ninjacraft.ninjacraftTab);
	}
	
	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random) {

		Integer x = 1 + fortune;

		return x.intValue();
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
				
		return BasicItems.lutetiumRoh;
	}
	
	@Override
	public String getUnlocalizedName() {

		return "tile." + Ninjacraft.RESOURCE_PREFIX + Names.LUTETIUM;
	}
	
	

}
