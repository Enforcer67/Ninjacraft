package de.bitowner.ninjacraft.block;

import java.util.Random;

import de.bitowner.ninjacraft.Ninjacraft;
import de.bitowner.ninjacraft.init.BasicItems;
import de.bitowner.ninjacraft.lib.Names;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class RandomOre extends Block {

	public RandomOre() {
		
		super(Material.GROUND);
		setHardness(2.0f);		
		setResistance(10.0f);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(Ninjacraft.ninjacraftTab);
	}

	
	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random) {

		Integer x = random.nextInt(4) + fortune;

		return x.intValue();
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		
		
		Item item = new Item();
		
		Integer x = rand.nextInt(5);
		
		switch (x) {
		case 0:
			item = Items.COAL;
			break;
		case 1:
			item = Items.IRON_INGOT;
			break;
		case 2:
			item = Items.REDSTONE;
			break;
		case 3:
			item = Items.EMERALD;
			break;
		case 4:
			item = Items.CARROT_ON_A_STICK;
			break;
		case 5:
			item = Items.QUARTZ;
			break;
		}
		
		
		return item;
	}
	
	@Override
	public String getUnlocalizedName() {

		return "tile." + Ninjacraft.RESOURCE_PREFIX + Names.RANDOM_ORE;
	}
	
}
