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
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FeatherSteel extends Block {

	public FeatherSteel() {
		super(Material.WEB);

		// The hardness determines how long a block takes to break. 5 is a bit
		// high, most are around 2-3.
		setHardness(5.0f);
		// Resistance to explosions.
		setResistance(10.0f);
		// Sound type effects placing, breaking, and step sounds.
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", 3);

		setCreativeTab(Ninjacraft.ninjacraftTab);
	}

	public void addRecipes() {

		// TODO Rezept FeatherSteel
	}

	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random) {

		Integer x = random.nextInt(1)+1 + fortune;

		return x.intValue();
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return BasicItems.featherSteelIngot;
	}

	@Override
	public void onLanded(World worldIn, Entity entityIn) {

		if(entityIn instanceof EntityPlayer){
		EntityPlayer player = (EntityPlayer) entityIn;
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(8),60,1));
		}
		}

	

	@Override
	public String getUnlocalizedName() {

		return "tile." + Ninjacraft.RESOURCE_PREFIX + Names.FEATHER_STEEL;
	}

}
