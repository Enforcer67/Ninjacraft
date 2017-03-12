package de.bitowner.ninjacraft.item;

import java.util.Random;

import de.bitowner.ninjacraft.Ninjacraft;
import de.bitowner.ninjacraft.init.BasicBlocks;
import de.bitowner.ninjacraft.lib.Names;
import net.minecraft.block.Block;
import net.minecraft.block.state.BlockStateBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Wissen extends Item {

	public Wissen() {
		setCreativeTab(Ninjacraft.ninjacraftTab);
	}

	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand,
			EnumFacing facing, float hitX, float hitY, float hitZ) {

		if (!worldIn.isRemote && worldIn.getBlockState(pos).getBlock() == BasicBlocks.knowblock) {

			IBlockState bs = worldIn.getBlockState(pos);
			player.addExperienceLevel(5);
		

			player.addPotionEffect(new PotionEffect(Potion.getPotionById(5), 2400, 2));
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(26),2400,3));
			
			return EnumActionResult.SUCCESS;
		} else if(!worldIn.isRemote){
			Random rand = new Random();

			IBlockState bs = worldIn.getBlockState(pos);
			player.addExperienceLevel(5);

			Integer x = rand.nextInt(26);
			Integer time = (rand.nextInt(10) * 20) + 1;
			Integer hardness = rand.nextInt(4);

			player.addPotionEffect(new PotionEffect(Potion.getPotionById(x + 1), time.intValue(), hardness));
			return EnumActionResult.SUCCESS;

		}

		return EnumActionResult.PASS;

	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {

		return "item." + Ninjacraft.RESOURCE_PREFIX + Names.WISSEN;
	}
}
