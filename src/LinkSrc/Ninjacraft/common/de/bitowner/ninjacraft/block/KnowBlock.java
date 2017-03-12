package de.bitowner.ninjacraft.block;

import de.bitowner.ninjacraft.Ninjacraft;
import de.bitowner.ninjacraft.init.BasicBlocks;
import de.bitowner.ninjacraft.init.BasicItems;
import de.bitowner.ninjacraft.lib.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class KnowBlock extends Block {

	public KnowBlock() {
		super(Material.GOURD);
		setHardness(7.0f);		
		setResistance(10.0f);
		setHarvestLevel("pickaxe", 3);
		setCreativeTab(Ninjacraft.ninjacraftTab);
	}

	public void addRecipes() {

		GameRegistry.addShapedRecipe(new ItemStack(BasicBlocks.knowblock), "rkr","rer","ooo", 'r', Items.REDSTONE,'k',
									BasicItems.wissen,'o',Blocks.OBSIDIAN,'e',Blocks.ENCHANTING_TABLE);
	}

	
	@Override
	public String getUnlocalizedName() {

		return "tile." + Ninjacraft.RESOURCE_PREFIX + Names.KNOW_BLOCK;
	}



}
