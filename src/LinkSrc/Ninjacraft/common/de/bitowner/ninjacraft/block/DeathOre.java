package de.bitowner.ninjacraft.block;

import java.util.Random;

import de.bitowner.ninjacraft.Ninjacraft;
import de.bitowner.ninjacraft.init.BasicItems;
import de.bitowner.ninjacraft.lib.Names;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class DeathOre extends Block {

	public DeathOre() {

		super(Material.GROUND);

		// The hardness determines how long a block takes to break. 5 is a bit
		// high, most are around 2-3.
		setHardness(5.0f);
		// Resistance to explosions.
		setResistance(10.0f);
		// Sound type effects placing, breaking, and step sounds.
		setSoundType(SoundType.LADDER);
		// This method can be used to set a specific tool type and harvest
		// level. Remove if you don't need any restrictions.
		setHarvestLevel("pickaxe", 2);

		setCreativeTab(Ninjacraft.ninjacraftTab);
	}

	
	public void addRecipes() {

		GameRegistry.addShapedRecipe(new ItemStack(this), " l ", "lll", " l ", 'l', BasicItems.thedeath);
	}

	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random) {

		Integer x = random.nextInt(4) + fortune;

		return x.intValue();
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return BasicItems.thedeath;
	}

	@Override
	public void onLanded(World worldIn, Entity entityIn) {

		EntityPlayer player = (EntityPlayer) entityIn;
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(20), 20, 1)); // Wither
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(15), 80, 3)); // Blindness
	}

	// TRANSPARENZ
	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.TRANSLUCENT;
	}

	@Override
	public String getUnlocalizedName() {

		return "tile." + Ninjacraft.RESOURCE_PREFIX + Names.DEATH_ORE;
	}

	//TODO Block Boden Durchsichtig 
}
