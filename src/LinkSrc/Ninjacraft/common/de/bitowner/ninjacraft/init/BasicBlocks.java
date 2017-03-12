package de.bitowner.ninjacraft.init;

import de.bitowner.ninjacraft.Ninjacraft;
import de.bitowner.ninjacraft.block.DeathOre;
import de.bitowner.ninjacraft.block.FeatherSteel;
import de.bitowner.ninjacraft.block.KnowBlock;
import de.bitowner.ninjacraft.block.Lutetium;
import de.bitowner.ninjacraft.block.RandomOre;
import de.bitowner.ninjacraft.block.RandomOreP;
import de.bitowner.ninjacraft.block.Wissen_Der_Wahrheit;
import de.bitowner.ninjacraft.lib.Names;
import de.bitowner.ninjacraft.util.OreGenerator;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BasicBlocks {
	public static DeathOre deathOre;
	public static FeatherSteel featherSteel;
	public static RandomOre random_ore;
	public static RandomOreP random_oreP;
	public static Wissen_Der_Wahrheit wissen_der_wahrheit;
	public static Lutetium lutetium;
	public static KnowBlock knowblock;

	/**
	 * The common initializer. Registers blocks, but not models. Should be
	 * called during preInit.
	 */
	public static void init() {

		// DeathOre
		ResourceLocation location = new ResourceLocation(Ninjacraft.MOD_ID, Names.DEATH_ORE);
		deathOre = new DeathOre();
		deathOre.setRegistryName(location);
		GameRegistry.register(deathOre);
		GameRegistry.register(new ItemBlock(deathOre), location);

		// featherSteel
		ResourceLocation locationFS = new ResourceLocation(Ninjacraft.MOD_ID, Names.FEATHER_STEEL);
		featherSteel = new FeatherSteel();
		featherSteel.setRegistryName(locationFS);
		GameRegistry.register(featherSteel);
		GameRegistry.register(new ItemBlock(featherSteel), locationFS);

		// RANDOM_ORE
		ResourceLocation locationRO = new ResourceLocation(Ninjacraft.MOD_ID, Names.RANDOM_ORE);
		random_ore = new RandomOre();
		random_ore.setRegistryName(locationRO);
		GameRegistry.register(random_ore);
		GameRegistry.register(new ItemBlock(random_ore), locationRO);

		// RANDOM_ORE
		ResourceLocation locationROP = new ResourceLocation(Ninjacraft.MOD_ID, Names.RANDOM_OREP);
		random_oreP = new RandomOreP();
		random_oreP.setRegistryName(locationROP);
		GameRegistry.register(random_oreP);
		GameRegistry.register(new ItemBlock(random_oreP), locationROP);

		// wissen_der_wahrheit
		ResourceLocation locationWDW = new ResourceLocation(Ninjacraft.MOD_ID, Names.WISSEN_DER_WAHRHEIT);
		wissen_der_wahrheit = new Wissen_Der_Wahrheit();
		wissen_der_wahrheit.setRegistryName(locationWDW);
		GameRegistry.register(wissen_der_wahrheit);
		GameRegistry.register(new ItemBlock(wissen_der_wahrheit), locationWDW);

		// lutetium
		ResourceLocation locationLUT = new ResourceLocation(Ninjacraft.MOD_ID, Names.LUTETIUM);
		lutetium = new Lutetium();
		lutetium.setRegistryName(locationLUT);
		GameRegistry.register(lutetium);
		GameRegistry.register(new ItemBlock(lutetium), locationLUT);

		// KnowBLock
		ResourceLocation locationKNB = new ResourceLocation(Ninjacraft.MOD_ID, Names.KNOW_BLOCK);
		knowblock = new KnowBlock();
		knowblock.setRegistryName(locationKNB);
		GameRegistry.register(knowblock);
		GameRegistry.register(new ItemBlock(knowblock), locationKNB);

		// ###################################################################################

		/**
		 * OreGenerator init
		 */
		GameRegistry.registerWorldGenerator(new OreGenerator(deathOre, 5, 3), 0);
		GameRegistry.registerWorldGenerator(new OreGenerator(lutetium, 60, 4), 1);
		GameRegistry.registerWorldGenerator(new OreGenerator(featherSteel, 256, 3), 1);
		GameRegistry.registerWorldGenerator(new OreGenerator(random_ore, 70, 2), 1);
		GameRegistry.registerWorldGenerator(new OreGenerator(random_oreP, 50, 2), 1);
		GameRegistry.registerWorldGenerator(new OreGenerator(wissen_der_wahrheit, 45, 3), 1);
	}

	public static void initRecipes() {
		deathOre.addRecipes();
		featherSteel.addRecipes();
		knowblock.addRecipes();

	}

	/**
	 * The client-side initializer. Here we handle model registration. Don't
	 * forget the @SideOnly annotation! This should be called during init.
	 */
	@SideOnly(Side.CLIENT)
	public static void initClient(ItemModelMesher mesher) {

		// DeathOre
		Item item = Item.getItemFromBlock(deathOre);
		ModelResourceLocation model = new ModelResourceLocation(Ninjacraft.RESOURCE_PREFIX + Names.DEATH_ORE,
				"inventory");
		ModelLoader.registerItemVariants(item, model);
		mesher.register(item, 0, model);

		// FeatherSteel
		Item itemFS = Item.getItemFromBlock(featherSteel);
		ModelResourceLocation modelFS = new ModelResourceLocation(Ninjacraft.RESOURCE_PREFIX + Names.FEATHER_STEEL,
				"inventory");
		ModelLoader.registerItemVariants(itemFS, modelFS);
		mesher.register(itemFS, 0, modelFS);

		// RandomOre
		Item itemRO = Item.getItemFromBlock(random_ore);
		ModelResourceLocation modelRO = new ModelResourceLocation(Ninjacraft.RESOURCE_PREFIX + Names.RANDOM_ORE,
				"inventory");
		ModelLoader.registerItemVariants(itemRO, modelRO);
		mesher.register(itemRO, 0, modelRO);

		// RandomOreP
		Item itemROP = Item.getItemFromBlock(random_oreP);
		ModelResourceLocation modelROP = new ModelResourceLocation(Ninjacraft.RESOURCE_PREFIX + Names.RANDOM_OREP,
				"inventory");
		ModelLoader.registerItemVariants(itemROP, modelROP);
		mesher.register(itemROP, 0, modelROP);

		// wissen_der_wahrheit
		Item itemWDW = Item.getItemFromBlock(wissen_der_wahrheit);
		ModelResourceLocation modelWDW = new ModelResourceLocation(
				Ninjacraft.RESOURCE_PREFIX + Names.WISSEN_DER_WAHRHEIT, "inventory");
		ModelLoader.registerItemVariants(itemWDW, modelWDW);
		mesher.register(itemWDW, 0, modelWDW);

		// Lutetium
		Item itemLUT = Item.getItemFromBlock(lutetium);
		ModelResourceLocation modelLUT = new ModelResourceLocation(Ninjacraft.RESOURCE_PREFIX + Names.LUTETIUM,
				"inventory");
		ModelLoader.registerItemVariants(itemLUT, modelLUT);
		mesher.register(itemLUT, 0, modelLUT);

		// KnowBlock
		Item itemKNO = Item.getItemFromBlock(knowblock);
		ModelResourceLocation modelKNO = new ModelResourceLocation(Ninjacraft.RESOURCE_PREFIX + Names.KNOW_BLOCK,
				"inventory");
		ModelLoader.registerItemVariants(itemKNO, modelKNO);
		mesher.register(itemKNO, 0, modelKNO);

	}
}
